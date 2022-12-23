package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.c */
/* compiled from: NativeVideoTrackingReport */
public class C8832c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21794a = C8832c.class.getName();

    /* renamed from: a */
    public static void m25499a(Context context, String str) {
        if (context != null) {
            try {
                C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(context));
                if (!TextUtils.isEmpty(str) && a != null && a.mo57055a() > 0) {
                    List<C8468m> a2 = a.mo57057a("2000022");
                    List<C8468m> a3 = a.mo57057a("2000021");
                    List<C8468m> a4 = a.mo57057a("2000043");
                    String a5 = C8468m.m24195a(a3);
                    String b = C8468m.m24197b(a2);
                    String c = C8468m.m24199c(a4);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(a5)) {
                        sb.append(a5);
                    }
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        String sb2 = sb.toString();
                        if (context != null && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(str)) {
                            try {
                                new C8596a(context).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb2, context, str), new C8597b() {
                                    /* renamed from: a */
                                    public final void mo37053a(String str) {
                                        C8672v.m24878d(C8832c.f21794a, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo37054b(String str) {
                                        C8672v.m24878d(C8832c.f21794a, str);
                                    }
                                });
                            } catch (Exception e) {
                                e.printStackTrace();
                                C8672v.m24878d(f21794a, e.getMessage());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
