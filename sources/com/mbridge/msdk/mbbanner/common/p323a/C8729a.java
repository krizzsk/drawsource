package com.mbridge.msdk.mbbanner.common.p323a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8660r;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.a */
/* compiled from: BannerReportData */
public final class C8729a {

    /* renamed from: a */
    private String f21421a;

    /* renamed from: b */
    private String f21422b;

    /* renamed from: c */
    private String f21423c;

    /* renamed from: d */
    private String f21424d;

    /* renamed from: e */
    private String f21425e;

    /* renamed from: f */
    private String f21426f;

    /* renamed from: g */
    private String f21427g;

    /* renamed from: h */
    private int f21428h;

    /* renamed from: i */
    private boolean f21429i;

    /* renamed from: a */
    public final C8729a mo58345a(boolean z) {
        this.f21429i = z;
        return this;
    }

    private C8729a() {
    }

    /* renamed from: a */
    public static C8729a m25134a() {
        return new C8729a();
    }

    /* renamed from: a */
    public final C8729a mo58344a(String str) {
        this.f21421a = str;
        return this;
    }

    /* renamed from: b */
    public final C8729a mo58346b(String str) {
        this.f21422b = str;
        return this;
    }

    /* renamed from: c */
    public final C8729a mo58348c(String str) {
        this.f21423c = str;
        return this;
    }

    /* renamed from: d */
    public final C8729a mo58349d(String str) {
        this.f21425e = str;
        return this;
    }

    /* renamed from: e */
    public final C8729a mo58350e(String str) {
        this.f21424d = str;
        return this;
    }

    /* renamed from: f */
    public final C8729a mo58351f(String str) {
        this.f21426f = str;
        return this;
    }

    /* renamed from: g */
    public final C8729a mo58352g(String str) {
        this.f21427g = str;
        return this;
    }

    /* renamed from: a */
    public final C8729a mo58343a(int i) {
        this.f21428h = i;
        return this;
    }

    /* renamed from: b */
    public final String mo58347b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f21422b)) {
            sb.append("unit_id=");
            sb.append(this.f21422b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21423c)) {
            sb.append("cid=");
            sb.append(this.f21423c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21424d)) {
            sb.append("rid=");
            sb.append(this.f21424d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21425e)) {
            sb.append("rid_n=");
            sb.append(this.f21425e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21426f)) {
            sb.append("creative_id=");
            sb.append(this.f21426f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21427g)) {
            sb.append("reason=");
            sb.append(this.f21427g);
            sb.append("&");
        }
        if (this.f21428h != 0) {
            sb.append("result=");
            sb.append(this.f21428h);
            sb.append("&");
        }
        if (this.f21429i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(C8660r.m24840o(C8388a.m23845e().mo56913g()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f21421a)) {
            sb.append("key=");
            sb.append(this.f21421a);
        }
        return sb.toString();
    }
}
