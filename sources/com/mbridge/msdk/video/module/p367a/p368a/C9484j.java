package com.mbridge.msdk.video.module.p367a.p368a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8671u;

/* renamed from: com.mbridge.msdk.video.module.a.a.j */
/* compiled from: RoundedImageLoaderListener */
public final class C9484j extends C9478e {

    /* renamed from: a */
    private int f23497a;

    public C9484j(ImageView imageView, int i) {
        super(imageView);
        this.f23497a = i;
    }

    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (this.f23491b != null && !bitmap.isRecycled() && (a = C8671u.m24872a(bitmap, 1, this.f23497a)) != null) {
                    this.f23491b.setImageBitmap(a);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }
}
