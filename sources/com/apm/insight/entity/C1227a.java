package com.apm.insight.entity;

import android.content.Context;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.apm.insight.C1250h;
import com.apm.insight.nativecrash.C1333b;
import com.apm.insight.nativecrash.C1340c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1311l;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.p027a.C1353b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.a */
public class C1227a {

    /* renamed from: a */
    protected JSONObject f1114a;

    /* renamed from: b */
    protected Header f1115b;

    public C1227a() {
        this.f1114a = new JSONObject();
    }

    public C1227a(JSONObject jSONObject) {
        this.f1114a = jSONObject;
    }

    /* renamed from: a */
    public static C1227a m1464a(long j, Context context, String str) {
        C1227a aVar = new C1227a();
        aVar.mo12474a("is_dart", (Object) 1);
        aVar.mo12474a("crash_time", (Object) Long.valueOf(j));
        aVar.mo12474a("process_name", (Object) C1295a.m1782c(context));
        aVar.mo12474a("data", (Object) str);
        C1295a.m1775a(context, aVar.mo12488h());
        return aVar;
    }

    /* renamed from: a */
    public static C1227a m1465a(long j, Context context, Thread thread, Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        C1227a aVar = new C1227a();
        aVar.mo12474a("isJava", (Object) 1);
        aVar.mo12474a("data", (Object) C1326v.m1960a(th));
        aVar.mo12474a("crash_time", (Object) Long.valueOf(j));
        aVar.mo12474a("process_name", (Object) C1295a.m1782c(context));
        if (!C1295a.m1781b(context)) {
            aVar.mo12474a("remote_process", (Object) 1);
        }
        String name = thread == null ? null : thread.getName();
        if (name != null) {
            aVar.mo12474a("crash_thread_name", (Object) name);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m1466a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, str3);
        }
    }

    /* renamed from: a */
    public static void m1467a(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt(str) != null) {
            int i = 0;
            while (i < 5) {
                if (jSONObject.opt(str + i) == null) {
                    str = str + i;
                } else {
                    i++;
                }
            }
            return;
        }
        try {
            jSONObject.put(str, C1326v.m1960a(th));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1468a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1469a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        try {
            jSONObject3.put("storage", jSONObject4);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject4.optLong("inner_free");
        long optLong2 = jSONObject4.optLong("sdcard_free");
        long optLong3 = jSONObject4.optLong("inner_free_real");
        String str = "1M - 64M";
        String str2 = optLong <= 1024 ? "0 - 1K" : optLong <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH ? "1K - 64K" : optLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "64K - 512K" : optLong <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? "512K - 1M" : optLong <= 67108864 ? str : "64M - ";
        String str3 = optLong3 <= 1024 ? "0 - 1K" : optLong3 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH ? "1K - 64K" : optLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "64K - 512K" : optLong3 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? "512K - 1M" : optLong3 <= 67108864 ? str : "64M - ";
        if (optLong2 <= 1024) {
            str = "0 - 1K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str = "1K - 64K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str = "512K - 1M";
        } else if (optLong2 > 67108864) {
            str = "64M - ";
        }
        m1466a(jSONObject3, "filters", "inner_free", str2);
        m1466a(jSONObject3, "filters", "inner_free_real", str3);
        m1466a(jSONObject3, "filters", "sdcard_free", str);
    }

    /* renamed from: a */
    public static boolean m1470a(String str) {
        return C1318o.m1902d(str).exists();
    }

    /* renamed from: b */
    public static void m1471b(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt2 = jSONObject.opt(next);
                    if (opt2 == null) {
                        opt = jSONObject2.opt(next);
                    } else {
                        if (opt2 instanceof JSONObject) {
                            jSONObject3 = jSONObject.getJSONObject(next);
                            jSONObject4 = jSONObject2.getJSONObject(next);
                        } else if (opt2 instanceof JSONArray) {
                            JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                            if (optJSONArray != null) {
                                JSONArray jSONArray = (JSONArray) opt2;
                                if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        jSONArray.put(optJSONArray.get(i));
                                    }
                                } else {
                                    jSONObject3 = jSONArray.getJSONObject(0);
                                    jSONObject4 = optJSONArray.getJSONObject(0);
                                }
                            }
                        } else {
                            opt = jSONObject2.opt(next);
                        }
                        m1471b(jSONObject3, jSONObject4);
                    }
                    jSONObject.put(next, opt);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static boolean m1472b(String str) {
        return ((long) C1340c.m2079c(str)) > C1333b.m2048i();
    }

    /* renamed from: c */
    public static boolean m1473c(String str) {
        return C1340c.m2076a(str) > 960;
    }

    /* renamed from: d */
    public static boolean m1474d(String str) {
        return C1340c.m2078b(str) > 350;
    }

    /* renamed from: a */
    public C1227a mo12465a(int i, String str) {
        try {
            this.f1114a.put("miniapp_id", i);
            this.f1114a.put("miniapp_version", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C1227a mo12466a(long j) {
        try {
            mo12474a("app_start_time", (Object) Long.valueOf(j));
            mo12474a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C1227a mo12467a(Header header) {
        mo12474a("header", (Object) header.mo12464f());
        this.f1115b = header;
        return this;
    }

    /* renamed from: a */
    public C1227a mo12468a(C1353b bVar) {
        mo12474a("activity_trace", (Object) bVar.mo12674g());
        mo12470a("activity_track", bVar.mo12676i());
        return this;
    }

    /* renamed from: a */
    public C1227a mo12469a(String str, String str2) {
        Object opt = mo12488h().opt("data");
        m1466a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12488h(), "filters", str, str2);
        return this;
    }

    /* renamed from: a */
    public C1227a mo12470a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = mo12488h().optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo12474a("custom_long", (Object) optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C1227a mo12471a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo12474a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        mo12474a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public C1227a mo12472a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f1114a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String next : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, next);
                jSONObject.put("version_code", map.get(next));
                jSONArray.put(jSONObject);
            }
            this.f1114a.put("plugin_info", jSONArray);
            return this;
        }
    }

    /* renamed from: a */
    public C1227a mo12473a(JSONObject jSONObject) {
        mo12474a("header", (Object) jSONObject);
        return this;
    }

    /* renamed from: a */
    public void mo12474a(String str, Object obj) {
        try {
            this.f1114a.put(str, obj);
        } catch (Exception e) {
            C1321q.m1934b((Throwable) e);
        }
    }

    /* renamed from: a */
    public boolean mo12475a() {
        Object opt = mo12488h().opt("data");
        return opt instanceof JSONArray ? !C1311l.m1862a(((JSONArray) opt).optJSONObject(0), "logcat") : !C1311l.m1862a(this.f1114a, "logcat");
    }

    /* renamed from: b */
    public C1227a mo12476b(String str, String str2) {
        Object opt = mo12488h().opt("data");
        m1466a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12488h(), "custom", str, str2);
        return this;
    }

    /* renamed from: b */
    public C1227a mo12477b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer next : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(next), map.get(next));
                } catch (JSONException e) {
                    C1321q.m1934b((Throwable) e);
                }
            }
            try {
                this.f1114a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* renamed from: b */
    public C1227a mo12478b(JSONObject jSONObject) {
        m1469a(this.f1114a, jSONObject);
        return this;
    }

    /* renamed from: b */
    public void mo12479b() {
        mo12469a("has_logcat", String.valueOf(mo12475a()));
    }

    /* renamed from: c */
    public C1227a mo12480c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject e = mo12484e("filters");
            for (Map.Entry next : map.entrySet()) {
                try {
                    e.put((String) next.getKey(), next.getValue());
                } catch (JSONException unused) {
                }
            }
            mo12474a("filters", (Object) e);
        }
        return this;
    }

    /* renamed from: c */
    public void mo12481c() {
        mo12469a("is_64_devices", String.valueOf(Header.m1443a()));
        mo12469a("is_64_runtime", String.valueOf(NativeImpl.m2022e()));
        mo12469a("is_x86_devices", String.valueOf(Header.m1446b()));
    }

    /* renamed from: c */
    public void mo12482c(JSONObject jSONObject) {
        m1471b(this.f1114a, jSONObject);
    }

    /* renamed from: d */
    public boolean mo12483d() {
        return m1473c(C1250h.m1614f());
    }

    /* renamed from: e */
    public JSONObject mo12484e(String str) {
        Object opt = mo12488h().opt("data");
        JSONObject optJSONObject = opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12488h();
        if (optJSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        mo12474a(str, (Object) jSONObject);
        return jSONObject;
    }

    /* renamed from: e */
    public boolean mo12485e() {
        return m1474d(C1250h.m1614f());
    }

    /* renamed from: f */
    public boolean mo12486f() {
        return m1472b(C1250h.m1614f());
    }

    /* renamed from: g */
    public boolean mo12487g() {
        return m1470a(C1250h.m1614f());
    }

    /* renamed from: h */
    public JSONObject mo12488h() {
        return this.f1114a;
    }

    /* renamed from: i */
    public Header mo12489i() {
        if (this.f1115b == null) {
            Header header = new Header(C1250h.m1615g());
            this.f1115b = header;
            mo12467a(header);
        }
        return this.f1115b;
    }
}
