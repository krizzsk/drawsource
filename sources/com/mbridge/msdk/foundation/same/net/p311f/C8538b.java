package com.mbridge.msdk.foundation.same.net.p311f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.tools.C8616ad;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.b */
/* compiled from: HttpUtils */
public class C8538b {

    /* renamed from: a */
    private static final String f20921a = C8538b.class.getSimpleName();

    /* renamed from: a */
    public static String m24453a(List<C8513b> list) {
        C8513b b = m24456b(list, "Content-Type");
        if (b != null) {
            String b2 = b.mo57934b();
            if (!TextUtils.isEmpty(b2)) {
                String[] split = b2.split(";");
                for (int i = 1; i < split.length; i++) {
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    /* renamed from: b */
    private static C8513b m24456b(List<C8513b> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C8513b bVar = list.get(i);
                if (bVar != null && str.equals(bVar.mo57933a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m24454a(List<C8513b> list, String str) {
        C8513b b = m24456b(list, str);
        return b != null ? b.mo57934b() : "";
    }

    /* renamed from: b */
    public static boolean m24457b(List<C8513b> list) {
        return TextUtils.equals(m24454a(list, "Content-Encoding"), "gzip");
    }

    /* renamed from: a */
    public static void m24455a(C8550d dVar, String str, String str2) {
        if (dVar != null) {
            try {
                if (C8616ad.m24717a(str)) {
                    return;
                }
                if (!C8616ad.m24717a(str2)) {
                    dVar.mo57981a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
