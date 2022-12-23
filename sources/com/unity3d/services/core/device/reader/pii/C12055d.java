package com.unity3d.services.core.device.reader.pii;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.pii.d */
/* compiled from: PiiDecisionData */
public class C12055d {

    /* renamed from: a */
    private final Map<String, Object> f29415a;

    /* renamed from: b */
    private final C12050a f29416b;

    public C12055d(C12050a aVar) {
        this(aVar, new HashMap());
    }

    /* renamed from: a */
    public void mo71183a(Map<String, Object> map) {
        Map<String, Object> map2 = this.f29415a;
        if (map2 != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: b */
    public C12050a mo71184b() {
        return this.f29416b;
    }

    /* renamed from: c */
    public Boolean mo71185c() {
        Map<String, Object> map = this.f29415a;
        if (map != null) {
            Object obj = map.get("user.nonBehavioral");
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
        }
        return null;
    }

    public C12055d(C12050a aVar, Map<String, Object> map) {
        this.f29416b = aVar;
        this.f29415a = map;
    }

    /* renamed from: a */
    public Map<String, Object> mo71182a() {
        return this.f29415a;
    }
}
