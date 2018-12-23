package io.github.andypyrope.drew.cmd;

import sx.blah.discord.handle.obj.IMessage;

public interface CommandParser {
   /**
    * Look through a message and if it is a command, execute the corresponding command,
    *
    * @param message The message that has been received.
    */
   void interpretMessage(final IMessage message);
}
