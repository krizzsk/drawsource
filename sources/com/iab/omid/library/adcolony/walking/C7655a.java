package com.iab.omid.library.adcolony.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p225b.C7625a;
import com.iab.omid.library.adcolony.p225b.C7628c;
import com.iab.omid.library.adcolony.p227d.C7645f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
public class C7655a {

    /* renamed from: a */
    private final HashMap<View, String> f18515a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7656a> f18516b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18517c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18518d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18519e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18520f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18521g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18522h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18523i;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a */
    public static class C7656a {

        /* renamed from: a */
        private final C7628c f18524a;

        /* renamed from: b */
        private final ArrayList<String> f18525b = new ArrayList<>();

        public C7656a(C7628c cVar, String str) {
            this.f18524a = cVar;
            mo54451a(str);
        }

        /* renamed from: a */
        public C7628c mo54450a() {
            return this.f18524a;
        }

        /* renamed from: a */
        public void mo54451a(String str) {
            this.f18525b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54452b() {
            return this.f18525b;
        }
    }

    /* renamed from: a */
    private void m21163a(C7623a aVar) {
        for (C7628c a : aVar.mo54313a()) {
            m21164a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21164a(C7628c cVar, C7623a aVar) {
        View view = (View) cVar.mo54369a().get();
        if (view != null) {
            C7656a aVar2 = this.f18516b.get(view);
            if (aVar2 != null) {
                aVar2.mo54451a(aVar.getAdSessionId());
            } else {
                this.f18516b.put(view, new C7656a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21165e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21166f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7645f.m21114e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18518d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21166f(View view) {
        if (view.hasWindowFocus()) {
            this.f18522h.remove(view);
            return Boolean.FALSE;
        } else if (this.f18522h.containsKey(view)) {
            return this.f18522h.get(view);
        } else {
            Map<View, Boolean> map = this.f18522h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public String mo54439a(View view) {
        if (this.f18515a.size() == 0) {
            return null;
        }
        String str = this.f18515a.get(view);
        if (str != null) {
            this.f18515a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54440a(String str) {
        return this.f18521g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54441a() {
        return this.f18519e;
    }

    /* renamed from: b */
    public View mo54442b(String str) {
        return this.f18517c.get(str);
    }

    /* renamed from: b */
    public C7656a mo54443b(View view) {
        C7656a aVar = this.f18516b.get(view);
        if (aVar != null) {
            this.f18516b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54444b() {
        return this.f18520f;
    }

    /* renamed from: c */
    public C7666c mo54445c(View view) {
        return this.f18518d.contains(view) ? C7666c.PARENT_VIEW : this.f18523i ? C7666c.OBSTRUCTION_VIEW : C7666c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54446c() {
        C7625a a = C7625a.m21006a();
        if (a != null) {
            for (C7623a next : a.mo54353c()) {
                View e = next.mo54319e();
                if (next.mo54320f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21165e(e);
                        if (e2 == null) {
                            this.f18519e.add(adSessionId);
                            this.f18515a.put(e, adSessionId);
                            m21163a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18520f.add(adSessionId);
                            this.f18517c.put(adSessionId, e);
                            this.f18521g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18520f.add(adSessionId);
                        this.f18521g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54447d() {
        this.f18515a.clear();
        this.f18516b.clear();
        this.f18517c.clear();
        this.f18518d.clear();
        this.f18519e.clear();
        this.f18520f.clear();
        this.f18521g.clear();
        this.f18523i = false;
    }

    /* renamed from: d */
    public boolean mo54448d(View view) {
        if (!this.f18522h.containsKey(view)) {
            return true;
        }
        this.f18522h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: e */
    public void mo54449e() {
        this.f18523i = true;
    }
}
