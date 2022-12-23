package com.iab.omid.library.oguryco.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.p267b.C7977a;
import com.iab.omid.library.oguryco.p267b.C7981c;
import com.iab.omid.library.oguryco.p269d.C7998f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.oguryco.walking.a */
public class C8008a {

    /* renamed from: a */
    private final HashMap<View, String> f19332a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8009a> f19333b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19334c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19335d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19336e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19337f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19338g = new HashMap<>();

    /* renamed from: h */
    private boolean f19339h;

    /* renamed from: com.iab.omid.library.oguryco.walking.a$a */
    public static class C8009a {

        /* renamed from: a */
        private final C7981c f19340a;

        /* renamed from: b */
        private final ArrayList<String> f19341b = new ArrayList<>();

        public C8009a(C7981c cVar, String str) {
            this.f19340a = cVar;
            mo55841a(str);
        }

        /* renamed from: a */
        public C7981c mo55840a() {
            return this.f19340a;
        }

        /* renamed from: a */
        public void mo55841a(String str) {
            this.f19341b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55842b() {
            return this.f19341b;
        }
    }

    /* renamed from: a */
    private void m22759a(C7975a aVar) {
        for (C7981c a : aVar.mo55688a()) {
            m22760a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22760a(C7981c cVar, C7975a aVar) {
        View view = (View) cVar.mo55760a().get();
        if (view != null) {
            C8009a aVar2 = this.f19333b.get(view);
            if (aVar2 != null) {
                aVar2.mo55841a(aVar.getAdSessionId());
            } else {
                this.f19333b.put(view, new C8009a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22761d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7998f.m22710e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19335d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55830a(View view) {
        if (this.f19332a.size() == 0) {
            return null;
        }
        String str = this.f19332a.get(view);
        if (str != null) {
            this.f19332a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55831a(String str) {
        return this.f19338g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55832a() {
        return this.f19336e;
    }

    /* renamed from: b */
    public View mo55833b(String str) {
        return this.f19334c.get(str);
    }

    /* renamed from: b */
    public C8009a mo55834b(View view) {
        C8009a aVar = this.f19333b.get(view);
        if (aVar != null) {
            this.f19333b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55835b() {
        return this.f19337f;
    }

    /* renamed from: c */
    public C8019c mo55836c(View view) {
        return this.f19335d.contains(view) ? C8019c.PARENT_VIEW : this.f19339h ? C8019c.OBSTRUCTION_VIEW : C8019c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55837c() {
        C7977a a = C7977a.m22601a();
        if (a != null) {
            for (C7975a next : a.mo55750c()) {
                View d = next.mo55692d();
                if (next.mo55693e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22761d(d);
                        if (d2 == null) {
                            this.f19336e.add(adSessionId);
                            this.f19332a.put(d, adSessionId);
                            m22759a(next);
                        } else {
                            this.f19337f.add(adSessionId);
                            this.f19334c.put(adSessionId, d);
                            this.f19338g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19337f.add(adSessionId);
                        this.f19338g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55838d() {
        this.f19332a.clear();
        this.f19333b.clear();
        this.f19334c.clear();
        this.f19335d.clear();
        this.f19336e.clear();
        this.f19337f.clear();
        this.f19338g.clear();
        this.f19339h = false;
    }

    /* renamed from: e */
    public void mo55839e() {
        this.f19339h = true;
    }
}
