package com.fyber.inneractive.sdk.bidder;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5291k0;

/* renamed from: com.fyber.inneractive.sdk.bidder.b */
public class C4170b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C4151a f10236a;

    public C4170b(C4151a aVar) {
        this.f10236a = aVar;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C5291k0 k0Var = C5291k0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            k0Var = C5291k0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            k0Var = C5290k.m16491i() == 13 ? C5291k0.MOBILE_4G : C5291k0.MOBILE_3G;
        } else if (networkCapabilities.hasTransport(1)) {
            k0Var = C5291k0.WIFI;
        }
        if (!TextUtils.equals(this.f10236a.f10191c.f10266r, k0Var.f14014a)) {
            C4151a aVar = this.f10236a;
            aVar.f10191c.f10266r = k0Var.f14014a;
            aVar.mo24017b();
        }
    }
}
