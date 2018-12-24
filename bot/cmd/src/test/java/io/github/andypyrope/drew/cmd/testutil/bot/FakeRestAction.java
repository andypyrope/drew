package io.github.andypyrope.drew.cmd.testutil.bot;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.requests.RequestFuture;
import net.dv8tion.jda.core.requests.RestAction;

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
            "#queue(Consumer<T>, Consumer<Throwable>) has not been implemented yet");
   }

   @Override
   public RequestFuture<T> submit() {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submit has not been implemented yet");
   }

   @Override
   public RequestFuture<T> submit(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submit has not been implemented yet");
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
   public T complete(final boolean b) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#complete has not been implemented yet");
   }

   @Override
   public ScheduledFuture<T> submitAfter(final long l, final TimeUnit timeUnit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submitAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<T> submitAfter(final long l, final TimeUnit timeUnit,
         final ScheduledExecutorService scheduledExecutorService) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#submitAfter has not been implemented yet");
   }

   @Override
   public T completeAfter(final long l, final TimeUnit timeUnit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#completeAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit,
         final Consumer<? super T> consumer) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit,
         final Consumer<? super T> consumer,
         final Consumer<? super Throwable> consumer1) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit,
         final ScheduledExecutorService scheduledExecutorService) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit,
         final Consumer<? super T> consumer,
         final ScheduledExecutorService scheduledExecutorService) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }

   @Override
   public ScheduledFuture<?> queueAfter(final long l, final TimeUnit timeUnit,
         final Consumer<? super T> consumer, final Consumer<? super Throwable> consumer1,
         final ScheduledExecutorService scheduledExecutorService) {
      throw new MissingImplementationException("Method " + getClass().getCanonicalName() +
            "#queueAfter has not been implemented yet");
   }
}
