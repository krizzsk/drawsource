package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3502k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.f */
/* compiled from: NativeExpressAdListenerAdapter */
public class C3349f implements TTAdNative.NativeExpressAdListener {

    /* renamed from: a */
    TTAdNative.NativeExpressAdListener f8024a;

    public C3349f(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f8024a = nativeExpressAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8024a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8024a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3349f.this.f8024a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeExpressAdLoad(final List<TTNativeExpressAd> list) {
        if (this.f8024a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8024a.onNativeExpressAdLoad(list);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3349f.this.f8024a.onNativeExpressAdLoad(list);
                    }
                });
            }
        }
    }
}
