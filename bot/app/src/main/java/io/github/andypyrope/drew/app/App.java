package io.github.andypyrope.drew.app;

import io.github.andypyrope.drew.cmd.Command;
import io.github.andypyrope.drew.cmd.CommandParser;
import io.github.andypyrope.drew.cmd.StandardCommandParser;
import io.github.andypyrope.drew.cmd.general.HelpCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.util.DiscordException;

public class App {

   private static final Logger LOGGER = LoggerFactory.getLogger(App.class.getName());

   public static void main(final String[] args) {
      if (args.length == 0) {
         throw new RuntimeException("There should be one parameter - the bot token");
      }

      final IDiscordClient client = logIn(args[0]);
      if (client == null) {
         System.out.println("Could not log in. Exiting...");
         return;
      }

      final String prefix = "drew.";

      final HelpCommand helpCommand = new HelpCommand(prefix);
      final Command[] commands = new Command[]{
            helpCommand,
      };
      helpCommand.registerCommands(commands);

      final CommandParser commandParser = new StandardCommandParser(commands, prefix);

      System.out.println(String.format("Application name: '%s'",
            client.getApplicationName()));

      final EventDispatcher dispatcher = client.getDispatcher();

      dispatcher.registerListener((IListener<ReadyEvent>) event -> LOGGER.info("Ready!"));

      dispatcher.registerListener((IListener<MessageReceivedEvent>) event -> {
         LOGGER.info("Message received by '{}#{}': {}",
               event.getAuthor().getName(),
               event.getAuthor().getDiscriminator(),
               event.getMessage().getContent());
         commandParser.interpretMessage(event.getMessage());
      });
   }

   private static IDiscordClient logIn(final String token) {
      final ClientBuilder clientBuilder = new ClientBuilder().withToken(token);

      try {
         return clientBuilder.login();
      } catch (final DiscordException e) {
         e.printStackTrace();
         return null;
      }
   }
}
