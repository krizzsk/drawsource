package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.C9770d;
import com.ogury.core.internal.aaid.C9708e;
import com.ogury.core.internal.aaid.OguryAaid;

/* compiled from: InternalCore.kt */
public final class InternalCore {
    public static final InternalCore INSTANCE = new InternalCore();

    public static final String getVersion() {
        return "1.1.0";
    }

    private InternalCore() {
    }

    public static final void setSdkType(Context context, int i) {
        C9717ai.m28145b(context, "context");
        C9770d.C9771a aVar = C9770d.f24675a;
        C9770d.C9771a.m28232a(context).mo64127a(i);
    }

    public static final int getSdkType(Context context) {
        C9717ai.m28145b(context, "context");
        C9770d.C9771a aVar = C9770d.f24675a;
        return C9770d.C9771a.m28232a(context).mo64126a();
    }

    public static final OguryAaid getAaid(Context context) {
        C9717ai.m28145b(context, "context");
        return C9708e.f24595a.mo64057a(context);
    }

    public static final int getFrameworkValue() {
        return new C9739c((C9774f) null, 1).mo64074a();
    }

    public static final String getFrameworkName() {
        return new C9739c((C9774f) null, 1).mo64075b();
    }

    public static final String getToken(Context context, String str) {
        C9717ai.m28145b(context, "context");
        C9717ai.m28145b(str, "keyName");
        return new C9772e(context).mo64128a(str);
    }
}
