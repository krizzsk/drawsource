package com.bytedance.sdk.openadsdk.p178l;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.p149e.C3407e;

/* renamed from: com.bytedance.sdk.openadsdk.l.b */
/* compiled from: AutoTestUtils */
public class C3857b {
    /* renamed from: a */
    public static String m12582a(String str) {
        if (!C2905l.m8116c() || TextUtils.isEmpty(str)) {
            return str;
        }
        C3407e eVar = new C3407e(C3457h.m10580d().mo19774n());
        StringBuilder sb = new StringBuilder(str);
        for (String contains : eVar.mo19418b()) {
            if (sb.toString().contains(contains)) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(eVar.mo19417a());
                } else {
                    sb.append("?");
                    sb.append(eVar.mo19417a());
                }
            }
        }
        return sb.toString();
    }
}
