package io.github.andypyrope.drew.cmd;

import net.dv8tion.jda.api.entities.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class JdaCommandParser implements CommandParser {

   private static final Logger LOGGER = LoggerFactory.getLogger(
         JdaCommandParser.class.getName());

   private final String _prefix;
   private final Map<String, Command> _stringCommandMap;

   public JdaCommandParser(final Command[] commands, final String prefix) {
      _prefix = prefix;

      _stringCommandMap = new HashMap<>(commands.length);
      for (final Command command : commands) {
         for (final String alias : command.getAliases()) {
            _stringCommandMap.put(alias, command);
         }
      }
   }

   @Override
   public void interpretMessage(final Message message) {
      final String content = message.getContentRaw();
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

         message.getChannel().sendMessage(String.format(
               "Your message is not a recognizable command, sorry! Type `%shelp` to " +
                     "see the list of commands you can use.", _prefix))
               .queue(result -> LOGGER.debug(
                     "Message '{}' sent - that a command was not recognized",
                     result.getId()));
         return;
      }

      final Command commandToExecute = _stringCommandMap.get(command);
      LOGGER.debug("Executing command '{}' ('{}')...",
            commandToExecute.getClass().getSimpleName(), command);
      commandToExecute.execute(message, _prefix.length() + command.length() + 1);
   }
}
