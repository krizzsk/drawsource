package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.E5 */
public final class C10408E5 implements C10401D5 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f25797b = {C10532W4.m30277a(C10408E5.class, "currentDuration", "getCurrentDuration()Lcom/saygames/saypromo/common/CurrentDuration;", 0)};

    /* renamed from: a */
    private final C10484P4 f25798a;

    C10408E5(C10491Q4 q4) {
        this.f25798a = q4;
    }

    /* renamed from: a */
    private final C10529W1 m30127a() {
        C10484P4 p4 = this.f25798a;
        KProperty kProperty = f25797b[0];
        return (C10529W1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final long mo65292a(long j) {
        long b = ((C10536X1) m30127a()).mo65397b();
        return Duration.m35143compareToLRDsOJo(b, j) > 0 ? Duration.m35179minusLRDsOJo(b, j) : Duration.Companion.m35246getZEROUwyO8pc();
    }
}
