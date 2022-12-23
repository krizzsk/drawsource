package com.iab.omid.library.fyber.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.p243b.C7779c;
import com.iab.omid.library.fyber.p245d.C7796f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.fyber.walking.a */
public class C7806a {

    /* renamed from: a */
    private final HashMap<View, String> f18866a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7807a> f18867b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18868c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18869d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18870e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18871f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18872g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18873h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18874i;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a */
    public static class C7807a {

        /* renamed from: a */
        private final C7779c f18875a;

        /* renamed from: b */
        private final ArrayList<String> f18876b = new ArrayList<>();

        public C7807a(C7779c cVar, String str) {
            this.f18875a = cVar;
            mo55048a(str);
        }

        /* renamed from: a */
        public C7779c mo55047a() {
            return this.f18875a;
        }

        /* renamed from: a */
        public void mo55048a(String str) {
            this.f18876b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55049b() {
            return this.f18876b;
        }
    }

    /* renamed from: a */
    private void m21853a(C7774a aVar) {
        for (C7779c a : aVar.mo54910a()) {
            m21854a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21854a(C7779c cVar, C7774a aVar) {
        View view = (View) cVar.mo54966a().get();
        if (view != null) {
            C7807a aVar2 = this.f18867b.get(view);
            if (aVar2 != null) {
                aVar2.mo55048a(aVar.getAdSessionId());
            } else {
                this.f18867b.put(view, new C7807a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21855e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21856f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7796f.m21804e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18869d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21856f(View view) {
        if (view.hasWindowFocus()) {
            this.f18873h.remove(view);
            return false;
        } else if (this.f18873h.containsKey(view)) {
            return this.f18873h.get(view);
        } else {
            this.f18873h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo55036a(View view) {
        if (this.f18866a.size() == 0) {
            return null;
        }
        String str = this.f18866a.get(view);
        if (str != null) {
            this.f18866a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55037a(String str) {
        return this.f18872g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55038a() {
        return this.f18870e;
    }

    /* renamed from: b */
    public View mo55039b(String str) {
        return this.f18868c.get(str);
    }

    /* renamed from: b */
    public C7807a mo55040b(View view) {
        C7807a aVar = this.f18867b.get(view);
        if (aVar != null) {
            this.f18867b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55041b() {
        return this.f18871f;
    }

    /* renamed from: c */
    public C7817c mo55042c(View view) {
        return this.f18869d.contains(view) ? C7817c.PARENT_VIEW : this.f18874i ? C7817c.OBSTRUCTION_VIEW : C7817c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55043c() {
        C7776a a = C7776a.m21696a();
        if (a != null) {
            for (C7774a next : a.mo54950c()) {
                View e = next.mo54916e();
                if (next.mo54917f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21855e(e);
                        if (e2 == null) {
                            this.f18870e.add(adSessionId);
                            this.f18866a.put(e, adSessionId);
                            m21853a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18871f.add(adSessionId);
                            this.f18868c.put(adSessionId, e);
                            this.f18872g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18871f.add(adSessionId);
                        this.f18872g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55044d() {
        this.f18866a.clear();
        this.f18867b.clear();
        this.f18868c.clear();
        this.f18869d.clear();
        this.f18870e.clear();
        this.f18871f.clear();
        this.f18872g.clear();
        this.f18874i = false;
    }

    /* renamed from: d */
    public boolean mo55045d(View view) {
        if (!this.f18873h.containsKey(view)) {
            return true;
        }
        this.f18873h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo55046e() {
        this.f18874i = true;
    }
}
