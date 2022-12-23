package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.Y */
public final class C6499Y extends C6529ac implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C6501a f16661a = C6501a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6498X f16662b;

    /* renamed from: j */
    private Timer f16663j;

    /* renamed from: k */
    private int f16664k;

    /* renamed from: l */
    private String f16665l;

    /* renamed from: m */
    private String f16666m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f16667n;

    /* renamed from: o */
    private final Object f16668o = new Object();

    /* renamed from: com.ironsource.mediationsdk.Y$a */
    public enum C6501a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public C6499Y(String str, String str2, NetworkSettings networkSettings, C6498X x, int i, AbstractAdapter abstractAdapter) {
        super(new C6650a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f16665l = str;
        this.f16666m = str2;
        this.f16662b = x;
        this.f16663j = null;
        this.f16664k = i;
        this.f16846c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19616a(C6501a aVar) {
        m19622d("current state=" + this.f16661a + ", new state=" + aVar);
        this.f16661a = aVar;
    }

    /* renamed from: c */
    private void m19621c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + mo36388k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19622d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo36388k() + " : " + str, 0);
    }

    /* renamed from: e */
    private void m19623e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo36388k() + " : " + str, 3);
    }

    /* renamed from: q */
    private void m19624q() {
        try {
            String str = C6459L.m19304a().f16422l;
            if (!TextUtils.isEmpty(str)) {
                this.f16846c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f16846c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m19622d("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: r */
    private void m19625r() {
        synchronized (this.f16668o) {
            if (this.f16663j != null) {
                this.f16663j.cancel();
                this.f16663j = null;
            }
        }
    }

    /* renamed from: s */
    private void m19626s() {
        synchronized (this.f16668o) {
            m19622d("start timer");
            m19625r();
            Timer timer = new Timer();
            this.f16663j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6499Y y = C6499Y.this;
                    y.m19622d("timed out state=" + C6499Y.this.f16661a.name() + " isBidder=" + C6499Y.this.mo36385h());
                    if (C6499Y.this.f16661a != C6501a.INIT_IN_PROGRESS || !C6499Y.this.mo36385h()) {
                        C6499Y.this.m19616a(C6501a.LOAD_FAILED);
                        C6499Y.this.f16662b.mo36290a(ErrorBuilder.buildLoadFailedError("timed out"), C6499Y.this, new Date().getTime() - C6499Y.this.f16667n);
                        return;
                    }
                    C6499Y.this.m19616a(C6501a.NO_INIT);
                }
            }, (long) (this.f16664k * 1000));
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo36182a() {
        try {
            if (mo36385h()) {
                return this.f16846c.getInterstitialBiddingData(this.f16849f);
            }
            return null;
        } catch (Throwable th) {
            m19623e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo36303a(String str) {
        try {
            this.f16667n = new Date().getTime();
            m19622d("loadInterstitial");
            this.f16848e = false;
            if (mo36385h()) {
                m19626s();
                m19616a(C6501a.LOAD_IN_PROGRESS);
                this.f16846c.loadInterstitialForBidding(this.f16849f, this, str);
            } else if (this.f16661a == C6501a.NO_INIT) {
                m19626s();
                m19616a(C6501a.INIT_IN_PROGRESS);
                m19624q();
                this.f16846c.initInterstitial(this.f16665l, this.f16666m, this.f16849f, this);
            } else {
                m19626s();
                m19616a(C6501a.LOAD_IN_PROGRESS);
                this.f16846c.loadInterstitial(this.f16849f, this);
            }
        } catch (Throwable th) {
            m19623e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo36304b() {
        m19622d("initForBidding()");
        m19616a(C6501a.INIT_IN_PROGRESS);
        m19624q();
        try {
            this.f16846c.initInterstitialForBidding(this.f16665l, this.f16666m, this.f16849f, this);
        } catch (Throwable th) {
            m19623e(mo36388k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: c */
    public final void mo36305c() {
        try {
            this.f16846c.showInterstitial(this.f16849f, this);
        } catch (Throwable th) {
            m19623e(mo36388k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: f */
    public final void mo36306f() {
        this.f16846c.setMediationState(C6611b.C6612a.CAPPED_PER_SESSION, "interstitial");
    }

    /* renamed from: g */
    public final boolean mo36307g() {
        try {
            return this.f16846c.isInterstitialReady(this.f16849f);
        } catch (Throwable th) {
            m19623e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        m19621c("onInterstitialAdClicked");
        this.f16662b.mo36296d(this);
    }

    public final void onInterstitialAdClosed() {
        m19621c("onInterstitialAdClosed");
        this.f16662b.mo36293b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m19621c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f16661a.name());
        m19625r();
        if (this.f16661a == C6501a.LOAD_IN_PROGRESS) {
            m19616a(C6501a.LOAD_FAILED);
            this.f16662b.mo36290a(ironSourceError, this, new Date().getTime() - this.f16667n);
        }
    }

    public final void onInterstitialAdOpened() {
        m19621c("onInterstitialAdOpened");
        this.f16662b.mo36287a(this);
    }

    public final void onInterstitialAdReady() {
        m19621c("onInterstitialAdReady state=" + this.f16661a.name());
        m19625r();
        if (this.f16661a == C6501a.LOAD_IN_PROGRESS) {
            m19616a(C6501a.LOADED);
            this.f16662b.mo36288a(this, new Date().getTime() - this.f16667n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        m19621c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f16662b.mo36289a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        m19621c("onInterstitialAdShowSucceeded");
        this.f16662b.mo36295c(this);
    }

    public final void onInterstitialAdVisible() {
        m19621c("onInterstitialAdVisible");
        this.f16662b.mo36298e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        m19621c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f16661a.name());
        if (this.f16661a == C6501a.INIT_IN_PROGRESS) {
            m19625r();
            m19616a(C6501a.NO_INIT);
            this.f16662b.mo36294b(ironSourceError, this);
            if (!mo36385h()) {
                this.f16662b.mo36290a(ironSourceError, this, new Date().getTime() - this.f16667n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        m19621c("onInterstitialInitSuccess state=" + this.f16661a.name());
        if (this.f16661a == C6501a.INIT_IN_PROGRESS) {
            m19625r();
            if (mo36385h()) {
                m19616a(C6501a.INIT_SUCCESS);
            } else {
                m19616a(C6501a.LOAD_IN_PROGRESS);
                m19626s();
                try {
                    this.f16846c.loadInterstitial(this.f16849f, this);
                } catch (Throwable th) {
                    m19623e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.f16662b.mo36299f(this);
        }
    }
}
