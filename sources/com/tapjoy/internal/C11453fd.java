package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.fd */
public final class C11453fd extends C11397ej<C11453fd, C11454a> {

    /* renamed from: c */
    public static final C11400el<C11453fd> f27416c = new C11455b();

    /* renamed from: d */
    public final C11450fc f27417d;

    /* renamed from: e */
    public final C11432ew f27418e;

    /* renamed from: f */
    public final C11471fj f27419f;

    public C11453fd(C11450fc fcVar, C11432ew ewVar, C11471fj fjVar) {
        this(fcVar, ewVar, fjVar, C11648je.f28077b);
    }

    public C11453fd(C11450fc fcVar, C11432ew ewVar, C11471fj fjVar, C11648je jeVar) {
        super(f27416c, jeVar);
        this.f27417d = fcVar;
        this.f27418e = ewVar;
        this.f27419f = fjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11453fd)) {
            return false;
        }
        C11453fd fdVar = (C11453fd) obj;
        return mo69846a().equals(fdVar.mo69846a()) && C11420eq.m31229a((Object) this.f27417d, (Object) fdVar.f27417d) && C11420eq.m31229a((Object) this.f27418e, (Object) fdVar.f27418e) && C11420eq.m31229a((Object) this.f27419f, (Object) fdVar.f27419f);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo69846a().hashCode() * 37;
        C11450fc fcVar = this.f27417d;
        int i2 = 0;
        int hashCode2 = (hashCode + (fcVar != null ? fcVar.hashCode() : 0)) * 37;
        C11432ew ewVar = this.f27418e;
        int hashCode3 = (hashCode2 + (ewVar != null ? ewVar.hashCode() : 0)) * 37;
        C11471fj fjVar = this.f27419f;
        if (fjVar != null) {
            i2 = fjVar.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f27209b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f27417d != null) {
            sb.append(", info=");
            sb.append(this.f27417d);
        }
        if (this.f27418e != null) {
            sb.append(", app=");
            sb.append(this.f27418e);
        }
        if (this.f27419f != null) {
            sb.append(", user=");
            sb.append(this.f27419f);
        }
        StringBuilder replace = sb.replace(0, 2, "InfoSet{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fd$a */
    public static final class C11454a extends C11397ej.C11398a<C11453fd, C11454a> {

        /* renamed from: c */
        public C11450fc f27420c;

        /* renamed from: d */
        public C11432ew f27421d;

        /* renamed from: e */
        public C11471fj f27422e;

        /* renamed from: b */
        public final C11453fd mo69972b() {
            return new C11453fd(this.f27420c, this.f27421d, this.f27422e, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.fd$b */
    static final class C11455b extends C11400el<C11453fd> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11453fd fdVar = (C11453fd) obj;
            int i = 0;
            int a = (fdVar.f27417d != null ? C11450fc.f27376c.mo69851a(1, fdVar.f27417d) : 0) + (fdVar.f27418e != null ? C11432ew.f27276c.mo69851a(2, fdVar.f27418e) : 0);
            if (fdVar.f27419f != null) {
                i = C11471fj.f27478c.mo69851a(3, fdVar.f27419f);
            }
            return a + i + fdVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11453fd fdVar = (C11453fd) obj;
            if (fdVar.f27417d != null) {
                C11450fc.f27376c.mo69855a(enVar, 1, fdVar.f27417d);
            }
            if (fdVar.f27418e != null) {
                C11432ew.f27276c.mo69855a(enVar, 2, fdVar.f27418e);
            }
            if (fdVar.f27419f != null) {
                C11471fj.f27478c.mo69855a(enVar, 3, fdVar.f27419f);
            }
            enVar.mo69866a(fdVar.mo69846a());
        }

        C11455b() {
            super(C11395ei.LENGTH_DELIMITED, C11453fd.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11454a aVar = new C11454a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69972b();
                } else if (b == 1) {
                    aVar.f27420c = C11450fc.f27376c.mo69843a(emVar);
                } else if (b == 2) {
                    aVar.f27421d = C11432ew.f27276c.mo69843a(emVar);
                } else if (b != 3) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27422e = C11471fj.f27478c.mo69843a(emVar);
                }
            }
        }
    }
}
