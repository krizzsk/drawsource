package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.c */
/* compiled from: IntentFilter */
public final class C8858c implements C8856a {
    /* renamed from: a */
    public final boolean mo58583a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals(SDKConstants.PARAM_INTENT)) {
            return false;
        }
        return C6779b.m20649d(C8388a.m23845e().mo56913g(), str);
    }
}
