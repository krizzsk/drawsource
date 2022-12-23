package com.bytedance.sdk.component.adexpress.dynamic.p096a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2655c;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2616f;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2635h;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2637i;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2642a;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2643b;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2556f;
import com.bytedance.sdk.component.adexpress.p093b.C2557g;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2905l;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a */
/* compiled from: DynamicRender */
public class C2582a implements C2553d<DynamicRootView>, C2561j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public DynamicRootView f5508a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2637i f5509b;

    /* renamed from: c */
    private Context f5510c;

    /* renamed from: d */
    private C2556f f5511d;

    /* renamed from: e */
    private C2557g f5512e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2563l f5513f;

    /* renamed from: g */
    private ScheduledFuture<?> f5514g;

    /* renamed from: h */
    private AtomicBoolean f5515h = new AtomicBoolean(false);

    public C2582a(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2637i iVar, C2563l lVar, C2642a aVar) {
        this.f5510c = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, lVar, aVar);
        this.f5508a = dynamicRootView;
        this.f5509b = iVar;
        this.f5513f = lVar;
        dynamicRootView.setRenderListener(this);
        this.f5513f = lVar;
    }

    /* renamed from: a */
    public void mo16641a(C2556f fVar) {
        this.f5511d = fVar;
        int d = this.f5513f.mo16674d();
        if (d < 0) {
            this.f5508a.mo17182a(this.f5509b instanceof C2635h ? 127 : 117);
            return;
        }
        this.f5514g = C2882e.m8045d().schedule(new C2587a(2), (long) d, TimeUnit.MILLISECONDS);
        C2898h.m8094b().postDelayed(new Runnable() {
            public void run() {
                C2582a.this.m6685f();
            }
        }, this.f5513f.mo16680j());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m6685f() {
        this.f5513f.mo16673c().mo16652c(mo16632c());
        if (!C2533a.m6369a(this.f5513f.mo16671a())) {
            this.f5508a.mo17182a(this.f5509b instanceof C2635h ? 123 : 113);
            return;
        }
        this.f5509b.mo17120a((C2643b) new C2643b() {
            /* renamed from: a */
            public void mo16796a(final C2618h hVar) {
                C2582a.this.m6687h();
                C2582a.this.f5513f.mo16673c().mo16654d(C2582a.this.mo16632c());
                C2582a.this.m6676a(hVar);
                C2582a.this.m6679b(hVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C2582a.this.m6682c(hVar);
                    }
                });
                C2582a.this.f5508a.setBgColor(hVar.mo17060a());
            }
        });
        this.f5509b.mo17119a(this.f5513f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6676a(C2618h hVar) {
        List<C2618h> j;
        if (hVar != null && (j = hVar.mo17083j()) != null && j.size() > 0) {
            Collections.sort(j, new Comparator<C2618h>() {
                /* renamed from: a */
                public int compare(C2618h hVar, C2618h hVar2) {
                    C2616f e = hVar.mo17082i().mo16882e();
                    C2616f e2 = hVar2.mo17082i().mo16882e();
                    if (e == null || e2 == null) {
                        return 0;
                    }
                    return e.mo16910Z() >= e2.mo16910Z() ? 1 : -1;
                }
            });
            for (C2618h next : j) {
                if (next != null) {
                    m6676a(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6679b(C2618h hVar) {
        if (hVar != null) {
            List<C2618h> j = hVar.mo17083j();
            if (j != null && j.size() > 0) {
                for (C2618h b : j) {
                    m6679b(b);
                }
            }
            C2618h k = hVar.mo17084k();
            if (k != null) {
                hVar.mo17072c(hVar.mo17075e() - k.mo17075e());
                hVar.mo17074d(hVar.mo17077f() - k.mo17077f());
            }
        }
    }

    /* renamed from: a */
    public DynamicRootView mo16642e() {
        return mo16794d();
    }

    /* renamed from: b */
    public void mo16793b() {
        m6673a((View) mo16642e());
    }

    /* renamed from: a */
    private void m6673a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m6673a(viewGroup.getChildAt(i));
                    i++;
                }
            }
            if (view instanceof C2655c) {
                ((C2655c) view).mo16803b();
            }
        }
    }

    /* renamed from: c */
    public int mo16632c() {
        return this.f5509b instanceof C2635h ? 3 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6682c(C2618h hVar) {
        if (hVar == null) {
            this.f5508a.mo17182a(this.f5509b instanceof C2635h ? 123 : 113);
            return;
        }
        this.f5513f.mo16673c().mo16656e(mo16632c());
        try {
            this.f5508a.mo17183a(hVar, mo16632c());
        } catch (Exception unused) {
            this.f5508a.mo17182a(this.f5509b instanceof C2635h ? 128 : 118);
        }
    }

    /* renamed from: d */
    public DynamicRootView mo16794d() {
        return this.f5508a;
    }

    /* renamed from: a */
    public void mo16792a(C2557g gVar) {
        this.f5512e = gVar;
    }

    /* renamed from: g */
    private boolean m6686g() {
        DynamicRootView dynamicRootView = this.f5508a;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo16670a(C2565m mVar) {
        if (!this.f5515h.get()) {
            this.f5515h.set(true);
            if (!mVar.mo16708a() || !m6686g()) {
                this.f5511d.mo16638a(mVar.mo16725h());
                return;
            }
            this.f5508a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f5511d.mo16639a(mo16642e(), mVar);
        }
    }

    /* renamed from: a */
    public void mo16669a(View view, int i, C2548b bVar) {
        C2557g gVar = this.f5512e;
        if (gVar != null) {
            gVar.mo16644a(view, i, bVar);
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a$a */
    /* compiled from: DynamicRender */
    private class C2587a implements Runnable {

        /* renamed from: b */
        private int f5522b;

        public C2587a(int i) {
            this.f5522b = i;
        }

        public void run() {
            if (this.f5522b == 2) {
                C2905l.m8111b("DynamicRender", "Dynamic parse time out");
                C2582a.this.f5508a.mo17182a(C2582a.this.f5509b instanceof C2635h ? 127 : 117);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m6687h() {
        try {
            if (this.f5514g != null && !this.f5514g.isCancelled()) {
                this.f5514g.cancel(false);
                this.f5514g = null;
            }
            C2905l.m8111b("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
