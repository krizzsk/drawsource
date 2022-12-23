package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.tapjoy.internal.dy */
public final class C11381dy {

    /* renamed from: a */
    final HashMap<View, String> f27169a = new HashMap<>();

    /* renamed from: b */
    final HashMap<View, C11382a> f27170b = new HashMap<>();

    /* renamed from: c */
    final HashMap<String, View> f27171c = new HashMap<>();

    /* renamed from: d */
    final HashSet<View> f27172d = new HashSet<>();

    /* renamed from: e */
    final HashSet<String> f27173e = new HashSet<>();

    /* renamed from: f */
    final HashSet<String> f27174f = new HashSet<>();

    /* renamed from: g */
    final HashMap<String, String> f27175g = new HashMap<>();

    /* renamed from: h */
    boolean f27176h;

    /* renamed from: com.tapjoy.internal.dy$a */
    public static class C11382a {

        /* renamed from: a */
        public final C11354df f27177a;

        /* renamed from: b */
        public final ArrayList<String> f27178b = new ArrayList<>();

        public C11382a(C11354df dfVar, String str) {
            this.f27177a = dfVar;
            mo69829a(str);
        }

        /* renamed from: a */
        public final void mo69829a(String str) {
            this.f27178b.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69828a(C11344cx cxVar) {
        for (C11354df next : cxVar.f27078b) {
            View view = (View) next.f27117a.get();
            if (view != null) {
                C11382a aVar = this.f27170b.get(view);
                if (aVar != null) {
                    aVar.mo69829a(cxVar.f27082f);
                } else {
                    this.f27170b.put(view, new C11382a(next, cxVar.f27082f));
                }
            }
        }
    }
}
