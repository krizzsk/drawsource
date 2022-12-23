package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.C3502k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.g */
/* compiled from: RewardVideoAdListenerAdapter */
public class C3352g implements TTAdNative.RewardVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.RewardVideoAdListener f8030a;

    public C3352g(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f8030a = rewardVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8030a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8030a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3352g.this.f8030a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f8030a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8030a.onRewardVideoAdLoad(tTRewardVideoAd);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3352g.this.f8030a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                });
            }
        }
    }

    public void onRewardVideoCached() {
        if (this.f8030a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8030a.onRewardVideoCached();
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3352g.this.f8030a.onRewardVideoCached();
                    }
                });
            }
        }
    }
}
