package com.ogury.p377ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.gh */
public final class C10053gh {
    /* renamed from: a */
    public static final boolean m29193a(Context context, String str) {
        C10263mq.m29882b(context, "<this>");
        C10263mq.m29882b(str, "permission");
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
