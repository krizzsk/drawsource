package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.j */
public class C1425j {

    /* renamed from: a */
    private String f1625a;

    /* renamed from: b */
    private String f1626b;

    /* renamed from: c */
    private String f1627c;

    /* renamed from: d */
    private long f1628d = -1;

    /* renamed from: e */
    private int f1629e = -1;

    private C1425j() {
    }

    /* renamed from: a */
    private static int m2478a(String str, C1419e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.mo12904h();
        }
        return 95;
    }

    /* renamed from: a */
    public static C1425j m2479a(C2098r rVar, C1419e eVar, C1969m mVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                String c = rVar.mo14993c();
                if (StringUtils.isValidString(c)) {
                    C1425j jVar = new C1425j();
                    jVar.f1627c = c;
                    jVar.f1625a = rVar.mo14991b().get("id");
                    jVar.f1626b = rVar.mo14991b().get("event");
                    jVar.f1629e = m2478a(jVar.mo12922a(), eVar);
                    String str = rVar.mo14991b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            jVar.f1629e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(CertificateUtil.DELIMITER) && (size = explode.size()) > 0) {
                            long j = 0;
                            int i = size - 1;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = (explode = CollectionUtils.explode(trim, CertificateUtil.DELIMITER)).get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = (long) parseInt;
                                    } else {
                                        if (i2 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i2 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds((long) parseInt);
                                    }
                                    j += seconds;
                                }
                            }
                            jVar.f1628d = j;
                            jVar.f1629e = -1;
                        }
                    }
                    return jVar;
                } else if (!C2102v.m5104a()) {
                    return null;
                } else {
                    mVar.mo14509A().mo15016e("VastTracker", "Unable to create tracker. Could not find URL.");
                    return null;
                }
            } catch (Throwable th) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                mVar.mo14509A().mo15013b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo12922a() {
        return this.f1626b;
    }

    /* renamed from: a */
    public boolean mo12923a(long j, int i) {
        boolean z = this.f1628d >= 0;
        boolean z2 = j >= this.f1628d;
        boolean z3 = this.f1629e >= 0;
        boolean z4 = i >= this.f1629e;
        if (!z || !z2) {
            return z3 && z4;
        }
        return true;
    }

    /* renamed from: b */
    public String mo12924b() {
        return this.f1627c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1425j)) {
            return false;
        }
        C1425j jVar = (C1425j) obj;
        if (this.f1628d != jVar.f1628d || this.f1629e != jVar.f1629e) {
            return false;
        }
        String str = this.f1625a;
        if (str == null ? jVar.f1625a != null : !str.equals(jVar.f1625a)) {
            return false;
        }
        String str2 = this.f1626b;
        if (str2 == null ? jVar.f1626b == null : str2.equals(jVar.f1626b)) {
            return this.f1627c.equals(jVar.f1627c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1625a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1626b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f1628d;
        return ((((((hashCode + i) * 31) + this.f1627c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f1629e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f1625a + '\'' + ", event='" + this.f1626b + '\'' + ", uriString='" + this.f1627c + '\'' + ", offsetSeconds=" + this.f1628d + ", offsetPercent=" + this.f1629e + '}';
    }
}
