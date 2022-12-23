package com.iab.omid.library.amazon.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.p231b.C7678c;
import com.iab.omid.library.amazon.p233d.C7695f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.amazon.walking.a */
public class C7705a {

    /* renamed from: a */
    private final HashMap<View, String> f18632a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7706a> f18633b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18634c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18635d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18636e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18637f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18638g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18639h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18640i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a */
    public static class C7706a {

        /* renamed from: a */
        private final C7678c f18641a;

        /* renamed from: b */
        private final ArrayList<String> f18642b = new ArrayList<>();

        public C7706a(C7678c cVar, String str) {
            this.f18641a = cVar;
            mo54650a(str);
        }

        /* renamed from: a */
        public C7678c mo54649a() {
            return this.f18641a;
        }

        /* renamed from: a */
        public void mo54650a(String str) {
            this.f18642b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54651b() {
            return this.f18642b;
        }
    }

    /* renamed from: a */
    private void m21393a(C7673a aVar) {
        for (C7678c a : aVar.mo54512a()) {
            m21394a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21394a(C7678c cVar, C7673a aVar) {
        View view = (View) cVar.mo54568a().get();
        if (view != null) {
            C7706a aVar2 = this.f18633b.get(view);
            if (aVar2 != null) {
                aVar2.mo54650a(aVar.getAdSessionId());
            } else {
                this.f18633b.put(view, new C7706a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21395e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21396f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7695f.m21344e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18635d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21396f(View view) {
        if (view.hasWindowFocus()) {
            this.f18639h.remove(view);
            return false;
        } else if (this.f18639h.containsKey(view)) {
            return this.f18639h.get(view);
        } else {
            this.f18639h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo54638a(View view) {
        if (this.f18632a.size() == 0) {
            return null;
        }
        String str = this.f18632a.get(view);
        if (str != null) {
            this.f18632a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54639a(String str) {
        return this.f18638g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54640a() {
        return this.f18636e;
    }

    /* renamed from: b */
    public View mo54641b(String str) {
        return this.f18634c.get(str);
    }

    /* renamed from: b */
    public C7706a mo54642b(View view) {
        C7706a aVar = this.f18633b.get(view);
        if (aVar != null) {
            this.f18633b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54643b() {
        return this.f18637f;
    }

    /* renamed from: c */
    public C7716c mo54644c(View view) {
        return this.f18635d.contains(view) ? C7716c.PARENT_VIEW : this.f18640i ? C7716c.OBSTRUCTION_VIEW : C7716c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54645c() {
        C7675a a = C7675a.m21236a();
        if (a != null) {
            for (C7673a next : a.mo54552c()) {
                View e = next.mo54518e();
                if (next.mo54519f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21395e(e);
                        if (e2 == null) {
                            this.f18636e.add(adSessionId);
                            this.f18632a.put(e, adSessionId);
                            m21393a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18637f.add(adSessionId);
                            this.f18634c.put(adSessionId, e);
                            this.f18638g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18637f.add(adSessionId);
                        this.f18638g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54646d() {
        this.f18632a.clear();
        this.f18633b.clear();
        this.f18634c.clear();
        this.f18635d.clear();
        this.f18636e.clear();
        this.f18637f.clear();
        this.f18638g.clear();
        this.f18640i = false;
    }

    /* renamed from: d */
    public boolean mo54647d(View view) {
        if (!this.f18639h.containsKey(view)) {
            return true;
        }
        this.f18639h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo54648e() {
        this.f18640i = true;
    }
}
