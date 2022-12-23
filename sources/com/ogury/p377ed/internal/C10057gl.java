package com.ogury.p377ed.internal;

import android.os.Looper;
import com.ogury.core.internal.network.OguryNetworkException;

/* renamed from: com.ogury.ed.internal.gl */
public final class C10057gl {
    /* renamed from: a */
    public static final void m29202a(Throwable th) {
        C10263mq.m29882b(th, "<this>");
    }

    /* renamed from: b */
    public static final boolean m29203b(Throwable th) {
        C10263mq.m29882b(th, "<this>");
        return (th instanceof OguryNetworkException) || (th instanceof C9997eq);
    }

    /* renamed from: a */
    public static final void m29201a(String str) {
        C10263mq.m29882b(str, "methodName");
        if (C10263mq.m29881a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            m29202a((Throwable) new IllegalStateException(C10263mq.m29874a(str, (Object) " cannot be called from the main thread")));
        }
    }
}
