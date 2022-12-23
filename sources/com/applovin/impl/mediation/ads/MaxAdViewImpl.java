package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1584b;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1827aa;
import com.applovin.impl.sdk.C1872d;
import com.applovin.impl.sdk.C1883e;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.C2111z;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2043b;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.C2095q;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

public class MaxAdViewImpl extends C1614a implements C1827aa.C1830a, C1872d.C1874a, C1883e.C1886a {

    /* renamed from: A */
    private boolean f2107A;

    /* renamed from: B */
    private boolean f2108B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2109a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MaxAdView f2110b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f2111c = UUID.randomUUID().toString().toLowerCase(Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f2112d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f2113e = Long.MAX_VALUE;

    /* renamed from: f */
    private C1584b f2114f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f2115g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2116h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f2117i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f2118j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1596a f2119k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1598c f2120l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1872d f2121m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C2111z f2122n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1827aa f2123o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f2124p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1584b f2125q = null;

    /* renamed from: r */
    private boolean f2126r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f2127s;

    /* renamed from: t */
    private boolean f2128t;

    /* renamed from: u */
    private boolean f2129u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f2130v = false;

    /* renamed from: w */
    private boolean f2131w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f2132x;

    /* renamed from: y */
    private boolean f2133y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f2134z;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$a */
    private class C1596a extends C1597b {
        private C1596a() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C2102v.m5104a()) {
                C2102v vVar = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar.mo15012b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            C2053j.m4989a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m3132a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2130v) {
                if (C2102v.m5104a()) {
                    C2102v vVar = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar.mo15012b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo14513E().destroyAd(maxAd);
                return;
            }
            C1584b bVar = (C1584b) maxAd;
            bVar.mo13464d(MaxAdViewImpl.this.f2117i);
            bVar.mo13465e(MaxAdViewImpl.this.f2118j);
            if (bVar.mo13399w() != null) {
                MaxAdViewImpl.this.m3121a(bVar);
                if (bVar.mo13401y()) {
                    long z = bVar.mo13402z();
                    if (C2102v.m5104a()) {
                        C2102v A = MaxAdViewImpl.this.sdk.mo14509A();
                        String str2 = MaxAdViewImpl.this.tag;
                        A.mo15012b(str2, "Scheduling banner ad refresh " + z + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.f2121m.mo14305a(z);
                    if (MaxAdViewImpl.this.f2121m.mo14311f() || MaxAdViewImpl.this.f2127s) {
                        if (C2102v.m5104a()) {
                            MaxAdViewImpl.this.logger.mo15012b(MaxAdViewImpl.this.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f2121m.mo14309d();
                    }
                }
                if (C2102v.m5104a()) {
                    C2102v vVar2 = MaxAdViewImpl.this.logger;
                    String str3 = MaxAdViewImpl.this.tag;
                    vVar2.mo15012b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
                }
                C2053j.m4987a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.mo14513E().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    private abstract class C1597b implements C1614a.C1615a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a */
        private boolean f2142a;

        private C1597b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                C2053j.m5017d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                if ((MaxAdViewImpl.this.f2125q.mo13395A() || MaxAdViewImpl.this.f2134z) && this.f2142a) {
                    this.f2142a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C2053j.m5025h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                C2053j.m4984a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                C2053j.m5009b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                if ((MaxAdViewImpl.this.f2125q.mo13395A() || MaxAdViewImpl.this.f2134z) && !MaxAdViewImpl.this.f2121m.mo14311f()) {
                    this.f2142a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C2053j.m5023g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2125q)) {
                C2053j.m5014c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2053j.m4991a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    private class C1598c extends C1597b {
        private C1598c() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C2102v.m5104a()) {
                C2102v vVar = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar.mo15012b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m3132a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2130v) {
                if (C2102v.m5104a()) {
                    C2102v vVar = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar.mo15012b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo14513E().destroyAd(maxAd);
                return;
            }
            if (C2102v.m5104a()) {
                MaxAdViewImpl.this.logger.mo15012b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.m3131a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, C1969m mVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", mVar);
        if (context != null) {
            this.f2109a = context.getApplicationContext();
            this.f2110b = maxAdView;
            this.f2112d = view;
            this.f2119k = new C1596a();
            this.f2120l = new C1598c();
            this.f2121m = new C1872d(mVar, this);
            this.f2122n = new C2111z(maxAdView, mVar);
            this.f2123o = new C1827aa(maxAdView, mVar, this);
            mVar.mo14510B().mo14359a((C1883e.C1886a) this);
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                String str2 = this.tag;
                vVar.mo15012b(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3118a() {
        C1584b bVar;
        MaxAdView maxAdView = this.f2110b;
        if (maxAdView != null) {
            C2043b.m4919a(maxAdView, this.f2112d);
        }
        this.f2123o.mo14115a();
        synchronized (this.f2124p) {
            bVar = this.f2125q;
        }
        if (bVar != null) {
            this.sdk.mo14513E().destroyAd(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3119a(long j) {
        if (!Utils.bitMaskContainsFlag(j, ((Long) this.sdk.mo14534a(C1866a.f3093y)).longValue()) || this.f2107A) {
            if (C2102v.m5104a()) {
                this.logger.mo15012b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f2126r = false;
            m3137b();
            return;
        }
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            this.logger.mo15012b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f2126r = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3120a(View view, C1584b bVar) {
        int u = bVar.mo13397u();
        int v = bVar.mo13398v();
        int i = -1;
        int dpToPx = u == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), u);
        if (v != -1) {
            i = AppLovinSdkUtils.dpToPx(view.getContext(), v);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, i);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = i;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C2102v.m5104a()) {
                this.logger.mo15012b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + i + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : C2095q.m5078a(this.f2110b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3121a(final C1584b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                */
            public void run() {
                /*
                    r8 = this;
                    com.applovin.impl.mediation.a.b r0 = r2
                    android.view.View r0 = r0.mo13399w()
                    r1 = 0
                    if (r0 != 0) goto L_0x000c
                    java.lang.String r2 = "MaxAdView does not have a loaded ad view"
                    goto L_0x000d
                L_0x000c:
                    r2 = r1
                L_0x000d:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.ads.MaxAdView r3 = r3.f2110b
                    if (r3 != 0) goto L_0x0017
                    java.lang.String r2 = "MaxAdView does not have a parent view"
                L_0x0017:
                    if (r2 == 0) goto L_0x003a
                    boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
                    if (r0 == 0) goto L_0x002a
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r1 = r1.tag
                    r0.mo15016e(r1, r2)
                L_0x002a:
                    com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl
                    r1 = -1
                    r0.<init>(r1, r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdListener r1 = r1.adListener
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.sdk.utils.C2053j.m4983a((com.applovin.mediation.MaxAdListener) r1, (com.applovin.mediation.MaxAd) r2, (com.applovin.mediation.MaxError) r0)
                    return
                L_0x003a:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    r2.m3118a()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r4 = r2
                    r2.mo13522a(r4)
                    com.applovin.impl.mediation.a.b r2 = r2
                    boolean r2 = r2.mo13426G()
                    if (r2 == 0) goto L_0x0059
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.aa r2 = r2.f2123o
                    com.applovin.impl.mediation.a.b r4 = r2
                    r2.mo14116a((com.applovin.impl.mediation.p031a.C1587e) r4)
                L_0x0059:
                    r2 = 393216(0x60000, float:5.51013E-40)
                    r3.setDescendantFocusability(r2)
                    com.applovin.impl.mediation.a.b r2 = r2
                    long r4 = r2.mo13396B()
                    r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 == 0) goto L_0x007e
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2112d
                    com.applovin.impl.mediation.a.b r4 = r2
                    long r4 = r4.mo13396B()
                L_0x0079:
                    int r4 = (int) r4
                L_0x007a:
                    r2.setBackgroundColor(r4)
                    goto L_0x009d
                L_0x007e:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r4 = r2.f2113e
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 == 0) goto L_0x0095
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2112d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r4 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r4 = r4.f2113e
                    goto L_0x0079
                L_0x0095:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2112d
                    r4 = 0
                    goto L_0x007a
                L_0x009d:
                    r3.addView(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r2
                    r2.m3120a((android.view.View) r0, (com.applovin.impl.mediation.p031a.C1584b) r3)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2
                    r0.m3138b((com.applovin.impl.mediation.p031a.C1584b) r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.Object r0 = r0.f2124p
                    monitor-enter(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this     // Catch:{ all -> 0x0132 }
                    com.applovin.impl.mediation.a.b r3 = r2     // Catch:{ all -> 0x0132 }
                    com.applovin.impl.mediation.p031a.C1584b unused = r2.f2125q = r3     // Catch:{ all -> 0x0132 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0132 }
                    boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
                    if (r0 == 0) goto L_0x00d0
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.tag
                    java.lang.String r3 = "Scheduling impression for ad manually..."
                    r0.mo15012b(r2, r3)
                L_0x00d0:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.m r0 = r0.sdk
                    com.applovin.impl.mediation.MediationServiceImpl r0 = r0.mo14513E()
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$a r3 = r3.f2119k
                    r0.processRawAdImpressionPostback(r2, r3)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r0 = r0.f2125q
                    java.lang.String r0 = r0.mo13365f()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.f2116h
                    boolean r0 = r0.equalsIgnoreCase(r2)
                    if (r0 == 0) goto L_0x0123
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r0 = r0.f2115g
                    boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
                    if (r0 == 0) goto L_0x0123
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdReviewListener r0 = r0.adReviewListener
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.f2115g
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r3.f2125q
                    r4 = 1
                    com.applovin.impl.sdk.utils.C2053j.m4993a((com.applovin.mediation.MaxAdReviewListener) r0, (java.lang.String) r2, (com.applovin.mediation.MaxAd) r3, (boolean) r4)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String unused = r0.f2116h = r1
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String unused = r0.f2115g = r1
                L_0x0123:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1 r0 = new com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1
                    r0.<init>()
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r1 = r1.mo13400x()
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r0, r1)
                    return
                L_0x0132:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0132 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.C15932.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3122a(C1584b bVar, long j) {
        if (C2102v.m5104a()) {
            this.logger.mo15012b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.mo14513E().processViewabilityAdImpressionPostback(bVar, j, this.f2119k);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3130a(final C1614a.C1615a aVar) {
        if (!m3144e()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                public void run() {
                    if (MaxAdViewImpl.this.f2125q != null) {
                        long a = MaxAdViewImpl.this.f2122n.mo15033a(MaxAdViewImpl.this.f2125q);
                        MaxAdViewImpl.this.extraParameters.put("visible_ad_ad_unit_id", MaxAdViewImpl.this.f2125q.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f2110b.getContext(), MaxAdViewImpl.this.f2110b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f2110b.getContext(), MaxAdViewImpl.this.f2110b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl.this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(MaxAdViewImpl.this.f2121m.mo14311f() || MaxAdViewImpl.this.f2127s));
                    MaxAdViewImpl.this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(MaxAdViewImpl.this.f2132x));
                    if (C2102v.m5104a()) {
                        C2102v vVar = MaxAdViewImpl.this.logger;
                        String str = MaxAdViewImpl.this.tag;
                        vVar.mo15012b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    MaxAdViewImpl.this.sdk.mo14513E().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.f2111c, MaxAdViewImpl.this.adFormat, MaxAdViewImpl.this.localExtraParameters, MaxAdViewImpl.this.extraParameters, MaxAdViewImpl.this.f2109a, aVar);
                }
            });
        } else if (C2102v.m5104a()) {
            C2102v.m5110i(this.tag, "Failed to load new ad - this instance is already destroyed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3131a(MaxAd maxAd) {
        this.f2129u = false;
        if (this.f2128t) {
            this.f2128t = false;
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                String str = this.tag;
                vVar.mo15012b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2119k.onAdLoaded(maxAd);
            return;
        }
        if (C2102v.m5104a()) {
            this.logger.mo15012b(this.tag, "Saving pre-cache ad...");
        }
        this.f2114f = (C1584b) maxAd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3132a(MaxError maxError) {
        if (this.sdk.mo14567b(C1866a.f3083o).contains(String.valueOf(maxError.getCode()))) {
            if (C2102v.m5104a()) {
                C2102v A = this.sdk.mo14509A();
                String str = this.tag;
                A.mo15012b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f2127s || this.f2121m.mo14311f()) {
            if (this.f2129u) {
                this.logger.mo15012b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                this.f2129u = false;
            }
            if (this.f2128t) {
                this.logger.mo15012b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                C2053j.m4988a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.f2126r = true;
            this.f2129u = false;
            long longValue = ((Long) this.sdk.mo14534a(C1866a.f3082n)).longValue();
            if (longValue >= 0) {
                if (C2102v.m5104a()) {
                    C2102v A2 = this.sdk.mo14509A();
                    String str2 = this.tag;
                    A2.mo15012b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f2121m.mo14305a(longValue);
            }
        }
    }

    /* renamed from: a */
    private void m3133a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                String str3 = this.tag;
                vVar.mo15012b(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f2131w = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar2 = this.logger;
                String str4 = this.tag;
                vVar2.mo15012b(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f2132x = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar3 = this.logger;
                String str5 = this.tag;
                vVar3.mo15012b(str5, "Updated precached disabled to: " + str2);
            }
            this.f2133y = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar4 = this.logger;
                String str6 = this.tag;
                vVar4.mo15012b(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f2134z = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar5 = this.logger;
                String str7 = this.tag;
                vVar5.mo15012b(str7, "Updated force precache to: " + str2);
            }
            this.f2107A = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C2102v.m5104a()) {
                C2102v vVar6 = this.logger;
                String str8 = this.tag;
                vVar6.mo15012b(str8, "Updated is adaptive banner to: " + str2);
            }
            this.f2108B = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* renamed from: b */
    private void m3137b() {
        if (m3143d()) {
            if (C2102v.m5104a()) {
                this.logger.mo15012b(this.tag, "Scheduling refresh precache request now");
            }
            this.f2129u = true;
            this.sdk.mo14526S().mo14429a((C1887a) new C1944z(this.sdk, new Runnable() {
                public void run() {
                    if (C2102v.m5104a()) {
                        MaxAdViewImpl.this.logger.mo15012b(MaxAdViewImpl.this.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.m3130a((C1614a.C1615a) maxAdViewImpl.f2120l);
                }
            }), C1655c.m3369a(this.adFormat));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3138b(C1584b bVar) {
        int height = this.f2110b.getHeight();
        int width = this.f2110b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f2109a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f2109a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.f2108B ? format.getAdaptiveSize(pxToDp2, this.f2109a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (!C2102v.m5104a()) {
                return;
            }
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.f2108B ? "adaptive " : "");
                sb.append("size: ");
                sb.append(width2);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                this.logger.mo15016e("AppLovinSdk", sb.toString());
            }
        }
    }

    /* renamed from: c */
    private void m3140c() {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Rendering for cached ad: " + this.f2114f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f2119k.onAdLoaded(this.f2114f);
        this.f2114f = null;
    }

    /* renamed from: d */
    private boolean m3143d() {
        if (this.f2133y) {
            return false;
        }
        return ((Boolean) this.sdk.mo14534a(C1866a.f3094z)).booleanValue();
    }

    /* renamed from: e */
    private boolean m3144e() {
        boolean z;
        synchronized (this.f2124p) {
            z = this.f2130v;
        }
        return z;
    }

    public void destroy() {
        m3118a();
        if (this.f2114f != null) {
            this.sdk.mo14513E().destroyAd(this.f2114f);
        }
        synchronized (this.f2124p) {
            this.f2130v = true;
        }
        this.f2121m.mo14308c();
        this.sdk.mo14510B().mo14361b((C1883e.C1886a) this);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f2117i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (com.applovin.impl.sdk.C2102v.m5104a() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (com.applovin.impl.sdk.C2102v.m5104a() != false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadAd() {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x002d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r5.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo15012b(r1, r2)
        L_0x002d:
            boolean r0 = r5.f2131w
            r1 = 1
            if (r0 != 0) goto L_0x0045
            com.applovin.impl.sdk.m r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p051c.C1866a.f3089u
            java.lang.Object r0 = r0.mo14534a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            if (r0 == 0) goto L_0x0086
            com.applovin.impl.sdk.d r2 = r5.f2121m
            boolean r2 = r2.mo14311f()
            if (r2 != 0) goto L_0x0086
            com.applovin.impl.sdk.d r2 = r5.f2121m
            boolean r2 = r2.mo14306a()
            if (r2 == 0) goto L_0x0086
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.tag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r1.append(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r3 = r5.f2121m
            long r3 = r3.mo14307b()
            long r2 = r2.toSeconds(r3)
            r1.append(r2)
            java.lang.String r2 = " seconds."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.sdk.C2102v.m5110i(r0, r1)
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto L_0x00be
            com.applovin.impl.mediation.a.b r0 = r5.f2114f
            if (r0 == 0) goto L_0x00a1
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x009d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.String r2 = "Rendering cached ad"
            r0.mo15012b(r1, r2)
        L_0x009d:
            r5.m3140c()
            goto L_0x00d0
        L_0x00a1:
            boolean r0 = r5.f2129u
            if (r0 == 0) goto L_0x00b7
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x00b4
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r2 = r5.tag
            java.lang.String r3 = "Waiting for precache ad to load to render"
            r0.mo15012b(r2, r3)
        L_0x00b4:
            r5.f2128t = r1
            goto L_0x00d0
        L_0x00b7:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x00cb
            goto L_0x00c4
        L_0x00be:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x00cb
        L_0x00c4:
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            r0.mo15012b(r1, r2)
        L_0x00cb:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r5.f2119k
            r5.m3130a((com.applovin.impl.mediation.ads.C1614a.C1615a) r0)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd():void");
    }

    public void onAdRefresh() {
        String str;
        String str2;
        C2102v vVar;
        this.f2128t = false;
        if (this.f2114f != null) {
            m3140c();
            return;
        }
        if (!m3143d()) {
            if (C2102v.m5104a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network...";
            }
            loadAd();
        } else if (this.f2126r) {
            if (C2102v.m5104a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network due to viewability requirements not met for refresh request...";
            }
            loadAd();
        } else {
            if (C2102v.m5104a()) {
                this.logger.mo15016e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f2128t = true;
            return;
        }
        vVar.mo15012b(str2, str);
        loadAd();
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C1584b bVar = this.f2125q;
        if (bVar == null || !bVar.mo13365f().equalsIgnoreCase(str)) {
            C1584b bVar2 = this.f2114f;
            if (bVar2 != null && bVar2.mo13365f().equalsIgnoreCase(str)) {
                this.f2116h = str;
                this.f2115g = str2;
                return;
            }
            return;
        }
        C2053j.m4992a(this.adReviewListener, str2, (MaxAd) this.f2125q);
    }

    public void onLogVisibilityImpression() {
        m3122a(this.f2125q, this.f2122n.mo15033a(this.f2125q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.mo14534a(C1866a.f3087s)).booleanValue() && this.f2121m.mo14306a()) {
            if (C2095q.m5076a(i)) {
                if (C2102v.m5104a()) {
                    this.logger.mo15012b(this.tag, "Ad view visible");
                }
                this.f2121m.mo14313h();
                return;
            }
            if (C2102v.m5104a()) {
                this.logger.mo15012b(this.tag, "Ad view hidden");
            }
            this.f2121m.mo14312g();
        }
    }

    public void setCustomData(String str) {
        if (this.f2125q != null) {
            String str2 = this.tag;
            C2102v.m5110i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f2118j = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m3133a(str, str2);
    }

    public void setPlacement(String str) {
        if (C2102v.m5104a() && this.f2125q != null) {
            String str2 = this.tag;
            C2102v.m5110i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f2117i = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f2113e = (long) i;
    }

    public void startAutoRefresh() {
        String str;
        String str2;
        C2102v vVar;
        this.f2127s = false;
        if (this.f2121m.mo14311f()) {
            this.f2121m.mo14310e();
            if (C2102v.m5104a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Resumed auto-refresh with remaining time: " + this.f2121m.mo14307b() + "ms";
            } else {
                return;
            }
        } else if (C2102v.m5104a()) {
            vVar = this.logger;
            str2 = this.tag;
            str = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        } else {
            return;
        }
        vVar.mo15012b(str2, str);
    }

    public void stopAutoRefresh() {
        if (this.f2125q != null) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                String str = this.tag;
                vVar.mo15012b(str, "Pausing auto-refresh with remaining time: " + this.f2121m.mo14307b() + "ms");
            }
            this.f2121m.mo14309d();
        } else if (this.f2131w || ((Boolean) this.sdk.mo14534a(C1866a.f3089u)).booleanValue()) {
            this.f2127s = true;
        } else if (C2102v.m5104a()) {
            C2102v.m5109h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f2110b ? "this" : this.adListener);
        sb.append(", isDestroyed=");
        sb.append(m3144e());
        sb.append('}');
        return sb.toString();
    }
}
