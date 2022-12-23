package com.inmobi.media;

/* renamed from: com.inmobi.media.ix */
/* compiled from: RuleKey */
public final class C6230ix {

    /* renamed from: a */
    private String f15707a;

    /* renamed from: b */
    private Class<?> f15708b;

    public C6230ix(String str, Class<?> cls) {
        this.f15707a = str;
        this.f15708b = cls;
    }

    public final int hashCode() {
        return this.f15707a.hashCode() + this.f15708b.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6230ix) {
            C6230ix ixVar = (C6230ix) obj;
            if (!this.f15707a.equals(ixVar.f15707a) || this.f15708b != ixVar.f15708b) {
                return false;
            }
            return true;
        }
        return false;
    }
}
