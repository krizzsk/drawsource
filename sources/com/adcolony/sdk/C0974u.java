package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.u */
class C0974u extends EditText {

    /* renamed from: a */
    private int f803a;

    /* renamed from: b */
    private int f804b;

    /* renamed from: c */
    private int f805c;

    /* renamed from: d */
    private int f806d;

    /* renamed from: e */
    private int f807e;

    /* renamed from: f */
    private int f808f;

    /* renamed from: g */
    private int f809g;

    /* renamed from: h */
    private int f810h;

    /* renamed from: i */
    private int f811i;

    /* renamed from: j */
    private int f812j;

    /* renamed from: k */
    private String f813k;

    /* renamed from: l */
    private String f814l;

    /* renamed from: m */
    private String f815m;

    /* renamed from: n */
    private String f816n;

    /* renamed from: o */
    private C0761c f817o;

    /* renamed from: p */
    private C0850h0 f818p;

    /* renamed from: com.adcolony.sdk.u$a */
    class C0975a implements C0865j0 {
        C0975a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11128a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$b */
    class C0976b implements C0865j0 {
        C0976b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11138k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$c */
    class C0977c implements C0865j0 {
        C0977c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11132e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$d */
    class C0978d implements C0865j0 {
        C0978d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11133f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$e */
    class C0979e implements C0865j0 {
        C0979e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11131d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$f */
    class C0980f implements C0865j0 {
        C0980f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11137j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$g */
    class C0981g implements C0865j0 {
        C0981g() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11134g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$h */
    class C0982h implements C0865j0 {
        C0982h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11135h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$i */
    class C0983i implements C0865j0 {
        C0983i() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11129b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$j */
    class C0984j implements C0865j0 {
        C0984j() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0974u.this.mo11130c(h0Var)) {
                C0974u.this.mo11136i(h0Var);
            }
        }
    }

