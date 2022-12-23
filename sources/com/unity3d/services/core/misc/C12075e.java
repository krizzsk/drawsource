package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.C12065a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.e */
/* compiled from: JsonFlattener */
public class C12075e {

    /* renamed from: a */
    private final JSONObject f29461a;

    public C12075e(JSONObject jSONObject) {
        this.f29461a = jSONObject;
    }

    /* renamed from: a */
    public JSONObject mo71218a(String str, C12076f fVar) {
        if (fVar == null) {
            return new JSONObject();
        }
        return mo71219a(str, fVar.mo71223c(), fVar.mo71221a(), fVar.mo71222b());
    }

    /* renamed from: a */
    public JSONObject mo71219a(String str, List<String> list, List<String> list2, List<String> list3) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = this.f29461a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (m32865a(next, list, list3)) {
                    Object opt = this.f29461a.opt(next);
                    if (opt instanceof JSONObject) {
                        new C12075e((JSONObject) opt).mo71220a(str, next, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(next, opt);
                    }
                }
            }
        } catch (JSONException e) {
            C12065a.m32846b("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo71220a(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        String str3;
        Iterator<String> keys = this.f29461a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!list2.contains(next)) {
                Object obj = this.f29461a.get(next);
                if (list.contains(next)) {
                    str3 = str2;
                } else {
                    str3 = String.format("%s%s%s", new Object[]{str2, str, next});
                }
                if (obj instanceof JSONObject) {
                    new C12075e((JSONObject) obj).mo71220a(str, str3, jSONObject, list, list2);
                } else {
                    jSONObject.put(str3, obj);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m32865a(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }
}
