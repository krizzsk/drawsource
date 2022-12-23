package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.c */
public class C4221c implements C4222d {

    /* renamed from: a */
    public Set<Long> f10416a = new HashSet();

    /* renamed from: b */
    public boolean f10417b;

    public C4221c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f10416a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f10417b = z;
    }

    /* renamed from: a */
    public boolean mo24231a(C4223e eVar) {
        if (this.f10416a.isEmpty() || eVar == null || eVar.f10418a == null) {
            return false;
        }
        for (Long equals : this.f10416a) {
            if (equals.equals(eVar.f10418a)) {
                return !this.f10417b;
            }
        }
        return this.f10417b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"demand", this.f10416a, Boolean.valueOf(this.f10417b)});
    }
}
