package com.iab.omid.library.fyber;

import android.content.Context;

public final class Omid {
    private static C7775b INSTANCE = new C7775b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54944a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54943a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54946b();
    }
}
