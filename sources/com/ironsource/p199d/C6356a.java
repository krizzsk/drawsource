package com.ironsource.p199d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6363a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.tapjoy.TapjoyConstants;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.d.a */
public class C6356a {

    /* renamed from: a */
    private static C6356a f16077a;

    /* renamed from: b */
    private final HashSet<ImpressionDataListener> f16078b = new HashSet<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, List<String>> f16079c = new ConcurrentHashMap<>();

    C6356a() {
    }

    /* renamed from: a */
    public static synchronized C6356a m18973a() {
        C6356a aVar;
        synchronized (C6356a.class) {
            if (f16077a == null) {
                f16077a = new C6356a();
            }
            aVar = f16077a;
        }
        return aVar;
    }

    /* renamed from: a */
    public static String m18974a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? m18975a(m18977b(context), context) : m18980d(context);
    }

    /* renamed from: a */
    public static String m18975a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m18980d(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    str = TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                } else if (!networkCapabilities.hasTransport(0)) {
                    return m18980d(context);
                } else {
                    str = "3g";
                }
            } else {
                str = m18980d(context);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public static JSONObject m18976a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", m18979c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static Network m18977b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m18978b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (!(Build.VERSION.SDK_INT < 23 || network == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m18979c(Context context) {
        return m18978b(context, m18977b(context)).equals("vpn");
    }

    /* renamed from: d */
    private static String m18980d(Context context) {
        String a = C6363a.C63641.m19003a(context);
        return TextUtils.isEmpty(a) ? "none" : a;
    }

    /* renamed from: a */
    public void mo35845a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f16078b.add(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void mo35846a(String str, List<String> list) {
        this.f16079c.put(str, list);
    }

    /* renamed from: b */
    public HashSet<ImpressionDataListener> mo35847b() {
        return this.f16078b;
    }

    /* renamed from: b */
    public void mo35848b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f16078b.remove(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void mo35849c() {
        synchronized (this) {
            this.f16078b.clear();
        }
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> mo35850d() {
        return this.f16079c;
    }
}
