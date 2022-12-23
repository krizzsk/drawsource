package com.mbridge.msdk.dycreator.p297g;

import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.g.h */
/* compiled from: ReportSubject */
public final class C8385h extends C8378a {
    /* renamed from: a */
    public final void mo56885a(Object obj) {
        C8384g gVar;
        if (this.f20441a != null && this.f20441a.size() > 0) {
            for (Map.Entry entry : this.f20441a.entrySet()) {
                if (entry != null) {
                    try {
                        if (!(entry.getValue() == null || (gVar = (C8384g) entry.getValue()) == null)) {
                            gVar.mo56805a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
