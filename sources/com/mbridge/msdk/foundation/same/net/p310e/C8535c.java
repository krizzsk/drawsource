package com.mbridge.msdk.foundation.same.net.p310e;

import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.c */
/* compiled from: NetworkResponse */
public final class C8535c {

    /* renamed from: a */
    public final int f20912a;

    /* renamed from: b */
    public final byte[] f20913b;

    /* renamed from: c */
    public final Map<String, String> f20914c;

    /* renamed from: d */
    public final List<C8513b> f20915d;

    public C8535c(int i, byte[] bArr, List<C8513b> list) {
        this(i, bArr, m24440a(list), list);
    }

    private C8535c(int i, byte[] bArr, Map<String, String> map, List<C8513b> list) {
        this.f20912a = i;
        this.f20913b = bArr;
        this.f20914c = map;
        if (list == null) {
            this.f20915d = null;
        } else {
            this.f20915d = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: a */
    private static Map<String, String> m24440a(List<C8513b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C8513b next : list) {
            treeMap.put(next.mo57933a(), next.mo57934b());
        }
        return treeMap;
    }
}
