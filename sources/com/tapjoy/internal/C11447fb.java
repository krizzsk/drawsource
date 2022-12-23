package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.fb */
public final class C11447fb extends C11397ej<C11447fb, C11448a> {

    /* renamed from: c */
    public static final C11400el<C11447fb> f27370c = new C11449b();

    /* renamed from: d */
    public static final Long f27371d = 0L;

    /* renamed from: e */
    public final String f27372e;

    /* renamed from: f */
    public final Long f27373f;

    public C11447fb(String str, Long l) {
        this(str, l, C11648je.f28077b);
    }

    public C11447fb(String str, Long l, C11648je jeVar) {
        super(f27370c, jeVar);
        this.f27372e = str;
        this.f27373f = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11447fb)) {
            return false;
        }
        C11447fb fbVar = (C11447fb) obj;
        return mo69846a().equals(fbVar.mo69846a()) && this.f27372e.equals(fbVar.f27372e) && this.f27373f.equals(fbVar.f27373f);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((mo69846a().hashCode() * 37) + this.f27372e.hashCode()) * 37) + this.f27373f.hashCode();
        this.f27209b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.f27372e);
        sb.append(", value=");
        sb.append(this.f27373f);
        StringBuilder replace = sb.replace(0, 2, "EventValue{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fb$a */
    public static final class C11448a extends C11397ej.C11398a<C11447fb, C11448a> {

        /* renamed from: c */
        public String f27374c;

        /* renamed from: d */
        public Long f27375d;

        /* renamed from: b */
        public final C11447fb mo69966b() {
            if (this.f27374c != null && this.f27375d != null) {
                return new C11447fb(this.f27374c, this.f27375d, super.mo69850a());
            }
            throw C11420eq.m31226a(this.f27374c, "name", this.f27375d, "value");
        }
    }

    /* renamed from: com.tapjoy.internal.fb$b */
    static final class C11449b extends C11400el<C11447fb> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11447fb fbVar = (C11447fb) obj;
            return C11400el.f27227p.mo69851a(1, fbVar.f27372e) + C11400el.f27220i.mo69851a(2, fbVar.f27373f) + fbVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11447fb fbVar = (C11447fb) obj;
            C11400el.f27227p.mo69855a(enVar, 1, fbVar.f27372e);
            C11400el.f27220i.mo69855a(enVar, 2, fbVar.f27373f);
            enVar.mo69866a(fbVar.mo69846a());
        }

        C11449b() {
            super(C11395ei.LENGTH_DELIMITED, C11447fb.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11448a aVar = new C11448a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69966b();
                } else if (b == 1) {
                    aVar.f27374c = C11400el.f27227p.mo69843a(emVar);
                } else if (b != 2) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27375d = C11400el.f27220i.mo69843a(emVar);
                }
            }
        }
    }
}
