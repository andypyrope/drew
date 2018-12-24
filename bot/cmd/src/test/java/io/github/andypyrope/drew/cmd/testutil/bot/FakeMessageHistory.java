package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.MessageHistory;
import net.dv8tion.jda.core.requests.RestAction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FakeMessageHistory implements MessageHistory {

   private final List<Message> _messages;
   private final MessageChannel _channel;
   private int _index;

   FakeMessageHistory(final List<Message> messages, final MessageChannel channel) {
      _messages = messages;
      _channel = channel;
      _index = _messages.size() - 1;
   }

   @Override
   public JDA getJDA() {
      return _channel.getJDA();
   }

   @Override
   public int size() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#size has not been implemented yet");
   }

   @Override
   public boolean isEmpty() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isEmpty has not been implemented yet");
   }

   @Override
   public MessageChannel getChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannel has not been implemented yet");
   }

   @Override
   public RestAction<List<Message>> retrievePast(final int maxCount) {
      final List<Message> messages = new ArrayList<>();
      for (int i = 0; i < maxCount; i++) {
         final Message message = retrievePrevious();
         if (message == null) {
            break;
         }
         messages.add(message);
      }
      Collections.reverse(messages);
      return new FakeRestAction<>(messages, () -> {
      });
   }

   @Override
   public RestAction<List<Message>> retrieveFuture(final int maxCount) {
      final List<Message> messages = new ArrayList<>();
      for (int i = 0; i < maxCount; i++) {
         final Message message = retrieveNext();
         if (message == null) {
            break;
         }
         messages.add(message);
      }
      return new FakeRestAction<>(messages, () -> {
      });
   }

   @Override
   public List<Message> getRetrievedHistory() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getRetrievedHistory has not been implemented yet");
   }

   @Override
   public Message getMessageById(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessageById has not been implemented yet");
   }

   @Override
   public Message getMessageById(final long l) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getMessageById has not been implemented yet");
   }

   private Message retrievePrevious() {
      return _index < 0 ? null : _messages.get(_index--);
   }

   private Message retrieveNext() {
      return _index >= _messages.size() - 2 ? null : _messages.get(++_index);
   }
}
