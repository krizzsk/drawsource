package com.saygames.saypromo.p378a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.l1 */
final class C10645l1 extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C10645l1 f26255a = new C10645l1();

    C10645l1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        boolean z = false;
        if (Intrinsics.areEqual((Object) str, (Object) "SayPromoAdsTest.txt") || StringsKt.startsWith$default(str, "SPCache", false, 2, (Object) null)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
