package com.saygames.saypromo.p378a;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.saygames.saypromo.a.u1 */
public final class C10714u1 implements C10707t1 {
    C10714u1() {
    }

    /* renamed from: a */
    public final C10700s1 mo65544a(boolean z, int i) {
        if (i > 0 && z) {
            Duration.Companion companion = Duration.Companion;
            return new C10677p1(DurationKt.toDuration(i, DurationUnit.SECONDS), 0);
        } else if (i <= 0) {
            return new C10685q1();
        } else {
            Duration.Companion companion2 = Duration.Companion;
            return new C10693r1(DurationKt.toDuration(i, DurationUnit.SECONDS), 0);
        }
    }
}
