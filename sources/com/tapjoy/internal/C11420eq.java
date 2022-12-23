package com.tapjoy.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.eq */
public final class C11420eq {
    /* renamed from: a */
    public static <T> List<T> m31227a() {
        return new C11421er(Collections.emptyList());
    }

    /* renamed from: a */
    public static <T> List<T> m31228a(String str, List<T> list) {
        if (list != null) {
            if (list instanceof C11421er) {
                list = ((C11421er) list).f27244a;
            }
            if (list == Collections.emptyList() || (list instanceof C11419ep)) {
                return list;
            }
            C11419ep epVar = new C11419ep(list);
            if (!epVar.contains((Object) null)) {
                return epVar;
            }
            throw new IllegalArgumentException(str + ".contains(null)");
        }
        throw new NullPointerException(str + " == null");
    }

    /* renamed from: a */
    public static boolean m31229a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static IllegalStateException m31226a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + sb);
    }
}
