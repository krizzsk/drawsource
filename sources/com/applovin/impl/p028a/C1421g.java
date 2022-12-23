package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;

/* renamed from: com.applovin.impl.a.g */
public class C1421g {

    /* renamed from: a */
    private final String f1613a;

    /* renamed from: b */
    private final String f1614b;

    private C1421g(String str, String str2) {
        this.f1613a = str;
        this.f1614b = str2;
    }

    /* renamed from: a */
    public static C1421g m2467a(C2098r rVar, C1969m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                return new C1421g(rVar.mo14991b().get("apiFramework"), rVar.mo14993c());
            } catch (Throwable th) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                mVar.mo14509A().mo15013b("VastJavaScriptResource", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo12906a() {
        return this.f1613a;
    }

    /* renamed from: b */
    public String mo12907b() {
        return this.f1614b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1421g gVar = (C1421g) obj;
        String str = this.f1613a;
        if (str == null ? gVar.f1613a != null : !str.equals(gVar.f1613a)) {
            return false;
        }
        String str2 = this.f1614b;
        String str3 = gVar.f1614b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f1613a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1614b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f1613a + '\'' + ", javascriptResourceUrl='" + this.f1614b + '\'' + '}';
    }
}
