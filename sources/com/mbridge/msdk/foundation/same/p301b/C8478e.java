package com.mbridge.msdk.foundation.same.p301b;

import android.util.Log;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8674x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.e */
/* compiled from: MBridgeDirManager */
public final class C8478e {

    /* renamed from: c */
    private static C8478e f20803c;

    /* renamed from: a */
    private C8475b f20804a;

    /* renamed from: b */
    private ArrayList<C8479a> f20805b = new ArrayList<>();

    private C8478e(C8475b bVar) {
        this.f20804a = bVar;
    }

    /* renamed from: a */
    public static synchronized void m24304a(C8475b bVar) {
        synchronized (C8478e.class) {
            if (f20803c == null) {
                f20803c = new C8478e(bVar);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C8478e m24302a() {
        C8478e eVar;
        synchronized (C8478e.class) {
            if (f20803c == null && C8388a.m23845e().mo56913g() != null) {
                C8674x.m24886a(C8388a.m23845e().mo56913g());
            }
            if (f20803c == null) {
                Log.e("MBridgeDirManager", "mDirectoryManager == null");
            }
            eVar = f20803c;
        }
        return eVar;
    }

    /* renamed from: a */
    public static File m24303a(C8476c cVar) {
        try {
            if (m24302a() == null || m24302a().f20805b == null || m24302a().f20805b.size() <= 0) {
                return null;
            }
            Iterator<C8479a> it = m24302a().f20805b.iterator();
            while (it.hasNext()) {
                C8479a next = it.next();
                if (next.f20806a.equals(cVar)) {
                    return next.f20807b;
                }
            }
            return null;
        } catch (Throwable th) {
            C8672v.m24875a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m24306b(C8476c cVar) {
        File a = m24303a(cVar);
        if (a != null) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo57879b() {
        return m24305a(this.f20804a.mo57876a());
    }

    /* renamed from: a */
    private boolean m24305a(C8474a aVar) {
        String str;
        C8474a c = aVar.mo57874c();
        if (c == null) {
            str = aVar.mo57873b();
        } else {
            File a = m24303a(c.mo57868a());
            if (a == null) {
                return false;
            }
            str = a.getAbsolutePath() + File.separator + aVar.mo57873b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f20805b.add(new C8479a(aVar.mo57868a(), file));
        List<C8474a> d = aVar.mo57875d();
        if (d != null) {
            for (C8474a a2 : d) {
                if (!m24305a(a2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.b.e$a */
    /* compiled from: MBridgeDirManager */
    private static final class C8479a {

        /* renamed from: a */
        public C8476c f20806a;

        /* renamed from: b */
        public File f20807b;

        public C8479a(C8476c cVar, File file) {
            this.f20806a = cVar;
            this.f20807b = file;
        }
    }
}
