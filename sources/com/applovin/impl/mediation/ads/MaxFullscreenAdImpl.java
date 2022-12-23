package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C1617b;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.sdk.C1847b;
import com.applovin.impl.sdk.C1883e;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends C1614a implements C1847b.C1849a, C1883e.C1886a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1603a f2145a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1847b f2146b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1617b f2147c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f2148d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1585c f2149e = null;

    /* renamed from: f */
    private C1610c f2150f = C1610c.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicBoolean f2151g = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f2152h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f2153i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<Activity> f2154j = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ViewGroup> f2155k = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WeakReference<Lifecycle> f2156l = new WeakReference<>((Object) null);
    protected final C1604b listenerWrapper;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface C1603a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    private class C1604b implements C1614a.C1615a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private C1604b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            C2053j.m5017d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            final boolean e = MaxFullscreenAdImpl.this.f2153i;
            boolean unused = MaxFullscreenAdImpl.this.f2153i = false;
            final C1585c cVar = (C1585c) maxAd;
            final MaxAd maxAd2 = maxAd;
            final MaxError maxError2 = maxError;
            MaxFullscreenAdImpl.this.m3166a(C1610c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3171a(maxAd2);
                    if (e || !cVar.mo13404B() || !MaxFullscreenAdImpl.this.sdk.mo14517I().mo13605a(MaxFullscreenAdImpl.this.adUnitId)) {
                        C2053j.m4984a(MaxFullscreenAdImpl.this.adListener, maxAd2, maxError2, true);
                    } else {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                            public void run() {
                                boolean unused = MaxFullscreenAdImpl.this.f2153i = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f2145a.getActivity());
                            }
                        });
                    }
                }
            });
        }

        public void onAdDisplayed(MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f2153i = false;
            MaxFullscreenAdImpl.this.f2146b.mo14247a();
            C2053j.m5009b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(final MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f2153i = false;
            MaxFullscreenAdImpl.this.f2147c.mo13532a(maxAd);
            MaxFullscreenAdImpl.this.m3166a(C1610c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3171a(maxAd);
                    C2053j.m5014c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.m3177b();
            MaxFullscreenAdImpl.this.m3166a(C1610c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    C2053j.m4989a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m3165a((C1585c) maxAd);
            if (MaxFullscreenAdImpl.this.f2151g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.m3166a(C1610c.READY, (Runnable) new Runnable() {
                    public void run() {
                        if (MaxFullscreenAdImpl.this.f2153i) {
                            Activity activity = (Activity) MaxFullscreenAdImpl.this.f2154j.get();
                            if (activity == null) {
                                activity = MaxFullscreenAdImpl.this.sdk.mo14564an();
                            }
                            Activity activity2 = activity;
                            if (MaxFullscreenAdImpl.this.f2152h) {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f2149e.getPlacement(), MaxFullscreenAdImpl.this.f2149e.mo13445Z(), (ViewGroup) MaxFullscreenAdImpl.this.f2155k.get(), (Lifecycle) MaxFullscreenAdImpl.this.f2156l.get(), activity2);
                            } else {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f2149e.getPlacement(), MaxFullscreenAdImpl.this.f2149e.mo13445Z(), activity2);
                            }
                        } else {
                            C2053j.m4987a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                        }
                    }
                });
            }
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2053j.m4990a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C2053j.m5021f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C2053j.m5019e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C2053j.m4986a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum C1610c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, C1603a aVar, String str2, C1969m mVar) {
        super(str, maxAdFormat, str2, mVar);
        this.f2145a = aVar;
        this.listenerWrapper = new C1604b();
        this.f2146b = new C1847b(mVar, this);
        this.f2147c = new C1617b(mVar, this.listenerWrapper);
        mVar.mo14510B().mo14359a((C1883e.C1886a) this);
        if (C2102v.m5104a()) {
            C2102v.m5107f(str2, "Created new " + str2 + " (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m3164a() {
        C1585c cVar;
        synchronized (this.f2148d) {
            cVar = this.f2149e;
            this.f2149e = null;
        }
        this.sdk.mo14513E().destroyAd(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3165a(C1585c cVar) {
        long u = cVar.mo13397u() - (SystemClock.elapsedRealtime() - cVar.mo13390q());
        if (u > TimeUnit.SECONDS.toMillis(2)) {
            this.f2149e = cVar;
            if (C2102v.m5104a()) {
                C2102v vVar = this.logger;
                String str = this.tag;
                vVar.mo15012b(str, "Handle ad loaded for regular ad: " + cVar);
                C2102v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo15012b(str2, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u) + " seconds from now for " + getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2146b.mo14248a(u);
            return;
        }
        if (C2102v.m5104a()) {
            this.logger.mo15012b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3166a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = r6.f2150f
            java.lang.Object r1 = r6.f2148d
            monitor-enter(r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.IDLE     // Catch:{ all -> 0x01de }
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0045
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0011
            goto L_0x017b
        L_0x0011:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0017
            goto L_0x017b
        L_0x0017:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0026
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "No ad is loading or loaded"
            goto L_0x005d
        L_0x0026:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
        L_0x0041:
            r0.mo15016e(r2, r3)     // Catch:{ all -> 0x01de }
            goto L_0x0060
        L_0x0045:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.LOADING     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x009a
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x004f
            goto L_0x017b
        L_0x004f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0063
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is already loading"
        L_0x005d:
            com.applovin.impl.sdk.C2102v.m5110i(r0, r2)     // Catch:{ all -> 0x01de }
        L_0x0060:
            r3 = r4
            goto L_0x017b
        L_0x0063:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0069
            goto L_0x017b
        L_0x0069:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0078
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is not ready to be shown yet"
            goto L_0x005d
        L_0x0078:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x007e
            goto L_0x017b
        L_0x007e:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x009a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.READY     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x00ee
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00a4
            goto L_0x017b
        L_0x00a4:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00b3
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is already loaded"
            goto L_0x005d
        L_0x00b3:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00c5
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r3 = "An ad is already marked as ready"
            goto L_0x0041
        L_0x00c5:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00cb
            goto L_0x017b
        L_0x00cb:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00d1
            goto L_0x017b
        L_0x00d1:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x00ee:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.SHOWING     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x014c
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00f8
            goto L_0x017b
        L_0x00f8:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0108
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Can not load another ad while the ad is showing"
            goto L_0x005d
        L_0x0108:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x011a
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r3 = "An ad is already showing, ignoring"
            goto L_0x0041
        L_0x011a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x012a
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "The ad is already showing, not showing another one"
            goto L_0x005d
        L_0x012a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x012f
            goto L_0x017b
        L_0x012f:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x014c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1610c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x015c
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "No operations are allowed on a destroyed instance"
            goto L_0x005d
        L_0x015c:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unknown state: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2150f     // Catch:{ all -> 0x01de }
            r3.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x017b:
            if (r3 == 0) goto L_0x01ad
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01aa
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r4.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Transitioning from "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2150f     // Catch:{ all -> 0x01de }
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            r4.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01de }
            r0.mo15012b(r2, r4)     // Catch:{ all -> 0x01de }
        L_0x01aa:
            r6.f2150f = r7     // Catch:{ all -> 0x01de }
            goto L_0x01d5
        L_0x01ad:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01d5
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r4.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Not allowed transition from "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2150f     // Catch:{ all -> 0x01de }
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            r4.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x01de }
            r0.mo15015d(r2, r7)     // Catch:{ all -> 0x01de }
        L_0x01d5:
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            if (r3 == 0) goto L_0x01dd
            if (r8 == 0) goto L_0x01dd
            r8.run()
        L_0x01dd:
            return
        L_0x01de:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.m3166a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3171a(MaxAd maxAd) {
        this.f2146b.mo14247a();
        m3164a();
        this.sdk.mo14514F().mo15019b((C1583a) maxAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3172a(String str, String str2) {
        this.f2147c.mo13533b(this.f2149e);
        this.f2149e.mo13464d(str);
        this.f2149e.mo13465e(str2);
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str3 = this.tag;
            vVar.mo15012b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f2149e + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo13522a(this.f2149e);
    }

    /* renamed from: a */
    private boolean m3173a(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        } else if (!isReady()) {
            String str = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            if (C2102v.m5104a()) {
                C2102v.m5110i(this.tag, str);
            }
            C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-24, str), true);
            return false;
        } else {
            if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0 && this.sdk.mo14586p().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (Utils.isPubInDebugMode(activity, this.sdk)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                } else if (((Boolean) this.sdk.mo14534a(C1866a.f3066T)).booleanValue()) {
                    if (C2102v.m5104a()) {
                        C2102v.m5110i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    }
                    C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.mo14534a(C1866a.f3047A)).booleanValue() && (this.sdk.mo14555ae().mo14868a() || this.sdk.mo14555ae().mo14870b())) {
                if (C2102v.m5104a()) {
                    C2102v.m5110i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                }
                C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (!((Boolean) this.sdk.mo14534a(C1866a.f3048B)).booleanValue() || C2050h.m4957a((Context) activity)) {
                String str2 = this.sdk.mo14586p().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
                if ((!(StringUtils.isValidString(str2) && Boolean.valueOf(str2).booleanValue()) && !((Boolean) this.sdk.mo14534a(C1866a.f3049C)).booleanValue()) || !activity.isFinishing()) {
                    return true;
                }
                if (C2102v.m5104a()) {
                    C2102v.m5110i(this.tag, "Attempting to show ad when activity is finishing");
                }
                C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                return false;
            } else {
                if (C2102v.m5104a()) {
                    C2102v.m5110i(this.tag, "Attempting to show ad with no internet connection");
                }
                C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3177b() {
        C1585c cVar;
        if (this.f2151g.compareAndSet(true, false)) {
            synchronized (this.f2148d) {
                cVar = this.f2149e;
                this.f2149e = null;
            }
            this.sdk.mo14513E().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void destroy() {
        m3166a(C1610c.DESTROYED, (Runnable) new Runnable() {
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f2148d) {
                    if (MaxFullscreenAdImpl.this.f2149e != null) {
                        if (C2102v.m5104a()) {
                            C2102v vVar = MaxFullscreenAdImpl.this.logger;
                            String str = MaxFullscreenAdImpl.this.tag;
                            vVar.mo15012b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f2149e + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        MaxFullscreenAdImpl.this.sdk.mo14513E().destroyAd(MaxFullscreenAdImpl.this.f2149e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.mo14510B().mo14361b((C1883e.C1886a) MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f2148d) {
            z = this.f2149e != null && this.f2149e.mo13364e() && this.f2150f == C1610c.READY;
        }
        return z;
    }

    public void loadAd(final Activity activity) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            if (C2102v.m5104a()) {
                C2102v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo15012b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            C2053j.m4987a(this.adListener, (MaxAd) this.f2149e, true);
            return;
        }
        m3166a(C1610c.LOADING, (Runnable) new Runnable() {
            public void run() {
                Context context = activity;
                if (context == null) {
                    context = MaxFullscreenAdImpl.this.sdk.mo14564an() != null ? MaxFullscreenAdImpl.this.sdk.mo14564an() : MaxFullscreenAdImpl.this.sdk.mo14520L();
                }
                MaxFullscreenAdImpl.this.sdk.mo14513E().loadAd(MaxFullscreenAdImpl.this.adUnitId, (String) null, MaxFullscreenAdImpl.this.adFormat, MaxFullscreenAdImpl.this.localExtraParameters, MaxFullscreenAdImpl.this.extraParameters, context, MaxFullscreenAdImpl.this.listenerWrapper);
            }
        });
    }

    public void onAdExpired() {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Ad expired " + getAdUnitId());
        }
        this.f2151g.set(true);
        Activity activity = this.f2145a.getActivity();
        if (activity == null && (activity = this.sdk.mo14556af().mo14045a()) == null) {
            m3177b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.mo14513E().loadAd(this.adUnitId, (String) null, this.adFormat, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C1585c cVar = this.f2149e;
        if (cVar != null && cVar.mo13365f().equalsIgnoreCase(str)) {
            C2053j.m4992a(this.adReviewListener, str2, (MaxAd) this.f2149e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        if (activity == null) {
            activity = this.sdk.mo14564an();
        }
        if (m3173a(activity)) {
            m3166a(C1610c.SHOWING, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3172a(str, str2);
                    boolean unused = MaxFullscreenAdImpl.this.f2152h = false;
                    WeakReference unused2 = MaxFullscreenAdImpl.this.f2154j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.mo14513E().showFullscreenAd(MaxFullscreenAdImpl.this.f2149e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        if (viewGroup == null || lifecycle == null) {
            if (C2102v.m5104a()) {
                C2102v.m5110i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            }
            C2053j.m4984a(this.adListener, (MaxAd) this.f2149e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.mo14564an();
        }
        final Activity activity2 = activity;
        if (m3173a(activity2)) {
            final String str3 = str;
            final String str4 = str2;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            m3166a(C1610c.SHOWING, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3172a(str3, str4);
                    boolean unused = MaxFullscreenAdImpl.this.f2152h = true;
                    WeakReference unused2 = MaxFullscreenAdImpl.this.f2154j = new WeakReference(activity2);
                    WeakReference unused3 = MaxFullscreenAdImpl.this.f2155k = new WeakReference(viewGroup2);
                    WeakReference unused4 = MaxFullscreenAdImpl.this.f2156l = new WeakReference(lifecycle2);
                    MaxFullscreenAdImpl.this.sdk.mo14513E().showFullscreenAd(MaxFullscreenAdImpl.this.f2149e, viewGroup2, lifecycle2, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f2145a ? "this" : this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
