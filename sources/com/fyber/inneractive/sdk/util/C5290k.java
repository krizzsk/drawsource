package com.fyber.inneractive.sdk.util;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.fyber.inneractive.sdk.util.k */
public class C5290k extends C5292l {

    /* renamed from: c */
    public static final /* synthetic */ int f14007c = 0;

    /* renamed from: a */
    public static boolean m16488a(Intent intent) {
        int i;
        try {
            i = C5292l.f14015a.getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m16489g() {
        try {
            return ((TelephonyManager) C5292l.f14015a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m16490h() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: i */
    public static int m16491i() {
        try {
            if (!C5292l.m16510b("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) C5292l.f14015a.getSystemService("phone");
            return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: j */
    public static String m16492j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C5292l.f14015a.getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() != 2) {
                return networkOperator;
            }
            TelephonyManager telephonyManager2 = (TelephonyManager) C5292l.f14015a.getSystemService("phone");
            return telephonyManager2 != null && telephonyManager2.getSimState() == 5 ? telephonyManager.getSimOperator() : networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m16493k() {
        return C5292l.f14015a.getPackageName();
    }

    /* renamed from: l */
    public static String m16494l() {
        try {
            return C5292l.f14015a.getPackageManager().getPackageInfo(C5292l.f14015a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m16495m() {
        try {
            if (C5292l.f14015a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", C5292l.f14015a.getPackageName()) != 0) {
                return false;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) C5292l.f14015a.getSystemService("connectivity");
            if (connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING) {
                return true;
            }
            return false;
        } catch (Exception e) {
            IAlog.m16447b("%sUnable to check whether device is connected to wifi: %s", IAlog.m16442a((Class<?>) C5290k.class), e.getMessage());
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m16496n() {
        return "mounted".equals(C5292l.m16508b()) && C5292l.f14015a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: o */
    public static boolean m16497o() {
        boolean z = (C5292l.f14015a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.m16449d("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }
}
