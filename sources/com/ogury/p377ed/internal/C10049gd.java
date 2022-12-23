package com.ogury.p377ed.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ogury.ed.internal.gd */
public final class C10049gd {
    /* renamed from: a */
    public static final List<String> m29185a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C10190km.m29757a();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
