package com.iab.omid.library.adcolony;

import android.content.Context;

public final class Omid {
    private static C7624b INSTANCE = new C7624b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54347a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54346a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54349b();
    }
}
