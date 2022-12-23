package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* renamed from: com.fyber.inneractive.sdk.web.p */
public class C5373p<K> extends LruCache<K, C5376s> {
    public C5373p(int i) {
        super(i);
    }

    public int sizeOf(Object obj, Object obj2) {
        String str;
        C5376s sVar = (C5376s) obj2;
        int i = 0;
        for (String next : sVar.f14190b.keySet()) {
            if (!(next == null || (str = sVar.f14190b.get(next)) == null)) {
                i += next.length() + str.length();
            }
        }
        return i + sVar.f14189a.length;
    }
}
