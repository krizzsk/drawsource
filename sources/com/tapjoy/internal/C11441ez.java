package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import com.tapjoy.internal.C11400el;

/* renamed from: com.tapjoy.internal.ez */
public final class C11441ez extends C11397ej<C11441ez, C11442a> {

    /* renamed from: c */
    public static final C11400el<C11441ez> f27352c = new C11443b();

    /* renamed from: d */
    public static final C11445fa f27353d = C11445fa.APP;

    /* renamed from: e */
    public final C11445fa f27354e;

    /* renamed from: f */
    public final String f27355f;

    /* renamed from: g */
    public final String f27356g;

    public C11441ez(C11445fa faVar, String str, String str2, C11648je jeVar) {
        super(f27352c, jeVar);
        this.f27354e = faVar;
        this.f27355f = str;
        this.f27356g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11441ez)) {
            return false;
        }
        C11441ez ezVar = (C11441ez) obj;
        return mo69846a().equals(ezVar.mo69846a()) && this.f27354e.equals(ezVar.f27354e) && this.f27355f.equals(ezVar.f27355f) && C11420eq.m31229a((Object) this.f27356g, (Object) ezVar.f27356g);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo69846a().hashCode() * 37) + this.f27354e.hashCode()) * 37) + this.f27355f.hashCode()) * 37;
        String str = this.f27356g;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.f27209b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.f27354e);
        sb.append(", name=");
        sb.append(this.f27355f);
        if (this.f27356g != null) {
            sb.append(", category=");
            sb.append(this.f27356g);
        }
        StringBuilder replace = sb.replace(0, 2, "EventGroup{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ez$a */
    public static final class C11442a extends C11397ej.C11398a<C11441ez, C11442a> {

        /* renamed from: c */
        public C11445fa f27357c;

        /* renamed from: d */
        public String f27358d;

        /* renamed from: e */
        public String f27359e;

        /* renamed from: b */
        public final C11441ez mo69956b() {
            if (this.f27357c != null && this.f27358d != null) {
                return new C11441ez(this.f27357c, this.f27358d, this.f27359e, super.mo69850a());
            }
            throw C11420eq.m31226a(this.f27357c, "type", this.f27358d, "name");
        }
    }

    /* renamed from: com.tapjoy.internal.ez$b */
    static final class C11443b extends C11400el<C11441ez> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11441ez ezVar = (C11441ez) obj;
            return C11445fa.f27367e.mo69851a(1, ezVar.f27354e) + C11400el.f27227p.mo69851a(2, ezVar.f27355f) + (ezVar.f27356g != null ? C11400el.f27227p.mo69851a(3, ezVar.f27356g) : 0) + ezVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return m31385b(emVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11441ez ezVar = (C11441ez) obj;
            C11445fa.f27367e.mo69855a(enVar, 1, ezVar.f27354e);
            C11400el.f27227p.mo69855a(enVar, 2, ezVar.f27355f);
            if (ezVar.f27356g != null) {
                C11400el.f27227p.mo69855a(enVar, 3, ezVar.f27356g);
            }
            enVar.mo69866a(ezVar.mo69846a());
        }

        C11443b() {
            super(C11395ei.LENGTH_DELIMITED, C11441ez.class);
        }

        /* renamed from: b */
        private static C11441ez m31385b(C11416em emVar) {
            C11442a aVar = new C11442a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69956b();
                } else if (b == 1) {
                    try {
                        aVar.f27357c = C11445fa.f27367e.mo69843a(emVar);
                    } catch (C11400el.C11415a e) {
                        aVar.mo69848a(b, C11395ei.VARINT, Long.valueOf((long) e.f27233a));
                    }
                } else if (b == 2) {
                    aVar.f27358d = C11400el.f27227p.mo69843a(emVar);
                } else if (b != 3) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27359e = C11400el.f27227p.mo69843a(emVar);
                }
            }
        }
    }
}
