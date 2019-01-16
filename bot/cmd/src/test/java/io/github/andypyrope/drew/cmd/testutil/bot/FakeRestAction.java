package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.exceptions.RateLimitedException;
import net.dv8tion.jda.api.requests.RestAction;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class FakeRestAction<T> implements RestAction<T> {

   private final T _result;
   private final Runnable _whenExecuted;
   private boolean _hasBeenExecuted = false;

   FakeRestAction(final T result, final Runnable whenExecuted) {
      _result = result;
      _whenExecuted = whenExecuted;
   }

   @Override
   public JDA getJDA() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#getJDA has not been implemented yet");
   }

   @Override
   public RestAction<T> setCheck(final BooleanSupplier booleanSupplier) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#setCheck has not been implemented yet");
   }

   @Override
   public void queue() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queue has not been implemented yet");
   }

   @Override
   public void queue(final Consumer<? super T> consumer) {
      if (!_hasBeenExecuted) {
         _whenExecuted.run();
         _hasBeenExecuted = true;
      }
      consumer.accept(_result);
   }

   @Override
   public void queue(final Consumer<? super T> consumer,
         final Consumer<? super Throwable> consumer1) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queue has not been implemented yet");
   }

   @Override
   public T complete() {
      if (!_hasBeenExecuted) {
         _whenExecuted.run();
         _hasBeenExecuted = true;
      }
      return _result;
   }

   @Override
   public T complete(final boolean b) throws RateLimitedException {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#complete has not been implemented yet");
   }

   @Override
   public CompletableFuture<T> submit() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submit has not been implemented yet");
   }

   @Override
   public CompletableFuture<T> submit(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submit has not been implemented yet");
   }

   @Override
   public ScheduledFuture<T> submitAfter(final long delay, final TimeUnit unit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submitAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<T> submitAfter(final long delay, final TimeUnit unit,
         final ScheduledExecutorService executor) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submitAfter has not been implemented yet");
   }

   @Override
   public T completeAfter(final long delay, final TimeUnit unit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#completeAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit,
         final Consumer<? super T> success) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit,
         final Consumer<? super T> success, final Consumer<? super Throwable> failure) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit,
         final ScheduledExecutorService executor) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit,
         final Consumer<? super T> success, final ScheduledExecutorService executor) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long delay, final TimeUnit unit,
         final Consumer<? super T> success, final Consumer<? super Throwable> failure,
         final ScheduledExecutorService executor) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }
}
