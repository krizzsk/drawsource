package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.core.C3502k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.b */
/* compiled from: AppOpenAdListenerAdapter */
public class C3336b implements TTAdNative.AppOpenAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TTAdNative.AppOpenAdListener f7999a;

    public C3336b(TTAdNative.AppOpenAdListener appOpenAdListener) {
        this.f7999a = appOpenAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f7999a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f7999a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3336b.this.f7999a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onAppOpenAdLoaded(final TTAppOpenAd tTAppOpenAd) {
        if (this.f7999a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f7999a.onAppOpenAdLoaded(tTAppOpenAd);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3336b.this.f7999a.onAppOpenAdLoaded(tTAppOpenAd);
                    }
                });
            }
        }
    }
}
