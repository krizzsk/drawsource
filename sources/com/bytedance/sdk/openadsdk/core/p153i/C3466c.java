package com.bytedance.sdk.openadsdk.core.p153i;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.c */
/* compiled from: JsConfiglInfo */
public class C3466c {

    /* renamed from: a */
    public String f8579a = "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js";

    /* renamed from: b */
    public boolean f8580b = true;

    public C3466c(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            this.f8579a = optJSONObject.optString("url", "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js");
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.f8580b = arrayList.contains("load_finish");
        } catch (Exception unused) {
        }
    }
}
