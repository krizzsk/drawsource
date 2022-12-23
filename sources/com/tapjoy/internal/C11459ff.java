package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: com.tapjoy.internal.ff */
public final class C11459ff extends C11397ej<C11459ff, C11460a> {

    /* renamed from: c */
    public static final C11400el<C11459ff> f27430c = new C11461b();

    /* renamed from: d */
    public static final Integer f27431d = 1;

    /* renamed from: e */
    public static final Double f27432e = Double.valueOf(0.0d);

    /* renamed from: f */
    public static final Integer f27433f = 0;

    /* renamed from: g */
    public static final Long f27434g = 0L;

    /* renamed from: h */
    public final String f27435h;

    /* renamed from: i */
    public final Integer f27436i;

    /* renamed from: j */
    public final Double f27437j;

    /* renamed from: k */
    public final String f27438k;

    /* renamed from: l */
    public final String f27439l;

    /* renamed from: m */
    public final String f27440m;

    /* renamed from: n */
    public final String f27441n;

    /* renamed from: o */
    public final String f27442o;

    /* renamed from: p */
    public final Integer f27443p;

    /* renamed from: q */
    public final Long f27444q;

    /* renamed from: r */
    public final String f27445r;

    /* renamed from: s */
    public final String f27446s;

    /* renamed from: t */
    public final String f27447t;

