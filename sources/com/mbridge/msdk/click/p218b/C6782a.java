package com.mbridge.msdk.click.p218b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.vungle.warren.model.Advertisement;
import java.io.File;

/* renamed from: com.mbridge.msdk.click.b.a */
/* compiled from: DspFilterUtils */
public final class C6782a {

    /* renamed from: a */
    public static int f17890a = 1;

    /* renamed from: b */
    public static int f17891b = 2;

    /* renamed from: c */
    public static int f17892c = 1500;

    /* renamed from: d */
    private static String f17893d = "2000109";

    /* renamed from: e */
    private static String f17894e = "DspFilterUtils";

    /* renamed from: a */
    public static boolean m20651a(CampaignEx campaignEx, String str, int i) {
        boolean z = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            if (campaignEx.getFac() != 0) {
                z = true;
            }
            try {
                Context g = C8388a.m23845e().mo56913g();
                if (!(g == null || campaignEx == null)) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace(Advertisement.FILE_SCHEME, ""));
                        if (file.exists()) {
                            str = C8666t.m24856a(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + f17893d + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("html=" + str + "&");
                    stringBuffer.append("network_type=" + C8660r.m24840o(g) + "&");
                    stringBuffer.append("unit_id=" + campaignEx.getCampaignUnitId() + "&");
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=");
                        stringBuffer.append("1");
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("cid=" + campaignEx.getId());
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        C8598e.m24682b(g, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(f17894e, th.getMessage());
            }
        }
        return z;
    }
}
