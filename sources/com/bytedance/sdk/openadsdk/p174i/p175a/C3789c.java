package com.bytedance.sdk.openadsdk.p174i.p175a;

import com.bytedance.sdk.component.p108d.C2825g;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.p149e.C3435q;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3784a;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.c */
/* compiled from: SplashGifLoader */
public class C3789c extends C3784a {

    /* renamed from: a */
    public static volatile int f9760a;

    /* renamed from: b */
    private C3435q f9761b;

    /* renamed from: a */
    private void m12373a(C2828j jVar) {
        C2825g e = jVar.mo17650e();
        if (e != null && m12375c()) {
            if (jVar.mo17649d()) {
                C2905l.m8111b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f9760a = 1;
                m12374a(true);
            } else {
                C2905l.m8111b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f9760a = 2;
                m12374a(false);
            }
            m12372a(e.mo17543a());
        }
    }

    /* renamed from: c */
    private boolean m12375c() {
        C3435q qVar = this.f9761b;
        return qVar != null && qVar.mo19691c();
    }

    /* renamed from: a */
    private void m12372a(long j) {
        this.f9761b.mo19692d(j);
        C3435q qVar = this.f9761b;
        qVar.mo19689b(j - qVar.mo19688b());
    }

    /* renamed from: a */
    private void m12374a(boolean z) {
        if (m12375c()) {
            this.f9761b.mo19687a(z);
        }
    }

    /* renamed from: d */
    private void m12376d() {
        if (m12375c()) {
            long currentTimeMillis = System.currentTimeMillis();
            C3435q qVar = this.f9761b;
            qVar.mo19686a(currentTimeMillis - qVar.mo19685a());
            this.f9761b.mo19690c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20599a(C2828j jVar, C3784a.C3787b bVar) {
        m12373a(jVar);
        super.mo20599a(jVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20597a() {
        m12376d();
    }
}
