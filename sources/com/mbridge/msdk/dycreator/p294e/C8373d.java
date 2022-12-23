package com.mbridge.msdk.dycreator.p294e;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.mbridge.msdk.dycreator.e.d */
/* compiled from: DensityUtil */
public final class C8373d {
    /* renamed from: a */
    public static int m23826a(Context context, float f) {
        return (int) ((f / m23827a(context).density) + 0.5f);
    }

    /* renamed from: a */
    public static DisplayMetrics m23827a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }
}
