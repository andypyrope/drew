package io.github.andypyrope.drew.cmd.general;

import io.github.andypyrope.drew.cmd.Command;
import io.github.andypyrope.drew.cmd.testutil.bot.FakeMessageChannel;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

class HelpCommandTest {

   @Test
   void testGetAliases() {
      Assertions.assertArrayEquals(new String[]{"help", "aid"},
            new HelpCommand("").getAliases());
   }

   @Test
   void testGetUsageExamples() {
      Assertions.assertArrayEquals(new String[][]{
            new String[]{null, "Show all commands"},
            new String[]{"some-command",
                  "Show more detailed information about the 'some-command' command"},
      }, new HelpCommand("").getUsageExamples());
   }

   @Test
   void testGetBriefDescription() {
      Assertions.assertEquals(
            "Shows command information.",
            new HelpCommand("").getBriefDescription());
   }

   @Test
   void testGetLongDescription() {
      Assertions.assertEquals(
            "Shows information about all commands, or about a single command.",
            new HelpCommand("").getLongDescription());
   }

   @Test
   void testExecute() throws IOException {
      final Command command1 = makeCommandMock(
            new String[]{"a-command", "z-command"},
            new String[][]{
                  new String[]{null, "Meow"},
                  new String[]{"arg1", null},
                  new String[]{"arg1 arg2",
                        "This usage is a BETA feature! Use with caution."}},
            "This is a mock command",
            "This command is NOT real.");

      final Command command2 = makeCommandMock(
            new String[]{"kebab-case-command", "DO_SOMETHING", "camelCase"},
            new String[][]{
                  new String[]{null, "Does something"},
                  new String[]{"arg1", null}},
            "This is another mock command",
            "This command is NOT real either.");

      final HelpCommand helpCommand = new HelpCommand("some-prefix!");

      final Command[] commands = new Command[]{
            command1,
            command2,
            helpCommand,
      };
      helpCommand.registerCommands(commands);
      EasyMock.verify(command1, command2);

      final Properties testData = new Properties();
      testData.load(Thread.currentThread().getContextClassLoader()
            .getResourceAsStream("HelpCommandTest.properties"));

      executeCommand(helpCommand, "", testData.get("Description.Full").toString());

      executeCommand(helpCommand, "a-command",
            testData.get("Description.Command1").toString());

      executeCommand(helpCommand, "DO_SOMETHING",
            testData.get("Description.Command2").toString());

      executeCommand(helpCommand, "help",
            testData.get("Description.HelpCommand").toString());
   }

   private static void executeCommand(final Command command, final String params,
         final String expectedAnswer) {

      final MessageChannel channel = new FakeMessageChannel();
      command.execute(channel.sendMessage(params).complete(), 0);

      final List<Message> messages = channel.getHistory().retrievePast(2).complete();
      Assertions.assertEquals(2, messages.size());
      Assertions.assertEquals(expectedAnswer, messages.get(1).getContentRaw());
   }

   private static Command makeCommandMock(final String[] aliases,
         final String[][] usageExamples, final String briefDescription,
         final String longDescription) {

      final Command command = EasyMock.createMock(Command.class);
      EasyMock.expect(command.getAliases()).andReturn(aliases).atLeastOnce();
      EasyMock.expect(command.getUsageExamples()).andReturn(usageExamples).once();
      EasyMock.expect(command.getBriefDescription()).andReturn(briefDescription).once();
      EasyMock.expect(command.getLongDescription()).andReturn(longDescription).once();

      EasyMock.replay(command);
      return command;
   }
}