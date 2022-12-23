package com.bytedance.sdk.openadsdk.p178l;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.l.s */
/* compiled from: TTClientBiddingUtil */
public class C3893s {
    /* renamed from: a */
    public static void m12718a(C3431n nVar, Double d) {
        if (nVar != null && nVar.mo19576aj() != null) {
            Map<String, Object> aj = nVar.mo19576aj();
            try {
                Object obj = nVar.mo19576aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str = (String) aj.get("nurl");
                    if (!TextUtils.isEmpty(str)) {
                        if (d != null) {
                            str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                        }
                        C3513m.m10971f().mo19985a(str);
                    }
                }
            } catch (Throwable unused) {
                C2905l.m8110b("report Win error");
            }
        }
    }

    /* renamed from: a */
    public static void m12719a(C3431n nVar, Double d, String str, String str2) {
        if (nVar != null && nVar.mo19576aj() != null) {
            Map<String, Object> aj = nVar.mo19576aj();
            try {
                Object obj = nVar.mo19576aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str3 = (String) aj.get("lurl");
                    if (!TextUtils.isEmpty(str3)) {
                        if (d != null) {
                            str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d));
                        }
                        if (str != null) {
                            str3 = str3.replace("${AUCTION_LOSS}", str);
                        }
                        if (str2 != null) {
                            str3 = str3.replace("${AUCTION_WINNER}", str2);
                        }
                        C3513m.m10971f().mo19985a(str3);
                    }
                }
            } catch (Throwable unused) {
                C2905l.m8110b("report Loss error");
            }
        }
    }
}
