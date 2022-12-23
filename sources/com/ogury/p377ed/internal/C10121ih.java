package com.ogury.p377ed.internal;

import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ih */
public class C10121ih extends C10159ji {

    /* renamed from: a */
    private final Pattern f25423a;

    /* renamed from: b */
    private final String f25424b;

    public C10121ih(Pattern pattern) {
        C10263mq.m29882b(pattern, "whitelistPattern");
        this.f25423a = pattern;
        this.f25424b = pattern.pattern();
    }

    /* renamed from: a */
    public final boolean mo64904a(String str) {
        C10263mq.m29882b(str, "url");
        String str2 = this.f25424b;
        C10263mq.m29879a((Object) str2, "stringPattern");
        return (str2.length() > 0) && !this.f25423a.matcher(str).find();
    }
}
