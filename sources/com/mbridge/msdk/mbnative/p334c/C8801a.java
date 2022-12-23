package com.mbridge.msdk.mbnative.p334c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.mbnative.p335d.C8835a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.mbnative.c.a */
/* compiled from: AdListenerProxy */
public class C8801a implements NativeListener.NativeAdListener {

    /* renamed from: a */
    private static final String f21619a = C8801a.class.getSimpleName();

    /* renamed from: b */
    private NativeListener.NativeAdListener f21620b;

    /* renamed from: c */
    private boolean f21621c = false;

    /* renamed from: d */
    private String f21622d;

    /* renamed from: e */
    private Context f21623e;

    /* renamed from: f */
    private boolean f21624f;

    /* renamed from: a */
    public final void mo58487a(boolean z) {
        this.f21624f = z;
    }

    /* renamed from: a */
    public final void mo58486a(String str) {
        this.f21622d = str;
    }

    public C8801a() {
    }

    public C8801a(NativeListener.NativeAdListener nativeAdListener) {
        this.f21620b = nativeAdListener;
    }

    /* renamed from: a */
    public final boolean mo58488a() {
        return this.f21621c;
    }

    /* renamed from: b */
    public final void mo58489b() {
        this.f21621c = true;
    }

    public void onAdLoaded(List<Campaign> list, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f21621c = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f21620b == null) {
                return;
            }
            if (copyOnWriteArrayList.size() > 0) {
                this.f21620b.onAdLoaded(copyOnWriteArrayList, i);
            } else {
                this.f21620b.onAdLoaded(list, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdLoadError(String str) {
        this.f21621c = false;
        NativeListener.NativeAdListener nativeAdListener = this.f21620b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f21623e == null) {
                this.f21623e = C8388a.m23845e().mo56913g();
            }
            if (!TextUtils.isEmpty(this.f21622d)) {
                C8835a.m25504a(this.f21623e, str, this.f21622d, this.f21624f);
            }
        }
    }

    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f21620b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f21620b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    public void onLoggingImpression(int i) {
        NativeListener.NativeAdListener nativeAdListener = this.f21620b;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i);
        }
    }
}
