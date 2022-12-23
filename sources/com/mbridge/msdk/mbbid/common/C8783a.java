package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8674x;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;

/* renamed from: com.mbridge.msdk.mbbid.common.a */
/* compiled from: AreaBidCommon */
public final class C8783a {
    /* renamed from: a */
    public static String m25309a(Context context, String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (C8388a.m23845e().mo56913g() == null) {
                    C8388a.m23845e().mo56905b(context);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
        }
        stringBuffer.append(C8660r.m24832k());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24820e());
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24816d());
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24840o(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24829i(context));
        stringBuffer.append("x");
        stringBuffer.append(C8660r.m24831j(context));
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24823f());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8677z.m24909a(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(C8469a.f20740a);
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24844q());
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24842p());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C8674x.m24887b());
        stringBuffer.append("|");
        stringBuffer.append(C8674x.m24884a());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C2461a.m6124a().mo16390b(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        stringBuffer.append("|");
        stringBuffer.append(C2461a.m6124a().mo16390b("c"));
        stringBuffer.append("|");
        stringBuffer.append("");
        if (b != null) {
            str2 = b.mo16214c();
        } else {
            str2 = "";
        }
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(C8677z.m24939e());
        stringBuffer.append("|");
        String f = C8677z.m24943f();
        if (TextUtils.isEmpty(f)) {
            f = "";
        }
        stringBuffer.append(f);
        stringBuffer.append("|");
        stringBuffer.append(C8677z.m24958m(str));
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24803a());
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24813c(context));
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24808b() + "");
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24809b(C8388a.m23845e().mo56915i()) + "");
        stringBuffer.append("|");
        stringBuffer.append(C8660r.m24848s());
        return C8659q.m24801a(stringBuffer.toString());
    }
}
