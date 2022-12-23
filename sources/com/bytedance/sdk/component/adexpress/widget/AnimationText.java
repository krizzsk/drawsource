package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2640l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import java.util.ArrayList;
import java.util.List;

public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, C2923x.C2924a {

    /* renamed from: a */
    Animation.AnimationListener f5868a = new Animation.AnimationListener() {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            if (AnimationText.this.f5873f != null) {
                AnimationText.this.f5873f.setText("");
            }
        }
    };

    /* renamed from: b */
    private List<String> f5869b = new ArrayList();

    /* renamed from: c */
    private int f5870c = 0;

    /* renamed from: d */
    private final int f5871d = 1;

    /* renamed from: e */
    private Context f5872e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f5873f;

    /* renamed from: g */
    private int f5874g;

    /* renamed from: h */
    private int f5875h;

    /* renamed from: i */
    private float f5876i;

    /* renamed from: j */
    private int f5877j;

    /* renamed from: k */
    private int f5878k;

    /* renamed from: l */
    private int f5879l;

    /* renamed from: m */
    private int f5880m;

    /* renamed from: n */
    private Handler f5881n = new C2923x(Looper.getMainLooper(), this);

    public AnimationText(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.f5875h = i;
        this.f5876i = f;
        this.f5877j = i2;
        this.f5880m = i3;
        m7231c();
    }

    /* renamed from: c */
    private void m7231c() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.f5879l = i;
    }

    public void setAnimationDuration(int i) {
        this.f5874g = i;
    }

    /* renamed from: a */
    public void mo17239a() {
        int i = this.f5879l;
        if (i == 1) {
            setInAnimation(getContext(), C2914t.m8165l(this.f5872e, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), C2914t.m8165l(this.f5872e, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), C2914t.m8165l(this.f5872e, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), C2914t.m8165l(this.f5872e, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f5868a);
            getOutAnimation().setAnimationListener(this.f5868a);
        }
        this.f5881n.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.f5869b = list;
    }

    /* renamed from: b */
    public void mo17241b() {
        List<String> list = this.f5869b;
        if (list != null && list.size() > 0) {
            int i = this.f5870c;
            this.f5870c = i + 1;
            this.f5878k = i;
            setText(this.f5869b.get(i));
            if (this.f5870c > this.f5869b.size() - 1) {
                this.f5870c = 0;
            }
        }
    }

    public void setTextColor(int i) {
        this.f5875h = i;
    }

    public void setTextSize(float f) {
        this.f5876i = f;
    }

    public void setMaxLines(int i) {
        this.f5877j = i;
    }

    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f5873f = textView;
        textView.setTextColor(this.f5875h);
        this.f5873f.setTextSize(this.f5876i);
        this.f5873f.setMaxLines(this.f5877j);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5873f.setTextAlignment(this.f5880m);
        }
        return this.f5873f;
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 1) {
            mo17241b();
            this.f5881n.sendEmptyMessageDelayed(1, (long) this.f5874g);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C2640l.m7082a(this.f5869b.get(this.f5878k), this.f5876i, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5881n.removeMessages(1);
    }
}
