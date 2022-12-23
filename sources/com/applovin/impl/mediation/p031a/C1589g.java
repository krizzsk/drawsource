package com.applovin.impl.mediation.p031a;

import com.applovin.impl.mediation.C1740g;

/* renamed from: com.applovin.impl.mediation.a.g */
public class C1589g {

    /* renamed from: a */
    private final C1591h f2102a;

    /* renamed from: b */
    private final String f2103b;

    /* renamed from: c */
    private final String f2104c;

    /* renamed from: d */
    private final String f2105d;

    /* renamed from: e */
    private final String f2106e;

    /* renamed from: com.applovin.impl.mediation.a.g$a */
    public interface C1590a {
        /* renamed from: a */
        void mo13476a(C1589g gVar);
    }

    private C1589g(C1591h hVar, C1740g gVar, String str, String str2) {
        String str3;
        this.f2102a = hVar;
        this.f2105d = str;
        this.f2106e = str2;
        if (gVar != null) {
            this.f2103b = gVar.mo13844h();
            str3 = gVar.mo13845i();
        } else {
            str3 = null;
            this.f2103b = null;
        }
        this.f2104c = str3;
    }

    /* renamed from: a */
    public static C1589g m3106a(C1591h hVar, C1740g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (gVar != null) {
            return new C1589g(hVar, gVar, str, (String) null);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    /* renamed from: a */
    public static C1589g m3107a(C1591h hVar, String str) {
        return m3108b(hVar, (C1740g) null, str);
    }

    /* renamed from: b */
    public static C1589g m3108b(C1591h hVar, C1740g gVar, String str) {
        if (hVar != null) {
            return new C1589g(hVar, gVar, (String) null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public C1591h mo13470a() {
        return this.f2102a;
    }

    /* renamed from: b */
    public String mo13471b() {
        return this.f2103b;
    }

    /* renamed from: c */
    public String mo13472c() {
        return this.f2104c;
    }

    /* renamed from: d */
    public String mo13473d() {
        return this.f2105d;
    }

    /* renamed from: e */
    public String mo13474e() {
        return this.f2106e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f2102a);
        sb.append(", mSdkVersion='");
        sb.append(this.f2103b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f2104c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f2105d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.f2106e);
        sb.append('}');
        return sb.toString();
    }
}
