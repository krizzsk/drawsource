package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.fe */
public final class C11456fe extends C11397ej<C11456fe, C11457a> {

    /* renamed from: c */
    public static final C11400el<C11456fe> f27423c = new C11458b();

    /* renamed from: d */
    public final String f27424d;

    /* renamed from: e */
    public final String f27425e;

    /* renamed from: f */
    public final String f27426f;

    public C11456fe(String str, String str2, String str3) {
        this(str, str2, str3, C11648je.f28077b);
    }

    public C11456fe(String str, String str2, String str3, C11648je jeVar) {
        super(f27423c, jeVar);
        this.f27424d = str;
        this.f27425e = str2;
        this.f27426f = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11456fe)) {
            return false;
        }
        C11456fe feVar = (C11456fe) obj;
        return mo69846a().equals(feVar.mo69846a()) && C11420eq.m31229a((Object) this.f27424d, (Object) feVar.f27424d) && C11420eq.m31229a((Object) this.f27425e, (Object) feVar.f27425e) && C11420eq.m31229a((Object) this.f27426f, (Object) feVar.f27426f);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo69846a().hashCode() * 37;
        String str = this.f27424d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f27425e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f27426f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f27209b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f27424d != null) {
            sb.append(", fq7Change=");
            sb.append(this.f27424d);
        }
        if (this.f27425e != null) {
            sb.append(", fq30Change=");
            sb.append(this.f27425e);
        }
        if (this.f27426f != null) {
            sb.append(", pushId=");
            sb.append(this.f27426f);
        }
        StringBuilder replace = sb.replace(0, 2, "Meta{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fe$a */
    public static final class C11457a extends C11397ej.C11398a<C11456fe, C11457a> {

        /* renamed from: c */
        public String f27427c;

        /* renamed from: d */
        public String f27428d;

        /* renamed from: e */
        public String f27429e;

        /* renamed from: b */
        public final C11456fe mo69975b() {
            return new C11456fe(this.f27427c, this.f27428d, this.f27429e, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.fe$b */
    static final class C11458b extends C11400el<C11456fe> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11456fe feVar = (C11456fe) obj;
            int i = 0;
            int a = (feVar.f27424d != null ? C11400el.f27227p.mo69851a(1, feVar.f27424d) : 0) + (feVar.f27425e != null ? C11400el.f27227p.mo69851a(2, feVar.f27425e) : 0);
            if (feVar.f27426f != null) {
                i = C11400el.f27227p.mo69851a(3, feVar.f27426f);
            }
            return a + i + feVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11456fe feVar = (C11456fe) obj;
            if (feVar.f27424d != null) {
                C11400el.f27227p.mo69855a(enVar, 1, feVar.f27424d);
            }
            if (feVar.f27425e != null) {
                C11400el.f27227p.mo69855a(enVar, 2, feVar.f27425e);
            }
            if (feVar.f27426f != null) {
                C11400el.f27227p.mo69855a(enVar, 3, feVar.f27426f);
            }
            enVar.mo69866a(feVar.mo69846a());
        }

        C11458b() {
            super(C11395ei.LENGTH_DELIMITED, C11456fe.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11457a aVar = new C11457a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69975b();
                } else if (b == 1) {
                    aVar.f27427c = C11400el.f27227p.mo69843a(emVar);
                } else if (b == 2) {
                    aVar.f27428d = C11400el.f27227p.mo69843a(emVar);
                } else if (b != 3) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27429e = C11400el.f27227p.mo69843a(emVar);
                }
            }
        }
    }
}
