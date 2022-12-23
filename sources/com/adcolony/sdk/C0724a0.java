package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;

/* renamed from: com.adcolony.sdk.a0 */
class C0724a0 extends ImageView {

    /* renamed from: a */
    private int f209a;

    /* renamed from: b */
    private int f210b;

    /* renamed from: c */
    private int f211c;

    /* renamed from: d */
    private int f212d;

    /* renamed from: e */
    private int f213e;

    /* renamed from: f */
    private boolean f214f;

    /* renamed from: g */
    private boolean f215g;

    /* renamed from: h */
    private boolean f216h;

    /* renamed from: i */
    private String f217i;

    /* renamed from: j */
    private String f218j;

    /* renamed from: k */
    private C0850h0 f219k;

    /* renamed from: l */
    private C0761c f220l;

    /* renamed from: com.adcolony.sdk.a0$a */
    class C0725a implements C0865j0 {
        C0725a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0724a0.this.m200a(h0Var)) {
                C0724a0.this.m206d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$b */
    class C0726b implements C0865j0 {
        C0726b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0724a0.this.m200a(h0Var)) {
                C0724a0.this.m202b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$c */
    class C0727c implements C0865j0 {
        C0727c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0724a0.this.m200a(h0Var)) {
                C0724a0.this.m204c(h0Var);
            }
        }
    }

    C0724a0(Context context, C0850h0 h0Var, int i, C0761c cVar) {
        super(context);
        this.f209a = i;
        this.f219k = h0Var;
        this.f220l = cVar;
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
        C0773c0.m383b(b2, "view_id", this.f209a);
        C0773c0.m376a(b2, "ad_session_id", this.f218j);
        C0773c0.m383b(b2, "container_x", this.f210b + x);
        C0773c0.m383b(b2, "container_y", this.f211c + y);
        C0773c0.m383b(b2, "view_x", x);
        C0773c0.m383b(b2, "view_y", y);
        C0773c0.m383b(b2, "id", this.f220l.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f220l.mo10660p()) {
                    b.mo10879a(c.mo10720d().get(this.f218j));
                }
                if (x <= 0 || x >= this.f212d || i <= 0 || i >= this.f213e) {
                    new C0850h0("AdContainer.on_touch_cancelled", this.f220l.mo10653k(), b2).mo10838c();
                } else {
                    new C0850h0("AdContainer.on_touch_ended", this.f220l.mo10653k(), b2).mo10838c();
                }
            } else if (action == 2) {
                new C0850h0("AdContainer.on_touch_moved", this.f220l.mo10653k(), b2).mo10838c();
            } else if (action == 3) {
                new C0850h0("AdContainer.on_touch_cancelled", this.f220l.mo10653k(), b2).mo10838c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f210b);
                C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f211c);
                C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action2));
                C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C0850h0("AdContainer.on_touch_began", this.f220l.mo10653k(), b2).mo10838c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f210b);
                C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f211c);
                C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action3));
                C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f220l.mo10660p()) {
                    b.mo10879a(c.mo10720d().get(this.f218j));
                }
                if (x2 <= 0 || x2 >= this.f212d || y2 <= 0 || y2 >= this.f213e) {
                    new C0850h0("AdContainer.on_touch_cancelled", this.f220l.mo10653k(), b2).mo10838c();
                } else {
                    new C0850h0("AdContainer.on_touch_ended", this.f220l.mo10653k(), b2).mo10838c();
                }
            }
        } else {
            new C0850h0("AdContainer.on_touch_began", this.f220l.mo10653k(), b2).mo10838c();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m200a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        return C0773c0.m389d(a, "id") == this.f209a && C0773c0.m389d(a, "container_id") == this.f220l.mo10634c() && C0773c0.m393h(a, "ad_session_id").equals(this.f220l.mo10625a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m202b(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f210b = C0773c0.m389d(a, "x");
        this.f211c = C0773c0.m389d(a, "y");
        this.f212d = C0773c0.m389d(a, "width");
        this.f213e = C0773c0.m389d(a, "height");
        if (this.f214f) {
            float s = (((float) this.f213e) * C0723a.m193b().mo10905n().mo11058s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f213e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f212d = intrinsicWidth;
            this.f210b -= intrinsicWidth;
            this.f211c -= this.f213e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f210b, this.f211c, 0, 0);
        layoutParams.width = this.f212d;
        layoutParams.height = this.f213e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m204c(C0850h0 h0Var) {
        this.f217i = C0773c0.m393h(h0Var.mo10834a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f217i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m206d(C0850h0 h0Var) {
        if (C0773c0.m382b(h0Var.mo10834a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10529a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C0832f1 a = this.f219k.mo10834a();
        this.f218j = C0773c0.m393h(a, "ad_session_id");
        this.f210b = C0773c0.m389d(a, "x");
        this.f211c = C0773c0.m389d(a, "y");
        this.f212d = C0773c0.m389d(a, "width");
        this.f213e = C0773c0.m389d(a, "height");
        this.f217i = C0773c0.m393h(a, "filepath");
        this.f214f = C0773c0.m382b(a, "dpi");
        this.f215g = C0773c0.m382b(a, "invert_y");
        this.f216h = C0773c0.m382b(a, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f217i)));
        if (this.f214f) {
            float s = (((float) this.f213e) * C0723a.m193b().mo10905n().mo11058s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f213e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f212d = intrinsicWidth;
            this.f210b -= intrinsicWidth;
            if (this.f215g) {
                i = this.f211c + this.f213e;
            } else {
                i = this.f211c - this.f213e;
            }
            this.f211c = i;
        }
        setVisibility(4);
        if (this.f216h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f212d, this.f213e);
        }
        layoutParams.setMargins(this.f210b, this.f211c, 0, 0);
        layoutParams.gravity = 0;
        this.f220l.addView(this, layoutParams);
        this.f220l.mo10649i().add(C0723a.m187a("ImageView.set_visible", (C0865j0) new C0725a(), true));
        this.f220l.mo10649i().add(C0723a.m187a("ImageView.set_bounds", (C0865j0) new C0726b(), true));
        this.f220l.mo10649i().add(C0723a.m187a("ImageView.set_image", (C0865j0) new C0727c(), true));
        this.f220l.mo10651j().add("ImageView.set_visible");
        this.f220l.mo10651j().add("ImageView.set_bounds");
        this.f220l.mo10651j().add("ImageView.set_image");
    }
}
