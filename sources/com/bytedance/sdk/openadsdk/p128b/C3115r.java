package com.bytedance.sdk.openadsdk.p128b;

import com.bytedance.sdk.openadsdk.multipro.p183c.C3952a;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.r */
/* compiled from: StatsDispatcher4MultiProcess */
public class C3115r extends C3086c<C3775c.C3778a> {

    /* renamed from: a */
    private AtomicBoolean f7326a = new AtomicBoolean(false);

    /* renamed from: b */
    private boolean f7327b = true;

    /* renamed from: b */
    public void mo18655b() {
    }

    public C3115r(boolean z) {
        this.f7327b = z;
    }

    /* renamed from: a */
    public void mo18653a() {
        if (!this.f7326a.getAndSet(true)) {
            C3952a.m12975a(this.f7327b);
        }
    }

    /* renamed from: a */
    public void mo18654a(C3775c.C3778a aVar) {
        if (!this.f7326a.get()) {
            mo18653a();
        }
        if (this.f7326a.get()) {
            C3952a.m12973a(aVar.mo20594a(), this.f7327b);
        }
    }
}
