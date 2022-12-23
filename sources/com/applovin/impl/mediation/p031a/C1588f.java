package com.applovin.impl.mediation.p031a;

import android.os.Bundle;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.f */
public class C1588f {

    /* renamed from: a */
    private final JSONObject f2094a;

    /* renamed from: b */
    protected final C1969m f2095b;

    /* renamed from: c */
    private final JSONObject f2096c;

    /* renamed from: d */
    private final Map<String, Object> f2097d;

    /* renamed from: e */
    private final Object f2098e = new Object();

    /* renamed from: f */
    private final Object f2099f = new Object();

    /* renamed from: g */
    private String f2100g;

    /* renamed from: h */
    private String f2101h;

    public C1588f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f2095b = mVar;
            this.f2094a = jSONObject2;
            this.f2096c = jSONObject;
            this.f2097d = map;
        } else {
            throw new IllegalArgumentException("No ad object specified");
        }
    }

    /* renamed from: a */
    private int mo13356a() {
        return mo13454b("mute_state", mo13447a("mute_state", ((Integer) this.f2095b.mo14534a(C1866a.f3057K)).intValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public JSONObject mo13428I() {
        JSONObject jSONObject;
        synchronized (this.f2099f) {
            jSONObject = this.f2094a;
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public JSONObject mo13429J() {
        JSONObject jSONObject;
        synchronized (this.f2098e) {
            jSONObject = this.f2096c;
        }
        return jSONObject;
    }

    /* renamed from: K */
    public String mo13430K() {
        return mo13457b("class", (String) null);
    }

    /* renamed from: L */
    public String mo13431L() {
        return mo13457b("name", (String) null);
    }

    /* renamed from: M */
    public String mo13432M() {
        return mo13431L().split("_")[0];
    }

    /* renamed from: N */
    public boolean mo13433N() {
        return mo13456b("is_testing", (Boolean) false).booleanValue();
    }

    /* renamed from: O */
    public Boolean mo13434O() {
        String str = this.f2095b.mo14586p().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13459b("huc") ? mo13456b("huc", (Boolean) false) : mo13449a("huc", (Boolean) null);
    }

    /* renamed from: P */
    public Boolean mo13435P() {
        String str = this.f2095b.mo14586p().getExtraParameters().get("aru");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13459b("aru") ? mo13456b("aru", (Boolean) false) : mo13449a("aru", (Boolean) null);
    }

    /* renamed from: Q */
    public Boolean mo13436Q() {
        String str = this.f2095b.mo14586p().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13459b("dns") ? mo13456b("dns", (Boolean) false) : mo13449a("dns", (Boolean) null);
    }

    /* renamed from: R */
    public String mo13437R() {
        return mo13459b("consent_string") ? mo13457b("consent_string", (String) null) : mo13450a("consent_string", (String) null);
    }

    /* renamed from: S */
    public boolean mo13438S() {
        return mo13456b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    /* renamed from: T */
    public Map<String, Object> mo13439T() {
        return this.f2097d;
    }

    /* renamed from: U */
    public Bundle mo13440U() {
        Bundle bundle = mo13460c("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(mo13452a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = mo13356a();
        if (a != -1) {
            bundle.putBoolean("is_muted", a == 2 ? this.f2095b.mo14586p().isMuted() : a == 0);
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", mo13448a("amount", 0));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", mo13450a("currency", ""));
        }
        return bundle;
    }

    /* renamed from: V */
    public Bundle mo13441V() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), mo13440U());
    }

    /* renamed from: W */
    public long mo13442W() {
        return mo13455b("adapter_timeout_ms", ((Long) this.f2095b.mo14534a(C1866a.f3080l)).longValue());
    }

    /* renamed from: X */
    public long mo13443X() {
        return mo13455b("init_completion_delay_ms", -1);
    }

    /* renamed from: Y */
    public long mo13444Y() {
        return mo13455b("auto_init_delay_ms", 0);
    }

    /* renamed from: Z */
    public String mo13445Z() {
        return this.f2101h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo13446a(String str, float f) {
        float f2;
        synchronized (this.f2098e) {
            f2 = JsonUtils.getFloat(this.f2096c, str, f);
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13447a(String str, int i) {
        int i2;
        synchronized (this.f2099f) {
            i2 = JsonUtils.getInt(this.f2094a, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo13448a(String str, long j) {
        long j2;
        synchronized (this.f2099f) {
            j2 = JsonUtils.getLong(this.f2094a, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo13449a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f2099f) {
            bool2 = JsonUtils.getBoolean(this.f2094a, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13450a(String str, String str2) {
        String string;
        synchronized (this.f2099f) {
            string = JsonUtils.getString(this.f2094a, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo13451a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f2099f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2094a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo13452a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f2098e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f2096c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13453a(String str, Object obj) {
        synchronized (this.f2098e) {
            JsonUtils.putObject(this.f2096c, str, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13454b(String str, int i) {
        int i2;
        synchronized (this.f2098e) {
            i2 = JsonUtils.getInt(this.f2096c, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo13455b(String str, long j) {
        long j2;
        synchronized (this.f2098e) {
            j2 = JsonUtils.getLong(this.f2096c, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Boolean mo13456b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f2098e) {
            bool2 = JsonUtils.getBoolean(this.f2096c, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13457b(String str, String str2) {
        String string;
        synchronized (this.f2098e) {
            string = JsonUtils.getString(this.f2096c, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo13458b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f2098e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2096c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13459b(String str) {
        boolean has;
        synchronized (this.f2098e) {
            has = this.f2096c.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo13460c(String str) {
        Object opt;
        synchronized (this.f2098e) {
            opt = this.f2096c.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13461c(String str, int i) {
        synchronized (this.f2098e) {
            JsonUtils.putInt(this.f2096c, str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13462c(String str, long j) {
        synchronized (this.f2098e) {
            JsonUtils.putLong(this.f2096c, str, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13463c(String str, String str2) {
        synchronized (this.f2098e) {
            JsonUtils.putString(this.f2096c, str, str2);
        }
    }

    /* renamed from: d */
    public void mo13464d(String str) {
        this.f2100g = str;
    }

    /* renamed from: e */
    public void mo13465e(String str) {
        this.f2101h = str;
    }

    /* renamed from: f */
    public List<String> mo13466f(String str) {
        if (str != null) {
            List optList = JsonUtils.optList(mo13451a(str, new JSONArray()), Collections.EMPTY_LIST);
            List optList2 = JsonUtils.optList(mo13458b(str, new JSONArray()), Collections.EMPTY_LIST);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* renamed from: g */
    public String mo13467g(String str) {
        String b = mo13457b(str, "");
        return StringUtils.isValidString(b) ? b : mo13450a(str, "");
    }

    public String getAdUnitId() {
        return mo13450a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f2100g;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + mo13430K() + "', adapterName='" + mo13431L() + "', isTesting=" + mo13433N() + '}';
    }
}
