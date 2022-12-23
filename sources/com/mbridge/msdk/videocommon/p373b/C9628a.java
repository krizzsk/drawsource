package com.mbridge.msdk.videocommon.p373b;

import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.a */
/* compiled from: AdParams */
public final class C9628a {

    /* renamed from: a */
    private String f23910a;

    /* renamed from: b */
    private String f23911b;

    private C9628a(String str, String str2) {
        this.f23910a = str;
        this.f23911b = str2;
    }

    /* renamed from: a */
    public static C9628a m27336a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C9628a(jSONObject.optString("appId"), jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
