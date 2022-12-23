package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.mbridge.msdk.foundation.tools.ah */
/* compiled from: ViewUtil */
public final class C8621ah {
    /* renamed from: a */
    public static void m24736a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
