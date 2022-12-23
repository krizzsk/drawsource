package com.mbridge.msdk.video.dynview;

import android.view.View;
import com.mbridge.msdk.video.dynview.p354d.C9328g;
import com.mbridge.msdk.video.dynview.p360h.C9354a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b */
/* compiled from: MBUIController */
public class C9314b {

    /* renamed from: b */
    private static volatile C9314b f22860b;

    /* renamed from: a */
    public Map<String, SoftReference<View>> f22861a = new HashMap();

    private C9314b() {
    }

    /* renamed from: a */
    public static C9314b m26503a() {
        C9314b bVar;
        if (f22860b != null) {
            return f22860b;
        }
        synchronized (C9314b.class) {
            if (f22860b == null) {
                f22860b = new C9314b();
            }
            bVar = f22860b;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo62742a(C9317c cVar, C9328g gVar) {
        new C9354a(cVar, gVar, new HashMap());
    }
}
