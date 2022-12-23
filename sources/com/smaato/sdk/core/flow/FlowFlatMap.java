package com.smaato.sdk.core.flow;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowFlatMap<T, U> extends Flow<U> {
    private final Function1<? super T, ? extends Publisher<? extends U>> mapper;
    private final Publisher<T> source;

    FlowFlatMap(Publisher<T> publisher, Function1<? super T, ? extends Publisher<? extends U>> function1) {
        this.source = publisher;
        this.mapper = function1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe(new FlowMapSubscriber(subscriber, this.mapper));
    }

    private static class FlowMapSubscriber<T, U> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private boolean completed;
        private final AtomicLong demand = new AtomicLong();
        private final Subscriber<? super U> downstream;
        private volatile Throwable error;
        private final Queue<InnerSubscriber<U>> innerSubscribers = new ConcurrentLinkedQueue();
        private final Function1<? super T, ? extends Publisher<? extends U>> mapper;
        private volatile boolean upStreamDone;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowMapSubscriber(Subscriber<? super U> subscriber, Function1<? super T, ? extends Publisher<? extends U>> function1) {
            this.downstream = subscriber;
            this.mapper = function1;
        }

        public void onSubscribe(Subscription subscription) {
            if (Subscriptions.setOnce(this.upstream, subscription)) {
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.cancelled && !this.completed) {
                try {
                    Publisher publisher = (Publisher) this.mapper.apply(t);
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this);
                    if (this.innerSubscribers.offer(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                    } else {
                        innerSubscriber.dispose();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.cancelled) {
                FlowPlugins.onError(th);
                return;
            }
            this.error = th;
            this.upStreamDone = true;
            drain();
        }

        public void onComplete() {
            if (!this.cancelled && !this.completed) {
                this.upStreamDone = true;
                drain();
            }
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                this.upstream.get().request(j);
            }
        }

        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        /* access modifiers changed from: package-private */
        public void cancelAll() {
            Subscriptions.cancel(this.upstream);
            InnerSubscriber poll = this.innerSubscribers.poll();
            while (poll != null) {
                poll.dispose();
                poll = this.innerSubscribers.poll();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            Object poll;
            long j = this.demand.get();
            Iterator it = this.innerSubscribers.iterator();
            long j2 = 0;
            while (j2 < j && !this.cancelled && it.hasNext()) {
                InnerSubscriber innerSubscriber = (InnerSubscriber) it.next();
                Queue access$000 = innerSubscriber.buffer;
                while (j2 < j && !this.cancelled && (poll = access$000.poll()) != null) {
                    this.downstream.onNext(poll);
                    j2++;
                }
                if (innerSubscriber.done) {
                    it.remove();
                }
            }
            Subscriptions.produced(this.demand, j2);
            if (!this.cancelled) {
                checkIfCompleted();
            }
        }

        private void checkIfCompleted() {
            if (!this.completed && done()) {
                this.completed = true;
                if (this.error != null) {
                    this.downstream.onError(this.error);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        private boolean done() {
            if (!this.upStreamDone) {
                return false;
            }
            if (this.error != null) {
                return true;
            }
            for (InnerSubscriber access$100 : this.innerSubscribers) {
                if (!access$100.done) {
                    return false;
                }
            }
            return true;
        }
    }

    private static class InnerSubscriber<U> implements Subscriber<U>, Disposable {
        /* access modifiers changed from: private */
        public final Queue<U> buffer = new ConcurrentLinkedQueue();
        /* access modifiers changed from: private */
        public volatile boolean done;
        private final FlowMapSubscriber<?, U> parent;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        InnerSubscriber(FlowMapSubscriber<?, U> flowMapSubscriber) {
            this.parent = flowMapSubscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (Subscriptions.setOnce(this.upstream, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(U u) {
            if (this.buffer.offer(u)) {
                this.parent.drain();
            }
        }

        public void onError(Throwable th) {
            this.done = true;
            this.parent.cancelAll();
            this.parent.onError(th);
        }

        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void dispose() {
            Subscriptions.cancel(this.upstream);
        }
    }
}
