package com.applovin.impl.p028a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.a.h */
public class C1422h {

    /* renamed from: a */
    private C1423a f1615a;

    /* renamed from: b */
    private Uri f1616b;

    /* renamed from: c */
    private String f1617c;

    /* renamed from: com.applovin.impl.a.h$a */
    public enum C1423a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C1422h() {
    }

    /* renamed from: a */
    static C1422h m2470a(C2098r rVar, C1422h hVar, C1969m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (hVar == null) {
                try {
                    hVar = new C1422h();
                } catch (Throwable th) {
                    if (!C2102v.m5104a()) {
                        return null;
                    }
                    mVar.mo14509A().mo15013b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (hVar.f1616b == null && !StringUtils.isValidString(hVar.f1617c)) {
                String a = m2471a(rVar, "StaticResource");
                if (URLUtil.isValidUrl(a)) {
                    hVar.f1616b = Uri.parse(a);
                    hVar.f1615a = C1423a.STATIC;
                    return hVar;
                }
                String a2 = m2471a(rVar, "IFrameResource");
                if (StringUtils.isValidString(a2)) {
                    hVar.f1615a = C1423a.IFRAME;
                    if (URLUtil.isValidUrl(a2)) {
                        hVar.f1616b = Uri.parse(a2);
                    } else {
                        hVar.f1617c = a2;
                    }
                    return hVar;
                }
                String a3 = m2471a(rVar, "HTMLResource");
                if (StringUtils.isValidString(a3)) {
                    hVar.f1615a = C1423a.HTML;
                    if (URLUtil.isValidUrl(a3)) {
                        hVar.f1616b = Uri.parse(a3);
                    } else {
                        hVar.f1617c = a3;
                    }
                }
            }
            return hVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static String m2471a(C2098r rVar, String str) {
        C2098r b = rVar.mo14990b(str);
        if (b != null) {
            return b.mo14993c();
        }
        return null;
    }

    /* renamed from: a */
    public C1423a mo12911a() {
        return this.f1615a;
    }

    /* renamed from: a */
    public void mo12912a(Uri uri) {
        this.f1616b = uri;
    }

    /* renamed from: a */
    public void mo12913a(String str) {
        this.f1617c = str;
    }

    /* renamed from: b */
    public Uri mo12914b() {
        return this.f1616b;
    }

    /* renamed from: c */
    public String mo12915c() {
        return this.f1617c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422h)) {
            return false;
        }
        C1422h hVar = (C1422h) obj;
        if (this.f1615a != hVar.f1615a) {
            return false;
        }
        Uri uri = this.f1616b;
        if (uri == null ? hVar.f1616b != null : !uri.equals(hVar.f1616b)) {
            return false;
        }
        String str = this.f1617c;
        String str2 = hVar.f1617c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        C1423a aVar = this.f1615a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f1616b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f1617c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f1615a + ", resourceUri=" + this.f1616b + ", resourceContents='" + this.f1617c + '\'' + '}';
    }
}
