package com.apm.insight.p026l;

import android.text.TextUtils;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.s */
public final class C1323s {
    /* renamed from: a */
    public static void m1941a(C1227a aVar, Header header, CrashType crashType) {
        if (aVar != null) {
            m1942a(aVar.mo12488h(), header, crashType);
        }
    }

    /* renamed from: a */
    public static void m1942a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a = C1250h.m1611c().mo12744a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        jSONObject = header.mo12464f();
                        if (jSONObject == null) {
                            return;
                        }
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
