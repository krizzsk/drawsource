package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9794w;
import com.ogury.core.internal.crash.C9756k;
import com.ogury.core.internal.crash.C9760l;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.g */
/* compiled from: CrashReportFacade.kt */
public final class C9752g {

    /* renamed from: a */
    private boolean f24641a;

    /* renamed from: b */
    private final C9750f f24642b;

    /* renamed from: c */
    private final C9762m f24643c;

    /* renamed from: d */
    private final C9755j f24644d;

    /* renamed from: e */
    private final C9756k f24645e;

    /* renamed from: f */
    private final C9760l.C9761a f24646f;

    private C9752g(C9750f fVar, C9762m mVar, C9755j jVar, C9756k kVar, C9760l.C9761a aVar) {
        C9717ai.m28145b(fVar, "crashReportDao");
        C9717ai.m28145b(mVar, "fileStore");
        C9717ai.m28145b(jVar, "crashSerializerFactory");
        C9717ai.m28145b(kVar, "crashUploader");
        C9717ai.m28145b(aVar, "exceptionHandler");
        this.f24642b = fVar;
        this.f24643c = mVar;
        this.f24644d = jVar;
        this.f24645e = kVar;
        this.f24646f = aVar;
    }

    public /* synthetic */ C9752g(C9750f fVar, C9762m mVar, C9755j jVar, C9756k kVar, C9760l.C9761a aVar, int i) {
        this(fVar, mVar, jVar, new C9756k(fVar, mVar, (C9746d) null, 4), C9760l.f24660a);
    }

    /* renamed from: a */
    public final void mo64108a(String str, CrashConfig crashConfig) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(crashConfig, "crashConfig");
        this.f24643c.mo64115a(str);
        this.f24642b.mo64101a(str, crashConfig.getUrl());
        this.f24642b.mo64102a(str, true);
        this.f24642b.mo64103b(crashConfig.getPackageName(), str);
        this.f24642b.mo64106d(crashConfig.getPackageName());
        C9756k kVar = this.f24645e;
        int sendCrashFrequency = crashConfig.getSendCrashFrequency();
        int deleteAllCrashesFrequency = crashConfig.getDeleteAllCrashesFrequency();
        C9717ai.m28145b(str, "sdkKey");
        Thread unused = C9794w.m28245a(true, false, (ClassLoader) null, (String) null, -1, new C9756k.C9758b(kVar, str, sendCrashFrequency, deleteAllCrashesFrequency));
        if (!this.f24641a) {
            C9755j jVar = this.f24644d;
            C9717ai.m28145b(jVar, "crashSerializerFactory");
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C9760l)) {
                Thread.setDefaultUncaughtExceptionHandler(new C9760l(jVar, defaultUncaughtExceptionHandler));
            }
            this.f24641a = true;
        }
    }

    /* renamed from: a */
    public final void mo64107a(String str) {
        C9717ai.m28145b(str, "sdkKey");
        C9756k kVar = this.f24645e;
        C9717ai.m28145b(str, "sdkKey");
        Thread unused = C9794w.m28245a(true, false, (ClassLoader) null, (String) null, -1, new C9756k.C9759c(kVar, str));
    }

    /* renamed from: b */
    public final void mo64110b(String str) {
        C9717ai.m28145b(str, "sdkKey");
        this.f24642b.mo64102a(str, false);
    }

    /* renamed from: a */
    public final void mo64109a(String str, Throwable th) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(th, "t");
        this.f24644d.mo64112a(th).mo64087b(str);
    }

    /* renamed from: b */
    public final void mo64111b(String str, Throwable th) {
        C9717ai.m28145b(str, "sdkKey");
        C9717ai.m28145b(th, "t");
        this.f24644d.mo64112a(th).mo64086a(str);
    }
}
