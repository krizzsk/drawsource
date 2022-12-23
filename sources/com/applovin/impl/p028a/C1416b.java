package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.b */
public class C1416b {

    /* renamed from: a */
    private final String f1577a;

    /* renamed from: b */
    private final List<C1421g> f1578b;

    /* renamed from: c */
    private final String f1579c;

    /* renamed from: d */
    private final Set<C1425j> f1580d;

    private C1416b(String str, List<C1421g> list, String str2, Set<C1425j> set) {
        this.f1577a = str;
        this.f1578b = list;
        this.f1579c = str2;
        this.f1580d = set;
    }

    /* renamed from: a */
    public static C1416b m2446a(C2098r rVar, C1419e eVar, C1969m mVar) {
        try {
            String str = rVar.mo14991b().get(Verification.VENDOR);
            C2098r c = rVar.mo14992c(Verification.VERIFICATION_PARAMETERS);
            String c2 = c != null ? c.mo14993c() : null;
            List<C2098r> a = rVar.mo14989a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            for (C2098r a2 : a) {
                C1421g a3 = C1421g.m2467a(a2, mVar);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            HashMap hashMap = new HashMap();
            C1427l.m2492a(rVar, (Map<String, Set<C1425j>>) hashMap, eVar, mVar);
            return new C1416b(str, arrayList, c2, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15013b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo12879a() {
        return this.f1577a;
    }

    /* renamed from: b */
    public List<C1421g> mo12880b() {
        return this.f1578b;
    }

    /* renamed from: c */
    public String mo12881c() {
        return this.f1579c;
    }

    /* renamed from: d */
    public Set<C1425j> mo12882d() {
        return this.f1580d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1416b bVar = (C1416b) obj;
        String str = this.f1577a;
        if (str == null ? bVar.f1577a != null : !str.equals(bVar.f1577a)) {
            return false;
        }
        List<C1421g> list = this.f1578b;
        if (list == null ? bVar.f1578b != null : !list.equals(bVar.f1578b)) {
            return false;
        }
        String str2 = this.f1579c;
        if (str2 == null ? bVar.f1579c != null : !str2.equals(bVar.f1579c)) {
            return false;
        }
        Set<C1425j> set = this.f1580d;
        Set<C1425j> set2 = bVar.f1580d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f1577a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C1421g> list = this.f1578b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f1579c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<C1425j> set = this.f1580d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f1577a + '\'' + "javascriptResources='" + this.f1578b + '\'' + "verificationParameters='" + this.f1579c + '\'' + "errorEventTrackers='" + this.f1580d + '\'' + '}';
    }
}
