package com.mbridge.msdk.p078c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.d */
/* compiled from: UnitSetting */
public final class C2456d {

    /* renamed from: A */
    private int f5085A;

    /* renamed from: B */
    private int f5086B;

    /* renamed from: C */
    private int f5087C;

    /* renamed from: D */
    private String f5088D = "";

    /* renamed from: E */
    private int f5089E = 10;

    /* renamed from: F */
    private int f5090F = 60;

    /* renamed from: G */
    private String f5091G = "";

    /* renamed from: H */
    private int f5092H = 1;

    /* renamed from: I */
    private int f5093I = 100;

    /* renamed from: J */
    private int f5094J = 0;

    /* renamed from: K */
    private int f5095K;

    /* renamed from: L */
    private int f5096L;

    /* renamed from: a */
    private int f5097a;

    /* renamed from: b */
    private int f5098b;

    /* renamed from: c */
    private int f5099c;

    /* renamed from: d */
    private int f5100d = 30;

    /* renamed from: e */
    private String f5101e;

    /* renamed from: f */
    private String f5102f;

    /* renamed from: g */
    private List<Integer> f5103g;

    /* renamed from: h */
    private long f5104h;

    /* renamed from: i */
    private int f5105i = 1;

    /* renamed from: j */
    private List<Integer> f5106j;

    /* renamed from: k */
    private int f5107k;

    /* renamed from: l */
    private int f5108l;

    /* renamed from: m */
    private int f5109m;

    /* renamed from: n */
    private int f5110n;

    /* renamed from: o */
    private String f5111o;

    /* renamed from: p */
    private int f5112p;

    /* renamed from: q */
    private int f5113q = 1;

    /* renamed from: r */
    private int f5114r = 5000;

    /* renamed from: s */
    private int f5115s;

    /* renamed from: t */
    private int f5116t;

    /* renamed from: u */
    private long f5117u;

    /* renamed from: v */
    private String f5118v;

    /* renamed from: w */
    private int f5119w;

    /* renamed from: x */
    private long f5120x;

    /* renamed from: y */
    private long f5121y;

    /* renamed from: z */
    private int f5122z = 60;

    /* renamed from: a */
    public final String mo16306a() {
        return this.f5091G;
    }

    /* renamed from: a */
    public final void mo16307a(int i) {
        this.f5086B = i;
    }

    /* renamed from: b */
    public final void mo16310b(int i) {
        this.f5087C = i;
    }

    /* renamed from: b */
    public final int mo16309b() {
        return this.f5122z;
    }

    /* renamed from: c */
    public final int mo16311c() {
        return this.f5085A;
    }

    /* renamed from: d */
    public final int mo16313d() {
        return this.f5096L;
    }

    /* renamed from: e */
    public final int mo16314e() {
        return this.f5093I;
    }

    /* renamed from: f */
    public final int mo16315f() {
        return this.f5094J;
    }

    /* renamed from: g */
    public final int mo16316g() {
        return this.f5095K;
    }

    /* renamed from: h */
    public final long mo16318h() {
        return this.f5117u;
    }

    /* renamed from: i */
    public final int mo16319i() {
        return this.f5115s;
    }

    /* renamed from: c */
    public final void mo16312c(int i) {
        this.f5115s = i;
    }

    /* renamed from: j */
    public final int mo16320j() {
        return this.f5116t;
    }

    /* renamed from: k */
    public static C2456d m6073k() {
        return new C2456d();
    }

    /* renamed from: l */
    public final int mo16321l() {
        return this.f5110n;
    }

    /* renamed from: m */
    public final int mo16322m() {
        return this.f5113q;
    }

    /* renamed from: n */
    public final int mo16323n() {
        return this.f5114r;
    }

    /* renamed from: o */
    public final int mo16324o() {
        return this.f5108l;
    }

    /* renamed from: p */
    public final int mo16325p() {
        return this.f5109m;
    }

    public final String toString() {
        List<Integer> list = this.f5103g;
        String str = "";
        if (list != null && list.size() > 0) {
            for (Integer num : this.f5103g) {
                str = str + num + ",";
            }
        }
        return "offset = " + this.f5105i + " unitId = " + this.f5101e + " fbPlacementId = " + this.f5102f + str;
    }

    /* renamed from: a */
    public final void mo16308a(String str) {
        this.f5101e = str;
    }

    /* renamed from: q */
    public final List<Integer> mo16326q() {
        return this.f5103g;
    }

    /* renamed from: r */
    public final List<Integer> mo16327r() {
        return this.f5106j;
    }

