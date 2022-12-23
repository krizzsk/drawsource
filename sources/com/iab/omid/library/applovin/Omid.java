package com.iab.omid.library.applovin;

import android.content.Context;

public final class Omid {
    private static C7724b INSTANCE = new C7724b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54745a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54744a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54747b();
    }
}
