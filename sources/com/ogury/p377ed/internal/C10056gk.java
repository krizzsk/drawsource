package com.ogury.p377ed.internal;

import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.gk */
public final class C10056gk {
    /* renamed from: a */
    public static final String m29200a(SharedPreferences sharedPreferences, String str, String str2) {
        C10263mq.m29882b(sharedPreferences, "<this>");
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        C10263mq.m29882b(str2, "defaultValue");
        String string = sharedPreferences.getString(str, str2);
        return string == null ? str2 : string;
    }
}
