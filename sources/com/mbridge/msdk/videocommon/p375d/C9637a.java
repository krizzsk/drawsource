package com.mbridge.msdk.videocommon.p375d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.a */
/* compiled from: RewardSetting */
public class C9637a {

    /* renamed from: a */
    private Map<String, Integer> f23927a;

    /* renamed from: b */
    private Map<String, C9630c> f23928b;

    /* renamed from: c */
    private long f23929c;

    /* renamed from: d */
    private long f23930d;

    /* renamed from: e */
    private long f23931e;

    /* renamed from: f */
    private long f23932f;

    /* renamed from: g */
    private long f23933g;

    /* renamed from: h */
    private long f23934h;

    /* renamed from: i */
    private String f23935i;

    /* renamed from: j */
    private int f23936j = 0;

    /* renamed from: a */
    public final String mo63532a() {
        return this.f23935i;
    }

    /* renamed from: b */
    public final long mo63536b() {
        return this.f23929c * 1000;
    }

    /* renamed from: a */
    public final void mo63534a(long j) {
        this.f23929c = j;
    }

    /* renamed from: c */
    public final long mo63539c() {
        return this.f23930d * 1000;
    }

    /* renamed from: b */
    public final void mo63537b(long j) {
        this.f23930d = j;
    }

    /* renamed from: d */
    public final long mo63541d() {
        return this.f23931e * 1000;
    }

    /* renamed from: c */
    public final void mo63540c(long j) {
        this.f23931e = j;
    }

    /* renamed from: e */
    public final long mo63543e() {
        return this.f23932f;
    }

    /* renamed from: d */
    public final void mo63542d(long j) {
        this.f23932f = j;
    }

    /* renamed from: f */
    public final long mo63545f() {
        return this.f23933g;
    }

    /* renamed from: e */
    public final void mo63544e(long j) {
        this.f23933g = j;
    }

    /* renamed from: a */
    public final void mo63533a(int i) {
        this.f23936j = i;
    }

    /* renamed from: g */
    public final long mo63546g() {
        return this.f23934h;
    }

    /* renamed from: h */
    public final Map<String, Integer> mo63547h() {
        if (this.f23927a == null) {
            HashMap hashMap = new HashMap();
            this.f23927a = hashMap;
            hashMap.put("1", 1000);
            this.f23927a.put("9", 1000);
            this.f23927a.put("8", 1000);
        }
        return this.f23927a;
    }

    /* renamed from: a */
    public final void mo63535a(Map<String, Integer> map) {
        this.f23927a = map;
    }

    /* renamed from: i */
    public final Map<String, C9630c> mo63548i() {
        return this.f23928b;
    }

    /* renamed from: b */
    public final void mo63538b(Map<String, C9630c> map) {
        this.f23928b = map;
    }

    /* renamed from: a */
    public static C9637a m27358a(String str) {
        C9637a aVar;
        C9637a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new C9637a();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return aVar2;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                aVar.f23935i = jSONObject.optString("ab_id", "");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                        if (!TextUtils.isEmpty(next)) {
                            if (TextUtils.isEmpty(next) || intValue != 0) {
                                hashMap.put(next, Integer.valueOf(intValue));
                            } else {
                                hashMap.put(next, 1000);
                            }
                        }
                    }
                    aVar.f23927a = hashMap;
                }
                aVar.f23928b = C9630c.m27341a(jSONObject.optJSONArray("reward"));
                aVar.f23929c = jSONObject.optLong("getpf", 43200);
                aVar.f23930d = jSONObject.optLong("ruct", 5400);
                aVar.f23931e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600);
                aVar.f23932f = jSONObject.optLong("dlct", 3600);
                aVar.f23933g = jSONObject.optLong("vcct", 5);
                aVar.f23934h = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e2) {
                e = e2;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }

    /* renamed from: j */
    public final JSONObject mo63549j() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f23927a != null && this.f23927a.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : this.f23927a.entrySet()) {
                        jSONObject2.put((String) next.getKey(), ((Integer) next.getValue()).intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f23928b != null && this.f23928b.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry next2 : this.f23928b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String str = (String) next2.getKey();
                        C9630c cVar = (C9630c) next2.getValue();
                        if (cVar != null) {
                            jSONObject3.put("name", cVar.mo63524a());
                            jSONObject3.put("amount", cVar.mo63527b());
                            jSONObject3.put("id", str);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f23929c);
            jSONObject.put("ruct", this.f23930d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f23931e);
            jSONObject.put("dlct", this.f23932f);
            jSONObject.put("vcct", this.f23933g);
            jSONObject.put("current_time", this.f23934h);
            jSONObject.put("isDefault", this.f23936j);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
