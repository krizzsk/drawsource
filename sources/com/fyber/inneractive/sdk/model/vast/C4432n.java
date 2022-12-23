package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.n */
public enum C4432n {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    UNKNOWN("unknown");
    

    /* renamed from: f */
    public static final Map<String, C4432n> f10921f = null;

    /* renamed from: a */
    public final String f10923a;

    /* access modifiers changed from: public */
    static {
        int i;
        f10921f = new HashMap();
        for (C4432n nVar : values()) {
            ((HashMap) f10921f).put(nVar.f10923a, nVar);
        }
    }

    /* access modifiers changed from: public */
    C4432n(String str) {
        this.f10923a = str;
    }
}