    /* renamed from: u */
    public final String f27448u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11459ff(String str, Integer num, Double d, String str2, String str3, String str4, String str5, String str6, Integer num2, Long l, String str7, String str8, String str9, String str10, C11648je jeVar) {
        super(f27430c, jeVar);
        this.f27435h = str;
        this.f27436i = num;
        this.f27437j = d;
        this.f27438k = str2;
        this.f27439l = str3;
        this.f27440m = str4;
        this.f27441n = str5;
        this.f27442o = str6;
        this.f27443p = num2;
        this.f27444q = l;
        this.f27445r = str7;
        this.f27446s = str8;
        this.f27447t = str9;
        this.f27448u = str10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11459ff)) {
            return false;
        }
        C11459ff ffVar = (C11459ff) obj;
        return mo69846a().equals(ffVar.mo69846a()) && this.f27435h.equals(ffVar.f27435h) && C11420eq.m31229a((Object) this.f27436i, (Object) ffVar.f27436i) && C11420eq.m31229a((Object) this.f27437j, (Object) ffVar.f27437j) && C11420eq.m31229a((Object) this.f27438k, (Object) ffVar.f27438k) && C11420eq.m31229a((Object) this.f27439l, (Object) ffVar.f27439l) && C11420eq.m31229a((Object) this.f27440m, (Object) ffVar.f27440m) && C11420eq.m31229a((Object) this.f27441n, (Object) ffVar.f27441n) && C11420eq.m31229a((Object) this.f27442o, (Object) ffVar.f27442o) && C11420eq.m31229a((Object) this.f27443p, (Object) ffVar.f27443p) && C11420eq.m31229a((Object) this.f27444q, (Object) ffVar.f27444q) && C11420eq.m31229a((Object) this.f27445r, (Object) ffVar.f27445r) && C11420eq.m31229a((Object) this.f27446s, (Object) ffVar.f27446s) && C11420eq.m31229a((Object) this.f27447t, (Object) ffVar.f27447t) && C11420eq.m31229a((Object) this.f27448u, (Object) ffVar.f27448u);
    }

    public final int hashCode() {
        int i = this.f27209b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((mo69846a().hashCode() * 37) + this.f27435h.hashCode()) * 37;
        Integer num = this.f27436i;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Double d = this.f27437j;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.f27438k;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f27439l;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f27440m;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f27441n;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f27442o;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.f27443p;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.f27444q;
        int hashCode10 = (hashCode9 + (l != null ? l.hashCode() : 0)) * 37;
        String str6 = this.f27445r;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.f27446s;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f27447t;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f27448u;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        int i3 = hashCode13 + i2;
        this.f27209b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", productId=");
        sb.append(this.f27435h);
        if (this.f27436i != null) {
            sb.append(", productQuantity=");
            sb.append(this.f27436i);
        }
        if (this.f27437j != null) {
            sb.append(", productPrice=");
            sb.append(this.f27437j);
        }
        if (this.f27438k != null) {
            sb.append(", productPriceCurrency=");
            sb.append(this.f27438k);
        }
        if (this.f27439l != null) {
            sb.append(", productType=");
            sb.append(this.f27439l);
        }
        if (this.f27440m != null) {
            sb.append(", productTitle=");
            sb.append(this.f27440m);
        }
        if (this.f27441n != null) {
            sb.append(", productDescription=");
            sb.append(this.f27441n);
        }
        if (this.f27442o != null) {
            sb.append(", transactionId=");
            sb.append(this.f27442o);
        }
        if (this.f27443p != null) {
            sb.append(", transactionState=");
            sb.append(this.f27443p);
        }
        if (this.f27444q != null) {
            sb.append(", transactionDate=");
            sb.append(this.f27444q);
        }
        if (this.f27445r != null) {
            sb.append(", campaignId=");
            sb.append(this.f27445r);
        }
        if (this.f27446s != null) {
            sb.append(", currencyPrice=");
            sb.append(this.f27446s);
        }
        if (this.f27447t != null) {
            sb.append(", receipt=");
            sb.append(this.f27447t);
        }
        if (this.f27448u != null) {
            sb.append(", signature=");
            sb.append(this.f27448u);
        }
        StringBuilder replace = sb.replace(0, 2, "Purchase{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ff$a */
    public static final class C11460a extends C11397ej.C11398a<C11459ff, C11460a> {

        /* renamed from: c */
        public String f27449c;

        /* renamed from: d */
        public Integer f27450d;

        /* renamed from: e */
        public Double f27451e;

        /* renamed from: f */
        public String f27452f;

        /* renamed from: g */
        public String f27453g;

        /* renamed from: h */
        public String f27454h;

        /* renamed from: i */
        public String f27455i;

        /* renamed from: j */
        public String f27456j;

        /* renamed from: k */
        public Integer f27457k;

        /* renamed from: l */
        public Long f27458l;

        /* renamed from: m */
        public String f27459m;

        /* renamed from: n */
        public String f27460n;

        /* renamed from: o */
        public String f27461o;

        /* renamed from: p */
        public String f27462p;

        /* renamed from: b */
        public final C11459ff mo69978b() {
            String str = this.f27449c;
            if (str != null) {
                return new C11459ff(this.f27449c, this.f27450d, this.f27451e, this.f27452f, this.f27453g, this.f27454h, this.f27455i, this.f27456j, this.f27457k, this.f27458l, this.f27459m, this.f27460n, this.f27461o, this.f27462p, super.mo69850a());
            }
            throw C11420eq.m31226a(str, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        }
    }

    /* renamed from: com.tapjoy.internal.ff$b */
    static final class C11461b extends C11400el<C11459ff> {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            C11459ff ffVar = (C11459ff) obj;
            int i = 0;
            int a = C11400el.f27227p.mo69851a(1, ffVar.f27435h) + (ffVar.f27436i != null ? C11400el.f27215d.mo69851a(2, ffVar.f27436i) : 0) + (ffVar.f27437j != null ? C11400el.f27226o.mo69851a(3, ffVar.f27437j) : 0) + (ffVar.f27438k != null ? C11400el.f27227p.mo69851a(4, ffVar.f27438k) : 0) + (ffVar.f27439l != null ? C11400el.f27227p.mo69851a(5, ffVar.f27439l) : 0) + (ffVar.f27440m != null ? C11400el.f27227p.mo69851a(6, ffVar.f27440m) : 0) + (ffVar.f27441n != null ? C11400el.f27227p.mo69851a(7, ffVar.f27441n) : 0) + (ffVar.f27442o != null ? C11400el.f27227p.mo69851a(8, ffVar.f27442o) : 0) + (ffVar.f27443p != null ? C11400el.f27215d.mo69851a(9, ffVar.f27443p) : 0) + (ffVar.f27444q != null ? C11400el.f27220i.mo69851a(10, ffVar.f27444q) : 0) + (ffVar.f27445r != null ? C11400el.f27227p.mo69851a(11, ffVar.f27445r) : 0) + (ffVar.f27446s != null ? C11400el.f27227p.mo69851a(12, ffVar.f27446s) : 0) + (ffVar.f27447t != null ? C11400el.f27227p.mo69851a(13, ffVar.f27447t) : 0);
            if (ffVar.f27448u != null) {
                i = C11400el.f27227p.mo69851a(14, ffVar.f27448u);
            }
            return a + i + ffVar.mo69846a().mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            C11459ff ffVar = (C11459ff) obj;
            C11400el.f27227p.mo69855a(enVar, 1, ffVar.f27435h);
            if (ffVar.f27436i != null) {
                C11400el.f27215d.mo69855a(enVar, 2, ffVar.f27436i);
            }
            if (ffVar.f27437j != null) {
                C11400el.f27226o.mo69855a(enVar, 3, ffVar.f27437j);
            }
            if (ffVar.f27438k != null) {
                C11400el.f27227p.mo69855a(enVar, 4, ffVar.f27438k);
            }
            if (ffVar.f27439l != null) {
                C11400el.f27227p.mo69855a(enVar, 5, ffVar.f27439l);
            }
            if (ffVar.f27440m != null) {
                C11400el.f27227p.mo69855a(enVar, 6, ffVar.f27440m);
            }
            if (ffVar.f27441n != null) {
                C11400el.f27227p.mo69855a(enVar, 7, ffVar.f27441n);
            }
            if (ffVar.f27442o != null) {
                C11400el.f27227p.mo69855a(enVar, 8, ffVar.f27442o);
            }
            if (ffVar.f27443p != null) {
                C11400el.f27215d.mo69855a(enVar, 9, ffVar.f27443p);
            }
            if (ffVar.f27444q != null) {
                C11400el.f27220i.mo69855a(enVar, 10, ffVar.f27444q);
            }
            if (ffVar.f27445r != null) {
                C11400el.f27227p.mo69855a(enVar, 11, ffVar.f27445r);
            }
            if (ffVar.f27446s != null) {
                C11400el.f27227p.mo69855a(enVar, 12, ffVar.f27446s);
            }
            if (ffVar.f27447t != null) {
                C11400el.f27227p.mo69855a(enVar, 13, ffVar.f27447t);
            }
            if (ffVar.f27448u != null) {
                C11400el.f27227p.mo69855a(enVar, 14, ffVar.f27448u);
            }
            enVar.mo69866a(ffVar.mo69846a());
        }

        C11461b() {
            super(C11395ei.LENGTH_DELIMITED, C11459ff.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            C11460a aVar = new C11460a();
            long a = emVar.mo69858a();
            while (true) {
                int b = emVar.mo69860b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f27449c = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 2:
                            aVar.f27450d = C11400el.f27215d.mo69843a(emVar);
                            break;
                        case 3:
                            aVar.f27451e = C11400el.f27226o.mo69843a(emVar);
                            break;
                        case 4:
                            aVar.f27452f = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 5:
                            aVar.f27453g = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 6:
                            aVar.f27454h = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 7:
                            aVar.f27455i = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 8:
                            aVar.f27456j = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 9:
                            aVar.f27457k = C11400el.f27215d.mo69843a(emVar);
                            break;
                        case 10:
                            aVar.f27458l = C11400el.f27220i.mo69843a(emVar);
                            break;
                        case 11:
                            aVar.f27459m = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 12:
                            aVar.f27460n = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 13:
                            aVar.f27461o = C11400el.f27227p.mo69843a(emVar);
                            break;
                        case 14:
                            aVar.f27462p = C11400el.f27227p.mo69843a(emVar);
                            break;
                        default:
                            C11395ei eiVar = emVar.f27235b;
                            aVar.mo69848a(b, eiVar, eiVar.mo69845a().mo69843a(emVar));
                            break;
                    }
                } else {
                    emVar.mo69859a(a);
                    return aVar.mo69978b();
                }
            }
        }
    }
}
