package com.mbridge.msdk.dycreator.p297g;

import com.mbridge.msdk.dycreator.p292c.C8366a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.a */
/* compiled from: BaseAbstractSubject */
public abstract class C8378a extends C8366a {

    /* renamed from: a */
    protected ConcurrentHashMap<Integer, Object> f20441a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private List<Object> f20442b = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo56881a(Object obj, int i) {
        if (obj != null) {
            if (this.f20441a != null && !this.f20441a.containsValue(obj)) {
                this.f20441a.put(Integer.valueOf(i), obj);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo56880a() {
        this.f20441a.clear();
    }
}
