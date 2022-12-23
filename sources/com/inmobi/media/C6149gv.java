package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* renamed from: com.inmobi.media.gv */
/* compiled from: DebugBroadcastManager */
public class C6149gv {

    /* renamed from: a */
    private static final String f15504a = C6149gv.class.getName();

    /* renamed from: com.inmobi.media.gv$a */
    /* compiled from: DebugBroadcastManager */
    public enum C6150a {
        NETWORK_REQUEST_RESPONSE,
        PRE_INIT_INSERTED,
        APP_FOCUS_CHANGE,
        JAVASCRIPT_CALL
    }

    /* renamed from: a */
    public static void m18209a(Intent intent) {
        intent.getAction();
        Context c = C6183hw.m18324c();
        if (c != null) {
            LocalBroadcastManager.getInstance(c).sendBroadcast(intent);
        }
    }
}
