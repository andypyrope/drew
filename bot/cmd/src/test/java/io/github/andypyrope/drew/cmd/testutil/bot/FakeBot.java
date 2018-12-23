package io.github.andypyrope.drew.cmd.testutil.bot;

import sx.blah.discord.api.IShard;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.handle.obj.*;
import sx.blah.discord.modules.ModuleLoader;
import sx.blah.discord.util.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * An in-memory implementation of {@link sx.blah.discord.api.IDiscordClient}. It misses
 * most of the functionality, of course, but it is only for testing purposes.
 */
public class FakeBot implements HackyBot {

   private final List<IMessage> _messages = new ArrayList<>();

   @Override
   public EventDispatcher getDispatcher() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDispatcher does not have an implementation yet");
   }

   @Override
   public ModuleLoader getModuleLoader() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getModuleLoader does not have an implementation yet");
   }

   @Override
   public List<IShard> getShards() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getShards does not have an implementation yet");
   }

   @Override
   public int getShardCount() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getShardCount does not have an implementation yet");
   }

   @Override
   public String getToken() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getToken does not have an implementation yet");
   }

   @Override
   public void login() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#login does not have an implementation yet");
   }

   @Override
   public void logout() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#logout does not have an implementation yet");
   }

   @Override
   public void changeUsername(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#changeUsername does not have an implementation yet");
   }

   @Override
   public void changeAvatar(final Image image) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#changeAvatar does not have an implementation yet");
   }

   @Override
   public void changePresence(final StatusType statusType,
         final ActivityType activityType,
         final String s) {

      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#changePresence does not have an implementation yet");
   }

   @Override
   public void changePresence(final StatusType statusType) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#changePresence does not have an implementation yet");
   }

   @Override
   public void changeStreamingPresence(final StatusType statusType, final String s,
         final String s1) {

      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#changeStreamingPresence does not have an implementation yet");
   }

   @Override
   public void mute(final IGuild iGuild, final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mute does not have an implementation yet");
   }

   @Override
   public void deafen(final IGuild iGuild, final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#deafen does not have an implementation yet");
   }

   @Override
   public boolean isReady() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isReady does not have an implementation yet");
   }

   @Override
   public void checkReady(final String action) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#checkReady does not have an implementation yet");
   }

   @Override
   public boolean isLoggedIn() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isLoggedIn does not have an implementation yet");
   }

   @Override
   public void checkLoggedIn(final String action) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#checkLoggedIn does not have an implementation yet");
   }

   @Override
   public IUser getOurUser() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getOurUser does not have an implementation yet");
   }

   @Override
   public List<IChannel> getChannels(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannels does not have an implementation yet");
   }

   @Override
   public List<IChannel> getChannels() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannels does not have an implementation yet");
   }

   @Override
   public IChannel getChannelByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannelByID does not have an implementation yet");
   }

   @Override
   public List<IVoiceChannel> getVoiceChannels() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getVoiceChannels does not have an implementation yet");
   }

   @Override
   public IVoiceChannel getVoiceChannelByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getVoiceChannelByID does not have an implementation yet");
   }

   @Override
   public List<IGuild> getGuilds() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getGuilds does not have an implementation yet");
   }

   @Override
   public IGuild getGuildByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getGuildByID does not have an implementation yet");
   }

   @Override
   public List<IUser> getUsers() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getUsers does not have an implementation yet");
   }

   @Override
   public IUser getUserByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getUserByID does not have an implementation yet");
   }

   @Override
   public IUser fetchUser(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#fetchUser does not have an implementation yet");
   }

   @Override
   public List<IUser> getUsersByName(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getUsersByName does not have an implementation yet");
   }

   @Override
   public List<IUser> getUsersByName(final String s, final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getUsersByName does not have an implementation yet");
   }

   @Override
   public List<IRole> getRoles() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRoles does not have an implementation yet");
   }

   @Override
   public IRole getRoleByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRoleByID does not have an implementation yet");
   }

   @Override
   public List<IMessage> getMessages(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessages(boolean) does not have an implementation yet");
   }

   @Override
   public List<IMessage> getMessages() {
      return _messages;
   }

   @Override
   public IMessage getMessageByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessageByID does not have an implementation yet");
   }

   @Override
   public IPrivateChannel getOrCreatePMChannel(final IUser iUser) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getOrCreatePMChannel does not have an implementation yet");
   }

   @Override
   public IInvite getInviteForCode(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getInviteForCode does not have an implementation yet");
   }

   @Override
   public List<IRegion> getRegions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRegions does not have an implementation yet");
   }

   @Override
   public IRegion getRegionByID(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRegionByID does not have an implementation yet");
   }

   @Override
   public List<IVoiceChannel> getConnectedVoiceChannels() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getConnectedVoiceChannels does not have an implementation yet");
   }

   @Override
   public String getApplicationDescription() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getApplicationDescription does not have an implementation yet");
   }

   @Override
   public String getApplicationIconURL() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getApplicationIconURL does not have an implementation yet");
   }

   @Override
   public String getApplicationClientID() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getApplicationClientID does not have an implementation yet");
   }

   @Override
   public String getApplicationName() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getApplicationName does not have an implementation yet");
   }

   @Override
   public IUser getApplicationOwner() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getApplicationOwner does not have an implementation yet");
   }

   @Override
   public List<ICategory> getCategories() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCategories does not have an implementation yet");
   }

   @Override
   public ICategory getCategoryByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCategoryByID does not have an implementation yet");
   }

   @Override
   public List<ICategory> getCategoriesByName(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCategoriesByName does not have an implementation yet");
   }

   @Override
   public IMessage sendMessage(final String content) {
      IMessage message = new FakeMessage(this, content);
      _messages.add(message);
      return message;
   }
}
