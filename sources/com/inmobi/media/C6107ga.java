package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ga */
/* compiled from: ConfigNetworkRequest */
public final class C6107ga extends C6156ha {

    /* renamed from: d */
    private static final String f15421d = C6107ga.class.getSimpleName();

    /* renamed from: e */
    private static String f15422e = "https://config.inmobi.com/config-server/v1/config/secure.cfg";

    /* renamed from: u */
    private static Map<String, String> f15423u;

    /* renamed from: a */
    int f15424a;

    /* renamed from: b */
    int f15425b;

    /* renamed from: c */
    Map<String, C6093fu> f15426c;

    C6107ga(Map<String, C6093fu> map, C6236ja jaVar, String str, int i, int i2, boolean z, String str2) {
        this(map, jaVar, str, i, i2, false, z, str2);
    }

    /* renamed from: a */
    public final void mo34869a() {
        super.mo34869a();
        this.f15527h.put("p", m18119h());
        this.f15527h.put("im-accid", this.f15538s);
        Map<String, String> map = f15423u;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!this.f15525f.containsKey(next.getKey())) {
                    this.f15525f.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
    }

    /* renamed from: h */
    private String m18119h() {
        long j;
        new C6098fw();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f15426c.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", next.getKey());
                if (((C6093fu) next.getValue()).mo35284g() == null) {
                    j = 0;
                } else {
                    j = C6098fw.m18105c((String) next.getKey(), ((C6093fu) next.getValue()).mo35284g());
                }
                jSONObject.put("t", j);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final String mo35295b() {
        return this.f15538s;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6107ga(Map<String, C6093fu> map, C6236ja jaVar, String str, int i, int i2, boolean z, boolean z2, String str2) {
        super(ShareTarget.METHOD_POST, ((map.get("root") != null) || str == null || str.trim().length() == 0) ? z ? "https://config.inmobi.com/config-server/v1/config/secure.cfg" : f15422e : str, jaVar, z2, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15426c = map;
        this.f15424a = i;
        this.f15425b = i2;
        this.f15538s = str2;
    }
}
