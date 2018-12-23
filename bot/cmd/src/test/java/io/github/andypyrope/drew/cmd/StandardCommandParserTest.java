package io.github.andypyrope.drew.cmd;

import io.github.andypyrope.drew.cmd.testutil.bot.FakeBot;
import io.github.andypyrope.drew.cmd.testutil.bot.HackyBot;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sx.blah.discord.handle.obj.IMessage;

class StandardCommandParserTest {

   private static final String PREFIX = "d.";

   @Test
   void testInterpretMessageNotCommand() {
      final IMessage message = EasyMock.createMock(IMessage.class);
      EasyMock.expect(message.getContent())
            .andReturn("no" + PREFIX + "mew").once();
      EasyMock.replay(message);

      final CommandParser commandParser =
            new StandardCommandParser(new Command[]{}, PREFIX);

      commandParser.interpretMessage(message);
      EasyMock.verify(message);
   }

   @Test
   void testInterpretMessageNonExistentCommand() {
      final HackyBot bot = new FakeBot();
      final IMessage message = bot.sendMessage(PREFIX + "command-that-does-not-exist");
      final Command[] commands = new Command[]{
            makeCommandMock(new String[]{"a", "b"}, null, 0)};

      final CommandParser commandParser = new StandardCommandParser(commands, PREFIX);

      commandParser.interpretMessage(message);

      Assertions.assertEquals(2, bot.getMessages().size());
      Assertions.assertEquals("Your message is not a recognizable command, sorry! " +
                  "Type `d.help` to see the list of commands you can use.",
            bot.getMessages().get(1).getContent());

      EasyMock.verify((Object[]) commands);
   }

   @Test
   void testInterpretMessage() {
      final IMessage message = EasyMock.createMock(IMessage.class);
      EasyMock.expect(message.getContent()).andReturn("d.cmd").once();
      EasyMock.replay(message);

      final Command[] commands = new Command[]{
            makeCommandMock(new String[]{"mew", "mewore"}, null, 0),
            makeCommandMock(new String[]{"roar", "cmd"}, message, "d.cmd ".length())};

      final CommandParser commandParser = new StandardCommandParser(commands, PREFIX);

      commandParser.interpretMessage(message);

      EasyMock.verify(message);
      EasyMock.verify((Object[]) commands);
   }

   private static Command makeCommandMock(final String[] aliases,
         final IMessage executionMessage, final int executionParamStart) {

      final Command command = EasyMock.createMock(Command.class);
      EasyMock.expect(command.getAliases()).andReturn(aliases).once();
      if (executionMessage != null) {
         command.execute(executionMessage, executionParamStart);
         EasyMock.expectLastCall().once();
      }
      EasyMock.replay(command);
      return command;
   }
}