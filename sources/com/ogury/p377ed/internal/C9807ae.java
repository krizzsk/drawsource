package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: com.ogury.ed.internal.ae */
public final class C9807ae implements C10327q {

    /* renamed from: a */
    public static final C9809a f24719a = new C9809a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ViewGroup f24720b;

    /* renamed from: c */
    private final C9852bc f24721c;

    /* renamed from: d */
    private C10328r f24722d;

    /* renamed from: e */
    private C9850ba f24723e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f24724f;

    /* renamed from: g */
    private final View f24725g;

    private C9807ae(ViewGroup viewGroup, C9852bc bcVar) {
        C10263mq.m29882b(viewGroup, "adContainer");
        C10263mq.m29882b(bcVar, "rectHelper");
        this.f24720b = viewGroup;
        this.f24721c = bcVar;
        this.f24723e = new C9850ba(this.f24720b);
        this.f24724f = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                C9807ae.m28268c(C9807ae.this);
            }
        };
        this.f24720b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C9807ae f24726a;

            {
                this.f24726a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f24726a.f24720b.getViewTreeObserver().removeOnScrollChangedListener(this.f24726a.f24724f);
            }

            public final void onViewAttachedToWindow(View view) {
                ViewTreeObserver viewTreeObserver = this.f24726a.f24720b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f24726a.f24724f);
                }
            }
        });
        this.f24725g = this.f24720b.getRootView();
    }

    public /* synthetic */ C9807ae(ViewGroup viewGroup) {
        this(viewGroup, new C9852bc());
    }

    /* renamed from: c */
    private C10328r m28267c() {
        return this.f24722d;
    }

    /* renamed from: a */
    public final void mo64287a(C10328r rVar) {
        this.f24722d = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ae$a */
    public static final class C9809a {
        public /* synthetic */ C9809a(byte b) {
            this();
        }

        private C9809a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m28268c(C9807ae aeVar) {
        C10263mq.m29882b(aeVar, "this$0");
        aeVar.mo64286a();
    }

    /* renamed from: a */
    private final int m28263a(Rect rect) {
        Rect rect2 = new Rect();
        this.f24725g.getHitRect(rect2);
        if (!this.f24720b.getLocalVisibleRect(rect2) || this.f24720b.getWindowToken() == null) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* renamed from: d */
    private final C10074gy m28269d() {
        C10074gy gyVar = new C10074gy();
        Rect a = C9852bc.m28439a(this.f24720b);
        int measuredWidth = this.f24720b.getMeasuredWidth() * this.f24720b.getMeasuredHeight();
        if (measuredWidth != 0) {
            gyVar.mo64794a(100.0f - ((((float) (measuredWidth - m28263a(a))) * 100.0f) / ((float) measuredWidth)));
        }
        if (gyVar.mo64798c() == 0.0f) {
            gyVar.mo64795a((Rect) null);
        } else {
            gyVar.mo64795a(a);
        }
        return gyVar;
    }

    /* renamed from: a */
    public final void mo64286a() {
        int childCount = this.f24720b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f24720b.getChildAt(i);
                if (childAt instanceof C10158jh) {
                    C10158jh jhVar = (C10158jh) childAt;
                    if (jhVar.getContainsMraid()) {
                        m28265a(jhVar, m28269d());
                    }
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28265a(C10158jh jhVar, C10074gy gyVar) {
        if (jhVar.mo64984h()) {
            this.f24723e.mo64369a(gyVar);
            jhVar.getMraidCommandExecutor().mo64803a(gyVar);
            C10328r c = m28267c();
            if (c != null) {
                c.mo64291a(gyVar.mo64798c());
            }
        }
    }

    /* renamed from: b */
    public final void mo64288b() {
        mo64287a((C10328r) null);
    }
}
