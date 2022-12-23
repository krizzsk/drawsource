package com.bytedance.sdk.openadsdk.core.p143a;

import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.a */
/* compiled from: AdCallBackAdapter */
public class C3334a implements C3516n.C3517a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3516n.C3517a f7995a;

    public C3334a(C3516n.C3517a aVar) {
        this.f7995a = aVar;
    }

    /* renamed from: a */
    public void mo18456a(int i, String str) {
        C3516n.C3517a aVar = this.f7995a;
        if (aVar != null) {
            aVar.mo18456a(i, str);
        }
    }

    /* renamed from: a */
    public void mo18457a(final C3402a aVar, final C3403b bVar) {
        if (this.f7995a == null) {
            return;
        }
        if (C2361a.m5461b()) {
            this.f7995a.mo18457a(aVar, bVar);
        } else {
            C3502k.m10922d().post(new Runnable() {
                public void run() {
                    C3334a.this.f7995a.mo18457a(aVar, bVar);
                }
            });
        }
    }
}
