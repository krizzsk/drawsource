package com.applovin.impl.mediation.p031a;

import com.applovin.impl.mediation.C1740g;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.e */
public abstract class C1587e extends C1583a {
    protected C1587e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1740g gVar, C1969m mVar) {
        super(map, jSONObject, jSONObject2, gVar, mVar);
    }

    /* renamed from: C */
    public int mo13422C() {
        MaxAdFormat format = getFormat();
        C1867b bVar = format == MaxAdFormat.BANNER ? C1867b.f3162bJ : format == MaxAdFormat.MREC ? C1867b.f3164bL : format == MaxAdFormat.LEADER ? C1867b.f3166bN : format == MaxAdFormat.NATIVE ? C1867b.f3168bP : null;
        if (bVar != null) {
            return mo13454b("viewability_min_width", ((Integer) this.f2095b.mo14534a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: D */
    public int mo13423D() {
        MaxAdFormat format = getFormat();
        C1867b bVar = format == MaxAdFormat.BANNER ? C1867b.f3163bK : format == MaxAdFormat.MREC ? C1867b.f3165bM : format == MaxAdFormat.LEADER ? C1867b.f3167bO : format == MaxAdFormat.NATIVE ? C1867b.f3169bQ : null;
        if (bVar != null) {
            return mo13454b("viewability_min_height", ((Integer) this.f2095b.mo14534a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: E */
    public float mo13424E() {
        return mo13446a("viewability_min_alpha", ((Float) this.f2095b.mo14534a(C1866a.f3170bR)).floatValue() / 100.0f);
    }

    /* renamed from: F */
    public int mo13425F() {
        return mo13454b("viewability_min_pixels", -1);
    }

    /* renamed from: G */
    public boolean mo13426G() {
        return mo13425F() >= 0;
    }

    /* renamed from: H */
    public long mo13427H() {
        return mo13455b("viewability_timer_min_visible_ms", ((Long) this.f2095b.mo14534a(C1866a.f3171bS)).longValue());
    }
}
