package com.unity3d.services.core.device.reader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.q */
/* compiled from: MinimalDeviceInfoReader */
public class C12058q implements C12049p {
    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        HashMap hashMap = new HashMap();
        hashMap.put(TapjoyConstants.TJC_PLATFORM, "android");
        hashMap.put(SmaatoSdk.KEY_SDK_VERSION, Integer.valueOf(C12088d.m32941n()));
        hashMap.put("sdkVersionName", C12088d.m32942o());
        hashMap.put("idfi", C12014b.m32739v());
        hashMap.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
        hashMap.put("gameId", C12084a.m32909f());
        return hashMap;
    }
}
