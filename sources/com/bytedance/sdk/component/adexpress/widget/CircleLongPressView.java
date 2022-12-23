package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class CircleLongPressView extends FrameLayout {

    /* renamed from: a */
    private Context f5883a;

    /* renamed from: b */
    private ImageView f5884b;

    /* renamed from: c */
    private ImageView f5885c;

    /* renamed from: d */
    private TextView f5886d;

    /* renamed from: e */
    private RingProgressView f5887e;

    /* renamed from: f */
    private AnimatorSet f5888f = new AnimatorSet();

    public CircleLongPressView(Context context) {
        super(context);
        this.f5883a = context;
        m7235e();
        m7236f();
    }

    /* renamed from: e */
    private void m7235e() {
        FrameLayout frameLayout = new FrameLayout(this.f5883a);
        this.f5887e = new RingProgressView(this.f5883a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5883a, 95.0f), (int) C2572b.m6622a(this.f5883a, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f5887e, layoutParams);
        ImageView imageView = new ImageView(this.f5883a);
        this.f5884b = imageView;
        imageView.setImageResource(C2914t.m8157d(this.f5883a, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5883a, 75.0f), (int) C2572b.m6622a(this.f5883a, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f5884b, layoutParams2);
        ImageView imageView2 = new ImageView(this.f5883a);
        this.f5885c = imageView2;
        imageView2.setImageResource(C2914t.m8157d(this.f5883a, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C2572b.m6622a(this.f5883a, 63.0f), (int) C2572b.m6622a(this.f5883a, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f5885c, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f5883a);
        this.f5886d = textView;
        textView.setTextColor(-1);
        this.f5886d.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f5886d, layoutParams4);
    }

    /* renamed from: f */
    private void m7236f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5885c, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5885c, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5888f.setDuration(800);
        this.f5888f.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f5886d.setText(str);
    }

    /* renamed from: a */
    public void mo17254a() {
        this.f5888f.start();
    }

    /* renamed from: b */
    public void mo17255b() {
        this.f5888f.cancel();
    }

    /* renamed from: c */
    public void mo17256c() {
        this.f5887e.mo17305a();
    }

    /* renamed from: d */
    public void mo17257d() {
        this.f5887e.mo17306b();
        this.f5887e.mo17307c();
    }
}
