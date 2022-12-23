package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.unity3d.services.core.request.metrics.d */
/* compiled from: Metric */
public class C12113d {

    /* renamed from: a */
    private final String f29560a;

    /* renamed from: b */
    private final Object f29561b;

    /* renamed from: c */
    private final Map<String, String> f29562c;

    public C12113d(String str, Object obj, Map<String, String> map) {
        this.f29560a = str;
        this.f29561b = obj;
        this.f29562c = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, Object> mo71272a() {
        HashMap hashMap = new HashMap();
        String str = this.f29560a;
        if (str != null) {
            hashMap.put("n", str);
        }
        Object obj = this.f29561b;
        if (obj != null) {
            hashMap.put("v", obj);
        }
        Map<String, String> map = this.f29562c;
        if (map != null) {
            hashMap.put("t", map);
        }
        return hashMap;
    }

    /* renamed from: b */
    public Map<String, String> mo71273b() {
        return this.f29562c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12113d.class != obj.getClass()) {
            return false;
        }
        C12113d dVar = (C12113d) obj;
        if (!this.f29560a.equals(dVar.f29560a) || !this.f29561b.equals(dVar.f29561b) || !this.f29562c.equals(dVar.f29562c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f29560a, this.f29561b, this.f29562c});
    }

    public String toString() {
        return "Metric{name='" + this.f29560a + '\'' + ", value='" + this.f29561b + '\'' + ", tags=" + this.f29562c + '}';
    }
}
