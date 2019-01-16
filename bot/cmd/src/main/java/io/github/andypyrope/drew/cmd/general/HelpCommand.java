package io.github.andypyrope.drew.cmd.general;

import io.github.andypyrope.drew.cmd.Command;
import net.dv8tion.jda.api.entities.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class HelpCommand implements Command {

   private static final Logger LOGGER =
         LoggerFactory.getLogger(HelpCommand.class.getName());

   private final Map<String, String> _commandDescriptions;
   private String _wholeHelp;
   private final String _prefix;

   public HelpCommand(final String prefix) {
      _commandDescriptions = new HashMap<>();
      _prefix = prefix;
   }

   public void registerCommands(final Command[] commands) {
      _commandDescriptions.clear();
      Arrays.sort(commands, Comparator.comparing(cmd -> cmd.getAliases()[0]));
      for (final Command command : commands) {
         final String[] aliases = command.getAliases();
         final List<String> descriptionParts = new ArrayList<>();
         descriptionParts.add(String.format("**%s** command: %s\n" +
                     "\n" +
                     "Examples:\n" +
                     "%s",
               aliases[0],
               command.getLongDescription(),
               Arrays.stream(command.getUsageExamples())
                     .map(exampleInfo -> String.format("- `%s%s%s`%s",
                           _prefix, aliases[0],
                           exampleInfo[0] != null ? " " + exampleInfo[0] : "",
                           exampleInfo[1] != null ? " - *" + exampleInfo[1] + "*" : ""))
                     .collect(Collectors.joining("\n"))));

         if (aliases.length > 1) {
            descriptionParts.add("All aliases: " + Arrays.stream(aliases)
                  .map(alias -> "`" + alias + "`")
                  .collect(Collectors.joining(", ")));
         }

         for (final String alias : aliases) {
            _commandDescriptions.put(alias,
                  descriptionParts.stream().collect(Collectors.joining("\n\n")));
         }
      }

      _wholeHelp = Arrays.stream(commands)
            .map(command -> String.format("=> `%s` - *%s*",
                  Arrays.stream(command.getAliases()).collect(Collectors.joining(" | ")),
                  command.getBriefDescription()))
            .collect(Collectors.joining("\n"));
   }

   @Override
   public String[] getAliases() {
      return new String[]{"help", "aid"};
   }

   @Override
   public String[][] getUsageExamples() {
      return new String[][]{
            new String[]{null, "Show all commands"},
            new String[]{"some-command",
                  "Show more detailed information about the 'some-command' command"},
      };
   }

   @Override
   public String getBriefDescription() {
      return "Shows command information.";
   }

   @Override
   public String getLongDescription() {
      return "Shows information about all commands, or about a single command.";
   }

   @Override
   public void execute(final Message message, final int paramStart) {
      final String content = message.getContentRaw();

      if (paramStart >= content.trim().length()) {
         message.getChannel().sendMessage(_wholeHelp)
               .queue((result) -> LOGGER.debug(
                     "Message '{}' sent - all command info", result.getId()));
         return;
      }

      final String param = content.substring(paramStart).split(" ")[0];
      if (!_commandDescriptions.containsKey(param)) {
         message.getChannel().sendMessage(
               String.format("Sorry, there's no '%s' command. Please use the " +
                           "`%s` command with no parameters to see a list of all commands.",
                     param, getAliases()[0]))
               .queue((result) -> LOGGER.debug(
                     "Message '{}' sent - that there was no '{}' command",
                     result.getId(), param));
         return;
      }
      message.getChannel().sendMessage(_commandDescriptions.get(param))
            .queue((result) -> LOGGER.debug(
                  "Message '{}' sent - info about command '{}'", result.getId(), param));
   }
}
