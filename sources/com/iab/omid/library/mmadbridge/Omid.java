package com.iab.omid.library.mmadbridge;

import android.content.Context;

public final class Omid {
    private static C7926b INSTANCE = new C7926b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55523a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55522a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55525b();
    }
}
