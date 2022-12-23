package com.ironsource.mediationsdk;

import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.C6694b;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.mediationsdk.n */
public final class C6668n extends C6694b {

    /* renamed from: c */
    private static final C6668n f17414c = new C6668n();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public BannerListener f17415a = null;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public LevelPlayBannerListener f17416b = null;

    private C6668n() {
    }

    /* renamed from: a */
    public static C6668n m20237a() {
        return f17414c;
    }

    /* renamed from: a */
    public final void mo36793a(final AdInfo adInfo) {
        if (this.f17415a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdScreenPresented();
                        IronLog.CALLBACK.info("onBannerAdScreenPresented()");
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdScreenPresented(C6668n.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenPresented() adInfo = " + C6668n.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36794a(final AdInfo adInfo, boolean z) {
        if (this.f17415a != null && !z) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdLoaded();
                        IronLog.CALLBACK.info("onBannerAdLoaded()");
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdLoaded(C6668n.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoaded() adInfo = " + C6668n.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36795a(final IronSourceError ironSourceError, boolean z) {
        if (this.f17415a != null && !z) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36796b(final AdInfo adInfo) {
        if (this.f17415a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdScreenDismissed();
                        IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdScreenDismissed(C6668n.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenDismissed() adInfo = " + C6668n.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo36797c(final AdInfo adInfo) {
        if (this.f17415a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdLeftApplication();
                        IronLog.CALLBACK.info("onBannerAdLeftApplication()");
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdLeftApplication(C6668n.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLeftApplication() adInfo = " + C6668n.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo36798d(final AdInfo adInfo) {
        if (this.f17415a != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17415a != null) {
                        C6668n.this.f17415a.onBannerAdClicked();
                        IronLog.CALLBACK.info("onBannerAdClicked()");
                    }
                }
            });
        }
        if (this.f17416b != null) {
            C6387c.f16171a.mo35896a(new Runnable() {
                public final void run() {
                    if (C6668n.this.f17416b != null) {
                        C6668n.this.f17416b.onAdClicked(C6668n.this.mo36896f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + C6668n.this.mo36896f(adInfo));
                    }
                }
            });
        }
    }
}
