package com.ogury.p376cm.internal;

import android.content.Context;
import java.io.Closeable;

/* renamed from: com.ogury.cm.internal.baccc */
public final class baccc {

    /* renamed from: a */
    private boolean f24524a;

    /* renamed from: a */
    public static final void m28039a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            bbabc.m28052b(th, "receiver$0");
            bbabc.m28052b(th2, "exception");
            bacca.f24523a.mo63999a(th, th2);
        }
    }

    /* renamed from: a */
    public final void mo64000a(Context context) {
        bbabc.m28052b(context, "context");
        boolean z = false;
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0) {
            z = true;
        }
        this.f24524a = z;
    }
}
