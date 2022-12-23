package com.bytedance.sdk.openadsdk.p128b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.b.p */
/* compiled from: OpenAppSuccEvent */
public class C3110p {

    /* renamed from: a */
    private static volatile C3110p f7312a;

    /* renamed from: b */
    private HandlerThread f7313b;

    /* renamed from: c */
    private final Handler f7314c;

    /* renamed from: d */
    private final Executor f7315d = Executors.newCachedThreadPool();

    /* renamed from: e */
    private C3113b f7316e = C3113b.m9036a();

    /* renamed from: f */
    private Map<String, Object> f7317f;

    /* renamed from: a */
    public static C3110p m9026a() {
        if (f7312a == null) {
            synchronized (C3110p.class) {
                if (f7312a == null) {
                    f7312a = new C3110p();
                }
            }
        }
        return f7312a;
    }

    private C3110p() {
        if (this.f7313b == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.f7313b = handlerThread;
            handlerThread.start();
        }
        this.f7314c = new Handler(this.f7313b.getLooper(), new Handler.Callback() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bytedance.sdk.openadsdk.b.p$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 100
                    if (r0 != r1) goto L_0x001d
                    r0 = 0
                    java.lang.Object r1 = r3.obj
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r1 = r3.obj
                    boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.p128b.C3110p.C3112a
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r3 = r3.obj
                    r0 = r3
                    com.bytedance.sdk.openadsdk.b.p$a r0 = (com.bytedance.sdk.openadsdk.p128b.C3110p.C3112a) r0
                L_0x0016:
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.sdk.openadsdk.b.p r3 = com.bytedance.sdk.openadsdk.p128b.C3110p.this
                    r3.m9029b(r0)
                L_0x001d:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3110p.C31111.handleMessage(android.os.Message):boolean");
            }
        });
    }

    /* renamed from: a */
    public void mo18708a(C3431n nVar, String str) {
        Message obtainMessage = this.f7314c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = C3112a.m9032a(nVar, str, this.f7317f);
        obtainMessage.sendToTarget();
    }

    /* renamed from: a */
    private void m9027a(C3112a aVar) {
        if (aVar != null) {
            aVar.mo18712b();
            if (aVar.mo18710a() * this.f7316e.f7324a > this.f7316e.f7325b) {
                m9030c(aVar.mo18711a(false));
                return;
            }
            Message obtainMessage = this.f7314c.obtainMessage();
            obtainMessage.what = 100;
            obtainMessage.obj = aVar;
            this.f7314c.sendMessageDelayed(obtainMessage, (long) this.f7316e.f7324a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9029b(C3112a aVar) {
        if (aVar != null) {
            Context a = C3513m.m10963a();
            if (C3898x.m12780c(a, a.getPackageName())) {
                m9027a(aVar);
            } else {
                m9030c(aVar.mo18711a(true));
            }
        }
    }

    /* renamed from: c */
    private void m9030c(C3112a aVar) {
        if (aVar != null) {
            this.f7315d.execute(aVar);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$a */
    /* compiled from: OpenAppSuccEvent */
    private static class C3112a implements Serializable, Runnable {

        /* renamed from: a */
        public final AtomicInteger f7319a = new AtomicInteger(0);

        /* renamed from: b */
        public final AtomicBoolean f7320b = new AtomicBoolean(false);

        /* renamed from: c */
        public C3431n f7321c;

        /* renamed from: d */
        public String f7322d;

        /* renamed from: e */
        public Map<String, Object> f7323e;

        /* renamed from: a */
        public static C3112a m9032a(C3431n nVar, String str, Map<String, Object> map) {
            return new C3112a(nVar, str, map);
        }

        public C3112a() {
        }

        public C3112a(C3431n nVar, String str, Map<String, Object> map) {
            this.f7321c = nVar;
            this.f7322d = str;
            this.f7323e = map;
        }

        /* renamed from: a */
        public C3112a mo18711a(boolean z) {
            this.f7320b.set(z);
            return this;
        }

        /* renamed from: a */
        public int mo18710a() {
            return this.f7319a.get();
        }

        /* renamed from: b */
        public void mo18712b() {
            this.f7319a.incrementAndGet();
        }

        public void run() {
            if (this.f7321c == null || TextUtils.isEmpty(this.f7322d)) {
                C2905l.m8104a("materialMeta or eventTag is null, pls check");
            } else {
                C3090e.m8924d(C3513m.m10963a(), this.f7321c, this.f7322d, this.f7320b.get() ? "dpl_success" : "dpl_failed", this.f7323e);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$b */
    /* compiled from: OpenAppSuccEvent */
    private static class C3113b {

        /* renamed from: a */
        public int f7324a = 500;

        /* renamed from: b */
        public int f7325b = 5000;

        /* renamed from: a */
        public static C3113b m9036a() {
            return new C3113b();
        }
    }
}
