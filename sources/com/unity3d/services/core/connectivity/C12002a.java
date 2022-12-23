package com.unity3d.services.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.unity3d.services.core.properties.C12084a;

/* renamed from: com.unity3d.services.core.connectivity.a */
/* compiled from: ConnectivityChangeReceiver */
public class C12002a extends BroadcastReceiver {

    /* renamed from: a */
    private static C12002a f29311a;

    /* renamed from: a */
    public static void m32652a() {
        if (f29311a == null) {
            f29311a = new C12002a();
            C12084a.m32908e().registerReceiver(f29311a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: b */
    public static void m32653b() {
        if (f29311a != null) {
            C12084a.m32908e().unregisterReceiver(f29311a);
            f29311a = null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            C12004c.m32660c();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            C12004c.m32654a();
        }
    }
}
