package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C6419A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C6696d;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.z */
public final class C6763z extends C6419A implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6696d f17812a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f17813b;

    C6763z(String str, String str2, NetworkSettings networkSettings, C6696d dVar, long j, AbstractAdapter abstractAdapter) {
        super(new C6650a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f16241e = new C6650a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f16242f = this.f16241e.f17321b;
        this.f16240d = abstractAdapter;
        this.f17812a = dVar;
        this.f16243g = j;
        this.f16240d.initRewardedVideoForDemandOnly(str, str2, this.f16242f, this);
    }

    /* renamed from: c */
    private void m20547c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f16241e.f17320a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20548d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f16241e.f17320a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo37009a() {
        m20548d("showRewardedVideo state=" + mo35951i());
        if (mo35943a(C6419A.C6420a.LOADED, C6419A.C6420a.SHOW_IN_PROGRESS)) {
            this.f16240d.showRewardedVideo(this.f16242f, this);
            return;
        }
        this.f17812a.mo36904a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo37010a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m20548d("loadRewardedVideo state=" + mo35951i());
        C6419A.C6420a a = mo35937a(new C6419A.C6420a[]{C6419A.C6420a.NOT_LOADED, C6419A.C6420a.LOADED}, C6419A.C6420a.LOAD_IN_PROGRESS);
        if (a == C6419A.C6420a.NOT_LOADED || a == C6419A.C6420a.LOADED) {
            this.f17813b = new Date().getTime();
            m20548d("start timer");
            mo35940a((TimerTask) new TimerTask() {
                public final void run() {
                    C6763z zVar = C6763z.this;
                    zVar.m20548d("load timed out state=" + C6763z.this.mo35951i());
                    if (C6763z.this.mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.NOT_LOADED)) {
                        C6763z.this.f17812a.mo36905a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C6763z.this, new Date().getTime() - C6763z.this.f17813b);
                    }
                }
            });
            if (mo35953k()) {
                this.f16244h = str2;
                this.f16245i = jSONObject;
                this.f16246j = list;
                this.f16240d.loadRewardedVideoForDemandOnlyForBidding(this.f16242f, this, str);
                return;
            }
            this.f16240d.loadRewardedVideoForDemandOnly(this.f16242f, this);
        } else if (a == C6419A.C6420a.LOAD_IN_PROGRESS) {
            this.f17812a.mo36905a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f17812a.mo36905a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo37011b() {
        return this.f16240d.isRewardedVideoAvailable(this.f16242f);
    }

    public final void onRewardedVideoAdClicked() {
        m20547c("onRewardedVideoAdClicked");
        this.f17812a.mo36909c(this);
    }

    public final void onRewardedVideoAdClosed() {
        mo35938a(C6419A.C6420a.NOT_LOADED);
        m20547c("onRewardedVideoAdClosed");
        this.f17812a.mo36908b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        m20547c("onRewardedVideoAdOpened");
        this.f17812a.mo36906a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        m20547c("onRewardedVideoAdRewarded");
        this.f17812a.mo36911e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo35938a(C6419A.C6420a.NOT_LOADED);
        m20547c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f17812a.mo36904a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        m20547c("onRewardedVideoAdVisible");
        this.f17812a.mo36910d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        m20547c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo35951i());
        mo35952j();
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.NOT_LOADED)) {
            this.f17812a.mo36905a(ironSourceError, this, new Date().getTime() - this.f17813b);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        m20547c("onRewardedVideoLoadSuccess state=" + mo35951i());
        mo35952j();
        if (mo35943a(C6419A.C6420a.LOAD_IN_PROGRESS, C6419A.C6420a.LOADED)) {
            this.f17812a.mo36907a(this, new Date().getTime() - this.f17813b);
        }
    }
}
