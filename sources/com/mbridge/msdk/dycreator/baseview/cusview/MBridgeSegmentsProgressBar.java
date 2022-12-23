package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.ArrayList;
import java.util.List;

public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a */
    private final String f18238a = "MBridgeSegmentsProgressBar";

    /* renamed from: b */
    private int f18239b;

    /* renamed from: c */
    private int f18240c = 1;

    /* renamed from: d */
    private int f18241d = 20;

    /* renamed from: e */
    private int f18242e = 10;

    /* renamed from: f */
    private int f18243f = 1;

    /* renamed from: g */
    private int f18244g = -1711276033;

    /* renamed from: h */
    private int f18245h = -1;

    /* renamed from: i */
    private List<ProgressBar> f18246i = new ArrayList();

    /* renamed from: j */
    private TextView f18247j;

    /* renamed from: k */
    private String f18248k;

    /* renamed from: l */
    private boolean f18249l = false;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void init(int i, int i2) {
        this.f18239b = i;
        this.f18240c = i2;
        m20770a();
    }

    public void init(int i, int i2, int i3, int i4) {
        this.f18239b = i;
        this.f18240c = i2;
        this.f18245h = i3;
        this.f18244g = i4;
        m20770a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18239b = i;
        this.f18240c = i2;
        this.f18245h = i3;
        this.f18244g = i4;
        this.f18241d = i5;
        this.f18242e = i6;
        m20770a();
    }

    /* renamed from: a */
    private void m20770a() {
        Drawable drawable;
        try {
            this.f18249l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            C8672v.m24878d("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f18240c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f18248k)) {
                    this.f18248k = this.f18249l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f18240c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f18248k)) {
                    this.f18248k = this.f18249l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f18246i.clear();
            removeAllViews();
            setBackground(m20772c());
            TextView textView = new TextView(getContext());
            this.f18247j = textView;
            textView.setTextColor(-1);
            this.f18247j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f18247j.setLayoutParams(layoutParams);
            if (this.f18240c == 1) {
                layoutParams.gravity = 5;
                this.f18247j.setPadding(this.f18241d / 2, 15, this.f18241d / 2, 5);
            }
            if (this.f18240c == 2) {
                this.f18247j.setGravity(16);
                this.f18247j.setPadding(this.f18241d / 2, 0, this.f18241d / 2, 0);
            }
            int a = C8658p.m24799a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (!(a == 0 || (drawable = getContext().getResources().getDrawable(a)) == null)) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f18247j.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                this.f18247j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th2) {
            C8672v.m24878d("MBridgeSegmentsProgressBar", th2.getMessage());
            return;
        }
        this.f18247j.setText(m20769a(this.f18243f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i = 0; i < this.f18239b; i++) {
            ProgressBar progressBar = new ProgressBar(getContext(), (AttributeSet) null, 16842872);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(m20771b());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            layoutParams3.leftMargin = this.f18241d / 2;
            layoutParams3.rightMargin = this.f18241d / 2;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f18246i.add(progressBar);
        }
        if (this.f18240c == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f18247j);
            addView(linearLayout);
        }
        if (this.f18240c == 2) {
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f18247j);
        }
    }

    public void setIndicatorText(String str) {
        this.f18248k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.f18246i.size() != 0) {
                if (i2 < this.f18246i.size()) {
                    this.f18246i.get(i2).setProgress(i);
                }
                int i3 = i2 + 1;
                if (i3 > this.f18243f) {
                    this.f18243f = i3;
                    if (this.f18247j != null) {
                        this.f18247j.setText(m20769a(i3));
                    }
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    /* renamed from: a */
    private StringBuilder m20769a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f18248k, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f18239b)}));
        } catch (Throwable th) {
            sb.append(this.f18239b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            C8672v.m24878d("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }
        });
        startAnimation(alphaAnimation);
    }

    /* renamed from: b */
    private LayerDrawable m20771b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) this.f18242e);
        gradientDrawable.setColor(this.f18244g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius((float) this.f18242e);
        gradientDrawable2.setColor(this.f18245h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        return layerDrawable;
    }

    /* renamed from: c */
    private GradientDrawable m20772c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }
}
