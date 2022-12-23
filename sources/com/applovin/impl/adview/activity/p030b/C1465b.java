package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.p029a.C1443b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p048a.C1809d;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2046e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.b */
public class C1465b extends C1450a {

    /* renamed from: s */
    private final C1443b f1753s = new C1443b(this.f1709a, this.f1713e, this.f1710b);

    /* renamed from: t */
    private C2046e f1754t;

    /* renamed from: u */
    private long f1755u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AtomicBoolean f1756v = new AtomicBoolean();

    public C1465b(C1839e eVar, Activity activity, C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
    }

    /* renamed from: c */
    private long m2592c() {
        if (!(this.f1709a instanceof C1834a)) {
            return 0;
        }
        float l = ((C1834a) this.f1709a).mo14142l();
        if (l <= 0.0f) {
            l = (float) this.f1709a.mo14235s();
        }
        return (long) (((double) Utils.secondsToMillisLong(l)) * (((double) this.f1709a.mo14178R()) / 100.0d));
    }

    /* renamed from: a */
    public void mo13025a() {
    }

    /* renamed from: a */
    public void mo12982a(long j) {
    }

    /* renamed from: a */
    public void mo12984a(ViewGroup viewGroup) {
        this.f1753s.mo12972a(this.f1715g, this.f1714f, viewGroup);
        mo12989a(false);
        this.f1714f.renderAd(this.f1709a);
        mo12988a("javascript:al_onPoststitialShow();", (long) this.f1709a.mo14179S());
        if (mo13011t()) {
            long c = m2592c();
            this.f1755u = c;
            if (c > 0) {
                if (C2102v.m5104a()) {
                    C2102v vVar = this.f1711c;
                    vVar.mo15012b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f1755u + "ms...");
                }
                this.f1754t = C2046e.m4933a(this.f1755u, this.f1710b, new Runnable() {
                    public void run() {
                        if (C2102v.m5104a()) {
                            C1465b.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        C1465b.this.f1756v.set(true);
                    }
                });
            }
        }
        if (this.f1715g != null) {
            if (this.f1709a.mo14235s() >= 0) {
                mo12985a(this.f1715g, this.f1709a.mo14235s(), new Runnable() {
                    public void run() {
                        C1465b.this.f1717i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1715g.setVisibility(0);
            }
        }
        mo13012u();
        this.f1710b.mo14526S().mo14430a((C1887a) new C1944z(this.f1710b, new Runnable() {
            public void run() {
                if (C1465b.this.f1715g != null) {
                    C1465b.this.f1709a.mo12863o().mo14062a((View) C1465b.this.f1714f, (List<C1809d>) Collections.singletonList(new C1809d(C1465b.this.f1715g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C1465b.this.f1709a.mo12863o().mo14061a((View) C1465b.this.f1714f);
                }
            }
        }), C1918o.C1920a.MAIN, TimeUnit.SECONDS.toMillis(1));
        super.mo12993b(Utils.isVideoMutedInitially(this.f1710b));
    }

    /* renamed from: b */
    public void mo13026b() {
    }

    /* renamed from: d */
    public void mo12995d() {
        mo12984a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12996e() {
    }

    /* renamed from: h */
    public void mo12999h() {
        mo13004m();
        C2046e eVar = this.f1754t;
        if (eVar != null) {
            eVar.mo14894a();
            this.f1754t = null;
        }
        super.mo12999h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13004m() {
        C2046e eVar;
        boolean r = mo13009r();
        int i = 100;
        if (mo13011t()) {
            if (!r && (eVar = this.f1754t) != null) {
                i = (int) Math.min(100.0d, (((double) (this.f1755u - eVar.mo14895b())) / ((double) this.f1755u)) * 100.0d);
            }
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        super.mo12981a(i, false, r, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo13009r() {
        if (mo13011t()) {
            return this.f1756v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo13010s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13012u() {
        long j;
        int l;
        long j2 = 0;
        if (this.f1709a.mo14207ad() >= 0 || this.f1709a.mo14208ae() >= 0) {
            if (this.f1709a.mo14207ad() >= 0) {
                j = this.f1709a.mo14207ad();
            } else {
                if (this.f1709a.mo14209af() && ((l = (int) ((C1834a) this.f1709a).mo14142l()) > 0 || (l = (int) this.f1709a.mo14235s()) > 0)) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) l);
                }
                j = (long) (((double) j2) * (((double) this.f1709a.mo14208ae()) / 100.0d));
            }
            mo12991b(j);
        }
    }
}
