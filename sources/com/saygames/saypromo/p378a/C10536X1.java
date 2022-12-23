package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.saygames.saypromo.a.X1 */
public final class C10536X1 implements C10529W1 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26011b = {C10532W4.m30277a(C10536X1.class, "currentTimeInMillis", "getCurrentTimeInMillis()Lcom/saygames/saypromo/platform/CurrentTimeInMillis;", 0)};

    /* renamed from: a */
    private final C10484P4 f26012a;

    C10536X1(C10491Q4 q4) {
        this.f26012a = q4;
    }

    /* renamed from: a */
    private final C10550Z1 m30283a() {
        C10484P4 p4 = this.f26012a;
        KProperty kProperty = f26011b[0];
        return (C10550Z1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    public final long mo65397b() {
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(((C10558a2) m30283a()).mo65409a(), DurationUnit.MILLISECONDS);
    }
}
