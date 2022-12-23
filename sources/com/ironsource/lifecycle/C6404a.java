package com.ironsource.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo72583d2 = {"Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "Lcom/ironsource/lifecycle/IronsourceLifecycleListener;", "task", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/lifecycle/SessionCalcTask;)V", "sessionStartTime", "", "appPaused", "", "appResumed", "appStarted", "appStopped", "getSessionTime", "updateSessionStartTime", "environment_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.lifecycle.a */
public final class C6404a implements C6407c {

    /* renamed from: a */
    private long f16203a = System.currentTimeMillis();

    /* renamed from: b */
    private final C6418g f16204b;

    public C6404a(C6418g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "task");
        this.f16204b = gVar;
        C6408d.m19164a().mo35920a((C6407c) this);
    }

    /* renamed from: a */
    public final void mo35910a() {
        this.f16203a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo35911b() {
        this.f16204b.f16236a = Long.valueOf(System.currentTimeMillis() - this.f16203a);
        this.f16204b.run();
    }
}
