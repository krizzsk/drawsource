package com.applovin.impl.mediation.p031a;

import android.view.View;
import com.applovin.impl.mediation.C1740g;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.b */
public class C1584b extends C1587e {
    private C1584b(C1584b bVar, C1740g gVar) {
        super(bVar.mo13439T(), bVar.mo13429J(), bVar.mo13428I(), gVar, bVar.f2095b);
    }

    public C1584b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        super(map, jSONObject, jSONObject2, (C1740g) null, mVar);
    }

    /* renamed from: A */
    public boolean mo13395A() {
        return mo13456b("proe", (Boolean) this.f2095b.mo14534a(C1866a.f3056J)).booleanValue();
    }

    /* renamed from: B */
    public long mo13396B() {
        return Utils.parseColor(mo13457b("bg_color", (String) null));
    }

    /* renamed from: a */
    public C1583a mo13355a(C1740g gVar) {
        return new C1584b(this, gVar);
    }

    /* renamed from: u */
    public int mo13397u() {
        int b = mo13454b("ad_view_width", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: v */
    public int mo13398v() {
        int b = mo13454b("ad_view_height", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: w */
    public View mo13399w() {
        if (!mo13364e() || this.f2085a == null) {
            return null;
        }
        return this.f2085a.mo13830a();
    }

    /* renamed from: x */
    public long mo13400x() {
        return mo13455b("viewability_imp_delay_ms", ((Long) this.f2095b.mo14534a(C1867b.f3161bI)).longValue());
    }

    /* renamed from: y */
    public boolean mo13401y() {
        return mo13402z() >= 0;
    }

    /* renamed from: z */
    public long mo13402z() {
        long b = mo13455b("ad_refresh_ms", -1);
        return b >= 0 ? b : mo13448a("ad_refresh_ms", ((Long) this.f2095b.mo14534a(C1866a.f3081m)).longValue());
    }
}
