package com.mbridge.msdk.video.signal.p371a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8633c;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.m */
/* compiled from: JSRewardVideoV1 */
public final class C9518m extends C9510f {

    /* renamed from: a */
    private Activity f23580a;

    /* renamed from: b */
    private MBridgeContainerView f23581b;

    public C9518m(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f23580a = activity;
        this.f23581b = mBridgeContainerView;
    }

    /* renamed from: a */
    public final String mo63272a() {
        C9640c cVar;
        if (this.f23581b == null) {
            super.mo63272a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f23581b.getCampaign());
                String unitID = this.f23581b.getUnitID();
                if (C9638b.m27377a() == null) {
                    cVar = null;
                } else {
                    cVar = C9638b.m27377a().mo63550a(C8388a.m23845e().mo56914h(), unitID);
                }
                JSONObject jSONObject = new JSONObject();
                if (cVar != null) {
                    jSONObject = cVar.mo63562D();
                }
                C8672v.m24874a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f23581b.getCampaign());
                return m27149a(arrayList, unitID, "MAL_16.2.21,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.mo63272a();
    }

    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f23581b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    /* renamed from: a */
    public final void mo63273a(String str) {
        super.mo63273a(str);
        try {
            if (this.f23580a != null && !TextUtils.isEmpty(str) && str.equals("click") && this.f23581b != null) {
                this.f23581b.triggerCloseBtn(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f23581b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    /* renamed from: c */
    public final void mo63275c(String str) {
        super.mo63275c(str);
        try {
            if (this.f23580a != null && !TextUtils.isEmpty(str) && this.f23581b != null) {
                this.f23581b.handlerPlayableException(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo63274b(String str) {
        super.mo63274b(str);
        try {
            if (this.f23580a != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f23580a.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f23580a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m27149a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            C8633c cVar = new C8633c(C8388a.m23845e().mo56913g());
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", parseCamplistToJson);
            jSONObject2.put("device", cVar.mo58124a());
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C2445b.m6020a() != null) {
                String c = C2445b.m6020a().mo16289c(C8388a.m23845e().mo56914h());
                if (!TextUtils.isEmpty(c)) {
                    JSONObject jSONObject3 = new JSONObject(c);
                    try {
                        Context g = C8388a.m23845e().mo56913g();
                        String obj = C8614ab.m24713b(g, "MBridge_ConfirmTitle" + str, "").toString();
                        String obj2 = C8614ab.m24713b(g, "MBridge_ConfirmContent" + str, "").toString();
                        String obj3 = C8614ab.m24713b(g, "MBridge_CancelText" + str, "").toString();
                        String obj4 = C8614ab.m24713b(g, "MBridge_ConfirmText" + str, "").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject3.put("confirm_title", obj);
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject3.put("confirm_description", obj2);
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            jSONObject3.put("confirm_t", obj3);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_play", obj4);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_rv", obj4);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String d = C2445b.m6020a().mo16291d(str);
                    if (!TextUtils.isEmpty(d)) {
                        jSONObject3.put("ivreward", new JSONObject(d));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
