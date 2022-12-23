package com.mbridge.msdk.mbbid.common.p331c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.mbbid.common.c.a */
/* compiled from: BidReport */
public class C8790a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21598a = C8790a.class.getName();

    /* renamed from: a */
    public static void m25332a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("key=");
                sb.append("2000064");
                sb.append("&");
                sb.append("result=");
                sb.append("1");
                sb.append("&");
                sb.append("network_type=");
                sb.append(C8660r.m24840o(context));
                sb.append("&");
                sb.append("bidid=");
                sb.append(str2);
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(sb.toString());
                    return;
                }
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), context, str), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C8790a.f21598a, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8672v.m24878d(C8790a.f21598a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f21598a, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m25333b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a("key=" + "2000064" + "&" + "result=" + "2" + "&" + "network_type=" + C8660r.m24840o(context) + "&" + "reason=" + str2, context, str), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8672v.m24878d(C8790a.f21598a, str);
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8672v.m24878d(C8790a.f21598a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8672v.m24878d(f21598a, e.getMessage());
            }
        }
    }
}
