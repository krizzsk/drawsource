package com.ogury.p377ed.internal;

import java.net.URLDecoder;

/* renamed from: com.ogury.ed.internal.gn */
public final class C10060gn {
    /* renamed from: a */
    public static final String m29207a(String str) {
        C10263mq.m29882b(str, "<this>");
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C10263mq.m29879a((Object) decode, "{\n        URLDecoder.decode(this, \"UTF-8\")\n    }");
            return decode;
        } catch (Exception unused) {
            return "";
        }
    }
}
