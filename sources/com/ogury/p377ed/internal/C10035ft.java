package com.ogury.p377ed.internal;

import java.lang.reflect.Field;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.ft */
public final class C10035ft {
    /* renamed from: a */
    public static final void m29150a(AdConfig adConfig, String str) {
        C10263mq.m29882b(str, "campaignId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("campaignId");
            C10263mq.m29879a((Object) declaredField, "this::class.java.getDeclaredField(\"campaignId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }

    /* renamed from: b */
    public static final void m29151b(AdConfig adConfig, String str) {
        C10263mq.m29882b(str, "creativeId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("creativeId");
            C10263mq.m29879a((Object) declaredField, "this::class.java.getDeclaredField(\"creativeId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }
}
