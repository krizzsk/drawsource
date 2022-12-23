package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.a.c */
public class C1417c {

    /* renamed from: a */
    private final List<C1416b> f1581a;

    private C1417c(List<C1416b> list) {
        this.f1581a = list;
    }

    /* renamed from: a */
    public static C1417c m2451a(C2098r rVar, C1417c cVar, C1419e eVar, C1969m mVar) {
        List list;
        if (cVar != null) {
            try {
                list = cVar.mo12886a();
            } catch (Throwable th) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                mVar.mo14509A().mo15013b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
        } else {
            list = new ArrayList();
        }
        for (C2098r a : rVar.mo14989a(Verification.NAME)) {
            C1416b a2 = C1416b.m2446a(a, eVar, mVar);
            if (a2 != null) {
                list.add(a2);
            }
        }
        return new C1417c(list);
    }

    /* renamed from: a */
    public List<C1416b> mo12886a() {
        return this.f1581a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417c)) {
            return false;
        }
        return this.f1581a.equals(((C1417c) obj).f1581a);
    }

    public int hashCode() {
        return this.f1581a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f1581a + '\'' + '}';
    }
}
