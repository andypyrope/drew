package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

import java.io.File;
import java.io.InputStream;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class FakeMessageAction extends FakeRestAction<Message> implements MessageAction {

   FakeMessageAction(final Message message, final Runnable whenExecuted) {
      super(message, whenExecuted);
   }

   @Override
   public MessageChannel getChannel() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getChannel has not been implemented yet");
   }

   @Override
   public boolean isEmpty() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isEmpty has not been implemented yet");
   }

   @Override
   public boolean isEdit() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#isEdit has not been implemented yet");
   }

   @Override
   public MessageAction apply(final net.dv8tion.jda.api.entities.Message message) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#apply has not been implemented yet");
   }

   @Override
   public MessageAction tts(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#tts has not been implemented yet");
   }

   @Override
   public MessageAction reset() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#reset has not been implemented yet");
   }

   @Override
   public MessageAction nonce(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#nonce has not been implemented yet");
   }

   @Override
   public MessageAction content(final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#content has not been implemented yet");
   }

   @Override
   public MessageAction embed(final MessageEmbed messageEmbed) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#embed has not been implemented yet");
   }

   @Override
   public MessageAction append(final CharSequence csq) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#append has not been implemented yet");
   }

   @Override
   public MessageAction append(final CharSequence charSequence, final int i,
         final int i1) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#append has not been implemented yet");
   }

   @Override
   public MessageAction append(final char c) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#append has not been implemented yet");
   }

   @Override
   public MessageAction appendFormat(final String s, final Object... objects) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#appendFormat has not been implemented yet");
   }

   @Override
   public MessageAction addFile(final InputStream inputStream, final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addFile has not been implemented yet");
   }

   @Override
   public MessageAction addFile(final byte[] bytes, final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addFile has not been implemented yet");
   }

   @Override
   public MessageAction addFile(final File file) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addFile has not been implemented yet");
   }

   @Override
   public MessageAction addFile(final File file, final String s) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#addFile has not been implemented yet");
   }

   @Override
   public MessageAction clearFiles() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#clearFiles has not been implemented yet");
   }

   @Override
   public MessageAction clearFiles(final BiConsumer<String, InputStream> biConsumer) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#clearFiles has not been implemented yet");
   }

   @Override
   public MessageAction clearFiles(final Consumer<InputStream> consumer) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#clearFiles has not been implemented yet");
   }

   @Override
   public MessageAction override(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#override has not been implemented yet");
   }

   @Override
   public MessageAction setCheck(BooleanSupplier checks) {
      return (MessageAction) super.setCheck(checks);
   }
}
