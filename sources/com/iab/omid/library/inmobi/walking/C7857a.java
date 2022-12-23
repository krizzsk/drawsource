package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.p249b.C7827a;
import com.iab.omid.library.inmobi.p249b.C7830c;
import com.iab.omid.library.inmobi.p251d.C7847f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.inmobi.walking.a */
public class C7857a {

    /* renamed from: a */
    private final HashMap<View, String> f18980a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7858a> f18981b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18982c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18983d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18984e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18985f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18986g = new HashMap<>();

    /* renamed from: h */
    private boolean f18987h;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a */
    public static class C7858a {

        /* renamed from: a */
        private final C7830c f18988a;

        /* renamed from: b */
        private final ArrayList<String> f18989b = new ArrayList<>();

        public C7858a(C7830c cVar, String str) {
            this.f18988a = cVar;
            mo55242a(str);
        }

        /* renamed from: a */
        public C7830c mo55241a() {
            return this.f18988a;
        }

        /* renamed from: a */
        public void mo55242a(String str) {
            this.f18989b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55243b() {
            return this.f18989b;
        }
    }

    /* renamed from: a */
    private void m22079a(C7825a aVar) {
        for (C7830c a : aVar.mo55107a()) {
            m22080a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22080a(C7830c cVar, C7825a aVar) {
        View view = (View) cVar.mo55161a().get();
        if (view != null) {
            C7858a aVar2 = this.f18981b.get(view);
            if (aVar2 != null) {
                aVar2.mo55242a(aVar.getAdSessionId());
            } else {
                this.f18981b.put(view, new C7858a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22081d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7847f.m22030e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18983d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55231a(View view) {
        if (this.f18980a.size() == 0) {
            return null;
        }
        String str = this.f18980a.get(view);
        if (str != null) {
            this.f18980a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55232a(String str) {
        return this.f18986g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55233a() {
        return this.f18984e;
    }

    /* renamed from: b */
    public View mo55234b(String str) {
        return this.f18982c.get(str);
    }

    /* renamed from: b */
    public C7858a mo55235b(View view) {
        C7858a aVar = this.f18981b.get(view);
        if (aVar != null) {
            this.f18981b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55236b() {
        return this.f18985f;
    }

    /* renamed from: c */
    public C7868c mo55237c(View view) {
        return this.f18983d.contains(view) ? C7868c.PARENT_VIEW : this.f18987h ? C7868c.OBSTRUCTION_VIEW : C7868c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55238c() {
        C7827a a = C7827a.m21924a();
        if (a != null) {
            for (C7825a next : a.mo55145c()) {
                View d = next.mo55111d();
                if (next.mo55112e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22081d(d);
                        if (d2 == null) {
                            this.f18984e.add(adSessionId);
                            this.f18980a.put(d, adSessionId);
                            m22079a(next);
                        } else {
                            this.f18985f.add(adSessionId);
                            this.f18982c.put(adSessionId, d);
                            this.f18986g.put(adSessionId, d2);
                        }
                    } else {
                        this.f18985f.add(adSessionId);
                        this.f18986g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55239d() {
        this.f18980a.clear();
        this.f18981b.clear();
        this.f18982c.clear();
        this.f18983d.clear();
        this.f18984e.clear();
        this.f18985f.clear();
        this.f18986g.clear();
        this.f18987h = false;
    }

    /* renamed from: e */
    public void mo55240e() {
        this.f18987h = true;
    }
}
