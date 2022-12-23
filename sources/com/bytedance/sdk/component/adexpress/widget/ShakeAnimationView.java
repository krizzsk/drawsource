package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
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

public class ShakeAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f5955a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f5956b;

    /* renamed from: c */
    private C2915u f5957c;

    /* renamed from: d */
    private TextView f5958d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2691a f5959e;

    /* renamed from: f */
    private LinearLayout f5960f;

    /* renamed from: g */
    private int f5961g;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$a */
    public interface C2691a {
        /* renamed from: a */
        void mo17232a();
    }

    public ShakeAnimationView(Context context, int i, int i2) {
        super(context);
        this.f5961g = i2;
        m7280a(context, i);
    }

    /* renamed from: a */
    private void m7280a(Context context, int i) {
        inflate(context, i, this);
        this.f5960f = (LinearLayout) findViewById(C2914t.m8158e(context, "tt_hand_container"));
        this.f5956b = (ImageView) findViewById(C2914t.m8158e(context, "tt_splash_rock_img"));
        this.f5955a = (TextView) findViewById(C2914t.m8158e(context, "tt_splash_rock_top_text"));
        this.f5958d = (TextView) findViewById(C2914t.m8158e(context, "tt_splash_rock_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f5960f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f5958d.setText(str);
    }

    public LinearLayout getShakeLayout() {
        return this.f5960f;
    }

    public void setOnShakeViewListener(C2691a aVar) {
        this.f5959e = aVar;
    }

    /* renamed from: a */
    public void mo17323a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
        postDelayed(new Runnable() {
            public void run() {
                if (ShakeAnimationView.this.f5956b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                    rotateAnimation.setInterpolator(new C2692b());
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            ShakeAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    ShakeAnimationView.this.f5956b.startAnimation(rotateAnimation);
                                }
                            }, 250);
                        }
                    });
                    ShakeAnimationView.this.f5956b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$b */
    private static class C2692b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * -2.0f) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * -4.0f) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private C2692b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f5957c == null) {
                this.f5957c = new C2915u(getContext().getApplicationContext());
            }
            this.f5957c.mo17822a((C2915u.C2916a) new C2915u.C2916a() {
                /* renamed from: a */
                public void mo17335a(int i) {
                    if (i == 1 && ShakeAnimationView.this.isShown() && ShakeAnimationView.this.f5959e != null) {
                        ShakeAnimationView.this.f5959e.mo17232a();
                    }
                }
            });
            this.f5957c.mo17821a((float) this.f5961g);
            this.f5957c.mo17820a();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2915u uVar = this.f5957c;
        if (uVar == null) {
            return;
        }
        if (z) {
            uVar.mo17820a();
        } else {
            uVar.mo17823b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2915u uVar = this.f5957c;
        if (uVar != null) {
            uVar.mo17823b();
        }
    }
}
