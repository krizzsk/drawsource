package com.tapjoy.internal;

import android.app.Dialog;
import android.content.Context;

/* renamed from: com.tapjoy.internal.c */
public final class C11320c extends Dialog {

    /* renamed from: a */
    private boolean f27011a = false;

    public C11320c(Context context) {
        super(context, 16973835);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(17170445);
    }

    public final void show() {
        this.f27011a = false;
        super.show();
    }

    public final void cancel() {
        this.f27011a = true;
        super.cancel();
    }

    /* renamed from: a */
    public final void mo69765a() {
        getWindow().setLayout(-1, -1);
    }
}
