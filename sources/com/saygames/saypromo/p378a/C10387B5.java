package com.saygames.saypromo.p378a;

import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.B5 */
public abstract class C10387B5 {
    /* renamed from: a */
    public static final String m30071a(Throwable th) {
        return m30072a(new StringBuilder(), true, th).toString();
    }

    /* renamed from: a */
    private static final StringBuilder m30072a(StringBuilder sb, boolean z, Throwable th) {
        if (th == null) {
            return sb;
        }
        if (!z) {
            sb.append(" | ");
        }
        sb.append(StringsKt.substringAfterLast$default(th.getClass().getName(), ".", (String) null, 2, (Object) null));
        if (C10485P5.m30223b(th.getMessage()) != null) {
            StringsKt.append(sb, ": ", th.getMessage());
        }
        return m30072a(sb, false, th.getCause());
    }

    /* renamed from: b */
    public static final void m30073b(Throwable th) {
        if (th instanceof CancellationException) {
            throw th;
        }
    }
}
