package com.apm.insight.p016d;

import com.apm.insight.C1233f;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.p025k.C1278d;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.p027a.C1362f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.d.a */
public class C1219a {
    /* renamed from: a */
    public static void m1420a(String str) {
        m1421a(str, (Map<? extends String, ? extends String>) null, (Map<String, String>) null, (C1233f) null);
    }

    /* renamed from: a */
    public static void m1421a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1233f fVar) {
        m1422a(str, map, map2, (Map<String, String>) null, fVar);
    }

    /* renamed from: a */
    public static void m1422a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C1233f fVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            final String str2 = str;
            final Map<? extends String, ? extends String> map4 = map;
            final Map<String, String> map5 = map2;
            final Map<String, String> map6 = map3;
            final C1233f fVar2 = fVar;
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    boolean z;
                    try {
                        C1227a a = C1362f.m2195a().mo12700a(CrashType.DART, C1227a.m1464a(currentTimeMillis, C1250h.m1615g(), str2));
                        if (map4 != null) {
                            JSONObject optJSONObject = a.mo12488h().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            C1227a.m1468a(optJSONObject, (Map<? extends String, ? extends String>) map4);
                            a.mo12474a("custom", (Object) optJSONObject);
                        }
                        if (map5 != null) {
                            JSONObject optJSONObject2 = a.mo12488h().optJSONObject("custom_long");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            C1227a.m1468a(optJSONObject2, (Map<? extends String, ? extends String>) map5);
                            a.mo12474a("custom_long", (Object) optJSONObject2);
                        }
                        if (map6 != null) {
                            JSONObject optJSONObject3 = a.mo12488h().optJSONObject("filters");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new JSONObject();
                                a.mo12474a("filters", (Object) optJSONObject3);
                            }
                            C1227a.m1468a(optJSONObject3, (Map<? extends String, ? extends String>) map6);
                        }
                        z = C1278d.m1705a().mo12555a(currentTimeMillis, a.mo12488h());
                    } catch (Throwable unused) {
                        z = false;
                    }
                    C1233f fVar = fVar2;
                    if (fVar != null) {
                        try {
                            fVar.mo12505a(z);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
