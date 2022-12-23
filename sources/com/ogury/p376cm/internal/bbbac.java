package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.bbbac */
public final class bbbac extends bbbaa {

    /* renamed from: b */
    public static final aaaaa f24539b = new aaaaa((bbabb) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final bbbac f24540c = new bbbac(1, 0);

    /* renamed from: com.ogury.cm.internal.bbbac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public bbbac(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo64008d() {
        return mo64005a() > mo64006b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbbac)) {
            return false;
        }
        if (mo64008d() && ((bbbac) obj).mo64008d()) {
            return true;
        }
        bbbac bbbac = (bbbac) obj;
        return mo64005a() == bbbac.mo64005a() && mo64006b() == bbbac.mo64006b();
    }

    public final int hashCode() {
        if (mo64008d()) {
            return -1;
        }
        return (mo64005a() * 31) + mo64006b();
    }

    public final String toString() {
        return mo64005a() + ".." + mo64006b();
    }
}
