package com.bytedance.sdk.component.adexpress.p093b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.C2620c;
import com.bytedance.sdk.component.adexpress.dynamic.p096a.C2582a;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2635h;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2637i;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2642a;
import com.bytedance.sdk.component.adexpress.p093b.C2559i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* renamed from: com.bytedance.sdk.component.adexpress.b.b */
/* compiled from: DynamicRenderInterceptor */
public class C2550b implements C2559i {

    /* renamed from: a */
    private Context f5392a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2582a f5393b;

    /* renamed from: c */
    private ThemeStatusBroadcastReceiver f5394c;

    /* renamed from: d */
    private C2557g f5395d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2563l f5396e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f5397f;

    /* renamed from: b */
    public void mo16635b() {
    }

    /* renamed from: c */
    public void mo16636c() {
    }

    public C2550b(Context context, C2563l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2637i iVar, C2557g gVar, C2642a aVar) {
        this.f5392a = context;
        this.f5396e = lVar;
        this.f5394c = themeStatusBroadcastReceiver;
        this.f5395d = gVar;
        C2582a aVar2 = new C2582a(this.f5392a, this.f5394c, z, iVar, this.f5396e, aVar);
        this.f5393b = aVar2;
        aVar2.mo16792a(this.f5395d);
        if (iVar instanceof C2635h) {
            this.f5397f = 3;
        } else {
            this.f5397f = 2;
        }
    }

    /* renamed from: a */
    public boolean mo16634a(final C2559i.C2560a aVar) {
        this.f5396e.mo16673c().mo16650b(this.f5397f);
        this.f5393b.mo16641a((C2556f) new C2556f() {
            /* renamed from: a */
            public void mo16639a(View view, C2565m mVar) {
                if (!aVar.mo16668c()) {
                    C2550b.this.f5396e.mo16673c().mo16658f(C2550b.this.f5397f);
                    C2550b.this.f5396e.mo16673c().mo16660g(C2550b.this.f5397f);
                    C2550b.this.f5396e.mo16673c().mo16661h();
                    C2566n b = aVar.mo16666b();
                    if (b != null) {
                        b.mo16730a(C2550b.this.f5393b, mVar);
                        aVar.mo16665a(true);
                    }
                }
            }

            /* renamed from: a */
            public void mo16638a(int i) {
                C2550b.this.f5396e.mo16673c().mo16647a(C2550b.this.f5397f, i, aVar.mo16667b(C2550b.this));
                if (aVar.mo16667b(C2550b.this)) {
                    aVar.mo16663a((C2559i) C2550b.this);
                    return;
                }
                C2566n b = aVar.mo16666b();
                if (b != null) {
                    b.mo16731a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo16633a() {
        C2582a aVar = this.f5393b;
        if (aVar != null) {
            aVar.mo16793b();
        }
    }

    /* renamed from: d */
    public C2620c mo16637d() {
        C2582a aVar = this.f5393b;
        if (aVar != null) {
            return aVar.mo16794d();
        }
        return null;
    }
}
