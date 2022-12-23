package com.saygames.saypromo.p378a;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.saygames.saypromo.a.V */
final class C10520V extends Lambda implements Function1 {

    /* renamed from: a */
    final /* synthetic */ C10548Z f26002a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10520V(C10548Z z) {
        super(1);
        this.f26002a = z;
    }

    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        View e = this.f26002a.f26036h;
        ViewGroup viewGroup = null;
        if (e == null) {
            e = null;
        }
        e.setAlpha(floatValue);
        ViewGroup d = this.f26002a.f26040l;
        if (d != null) {
            viewGroup = d;
        }
        viewGroup.setAlpha(floatValue);
        return Unit.INSTANCE;
    }
}
