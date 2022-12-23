package com.bytedance.sdk.openadsdk.component.reward;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.f */
/* compiled from: RewardFullProxyListener */
public class C3277f implements TTAdNative.FullScreenVideoAdListener, TTAdNative.RewardVideoAdListener {

    /* renamed from: a */
    final TTAdNative.RewardVideoAdListener f7776a;

    /* renamed from: b */
    final TTAdNative.FullScreenVideoAdListener f7777b;

    public C3277f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f7776a = rewardVideoAdListener;
        this.f7777b = null;
    }

    public C3277f(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f7776a = null;
        this.f7777b = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f7776a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7776a != null) {
                        C3277f.this.f7776a.onError(i, str);
                    }
                }
            });
        }
        if (this.f7777b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7777b != null) {
                        C3277f.this.f7777b.onError(i, str);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f7777b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7777b != null) {
                        C3277f.this.f7777b.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f7777b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7777b != null) {
                        C3277f.this.f7777b.onFullScreenVideoCached();
                    }
                }
            });
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f7776a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7776a != null) {
                        C3277f.this.f7776a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                }
            });
        }
    }

    public void onRewardVideoCached() {
        if (this.f7776a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3277f.this.f7776a != null) {
                        C3277f.this.f7776a.onRewardVideoCached();
                    }
                }
            });
        }
    }
}
