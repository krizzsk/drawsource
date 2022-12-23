package com.applovin.impl.p028a;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.m */
public class C1428m {

    /* renamed from: a */
    private List<C1431n> f1633a = Collections.emptyList();

    /* renamed from: b */
    private List<String> f1634b = Collections.emptyList();

    /* renamed from: c */
    private int f1635c;

    /* renamed from: d */
    private Uri f1636d;

    /* renamed from: e */
    private final Set<C1425j> f1637e = new HashSet();

    /* renamed from: f */
    private final Map<String, Set<C1425j>> f1638f = new HashMap();

    /* renamed from: com.applovin.impl.a.m$a */
    public enum C1430a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private C1428m() {
    }

    private C1428m(C1419e eVar) {
        this.f1634b = eVar.mo12903g();
    }

    /* renamed from: a */
    private static int m2502a(String str, C1969m mVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, CertificateUtil.DELIMITER);
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds((long) StringUtils.parseInt(explode.get(1))) + ((long) StringUtils.parseInt(explode.get(2))));
            }
        } catch (Throwable unused) {
            if (C2102v.m5104a()) {
                C2102v A = mVar.mo14509A();
                A.mo15016e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static C1428m m2503a(C2098r rVar, C1428m mVar, C1419e eVar, C1969m mVar2) {
        C2098r b;
        List<C1431n> a;
        C2098r b2;
        int a2;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        } else if (mVar2 != null) {
            if (mVar == null) {
                try {
                    mVar = new C1428m(eVar);
                } catch (Throwable th) {
                    if (!C2102v.m5104a()) {
                        return null;
                    }
                    mVar2.mo14509A().mo15013b("VastVideoCreative", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (mVar.f1635c == 0 && (b2 = rVar.mo14990b(Linear.DURATION)) != null && (a2 = m2502a(b2.mo14993c(), mVar2)) > 0) {
                mVar.f1635c = a2;
            }
            C2098r b3 = rVar.mo14990b(Linear.MEDIA_FILES);
            if (!(b3 == null || (a = m2504a(b3, mVar2)) == null || a.size() <= 0)) {
                if (mVar.f1633a != null) {
                    a.addAll(mVar.f1633a);
                }
                mVar.f1633a = a;
            }
            C2098r b4 = rVar.mo14990b("VideoClicks");
            if (b4 != null) {
                if (mVar.f1636d == null && (b = b4.mo14990b(VideoClicks.CLICK_THROUGH)) != null) {
                    String c = b.mo14993c();
                    if (StringUtils.isValidString(c)) {
                        mVar.f1636d = Uri.parse(c);
                    }
                }
                C1427l.m2493a(b4.mo14989a(VideoClicks.CLICK_TRACKING), mVar.f1637e, eVar, mVar2);
            }
            C1427l.m2492a(rVar, mVar.f1638f, eVar, mVar2);
            return mVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static List<C1431n> m2504a(C2098r rVar, C1969m mVar) {
        List<C2098r> a = rVar.mo14989a(MediaFile.NAME);
        ArrayList arrayList = new ArrayList(a.size());
        List<String> explode = CollectionUtils.explode((String) mVar.mo14534a(C1867b.f3343ek));
        List<String> explode2 = CollectionUtils.explode((String) mVar.mo14534a(C1867b.f3342ej));
        for (C2098r a2 : a) {
            C1431n a3 = C1431n.m2513a(a2, mVar);
            if (a3 != null) {
                try {
                    String c = a3.mo12942c();
                    if (!StringUtils.isValidString(c) || explode.contains(c)) {
                        if (((Boolean) mVar.mo14534a(C1867b.f3344el)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.mo12941b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        if (C2102v.m5104a()) {
                            C2102v A = mVar.mo14509A();
                            A.mo15015d("VastVideoCreative", "Video file not supported: " + a3);
                        }
                    }
                    arrayList.add(a3);
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v A2 = mVar.mo14509A();
                        A2.mo15013b("VastVideoCreative", "Failed to validate video file: " + a3, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1431n mo12928a(C1430a aVar) {
        List<C1431n> list = this.f1633a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String next : this.f1634b) {
            for (C1431n next2 : this.f1633a) {
                String c = next2.mo12942c();
                if (StringUtils.isValidString(c) && next.equalsIgnoreCase(c)) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f1633a;
        }
        if (C2049g.m4941c()) {
            Collections.sort(arrayList, new Comparator<C1431n>() {
                /* renamed from: a */
                public int compare(C1431n nVar, C1431n nVar2) {
                    return Integer.compare(nVar.mo12943d(), nVar2.mo12943d());
                }
            });
        }
        return (C1431n) arrayList.get(aVar == C1430a.LOW ? 0 : aVar == C1430a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    /* renamed from: a */
    public List<C1431n> mo12929a() {
        return this.f1633a;
    }

    /* renamed from: b */
    public int mo12930b() {
        return this.f1635c;
    }

    /* renamed from: c */
    public Uri mo12931c() {
        return this.f1636d;
    }

    /* renamed from: d */
    public Set<C1425j> mo12932d() {
        return this.f1637e;
    }

    /* renamed from: e */
    public Map<String, Set<C1425j>> mo12933e() {
        return this.f1638f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1428m)) {
            return false;
        }
        C1428m mVar = (C1428m) obj;
        if (this.f1635c != mVar.f1635c) {
            return false;
        }
        List<C1431n> list = this.f1633a;
        if (list == null ? mVar.f1633a != null : !list.equals(mVar.f1633a)) {
            return false;
        }
        Uri uri = this.f1636d;
        if (uri == null ? mVar.f1636d != null : !uri.equals(mVar.f1636d)) {
            return false;
        }
        Set<C1425j> set = this.f1637e;
        if (set == null ? mVar.f1637e != null : !set.equals(mVar.f1637e)) {
            return false;
        }
        Map<String, Set<C1425j>> map = this.f1638f;
        Map<String, Set<C1425j>> map2 = mVar.f1638f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        List<C1431n> list = this.f1633a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f1635c) * 31;
        Uri uri = this.f1636d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<C1425j> set = this.f1637e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1425j>> map = this.f1638f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f1633a + ", durationSeconds=" + this.f1635c + ", destinationUri=" + this.f1636d + ", clickTrackers=" + this.f1637e + ", eventTrackers=" + this.f1638f + '}';
    }
}
