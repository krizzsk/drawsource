package com.bytedance.sdk.openadsdk.p178l;

import android.content.Context;
import com.bytedance.sdk.component.utils.C2917v;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.l.m */
/* compiled from: PAGNetworkTools */
public class C3884m {
    /* renamed from: a */
    public static String m12673a(Context context) {
        int a = C2917v.m8175a(context, 0);
        if (a == 2) {
            return "2g";
        }
        if (a == 3) {
            return "3g";
        }
        if (a == 4) {
            return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        if (a != 5) {
            return a != 6 ? TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "5g";
        }
        return "4g";
    }

    /* renamed from: b */
    public static boolean m12674b(Context context) {
        return C2917v.m8175a(context, 0) != 0;
    }
}
