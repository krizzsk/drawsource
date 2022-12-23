package com.bytedance.sdk.component.adexpress.p093b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p093b.C2559i;
import com.bytedance.sdk.component.adexpress.p095d.C2575a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.utils.C2905l;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.o */
/* compiled from: WebViewRenderInterceptor */
public class C2567o implements C2559i {

    /* renamed from: a */
    private Context f5462a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2575a f5463b;

    /* renamed from: c */
    private C2557g f5464c;

    /* renamed from: d */
    private C2563l f5465d;

    /* renamed from: e */
    private ScheduledFuture<?> f5466e;

    /* renamed from: f */
    private AtomicBoolean f5467f = new AtomicBoolean(false);

    public C2567o(Context context, C2563l lVar, C2575a aVar, C2557g gVar) {
        this.f5462a = context;
        this.f5465d = lVar;
        this.f5464c = gVar;
        this.f5463b = aVar;
        aVar.mo16737a(this.f5464c);
    }

    /* renamed from: a */
    public boolean mo16634a(final C2559i.C2560a aVar) {
        int d = this.f5465d.mo16674d();
        if (d < 0) {
            m6606a(aVar, 107);
        } else {
            this.f5466e = C2882e.m8045d().schedule(new C2569a(1, aVar), (long) d, TimeUnit.MILLISECONDS);
            this.f5463b.mo16641a((C2556f) new C2556f() {
                /* renamed from: a */
                public void mo16639a(View view, C2565m mVar) {
                    C2566n b;
                    C2567o.this.m6610e();
                    if (!aVar.mo16668c() && (b = aVar.mo16666b()) != null) {
                        b.mo16730a(C2567o.this.f5463b, mVar);
                        aVar.mo16665a(true);
                    }
                }

                /* renamed from: a */
                public void mo16638a(int i) {
                    C2567o.this.m6606a(aVar, i);
                }
            });
        }
        return true;
    }

    /* renamed from: a */
    public void mo16633a() {
        this.f5463b.mo16741d();
        m6610e();
    }

    /* renamed from: b */
    public void mo16635b() {
        this.f5463b.mo16744h();
    }

    /* renamed from: c */
    public void mo16636c() {
        this.f5463b.mo16745i();
    }

    /* renamed from: d */
    public C2575a mo16732d() {
        return this.f5463b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m6610e() {
        try {
            if (this.f5466e != null && !this.f5466e.isCancelled()) {
                this.f5466e.cancel(false);
                this.f5466e = null;
            }
            C2905l.m8111b("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.b.o$a */
    /* compiled from: WebViewRenderInterceptor */
    private class C2569a implements Runnable {

        /* renamed from: a */
        C2559i.C2560a f5470a;

        /* renamed from: c */
        private int f5472c;

        public C2569a(int i, C2559i.C2560a aVar) {
            this.f5472c = i;
            this.f5470a = aVar;
        }

        public void run() {
            if (this.f5472c == 1) {
                C2905l.m8111b("RenderInterceptor", "WebView Render timeout");
                C2567o.this.f5463b.mo16739a(true);
                C2567o.this.m6606a(this.f5470a, 107);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6606a(C2559i.C2560a aVar, int i) {
        if (!aVar.mo16668c() && !this.f5467f.get()) {
            m6610e();
            this.f5465d.mo16673c().mo16646a(i);
            if (aVar.mo16667b(this)) {
                aVar.mo16663a((C2559i) this);
            } else {
                C2566n b = aVar.mo16666b();
                if (b != null) {
                    b.mo16731a_(i);
                } else {
                    return;
                }
            }
            this.f5467f.getAndSet(true);
        }
    }
}
