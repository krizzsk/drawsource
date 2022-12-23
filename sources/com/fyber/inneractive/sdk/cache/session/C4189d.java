package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.d */
public class C4189d {

    /* renamed from: a */
    public C4195f f10297a = new C4195f();

    /* renamed from: b */
    public HashMap<C4193b, C4198h> f10298b;

    /* renamed from: c */
    public final Object f10299c = new Object();

    /* renamed from: d */
    public final Object f10300d = new Object();

    /* renamed from: e */
    public C4190a f10301e;

    /* renamed from: com.fyber.inneractive.sdk.cache.session.d$a */
    public interface C4190a {
        /* renamed from: a */
        void mo24179a(C4189d dVar, boolean z, JSONObject jSONObject);
    }

    public C4189d(int i, C4190a aVar) {
        this.f10298b = new C4185a(this, i);
        this.f10301e = null;
    }

    /* renamed from: a */
    public static JSONObject m13165a(C4189d dVar) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", dVar.f10297a.mo24181a());
            for (Map.Entry next : dVar.f10298b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                C4193b bVar = (C4193b) next.getKey();
                Iterator it = ((PriorityQueue) next.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C4191e) it.next()).mo24180a(true, true));
                }
                jSONObject.put(bVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo24177a(C4193b bVar, C4191e eVar) {
        synchronized (this.f10300d) {
            C4198h hVar = this.f10298b.get(bVar);
            if (hVar != null) {
                hVar.add(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo24178a(C4195f fVar) {
        C4191e eVar;
        for (C4193b bVar : C4193b.values()) {
            if (!(bVar == C4193b.NONE || (eVar = fVar.f10322a.get(bVar)) == null || eVar.f10302a == 0)) {
                mo24177a(bVar, eVar);
            }
        }
    }

    /* renamed from: a */
    public int mo24176a() {
        int i;
        C4252h hVar = IAConfigManager.f10324J.f10356v.f10459b;
        String num = Integer.toString(5);
        if (hVar.f10456a.containsKey("number_of_sessions")) {
            num = hVar.f10456a.get("number_of_sessions");
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
            i = 5;
        }
        if (i < 0) {
            return 5;
        }
        return i;
    }
}
