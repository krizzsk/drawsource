package com.fyber.inneractive.sdk.config;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.fyber.inneractive.sdk.config.k */
public class C4257k implements C4282t {

    /* renamed from: a */
    public Context f10465a;

    /* renamed from: b */
    public C4260c f10466b = new C4260c();

    /* renamed from: com.fyber.inneractive.sdk.config.k$b */
    public static class C4259b {

        /* renamed from: a */
        public static C4257k f10467a = new C4257k();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.k$c */
    public static class C4260c implements Serializable {
        public static final long serialVersionUID = 2;

        /* renamed from: a */
        public String f10468a;

        /* renamed from: b */
        public boolean f10469b;

        /* renamed from: c */
        public boolean f10470c;

        public C4260c() {
        }
    }

    /* renamed from: a */
    public static String m13293a() {
        C4260c cVar = C4259b.f10467a.f10466b;
        if (cVar != null) {
            return cVar.f10468a;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m13294b() {
        C4260c cVar = C4259b.f10467a.f10466b;
        if (cVar != null) {
            return cVar.f10470c;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m13295c() {
        C4260c cVar = C4259b.f10467a.f10466b;
        if (cVar != null) {
            return cVar.f10469b;
        }
        return false;
    }
}
