package com.bytedance.sdk.openadsdk.p133c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.openadsdk.p178l.C3896v;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.c.d */
/* compiled from: NetHook */
public final class C3150d extends C3147a {

    /* renamed from: a */
    public static C3149c f7390a;

    /* renamed from: a */
    public String mo18777a() {
        return "net";
    }

    /* renamed from: a */
    public static String m9112a(C2848c cVar, String str) {
        C3149c a;
        if (!C3896v.m12744c() || (a = C3148b.m9110a("net")) == null) {
            return str;
        }
        Map map = (Map) a.mo18776a(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                cVar.mo17714b(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
