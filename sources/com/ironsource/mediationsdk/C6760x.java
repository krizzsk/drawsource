package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6419A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6695c;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x */
public final class C6760x extends C6419A implements InterstitialSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6695c f17806a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f17807b;

    public C6760x(String str, String str2, NetworkSettings networkSettings, C6695c cVar, long j, AbstractAdapter abstractAdapter) {
        super(new C6650a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f17806a = cVar;
        this.f16243g = j;
        this.f16240d.initInterstitial(str, str2, this.f16242f, this);
    }

    /* renamed from: c */
    private void m20525c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f16241e.f17320a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20526d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f16241e.f17320a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo37003a() {
        m20526d("showInterstitial state=" + mo35951i());
        if (mo35943a(C6419A.C6420a.LOADED, C6419A.C6420a.SHOW_IN_PROGRESS)) {
            this.f16240d.showInterstitial(this.f16242f, this);
            return;
        }
        this.f17806a.mo36897a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo37004a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m20526d("loadInterstitial state=" + mo35951i());
        C6419A.C6420a a = mo35937a(new C6419A.C6420a[]{C6419A.C6420a.NOT_LOADED, C6419A.C6420a.LOADED}, C6419A.C6420a.LOAD_IN_PROGRESS);
        if (a == C6419A.C6420a.NOT_LOADED || a == C6419A.C6420a.LOADED) {
            this.f17807b = new Date().getTime();
            m20526d("start timer");
            mo35940a((TimerTask) new TimerTask() {
                public final void run() {
                    C6760x xVar = C6760x.this;
                    xVar.m20526d("load timed out state=" + C6760x.this.mo35951i());
                    if (C6760x.this.mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.NOT_LOADED)) {
                        C6760x.this.f17806a.mo36898a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C6760x.this, new Date().getTime() - C6760x.this.f17807b);
                    }
                }
            });
            if (mo35953k()) {
                this.f16244h = str2;
                this.f16245i = jSONObject;
                this.f16246j = list;
                this.f16240d.loadInterstitialForBidding(this.f16242f, this, str);
                return;
            }
            this.f16240d.loadInterstitial(this.f16242f, this);
        } else if (a == C6419A.C6420a.LOAD_IN_PROGRESS) {
            this.f17806a.mo36898a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f17806a.mo36898a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo37005b() {
        return this.f16240d.isInterstitialReady(this.f16242f);
    }

    public final void onInterstitialAdClicked() {
        m20525c("onInterstitialAdClicked");
        this.f17806a.mo36902c(this);
    }

    public final void onInterstitialAdClosed() {
        mo35938a(C6419A.C6420a.NOT_LOADED);
        m20525c("onInterstitialAdClosed");
        this.f17806a.mo36901b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m20525c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo35951i());
        mo35952j();
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.NOT_LOADED)) {
            this.f17806a.mo36898a(ironSourceError, this, new Date().getTime() - this.f17807b);
        }
    }

    public final void onInterstitialAdOpened() {
        m20525c("onInterstitialAdOpened");
        this.f17806a.mo36899a(this);
    }

    public final void onInterstitialAdReady() {
        m20525c("onInterstitialAdReady state=" + mo35951i());
        mo35952j();
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.LOADED)) {
            this.f17806a.mo36900a(this, new Date().getTime() - this.f17807b);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        mo35938a(C6419A.C6420a.NOT_LOADED);
        m20525c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f17806a.mo36897a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        m20525c("onInterstitialAdVisible");
        this.f17806a.mo36903d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
