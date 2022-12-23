package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.same.report.f */
/* compiled from: SameCommonReporter */
public final class C8603f {

    /* renamed from: a */
    private String f21114a;

    /* renamed from: b */
    private Map<String, String> f21115b;

    private C8603f(C8605a aVar) {
        this.f21114a = aVar.f21116a;
        this.f21115b = aVar.f21117b;
    }

    /* renamed from: a */
    public final void mo58072a(String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f21114a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append(this.f21114a);
            C8550d dVar = null;
            try {
                str2 = m24694a(this.f21115b);
            } catch (Exception unused) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            try {
                dVar = C8598e.m24661a(sb.toString(), C8388a.m23845e().mo56913g(), str);
            } catch (Exception unused2) {
            }
            if (dVar != null && dVar != null) {
                try {
                    new C8596a(C8388a.m23845e().mo56913g()).mo57978c(0, C8543d.m24463a().f20952a, dVar, new C8597b() {
                        /* renamed from: a */
                        public final void mo37053a(String str) {
                        }

                        /* renamed from: b */
                        public final void mo37054b(String str) {
                        }
                    });
                } catch (Exception unused3) {
                }
            }
        }
    }

    /* renamed from: a */
    private String m24694a(Map<String, String> map) {
        if (!(map == null || map.size() == 0)) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String next : map.keySet()) {
                    if (!TextUtils.isEmpty(next)) {
                        String str = map.get(next);
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                str = URLEncoder.encode(str, "utf-8");
                            } catch (Exception unused) {
                            }
                            sb.append("&");
                            sb.append(next);
                            sb.append("=");
                            sb.append(str);
                        }
                    }
                }
            } catch (Exception unused2) {
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.report.f$a */
    /* compiled from: SameCommonReporter */
    public static class C8605a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f21116a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f21117b = new HashMap();

        public C8605a(String str) {
            this.f21116a = str;
        }

        /* renamed from: a */
        public final C8603f mo58073a() {
            return new C8603f(this);
        }
    }
}
