package io.github.andypyrope.drew.cmd;

import io.github.andypyrope.drew.cmd.testutil.bot.FakeMessageChannel;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StandardCommandParserTest {

   private static final String PREFIX = "d.";

   private static Command makeCommandMock(final String[] aliases,
         final Message executionMessage, final int executionParamStart) {

      final Command command = EasyMock.createMock(Command.class);
      EasyMock.expect(command.getAliases()).andReturn(aliases).once();
      if (executionMessage != null) {
         command.execute(executionMessage, executionParamStart);
         EasyMock.expectLastCall().once();
      }
      EasyMock.replay(command);
      return command;
   }

   @Test
   void testInterpretMessageNotCommand() {
      final Message message = EasyMock.createMock(Message.class);
      EasyMock.expect(message.getContentRaw())
            .andReturn("no" + PREFIX + "mew").once();
      EasyMock.replay(message);

      final CommandParser commandParser =
            new JdaCommandParser(new Command[]{}, PREFIX);

      commandParser.interpretMessage(message);
      EasyMock.verify(message);
   }

   @Test
   void testInterpretMessageNonExistentCommand() {
      final MessageChannel channel = new FakeMessageChannel();
      final Message message = channel.sendMessage(PREFIX + "command-that-does-not-exist")
            .complete();

      final Command[] commands = new Command[]{
            makeCommandMock(new String[]{"a", "b"}, null, 0)};

      final CommandParser commandParser = new JdaCommandParser(commands, PREFIX);

      commandParser.interpretMessage(message);

      final List<Message> messages = channel.getHistory().retrievePast(2).complete();
      Assertions.assertEquals(2, messages.size());
      Assertions.assertEquals("Your message is not a recognizable command, sorry! " +
                  "Type `d.help` to see the list of commands you can use.",
            messages.get(1).getContentRaw());

      EasyMock.verify((Object[]) commands);
   }

   @Test
   void testInterpretMessage() {
      final Message message = EasyMock.createMock(Message.class);
      EasyMock.expect(message.getContentRaw()).andReturn("d.cmd").once();
      EasyMock.replay(message);

      final Command[] commands = new Command[]{
            makeCommandMock(new String[]{"mew", "mewore"}, null, 0),
            makeCommandMock(new String[]{"roar", "cmd"}, message, "d.cmd ".length())};

      final CommandParser commandParser = new JdaCommandParser(commands, PREFIX);

      commandParser.interpretMessage(message);

      EasyMock.verify(message);
      EasyMock.verify((Object[]) commands);
   }
}