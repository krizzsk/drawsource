package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class NetworkConnectivity extends Activity {

    /* renamed from: a */
    private final int f28255a = 0;

    /* renamed from: b */
    private final int f28256b;

    /* renamed from: c */
    private final int f28257c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f28258d;

    /* renamed from: e */
    private ConnectivityManager f28259e;

    /* renamed from: f */
    private final ConnectivityManager.NetworkCallback f28260f;

    public NetworkConnectivity(Context context) {
        int i = 1;
        this.f28256b = 1;
        this.f28257c = 2;
        this.f28258d = 0;
        this.f28260f = new ConnectivityManager.NetworkCallback() {
            public final void onAvailable(Network network) {
                super.onAvailable(network);
            }

            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkConnectivity networkConnectivity;
                int i;
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0)) {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 1;
                } else {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 2;
                }
                int unused = networkConnectivity.f28258d = i;
            }

            public final void onLost(Network network) {
                super.onLost(network);
                int unused = NetworkConnectivity.this.f28258d = 0;
            }

            public final void onUnavailable() {
                super.onUnavailable();
                int unused = NetworkConnectivity.this.f28258d = 0;
            }
        };
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f28259e = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(this.f28260f);
        NetworkInfo activeNetworkInfo = this.f28259e.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.f28258d = activeNetworkInfo.getType() != 0 ? 2 : i;
        }
    }

    /* renamed from: a */
    public final int mo70395a() {
        return this.f28258d;
    }

    /* renamed from: b */
    public final void mo70396b() {
        this.f28259e.unregisterNetworkCallback(this.f28260f);
    }
}
