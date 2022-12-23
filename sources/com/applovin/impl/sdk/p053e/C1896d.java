package com.applovin.impl.sdk.p053e;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.d */
public class C1896d extends C1893c {

    /* renamed from: c */
    private final C1834a f3515c;

    /* renamed from: d */
    private boolean f3516d;

    /* renamed from: e */
    private boolean f3517e;

    public C1896d(C1834a aVar, C1969m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, mVar, appLovinAdLoadListener);
        this.f3515c = aVar;
    }

    /* renamed from: j */
    private void m4243j() {
        if (C2102v.m5104a()) {
            mo14365a("Caching HTML resources...");
        }
        this.f3515c.mo14138a(mo14383a(this.f3515c.mo12844b(), this.f3515c.mo14168H(), (C1839e) this.f3515c));
        this.f3515c.mo14191a(true);
        if (C2102v.m5104a()) {
            mo14365a("Finish caching non-video resources for ad #" + this.f3515c.getAdIdNumber());
            C2102v A = this.f3496b.mo14509A();
            String e = mo14371e();
            A.mo15010a(e, "Ad updated with cachedHTML = " + this.f3515c.mo12844b());
        }
    }

    /* renamed from: k */
    private void m4244k() {
        Uri e;
        if (!mo14388b() && (e = mo14392e(this.f3515c.mo14141i())) != null) {
            if (this.f3515c.mo14202aK()) {
                this.f3515c.mo14138a(this.f3515c.mo12844b().replaceFirst(this.f3515c.mo14139e(), e.toString()));
                if (C2102v.m5104a()) {
                    mo14365a("Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f3515c.mo14140g();
            this.f3515c.mo14137a(e);
        }
    }

    /* renamed from: a */
    public void mo14400a(boolean z) {
        this.f3516d = z;
    }

    /* renamed from: b */
    public void mo14401b(boolean z) {
        this.f3517e = z;
    }

    public void run() {
        super.run();
        boolean f = this.f3515c.mo12849f();
        boolean z = this.f3517e;
        if (f || z) {
            if (C2102v.m5104a()) {
                mo14365a("Begin caching for streaming ad #" + this.f3515c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14390c();
            if (f) {
                if (this.f3516d) {
                    mo14395i();
                }
                m4243j();
                if (!this.f3516d) {
                    mo14395i();
                }
                m4244k();
            } else {
                mo14395i();
                m4243j();
            }
        } else {
            if (C2102v.m5104a()) {
                mo14365a("Begin processing for non-streaming ad #" + this.f3515c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14390c();
            m4243j();
            m4244k();
            mo14395i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3515c.getCreatedAtMillis();
        C1879d.m4139a(this.f3515c, this.f3496b);
        C1879d.m4138a(currentTimeMillis, (AppLovinAdBase) this.f3515c, this.f3496b);
        mo14385a((AppLovinAdBase) this.f3515c);
        mo14384a();
    }
}
