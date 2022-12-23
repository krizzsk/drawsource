package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C6693a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.q */
public final class C6686q implements BannerSmashListener {

    /* renamed from: a */
    public AbstractAdapter f17467a;

    /* renamed from: b */
    public NetworkSettings f17468b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C6693a f17469c;

    /* renamed from: d */
    boolean f17470d;

    /* renamed from: e */
    IronSourceBannerLayout f17471e;

    /* renamed from: f */
    public int f17472f;

    /* renamed from: g */
    private Timer f17473g;

    /* renamed from: h */
    private long f17474h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6688a f17475i = C6688a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    public enum C6688a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C6686q(C6693a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f17472f = i;
        this.f17469c = aVar;
        this.f17467a = abstractAdapter;
        this.f17468b = networkSettings;
        this.f17474h = j;
        abstractAdapter.addBannerListener(this);
    }

    /* renamed from: a */
    private void m20291a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + mo36828a() + " | " + str2, 3);
    }

    /* renamed from: c */
    private void m20293c() {
        if (this.f17467a != null) {
            try {
                String str = C6459L.m19304a().f16422l;
                if (!TextUtils.isEmpty(str)) {
                    this.f17467a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f17467a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                mo36831a(":setCustomParams():" + e.toString());
            }
        }
    }

    /* renamed from: d */
    private void m20294d() {
        try {
            if (this.f17473g != null) {
                this.f17473g.cancel();
            }
        } catch (Exception e) {
            m20291a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f17473g = null;
        }
    }

    /* renamed from: a */
    public final String mo36828a() {
        return this.f17468b.isMultipleInstances() ? this.f17468b.getProviderTypeForReflection() : this.f17468b.getProviderName();
    }

    /* renamed from: a */
    public final void mo36829a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        mo36831a("loadBanner");
        this.f17470d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo36831a("loadBanner - bannerLayout is null or destroyed");
            this.f17469c.mo36818a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f17467a == null) {
            mo36831a("loadBanner - mAdapter is null");
            this.f17469c.mo36818a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.f17471e = ironSourceBannerLayout;
            mo36832b();
            if (this.f17475i == C6688a.NO_INIT) {
                mo36830a(C6688a.INIT_IN_PROGRESS);
                m20293c();
                this.f17467a.initBanners(str, str2, this.f17468b.getBannerSettings(), this);
                return;
            }
            mo36830a(C6688a.LOAD_IN_PROGRESS);
            this.f17467a.loadBanner(ironSourceBannerLayout, this.f17468b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36830a(C6688a aVar) {
        this.f17475i = aVar;
        mo36831a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36831a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + mo36828a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36832b() {
        try {
            m20294d();
            Timer timer = new Timer();
            this.f17473g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6693a b;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C6686q.this.f17475i == C6688a.INIT_IN_PROGRESS) {
                        C6686q.this.mo36830a(C6688a.NO_INIT);
                        C6686q.this.mo36831a("init timed out");
                        b = C6686q.this.f17469c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
                    } else if (C6686q.this.f17475i == C6688a.LOAD_IN_PROGRESS) {
                        C6686q.this.mo36830a(C6688a.LOAD_FAILED);
                        C6686q.this.mo36831a("load timed out");
                        b = C6686q.this.f17469c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
                    } else if (C6686q.this.f17475i == C6688a.LOADED) {
                        C6686q.this.mo36830a(C6688a.LOAD_FAILED);
                        C6686q.this.mo36831a("reload timed out");
                        C6686q.this.f17469c.mo36822b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C6686q.this, false);
                        return;
                    } else {
                        return;
                    }
                    b.mo36818a(ironSourceError, C6686q.this, false);
                }
            }, this.f17474h);
        } catch (Exception e) {
            m20291a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        C6693a aVar = this.f17469c;
        if (aVar != null) {
            aVar.mo36819a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C6693a aVar = this.f17469c;
        if (aVar != null) {
            aVar.mo36825d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        mo36831a("onBannerAdLoadFailed()");
        m20294d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.f17475i == C6688a.LOAD_IN_PROGRESS) {
            mo36830a(C6688a.LOAD_FAILED);
            this.f17469c.mo36818a(ironSourceError, this, z);
        } else if (this.f17475i == C6688a.LOADED) {
            this.f17469c.mo36822b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        mo36831a("onBannerAdLoaded()");
        m20294d();
        if (this.f17475i == C6688a.LOAD_IN_PROGRESS) {
            mo36830a(C6688a.LOADED);
            this.f17469c.mo36820a(this, view, layoutParams);
        } else if (this.f17475i == C6688a.LOADED) {
            this.f17469c.mo36821a(this, view, layoutParams, this.f17467a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        C6693a aVar = this.f17469c;
        if (aVar != null) {
            aVar.mo36823b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C6693a aVar = this.f17469c;
        if (aVar != null) {
            aVar.mo36824c(this);
        }
    }

    public final void onBannerAdShown() {
        C6693a aVar = this.f17469c;
        if (aVar != null) {
            aVar.mo36826e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        m20294d();
        if (this.f17475i == C6688a.INIT_IN_PROGRESS) {
            this.f17469c.mo36818a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            mo36830a(C6688a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        m20294d();
        if (this.f17475i == C6688a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f17471e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f17469c.mo36818a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f17471e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            mo36832b();
            mo36830a(C6688a.LOAD_IN_PROGRESS);
            this.f17467a.loadBanner(this.f17471e, this.f17468b.getBannerSettings(), this);
        }
    }
}
