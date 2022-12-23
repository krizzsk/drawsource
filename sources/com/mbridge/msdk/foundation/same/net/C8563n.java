package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.net.p309d.C8524b;

/* renamed from: com.mbridge.msdk.foundation.same.net.n */
/* compiled from: VolleyManager */
public final class C8563n {

    /* renamed from: c */
    private static C8563n f21031c;

    /* renamed from: a */
    private C8555j f21032a;

    /* renamed from: b */
    private C8524b f21033b;

    private C8563n() {
    }

    /* renamed from: a */
    public static void m24557a(Context context) {
        if (f21031c == null) {
            C8563n nVar = new C8563n();
            f21031c = nVar;
            nVar.f21032a = new C8555j(context.getApplicationContext());
            f21031c.f21033b = new C8524b(m24559b(), 3);
        }
    }

    /* renamed from: a */
    public static void m24558a(C8554i iVar) {
        m24559b().mo58013a(iVar);
    }

    /* renamed from: b */
    private static C8555j m24559b() {
        C8563n nVar = f21031c;
        if (nVar != null) {
            C8555j jVar = nVar.f21032a;
            if (jVar != null) {
                return jVar;
            }
            nVar.f21032a = new C8555j(C8388a.m23845e().mo56913g());
            return f21031c.f21032a;
        }
        C8563n nVar2 = new C8563n();
        f21031c = nVar2;
        if (nVar2.f21032a == null) {
            nVar2.f21032a = new C8555j(C8388a.m23845e().mo56913g());
        }
        return f21031c.f21032a;
    }

    /* renamed from: a */
    public static C8524b m24556a() {
        C8563n nVar = f21031c;
        if (nVar != null) {
            C8524b bVar = nVar.f21033b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f21033b = new C8524b(m24559b(), 3);
            return f21031c.f21033b;
        }
        C8563n nVar2 = new C8563n();
        f21031c = nVar2;
        if (nVar2.f21033b == null) {
            nVar2.f21033b = new C8524b(m24559b(), 3);
        }
        return f21031c.f21033b;
    }
}
