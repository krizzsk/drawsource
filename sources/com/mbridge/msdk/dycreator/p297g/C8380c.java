package com.mbridge.msdk.dycreator.p297g;

import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.g.c */
/* compiled from: ClickSubject */
public final class C8380c extends C8378a {
    /* renamed from: a */
    public final void mo56882a(Object obj) {
        C8379b bVar;
        if (this.f20441a != null && this.f20441a.size() > 0) {
            for (Map.Entry entry : this.f20441a.entrySet()) {
                if (entry != null) {
                    try {
                        if (!(entry.getValue() == null || (bVar = (C8379b) entry.getValue()) == null)) {
                            bVar.mo56808a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
