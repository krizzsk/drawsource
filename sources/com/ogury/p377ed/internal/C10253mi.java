package com.ogury.p377ed.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.mi */
public abstract class C10253mi implements C10287nl, Serializable {

    /* renamed from: b */
    public static final Object f25587b = C10254a.f25594a;

    /* renamed from: a */
    protected final Object f25588a;

    /* renamed from: c */
    private transient C10287nl f25589c;

    /* renamed from: d */
    private final Class f25590d;

    /* renamed from: e */
    private final String f25591e;

    /* renamed from: f */
    private final String f25592f;

    /* renamed from: g */
    private final boolean f25593g = false;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C10287nl mo65130b();

    /* renamed from: com.ogury.ed.internal.mi$a */
    static class C10254a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10254a f25594a = new C10254a();

        private C10254a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f25594a;
        }
    }

    protected C10253mi(Object obj, Class cls, String str, String str2) {
        this.f25588a = obj;
        this.f25590d = cls;
        this.f25591e = str;
        this.f25592f = str2;
    }

    /* renamed from: c */
    public final Object mo65131c() {
        return this.f25588a;
    }

    /* renamed from: d */
    public final C10287nl mo65132d() {
        C10287nl nlVar = this.f25589c;
        if (nlVar != null) {
            return nlVar;
        }
        C10287nl b = mo65130b();
        this.f25589c = b;
        return b;
    }

    /* renamed from: e */
    public final C10289nn mo65133e() {
        Class cls = this.f25590d;
        if (cls == null) {
            return null;
        }
        return this.f25593g ? C10266mt.m29887a(cls) : C10266mt.m29890b(cls);
    }

    /* renamed from: f */
    public final String mo65134f() {
        return this.f25591e;
    }

    /* renamed from: g */
    public final String mo65135g() {
        return this.f25592f;
    }
}
