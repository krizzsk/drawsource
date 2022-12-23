package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;

/* renamed from: com.tapjoy.internal.fc */
public final class C11450fc extends C11397ej<C11450fc, C11451a> {

    /* renamed from: c */
    public static final C11400el<C11450fc> f27376c = new C11452b();

    /* renamed from: d */
    public static final Integer f27377d = 0;

    /* renamed from: e */
    public static final Integer f27378e = 0;

    /* renamed from: f */
    public static final Integer f27379f = 0;

    /* renamed from: g */
    public final String f27380g;

    /* renamed from: h */
    public final String f27381h;

    /* renamed from: i */
    public final String f27382i;

    /* renamed from: j */
    public final String f27383j;

    /* renamed from: k */
    public final String f27384k;

    /* renamed from: l */
    public final String f27385l;

    /* renamed from: m */
    public final Integer f27386m;

    /* renamed from: n */
    public final Integer f27387n;

    /* renamed from: o */
    public final Integer f27388o;

    /* renamed from: p */
    public final String f27389p;

    /* renamed from: q */
    public final String f27390q;

    /* renamed from: r */
    public final String f27391r;

    /* renamed from: s */
    public final String f27392s;

    /* renamed from: t */
    public final String f27393t;

    /* renamed from: u */
    public final String f27394u;

    /* renamed from: v */
    public final String f27395v;

    /* renamed from: w */
    public final String f27396w;

