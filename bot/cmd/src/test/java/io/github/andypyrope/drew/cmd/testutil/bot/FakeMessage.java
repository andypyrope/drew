package io.github.andypyrope.drew.cmd.testutil.bot;

import com.vdurmont.emoji.Emoji;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.IShard;
import sx.blah.discord.api.internal.json.objects.EmbedObject;
import sx.blah.discord.handle.impl.obj.ReactionEmoji;
import sx.blah.discord.handle.obj.*;
import sx.blah.discord.util.MessageTokenizer;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

class FakeMessage implements IMessage {

   private final HackyBot _bot;
   private final String _content;

   FakeMessage(final HackyBot bot, final String content) {
      _content = content;
      _bot = bot;
   }

   @Override
   public String getContent() {
      if (_content == null) {
         throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
               "#getContent does not have anything to return");
      }
      return _content;
   }

   @Override
   public IChannel getChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannel does not have functionality yet");
   }

   @Override
   public IUser getAuthor() {
      return new FakeUser(HackyBot.AUTHOR);
   }

   @Override
   public Instant getTimestamp() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getTimestamp does not have functionality yet");
   }

   @Override
   public List<IUser> getMentions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentions does not have functionality yet");
   }

   @Override
   public List<IRole> getRoleMentions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRoleMentions does not have functionality yet");
   }

   @Override
   public List<IChannel> getChannelMentions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannelMentions does not have functionality yet");
   }

   @Override
   public List<Attachment> getAttachments() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAttachments does not have functionality yet");
   }

   @Override
   public List<IEmbed> getEmbeds() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getEmbeds does not have functionality yet");
   }

   @Override
   public IMessage reply(final String reply) {
      return _bot.sendMessage(reply);
   }

   @Override
   public IMessage reply(final String s, final EmbedObject embedObject) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#reply does not have functionality yet");
   }

   @Override
   public IMessage edit(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#edit does not have functionality yet");
   }

   @Override
   public IMessage edit(final String s, final EmbedObject embedObject) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#edit does not have functionality yet");
   }

   @Override
   public IMessage edit(final EmbedObject embedObject) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#edit does not have functionality yet");
   }

   @Override
   public boolean mentionsEveryone() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mentionsEveryone does not have functionality yet");
   }

   @Override
   public boolean mentionsHere() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mentionsHere does not have functionality yet");
   }

   @Override
   public void delete() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#delete does not have functionality yet");
   }

   @Override
   public Optional<Instant> getEditedTimestamp() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getEditedTimestamp does not have functionality yet");
   }

   @Override
   public boolean isPinned() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isPinned does not have functionality yet");
   }

   @Override
   public IGuild getGuild() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getGuild does not have functionality yet");
   }

   @Override
   public String getFormattedContent() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getFormattedContent does not have functionality yet");
   }

   @Override
   public List<IReaction> getReactions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactions does not have functionality yet");
   }

   @Override
   public IReaction getReactionByEmoji(final IEmoji iEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactionByEmoji does not have functionality yet");
   }

   @Override
   public IReaction getReactionByID(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactionByID does not have functionality yet");
   }

   @Override
   public IReaction getReactionByUnicode(final Emoji emoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactionByUnicode does not have functionality yet");
   }

   @Override
   public IReaction getReactionByUnicode(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactionByUnicode does not have functionality yet");
   }

   @Override
   public IReaction getReactionByEmoji(final ReactionEmoji reactionEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactionByEmoji does not have functionality yet");
   }

   @Override
   public void addReaction(final IReaction iReaction) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction does not have functionality yet");
   }

   @Override
   public void addReaction(final IEmoji iEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction does not have functionality yet");
   }

   @Override
   public void addReaction(final Emoji emoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction does not have functionality yet");
   }

   @Override
   public void addReaction(final ReactionEmoji reactionEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction does not have functionality yet");
   }

   @Override
   public void removeReaction(final IUser iUser, final IReaction iReaction) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReaction does not have functionality yet");
   }

   @Override
   public void removeReaction(final IUser iUser, final ReactionEmoji reactionEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReaction does not have functionality yet");
   }

   @Override
   public void removeReaction(final IUser iUser, final IEmoji iEmoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReaction does not have functionality yet");
   }

   @Override
   public void removeReaction(final IUser iUser, final Emoji emoji) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReaction does not have functionality yet");
   }

   @Override
   public void removeReaction(final IUser iUser, final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReaction does not have functionality yet");
   }

   @Override
   public void removeAllReactions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeAllReactions does not have functionality yet");
   }

   @Override
   public MessageTokenizer tokenize() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#tokenize does not have functionality yet");
   }

   @Override
   public boolean isDeleted() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isDeleted does not have functionality yet");
   }

   @Override
   public long getWebhookLongID() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getWebhookLongID does not have functionality yet");
   }

   @Override
   public Type getType() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getType does not have functionality yet");
   }

   @Override
   public boolean isSystemMessage() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isSystemMessage does not have functionality yet");
   }

   @Override
   public IDiscordClient getClient() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getClient does not have functionality yet");
   }

   @Override
   public IShard getShard() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getShard does not have functionality yet");
   }

   @Override
   public IMessage copy() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#copy does not have functionality yet");
   }

   @Override
   public long getLongID() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getLongID does not have functionality yet");
   }
}
