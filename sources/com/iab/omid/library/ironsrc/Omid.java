package com.iab.omid.library.ironsrc;

import android.content.Context;

public final class Omid {
    private static C7876b INSTANCE = new C7876b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55333a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55332a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55335b();
    }
}
