package com.bytedance.sdk.component.p108d.p111c.p115b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: com.bytedance.sdk.component.d.c.b.a */
/* compiled from: DefaultDecoder */
public class C2789a {

    /* renamed from: a */
    public static final ImageView.ScaleType f6230a = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: b */
    public static final Bitmap.Config f6231b = Bitmap.Config.ARGB_4444;

    /* renamed from: c */
    private final Bitmap.Config f6232c;

    /* renamed from: d */
    private final int f6233d;

    /* renamed from: e */
    private final int f6234e;

    /* renamed from: f */
    private final ImageView.ScaleType f6235f;

    public C2789a(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config) {
        this.f6232c = config;
        this.f6233d = i;
        this.f6234e = i2;
        this.f6235f = scaleType;
    }

    /* renamed from: a */
    static int m7652a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: a */
    private static int m7653a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = (double) i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    /* renamed from: a */
    public Bitmap mo17602a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f6233d == 0 && this.f6234e == 0) {
            options.inPreferredConfig = this.f6232c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int a = m7653a(this.f6233d, this.f6234e, i, i2, this.f6235f);
        int a2 = m7653a(this.f6234e, this.f6233d, i2, i, this.f6235f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = m7652a(i, i2, a, a2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return decodeByteArray;
        }
        if (decodeByteArray.getWidth() <= a && decodeByteArray.getHeight() <= a2) {
            return decodeByteArray;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
        if (createScaledBitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return createScaledBitmap;
    }
}
