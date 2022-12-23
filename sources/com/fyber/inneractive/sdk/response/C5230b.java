package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.network.C4500m;
import com.fyber.inneractive.sdk.p188dv.C4303e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.response.b */
public abstract class C5230b {

    /* renamed from: a */
    public C5233e f13854a;

    /* renamed from: b */
    public String f13855b;

    /* renamed from: c */
    public C5238j f13856c;

    /* renamed from: d */
    public boolean f13857d = true;

    /* renamed from: a */
    public abstract C5233e mo24319a();

    /* renamed from: a */
    public void mo26310a(C4500m mVar) {
        this.f13854a = mo24319a();
    }

    /* renamed from: a */
    public abstract void mo24320a(String str, C4287y yVar) throws Exception;

    /* renamed from: b */
    public abstract boolean mo24321b();

    /* renamed from: a */
    public C5233e mo26309a(String str) throws Exception {
        this.f13857d = str != null;
        C5233e eVar = this.f13854a;
        eVar.getClass();
        eVar.f13867c = System.currentTimeMillis();
        this.f13856c.mo24158a(this);
        String a = this.f13856c.mo24157a();
        this.f13854a.f13872h = a;
        C4287y b = C4203a.m13186b(this.f13855b);
        IAlog.m16446a("%sGot unit config for unitId: %s from config manager", IAlog.m16443a((Object) this), this.f13855b);
        IAlog.m16446a("%s%s", IAlog.m16443a((Object) this), b);
        if (this.f13857d) {
            mo24320a(str, b);
        } else if (!(this instanceof C4303e)) {
            C5236h hVar = new C5236h(a);
            if (hVar.f13898a) {
                String str2 = hVar.f13899b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                mo24320a(str2, b);
            }
        } else {
            mo24320a(a, b);
        }
        return this.f13854a;
    }
}
