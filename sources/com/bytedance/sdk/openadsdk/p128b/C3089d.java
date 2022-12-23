package com.bytedance.sdk.openadsdk.p128b;

import com.bytedance.sdk.openadsdk.multipro.p183c.C3952a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.d */
/* compiled from: AdEventDispatcher4MultiProcess */
public class C3089d extends C3086c<C3060a> {

    /* renamed from: a */
    private AtomicBoolean f7244a = new AtomicBoolean(false);

    /* renamed from: b */
    public void mo18655b() {
    }

    /* renamed from: a */
    public void mo18653a() {
        if (!this.f7244a.getAndSet(true)) {
            C3952a.m12977c();
        }
    }

    /* renamed from: a */
    public void mo18654a(C3060a aVar) {
        if (!this.f7244a.get()) {
            mo18653a();
        }
        if (this.f7244a.get()) {
            try {
                C3952a.m12972a(aVar.mo18565a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
