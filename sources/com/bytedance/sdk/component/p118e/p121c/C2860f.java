package com.bytedance.sdk.component.p118e.p121c;

import com.bytedance.sdk.component.p102b.p103a.C2740g;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import java.io.IOException;

/* renamed from: com.bytedance.sdk.component.e.c.f */
/* compiled from: TncHostInterceptor */
public class C2860f implements C2740g {

    /* renamed from: a */
    private int f6441a;

    /* renamed from: a */
    public void mo17764a(int i) {
        this.f6441a = i;
    }

    /* renamed from: a */
    public C2750m mo17394a(C2740g.C2741a aVar) throws IOException {
        C2750m mVar;
        C2746k a = aVar.mo17396a();
        if (C2861g.m7987a().mo17766a(this.f6441a).mo17756b() != null) {
            C2861g.m7987a().mo17766a(this.f6441a).mo17756b().mo17730e();
        }
        String fVar = a.mo17505b().toString();
        String a2 = C2861g.m7987a().mo17766a(this.f6441a).mo17750a(fVar);
        if (!fVar.equals(a2)) {
            a = a.mo17510g().mo17516a(a2).mo17519b();
        }
        try {
            mVar = aVar.mo17397a(a);
        } catch (Exception e) {
            C2861g.m7987a().mo17766a(this.f6441a).mo17753a(a, e);
            mVar = null;
        }
        C2861g.m7987a().mo17766a(this.f6441a).mo17752a(a, mVar);
        return mVar == null ? aVar.mo17397a(a) : mVar;
    }
}
