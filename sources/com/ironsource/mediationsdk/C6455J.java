package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6700h;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.J */
public final class C6455J extends C6611b implements InterstitialSmashListener {

    /* renamed from: r */
    JSONObject f16360r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C6700h f16361s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public long f16362t;

    /* renamed from: u */
    private int f16363u;

    C6455J(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f16360r = interstitialSettings;
        this.f17126k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f17127l = this.f16360r.optInt("maxAdsPerSession", 99);
        this.f17128m = this.f16360r.optInt("maxAdsPerDay", 99);
        this.f17120e = networkSettings.isMultipleInstances();
        this.f17121f = networkSettings.getSubProviderId();
        this.f16363u = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36098g() {
        this.f17123h = 0;
        mo36614a(C6611b.C6612a.INITIATED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36099h() {
        try {
            mo36620e();
            this.f17124i = new Timer();
            this.f17124i.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C6455J.this.f17116a == C6611b.C6612a.INIT_PENDING && C6455J.this.f16361s != null) {
                        C6455J.this.mo36614a(C6611b.C6612a.INIT_FAILED);
                        C6455J.this.f16361s.mo36025a(ErrorBuilder.buildInitFailedError("Timeout", IronSourceConstants.INTERSTITIAL_AD_UNIT), C6455J.this);
                    }
                }
            }, (long) (this.f16363u * 1000));
        } catch (Exception e) {
            mo36615a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36100i() {
        try {
            mo36621f();
            this.f17125j = new Timer();
            this.f17125j.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C6455J.this.f17116a == C6611b.C6612a.LOAD_PENDING && C6455J.this.f16361s != null) {
                        C6455J.this.mo36614a(C6611b.C6612a.NOT_AVAILABLE);
                        C6455J.this.f16361s.mo36026a(ErrorBuilder.buildLoadFailedError("Timeout"), C6455J.this, new Date().getTime() - C6455J.this.f16362t);
                    }
                }
            }, (long) (this.f16363u * 1000));
        } catch (Exception e) {
            mo36615a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo36101k() {
        return "interstitial";
    }

    public final void onInterstitialAdClicked() {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36037e(this);
        }
    }

    public final void onInterstitialAdClosed() {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36034c(this);
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        mo36621f();
        if (this.f17116a == C6611b.C6612a.LOAD_PENDING && this.f16361s != null) {
            this.f16361s.mo36026a(ironSourceError, this, new Date().getTime() - this.f16362t);
        }
    }

    public final void onInterstitialAdOpened() {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36031b(this);
        }
    }

    public final void onInterstitialAdReady() {
        mo36621f();
        if (this.f17116a == C6611b.C6612a.LOAD_PENDING && this.f16361s != null) {
            this.f16361s.mo36024a(this, new Date().getTime() - this.f16362t);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36032b(ironSourceError, this);
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36036d(this);
        }
    }

    public final void onInterstitialAdVisible() {
        C6700h hVar = this.f16361s;
        if (hVar != null) {
            hVar.mo36040f(this);
        }
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        mo36620e();
        if (this.f17116a == C6611b.C6612a.INIT_PENDING) {
            mo36614a(C6611b.C6612a.INIT_FAILED);
            C6700h hVar = this.f16361s;
            if (hVar != null) {
                hVar.mo36025a(ironSourceError, this);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        mo36620e();
        if (this.f17116a == C6611b.C6612a.INIT_PENDING) {
            mo36614a(C6611b.C6612a.INITIATED);
            C6700h hVar = this.f16361s;
            if (hVar != null) {
                hVar.mo36023a(this);
            }
        }
    }
}
