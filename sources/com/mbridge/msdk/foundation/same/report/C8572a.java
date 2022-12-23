package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.report.a */
/* compiled from: DomainReport */
public class C8572a {

    /* renamed from: a */
    private static String f21056a = "DomainReport";

    /* renamed from: a */
    public static boolean m24569a(C2440a aVar, String str) {
        boolean z = false;
        if (aVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int ak = aVar.mo16193ak();
                    JSONArray q = aVar.mo16251q();
                    JSONArray r = aVar.mo16253r();
                    if (r != null) {
                        for (int i = 0; i < r.length(); i++) {
                            if (str.contains(r.getString(i))) {
                                return false;
                            }
                        }
                    }
                    if (ak == 2) {
                        if (q != null) {
                            for (int i2 = 0; i2 < q.length(); i2++) {
                                if (str.contains(q.getString(i2))) {
                                    return true;
                                }
                            }
                        }
                        return z;
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d(f21056a, e.getMessage());
                return true;
            }
        }
        z = true;
        return z;
    }
}
