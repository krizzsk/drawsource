package com.mbridge.msdk.dycreator.p297g;

import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.g.d */
/* compiled from: ConcreteSubject */
public final class C8381d extends C8378a {
    /* renamed from: a */
    public final void mo56883a(Object obj) {
        C8386i iVar;
        try {
            synchronized (this) {
                if (this.f20441a != null && this.f20441a.size() > 0) {
                    for (Map.Entry entry : this.f20441a.entrySet()) {
                        if (!(entry == null || !(entry.getValue() instanceof C8386i) || (iVar = (C8386i) entry.getValue()) == null)) {
                            iVar.mo56807a(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
