package com.applovin.impl.mediation.debugger.p037b.p039b;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.a */
public class C1670a {

    /* renamed from: a */
    private final String f2375a;

    /* renamed from: b */
    private final String f2376b;

    /* renamed from: c */
    private final boolean f2377c;

    C1670a(JSONObject jSONObject, C1969m mVar) {
        this.f2375a = JsonUtils.getString(jSONObject, "name", "");
        this.f2376b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", (List) null);
        this.f2377c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    /* renamed from: a */
    public static boolean m3424a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    /* renamed from: a */
    public String mo13647a() {
        return this.f2375a;
    }

    /* renamed from: b */
    public String mo13648b() {
        return this.f2376b;
    }

    /* renamed from: c */
    public boolean mo13649c() {
        return this.f2377c;
    }
}
