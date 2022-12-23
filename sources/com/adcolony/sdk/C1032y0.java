package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.y0 */
class C1032y0 extends Button {

    /* renamed from: a */
    private int f902a;

    /* renamed from: b */
    private int f903b;

    /* renamed from: c */
    private int f904c;

    /* renamed from: d */
    private int f905d;

    /* renamed from: e */
    private int f906e;

    /* renamed from: f */
    private int f907f;

    /* renamed from: g */
    private int f908g;

    /* renamed from: h */
    private int f909h;

    /* renamed from: i */
    private int f910i;

    /* renamed from: j */
    private int f911j;

    /* renamed from: k */
    private String f912k;

    /* renamed from: l */
    private String f913l;

    /* renamed from: m */
    private String f914m;

    /* renamed from: n */
    private String f915n;

    /* renamed from: o */
    private C0761c f916o;

    /* renamed from: p */
    private C0850h0 f917p;

    /* renamed from: com.adcolony.sdk.y0$a */
    class C1033a implements C0865j0 {
        C1033a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11197a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$b */
    class C1034b implements C0865j0 {
        C1034b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11207k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$c */
    class C1035c implements C0865j0 {
        C1035c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11201e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$d */
    class C1036d implements C0865j0 {
        C1036d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11202f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$e */
    class C1037e implements C0865j0 {
        C1037e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11200d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$f */
    class C1038f implements C0865j0 {
        C1038f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11206j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$g */
    class C1039g implements C0865j0 {
        C1039g() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11203g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$h */
    class C1040h implements C0865j0 {
        C1040h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11204h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$i */
    class C1041i implements C0865j0 {
        C1041i() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11198b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$j */
    class C1042j implements C0865j0 {
        C1042j() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C1032y0.this.mo11199c(h0Var)) {
                C1032y0.this.mo11205i(h0Var);
            }
        }
    }

    C1032y0(Context context, C0850h0 h0Var, int i, C0761c cVar) {
        super(context);
        this.f902a = i;
        this.f917p = h0Var;
        this.f916o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11195a(boolean z, int i) {
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
    public void mo11197a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f910i = C0773c0.m389d(a, "x");
        this.f911j = C0773c0.m389d(a, "y");
        setGravity(mo11195a(true, this.f910i) | mo11195a(false, this.f911j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11198b(C0850h0 h0Var) {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "text", getText().toString());
        h0Var.mo10835a(b).mo10838c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11199c(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        return C0773c0.m389d(a, "id") == this.f902a && C0773c0.m389d(a, "container_id") == this.f916o.mo10634c() && C0773c0.m393h(a, "ad_session_id").equals(this.f916o.mo10625a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11200d(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "background_color");
        this.f912k = h;
        setBackgroundColor(C1047z0.m1272f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11201e(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f903b = C0773c0.m389d(a, "x");
        this.f904c = C0773c0.m389d(a, "y");
        this.f905d = C0773c0.m389d(a, "width");
        this.f906e = C0773c0.m389d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f903b, this.f904c, 0, 0);
        layoutParams.width = this.f905d;
        layoutParams.height = this.f906e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11202f(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "font_color");
        this.f913l = h;
        setTextColor(C1047z0.m1272f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11203g(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), ViewHierarchyConstants.TEXT_SIZE);
        this.f909h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11204h(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "font_style");
        this.f907f = d;
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
    public void mo11205i(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "text");
        this.f914m = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11206j(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "font_family");
        this.f908g = d;
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
    public void mo11207k(C0850h0 h0Var) {
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
        C0773c0.m383b(b2, "view_id", this.f902a);
        C0773c0.m376a(b2, "ad_session_id", this.f915n);
        C0773c0.m383b(b2, "container_x", this.f903b + x);
        C0773c0.m383b(b2, "container_y", this.f904c + y);
        C0773c0.m383b(b2, "view_x", x);
        C0773c0.m383b(b2, "view_y", y);
        C0773c0.m383b(b2, "id", this.f916o.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f916o.mo10660p()) {
                    b.mo10879a(c.mo10720d().get(this.f915n));
                }
                if (x <= 0 || x >= getWidth() || i <= 0 || i >= getHeight()) {
                    new C0850h0("AdContainer.on_touch_cancelled", this.f916o.mo10653k(), b2).mo10838c();
                } else {
                    new C0850h0("AdContainer.on_touch_ended", this.f916o.mo10653k(), b2).mo10838c();
                }
            } else if (action == 2) {
                new C0850h0("AdContainer.on_touch_moved", this.f916o.mo10653k(), b2).mo10838c();
            } else if (action == 3) {
                new C0850h0("AdContainer.on_touch_cancelled", this.f916o.mo10653k(), b2).mo10838c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f903b);
                C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f904c);
                C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action2));
                C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C0850h0("AdContainer.on_touch_began", this.f916o.mo10653k(), b2).mo10838c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f903b);
                C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f904c);
                C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action3));
                C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f916o.mo10660p()) {
                    b.mo10879a(c.mo10720d().get(this.f915n));
                }
                if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                    new C0850h0("AdContainer.on_touch_cancelled", this.f916o.mo10653k(), b2).mo10838c();
                } else {
                    new C0850h0("AdContainer.on_touch_ended", this.f916o.mo10653k(), b2).mo10838c();
                }
            }
        } else {
            new C0850h0("AdContainer.on_touch_began", this.f916o.mo10653k(), b2).mo10838c();
        }
        return true;
    }

