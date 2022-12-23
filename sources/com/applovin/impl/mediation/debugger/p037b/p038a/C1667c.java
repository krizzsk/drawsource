package com.applovin.impl.mediation.debugger.p037b.p038a;

import com.applovin.impl.mediation.debugger.p036a.C1663b;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.c */
public class C1667c {

    /* renamed from: a */
    private final String f2364a;

    /* renamed from: b */
    private final boolean f2365b;

    /* renamed from: c */
    private final List<C1666b> f2366c;

    /* renamed from: d */
    private final List<C1666b> f2367d;

    /* renamed from: e */
    private final List<C1663b> f2368e;

    C1667c(JSONObject jSONObject, Map<String, C1671b> map, MaxAdFormat maxAdFormat, C1969m mVar) {
        List<C1663b> list;
        C1666b bVar;
        this.f2364a = JsonUtils.getString(jSONObject, "name", "");
        this.f2365b = JsonUtils.getBoolean(jSONObject, CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER, false).booleanValue();
        JSONObject jSONObject2 = jSONObject;
        Map<String, C1671b> map2 = map;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        C1969m mVar2 = mVar;
        this.f2366c = m3413a("bidders", jSONObject2, map2, maxAdFormat2, mVar2);
        List<C1666b> a = m3413a("waterfall", jSONObject2, map2, maxAdFormat2, mVar2);
        this.f2367d = a;
        Iterator<C1666b> it = a.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.mo13629a().mo13641c().mo13676x()) {
                break;
            }
        }
        this.f2368e = bVar != null ? bVar.mo13633e() : list;
    }

    /* renamed from: a */
    private List<C1666b> m3413a(String str, JSONObject jSONObject, Map<String, C1671b> map, MaxAdFormat maxAdFormat, C1969m mVar) {
        C1671b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (!(jSONObject2 == null || (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) == null)) {
                arrayList.add(new C1666b(jSONObject2, maxAdFormat, bVar, mVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C1666b> mo13634a() {
        return this.f2366c;
    }

    /* renamed from: b */
    public List<C1666b> mo13635b() {
        return this.f2367d;
    }

    /* renamed from: c */
    public boolean mo13636c() {
        return this.f2365b;
    }

    /* renamed from: d */
    public List<C1663b> mo13637d() {
        return this.f2368e;
    }
}
