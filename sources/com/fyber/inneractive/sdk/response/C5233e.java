package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.response.e */
public abstract class C5233e {

    /* renamed from: A */
    public boolean f13864A = false;

    /* renamed from: a */
    public long f13865a;

    /* renamed from: b */
    public long f13866b;

    /* renamed from: c */
    public long f13867c;

    /* renamed from: d */
    public String f13868d;

    /* renamed from: e */
    public int f13869e;

    /* renamed from: f */
    public int f13870f;

    /* renamed from: g */
    public int f13871g;

    /* renamed from: h */
    public String f13872h;

    /* renamed from: i */
    public String f13873i;

    /* renamed from: j */
    public String f13874j;

    /* renamed from: k */
    public String f13875k;

    /* renamed from: l */
    public String f13876l;

    /* renamed from: m */
    public String f13877m;

    /* renamed from: n */
    public UnitDisplayType f13878n;

    /* renamed from: o */
    public String f13879o;

    /* renamed from: p */
    public Map<String, String> f13880p;

    /* renamed from: q */
    public String f13881q;

    /* renamed from: r */
    public ImpressionData f13882r;

    /* renamed from: s */
    public C4306g f13883s;

    /* renamed from: t */
    public int f13884t = 0;

    /* renamed from: u */
    public float f13885u = -1.0f;

    /* renamed from: v */
    public String f13886v;

    /* renamed from: w */
    public int f13887w = -1;

    /* renamed from: x */
    public Exception f13888x;

    /* renamed from: y */
    public String f13889y;

    /* renamed from: z */
    public String f13890z;

    /* renamed from: a */
    public int mo26313a() {
        return this.f13870f;
    }

    /* renamed from: a */
    public abstract InneractiveErrorCode mo24322a(InneractiveAdRequest inneractiveAdRequest);

    /* renamed from: a */
    public abstract InneractiveErrorCode mo24323a(InneractiveAdRequest inneractiveAdRequest, C4251s sVar);

    /* renamed from: b */
    public UnitDisplayType mo26314b() {
        return this.f13878n;
    }

    /* renamed from: c */
    public int mo26315c() {
        return this.f13869e;
    }

    /* renamed from: d */
    public boolean mo26316d() {
        return this.f13865a < System.currentTimeMillis();
    }
}
