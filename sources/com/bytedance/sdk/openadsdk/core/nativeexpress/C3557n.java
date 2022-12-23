package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.p144b.C3366f;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n */
/* compiled from: ViewGestureDetector */
public class C3557n extends GestureDetector {

    /* renamed from: a */
    private final C3558a f8964a;

    /* renamed from: b */
    private final C3366f f8965b;

    public C3557n(Context context) {
        this(context, new C3558a());
    }

    public C3557n(Context context, C3558a aVar) {
        super(context, aVar);
        this.f8964a = aVar;
        this.f8965b = new C3366f();
        setIsLongpressEnabled(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20100a() {
        this.f8964a.mo20103a();
    }

    /* renamed from: b */
    public boolean mo20101b() {
        return this.f8964a.mo20104b();
    }

    /* renamed from: a */
    public C3409g mo20099a(Context context, View view, View view2) {
        if (this.f8965b == null) {
            return new C3409g.C3411a().mo19428a();
        }
        return new C3409g.C3411a().mo19441f(this.f8965b.f8093a).mo19439e(this.f8965b.f8094b).mo19436d(this.f8965b.f8095c).mo19433c(this.f8965b.f8096d).mo19431b(this.f8965b.f8097e).mo19423a(this.f8965b.f8098f).mo19432b(C3904y.m12867a(view)).mo19427a(C3904y.m12867a(view2)).mo19435c(C3904y.m12880c(view)).mo19438d(C3904y.m12880c(view2)).mo19437d(this.f8965b.f8099g).mo19440e(this.f8965b.f8100h).mo19442f(this.f8965b.f8101i).mo19424a(this.f8965b.f8103l).mo19430b(C3457h.m10580d().mo19752b() ? 1 : 2).mo19425a("vessel").mo19421a(C3904y.m12885e(context)).mo19434c(C3904y.m12890g(context)).mo19429b(C3904y.m12888f(context)).mo19428a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8965b.mo19326a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.n$a */
    /* compiled from: ViewGestureDetector */
    static class C3558a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f8966a = false;

        C3558a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20103a() {
            this.f8966a = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20104b() {
            return this.f8966a;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f8966a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
