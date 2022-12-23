package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p216c.C6621b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.server.b */
public class C6729b {

    /* renamed from: a */
    private String f17538a;

    /* renamed from: b */
    private String f17539b;

    /* renamed from: c */
    private String f17540c;

    /* renamed from: d */
    private List<String> f17541d;

    /* renamed from: e */
    private List<String> f17542e;

    /* renamed from: f */
    private List<String> f17543f;

    /* renamed from: g */
    private boolean f17544g;

    /* renamed from: h */
    private ImpressionData f17545h;

    public C6729b(String str) {
        this.f17538a = str;
        this.f17539b = "";
        this.f17540c = "";
        this.f17541d = new ArrayList();
        this.f17542e = new ArrayList();
        this.f17543f = new ArrayList();
        this.f17544g = true;
        this.f17545h = null;
    }

    public C6729b(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public C6729b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f17544g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f17538a = jSONObject.getString("instance");
            }
            this.f17539b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getJSONObject("serverData").toString() : "";
            this.f17540c = jSONObject.has("price") ? jSONObject.getString("price") : "0";
            this.f17541d = new ArrayList();
            this.f17542e = new ArrayList();
            this.f17543f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f17541d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f17542e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f17543f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f17545h = new ImpressionData(C6621b.m20126a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f17544g = true;
        } catch (Exception e) {
            IronLog.INTERNAL.error("AuctionResponseItem exception " + e.getMessage());
        }
    }

    /* renamed from: a */
    public ImpressionData mo36941a(String str) {
        if (this.f17545h == null) {
            return null;
        }
        ImpressionData impressionData = new ImpressionData(this.f17545h);
        impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        return impressionData;
    }

    /* renamed from: a */
    public String mo36942a() {
        return this.f17538a;
    }

    /* renamed from: b */
    public String mo36943b() {
        return this.f17539b;
    }

    /* renamed from: c */
    public String mo36944c() {
        return this.f17540c;
    }

    /* renamed from: d */
    public List<String> mo36945d() {
        return this.f17541d;
    }

    /* renamed from: e */
    public List<String> mo36946e() {
        return this.f17542e;
    }

    /* renamed from: f */
    public List<String> mo36947f() {
        return this.f17543f;
    }

    /* renamed from: g */
    public boolean mo36948g() {
        return this.f17544g;
    }
}
