package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.p273b.C8041a;
import com.iab.omid.library.vungle.p273b.C8044c;
import com.iab.omid.library.vungle.p275d.C8061f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.vungle.walking.a */
public class C8071a {

    /* renamed from: a */
    private final HashMap<View, String> f19513a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8072a> f19514b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19515c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19516d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19517e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19518f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19519g = new HashMap<>();

    /* renamed from: h */
    private boolean f19520h;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a */
    public static class C8072a {

        /* renamed from: a */
        private final C8044c f19521a;

        /* renamed from: b */
        private final ArrayList<String> f19522b = new ArrayList<>();

        public C8072a(C8044c cVar, String str) {
            this.f19521a = cVar;
            mo56159a(str);
        }

        /* renamed from: a */
        public C8044c mo56158a() {
            return this.f19521a;
        }

        /* renamed from: a */
        public void mo56159a(String str) {
            this.f19522b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo56160b() {
            return this.f19522b;
        }
    }

    /* renamed from: a */
    private void m23080a(C8039a aVar) {
        for (C8044c a : aVar.mo56024a()) {
            m23081a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m23081a(C8044c cVar, C8039a aVar) {
        View view = (View) cVar.mo56078a().get();
        if (view != null) {
            C8072a aVar2 = this.f19514b.get(view);
            if (aVar2 != null) {
                aVar2.mo56159a(aVar.getAdSessionId());
            } else {
                this.f19514b.put(view, new C8072a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m23082d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C8061f.m23031e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19516d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo56148a(View view) {
        if (this.f19513a.size() == 0) {
            return null;
        }
        String str = this.f19513a.get(view);
        if (str != null) {
            this.f19513a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo56149a(String str) {
        return this.f19519g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo56150a() {
        return this.f19517e;
    }

    /* renamed from: b */
    public View mo56151b(String str) {
        return this.f19515c.get(str);
    }

    /* renamed from: b */
    public C8072a mo56152b(View view) {
        C8072a aVar = this.f19514b.get(view);
        if (aVar != null) {
            this.f19514b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo56153b() {
        return this.f19518f;
    }

    /* renamed from: c */
    public C8082c mo56154c(View view) {
        return this.f19516d.contains(view) ? C8082c.PARENT_VIEW : this.f19520h ? C8082c.OBSTRUCTION_VIEW : C8082c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo56155c() {
        C8041a a = C8041a.m22925a();
        if (a != null) {
            for (C8039a next : a.mo56062c()) {
                View d = next.mo56028d();
                if (next.mo56029e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m23082d(d);
                        if (d2 == null) {
                            this.f19517e.add(adSessionId);
                            this.f19513a.put(d, adSessionId);
                            m23080a(next);
                        } else {
                            this.f19518f.add(adSessionId);
                            this.f19515c.put(adSessionId, d);
                            this.f19519g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19518f.add(adSessionId);
                        this.f19519g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo56156d() {
        this.f19513a.clear();
        this.f19514b.clear();
        this.f19515c.clear();
        this.f19516d.clear();
        this.f19517e.clear();
        this.f19518f.clear();
        this.f19519g.clear();
        this.f19520h = false;
    }

    /* renamed from: e */
    public void mo56157e() {
        this.f19520h = true;
    }
}
