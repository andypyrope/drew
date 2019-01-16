package io.github.andypyrope.drew.app;

import io.github.andypyrope.drew.cmd.Command;
import io.github.andypyrope.drew.cmd.CommandParser;
import io.github.andypyrope.drew.cmd.JdaCommandParser;
import io.github.andypyrope.drew.cmd.general.HelpCommand;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class App implements EventListener {

   private static final String PREFIX = "drew.";
   private static final Logger LOGGER = LoggerFactory.getLogger(App.class.getName());

   private final CommandParser _commandParser;

   private App() {
      final HelpCommand helpCommand = new HelpCommand(PREFIX);
      final Command[] commands = new Command[]{
            helpCommand,
      };
      helpCommand.registerCommands(commands);

      _commandParser = new JdaCommandParser(commands, PREFIX);
   }

   public static void main(final String[] args) {
      if (args.length == 0) {
         throw new RuntimeException("There should be one parameter - the bot token");
      }

      final App app = new App();
      try {
         app.start(args[0]);
      } catch (final LoginException e) {
         LOGGER.error("Could not log in", e);
      }
   }

   private void start(final String token) throws LoginException {
      new JDABuilder(token).addEventListeners(this).build();
   }

   @Override
   public void onEvent(Event event) {
      if (event instanceof MessageReceivedEvent) {
         final Message message = ((MessageReceivedEvent) event).getMessage();
         if (message.getAuthor().isBot()) {
            return;
         }

         LOGGER.debug("User '{}' has sent message '{}' at channel '{}'",
               message.getAuthor().getName(),
               message.getContentRaw(),
               message.getChannel().getName());

         _commandParser.interpretMessage(message);
      } else if (event instanceof ReadyEvent) {
         LOGGER.info("JdaApp is ready!");
      }
   }
}
