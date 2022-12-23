package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.bidder.C4151a;
import com.fyber.inneractive.sdk.cache.session.C4188c;
import com.fyber.inneractive.sdk.cache.session.C4189d;
import com.fyber.inneractive.sdk.cache.session.C4191e;
import com.fyber.inneractive.sdk.cache.session.C4197g;
import com.fyber.inneractive.sdk.cache.session.C4198h;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5299n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.d0 */
public class C4213d0 implements C4216e0 {

    /* renamed from: a */
    public C4189d f10400a;

    /* renamed from: b */
    public final Map<UnitDisplayType, Map<String, String>> f10401b = new HashMap();

    /* renamed from: c */
    public final Map<String, String> f10402c = new HashMap();

    /* renamed from: d */
    public C4214a f10403d;

    /* renamed from: e */
    public boolean f10404e = false;

    /* renamed from: com.fyber.inneractive.sdk.config.d0$a */
    public interface C4214a {
    }

    /* renamed from: a */
    public String mo24209a(UnitDisplayType unitDisplayType, String str) {
        Map map = this.f10401b.get(unitDisplayType);
        if (map == null || map.get(str) == null) {
            return "";
        }
        return (String) map.get(str);
    }

    /* renamed from: a */
    public void mo24213a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = this.f10401b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f10401b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        C4214a aVar = this.f10403d;
        if (aVar != null && this.f10404e) {
            ((C4151a) aVar).mo24017b();
        }
    }

    /* renamed from: a */
    public JSONArray mo24210a(UnitDisplayType unitDisplayType) {
        String str;
        C4189d dVar = this.f10400a;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4193b bVar : C4193b.values()) {
                if (bVar != C4193b.NONE && (unitDisplayType == null || bVar.f10319a == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f10319a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject.put("subType", str);
                    C4198h hVar = dVar.f10298b.get(bVar);
                    int a = dVar.mo24176a();
                    if (a > 0 && hVar != null && hVar.size() >= a) {
                        boolean z = bVar.f10320b;
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = new ArrayList(hVar);
                        Collections.sort(arrayList, new C4197g(hVar));
                        Iterator it = arrayList.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((C4191e) it.next()).mo24180a(false, z));
                            i++;
                            if (i >= a) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return jSONArray;
        }
    }

    /* renamed from: a */
    public void mo24211a(C4193b bVar, C4192a aVar) {
        C4189d dVar = this.f10400a;
        if (dVar != null) {
            C5299n.m16520a(new C4188c(dVar, aVar, bVar));
        }
    }

    /* renamed from: a */
    public void mo24214a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String a : strArr) {
            mo24213a(unitDisplayType, a, "0");
        }
    }

    /* renamed from: a */
    public void mo24212a(C4214a aVar) {
        this.f10403d = aVar;
    }
}
