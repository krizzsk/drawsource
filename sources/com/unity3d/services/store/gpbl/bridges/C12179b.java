package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.reflection.C12090a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.store.gpbl.bridges.b */
/* compiled from: CommonJsonResponseBridge */
public abstract class C12179b extends C12090a {

    /* renamed from: e */
    private final Object f29751e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.b$a */
    /* compiled from: CommonJsonResponseBridge */
    static class C12180a extends HashMap<String, Class<?>[]> {
        C12180a() {
            put("getOriginalJson", new Class[0]);
        }
    }

    protected C12179b(Object obj) {
        this(obj, new HashMap());
    }

    /* renamed from: a */
    private static Map<String, Class<?>[]> m33185a(Map<String, Class<?>[]> map) {
        map.putAll(new C12180a());
        return map;
    }

    /* renamed from: i */
    public JSONObject mo71371i() {
        try {
            return new JSONObject((String) mo71233a("getOriginalJson", this.f29751e, new Object[0]));
        } catch (JSONException e) {
            C12065a.m32846b("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            return null;
        }
    }

    protected C12179b(Object obj, Map<String, Class<?>[]> map) {
        super(m33185a(map));
        this.f29751e = obj;
    }
}
