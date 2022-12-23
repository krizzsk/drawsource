package com.bytedance.sdk.openadsdk.core.p154j.p157b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3474a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3482a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3484b;
import com.bytedance.sdk.openadsdk.core.p154j.p158c.C3499c;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c */
/* compiled from: VastTracker */
public class C3487c {

    /* renamed from: a */
    private String f8708a;

    /* renamed from: b */
    private C3490b f8709b;

    /* renamed from: c */
    private boolean f8710c;

    /* renamed from: d */
    private boolean f8711d;

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$b */
    /* compiled from: VastTracker */
    enum C3490b {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    protected C3487c(String str, C3490b bVar, Boolean bool) {
        this.f8708a = str;
        this.f8709b = bVar;
        this.f8710c = bool.booleanValue();
    }

    /* renamed from: c */
    public String mo19928c() {
        return this.f8708a;
    }

    /* renamed from: d */
    public boolean mo19929d() {
        return this.f8710c;
    }

    /* renamed from: f_ */
    public void mo19926f_() {
        this.f8711d = true;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$a */
    /* compiled from: VastTracker */
    public static class C3489a {

        /* renamed from: a */
        private String f8712a;

        /* renamed from: b */
        private C3490b f8713b = C3490b.TRACKING_URL;

        /* renamed from: c */
        private boolean f8714c = false;

        public C3489a(String str) {
            this.f8712a = str;
        }

        /* renamed from: a */
        public C3489a mo19931a(boolean z) {
            this.f8714c = z;
            return this;
        }

        /* renamed from: a */
        public C3487c mo19932a() {
            return new C3487c(this.f8712a, this.f8713b, Boolean.valueOf(this.f8714c));
        }
    }

    /* renamed from: e */
    public boolean mo19930e() {
        return this.f8711d;
    }

    /* renamed from: a */
    public static List<String> m10843a(List<C3487c> list, C3474a aVar, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C3487c next : list) {
            if (next != null && (!next.mo19930e() || next.mo19929d())) {
                arrayList.add(next.mo19928c());
                next.mo19926f_();
            }
        }
        return new C3499c(arrayList).mo19941a(aVar).mo19940a(j).mo19942a(str).mo19943a();
    }

    /* renamed from: b */
    public static void m10849b(List<C3487c> list, C3474a aVar, long j, String str) {
        m10846a(m10843a(list, aVar, j, str));
    }

    /* renamed from: a */
    public static void m10846a(List<String> list) {
        C2846b c;
        for (String next : list) {
            if (!(next == null || (c = C3792d.m12395a().mo20615b().mo17684c()) == null)) {
                c.mo17711a(next);
                c.mo17708a(new C2842a() {
                    /* renamed from: a */
                    public void mo17693a(C2848c cVar, C2843b bVar) {
                    }

                    /* renamed from: a */
                    public void mo17694a(C2848c cVar, IOException iOException) {
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public static JSONArray m10848b(List<C3487c> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).mo19928c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static List<C3487c> m10844a(JSONArray jSONArray) {
        return m10845a(jSONArray, false);
    }

    /* renamed from: a */
    public static List<C3487c> m10845a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C3489a(optString).mo19931a(z).mo19932a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C3484b> m10847b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C3484b.C3486a(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).mo19927a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<C3482a> m10850c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C3482a.C3483a(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0)).mo19921a());
                }
            }
        }
        return arrayList;
    }
}
