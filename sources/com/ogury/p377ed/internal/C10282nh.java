package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.nh */
public final class C10282nh extends C10279nf {

    /* renamed from: b */
    public static final C10283a f25619b = new C10283a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10282nh f25620c = new C10282nh(1, 0);

    public C10282nh(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: e */
    public final Integer mo65157e() {
        return Integer.valueOf(mo65148a());
    }

    /* renamed from: f */
    public final Integer mo65158f() {
        return Integer.valueOf(mo65149b());
    }

    /* renamed from: d */
    public final boolean mo65151d() {
        return mo65148a() > mo65149b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10282nh)) {
            return false;
        }
        if (mo65151d() && ((C10282nh) obj).mo65151d()) {
            return true;
        }
        C10282nh nhVar = (C10282nh) obj;
        return mo65148a() == nhVar.mo65148a() && mo65149b() == nhVar.mo65149b();
    }

    public final int hashCode() {
        if (mo65151d()) {
            return -1;
        }
        return (mo65148a() * 31) + mo65149b();
    }

    public final String toString() {
        return mo65148a() + ".." + mo65149b();
    }

    /* renamed from: com.ogury.ed.internal.nh$a */
    public static final class C10283a {
        private C10283a() {
        }

        public /* synthetic */ C10283a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10282nh m29918a() {
            return C10282nh.f25620c;
        }
    }
}
