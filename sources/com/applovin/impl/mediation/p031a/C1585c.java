package com.applovin.impl.mediation.p031a;

import android.os.SystemClock;
import com.applovin.impl.mediation.C1740g;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p051c.C1866a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.c */
public class C1585c extends C1583a {

    /* renamed from: c */
    private final AtomicReference<C1864c> f2089c;

    /* renamed from: d */
    private final AtomicBoolean f2090d;

    /* renamed from: e */
    private final AtomicBoolean f2091e;

    private C1585c(C1585c cVar, C1740g gVar) {
        super(cVar.mo13439T(), cVar.mo13429J(), cVar.mo13428I(), gVar, cVar.f2095b);
        this.f2091e = new AtomicBoolean();
        this.f2089c = cVar.f2089c;
        this.f2090d = cVar.f2090d;
    }

    public C1585c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        super(map, jSONObject, jSONObject2, (C1740g) null, mVar);
        this.f2091e = new AtomicBoolean();
        this.f2089c = new AtomicReference<>();
        this.f2090d = new AtomicBoolean();
    }

    /* renamed from: A */
    public long mo13403A() {
        return mo13455b("ahdm", ((Long) this.f2095b.mo14534a(C1866a.f3092x)).longValue());
    }

    /* renamed from: B */
    public boolean mo13404B() {
        return mo13456b("susaode", (Boolean) this.f2095b.mo14534a(C1866a.f3091w)).booleanValue();
    }

    /* renamed from: C */
    public String mo13405C() {
        return mo13457b("bcode", "");
    }

    /* renamed from: D */
    public String mo13406D() {
        return mo13450a("mcode", "");
    }

    /* renamed from: E */
    public boolean mo13407E() {
        return this.f2090d.get();
    }

    /* renamed from: F */
    public void mo13408F() {
        this.f2090d.set(true);
    }

    /* renamed from: G */
    public C1864c mo13409G() {
        return this.f2089c.getAndSet((Object) null);
    }

    /* renamed from: H */
    public AtomicBoolean mo13410H() {
        return this.f2091e;
    }

    /* renamed from: a */
    public C1583a mo13355a(C1740g gVar) {
        return new C1585c(this, gVar);
    }

    /* renamed from: a */
    public void mo13411a(C1864c cVar) {
        this.f2089c.set(cVar);
    }

    /* renamed from: u */
    public long mo13397u() {
        long b = mo13455b("ad_expiration_ms", -1);
        return b >= 0 ? b : mo13448a("ad_expiration_ms", ((Long) this.f2095b.mo14534a(C1866a.f3050D)).longValue());
    }

    /* renamed from: v */
    public long mo13412v() {
        long b = mo13455b("ad_hidden_timeout_ms", -1);
        return b >= 0 ? b : mo13448a("ad_hidden_timeout_ms", ((Long) this.f2095b.mo14534a(C1866a.f3053G)).longValue());
    }

    /* renamed from: w */
    public boolean mo13413w() {
        if (mo13456b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return mo13449a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f2095b.mo14534a(C1866a.f3054H)).booleanValue();
    }

    /* renamed from: x */
    public long mo13414x() {
        long b = mo13455b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        return b >= 0 ? b : mo13448a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f2095b.mo14534a(C1866a.f3055I)).longValue());
    }

    /* renamed from: y */
    public long mo13415y() {
        if (mo13390q() > 0) {
            return SystemClock.elapsedRealtime() - mo13390q();
        }
        return -1;
    }

    /* renamed from: z */
    public long mo13416z() {
        long b = mo13455b("fullscreen_display_delay_ms", -1);
        return b >= 0 ? b : ((Long) this.f2095b.mo14534a(C1866a.f3090v)).longValue();
    }
}
