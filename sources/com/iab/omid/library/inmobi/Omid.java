package com.iab.omid.library.inmobi;

import android.content.Context;

public final class Omid {
    private static C7826b INSTANCE = new C7826b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55139a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55138a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55141b();
    }
}
