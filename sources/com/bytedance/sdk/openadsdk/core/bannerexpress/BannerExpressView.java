package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class BannerExpressView extends FrameLayout {

    /* renamed from: a */
    protected final Context f8122a;

    /* renamed from: b */
    protected NativeExpressView f8123b;

    /* renamed from: c */
    protected NativeExpressView f8124c;

    /* renamed from: d */
    protected C3431n f8125d;

    /* renamed from: e */
    protected AdSlot f8126e;

    /* renamed from: f */
    protected TTNativeExpressAd.ExpressAdInteractionListener f8127f;

    /* renamed from: g */
    protected TTNativeExpressAd.ExpressVideoAdListener f8128g;

    /* renamed from: h */
    protected int f8129h;

    /* renamed from: i */
    protected boolean f8130i;

    /* renamed from: j */
    protected String f8131j = "banner_ad";

    public BannerExpressView(Context context, C3431n nVar, AdSlot adSlot) {
        super(context);
        this.f8122a = context;
        this.f8125d = nVar;
        this.f8126e = adSlot;
        mo19337a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19337a() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f8122a, this.f8125d, this.f8126e, this.f8131j);
        this.f8123b = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo19338a(C3431n nVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f8122a, nVar, adSlot, this.f8131j);
        this.f8124c = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressView.this.f8127f != null) {
                    BannerExpressView.this.f8127f.onAdClicked(BannerExpressView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressView.this.mo19340a(f, f2);
                if (BannerExpressView.this.f8124c != null) {
                    BannerExpressView.this.f8124c.setSoundMute(true);
                }
                BannerExpressView.this.mo19344e();
            }
        });
        C3904y.m12853a((View) this.f8124c, 8);
        addView(this.f8124c, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f8128g = expressVideoAdListener;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8127f = expressAdInteractionListener;
        NativeExpressView nativeExpressView = this.f8123b;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
                public void onAdShow(View view, int i) {
                }

                public void onAdClicked(View view, int i) {
                    if (BannerExpressView.this.f8127f != null) {
                        BannerExpressView.this.f8127f.onAdClicked(BannerExpressView.this, i);
                    }
                }

                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.f8127f != null) {
                        BannerExpressView.this.f8127f.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                public void onRenderSuccess(View view, float f, float f2) {
                    if (BannerExpressView.this.f8123b != null) {
                        BannerExpressView.this.f8123b.setSoundMute(true);
                    }
                    BannerExpressView.this.mo19340a(f, f2);
                    if (BannerExpressView.this.f8127f != null) {
                        BannerExpressView.this.f8127f.onRenderSuccess(BannerExpressView.this, f, f2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19340a(float f, float f2) {
        int b = (int) C3904y.m12868b(this.f8122a, f);
        int b2 = (int) C3904y.m12868b(this.f8122a, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(b, b2);
        }
        layoutParams.width = b;
        layoutParams.height = b2;
        setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo19341b() {
        NativeExpressView nativeExpressView = this.f8123b;
        if (nativeExpressView != null) {
            nativeExpressView.mo20035j();
        }
    }

    /* renamed from: c */
    public void mo19342c() {
        if (this.f8123b != null) {
            C3457h.m10580d().mo19766f(this.f8123b.getClosedListenerKey());
            removeView(this.f8123b);
            this.f8123b.mo20037l();
            this.f8123b = null;
        }
        if (this.f8124c != null) {
            C3457h.m10580d().mo19766f(this.f8124c.getClosedListenerKey());
            removeView(this.f8124c);
            this.f8124c.mo20037l();
            this.f8124c = null;
        }
        C3457h.m10580d().mo19783w();
    }

    public NativeExpressView getCurView() {
        return this.f8123b;
    }

    public NativeExpressView getNextView() {
        return this.f8124c;
    }

    public void setDuration(int i) {
        this.f8129h = i;
    }

    /* renamed from: a */
    private ObjectAnimator m10029a(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{0.0f, (float) (-getWidth())});
    }

    /* renamed from: b */
    private ObjectAnimator m10031b(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{(float) getWidth(), 0.0f});
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.f8130i = false;
                BannerExpressView.this.m10032g();
            }
        });
        return ofFloat;
    }

    /* renamed from: d */
    public void mo19343d() {
        NativeExpressView nativeExpressView = this.f8124c;
        if (nativeExpressView != null) {
            nativeExpressView.mo20035j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19344e() {
        try {
            if (!this.f8130i && this.f8124c != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(m10029a(this.f8123b)).with(m10031b(this.f8124c));
                animatorSet.setDuration((long) this.f8129h).start();
                C3904y.m12853a((View) this.f8124c, 0);
                this.f8130i = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean mo19345f() {
        return this.f8124c != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m10032g() {
        NativeExpressView nativeExpressView = this.f8123b;
        this.f8123b = this.f8124c;
        this.f8124c = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f8124c.mo20037l();
            this.f8124c = null;
        }
    }
}
