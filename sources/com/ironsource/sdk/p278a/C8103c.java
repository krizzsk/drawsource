package com.ironsource.sdk.p278a;

import android.util.Base64;
import com.ironsource.p196a.C6344d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.a.c */
public final class C8103c implements C6344d {
    /* renamed from: a */
    public final String mo35744a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", new Object[]{"data", Base64.encodeToString(new JSONObject().put("table", "supersonic.adunitanalytics.ad_unit_events").put("data", new JSONObject(map)).toString().getBytes(), 2)});
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
