package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.fg */
public final class C11462fg extends C11397ej<C11462fg, C11463a> {

    /* renamed from: c */
    public static final C11400el<C11462fg> f27463c = new C11464b();

    /* renamed from: d */
    public static final Long f27464d = 0L;

    /* renamed from: e */
    public static final Long f27465e = 0L;

    /* renamed from: f */
    public final String f27466f;

    /* renamed from: g */
    public final Long f27467g;

    /* renamed from: h */
    public final Long f27468h;

    public C11462fg(String str, Long l) {
        this(str, l, (Long) null, C11648je.f28077b);
    }

    public C11462fg(String str, Long l, Long l2, C11648je jeVar) {
        super(f27463c, jeVar);
        this.f27466f = str;
        this.f27467g = l;
        this.f27468h = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11462fg)) {
            return false;
        }
        C11462fg fgVar = (C11462fg) obj;
        return mo69846a().equals(fgVar.mo69846a()) && this.f27466f.equals(fgVar.f27466f) && this.f27467g.equals(fgVar.f27467g) && C11420eq.m31229a((Object) this.f27468h, (Object) fgVar.f27468h);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo69846a().hashCode() * 37) + this.f27466f.hashCode()) * 37) + this.f27467g.hashCode()) * 37;
        Long l = this.f27468h;
        int hashCode2 = hashCode + (l != null ? l.hashCode() : 0);
        this.f27209b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.f27466f);
        sb.append(", received=");
        sb.append(this.f27467g);
        if (this.f27468h != null) {
            sb.append(", clicked=");
            sb.append(this.f27468h);
        }
        StringBuilder replace = sb.replace(0, 2, "Push{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fg$a */
    public static final class C11463a extends C11397ej.C11398a<C11462fg, C11463a> {

        /* renamed from: c */
        public String f27469c;

        /* renamed from: d */
        public Long f27470d;

        /* renamed from: e */
        public Long f27471e;

        /* renamed from: b */
        public final C11462fg mo69981b() {
            if (this.f27469c != null && this.f27470d != null) {
                return new C11462fg(this.f27469c, this.f27470d, this.f27471e, super.mo69850a());
            }
            throw C11420eq.m31226a(this.f27469c, "id", this.f27470d, "received");
        }
    }

    /* renamed from: com.tapjoy.internal.fg$b */
    static final class C11464b extends C11400el<C11462fg> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11462fg fgVar = (C11462fg) obj;
            return C11400el.f27227p.mo69851a(1, fgVar.f27466f) + C11400el.f27220i.mo69851a(2, fgVar.f27467g) + (fgVar.f27468h != null ? C11400el.f27220i.mo69851a(3, fgVar.f27468h) : 0) + fgVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11462fg fgVar = (C11462fg) obj;
            C11400el.f27227p.mo69855a(enVar, 1, fgVar.f27466f);
            C11400el.f27220i.mo69855a(enVar, 2, fgVar.f27467g);
            if (fgVar.f27468h != null) {
                C11400el.f27220i.mo69855a(enVar, 3, fgVar.f27468h);
            }
            enVar.mo69866a(fgVar.mo69846a());
        }

        C11464b() {
            super(C11395ei.LENGTH_DELIMITED, C11462fg.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11463a aVar = new C11463a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69981b();
                } else if (b == 1) {
                    aVar.f27469c = C11400el.f27227p.mo69843a(emVar);
                } else if (b == 2) {
                    aVar.f27470d = C11400el.f27220i.mo69843a(emVar);
                } else if (b != 3) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27471e = C11400el.f27220i.mo69843a(emVar);
                }
            }
        }
    }
}