    C1032y0(Context context, int i, C0850h0 h0Var, int i2, C0761c cVar) {
        super(context, (AttributeSet) null, i);
        this.f902a = i2;
        this.f917p = h0Var;
        this.f916o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11196a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        C0832f1 a = this.f917p.mo10834a();
        this.f915n = C0773c0.m393h(a, "ad_session_id");
        this.f903b = C0773c0.m389d(a, "x");
        this.f904c = C0773c0.m389d(a, "y");
        this.f905d = C0773c0.m389d(a, "width");
        this.f906e = C0773c0.m389d(a, "height");
        this.f908g = C0773c0.m389d(a, "font_family");
        this.f907f = C0773c0.m389d(a, "font_style");
        this.f909h = C0773c0.m389d(a, ViewHierarchyConstants.TEXT_SIZE);
        this.f912k = C0773c0.m393h(a, "background_color");
        this.f913l = C0773c0.m393h(a, "font_color");
        this.f914m = C0773c0.m393h(a, "text");
        this.f910i = C0773c0.m389d(a, "align_x");
        this.f911j = C0773c0.m389d(a, "align_y");
        C0866k b = C0723a.m193b();
        if (this.f914m.equals("")) {
            this.f914m = "Learn More";
        }
        setVisibility(4);
        if (C0773c0.m382b(a, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f905d, this.f906e);
        }
        layoutParams.gravity = 0;
        setText(this.f914m);
        setTextSize((float) this.f909h);
        if (C0773c0.m382b(a, "overlay")) {
            this.f903b = 0;
            this.f904c = 0;
            i2 = (int) (b.mo10905n().mo11058s() * 6.0f);
            i = (int) (b.mo10905n().mo11058s() * 6.0f);
            int s = (int) (b.mo10905n().mo11058s() * 4.0f);
            setPadding(s, s, s, s);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f903b, this.f904c, i2, i);
        this.f916o.addView(this, layoutParams);
        int i3 = this.f908g;
        if (i3 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i3 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i3 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i3 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i4 = this.f907f;
        if (i4 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i4 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i4 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i4 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(mo11195a(true, this.f910i) | mo11195a(false, this.f911j));
        if (!this.f912k.equals("")) {
            setBackgroundColor(C1047z0.m1272f(this.f912k));
        }
        if (!this.f913l.equals("")) {
            setTextColor(C1047z0.m1272f(this.f913l));
        }
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_visible", (C0865j0) new C1034b(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_bounds", (C0865j0) new C1035c(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_font_color", (C0865j0) new C1036d(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_background_color", (C0865j0) new C1037e(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_typeface", (C0865j0) new C1038f(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_font_size", (C0865j0) new C1039g(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_font_style", (C0865j0) new C1040h(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.get_text", (C0865j0) new C1041i(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.set_text", (C0865j0) new C1042j(), true));
        this.f916o.mo10649i().add(C0723a.m187a("TextView.align", (C0865j0) new C1033a(), true));
        this.f916o.mo10651j().add("TextView.set_visible");
        this.f916o.mo10651j().add("TextView.set_bounds");
        this.f916o.mo10651j().add("TextView.set_font_color");
        this.f916o.mo10651j().add("TextView.set_background_color");
        this.f916o.mo10651j().add("TextView.set_typeface");
        this.f916o.mo10651j().add("TextView.set_font_size");
        this.f916o.mo10651j().add("TextView.set_font_style");
        this.f916o.mo10651j().add("TextView.get_text");
        this.f916o.mo10651j().add("TextView.set_text");
        this.f916o.mo10651j().add("TextView.align");
    }
}
