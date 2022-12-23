package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.C12065a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.h */
/* compiled from: JsonStorageAggregator */
public class C12078h implements C12073c {

    /* renamed from: a */
    private final List<C12073c> f29465a;

    public C12078h(List<C12073c> list) {
        this.f29465a = list;
    }

    public Object get(String str) {
        Iterator<C12073c> it = this.f29465a.iterator();
        Object obj = null;
        while (it.hasNext() && ((r2 = it.next()) == null || (obj = r2.get(str)) == null)) {
        }
        return obj;
    }

    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        for (C12073c next : this.f29465a) {
            if (next != null) {
                try {
                    jSONObject = C12080j.m32878a(jSONObject, next.getData());
                } catch (JSONException unused) {
                    C12065a.m32848c("Failed to merge storage: " + next);
                }
            }
        }
        return jSONObject;
    }
}
