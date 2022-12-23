package com.ogury.p377ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.fs */
public final class C10034fs {

    /* renamed from: a */
    private final C10012fa f25254a;

    /* renamed from: b */
    private final C10008ez f25255b;

    /* renamed from: c */
    private final C10040fx f25256c;

    /* renamed from: d */
    private final C9928dc f25257d;

    /* renamed from: e */
    private final boolean f25258e;

    public C10034fs(C10012fa faVar, C10008ez ezVar, C10040fx fxVar, C9928dc dcVar, boolean z) {
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(fxVar, "coreWrapper");
        C10263mq.m29882b(dcVar, "extraAdConfiguration");
        this.f25254a = faVar;
        this.f25255b = ezVar;
        this.f25256c = fxVar;
        this.f25257d = dcVar;
        this.f25258e = z;
    }

    /* renamed from: a */
    public final C10033fr mo64730a() {
        return new C10033fr(this.f25254a.mo64638b(), "4.2.0", this.f25255b.mo64626n(), C10008ez.m28974f(), this.f25258e ? this.f25256c.mo64731a().getId() : null, this.f25256c.mo64733c(), C9928dc.m28655a("IS_CHILD_UNDER_COPPA"), C9928dc.m28655a("IS_UNDER_AGE_OF_GDPR_CONSENT"), C9928dc.m28659b("AD_CONTENT_THRESHOLD"), this.f25256c.mo64734d(), (byte) 0);
    }
}
