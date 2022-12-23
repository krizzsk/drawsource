package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.C6694b;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* renamed from: com.ironsource.mediationsdk.ae */
public final class C6577ae extends C6694b {

    /* renamed from: c */
    private static final C6577ae f17044c = new C6577ae();

    /* renamed from: a */
    public RewardedVideoListener f17045a = null;

    /* renamed from: b */
    public LevelPlayRewardedVideoBaseListener f17046b;

    private C6577ae() {
    }

    /* renamed from: a */
    public static C6577ae m20001a() {
        return f17044c;
    }

    /* renamed from: a */
    public final void mo36559a(final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                    }
                }
            });
        }
        if (this.f17046b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        C6577ae.this.f17046b.onAdOpened(C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + C6577ae.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36560a(final IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.f17045a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        ((RewardedVideoManualListener) C6577ae.this.f17045a).onRewardedVideoAdLoadFailed(ironSourceError);
                        C6577ae aeVar = C6577ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f17046b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        ((LevelPlayRewardedVideoManualListener) C6577ae.this.f17046b).onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36561a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdShowFailed(ironSourceError);
                        C6577ae aeVar = C6577ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f17046b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        C6577ae.this.f17046b.onAdShowFailed(ironSourceError, C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + C6577ae.this.mo36896f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36562a(final Placement placement, final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdRewarded(placement);
                        C6577ae aeVar = C6577ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.f17046b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        C6577ae.this.f17046b.onAdRewarded(placement, C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdRewarded() placement = " + placement + ", adInfo = " + C6577ae.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36563a(final boolean z, final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAvailabilityChanged(z);
                        C6577ae aeVar = C6577ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f17046b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b == null) {
                        return;
                    }
                    if (z) {
                        ((LevelPlayRewardedVideoListener) C6577ae.this.f17046b).onAdAvailable(C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdAvailable() adInfo = " + C6577ae.this.mo36896f(adInfo));
                        return;
                    }
                    ((LevelPlayRewardedVideoListener) C6577ae.this.f17046b).onAdUnavailable();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36564b() {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdStarted();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36565b(final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                    }
                }
            });
        }
        if (this.f17046b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        C6577ae.this.f17046b.onAdClosed(C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + C6577ae.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36566b(final Placement placement, final AdInfo adInfo) {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdClicked(placement);
                        C6577ae aeVar = C6577ae.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                    }
                }
            });
        }
        if (this.f17046b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17046b != null) {
                        C6577ae.this.f17046b.onAdClicked(placement, C6577ae.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() placement = " + placement + ", adInfo = " + C6577ae.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36567c() {
        if (this.f17045a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6577ae.this.f17045a != null) {
                        C6577ae.this.f17045a.onRewardedVideoAdEnded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                    }
                }
            });
        }
    }
}
