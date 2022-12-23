package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C3438f;

/* renamed from: com.bytedance.sdk.openadsdk.core.e */
/* compiled from: DBAdapter */
public class C3401e extends C3438f {

    /* renamed from: a */
    private static volatile C3401e f8191a;

    private C3401e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C3401e m10122a(Context context) {
        Class<C3401e> cls = C3401e.class;
        if (f8191a == null) {
            synchronized (cls) {
                if (f8191a == null) {
                    f8191a = new C3401e(context);
                }
            }
        }
        return f8191a;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C3438f.C3442c mo19380a() {
        return super.mo19380a();
    }
}
