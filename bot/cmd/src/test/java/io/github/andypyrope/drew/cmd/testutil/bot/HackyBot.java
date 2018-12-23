package io.github.andypyrope.drew.cmd.testutil.bot;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IMessage;

public interface HackyBot extends IDiscordClient {

   String AUTHOR = "mewore";

   /**
    * Creates a custom message
    * @param content The content of the message
    * @return The newly created message.
    */
   IMessage sendMessage(final String content);
}
