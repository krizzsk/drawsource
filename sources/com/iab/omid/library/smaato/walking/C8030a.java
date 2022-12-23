package com.iab.omid.library.smaato.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.smaato.adsession.C8021a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import p012c.C0689a;
import p012c.C0692c;
import p397e.C12470f;

/* renamed from: com.iab.omid.library.smaato.walking.a */
public class C8030a {

    /* renamed from: a */
    private final HashMap<View, String> f19410a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8031a> f19411b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19412c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19413d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19414e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19415f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19416g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f19417h = new WeakHashMap();

    /* renamed from: i */
    private boolean f19418i;

    /* renamed from: com.iab.omid.library.smaato.walking.a$a */
    public static class C8031a {

        /* renamed from: a */
        private final C0692c f19419a;

        /* renamed from: b */
        private final ArrayList<String> f19420b = new ArrayList<>();

        public C8031a(C0692c cVar, String str) {
            this.f19419a = cVar;
            mo55982a(str);
        }

        /* renamed from: a */
        public C0692c mo55981a() {
            return this.f19419a;
        }

        /* renamed from: a */
        public void mo55982a(String str) {
            this.f19420b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55983b() {
            return this.f19420b;
        }
    }

    /* renamed from: a */
    private String m22875a(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m22878b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a = C12470f.m33318a(view);
            if (a != null) {
                return a;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19413d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    private void m22876a(C0692c cVar, C8021a aVar) {
        View view = (View) cVar.mo10282c().get();
        if (view != null) {
            C8031a aVar2 = this.f19411b.get(view);
            if (aVar2 != null) {
                aVar2.mo55982a(aVar.getAdSessionId());
            } else {
                this.f19411b.put(view, new C8031a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: a */
    private void m22877a(C8021a aVar) {
        for (C0692c a : aVar.mo55902d()) {
            m22876a(a, aVar);
        }
    }

    /* renamed from: b */
    private Boolean m22878b(View view) {
        if (view.hasWindowFocus()) {
            this.f19417h.remove(view);
            return Boolean.FALSE;
        } else if (this.f19417h.containsKey(view)) {
            return this.f19417h.get(view);
        } else {
            Map<View, Boolean> map = this.f19417h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View mo55970a(String str) {
        return this.f19412c.get(str);
    }

    /* renamed from: a */
    public void mo55971a() {
        this.f19410a.clear();
        this.f19411b.clear();
        this.f19412c.clear();
        this.f19413d.clear();
        this.f19414e.clear();
        this.f19415f.clear();
        this.f19416g.clear();
        this.f19418i = false;
    }

    /* renamed from: b */
    public String mo55972b(String str) {
        return this.f19416g.get(str);
    }

    /* renamed from: b */
    public HashSet<String> mo55973b() {
        return this.f19415f;
    }

    /* renamed from: c */
    public C8031a mo55974c(View view) {
        C8031a aVar = this.f19411b.get(view);
        if (aVar != null) {
            this.f19411b.remove(view);
        }
        return aVar;
    }

    /* renamed from: c */
    public HashSet<String> mo55975c() {
        return this.f19414e;
    }

    /* renamed from: d */
    public String mo55976d(View view) {
        if (this.f19410a.size() == 0) {
            return null;
        }
        String str = this.f19410a.get(view);
        if (str != null) {
            this.f19410a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public void mo55977d() {
        this.f19418i = true;
    }

    /* renamed from: e */
    public C8032b mo55978e(View view) {
        return this.f19413d.contains(view) ? C8032b.PARENT_VIEW : this.f19418i ? C8032b.OBSTRUCTION_VIEW : C8032b.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void mo55979e() {
        C0689a c = C0689a.m34c();
        if (c != null) {
            for (C8021a next : c.mo10261a()) {
                View c2 = next.mo55901c();
                if (next.mo55904f()) {
                    String adSessionId = next.getAdSessionId();
                    if (c2 != null) {
                        String a = m22875a(c2);
                        if (a == null) {
                            this.f19414e.add(adSessionId);
                            this.f19410a.put(c2, adSessionId);
                            m22877a(next);
                        } else if (a != "noWindowFocus") {
                            this.f19415f.add(adSessionId);
                            this.f19412c.put(adSessionId, c2);
                            this.f19416g.put(adSessionId, a);
                        }
                    } else {
                        this.f19415f.add(adSessionId);
                        this.f19416g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo55980f(View view) {
        if (!this.f19417h.containsKey(view)) {
            return true;
        }
        this.f19417h.put(view, Boolean.TRUE);
        return false;
    }
}
