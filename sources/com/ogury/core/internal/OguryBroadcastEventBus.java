package com.ogury.core.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: OguryBroadcastEventBus.kt */
public final class OguryBroadcastEventBus implements OguryEventBus {
    private final List<C9737b> callbacks = new ArrayList();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$b */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C9699b extends C9718aj implements C9714af<C9737b, Boolean> {

        /* renamed from: a */
        private /* synthetic */ OguryBroadcastEventBus f24581a;

        /* renamed from: b */
        private /* synthetic */ OguryEventCallback f24582b;

        /* renamed from: c */
        private /* synthetic */ String f24583c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9699b(OguryBroadcastEventBus oguryBroadcastEventBus, OguryEventCallback oguryEventCallback, String str) {
            super(1);
            this.f24581a = oguryBroadcastEventBus;
            this.f24582b = oguryEventCallback;
            this.f24583c = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64035a(Object obj) {
            C9737b bVar = (C9737b) obj;
            C9717ai.m28145b(bVar, "it");
            return Boolean.valueOf(C9717ai.m28144a((Object) bVar.mo64073b(), (Object) this.f24582b) && C9717ai.m28144a((Object) bVar.mo64072a(), (Object) this.f24583c));
        }
    }

    public final void dispatch(String str, String str2) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(str2, "message");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.callbacks) {
            Collection arrayList = new ArrayList();
            for (Object next : this.callbacks) {
                if (C9717ai.m28144a((Object) ((C9737b) next).mo64072a(), (Object) str)) {
                    arrayList.add(next);
                }
            }
            for (C9737b sendEventOnMainThread : (List) arrayList) {
                sendEventOnMainThread(sendEventOnMainThread, str2, currentTimeMillis);
            }
            C9775g gVar = C9775g.f24678a;
        }
    }

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$a */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C9698a implements Runnable {

        /* renamed from: a */
        private /* synthetic */ C9737b f24578a;

        /* renamed from: b */
        private /* synthetic */ String f24579b;

        /* renamed from: c */
        private /* synthetic */ long f24580c;

        C9698a(C9737b bVar, String str, long j) {
            this.f24578a = bVar;
            this.f24579b = str;
            this.f24580c = j;
        }

        public final void run() {
            this.f24578a.mo64073b().onNewEvent(this.f24578a.mo64072a(), this.f24579b, this.f24580c);
        }
    }

    private final void sendEventOnMainThread(C9737b bVar, String str, long j) {
        this.mainThreadHandler.post(new C9698a(bVar, str, j));
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            this.callbacks.add(new C9737b(str, oguryEventCallback));
            C9775g gVar = C9775g.f24678a;
        }
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            C9779k.m28239a(this.callbacks, new C9699b(this, oguryEventCallback, str));
        }
    }
}
