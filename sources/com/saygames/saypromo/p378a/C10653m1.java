package com.saygames.saypromo.p378a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.saygames.saypromo.a.m1 */
final class C10653m1 extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C10653m1 f26262a = new C10653m1();

    C10653m1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(!Intrinsics.areEqual((Object) (String) obj, (Object) ".nomedia"));
    }
}
