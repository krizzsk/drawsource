package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hy */
abstract class C11591hy implements C11537gv {

    /* renamed from: a */
    private static final String[] f27874a;

    C11591hy() {
    }

    static {
        String[] strArr = {"reward", FirebaseAnalytics.Event.PURCHASE, "custom_action"};
        f27874a = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final void mo70082a(C11538gw gwVar) {
        if (this instanceof C11541gz) {
            C11541gz gzVar = (C11541gz) this;
            gwVar.mo69161a(gzVar.mo70083a(), gzVar.mo70084b());
        } else if (this instanceof C11543ha) {
            C11543ha haVar = (C11543ha) this;
            gwVar.mo69162a(haVar.mo70085a(), haVar.mo70086b(), haVar.mo70087c(), haVar.mo70088d());
        }
    }

    /* renamed from: a */
    public static boolean m31774a(String str) {
        return Arrays.binarySearch(f27874a, str) >= 0;
    }

    @Nullable
    /* renamed from: a */
    public static C11591hy m31773a(String str, C11296bh bhVar) {
        if ("reward".equals(str)) {
            return (C11591hy) bhVar.mo69707a(C11612ii.f27928a);
        }
        if (FirebaseAnalytics.Event.PURCHASE.equals(str)) {
            return (C11591hy) bhVar.mo69707a(C11608ig.f27919a);
        }
        return null;
    }
}
