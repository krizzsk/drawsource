package com.ogury.p376cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376cm.internal.aaacb;

/* renamed from: com.ogury.cm.internal.aaaca */
public final class aaaca implements aaacb.aaaaa {

    /* renamed from: a */
    private aaaaa f24233a;

    /* renamed from: b */
    private final aaacb f24234b;

    /* renamed from: com.ogury.cm.internal.aaaca$aaaaa */
    public interface aaaaa<T> {
        /* renamed from: a */
        void mo63802a(int i, String str);
    }

    public aaaca(aaacb aaacb) {
        bbabc.m28052b(aaacb, "tcfConsentDataStorageReader");
        this.f24234b = aaacb;
    }

    /* renamed from: b */
    private final void m27727b() {
        OguryIntegrationLogger.m28105d("[Consent][External] Checking consent data...");
        if (m27728c()) {
            OguryIntegrationLogger.m28105d("[Consent][External][data] Supported consent data");
            if (!m27729d()) {
                aaaaa aaaaa2 = this.f24233a;
                if (aaaaa2 != null) {
                    aaaaa2.mo63802a(this.f24234b.mo63803a(), this.f24234b.mo63807d());
                    return;
                }
                return;
            }
            OguryIntegrationLogger.m28105d("[Consent][External][data] Consent data already known (generated through Ogury CMP)");
            return;
        }
        OguryIntegrationLogger.m28105d("[Consent][External][data] Unsupported consent data");
    }

    /* renamed from: c */
    private final boolean m27728c() {
        int a = this.f24234b.mo63803a();
        boolean b = this.f24234b.mo63805b();
        boolean c = this.f24234b.mo63806c();
        OguryIntegrationLogger.m28105d("[Consent][External][data] Contains consent string: ".concat(String.valueOf(c)));
        OguryIntegrationLogger.m28105d("[Consent][External][data] GDPR applies: ".concat(String.valueOf(b)));
        OguryIntegrationLogger.m28105d("[Consent][External][data] TCF version: ".concat(String.valueOf(a)));
        return a >= 2 && b && c;
    }

    /* renamed from: d */
    private final boolean m27729d() {
        int e = this.f24234b.mo63808e();
        OguryIntegrationLogger.m28105d("[Consent][External][data] CMP SDK ID: ".concat(String.valueOf(e)));
        return this.f24234b.mo63803a() == 2 && e == 45;
    }

    /* renamed from: a */
    public final void mo63800a() {
        OguryIntegrationLogger.m28105d("[Consent][External] Change detected on the TCF consent string");
        m27727b();
    }

    /* renamed from: a */
    public final void mo63801a(aaaaa aaaaa2) {
        bbabc.m28052b(aaaaa2, "tcfConsentStringListener");
        OguryIntegrationLogger.m28105d("[Consent][External] Registering to TCF consent data changes");
        this.f24233a = aaaaa2;
        this.f24234b.mo63804a((aaacb.aaaaa) this);
        OguryIntegrationLogger.m28105d("[Consent][External] Searching for change on TCF consent data...");
        m27727b();
    }
}
