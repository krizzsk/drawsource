package com.tapjoy.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11643ja;

/* renamed from: com.tapjoy.internal.ho */
public class C11572ho extends C11578hq {

    /* renamed from: h */
    private static final String f27789h = C11572ho.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C11572ho f27790i;

    /* renamed from: a */
    final String f27791a;

    /* renamed from: b */
    final C11604ie f27792b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11558hj f27793j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11320c f27794k;

    /* renamed from: l */
    private boolean f27795l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f27796m;

    /* renamed from: n */
    private Context f27797n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f27798o = false;

    /* renamed from: a */
    public static void m31720a() {
        C11572ho hoVar = f27790i;
        if (hoVar != null) {
            hoVar.m31730e();
        }
    }

    public C11572ho(C11558hj hjVar, String str, C11604ie ieVar, Context context) {
        this.f27793j = hjVar;
        this.f27791a = str;
        this.f27792b = ieVar;
        this.f27797n = context;
    }

    /* renamed from: b */
    public final void mo70091b() {
        C11604ie ieVar = this.f27792b;
        if (ieVar.f27902a != null) {
            ieVar.f27902a.mo70195b();
        }
        if (ieVar.f27903b != null) {
            ieVar.f27903b.mo70195b();
        }
        ieVar.f27904c.mo70195b();
        if (ieVar.f27906e != null) {
            ieVar.f27906e.mo70195b();
        }
        if (ieVar.f27907f != null) {
            ieVar.f27907f.mo70195b();
        }
        if (ieVar.f27914m != null && ieVar.f27914m.f27916a != null) {
            ieVar.f27914m.f27916a.mo70195b();
        }
    }

