package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8672v;
import org.json.JSONObject;

public abstract class AbsFeedBackForH5 extends C8888h {

    /* renamed from: e */
    private static int f21868e = 0;

    /* renamed from: f */
    private static int f21869f = 1;

    /* renamed from: d */
    private String f21870d = "AbsFeedBackForH5";

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C8881a aVar = (C8881a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                C2470b.m6168a().mo16420a(jSONObject.optString(SDKConstants.PARAM_KEY, ""), optInt == 1 ? 8 : 0, (ViewGroup) aVar.f21883a);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        Object obj2 = obj;
        try {
            if (!TextUtils.isEmpty(str)) {
                C8881a aVar = (C8881a) obj2;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width", -1);
                int optInt2 = jSONObject.optInt("height", -1);
                int optInt3 = jSONObject.optInt("left", -1);
                int optInt4 = jSONObject.optInt("top", -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                int optInt5 = jSONObject.optInt("radius", 20);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                String optString3 = jSONObject.optString(SDKConstants.PARAM_KEY, "");
                double optDouble2 = jSONObject.optDouble("fontSize", -1.0d);
                float f = (float) optDouble;
                float f2 = (float) optDouble2;
                C2470b.m6168a().mo16418a(optString3, optInt, optInt2, optInt5, (float) optInt3, (float) optInt4, f, optString, optString2, f2, jSONObject.optJSONArray("padding"));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj2, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C8881a aVar = (C8881a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                C2470b.m6168a().mo16417a(jSONObject.optString(SDKConstants.PARAM_KEY, ""), optInt);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21868e);
            jSONObject.put("message", "");
            jSONObject.put("data", new JSONObject());
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            C8672v.m24874a(this.f21870d, e.getMessage());
        }
    }

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21869f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C8672v.m24874a(this.f21870d, e.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f21868e);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            C8672v.m24874a(this.f21870d, e.getMessage());
        }
    }
}
