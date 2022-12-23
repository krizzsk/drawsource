package com.ogury.p377ed.internal;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cj */
public final class C9898cj implements C9882bw {

    /* renamed from: a */
    private final C9876bu f24933a;

    /* renamed from: b */
    private final C9897ci f24934b;

    /* renamed from: c */
    private final C10058gm f24935c;

    /* renamed from: d */
    private FragmentActivity f24936d;

    /* renamed from: e */
    private final Application f24937e;

    /* renamed from: f */
    private final C9899a f24938f;

    /* renamed from: g */
    private final FragmentManager.OnBackStackChangedListener f24939g;

    /* renamed from: h */
    private final C9900b f24940h;

    private C9898cj(Activity activity, C9876bu buVar, C9897ci ciVar, C10058gm gmVar) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(buVar, "adLayoutController");
        C10263mq.m29882b(ciVar, "overlayFragmentFilter");
        C10263mq.m29882b(gmVar, "topActivityMonitor");
        this.f24933a = buVar;
        this.f24934b = ciVar;
        this.f24935c = gmVar;
        this.f24936d = (FragmentActivity) activity;
        this.f24937e = activity.getApplication();
        this.f24938f = new C9899a(this);
        this.f24939g = new FragmentManager.OnBackStackChangedListener() {
            public final void onBackStackChanged() {
                C9898cj.m28585a(C9898cj.this);
            }
        };
        this.f24940h = new C9900b(this);
    }

    public /* synthetic */ C9898cj(Activity activity, C9876bu buVar, C9897ci ciVar) {
        this(activity, buVar, ciVar, C10058gm.f25283a);
    }

    /* renamed from: com.ogury.ed.internal.cj$a */
    public static final class C9899a extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C9898cj f24941a;

        C9899a(C9898cj cjVar) {
            this.f24941a = cjVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28585a(C9898cj cjVar) {
        C10263mq.m29882b(cjVar, "this$0");
        FragmentManager supportFragmentManager = cjVar.f24936d.getSupportFragmentManager();
        C10263mq.m29879a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        cjVar.m28584a(supportFragmentManager);
    }

    /* renamed from: com.ogury.ed.internal.cj$b */
    public static final class C9900b extends C9920cx {

        /* renamed from: a */
        final /* synthetic */ C9898cj f24942a;

        C9900b(C9898cj cjVar) {
            this.f24942a = cjVar;
        }

        public final void onActivityResumed(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f24942a.m28583a((FragmentActivity) activity);
            }
        }

        public final void onActivityPaused(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f24942a.m28587b((FragmentActivity) activity);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28583a(FragmentActivity fragmentActivity) {
        this.f24936d = fragmentActivity;
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f24938f, true);
        fragmentActivity.getSupportFragmentManager().addOnBackStackChangedListener(this.f24939g);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m28587b(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f24938f);
        fragmentActivity.getSupportFragmentManager().removeOnBackStackChangedListener(this.f24939g);
        this.f24933a.mo64400a();
    }

    /* renamed from: a */
    private final void m28584a(FragmentManager fragmentManager) {
        if (this.f24934b.mo64435a((List<? extends Object>) C9896ch.m28578a(fragmentManager))) {
            this.f24933a.mo64401a(this.f24936d);
        } else {
            this.f24933a.mo64400a();
        }
    }

    /* renamed from: b */
    public final void mo64393b() {
        this.f24937e.registerActivityLifecycleCallbacks(this.f24940h);
    }

    /* renamed from: c */
    public final void mo64394c() {
        Activity a = C10058gm.m29204a();
        FragmentActivity fragmentActivity = a instanceof FragmentActivity ? (FragmentActivity) a : null;
        if (fragmentActivity == null) {
            fragmentActivity = this.f24936d;
        }
        m28583a(fragmentActivity);
        FragmentManager supportFragmentManager = this.f24936d.getSupportFragmentManager();
        C10263mq.m29879a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        m28584a(supportFragmentManager);
    }

    /* renamed from: d */
    public final void mo64395d() {
        this.f24937e.unregisterActivityLifecycleCallbacks(this.f24940h);
        m28587b(this.f24936d);
    }
}
