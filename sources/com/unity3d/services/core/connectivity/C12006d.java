package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.unity3d.services.core.properties.C12084a;

/* renamed from: com.unity3d.services.core.connectivity.d */
/* compiled from: ConnectivityNetworkCallback */
public class C12006d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    private static C12006d f29323a;

    /* renamed from: a */
    public static synchronized void m32666a() {
        synchronized (C12006d.class) {
            if (f29323a == null) {
                f29323a = new C12006d();
                ((ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), f29323a);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m32667b() {
        synchronized (C12006d.class) {
            if (f29323a != null) {
                ((ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")).unregisterNetworkCallback(f29323a);
                f29323a = null;
            }
        }
    }

    public void onAvailable(Network network) {
        C12004c.m32654a();
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C12004c.m32658b();
    }

    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C12004c.m32658b();
    }

    public void onLost(Network network) {
        C12004c.m32660c();
    }
}
