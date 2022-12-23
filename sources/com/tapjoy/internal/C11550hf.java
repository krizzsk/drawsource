package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11637iy;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.hf */
public class C11550hf extends C11578hq {

    /* renamed from: h */
    private static final String f27705h = C11550hf.class.getSimpleName();

    /* renamed from: i */
    private static C11550hf f27706i;

    /* renamed from: a */
    final String f27707a;

    /* renamed from: b */
    final C11596ib f27708b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11558hj f27709j;

    /* renamed from: k */
    private boolean f27710k;

    /* renamed from: l */
    private boolean f27711l;

    /* renamed from: m */
    private long f27712m;

    /* renamed from: n */
    private Context f27713n;

    /* renamed from: o */
    private C11637iy f27714o;

    /* renamed from: p */
    private Activity f27715p;

    /* renamed from: q */
    private C11560hk f27716q;

    /* renamed from: r */
    private Handler f27717r;

    /* renamed from: s */
    private Runnable f27718s;

    /* renamed from: a */
    public static void m31611a() {
        C11550hf hfVar = f27706i;
        if (hfVar != null) {
            C115511 r1 = new Runnable(hfVar) {

                /* renamed from: a */
                final /* synthetic */ C11550hf f27719a;

                {
                    this.f27719a = r1;
                }

                public final void run() {
                    C11550hf.m31613a(this.f27719a);
                }
            };
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && mainLooper.getThread() == Thread.currentThread()) {
                r1.run();
            } else {
                C11683t.m32049a().post(r1);
            }
        }
    }

    public C11550hf(C11558hj hjVar, String str, C11596ib ibVar, Context context) {
        this.f27709j = hjVar;
        this.f27707a = str;
        this.f27708b = ibVar;
        this.f27713n = context;
    }

    /* renamed from: b */
    public final void mo70091b() {
        Iterator<C11616ik> it = this.f27708b.f27878a.iterator();
        while (it.hasNext()) {
            Iterator<C11614ij> it2 = it.next().f27950c.iterator();
            while (it2.hasNext()) {
                C11614ij next = it2.next();
                if (next.f27945l != null) {
                    next.f27945l.mo70195b();
                }
                if (next.f27946m != null) {
                    next.f27946m.mo70195b();
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo70092c() {
        Iterator<C11616ik> it = this.f27708b.f27878a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Iterator<C11614ij> it2 = it.next().f27950c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    continue;
                    break;
                }
                C11614ij next = it2.next();
                if ((next.f27945l == null || next.f27945l.mo70194a()) && (next.f27946m == null || next.f27946m.mo70194a())) {
                }
            }
            z = false;
            continue;
            if (!z) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo70090a(C11560hk hkVar, C11496fy fyVar) {
        this.f27716q = hkVar;
        Activity a = C11544hb.m31599a();
        this.f27715p = a;
        if (a != null && !a.isFinishing()) {
            try {
                m31612a(this.f27715p, hkVar, fyVar);
                Object[] objArr = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C11254a.m30846a(this.f27713n);
        this.f27715p = a2;
        if (a2 != null && !a2.isFinishing()) {
            try {
                m31612a(this.f27715p, hkVar, fyVar);
                Class<C11596ib> cls = C11596ib.class;
                Object[] objArr2 = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        C11554hg.m31626b("Failed to show the content for \"{}\". No usable activity found.", this.f27707a);
        hkVar.mo69157a(this.f27707a, this.f27813f, (C11537gv) null);
    }

    /* renamed from: a */
    private void m31612a(final Activity activity, final C11560hk hkVar, C11496fy fyVar) {
        if (this.f27710k) {
            TapjoyLog.m30840e(f27705h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.f27710k = true;
        this.f27711l = true;
        f27706i = this;
        this.f27814g = fyVar.f27591a;
        this.f27714o = new C11637iy(activity, this.f27708b, new C11637iy.C11640a() {
            /* renamed from: a */
            public final void mo70095a(C11614ij ijVar) {
                C11495fx fxVar;
                if (!(!(C11550hf.this.f27814g instanceof C11495fx) || (fxVar = (C11495fx) C11550hf.this.f27814g) == null || fxVar.f27590b == null)) {
                    fxVar.f27590b.mo70012a();
                }
                C11550hf.this.f27709j.mo70120a(C11550hf.this.f27708b.f27879b, ijVar.f27944k);
                if (!TextUtils.isEmpty(ijVar.f27941h)) {
                    C11550hf.this.f27812e.mo69393a(activity, ijVar.f27941h, C11534gs.m31572b(ijVar.f27942i));
                    C11550hf.this.f27811d = true;
                } else if (!TextUtils.isEmpty(ijVar.f27940g)) {
                    C11578hq.m31740a((Context) activity, ijVar.f27940g);
                }
                hkVar.mo69156a(C11550hf.this.f27707a, (C11537gv) null);
                if (ijVar.f27943j) {
                    C11550hf.m31613a(C11550hf.this);
                }
            }

            /* renamed from: a */
            public final void mo70094a() {
                C11550hf.m31613a(C11550hf.this);
            }
        });
        C11259ac.m30850a(activity.getWindow(), this.f27714o, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f27712m = SystemClock.elapsedRealtime();
        this.f27709j.mo70118a(this.f27708b.f27879b);
        fyVar.mo70022b();
        C11488fs fsVar = this.f27814g;
        if (fsVar != null) {
            fsVar.mo70015b();
        }
        hkVar.mo69159c(this.f27707a);
        if (this.f27708b.f27880c > 0.0f) {
            this.f27717r = new Handler(Looper.getMainLooper());
            C115533 r5 = new Runnable() {
                public final void run() {
                    C11550hf.m31613a(C11550hf.this);
                }
            };
            this.f27718s = r5;
            this.f27717r.postDelayed(r5, (long) (this.f27708b.f27880c * 1000.0f));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m31613a(C11550hf hfVar) {
        C11560hk hkVar;
        if (hfVar.f27711l) {
            hfVar.f27711l = false;
            Handler handler = hfVar.f27717r;
            if (handler != null) {
                handler.removeCallbacks(hfVar.f27718s);
                hfVar.f27718s = null;
                hfVar.f27717r = null;
            }
            if (f27706i == hfVar) {
                f27706i = null;
            }
            hfVar.f27709j.mo70119a(hfVar.f27708b.f27879b, SystemClock.elapsedRealtime() - hfVar.f27712m);
            if (!hfVar.f27811d && (hkVar = hfVar.f27716q) != null) {
                hkVar.mo69157a(hfVar.f27707a, hfVar.f27813f, (C11537gv) null);
                hfVar.f27716q = null;
            }
            ViewGroup viewGroup = (ViewGroup) hfVar.f27714o.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(hfVar.f27714o);
            }
            hfVar.f27714o = null;
            Activity activity = hfVar.f27715p;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
            hfVar.f27715p = null;
        }
    }
}
