package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1552o;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;

public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$a */
    private static class C1435a extends Handler {
        private C1435a() {
        }

        public void handleMessage(Message message) {
            try {
                C1552o oVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (oVar != null) {
                    C1839e a = oVar.mo13211a();
                    if (message.what == C1436b.AD.mo12960a()) {
                        Bundle bundle = new Bundle();
                        bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, a.getRawFullResponse());
                        bundle.putInt("ad_source", a.getSource().mo14145a());
                        Message obtain = Message.obtain((Handler) null, C1436b.AD.mo12960a());
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    } else if (message.what == C1436b.AD_DISPLAYED.mo12960a()) {
                        C2053j.m4998a(oVar.mo13214c(), (AppLovinAd) a);
                    } else if (message.what == C1436b.AD_CLICKED.mo12960a()) {
                        C2053j.m4997a(oVar.mo13215d(), (AppLovinAd) a);
                    } else if (message.what == C1436b.AD_VIDEO_STARTED.mo12960a()) {
                        C2053j.m5002a(oVar.mo13213b(), (AppLovinAd) a);
                    } else if (message.what == C1436b.AD_VIDEO_ENDED.mo12960a()) {
                        Bundle data = message.getData();
                        C2053j.m5003a(oVar.mo13213b(), (AppLovinAd) a, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    } else if (message.what == C1436b.AD_HIDDEN.mo12960a()) {
                        C2053j.m5010b(oVar.mo13214c(), (AppLovinAd) a);
                    } else {
                        super.handleMessage(message);
                    }
                } else if (!Utils.getBooleanForProbability(1)) {
                    super.handleMessage(message);
                } else {
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
            } catch (RemoteException e) {
                if (C2102v.m5104a()) {
                    C2102v.m5106c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    public enum C1436b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: g */
        private final int f1677g;

        private C1436b(int i) {
            this.f1677g = i;
        }

        /* renamed from: a */
        public int mo12960a() {
            return this.f1677g;
        }
    }

    public IBinder onBind(Intent intent) {
        return new Messenger(new C1435a()).getBinder();
    }
}
