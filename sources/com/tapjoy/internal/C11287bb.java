package com.tapjoy.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bb */
public final class C11287bb implements C11294bf {

    /* renamed from: a */
    private final StringWriter f26949a = new StringWriter();

    /* renamed from: b */
    private final C11306bn f26950b = new C11306bn(this.f26949a);

    public final String toString() {
        try {
            this.f26950b.f26995a.flush();
            return this.f26949a.toString();
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final void mo69695a(Writer writer) {
        try {
            this.f26950b.f26995a.flush();
            writer.write(this.f26949a.toString());
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69688a() {
        try {
            this.f26950b.mo69735a();
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: b */
    public final C11287bb mo69696b() {
        try {
            this.f26950b.mo69743b();
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: c */
    public final C11287bb mo69698c() {
        try {
            this.f26950b.mo69745c();
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: d */
    public final C11287bb mo69699d() {
        try {
            this.f26950b.mo69747d();
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69692a(String str) {
        try {
            this.f26950b.mo69740a(str);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69690a(C11294bf bfVar) {
        try {
            this.f26950b.mo69737a(bfVar);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: b */
    public final C11287bb mo69697b(String str) {
        try {
            this.f26950b.mo69744b(str);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69689a(long j) {
        try {
            this.f26950b.mo69736a(j);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69691a(Number number) {
        try {
            this.f26950b.mo69738a(number);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: b */
    private C11287bb m30889b(Object obj) {
        try {
            this.f26950b.mo69739a(obj);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69693a(Collection collection) {
        try {
            this.f26950b.mo69741a(collection);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public final C11287bb mo69694a(Map map) {
        try {
            this.f26950b.mo69742a((Map<Object, Object>) map);
            return this;
        } catch (IOException e) {
            throw C11535gt.m31574a(e);
        }
    }

    /* renamed from: a */
    public static String m30888a(Object obj) {
        return new C11287bb().m30889b(obj).toString();
    }
}
