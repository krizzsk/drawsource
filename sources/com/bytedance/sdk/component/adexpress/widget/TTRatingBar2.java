package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: a */
    LinearLayout f5998a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f5999b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f6000c;

    /* renamed from: d */
    private float f6001d;

    /* renamed from: e */
    private Drawable f6002e;

    /* renamed from: f */
    private Drawable f6003f;

    /* renamed from: g */
    private double f6004g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5998a.setOrientation(0);
        this.f5998a.setGravity(GravityCompat.START);
        this.f5999b.setOrientation(0);
        this.f5999b.setGravity(GravityCompat.START);
        this.f6002e = C2914t.m8156c(context, "tt_star_thick");
        this.f6003f = C2914t.m8156c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f6002e;
    }

    public Drawable getStarFillDrawable() {
        return this.f6003f;
    }

    /* renamed from: a */
    public void mo17361a(double d, int i, int i2) {
        float f = (float) i2;
        this.f6000c = C2572b.m6627c(getContext(), f);
        this.f6001d = C2572b.m6627c(getContext(), f);
        this.f6004g = d;
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f5999b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f5998a.addView(starImageView2);
        }
        addView(this.f5998a);
        addView(this.f5999b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f6000c, (int) this.f6001d));
        imageView.setPadding(1, 4, 1, 0);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f5998a.measure(i, i2);
        double d = this.f6004g;
        float f = this.f6000c;
        this.f5999b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5998a.getMeasuredHeight(), 1073741824));
    }
}
