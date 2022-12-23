package com.applovin.impl.mediation.debugger.p037b.p038a;

import com.applovin.impl.mediation.debugger.p036a.C1663b;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.b */
public class C1666b {

    /* renamed from: a */
    private final C1668d f2360a;

    /* renamed from: b */
    private final C1669e f2361b;

    /* renamed from: c */
    private final List<C1669e> f2362c;

    /* renamed from: d */
    private final List<C1663b> f2363d;

    public C1666b(JSONObject jSONObject, MaxAdFormat maxAdFormat, C1671b bVar, C1969m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f2361b = new C1669e(jSONObject2, mVar);
        } else {
            this.f2361b = null;
        }
        this.f2360a = new C1668d(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        this.f2363d = bVar.mo13676x() ? new ArrayList() : null;
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f2362c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f2362c.add(new C1669e(jSONObject3, mVar));
            }
            List<C1663b> list = this.f2363d;
            if (list != null) {
                list.add(new C1663b(JsonUtils.getString(jSONObject3, "id", ""), JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null), maxAdFormat));
            }
        }
    }

    /* renamed from: a */
    public C1668d mo13629a() {
        return this.f2360a;
    }

    /* renamed from: b */
    public C1669e mo13630b() {
        return this.f2361b;
    }

    /* renamed from: c */
    public boolean mo13631c() {
        return this.f2361b != null;
    }

    /* renamed from: d */
    public List<C1669e> mo13632d() {
        return this.f2362c;
    }

    /* renamed from: e */
    public List<C1663b> mo13633e() {
        return this.f2363d;
    }
}
