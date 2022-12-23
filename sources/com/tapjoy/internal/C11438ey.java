package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.ey */
public final class C11438ey extends C11397ej<C11438ey, C11439a> {

    /* renamed from: c */
    public static final C11400el<C11438ey> f27349c = new C11440b();

    /* renamed from: d */
    public final List<C11435ex> f27350d;

    public C11438ey(List<C11435ex> list, C11648je jeVar) {
        super(f27349c, jeVar);
        this.f27350d = C11420eq.m31228a("events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11438ey)) {
            return false;
        }
        C11438ey eyVar = (C11438ey) obj;
        return mo69846a().equals(eyVar.mo69846a()) && this.f27350d.equals(eyVar.f27350d);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo69846a().hashCode() * 37) + this.f27350d.hashCode();
        this.f27209b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f27350d.isEmpty()) {
            sb.append(", events=");
            sb.append(this.f27350d);
        }
        StringBuilder replace = sb.replace(0, 2, "EventBatch{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ey$a */
    public static final class C11439a extends C11397ej.C11398a<C11438ey, C11439a> {

        /* renamed from: c */
        public List<C11435ex> f27351c = C11420eq.m31227a();

        /* renamed from: b */
        public final C11438ey mo69953b() {
            return new C11438ey(this.f27351c, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.ey$b */
    static final class C11440b extends C11400el<C11438ey> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11438ey eyVar = (C11438ey) obj;
            return C11435ex.f27288c.mo69852a().mo69851a(1, eyVar.f27350d) + eyVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11438ey eyVar = (C11438ey) obj;
            C11435ex.f27288c.mo69852a().mo69855a(enVar, 1, eyVar.f27350d);
            enVar.mo69866a(eyVar.mo69846a());
        }

        C11440b() {
            super(C11395ei.LENGTH_DELIMITED, C11438ey.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11439a aVar = new C11439a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69953b();
                } else if (b != 1) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27351c.add(C11435ex.f27288c.mo69843a(emVar));
                }
            }
        }
    }
}
