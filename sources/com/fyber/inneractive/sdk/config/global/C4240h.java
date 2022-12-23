package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.h */
public class C4240h implements C4222d {

    /* renamed from: a */
    public Set<String> f10439a = new HashSet();

    /* renamed from: b */
    public boolean f10440b;

    public C4240h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f10439a.add(optString);
                }
            }
        }
        this.f10440b = z;
    }

    /* renamed from: a */
    public boolean mo24231a(C4223e eVar) {
        if (this.f10439a.isEmpty() || eVar == null || eVar.f10420c == null) {
            return false;
        }
        for (String equals : this.f10439a) {
            if (equals.equals(eVar.f10420c.value())) {
                return !this.f10440b;
            }
        }
        return this.f10440b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"placement_type", this.f10439a, Boolean.valueOf(this.f10440b)});
    }
}
