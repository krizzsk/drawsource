package com.mbridge.msdk.dycreator.p297g;

import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.g.f */
/* compiled from: EffectSubject */
public final class C8383f extends C8378a {
    /* renamed from: a */
    public final void mo56884a(Object obj) {
        C8382e eVar;
        if (this.f20441a != null && this.f20441a.size() > 0) {
            for (Map.Entry entry : this.f20441a.entrySet()) {
                if (entry != null) {
                    try {
                        if (!(entry.getValue() == null || (eVar = (C8382e) entry.getValue()) == null)) {
                            eVar.mo56806a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
