package com.iab.omid.library.oguryco;

import android.content.Context;

public final class Omid {
    private static C7976b INSTANCE = new C7976b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55743a(context.getApplicationContext());
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.mo55743a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.mo55742a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55746b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.mo55745a(str);
    }
}
