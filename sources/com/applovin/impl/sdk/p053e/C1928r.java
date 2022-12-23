package com.applovin.impl.sdk.p053e;

import com.applovin.impl.p028a.C1419e;
import com.applovin.impl.p028a.C1420f;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.C2099s;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.r */
public abstract class C1928r extends C1887a {

    /* renamed from: a */
    private final AppLovinAdLoadListener f3588a;

    /* renamed from: c */
    private final C1929a f3589c;

    /* renamed from: com.applovin.impl.sdk.e.r$a */
    private static final class C1929a extends C1419e {
        C1929a(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, C1969m mVar) {
            super(jSONObject, jSONObject2, bVar, mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14447a(C2098r rVar) {
            if (rVar != null) {
                this.f1589a.add(rVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$b */
    private static final class C1930b extends C1928r {

        /* renamed from: a */
        private final String f3590a;

        C1930b(String str, C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f3590a = str;
        }

        public void run() {
            mo14445a(mo14446e(this.f3590a));
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$c */
    private static final class C1931c extends C1928r {

        /* renamed from: a */
        private final JSONObject f3591a;

        C1931c(C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f3591a = eVar.mo12899c();
        }

        public void run() {
            C1420f fVar;
            if (C2102v.m5104a()) {
                mo14365a("Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f3591a, "xml", (String) null);
            if (!StringUtils.isValidString(string)) {
                if (C2102v.m5104a()) {
                    mo14370d("No VAST response received.");
                }
                fVar = C1420f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f3496b.mo14534a(C1867b.f3340eh)).intValue()) {
                mo14445a(mo14446e(string));
                return;
            } else {
                if (C2102v.m5104a()) {
                    mo14370d("VAST response is over max length");
                }
                fVar = C1420f.XML_PARSING;
            }
            mo14444a(fVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$d */
    private static final class C1932d extends C1928r {

        /* renamed from: a */
        private final C2098r f3592a;

        C1932d(C2098r rVar, C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            if (rVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f3592a = rVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            if (C2102v.m5104a()) {
                mo14365a("Processing VAST Wrapper response...");
            }
            mo14445a(this.f3592a);
        }
    }

    C1928r(C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskProcessVastResponse", mVar);
        if (eVar != null) {
            this.f3588a = appLovinAdLoadListener;
            this.f3589c = (C1929a) eVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    /* renamed from: a */
    public static C1928r m4330a(C2098r rVar, C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        return new C1932d(rVar, eVar, appLovinAdLoadListener, mVar);
    }

    /* renamed from: a */
    public static C1928r m4331a(String str, JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        return new C1930b(str, new C1929a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    /* renamed from: a */
    public static C1928r m4332a(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        return new C1931c(new C1929a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14444a(C1420f fVar) {
        if (C2102v.m5104a()) {
            mo14370d("Failed to process VAST response due to VAST error code " + fVar);
        }
        C1427l.m2491a((C1419e) this.f3589c, this.f3588a, fVar, -6, this.f3496b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14445a(C2098r rVar) {
        C1420f fVar;
        C1887a aVar;
        int a = this.f3589c.mo12897a();
        if (C2102v.m5104a()) {
            mo14365a("Finished parsing XML at depth " + a);
        }
        this.f3589c.mo14447a(rVar);
        if (C1427l.m2497a(rVar)) {
            int intValue = ((Integer) this.f3496b.mo14534a(C1867b.f3341ei)).intValue();
            if (a < intValue) {
                if (C2102v.m5104a()) {
                    mo14365a("VAST response is wrapper. Resolving...");
                }
                aVar = new C1940x(this.f3589c, this.f3588a, this.f3496b);
            } else {
                if (C2102v.m5104a()) {
                    mo14370d("Reached beyond max wrapper depth of " + intValue);
                }
                fVar = C1420f.WRAPPER_LIMIT_REACHED;
                mo14444a(fVar);
                return;
            }
        } else if (C1427l.m2500b(rVar)) {
            if (C2102v.m5104a()) {
                mo14365a("VAST response is inline. Rendering ad...");
            }
            aVar = new C1934t(this.f3589c, this.f3588a, this.f3496b);
        } else {
            if (C2102v.m5104a()) {
                mo14370d("VAST response is an error");
            }
            fVar = C1420f.NO_WRAPPER_RESPONSE;
            mo14444a(fVar);
            return;
        }
        this.f3496b.mo14526S().mo14428a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2098r mo14446e(String str) {
        try {
            return C2099s.m5089a(str, this.f3496b);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Failed to process VAST response", th);
            }
            mo14444a(C1420f.XML_PARSING);
            return null;
        }
    }
}
