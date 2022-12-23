package com.ogury.p377ed.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.dc */
public final class C9928dc {

    /* renamed from: a */
    public static final C9928dc f24979a = new C9928dc();

    /* renamed from: b */
    private static final Bundle f24980b = new Bundle();

    private C9928dc() {
    }

    /* renamed from: a */
    public static void m28656a(String str, Boolean bool) {
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f24980b.putBoolean(str, bool.booleanValue());
        } else {
            m28662d(str);
        }
    }

    /* renamed from: a */
    public static void m28657a(String str, String str2) {
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        if (str2 != null) {
            f24980b.putString(str, str2);
        } else {
            m28662d(str);
        }
    }

    /* renamed from: a */
    public static Boolean m28655a(String str) {
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        if (m28661c(str)) {
            return Boolean.valueOf(f24980b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: b */
    public static String m28659b(String str) {
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        return f24980b.getString(str, (String) null);
    }

    /* renamed from: b */
    public static String m28660b(String str, String str2) {
        C10263mq.m29882b(str, SDKConstants.PARAM_KEY);
        C10263mq.m29882b(str2, "defaultValue");
        String string = f24980b.getString(str, str2);
        C10263mq.m29879a((Object) string, "extraAdConfigurations.getString(key, defaultValue)");
        return string;
    }

    /* renamed from: c */
    private static boolean m28661c(String str) {
        C10263mq.m29882b(str, "configurationKey");
        return f24980b.containsKey(str);
    }

    /* renamed from: d */
    private static void m28662d(String str) {
        C10263mq.m29882b(str, "configurationKey");
        f24980b.remove(str);
    }

    /* renamed from: a */
    public static boolean m28658a() {
        return C10263mq.m29881a((Object) m28655a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE) || C10263mq.m29881a((Object) m28655a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
    }
}
