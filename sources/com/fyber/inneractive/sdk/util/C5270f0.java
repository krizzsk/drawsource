package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.C5287j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.f0 */
public class C5270f0 {

    /* renamed from: a */
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> f13978a = new WeakHashMap();

    /* renamed from: b */
    public final WeakHashMap<Context, WeakHashMap<View, C5275e>> f13979b = new WeakHashMap<>();

    /* renamed from: c */
    public final C5287j<Rect> f13980c = new C5287j<>(16, new C5271a(this));

    /* renamed from: d */
    public final C5287j<HashSet<View>> f13981d = new C5287j<>(16, new C5272b(this));

    /* renamed from: com.fyber.inneractive.sdk.util.f0$a */
    public class C5271a implements C5287j.C5288a<Rect> {
        public C5271a(C5270f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo26253a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$b */
    public class C5272b implements C5287j.C5288a<HashSet<View>> {
        public C5272b(C5270f0 f0Var) {
        }

        /* renamed from: a */
        public Object mo26253a() {
            return new HashSet();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$c */
    public class C5273c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ Context f13982a;

        public C5273c(Context context) {
            this.f13982a = context;
        }

        public boolean onPreDraw() {
            WeakHashMap weakHashMap;
            C5270f0 f0Var = C5270f0.this;
            Context context = this.f13982a;
            f0Var.getClass();
            if (context == null || (weakHashMap = f0Var.f13979b.get(context)) == null) {
                return true;
            }
            HashSet a = f0Var.f13981d.mo26381a();
            a.addAll(weakHashMap.keySet());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C5275e eVar = (C5275e) weakHashMap.get(view);
                if (eVar != null) {
                    float f = 0.0f;
                    Rect a2 = f0Var.f13980c.mo26381a();
                    if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(a2)) {
                        f = ((float) (a2.height() * a2.width())) / ((float) (view.getHeight() * view.getWidth()));
                    }
                    eVar.mo26268a(view, f, a2);
                    f0Var.f13980c.f14004a.offer(a2);
                }
            }
            a.clear();
            f0Var.f13981d.f14004a.offer(a);
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$d */
    public static class C5274d {

        /* renamed from: a */
        public static final C5270f0 f13984a = new C5270f0();
    }

    /* renamed from: com.fyber.inneractive.sdk.util.f0$e */
    public interface C5275e {
        /* renamed from: a */
        void mo26268a(View view, float f, Rect rect);
    }

    /* renamed from: a */
    public static C5270f0 m16471a() {
        return C5274d.f13984a;
    }

    /* renamed from: b */
    public final String mo26372b() {
        return "IAVisibilityTracker" + ": ";
    }

    /* renamed from: c */
    public final void mo26373c() {
        for (Context next : this.f13979b.keySet()) {
            IAlog.m16446a("%stracking context: %s", mo26372b(), next);
            WeakHashMap weakHashMap = this.f13979b.get(next);
            if (weakHashMap != null) {
                for (View view : weakHashMap.keySet()) {
                    IAlog.m16446a("%stracking view: %s", mo26372b(), view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26369a(Context context, View view, C5275e eVar) {
        View view2;
        ViewTreeObserver viewTreeObserver;
        IAlog.m16446a("%strackView called with context: %s view: %s", mo26372b(), context, view);
        if (context != null) {
            WeakHashMap weakHashMap = this.f13979b.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.f13979b.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        view2 = activity.getWindow().getDecorView();
                        viewTreeObserver = view2.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            C5273c cVar = new C5273c(context);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.f13978a.put(context, new Pair(viewTreeObserver, cVar));
                        }
                    }
                }
                view2 = view.getRootView();
                viewTreeObserver = view2.getViewTreeObserver();
                C5273c cVar2 = new C5273c(context);
                viewTreeObserver.addOnPreDrawListener(cVar2);
                this.f13978a.put(context, new Pair(viewTreeObserver, cVar2));
            }
            weakHashMap.put(view, eVar);
            mo26373c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    /* renamed from: a */
    public void mo26371a(View view) {
        IAlog.m16446a("%sunTrackView called with view", mo26372b());
        if (view == null) {
            IAlog.m16446a("%sunTrackView called with a null view!", mo26372b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m16446a("%sview.getContext() returned null!", mo26372b());
            return;
        }
        Map map = this.f13979b.get(context);
        if (map != null) {
            mo26370a(context, (Map<View, C5275e>) map, view);
        } else {
            Iterator it = new HashSet(this.f13979b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = this.f13979b.get(context2);
                if (weakHashMap != null) {
                    mo26370a(context2, (Map<View, C5275e>) weakHashMap, view);
                }
            }
        }
        mo26373c();
    }

    /* renamed from: a */
    public final void mo26370a(Context context, Map<View, C5275e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f13936a <= 2) {
                IAlog.m16449d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f13979b.remove(context);
                Pair pair = this.f13978a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f13978a.remove(context);
                }
            }
        }
    }
}
