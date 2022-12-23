package com.unity3d.services.core.broadcast;

import android.content.IntentFilter;
import com.unity3d.services.core.properties.C12084a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.broadcast.d */
/* compiled from: BroadcastMonitor */
public class C11982d {

    /* renamed from: a */
    private static Map<String, C11981c> f29130a;

    /* renamed from: a */
    public static void m32596a(String str, String str2, String[] strArr) {
        m32595a(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (f29130a == null) {
            f29130a = new HashMap();
        }
        C11981c cVar = new C11981c(str);
        f29130a.put(str, cVar);
        C12084a.m32908e().registerReceiver(cVar, intentFilter);
    }

    /* renamed from: a */
    public static void m32595a(String str) {
        Map<String, C11981c> map = f29130a;
        if (map != null && map.containsKey(str)) {
            C12084a.m32908e().unregisterReceiver(f29130a.get(str));
            f29130a.remove(str);
        }
    }

    /* renamed from: a */
    public static void m32594a() {
        Map<String, C11981c> map = f29130a;
        if (map != null) {
            for (String str : map.keySet()) {
                C12084a.m32908e().unregisterReceiver(f29130a.get(str));
            }
            f29130a = null;
        }
    }
}
