package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.aq */
/* compiled from: Ranges.kt */
public final class C9726aq extends C9723ao {
    public C9726aq(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo64065d() {
        return mo64062a() > mo64063b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9726aq)) {
            return false;
        }
        if (mo64065d() && ((C9726aq) obj).mo64065d()) {
            return true;
        }
        C9726aq aqVar = (C9726aq) obj;
        return mo64062a() == aqVar.mo64062a() && mo64063b() == aqVar.mo64063b();
    }

    public final int hashCode() {
        if (mo64065d()) {
            return -1;
        }
        return (mo64062a() * 31) + mo64063b();
    }

    public final String toString() {
        return mo64062a() + ".." + mo64063b();
    }

    /* renamed from: com.ogury.core.internal.aq$a */
    /* compiled from: Ranges.kt */
    public static final class C9727a {
        private C9727a() {
        }

        public /* synthetic */ C9727a(byte b) {
            this();
        }
    }

    static {
        new C9727a((byte) 0);
        new C9726aq(1, 0);
    }
}
