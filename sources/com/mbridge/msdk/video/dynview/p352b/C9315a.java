package com.mbridge.msdk.video.dynview.p352b;

import android.view.View;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p354d.C9326e;
import com.mbridge.msdk.video.dynview.p365j.C9370a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.a */
/* compiled from: DataEnergize */
public class C9315a {

    /* renamed from: a */
    private static volatile C9315a f22862a;

    private C9315a() {
    }

    /* renamed from: a */
    public static C9315a m26505a() {
        C9315a aVar;
        if (f22862a != null) {
            return f22862a;
        }
        synchronized (C9315a.class) {
            if (f22862a == null) {
                f22862a = new C9315a();
            }
            aVar = f22862a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62743a(View view, C9317c cVar, Map map, C9326e eVar) {
        int h = cVar.mo62752h();
        if (h == 1) {
            new C9370a().mo62892a(cVar, view, map, eVar);
        } else if (h == 102 || h == 202 || h == 302 || h == 802 || h == 904) {
            new C9370a().mo62893b(cVar, view, map, eVar);
        } else if (h == 4) {
            new C9370a().mo62891a(cVar, view, eVar);
        } else if (h != 5) {
            eVar.mo62777a(view, new ArrayList());
        } else {
            new C9370a().mo62894c(cVar, view, map, eVar);
        }
    }
}
