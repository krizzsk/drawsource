package com.mbridge.msdk.video.dynview.p352b;

import android.view.View;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p365j.C9381b;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.b */
/* compiled from: UIEnergize */
public class C9316b {

    /* renamed from: a */
    private static volatile C9316b f22863a;

    private C9316b() {
    }

    /* renamed from: a */
    public static C9316b m26507a() {
        C9316b bVar;
        if (f22863a != null) {
            return f22863a;
        }
        synchronized (C9316b.class) {
            if (f22863a == null) {
                f22863a = new C9316b();
            }
            bVar = f22863a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo62744a(View view, C9317c cVar, Map<String, Object> map) {
        if (cVar != null) {
            int h = cVar.mo62752h();
            if (h == 1) {
                new C9381b().mo62901a(view, map);
            } else if (h == 102 || h == 202 || h == 302 || h == 802 || h == 904) {
                new C9381b().mo62900a(view, cVar, map);
            } else if (h == 3) {
                new C9381b().mo62899a(view, cVar);
            } else if (h == 4) {
                new C9381b().mo62902b(view, cVar, map);
            } else if (h == 5) {
                new C9381b();
            }
        }
    }
}
