package com.applovin.impl.mediation.debugger.p037b.p038a;

import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.a */
public class C1665a implements Comparable<C1665a> {

    /* renamed from: a */
    private final String f2355a;

    /* renamed from: b */
    private final String f2356b;

    /* renamed from: c */
    private final MaxAdFormat f2357c;

    /* renamed from: d */
    private final C1667c f2358d;

    /* renamed from: e */
    private final List<C1667c> f2359e;

    public C1665a(JSONObject jSONObject, Map<String, C1671b> map, C1969m mVar) {
        this.f2355a = JsonUtils.getString(jSONObject, "name", "");
        this.f2356b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f2357c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", (String) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f2359e = new ArrayList(jSONArray.length());
        C1667c cVar = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C1667c cVar2 = new C1667c(jSONObject2, map, this.f2357c, mVar);
                this.f2359e.add(cVar2);
                if (cVar == null && cVar2.mo13636c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f2358d = cVar;
    }

    /* renamed from: g */
    private C1667c m3400g() {
        if (!this.f2359e.isEmpty()) {
            return this.f2359e.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public int compareTo(C1665a aVar) {
        return this.f2356b.compareToIgnoreCase(aVar.f2356b);
    }

    /* renamed from: a */
    public String mo13622a() {
        return this.f2355a;
    }

    /* renamed from: b */
    public String mo13623b() {
        return this.f2356b;
    }

    /* renamed from: c */
    public String mo13624c() {
        MaxAdFormat maxAdFormat = this.f2357c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    /* renamed from: d */
    public MaxAdFormat mo13626d() {
        return this.f2357c;
    }

    /* renamed from: e */
    public C1667c mo13627e() {
        C1667c cVar = this.f2358d;
        return cVar != null ? cVar : m3400g();
    }

    /* renamed from: f */
    public String mo13628f() {
        return "\n---------- " + this.f2356b + " ----------" + "\nIdentifier - " + this.f2355a + "\nFormat     - " + mo13624c();
    }
}
