package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.bbcaa */
public final class bbcaa {

    /* renamed from: a */
    private final String f24563a;

    /* renamed from: b */
    private final bbbac f24564b;

    public bbcaa(String str, bbbac bbbac) {
        bbabc.m28052b(str, "value");
        bbabc.m28052b(bbbac, SessionDescription.ATTR_RANGE);
        this.f24563a = str;
        this.f24564b = bbbac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbcaa)) {
            return false;
        }
        bbcaa bbcaa = (bbcaa) obj;
        return bbabc.m28051a((Object) this.f24563a, (Object) bbcaa.f24563a) && bbabc.m28051a((Object) this.f24564b, (Object) bbcaa.f24564b);
    }

    public final int hashCode() {
        String str = this.f24563a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        bbbac bbbac = this.f24564b;
        if (bbbac != null) {
            i = bbbac.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f24563a + ", range=" + this.f24564b + ")";
    }
}
