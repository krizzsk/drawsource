package com.mbridge.msdk.videocommon.p373b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.b */
/* compiled from: AdUnitInfo */
public final class C9629b {

    /* renamed from: a */
    private int f23912a;

    /* renamed from: b */
    private int f23913b;

    /* renamed from: c */
    private C9628a f23914c;

    public C9629b(int i, int i2, C9628a aVar) {
        this.f23912a = i;
        this.f23913b = i2;
        this.f23914c = aVar;
    }

    /* renamed from: a */
    public final int mo63522a() {
        return this.f23912a;
    }

    /* renamed from: b */
    public final int mo63523b() {
        return this.f23913b;
    }

    /* renamed from: a */
    public static List<C9629b> m27337a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new C9629b(optInt, optInt2, optJSONObject2 != null ? C9628a.m27336a(optJSONObject2) : null));
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
