package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: h */
    private static final int f9483h = ((int) C3904y.m12876c(C3513m.m10963a(), 1.0f));

    /* renamed from: i */
    private static final int f9484i = ((int) C3904y.m12876c(C3513m.m10963a(), 0.0f));

    /* renamed from: j */
    private static final int f9485j = ((int) C3904y.m12876c(C3513m.m10963a(), 1.0f));

    /* renamed from: k */
    private static final int f9486k = ((int) C3904y.m12876c(C3513m.m10963a(), 3.0f));

    /* renamed from: a */
    LinearLayout f9487a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f9488b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f9489c;

    /* renamed from: d */
    private float f9490d;

    /* renamed from: e */
    private Drawable f9491e;

    /* renamed from: f */
    private Drawable f9492f;

    /* renamed from: g */
    private double f9493g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9487a.setOrientation(0);
        this.f9487a.setGravity(GravityCompat.START);
        this.f9488b.setOrientation(0);
        this.f9488b.setGravity(GravityCompat.START);
        this.f9491e = C2914t.m8156c(context, "tt_star_thick");
        this.f9492f = C2914t.m8156c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f9491e;
    }

    public Drawable getStarFillDrawable() {
        return this.f9492f;
    }

    /* renamed from: a */
    public void mo20422a(double d, int i, int i2) {
        float f = (float) i2;
        this.f9489c = (float) ((int) C3904y.m12876c(C3513m.m10963a(), f));
        this.f9490d = (float) ((int) C3904y.m12876c(C3513m.m10963a(), f));
        this.f9493g = d;
        this.f9487a.removeAllViews();
        this.f9488b.removeAllViews();
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f9488b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f9487a.addView(starImageView2);
        }
        addView(this.f9487a);
        addView(this.f9488b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f9489c, (int) this.f9490d));
        imageView.setPadding(f9483h, f9484i, f9485j, f9486k);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9487a.measure(i, i2);
        double d = this.f9493g;
        float f = this.f9489c;
        int i3 = f9483h;
        this.f9488b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + ((float) i3))) + (((double) (f - ((float) (i3 + f9485j)))) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9487a.getMeasuredHeight(), 1073741824));
    }
}
