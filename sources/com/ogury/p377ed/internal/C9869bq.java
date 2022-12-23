package com.ogury.p377ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bq */
public final class C9869bq {

    /* renamed from: a */
    private final C10022fh f24868a;

    /* renamed from: b */
    private final Class<? extends Activity> f24869b;

    /* renamed from: c */
    private List<String> f24870c = new ArrayList();

    /* renamed from: d */
    private List<String> f24871d = new ArrayList();

    public C9869bq(C10022fh fhVar, Class<? extends Activity> cls) {
        C10263mq.m29882b(fhVar, "overlayActivityConfig");
        C10263mq.m29882b(cls, "showActivityClass");
        this.f24868a = fhVar;
        this.f24869b = cls;
        m28496b();
        m28494a();
    }

    /* renamed from: a */
    public final void mo64389a(List<String> list) {
        C10263mq.m29882b(list, "list");
        if (this.f24868a.mo64664c()) {
            this.f24870c.addAll(list);
        }
    }

    /* renamed from: b */
    public final void mo64390b(List<? extends Class<? extends Activity>> list) {
        C10263mq.m29882b(list, "activities");
        if (this.f24868a.mo64666d()) {
            for (Class canonicalName : list) {
                List<String> list2 = this.f24871d;
                String canonicalName2 = canonicalName.getCanonicalName();
                C10263mq.m29879a((Object) canonicalName2, "it.canonicalName");
                list2.add(canonicalName2);
            }
        }
    }

    /* renamed from: a */
    public final void mo64388a(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        if (this.f24868a.mo64662b()) {
            this.f24870c.add(C9890cc.m28564a(activity));
        }
    }

    /* renamed from: a */
    private final void m28494a() {
        if (!this.f24868a.mo64667e().isEmpty()) {
            this.f24870c.addAll(this.f24868a.mo64667e());
        }
    }

    /* renamed from: b */
    private final void m28496b() {
        if (!this.f24868a.mo64668f().isEmpty()) {
            this.f24871d.addAll(this.f24868a.mo64668f());
        }
    }

    /* renamed from: b */
    public final boolean mo64391b(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        if (activity instanceof C9929dd) {
            return false;
        }
        if ((this.f24868a.mo64658a() || C10263mq.m29881a((Object) activity.getClass(), (Object) this.f24869b)) && !m28495a(C9890cc.m28565a((Object) activity)) && m28497b(C9890cc.m28565a((Object) activity))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m28495a(String str) {
        Iterable<String> iterable = this.f24871d;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C10312oc.m29953b(str, b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m28497b(String str) {
        Iterable<String> iterable = this.f24870c;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C10312oc.m29953b(str, b)) {
                return true;
            }
        }
        return false;
    }
}
