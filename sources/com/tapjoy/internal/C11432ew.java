package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.ew */
public final class C11432ew extends C11397ej<C11432ew, C11433a> {

    /* renamed from: c */
    public static final C11400el<C11432ew> f27276c = new C11434b();

    /* renamed from: d */
    public static final Integer f27277d = 0;

    /* renamed from: e */
    public final String f27278e;

    /* renamed from: f */
    public final Integer f27279f;

    /* renamed from: g */
    public final String f27280g;

    /* renamed from: h */
    public final String f27281h;

    /* renamed from: i */
    public final String f27282i;

    public C11432ew(String str, Integer num, String str2, String str3, String str4, C11648je jeVar) {
        super(f27276c, jeVar);
        this.f27278e = str;
        this.f27279f = num;
        this.f27280g = str2;
        this.f27281h = str3;
        this.f27282i = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11432ew)) {
            return false;
        }
        C11432ew ewVar = (C11432ew) obj;
        return mo69846a().equals(ewVar.mo69846a()) && C11420eq.m31229a((Object) this.f27278e, (Object) ewVar.f27278e) && C11420eq.m31229a((Object) this.f27279f, (Object) ewVar.f27279f) && C11420eq.m31229a((Object) this.f27280g, (Object) ewVar.f27280g) && C11420eq.m31229a((Object) this.f27281h, (Object) ewVar.f27281h) && C11420eq.m31229a((Object) this.f27282i, (Object) ewVar.f27282i);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo69846a().hashCode() * 37;
        String str = this.f27278e;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.f27279f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.f27280g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f27281h;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f27282i;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.f27209b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f27278e != null) {
            sb.append(", pkgVer=");
            sb.append(this.f27278e);
        }
        if (this.f27279f != null) {
            sb.append(", pkgRev=");
            sb.append(this.f27279f);
        }
        if (this.f27280g != null) {
            sb.append(", dataVer=");
            sb.append(this.f27280g);
        }
        if (this.f27281h != null) {
            sb.append(", installer=");
            sb.append(this.f27281h);
        }
        if (this.f27282i != null) {
            sb.append(", store=");
            sb.append(this.f27282i);
        }
        StringBuilder replace = sb.replace(0, 2, "App{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ew$a */
    public static final class C11433a extends C11397ej.C11398a<C11432ew, C11433a> {

        /* renamed from: c */
        public String f27283c;

        /* renamed from: d */
        public Integer f27284d;

        /* renamed from: e */
        public String f27285e;

        /* renamed from: f */
        public String f27286f;

        /* renamed from: g */
        public String f27287g;

        /* renamed from: b */
        public final C11432ew mo69947b() {
            return new C11432ew(this.f27283c, this.f27284d, this.f27285e, this.f27286f, this.f27287g, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.ew$b */
    static final class C11434b extends C11400el<C11432ew> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11432ew ewVar = (C11432ew) obj;
            int i = 0;
            int a = (ewVar.f27278e != null ? C11400el.f27227p.mo69851a(1, ewVar.f27278e) : 0) + (ewVar.f27279f != null ? C11400el.f27215d.mo69851a(2, ewVar.f27279f) : 0) + (ewVar.f27280g != null ? C11400el.f27227p.mo69851a(3, ewVar.f27280g) : 0) + (ewVar.f27281h != null ? C11400el.f27227p.mo69851a(4, ewVar.f27281h) : 0);
            if (ewVar.f27282i != null) {
                i = C11400el.f27227p.mo69851a(5, ewVar.f27282i);
            }
            return a + i + ewVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11432ew ewVar = (C11432ew) obj;
            if (ewVar.f27278e != null) {
                C11400el.f27227p.mo69855a(enVar, 1, ewVar.f27278e);
            }
            if (ewVar.f27279f != null) {
                C11400el.f27215d.mo69855a(enVar, 2, ewVar.f27279f);
            }
            if (ewVar.f27280g != null) {
                C11400el.f27227p.mo69855a(enVar, 3, ewVar.f27280g);
            }
            if (ewVar.f27281h != null) {
                C11400el.f27227p.mo69855a(enVar, 4, ewVar.f27281h);
            }
            if (ewVar.f27282i != null) {
                C11400el.f27227p.mo69855a(enVar, 5, ewVar.f27282i);
            }
            enVar.mo69866a(ewVar.mo69846a());
        }

        C11434b() {
            super(C11395ei.LENGTH_DELIMITED, C11432ew.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11433a aVar = new C11433a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b == -1) {
                    emVar.mo69859a(a);
                    return aVar.mo69947b();
                } else if (b == 1) {
                    aVar.f27283c = C11400el.f27227p.mo69843a(emVar);
                } else if (b == 2) {
                    aVar.f27284d = C11400el.f27215d.mo69843a(emVar);
                } else if (b == 3) {
                    aVar.f27285e = C11400el.f27227p.mo69843a(emVar);
                } else if (b == 4) {
                    aVar.f27286f = C11400el.f27227p.mo69843a(emVar);
                } else if (b != 5) {
                    C11395ei eiVar = emVar.f27235b;
                    aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                } else {
                    aVar.f27287g = C11400el.f27227p.mo69843a(emVar);
                }
            }
        }
    }
}
