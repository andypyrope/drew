package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.AuditableRestAction;
import net.dv8tion.jda.api.requests.restaction.MessageAction;
import net.dv8tion.jda.api.requests.restaction.pagination.MessagePaginationAction;

import java.io.File;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FakeMessageChannel implements MessageChannel {

   private final List<Message> _messages;

   public FakeMessageChannel(final String... messages) {
      _messages = new ArrayList<>();
      if (messages != null) {
         for (final String message : messages) {
            _messages.add(new FakeMessage(this, message));
         }
      }
   }

   @Override
   public String getLatestMessageId() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getLatestMessageId has not been implemented yet");
   }

   @Override
   public List<CompletableFuture<Void>> purgeMessagesById(final List<String> messageIds) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#purgeMessagesById has not been implemented yet");
   }

   @Override
   public List<CompletableFuture<Void>> purgeMessagesById(final String... messageIds) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#purgeMessagesById has not been implemented yet");
   }

   @Override
   public List<CompletableFuture<Void>> purgeMessages(final Message... messages) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#purgeMessages has not been implemented yet");
   }

   @Override
   public List<CompletableFuture<Void>> purgeMessages(
         final List<? extends Message> messages) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#purgeMessages has not been implemented yet");
   }

   @Override
   public List<CompletableFuture<Void>> purgeMessagesById(final long... messageIds) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#purgeMessagesById has not been implemented yet");
   }

   @Override
   public long getLatestMessageIdLong() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getLatestMessageIdLong has not been implemented yet");
   }

   @Override
   public boolean hasLatestMessage() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#hasLatestMessage has not been implemented yet");
   }

   @Override
   public String getName() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getName has not been implemented yet");
   }

   @Override
   public ChannelType getType() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getType has not been implemented yet");
   }

   @Override
   public JDA getJDA() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getJDA has not been implemented yet");
   }

   @Override
   public MessageAction sendMessage(final CharSequence text) {
      final Message message = new FakeMessage(this, text.toString());
      return new FakeMessageAction(message, () -> _messages.add(message));
   }

   @Override
   public MessageAction sendMessageFormat(final String format, final Object... args) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendMessageFormat has not been implemented yet");
   }

   @Override
   public MessageAction sendMessage(final MessageEmbed embed) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendMessage has not been implemented yet");
   }

   @Override
   public MessageAction sendMessage(final Message msg) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendMessage has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final File file) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final File file, final String fileName) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final InputStream data, final String fileName) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final byte[] data, final String fileName) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final File file, final Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final File file, final String fileName,
         final Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final InputStream data, final String fileName,
         final Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public MessageAction sendFile(final byte[] data, final String fileName,
         final Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendFile has not been implemented yet");
   }

   @Override
   public RestAction<Message> getMessageById(final String messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessageById has not been implemented yet");
   }

   @Override
   public RestAction<Message> getMessageById(final long messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessageById has not been implemented yet");
   }

   @Override
   public AuditableRestAction<Void> deleteMessageById(final String messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#deleteMessageById has not been implemented yet");
   }

   @Override
   public AuditableRestAction<Void> deleteMessageById(final long messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#deleteMessageById has not been implemented yet");
   }

   @Override
   public MessageHistory getHistory() {
      return new FakeMessageHistory(_messages, this);
   }

   @Override
   public MessagePaginationAction getIterableHistory() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getIterableHistory has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAround(final String messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAround has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAround(final long messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAround has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAround(final Message message,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAround has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAfter(final String messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAfter has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAfter(final long messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAfter has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryAfter(final Message message,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryAfter has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryBefore(final String messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryBefore has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryBefore(final long messageId,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryBefore has not been implemented yet");
   }

   @Override
   public MessageRetrieveAction getHistoryBefore(final Message message,
         final int limit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getHistoryBefore has not been implemented yet");
   }

   @Override
   public RestAction<Void> sendTyping() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#sendTyping has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReactionById(final String messageId, final String unicode) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReactionById(final long messageId, final String unicode) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReactionById(final String messageId, final Emote emote) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> addReactionById(final long messageId, final Emote emote) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> removeReactionById(final String messageId,
         final String unicode) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> removeReactionById(final long messageId,
         final String unicode) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> removeReactionById(final String messageId, final Emote emote) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> removeReactionById(final long messageId, final Emote emote) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#removeReactionById has not been implemented yet");
   }

   @Override
   public RestAction<Void> pinMessageById(final String messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#pinMessageById has not been implemented yet");
   }

   @Override
   public RestAction<Void> pinMessageById(final long messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#pinMessageById has not been implemented yet");
   }

   @Override
   public RestAction<Void> unpinMessageById(final String messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#unpinMessageById has not been implemented yet");
   }

   @Override
   public RestAction<Void> unpinMessageById(final long messageId) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#unpinMessageById has not been implemented yet");
   }

   @Override
   public RestAction<List<Message>> getPinnedMessages() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getPinnedMessages has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final String messageId,
         final CharSequence newContent) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final long messageId,
         final CharSequence newContent) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final String messageId,
         final Message newContent) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final long messageId, final Message newContent) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageFormatById(final String messageId, final String format,
         final Object... args) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageFormatById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageFormatById(final long messageId, final String format,
         final Object... args) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageFormatById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final String messageId,
         final MessageEmbed newEmbed) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public MessageAction editMessageById(final long messageId,
         final MessageEmbed newEmbed) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#editMessageById has not been implemented yet");
   }

   @Override
   public void formatTo(final Formatter formatter, final int flags, final int width,
         final int precision) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#formatTo has not been implemented yet");
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
   public OffsetDateTime getTimeCreated() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getTimeCreated has not been implemented yet");
   }
}
