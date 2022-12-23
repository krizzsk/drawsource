package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.core.connectivity.c */
/* compiled from: ConnectivityMonitor */
public class C12004c {

    /* renamed from: a */
    private static int f29316a = -1;

    /* renamed from: b */
    private static boolean f29317b = false;

    /* renamed from: c */
    private static boolean f29318c = false;

    /* renamed from: d */
    private static boolean f29319d = false;

    /* renamed from: e */
    private static int f29320e = -1;

    /* renamed from: f */
    private static Set<C12007e> f29321f;

    /* renamed from: com.unity3d.services.core.connectivity.c$a */
    /* compiled from: ConnectivityMonitor */
    static /* synthetic */ class C12005a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29322a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.core.connectivity.b[] r0 = com.unity3d.services.core.connectivity.C12003b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29322a = r0
                com.unity3d.services.core.connectivity.b r1 = com.unity3d.services.core.connectivity.C12003b.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29322a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.connectivity.b r1 = com.unity3d.services.core.connectivity.C12003b.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29322a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.connectivity.b r1 = com.unity3d.services.core.connectivity.C12003b.NETWORK_CHANGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.connectivity.C12004c.C12005a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m32657a(boolean z) {
        f29318c = z;
        m32665h();
    }

    /* renamed from: b */
    public static void m32659b(C12007e eVar) {
        Set<C12007e> set = f29321f;
        if (set != null) {
            set.remove(eVar);
            m32665h();
        }
    }

    /* renamed from: c */
    public static void m32660c() {
        if (f29316a != 0) {
            f29316a = 0;
            C12065a.m32845b("Unity Ads connectivity change: disconnected");
            Set<C12007e> set = f29321f;
            if (set != null) {
                for (C12007e onDisconnected : set) {
                    onDisconnected.onDisconnected();
                }
            }
            m32655a(C12003b.DISCONNECTED, false, 0);
        }
    }

    /* renamed from: d */
    private static void m32661d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C12084a.m32908e().getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = false;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                f29316a = 0;
                return;
            }
            f29316a = 1;
            if (activeNetworkInfo.getType() == 1) {
                z = true;
            }
            f29319d = z;
            if (!z) {
                try {
                    f29320e = ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkType();
                } catch (SecurityException unused) {
                    C12065a.m32851e("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
    }

    /* renamed from: e */
    private static void m32662e() {
        if (!f29317b) {
            f29317b = true;
            m32661d();
            if (Build.VERSION.SDK_INT < 21) {
                C12002a.m32652a();
            } else {
                C12006d.m32666a();
            }
        }
    }

    /* renamed from: f */
    public static void m32663f() {
        f29321f = null;
        f29318c = false;
        m32665h();
    }

    /* renamed from: g */
    private static void m32664g() {
        if (f29317b) {
            f29317b = false;
            if (Build.VERSION.SDK_INT < 21) {
                C12002a.m32653b();
            } else {
                C12006d.m32667b();
            }
        }
    }

    /* renamed from: h */
    private static void m32665h() {
        Set<C12007e> set;
        if (f29318c || ((set = f29321f) != null && !set.isEmpty())) {
            m32662e();
        } else {
            m32664g();
        }
    }

    /* renamed from: a */
    public static void m32656a(C12007e eVar) {
        if (f29321f == null) {
            f29321f = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        f29321f.add(eVar);
        m32665h();
    }

    /* renamed from: b */
    public static void m32658b() {
        NetworkInfo activeNetworkInfo;
        boolean z = true;
        if (f29316a == 1 && (activeNetworkInfo = ((ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() != 1) {
                z = false;
            }
            int i = -1;
            try {
                i = ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                C12065a.m32851e("Unity Ads was not able to get current network type due to missing permission");
            }
            boolean z2 = f29319d;
            if (z != z2 || (i != f29320e && !z2)) {
                f29319d = z;
                f29320e = i;
                C12065a.m32845b("Unity Ads connectivity change: network change");
                m32655a(C12003b.NETWORK_CHANGE, z, i);
            }
        }
    }

    /* renamed from: a */
    public static void m32654a() {
        if (f29316a != 1) {
            C12065a.m32845b("Unity Ads connectivity change: connected");
            m32661d();
            Set<C12007e> set = f29321f;
            if (set != null) {
                for (C12007e onConnected : set) {
                    onConnected.onConnected();
                }
            }
            m32655a(C12003b.CONNECTED, f29319d, f29320e);
        }
    }

    /* renamed from: a */
    private static void m32655a(C12003b bVar, boolean z, int i) {
        C12136a c;
        if (f29318c && (c = C12136a.m33103c()) != null && c.mo71321i()) {
            int i2 = C12005a.f29322a[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    c.mo71310a((Enum) C12143b.CONNECTIVITY, (Enum) C12003b.DISCONNECTED, new Object[0]);
                } else if (i2 == 3) {
                    if (z) {
                        c.mo71310a((Enum) C12143b.CONNECTIVITY, (Enum) C12003b.NETWORK_CHANGE, Boolean.valueOf(z), 0);
                        return;
                    }
                    c.mo71310a((Enum) C12143b.CONNECTIVITY, (Enum) C12003b.NETWORK_CHANGE, Boolean.valueOf(z), Integer.valueOf(i));
                }
            } else if (z) {
                c.mo71310a((Enum) C12143b.CONNECTIVITY, (Enum) C12003b.CONNECTED, Boolean.valueOf(z), 0);
            } else {
                c.mo71310a((Enum) C12143b.CONNECTIVITY, (Enum) C12003b.CONNECTED, Boolean.valueOf(z), Integer.valueOf(i));
            }
        }
    }
}
