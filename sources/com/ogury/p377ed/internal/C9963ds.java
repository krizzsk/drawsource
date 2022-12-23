package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.network.HeadersLoader;

/* renamed from: com.ogury.ed.internal.ds */
public final class C9963ds {

    /* renamed from: a */
    public static final C9964a f25051a = new C9964a((byte) 0);

    /* renamed from: b */
    private final C9976dy f25052b;

    /* renamed from: c */
    private final C9958dn f25053c;

    /* renamed from: d */
    private final C9966du f25054d;

    /* renamed from: e */
    private final C9977dz f25055e;

    public C9963ds(Context context, C9961dq dqVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(dqVar, "configurableRequestFieldPermission");
        this.f25052b = new C9976dy(context);
        this.f25053c = new C9958dn(context, dqVar);
        this.f25054d = new C9966du(context, dqVar);
        this.f25055e = new C9977dz(context, dqVar);
    }

    /* renamed from: com.ogury.ed.internal.ds$a */
    public static final class C9964a {
        public /* synthetic */ C9964a(byte b) {
            this();
        }

        private C9964a() {
        }

        /* renamed from: a */
        public static C9963ds m28761a(Context context, C9961dq dqVar) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(dqVar, "configurableRequestFieldPermission");
            Context applicationContext = context.getApplicationContext();
            C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
            return new C9963ds(applicationContext, dqVar);
        }
    }

    /* renamed from: a */
    public final HeadersLoader mo64481a() {
        return this.f25052b;
    }

    /* renamed from: b */
    public final HeadersLoader mo64482b() {
        return this.f25053c;
    }

    /* renamed from: c */
    public final HeadersLoader mo64483c() {
        return this.f25054d;
    }

    /* renamed from: d */
    public final HeadersLoader mo64484d() {
        return this.f25055e;
    }
}
