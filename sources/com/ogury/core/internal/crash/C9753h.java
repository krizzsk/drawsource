package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.crash.C9760l;

/* renamed from: com.ogury.core.internal.crash.h */
/* compiled from: CrashReportFacadeFactory.kt */
public final class C9753h {
    /* renamed from: a */
    public static C9752g m28206a(Context context, SdkInfo sdkInfo) {
        C9717ai.m28145b(context, "context");
        C9717ai.m28145b(sdkInfo, "sdkInfo");
        C9750f fVar = new C9750f(context);
        C9748e eVar = new C9748e(sdkInfo);
        C9762m mVar = new C9762m(context);
        return new C9752g(fVar, mVar, new C9755j(context, eVar, mVar), (C9756k) null, (C9760l.C9761a) null, 24);
    }
}
