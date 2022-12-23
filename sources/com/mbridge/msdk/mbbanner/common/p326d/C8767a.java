package com.mbridge.msdk.mbbanner.common.p326d;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.mbbanner.common.p323a.C8729a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.mbbanner.common.d.a */
/* compiled from: BannerReport */
public final class C8767a {
    /* renamed from: a */
    public static void m25293a(String str, CampaignEx campaignEx, String str2) {
        try {
            C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
            StringBuilder sb = new StringBuilder();
            if (campaignEx.isBidCampaign()) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000070", "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(C8660r.m24840o(C8388a.m23845e().mo56913g())), "utf-8"));
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), C8388a.m23845e().mo56913g(), str), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m25292a(C8729a aVar, String str) {
        if (aVar != null) {
            aVar.mo58344a("2000068");
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(aVar.mo58347b());
            } else {
                C8580c.m24608a(aVar.mo58347b(), C8388a.m23845e().mo56913g(), str);
            }
        }
    }
}
