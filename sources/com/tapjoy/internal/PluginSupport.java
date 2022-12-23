package com.tapjoy.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class PluginSupport {
    private PluginSupport() {
    }

    public static void trackUsage(String str, String str2, String str3) {
        TreeMap treeMap;
        C11296bh b;
        C11296bh b2;
        try {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(str2)) {
                treeMap = new TreeMap();
                b2 = C11296bh.m30911b(str2);
                b2.mo69709a((Map) treeMap);
                b2.close();
            } else {
                treeMap = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap = new HashMap();
                b = C11296bh.m30911b(str3);
                b.mo69722h();
                while (b.mo69724j()) {
                    hashMap.put(b.mo69726l(), Long.valueOf(b.mo69731q()));
                }
                b.mo69723i();
                b.close();
            }
            C11520gi.m31527a(str, (TreeMap<String, Object>) treeMap, (Map<String, Long>) hashMap);
        } catch (Exception unused) {
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }
}
