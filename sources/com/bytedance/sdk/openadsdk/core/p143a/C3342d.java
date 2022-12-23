package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.core.C3502k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.d */
/* compiled from: FullScreenVideoAdListenerAdapter */
public class C3342d implements TTAdNative.FullScreenVideoAdListener {

    /* renamed from: a */
    TTAdNative.FullScreenVideoAdListener f8011a;

    public C3342d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f8011a = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8011a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8011a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3342d.this.f8011a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f8011a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8011a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3342d.this.f8011a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f8011a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8011a.onFullScreenVideoCached();
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3342d.this.f8011a.onFullScreenVideoCached();
                    }
                });
            }
        }
    }
}
