package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.d */
public class C4416d implements C4418f {

    /* renamed from: a */
    public Long f10847a = null;

    /* renamed from: b */
    public Long f10848b = null;

    /* renamed from: c */
    public Long f10849c = null;

    /* renamed from: d */
    public Long f10850d = null;

    /* renamed from: e */
    public Long f10851e = null;

    /* renamed from: f */
    public Long f10852f = null;

    /* renamed from: g */
    public Long f10853g = null;

    /* renamed from: h */
    public Long f10854h = null;

    /* renamed from: a */
    public boolean mo24597a() {
        return true;
    }

    /* renamed from: b */
    public Long mo24598b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10853g = valueOf;
        return valueOf;
    }

    /* renamed from: c */
    public Long mo24599c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10847a = valueOf;
        return valueOf;
    }

    /* renamed from: d */
    public Long mo24600d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10850d = valueOf;
        return valueOf;
    }

    /* renamed from: e */
    public Long mo24601e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10852f = valueOf;
        return valueOf;
    }

    /* renamed from: f */
    public Long mo24602f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10848b = valueOf;
        return valueOf;
    }

    /* renamed from: g */
    public Long mo24603g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10849c = valueOf;
        return valueOf;
    }

    /* renamed from: h */
    public Long mo24604h() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10854h = valueOf;
        return valueOf;
    }

    /* renamed from: i */
    public Long mo24605i() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f10851e = valueOf;
        return valueOf;
    }

    /* renamed from: j */
    public Map<String, Long> mo24606j() {
        HashMap hashMap = new HashMap();
        Long l = this.f10848b;
        if (!(l == null || this.f10847a == null)) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f10847a.longValue()));
        }
        Long l2 = this.f10854h;
        if (!(l2 == null || this.f10848b == null)) {
            hashMap.put("sdk_got_response_from_markup_url", Long.valueOf(l2.longValue() - this.f10848b.longValue()));
        }
        Long l3 = this.f10850d;
        if (!(l3 == null || this.f10854h == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f10854h.longValue()));
        }
        Long l4 = this.f10849c;
        if (!(l4 == null || this.f10848b == null)) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l4.longValue() - this.f10848b.longValue()));
        }
        Long l5 = this.f10850d;
        if (!(l5 == null || this.f10849c == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l5.longValue() - this.f10849c.longValue()));
        }
        Long l6 = this.f10851e;
        if (!(l6 == null || this.f10850d == null)) {
            hashMap.put("ad_loaded_result", Long.valueOf(l6.longValue() - this.f10850d.longValue()));
        }
        Long l7 = this.f10852f;
        if (!(l7 == null || this.f10851e == null)) {
            hashMap.put("publisher_notified", Long.valueOf(l7.longValue() - this.f10851e.longValue()));
        }
        Long l8 = this.f10853g;
        if (!(l8 == null || this.f10847a == null)) {
            hashMap.put("roundtrip", Long.valueOf(l8.longValue() - this.f10847a.longValue()));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetricsCollectorData{");
        if (!(this.f10847a == null || this.f10848b == null)) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.f10848b.longValue() - this.f10847a.longValue());
        }
        if (!(this.f10854h == null || this.f10848b == null)) {
            sb.append(", sdk_got_response_from_markup_url=");
            sb.append(this.f10854h.longValue() - this.f10848b.longValue());
        }
        if (!(this.f10849c == null || this.f10848b == null)) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.f10849c.longValue() - this.f10848b.longValue());
        }
        if (!(this.f10850d == null || this.f10849c == null)) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.f10850d.longValue() - this.f10849c.longValue());
        }
        if (!(this.f10851e == null || this.f10850d == null)) {
            sb.append(", ad_loaded_result=");
            sb.append(this.f10851e.longValue() - this.f10850d.longValue());
        }
        if (!(this.f10852f == null || this.f10851e == null)) {
            sb.append(", publisher_notified=");
            sb.append(this.f10852f.longValue() - this.f10851e.longValue());
        }
        if (!(this.f10853g == null || this.f10847a == null)) {
            sb.append(", roundtrip=");
            sb.append(this.f10853g.longValue() - this.f10847a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
