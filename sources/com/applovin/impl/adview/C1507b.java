package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2043b;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.C2088k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.adview.b */
public class C1507b implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private volatile AppLovinAdClickListener f1858A;

    /* renamed from: B */
    private volatile C1533g f1859B = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1860a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewGroup f1861b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1969m f1862c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinAdServiceImpl f1863d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2102v f1864e;

    /* renamed from: f */
    private AppLovinCommunicator f1865f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AppLovinAdSize f1866g;

    /* renamed from: h */
    private String f1867h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1879d f1868i;

    /* renamed from: j */
    private C1529e f1869j;

    /* renamed from: k */
    private C1521c f1870k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1523d f1871l;

    /* renamed from: m */
    private Runnable f1872m;

    /* renamed from: n */
    private Runnable f1873n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C1839e f1874o = null;

    /* renamed from: p */
    private volatile AppLovinAd f1875p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1542l f1876q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1542l f1877r = null;

    /* renamed from: s */
    private final AtomicReference<AppLovinAd> f1878s = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicBoolean f1879t = new AtomicBoolean();

    /* renamed from: u */
    private volatile boolean f1880u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile boolean f1881v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile boolean f1882w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile AppLovinAdLoadListener f1883x;

    /* renamed from: y */
    private volatile AppLovinAdDisplayListener f1884y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public volatile AppLovinAdViewEventListener f1885z;

    /* renamed from: com.applovin.impl.adview.b$a */
    private class C1519a implements Runnable {
        private C1519a() {
        }

        public void run() {
            if (C1507b.this.f1871l != null) {
                C1507b.this.f1871l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b */
    private class C1520b implements Runnable {
        private C1520b() {
        }

        public void run() {
            if (C1507b.this.f1874o == null) {
                return;
            }
            if (C1507b.this.f1871l != null) {
                C1507b.this.m2791x();
                if (C2102v.m5104a()) {
                    C2102v c = C1507b.this.f1864e;
                    c.mo15012b("AppLovinAdView", "Rendering advertisement ad for #" + C1507b.this.f1874o.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C1507b.m2770b((View) C1507b.this.f1871l, C1507b.this.f1874o.getSize());
                C1507b.this.f1871l.mo13149a(C1507b.this.f1874o);
                if (C1507b.this.f1874o.getSize() != AppLovinAdSize.INTERSTITIAL && !C1507b.this.f1881v) {
                    C1879d unused = C1507b.this.f1868i = new C1879d(C1507b.this.f1874o, C1507b.this.f1862c);
                    C1507b.this.f1868i.mo14325a();
                    C1507b.this.f1871l.setStatsManagerHelper(C1507b.this.f1868i);
                    C1507b.this.f1874o.setHasShown(true);
                }
                if (C1507b.this.f1871l.getStatsManagerHelper() != null) {
                    C1507b.this.f1871l.getStatsManagerHelper().mo14326a(C1507b.this.f1874o.mo14242z() ? 0 : 1);
                    return;
                }
                return;
            }
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinAdView", "Unable to render advertisement for ad #" + C1507b.this.f1874o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
            }
            C2053j.m4979a(C1507b.this.f1885z, (AppLovinAd) C1507b.this.f1874o, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
        }
    }

    /* renamed from: com.applovin.impl.adview.b$c */
    static class C1521c implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C1507b f1904a;

        C1521c(C1507b bVar, C1969m mVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            } else if (mVar != null) {
                this.f1904a = bVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private C1507b m2826a() {
            return this.f1904a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            C1507b a = m2826a();
            if (a != null) {
                a.mo13112b(appLovinAd);
            } else if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i) {
            C1507b a = m2826a();
            if (a != null) {
                a.mo13097a(i);
            }
        }
    }

    /* renamed from: a */
    private void m2766a(AppLovinAdView appLovinAdView, C1969m mVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (appLovinAdSize != null) {
            this.f1862c = mVar;
            this.f1863d = mVar.mo14592u();
            this.f1864e = mVar.mo14509A();
            this.f1865f = AppLovinCommunicator.getInstance(context);
            this.f1866g = appLovinAdSize;
            this.f1867h = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f1860a = context;
            this.f1861b = appLovinAdView;
            this.f1869j = new C1529e(this, mVar);
            this.f1873n = new C1519a();
            this.f1872m = new C1520b();
            this.f1870k = new C1521c(this, mVar);
            mo13110a(appLovinAdSize);
        } else {
            throw new IllegalArgumentException("No ad size specified");
        }
    }

    /* renamed from: a */
    private void m2767a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m2770b(View view, AppLovinAdSize appLovinAdSize) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i = -1;
            int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getWidth(), displayMetrics);
            if (!appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
                i = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getHeight(), displayMetrics);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = applyDimension;
            layoutParams.height = i;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    private void m2787t() {
        C2102v vVar;
        if (C2102v.m5104a() && (vVar = this.f1864e) != null) {
            vVar.mo15012b("AppLovinAdView", "Destroying...");
        }
        C1523d dVar = this.f1871l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1871l);
            }
            this.f1871l.removeAllViews();
            this.f1871l.loadUrl("about:blank");
            this.f1871l.onPause();
            this.f1871l.destroyDrawingCache();
            this.f1871l.destroy();
            this.f1871l = null;
        }
        this.f1883x = null;
        this.f1884y = null;
        this.f1858A = null;
        this.f1885z = null;
        this.f1881v = true;
    }

    /* renamed from: u */
    private void m2788u() {
        m2767a((Runnable) new Runnable() {
            public void run() {
                if (C1507b.this.f1876q != null) {
                    if (C2102v.m5104a()) {
                        C2102v c = C1507b.this.f1864e;
                        c.mo15012b("AppLovinAdView", "Detaching expanded ad: " + C1507b.this.f1876q.mo13195a());
                    }
                    C1507b bVar = C1507b.this;
                    C1542l unused = bVar.f1877r = bVar.f1876q;
                    C1542l unused2 = C1507b.this.f1876q = null;
                    C1507b bVar2 = C1507b.this;
                    bVar2.mo13110a(bVar2.f1866g);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m2789v() {
        m2767a((Runnable) new Runnable() {
            public void run() {
                C1834a aVar;
                if (C1507b.this.f1877r != null || C1507b.this.f1876q != null) {
                    if (C1507b.this.f1877r != null) {
                        aVar = C1507b.this.f1877r.mo13195a();
                        C1507b.this.f1877r.dismiss();
                        C1542l unused = C1507b.this.f1877r = null;
                    } else {
                        aVar = C1507b.this.f1876q.mo13195a();
                        C1507b.this.f1876q.dismiss();
                        C1542l unused2 = C1507b.this.f1876q = null;
                    }
                    C2053j.m5007b(C1507b.this.f1885z, (AppLovinAd) aVar, (AppLovinAdView) C1507b.this.f1861b);
                }
            }
        });
    }

    /* renamed from: w */
    private void m2790w() {
        C1879d dVar = this.f1868i;
        if (dVar != null) {
            dVar.mo14329c();
            this.f1868i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m2791x() {
        if (C2102v.m5104a()) {
            C1839e eVar = this.f1874o;
            C2088k kVar = new C2088k();
            kVar.mo14935a().mo14939a(eVar).mo14937a(mo13128r());
            if (!Utils.isBML(eVar.getSize())) {
                kVar.mo14935a().mo14941a("Fullscreen Ad Properties").mo14944b(eVar);
            }
            kVar.mo14940a(this.f1862c);
            kVar.mo14935a();
            this.f1864e.mo15012b("AppLovinAdView", kVar.toString());
        }
    }

    /* renamed from: a */
    public void mo13096a() {
        if (this.f1862c != null && this.f1870k != null && this.f1860a != null && this.f1880u) {
            this.f1863d.loadNextAd(this.f1867h, this.f1866g, this.f1870k);
        } else if (C2102v.m5104a()) {
            C2102v.m5108g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13097a(final int i) {
        if (!this.f1881v) {
            m2767a(this.f1873n);
        }
        m2767a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (C1507b.this.f1883x != null) {
                        C1507b.this.f1883x.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v.m5106c("AppLovinAdView", "Exception while running app load  callback", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo13098a(final PointF pointF) {
        m2767a((Runnable) new Runnable() {
            public void run() {
                if (C1507b.this.f1876q == null && (C1507b.this.f1874o instanceof C1834a) && C1507b.this.f1871l != null) {
                    C1834a aVar = (C1834a) C1507b.this.f1874o;
                    Activity retrieveParentActivity = C1507b.this.f1860a instanceof Activity ? (Activity) C1507b.this.f1860a : Utils.retrieveParentActivity(C1507b.this.f1871l, C1507b.this.f1862c);
                    if (retrieveParentActivity != null) {
                        if (C1507b.this.f1861b != null) {
                            C1507b.this.f1861b.removeView(C1507b.this.f1871l);
                        }
                        C1542l unused = C1507b.this.f1876q = new C1542l(aVar, C1507b.this.f1871l, retrieveParentActivity, C1507b.this.f1862c);
                        C1507b.this.f1876q.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            public void onDismiss(DialogInterface dialogInterface) {
                                C1507b.this.mo13121k();
                            }
                        });
                        C1507b.this.f1876q.show();
                        C2053j.m4978a(C1507b.this.f1885z, (AppLovinAd) C1507b.this.f1874o, (AppLovinAdView) C1507b.this.f1861b);
                        if (C1507b.this.f1868i != null) {
                            C1507b.this.f1868i.mo14331d();
                        }
                        if (C1507b.this.f1874o.isOpenMeasurementEnabled()) {
                            C1507b.this.f1874o.mo12863o().mo14061a((View) C1507b.this.f1876q.mo13196b());
                            return;
                        }
                        return;
                    }
                    if (C2102v.m5104a()) {
                        C2102v.m5110i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    }
                    Uri j = aVar.mo12858j();
                    if (j != null) {
                        AppLovinAdServiceImpl l = C1507b.this.f1863d;
                        AppLovinAdView r = C1507b.this.mo13128r();
                        C1507b bVar = C1507b.this;
                        l.trackAndLaunchClick(aVar, r, bVar, j, pointF, bVar.f1882w);
                        if (C1507b.this.f1868i != null) {
                            C1507b.this.f1868i.mo14327b();
                        }
                    }
                    C1507b.this.f1871l.mo13150a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    /* renamed from: a */
    public void mo13099a(final WebView webView) {
        m2767a((Runnable) new Runnable() {
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f1874o != this.f1875p) {
                this.f1875p = this.f1874o;
                if (this.f1884y != null) {
                    C2053j.m4998a(this.f1884y, (AppLovinAd) this.f1874o);
                    this.f1871l.mo13150a("javascript:al_onAdViewRendered();");
                }
                if ((this.f1874o instanceof C1834a) && this.f1874o.isOpenMeasurementEnabled()) {
                    this.f1862c.mo14526S().mo14430a((C1887a) new C1944z(this.f1862c, new Runnable() {
                        public void run() {
                            C1507b.this.f1874o.mo12863o().mo14067b(webView);
                            C1507b.this.f1874o.mo12863o().mo14061a((View) webView);
                            C1507b.this.f1874o.mo12863o().mo14068c();
                            C1507b.this.f1874o.mo12863o().mo14069d();
                        }
                    }), C1918o.C1920a.MAIN, 500);
                }
            }
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    /* renamed from: a */
    public void mo13100a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context != null) {
            if (appLovinAdSize == null && (appLovinAdSize = C2043b.m4917a(attributeSet)) == null) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            }
            AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
            if (appLovinSdk == null) {
                appLovinSdk = AppLovinSdk.getInstance(context);
            }
            if (appLovinSdk != null) {
                m2766a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
                if (C2043b.m4921b(attributeSet)) {
                    mo13096a();
                }
            }
        } else if (C2102v.m5104a()) {
            C2102v.m5110i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        }
    }

    /* renamed from: a */
    public void mo13101a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f1885z = appLovinAdViewEventListener;
    }

    /* renamed from: a */
    public void mo13102a(C1533g gVar) {
        this.f1859B = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13103a(C1839e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f1863d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.f1882w);
        } else if (C2102v.m5104a()) {
            this.f1864e.mo15016e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        C2053j.m4997a(this.f1858A, (AppLovinAd) eVar);
    }

    /* renamed from: a */
    public void mo13104a(C1879d dVar) {
        C1523d dVar2 = this.f1871l;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    /* renamed from: a */
    public void mo13105a(AppLovinAd appLovinAd) {
        mo13106a(appLovinAd, (String) null);
    }

    /* renamed from: a */
    public void mo13106a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            Utils.validateAdSdkKey(appLovinAd, this.f1862c);
            if (this.f1880u) {
                C1839e eVar = (C1839e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f1862c);
                if (eVar != null && eVar != this.f1874o) {
                    if (C2102v.m5104a()) {
                        C2102v vVar = this.f1864e;
                        vVar.mo15012b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
                    }
                    C2053j.m5010b(this.f1884y, (AppLovinAd) this.f1874o);
                    if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                        m2790w();
                    }
                    if (this.f1874o != null && this.f1874o.isOpenMeasurementEnabled()) {
                        this.f1874o.mo12863o().mo14070e();
                    }
                    this.f1878s.set((Object) null);
                    this.f1875p = null;
                    this.f1874o = eVar;
                    if (!this.f1881v && Utils.isBML(this.f1866g)) {
                        this.f1862c.mo14592u().trackImpression(eVar);
                    }
                    if (this.f1876q != null) {
                        m2788u();
                    }
                    m2767a(this.f1872m);
                } else if (eVar != null) {
                    if (C2102v.m5104a()) {
                        C2102v vVar2 = this.f1864e;
                        vVar2.mo15015d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
                    }
                    if (((Boolean) this.f1862c.mo14534a(C1867b.f3178bZ)).booleanValue()) {
                        throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                    }
                } else if (C2102v.m5104a()) {
                    this.f1864e.mo15015d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                }
            } else if (C2102v.m5104a()) {
                C2102v.m5108g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            }
        } else {
            throw new IllegalArgumentException("No ad specified");
        }
    }

    /* renamed from: a */
    public void mo13107a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1858A = appLovinAdClickListener;
    }

    /* renamed from: a */
    public void mo13108a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1884y = appLovinAdDisplayListener;
    }

    /* renamed from: a */
    public void mo13109a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1883x = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13110a(AppLovinAdSize appLovinAdSize) {
        try {
            C1523d dVar = new C1523d(this.f1869j, this.f1862c, this.f1860a);
            this.f1871l = dVar;
            dVar.setBackgroundColor(0);
            this.f1871l.setWillNotCacheDrawing(false);
            this.f1861b.setBackgroundColor(0);
            this.f1861b.addView(this.f1871l);
            m2770b((View) this.f1871l, appLovinAdSize);
            if (!this.f1880u) {
                m2767a(this.f1873n);
            }
            m2767a((Runnable) new Runnable() {
                public void run() {
                    C1507b.this.f1871l.loadDataWithBaseURL("/", "<html></html>", "text/html", (String) null, "");
                }
            });
            this.f1880u = true;
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("AppLovinAdView", "Failed to initialize AdWebView", th);
            }
            this.f1879t.set(true);
        }
    }

    /* renamed from: b */
    public AppLovinAdSize mo13111b() {
        return this.f1866g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13112b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f1881v) {
                mo13105a(appLovinAd);
            } else {
                this.f1878s.set(appLovinAd);
                if (C2102v.m5104a()) {
                    this.f1864e.mo15012b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            m2767a((Runnable) new Runnable() {
                public void run() {
                    if (C1507b.this.f1879t.compareAndSet(true, false)) {
                        C1507b bVar = C1507b.this;
                        bVar.mo13110a(bVar.f1866g);
                    }
                    try {
                        if (C1507b.this.f1883x != null) {
                            C1507b.this.f1883x.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5110i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                        }
                    }
                }
            });
            return;
        }
        if (C2102v.m5104a()) {
            this.f1864e.mo15016e("AppLovinAdView", "No provided when to the view controller");
        }
        mo13097a(-1);
    }

    /* renamed from: c */
    public String mo13113c() {
        return this.f1867h;
    }

    /* renamed from: d */
    public void mo13114d() {
        if (this.f1880u && !this.f1881v) {
            this.f1881v = true;
        }
    }

    /* renamed from: e */
    public void mo13115e() {
        if (this.f1880u) {
            AppLovinAd andSet = this.f1878s.getAndSet((Object) null);
            if (andSet != null) {
                mo13105a(andSet);
            }
            this.f1881v = false;
        }
    }

    /* renamed from: f */
    public void mo13116f() {
        if (!(this.f1871l == null || this.f1876q == null)) {
            mo13121k();
        }
        m2787t();
    }

    /* renamed from: g */
    public AppLovinAdViewEventListener mo13117g() {
        return this.f1885z;
    }

    public String getCommunicatorId() {
        return C1507b.class.getSimpleName();
    }

    /* renamed from: h */
    public C1533g mo13118h() {
        return this.f1859B;
    }

    /* renamed from: i */
    public void mo13119i() {
        if (C2043b.m4920a((View) this.f1871l)) {
            this.f1862c.mo14527T().mo14351a(C1881f.f3477m);
        }
    }

    /* renamed from: j */
    public void mo13120j() {
        if (this.f1880u) {
            C2053j.m5010b(this.f1884y, (AppLovinAd) this.f1874o);
            if (this.f1874o != null && this.f1874o.isOpenMeasurementEnabled() && Utils.isBML(this.f1874o.getSize())) {
                this.f1874o.mo12863o().mo14070e();
            }
            if (this.f1871l != null && this.f1876q != null) {
                if (C2102v.m5104a()) {
                    this.f1864e.mo15012b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                m2788u();
            } else if (C2102v.m5104a()) {
                this.f1864e.mo15012b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    /* renamed from: k */
    public void mo13121k() {
        m2767a((Runnable) new Runnable() {
            public void run() {
                C1507b.this.m2789v();
                if (C1507b.this.f1861b != null && C1507b.this.f1871l != null && C1507b.this.f1871l.getParent() == null) {
                    C1507b.this.f1861b.addView(C1507b.this.f1871l);
                    C1507b.m2770b((View) C1507b.this.f1871l, C1507b.this.f1874o.getSize());
                    if (C1507b.this.f1874o.isOpenMeasurementEnabled()) {
                        C1507b.this.f1874o.mo12863o().mo14061a((View) C1507b.this.f1871l);
                    }
                }
            }
        });
    }

    /* renamed from: l */
    public void mo13122l() {
        if (this.f1876q == null && this.f1877r == null) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1864e;
                vVar.mo15012b("AppLovinAdView", "Ad: " + this.f1874o + " closed.");
            }
            m2767a(this.f1873n);
            C2053j.m5010b(this.f1884y, (AppLovinAd) this.f1874o);
            this.f1874o = null;
            return;
        }
        mo13121k();
    }

    /* renamed from: m */
    public void mo13123m() {
        this.f1882w = true;
    }

    /* renamed from: n */
    public void mo13124n() {
        this.f1882w = false;
    }

    /* renamed from: o */
    public void mo13125o() {
        if ((this.f1860a instanceof C1541k) && this.f1874o != null) {
            if (this.f1874o.mo14166F() == C1839e.C1841a.DISMISS) {
                ((C1541k) this.f1860a).dismiss();
            }
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m2767a((Runnable) new Runnable() {
                public void run() {
                    C1507b.this.mo13129s().loadUrl("chrome://crash");
                }
            });
        }
    }

    /* renamed from: p */
    public C1839e mo13126p() {
        return this.f1874o;
    }

    /* renamed from: q */
    public C1969m mo13127q() {
        return this.f1862c;
    }

    /* renamed from: r */
    public AppLovinAdView mo13128r() {
        return (AppLovinAdView) this.f1861b;
    }

    /* renamed from: s */
    public C1523d mo13129s() {
        return this.f1871l;
    }
}
