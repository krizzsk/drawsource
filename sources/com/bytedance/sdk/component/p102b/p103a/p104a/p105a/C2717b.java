package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import com.bytedance.sdk.component.p102b.p103a.C2740g;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.b */
/* compiled from: NetChain */
public class C2717b implements C2740g.C2741a {

    /* renamed from: a */
    List<C2740g> f6047a;

    /* renamed from: b */
    C2746k f6048b;

    /* renamed from: c */
    int f6049c = 0;

    C2717b(List<C2740g> list, C2746k kVar) {
        this.f6047a = list;
        this.f6048b = kVar;
    }

    /* renamed from: a */
    public C2746k mo17396a() {
        return this.f6048b;
    }

    /* renamed from: a */
    public C2750m mo17397a(C2746k kVar) throws IOException {
        this.f6048b = kVar;
        int i = this.f6049c + 1;
        this.f6049c = i;
        return this.f6047a.get(i).mo17394a(this);
    }
}
