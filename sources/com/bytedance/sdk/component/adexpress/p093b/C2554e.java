package com.bytedance.sdk.component.adexpress.p093b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p093b.C2559i;

/* renamed from: com.bytedance.sdk.component.adexpress.b.e */
/* compiled from: NativeRenderInterceptor */
public class C2554e implements C2559i {

    /* renamed from: a */
    private Context f5400a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2549a f5401b;

    /* renamed from: c */
    private C2563l f5402c;

    /* renamed from: a */
    public void mo16633a() {
    }

    /* renamed from: b */
    public void mo16635b() {
    }

    /* renamed from: c */
    public void mo16636c() {
    }

    public C2554e(Context context, C2563l lVar, C2549a aVar) {
        this.f5400a = context;
        this.f5401b = aVar;
        this.f5402c = lVar;
    }

    /* renamed from: a */
    public boolean mo16634a(final C2559i.C2560a aVar) {
        this.f5402c.mo16673c().mo16653d();
        this.f5401b.mo16641a(new C2556f() {
            /* renamed from: a */
            public void mo16639a(View view, C2565m mVar) {
                if (!aVar.mo16668c()) {
                    C2566n b = aVar.mo16666b();
                    if (b != null) {
                        b.mo16730a(C2554e.this.f5401b, mVar);
                    }
                    aVar.mo16665a(true);
                }
            }

            /* renamed from: a */
            public void mo16638a(int i) {
                C2566n b = aVar.mo16666b();
                if (b != null) {
                    b.mo16731a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo16643a(C2552c cVar) {
        this.f5401b.mo16631a(cVar);
    }
}
