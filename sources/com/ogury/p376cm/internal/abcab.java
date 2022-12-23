package com.ogury.p376cm.internal;

/* renamed from: com.ogury.cm.internal.abcab */
public abstract class abcab {

    /* renamed from: a */
    private String f24354a = "";

    /* renamed from: b */
    private boolean f24355b = true;

    /* renamed from: d */
    public static <T extends abcab> T m27881d() {
        abbba abbba = abbba.f24320a;
        T c = abbba.m27831c().mo63845c();
        if (c != null) {
            return c;
        }
        throw new babca("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final String mo63863a() {
        return this.f24354a;
    }

    /* renamed from: a */
    public final void mo63864a(String str) {
        bbabc.m28052b(str, "<set-?>");
        this.f24354a = str;
    }

    /* renamed from: a */
    public final void mo63865a(boolean z) {
        this.f24355b = z;
    }

    /* renamed from: b */
    public final boolean mo63866b() {
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("TCF")) {
            return this.f24355b;
        }
        return false;
    }

    /* renamed from: c */
    public abstract int mo63867c();
}
