package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1541k;
import com.applovin.impl.adview.C1552o;
import com.applovin.impl.adview.activity.C1437a;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p030b.C1450a;
import com.applovin.impl.adview.activity.p030b.C1473e;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenActivity extends Activity implements C1541k {
    public static C1552o parentInterstitialWrapper;

    /* renamed from: a */
    private C1969m f1526a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1450a f1527b;

    /* renamed from: c */
    private final AtomicBoolean f1528c = new AtomicBoolean(true);

    /* renamed from: d */
    private C1437a f1529d;

    /* renamed from: e */
    private boolean f1530e;

    /* renamed from: a */
    private void m2382a() {
        WindowInsetsController insetsController;
        if (!this.f1530e || !C2049g.m4948j() || (insetsController = getWindow().getInsetsController()) == null) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    public void dismiss() {
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo12999h();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo13003l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo12983a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                if (C2102v.m5104a()) {
                    C2102v.m5109h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                }
                dismiss();
                return;
            } else if (C2102v.m5104a()) {
                C2102v.m5107f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
            }
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C1969m mVar = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        this.f1526a = mVar;
        this.f1530e = ((Boolean) mVar.mo14534a(C1867b.f3210cF)).booleanValue();
        if (((Boolean) this.f1526a.mo14534a(C1867b.f3211cG)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        m2382a();
        C1552o oVar = parentInterstitialWrapper;
        if (oVar != null) {
            C1450a.m2549a(oVar.mo13211a(), parentInterstitialWrapper.mo13215d(), parentInterstitialWrapper.mo13214c(), parentInterstitialWrapper.mo13213b(), this.f1526a, this, new C1450a.C1462a() {
                /* renamed from: a */
                public void mo12789a(C1450a aVar) {
                    C1450a unused = AppLovinFullscreenActivity.this.f1527b = aVar;
                    aVar.mo12995d();
                }

                /* renamed from: a */
                public void mo12790a(String str, Throwable th) {
                    C1552o.m2900a(AppLovinFullscreenActivity.parentInterstitialWrapper.mo13211a(), AppLovinFullscreenActivity.parentInterstitialWrapper.mo13214c(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        C1437a aVar = new C1437a(this, this.f1526a);
        this.f1529d = aVar;
        bindService(intent, aVar, 1);
        if (C2049g.m4946h()) {
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        parentInterstitialWrapper = null;
        C1437a aVar = this.f1529d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        C1450a aVar2 = this.f1527b;
        if (aVar2 != null) {
            if (!aVar2.mo13000i()) {
                this.f1527b.mo12999h();
            }
            this.f1527b.mo13002k();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo12980a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo12998g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1450a aVar;
        try {
            super.onResume();
            if (!this.f1528c.get() && (aVar = this.f1527b) != null) {
                aVar.mo12997f();
            }
        } catch (IllegalArgumentException e) {
            if (C2102v.m5104a()) {
                this.f1526a.mo14509A().mo15013b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1969m mVar = this.f1526a;
        if (mVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) mVar.mo14534a(C1867b.f3322eN)).booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C1450a aVar = this.f1527b;
        if (aVar != null) {
            aVar.mo13001j();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f1527b != null) {
            if (!this.f1528c.getAndSet(false) || (this.f1527b instanceof C1473e)) {
                this.f1527b.mo12994c(z);
            }
            if (z) {
                m2382a();
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(C1450a aVar) {
        this.f1527b = aVar;
    }
}
