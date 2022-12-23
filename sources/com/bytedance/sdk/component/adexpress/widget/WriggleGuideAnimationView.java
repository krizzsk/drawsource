package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2915u;

public class WriggleGuideAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f6009a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6010b;

    /* renamed from: c */
    private C2915u f6011c;

    /* renamed from: d */
    private TextView f6012d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2706a f6013e;

    /* renamed from: f */
    private LinearLayout f6014f;

    /* renamed from: g */
    private WriggleGuideView f6015g;

    /* renamed from: h */
    private int f6016h;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$a */
    public interface C2706a {
        /* renamed from: a */
        void mo17235a();
    }

    public WriggleGuideAnimationView(Context context, int i, int i2) {
        super(context);
        this.f6016h = i2;
        m7305a(context, i);
    }

    /* renamed from: a */
    private void m7305a(Context context, int i) {
        inflate(context, i, this);
        this.f6014f = (LinearLayout) findViewById(C2914t.m8158e(context, "tt_interact_splash_wriggle_layout"));
        this.f6010b = (ImageView) findViewById(C2914t.m8158e(context, "tt_interact_splash_top_img"));
        this.f6015g = (WriggleGuideView) findViewById(C2914t.m8158e(context, "tt_interact_splash_progress_img"));
        this.f6009a = (TextView) findViewById(C2914t.m8158e(context, "tt_interact_splash_top_text"));
        this.f6012d = (TextView) findViewById(C2914t.m8158e(context, "tt_interact_splash_click_bar_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6014f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f6012d.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.f6014f;
    }

    public WriggleGuideView getWriggleProgressIv() {
        return this.f6015g;
    }

    public TextView getTopTextView() {
        return this.f6009a;
    }

    public void setOnShakeViewListener(C2706a aVar) {
        this.f6013e = aVar;
    }

    /* renamed from: a */
    public void mo17368a() {
        postDelayed(new Runnable() {
            public void run() {
                if (WriggleGuideAnimationView.this.f6010b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -35.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new C2707b());
                    rotateAnimation.setDuration(1500);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            WriggleGuideAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    WriggleGuideAnimationView.this.f6010b.startAnimation(rotateAnimation);
                                }
                            }, 300);
                        }
                    });
                    WriggleGuideAnimationView.this.f6010b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$b */
    private static class C2707b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.4f ? f * 2.5f : f <= 0.8f ? (f * -2.2f) + 1.86f : (f * -0.7f) + 0.7f;
        }

        private C2707b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f6011c == null) {
                this.f6011c = new C2915u(getContext().getApplicationContext());
            }
            this.f6011c.mo17822a((C2915u.C2916a) new C2915u.C2916a() {
                /* renamed from: a */
                public void mo17335a(int i) {
                    if (i == 2 && WriggleGuideAnimationView.this.isShown() && WriggleGuideAnimationView.this.f6013e != null) {
                        WriggleGuideAnimationView.this.f6013e.mo17235a();
                    }
                }
            });
            this.f6011c.mo17824b((float) this.f6016h);
            this.f6011c.mo17820a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2915u uVar = this.f6011c;
        if (uVar != null) {
            uVar.mo17823b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2915u uVar = this.f6011c;
        if (uVar == null) {
            return;
        }
        if (z) {
            uVar.mo17820a();
        } else {
            uVar.mo17823b();
        }
    }
}
