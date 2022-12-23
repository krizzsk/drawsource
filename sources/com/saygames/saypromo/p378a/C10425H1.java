package com.saygames.saypromo.p378a;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* renamed from: com.saygames.saypromo.a.H1 */
public final class C10425H1 implements C10418G1 {

    /* renamed from: a */
    private final CoroutineContext f25837a;

    /* renamed from: b */
    private final CoroutineContext f25838b;

    C10425H1(CoroutineDispatcher coroutineDispatcher, MainCoroutineDispatcher mainCoroutineDispatcher) {
        this.f25837a = coroutineDispatcher;
        this.f25838b = mainCoroutineDispatcher;
    }

    /* renamed from: a */
    public final CoroutineContext mo65326a() {
        return this.f25837a;
    }

    /* renamed from: b */
    public final CoroutineContext mo65327b() {
        return this.f25838b;
    }
}
