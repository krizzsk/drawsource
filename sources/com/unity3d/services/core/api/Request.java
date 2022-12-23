package com.unity3d.services.core.api;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.C12094c;
import com.unity3d.services.core.request.C12099h;
import com.unity3d.services.core.request.C12101i;
import com.unity3d.services.core.request.C12102j;
import com.unity3d.services.core.request.C12104l;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class Request {
    @WebViewExposed
    public static void get(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, C12160l lVar) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C12104l.m32994a(str2, C12099h.C12100a.f29517b, getHeadersMap(jSONArray), (String) null, num, num2, new C11974a(str));
            lVar.mo71347a(str);
        } catch (Exception e) {
            C12065a.m32842a("Error mapping headers for the request", e);
            lVar.mo71346a(C12101i.MAPPING_HEADERS_FAILED, str);
        }
    }

    public static HashMap<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            List list = hashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            list.add(jSONArray2.getString(1));
            hashMap.put(jSONArray2.getString(0), list);
        }
        return hashMap;
    }

    public static JSONArray getResponseHeadersMap(Map<String, List<String>> map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (String next : map.keySet()) {
                JSONArray jSONArray2 = null;
                for (String put : map.get(next)) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(next);
                    jSONArray3.put(put);
                    jSONArray2 = jSONArray3;
                }
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    @WebViewExposed
    public static void head(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, C12160l lVar) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C12104l.m32993a(str2, C12099h.C12100a.f29518c, getHeadersMap(jSONArray), num, num2, new C11976c(str));
            lVar.mo71347a(str);
        } catch (Exception e) {
            C12065a.m32842a("Error mapping headers for the request", e);
            lVar.mo71346a(C12101i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void post(String str, String str2, String str3, JSONArray jSONArray, Integer num, Integer num2, C12160l lVar) {
        String str4 = (str3 == null || str3.length() != 0) ? str3 : null;
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C12104l.m32994a(str2, C12099h.C12100a.f29516a, getHeadersMap(jSONArray), str4, num, num2, new C11975b(str));
            lVar.mo71347a(str);
        } catch (Exception e) {
            C12065a.m32842a("Error mapping headers for the request", e);
            lVar.mo71346a(C12101i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void setConcurrentRequestCount(Integer num, C12160l lVar) {
        C12104l.m32991a(num.intValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setKeepAliveTime(Integer num, C12160l lVar) {
        C12104l.m32992a(num.longValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setMaximumPoolSize(Integer num, C12160l lVar) {
        C12104l.m32998b(num.intValue());
        lVar.mo71347a(new Object[0]);
    }

    /* renamed from: com.unity3d.services.core.api.Request$a */
    static class C11974a implements C12094c {

        /* renamed from: a */
        final /* synthetic */ String f29116a;

        C11974a(String str) {
            this.f29116a = str;
        }

        /* renamed from: a */
        public void mo71019a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                JSONArray responseHeadersMap = Request.getResponseHeadersMap(map);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.COMPLETE, this.f29116a, str, str2, Integer.valueOf(i), responseHeadersMap);
            } catch (Exception e) {
                C12065a.m32842a("Error parsing response headers", e);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29116a, str, "Error parsing response headers");
            }
        }

        /* renamed from: a */
        public void mo71018a(String str, String str2) {
            C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29116a, str, str2);
        }
    }

    /* renamed from: com.unity3d.services.core.api.Request$b */
    static class C11975b implements C12094c {

        /* renamed from: a */
        final /* synthetic */ String f29117a;

        C11975b(String str) {
            this.f29117a = str;
        }

        /* renamed from: a */
        public void mo71019a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                JSONArray responseHeadersMap = Request.getResponseHeadersMap(map);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.COMPLETE, this.f29117a, str, str2, Integer.valueOf(i), responseHeadersMap);
            } catch (Exception e) {
                C12065a.m32842a("Error parsing response headers", e);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29117a, str, "Error parsing response headers");
            }
        }

        /* renamed from: a */
        public void mo71018a(String str, String str2) {
            C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29117a, str, str2);
        }
    }

    /* renamed from: com.unity3d.services.core.api.Request$c */
    static class C11976c implements C12094c {

        /* renamed from: a */
        final /* synthetic */ String f29118a;

        C11976c(String str) {
            this.f29118a = str;
        }

        /* renamed from: a */
        public void mo71019a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                JSONArray responseHeadersMap = Request.getResponseHeadersMap(map);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.COMPLETE, this.f29118a, str, str2, Integer.valueOf(i), responseHeadersMap);
            } catch (Exception e) {
                C12065a.m32842a("Error parsing response headers", e);
                C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29118a, str, "Error parsing response headers");
            }
        }

        /* renamed from: a */
        public void mo71018a(String str, String str2) {
            C12136a.m33103c().mo71310a((Enum) C12143b.REQUEST, (Enum) C12102j.FAILED, this.f29118a, str, str2);
        }
    }
}
