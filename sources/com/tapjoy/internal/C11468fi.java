package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.fi */
public final class C11468fi extends C11397ej<C11468fi, C11469a> {

    /* renamed from: c */
    public static final C11400el<C11468fi> f27475c = new C11470b();

    /* renamed from: d */
    public final List<String> f27476d;

    public C11468fi(List<String> list) {
        this(list, C11648je.f28077b);
    }

    public C11468fi(List<String> list, C11648je jeVar) {
        super(f27475c, jeVar);
        this.f27476d = C11420eq.m31228a("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11468fi)) {
            return false;
        }
        C11468fi fiVar = (C11468fi) obj;
        return mo69846a().equals(fiVar.mo69846a()) && this.f27476d.equals(fiVar.f27476d);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo69846a().hashCode() * 37) + this.f27476d.hashCode();
        this.f27209b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f27476d.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.f27476d);
        }
        StringBuilder replace = sb.replace(0, 2, "StringList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fi$a */
    public static final class C11469a extends C11397ej.C11398a<C11468fi, C11469a> {

        /* renamed from: c */
        public List<String> f27477c = C11420eq.m31227a();

        /* renamed from: b */
        public final C11468fi mo69987b() {
            return new C11468fi(this.f27477c, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.fi$b */
    static final class C11470b extends C11400el<C11468fi> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11468fi fiVar = (C11468fi) obj;
            return C11400el.f27227p.mo69852a().mo69851a(1, fiVar.f27476d) + fiVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11468fi fiVar = (C11468fi) obj;
            C11400el.f27227p.mo69852a().mo69855a(enVar, 1, fiVar.f27476d);
            enVar.mo69866a(fiVar.mo69846a());
        }

        C11470b() {
            super(C11395ei.LENGTH_DELIMITED, C11468fi.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11469a aVar = new C11469a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69987b();
                } else if (b != 1) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27477c.add(C11400el.f27227p.mo69843a(emVar));
                }
            }
        }
    }
}
