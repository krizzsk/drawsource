package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.config.a */
public class C4203a {
    /* renamed from: a */
    public static C4286x m13183a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        Map<String, C4286x> map = iAConfigManager.f10335a;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return iAConfigManager.f10335a.get(str);
    }

    /* renamed from: b */
    public static C4287y m13186b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        Map<String, C4287y> map = iAConfigManager.f10336b;
        if (map != null && map.containsKey(str)) {
            return iAConfigManager.f10336b.get(str);
        }
        IAlog.m16448c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    /* renamed from: a */
    public static String m13184a() {
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return property + ".inner-active.mobi/simpleM2M/";
    }

    /* renamed from: b */
    public static String m13187b() {
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (!TextUtils.isEmpty(property)) {
            return m13185a(property, "Event");
        }
        return "https://" + IAConfigManager.f10324J.f10343i.f10486g;
    }

    /* renamed from: a */
    public static String m13185a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
