package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2735d;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.c */
/* compiled from: NetClient */
public class C2718c extends C2743i {

    /* renamed from: h */
    public C2719d f6050h = new C2719d();

    public C2718c(C2743i.C2744a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C2735d mo17399a() {
        return this.f6050h;
    }

    /* renamed from: a */
    public C2724b mo17398a(C2746k kVar) {
        kVar.mo17504a(this);
        if (kVar == null || kVar.mo17505b() == null || kVar.mo17505b().mo17478a() == null || TextUtils.isEmpty(kVar.mo17505b().mo17478a().toString())) {
            return null;
        }
        C2714a aVar = new C2714a(kVar, this.f6050h);
        this.f6050h.mo17403c().add(aVar);
        return aVar;
    }
}
