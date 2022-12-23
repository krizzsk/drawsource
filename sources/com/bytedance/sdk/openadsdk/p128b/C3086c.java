package com.bytedance.sdk.openadsdk.p128b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.p128b.C3095h;
import com.bytedance.sdk.openadsdk.p128b.C3101k;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.c */
/* compiled from: AdEventDispatcher */
public class C3086c<T extends C3101k> {

    /* renamed from: a */
    private C3095h<T> f7237a;

    /* renamed from: b */
    private Handler f7238b;

    /* renamed from: c */
    private C3095h<T> f7239c;

    /* renamed from: d */
    private Handler f7240d;

    /* renamed from: e */
    private AtomicBoolean f7241e;

    public C3086c(C3093f<T> fVar, C3516n<T> nVar, C3095h.C3098c cVar, C3095h.C3097b bVar) {
        this.f7237a = new C3095h<>(fVar, nVar, cVar, bVar);
        this.f7239c = new C3102l(new C3103m(C3513m.m10963a()), nVar, cVar, bVar);
        this.f7241e = new AtomicBoolean(false);
    }

    public C3086c(C3093f<T> fVar, C3516n<T> nVar, C3095h.C3098c cVar, C3095h.C3097b bVar, C3095h<T> hVar) {
        this.f7237a = hVar;
        this.f7239c = new C3102l(new C3103m(C3513m.m10963a()), nVar, cVar, bVar);
        this.f7241e = new AtomicBoolean(false);
    }

    C3086c() {
    }

    /* renamed from: a */
    public synchronized void mo18653a() {
        try {
            if (this.f7241e != null && !this.f7241e.get()) {
                if (this.f7237a.getLooper() == null) {
                    this.f7237a.start();
                    Handler handler = new Handler(this.f7237a.getLooper(), this.f7237a);
                    this.f7238b = handler;
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.what = 5;
                    this.f7238b.sendMessageDelayed(obtainMessage, 10000);
                }
                if (this.f7239c.getLooper() == null) {
                    this.f7239c.start();
                    Handler handler2 = new Handler(this.f7239c.getLooper(), this.f7239c);
                    this.f7240d = handler2;
                    Message obtainMessage2 = handler2.obtainMessage();
                    obtainMessage2.what = 5;
                    this.f7240d.sendMessageDelayed(obtainMessage2, 10000);
                }
                this.f7241e.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo18655b() {
        this.f7241e.set(false);
        this.f7237a.quit();
        this.f7239c.quit();
        this.f7238b.removeCallbacksAndMessages((Object) null);
        this.f7240d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public void mo18654a(T t) {
        if (!this.f7241e.get()) {
            mo18653a();
        }
        if (t.mo18569e()) {
            Message obtainMessage = this.f7240d.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t;
            this.f7240d.sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = this.f7238b.obtainMessage();
        obtainMessage2.what = 1;
        obtainMessage2.obj = t;
        this.f7238b.sendMessage(obtainMessage2);
    }

    /* renamed from: c */
    public static C3087a m8870c() {
        return C3087a.m8875e();
    }

    /* renamed from: d */
    public static C3088b m8871d() {
        return C3088b.m8880e();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$a */
    /* compiled from: AdEventDispatcher */
    private static class C3087a extends C3086c<C3060a> {

        /* renamed from: a */
        private static volatile C3087a f7242a;

        /* renamed from: a */
        public void mo18654a(C3060a aVar) {
        }

        /* renamed from: b */
        public void mo18655b() {
        }

        /* renamed from: e */
        public static C3087a m8875e() {
            if (f7242a == null) {
                synchronized (C3087a.class) {
                    if (f7242a == null) {
                        f7242a = new C3087a();
                    }
                }
            }
            return f7242a;
        }

        C3087a() {
        }

        /* renamed from: a */
        public synchronized void mo18653a() {
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$b */
    /* compiled from: AdEventDispatcher */
    private static class C3088b extends C3086c<C3775c.C3778a> {

        /* renamed from: a */
        private static volatile C3088b f7243a;

        /* renamed from: a */
        public void mo18654a(C3775c.C3778a aVar) {
        }

        /* renamed from: b */
        public void mo18655b() {
        }

        /* renamed from: e */
        public static C3088b m8880e() {
            if (f7243a == null) {
                synchronized (C3088b.class) {
                    if (f7243a == null) {
                        f7243a = new C3088b();
                    }
                }
            }
            return f7243a;
        }

        C3088b() {
        }

        /* renamed from: a */
        public synchronized void mo18653a() {
        }
    }
}
