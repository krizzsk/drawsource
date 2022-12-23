package com.iab.omid.library.mmadbridge.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.p261b.C7930c;
import com.iab.omid.library.mmadbridge.p263d.C7947f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a */
public class C7957a {

    /* renamed from: a */
    private final HashMap<View, String> f19210a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7958a> f19211b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19212c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19213d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19214e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19215f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19216g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f19217h = new WeakHashMap();

    /* renamed from: i */
    private boolean f19218i;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a$a */
    public static class C7958a {

        /* renamed from: a */
        private final C7930c f19219a;

        /* renamed from: b */
        private final ArrayList<String> f19220b = new ArrayList<>();

        public C7958a(C7930c cVar, String str) {
            this.f19219a = cVar;
            mo55627a(str);
        }

        /* renamed from: a */
        public C7930c mo55626a() {
            return this.f19219a;
        }

        /* renamed from: a */
        public void mo55627a(String str) {
            this.f19220b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55628b() {
            return this.f19220b;
        }
    }

    /* renamed from: a */
    private void m22528a(C7925a aVar) {
        for (C7930c a : aVar.mo55489a()) {
            m22529a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22529a(C7930c cVar, C7925a aVar) {
        View view = (View) cVar.mo55545a().get();
        if (view != null) {
            C7958a aVar2 = this.f19211b.get(view);
            if (aVar2 != null) {
                aVar2.mo55627a(aVar.getAdSessionId());
            } else {
                this.f19211b.put(view, new C7958a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m22530e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m22531f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7947f.m22479e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19213d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m22531f(View view) {
        if (view.hasWindowFocus()) {
            this.f19217h.remove(view);
            return false;
        } else if (this.f19217h.containsKey(view)) {
            return this.f19217h.get(view);
        } else {
            this.f19217h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo55615a(View view) {
        if (this.f19210a.size() == 0) {
            return null;
        }
        String str = this.f19210a.get(view);
        if (str != null) {
            this.f19210a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55616a(String str) {
        return this.f19216g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55617a() {
        return this.f19214e;
    }

    /* renamed from: b */
    public View mo55618b(String str) {
        return this.f19212c.get(str);
    }

    /* renamed from: b */
    public C7958a mo55619b(View view) {
        C7958a aVar = this.f19211b.get(view);
        if (aVar != null) {
            this.f19211b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55620b() {
        return this.f19215f;
    }

    /* renamed from: c */
    public C7968c mo55621c(View view) {
        return this.f19213d.contains(view) ? C7968c.PARENT_VIEW : this.f19218i ? C7968c.OBSTRUCTION_VIEW : C7968c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55622c() {
        C7927a a = C7927a.m22371a();
        if (a != null) {
            for (C7925a next : a.mo55529c()) {
                View e = next.mo55495e();
                if (next.mo55496f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m22530e(e);
                        if (e2 == null) {
                            this.f19214e.add(adSessionId);
                            this.f19210a.put(e, adSessionId);
                            m22528a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f19215f.add(adSessionId);
                            this.f19212c.put(adSessionId, e);
                            this.f19216g.put(adSessionId, e2);
                        }
                    } else {
                        this.f19215f.add(adSessionId);
                        this.f19216g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55623d() {
        this.f19210a.clear();
        this.f19211b.clear();
        this.f19212c.clear();
        this.f19213d.clear();
        this.f19214e.clear();
        this.f19215f.clear();
        this.f19216g.clear();
        this.f19218i = false;
    }

    /* renamed from: d */
    public boolean mo55624d(View view) {
        if (!this.f19217h.containsKey(view)) {
            return true;
        }
        this.f19217h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo55625e() {
        this.f19218i = true;
    }
}
