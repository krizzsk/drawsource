package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.fh */
public final class C11465fh extends C11397ej<C11465fh, C11466a> {

    /* renamed from: c */
    public static final C11400el<C11465fh> f27472c = new C11467b();

    /* renamed from: d */
    public final List<C11462fg> f27473d;

    public C11465fh(List<C11462fg> list) {
        this(list, C11648je.f28077b);
    }

    public C11465fh(List<C11462fg> list, C11648je jeVar) {
        super(f27472c, jeVar);
        this.f27473d = C11420eq.m31228a("pushes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11465fh)) {
            return false;
        }
        C11465fh fhVar = (C11465fh) obj;
        return mo69846a().equals(fhVar.mo69846a()) && this.f27473d.equals(fhVar.f27473d);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo69846a().hashCode() * 37) + this.f27473d.hashCode();
        this.f27209b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f27473d.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.f27473d);
        }
        StringBuilder replace = sb.replace(0, 2, "PushList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fh$a */
    public static final class C11466a extends C11397ej.C11398a<C11465fh, C11466a> {

        /* renamed from: c */
        public List<C11462fg> f27474c = C11420eq.m31227a();

        /* renamed from: b */
        public final C11465fh mo69984b() {
            return new C11465fh(this.f27474c, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.fh$b */
    static final class C11467b extends C11400el<C11465fh> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11465fh fhVar = (C11465fh) obj;
            return C11462fg.f27463c.mo69852a().mo69851a(1, fhVar.f27473d) + fhVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11465fh fhVar = (C11465fh) obj;
            C11462fg.f27463c.mo69852a().mo69855a(enVar, 1, fhVar.f27473d);
            enVar.mo69866a(fhVar.mo69846a());
        }

        C11467b() {
            super(C11395ei.LENGTH_DELIMITED, C11465fh.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11466a aVar = new C11466a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69984b();
                } else if (b != 1) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27474c.add(C11462fg.f27463c.mo69843a(emVar));
                }
            }
        }
    }
}
