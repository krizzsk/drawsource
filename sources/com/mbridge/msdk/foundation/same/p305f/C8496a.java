package com.mbridge.msdk.foundation.same.p305f;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.foundation.same.f.a */
/* compiled from: ReportTask */
public final class C8496a implements Runnable {

    /* renamed from: a */
    private String f20839a;

    /* renamed from: b */
    private String f20840b;

    public C8496a(String str, String str2) {
        this.f20839a = str;
        this.f20840b = str2;
    }

    public final void run() {
        try {
            new C8596a(C8388a.m23845e().mo56913g()).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(this.f20839a, C8388a.m23845e().mo56913g(), this.f20840b), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                    C8672v.m24878d("ReportTask", str);
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                    C8672v.m24878d("ReportTask", str);
                }
            });
        } catch (Throwable th) {
            C8672v.m24878d("ReportTask", th.getMessage());
        }
    }
}
