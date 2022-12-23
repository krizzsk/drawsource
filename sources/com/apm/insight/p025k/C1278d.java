package com.apm.insight.p025k;

import android.content.Context;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.p022h.C1253b;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.p026l.C1322r;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1397r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.d */
public class C1278d {

    /* renamed from: a */
    private static volatile C1278d f1257a;

    /* renamed from: b */
    private volatile Context f1258b;

    private C1278d(Context context) {
        this.f1258b = context;
    }

    /* renamed from: a */
    public static C1278d m1705a() {
        if (f1257a == null) {
            f1257a = new C1278d(C1250h.m1615g());
        }
        return f1257a;
    }

    /* renamed from: a */
    public void mo12553a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String f = C1280e.m1734f();
                File file = new File(C1318o.m1887a(this.f1258b), C1318o.m1899c());
                C1308i.m1822a(file, file.getName(), f, jSONObject, C1280e.m1726b());
                if (C1280e.m1712a(f, jSONObject.toString()).mo12574a()) {
                    C1308i.m1834a(file);
                }
            } catch (Throwable th) {
                C1321q.m1934b(th);
            }
        }
    }

    /* renamed from: a */
    public void mo12554a(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C1280e.m1729c();
                int i = 0;
                File file = new File(C1318o.m1887a(this.f1258b), C1250h.m1600a(j, CrashType.ANR, false, false));
                C1308i.m1822a(file, file.getName(), c, jSONObject, C1280e.m1726b());
                if (!z) {
                    return;
                }
                if (!Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    C1322r.m1938a(jSONObject);
                    if (C1351a.m2110j()) {
                        HashMap<String, C1397r.C1398a> a = C1397r.m2330a(j, "anr_trace");
                        fileArr = new File[(a.size() + 2)];
                        for (Map.Entry next : a.entrySet()) {
                            if (!((String) next.getKey()).equals(C1295a.m1782c(this.f1258b))) {
                                fileArr[i] = C1318o.m1888a(this.f1258b, ((C1397r.C1398a) next.getValue()).f1495b);
                                i++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = C1318o.m1888a(this.f1258b, C1250h.m1614f());
                    fileArr[fileArr.length - 2] = C1397r.m2329a(j);
                    if (C1280e.m1714a(c, jSONObject.toString(), fileArr).mo12574a()) {
                        C1308i.m1834a(file);
                        if (!Npth.hasCrash()) {
                            C1308i.m1834a(C1318o.m1903e(C1250h.m1615g()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo12555a(long j, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C1280e.m1729c();
                File file = new File(C1318o.m1887a(this.f1258b), C1318o.m1891a(C1250h.m1613e()));
                C1308i.m1822a(file, file.getName(), c, jSONObject, C1280e.m1718a());
                jSONObject.put("upload_scene", "direct");
                C1322r.m1938a(jSONObject);
                if (!C1280e.m1723b(c, jSONObject.toString()).mo12574a()) {
                    return false;
                }
                C1308i.m1834a(file);
                return true;
            } catch (Throwable th) {
                C1321q.m1934b(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo12556a(JSONObject jSONObject, File file, File file2) {
        try {
            String g = C1280e.m1735g();
            C1322r.m1938a(jSONObject);
            return C1280e.m1714a(g, jSONObject.toString(), file, file2, C1397r.m2329a(System.currentTimeMillis()), new File(C1253b.m1633a())).mo12574a();
        } catch (Throwable th) {
            C1321q.m1934b(th);
            return false;
        }
    }

    /* renamed from: b */
    public void mo12557b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    String c = C1280e.m1729c();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C1280e.m1723b(c, jSONObject.toString());
                }
            });
        }
    }
}
