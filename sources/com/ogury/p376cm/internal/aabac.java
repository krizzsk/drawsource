package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.aabac */
public final class aabac extends aabab {

    /* renamed from: a */
    private final String f24244a;

    /* renamed from: b */
    private final aabba f24245b;

    /* renamed from: c */
    private final Integer[] f24246c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabac(String str, aabba aabba, Integer[] numArr) {
        super(2, str, aabba);
        bbabc.m28052b(str, "iabString");
        bbabc.m28052b(aabba, "method");
        bbabc.m28052b(numArr, "nonIabVendorIdsAccepted");
        this.f24244a = str;
        this.f24245b = aabba;
        this.f24246c = numArr;
    }

    public /* synthetic */ aabac(String str, aabba aabba, Integer[] numArr, int i, bbabb bbabb) {
        this(str, aabba.UNKNOWN, numArr);
    }

    /* renamed from: b */
    public final String mo63813b() {
        return this.f24244a;
    }

    /* renamed from: d */
    public final Integer[] mo63815d() {
        return this.f24246c;
    }
}