    C0974u(Context context, C0850h0 h0Var, int i, C0761c cVar) {
        super(context);
        this.f803a = i;
        this.f818p = h0Var;
        this.f817o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11126a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i != 1) {
            if (i != 2) {
                return 17;
            }
            if (z) {
                return GravityCompat.END;
            }
            return 80;
        } else if (z) {
            return GravityCompat.START;
        } else {
            return 48;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11128a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f811i = C0773c0.m389d(a, "x");
        this.f812j = C0773c0.m389d(a, "y");
        setGravity(mo11126a(true, this.f811i) | mo11126a(false, this.f812j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11129b(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "text", getText().toString());
        h0Var.mo10835a(b).mo10838c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11130c(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        return C0773c0.m389d(a, "id") == this.f803a && C0773c0.m389d(a, "container_id") == this.f817o.mo10634c() && C0773c0.m393h(a, "ad_session_id").equals(this.f817o.mo10625a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11131d(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "background_color");
        this.f814l = h;
        setBackgroundColor(C1047z0.m1272f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11132e(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f804b = C0773c0.m389d(a, "x");
        this.f805c = C0773c0.m389d(a, "y");
        this.f806d = C0773c0.m389d(a, "width");
        this.f807e = C0773c0.m389d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f804b, this.f805c, 0, 0);
        layoutParams.width = this.f806d;
        layoutParams.height = this.f807e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11133f(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "font_color");
        this.f815m = h;
        setTextColor(C1047z0.m1272f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11134g(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), ViewHierarchyConstants.TEXT_SIZE);
        this.f810h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11135h(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "font_style");
        this.f808f = d;
        if (d == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo11136i(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "text");
        this.f816n = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11137j(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "font_family");
        this.f809g = d;
        if (d == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11138k(C0850h0 h0Var) {
        if (C0773c0.m382b(h0Var.mo10834a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0866k b = C0723a.m193b();
        C0790d c = b.mo10889c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m383b(b2, "view_id", this.f803a);
        C0773c0.m376a(b2, "ad_session_id", this.f813k);
        C0773c0.m383b(b2, "container_x", this.f804b + x);
        C0773c0.m383b(b2, "container_y", this.f805c + y);
        C0773c0.m383b(b2, "view_x", x);
        C0773c0.m383b(b2, "view_y", y);
        C0773c0.m383b(b2, "id", this.f817o.mo10634c());
        if (action == 0) {
            new C0850h0("AdContainer.on_touch_began", this.f817o.mo10653k(), b2).mo10838c();
        } else if (action == 1) {
            if (!this.f817o.mo10660p()) {
                b.mo10879a(c.mo10720d().get(this.f813k));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f817o.mo10653k(), b2).mo10838c();
        } else if (action == 2) {
            new C0850h0("AdContainer.on_touch_moved", this.f817o.mo10653k(), b2).mo10838c();
        } else if (action == 3) {
            new C0850h0("AdContainer.on_touch_cancelled", this.f817o.mo10653k(), b2).mo10838c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f804b);
            C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f805c);
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0850h0("AdContainer.on_touch_began", this.f817o.mo10653k(), b2).mo10838c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f804b);
            C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f805c);
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f817o.mo10660p()) {
                b.mo10879a(c.mo10720d().get(this.f813k));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f817o.mo10653k(), b2).mo10838c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11127a() {
        C0832f1 a = this.f818p.mo10834a();
        this.f813k = C0773c0.m393h(a, "ad_session_id");
        this.f804b = C0773c0.m389d(a, "x");
        this.f805c = C0773c0.m389d(a, "y");
        this.f806d = C0773c0.m389d(a, "width");
        this.f807e = C0773c0.m389d(a, "height");
        this.f809g = C0773c0.m389d(a, "font_family");
        this.f808f = C0773c0.m389d(a, "font_style");
        this.f810h = C0773c0.m389d(a, ViewHierarchyConstants.TEXT_SIZE);
        this.f814l = C0773c0.m393h(a, "background_color");
        this.f815m = C0773c0.m393h(a, "font_color");
        this.f816n = C0773c0.m393h(a, "text");
        this.f811i = C0773c0.m389d(a, "align_x");
        this.f812j = C0773c0.m389d(a, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f806d, this.f807e);
        layoutParams.setMargins(this.f804b, this.f805c, 0, 0);
        layoutParams.gravity = 0;
        this.f817o.addView(this, layoutParams);
        int i = this.f809g;
        if (i == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i2 = this.f808f;
        if (i2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i2 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f816n);
        setTextSize((float) this.f810h);
        setGravity(mo11126a(true, this.f811i) | mo11126a(false, this.f812j));
        if (!this.f814l.equals("")) {
            setBackgroundColor(C1047z0.m1272f(this.f814l));
        }
        if (!this.f815m.equals("")) {
            setTextColor(C1047z0.m1272f(this.f815m));
        }
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_visible", (C0865j0) new C0976b(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_bounds", (C0865j0) new C0977c(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_font_color", (C0865j0) new C0978d(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_background_color", (C0865j0) new C0979e(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_typeface", (C0865j0) new C0980f(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_font_size", (C0865j0) new C0981g(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_font_style", (C0865j0) new C0982h(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.get_text", (C0865j0) new C0983i(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.set_text", (C0865j0) new C0984j(), true));
        this.f817o.mo10649i().add(C0723a.m187a("TextView.align", (C0865j0) new C0975a(), true));
        this.f817o.mo10651j().add("TextView.set_visible");
        this.f817o.mo10651j().add("TextView.set_bounds");
        this.f817o.mo10651j().add("TextView.set_font_color");
        this.f817o.mo10651j().add("TextView.set_background_color");
        this.f817o.mo10651j().add("TextView.set_typeface");
        this.f817o.mo10651j().add("TextView.set_font_size");
        this.f817o.mo10651j().add("TextView.set_font_style");
        this.f817o.mo10651j().add("TextView.get_text");
        this.f817o.mo10651j().add("TextView.set_text");
        this.f817o.mo10651j().add("TextView.align");
    }
}
