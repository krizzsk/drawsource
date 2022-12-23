package com.ogury.p377ed.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ogury.p377ed.internal.C10326p;
import java.util.Calendar;

/* renamed from: com.ogury.ed.internal.o */
public final class C10303o<T extends ViewGroup & C10326p> implements C10273n {

    /* renamed from: a */
    public static final C10304a f25629a = new C10304a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C10273n f25630f = new C10305b();

    /* renamed from: b */
    private final T f25631b;

    /* renamed from: c */
    private float f25632c;

    /* renamed from: d */
    private float f25633d;

    /* renamed from: e */
    private long f25634e;

    public C10303o(T t) {
        C10263mq.m29882b(t, "adLayout");
        this.f25631b = t;
    }

    /* renamed from: com.ogury.ed.internal.o$a */
    public static final class C10304a {
        public /* synthetic */ C10304a(byte b) {
            this();
        }

        private C10304a() {
        }

        /* renamed from: a */
        public static C10273n m29936a() {
            return C10303o.f25630f;
        }

        /* renamed from: a */
        public static C10273n m29937a(C10044g gVar, boolean z) {
            C10263mq.m29882b(gVar, "adLayout");
            if (z) {
                return new C10303o(gVar);
            }
            return m29936a();
        }
    }

    /* renamed from: com.ogury.ed.internal.o$b */
    public static final class C10305b implements C10273n {
        /* renamed from: a */
        public final boolean mo65147a(MotionEvent motionEvent) {
            C10263mq.m29882b(motionEvent, "ev");
            return false;
        }

        C10305b() {
        }
    }

    /* renamed from: a */
    public final boolean mo65147a(MotionEvent motionEvent) {
        C10263mq.m29882b(motionEvent, "ev");
        if (m29931b(motionEvent)) {
            return false;
        }
        m29929b();
        return true;
    }

    /* renamed from: b */
    private final boolean m29931b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25634e = Calendar.getInstance().getTimeInMillis();
        } else if (action == 1) {
            ((C10326p) this.f25631b).mo64738b();
            if (Calendar.getInstance().getTimeInMillis() - this.f25634e < 200) {
                return true;
            }
            return false;
        }
        m29932c(motionEvent);
        return true;
    }

    /* renamed from: c */
    private final void m29932c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m29933d(motionEvent);
        } else if (action == 2) {
            m29934e(motionEvent);
        }
    }

    /* renamed from: d */
    private final void m29933d(MotionEvent motionEvent) {
        this.f25632c = this.f25631b.getX() - motionEvent.getRawX();
        this.f25633d = this.f25631b.getY() - motionEvent.getRawY();
    }

    /* renamed from: e */
    private final void m29934e(MotionEvent motionEvent) {
        this.f25631b.bringToFront();
        if (m29928a(motionEvent.getRawX() + this.f25632c + ((float) (this.f25631b.getWidth() / 4)))) {
            this.f25631b.setX(motionEvent.getRawX() + this.f25632c);
        }
        if (m29930b(motionEvent.getRawY() + this.f25633d + ((float) (this.f25631b.getHeight() / 4)))) {
            this.f25631b.setY(motionEvent.getRawY() + this.f25633d);
        }
    }

    /* renamed from: a */
    private final boolean m29928a(float f) {
        return f > 0.0f && f + ((float) (this.f25631b.getWidth() / 2)) < ((float) ((C10326p) this.f25631b).getContainerWidth());
    }

    /* renamed from: b */
    private final boolean m29930b(float f) {
        return f > 0.0f && f + ((float) (this.f25631b.getHeight() / 2)) < ((float) ((C10326p) this.f25631b).getContainerHeight());
    }

    /* renamed from: b */
    private final void m29929b() {
        int childCount = this.f25631b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f25631b.getChildAt(i);
                if (childAt instanceof C10158jh) {
                    ((C10158jh) childAt).mo64974f();
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
