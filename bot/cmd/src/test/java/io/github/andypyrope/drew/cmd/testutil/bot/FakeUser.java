package io.github.andypyrope.drew.cmd.testutil.bot;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.IShard;
import sx.blah.discord.handle.obj.*;
import sx.blah.discord.util.cache.LongMap;

import java.awt.*;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;

public class FakeUser implements IUser {

   private final String _name;

   FakeUser(final String name) {
      _name = name;
   }

   @Override
   public String getName() {
      return _name;
   }

   @Override
   public String getAvatar() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAvatar does not have anything to return");
   }

   @Override
   public String getAvatarURL() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAvatarURL does not have anything to return");
   }

   @Override
   public IPresence getPresence() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getPresence does not have anything to return");
   }

   @Override
   public String getDisplayName(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDisplayName does not have anything to return");
   }

   @Override
   public String mention() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mention does not have anything to return");
   }

   @Override
   public String mention(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mention does not have anything to return");
   }

   @Override
   public String getDiscriminator() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDiscriminator does not have anything to return");
   }

   @Override
   public List<IRole> getRolesForGuild(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRolesForGuild does not have anything to return");
   }

   @Override
   public Color getColorForGuild(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getColorForGuild does not have anything to return");
   }

   @Override
   public EnumSet<Permissions> getPermissionsForGuild(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getPermissionsForGuild does not have anything to return");
   }

   @Override
   public String getNicknameForGuild(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getNicknameForGuild does not have anything to return");
   }

   @Override
   public IVoiceState getVoiceStateForGuild(final IGuild iGuild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getVoiceStateForGuild does not have anything to return");
   }

   @Override
   public LongMap<IVoiceState> getVoiceStates() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getVoiceStates does not have anything to return");
   }

   @Override
   public void moveToVoiceChannel(final IVoiceChannel iVoiceChannel) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#moveToVoiceChannel does not have anything to return");
   }

   @Override
   public boolean isBot() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isBot does not have anything to return");
   }

   @Override
   public IPrivateChannel getOrCreatePMChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getOrCreatePMChannel does not have anything to return");
   }

   @Override
   public void addRole(final IRole iRole) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addRole does not have anything to return");
   }

   @Override
   public void removeRole(final IRole iRole) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeRole does not have anything to return");
   }

   @Override
   public boolean hasRole(final IRole iRole) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#hasRole does not have anything to return");
   }

   @Override
   public IDiscordClient getClient() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getClient does not have anything to return");
   }

   @Override
   public IShard getShard() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getShard does not have anything to return");
   }

   @Override
   public Instant getCreationDate() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCreationDate does not have anything to return");
   }

   @Override
   public IUser copy() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#copy does not have anything to return");
   }

   @Override
   public long getLongID() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getLongID does not have anything to return");
   }

   @Override
   public String getStringID() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getStringID does not have anything to return");
   }
}
