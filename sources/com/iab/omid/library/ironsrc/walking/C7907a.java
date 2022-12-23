package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p255b.C7877a;
import com.iab.omid.library.ironsrc.p255b.C7880c;
import com.iab.omid.library.ironsrc.p257d.C7897f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
public class C7907a {

    /* renamed from: a */
    private final HashMap<View, String> f19094a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7908a> f19095b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19096c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19097d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19098e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19099f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19100g = new HashMap<>();

    /* renamed from: h */
    private boolean f19101h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class C7908a {

        /* renamed from: a */
        private final C7880c f19102a;

        /* renamed from: b */
        private final ArrayList<String> f19103b = new ArrayList<>();

        public C7908a(C7880c cVar, String str) {
            this.f19102a = cVar;
            mo55428a(str);
        }

        /* renamed from: a */
        public C7880c mo55427a() {
            return this.f19102a;
        }

        /* renamed from: a */
        public void mo55428a(String str) {
            this.f19103b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55429b() {
            return this.f19103b;
        }
    }

    /* renamed from: a */
    private void m22300a(C7875a aVar) {
        for (C7880c a : aVar.mo55301a()) {
            m22301a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22301a(C7880c cVar, C7875a aVar) {
        View view = (View) cVar.mo55347a().get();
        if (view != null) {
            C7908a aVar2 = this.f19095b.get(view);
            if (aVar2 != null) {
                aVar2.mo55428a(aVar.getAdSessionId());
            } else {
                this.f19095b.put(view, new C7908a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22302d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7897f.m22251e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19097d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55417a(View view) {
        if (this.f19094a.size() == 0) {
            return null;
        }
        String str = this.f19094a.get(view);
        if (str != null) {
            this.f19094a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55418a(String str) {
        return this.f19100g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55419a() {
        return this.f19098e;
    }

    /* renamed from: b */
    public View mo55420b(String str) {
        return this.f19096c.get(str);
    }

    /* renamed from: b */
    public C7908a mo55421b(View view) {
        C7908a aVar = this.f19095b.get(view);
        if (aVar != null) {
            this.f19095b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55422b() {
        return this.f19099f;
    }

    /* renamed from: c */
    public C7918c mo55423c(View view) {
        return this.f19097d.contains(view) ? C7918c.PARENT_VIEW : this.f19101h ? C7918c.OBSTRUCTION_VIEW : C7918c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55424c() {
        C7877a a = C7877a.m22148a();
        if (a != null) {
            for (C7875a next : a.mo55339c()) {
                View d = next.mo55305d();
                if (next.mo55306e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22302d(d);
                        if (d2 == null) {
                            this.f19098e.add(adSessionId);
                            this.f19094a.put(d, adSessionId);
                            m22300a(next);
                        } else {
                            this.f19099f.add(adSessionId);
                            this.f19096c.put(adSessionId, d);
                            this.f19100g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19099f.add(adSessionId);
                        this.f19100g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55425d() {
        this.f19094a.clear();
        this.f19095b.clear();
        this.f19096c.clear();
        this.f19097d.clear();
        this.f19098e.clear();
        this.f19099f.clear();
        this.f19100g.clear();
        this.f19101h = false;
    }

    /* renamed from: e */
    public void mo55426e() {
        this.f19101h = true;
    }
}
