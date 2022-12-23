package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.ironsource.p199d.C6356a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.e */
public class C8333e implements C8331c {

    /* renamed from: a */
    private String f20295a = C8333e.class.getSimpleName();

    /* renamed from: b */
    private int f20296b = 23;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8332d f20297c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f20298d;

    public C8333e(C8332d dVar) {
        this.f20297c = dVar;
    }

    /* renamed from: a */
    public final void mo56767a() {
        this.f20298d = null;
    }

    /* renamed from: a */
    public final void mo56768a(final Context context) {
        if (Build.VERSION.SDK_INT >= this.f20296b) {
            mo56769b(context);
            if (C6356a.m18974a(context).equals("none")) {
                this.f20297c.mo56518a();
            }
            if (this.f20298d == null) {
                this.f20298d = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        if (network != null) {
                            C8332d a = C8333e.this.f20297c;
                            String a2 = C6356a.m18975a(network, context);
                            C6356a.m18976a(context, network);
                            a.mo56519a(a2);
                            return;
                        }
                        C8332d a3 = C8333e.this.f20297c;
                        String a4 = C6356a.m18974a(context);
                        Context context = context;
                        C6356a.m18976a(context, C6356a.m18977b(context));
                        a3.mo56519a(a4);
                    }

                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        if (network != null) {
                            C8333e.this.f20297c.mo56520a(C6356a.m18975a(network, context), C6356a.m18976a(context, network));
                        }
                    }

                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        if (network != null) {
                            C8333e.this.f20297c.mo56520a(C6356a.m18975a(network, context), C6356a.m18976a(context, network));
                        }
                    }

                    public final void onLost(Network network) {
                        if (C6356a.m18974a(context).equals("none")) {
                            C8333e.this.f20297c.mo56518a();
                        }
                    }
                };
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f20298d);
                }
            } catch (Exception unused) {
                Log.e(this.f20295a, "NetworkCallback was not able to register");
            }
        }
    }

    /* renamed from: b */
    public final void mo56769b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f20296b && this.f20298d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f20298d);
            } catch (Exception unused) {
                Log.e(this.f20295a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo56770c(Context context) {
        return C6356a.m18976a(context, C6356a.m18977b(context));
    }
}
