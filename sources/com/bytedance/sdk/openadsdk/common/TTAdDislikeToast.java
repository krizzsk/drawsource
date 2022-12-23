package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class TTAdDislikeToast extends FrameLayout {

    /* renamed from: a */
    private Handler f7405a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f7406b;

    public TTAdDislikeToast(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7405a = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        m9130a(context);
    }

    /* renamed from: a */
    private void m9130a(Context context) {
        TextView textView = new TextView(context);
        this.f7406b = textView;
        textView.setClickable(false);
        this.f7406b.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int b = (int) C3904y.m12868b(C3513m.m10963a(), 20.0f);
        int b2 = (int) C3904y.m12868b(C3513m.m10963a(), 12.0f);
        this.f7406b.setPadding(b, b2, b, b2);
        this.f7406b.setLayoutParams(layoutParams);
        this.f7406b.setTextColor(-1);
        this.f7406b.setTextSize(16.0f);
        this.f7406b.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(C3904y.m12868b(C3513m.m10963a(), 6.0f));
        this.f7406b.setBackgroundDrawable(gradientDrawable);
        addView(this.f7406b);
    }

    /* renamed from: a */
    public void mo18786a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7405a.removeCallbacksAndMessages((Object) null);
            this.f7405a.post(new Runnable() {
                public void run() {
                    if (TTAdDislikeToast.this.f7406b != null) {
                        TTAdDislikeToast.this.f7406b.setText(String.valueOf(str));
                    }
                    TTAdDislikeToast.this.setVisibility(0);
                }
            });
            this.f7405a.postDelayed(new Runnable() {
                public void run() {
                    TTAdDislikeToast.this.setVisibility(8);
                }
            }, 2000);
        }
    }

    /* renamed from: a */
    public void mo18785a() {
        setVisibility(8);
        this.f7405a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: b */
    public void mo18787b() {
        setVisibility(8);
        this.f7405a.removeCallbacksAndMessages((Object) null);
    }
}
