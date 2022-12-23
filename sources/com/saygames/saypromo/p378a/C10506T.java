package com.saygames.saypromo.p378a;

import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.saygames.saypromo.a.T */
final class C10506T extends Lambda implements Function1 {

    /* renamed from: a */
    final /* synthetic */ C10548Z f25975a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10506T(C10548Z z) {
        super(1);
        this.f25975a = z;
    }

    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        View e = this.f25975a.f26036h;
        TextView textView = null;
        if (e == null) {
            e = null;
        }
        e.setAlpha((floatValue + 1.0f) * 0.5f);
        TextView f = this.f25975a.f26034f;
        if (f != null) {
            textView = f;
        }
        textView.setAlpha(1.0f - floatValue);
        return Unit.INSTANCE;
    }
}
