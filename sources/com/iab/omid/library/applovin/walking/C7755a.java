package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p237b.C7725a;
import com.iab.omid.library.applovin.p237b.C7728c;
import com.iab.omid.library.applovin.p239d.C7745f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
public class C7755a {

    /* renamed from: a */
    private final HashMap<View, String> f18749a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7756a> f18750b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18751c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18752d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18753e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18754f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18755g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18756h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18757i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    public static class C7756a {

        /* renamed from: a */
        private final C7728c f18758a;

        /* renamed from: b */
        private final ArrayList<String> f18759b = new ArrayList<>();

        public C7756a(C7728c cVar, String str) {
            this.f18758a = cVar;
            mo54849a(str);
        }

        /* renamed from: a */
        public C7728c mo54848a() {
            return this.f18758a;
        }

        /* renamed from: a */
        public void mo54849a(String str) {
            this.f18759b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54850b() {
            return this.f18759b;
        }
    }

    /* renamed from: a */
    private void m21623a(C7723a aVar) {
        for (C7728c a : aVar.mo54711a()) {
            m21624a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21624a(C7728c cVar, C7723a aVar) {
        View view = (View) cVar.mo54767a().get();
        if (view != null) {
            C7756a aVar2 = this.f18750b.get(view);
            if (aVar2 != null) {
                aVar2.mo54849a(aVar.getAdSessionId());
            } else {
                this.f18750b.put(view, new C7756a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21625e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21626f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7745f.m21574e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18752d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21626f(View view) {
        if (view.hasWindowFocus()) {
            this.f18756h.remove(view);
            return false;
        } else if (this.f18756h.containsKey(view)) {
            return this.f18756h.get(view);
        } else {
            this.f18756h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo54837a(View view) {
        if (this.f18749a.size() == 0) {
            return null;
        }
        String str = this.f18749a.get(view);
        if (str != null) {
            this.f18749a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54838a(String str) {
        return this.f18755g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54839a() {
        return this.f18753e;
    }

    /* renamed from: b */
    public View mo54840b(String str) {
        return this.f18751c.get(str);
    }

    /* renamed from: b */
    public C7756a mo54841b(View view) {
        C7756a aVar = this.f18750b.get(view);
        if (aVar != null) {
            this.f18750b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54842b() {
        return this.f18754f;
    }

    /* renamed from: c */
    public C7766c mo54843c(View view) {
        return this.f18752d.contains(view) ? C7766c.PARENT_VIEW : this.f18757i ? C7766c.OBSTRUCTION_VIEW : C7766c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54844c() {
        C7725a a = C7725a.m21466a();
        if (a != null) {
            for (C7723a next : a.mo54751c()) {
                View e = next.mo54717e();
                if (next.mo54718f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21625e(e);
                        if (e2 == null) {
                            this.f18753e.add(adSessionId);
                            this.f18749a.put(e, adSessionId);
                            m21623a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18754f.add(adSessionId);
                            this.f18751c.put(adSessionId, e);
                            this.f18755g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18754f.add(adSessionId);
                        this.f18755g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54845d() {
        this.f18749a.clear();
        this.f18750b.clear();
        this.f18751c.clear();
        this.f18752d.clear();
        this.f18753e.clear();
        this.f18754f.clear();
        this.f18755g.clear();
        this.f18757i = false;
    }

    /* renamed from: d */
    public boolean mo54846d(View view) {
        if (!this.f18756h.containsKey(view)) {
            return true;
        }
        this.f18756h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo54847e() {
        this.f18757i = true;
    }
}
