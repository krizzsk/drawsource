package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2612c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2613d;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2615e;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2616f;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2628e;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g */
/* compiled from: DynamicLayoutInflater */
public class C2633g {

    /* renamed from: g */
    private static HashMap<String, String> f5715g;

    /* renamed from: a */
    private JSONObject f5716a;

    /* renamed from: b */
    private JSONObject f5717b;

    /* renamed from: c */
    private C2612c f5718c;

    /* renamed from: d */
    private C2634a f5719d;

    /* renamed from: e */
    private C2625b f5720e;

    /* renamed from: f */
    private C2613d f5721f;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f5715g = hashMap;
        hashMap.put("subtitle", "description");
        f5715g.put("source", "source|app.app_name");
        f5715g.put("screenshot", "dynamic_creative.screenshot");
    }

    public C2633g(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f5716a = jSONObject;
        this.f5717b = jSONObject2;
        this.f5718c = new C2612c(jSONObject2);
        this.f5719d = C2634a.m7061a(jSONObject3);
        this.f5721f = C2613d.m6764a(jSONObject4);
    }

    /* renamed from: a */
    public C2618h mo17126a() {
        JSONObject jSONObject;
        this.f5718c.mo16871a();
        try {
            jSONObject = new JSONObject(this.f5721f.f5582b);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C2618h a = mo17128a(C2627d.m7026a(this.f5716a, jSONObject), (C2618h) null);
        m7056a(a);
        C2628e eVar = new C2628e();
        C2628e.C2629a aVar = new C2628e.C2629a();
        aVar.f5704a = this.f5719d.f5722a;
        aVar.f5705b = this.f5719d.f5723b;
        aVar.f5706c = 0.0f;
        eVar.mo17117a(aVar);
        eVar.mo17116a(a, 0.0f, 0.0f);
        eVar.mo17114a();
        if (eVar.f5700a.f5572d == 65536.0f) {
            return null;
        }
        return eVar.f5700a.f5574f;
    }

    /* renamed from: a */
    private void m7056a(C2618h hVar) {
        float f;
        if (hVar != null) {
            int b = C2572b.m6626b(C2570c.m6618a(), (float) C2572b.m6624a(C2570c.m6618a()));
            if (this.f5719d.f5724c) {
                f = this.f5719d.f5722a;
            } else {
                f = Math.min(this.f5719d.f5722a, (float) b);
            }
            if (this.f5719d.f5723b == 0.0f) {
                hVar.mo17076e(f);
                hVar.mo17082i().mo16882e().mo16973i("auto");
                hVar.mo17078f(0.0f);
                return;
            }
            hVar.mo17076e(f);
            hVar.mo17078f(this.f5719d.f5724c ? this.f5719d.f5723b : Math.min(this.f5719d.f5723b, (float) C2572b.m6626b(C2570c.m6618a(), (float) C2572b.m6628c(C2570c.m6618a()))));
            hVar.mo17082i().mo16882e().mo16973i("fixed");
        }
    }

    /* renamed from: a */
    public C2618h mo17128a(JSONObject jSONObject, C2618h hVar) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f5721f != null) {
                C2625b bVar = new C2625b();
                this.f5720e = bVar;
                JSONObject a = bVar.mo17110a(this.f5721f.f5581a, optInt, jSONObject);
                if (a != null) {
                    jSONObject = a;
                }
            }
        }
        C2618h a2 = mo17127a(jSONObject);
        a2.mo17068b(hVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            a2.mo17065a((List<C2618h>) null);
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i2);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    i = a2.mo17082i().mo16882e().mo16901Q();
                } else {
                    i = optJSONArray2.length();
                }
                for (int i3 = 0; i3 < i; i3++) {
                    C2618h a3 = mo17128a(optJSONArray2.optJSONObject(i3), a2);
                    arrayList.add(a3);
                    arrayList3.add(a3);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            a2.mo17065a((List<C2618h>) arrayList);
        }
        if (arrayList2.size() > 0) {
            a2.mo17070b((List<List<C2618h>>) arrayList2);
        }
        return a2;
    }

    /* renamed from: a */
    public C2618h mo17127a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        C2638j.m7072a(optString, optJSONObject);
        JSONObject a = C2638j.m7069a(optString, C2638j.m7070a(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        C2618h hVar = new C2618h();
        if (TextUtils.isEmpty(optString2)) {
            hVar.mo17069b(String.valueOf(hVar.hashCode()));
        } else {
            hVar.mo17069b(optString2);
        }
        if (optJSONObject != null) {
            hVar.mo17072c((float) optJSONObject.optDouble("x"));
            hVar.mo17074d((float) optJSONObject.optDouble("y"));
            hVar.mo17076e((float) optJSONObject.optDouble("width"));
            hVar.mo17078f((float) optJSONObject.optDouble("height"));
            hVar.mo17080g((float) optJSONObject.optInt("remainWidth"));
            C2615e eVar = new C2615e();
            eVar.mo16875a(optString);
            eVar.mo16878b(optJSONObject.optString("data"));
            eVar.mo16880c(optJSONObject.optString("dataExtraInfo"));
            C2616f c = C2616f.m6778c(optJSONObject);
            eVar.mo16874a(c);
            C2616f c2 = C2616f.m6778c(a);
            if (c2 == null) {
                eVar.mo16877b(c);
            } else {
                eVar.mo16877b(c2);
            }
            m7055a(c);
            m7055a(c2);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f5717b) != null) {
                m7054a(eVar, jSONObject2.optInt("image_mode"));
            }
            String b = eVar.mo16876b();
            C2616f e = eVar.mo16882e();
            if (f5715g.containsKey(b) && !e.mo16891G()) {
                e.mo17005r(f5715g.get(b));
            }
            if (e.mo16891G()) {
                str = eVar.mo16879c();
            } else {
                str = m7053a(eVar.mo16879c());
            }
            if (C2570c.m6619b()) {
                if (TextUtils.equals(b, "star") || TextUtils.equals(b, "text_star")) {
                    str = m7053a("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(b, "score-count") || TextUtils.equals(b, "score-count-type-1") || TextUtils.equals(b, "score-count-type-2")) {
                    str = m7053a("dynamic_creative.comment_num_i18n|");
                }
            }
            if (TextUtils.isEmpty(m7057b()) || (!TextUtils.equals("logo-union", optString) && !TextUtils.equals("logo", optString))) {
                eVar.mo16878b(str);
            } else {
                eVar.mo16878b(str + "adx:" + m7057b());
            }
            hVar.mo17062a(eVar);
        }
        return hVar;
    }

    /* renamed from: a */
    private void m7054a(C2615e eVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            eVar.mo16875a("video");
            String a = C2638j.m7068a("video");
            eVar.mo16882e().mo17005r(a);
            eVar.mo16883f().mo17005r(a);
            eVar.mo16878b(a);
            eVar.mo16882e().mo16930al();
            return;
        }
        eVar.mo16875a("image");
        String a2 = C2638j.m7068a("image");
        eVar.mo16882e().mo17005r(a2);
        eVar.mo16883f().mo17005r(a2);
        eVar.mo16878b(a2);
        if (a2 != null && (lastIndexOf = a2.lastIndexOf(".")) > 0) {
            String substring = a2.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", m7053a(substring + ".width"));
                jSONObject.put("height", m7053a(substring + ".height"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            eVar.mo16880c(jSONObject.toString());
        }
        eVar.mo16882e().mo16931am();
    }

    /* renamed from: a */
    private String m7053a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f5718c.mo16872b(str2)) {
                String valueOf = String.valueOf(this.f5718c.mo16870a(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    private String m7057b() {
        C2612c cVar = this.f5718c;
        if (cVar == null) {
            return "";
        }
        return String.valueOf(cVar.mo16870a("adx_name"));
    }

    /* renamed from: a */
    private void m7055a(C2616f fVar) {
        if (fVar != null) {
            String s = fVar.mo17006s();
            if (!TextUtils.isEmpty(s)) {
                int indexOf = s.indexOf("{{");
                int indexOf2 = s.indexOf("}}");
                if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
                    String a = m7053a(s.substring(indexOf + 1, indexOf2));
                    if (!TextUtils.isEmpty(a)) {
                        fVar.mo16981k((s.substring(0, indexOf) + s.substring(indexOf2 + 2)) + a);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g$a */
    /* compiled from: DynamicLayoutInflater */
    static class C2634a {

        /* renamed from: a */
        float f5722a;

        /* renamed from: b */
        float f5723b;

        /* renamed from: c */
        boolean f5724c;

        /* renamed from: a */
        public static C2634a m7061a(JSONObject jSONObject) {
            C2634a aVar = new C2634a();
            if (jSONObject != null) {
                aVar.f5722a = (float) jSONObject.optDouble("width");
                aVar.f5723b = (float) jSONObject.optDouble("height");
                aVar.f5724c = jSONObject.optBoolean("isLandscape");
            }
            return aVar;
        }
    }
}
