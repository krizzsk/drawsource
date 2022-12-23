package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.widget.MBImageView;

public class RoundImageView extends MBImageView {

    /* renamed from: a */
    private int f24094a;

    /* renamed from: b */
    private int f24095b;

    /* renamed from: c */
    private Paint f24096c;

    /* renamed from: d */
    private int f24097d;

    /* renamed from: e */
    private Matrix f24098e = new Matrix();

    /* renamed from: f */
    private BitmapShader f24099f;

    /* renamed from: g */
    private int f24100g;

    /* renamed from: h */
    private RectF f24101h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f24096c = paint;
        paint.setAntiAlias(true);
        this.f24095b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24094a = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f24096c = paint;
        paint.setAntiAlias(true);
        this.f24095b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24094a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f24096c = paint;
        paint.setAntiAlias(true);
        this.f24095b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24094a = 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f24094a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f24100g = min;
            this.f24097d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() != null) {
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    Bitmap a = m27614a(drawable);
                    this.f24099f = new BitmapShader(a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    float f = 1.0f;
                    if (this.f24094a == 0) {
                        f = (((float) this.f24100g) * 1.0f) / ((float) Math.min(a.getWidth(), a.getHeight()));
                    } else if (this.f24094a == 1) {
                        f = Math.max((((float) getWidth()) * 1.0f) / ((float) a.getWidth()), (((float) getHeight()) * 1.0f) / ((float) a.getHeight()));
                    }
                    this.f24098e.setScale(f, f);
                    this.f24099f.setLocalMatrix(this.f24098e);
                    this.f24096c.setShader(this.f24099f);
                }
                if (this.f24094a == 1) {
                    canvas.drawRoundRect(this.f24101h, (float) this.f24095b, (float) this.f24095b, this.f24096c);
                } else {
                    canvas.drawCircle((float) this.f24097d, (float) this.f24097d, (float) this.f24097d, this.f24096c);
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d("RoundImageView", th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f24094a == 1) {
            this.f24101h = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f24094a);
        bundle.putInt("state_border_radius", this.f24095b);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f24094a = bundle.getInt("state_type");
            this.f24095b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setBorderRadius(int i) {
        int b = C8677z.m24924b(getContext(), (float) i);
        if (this.f24095b != b) {
            this.f24095b = b;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f24094a != i) {
            this.f24094a = i;
            if (!(i == 1 || i == 0)) {
                this.f24094a = 0;
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private Bitmap m27614a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            C8672v.m24878d("View", th.getMessage());
            return null;
        }
    }
}
