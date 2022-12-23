package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import androidx.browser.customtabs.CustomTabsCallback;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C1047z0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdColonyInterstitialListener f152a;

    /* renamed from: b */
    private C0721f f153b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0761c f154c;

    /* renamed from: d */
    private AdColonyAdOptions f155d;

    /* renamed from: e */
    private C0939p0 f156e;

    /* renamed from: f */
    private int f157f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f158g;

    /* renamed from: h */
    private String f159h;

    /* renamed from: i */
    private final String f160i;

    /* renamed from: j */
    private String f161j;

    /* renamed from: k */
    private String f162k;

    /* renamed from: l */
    private C0722g f163l;

    /* renamed from: m */
    private boolean f164m;

    /* renamed from: n */
    private String f165n;

    /* renamed from: o */
    final C1047z0.C1049b f166o = new C0716a();

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$a */
    class C0716a implements C1047z0.C1049b {

        /* renamed from: a */
        private boolean f167a;

        C0716a() {
        }

        /* renamed from: a */
        public boolean mo10313a() {
            return this.f167a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            r0 = com.adcolony.sdk.C0723a.m193b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (r0.mo10871I() == false) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            r0.mo10877a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r0 = new com.adcolony.sdk.C0826e0.C0827a().mo10746a("Ad show failed due to a native timeout (5000 ms). ");
            r0.mo10746a("Interstitial with adSessionId(" + com.adcolony.sdk.AdColonyInterstitial.m136a(r3.f168b) + "). ").mo10746a("Reloading controller.").mo10747a(com.adcolony.sdk.C0826e0.f462i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (com.adcolony.sdk.C0723a.m196d() != false) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f167a     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                return
            L_0x0007:
                r0 = 1
                r3.f167a = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                boolean r0 = com.adcolony.sdk.C0723a.m196d()
                if (r0 != 0) goto L_0x0012
                return
            L_0x0012:
                com.adcolony.sdk.k r0 = com.adcolony.sdk.C0723a.m193b()
                boolean r1 = r0.mo10871I()
                if (r1 == 0) goto L_0x001f
                r0.mo10877a()
            L_0x001f:
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "Ad show failed due to a native timeout (5000 ms). "
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Interstitial with adSessionId("
                r1.append(r2)
                com.adcolony.sdk.AdColonyInterstitial r2 = com.adcolony.sdk.AdColonyInterstitial.this
                java.lang.String r2 = r2.f158g
                r1.append(r2)
                java.lang.String r2 = "). "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.String r1 = "Reloading controller."
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f462i
                r0.mo10747a((com.adcolony.sdk.C0826e0) r1)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColonyInterstitial.C0716a.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$b */
    class C0717b implements Runnable {
        C0717b() {
        }

        public void run() {
            if (!(C0723a.m186a() instanceof AdColonyInterstitialActivity) && AdColonyInterstitial.this.f152a != null) {
                AdColonyInterstitial.this.f152a.onOpened(AdColonyInterstitial.this);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$c */
    class C0718c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0790d f170a;

        /* renamed from: b */
        final /* synthetic */ String f171b;

        C0718c(C0790d dVar, String str) {
            this.f170a = dVar;
            this.f171b = str;
        }

        public void run() {
            Context a = C0723a.m186a();
            if (a instanceof C0739b) {
                this.f170a.mo10709a(a, C0773c0.m379b(), this.f171b);
            } else {
                if (AdColonyInterstitial.this.f152a != null) {
                    AdColonyInterstitial.this.f152a.onClosed(AdColonyInterstitial.this);
                    AdColonyInterstitial.this.setListener((AdColonyInterstitialListener) null);
                }
                AdColonyInterstitial.this.mo10460o();
                AdColonyInterstitial.this.destroy();
                C0723a.m193b().mo10895e(false);
            }
            if (AdColonyInterstitial.this.f154c != null) {
                this.f170a.mo10711a(AdColonyInterstitial.this.f154c);
                C0761c unused = AdColonyInterstitial.this.f154c = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$d */
    class C0719d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f173a;

        C0719d(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f173a = adColonyInterstitialListener;
        }

        public void run() {
            this.f173a.onRequestNotFilled(AdColony.m82a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$e */
    class C0720e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f175a;

        C0720e(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f175a = adColonyInterstitialListener;
        }

        public void run() {
            this.f175a.onExpiring(AdColonyInterstitial.this);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$f */
    interface C0721f {
        /* renamed from: a */
        void mo10476a();
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$g */
    enum C0722g {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f152a = adColonyInterstitialListener;
        this.f160i = str2;
        this.f158g = str;
        this.f163l = C0722g.REQUESTED;
    }

    /* renamed from: k */
    private boolean m139k() {
        String e = C0723a.m193b().mo10910s().mo10946e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        return viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(e) || viewNetworkPassFilter.equals(TtmlNode.COMBINE_ALL) || (viewNetworkPassFilter.equals(CustomTabsCallback.ONLINE_EXTRAS_KEY) && (e.equals(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI) || e.equals("cell"))) || (viewNetworkPassFilter.equals("offline") && e.equals("none"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10435a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10441c(String str) {
    }

    public boolean cancel() {
        if (this.f154c == null) {
            return false;
        }
        Context a = C0723a.m186a();
        if (a != null && !(a instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "id", this.f154c.mo10625a());
        new C0850h0("AdSession.on_request_close", this.f154c.mo10653k(), b).mo10838c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0761c mo10443d() {
        return this.f154c;
    }

    public boolean destroy() {
        C0723a.m193b().mo10889c().mo10723f().remove(this.f158g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10447e(String str) {
        if (C0723a.m196d()) {
            C0866k b = C0723a.m193b();
            C0790d c = b.mo10889c();
            C1047z0.m1259b((Runnable) new C0717b());
            AdColonyZone adColonyZone = b.mo10865C().get(this.f160i);
            if (adColonyZone != null && adColonyZone.isRewarded()) {
                C0832f1 f1Var = new C0832f1();
                C0773c0.m383b(f1Var, CampaignEx.JSON_KEY_REWARD_AMOUNT, adColonyZone.getRewardAmount());
                C0773c0.m376a(f1Var, CampaignEx.JSON_KEY_REWARD_NAME, adColonyZone.getRewardName());
                C0773c0.m385b(f1Var, "success", true);
                C0773c0.m376a(f1Var, "zone_id", this.f160i);
                b.mo10896e(new C0850h0("AdColony.v4vc_reward", 0, f1Var));
            }
            C1047z0.m1259b((Runnable) new C0718c(c, str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo10448f() {
        return this.f157f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10449g() {
        return this.f162k;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f152a;
    }

    public String getViewNetworkPassFilter() {
        return this.f165n;
    }

    public String getZoneID() {
        return this.f160i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10453h() {
        return this.f164m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10454i() {
        return this.f156e != null;
    }

    public boolean isExpired() {
        C0722g gVar = this.f163l;
        return gVar == C0722g.EXPIRED || gVar == C0722g.SHOWN || gVar == C0722g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo10456j() {
        return this.f163l == C0722g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo10457l() {
        return this.f163l == C0722g.REQUESTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10458m() {
        return this.f163l == C0722g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10459n() {
        C1047z0.m1263c((Runnable) this.f166o);
        Context a = C0723a.m186a();
        if (a == null || !C0723a.m196d() || this.f166o.mo10313a()) {
            return false;
        }
        C0723a.m193b().mo10884a(this.f154c);
        C0723a.m193b().mo10882a(this);
        C1047z0.m1240a(new Intent(a, AdColonyInterstitialActivity.class));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo10460o() {
        C0721f fVar;
        synchronized (this) {
            mo10463r();
            fVar = this.f153b;
            if (fVar != null) {
                this.f153b = null;
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.mo10476a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo10461p() {
        mo10464s();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f152a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C1047z0.m1259b((Runnable) new C0720e(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo10462q() {
        mo10469u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f152a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C1047z0.m1259b((Runnable) new C0719d(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10463r() {
        this.f163l = C0722g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10464s() {
        this.f163l = C0722g.EXPIRED;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f152a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f165n = str;
    }

    public boolean show() {
        boolean z = false;
        if (!C0723a.m196d()) {
            return false;
        }
        C0866k b = C0723a.m193b();
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m376a(b2, "zone_id", this.f160i);
        C0773c0.m383b(b2, "type", 0);
        C0773c0.m376a(b2, "id", this.f158g);
        if (mo10458m()) {
            C0773c0.m383b(b2, "request_fail_reason", 24);
            new C0826e0.C0827a().mo10746a("This ad object has already been shown. Please request a new ad ").mo10746a("via AdColony.requestInterstitial.").mo10747a(C0826e0.f459f);
        } else if (this.f163l == C0722g.EXPIRED) {
            C0773c0.m383b(b2, "request_fail_reason", 17);
            new C0826e0.C0827a().mo10746a("This ad object has expired. Please request a new ad via AdColony").mo10746a(".requestInterstitial.").mo10747a(C0826e0.f459f);
        } else if (b.mo10872J()) {
            C0773c0.m383b(b2, "request_fail_reason", 23);
            new C0826e0.C0827a().mo10746a("Can not show ad while an interstitial is already active.").mo10747a(C0826e0.f459f);
        } else if (mo10436a(b.mo10865C().get(this.f160i))) {
            C0773c0.m383b(b2, "request_fail_reason", 11);
        } else if (!m139k()) {
            C0773c0.m383b(b2, "request_fail_reason", 9);
            new C0826e0.C0827a().mo10746a("Tried to show interstitial ad during unacceptable network conditions.").mo10747a(C0826e0.f459f);
        } else {
            mo10470v();
            C0723a.m193b().mo10895e(true);
            C1047z0.m1244a((Runnable) this.f166o, 5000);
            z = true;
        }
        AdColonyAdOptions adColonyAdOptions = this.f155d;
        if (adColonyAdOptions != null) {
            C0773c0.m385b(b2, "pre_popup", adColonyAdOptions.f111a);
            C0773c0.m385b(b2, "post_popup", this.f155d.f112b);
        }
        AdColonyZone adColonyZone = b.mo10865C().get(this.f160i);
        if (adColonyZone != null && adColonyZone.isRewarded() && b.mo10914w() == null) {
            new C0826e0.C0827a().mo10746a("Rewarded ad: show() called with no reward listener set.").mo10747a(C0826e0.f459f);
        }
        new C0850h0("AdSession.launch_ad_unit", 1, b2).mo10838c();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10468t() {
        this.f163l = C0722g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10469u() {
        this.f163l = C0722g.NOT_FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10470v() {
        this.f163l = C0722g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10437b() {
        return this.f158g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10440c() {
        return this.f161j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10444d(String str) {
        this.f162k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10436a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo10516a() == 0) {
                adColonyZone.mo10518b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo10518b(adColonyZone.mo10516a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10438b(String str) {
        this.f161j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10439b(boolean z) {
        this.f164m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10431a(C0721f fVar) {
        boolean z;
        synchronized (this) {
            if (this.f163l == C0722g.CLOSED) {
                z = true;
            } else {
                this.f153b = fVar;
                z = false;
            }
        }
        if (z) {
            fVar.mo10476a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10433a(C0832f1 f1Var) {
        if (!f1Var.mo10791b()) {
            this.f156e = new C0939p0(f1Var, this.f158g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10432a(C0761c cVar) {
        this.f154c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10430a(AdColonyAdOptions adColonyAdOptions) {
        this.f155d = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10429a(int i) {
        this.f157f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10428a() {
        String str = this.f159h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0939p0 mo10446e() {
        return this.f156e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10434a(String str) {
        this.f159h = str;
    }
}
