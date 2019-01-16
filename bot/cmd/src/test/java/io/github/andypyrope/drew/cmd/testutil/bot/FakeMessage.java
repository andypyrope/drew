package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.AuditableRestAction;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

import java.time.OffsetDateTime;
import java.util.Formatter;
import java.util.List;

class FakeMessage implements Message {

   private static final String AUTHOR = "mewore";

   private final MessageChannel _channel;
   private final String _content;

   FakeMessage(final MessageChannel channel, final String content) {
      _content = content;
      _channel = channel;
   }

   @Override
   public List<User> getMentionedUsers() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentionedUsers has not been implemented yet");
   }

   @Override
   public List<TextChannel> getMentionedChannels() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentionedChannels has not been implemented yet");
   }

   @Override
   public List<Role> getMentionedRoles() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentionedRoles has not been implemented yet");
   }

   @Override
   public List<Member> getMentionedMembers(final Guild guild) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentionedMembers has not been implemented yet");
   }

   @Override
   public List<Member> getMentionedMembers() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentionedMembers has not been implemented yet");
   }

   @Override
   public List<IMentionable> getMentions(final MentionType... mentionTypes) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMentions has not been implemented yet");
   }

   @Override
   public boolean isMentioned(final IMentionable iMentionable,
         final MentionType... mentionTypes) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isMentioned has not been implemented yet");
   }

   @Override
   public boolean mentionsEveryone() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#mentionsEveryone has not been implemented yet");
   }

   @Override
   public boolean isEdited() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isEdited has not been implemented yet");
   }

   @Override
   public OffsetDateTime getTimeEdited() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getTimeEdited has not been implemented yet");
   }

   @Override
   public User getAuthor() {
      return new FakeUser(AUTHOR);
   }

   @Override
   public Member getMember() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMember has not been implemented yet");
   }

   @Override
   public String getJumpUrl() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getJumpUrl has not been implemented yet");
   }

   @Override
   public String getContentDisplay() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getContentDisplay has not been implemented yet");
   }

   @Override
   public String getContentRaw() {
      return _content;
   }

   @Override
   public String getContentStripped() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getContentStripped has not been implemented yet");
   }

   @Override
   public List<String> getInvites() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getInvites has not been implemented yet");
   }

   @Override
   public String getNonce() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getNonce has not been implemented yet");
   }

   @Override
   public boolean isFromType(final ChannelType channelType) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isFromType has not been implemented yet");
   }

   @Override
   public ChannelType getChannelType() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannelType has not been implemented yet");
   }

   @Override
   public boolean isWebhookMessage() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isWebhookMessage has not been implemented yet");
   }

   @Override
   public MessageChannel getChannel() {
      return _channel;
   }

   @Override
   public PrivateChannel getPrivateChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getPrivateChannel has not been implemented yet");
   }

   @Override
   public TextChannel getTextChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getTextChannel has not been implemented yet");
   }

   @Override
   public Category getCategory() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getCategory has not been implemented yet");
   }

   @Override
   public Guild getGuild() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getGuild has not been implemented yet");
   }

   @Override
   public List<Attachment> getAttachments() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getAttachments has not been implemented yet");
   }

   @Override
   public List<MessageEmbed> getEmbeds() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getEmbeds has not been implemented yet");
   }

   @Override
   public List<Emote> getEmotes() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getEmotes has not been implemented yet");
   }

   @Override
   public List<MessageReaction> getReactions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getReactions has not been implemented yet");
   }

   @Override
   public boolean isTTS() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isTTS has not been implemented yet");
   }

   @Override
   public MessageAction editMessage(final CharSequence charSequence) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessage has not been implemented yet");
   }

   @Override
   public MessageAction editMessage(final MessageEmbed messageEmbed) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessage has not been implemented yet");
   }

   @Override
   public MessageAction editMessageFormat(final String s, final Object... objects) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageFormat has not been implemented yet");
   }

   @Override
   public MessageAction editMessage(final Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessage has not been implemented yet");
   }

   @Override
   public AuditableRestAction<Void> delete() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#delete has not been implemented yet");
   }

   @Override
   public JDA getJDA() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getJDA has not been implemented yet");
   }

   @Override
   public boolean isPinned() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isPinned has not been implemented yet");
   }

   @Override
   public RestAction<Void> pin() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#pin has not been implemented yet");
   }

   @Override
   public RestAction<Void> unpin() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#unpin has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReaction(final Emote emote) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReaction(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReaction has not been implemented yet");
   }

   @Override
   public RestAction<Void> clearReactions() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#clearReactions has not been implemented yet");
   }

   @Override
   public MessageType getType() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getType has not been implemented yet");
   }

   @Override
   public void formatTo(final Formatter formatter, final int flags, final int width,
         final int precision) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#formatTo has not been implemented yet");
   }

   @Override
   public String getId() {
      return "0";
   }

   @Override
   public long getIdLong() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getIdLong has not been implemented yet");
   }
}
