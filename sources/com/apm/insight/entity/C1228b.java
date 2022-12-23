package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.C1239g;
import com.apm.insight.CrashType;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.C1351a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.b */
public final class C1228b {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C1239g> f1116a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static ConcurrentHashMap<Integer, C1239g> f1117b = new ConcurrentHashMap<>();

    /* renamed from: com.apm.insight.entity.b$a */
    public interface C1229a {
        /* renamed from: a */
        void mo12411a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static File m1500a(File file) {
        return new File(file, "all_data.json");
    }

    /* renamed from: a */
    public static JSONArray m1501a() {
        C1239g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo12515c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1502a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C1239g> it = f1116a.iterator();
        while (true) {
            if (it.hasNext()) {
                C1239g next = it.next();
                if (next != null && next.mo12513a(obj)) {
                    jSONArray.put(next.mo12512a(CrashType.JAVA, (JSONArray) null));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1503a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext()) {
            C1239g next = it.next();
            if (next != null && next.mo12513a(obj)) {
                JSONArray a = next.mo12509a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", next.mo12514b());
                    jSONObject.put("lines", a);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m1504a(String str) {
        C1239g next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (C1351a.m2101b(next.mo12514b())) {
                JSONArray a = next.mo12510a(split);
                if (!C1311l.m1860a(a)) {
                    jSONArray.put(next.mo12512a(CrashType.ANR, a));
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1505a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && C1351a.m2103c(String.valueOf(optJSONObject.opt("aid")))) {
                if (!TextUtils.isEmpty(optJSONObject.optString("package"))) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("so_list");
                    if (!C1311l.m1860a(optJSONArray)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= optJSONArray.length()) {
                                break;
                            } else if (str.contains(optJSONArray.optString(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                jSONArray2.put(optJSONObject2);
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONArray m1506a(Throwable th, Thread thread, File file) {
        C1239g next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] b = C1326v.m1978b(th);
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (!C1351a.m2099a(next.mo12514b())) {
                C1321q.m1927a((Object) "not enable javaCrash aid: " + next.mo12514b());
            } else {
                JSONArray a = next.mo12509a(b, th);
                if (!C1311l.m1860a(a)) {
                    jSONArray.put(next.mo12512a(CrashType.JAVA, a));
                }
            }
        }
        if (C1311l.m1860a(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                C1308i.m1828a(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m1507a(C1239g gVar) {
        f1116a.add(gVar);
        if (gVar.mo12516d()) {
            f1117b.put(4444, gVar);
        }
    }

    /* renamed from: a */
    public static void m1508a(JSONObject jSONObject, JSONArray jSONArray, C1229a aVar) {
        JSONObject optJSONObject;
        C1321q.m1927a((Object) "uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
            if (C1311l.m1855a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                C1227a.m1471b(jSONObject2, jSONObject);
                C1227a.m1471b(jSONObject2, optJSONObject);
                aVar.mo12411a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
            i++;
        }
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject3 = new JSONObject();
            C1227a.m1471b(jSONObject3, jSONObject);
            try {
                jSONObject3.put("all_data", jSONArray2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            aVar.mo12411a(jSONObject3);
        }
    }

    /* renamed from: b */
    public static String m1509b(Object obj) {
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext()) {
            C1239g next = it.next();
            if (next != null && next.mo12513a(obj)) {
                return next.mo12514b();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m1510b() {
        C1239g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1239g> it = f1116a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo12511a((CrashType) null));
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static int m1511c() {
        return f1116a.size();
    }
}
