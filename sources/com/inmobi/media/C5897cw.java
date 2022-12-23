package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C6215il;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.cw */
/* compiled from: InMobiActivityAdViewHandler */
public final class C5897cw implements C5902cz {

    /* renamed from: a */
    WeakReference<Activity> f14915a;

    /* renamed from: b */
    public C5894cu f14916b;

    /* renamed from: c */
    public C6234j f14917c = null;

    /* renamed from: d */
    C6323u f14918d;

    /* renamed from: e */
    float f14919e = 1.0f;

    /* renamed from: f */
    final C6326x f14920f = new C6326x() {
        public final void finish() {
            C5897cw.this.m17539h();
        }
    };

    /* renamed from: g */
    private final String f14921g = "InMobiActivityViewHandler";

    /* renamed from: h */
    private RelativeLayout f14922h;

    /* renamed from: i */
    private C5923di f14923i = C5923di.m17609a(C6215il.m18448b());

    /* renamed from: j */
    private final C6325w f14924j = new C6325w() {
        /* renamed from: a */
        public final void mo34985a(String str, C6324v vVar, float f, boolean z) {
            C5897cw cwVar = C5897cw.this;
            Activity activity = (Activity) cwVar.f14915a.get();
            if (activity != null) {
                if (cwVar.f14918d == null) {
                    cwVar.f14918d = new C6323u(activity);
                    cwVar.f14918d.setId(C6192i.f15632g);
                    cwVar.f14918d.setEmbeddedBrowserUpdateListener(cwVar.f14920f);
                }
                cwVar.mo34981a(cwVar.f14917c);
                cwVar.f14918d.mo35697a(str, vVar, z);
                cwVar.f14919e = 1.0f - f;
                if (cwVar.f14916b != null) {
                    cwVar.f14916b.mo34969a(cwVar.f14919e);
                    cwVar.f14916b.mo34976g();
                }
                cwVar.mo34982b();
            }
        }

        /* renamed from: a */
        public final void mo34984a() {
            C5897cw.this.m17539h();
        }
    };

