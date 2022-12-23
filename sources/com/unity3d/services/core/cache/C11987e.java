package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.core.log.C12065a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.unity3d.services.core.cache.e */
/* compiled from: CacheThread */
public class C11987e extends Thread {

    /* renamed from: a */
    private static C11988f f29162a = null;

    /* renamed from: b */
    private static boolean f29163b = false;

    /* renamed from: c */
    private static final Object f29164c = new Object();

    /* renamed from: d */
    private static int f29165d = 30000;

    /* renamed from: e */
    private static int f29166e = 30000;

    /* renamed from: f */
    private static int f29167f;

    /* renamed from: a */
    public static synchronized void m32604a(String str, String str2, HashMap<String, List<String>> hashMap, boolean z) {
        synchronized (C11987e.class) {
            if (!f29163b) {
                m32610e();
            }
            Bundle bundle = new Bundle();
            bundle.putString("source", str);
            bundle.putString("target", str2);
            bundle.putInt("connectTimeout", f29165d);
            bundle.putInt("readTimeout", f29166e);
            bundle.putInt("progressInterval", f29167f);
            bundle.putBoolean("append", z);
            if (hashMap != null) {
                for (String next : hashMap.keySet()) {
                    bundle.putStringArray(next, (String[]) hashMap.get(next).toArray(new String[hashMap.get(next).size()]));
                }
            }
            Message message = new Message();
            message.what = 1;
            message.setData(bundle);
            f29162a.mo71028a(false);
            f29162a.sendMessage(message);
        }
    }

    /* renamed from: b */
    public static void m32606b(int i) {
        f29167f = i;
    }

    /* renamed from: c */
    public static int m32607c() {
        return f29167f;
    }

    /* renamed from: d */
    public static int m32609d() {
        return f29166e;
    }

    /* renamed from: e */
    private static void m32610e() {
        C11987e eVar = new C11987e();
        eVar.setName("UnityAdsCacheThread");
        eVar.start();
        while (!f29163b) {
            try {
                Object obj = f29164c;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                C12065a.m32845b("Couldn't synchronize thread");
            }
        }
    }

    /* renamed from: f */
    public static boolean m32611f() {
        if (!f29163b) {
            return false;
        }
        return f29162a.mo71029a();
    }

    public void run() {
        Looper.prepare();
        f29162a = new C11988f();
        f29163b = true;
        Object obj = f29164c;
        synchronized (obj) {
            obj.notify();
        }
        Looper.loop();
    }

    /* renamed from: b */
    public static int m32605b() {
        return f29165d;
    }

    /* renamed from: c */
    public static void m32608c(int i) {
        f29166e = i;
    }

    /* renamed from: a */
    public static void m32602a() {
        if (f29163b) {
            f29162a.removeMessages(1);
            f29162a.mo71028a(true);
        }
    }

    /* renamed from: a */
    public static void m32603a(int i) {
        f29165d = i;
    }
}
