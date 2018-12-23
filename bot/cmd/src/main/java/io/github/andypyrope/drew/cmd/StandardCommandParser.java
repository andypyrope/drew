package io.github.andypyrope.drew.cmd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.handle.obj.IMessage;

import java.util.HashMap;
import java.util.Map;

public class StandardCommandParser implements CommandParser {

   private static final Logger LOGGER = LoggerFactory.getLogger(
         StandardCommandParser.class.getName());

   private final String _prefix;
   private final Map<String, Command> _stringCommandMap;

   public StandardCommandParser(final Command[] commands, final String prefix) {
      _prefix = prefix;

      _stringCommandMap = new HashMap<>(commands.length);
      for (final Command command : commands) {
         for (final String alias : command.getAliases()) {
            _stringCommandMap.put(alias, command);
         }
      }
   }

   @Override
   public void interpretMessage(final IMessage message) {
      final String content = message.getContent();
      LOGGER.debug("Parsing '{}'", content);
      if (!content.startsWith(_prefix)) {
         LOGGER.debug("Message '{}' is not a command", content);
         return;
      }

      final int firstSpaceAfterPrefix = content.indexOf(' ', _prefix.length());
      final String command = content.substring(_prefix.length(),
            firstSpaceAfterPrefix == -1 ? content.length() : firstSpaceAfterPrefix);

      if (!_stringCommandMap.containsKey(command)) {
         LOGGER.debug("Message '{}' by user '{}' is not a recognizable command",
               content, message.getAuthor().toString());

         message.reply(String.format(
               "Your message is not a recognizable command, sorry! Type `%shelp` to " +
                     "see the list of commands you can use.", _prefix));
         return;
      }

      _stringCommandMap.get(command).execute(
            message,
            _prefix.length() + command.length() + 1);
   }
}
