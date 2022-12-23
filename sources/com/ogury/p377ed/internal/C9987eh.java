package com.ogury.p377ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.eh */
public final class C9987eh implements C9986eg {

    /* renamed from: a */
    private final C10012fa f25119a;

    /* renamed from: b */
    private final C10008ez f25120b;

    /* renamed from: c */
    private final C9998er f25121c;

    /* renamed from: d */
    private final C9928dc f25122d;

    /* renamed from: e */
    private final C10040fx f25123e;

    /* renamed from: f */
    private final C10028fm f25124f;

    /* renamed from: h */
    public final String mo64560h() {
        return "4.2.0";
    }

    public C9987eh(C10012fa faVar, C10008ez ezVar, C10029fn fnVar, C9998er erVar, C9928dc dcVar, C10040fx fxVar) {
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(erVar, "omidSdkChecker");
        C10263mq.m29882b(dcVar, "extraAdConfiguration");
        C10263mq.m29882b(fxVar, "coreWrapper");
        this.f25119a = faVar;
        this.f25120b = ezVar;
        this.f25121c = erVar;
        this.f25122d = dcVar;
        this.f25123e = fxVar;
        C10028fm a = C10029fn.m29114a(faVar.mo64636a());
        if (a != null) {
            this.f25124f = a;
            return;
        }
        throw new IllegalStateException("Profig must not be null");
    }

    /* renamed from: f */
    public final int mo64558f() {
        return this.f25120b.mo64623k();
    }

    /* renamed from: g */
    public final int mo64559g() {
        return this.f25120b.mo64624l();
    }

    /* renamed from: a */
    public final String mo64553a() {
        return this.f25120b.mo64622j();
    }

    /* renamed from: b */
    public final String mo64554b() {
        return this.f25120b.mo64619g();
    }

    /* renamed from: c */
    public final String mo64555c() {
        return this.f25119a.mo64640d();
    }

    /* renamed from: d */
    public final String mo64556d() {
        return this.f25119a.mo64638b();
    }

    /* renamed from: e */
    public final boolean mo64557e() {
        return this.f25124f.mo64701c() && C9998er.m28936a();
    }

    /* renamed from: i */
    public final float mo64561i() {
        return this.f25120b.mo64627o();
    }

    /* renamed from: j */
    public final Boolean mo64562j() {
        return C9928dc.m28655a("IS_CHILD_UNDER_COPPA");
    }

    /* renamed from: k */
    public final Boolean mo64563k() {
        return C9928dc.m28655a("IS_UNDER_AGE_OF_GDPR_CONSENT");
    }

    /* renamed from: l */
    public final String mo64564l() {
        return C9928dc.m28659b("AD_CONTENT_THRESHOLD");
    }

    /* renamed from: m */
    public final String mo64565m() {
        return this.f25123e.mo64733c();
    }

    /* renamed from: n */
    public final String mo64566n() {
        return this.f25119a.mo64645i();
    }
}
