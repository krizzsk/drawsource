package com.bytedance.sdk.component.adexpress.p089a.p092c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2630f;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.c.a */
/* compiled from: TempPkgModel */
public class C2544a {

    /* renamed from: a */
    private String f5371a;

    /* renamed from: b */
    private String f5372b;

    /* renamed from: c */
    private String f5373c;

    /* renamed from: d */
    private String f5374d;

    /* renamed from: e */
    private List<C2545a> f5375e;

    /* renamed from: a */
    public String mo16592a() {
        return this.f5371a;
    }

    /* renamed from: a */
    public void mo16593a(String str) {
        this.f5371a = str;
    }

    /* renamed from: b */
    public String mo16595b() {
        return this.f5372b;
    }

    /* renamed from: b */
    public void mo16596b(String str) {
        this.f5372b = str;
    }

    /* renamed from: c */
    public String mo16597c() {
        return this.f5373c;
    }

    /* renamed from: c */
    public void mo16598c(String str) {
        this.f5373c = str;
    }

    /* renamed from: d */
    public String mo16599d() {
        return this.f5374d;
    }

    /* renamed from: d */
    public void mo16600d(String str) {
        this.f5374d = str;
    }

    /* renamed from: e */
    public List<C2545a> mo16601e() {
        if (this.f5375e == null) {
            this.f5375e = new ArrayList();
        }
        return this.f5375e;
    }

    /* renamed from: a */
    public void mo16594a(List<C2545a> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f5375e = list;
    }

    /* renamed from: f */
    public boolean mo16602f() {
        return !TextUtils.isEmpty(mo16597c()) && !TextUtils.isEmpty(mo16595b()) && !TextUtils.isEmpty(mo16592a());
    }

    /* renamed from: g */
    public String mo16603g() {
        if (!mo16602f()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", mo16592a());
            jSONObject.putOpt("version", mo16595b());
            jSONObject.putOpt("main", mo16597c());
            jSONObject.putOpt("fallback", mo16599d());
            JSONArray jSONArray = new JSONArray();
            if (mo16601e() != null) {
                for (C2545a next : mo16601e()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", next.mo16604a());
                    jSONObject2.putOpt(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, next.mo16607b());
                    jSONObject2.putOpt("level", Integer.valueOf(next.mo16609c()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.a.c.a$a */
    /* compiled from: TempPkgModel */
    public static class C2545a {

        /* renamed from: a */
        private String f5376a;

        /* renamed from: b */
        private String f5377b;

        /* renamed from: c */
        private int f5378c;

        public boolean equals(Object obj) {
            if (!(obj instanceof C2545a)) {
                return super.equals(obj);
            }
            String str = this.f5376a;
            return str != null && str.equals(((C2545a) obj).mo16604a());
        }

        /* renamed from: a */
        public String mo16604a() {
            return this.f5376a;
        }

        /* renamed from: a */
        public void mo16606a(String str) {
            this.f5376a = str;
        }

        /* renamed from: b */
        public String mo16607b() {
            return this.f5377b;
        }

        /* renamed from: b */
        public void mo16608b(String str) {
            this.f5377b = str;
        }

        /* renamed from: c */
        public int mo16609c() {
            return this.f5378c;
        }

        /* renamed from: a */
        public void mo16605a(int i) {
            this.f5378c = i;
        }
    }

    /* renamed from: e */
    public static C2544a m6422e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m6421a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C2544a m6421a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2544a aVar = new C2544a();
        aVar.mo16593a(jSONObject.optString("name"));
        aVar.mo16596b(jSONObject.optString("version"));
        aVar.mo16598c(jSONObject.optString("main"));
        String optString = jSONObject.optString("fallback_optimize");
        aVar.mo16600d(optString);
        C2630f.m7038a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C2545a aVar2 = new C2545a();
                aVar2.mo16606a(optJSONObject.optString("url"));
                aVar2.mo16608b(optJSONObject.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5));
                aVar2.mo16605a(optJSONObject.optInt("level"));
                arrayList.add(aVar2);
            }
        }
        aVar.mo16594a((List<C2545a>) arrayList);
        if (!aVar.mo16602f()) {
            return null;
        }
        return aVar;
    }
}
