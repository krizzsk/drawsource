package com.bytedance.sdk.openadsdk.core.p143a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C3502k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.c */
/* compiled from: FeedAdListenerAdapter */
public class C3339c implements TTAdNative.FeedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.FeedAdListener f8005a = null;

    public C3339c(TTAdNative.FeedAdListener feedAdListener) {
        this.f8005a = feedAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8005a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8005a.onError(i, str);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3339c.this.f8005a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFeedAdLoad(final List<TTFeedAd> list) {
        if (this.f8005a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8005a.onFeedAdLoad(list);
            } else {
                C3502k.m10922d().post(new Runnable() {
                    public void run() {
                        C3339c.this.f8005a.onFeedAdLoad(list);
                    }
                });
            }
        }
    }
}
