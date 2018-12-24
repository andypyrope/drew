package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.PrivateChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.requests.RestAction;

import java.time.OffsetDateTime;
import java.util.List;

public class FakeUser implements User {

   private final String _name;

   FakeUser(final String name) {
      _name = name;
   }

   @Override
   public String getName() {
      return _name;
   }

   @Override
   public String getDiscriminator() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDiscriminator has not been implemented yet");
   }

   @Override
   public String getAvatarId() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAvatarId has not been implemented yet");
   }

   @Override
   public String getAvatarUrl() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAvatarUrl has not been implemented yet");
   }

   @Override
   public String getDefaultAvatarId() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDefaultAvatarId has not been implemented yet");
   }

   @Override
   public String getDefaultAvatarUrl() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getDefaultAvatarUrl has not been implemented yet");
   }

   @Override
   public String getEffectiveAvatarUrl() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getEffectiveAvatarUrl has not been implemented yet");
   }

   @Override
   public boolean hasPrivateChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#hasPrivateChannel has not been implemented yet");
   }

   @Override
   public RestAction<PrivateChannel> openPrivateChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#openPrivateChannel has not been implemented yet");
   }

   @Override
   public List<Guild> getMutualGuilds() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMutualGuilds has not been implemented yet");
   }

   @Override
   public boolean isBot() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isBot has not been implemented yet");
   }

   @Override
   public JDA getJDA() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getJDA has not been implemented yet");
   }

   @Override
   public boolean isFake() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isFake has not been implemented yet");
   }

   @Override
   public String getAsMention() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAsMention has not been implemented yet");
   }

   @Override
   public String getId() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getId has not been implemented yet");
   }

   @Override
   public long getIdLong() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getIdLong has not been implemented yet");
   }

   @Override
   public OffsetDateTime getCreationTime() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCreationTime has not been implemented yet");
   }
}
