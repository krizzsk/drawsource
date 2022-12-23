package com.ogury.p377ed.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hp */
public final class C10096hp {

    /* renamed from: a */
    private final Map<String, C10158jh> f25345a;

    /* renamed from: b */
    private final Map<String, C10109hx> f25346b;

    public C10096hp(Map<String, C10158jh> map, Map<String, C10109hx> map2) {
        C10263mq.m29882b(map, "webViewsMap");
        C10263mq.m29882b(map2, "webViewStates");
        this.f25345a = map;
        this.f25346b = map2;
    }

    /* renamed from: e */
    private final List<C10158jh> m29371e() {
        List<C10158jh> arrayList = new ArrayList<>();
        for (C10158jh next : this.f25345a.values()) {
            C10109hx hxVar = this.f25346b.get(C10092hn.m29338b(next));
            if (hxVar != null && hxVar.mo64881d()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo64844a() {
        for (C10158jh d : m29371e()) {
            d.mo64972d();
        }
    }

    /* renamed from: a */
    public final void mo64845a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C10263mq.m29882b(str, "event");
        C10263mq.m29882b(str2, "webViewId");
        C10263mq.m29882b(str3, "url");
        C10263mq.m29882b(str4, "pageTitle");
        for (C10158jh a : m29371e()) {
            C10080hc hcVar = C10080hc.f25311a;
            C10161jk.m29715a(a, C10080hc.m29294a(str, z, z2, str2, str3, str4));
        }
    }

    /* renamed from: b */
    public final void mo64846b() {
        for (C10158jh a : m29371e()) {
            C10080hc hcVar = C10080hc.f25311a;
            C10161jk.m29715a(a, C10080hc.m29297b());
        }
    }

    /* renamed from: c */
    public final void mo64847c() {
        for (C10158jh e : m29371e()) {
            e.mo64973e();
        }
    }

    /* renamed from: a */
    public static void m29370a(C10158jh jhVar, String str, String str2) {
        C10263mq.m29882b(jhVar, "webView");
        C10263mq.m29882b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10263mq.m29882b(str2, "webViewId");
        C10080hc hcVar = C10080hc.f25311a;
        C10161jk.m29715a(jhVar, C10080hc.m29301b(str, "{webviewId:\"" + str2 + "\"}"));
    }

    /* renamed from: d */
    public final boolean mo64848d() {
        Iterable<C10109hx> values = this.f25346b.values();
        if ((values instanceof Collection) && ((Collection) values).isEmpty()) {
            return true;
        }
        for (C10109hx b : values) {
            if (b.mo64879b()) {
                return false;
            }
        }
        return true;
    }
}
