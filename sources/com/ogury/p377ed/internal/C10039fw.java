package com.ogury.p377ed.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ogury.ed.internal.fw */
public final class C10039fw {
    /* renamed from: a */
    public static final NetworkInfo m29157a(Context context) {
        C10263mq.m29882b(context, "<this>");
        if (!C10053gh.m29193a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: a */
    public static final boolean m29158a(NetworkInfo networkInfo) {
        C10263mq.m29882b(networkInfo, "<this>");
        return networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    /* renamed from: b */
    public static final boolean m29159b(Context context) {
        C10263mq.m29882b(context, "<this>");
        NetworkInfo a = m29157a(context);
        return a != null && a.isConnected();
    }
}
