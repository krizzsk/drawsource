package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0826e0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.adcolony.sdk.c */
class C0761c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C0728a1> f333a;

    /* renamed from: b */
    private HashMap<Integer, C1032y0> f334b;

    /* renamed from: c */
    private HashMap<Integer, C0742b1> f335c;

    /* renamed from: d */
    private HashMap<Integer, C0974u> f336d;

    /* renamed from: e */
    private HashMap<Integer, C0724a0> f337e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f338f;

    /* renamed from: g */
    private HashMap<Integer, View> f339g;

    /* renamed from: h */
    private int f340h;

    /* renamed from: i */
    private int f341i;

    /* renamed from: j */
    private int f342j;

    /* renamed from: k */
    private int f343k;

    /* renamed from: l */
    private String f344l;

    /* renamed from: m */
    boolean f345m;

    /* renamed from: n */
    boolean f346n;

    /* renamed from: o */
    private float f347o = 0.0f;

    /* renamed from: p */
    private double f348p = 0.0d;

    /* renamed from: q */
    private int f349q = 0;

    /* renamed from: r */
    private int f350r = 0;

    /* renamed from: s */
    private ArrayList<C0865j0> f351s;

    /* renamed from: t */
    private ArrayList<String> f352t;

    /* renamed from: u */
    private boolean f353u;

    /* renamed from: v */
    private boolean f354v;

    /* renamed from: w */
    private boolean f355w;

    /* renamed from: x */
    private AdSession f356x;

    /* renamed from: y */
    Context f357y;

    /* renamed from: z */
    VideoView f358z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C0762a implements C0865j0 {
        C0762a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c cVar = C0761c.this;
                cVar.mo10628a((View) cVar.mo10635c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C0763b implements C0865j0 {
        C0763b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c.this.mo10646g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C0764c implements C0865j0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        class C0765a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f362a;

            C0765a(C0850h0 h0Var) {
                this.f362a = h0Var;
            }

            public void run() {
                C0761c cVar = C0761c.this;
                cVar.mo10628a((View) cVar.mo10638d(this.f362a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0764c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C1047z0.m1259b((Runnable) new C0765a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C0766d implements C0865j0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C0767a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f365a;

            C0767a(C0850h0 h0Var) {
                this.f365a = h0Var;
            }

            public void run() {
                C0761c.this.mo10648h(this.f365a);
            }
        }

        C0766d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C1047z0.m1259b((Runnable) new C0767a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C0768e implements C0865j0 {
        C0768e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c cVar = C0761c.this;
                cVar.mo10628a(cVar.mo10632b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C0769f implements C0865j0 {
        C0769f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c.this.mo10644f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C0770g implements C0865j0 {
        C0770g() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c cVar = C0761c.this;
                cVar.mo10628a((View) cVar.mo10624a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C0771h implements C0865j0 {
        C0771h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0761c.this.mo10650i(h0Var)) {
                C0761c.this.mo10642e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C0772i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f371a;

        C0772i(boolean z) {
            this.f371a = z;
        }

        public void run() {
            C0761c cVar = C0761c.this;
            if (!cVar.f345m) {
                cVar.m316a(this.f371a);
                C0761c.this.m318b(this.f371a);
            }
        }
    }

    C0761c(Context context, String str) {
        super(context);
        this.f357y = context;
        this.f344l = str;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0728a1 mo10635c(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        C0728a1 a1Var = new C0728a1(this.f357y, h0Var, d, this);
        a1Var.mo10535d();
        this.f333a.put(Integer.valueOf(d), a1Var);
        this.f339g.put(Integer.valueOf(d), a1Var);
        return a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0742b1 mo10638d(C0850h0 h0Var) {
        C0742b1 b1Var;
        C0832f1 a = h0Var.mo10834a();
        int d = C0773c0.m389d(a, "id");
        boolean b = C0773c0.m382b(a, "is_module");
        C0866k b2 = C0723a.m193b();
        if (b) {
            b1Var = b2.mo10864B().get(Integer.valueOf(C0773c0.m389d(a, "module_id")));
            if (b1Var == null) {
                new C0826e0.C0827a().mo10746a("Module WebView created with invalid id").mo10747a(C0826e0.f461h);
                return null;
            }
            b1Var.mo10567b(h0Var, d, this);
        } else {
            try {
                b1Var = C0742b1.m281a(this.f357y, h0Var, d, this);
            } catch (RuntimeException e) {
                C0826e0.C0827a aVar = new C0826e0.C0827a();
                aVar.mo10746a(e.toString() + ": during WebView initialization.").mo10746a(" Disabling AdColony.").mo10747a(C0826e0.f461h);
                AdColony.disable();
                return null;
            }
        }
        this.f335c.put(Integer.valueOf(d), b1Var);
        this.f339g.put(Integer.valueOf(d), b1Var);
        C0832f1 b3 = C0773c0.m379b();
        C0773c0.m383b(b3, "module_id", b1Var.getWebViewModuleId());
        if (b1Var instanceof C0907l0) {
            C0773c0.m383b(b3, "mraid_module_id", ((C0907l0) b1Var).getAdcModuleId());
        }
        h0Var.mo10835a(b3).mo10838c();
        return b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10642e(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        View remove = this.f339g.remove(Integer.valueOf(d));
        C0724a0 remove2 = this.f337e.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0790d c = C0723a.m193b().mo10889c();
            String b = h0Var.mo10836b();
            c.mo10714a(b, "" + d);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10644f(C0850h0 h0Var) {
        TextView textView;
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        View remove = this.f339g.remove(Integer.valueOf(d));
        if (this.f338f.remove(Integer.valueOf(d)).booleanValue()) {
            textView = this.f336d.remove(Integer.valueOf(d));
        } else {
            textView = this.f334b.remove(Integer.valueOf(d));
        }
        if (remove == null || textView == null) {
            C0790d c = C0723a.m193b().mo10889c();
            String b = h0Var.mo10836b();
            c.mo10714a(b, "" + d);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo10646g(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        View remove = this.f339g.remove(Integer.valueOf(d));
        C0728a1 remove2 = this.f333a.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0790d c = C0723a.m193b().mo10889c();
            String b = h0Var.mo10836b();
            c.mo10714a(b, "" + d);
            return false;
        }
        if (remove2.mo10534c()) {
            remove2.mo10540j();
        }
        remove2.mo10532a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10648h(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        C0866k b = C0723a.m193b();
        View remove = this.f339g.remove(Integer.valueOf(d));
        C0742b1 remove2 = this.f335c.remove(Integer.valueOf(d));
        if (remove2 == null || remove == null) {
            C0790d c = b.mo10889c();
            String b2 = h0Var.mo10836b();
            c.mo10714a(b2, "" + d);
            return false;
        }
        if (remove2 instanceof C0898k0) {
            b.mo10909r().mo10848b((C0898k0) remove2);
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10650i(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        return C0773c0.m389d(a, "container_id") == this.f342j && C0773c0.m393h(a, "ad_session_id").equals(this.f344l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10652j(C0850h0 h0Var) {
        Rect rect;
        this.f333a = new HashMap<>();
        this.f334b = new HashMap<>();
        this.f335c = new HashMap<>();
        this.f336d = new HashMap<>();
        this.f337e = new HashMap<>();
        this.f338f = new HashMap<>();
        this.f339g = new HashMap<>();
        this.f351s = new ArrayList<>();
        this.f352t = new ArrayList<>();
        C0832f1 a = h0Var.mo10834a();
        if (C0773c0.m382b(a, TJAdUnitConstants.String.TRANSPARENT)) {
            setBackgroundColor(0);
        }
        this.f342j = C0773c0.m389d(a, "id");
        this.f340h = C0773c0.m389d(a, "width");
        this.f341i = C0773c0.m389d(a, "height");
        this.f343k = C0773c0.m389d(a, "module_id");
        this.f346n = C0773c0.m382b(a, "viewability_enabled");
        this.f353u = this.f342j == 1;
        C0866k b = C0723a.m193b();
        if (this.f340h == 0 && this.f341i == 0) {
            if (this.f355w) {
                rect = b.mo10905n().mo11063x();
            } else {
                rect = b.mo10905n().mo11062w();
            }
            this.f340h = rect.width();
            this.f341i = rect.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f340h, this.f341i));
        }
        this.f351s.add(C0723a.m187a("VideoView.create", (C0865j0) new C0762a(), true));
        this.f351s.add(C0723a.m187a("VideoView.destroy", (C0865j0) new C0763b(), true));
        this.f351s.add(C0723a.m187a("WebView.create", (C0865j0) new C0764c(), true));
        this.f351s.add(C0723a.m187a("WebView.destroy", (C0865j0) new C0766d(), true));
        this.f351s.add(C0723a.m187a("TextView.create", (C0865j0) new C0768e(), true));
        this.f351s.add(C0723a.m187a("TextView.destroy", (C0865j0) new C0769f(), true));
        this.f351s.add(C0723a.m187a("ImageView.create", (C0865j0) new C0770g(), true));
        this.f351s.add(C0723a.m187a("ImageView.destroy", (C0865j0) new C0771h(), true));
        this.f352t.add("VideoView.create");
        this.f352t.add("VideoView.destroy");
        this.f352t.add("WebView.create");
        this.f352t.add("WebView.destroy");
        this.f352t.add("TextView.create");
        this.f352t.add("TextView.destroy");
        this.f352t.add("ImageView.create");
        this.f352t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f357y);
        this.f358z = videoView;
        videoView.setVisibility(8);
        addView(this.f358z);
        setClipToPadding(false);
        if (this.f346n) {
            m318b(C0773c0.m382b(h0Var.mo10834a(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo10653k() {
        return this.f343k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C1032y0> mo10654l() {
        return this.f334b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C0728a1> mo10655m() {
        return this.f333a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C0742b1> mo10656n() {
        return this.f335c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo10657o() {
        return this.f354v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C0866k b = C0723a.m193b();
        C0790d c = b.mo10889c();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m383b(b2, "view_id", -1);
        C0773c0.m376a(b2, "ad_session_id", this.f344l);
        C0773c0.m383b(b2, "container_x", x);
        C0773c0.m383b(b2, "container_y", y);
        C0773c0.m383b(b2, "view_x", x);
        C0773c0.m383b(b2, "view_y", y);
        C0773c0.m383b(b2, "id", this.f342j);
        if (action == 0) {
            new C0850h0("AdContainer.on_touch_began", this.f343k, b2).mo10838c();
        } else if (action == 1) {
            if (!this.f353u) {
                b.mo10879a(c.mo10720d().get(this.f344l));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f343k, b2).mo10838c();
        } else if (action == 2) {
            new C0850h0("AdContainer.on_touch_moved", this.f343k, b2).mo10838c();
        } else if (action == 3) {
            new C0850h0("AdContainer.on_touch_cancelled", this.f343k, b2).mo10838c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", (int) motionEvent2.getX(action2));
            C0773c0.m383b(b2, "container_y", (int) motionEvent2.getY(action2));
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0850h0("AdContainer.on_touch_began", this.f343k, b2).mo10838c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", (int) motionEvent2.getX(action3));
            C0773c0.m383b(b2, "container_y", (int) motionEvent2.getY(action3));
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action3));
            C0773c0.m383b(b2, "x", (int) motionEvent2.getX(action3));
            C0773c0.m383b(b2, "y", (int) motionEvent2.getY(action3));
            if (!this.f353u) {
                b.mo10879a(c.mo10720d().get(this.f344l));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f343k, b2).mo10838c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo10660p() {
        return this.f353u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo10661q() {
        return this.f355w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0724a0 mo10624a(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "id");
        C0724a0 a0Var = new C0724a0(this.f357y, h0Var, d, this);
        a0Var.mo10529a();
        this.f337e.put(Integer.valueOf(d), a0Var);
        this.f339g.put(Integer.valueOf(d), a0Var);
        return a0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo10632b(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        int d = C0773c0.m389d(a, "id");
        if (C0773c0.m382b(a, "editable")) {
            C0974u uVar = new C0974u(this.f357y, h0Var, d, this);
            uVar.mo11127a();
            this.f336d.put(Integer.valueOf(d), uVar);
            this.f339g.put(Integer.valueOf(d), uVar);
            this.f338f.put(Integer.valueOf(d), Boolean.TRUE);
            return uVar;
        } else if (!C0773c0.m382b(a, "button")) {
            C1032y0 y0Var = new C1032y0(this.f357y, h0Var, d, this);
            y0Var.mo11196a();
            this.f334b.put(Integer.valueOf(d), y0Var);
            this.f339g.put(Integer.valueOf(d), y0Var);
            this.f338f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var;
        } else {
            C1032y0 y0Var2 = new C1032y0(this.f357y, 16974145, h0Var, d, this);
            y0Var2.mo11196a();
            this.f334b.put(Integer.valueOf(d), y0Var2);
            this.f339g.put(Integer.valueOf(d), y0Var2);
            this.f338f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C0865j0> mo10649i() {
        return this.f351s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10634c() {
        return this.f342j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m316a(boolean z) {
        C0742b1 b1Var;
        double d;
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = C0723a.m193b().mo10889c().mo10720d().get(this.f344l);
        if (adColonyAdView == null) {
            b1Var = null;
        } else {
            b1Var = adColonyAdView.getWebView();
        }
        C0742b1 b1Var2 = b1Var;
        Context a = C0723a.m186a();
        boolean z2 = true;
        float a2 = C0846g1.m616a(view, a, true, z, true, adColonyAdView != null);
        if (a == null) {
            d = 0.0d;
        } else {
            d = C1047z0.m1227a(C1047z0.m1232a(a));
        }
        int a3 = C1047z0.m1230a((View) b1Var2);
        int b = C1047z0.m1249b((View) b1Var2);
        if (a3 == this.f349q && b == this.f350r) {
            z2 = false;
        }
        if (z2) {
            this.f349q = a3;
            this.f350r = b;
            m314a(a3, b, b1Var2);
        }
        if (!(this.f347o == a2 && this.f348p == d && !z2)) {
            m313a(a2, d);
        }
        this.f347o = a2;
        this.f348p = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10636c(boolean z) {
        this.f353u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo10640e() {
        return this.f339g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10641e(boolean z) {
        this.f354v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo10645g() {
        return this.f338f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C0724a0> mo10647h() {
        return this.f337e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C0974u> mo10643f() {
        return this.f336d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m318b(boolean z) {
        C1047z0.m1244a((Runnable) new C0772i(z), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10631b() {
        return this.f341i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10633b(int i) {
        this.f340h = i;
    }

    /* renamed from: a */
    private void m314a(int i, int i2, C0742b1 b1Var) {
        float s = C0723a.m193b().mo10905n().mo11058s();
        if (b1Var != null) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m383b(b, "app_orientation", C1047z0.m1266d(C1047z0.m1273f()));
            C0773c0.m383b(b, "width", (int) (((float) b1Var.getCurrentWidth()) / s));
            C0773c0.m383b(b, "height", (int) (((float) b1Var.getCurrentHeight()) / s));
            C0773c0.m383b(b, "x", i);
            C0773c0.m383b(b, "y", i2);
            C0773c0.m376a(b, "ad_session_id", this.f344l);
            new C0850h0("MRAID.on_size_change", this.f343k, b).mo10838c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo10637d() {
        return this.f340h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10639d(boolean z) {
        this.f355w = z;
    }

    /* renamed from: a */
    private void m313a(float f, double d) {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m383b(b, "id", this.f342j);
        C0773c0.m376a(b, "ad_session_id", this.f344l);
        C0773c0.m373a(b, "exposure", (double) f);
        C0773c0.m373a(b, TapjoyConstants.TJC_VOLUME, d);
        new C0850h0("AdContainer.on_exposure_change", this.f343k, b).mo10838c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10625a() {
        return this.f344l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10626a(int i) {
        this.f341i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10629a(AdSession adSession) {
        this.f356x = adSession;
        mo10630a((Map) this.f339g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10630a(Map map) {
        if (this.f356x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo10628a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10628a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f356x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10627a(View view) {
        AdSession adSession = this.f356x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo10651j() {
        return this.f352t;
    }
}
