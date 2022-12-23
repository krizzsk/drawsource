package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.it */
public final class C11631it extends C11630is<C11632a> {

    /* renamed from: c */
    public final String f28020c;

    /* renamed from: d */
    public boolean f28021d = false;

    /* renamed from: e */
    private final C11558hj f28022e;

    /* renamed from: f */
    private final C11450fc f28023f;

    /* renamed from: g */
    private final C11432ew f28024g;

    /* renamed from: h */
    private final C11471fj f28025h;

    /* renamed from: i */
    private Context f28026i;

    /* renamed from: c */
    public final String mo69757c() {
        return "placement";
    }

    public C11631it(C11558hj hjVar, C11450fc fcVar, C11432ew ewVar, C11471fj fjVar, String str, Context context) {
        this.f28022e = hjVar;
        this.f28023f = fcVar;
        this.f28024g = ewVar;
        this.f28025h = fjVar;
        this.f28020c = str;
        this.f28026i = context;
    }

    /* renamed from: e */
    public final Map<String, Object> mo69759e() {
        Map<String, Object> e = super.mo69759e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C11295bg(C11592hz.m31780a(this.f28023f)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C11295bg(C11592hz.m31776a(this.f28024g)));
        e.put("user", new C11295bg(C11592hz.m31781a(this.f28025h)));
        e.put("placement", this.f28020c);
        return e;
    }

    /* renamed from: com.tapjoy.internal.it$a */
    public static class C11632a {

        /* renamed from: a */
        public C11578hq f28027a;

        /* renamed from: b */
        public final List<String> f28028b;

        public C11632a(C11578hq hqVar, List<String> list) {
            this.f28027a = hqVar;
            this.f28028b = list;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo69752a(C11296bh bhVar) {
        bhVar.mo69722h();
        C11604ie ieVar = null;
        C11596ib ibVar = null;
        List list = null;
        while (bhVar.mo69724j()) {
            String l = bhVar.mo69726l();
            if ("interstitial".equals(l)) {
                ieVar = (C11604ie) bhVar.mo69707a(C11604ie.f27901n);
            } else if ("contextual_button".equals(l)) {
                ibVar = (C11596ib) bhVar.mo69707a(C11596ib.f27877d);
            } else if ("enabled_placements".equals(l)) {
                list = bhVar.mo69713c();
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
        if (ieVar != null && (ieVar.mo70192a() || ieVar.mo70193b())) {
            return new C11632a(new C11572ho(this.f28022e, this.f28020c, ieVar, this.f28026i), list);
        }
        if (ibVar != null) {
            return new C11632a(new C11550hf(this.f28022e, this.f28020c, ibVar, this.f28026i), list);
        }
        return new C11632a(new C11577hp(), list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo69760f() {
        C11632a aVar = (C11632a) super.mo69760f();
        if (!(aVar.f28027a instanceof C11577hp)) {
            aVar.f28027a.mo70091b();
            if (!aVar.f28027a.mo70092c()) {
                Object[] objArr = new Object[1];
                aVar.f28027a = new C11577hp();
            }
        }
        return aVar;
    }
}
