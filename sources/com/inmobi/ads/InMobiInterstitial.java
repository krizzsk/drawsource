package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.C5752ao;
import com.inmobi.media.C5840bp;
import com.inmobi.media.C5955e;
import com.inmobi.media.C6130gj;
import com.inmobi.media.C6167hk;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6184hx;
import com.inmobi.media.C6195ic;
import com.inmobi.media.C6215il;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiInterstitial {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f19564b = InMobiInterstitial.class.getSimpleName();

    /* renamed from: a */
    public InterstitialAdEventListener f19565a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5752ao f19566c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f19567d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f19568e = false;

    /* renamed from: f */
    private WeakReference<Context> f19569f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5840bp f19570g = new C5840bp();

    /* renamed from: h */
    private C8089a f19571h = new C8089a(this);

    /* renamed from: i */
    private PreloadManager f19572i = new PreloadManager() {

        /* renamed from: b */
        private C5955e f19574b = new C5955e(InMobiInterstitial.this);

        public final void preload() {
            boolean unused = InMobiInterstitial.this.f19568e = true;
            InMobiInterstitial.this.f19570g.f14694e = "NonAB";
            InMobiInterstitial.this.f19566c.mo34612a(InMobiInterstitial.this.f19570g, InMobiInterstitial.this.f19567d);
            InMobiInterstitial.this.f19566c.mo34611a((PublisherCallbacks) this.f19574b);
        }

        public final void load() {
            try {
                InMobiInterstitial.this.f19566c.mo34613l();
            } catch (IllegalStateException e) {
                C6195ic.m18378a((byte) 1, InMobiInterstitial.f19564b, e.getMessage());
                InMobiInterstitial.this.f19565a.onAdLoadFailed(InMobiInterstitial.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    };

    public InMobiInterstitial(Context context, long j, InterstitialAdEventListener interstitialAdEventListener) throws SdkNotInitializedException {
        if (C6183hw.m18323b()) {
            this.f19567d = context.getApplicationContext();
            this.f19570g.f14690a = j;
            this.f19569f = new WeakReference<>(context);
            this.f19565a = interstitialAdEventListener;
            this.f19566c = new C5752ao();
            return;
        }
        throw new SdkNotInitializedException(f19564b);
    }

    public final void setListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f19565a = interstitialAdEventListener;
    }

    public final void setKeywords(String str) {
        this.f19570g.f14691b = str;
    }

    public final void getSignals() {
        this.f19566c.mo34612a(this.f19570g, this.f19567d);
        this.f19566c.mo34652b((PublisherCallbacks) this.f19571h);
    }

    public final PreloadManager getPreloadManager() {
        return this.f19572i;
    }

    public final void load(byte[] bArr) {
        this.f19568e = true;
        this.f19570g.f14694e = "AB";
        this.f19566c.mo34612a(this.f19570g, this.f19567d);
        if (Build.VERSION.SDK_INT >= 29) {
            WeakReference<Context> weakReference = this.f19569f;
            C6215il.m18446a(weakReference == null ? null : (Context) weakReference.get());
        }
        this.f19566c.mo34580a(bArr, (PublisherCallbacks) this.f19571h);
    }

    public final void load() {
        try {
            this.f19568e = true;
            this.f19570g.f14694e = "NonAB";
            this.f19566c.mo34612a(this.f19570g, this.f19567d);
            if (Build.VERSION.SDK_INT >= 29) {
                C6215il.m18446a(this.f19569f == null ? null : (Context) this.f19569f.get());
            }
            this.f19566c.mo34611a((PublisherCallbacks) this.f19571h);
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19564b, "Unable to load ad; SDK encountered an unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    public final void show() {
        try {
            if (!this.f19568e) {
                C6195ic.m18378a((byte) 1, f19564b, "load() must be called before trying to show the ad");
            } else {
                this.f19566c.mo34615o();
            }
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, f19564b, "Unable to show ad; SDK encountered an unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    @Deprecated
    public final void show(int i, int i2) {
        C6195ic.m18378a((byte) 1, f19564b, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"show(int, int)"}));
        show();
    }

    public final boolean isReady() {
        return this.f19566c.mo34614n();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19566c.mo34648D();
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19566c.mo34647C();
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6184hx.m18346a(map.get("tp"));
            C6184hx.m18348b(map.get("tp-ver"));
        }
        this.f19570g.f14692c = map;
    }

    public final void setContentUrl(String str) {
        this.f19570g.f14695f = str;
    }

    public final void disableHardwareAcceleration() {
        this.f19570g.f14693d = true;
    }

    /* renamed from: com.inmobi.ads.InMobiInterstitial$a */
    public static final class C8089a extends C5955e {
        public final byte getType() {
            return 0;
        }

        C8089a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.f19566c.mo34613l();
                } catch (IllegalStateException e) {
                    C6195ic.m18378a((byte) 1, InMobiInterstitial.f19564b, e.getMessage());
                    inMobiInterstitial.f19565a.onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15093a.get();
            if (inMobiInterstitial != null && inMobiInterstitial.f19565a != null) {
                inMobiInterstitial.f19565a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
            }
        }
    }
}
