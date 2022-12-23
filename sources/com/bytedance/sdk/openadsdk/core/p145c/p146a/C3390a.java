package com.bytedance.sdk.openadsdk.core.p145c.p146a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.a */
/* compiled from: DynamicAdInfo */
public class C3390a {

    /* renamed from: a */
    private String f8172a;

    /* renamed from: b */
    private String f8173b;

    /* renamed from: c */
    private String f8174c;

    public C3390a(String str, String str2, String str3) {
        this.f8172a = str;
        this.f8173b = str2;
        this.f8174c = str3;
    }

    /* renamed from: a */
    public JSONObject mo19372a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f8172a)) {
                jSONObject.put(BidResponsedEx.KEY_CID, this.f8172a);
            }
            if (!TextUtils.isEmpty(this.f8173b)) {
                jSONObject.put("log_extra", this.f8173b);
            }
            if (!TextUtils.isEmpty(this.f8174c)) {
                jSONObject.put(DownloadModel.DOWNLOAD_URL, this.f8174c);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
