package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.p031a.C1586d;
import com.applovin.impl.mediation.p032b.p033a.C1619a;
import com.applovin.impl.mediation.p032b.p033a.C1620b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;

public class MaxAdPlacer implements C1620b.C1621a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f4478a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f4479b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1619a f4480c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1620b f4481d;

    /* renamed from: e */
    private Listener f4482e;
    protected final C2102v logger;
    protected final C1969m sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f4478a = AppLovinSdkUtils.Size.ZERO;
        C1969m mVar = appLovinSdk.coreSdk;
        this.sdk = mVar;
        this.logger = mVar.mo14509A();
        this.f4480c = new C1619a(maxAdPlacerSettings);
        this.f4481d = new C1620b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        C2102v vVar = this.logger;
        vVar.mo15012b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
    }

    /* renamed from: a */
    private void m5168a() {
        int a;
        while (this.f4481d.mo13555b() && (a = this.f4480c.mo13536a()) != -1) {
            C2102v vVar = this.logger;
            vVar.mo15012b("MaxAdPlacer", "Placing ad at position: " + a);
            this.f4480c.mo13538a(this.f4481d.mo13557d(), a);
            Listener listener = this.f4482e;
            if (listener != null) {
                listener.onAdLoaded(a);
            }
        }
    }

    /* renamed from: a */
    private void m5169a(Collection<Integer> collection, Runnable runnable) {
        for (Integer intValue : collection) {
            this.f4481d.mo13553a(this.f4480c.mo13544c(intValue.intValue()));
        }
        runnable.run();
        if (!collection.isEmpty()) {
            C2102v vVar = this.logger;
            vVar.mo15012b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
            if (this.f4482e != null) {
                for (Integer intValue2 : collection) {
                    this.f4482e.onAdRemoved(intValue2.intValue());
                }
            }
        }
    }

    public void clearAds() {
        m5169a(this.f4480c.mo13541b(), new Runnable() {
            public void run() {
                MaxAdPlacer.this.logger.mo15012b("MaxAdPlacer", "Clearing all cached ads");
                MaxAdPlacer.this.f4480c.mo13545c();
                MaxAdPlacer.this.f4481d.mo13558e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> d = this.f4480c.mo13546d(i);
        if (!d.isEmpty()) {
            m5169a(d, new Runnable() {
                public void run() {
                    C2102v vVar = MaxAdPlacer.this.logger;
                    vVar.mo15012b("MaxAdPlacer", "Clearing trailing ads after position " + i);
                    MaxAdPlacer.this.f4480c.mo13539a((Collection<Integer>) d);
                }
            });
        }
        return d;
    }

    public void destroy() {
        this.logger.mo15012b("MaxAdPlacer", "Destroying ad placer");
        clearAds();
        this.f4481d.mo13552a();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return (long) (-System.identityHashCode(this.f4480c.mo13544c(i)));
        }
        return 0;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        if (isFilledPosition(i)) {
            boolean z = this.f4478a != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z ? this.f4478a.getWidth() : 360, i2);
            C1586d dVar = (C1586d) this.f4480c.mo13544c(i);
            if ("small_template_1".equalsIgnoreCase(dVar.mo13418v())) {
                return new AppLovinSdkUtils.Size(min, z ? this.f4478a.getHeight() : 120);
            } else if ("medium_template_1".equalsIgnoreCase(dVar.mo13418v())) {
                return new AppLovinSdkUtils.Size(min, (int) (((double) min) / (z ? ((double) this.f4478a.getWidth()) / ((double) this.f4478a.getHeight()) : 1.2d)));
            } else if (z) {
                return this.f4478a;
            } else {
                if (dVar.mo13397u() != null) {
                    View mainView = dVar.mo13397u().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f4480c.mo13547e(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f4480c.mo13548f(i);
    }

    public int getOriginalPosition(int i) {
        return this.f4480c.mo13549g(i);
    }

    public void insertItem(int i) {
        C2102v vVar = this.logger;
        vVar.mo15012b("MaxAdPlacer", "Inserting item at position: " + i);
        this.f4480c.mo13550h(i);
    }

    public boolean isAdPosition(int i) {
        return this.f4480c.mo13540a(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f4480c.mo13543b(i);
    }

    public void loadAds() {
        this.logger.mo15012b("MaxAdPlacer", "Loading ads");
        this.f4481d.mo13556c();
    }

    public void moveItem(int i, int i2) {
        this.f4480c.mo13542b(i, i2);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f4482e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f4482e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        C2102v vVar = this.logger;
        vVar.mo15016e("MaxAdPlacer", "Native ad failed to load: " + maxError);
    }

    public void onNativeAdLoaded() {
        this.logger.mo15012b("MaxAdPlacer", "Native ad enqueued");
        m5168a();
    }

    public void removeItem(final int i) {
        m5169a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.emptyList(), new Runnable() {
            public void run() {
                C2102v vVar = MaxAdPlacer.this.logger;
                vVar.mo15012b("MaxAdPlacer", "Removing item at position: " + i);
                MaxAdPlacer.this.f4480c.mo13551i(i);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderAd(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.b.a.a r0 = r6.f4480c
            com.applovin.mediation.MaxAd r0 = r0.mo13544c(r7)
            java.lang.String r1 = "MaxAdPlacer"
            if (r0 != 0) goto L_0x0021
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An ad is not available for position: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.mo15012b(r1, r7)
            return
        L_0x0021:
            r2 = r0
            com.applovin.impl.mediation.a.d r2 = (com.applovin.impl.mediation.p031a.C1586d) r2
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = r2.mo13397u()
            if (r2 == 0) goto L_0x0041
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Using pre-rendered ad at position: "
        L_0x0033:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.mo15012b(r1, r7)
            goto L_0x0078
        L_0x0041:
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r2 = r6.f4479b
            java.lang.String r3 = "Unable to render ad at position: "
            if (r2 == 0) goto L_0x00a0
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = new com.applovin.mediation.nativeAds.MaxNativeAdView
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r6.f4479b
            android.content.Context r5 = r8.getContext()
            r2.<init>((com.applovin.mediation.nativeAds.MaxNativeAdViewBinder) r4, (android.content.Context) r5)
            com.applovin.impl.mediation.b.a.b r4 = r6.f4481d
            boolean r0 = r4.mo13554a(r2, r0)
            if (r0 == 0) goto L_0x0064
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Rendered ad at position: "
            goto L_0x0033
        L_0x0064:
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r0.mo15016e(r1, r7)
        L_0x0078:
            int r7 = r8.getChildCount()
        L_0x007c:
            if (r7 < 0) goto L_0x008c
            android.view.View r0 = r8.getChildAt(r7)
            boolean r0 = r0 instanceof com.applovin.mediation.nativeAds.MaxNativeAdView
            if (r0 == 0) goto L_0x0089
            r8.removeViewAt(r7)
        L_0x0089:
            int r7 = r7 + -1
            goto L_0x007c
        L_0x008c:
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L_0x009b
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r2)
        L_0x009b:
            r7 = -1
            r8.addView(r2, r7, r7)
            return
        L_0x00a0:
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r7 = ". If you're using a custom ad template, check that nativeAdViewBinder is set."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.mo15016e(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.renderAd(int, android.view.ViewGroup):void");
    }

    public void setAdSize(int i, int i2) {
        this.f4478a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f4482e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f4479b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f4480c.mo13537a(i, i2);
        if (i != -1 && i2 != -1) {
            m5168a();
        }
    }
}
