package com.applovin.impl.p028a;

import android.net.Uri;
import com.applovin.impl.p028a.C1428m;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p048a.C1813g;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1875a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.a */
public class C1411a extends C1839e {

    /* renamed from: a */
    private final String f1543a;

    /* renamed from: b */
    private final String f1544b;

    /* renamed from: c */
    private final C1424i f1545c;

    /* renamed from: d */
    private final long f1546d;

    /* renamed from: e */
    private final C1428m f1547e;

    /* renamed from: f */
    private final C1418d f1548f;

    /* renamed from: g */
    private final String f1549g;

    /* renamed from: h */
    private final C1417c f1550h;

    /* renamed from: i */
    private final C1813g f1551i;

    /* renamed from: j */
    private final Set<C1425j> f1552j;

    /* renamed from: k */
    private final Set<C1425j> f1553k;

    /* renamed from: com.applovin.impl.a.a$a */
    public static class C1413a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public JSONObject f1554a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public JSONObject f1555b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1835b f1556c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1969m f1557d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f1558e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f1559f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f1560g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C1424i f1561h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C1428m f1562i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1418d f1563j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C1417c f1564k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Set<C1425j> f1565l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Set<C1425j> f1566m;

        /* renamed from: a */
        public C1413a mo12865a(long j) {
            this.f1558e = j;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12866a(C1417c cVar) {
            this.f1564k = cVar;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12867a(C1418d dVar) {
            this.f1563j = dVar;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12868a(C1424i iVar) {
            this.f1561h = iVar;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12869a(C1428m mVar) {
            this.f1562i = mVar;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12870a(C1835b bVar) {
            this.f1556c = bVar;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12871a(C1969m mVar) {
            if (mVar != null) {
                this.f1557d = mVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public C1413a mo12872a(String str) {
            this.f1559f = str;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12873a(Set<C1425j> set) {
            this.f1565l = set;
            return this;
        }

        /* renamed from: a */
        public C1413a mo12874a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1554a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public C1411a mo12875a() {
            return new C1411a(this);
        }

        /* renamed from: b */
        public C1413a mo12876b(String str) {
            this.f1560g = str;
            return this;
        }

        /* renamed from: b */
        public C1413a mo12877b(Set<C1425j> set) {
            this.f1566m = set;
            return this;
        }

        /* renamed from: b */
        public C1413a mo12878b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1555b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* renamed from: com.applovin.impl.a.a$b */
    public enum C1414b {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.a.a$c */
    public enum C1415c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private C1411a(C1413a aVar) {
        super(aVar.f1554a, aVar.f1555b, aVar.f1556c, aVar.f1557d);
        this.f1543a = aVar.f1559f;
        this.f1545c = aVar.f1561h;
        this.f1544b = aVar.f1560g;
        this.f1547e = aVar.f1562i;
        this.f1548f = aVar.f1563j;
        this.f1550h = aVar.f1564k;
        this.f1552j = aVar.f1565l;
        this.f1553k = aVar.f1566m;
        this.f1551i = new C1813g(this);
        Uri h = mo12853h();
        this.f1549g = h != null ? h.toString() : "";
        this.f1546d = aVar.f1558e;
    }

    /* renamed from: a */
    private Set<C1425j> m2387a(C1414b bVar, String[] strArr) {
        C1418d dVar;
        C1428m mVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<C1425j>> map = null;
        if (bVar == C1414b.VIDEO && (mVar = this.f1547e) != null) {
            map = mVar.mo12933e();
        } else if (bVar == C1414b.COMPANION_AD && (dVar = this.f1548f) != null) {
            map = dVar.mo12893d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: aT */
    private String m2388aT() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: aU */
    private C1428m.C1430a m2389aU() {
        C1428m.C1430a[] values = C1428m.C1430a.values();
        int intValue = ((Integer) this.sdk.mo14534a(C1867b.f3345em)).intValue();
        return (intValue < 0 || intValue >= values.length) ? C1428m.C1430a.UNSPECIFIED : values[intValue];
    }

    /* renamed from: aV */
    private Set<C1425j> m2390aV() {
        C1428m mVar = this.f1547e;
        return mVar != null ? mVar.mo12932d() : Collections.emptySet();
    }

    /* renamed from: aW */
    private Set<C1425j> m2391aW() {
        C1418d dVar = this.f1548f;
        return dVar != null ? dVar.mo12892c() : Collections.emptySet();
    }

    /* renamed from: D */
    public boolean mo12831D() {
        return getBooleanFromAdObject("video_clickable", false) && mo12858j() != null;
    }

    /* renamed from: a */
    public Set<C1425j> mo12832a(C1415c cVar, String str) {
        return mo12833a(cVar, new String[]{str});
    }

    /* renamed from: a */
    public Set<C1425j> mo12833a(C1415c cVar, String[] strArr) {
        C1414b bVar;
        if (C2102v.m5104a()) {
            C2102v A = this.sdk.mo14509A();
            A.mo15012b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == C1415c.IMPRESSION) {
            return this.f1552j;
        }
        if (cVar == C1415c.VIDEO_CLICK) {
            return m2390aV();
        }
        if (cVar == C1415c.COMPANION_CLICK) {
            return m2391aW();
        }
        if (cVar == C1415c.VIDEO) {
            bVar = C1414b.VIDEO;
        } else if (cVar == C1415c.COMPANION) {
            bVar = C1414b.COMPANION_AD;
        } else if (cVar == C1415c.ERROR) {
            return this.f1553k;
        } else {
            if (C2102v.m5104a()) {
                C2102v A2 = this.sdk.mo14509A();
                A2.mo15016e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
            }
            return Collections.emptySet();
        }
        return m2387a(bVar, strArr);
    }

    /* renamed from: a */
    public void mo12834a() {
    }

    /* renamed from: a */
    public void mo12835a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    /* renamed from: aM */
    public C1418d mo12836aM() {
        return this.f1548f;
    }

    /* renamed from: aN */
    public boolean mo12837aN() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    /* renamed from: aO */
    public String mo12838aO() {
        return getStringFromAdObject("html_template", "");
    }

    /* renamed from: aP */
    public Uri mo12839aP() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aQ */
    public boolean mo12840aQ() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    /* renamed from: aR */
    public boolean mo12841aR() {
        return getBooleanFromAdObject("cache_video", true);
    }

    /* renamed from: aS */
    public C1417c mo12842aS() {
        return this.f1550h;
    }

    /* renamed from: at */
    public List<C1875a> mo12843at() {
        List<C1875a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), (Map<String, String>) null, m2388aT(), mo14223au(), mo14241y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: b */
    public void mo12844b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    /* renamed from: c */
    public C1813g mo12863o() {
        return this.f1551i;
    }

    /* renamed from: d */
    public String mo12846d() {
        return this.f1549g;
    }

    /* renamed from: e */
    public long mo12847e() {
        return getLongFromAdObject("real_close_delay", 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411a) || !super.equals(obj)) {
            return false;
        }
        C1411a aVar = (C1411a) obj;
        String str = this.f1543a;
        if (str == null ? aVar.f1543a != null : !str.equals(aVar.f1543a)) {
            return false;
        }
        String str2 = this.f1544b;
        if (str2 == null ? aVar.f1544b != null : !str2.equals(aVar.f1544b)) {
            return false;
        }
        C1424i iVar = this.f1545c;
        if (iVar == null ? aVar.f1545c != null : !iVar.equals(aVar.f1545c)) {
            return false;
        }
        C1428m mVar = this.f1547e;
        if (mVar == null ? aVar.f1547e != null : !mVar.equals(aVar.f1547e)) {
            return false;
        }
        C1418d dVar = this.f1548f;
        if (dVar == null ? aVar.f1548f != null : !dVar.equals(aVar.f1548f)) {
            return false;
        }
        C1417c cVar = this.f1550h;
        if (cVar == null ? aVar.f1550h != null : !cVar.equals(aVar.f1550h)) {
            return false;
        }
        Set<C1425j> set = this.f1552j;
        if (set == null ? aVar.f1552j != null : !set.equals(aVar.f1552j)) {
            return false;
        }
        Set<C1425j> set2 = this.f1553k;
        Set<C1425j> set3 = aVar.f1553k;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    /* renamed from: f */
    public boolean mo12849f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    /* renamed from: g */
    public C1414b mo12850g() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? C1414b.COMPANION_AD : C1414b.VIDEO;
    }

    public long getCreatedAtMillis() {
        return this.f1546d;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    /* renamed from: h */
    public Uri mo12853h() {
        C1431n n = mo12862n();
        if (n != null) {
            return n.mo12941b();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo12929a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideoUrl() {
        /*
            r2 = this;
            com.applovin.impl.a.m r0 = r2.f1547e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r0.mo12929a()
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p028a.C1411a.hasVideoUrl():boolean");
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f1543a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1544b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1424i iVar = this.f1545c;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C1428m mVar = this.f1547e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C1418d dVar = this.f1548f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C1417c cVar = this.f1550h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<C1425j> set = this.f1552j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<C1425j> set2 = this.f1553k;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public boolean mo12856i() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", true) && this.f1550h != null;
    }

    /* renamed from: j */
    public Uri mo12858j() {
        C1428m mVar = this.f1547e;
        if (mVar != null) {
            return mVar.mo12931c();
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo12859k() {
        return mo12858j();
    }

    /* renamed from: l */
    public C1424i mo12860l() {
        return this.f1545c;
    }

    /* renamed from: m */
    public C1428m mo12861m() {
        return this.f1547e;
    }

    /* renamed from: n */
    public C1431n mo12862n() {
        C1428m mVar = this.f1547e;
        if (mVar != null) {
            return mVar.mo12928a(m2389aU());
        }
        return null;
    }

    public String toString() {
        return "VastAd{title='" + this.f1543a + '\'' + ", adDescription='" + this.f1544b + '\'' + ", systemInfo=" + this.f1545c + ", videoCreative=" + this.f1547e + ", companionAd=" + this.f1548f + ", adVerifications=" + this.f1550h + ", impressionTrackers=" + this.f1552j + ", errorTrackers=" + this.f1553k + '}';
    }
}
