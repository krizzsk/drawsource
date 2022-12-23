package com.bytedance.sdk.component.p088a;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.h */
/* compiled from: DataConverterActual */
class C2497h {

    /* renamed from: a */
    private C2504l f5259a;

    /* renamed from: a */
    static C2497h m6246a(C2504l lVar) {
        return new C2497h(lVar);
    }

    private C2497h(C2504l lVar) {
        this.f5259a = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T mo16491a(String str, Type type) throws JSONException {
        m6247a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f5259a.mo16507a(str, type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> String mo16492a(T t) {
        String str;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f5259a.mo16508a(t);
        }
        m6247a(str);
        return str;
    }

    /* renamed from: a */
    private static void m6247a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C2498i.m6250a((RuntimeException) new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + str));
        }
    }
}
