package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends C0739b {

    /* renamed from: j */
    AdColonyAdView f141j;

    public AdColonyAdViewActivity() {
        AdColonyAdView adColonyAdView;
        if (!C0723a.m196d()) {
            adColonyAdView = null;
        } else {
            adColonyAdView = C0723a.m193b().mo10902k();
        }
        this.f141j = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10359b() {
        ViewParent parent = this.f279a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f279a);
        }
        this.f141j.mo10330a();
        C0723a.m193b().mo10879a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10360c() {
        this.f141j.mo10331b();
    }

    public void onBackPressed() {
        mo10359b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C0723a.m196d() || (adColonyAdView = this.f141j) == null) {
            C0723a.m193b().mo10879a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f280b = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f141j.mo10331b();
        AdColonyAdViewListener listener = this.f141j.getListener();
        if (listener != null) {
            listener.onOpened(this.f141j);
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