    /* renamed from: b */
    public static C2456d m6068b(String str) {
        C2456d dVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C2456d dVar2 = new C2456d();
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar2.f5101e = jSONObject.optString("unitId");
                String optString = jSONObject.optString("ab_id");
                dVar2.f5091G = optString;
                C8388a.f20464c.put(dVar2.f5101e, optString);
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    dVar2.f5103g = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    dVar2.f5106j = arrayList2;
                }
                dVar2.f5107k = jSONObject.optInt("tpqn");
                dVar2.f5108l = jSONObject.optInt("aqn");
                dVar2.f5109m = jSONObject.optInt("acn");
                dVar2.f5110n = jSONObject.optInt("wt");
                int i3 = 1;
                dVar2.f5113q = jSONObject.optInt("iscasf", 1);
                dVar2.f5114r = jSONObject.optInt("spmxrt", 5000);
                dVar2.f5104h = jSONObject.optLong("current_time");
                dVar2.f5105i = jSONObject.optInt("offset");
                dVar2.f5117u = jSONObject.optLong("dlct", 3600);
                dVar2.f5115s = jSONObject.optInt("autoplay", 0);
                dVar2.f5116t = jSONObject.optInt("dlnet", 2);
                dVar2.f5118v = jSONObject.optString("no_offer");
                dVar2.f5119w = jSONObject.optInt("cb_type");
                dVar2.f5120x = jSONObject.optLong("clct", 86400);
                dVar2.f5121y = jSONObject.optLong("clcq", 300);
                dVar2.f5093I = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                dVar2.f5094J = jSONObject.optInt("cd_rate", 0);
                dVar2.f5095K = jSONObject.optInt("content", 1);
                dVar2.f5096L = jSONObject.optInt("impt", 0);
                dVar2.f5112p = jSONObject.optInt("icon_type", 1);
                dVar2.f5111o = jSONObject.optString("no_ads_url", "");
                dVar2.f5097a = jSONObject.optInt("playclosebtn_tm", -1);
                dVar2.f5098b = jSONObject.optInt("play_ctdown", 0);
                dVar2.f5099c = jSONObject.optInt("close_alert", 0);
                dVar2.f5100d = jSONObject.optInt("intershowlimit", 30);
                dVar2.f5122z = jSONObject.optInt("refreshFq", 60);
                dVar2.f5085A = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2) {
                    if (optInt > 0) {
                        i3 = optInt;
                    }
                }
                dVar2.f5092H = i3;
                dVar2.f5088D = jSONObject.optString("placementid", "");
                dVar2.f5089E = jSONObject.optInt("ltafemty", 10);
                dVar2.f5090F = jSONObject.optInt("ltorwc", 60);
                return dVar2;
            } catch (Exception e) {
                e = e;
                dVar = dVar2;
                e.printStackTrace();
                return dVar;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return dVar;
        }
    }

    /* renamed from: s */
    public final JSONObject mo16328s() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f5103g != null && this.f5103g.size() > 0) {
                int size = this.f5103g.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f5103g.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            if (this.f5106j != null && this.f5106j.size() > 0) {
                int size2 = this.f5106j.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(this.f5106j.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f5107k);
            jSONObject.put("aqn", this.f5108l);
            jSONObject.put("acn", this.f5109m);
            jSONObject.put("wt", this.f5110n);
            jSONObject.put("current_time", this.f5104h);
            jSONObject.put("offset", this.f5105i);
            jSONObject.put("dlct", this.f5117u);
            jSONObject.put("autoplay", this.f5115s);
            jSONObject.put("dlnet", this.f5116t);
            jSONObject.put("no_offer", this.f5118v);
            jSONObject.put("cb_type", this.f5119w);
            jSONObject.put("clct", this.f5120x);
            jSONObject.put("clcq", this.f5121y);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f5093I);
            jSONObject.put("content", this.f5095K);
            jSONObject.put("impt", this.f5096L);
            jSONObject.put("icon_type", this.f5112p);
            jSONObject.put("no_ads_url", this.f5111o);
            jSONObject.put("playclosebtn_tm", this.f5097a);
            jSONObject.put("play_ctdown", this.f5098b);
            jSONObject.put("close_alert", this.f5099c);
            jSONObject.put("closeBtn", this.f5085A);
            jSONObject.put("refreshFq", this.f5122z);
            jSONObject.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_COUNTDOWN, this.f5087C);
            jSONObject.put("allowSkip", this.f5086B);
            jSONObject.put("tmorl", this.f5092H);
            jSONObject.put("unitId", this.f5101e);
            jSONObject.put("placementid", this.f5088D);
            jSONObject.put("ltafemty", this.f5089E);
            jSONObject.put("ltorwc", this.f5090F);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: t */
    public final long mo16329t() {
        return this.f5104h;
    }

    /* renamed from: u */
    public final int mo16331u() {
        return this.f5105i;
    }

    /* renamed from: c */
    public static C2456d m6069c(String str) {
        C2456d k = m6073k();
        k.f5115s = 0;
        return k;
    }

    /* renamed from: d */
    public static C2456d m6070d(String str) {
        C2456d dVar = new C2456d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        dVar.f5105i = 1;
        dVar.f5101e = str;
        dVar.f5103g = arrayList;
        dVar.f5106j = arrayList2;
        dVar.f5107k = 1;
        dVar.f5109m = -2;
        dVar.f5108l = -2;
        dVar.f5110n = 5;
        dVar.f5117u = 3600;
        dVar.f5116t = 2;
        dVar.f5115s = 1;
        dVar.f5093I = 100;
        dVar.f5094J = 0;
        dVar.f5095K = 1;
        dVar.f5096L = 0;
        dVar.f5122z = 60;
        dVar.f5089E = 10;
        dVar.f5090F = 60;
        return dVar;
    }

    /* renamed from: e */
    public static C2456d m6071e(String str) {
        C2456d dVar = new C2456d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            dVar.f5103g = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            dVar.f5106j = arrayList2;
            dVar.f5101e = str;
            dVar.f5105i = 1;
            dVar.f5107k = 1;
            dVar.f5109m = -2;
            dVar.f5108l = -2;
            dVar.f5110n = 5;
            dVar.f5117u = 3600;
            dVar.f5116t = 2;
            dVar.f5115s = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public static C2456d m6072f(String str) {
        C2456d dVar = new C2456d();
        try {
            dVar.f5101e = str;
            dVar.f5105i = 1;
            dVar.f5107k = 1;
            dVar.f5110n = 5;
            dVar.f5109m = 1;
            dVar.f5108l = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: g */
    public final void mo16317g(String str) {
        this.f5088D = str;
    }

    /* renamed from: v */
    public final int mo16332v() {
        return this.f5089E;
    }

    /* renamed from: w */
    public final int mo16333w() {
        return this.f5090F;
    }
}
