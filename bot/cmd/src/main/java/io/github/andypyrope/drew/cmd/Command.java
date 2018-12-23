package io.github.andypyrope.drew.cmd;

import sx.blah.discord.handle.obj.IMessage;

/**
 * A command that can be invoked by users by sending a message in any channel where the
 * bot is.
 */
public interface Command {

   /**
    * @return All strings that can be used to invoke this command.
    */
   String[] getAliases();

   /**
    * @return Examples of how the command should be used.
    */
   String[][] getUsageExamples();

   /**
    * @return A short description of what the command does.
    */
   String getBriefDescription();

   /**
    * @return A description about what the command does that can be arbitrarily long.
    */
   String getLongDescription();

   /**
    * @param message        The message entity.
    * @param parameterStart From which index the parameters of the command should start.
    */
   void execute(final IMessage message, final int parameterStart);
}
