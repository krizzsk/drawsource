package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.dx */
/* compiled from: TrackerAttr */
public final class C5951dx {

    /* renamed from: a */
    public byte f15086a;

    /* renamed from: b */
    public Map<String, Object> f15087b = new HashMap();

    public C5951dx(byte b) {
        this.f15086a = b;
    }

    /* renamed from: a */
    public final <T> T mo35066a(String str, Class<T> cls) {
        Object obj = this.f15087b.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
