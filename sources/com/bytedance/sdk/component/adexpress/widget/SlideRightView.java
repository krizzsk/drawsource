package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class SlideRightView extends FrameLayout {

    /* renamed from: a */
    private Context f5967a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f5968b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f5969c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f5970d;

    /* renamed from: e */
    private TextView f5971e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f5972f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f5973g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f5974h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f5975i = new AnimatorSet();

    public SlideRightView(Context context) {
        super(context);
        this.f5967a = context;
        m7287b();
    }

    /* renamed from: b */
    private void m7287b() {
        ImageView imageView = new ImageView(this.f5967a);
        this.f5970d = imageView;
        imageView.setBackgroundResource(C2914t.m8157d(this.f5967a, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        addView(this.f5970d, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f5967a);
        this.f5969c = imageView2;
        imageView2.setImageResource(C2914t.m8157d(this.f5967a, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5967a, 50.0f), (int) C2572b.m6622a(this.f5967a, 50.0f));
        layoutParams2.gravity = 48;
        addView(this.f5969c, layoutParams2);
        ImageView imageView3 = new ImageView(this.f5967a);
        this.f5968b = imageView3;
        imageView3.setImageResource(C2914t.m8157d(this.f5967a, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5967a, 80.0f), (int) C2572b.m6622a(this.f5967a, 80.0f));
        layoutParams3.gravity = 48;
        addView(this.f5968b, layoutParams3);
        TextView textView = new TextView(this.f5967a);
        this.f5971e = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f5971e, layoutParams4);
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f5968b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) SlideRightView.this.f5969c.getMeasuredHeight()) / 2.0f) - C2572b.m6622a(SlideRightView.this.getContext(), 7.0f));
                layoutParams.leftMargin = -SlideRightView.this.f5969c.getMeasuredWidth();
                SlideRightView.this.f5968b.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) SlideRightView.this.f5970d.getLayoutParams();
                layoutParams2.topMargin = (int) ((((float) SlideRightView.this.f5969c.getMeasuredHeight()) / 2.0f) - C2572b.m6622a(SlideRightView.this.getContext(), 5.0f));
                layoutParams2.leftMargin = (int) (((float) SlideRightView.this.f5969c.getMeasuredWidth()) / 2.0f);
                SlideRightView.this.f5970d.setLayoutParams(layoutParams2);
            }
        });
    }

    /* renamed from: c */
    private void m7289c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5968b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5969c, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f5969c, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f5970d, "alpha", new float[]{0.0f, 1.0f});
        this.f5974h.setDuration(300);
        this.f5974h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f5968b, "translationX", new float[]{0.0f, C2572b.m6622a(getContext(), 80.0f)});
        ofFloat5.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C2572b.m6622a(getContext(), 80.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f5970d.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideRightView.this.f5970d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f5969c, "translationX", new float[]{0.0f, C2572b.m6622a(getContext(), 80.0f)});
        ofFloat6.setInterpolator(new C2710a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f5975i.setDuration(1500);
        this.f5975i.playTogether(new Animator[]{ofFloat5, ofInt, ofFloat6});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f5968b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f5970d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f5969c, "alpha", new float[]{1.0f, 0.0f});
        this.f5973g.setDuration(50);
        this.f5973g.playTogether(new Animator[]{ofFloat7, ofFloat8, ofFloat9});
        this.f5972f.playSequentially(new Animator[]{this.f5974h, this.f5975i, this.f5973g});
    }

    /* renamed from: a */
    public void mo17337a() {
        m7289c();
        this.f5972f.start();
        this.f5972f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideRightView.this.f5972f.start();
                    }
                }, 200);
            }
        });
    }

    public void setGuideText(String str) {
        this.f5971e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
