package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;

/* renamed from: com.ogury.core.internal.crash.o */
/* compiled from: PhoneInfo.kt */
public final class C9765o {

    /* renamed from: a */
    public static final C9766a f24665a = new C9766a((byte) 0);

    /* renamed from: b */
    private final String f24666b;

    /* renamed from: c */
    private final String f24667c;

    /* renamed from: d */
    private final C9767p f24668d;

    /* renamed from: com.ogury.core.internal.crash.o$a */
    /* compiled from: PhoneInfo.kt */
    public static final class C9766a {
        private C9766a() {
        }

        public /* synthetic */ C9766a(byte b) {
            this();
        }
    }

    public C9765o(String str, String str2, C9767p pVar) {
        C9717ai.m28145b(str, "phoneModel");
        C9717ai.m28145b(str2, "androidVersion");
        C9717ai.m28145b(pVar, "memory");
        this.f24666b = str;
        this.f24667c = str2;
        this.f24668d = pVar;
    }

    /* renamed from: a */
    public final String mo64119a() {
        return this.f24666b;
    }

    /* renamed from: b */
    public final String mo64120b() {
        return this.f24667c;
    }

    /* renamed from: c */
    public final C9767p mo64121c() {
        return this.f24668d;
    }
}
