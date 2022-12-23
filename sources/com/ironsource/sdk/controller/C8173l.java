package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p286h.C8302b;
import com.ironsource.sdk.p286h.C8305c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
final class C8173l {

    /* renamed from: a */
    String f19863a;

    /* renamed from: b */
    C8302b f19864b;

    C8173l(String str, C8302b bVar) {
        this.f19863a = str;
        this.f19864b = bVar;
    }

    /* renamed from: a */
    static C8305c m23321a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new C8305c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    /* renamed from: a */
    static JSONObject m23322a(C8176n nVar, long j) {
        try {
            return nVar.mo56468a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m23323a(C8176n nVar, String str) {
        try {
            return nVar.mo56468a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m23324a(C8176n nVar, JSONObject jSONObject) {
        try {
            return nVar.mo56468a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static C8305c m23325b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new C8305c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
