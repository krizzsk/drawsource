package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.inmobi.media.ih */
/* compiled from: SystemBroadcastObserver */
public class C6200ih {

    /* renamed from: a */
    private static final String f15646a = C6200ih.class.getSimpleName();

    /* renamed from: b */
    private static HashMap<String, CopyOnWriteArrayList<C6204c>> f15647b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, C6203b> f15648c = new HashMap<>();

    /* renamed from: d */
    private static HashMap<String, ConnectivityManager.NetworkCallback> f15649d = new HashMap<>();

    /* renamed from: com.inmobi.media.ih$a */
    /* compiled from: SystemBroadcastObserver */
    static class C6202a {

        /* renamed from: a */
        static final C6200ih f15651a = new C6200ih();
    }

    /* renamed from: com.inmobi.media.ih$c */
    /* compiled from: SystemBroadcastObserver */
    public interface C6204c {
        /* renamed from: a */
        void mo34782a(boolean z);
    }

    /* renamed from: a */
    public static C6200ih m18408a() {
        return C6202a.f15651a;
    }

    /* renamed from: a */
    public final void mo35422a(String str, C6204c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f15647b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(cVar);
        }
        f15647b.put(str, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 1) {
            m18410a(str);
        }
    }

    /* renamed from: a */
    public final void mo35421a(C6204c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            mo35422a("android.net.conn.CONNECTIVITY_CHANGE", cVar);
        } else {
            mo35422a("SYSTEM_CONNECTIVITY_CHANGE", cVar);
        }
    }

    /* renamed from: a */
    private void m18410a(String str) {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return;
        }
        if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager != null) {
                C62011 r1 = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        super.onAvailable(network);
                        C6200ih.m18414b(true, "SYSTEM_CONNECTIVITY_CHANGE");
                    }

                    public final void onLost(Network network) {
                        super.onLost(network);
                        C6200ih.m18414b(false, "SYSTEM_CONNECTIVITY_CHANGE");
                    }
                };
                f15649d.put(str, r1);
                connectivityManager.registerDefaultNetworkCallback(r1);
                return;
            }
            return;
        }
        C6203b bVar = new C6203b();
        f15648c.put(str, bVar);
        c.registerReceiver(bVar, new IntentFilter(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m18414b(boolean z, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = f15647b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((C6204c) it.next()).mo34782a(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18409a(C6204c cVar, String str) {
        Context c;
        CopyOnWriteArrayList copyOnWriteArrayList = f15647b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(cVar);
            if (copyOnWriteArrayList.size() == 0 && (c = C6183hw.m18324c()) != null) {
                if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str) && f15649d.get(str) != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(f15649d.get(str));
                        f15649d.remove(str);
                    }
                } else if (f15648c.get(str) != null) {
                    c.unregisterReceiver(f15648c.get(str));
                    f15648c.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m18413b(C6204c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            m18409a(cVar, "android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            m18409a(cVar, "SYSTEM_CONNECTIVITY_CHANGE");
        }
    }

    /* renamed from: com.inmobi.media.ih$b */
    /* compiled from: SystemBroadcastObserver */
    static final class C6203b extends BroadcastReceiver {

        /* renamed from: a */
        private static final String f15652a = C6203b.class.getSimpleName();

        C6203b() {
        }

        public final void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        boolean z = true;
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                                C6200ih.m18414b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                                z = powerManager.isDeviceIdleMode();
                                C6200ih.m18414b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                            C6200ih.m18414b(z, intent.getAction());
                            intent.getAction();
                        }
                        z = false;
                        C6200ih.m18414b(z, intent.getAction());
                        intent.getAction();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
