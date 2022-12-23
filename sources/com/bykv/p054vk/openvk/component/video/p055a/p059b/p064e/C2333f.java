package com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e;

import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.f */
/* compiled from: VolleyResponseWrapper */
public class C2333f extends C2327a {

    /* renamed from: c */
    private C2750m f4703c;

    public C2333f(C2750m mVar, C2332e eVar) {
        C2736e g;
        this.f4703c = mVar;
        this.f4694a = new ArrayList();
        if (!(mVar == null || (g = mVar.mo17424g()) == null)) {
            for (int i = 0; i < g.mo17475a(); i++) {
                this.f4694a.add(new C2352i.C2354b(g.mo17476a(i), g.mo17477b(i)));
            }
        }
        this.f4695b = eVar;
    }

    /* renamed from: a */
    public int mo15759a() {
        return this.f4703c.mo17419c();
    }

    /* renamed from: b */
    public boolean mo15763b() {
        return this.f4703c.mo17419c() >= 200 && this.f4703c.mo17419c() < 300;
    }

    /* renamed from: a */
    public String mo15762a(String str, String str2) {
        return mo15760a(str) != null ? mo15760a(str).f4766b : str2;
    }

    /* renamed from: c */
    public List<C2352i.C2354b> mo15764c() {
        return this.f4694a;
    }

    /* renamed from: d */
    public InputStream mo15765d() {
        return this.f4703c.mo17423f().mo17429c();
    }

    /* renamed from: e */
    public String mo15766e() {
        C2750m mVar = this.f4703c;
        return (mVar == null || mVar.mo17425h() == null) ? "http/1.1" : this.f4703c.mo17425h().toString();
    }

    /* renamed from: f */
    public String mo15767f() {
        return mo15761a(this.f4703c.mo17419c());
    }
}
