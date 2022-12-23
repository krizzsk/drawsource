package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;

public class MBImageView extends ImageView {

    /* renamed from: a */
    private Bitmap f24108a = null;

    /* renamed from: b */
    private String f24109b;

    public MBImageView(Context context) {
        super(context);
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageUrl(String str) {
        this.f24109b = str;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f24108a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else if (getContext() != null) {
            C8481b.m24310a(getContext()).mo57883a(this.f24109b, (C8484c) new C8484c() {
                public final void onFailedLoad(String str, String str2) {
                }

                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    MBImageView.this.setImageBitmap(bitmap);
                }
            });
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f24108a = bitmap;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
            return;
        }
        this.f24108a = null;
        super.setImageBitmap((Bitmap) null);
    }
}
