package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.l */
/* compiled from: ExceptionHandler.kt */
public final class C9760l implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C9761a f24660a = new C9761a((byte) 0);

    /* renamed from: b */
    private final C9755j f24661b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f24662c;

    public C9760l(C9755j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C9717ai.m28145b(jVar, "crashSerializerFactory");
        this.f24661b = jVar;
        this.f24662c = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C9717ai.m28145b(thread, "thread");
        C9717ai.m28145b(th, "exception");
        try {
            this.f24661b.mo64112a(th).mo64085a();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24662c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Exception e) {
            C9754i iVar = C9754i.f24647a;
            C9754i.m28207a(e);
        }
    }

    /* renamed from: com.ogury.core.internal.crash.l$a */
    /* compiled from: ExceptionHandler.kt */
    public static final class C9761a {
        private C9761a() {
        }

        public /* synthetic */ C9761a(byte b) {
            this();
        }
    }
}
