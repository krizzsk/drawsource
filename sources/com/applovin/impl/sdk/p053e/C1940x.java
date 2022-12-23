package com.applovin.impl.sdk.p053e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.p028a.C1419e;
import com.applovin.impl.p028a.C1420f;
import com.applovin.impl.p028a.C1427l;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.x */
class C1940x extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1419e f3609a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinAdLoadListener f3610c;

    C1940x(C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskResolveVastWrapper", mVar);
        this.f3610c = appLovinAdLoadListener;
        this.f3609a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4366a(int i) {
        if (C2102v.m5104a()) {
            mo14370d("Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f3610c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        C1427l.m2491a(this.f3609a, this.f3610c, i == -1001 ? C1420f.TIMED_OUT : C1420f.GENERAL_WRAPPER_ERROR, i, this.f3496b);
    }

    public void run() {
        String a = C1427l.m2487a(this.f3609a);
        if (StringUtils.isValidString(a)) {
            if (C2102v.m5104a()) {
                mo14365a("Resolving VAST ad with depth " + this.f3609a.mo12897a() + " at " + a);
            }
            try {
                this.f3496b.mo14526S().mo14428a((C1887a) new C1935u<C2098r>(C2000c.m4627a(this.f3496b).mo14724a(a).mo14730b(ShareTarget.METHOD_GET).mo14723a(C2098r.f4117a).mo14722a(((Integer) this.f3496b.mo14534a(C1867b.f3346en)).intValue()).mo14729b(((Integer) this.f3496b.mo14534a(C1867b.f3347eo)).intValue()).mo14735c(false).mo14728a(), this.f3496b) {
                    /* renamed from: a */
                    public void mo13585a(int i, String str, C2098r rVar) {
                        if (C2102v.m5104a()) {
                            mo14370d("Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        C1940x.this.m4366a(i);
                    }

                    /* renamed from: a */
                    public void mo13587a(C2098r rVar, int i) {
                        this.f3496b.mo14526S().mo14428a((C1887a) C1928r.m4330a(rVar, C1940x.this.f3609a, C1940x.this.f3610c, C1940x.this.f3496b));
                    }
                });
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    mo14366a("Unable to resolve VAST wrapper", th);
                }
            }
        } else {
            if (C2102v.m5104a()) {
                mo14370d("Resolving VAST failed. Could not find resolution URL");
            }
            m4366a(-1);
        }
    }
}
