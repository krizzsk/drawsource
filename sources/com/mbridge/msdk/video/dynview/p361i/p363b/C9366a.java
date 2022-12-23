package com.mbridge.msdk.video.dynview.p361i.p363b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C8677z;

/* renamed from: com.mbridge.msdk.video.dynview.i.b.a */
/* compiled from: UIDrawableUtil */
public final class C9366a {
    /* renamed from: a */
    public static void m26704a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null && strArr != null) {
            int[] iArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                iArr[i] = Color.parseColor(strArr[i]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius((float) C8677z.m24924b(view.getContext(), f2));
            gradientDrawable.setStroke(C8677z.m24924b(view.getContext(), f), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}
