package com.ogury.core.internal;

import java.io.Closeable;

/* renamed from: com.ogury.core.internal.aa */
/* compiled from: Closeable.kt */
public class C9703aa {

    /* renamed from: a */
    private final String f24585a;

    /* renamed from: b */
    private final long f24586b;

    /* renamed from: a */
    public static final void m28119a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C9717ai.m28145b(th, "$this$addSuppressed");
            C9717ai.m28145b(th2, "exception");
            if (th != th2) {
                C9798y.f24699a.mo64214a(th, th2);
            }
        }
    }

    /* renamed from: a */
    public String mo64040a() {
        return this.f24585a;
    }

    /* renamed from: b */
    public long mo64041b() {
        return this.f24586b;
    }

    private C9703aa(String str, long j) {
        C9717ai.m28145b(str, "message");
        this.f24585a = str;
        this.f24586b = j;
    }

    public /* synthetic */ C9703aa(String str, long j, int i) {
        this(str, System.currentTimeMillis());
    }
}
