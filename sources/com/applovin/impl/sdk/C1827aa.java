package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.p031a.C1584b;
import com.applovin.impl.mediation.p031a.C1586d;
import com.applovin.impl.mediation.p031a.C1587e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.aa */
public class C1827aa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2102v f2922a;

    /* renamed from: b */
    private final Object f2923b = new Object();

    /* renamed from: c */
    private final Rect f2924c = new Rect();

    /* renamed from: d */
    private final Handler f2925d;

    /* renamed from: e */
    private final Runnable f2926e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f2927f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<View> f2928g;

    /* renamed from: h */
    private final long f2929h;

    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f2930i = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<View> f2931j = new WeakReference<>((Object) null);

    /* renamed from: k */
    private int f2932k;

    /* renamed from: l */
    private long f2933l;

    /* renamed from: m */
    private long f2934m = Long.MIN_VALUE;

    /* renamed from: com.applovin.impl.sdk.aa$a */
    public interface C1830a {
        void onLogVisibilityImpression();
    }

    public C1827aa(final View view, C1969m mVar, C1830a aVar) {
        this.f2922a = mVar.mo14509A();
        this.f2929h = ((Long) mVar.mo14534a(C1867b.f3172bT)).longValue();
        this.f2925d = new Handler(Looper.getMainLooper());
        this.f2928g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f2926e = new Runnable() {
            public void run() {
                View view = (View) C1827aa.this.f2928g.get();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                View view2 = (View) C1827aa.this.f2931j.get();
                if (viewGroup != null && view2 != null) {
                    if (C1827aa.this.m3866b(viewGroup, view2)) {
                        if (C2102v.m5104a()) {
                            C1827aa.this.f2922a.mo15012b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                        }
                        C1827aa.this.mo14115a();
                        C1830a aVar = (C1830a) weakReference.get();
                        if (aVar != null) {
                            aVar.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    C1827aa.this.m3864b();
                }
            }
        };
        this.f2927f = new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                C1827aa.this.m3864b();
                C1827aa.this.m3865b(view);
                return true;
            }
        };
    }

    /* renamed from: a */
    private void m3859a(View view) {
        View rootView = Utils.getRootView((View) this.f2928g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView != null) {
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f2930i = new WeakReference<>(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f2927f);
            } else if (C2102v.m5104a()) {
                this.f2922a.mo15015d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else if (C2102v.m5104a()) {
            this.f2922a.mo15012b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
        }
    }

    /* renamed from: a */
    private boolean m3861a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.f2924c) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f2924c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f2924c.height()))) >= ((long) this.f2932k);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3864b() {
        this.f2925d.postDelayed(this.f2926e, this.f2929h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3865b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f2930i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f2927f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f2927f);
            }
        }
        this.f2930i.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3866b(View view, View view2) {
        if (!m3861a(view, view2)) {
            return false;
        }
        if (this.f2934m == Long.MIN_VALUE) {
            this.f2934m = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f2934m >= this.f2933l;
    }

    /* renamed from: a */
    public void mo14115a() {
        synchronized (this.f2923b) {
            this.f2925d.removeMessages(0);
            m3865b((View) this.f2928g.get());
            this.f2934m = Long.MIN_VALUE;
            this.f2931j.clear();
        }
    }

    /* renamed from: a */
    public void mo14116a(C1587e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f2923b) {
            if (C2102v.m5104a()) {
                this.f2922a.mo15012b("VisibilityTracker", "Tracking Visibility...");
            }
            mo14115a();
            if (eVar instanceof C1584b) {
                weakReference = new WeakReference<>(((C1584b) eVar).mo13399w());
            } else if (eVar instanceof C1586d) {
                weakReference = new WeakReference<>(((C1586d) eVar).mo13397u());
            } else {
                return;
            }
            this.f2931j = weakReference;
            this.f2932k = eVar.mo13425F();
            this.f2933l = eVar.mo13427H();
            m3859a((View) this.f2931j.get());
        }
    }
}
