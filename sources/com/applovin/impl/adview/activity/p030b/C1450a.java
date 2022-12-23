package com.applovin.impl.adview.activity.p030b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1523d;
import com.applovin.impl.adview.C1535i;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.adview.C1551n;
import com.applovin.impl.adview.activity.C1449b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1950h;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p050b.C1856b;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1937v;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.C2092o;
import com.applovin.impl.sdk.utils.C2095q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.a */
public abstract class C1450a implements C1856b.C1863a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f1707A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ArrayList<Long> f1708B = new ArrayList<>();

    /* renamed from: a */
    protected final C1839e f1709a;

    /* renamed from: b */
    protected final C1969m f1710b;

    /* renamed from: c */
    protected final C2102v f1711c;

    /* renamed from: d */
    protected final C1879d f1712d;

    /* renamed from: e */
    protected Activity f1713e;

    /* renamed from: f */
    protected AppLovinAdView f1714f;

    /* renamed from: g */
    protected final C1550m f1715g;

    /* renamed from: h */
    protected final long f1716h = SystemClock.elapsedRealtime();

    /* renamed from: i */
    protected long f1717i = -1;

    /* renamed from: j */
    protected int f1718j = 0;

    /* renamed from: k */
    protected int f1719k = 0;

    /* renamed from: l */
    protected int f1720l = C1950h.f3632a;

    /* renamed from: m */
    protected boolean f1721m;

    /* renamed from: n */
    protected AppLovinAdClickListener f1722n;

    /* renamed from: o */
    protected AppLovinAdDisplayListener f1723o;

    /* renamed from: p */
    protected AppLovinAdVideoPlaybackListener f1724p;

    /* renamed from: q */
    protected final C1856b f1725q;

    /* renamed from: r */
    protected C2092o f1726r;

    /* renamed from: s */
    private final Handler f1727s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private final C2042a f1728t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final AppLovinBroadcastManager.Receiver f1729u;

    /* renamed from: v */
    private final C1950h.C1952a f1730v;

    /* renamed from: w */
    private final AtomicBoolean f1731w = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final AtomicBoolean f1732x = new AtomicBoolean();

    /* renamed from: y */
    private long f1733y;

    /* renamed from: z */
    private boolean f1734z;

    /* renamed from: com.applovin.impl.adview.activity.b.a$a */
    public interface C1462a {
        /* renamed from: a */
        void mo12789a(C1450a aVar);

        /* renamed from: a */
        void mo12790a(String str, Throwable th);
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$b */
    private class C1463b implements View.OnClickListener, AppLovinAdClickListener {
        private C1463b() {
        }

        public void adClicked(AppLovinAd appLovinAd) {
            if (C2102v.m5104a()) {
                C1450a.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            C2053j.m4997a(C1450a.this.f1722n, appLovinAd);
            C1450a.this.f1712d.mo14327b();
            C1450a.this.f1719k++;
        }

        public void onClick(View view) {
            if (view == C1450a.this.f1715g && ((Boolean) C1450a.this.f1710b.mo14534a(C1867b.f3244cn)).booleanValue()) {
                C1450a.m2551c(C1450a.this);
                if (C1450a.this.f1709a.mo14182V()) {
                    C1450a aVar = C1450a.this;
                    aVar.mo12992b("javascript:al_onCloseButtonTapped(" + C1450a.this.f1707A + "," + C1450a.this.f1718j + "," + C1450a.this.f1719k + ");");
                }
                List<Integer> t = C1450a.this.f1709a.mo14236t();
                if (C2102v.m5104a()) {
                    C2102v vVar = C1450a.this.f1711c;
                    vVar.mo15012b("AppLovinFullscreenActivity", "Handling close button tap " + C1450a.this.f1707A + " with multi close delay: " + t);
                }
                if (t == null || t.size() <= C1450a.this.f1707A) {
                    C1450a.this.mo12999h();
                    return;
                }
                C1450a.this.f1708B.add(Long.valueOf(SystemClock.elapsedRealtime() - C1450a.this.f1717i));
                List<C1535i.C1536a> v = C1450a.this.f1709a.mo14238v();
                if (v != null && v.size() > C1450a.this.f1707A) {
                    C1450a.this.f1715g.mo13210a(v.get(C1450a.this.f1707A));
                }
                if (C2102v.m5104a()) {
                    C2102v vVar2 = C1450a.this.f1711c;
                    vVar2.mo15012b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + t.get(C1450a.this.f1707A));
                }
                C1450a.this.f1715g.setVisibility(8);
                C1450a aVar2 = C1450a.this;
                aVar2.mo12985a(aVar2.f1715g, (long) t.get(C1450a.this.f1707A).intValue(), new Runnable() {
                    public void run() {
                        C1450a.this.f1717i = SystemClock.elapsedRealtime();
                    }
                });
            } else if (C2102v.m5104a()) {
                C2102v vVar3 = C1450a.this.f1711c;
                vVar3.mo15016e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    C1450a(final C1839e eVar, Activity activity, final C1969m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1709a = eVar;
        this.f1710b = mVar;
        this.f1711c = mVar.mo14509A();
        this.f1713e = activity;
        this.f1722n = appLovinAdClickListener;
        this.f1723o = appLovinAdDisplayListener;
        this.f1724p = appLovinAdVideoPlaybackListener;
        C1856b bVar = new C1856b(activity, mVar);
        this.f1725q = bVar;
        bVar.mo14263a((C1856b.C1863a) this);
        this.f1712d = new C1879d(eVar, mVar);
        C1463b bVar2 = new C1463b();
        C1551n nVar = new C1551n(mVar.mo14532Y(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f1714f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f1714f.setAdDisplayListener(new AppLovinAdDisplayListener() {
            public void adDisplayed(AppLovinAd appLovinAd) {
                if (C2102v.m5104a()) {
                    C1450a.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            public void adHidden(AppLovinAd appLovinAd) {
                if (C2102v.m5104a()) {
                    C1450a.this.f1711c.mo15012b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                C1450a.this.mo12999h();
            }
        });
        this.f1714f.getController().mo13104a(this.f1712d);
        mVar.mo14592u().trackImpression(eVar);
        List<Integer> t = eVar.mo14236t();
        if (eVar.mo14235s() >= 0 || t != null) {
            C1550m mVar2 = new C1550m(eVar.mo14237u(), activity);
            this.f1715g = mVar2;
            mVar2.setVisibility(8);
            this.f1715g.setOnClickListener(bVar2);
        } else {
            this.f1715g = null;
        }
        if (((Boolean) mVar.mo14534a(C1867b.f3246cp)).booleanValue()) {
            this.f1729u = new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    mVar.mo14592u().trackAppKilled(eVar);
                    mVar.mo14560aj().unregisterReceiver(this);
                }
            };
        } else {
            this.f1729u = null;
        }
        if (eVar.mo14215al()) {
            this.f1730v = new C1950h.C1952a() {
                /* renamed from: a */
                public void mo13014a(int i) {
                    String str;
                    if (C1450a.this.f1720l != C1950h.f3632a) {
                        C1450a.this.f1721m = true;
                    }
                    C1523d s = C1450a.this.f1714f.getController().mo13129s();
                    if (!C1950h.m4399a(i) || C1950h.m4399a(C1450a.this.f1720l)) {
                        if (i == 2) {
                            str = "javascript:al_muteSwitchOff();";
                        }
                        C1450a.this.f1720l = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.mo13150a(str);
                    C1450a.this.f1720l = i;
                }
            };
        } else {
            this.f1730v = null;
        }
        if (((Boolean) mVar.mo14534a(C1867b.f3311eC)).booleanValue()) {
            this.f1728t = new C2042a() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!C1450a.this.f1732x.get()) {
                        if (activity.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity.getApplicationContext()))) {
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    C2102v.m5110i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    try {
                                        C1450a.this.mo12999h();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }
                }
            };
        } else {
            this.f1728t = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.applovin.impl.adview.activity.b.a] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.applovin.impl.adview.activity.b.b] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.applovin.impl.adview.activity.b.e] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.applovin.impl.adview.activity.b.g] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v33, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.applovin.impl.adview.activity.b.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2549a(com.applovin.impl.sdk.p049ad.C1839e r16, com.applovin.sdk.AppLovinAdClickListener r17, com.applovin.sdk.AppLovinAdDisplayListener r18, com.applovin.sdk.AppLovinAdVideoPlaybackListener r19, com.applovin.impl.sdk.C1969m r20, android.app.Activity r21, com.applovin.impl.adview.activity.p030b.C1450a.C1462a r22) {
        /*
            r8 = r20
            r9 = r22
            boolean r0 = r16.mo14199aH()
            r1 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0016
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkExoPlayerEligibility(r20)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            r11 = r16
            boolean r0 = r11 instanceof com.applovin.impl.p028a.C1411a
            java.lang.String r12 = "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter."
            java.lang.String r13 = "AppLovinFullscreenActivity"
            java.lang.String r14 = " and throwable: "
            if (r0 == 0) goto L_0x00ae
            java.lang.String r15 = "Failed to create FullscreenVastVideoAdPresenter with sdk: "
            if (r1 == 0) goto L_0x007c
            com.applovin.impl.adview.activity.b.c r0 = new com.applovin.impl.adview.activity.b.c     // Catch:{ all -> 0x003a }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003a }
            goto L_0x018c
        L_0x003a:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r1 == 0) goto L_0x0048
            com.applovin.impl.sdk.v r1 = r20.mo14509A()
            r1.mo15011a((java.lang.String) r13, (java.lang.String) r12, (java.lang.Throwable) r0)
        L_0x0048:
            com.applovin.impl.sdk.utils.Utils.isExoPlayerEligible = r10
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x005e }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005e }
            goto L_0x018c
        L_0x005e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        L_0x007c:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x0090 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x018c
        L_0x0090:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        L_0x00ae:
            boolean r0 = r16.hasVideoUrl()
            if (r0 == 0) goto L_0x017a
            boolean r0 = r16.mo14202aK()
            if (r0 == 0) goto L_0x00ee
            com.applovin.impl.adview.activity.b.g r0 = new com.applovin.impl.adview.activity.b.g     // Catch:{ all -> 0x00ce }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ce }
            goto L_0x018c
        L_0x00ce:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenWebVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        L_0x00ee:
            if (r1 == 0) goto L_0x0147
            com.applovin.impl.adview.activity.b.e r0 = new com.applovin.impl.adview.activity.b.e     // Catch:{ all -> 0x0104 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            goto L_0x018c
        L_0x0104:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r1 == 0) goto L_0x0112
            com.applovin.impl.sdk.v r1 = r20.mo14509A()
            r1.mo15011a((java.lang.String) r13, (java.lang.String) r12, (java.lang.Throwable) r0)
        L_0x0112:
            com.applovin.impl.sdk.utils.Utils.isExoPlayerEligible = r10
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0127 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0127 }
            goto L_0x018c
        L_0x0127:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        L_0x0147:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x015a }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x018c
        L_0x015a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        L_0x017a:
            com.applovin.impl.adview.activity.b.b r0 = new com.applovin.impl.adview.activity.b.b     // Catch:{ all -> 0x0193 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0193 }
        L_0x018c:
            r0.mo13031c()
            r9.mo12789a(r0)
            return
        L_0x0193:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenGraphicAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12790a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.p030b.C1450a.m2549a(com.applovin.impl.sdk.ad.e, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.impl.sdk.m, android.app.Activity, com.applovin.impl.adview.activity.b.a$a):void");
    }

    /* renamed from: c */
    static /* synthetic */ int m2551c(C1450a aVar) {
        int i = aVar.f1707A;
        aVar.f1707A = i + 1;
        return i;
    }

    /* renamed from: c */
    private void mo13031c() {
        if (this.f1729u != null) {
            this.f1710b.mo14560aj().registerReceiver(this.f1729u, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.f1730v != null) {
            this.f1710b.mo14559ai().mo14475a(this.f1730v);
        }
        if (this.f1728t != null) {
            this.f1710b.mo14556af().mo14046a(this.f1728t);
        }
    }

    /* renamed from: a */
    public void mo12980a(int i, KeyEvent keyEvent) {
        if (this.f1711c != null && C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15014c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12981a(int i, boolean z, boolean z2, long j) {
        int i2 = i;
        if (this.f1731w.compareAndSet(false, true)) {
            if (this.f1709a.hasVideoUrl() || mo13011t()) {
                C2053j.m5003a(this.f1724p, (AppLovinAd) this.f1709a, (double) i2, z2);
            }
            if (this.f1709a.hasVideoUrl()) {
                this.f1712d.mo14330c((long) i2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1716h;
            this.f1710b.mo14592u().trackVideoEnd(this.f1709a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long j2 = -1;
            if (this.f1717i != -1) {
                j2 = SystemClock.elapsedRealtime() - this.f1717i;
            }
            this.f1710b.mo14592u().trackFullScreenAdClosed(this.f1709a, j2, this.f1708B, j, this.f1721m, this.f1720l);
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1711c;
                vVar.mo15012b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i2 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + j2 + "ms");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo12982a(long j);

    /* renamed from: a */
    public void mo12983a(Configuration configuration) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15014c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* renamed from: a */
    public abstract void mo12984a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12985a(final C1550m mVar, long j, final Runnable runnable) {
        if (j < ((Long) this.f1710b.mo14534a(C1867b.f3243cm)).longValue()) {
            this.f1710b.mo14526S().mo14431a(new C1944z(this.f1710b, new Runnable() {
                public void run() {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            C2095q.m5075a((View) mVar, 400, (Runnable) new Runnable() {
                                public void run() {
                                    mVar.bringToFront();
                                    runnable.run();
                                }
                            });
                        }
                    });
                }
            }), C1918o.C1920a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12986a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f1727s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12987a(String str) {
        if (this.f1709a.mo14183W()) {
            mo12988a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12988a(final String str, long j) {
        if (j >= 0) {
            mo12986a((Runnable) new Runnable() {
                public void run() {
                    C1523d s;
                    if (StringUtils.isValidString(str) && C1450a.this.f1714f != null && (s = C1450a.this.f1714f.getController().mo13129s()) != null) {
                        s.mo13150a(str);
                    }
                }
            }, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12989a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.f1709a, this.f1710b, this.f1713e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f1710b.mo14534a(C1867b.f3315eG)).booleanValue()) {
            this.f1709a.mo12834a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12990a(boolean z, long j) {
        if (this.f1709a.mo14181U()) {
            mo12988a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12991b(long j) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15012b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f1726r = C2092o.m5058a(j, this.f1710b, new Runnable() {
            public void run() {
                if (!C1450a.this.f1709a.mo14210ag().getAndSet(true)) {
                    C1450a.this.f1710b.mo14526S().mo14429a((C1887a) new C1937v(C1450a.this.f1709a, C1450a.this.f1710b), C1918o.C1920a.REWARD);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12992b(String str) {
        mo12988a(str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12993b(boolean z) {
        mo12990a(z, ((Long) this.f1710b.mo14534a(C1867b.f3207cC)).longValue());
        C2053j.m4998a(this.f1723o, (AppLovinAd) this.f1709a);
        this.f1710b.mo14555ae().mo14866a((Object) this.f1709a);
        this.f1710b.mo14561ak().mo14604a((Object) this.f1709a);
        if (this.f1709a.hasVideoUrl() || mo13011t()) {
            C2053j.m5002a(this.f1724p, (AppLovinAd) this.f1709a);
        }
        new C1449b(this.f1713e).mo12979a(this.f1709a);
        this.f1712d.mo14325a();
        this.f1709a.setHasShown(true);
    }

    /* renamed from: c */
    public void mo12994c(boolean z) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1711c;
            vVar.mo15014c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        mo12987a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: d */
    public abstract void mo12995d();

    /* renamed from: e */
    public abstract void mo12996e();

    /* renamed from: f */
    public void mo12997f() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f1712d.mo14332d(SystemClock.elapsedRealtime() - this.f1733y);
        mo12987a("javascript:al_onAppResumed();");
        mo13008q();
        if (this.f1725q.mo14265c()) {
            this.f1725q.mo14261a();
        }
    }

    /* renamed from: g */
    public void mo12998g() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "onPause()");
        }
        this.f1733y = SystemClock.elapsedRealtime();
        mo12987a("javascript:al_onAppPaused();");
        if (this.f1725q.mo14265c()) {
            this.f1725q.mo14261a();
        }
        mo13007p();
    }

    /* renamed from: h */
    public void mo12999h() {
        this.f1734z = true;
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "dismiss()");
        }
        C1839e eVar = this.f1709a;
        if (eVar != null) {
            eVar.mo12863o().mo14070e();
        }
        this.f1727s.removeCallbacksAndMessages((Object) null);
        mo12988a("javascript:al_onPoststitialDismiss();", (long) this.f1709a.mo14180T());
        mo13005n();
        this.f1712d.mo14329c();
        if (this.f1729u != null) {
            C2092o.m5058a(TimeUnit.SECONDS.toMillis(2), this.f1710b, new Runnable() {
                public void run() {
                    C1450a.this.f1713e.stopService(new Intent(C1450a.this.f1713e.getApplicationContext(), AppKilledService.class));
                    C1450a.this.f1710b.mo14560aj().unregisterReceiver(C1450a.this.f1729u);
                }
            });
        }
        if (this.f1730v != null) {
            this.f1710b.mo14559ai().mo14476b(this.f1730v);
        }
        if (this.f1728t != null) {
            this.f1710b.mo14556af().mo14048b(this.f1728t);
        }
        if (mo13006o()) {
            this.f1713e.finish();
            return;
        }
        if (C2102v.m5104a()) {
            this.f1710b.mo14509A().mo15012b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo13002k();
    }

    /* renamed from: i */
    public boolean mo13000i() {
        return this.f1734z;
    }

    /* renamed from: j */
    public void mo13001j() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* renamed from: k */
    public void mo13002k() {
        AppLovinAdView appLovinAdView = this.f1714f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f1714f.destroy();
            this.f1714f = null;
            if ((parent instanceof ViewGroup) && mo13006o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo13004m();
        mo13005n();
        this.f1722n = null;
        this.f1723o = null;
        this.f1724p = null;
        this.f1713e = null;
    }

    /* renamed from: l */
    public void mo13003l() {
        if (C2102v.m5104a()) {
            this.f1711c.mo15014c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f1709a.mo14182V()) {
            mo12992b("javascript:onBackPressed();");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo13004m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo13005n() {
        if (this.f1732x.compareAndSet(false, true)) {
            C2053j.m5010b(this.f1723o, (AppLovinAd) this.f1709a);
            this.f1710b.mo14555ae().mo14869b((Object) this.f1709a);
            this.f1710b.mo14561ak().mo14603a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo13006o() {
        return this.f1713e instanceof AppLovinFullscreenActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo13007p() {
        C2092o oVar = this.f1726r;
        if (oVar != null) {
            oVar.mo14974b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo13008q() {
        C2092o oVar = this.f1726r;
        if (oVar != null) {
            oVar.mo14975c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo13009r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo13010s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo13011t() {
        return AppLovinAdType.INCENTIVIZED == this.f1709a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f1709a.getType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo13012u();
}
