package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C6694b;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.F */
public final class C6432F extends C6694b {

    /* renamed from: a */
    private static final C6432F f16275a = new C6432F();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InterstitialListener f16276b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LevelPlayInterstitialListener f16277c;

    private C6432F() {
    }

    /* renamed from: a */
    public static synchronized C6432F m19211a() {
        C6432F f;
        synchronized (C6432F.class) {
            f = f16275a;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo35995a(final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdReady();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdReady(C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdReady() adInfo = " + C6432F.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo35996a(final IronSourceError ironSourceError) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdLoadFailed(ironSourceError);
                        C6432F f = C6432F.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo35997a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdShowFailed(ironSourceError);
                        C6432F f = C6432F.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdShowFailed(ironSourceError, C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + C6432F.this.mo36896f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo35998a(InterstitialListener interstitialListener) {
        this.f16276b = interstitialListener;
    }

    /* renamed from: a */
    public final synchronized void mo35999a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f16277c = levelPlayInterstitialListener;
    }

    /* renamed from: b */
    public final void mo36000b(final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdOpened(C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + C6432F.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36001c(final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdClosed(C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + C6432F.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo36002d(final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdShowSucceeded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdShowSucceeded(C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowSucceeded() adInfo = " + C6432F.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo36003e(final AdInfo adInfo) {
        if (this.f16276b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16276b != null) {
                        C6432F.this.f16276b.onInterstitialAdClicked();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                    }
                }
            });
        }
        if (this.f16277c != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6432F.this.f16277c != null) {
                        C6432F.this.f16277c.onAdClicked(C6432F.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + C6432F.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }
}
