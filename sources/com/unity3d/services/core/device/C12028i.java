package com.unity3d.services.core.device;

import android.content.Context;
import com.unity3d.services.core.properties.C12088d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.i */
/* compiled from: StorageManager */
public class C12028i {

    /* renamed from: a */
    private static final Map<C12029a, String> f29369a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static final List<C12025f> f29370b = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.unity3d.services.core.device.i$a */
    /* compiled from: StorageManager */
    public enum C12029a {
        PRIVATE,
        PUBLIC
    }

    /* renamed from: a */
    public static boolean m32766a(Context context) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return false;
        }
        C12029a aVar = C12029a.PUBLIC;
        m32765a(aVar, filesDir + "/" + C12088d.m32939l() + "public-data.json");
        if (!m32769d(aVar)) {
            return false;
        }
        C12029a aVar2 = C12029a.PRIVATE;
        m32765a(aVar2, filesDir + "/" + C12088d.m32939l() + "private-data.json");
        if (!m32769d(aVar2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m32767b(C12029a aVar) {
        List<C12025f> list = f29370b;
        if (list == null) {
            return false;
        }
        synchronized (list) {
            for (C12025f b : list) {
                if (b.mo71165b().equals(aVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public static void m32768c(C12029a aVar) {
        if (m32767b(aVar)) {
            C12025f a = m32764a(aVar);
            if (a != null) {
                a.mo71166c();
                return;
            }
            return;
        }
        Map<C12029a, String> map = f29369a;
        if (map.containsKey(aVar)) {
            C12025f fVar = new C12025f(map.get(aVar), aVar);
            fVar.mo71166c();
            f29370b.add(fVar);
        }
    }

    /* renamed from: d */
    private static boolean m32769d(C12029a aVar) {
        if (m32767b(aVar)) {
            return true;
        }
        m32768c(aVar);
        C12025f a = m32764a(aVar);
        if (a != null && !a.mo71168e()) {
            a.mo71169f();
        }
        return a != null;
    }

    /* renamed from: a */
    public static C12025f m32764a(C12029a aVar) {
        List<C12025f> list = f29370b;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            for (C12025f next : list) {
                if (next.mo71165b().equals(aVar)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m32765a(C12029a aVar, String str) {
        synchronized (C12028i.class) {
            Map<C12029a, String> map = f29369a;
            if (!map.containsKey(aVar)) {
                map.put(aVar, str);
            }
        }
    }
}
