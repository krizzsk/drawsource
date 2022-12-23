package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ogury.p377ed.internal.C9918cw;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ax */
public final class C9843ax implements C10327q {

    /* renamed from: a */
    public static final C9844a f24823a = new C9844a((byte) 0);

    /* renamed from: b */
    private final ViewGroup f24824b;

    /* renamed from: c */
    private final C9852bc f24825c;

    /* renamed from: d */
    private final C9851bb f24826d;

    /* renamed from: e */
    private final C9848az f24827e;

    /* renamed from: f */
    private C9910cq f24828f;

    /* renamed from: g */
    private C10328r f24829g;

    /* renamed from: h */
    private C9850ba f24830h;

    private C9843ax(ViewGroup viewGroup, C9852bc bcVar, C9851bb bbVar, C9848az azVar) {
        C10263mq.m29882b(viewGroup, "adContainer");
        C10263mq.m29882b(bcVar, "webViewHelper");
        C10263mq.m29882b(bbVar, "overlapCalculator");
        C10263mq.m29882b(azVar, "viewHierarchy");
        this.f24824b = viewGroup;
        this.f24825c = bcVar;
        this.f24826d = bbVar;
        this.f24827e = azVar;
        this.f24828f = new C9910cq();
        this.f24830h = new C9850ba(this.f24824b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9843ax(android.view.ViewGroup r4) {
        /*
            r3 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bb r1 = new com.ogury.ed.internal.bb
            r1.<init>(r0)
            com.ogury.ed.internal.az r2 = new com.ogury.ed.internal.az
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9843ax.<init>(android.view.ViewGroup):void");
    }

    /* renamed from: c */
    private C10328r m28415c() {
        return this.f24829g;
    }

    /* renamed from: a */
    public final void mo64287a(C10328r rVar) {
        this.f24829g = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ax$a */
    public static final class C9844a {
        public /* synthetic */ C9844a(byte b) {
            this();
        }

        private C9844a() {
        }
    }

    /* renamed from: a */
    public final void mo64286a() {
        this.f24828f.mo64446a();
        int childCount = this.f24824b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f24824b.getChildAt(i);
                if ((childAt instanceof C10158jh) && ((C10158jh) childAt).getContainsMraid()) {
                    C9918cw.C9919a aVar = C9918cw.f24963a;
                    this.f24828f.mo64447a(C9918cw.C9919a.m28640a(new C9845b(this, childAt)).mo64451b(new C9846c(this, childAt)));
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$b */
    static final class C9845b extends C10264mr implements C10227lj<C10074gy> {

        /* renamed from: a */
        final /* synthetic */ C9843ax f24831a;

        /* renamed from: b */
        final /* synthetic */ View f24832b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9845b(C9843ax axVar, View view) {
            super(0);
            this.f24831a = axVar;
            this.f24832b = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10074gy mo64355a() {
            C9843ax axVar = this.f24831a;
            View view = this.f24832b;
            C10263mq.m29879a((Object) view, "child");
            return axVar.m28412a((C10158jh) view);
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$c */
    static final class C9846c extends C10264mr implements C10228lk<C10074gy, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9843ax f24833a;

        /* renamed from: b */
        final /* synthetic */ View f24834b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9846c(C9843ax axVar, View view) {
            super(1);
            this.f24833a = axVar;
            this.f24834b = view;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28421a((C10074gy) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28421a(C10074gy gyVar) {
            C10263mq.m29882b(gyVar, "it");
            C9843ax axVar = this.f24833a;
            View view = this.f24834b;
            C10263mq.m29879a((Object) view, "child");
            axVar.m28414a((C10158jh) view, gyVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28414a(C10158jh jhVar, C10074gy gyVar) {
        if (jhVar.mo64984h()) {
            this.f24830h.mo64369a(gyVar);
            jhVar.getMraidCommandExecutor().mo64803a(gyVar);
            C10328r c = m28415c();
            if (c != null) {
                c.mo64291a(gyVar.mo64798c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10074gy m28412a(C10158jh jhVar) {
        C10074gy gyVar = new C10074gy();
        View rootView = this.f24824b.getRootView();
        if (rootView != null) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            Rect a = C9852bc.m28439a(jhVar);
            Rect b = C9852bc.m28440b(this.f24824b);
            a.bottom = a.top + jhVar.getMeasuredHeight();
            a.right = a.left + jhVar.getMeasuredWidth();
            if (!a.intersect(b)) {
                return gyVar;
            }
            List<Rect> a2 = C9851bb.m28437a((List<? extends View>) this.f24827e.mo64367a(viewGroup, (WebView) jhVar), a);
            int a3 = C9851bb.m28435a(a, a2);
            int measuredWidth = jhVar.getMeasuredWidth() * jhVar.getMeasuredHeight();
            int a4 = measuredWidth - C9847ay.m28423a(a);
            boolean z = false;
            if (a4 < 0) {
                a4 = 0;
            }
            float f = (float) measuredWidth;
            if (measuredWidth != 0) {
                gyVar.mo64794a(100.0f - ((((float) (a3 + a4)) * 100.0f) / f));
            } else {
                gyVar.mo64794a(0.0f);
            }
            if (gyVar.mo64798c() == 0.0f) {
                z = true;
            }
            if (!z) {
                C9847ay.m28426a(a2, b);
                C9847ay.m28425a(a, b);
                gyVar.mo64796a(a2);
                gyVar.mo64795a(a);
            }
            return gyVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    public final void mo64288b() {
        mo64287a((C10328r) null);
        this.f24828f.mo64446a();
    }
}
