package com.ogury.p377ed.internal;

import android.content.Context;
import com.iab.omid.library.oguryco.Omid;

/* renamed from: com.ogury.ed.internal.jp */
public final class C10166jp {

    /* renamed from: a */
    public static final C10166jp f25530a = new C10166jp();

    private C10166jp() {
    }

    /* renamed from: a */
    public static void m29726a(Context context) {
        C10263mq.m29882b(context, "context");
        try {
            Omid.activate(context.getApplicationContext());
        } catch (IllegalArgumentException e) {
            C10165jo joVar = C10165jo.f25528a;
            C10165jo.m29725a(e);
        }
    }

    /* renamed from: a */
    public static boolean m29727a() {
        return Omid.isActive();
    }

    /* renamed from: b */
    public static C10167jq m29728b() {
        return new C10167jq();
    }
}
