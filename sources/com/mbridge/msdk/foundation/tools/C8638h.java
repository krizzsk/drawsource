package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.mbridge.msdk.foundation.tools.h */
/* compiled from: DomainSameTool */
public class C8638h {

    /* renamed from: a */
    private static String f21155a = "DomainSameTool";

    /* renamed from: a */
    public static boolean m24749a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C8672v.m24875a(f21155a, th.getMessage(), th);
            return false;
        }
    }
}
