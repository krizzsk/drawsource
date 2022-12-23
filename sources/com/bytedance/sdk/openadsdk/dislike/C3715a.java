package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.a */
/* compiled from: DislikeDispatcher */
public class C3715a {

    /* renamed from: a */
    private static volatile C3715a f9633a;

    /* renamed from: b */
    private final C3516n<C3060a> f9634b = C3513m.m10971f();

    private C3715a() {
    }

    /* renamed from: a */
    public static C3715a m12154a() {
        if (f9633a == null) {
            synchronized (C3715a.class) {
                if (f9633a == null) {
                    f9633a = new C3715a();
                }
            }
        }
        return f9633a;
    }

    /* renamed from: a */
    public void mo20492a(C3431n nVar, List<FilterWord> list) {
        this.f9634b.mo19984a(nVar, list);
    }
}
