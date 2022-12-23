package com.ogury.p377ed.internal;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.iz */
public final class C10146iz {

    /* renamed from: a */
    public static final C10147a f25479a = new C10147a((byte) 0);

    /* renamed from: b */
    private boolean f25480b;

    /* renamed from: c */
    private int f25481c;

    /* renamed from: d */
    private int f25482d;

    /* renamed from: e */
    private int f25483e;

    /* renamed from: f */
    private int f25484f;

    /* renamed from: g */
    private int f25485g;

    /* renamed from: a */
    public static /* synthetic */ C10146iz m29640a(C10146iz izVar, boolean z, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            z = izVar.f25480b;
        }
        if ((i5 & 2) != 0) {
            i = izVar.f25481c;
        }
        if ((i5 & 4) != 0) {
            i2 = izVar.f25482d;
        }
        if ((i5 & 8) != 0) {
            i3 = izVar.f25483e;
        }
        if ((i5 & 16) != 0) {
            i4 = izVar.f25484f;
        }
        return m29641a(z, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static C10146iz m29641a(boolean z, int i, int i2, int i3, int i4) {
        return new C10146iz(z, i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10146iz)) {
            return false;
        }
        C10146iz izVar = (C10146iz) obj;
        return this.f25480b == izVar.f25480b && this.f25481c == izVar.f25481c && this.f25482d == izVar.f25482d && this.f25483e == izVar.f25483e && this.f25484f == izVar.f25484f;
    }

    public final int hashCode() {
        boolean z = this.f25480b;
        if (z) {
            z = true;
        }
        return ((((((((z ? 1 : 0) * true) + Integer.hashCode(this.f25481c)) * 31) + Integer.hashCode(this.f25482d)) * 31) + Integer.hashCode(this.f25483e)) * 31) + Integer.hashCode(this.f25484f);
    }

    public final String toString() {
        return "ResizeProps(allowOffscreen=" + this.f25480b + ", width=" + this.f25481c + ", height=" + this.f25482d + ", offsetX=" + this.f25483e + ", offsetY=" + this.f25484f + ')';
    }

    public C10146iz(boolean z, int i, int i2, int i3, int i4) {
        this.f25480b = z;
        this.f25481c = i;
        this.f25482d = i2;
        this.f25483e = i3;
        this.f25484f = i4;
    }

    /* renamed from: a */
    public final void mo64945a(boolean z) {
        this.f25480b = z;
    }

    /* renamed from: a */
    public final boolean mo64946a() {
        return this.f25480b;
    }

    /* renamed from: a */
    public final void mo64944a(int i) {
        this.f25481c = i;
    }

    /* renamed from: b */
    public final int mo64947b() {
        return this.f25481c;
    }

    /* renamed from: b */
    public final void mo64948b(int i) {
        this.f25482d = i;
    }

    /* renamed from: c */
    public final int mo64949c() {
        return this.f25482d;
    }

    /* renamed from: c */
    public final void mo64950c(int i) {
        this.f25483e = i;
    }

    /* renamed from: d */
    public final int mo64951d() {
        return this.f25483e;
    }

    /* renamed from: d */
    public final void mo64952d(int i) {
        this.f25484f = i;
    }

    /* renamed from: e */
    public final int mo64953e() {
        return this.f25484f;
    }

    /* renamed from: e */
    public final void mo64954e(int i) {
        this.f25485g = i;
    }

    /* renamed from: f */
    public final int mo64956f() {
        return this.f25485g;
    }

    public C10146iz() {
        this(false, 0, 0, 0, 0);
    }

    /* renamed from: g */
    public final Rect mo64957g() {
        int i = this.f25483e;
        int i2 = this.f25484f;
        return new Rect(i, i2, this.f25481c + i, this.f25482d + i2);
    }

    /* renamed from: com.ogury.ed.internal.iz$a */
    public static final class C10147a {
        public /* synthetic */ C10147a(byte b) {
            this();
        }

        private C10147a() {
        }

        /* renamed from: a */
        public static C10146iz m29657a(Map<String, String> map) {
            C10263mq.m29882b(map, "params");
            C10146iz izVar = new C10146iz();
            String str = map.get("allowOffscreen");
            izVar.mo64945a(str == null ? true : Boolean.parseBoolean(str));
            try {
                izVar.mo64944a(C10054gi.m29196b(C10052gg.m29192a(map, "width")));
                izVar.mo64948b(C10054gi.m29196b(C10052gg.m29192a(map, "height")));
                izVar.mo64950c(C10054gi.m29196b(C10052gg.m29192a(map, "offsetX")));
                izVar.mo64952d(C10054gi.m29196b(C10052gg.m29192a(map, "offsetY")));
                return izVar;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static C10146iz m29656a(Rect rect) {
            C10263mq.m29882b(rect, "rect");
            return m29655a(rect.left, rect.top, rect.width(), rect.height());
        }

        /* renamed from: a */
        private static C10146iz m29655a(int i, int i2, int i3, int i4) {
            C10146iz izVar = new C10146iz();
            izVar.mo64945a(false);
            izVar.mo64950c(i);
            izVar.mo64952d(i2);
            izVar.mo64944a(i3);
            izVar.mo64948b(i4);
            return izVar;
        }
    }
}
