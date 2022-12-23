package com.iab.omid.library.amazon;

import android.content.Context;

public final class Omid {
    private static C7674b INSTANCE = new C7674b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54546a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54545a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54548b();
    }
}
