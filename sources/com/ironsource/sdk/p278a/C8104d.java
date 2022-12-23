package com.ironsource.sdk.p278a;

import android.util.Log;
import com.ironsource.p196a.C6339a;
import com.ironsource.p196a.C6341b;
import com.ironsource.sdk.p278a.C8106f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.d */
public final class C8104d {

    /* renamed from: a */
    private static C8104d f19619a;

    /* renamed from: b */
    private C6341b f19620b;

    private C8104d() {
    }

    /* renamed from: a */
    private static C8104d m23158a() {
        if (f19619a == null) {
            f19619a = new C8104d();
        }
        return f19619a;
    }

    /* renamed from: a */
    public static void m23159a(C6339a aVar, C8101b bVar) {
        if (aVar != null) {
            try {
                m23158a().f19620b = new C6341b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m23160a(C8106f.C8107a aVar) {
        m23161a(aVar, (Map<String, Object>) new HashMap());
    }

    /* renamed from: a */
    public static void m23161a(C8106f.C8107a aVar, Map<String, Object> map) {
        C6341b bVar = m23158a().f19620b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f19644b));
        }
        bVar.mo35741a(aVar.f19643a, map);
    }
}
