package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.p030b.C1450a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p049ad.C1846g;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.o */
public class C1552o implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final C1969m f1962a;

    /* renamed from: b */
    private final WeakReference<Context> f1963b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile AppLovinAdLoadListener f1964c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile AppLovinAdDisplayListener f1965d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile AppLovinAdVideoPlaybackListener f1966e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile AppLovinAdClickListener f1967f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile C1839e f1968g;

    /* renamed from: h */
    private volatile C1839e.C1842b f1969h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ViewGroup f1970i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AppLovinFullscreenAdViewObserver f1971j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1450a f1972k;

    public C1552o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f1962a = appLovinSdk.coreSdk;
            this.f1963b = new WeakReference<>(context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2893a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1552o.this.f1964c != null) {
                    C1552o.this.f1964c.failedToReceiveAd(i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2894a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f1962a.mo14597z());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private void m2898a(C1839e eVar, final Context context) {
        if (this.f1962a.mo14556af().mo14047b() == null) {
            this.f1962a.mo14527T().mo14351a(C1881f.f3477m);
        }
        this.f1968g = eVar;
        this.f1969h = this.f1968g.mo14232p();
        final long max = Math.max(0, ((Long) this.f1962a.mo14534a(C1867b.f3242cl)).longValue());
        if (C2102v.m5104a()) {
            C2102v A = this.f1962a.mo14509A();
            A.mo15012b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        m2899a(eVar, context, new Runnable() {
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        if (C1552o.this.f1970i == null || C1552o.this.f1971j == null) {
                            if (C2102v.m5104a()) {
                                C1552o.this.f1962a.mo14509A().mo15012b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                            }
                            C1552o.this.m2894a(context);
                            return;
                        }
                        if (C2102v.m5104a()) {
                            C2102v A = C1552o.this.f1962a.mo14509A();
                            A.mo15012b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + C1552o.this.f1970i + ")");
                        }
                        C1552o.this.f1970i.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        C1450a.m2549a(C1552o.this.f1968g, C1552o.this.f1967f, C1552o.this.f1965d, C1552o.this.f1966e, C1552o.this.f1962a, (Activity) C1552o.this.m2907f(), new C1450a.C1462a() {
                            /* renamed from: a */
                            public void mo12789a(C1450a aVar) {
                                C1450a unused = C1552o.this.f1972k = aVar;
                                C1552o.this.f1971j.setPresenter(aVar);
                                aVar.mo12984a(C1552o.this.f1970i);
                            }

                            /* renamed from: a */
                            public void mo12790a(String str, Throwable th) {
                                C1552o.m2900a(C1552o.this.f1968g, C1552o.this.f1965d, str, th, (AppLovinFullscreenActivity) null);
                            }
                        });
                    }
                }, max);
            }
        });
    }

    /* renamed from: a */
    private void m2899a(C1839e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.mo14174N()) || !eVar.mo14211ah() || C2050h.m4957a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.mo14212ai()).setMessage(eVar.mo14213aj()).setPositiveButton(eVar.mo14214ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* renamed from: a */
    public static void m2900a(C1839e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        if (C2102v.m5104a()) {
            C2102v.m5106c("InterstitialAdDialogWrapper", str, th);
        }
        if (appLovinAdDisplayListener instanceof C1846g) {
            C2053j.m4999a(appLovinAdDisplayListener, str);
        } else {
            C2053j.m5010b(appLovinAdDisplayListener, (AppLovinAd) eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* renamed from: a */
    private void m2901a(AppLovinAd appLovinAd) {
        if (this.f1965d != null) {
            this.f1965d.adHidden(appLovinAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2903b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1552o.this.f1964c != null) {
                    C1552o.this.f1964c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Context m2907f() {
        return (Context) this.f1963b.get();
    }

    /* renamed from: a */
    public C1839e mo13211a() {
        return this.f1968g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13212a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1962a.mo14592u().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: b */
    public AppLovinAdVideoPlaybackListener mo13213b() {
        return this.f1966e;
    }

    /* renamed from: c */
    public AppLovinAdDisplayListener mo13214c() {
        return this.f1965d;
    }

    /* renamed from: d */
    public AppLovinAdClickListener mo13215d() {
        return this.f1967f;
    }

    /* renamed from: e */
    public void mo13216e() {
        this.f1970i = null;
        this.f1971j = null;
        this.f1967f = null;
        this.f1964c = null;
        this.f1966e = null;
        this.f1965d = null;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1967f = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1965d = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1964c = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1966e = appLovinAdVideoPlaybackListener;
    }

    public void show() {
        mo13212a((AppLovinAdLoadListener) new AppLovinAdLoadListener() {
            public void adReceived(AppLovinAd appLovinAd) {
                C1552o.this.m2903b(appLovinAd);
                C1552o.this.showAndRender(appLovinAd);
            }

            public void failedToReceiveAd(int i) {
                C1552o.this.m2893a(i);
            }
        });
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        Context f = m2907f();
        if (f == null) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            }
            m2901a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f1962a);
        if (maybeRetrieveNonDummyAd == null) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd);
            }
            m2901a(appLovinAd);
        } else if (((AppLovinAdImpl) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.f1962a.mo14534a(C1867b.f3178bZ)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else if (maybeRetrieveNonDummyAd instanceof C1839e) {
            m2898a((C1839e) maybeRetrieveNonDummyAd, f);
        } else {
            if (C2102v.m5104a()) {
                C2102v A = this.f1962a.mo14509A();
                A.mo15016e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
            }
            m2901a(maybeRetrieveNonDummyAd);
        }
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup == null || lifecycle == null) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null containerView or lifecycle");
            }
            m2901a(appLovinAd);
            return;
        }
        this.f1970i = viewGroup;
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f1962a);
        this.f1971j = appLovinFullscreenAdViewObserver;
        lifecycle.addObserver(appLovinFullscreenAdViewObserver);
        showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
