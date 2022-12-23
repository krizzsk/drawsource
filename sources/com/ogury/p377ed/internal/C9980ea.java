package com.ogury.p377ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.ea */
public final class C9980ea {

    /* renamed from: a */
    public static final C9980ea f25081a = new C9980ea();

    /* renamed from: b */
    private static String f25082b = "https://%s-%s.presage.io/%s";

    private C9980ea() {
    }

    /* renamed from: a */
    public static String m28795a() {
        return m28796a("ad_sync", "sy", "v1");
    }

    /* renamed from: b */
    public static String m28798b() {
        return m28796a("pl", "pl", "v2");
    }

    /* renamed from: a */
    public static String m28797a(boolean z) {
        String a = m28796a("p", "pad", "v3");
        return z ? C10312oc.m29952b(a, "https://", "http://") : a;
    }

    /* renamed from: c */
    public static String m28799c() {
        return m28796a("track", "tr", "v1");
    }

    /* renamed from: d */
    public static String m28800d() {
        return m28796a("ad_history", "ah", "v1");
    }

    /* renamed from: a */
    private static String m28796a(String str, String str2, String str3) {
        C10268mv mvVar = C10268mv.f25610a;
        String format = String.format(f25082b + '/' + str, Arrays.copyOf(new Object[]{str2, str3, str3}, 3));
        C10263mq.m29879a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }
}
