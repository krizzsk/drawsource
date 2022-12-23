package com.ogury.p377ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.gg */
public final class C10052gg {
    /* renamed from: a */
    public static final int m29192a(Map<String, String> map, String str) {
        C10263mq.m29882b(map, "<this>");
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        String str2 = map.get(str);
        if (str2 != null) {
            return Integer.parseInt(str2);
        }
        throw new IllegalStateException(("Key " + str + " not found in map").toString());
    }
}
