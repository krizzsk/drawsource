package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.h */
public class C2017h {

    /* renamed from: a */
    private String f3899a;

    /* renamed from: b */
    private String f3900b;

    /* renamed from: c */
    private String f3901c;

    /* renamed from: d */
    private String f3902d;

    /* renamed from: e */
    private Map<String, String> f3903e;

    /* renamed from: f */
    private Map<String, String> f3904f;

    /* renamed from: g */
    private Map<String, Object> f3905g;

    /* renamed from: h */
    private boolean f3906h;

    /* renamed from: i */
    private boolean f3907i;

    /* renamed from: j */
    private boolean f3908j;

    /* renamed from: k */
    private String f3909k;

    /* renamed from: l */
    private int f3910l;

    /* renamed from: com.applovin.impl.sdk.network.h$a */
    public static class C2019a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f3911a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f3912b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f3913c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f3914d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, String> f3915e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Map<String, String> f3916f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Map<String, Object> f3917g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f3918h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f3919i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f3920j;

        /* renamed from: a */
        public C2019a mo14791a(String str) {
            this.f3911a = str;
            return this;
        }

        /* renamed from: a */
        public C2019a mo14792a(Map<String, String> map) {
            this.f3915e = map;
            return this;
        }

        /* renamed from: a */
        public C2019a mo14793a(boolean z) {
            this.f3918h = z;
            return this;
        }

        /* renamed from: a */
        public C2017h mo14794a() {
            return new C2017h(this);
        }

        /* renamed from: b */
        public C2019a mo14795b(String str) {
            this.f3912b = str;
            return this;
        }

        /* renamed from: b */
        public C2019a mo14796b(Map<String, String> map) {
            this.f3916f = map;
            return this;
        }

        /* renamed from: b */
        public C2019a mo14797b(boolean z) {
            this.f3919i = z;
            return this;
        }

        /* renamed from: c */
        public C2019a mo14798c(String str) {
            this.f3913c = str;
            return this;
        }

        /* renamed from: c */
        public C2019a mo14799c(Map<String, Object> map) {
            this.f3917g = map;
            return this;
        }

        /* renamed from: c */
        public C2019a mo14800c(boolean z) {
            this.f3920j = z;
            return this;
        }

        /* renamed from: d */
        public C2019a mo14801d(String str) {
            this.f3914d = str;
            return this;
        }
    }

    private C2017h(C2019a aVar) {
        this.f3899a = UUID.randomUUID().toString();
        this.f3900b = aVar.f3912b;
        this.f3901c = aVar.f3913c;
        this.f3902d = aVar.f3914d;
        this.f3903e = aVar.f3915e;
        this.f3904f = aVar.f3916f;
        this.f3905g = aVar.f3917g;
        this.f3906h = aVar.f3918h;
        this.f3907i = aVar.f3919i;
        this.f3908j = aVar.f3920j;
        this.f3909k = aVar.f3911a;
        this.f3910l = 0;
    }

    C2017h(JSONObject jSONObject, C1969m mVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>(0);
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>(0);
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>(0);
        this.f3899a = string;
        this.f3909k = string2;
        this.f3901c = string3;
        this.f3902d = string4;
        this.f3903e = synchronizedMap;
        this.f3904f = synchronizedMap2;
        this.f3905g = synchronizedMap3;
        this.f3906h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f3907i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f3908j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f3910l = i;
    }

    /* renamed from: o */
    public static C2019a m4735o() {
        return new C2019a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14774a() {
        return this.f3900b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo14775b() {
        return this.f3901c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo14776c() {
        return this.f3902d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> mo14777d() {
        return this.f3903e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo14778e() {
        return this.f3904f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3899a.equals(((C2017h) obj).f3899a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, Object> mo14780f() {
        return this.f3905g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo14781g() {
        return this.f3906h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14782h() {
        return this.f3907i;
    }

    public int hashCode() {
        return this.f3899a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo14784i() {
        return this.f3908j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo14785j() {
        return this.f3909k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo14786k() {
        return this.f3910l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14787l() {
        this.f3910l++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo14788m() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f3903e;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f3903e = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public JSONObject mo14789n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f3899a);
        jSONObject.put("communicatorRequestId", this.f3909k);
        jSONObject.put("httpMethod", this.f3900b);
        jSONObject.put("targetUrl", this.f3901c);
        jSONObject.put("backupUrl", this.f3902d);
        jSONObject.put("isEncodingEnabled", this.f3906h);
        jSONObject.put("gzipBodyEncoding", this.f3907i);
        jSONObject.put("attemptNumber", this.f3910l);
        if (this.f3903e != null) {
            jSONObject.put("parameters", new JSONObject(this.f3903e));
        }
        if (this.f3904f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f3904f));
        }
        if (this.f3905g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f3905g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f3899a + '\'' + ", communicatorRequestId='" + this.f3909k + '\'' + ", httpMethod='" + this.f3900b + '\'' + ", targetUrl='" + this.f3901c + '\'' + ", backupUrl='" + this.f3902d + '\'' + ", attemptNumber=" + this.f3910l + ", isEncodingEnabled=" + this.f3906h + ", isGzipBodyEncoding=" + this.f3907i + '}';
    }
}
