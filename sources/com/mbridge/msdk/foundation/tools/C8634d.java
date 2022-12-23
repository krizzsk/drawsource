package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C8469a;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.d */
/* compiled from: DomainDeviceInfo */
public class C8634d {

    /* renamed from: a */
    public String f21139a = C8660r.m24816d();

    /* renamed from: b */
    public String f21140b = C8660r.m24827h();

    /* renamed from: c */
    public String f21141c = "android";

    /* renamed from: d */
    public String f21142d = C8660r.m24832k();

    /* renamed from: e */
    public String f21143e;

    /* renamed from: f */
    public String f21144f;

    /* renamed from: g */
    public String f21145g;

    /* renamed from: h */
    public String f21146h;

    /* renamed from: i */
    public String f21147i;

    /* renamed from: j */
    public String f21148j;

    /* renamed from: k */
    public String f21149k;

    /* renamed from: l */
    public String f21150l;

    /* renamed from: m */
    public String f21151m;

    /* renamed from: n */
    public String f21152n;

    /* renamed from: o */
    public String f21153o;

    public C8634d(Context context) {
        int o = C8660r.m24840o(context);
        this.f21143e = String.valueOf(o);
        this.f21144f = C8660r.m24806a(context, o);
        this.f21145g = C8660r.m24839n(context);
        this.f21146h = C8388a.m23845e().mo56916j();
        this.f21147i = C8388a.m23845e().mo56914h();
        this.f21148j = String.valueOf(C8677z.m24947h(context));
        this.f21149k = String.valueOf(C8677z.m24945g(context));
        this.f21153o = String.valueOf(C8677z.m24936d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f21150l = "landscape";
        } else {
            this.f21150l = "portrait";
        }
        this.f21151m = C8469a.f20750k;
        this.f21152n = C8469a.f20751l;
    }

    /* renamed from: a */
    public JSONObject mo58124a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f21139a);
                jSONObject.put("system_version", this.f21140b);
                jSONObject.put("network_type", this.f21143e);
                jSONObject.put("network_type_str", this.f21144f);
                jSONObject.put("device_ua", this.f21145g);
                jSONObject.put("has_wx", C8660r.m24813c(C8388a.m23845e().mo56913g()));
                jSONObject.put("integrated_wx", C8660r.m24803a());
                jSONObject.put("opensdk_ver", C8660r.m24808b() + "");
                jSONObject.put("wx_api_ver", C8660r.m24809b(C8388a.m23845e().mo56915i()) + "");
            }
            jSONObject.put("plantform", this.f21141c);
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f21142d);
            }
            jSONObject.put("appkey", this.f21146h);
            jSONObject.put("appId", this.f21147i);
            jSONObject.put("screen_width", this.f21148j);
            jSONObject.put("screen_height", this.f21149k);
            jSONObject.put(TJAdUnitConstants.String.ORIENTATION, this.f21150l);
            jSONObject.put("scale", this.f21153o);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f21151m);
            jSONObject.put("c", this.f21152n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
