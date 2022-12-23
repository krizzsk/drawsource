package com.bytedance.sdk.openadsdk.component.p135b;

import android.content.Context;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p150f.C3443a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.b */
/* compiled from: TTFeedAdImpl */
class C3197b extends C3443a implements C2405c.C2408c, C2405c.C2409d, TTFeedAd, C3949a.C3950a {

    /* renamed from: a */
    C3949a f7515a;

    /* renamed from: b */
    boolean f7516b = false;

    /* renamed from: c */
    boolean f7517c = true;

    /* renamed from: d */
    int f7518d;

    /* renamed from: e */
    AdSlot f7519e;

    /* renamed from: f */
    int f7520f;

    /* renamed from: m */
    private TTFeedAd.VideoAdListener f7521m;

    /* renamed from: n */
    private WeakReference<NativeVideoTsView> f7522n;

    C3197b(Context context, C3431n nVar, int i, AdSlot adSlot) {
        super(context, nVar, i);
        this.f7520f = i;
        this.f7519e = adSlot;
        this.f7515a = new C3949a();
        int f = C3898x.m12794f(this.f8486h);
        this.f7518d = f;
        m9240a(f);
        mo18855a("embeded_ad");
    }

    public View getAdView() {
        NativeVideoTsView nativeVideoTsView;
        if (!(this.f8486h == null || this.f8487i == null)) {
            if (C3431n.m10311c(this.f8486h)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f8487i, this.f8486h, this.f8485g.mo19975a());
                    this.f7522n = new WeakReference<>(nativeVideoTsView);
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.C3629a() {
                        /* renamed from: a */
                        public void mo18857a(View view, int i) {
                            if (C3197b.this.f8485g != null) {
                                C3197b.this.f8485g.mo19976a(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C3630b() {
                        /* renamed from: a */
                        public void mo18858a(boolean z, long j, long j2, long j3, boolean z2) {
                            C3197b.this.f7515a.f10056a = z;
                            C3197b.this.f7515a.f10060e = j;
                            C3197b.this.f7515a.f10061f = j2;
                            C3197b.this.f7515a.f10062g = j3;
                            C3197b.this.f7515a.f10059d = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.f7520f) {
                        nativeVideoTsView.setIsAutoPlay(this.f7516b ? this.f7519e.isAutoPlay() : this.f7517c);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.f7517c);
                    }
                    nativeVideoTsView.setIsQuiet(C3513m.m10973h().mo19837a(this.f7518d));
                } catch (Exception unused) {
                }
                if (C3431n.m10311c(this.f8486h) || nativeVideoTsView == null || !nativeVideoTsView.mo20207a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C3431n.m10311c(this.f8486h)) {
            }
        }
        return null;
    }

    public void play() {
        try {
            if (this.f7522n != null && this.f7522n.get() != null && this.f7516b) {
                ((NativeVideoTsView) this.f7522n.get()).mo20218m();
            }
        } catch (Throwable unused) {
        }
    }

    public void pause() {
        try {
            if (this.f7522n != null && this.f7522n.get() != null && this.f7516b) {
                ((NativeVideoTsView) this.f7522n.get()).mo20216k();
            }
        } catch (Throwable unused) {
        }
    }

    public double currentPlayTime() {
        try {
            if (this.f7522n == null || this.f7522n.get() == null || !this.f7516b) {
                return 0.0d;
            }
            return ((NativeVideoTsView) this.f7522n.get()).getCurrentPlayTime();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    private void m9240a(int i) {
        int c = C3513m.m10973h().mo19841c(i);
        if (3 == c) {
            this.f7516b = false;
            this.f7517c = false;
        } else if (4 == c) {
            this.f7516b = true;
        } else {
            int c2 = C2909o.m8136c(C3513m.m10963a());
            if (1 == c && C3898x.m12793e(c2)) {
                this.f7516b = false;
                this.f7517c = true;
            } else if (2 == c) {
                if (C3898x.m12798f(c2) || C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
                    this.f7516b = false;
                    this.f7517c = true;
                }
            } else if (5 != c) {
            } else {
                if (C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
                    this.f7517c = true;
                }
            }
        }
    }

    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        this.f7521m = videoAdListener;
    }

    public double getVideoDuration() {
        if (this.f8486h == null || this.f8486h.mo19517J() == null) {
            return 0.0d;
        }
        return this.f8486h.mo19517J().mo15946f();
    }

    /* renamed from: e_ */
    public void mo16066e_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoLoad(this);
        }
    }

    /* renamed from: a */
    public void mo16065a(int i, int i2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoError(i, i2);
        }
    }

    /* renamed from: a_ */
    public void mo16061a_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdStartPlay(this);
        }
    }

    /* renamed from: b_ */
    public void mo16062b_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdPaused(this);
        }
    }

    /* renamed from: c_ */
    public void mo16063c_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdContinuePlay(this);
        }
    }

    /* renamed from: a */
    public void mo16060a(long j, long j2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onProgressUpdate(j, j2);
        }
    }

    /* renamed from: d_ */
    public void mo16064d_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7521m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdComplete(this);
        }
    }

    /* renamed from: f */
    public C3949a mo18856f() {
        return this.f7515a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18855a(String str) {
        super.mo18855a(str);
    }
}
