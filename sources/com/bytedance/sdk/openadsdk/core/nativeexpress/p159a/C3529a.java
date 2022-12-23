package com.bytedance.sdk.openadsdk.core.nativeexpress.p159a;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.a.a */
/* compiled from: TemplateUtils */
public class C3529a {

    /* renamed from: a */
    private static String f8889a = "";

    /* renamed from: a */
    public static boolean m11075a(C3431n nVar) {
        return true;
    }

    /* renamed from: a */
    public static boolean m11074a(C3431n.C3432a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.mo19672b()) || TextUtils.isEmpty(aVar.mo19678e())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m11072a(float f, float f2, boolean z, C3431n nVar) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!m11074a(nVar.mo19514G())) {
                f8889a = "";
            }
            jSONObject.put(TapjoyConstants.TJC_PLATFORM, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, m11073a(false, nVar));
            if (nVar.mo19514G() != null) {
                str2 = nVar.mo19514G().mo19678e();
                str = nVar.mo19514G().mo19680f();
            } else {
                str2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                f8889a = str2;
            } else if (!(nVar == null || nVar.mo19514G() == null || C2533a.m6372c(nVar.mo19514G().mo19672b()) == null)) {
                f8889a = C2533a.m6372c(nVar.mo19514G().mo19672b()).mo16621e();
            }
            jSONObject.put("template_Plugin", f8889a);
            jSONObject.put("diff_template_Plugin", str);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m11073a(boolean z, C3431n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nVar.mo19530W());
            if (nVar.mo19520M() != null) {
                if (nVar.mo19520M() != null) {
                    if (!TextUtils.isEmpty(nVar.mo19520M().mo19468a())) {
                        jSONObject.put(RewardPlus.ICON, nVar.mo19520M().mo19468a());
                    }
                }
                jSONObject.put(RewardPlus.ICON, "");
            }
            JSONArray jSONArray = new JSONArray();
            if (nVar.mo19523P() != null) {
                for (int i = 0; i < nVar.mo19523P().size(); i++) {
                    C3417k kVar = nVar.mo19523P().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", kVar.mo19475c());
                    jSONObject2.put("width", kVar.mo19472b());
                    jSONObject2.put("url", kVar.mo19468a());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nVar.mo19570ad());
            jSONObject.put("interaction_type", nVar.mo19519L());
            jSONObject.put("interaction_method", nVar.mo19618g());
            jSONObject.put("is_compliance_template", m11075a(nVar));
            jSONObject.put("title", nVar.mo19528U());
            jSONObject.put("description", nVar.mo19529V());
            jSONObject.put("source", nVar.mo19518K());
            if (nVar.mo19567aa() != null) {
                jSONObject.put("comment_num", nVar.mo19567aa().mo19410e());
                jSONObject.put("score", nVar.mo19567aa().mo19409d());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, nVar.mo19567aa().mo19411f());
                jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, nVar.mo19567aa().mo19412g());
            }
            if (nVar.mo19517J() != null) {
                jSONObject.put("video", nVar.mo19517J().mo15961p());
            }
            if (nVar.mo19514G() != null) {
                jSONObject.put("dynamic_creative", nVar.mo19514G().mo19682g());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11071a(C3431n nVar, String str) {
        List<C3417k> P;
        if (!(nVar == null || (P = nVar.mo19523P()) == null || P.size() <= 0)) {
            for (C3417k next : P) {
                if (next != null && TextUtils.equals(str, next.mo19468a())) {
                    return next.mo19479g();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m11076b(C3431n nVar) {
        HashMap hashMap = null;
        if (nVar == null) {
            return null;
        }
        List<C3417k> P = nVar.mo19523P();
        if (P != null && P.size() > 0) {
            hashMap = new HashMap();
            for (C3417k next : P) {
                if (next != null) {
                    hashMap.put(next.mo19468a(), next.mo19479g());
                }
            }
        }
        return hashMap;
    }
}
