package com.saygames.saypromo.p378a;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.saygames.saypromo.a.S */
final class C10499S {

    /* renamed from: a */
    private final C10747z f25970a;

    /* renamed from: b */
    private final C10395D f25971b;

    /* renamed from: c */
    private final C10444K f25972c;

    /* renamed from: d */
    private final C10486Q f25973d;

    public C10499S(C10747z zVar, C10395D d, C10444K k, C10486Q q) {
        this.f25970a = zVar;
        this.f25971b = d;
        this.f25972c = k;
        this.f25973d = q;
    }

    /* renamed from: a */
    public static C10499S m30245a(C10499S s, C10395D d) {
        C10747z zVar = s.f25970a;
        C10444K k = s.f25972c;
        C10486Q q = s.f25973d;
        s.getClass();
        return new C10499S(zVar, d, k, q);
    }

    /* renamed from: a */
    public static C10499S m30246a(C10747z zVar, C10395D d, C10444K k, C10486Q q) {
        return new C10499S(zVar, d, k, q);
    }

    /* renamed from: a */
    public final C10747z mo65377a() {
        return this.f25970a;
    }

    /* renamed from: b */
    public final C10395D mo65378b() {
        return this.f25971b;
    }

    /* renamed from: c */
    public final C10444K mo65379c() {
        return this.f25972c;
    }

    /* renamed from: d */
    public final C10486Q mo65380d() {
        return this.f25973d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10499S)) {
            return false;
        }
        C10499S s = (C10499S) obj;
        return Intrinsics.areEqual((Object) this.f25970a, (Object) s.f25970a) && Intrinsics.areEqual((Object) this.f25971b, (Object) s.f25971b) && Intrinsics.areEqual((Object) this.f25972c, (Object) s.f25972c) && Intrinsics.areEqual((Object) this.f25973d, (Object) s.f25973d);
    }

    public final int hashCode() {
        C10747z zVar = this.f25970a;
        int i = 0;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        C10395D d = this.f25971b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        C10444K k = this.f25972c;
        int hashCode3 = (hashCode2 + (k == null ? 0 : k.hashCode())) * 31;
        C10486Q q = this.f25973d;
        if (q != null) {
            i = q.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ViewState(closePosition=" + this.f25970a + ", closeType=" + this.f25971b + ", content=" + this.f25972c + ", logoPosition=" + this.f25973d + ')';
    }
}
