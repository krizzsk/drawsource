package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.mo */
public class C10261mo extends C10253mi implements C10260mn, C10290no {

    /* renamed from: c */
    private final int f25603c;

    /* renamed from: d */
    private final int f25604d = 0;

    public C10261mo(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2);
        this.f25603c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C10287nl mo65130b() {
        return C10266mt.m29888a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10261mo) {
            C10261mo moVar = (C10261mo) obj;
            return C10263mq.m29881a((Object) mo65133e(), (Object) moVar.mo65133e()) && mo65134f().equals(moVar.mo65134f()) && mo65135g().equals(moVar.mo65135g()) && this.f25604d == moVar.f25604d && this.f25603c == moVar.f25603c && C10263mq.m29881a(mo65131c(), moVar.mo65131c());
        } else if (obj instanceof C10290no) {
            return obj.equals(mo65132d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo65133e() == null ? 0 : mo65133e().hashCode() * 31) + mo65134f().hashCode()) * 31) + mo65135g().hashCode();
    }

    public String toString() {
        C10287nl d = mo65132d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(mo65134f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo65134f() + " (Kotlin reflection is not available)";
    }
}
