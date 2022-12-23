package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.a.i */
public class C1424i {

    /* renamed from: a */
    private String f1623a;

    /* renamed from: b */
    private String f1624b;

    private C1424i() {
    }

    /* renamed from: a */
    public static C1424i m2477a(C2098r rVar, C1424i iVar, C1969m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (iVar == null) {
                try {
                    iVar = new C1424i();
                } catch (Throwable th) {
                    if (!C2102v.m5104a()) {
                        return null;
                    }
                    mVar.mo14509A().mo15013b("VastSystemInfo", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(iVar.f1623a)) {
                String c = rVar.mo14993c();
                if (StringUtils.isValidString(c)) {
                    iVar.f1623a = c;
                }
            }
            if (!StringUtils.isValidString(iVar.f1624b)) {
                String str = rVar.mo14991b().get("version");
                if (StringUtils.isValidString(str)) {
                    iVar.f1624b = str;
                }
            }
            return iVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1424i)) {
            return false;
        }
        C1424i iVar = (C1424i) obj;
        String str = this.f1623a;
        if (str == null ? iVar.f1623a != null : !str.equals(iVar.f1623a)) {
            return false;
        }
        String str2 = this.f1624b;
        String str3 = iVar.f1624b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f1623a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1624b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f1623a + '\'' + ", version='" + this.f1624b + '\'' + '}';
    }
}
