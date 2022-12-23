package com.iab.omid.library.vungle;

import android.content.Context;

public final class Omid {
    private static C8040b INSTANCE = new C8040b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo56056a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo56055a();
    }

    public static boolean isActive() {
        return INSTANCE.mo56058b();
    }
}
