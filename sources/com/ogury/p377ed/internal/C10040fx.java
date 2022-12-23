package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.ed.internal.fx */
public final class C10040fx {

    /* renamed from: a */
    public static final C10041a f25260a = new C10041a((byte) 0);

    /* renamed from: b */
    private final Context f25261b;

    public C10040fx(Context context) {
        C10263mq.m29882b(context, "context");
        this.f25261b = context;
    }

    /* renamed from: com.ogury.ed.internal.fx$a */
    public static final class C10041a {
        public /* synthetic */ C10041a(byte b) {
            this();
        }

        private C10041a() {
        }
    }

    /* renamed from: a */
    public final OguryAaid mo64731a() {
        OguryAaid aaid = InternalCore.getAaid(this.f25261b);
        C10263mq.m29879a((Object) aaid, "getAaid(context)");
        return aaid;
    }

    /* renamed from: b */
    public final int mo64732b() {
        return InternalCore.getSdkType(this.f25261b);
    }

    /* renamed from: c */
    public final String mo64733c() {
        String token = InternalCore.getToken(this.f25261b, "consent_token");
        C10263mq.m29879a((Object) token, "getToken(context, \"consent_token\")");
        return token;
    }

    /* renamed from: d */
    public final String mo64734d() {
        String token = InternalCore.getToken(this.f25261b, "instance_token");
        C10263mq.m29879a((Object) token, "getToken(context, \"instance_token\")");
        return token;
    }
}
