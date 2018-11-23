package io.github.andypyrope.drew.app;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.impl.obj.ReactionEmoji;
import sx.blah.discord.util.DiscordException;

public class App {

   public static void main(final String[] args) {
      if (args.length == 0) {
         throw new RuntimeException("There should be one parameter - the bot token");
      }

      final IDiscordClient client = logIn(args[0]);
      if (client == null) {
         System.out.println("Could not log in. Exiting...");
         return;
      }

      System.out.println(String.format("Application name: '%s'",
            client.getApplicationName()));

      final EventDispatcher dispatcher = client.getDispatcher();

      dispatcher.registerListener((IListener<ReadyEvent>) event ->
            System.out.println("Ready!"));

      dispatcher.registerListener((IListener<MessageReceivedEvent>) event -> {
         System.out.println(String.format("Message received by '%s': %s",
               event.getAuthor().getName(), event.getMessage().getContent()));

         try {
            event.getMessage().addReaction(ReactionEmoji.of("0⃣"));
            Thread.sleep(300);
            event.getMessage().addReaction(ReactionEmoji.of("\uD83C\uDDE6"));
            Thread.sleep(300);
            event.getMessage().addReaction(ReactionEmoji.of(":shiba_heartbroken:", 498190655843991554L));
         } catch (final InterruptedException e) {
            System.out.println("WHO INTERRUPTED MY SWEET SWEET SLEEP >:c");
            e.printStackTrace();
         }
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
