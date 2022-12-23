package com.ogury.p377ed.internal;

import java.util.Locale;

/* renamed from: com.ogury.ed.internal.hl */
public final class C10090hl {
    /* renamed from: a */
    public static final boolean m29328a(String str) {
        C10263mq.m29882b(str, "<this>");
        Locale locale = Locale.US;
        C10263mq.m29879a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C10263mq.m29879a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C10312oc.m29953b(lowerCase, "http://ogymraid") || C10312oc.m29953b(lowerCase, "https://ogymraid");
    }

    /* renamed from: b */
    public static final String m29329b(String str) {
        C10263mq.m29882b(str, "<this>");
        Locale locale = Locale.US;
        C10263mq.m29879a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C10263mq.m29879a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String str2 = "http://ogymraid";
        if (!C10312oc.m29953b(lowerCase, str2)) {
            str2 = "https://ogymraid";
        }
        String substring = str.substring(C10263mq.m29874a(str2, (Object) "/?q=").length());
        C10263mq.m29879a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
