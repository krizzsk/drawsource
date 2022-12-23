package com.mbridge.msdk.video.dynview.p361i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8660r;

/* renamed from: com.mbridge.msdk.video.dynview.i.b */
/* compiled from: UIControlUtil */
public final class C9365b {
    /* renamed from: a */
    public static String m26702a(Context context, int i) {
        String str = i == 1 ? "_por" : "_land";
        String d = C8660r.m24817d(context);
        if (d.startsWith("zh")) {
            return (d.contains("TW") || d.contains("HK")) ? "mbridge_reward_two_title_zh_trad" : "mbridge_reward_two_title_zh";
        }
        if (d.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        } else if (d.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        } else if (d.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        } else if (d.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        } else if (d.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        } else if (d.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        } else {
            return "mbridge_reward_two_title_en" + str;
        }
    }

    /* renamed from: a */
    public static boolean m26703a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter) || !queryParameter.equals("1")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m26701a(CampaignEx campaignEx) {
        if (!(campaignEx == null || campaignEx.getRewardTemplateMode() == null)) {
            int b = campaignEx.getRewardTemplateMode().mo57573b();
            if (b == 302 || b == 802) {
                return -3;
            }
            if (b == 904) {
                if (!m26703a(campaignEx.getRewardTemplateMode().mo57576e())) {
                    return -1;
                }
                return -3;
            }
        }
        return 100;
    }
}