    /* renamed from: x */
    public final String f27397x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11450fc(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C11648je jeVar) {
        super(f27376c, jeVar);
        this.f27380g = str;
        this.f27381h = str2;
        this.f27382i = str3;
        this.f27383j = str4;
        this.f27384k = str5;
        this.f27385l = str6;
        this.f27386m = num;
        this.f27387n = num2;
        this.f27388o = num3;
        this.f27389p = str7;
        this.f27390q = str8;
        this.f27391r = str9;
        this.f27392s = str10;
        this.f27393t = str11;
        this.f27394u = str12;
        this.f27395v = str13;
        this.f27396w = str14;
        this.f27397x = str15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11450fc)) {
            return false;
        }
        C11450fc fcVar = (C11450fc) obj;
        return mo69846a().equals(fcVar.mo69846a()) && C11420eq.m31229a((Object) this.f27380g, (Object) fcVar.f27380g) && C11420eq.m31229a((Object) this.f27381h, (Object) fcVar.f27381h) && C11420eq.m31229a((Object) this.f27382i, (Object) fcVar.f27382i) && C11420eq.m31229a((Object) this.f27383j, (Object) fcVar.f27383j) && C11420eq.m31229a((Object) this.f27384k, (Object) fcVar.f27384k) && C11420eq.m31229a((Object) this.f27385l, (Object) fcVar.f27385l) && C11420eq.m31229a((Object) this.f27386m, (Object) fcVar.f27386m) && C11420eq.m31229a((Object) this.f27387n, (Object) fcVar.f27387n) && C11420eq.m31229a((Object) this.f27388o, (Object) fcVar.f27388o) && C11420eq.m31229a((Object) this.f27389p, (Object) fcVar.f27389p) && C11420eq.m31229a((Object) this.f27390q, (Object) fcVar.f27390q) && C11420eq.m31229a((Object) this.f27391r, (Object) fcVar.f27391r) && C11420eq.m31229a((Object) this.f27392s, (Object) fcVar.f27392s) && C11420eq.m31229a((Object) this.f27393t, (Object) fcVar.f27393t) && C11420eq.m31229a((Object) this.f27394u, (Object) fcVar.f27394u) && C11420eq.m31229a((Object) this.f27395v, (Object) fcVar.f27395v) && C11420eq.m31229a((Object) this.f27396w, (Object) fcVar.f27396w) && C11420eq.m31229a((Object) this.f27397x, (Object) fcVar.f27397x);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo69846a().hashCode() * 37;
        String str = this.f27380g;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f27381h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f27382i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f27383j;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f27384k;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.f27385l;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.f27386m;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f27387n;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.f27388o;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str7 = this.f27389p;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f27390q;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f27391r;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.f27392s;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.f27393t;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.f27394u;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.f27395v;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.f27396w;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.f27397x;
        if (str15 != null) {
            i2 = str15.hashCode();
        }
        int i3 = hashCode18 + i2;
        this.f27209b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f27380g != null) {
            sb.append(", mac=");
            sb.append(this.f27380g);
        }
        if (this.f27381h != null) {
            sb.append(", deviceId=");
            sb.append(this.f27381h);
        }
        if (this.f27382i != null) {
            sb.append(", deviceMaker=");
            sb.append(this.f27382i);
        }
        if (this.f27383j != null) {
            sb.append(", deviceModel=");
            sb.append(this.f27383j);
        }
        if (this.f27384k != null) {
            sb.append(", osName=");
            sb.append(this.f27384k);
        }
        if (this.f27385l != null) {
            sb.append(", osVer=");
            sb.append(this.f27385l);
        }
        if (this.f27386m != null) {
            sb.append(", displayD=");
            sb.append(this.f27386m);
        }
        if (this.f27387n != null) {
            sb.append(", displayW=");
            sb.append(this.f27387n);
        }
        if (this.f27388o != null) {
            sb.append(", displayH=");
            sb.append(this.f27388o);
        }
        if (this.f27389p != null) {
            sb.append(", locale=");
            sb.append(this.f27389p);
        }
        if (this.f27390q != null) {
            sb.append(", timezone=");
            sb.append(this.f27390q);
        }
        if (this.f27391r != null) {
            sb.append(", pkgId=");
            sb.append(this.f27391r);
        }
        if (this.f27392s != null) {
            sb.append(", pkgSign=");
            sb.append(this.f27392s);
        }
        if (this.f27393t != null) {
            sb.append(", sdk=");
            sb.append(this.f27393t);
        }
        if (this.f27394u != null) {
            sb.append(", countrySim=");
            sb.append(this.f27394u);
        }
        if (this.f27395v != null) {
            sb.append(", countryNet=");
            sb.append(this.f27395v);
        }
        if (this.f27396w != null) {
            sb.append(", imei=");
            sb.append(this.f27396w);
        }
        if (this.f27397x != null) {
            sb.append(", androidId=");
            sb.append(this.f27397x);
        }
        StringBuilder replace = sb.replace(0, 2, "Info{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fc$a */
    public static final class C11451a extends C11397ej.C11398a<C11450fc, C11451a> {

        /* renamed from: c */
        public String f27398c;

        /* renamed from: d */
        public String f27399d;

        /* renamed from: e */
        public String f27400e;

        /* renamed from: f */
        public String f27401f;

        /* renamed from: g */
        public String f27402g;

        /* renamed from: h */
        public String f27403h;

        /* renamed from: i */
        public Integer f27404i;

        /* renamed from: j */
        public Integer f27405j;

        /* renamed from: k */
        public Integer f27406k;

        /* renamed from: l */
        public String f27407l;

        /* renamed from: m */
        public String f27408m;

        /* renamed from: n */
        public String f27409n;

        /* renamed from: o */
        public String f27410o;

        /* renamed from: p */
        public String f27411p;

        /* renamed from: q */
        public String f27412q;

        /* renamed from: r */
        public String f27413r;

        /* renamed from: s */
        public String f27414s;

        /* renamed from: t */
        public String f27415t;

        /* renamed from: b */
        public final C11450fc mo69969b() {
            return new C11450fc(this.f27398c, this.f27399d, this.f27400e, this.f27401f, this.f27402g, this.f27403h, this.f27404i, this.f27405j, this.f27406k, this.f27407l, this.f27408m, this.f27409n, this.f27410o, this.f27411p, this.f27412q, this.f27413r, this.f27414s, this.f27415t, super.mo69850a());
        }
    }

    /* renamed from: com.tapjoy.internal.fc$b */
    static final class C11452b extends C11400el<C11450fc> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11450fc fcVar = (C11450fc) obj;
            int i = 0;
            int a = (fcVar.f27380g != null ? C11400el.f27227p.mo69851a(1, fcVar.f27380g) : 0) + (fcVar.f27381h != null ? C11400el.f27227p.mo69851a(2, fcVar.f27381h) : 0) + (fcVar.f27382i != null ? C11400el.f27227p.mo69851a(3, fcVar.f27382i) : 0) + (fcVar.f27383j != null ? C11400el.f27227p.mo69851a(4, fcVar.f27383j) : 0) + (fcVar.f27384k != null ? C11400el.f27227p.mo69851a(5, fcVar.f27384k) : 0) + (fcVar.f27385l != null ? C11400el.f27227p.mo69851a(6, fcVar.f27385l) : 0) + (fcVar.f27386m != null ? C11400el.f27215d.mo69851a(7, fcVar.f27386m) : 0) + (fcVar.f27387n != null ? C11400el.f27215d.mo69851a(8, fcVar.f27387n) : 0) + (fcVar.f27388o != null ? C11400el.f27215d.mo69851a(9, fcVar.f27388o) : 0) + (fcVar.f27389p != null ? C11400el.f27227p.mo69851a(10, fcVar.f27389p) : 0) + (fcVar.f27390q != null ? C11400el.f27227p.mo69851a(11, fcVar.f27390q) : 0) + (fcVar.f27391r != null ? C11400el.f27227p.mo69851a(12, fcVar.f27391r) : 0) + (fcVar.f27392s != null ? C11400el.f27227p.mo69851a(13, fcVar.f27392s) : 0) + (fcVar.f27393t != null ? C11400el.f27227p.mo69851a(14, fcVar.f27393t) : 0) + (fcVar.f27394u != null ? C11400el.f27227p.mo69851a(15, fcVar.f27394u) : 0) + (fcVar.f27395v != null ? C11400el.f27227p.mo69851a(16, fcVar.f27395v) : 0) + (fcVar.f27396w != null ? C11400el.f27227p.mo69851a(17, fcVar.f27396w) : 0);
            if (fcVar.f27397x != null) {
                i = C11400el.f27227p.mo69851a(18, fcVar.f27397x);
            }
            return a + i + fcVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11450fc fcVar = (C11450fc) obj;
            if (fcVar.f27380g != null) {
                C11400el.f27227p.mo69855a(enVar, 1, fcVar.f27380g);
            }
            if (fcVar.f27381h != null) {
                C11400el.f27227p.mo69855a(enVar, 2, fcVar.f27381h);
            }
            if (fcVar.f27382i != null) {
                C11400el.f27227p.mo69855a(enVar, 3, fcVar.f27382i);
            }
            if (fcVar.f27383j != null) {
                C11400el.f27227p.mo69855a(enVar, 4, fcVar.f27383j);
            }
            if (fcVar.f27384k != null) {
                C11400el.f27227p.mo69855a(enVar, 5, fcVar.f27384k);
            }
            if (fcVar.f27385l != null) {
                C11400el.f27227p.mo69855a(enVar, 6, fcVar.f27385l);
            }
            if (fcVar.f27386m != null) {
                C11400el.f27215d.mo69855a(enVar, 7, fcVar.f27386m);
            }
            if (fcVar.f27387n != null) {
                C11400el.f27215d.mo69855a(enVar, 8, fcVar.f27387n);
            }
            if (fcVar.f27388o != null) {
                C11400el.f27215d.mo69855a(enVar, 9, fcVar.f27388o);
            }
            if (fcVar.f27389p != null) {
                C11400el.f27227p.mo69855a(enVar, 10, fcVar.f27389p);
            }
            if (fcVar.f27390q != null) {
                C11400el.f27227p.mo69855a(enVar, 11, fcVar.f27390q);
            }
            if (fcVar.f27391r != null) {
                C11400el.f27227p.mo69855a(enVar, 12, fcVar.f27391r);
            }
            if (fcVar.f27392s != null) {
                C11400el.f27227p.mo69855a(enVar, 13, fcVar.f27392s);
            }
            if (fcVar.f27393t != null) {
                C11400el.f27227p.mo69855a(enVar, 14, fcVar.f27393t);
            }
            if (fcVar.f27394u != null) {
                C11400el.f27227p.mo69855a(enVar, 15, fcVar.f27394u);
            }
            if (fcVar.f27395v != null) {
                C11400el.f27227p.mo69855a(enVar, 16, fcVar.f27395v);
            }
            if (fcVar.f27396w != null) {
                C11400el.f27227p.mo69855a(enVar, 17, fcVar.f27396w);
            }
            if (fcVar.f27397x != null) {
                C11400el.f27227p.mo69855a(enVar, 18, fcVar.f27397x);
            }
            enVar.mo69866a(fcVar.mo69846a());
        }

        C11452b() {
            super(C11395ei.LENGTH_DELIMITED, C11450fc.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11451a aVar = new C11451a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f27398c = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 2:
                            aVar.f27399d = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 3:
                            aVar.f27400e = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 4:
                            aVar.f27401f = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 5:
                            aVar.f27402g = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 6:
                            aVar.f27403h = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 7:
                            aVar.f27404i = C11400el.f27215d.mo69843a(emVar);
                            break;
                        case 8:
                            aVar.f27405j = C11400el.f27215d.mo69843a(emVar);
                            break;
                        case 9:
                            aVar.f27406k = C11400el.f27215d.mo69843a(emVar);
                            break;
                        case 10:
                            aVar.f27407l = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 11:
                            aVar.f27408m = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 12:
                            aVar.f27409n = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 13:
                            aVar.f27410o = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 14:
                            aVar.f27411p = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 15:
                            aVar.f27412q = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 16:
                            aVar.f27413r = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 17:
                            aVar.f27414s = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 18:
                            aVar.f27415t = C11400el.f27227p.mo69843a(emVar);
                            break;
                        default:
                            C11395ei eiVar = emVar.f27235b;
                            aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                            break;
                    }
                } else {
                    emVar.mo69859a(a);
                    return aVar.mo69969b();
                }
            }
        }
    }
}
