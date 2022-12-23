package com.bytedance.sdk.openadsdk.p177k;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.k.e */
/* compiled from: TrackAdUrlUtils */
public class C3847e {
    /* renamed from: a */
    private static int m12559a(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i == 5 || i == 15) {
                        return i2;
                    }
                    return -1;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static List<String> m12561a(List<String> list, boolean z) {
        String a = C3472j.m10774a(C3513m.m10963a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a)) {
                next = next.replace("{UID}", a).replace("__UID__", a);
            }
            if (z) {
                next = m12560a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m12560a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static List<String> m12562a(List<String> list, boolean z, C3431n nVar) {
        String a = C3472j.m10774a(C3513m.m10963a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a)) {
                next = next.replace("{UID}", a).replace("__UID__", a);
            }
            if (next.contains("__CID__") && nVar != null && !TextUtils.isEmpty(nVar.mo19532Y())) {
                next = next.replace("__CID__", nVar.mo19532Y());
            }
            if (next.contains("__CTYPE__") && nVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(m12559a(nVar.mo19570ad())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", C3970a.m13090a().mo20862b());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(C3898x.m12768b()));
            }
            if (z) {
                next = m12560a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