    /* renamed from: c */
    public final boolean mo70092c() {
        C11604ie ieVar = this.f27792b;
        if (ieVar.f27904c == null || ieVar.f27904c.f27925b == null) {
            return false;
        }
        if (ieVar.f27914m != null && ieVar.f27914m.f27916a != null && ieVar.f27914m.f27916a.f27925b == null) {
            return false;
        }
        if (ieVar.f27903b == null || ieVar.f27907f == null || ieVar.f27903b.f27925b == null || ieVar.f27907f.f27925b == null) {
            return (ieVar.f27902a == null || ieVar.f27906e == null || ieVar.f27902a.f27925b == null || ieVar.f27906e.f27925b == null) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo70090a(final C11560hk hkVar, final C11496fy fyVar) {
        Activity a = C11254a.m30846a(this.f27797n);
        if (a != null && !a.isFinishing()) {
            try {
                m31721a(a, hkVar, fyVar);
                Class<C11604ie> cls = C11604ie.class;
                Object[] objArr = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C11544hb.m31599a();
        try {
            TJContentActivity.start(C11558hj.m31644a().f27744e, new TJContentActivity.AbstractContentProducer() {
                public final void show(Activity activity) {
                    try {
                        C11572ho.this.m31721a(activity, hkVar, fyVar);
                    } catch (WindowManager.BadTokenException unused) {
                        C11554hg.m31626b("Failed to show the content for \"{}\" caused by invalid activity", C11572ho.this.f27791a);
                        hkVar.mo69157a(C11572ho.this.f27791a, C11572ho.this.f27813f, (C11537gv) null);
                    }
                }

                public final void dismiss(Activity activity) {
                    C11572ho.this.m31730e();
                }
            }, (a2 == null || (a2.getWindow().getAttributes().flags & 1024) == 0) ? false : true);
            Class<C11604ie> cls2 = C11604ie.class;
            Object[] objArr2 = new Object[1];
        } catch (ActivityNotFoundException unused2) {
            if (a2 != null && !a2.isFinishing()) {
                try {
                    m31721a(a2, hkVar, fyVar);
                    Class<C11604ie> cls3 = C11604ie.class;
                    Object[] objArr3 = new Object[1];
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    C11554hg.m31626b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f27791a);
                    hkVar.mo69157a(this.f27791a, this.f27813f, (C11537gv) null);
                }
            }
            C11554hg.m31626b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f27791a);
            hkVar.mo69157a(this.f27791a, this.f27813f, (C11537gv) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31721a(final Activity activity, final C11560hk hkVar, C11496fy fyVar) {
        if (this.f27795l) {
            TapjoyLog.m30840e(f27789h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.f27795l = true;
        f27790i = this;
        this.f27814g = fyVar.f27591a;
        C11320c cVar = new C11320c(activity);
        this.f27794k = cVar;
        cVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                hkVar.mo69160d(C11572ho.this.f27791a);
            }
        });
        this.f27794k.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                String obj;
                C11572ho unused = C11572ho.f27790i = null;
                C11578hq.m31740a((Context) activity, C11572ho.this.f27792b.f27908g);
                C11572ho.this.f27793j.mo70119a(C11572ho.this.f27792b.f27912k, SystemClock.elapsedRealtime() - C11572ho.this.f27796m);
                if (!C11572ho.this.f27811d) {
                    hkVar.mo69157a(C11572ho.this.f27791a, C11572ho.this.f27813f, C11572ho.this.f27792b.f27909h);
                }
                if (C11572ho.this.f27798o && C11572ho.this.f27792b.f27912k != null && C11572ho.this.f27792b.f27912k.containsKey("action_id") && (obj = C11572ho.this.f27792b.f27912k.get("action_id").toString()) != null && obj.length() > 0) {
                    C11558hj c = C11572ho.this.f27793j;
                    if (c.f27741b != null) {
                        C11580hs hsVar = c.f27741b;
                        String a = C11580hs.m31748a();
                        String a2 = hsVar.f27820b.mo70312a();
                        String a3 = hsVar.f27819a.mo70312a();
                        if (a3 == null || !a.equals(a3)) {
                            hsVar.f27819a.mo70313a(a);
                            a2 = "";
                        }
                        if (!(a2.length() == 0)) {
                            obj = !a2.contains(obj) ? a2.concat(",".concat(String.valueOf(obj))) : a2;
                        }
                        hsVar.f27820b.mo70313a(obj);
                    }
                }
                Activity activity = activity;
                if (activity instanceof TJContentActivity) {
                    activity.finish();
                }
            }
        });
        this.f27794k.setCanceledOnTouchOutside(false);
        C11641iz izVar = new C11641iz(activity, this.f27792b, new C11643ja(activity, this.f27792b, new C11643ja.C11644a() {
            /* renamed from: a */
            public final void mo70161a() {
                C11572ho.this.f27794k.cancel();
            }

            /* renamed from: a */
            public final void mo70162a(C11598ic icVar) {
                C11494fw fwVar;
                if (!(!(C11572ho.this.f27814g instanceof C11494fw) || (fwVar = (C11494fw) C11572ho.this.f27814g) == null || fwVar.f27589b == null)) {
                    fwVar.f27589b.mo70012a();
                }
                C11572ho.this.f27793j.mo70120a(C11572ho.this.f27792b.f27912k, icVar.f27883b);
                C11578hq.m31740a((Context) activity, icVar.f27885d);
                if (!TextUtils.isEmpty(icVar.f27886e)) {
                    C11572ho.this.f27812e.mo69393a(activity, icVar.f27886e, C11534gs.m31572b(icVar.f27887f));
                    C11572ho.this.f27811d = true;
                }
                hkVar.mo69156a(C11572ho.this.f27791a, icVar.f27888g);
                if (icVar.f27884c) {
                    C11572ho.this.f27794k.dismiss();
                }
            }

            /* renamed from: b */
            public final void mo70163b() {
                C11572ho hoVar = C11572ho.this;
                boolean unused = hoVar.f27798o = !hoVar.f27798o;
            }
        }));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(izVar, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f27794k.setContentView(frameLayout);
        try {
            this.f27794k.show();
            this.f27794k.mo69765a();
            if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
                this.f27794k.getWindow().setFlags(1024, 1024);
            }
            this.f27796m = SystemClock.elapsedRealtime();
            this.f27793j.mo70118a(this.f27792b.f27912k);
            fyVar.mo70022b();
            C11488fs fsVar = this.f27814g;
            if (fsVar != null) {
                fsVar.mo70015b();
            }
            hkVar.mo69159c(this.f27791a);
        } catch (WindowManager.BadTokenException e) {
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m31730e() {
        C11320c cVar = this.f27794k;
        if (cVar != null) {
            cVar.dismiss();
        }
    }
}
