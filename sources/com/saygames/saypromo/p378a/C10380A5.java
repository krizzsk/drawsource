package com.saygames.saypromo.p378a;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* renamed from: com.saygames.saypromo.a.A5 */
public final class C10380A5 {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f25731c = {C10532W4.m30277a(C10380A5.class, "coroutineContexts", "getCoroutineContexts()Lcom/saygames/saypromo/common/CoroutineContexts;", 0)};

    /* renamed from: a */
    private final C10484P4 f25732a;

    /* renamed from: b */
    private final C10739x5 f25733b = m30064c();

    C10380A5(C10484P4 p4) {
        this.f25732a = p4;
    }

    /* renamed from: c */
    private static C10739x5 m30064c() {
        return new C10739x5();
    }

    /* renamed from: d */
    private final C10418G1 m30065d() {
        C10484P4 p4 = this.f25732a;
        KProperty kProperty = f25731c[0];
        return (C10418G1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final void mo65245a() {
        CoroutineScopeKt.cancel$default(this.f25733b, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: a */
    public final void mo65246a(Function1 function1) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f25733b, ((C10425H1) m30065d()).mo65326a(), (CoroutineStart) null, new C10746y5(function1, (Continuation) null), 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo65247b() {
        JobKt__JobKt.cancelChildren$default(this.f25733b.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: b */
    public final void mo65248b(Function1 function1) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f25733b, ((C10425H1) m30065d()).mo65327b(), (CoroutineStart) null, new C10753z5(function1, (Continuation) null), 2, (Object) null);
    }
}
