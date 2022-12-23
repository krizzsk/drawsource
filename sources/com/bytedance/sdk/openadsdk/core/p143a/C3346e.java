package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3502k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.e */
/* compiled from: NativeAdListenerAdapter */
public class C3346e implements TTAdNative.NativeAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.NativeAdListener f8018a;

    public C3346e(TTAdNative.NativeAdListener nativeAdListener) {
        this.f8018a = nativeAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8018a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8018a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3346e.this.f8018a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeAdLoad(final List<TTNativeAd> list) {
        if (this.f8018a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8018a.onNativeAdLoad(list);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3346e.this.f8018a.onNativeAdLoad(list);
                    }
                });
            }
        }
    }
}
