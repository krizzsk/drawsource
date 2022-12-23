package com.applovin.impl.p028a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Locale;

/* renamed from: com.applovin.impl.a.n */
public class C1431n {

    /* renamed from: a */
    private Uri f1645a;

    /* renamed from: b */
    private Uri f1646b;

    /* renamed from: c */
    private C1432a f1647c;

    /* renamed from: d */
    private String f1648d;

    /* renamed from: e */
    private int f1649e;

    /* renamed from: f */
    private int f1650f;

    /* renamed from: g */
    private int f1651g;

    /* renamed from: com.applovin.impl.a.n$a */
    public enum C1432a {
        Progressive,
        Streaming
    }

    private C1431n() {
    }

    /* renamed from: a */
    private static C1432a m2512a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return C1432a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return C1432a.Streaming;
            }
        }
        return C1432a.Progressive;
    }

    /* renamed from: a */
    public static C1431n m2513a(C2098r rVar, C1969m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                String c = rVar.mo14993c();
                if (URLUtil.isValidUrl(c)) {
                    Uri parse = Uri.parse(c);
                    C1431n nVar = new C1431n();
                    nVar.f1645a = parse;
                    nVar.f1646b = parse;
                    nVar.f1651g = StringUtils.parseInt(rVar.mo14991b().get(MediaFile.BITRATE));
                    nVar.f1647c = m2512a(rVar.mo14991b().get(MediaFile.DELIVERY));
                    nVar.f1650f = StringUtils.parseInt(rVar.mo14991b().get("height"));
                    nVar.f1649e = StringUtils.parseInt(rVar.mo14991b().get("width"));
                    nVar.f1648d = rVar.mo14991b().get("type").toLowerCase(Locale.ENGLISH);
                    return nVar;
                } else if (!C2102v.m5104a()) {
                    return null;
                } else {
                    mVar.mo14509A().mo15016e("VastVideoFile", "Unable to create video file. Could not find URL.");
                    return null;
                }
            } catch (Throwable th) {
                if (!C2102v.m5104a()) {
                    return null;
                }
                mVar.mo14509A().mo15013b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo12939a() {
        return this.f1645a;
    }

    /* renamed from: a */
    public void mo12940a(Uri uri) {
        this.f1646b = uri;
    }

    /* renamed from: b */
    public Uri mo12941b() {
        return this.f1646b;
    }

    /* renamed from: c */
    public String mo12942c() {
        return this.f1648d;
    }

    /* renamed from: d */
    public int mo12943d() {
        return this.f1651g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431n)) {
            return false;
        }
        C1431n nVar = (C1431n) obj;
        if (this.f1649e != nVar.f1649e || this.f1650f != nVar.f1650f || this.f1651g != nVar.f1651g) {
            return false;
        }
        Uri uri = this.f1645a;
        if (uri == null ? nVar.f1645a != null : !uri.equals(nVar.f1645a)) {
            return false;
        }
        Uri uri2 = this.f1646b;
        if (uri2 == null ? nVar.f1646b != null : !uri2.equals(nVar.f1646b)) {
            return false;
        }
        if (this.f1647c != nVar.f1647c) {
            return false;
        }
        String str = this.f1648d;
        String str2 = nVar.f1648d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f1645a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f1646b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        C1432a aVar = this.f1647c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f1648d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.f1649e) * 31) + this.f1650f) * 31) + this.f1651g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f1645a + ", videoUri=" + this.f1646b + ", deliveryType=" + this.f1647c + ", fileType='" + this.f1648d + '\'' + ", width=" + this.f1649e + ", height=" + this.f1650f + ", bitrate=" + this.f1651g + '}';
    }
}
