package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.media.C6074ft;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ba */
/* compiled from: AdFactory */
public final class C5789ba {

    /* renamed from: a */
    private static final String f14553a = C5783aw.class.getSimpleName();

    /* renamed from: a */
    private static void m17196a(C5783aw awVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("pubContent");
            if (!jSONObject2.isNull("rootContainer")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                for (String a : m17202e(jSONObject3)) {
                    m17198a(jSONArray, a, (byte) 2);
                }
                for (String a2 : m17203f(jSONObject3)) {
                    m17198a(jSONArray, a2, (byte) 1);
                }
                boolean d = m17201d(jSONObject3);
                awVar.assetUrls = jSONArray;
                awVar.mIsPreloadWebView = d;
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    /* renamed from: a */
    public static C5783aw m17193a(C5783aw awVar, C6074ft ftVar) throws JSONException, C5845bu {
        if (!"inmobiJson".equals(awVar.mo34679i())) {
            return awVar;
        }
        JSONObject jSONObject = new JSONObject(awVar.mo34680j());
        String c = m17200c(jSONObject.getJSONObject("rootContainer"));
        if (c.trim().length() == 0) {
            return awVar;
        }
        C5949dv a = new C5943ds(ftVar.vastVideo).mo35055a(c);
        JSONArray jSONArray = awVar.assetUrls;
        if (a.f15081f == 0) {
            String b = a.mo35061b();
            if (b == null || b.isEmpty()) {
                throw new C5845bu(401);
            }
            m17198a(jSONArray, b, (byte) 0);
            List<String> a2 = m17195a(jSONObject, ftVar.vastVideo);
            a2.size();
            for (String a3 : a2) {
                m17198a(jSONArray, a3, (byte) 0);
            }
            for (String a4 : m17194a(jSONObject)) {
                m17198a(jSONArray, a4, (byte) 2);
            }
            for (String a5 : m17199b(jSONObject)) {
                m17198a(jSONArray, a5, (byte) 1);
            }
            return new C5839bo(awVar, jSONArray, a.mo35061b(), a.f15077b, a.f15078c, a.f15079d, a.f15080e);
        }
        throw new C5845bu(a.f15081f);
    }

    /* renamed from: a */
    private static void m17198a(JSONArray jSONArray, String str, byte b) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", b);
        jSONObject.put("url", str);
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static List<String> m17195a(JSONObject jSONObject, C6074ft.C6089k kVar) {
        C5949dv a;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    String c = m17200c(jSONArray.getJSONObject(i).getJSONObject("rootContainer"));
                    if (!(c.trim().length() == 0 || (a = new C5943ds(kVar).mo35055a(c)) == null)) {
                        if (a.f15081f == 0) {
                            String b = a.mo35061b();
                            if (b != null && !b.isEmpty()) {
                                arrayList.add(b);
                            }
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m17194a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m17202e(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m17199b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m17203f(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private static String m17200c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return "";
            }
            String string = jSONObject.getString("assetType");
            if ("video".equalsIgnoreCase(string)) {
                return jSONArray.getString(0);
            }
            if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return "";
            }
            String str = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                str = m17200c(jSONArray.getJSONObject(i));
                if (str.trim().length() != 0) {
                    break;
                }
            }
            return str;
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return "";
        }
    }

    /* renamed from: d */
    private static boolean m17201d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if ("webview".equalsIgnoreCase(string)) {
                if (jSONObject.isNull("preload") || !jSONObject.getBoolean("preload")) {
                    return false;
                }
                return true;
            } else if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return false;
            } else {
                int i = 0;
                boolean z = false;
                while (i < jSONArray.length() && !(z = m17201d(jSONArray.getJSONObject(i)))) {
                    i++;
                }
                return z;
            }
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return false;
        }
    }

    /* renamed from: e */
    private static List<String> m17202e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("image".equalsIgnoreCase(string)) {
                if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                    arrayList.add(jSONArray.getString(0));
                }
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m17202e(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    private static List<String> m17203f(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("gif".equalsIgnoreCase(string)) {
                arrayList.add(jSONArray.getString(0));
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m17203f(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m17197a(C5783aw awVar, JSONObject jSONObject, String str, long j) throws JSONException, IllegalStateException {
        long j2;
        if ("unknown".equals(awVar.markupType) || TextUtils.isEmpty(awVar.impressionId)) {
            throw new IllegalStateException("Invalid Ad");
        }
        long optLong = jSONObject.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j));
        if (optLong <= 0) {
            j2 = -1;
        } else {
            j2 = TimeUnit.SECONDS.toMillis(optLong);
        }
        awVar.mAdContent = jSONObject;
        awVar.mAdType = str;
        awVar.mInsertionTimestampInMillis = System.currentTimeMillis();
        awVar.mExpiryDurationInMillis = j2;
        if ("inmobiJson".equals(awVar.mo34679i())) {
            m17196a(awVar, jSONObject);
        }
    }
}
