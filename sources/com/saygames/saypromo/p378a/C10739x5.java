package com.saygames.saypromo.p378a;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.saygames.saypromo.a.x5 */
public final class C10739x5 implements CoroutineScope {

    /* renamed from: a */
    private final CompletableJob f26371a = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);

    C10739x5() {
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f26371a;
    }
}
