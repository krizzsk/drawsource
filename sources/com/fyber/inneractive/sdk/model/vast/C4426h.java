package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.h */
public enum C4426h {
    Gif("image/gif");
    

    /* renamed from: c */
    public static final Map<String, C4426h> f10898c = null;

    /* renamed from: a */
    public String f10900a;

    /* access modifiers changed from: public */
    static {
        int i;
        f10898c = new HashMap();
        for (C4426h hVar : values()) {
            ((HashMap) f10898c).put(hVar.f10900a, hVar);
        }
    }

    /* access modifiers changed from: public */
    C4426h(String str) {
        this.f10900a = str;
    }
}
