package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.aabab */
public class aabab extends aaacc {

    /* renamed from: a */
    private final int f24241a;

    /* renamed from: b */
    private final String f24242b;

    /* renamed from: c */
    private final aabba f24243c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabab(int i, String str, aabba aabba) {
        super((bbabb) null);
        bbabc.m28052b(str, "iabString");
        bbabc.m28052b(aabba, "retrievalMethod");
        this.f24241a = i;
        this.f24242b = str;
        this.f24243c = aabba;
    }

    public /* synthetic */ aabab(int i, String str, aabba aabba, int i2, bbabb bbabb) {
        this(i, str, aabba.UNKNOWN);
    }

    /* renamed from: a */
    public final int mo63812a() {
        return this.f24241a;
    }

    /* renamed from: b */
    public String mo63813b() {
        return this.f24242b;
    }

    /* renamed from: c */
    public final aabba mo63814c() {
        return this.f24243c;
    }
}
