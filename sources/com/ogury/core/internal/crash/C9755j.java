package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.crash.C9744c;

/* renamed from: com.ogury.core.internal.crash.j */
/* compiled from: CrashSerializerFactory.kt */
public final class C9755j {

    /* renamed from: a */
    private final Context f24648a;

    /* renamed from: b */
    private final C9748e f24649b;

    /* renamed from: c */
    private final C9762m f24650c;

    public C9755j(Context context, C9748e eVar, C9762m mVar) {
        C9717ai.m28145b(context, "context");
        C9717ai.m28145b(eVar, "crashFormatter");
        C9717ai.m28145b(mVar, "fileStore");
        this.f24648a = context;
        this.f24649b = eVar;
        this.f24650c = mVar;
    }

    /* renamed from: a */
    public final C9744c mo64112a(Throwable th) {
        C9717ai.m28145b(th, "throwable");
        return new C9744c(new C9744c.C9745a(this.f24648a, this.f24649b, this.f24650c, th), (byte) 0);
    }
}
