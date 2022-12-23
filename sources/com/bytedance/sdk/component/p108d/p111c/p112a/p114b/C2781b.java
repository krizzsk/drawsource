package com.bytedance.sdk.component.p108d.p111c.p112a.p114b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.p108d.C2834p;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2787c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.b */
/* compiled from: LruCountBitmapCache */
public class C2781b implements C2834p {

    /* renamed from: a */
    private int f6209a;

    /* renamed from: b */
    private int f6210b;

    /* renamed from: c */
    private int f6211c;

    /* renamed from: d */
    private C2787c<String, Bitmap> f6212d;

    public C2781b(int i, int i2) {
        this.f6211c = i;
        this.f6209a = i2;
        this.f6212d = new C2787c<String, Bitmap>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo17585b(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return C2781b.m7616a(bitmap);
            }
        };
    }

    /* renamed from: a */
    public boolean mo17522a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f6212d.mo17594a(str, bitmap);
        return true;
    }

    /* renamed from: a */
    public Bitmap mo17521a(String str) {
        return this.f6212d.mo17593a(str);
    }

    /* renamed from: b */
    public boolean mo17523b(String str) {
        return this.f6212d.mo17593a(str) != null;
    }

    /* renamed from: a */
    public static int m7616a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
