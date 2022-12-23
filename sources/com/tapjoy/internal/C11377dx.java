package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.tapjoy.internal.C11359dj;
import com.tapjoy.internal.C11381dy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dx */
public final class C11377dx implements C11359dj.C11360a {

    /* renamed from: a */
    public static Handler f27157a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static C11377dx f27158c = new C11377dx();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Handler f27159d = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f27160j = new Runnable() {
        public final void run() {
            C11377dx.m31118b(C11377dx.m31113a());
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f27161k = new Runnable() {
        public final void run() {
            if (C11377dx.f27159d != null) {
                C11377dx.f27159d.post(C11377dx.f27160j);
                C11377dx.f27159d.postDelayed(C11377dx.f27161k, 200);
            }
        }
    };

    /* renamed from: b */
    public List<Object> f27162b = new ArrayList();

    /* renamed from: e */
    private int f27163e;

    /* renamed from: f */
    private C11361dk f27164f = new C11361dk();

    /* renamed from: g */
    private C11381dy f27165g = new C11381dy();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11392ef f27166h = new C11392ef(new C11388eb());

    /* renamed from: i */
    private long f27167i;

    C11377dx() {
    }

    /* renamed from: a */
    public static C11377dx m31113a() {
        return f27158c;
    }

    /* renamed from: a */
    private void m31115a(long j) {
        if (this.f27162b.size() > 0) {
            Iterator<Object> it = this.f27162b.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j);
            }
        }
    }

    /* renamed from: a */
    private void m31116a(View view, C11359dj djVar, JSONObject jSONObject, int i) {
        djVar.mo69811a(view, jSONObject, this, i == C11393eg.f27197a);
    }

    /* renamed from: b */
    public static void m31117b() {
        if (f27159d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f27159d = handler;
            handler.post(f27160j);
            f27159d.postDelayed(f27161k, 200);
        }
    }

    /* renamed from: c */
    public static void m31119c() {
        Handler handler = f27159d;
        if (handler != null) {
            handler.removeCallbacks(f27161k);
            f27159d = null;
        }
    }

    /* renamed from: a */
    public final void mo69812a(View view, C11359dj djVar, JSONObject jSONObject) {
        String str;
        boolean z = false;
        if (C11369dr.m31097c(view) == null) {
            C11381dy dyVar = this.f27165g;
            int i = dyVar.f27172d.contains(view) ? C11393eg.f27197a : dyVar.f27176h ? C11393eg.f27198b : C11393eg.f27199c;
            if (i != C11393eg.f27199c) {
                JSONObject a = djVar.mo69810a(view);
                C11365do.m31084a(jSONObject, a);
                C11381dy dyVar2 = this.f27165g;
                if (dyVar2.f27169a.size() == 0) {
                    str = null;
                } else {
                    String str2 = dyVar2.f27169a.get(view);
                    if (str2 != null) {
                        dyVar2.f27169a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    C11365do.m31082a(a, str);
                    this.f27165g.f27176h = true;
                    z = true;
                }
                if (!z) {
                    C11381dy dyVar3 = this.f27165g;
                    C11381dy.C11382a aVar = dyVar3.f27170b.get(view);
                    if (aVar != null) {
                        dyVar3.f27170b.remove(view);
                    }
                    if (aVar != null) {
                        C11365do.m31081a(a, aVar);
                    }
                    m31116a(view, djVar, a, i);
                }
                this.f27163e++;
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m31118b(C11377dx dxVar) {
        String str;
        dxVar.f27163e = 0;
        dxVar.f27167i = System.nanoTime();
        C11381dy dyVar = dxVar.f27165g;
        C11351dd a = C11351dd.m31050a();
        if (a != null) {
            for (T t : Collections.unmodifiableCollection(a.f27112b)) {
                View c = t.mo69788c();
                if (t.mo69789d()) {
                    String str2 = t.f27082f;
                    if (c != null) {
                        if (!c.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = c;
                            while (true) {
                                if (view == null) {
                                    dyVar.f27172d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String c2 = C11369dr.m31097c(view);
                                if (c2 != null) {
                                    str = c2;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            dyVar.f27173e.add(str2);
                            dyVar.f27169a.put(c, str2);
                            dyVar.mo69828a(t);
                        } else {
                            dyVar.f27174f.add(str2);
                            dyVar.f27171c.put(str2, c);
                            dyVar.f27175g.put(str2, str);
                        }
                    } else {
                        dyVar.f27174f.add(str2);
                        dyVar.f27175g.put(str2, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        C11362dl dlVar = dxVar.f27164f.f27134b;
        if (dxVar.f27165g.f27174f.size() > 0) {
            Iterator<String> it = dxVar.f27165g.f27174f.iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = dlVar.mo69810a((View) null);
                View view2 = dxVar.f27165g.f27171c.get(next);
                C11363dm dmVar = dxVar.f27164f.f27133a;
                String str3 = dxVar.f27165g.f27175g.get(next);
                if (str3 != null) {
                    JSONObject a3 = dmVar.mo69810a(view2);
                    C11365do.m31082a(a3, next);
                    C11365do.m31086b(a3, str3);
                    C11365do.m31084a(a2, a3);
                }
                C11365do.m31080a(a2);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(next);
                C11392ef efVar = dxVar.f27166h;
                efVar.f27195a.mo69836a(new C11390ed(efVar, hashSet2, a2, nanoTime));
            }
        }
        if (dxVar.f27165g.f27173e.size() > 0) {
            JSONObject a4 = dlVar.mo69810a((View) null);
            dxVar.m31116a((View) null, dlVar, a4, C11393eg.f27197a);
            C11365do.m31080a(a4);
            C11392ef efVar2 = dxVar.f27166h;
            efVar2.f27195a.mo69836a(new C11391ee(efVar2, dxVar.f27165g.f27173e, a4, nanoTime));
        } else {
            dxVar.f27166h.mo69840b();
        }
        C11381dy dyVar2 = dxVar.f27165g;
        dyVar2.f27169a.clear();
        dyVar2.f27170b.clear();
        dyVar2.f27171c.clear();
        dyVar2.f27172d.clear();
        dyVar2.f27173e.clear();
        dyVar2.f27174f.clear();
        dyVar2.f27175g.clear();
        dyVar2.f27176h = false;
        dxVar.m31115a(System.nanoTime() - dxVar.f27167i);
    }
}
