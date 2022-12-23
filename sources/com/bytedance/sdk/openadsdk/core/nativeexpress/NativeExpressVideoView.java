package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundFrameLayout;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class NativeExpressVideoView extends NativeExpressView implements C2405c.C2408c, C2405c.C2409d, C3552j {

    /* renamed from: a */
    int f8823a = 1;

    /* renamed from: b */
    boolean f8824b = false;

    /* renamed from: c */
    boolean f8825c = true;

    /* renamed from: d */
    int f8826d;

    /* renamed from: e */
    boolean f8827e = true;

    /* renamed from: u */
    private ExpressVideoView f8828u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C3949a f8829v;

    /* renamed from: w */
    private long f8830w;

    /* renamed from: x */
    private long f8831x;

    /* renamed from: b */
    public void mo18408b() {
    }

    /* renamed from: e */
    public void mo18412e() {
    }

    public NativeExpressVideoView(Context context, C3431n nVar, AdSlot adSlot, String str) {
        super(context, nVar, adSlot, str, false);
        mo20019h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo20019h() {
        this.f8869k = new RoundFrameLayout(this.f8864f);
        int f = C3898x.m12794f(this.f8867i);
        this.f8826d = f;
        mo20017c(f);
        m11014o();
        addView(this.f8869k, new FrameLayout.LayoutParams(-1, -1));
        super.mo19177g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    /* renamed from: o */
    private void m11014o() {
        try {
            this.f8829v = new C3949a();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.f8864f, this.f8867i, this.f8865g, this.f8875r);
            this.f8828u = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.f8828u.setControllerStatusCallBack(new NativeVideoTsView.C3630b() {
                /* renamed from: a */
                public void mo18858a(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.f8829v.f10056a = z;
                    NativeExpressVideoView.this.f8829v.f10060e = j;
                    NativeExpressVideoView.this.f8829v.f10061f = j2;
                    NativeExpressVideoView.this.f8829v.f10062g = j3;
                    NativeExpressVideoView.this.f8829v.f10059d = z2;
                }
            });
            this.f8828u.setVideoAdLoadListener(this);
            this.f8828u.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f8865g)) {
                this.f8828u.setIsAutoPlay(this.f8824b ? this.f8866h.isAutoPlay() : this.f8825c);
            } else if ("open_ad".equals(this.f8865g)) {
                this.f8828u.setIsAutoPlay(true);
            } else {
                this.f8828u.setIsAutoPlay(this.f8825c);
            }
            if ("open_ad".equals(this.f8865g)) {
                this.f8828u.setIsQuiet(true);
            } else {
                this.f8828u.setIsQuiet(C3513m.m10973h().mo19837a(this.f8826d));
            }
            this.f8828u.mo20006d();
        } catch (Exception unused) {
            this.f8828u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20017c(int i) {
        int c = C3513m.m10973h().mo19841c(i);
        if (3 == c) {
            this.f8824b = false;
            this.f8825c = false;
        } else if (4 == c) {
            this.f8824b = true;
        } else {
            int c2 = C2909o.m8136c(C3513m.m10963a());
            if (1 == c) {
                this.f8824b = false;
                this.f8825c = C3898x.m12793e(c2);
            } else if (2 == c) {
                if (C3898x.m12798f(c2) || C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
                    this.f8824b = false;
                    this.f8825c = true;
                }
            } else if (5 == c && (C3898x.m12793e(c2) || C3898x.m12803g(c2))) {
                this.f8824b = false;
                this.f8825c = true;
            }
        }
        if (!this.f8825c) {
            this.f8823a = 3;
        }
        C2905l.m8114c("NativeVideoAdView", "mIsAutoPlay=" + this.f8825c + ",status=" + c);
    }

    public C3949a getVideoModel() {
        return this.f8829v;
    }

    public void setCanInterruptVideoPlay(boolean z) {
        ExpressVideoView expressVideoView = this.f8828u;
        if (expressVideoView != null) {
            expressVideoView.setCanInterruptVideoPlay(z);
        }
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.f8828u;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    /* renamed from: a */
    public void mo16730a(C2553d<? extends View> dVar, C2565m mVar) {
        this.f8877t = dVar;
        if ((this.f8877t instanceof C3559o) && ((C3559o) this.f8877t).mo20109p() != null) {
            ((C3559o) this.f8877t).mo20109p().mo20338a((C3552j) this);
        }
        if (mVar != null && mVar.mo16708a()) {
            m11011a(mVar);
        }
        super.mo16730a(dVar, mVar);
    }

    /* renamed from: a */
    private void m11011a(final C2565m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m11013b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        NativeExpressVideoView.this.m11013b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11013b(C2565m mVar) {
        if (mVar != null) {
            double d = mVar.mo16717d();
            double e = mVar.mo16720e();
            double f = mVar.mo16722f();
            double g = mVar.mo16724g();
            int b = (int) C3904y.m12868b(this.f8864f, (float) d);
            int b2 = (int) C3904y.m12868b(this.f8864f, (float) e);
            int b3 = (int) C3904y.m12868b(this.f8864f, (float) f);
            int b4 = (int) C3904y.m12868b(this.f8864f, (float) g);
            float b5 = C3904y.m12868b(this.f8864f, mVar.mo16726i());
            float b6 = C3904y.m12868b(this.f8864f, mVar.mo16727j());
            float b7 = C3904y.m12868b(this.f8864f, mVar.mo16728k());
            float b8 = C3904y.m12868b(this.f8864f, mVar.mo16729l());
            C2905l.m8111b("ExpressView", "videoWidth:" + f);
            C2905l.m8111b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8869k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f8869k.setLayoutParams(layoutParams);
            this.f8869k.removeAllViews();
            if (this.f8828u != null) {
                this.f8869k.addView(this.f8828u);
                ((RoundFrameLayout) this.f8869k).mo20394a(b5, b6, b7, b8);
                this.f8828u.mo20207a(0, true, false);
                mo20017c(this.f8826d);
                if (!C2909o.m8137d(this.f8864f) && !this.f8825c && this.f8827e) {
                    this.f8828u.mo20007e();
                }
                setShowAdInteractionView(false);
            }
        }
    }

    /* renamed from: a */
    public void mo18407a(boolean z) {
        C2905l.m8111b("NativeExpressVideoView", "onMuteVideo,mute:" + z);
        ExpressVideoView expressVideoView = this.f8828u;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo18405a() {
        C2905l.m8111b("NativeExpressVideoView", "onSkipVideo");
    }

    /* renamed from: a */
    public void mo18406a(int i) {
        C2905l.m8111b("NativeExpressVideoView", "onChangeVideoState,stateType:" + i);
        ExpressVideoView expressVideoView = this.f8828u;
        if (expressVideoView == null) {
            C2905l.m8118e("NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i == 1) {
            expressVideoView.mo20207a(0, true, false);
        } else if (i == 2 || i == 3) {
            this.f8828u.setCanInterruptVideoPlay(true);
            this.f8828u.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().mo16041f();
        } else if (i == 5) {
            expressVideoView.mo20207a(0, true, false);
        }
    }

    /* renamed from: a */
    public void mo16644a(View view, int i, C2548b bVar) {
        if (i != -1 && bVar != null) {
            if (i != 4) {
                if (i != 11) {
                    super.mo16644a(view, i, bVar);
                    return;
                }
            } else if (this.f8865g == "draw_ad") {
                ExpressVideoView expressVideoView = this.f8828u;
                if (expressVideoView != null) {
                    expressVideoView.performClick();
                    return;
                }
                return;
            }
            try {
                if (this.f8828u != null) {
                    this.f8828u.setCanInterruptVideoPlay(true);
                    this.f8828u.performClick();
                    if (this.f8870l) {
                        this.f8828u.findViewById(C2914t.m8158e(this.f8828u.getContext(), "tt_video_play")).setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public long mo18410c() {
        return this.f8830w;
    }

    /* renamed from: d */
    public int mo18411d() {
        ExpressVideoView expressVideoView;
        if (this.f8823a == 3 && (expressVideoView = this.f8828u) != null) {
            expressVideoView.mo20006d();
        }
        ExpressVideoView expressVideoView2 = this.f8828u;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().mo16053r()) {
            return this.f8823a;
        }
        return 1;
    }

    /* renamed from: a_ */
    public void mo16061a_() {
        this.f8827e = false;
        C2905l.m8111b("NativeExpressVideoView", "onVideoAdStartPlay");
        if (this.f8868j != null) {
            this.f8868j.onVideoAdStartPlay();
        }
        this.f8823a = 2;
    }

    /* renamed from: b_ */
    public void mo16062b_() {
        this.f8827e = false;
        C2905l.m8111b("NativeExpressVideoView", "onVideoAdPaused");
        if (this.f8868j != null) {
            this.f8868j.onVideoAdPaused();
        }
        this.f8870l = true;
        this.f8823a = 3;
    }

    /* renamed from: c_ */
    public void mo16063c_() {
        this.f8827e = false;
        C2905l.m8111b("NativeExpressVideoView", "onVideoAdContinuePlay");
        if (this.f8868j != null) {
            this.f8868j.onVideoAdContinuePlay();
        }
        this.f8870l = false;
        this.f8823a = 2;
    }

    /* renamed from: a */
    public void mo16060a(long j, long j2) {
        this.f8827e = false;
        if (this.f8868j != null) {
            this.f8868j.onProgressUpdate(j, j2);
        }
        int i = this.f8823a;
        if (!(i == 5 || i == 3 || j <= this.f8830w)) {
            this.f8823a = 2;
        }
        this.f8830w = j;
        this.f8831x = j2;
        if (this.f8876s != null && this.f8876s.mo16637d() != null) {
            this.f8876s.mo16637d().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
    }

    /* renamed from: d_ */
    public void mo16064d_() {
        this.f8827e = false;
        C2905l.m8111b("NativeExpressVideoView", "onVideoComplete");
        if (this.f8868j != null) {
            this.f8868j.onVideoAdComplete();
        }
        this.f8823a = 5;
        if (this.f8876s != null && this.f8876s.mo16637d() != null) {
            this.f8876s.mo16637d().mo17098f();
        }
    }

    /* renamed from: e_ */
    public void mo16066e_() {
        C2905l.m8111b("NativeExpressVideoView", "onVideoLoad");
        if (this.f8868j != null) {
            this.f8868j.onVideoLoad();
        }
    }

    /* renamed from: a */
    public void mo16065a(int i, int i2) {
        C2905l.m8111b("NativeExpressVideoView", "onVideoError,errorCode:" + i + ",extraCode:" + i2);
        if (this.f8868j != null) {
            this.f8868j.onVideoError(i, i2);
        }
        this.f8830w = this.f8831x;
        this.f8823a = 4;
    }
}
