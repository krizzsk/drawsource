package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.i */
public final class C6701i implements InterstitialListener, RewardedVideoListener, SegmentListener, C6698f {

    /* renamed from: a */
    public RewardedVideoListener f17491a;

    /* renamed from: b */
    public InterstitialListener f17492b;

    /* renamed from: c */
    public OfferwallListener f17493c;

    /* renamed from: d */
    public SegmentListener f17494d;

    /* renamed from: e */
    public InterstitialPlacement f17495e = null;

    /* renamed from: f */
    public String f17496f = null;

    /* renamed from: g */
    private C6723a f17497g;

    /* renamed from: h */
    private long f17498h;

    /* renamed from: com.ironsource.mediationsdk.sdk.i$a */
    class C6723a extends Thread {

        /* renamed from: a */
        Handler f17530a;

        private C6723a() {
        }

        /* synthetic */ C6723a(C6701i iVar, byte b) {
            this();
        }

        public final void run() {
            Looper.prepare();
            this.f17530a = new Handler();
            Looper.loop();
        }
    }

    public C6701i() {
        C6723a aVar = new C6723a(this, (byte) 0);
        this.f17497g = aVar;
        aVar.start();
        this.f17498h = new Date().getTime();
    }

    /* renamed from: a */
    private void m20361a(Runnable runnable) {
        Handler handler;
        C6723a aVar = this.f17497g;
        if (aVar != null && (handler = aVar.f17530a) != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    private boolean m20362a(Object obj) {
        return (obj == null || this.f17497g == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo36916a(final IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f17496f)) {
                mediationAdditionalData.put("placement", this.f17496f);
            }
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6522h.m19751d().mo36349b(new C6517c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdShowFailed(ironSourceError);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36242a(final boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6522h.m19751d().mo36349b(new C6517c(302, mediationAdditionalData));
        if (m20362a((Object) this.f17493c)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17493c.onOfferwallAvailable(z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36917a(final boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.f17498h;
        this.f17498h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6522h.m19751d().mo36349b(new C6517c(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAvailabilityChanged(z);
                }
            });
        }
    }

    public final void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (m20362a((Object) this.f17493c)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17493c.onGetOfferwallCreditsFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdClicked();
                }
            });
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdClosed();
                }
            });
        }
    }

    public final void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdLoadFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdOpened();
                }
            });
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdReady();
                }
            });
        }
    }

    public final void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (this.f17495e != null && !TextUtils.isEmpty(this.f17495e.getPlacementName())) {
                mediationAdditionalData.put("placement", this.f17495e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6518d.m19731d().mo36349b(new C6517c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (m20362a((Object) this.f17492b)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17492b.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.f17493c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo36242a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (m20362a((Object) this.f17493c)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17493c.onOfferwallClosed();
                }
            });
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (m20362a((Object) this.f17493c)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17493c.onOfferwallOpened();
                }
            });
        }
    }

    public final void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (m20362a((Object) this.f17493c)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17493c.onOfferwallShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onRewardedVideoAdClicked(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdClicked(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdClosed();
                }
            });
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdEnded();
                }
            });
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdOpened();
                }
            });
        }
    }

    public final void onRewardedVideoAdRewarded(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdRewarded(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo36916a(ironSourceError, (Map<String, Object>) null);
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (m20362a((Object) this.f17491a)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    C6701i.this.f17491a.onRewardedVideoAdStarted();
                }
            });
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        mo36917a(z, (Map<String, Object>) null);
    }

    public final void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m20362a((Object) this.f17494d)) {
            m20361a((Runnable) new Runnable() {
                public final void run() {
                    if (!TextUtils.isEmpty(str)) {
                        C6701i.this.f17494d.onSegmentReceived(str);
                    }
                }
            });
        }
    }
}
