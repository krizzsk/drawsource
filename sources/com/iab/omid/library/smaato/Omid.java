package com.iab.omid.library.smaato;

import android.content.Context;

public final class Omid {
    private static C8020a INSTANCE = new C8020a();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55861a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55860a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55863b();
    }
}
