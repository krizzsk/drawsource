package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.bp */
public final class C9867bp {

    /* renamed from: a */
    public static final C9867bp f24863a = new C9867bp();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C9852bc f24864b = new C9852bc();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, Rect> f24865c = new LinkedHashMap();

    private C9867bp() {
    }

    /* renamed from: a */
    public static Rect m28487a(String str) {
        C10263mq.m29882b(str, "adUnitId");
        return f24865c.get(str);
    }

    /* renamed from: com.ogury.ed.internal.bp$a */
    static final class C9868a extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10044g f24866a;

        /* renamed from: b */
        final /* synthetic */ String f24867b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9868a(C10044g gVar, String str) {
            super(0);
            this.f24866a = gVar;
            this.f24867b = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28492b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28492b() {
            C9852bc unused = C9867bp.f24864b;
            C9867bp.f24865c.put(this.f24867b, C9852bc.m28439a(this.f24866a));
        }
    }

    /* renamed from: a */
    public static void m28490a(C10044g gVar, String str) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(str, "adUnitId");
        gVar.setOnOverlayPositionChanged(new C9868a(gVar, str));
    }

    /* renamed from: a */
    public static Rect m28488a(String str, C10044g gVar) {
        C10263mq.m29882b(str, "adUnitId");
        C10263mq.m29882b(gVar, "adLayout");
        Rect a = m28487a(str);
        if (a == null) {
            return null;
        }
        Rect rect = new Rect(a);
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            rect.top -= C9852bc.m28441c(parentAsViewGroup).top;
        }
        return rect;
    }
}
