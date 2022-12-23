package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.ep */
public final class C9996ep {

    /* renamed from: a */
    public static final C9996ep f25149a = new C9996ep();

    private C9996ep() {
    }

    /* renamed from: a */
    public static C9995eo m28933a(String str) {
        C10263mq.m29882b(str, "impressionSource");
        if (C10263mq.m29881a((Object) str, (Object) "sdk")) {
            return C9995eo.IMPRESSION_SOURCE_SDK;
        }
        C10263mq.m29881a((Object) str, (Object) "format");
        return C9995eo.IMPRESSION_SOURCE_FORMAT;
    }
}
