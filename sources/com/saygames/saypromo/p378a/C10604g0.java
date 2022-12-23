package com.saygames.saypromo.p378a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.g0 */
public final class C10604g0 implements C10596f0 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26127b = {C10532W4.m30277a(C10604g0.class, "advertisingManager", "getAdvertisingManager()Lcom/saygames/saypromo/manager/AdvertisingManager;", 0)};

    /* renamed from: a */
    private final C10484P4 f26128a;

    C10604g0(C10491Q4 q4) {
        this.f26128a = q4;
    }

    /* renamed from: a */
    private final C10466N0 m30401a() {
        C10484P4 p4 = this.f26128a;
        KProperty kProperty = f26127b[0];
        return (C10466N0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final Object mo65458a(Continuation continuation) {
        Object a = ((C10487Q0) m30401a()).mo65363a(continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
