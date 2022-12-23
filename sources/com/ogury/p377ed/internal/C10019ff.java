package com.ogury.p377ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ogury.core.internal.OguryIntegrationLogger;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ff */
public final class C10019ff {

    /* renamed from: a */
    public static final C10020a f25199a = new C10020a((byte) 0);

    /* renamed from: b */
    private final C10025fk f25200b;

    /* renamed from: c */
    private final boolean f25201c;

    /* renamed from: d */
    private JSONObject f25202d;

    /* renamed from: e */
    private String f25203e;

    /* renamed from: f */
    private final String f25204f = this.f25200b.mo64679d();

    /* renamed from: g */
    private final C10028fm f25205g;

    public C10019ff(C10017fd fdVar, C10025fk fkVar, boolean z) {
        C10263mq.m29882b(fdVar, "profigGenerator");
        C10263mq.m29882b(fkVar, "profigDao");
        this.f25200b = fkVar;
        this.f25201c = z;
        this.f25202d = fdVar.mo64649a();
        C10014fb fbVar = C10014fb.f25179a;
        String jSONObject = this.f25202d.toString();
        C10263mq.m29879a((Object) jSONObject, "generatedProfig.toString()");
        this.f25203e = C10014fb.m29008a(jSONObject);
        C10030fo foVar = C10030fo.f25241a;
        this.f25205g = C10030fo.m29117a(this.f25204f);
    }

    /* renamed from: com.ogury.ed.internal.ff$a */
    public static final class C10020a {
        public /* synthetic */ C10020a(byte b) {
            this();
        }

        private C10020a() {
        }
    }

    /* renamed from: b */
    private final boolean m29033b() {
        return this.f25205g != null ? this.f25200b.mo64671a() >= this.f25205g.mo64702d() : this.f25200b.mo64671a() >= 10;
    }

    /* renamed from: c */
    private final boolean m29034c() {
        C10028fm fmVar = this.f25205g;
        if (fmVar == null) {
            return true;
        }
        return fmVar.mo64693a();
    }

    /* renamed from: d */
    private final boolean m29035d() {
        return C10263mq.m29881a((Object) this.f25200b.mo64684g(), (Object) C10061go.m29208a());
    }

    /* renamed from: e */
    private final boolean m29036e() {
        C10028fm fmVar = this.f25205g;
        return this.f25200b.mo64685h() + (fmVar == null ? 0 : fmVar.mo64706e()) > System.currentTimeMillis();
    }

    /* renamed from: a */
    public final C10018fe mo64656a() {
        C10028fm fmVar = this.f25205g;
        long e = fmVar == null ? 43200000 : fmVar.mo64706e();
        boolean c = m29034c();
        boolean z = !c;
        boolean b = m29033b();
        C10263mq.m29874a("api calls reached ", (Object) Boolean.valueOf(b));
        OguryIntegrationLogger.m28105d(C10263mq.m29874a("[Ads][setup] Synchronization is enabled: ", (Object) Boolean.valueOf(c)));
        if (b) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Too many synchronization");
        }
        boolean z2 = true;
        boolean z3 = !m29036e();
        boolean z4 = !m29035d();
        boolean z5 = z && z4;
        if (!c || b || !z3 || (!this.f25201c && !m29037f() && !z4 && !z3)) {
            z2 = false;
        }
        if ((this.f25201c || m29039h()) && !b) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Configuration needs to be synchronized with servers");
            return new C10018fe(true, e, this.f25202d, c, this.f25203e);
        } else if (z2 || z5) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Configuration needs to be synchronized with servers");
            String str = null;
            if (m29037f()) {
                str = this.f25203e;
            }
            return new C10018fe(true, e, m29038g(), c, str);
        } else {
            OguryIntegrationLogger.m28105d("[Ads][setup] Local configuration is up to date");
            return new C10018fe(e, new JSONObject(), c);
        }
    }

    /* renamed from: f */
    private final boolean m29037f() {
        return !C10263mq.m29881a((Object) this.f25200b.mo64675b(), (Object) this.f25203e);
    }

    /* renamed from: g */
    private final JSONObject m29038g() {
        if (this.f25201c || m29037f()) {
            return this.f25202d;
        }
        return new JSONObject();
    }

    /* renamed from: h */
    private final boolean m29039h() {
        return (this.f25204f.length() == 0) || C10263mq.m29881a((Object) this.f25204f, (Object) JsonUtils.EMPTY_JSON);
    }
}
