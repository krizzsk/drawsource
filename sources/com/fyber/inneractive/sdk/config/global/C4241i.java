package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.i */
public class C4241i implements C4222d {

    /* renamed from: a */
    public Set<Long> f10441a = new HashSet();

    /* renamed from: b */
    public boolean f10442b;

    public C4241i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f10441a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f10442b = z;
    }

    /* renamed from: a */
    public boolean mo24231a(C4223e eVar) {
        if (this.f10441a.isEmpty() || eVar == null || eVar.f10419b == null) {
            return false;
        }
        for (Long equals : this.f10441a) {
            if (equals.equals(eVar.f10419b)) {
                return !this.f10442b;
            }
        }
        return this.f10442b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"pub_id", this.f10441a, Boolean.valueOf(this.f10442b)});
    }
}
