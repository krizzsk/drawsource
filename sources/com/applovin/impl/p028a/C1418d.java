package com.applovin.impl.p028a;

import android.net.Uri;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.smaato.sdk.video.vast.model.Companion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.d */
public class C1418d {

    /* renamed from: a */
    private int f1582a;

    /* renamed from: b */
    private int f1583b;

    /* renamed from: c */
    private Uri f1584c;

    /* renamed from: d */
    private C1422h f1585d;

    /* renamed from: e */
    private Set<C1425j> f1586e = new HashSet();

    /* renamed from: f */
    private Map<String, Set<C1425j>> f1587f = new HashMap();

    private C1418d() {
    }

    /* renamed from: a */
    public static C1418d m2453a(C2098r rVar, C1418d dVar, C1419e eVar, C1969m mVar) {
        C2098r b;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (dVar == null) {
                try {
                    dVar = new C1418d();
                } catch (Throwable th) {
                    if (!C2102v.m5104a()) {
                        return null;
                    }
                    mVar.mo14509A().mo15013b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (dVar.f1582a == 0 && dVar.f1583b == 0) {
                int parseInt = StringUtils.parseInt(rVar.mo14991b().get("width"));
                int parseInt2 = StringUtils.parseInt(rVar.mo14991b().get("height"));
                if (parseInt > 0 && parseInt2 > 0) {
                    dVar.f1582a = parseInt;
                    dVar.f1583b = parseInt2;
                }
            }
            dVar.f1585d = C1422h.m2470a(rVar, dVar.f1585d, mVar);
            if (dVar.f1584c == null && (b = rVar.mo14990b(Companion.COMPANION_CLICK_THROUGH)) != null) {
                String c = b.mo14993c();
                if (StringUtils.isValidString(c)) {
                    dVar.f1584c = Uri.parse(c);
                }
            }
            C1427l.m2493a(rVar.mo14989a(Companion.COMPANION_CLICK_TRACKING), dVar.f1586e, eVar, mVar);
            C1427l.m2492a(rVar, dVar.f1587f, eVar, mVar);
            return dVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo12890a() {
        return this.f1584c;
    }

    /* renamed from: b */
    public C1422h mo12891b() {
        return this.f1585d;
    }

    /* renamed from: c */
    public Set<C1425j> mo12892c() {
        return this.f1586e;
    }

    /* renamed from: d */
    public Map<String, Set<C1425j>> mo12893d() {
        return this.f1587f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1418d)) {
            return false;
        }
        C1418d dVar = (C1418d) obj;
        if (this.f1582a != dVar.f1582a || this.f1583b != dVar.f1583b) {
            return false;
        }
        Uri uri = this.f1584c;
        if (uri == null ? dVar.f1584c != null : !uri.equals(dVar.f1584c)) {
            return false;
        }
        C1422h hVar = this.f1585d;
        if (hVar == null ? dVar.f1585d != null : !hVar.equals(dVar.f1585d)) {
            return false;
        }
        Set<C1425j> set = this.f1586e;
        if (set == null ? dVar.f1586e != null : !set.equals(dVar.f1586e)) {
            return false;
        }
        Map<String, Set<C1425j>> map = this.f1587f;
        Map<String, Set<C1425j>> map2 = dVar.f1587f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f1582a * 31) + this.f1583b) * 31;
        Uri uri = this.f1584c;
        int i2 = 0;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C1422h hVar = this.f1585d;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Set<C1425j> set = this.f1586e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1425j>> map = this.f1587f;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f1582a + ", height=" + this.f1583b + ", destinationUri=" + this.f1584c + ", nonVideoResource=" + this.f1585d + ", clickTrackers=" + this.f1586e + ", eventTrackers=" + this.f1587f + '}';
    }
}
