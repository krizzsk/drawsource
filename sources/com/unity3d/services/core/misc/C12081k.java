package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.C12065a;

/* renamed from: com.unity3d.services.core.misc.k */
/* compiled from: ViewUtilities */
public class C12081k {
    /* renamed from: a */
    public static void m32885a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception e) {
                C12065a.m32842a("Error while removing view from it's parent", e);
            }
        }
    }

    /* renamed from: b */
    public static float m32887b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static void m32886a(View view, Drawable drawable) {
        Class<View> cls = View.class;
        String str = Build.VERSION.SDK_INT < 16 ? "setBackgroundDrawable" : "setBackground";
        try {
            cls.getMethod(str, new Class[]{Drawable.class}).invoke(view, new Object[]{drawable});
        } catch (Exception e) {
            C12065a.m32842a("Couldn't run" + str, e);
        }
    }

    /* renamed from: a */
    public static float m32884a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }
}
