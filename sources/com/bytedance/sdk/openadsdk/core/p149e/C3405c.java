package com.bytedance.sdk.openadsdk.core.p149e;

import com.bytedance.sdk.component.utils.C2905l;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.c */
/* compiled from: AppInfo */
public class C3405c {

    /* renamed from: f */
    private static int f8204f = 1;

    /* renamed from: g */
    private static int f8205g = 5;

    /* renamed from: a */
    private String f8206a = "";

    /* renamed from: b */
    private String f8207b = "";

    /* renamed from: c */
    private String f8208c = "";

    /* renamed from: d */
    private double f8209d = -1.0d;

    /* renamed from: e */
    private int f8210e = -1;

    /* renamed from: h */
    private int f8211h;

    /* renamed from: a */
    public String mo19400a() {
        return this.f8206a;
    }

    /* renamed from: a */
    public void mo19403a(String str) {
        this.f8206a = str;
    }

    /* renamed from: b */
    public String mo19404b() {
        return this.f8207b;
    }

    /* renamed from: b */
    public void mo19406b(String str) {
        this.f8207b = str;
    }

    /* renamed from: c */
    public String mo19407c() {
        return this.f8208c;
    }

    /* renamed from: c */
    public void mo19408c(String str) {
        this.f8208c = str;
    }

    /* renamed from: d */
    public double mo19409d() {
        return this.f8209d;
    }

    /* renamed from: a */
    public void mo19401a(double d) {
        if (d < ((double) f8204f) || d > ((double) f8205g)) {
            this.f8209d = -1.0d;
        } else {
            this.f8209d = d;
        }
    }

    /* renamed from: e */
    public int mo19410e() {
        return this.f8210e;
    }

    /* renamed from: a */
    public void mo19402a(int i) {
        if (i <= 0) {
            this.f8210e = -1;
        } else {
            this.f8210e = i;
        }
    }

    /* renamed from: f */
    public int mo19411f() {
        return this.f8211h;
    }

    /* renamed from: b */
    public void mo19405b(int i) {
        this.f8211h = i;
    }

    /* renamed from: g */
    public JSONObject mo19412g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, mo19404b());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, mo19411f());
            jSONObject.put("comment_num", mo19410e());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, mo19400a());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, mo19407c());
            jSONObject.put("score", mo19409d());
        } catch (Exception e) {
            C2905l.m8110b(e.toString());
        }
        return jSONObject;
    }
}