    public C5897cw(Activity activity) {
        this.f14915a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final void mo34979a(Intent intent, SparseArray<C6234j> sparseArray) {
        Activity activity;
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            C6234j jVar = sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (jVar == null) {
                m17538g();
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", -1);
            if (intExtra == -1) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35461a();
                }
                m17538g();
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (activity = (Activity) this.f14915a.get()) != null) {
                activity.requestWindowFeature(1);
                activity.getWindow().setFlags(1024, 1024);
            }
            if (m17531a(intExtra, jVar)) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35461a();
                }
                m17538g();
                return;
            }
            try {
                this.f14917c = jVar;
                jVar.setFullScreenActivityContext((Activity) this.f14915a.get());
                m17535d();
                m17536e();
                m17532b(jVar);
                this.f14916b.mo34968a();
                m17537f();
                m17534c(jVar);
                mo34981a(jVar);
            } catch (Exception e) {
                jVar.setFullScreenActivityContext((Activity) null);
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35461a();
                }
                m17538g();
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
    }

    /* renamed from: d */
    private void m17535d() {
        Activity activity = (Activity) this.f14915a.get();
        if (activity != null) {
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
            if (((RelativeLayout) frameLayout.findViewById(C6192i.f15631f)) == null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                relativeLayout.setId(C6192i.f15631f);
                relativeLayout.setBackgroundColor(0);
                frameLayout.removeAllViews();
                frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: e */
    private void m17536e() {
        Activity activity = (Activity) this.f14915a.get();
        if (activity != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            this.f14922h = relativeLayout;
            relativeLayout.setId(C6192i.f15627b);
        }
    }

    /* renamed from: b */
    private void m17532b(C6234j jVar) {
        if (((Activity) this.f14915a.get()) != null && this.f14922h != null) {
            String markupType = jVar.getMarkupType();
            char c = 65535;
            int hashCode = markupType.hashCode();
            if (hashCode != -1084172778) {
                if (hashCode != 3213227) {
                    if (hashCode == 1236050372 && markupType.equals("htmlUrl")) {
                        c = 1;
                    }
                } else if (markupType.equals(TJAdUnitConstants.String.HTML)) {
                    c = 0;
                }
            } else if (markupType.equals("inmobiJson")) {
                c = 2;
            }
            if (c == 0 || c == 1) {
                this.f14916b = new C5895cv(this.f14915a, jVar, this.f14922h);
            } else if (c == 2) {
                this.f14916b = new C5900cy(this.f14915a, jVar, this.f14922h);
            } else {
                throw new IllegalArgumentException("Unknown Markup Type");
            }
            this.f14916b.mo34969a(this.f14919e);
            this.f14916b.mo34970a(this.f14923i);
        }
    }

    /* renamed from: f */
    private void m17537f() {
        RelativeLayout relativeLayout;
        Activity activity = (Activity) this.f14915a.get();
        if (activity != null && (relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(C6192i.f15631f)) != null && this.f14922h != null) {
            m17530a(relativeLayout);
            relativeLayout.addView(this.f14922h);
            this.f14916b.mo34976g();
        }
    }

    /* renamed from: a */
    private static void m17530a(RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(C6192i.f15627b);
        if (relativeLayout2 != null) {
            relativeLayout.removeView(relativeLayout2);
        }
    }

    /* renamed from: c */
    private void m17534c(C6234j jVar) {
        if (jVar instanceof C6301q) {
            ((C6301q) jVar).setEmbeddedBrowserJSCallbacks(this.f14924j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34981a(C6234j jVar) {
        C6323u uVar;
        if ((jVar instanceof C6301q) && (uVar = this.f14918d) != null) {
            uVar.setUserLeftApplicationListener(((C6301q) jVar).getListener());
        }
    }

    /* renamed from: a */
    public final void mo34978a() {
        C5894cu cuVar = this.f14916b;
        if (cuVar != null) {
            cuVar.mo34974e();
        }
        RelativeLayout relativeLayout = this.f14922h;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        C6323u uVar = this.f14918d;
        if (uVar != null) {
            uVar.mo35698b();
        }
        this.f14915a.clear();
        this.f14917c = null;
        this.f14916b = null;
        this.f14922h = null;
        this.f14918d = null;
    }

    /* renamed from: a */
    public final void mo34980a(C5923di diVar) {
        if (((Activity) this.f14915a.get()) != null) {
            C5894cu cuVar = this.f14916b;
            if (cuVar != null) {
                cuVar.mo34970a(diVar);
            }
            if (diVar != null && this.f14923i.mo35029a() == diVar.mo35029a()) {
                this.f14923i = diVar;
                return;
            }
            this.f14923i = diVar;
            C5894cu cuVar2 = this.f14916b;
            if (cuVar2 != null) {
                cuVar2.mo34976g();
            }
            mo34982b();
        }
    }

    /* renamed from: a */
    private static boolean m17531a(int i, C6234j jVar) {
        if (200 == i && !TJAdUnitConstants.String.HTML.equals(jVar.getMarkupType())) {
            return true;
        }
        if (202 != i || "htmlUrl".equals(jVar.getMarkupType())) {
            return 201 == i && !"inmobiJson".equals(jVar.getMarkupType());
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34982b() {
        C6323u uVar = this.f14918d;
        if (uVar != null) {
            C6215il.C6217a b = C6215il.m18450b(uVar.getContext());
            if (this.f14923i.mo35029a()) {
                m17529a((int) (((float) b.f15670a) * (1.0f - this.f14919e)), -1);
            } else {
                m17529a(-1, (int) (((float) b.f15671b) * (1.0f - this.f14919e)));
            }
        }
    }

    /* renamed from: a */
    private void m17529a(int i, int i2) {
        Activity activity = (Activity) this.f14915a.get();
        if (activity != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            if (this.f14923i.mo35029a()) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(12);
            }
            RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(C6192i.f15631f);
            if (relativeLayout != null && this.f14918d != null) {
                if (m17533b(relativeLayout)) {
                    this.f14918d.setLayoutParams(layoutParams);
                } else {
                    relativeLayout.addView(this.f14918d, layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m17539h() {
        C6323u uVar = this.f14918d;
        if (uVar != null) {
            uVar.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        C6323u uVar2 = this.f14918d;
        if (uVar2 != null) {
            ViewParent parent = uVar2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14918d);
            }
            this.f14918d.mo35698b();
            this.f14918d = null;
        }
        this.f14919e = 1.0f;
        C5894cu cuVar = this.f14916b;
        if (cuVar != null) {
            cuVar.mo34969a(1.0f);
            this.f14916b.mo34976g();
        }
    }

    /* renamed from: b */
    private static boolean m17533b(RelativeLayout relativeLayout) {
        return ((RelativeLayout) relativeLayout.findViewById(C6192i.f15632g)) != null;
    }

    /* renamed from: g */
    private void m17538g() {
        Activity activity = (Activity) this.f14915a.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }
}
