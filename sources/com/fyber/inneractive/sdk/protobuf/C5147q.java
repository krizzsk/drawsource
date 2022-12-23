package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q */
public class C5147q {

    /* renamed from: b */
    public static volatile C5147q f13656b;

    /* renamed from: c */
    public static final C5147q f13657c = new C5147q(true);

    /* renamed from: a */
    public final Map<C5148a, GeneratedMessageLite.C5053d<?, ?>> f13658a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q$a */
    public static final class C5148a {

        /* renamed from: a */
        public final Object f13659a;

        /* renamed from: b */
        public final int f13660b;

        public C5148a(Object obj, int i) {
            this.f13659a = obj;
            this.f13660b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5148a)) {
                return false;
            }
            C5148a aVar = (C5148a) obj;
            if (this.f13659a == aVar.f13659a && this.f13660b == aVar.f13660b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13659a) * 65535) + this.f13660b;
        }
    }

    public C5147q() {
        this.f13658a = new HashMap();
    }

    /* renamed from: a */
    public static C5147q m15950a() {
        C5147q qVar = f13656b;
        if (qVar == null) {
            synchronized (C5147q.class) {
                qVar = f13656b;
                if (qVar == null) {
                    Class<?> cls = C5142p.f13652a;
                    C5147q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (C5147q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = f13657c;
                    }
                    f13656b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public C5147q(boolean z) {
        this.f13658a = Collections.emptyMap();
    }
}
