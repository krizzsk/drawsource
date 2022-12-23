package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4485f0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.cache.g */
public class C4183g {

    /* renamed from: a */
    public long f10284a;

    /* renamed from: b */
    public String f10285b;

    /* renamed from: c */
    public String f10286c;

    /* renamed from: d */
    public String f10287d;

    /* renamed from: a */
    public void mo24172a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f10284a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f10324J;
            if (iAConfigManager.f10356v.f10459b.mo24273a("use_js_inline", false)) {
                Application application = C5292l.f14015a;
                if (application == null) {
                    IAlog.m16450e("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f10284a = System.currentTimeMillis();
                C4485f0 f0Var = new C4485f0(new C4180d(this), application, new C4179c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js"));
                iAConfigManager.f10354t.f11186a.offer(f0Var);
                C4501m0 m0Var = C4501m0.QUEUED;
                f0Var.mo24642a(m0Var);
                C4485f0 f0Var2 = new C4485f0(new C4181e(this), application, new C4179c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css"));
                iAConfigManager.f10354t.f11186a.offer(f0Var2);
                f0Var2.mo24642a(m0Var);
                C4485f0 f0Var3 = new C4485f0(new C4182f(this), application, new C4179c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js"));
                iAConfigManager.f10354t.f11186a.offer(f0Var3);
                f0Var3.mo24642a(m0Var);
            }
        }
    }
}
