package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class AdColonyInterstitialActivity extends C0739b {

    /* renamed from: j */
    AdColonyInterstitial f184j;

    /* renamed from: k */
    private C0851i f185k;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!C0723a.m196d()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = C0723a.m193b().mo10901j();
        }
        this.f184j = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10477a(C0850h0 h0Var) {
        String e;
        super.mo10477a(h0Var);
        C0790d c = C0723a.m193b().mo10889c();
        C0832f1 f = C0773c0.m391f(h0Var.mo10834a(), "v4iap");
        C0828e1 a = C0773c0.m366a(f, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.f184j;
        if (!(adColonyInterstitial == null || adColonyInterstitial.getListener() == null || (e = a.mo10759e(0)) == null)) {
            this.f184j.getListener().onIAPEvent(this.f184j, e, C0773c0.m389d(f, "engagement_type"));
        }
        c.mo10711a(this.f279a);
        if (this.f184j != null) {
            c.mo10723f().remove(this.f184j.mo10437b());
            if (this.f184j.getListener() != null) {
                this.f184j.getListener().onClosed(this.f184j);
                this.f184j.mo10432a((C0761c) null);
                this.f184j.setListener((AdColonyInterstitialListener) null);
            }
            this.f184j.mo10460o();
            this.f184j = null;
        }
        C0851i iVar = this.f185k;
        if (iVar != null) {
            iVar.mo10839a();
            this.f185k = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f184j;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.mo10448f();
        }
        this.f280b = i;
        super.onCreate(bundle);
        if (C0723a.m196d() && (adColonyInterstitial = this.f184j) != null) {
            C0939p0 e = adColonyInterstitial.mo10446e();
            if (e != null) {
                e.mo11001a(this.f279a);
            }
            this.f185k = new C0851i(new Handler(Looper.getMainLooper()), this.f184j);
            if (this.f184j.getListener() != null) {
                this.f184j.getListener().onOpened(this.f184j);
            }
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
