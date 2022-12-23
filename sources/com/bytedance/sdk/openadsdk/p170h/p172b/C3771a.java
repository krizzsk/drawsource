package com.bytedance.sdk.openadsdk.p170h.p172b;

import com.bytedance.sdk.component.p123f.C2879c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.p123f.p124a.C2877a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p170h.C3753b;

/* renamed from: com.bytedance.sdk.openadsdk.h.b.a */
/* compiled from: ReportThreadLogServiceImp */
public class C3771a implements C2879c {
    /* renamed from: a */
    public void mo17790a(final C2877a aVar) {
        if (C3513m.m10973h().mo19829F() && aVar != null && aVar.mo17784a() != null) {
            C2882e.m8036a(new C2885g("ReportThreadLogServiceImp") {
                public void run() {
                    C3753b.m12287a().mo20573a("stats_sdk_thread_num", aVar.mo17784a());
                }
            }, 5);
        }
    }
}
