package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import org.json.JSONException;
import org.json.JSONObject;

public class WebGLCheckSignal extends AbsFeedBackForH5 {
    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C8388a.m23845e().mo56908c(jSONObject.optInt("webgl"));
            C8388a.m23845e().mo56902a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
