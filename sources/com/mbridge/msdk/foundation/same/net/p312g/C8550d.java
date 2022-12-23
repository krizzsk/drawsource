package com.mbridge.msdk.foundation.same.net.p312g;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.p308c.C8512a;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.d */
/* compiled from: CommonRequestParams */
public final class C8550d {

    /* renamed from: a */
    public static String f20981a = "a";

    /* renamed from: b */
    public static String f20982b = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;

    /* renamed from: c */
    public static String f20983c = "e";

    /* renamed from: d */
    public static String f20984d = InneractiveMediationDefs.GENDER_FEMALE;

    /* renamed from: e */
    public static String f20985e = "g";

    /* renamed from: f */
    public static String f20986f = "h";

    /* renamed from: g */
    public static String f20987g = "i";

    /* renamed from: h */
    private static final String f20988h = C8550d.class.getSimpleName();

    /* renamed from: i */
    private Map<String, String> f20989i = new LinkedHashMap();

    /* renamed from: j */
    private Map<String, C8512a> f20990j = new LinkedHashMap();

    /* renamed from: a */
    public final void mo57981a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            this.f20989i.put(str, str2);
        }
    }

    /* renamed from: a */
    public final String mo57979a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : this.f20989i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo57980a(String str) {
        this.f20989i.remove(str);
        this.f20990j.remove(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry next : this.f20989i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
            for (Map.Entry next2 : this.f20990j.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + ((C8512a) next2.getValue()).mo57932a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            C8672v.m24878d(f20988h, e.getMessage());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> mo57982b() {
        return this.f20989i;
    }
}
