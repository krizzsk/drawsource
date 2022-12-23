package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1956k;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.l */
public class C1962l implements C1956k.C1961a, AppLovinWebViewActivity.EventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f3660a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<AppLovinWebViewActivity> f3661b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1969m f3662c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2102v f3663d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinUserService.OnConsentDialogDismissListener f3664e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1956k f3665f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WeakReference<Activity> f3666g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2042a f3667h;

    /* renamed from: i */
    private AtomicBoolean f3668i = new AtomicBoolean();

    C1962l(C1969m mVar) {
        this.f3662c = mVar;
        this.f3663d = mVar.mo14509A();
        if (mVar.mo14521N() != null) {
            this.f3666g = new WeakReference<>(mVar.mo14521N());
        }
        C1969m.m4459a(C1969m.m4458M()).mo14046a(new C2042a() {
            public void onActivityStarted(Activity activity) {
                WeakReference unused = C1962l.this.f3666g = new WeakReference(activity);
            }
        });
        this.f3665f = new C1956k(this, mVar);
    }

    /* renamed from: a */
    private void m4443a(boolean z, long j) {
        m4451g();
        if (z) {
            mo14499a(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4445a(C1969m mVar) {
        if (mo14502d()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "Consent dialog already showing");
            }
            return false;
        } else if (!C2050h.m4957a(mVar.mo14520L())) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            }
            return false;
        } else if (!((Boolean) mVar.mo14534a(C1867b.f3144as)).booleanValue()) {
            if (C2102v.m5104a()) {
                this.f3663d.mo15016e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) mVar.mo14534a(C1867b.f3145at))) {
            return true;
        } else {
            if (C2102v.m5104a()) {
                this.f3663d.mo15016e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m4451g() {
        this.f3662c.mo14556af().mo14048b(this.f3667h);
        if (mo14502d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f3661b.get();
            f3661b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f3664e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f3664e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14497a() {
        final Activity activity = (Activity) this.f3666g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1962l.this.mo14500a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f3662c.mo14534a(C1867b.f3147av)).longValue());
        }
    }

    /* renamed from: a */
    public void mo14499a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C2102v.m5104a()) {
                    C1962l.this.f3663d.mo15012b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                C1962l.this.f3665f.mo14492a(j, C1962l.this.f3662c, C1962l.this);
            }
        });
    }

    /* renamed from: a */
    public void mo14500a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                C1962l lVar = C1962l.this;
                if (!lVar.m4445a(lVar.f3662c) || C1962l.f3660a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                WeakReference unused = C1962l.this.f3666g = new WeakReference(activity);
                AppLovinUserService.OnConsentDialogDismissListener unused2 = C1962l.this.f3664e = onConsentDialogDismissListener;
                C2042a unused3 = C1962l.this.f3667h = new C2042a() {
                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            if (!C1962l.this.mo14502d() || C1962l.f3661b.get() != activity) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                                WeakReference unused = C1962l.f3661b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) C1962l.this.f3662c.mo14534a(C1867b.f3145at), C1962l.this);
                            }
                            C1962l.f3660a.set(false);
                        }
                    }
                };
                C1962l.this.f3662c.mo14556af().mo14046a(C1962l.this.f3667h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, C1962l.this.f3662c.mo14597z());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) C1962l.this.f3662c.mo14534a(C1867b.f3146au));
                activity.startActivity(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo14498b() {
    }

    /* renamed from: c */
    public void mo14501c() {
        if (!this.f3668i.getAndSet(true)) {
            final String str = (String) this.f3662c.mo14534a(C1867b.f3145at);
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    WebView tryToCreateWebView = Utils.tryToCreateWebView(C1962l.this.f3662c.mo14520L(), "preloading consent dialog");
                    if (tryToCreateWebView != null) {
                        tryToCreateWebView.loadUrl(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo14502d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f3661b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onReceivedEvent(String str) {
        boolean booleanValue;
        C1969m mVar;
        C1867b bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f3662c.mo14520L());
            m4451g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f3662c.mo14520L());
            booleanValue = ((Boolean) this.f3662c.mo14534a(C1867b.f3148aw)).booleanValue();
            mVar = this.f3662c;
            bVar = C1867b.f3101aB;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3662c.mo14534a(C1867b.f3149ax)).booleanValue();
            mVar = this.f3662c;
            bVar = C1867b.f3102aC;
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3662c.mo14534a(C1867b.f3150ay)).booleanValue();
            mVar = this.f3662c;
            bVar = C1867b.f3103aD;
        } else {
            return;
        }
        m4443a(booleanValue, ((Long) mVar.mo14534a(bVar)).longValue());
    }
}
