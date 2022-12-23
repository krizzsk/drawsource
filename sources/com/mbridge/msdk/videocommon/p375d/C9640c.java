package com.mbridge.msdk.videocommon.p375d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.videocommon.p373b.C9629b;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.c */
/* compiled from: RewardUnitSetting */
public final class C9640c {

    /* renamed from: H */
    private static C8414g f23945H;

    /* renamed from: a */
    public static String f23946a;

    /* renamed from: A */
    private int f23947A = 70;

    /* renamed from: B */
    private int f23948B = 0;

    /* renamed from: C */
    private int f23949C = -1;

    /* renamed from: D */
    private int f23950D = -1;

    /* renamed from: E */
    private int f23951E = -1;

    /* renamed from: F */
    private int f23952F;

    /* renamed from: G */
    private int f23953G = 20;

    /* renamed from: I */
    private int f23954I;

    /* renamed from: J */
    private int f23955J = 0;

    /* renamed from: K */
    private int f23956K = 1;

    /* renamed from: L */
    private String f23957L = "";

    /* renamed from: M */
    private int f23958M = 1;

    /* renamed from: N */
    private String f23959N = "";

    /* renamed from: O */
    private int f23960O = 1;

    /* renamed from: P */
    private String f23961P = "Virtual Item";

    /* renamed from: Q */
    private String f23962Q = "";

    /* renamed from: R */
    private int f23963R = 0;

    /* renamed from: S */
    private int f23964S = 1;

    /* renamed from: T */
    private int f23965T = 60;

    /* renamed from: b */
    private String f23966b;

    /* renamed from: c */
    private String f23967c;

    /* renamed from: d */
    private List<C9629b> f23968d;

    /* renamed from: e */
    private long f23969e;

    /* renamed from: f */
    private int f23970f = -1;

    /* renamed from: g */
    private int f23971g = 0;

    /* renamed from: h */
    private int f23972h = 0;

    /* renamed from: i */
    private int f23973i = 1;

    /* renamed from: j */
    private int f23974j = 1;

    /* renamed from: k */
    private int f23975k = 1;

    /* renamed from: l */
    private int f23976l = 1;

    /* renamed from: m */
    private int f23977m = 5;

    /* renamed from: n */
    private int f23978n = 1;

    /* renamed from: o */
    private int f23979o = 3;

    /* renamed from: p */
    private int f23980p = 80;

    /* renamed from: q */
    private int f23981q = 100;

    /* renamed from: r */
    private int f23982r = 0;

    /* renamed from: s */
    private double f23983s = 1.0d;

    /* renamed from: t */
    private int f23984t = -1;

    /* renamed from: u */
    private ArrayList<Integer> f23985u;

    /* renamed from: v */
    private int f23986v = 3;

    /* renamed from: w */
    private int f23987w = 1;

    /* renamed from: x */
    private int f23988x = 10;

    /* renamed from: y */
    private int f23989y = 60;

    /* renamed from: z */
    private int f23990z = 0;

    /* renamed from: a */
    public final int mo63564a() {
        return this.f23988x;
    }

    /* renamed from: b */
    public final int mo63569b() {
        return this.f23989y;
    }

    /* renamed from: a */
    public final void mo63567a(ArrayList<Integer> arrayList) {
        this.f23985u = arrayList;
    }

    /* renamed from: c */
    public final int mo63572c() {
        return this.f23990z;
    }

    /* renamed from: a */
    public final void mo63565a(int i) {
        this.f23990z = i;
    }

    /* renamed from: d */
    public final int mo63574d() {
        return this.f23948B;
    }

    /* renamed from: b */
    public final void mo63570b(int i) {
        this.f23948B = i;
    }

    /* renamed from: e */
    public final int mo63576e() {
        return this.f23949C;
    }

    /* renamed from: c */
    public final void mo63573c(int i) {
        this.f23949C = i;
    }

    /* renamed from: f */
    public final int mo63578f() {
        return this.f23950D;
    }

    /* renamed from: d */
    public final void mo63575d(int i) {
        this.f23950D = i;
    }

    /* renamed from: g */
    public final int mo63580g() {
        return this.f23951E;
    }

    /* renamed from: e */
    public final void mo63577e(int i) {
        this.f23951E = i;
    }

    /* renamed from: h */
    public final int mo63582h() {
        return this.f23970f;
    }

    /* renamed from: i */
    public final int mo63584i() {
        return this.f23972h;
    }

    /* renamed from: j */
    public final String mo63586j() {
        return this.f23962Q;
    }

    /* renamed from: d */
    private void m27396d(String str) {
        this.f23962Q = str;
        C8388a.f20464c.put(this.f23966b, str);
    }

    /* renamed from: k */
    public final int mo63588k() {
        return this.f23958M;
    }

    /* renamed from: y */
    private void m27398y(int i) {
        if (i <= 0) {
            this.f23958M = 1;
        } else {
            this.f23958M = i;
        }
    }

    /* renamed from: l */
    public final String mo63590l() {
        return this.f23961P;
    }

    /* renamed from: e */
    private void m27397e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f23961P = this.f23957L;
        } else {
            this.f23961P = str;
        }
    }

    /* renamed from: m */
    public final int mo63592m() {
        return this.f23953G;
    }

    /* renamed from: n */
    public final int mo63594n() {
        return this.f23952F;
    }

    /* renamed from: f */
    public final void mo63579f(int i) {
        this.f23952F = i;
    }

    /* renamed from: o */
    public final int mo63596o() {
        return this.f23954I;
    }

    /* renamed from: g */
    public final void mo63581g(int i) {
        this.f23954I = i;
    }

    /* renamed from: h */
    public final void mo63583h(int i) {
        this.f23979o = i;
    }

    /* renamed from: i */
    public final void mo63585i(int i) {
        this.f23980p = i;
    }

    /* renamed from: p */
    public final int mo63598p() {
        return this.f23981q;
    }

    /* renamed from: j */
    public final void mo63587j(int i) {
        this.f23981q = i;
    }

    /* renamed from: q */
    public final int mo63600q() {
        return this.f23982r;
    }

    /* renamed from: k */
    public final void mo63589k(int i) {
        this.f23982r = i;
    }

    /* renamed from: r */
    public final int mo63602r() {
        return this.f23974j;
    }

    /* renamed from: l */
    public final void mo63591l(int i) {
        this.f23974j = i;
    }

    /* renamed from: s */
    public final int mo63604s() {
        return this.f23975k;
    }

    /* renamed from: m */
    public final void mo63593m(int i) {
        this.f23975k = i;
    }

    /* renamed from: n */
    public final void mo63595n(int i) {
        this.f23976l = i;
    }

    /* renamed from: t */
    public final int mo63606t() {
        return this.f23977m;
    }

    /* renamed from: o */
    public final void mo63597o(int i) {
        this.f23977m = i;
    }

    /* renamed from: u */
    public final int mo63608u() {
        return this.f23978n;
    }

    /* renamed from: p */
    public final void mo63599p(int i) {
        this.f23978n = i;
    }

    /* renamed from: q */
    public final void mo63601q(int i) {
        this.f23973i = i;
    }

    /* renamed from: v */
    public final long mo63610v() {
        return this.f23969e;
    }

    /* renamed from: a */
    public final void mo63566a(String str) {
        this.f23966b = str;
    }

    /* renamed from: w */
    public final List<C9629b> mo63612w() {
        return this.f23968d;
    }

    /* renamed from: a */
    public final void mo63568a(List<C9629b> list) {
        this.f23968d = list;
    }

    /* renamed from: x */
    public final int mo63614x() {
        return this.f23987w;
    }

    /* renamed from: r */
    public final void mo63603r(int i) {
        this.f23987w = i;
    }

    /* renamed from: s */
    public final boolean mo63605s(int i) {
        ArrayList<Integer> arrayList = this.f23985u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f23985u.contains(Integer.valueOf(i));
    }

    /* renamed from: y */
    public final String mo63616y() {
        return this.f23967c;
    }

    /* renamed from: b */
    public final void mo63571b(String str) {
        this.f23967c = str;
    }

    /* renamed from: z */
    public final int mo63617z() {
        return this.f23986v;
    }

    /* renamed from: t */
    public final void mo63607t(int i) {
        this.f23986v = i;
    }

    /* renamed from: A */
    public final Queue<Integer> mo63559A() {
        LinkedList linkedList;
        Exception e;
        try {
            if (this.f23968d == null || this.f23968d.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            int i = 0;
            while (i < this.f23968d.size()) {
                try {
                    linkedList.add(Integer.valueOf(this.f23968d.get(i).mo63523b()));
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return linkedList;
                }
            }
            return linkedList;
        } catch (Exception e3) {
            Exception exc = e3;
            linkedList = null;
            e = exc;
            e.printStackTrace();
            return linkedList;
        }
    }

    /* renamed from: u */
    public final void mo63609u(int i) {
        this.f23963R = i;
    }

    /* renamed from: B */
    public final int mo63560B() {
        return this.f23964S;
    }

    /* renamed from: v */
    public final void mo63611v(int i) {
        this.f23964S = i;
    }

    /* renamed from: C */
    public final int mo63561C() {
        return this.f23965T;
    }

    /* renamed from: w */
    public final void mo63613w(int i) {
        this.f23965T = i;
    }

    /* renamed from: c */
    public static C9640c m27395c(String str) {
        JSONObject optJSONObject;
        if (f23945H == null) {
            f23945H = C8414g.m23969a(C8388a.m23845e().mo56913g());
        }
        C9640c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString = optJSONObject.optString("unitId");
                if (TextUtils.isEmpty(optString)) {
                    return null;
                }
                C9640c cVar2 = new C9640c();
                try {
                    List<C9629b> a = C9629b.m27337a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f23966b = optString;
                    cVar2.f23968d = a;
                    cVar2.f23973i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f23974j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f23975k = optInt2;
                    cVar2.f23976l = optJSONObject.optInt("vcn", 5);
                    cVar2.f23977m = optJSONObject.optInt("offset", 5);
                    cVar2.f23978n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f23954I = optJSONObject.optInt("endscreen_type", 2);
                    int i = 3;
                    cVar2.f23979o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f23980p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f23981q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f23982r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f23969e = jSONObject.optLong("current_time");
                    cVar2.f23990z = optJSONObject.optInt(TJAdUnitConstants.String.ORIENTATION, 0);
                    cVar2.f23948B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f23949C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f23950D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f23951E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f23952F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f23970f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f23971g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f23972h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f23953G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f23947A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f23984t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f23983s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f23946a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    if (optJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < optJSONArray2.length()) {
                            try {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i2)));
                                i2++;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f23985u = arrayList;
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    if (optInt3 > 0) {
                        i = optInt3;
                    }
                    cVar2.f23986v = i;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f23987w = optInt4;
                    cVar2.f23967c = optJSONObject.optString("placementid");
                    cVar2.f23988x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f23989y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.m27396d(optJSONObject.optString("ab_id"));
                    cVar2.f23955J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f23956K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f23957L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.m27398y(optJSONObject.optInt("amount", 1));
                    cVar2.f23959N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f23960O = optJSONObject.optInt("currency_id", 1);
                    cVar2.m27397e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f23964S = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f23965T = optJSONObject.optInt("loadtmo", 60);
                    return cVar2;
                } catch (Exception e2) {
                    e = e2;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return cVar;
            }
        }
        return cVar;
    }

    /* renamed from: D */
    public final JSONObject mo63562D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f23966b);
            jSONObject.put("callbackType", this.f23973i);
            if (this.f23968d != null && this.f23968d.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (C9629b next : this.f23968d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", next.mo63522a());
                    jSONObject2.put("timeout", next.mo63523b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f23974j);
            jSONObject.put("acn", this.f23975k);
            jSONObject.put("vcn", this.f23976l);
            jSONObject.put("offset", this.f23977m);
            jSONObject.put("dlnet", this.f23978n);
            jSONObject.put("tv_start", this.f23979o);
            jSONObject.put("tv_end", this.f23980p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f23981q);
            jSONObject.put("endscreen_type", this.f23954I);
            jSONObject.put("daily_play_cap", this.f23948B);
            jSONObject.put("video_skip_time", this.f23949C);
            jSONObject.put("video_skip_result", this.f23950D);
            jSONObject.put("video_interactive_type", this.f23951E);
            jSONObject.put(TJAdUnitConstants.String.ORIENTATION, this.f23990z);
            jSONObject.put("close_button_delay", this.f23952F);
            jSONObject.put("playclosebtn_tm", this.f23970f);
            jSONObject.put("play_ctdown", this.f23971g);
            jSONObject.put("close_alert", this.f23972h);
            jSONObject.put("rfpv", this.f23984t);
            jSONObject.put("vdcmp", this.f23983s);
            JSONArray jSONArray2 = new JSONArray();
            if (this.f23985u != null) {
                if (this.f23985u.size() > 0) {
                    Iterator<Integer> it = this.f23985u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f23986v);
            jSONObject.put("tmorl", this.f23987w);
            jSONObject.put("placementid", this.f23967c);
            jSONObject.put("ltafemty", this.f23988x);
            jSONObject.put("ltorwc", this.f23989y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f23955J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f23956K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f23957L);
            jSONObject.put("amount", this.f23958M);
            jSONObject.put(RewardPlus.ICON, this.f23959N);
            jSONObject.put("currency_id", this.f23960O);
            jSONObject.put("name", this.f23961P);
            jSONObject.put("isDefault", this.f23963R);
            jSONObject.put("video_error_rule", this.f23964S);
            jSONObject.put("loadtmo", this.f23965T);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C9640c m27394a(JSONObject jSONObject) {
        C9640c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            C9640c cVar2 = new C9640c();
            try {
                cVar2.f23968d = C9629b.m27337a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f23973i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f23974j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f23975k = optInt2;
                cVar2.f23976l = jSONObject.optInt("vcn", 5);
                cVar2.f23977m = jSONObject.optInt("offset", 5);
                cVar2.f23978n = jSONObject.optInt("dlnet", 2);
                cVar2.f23954I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f23979o = jSONObject.optInt("tv_start", 3);
                cVar2.f23980p = jSONObject.optInt("tv_end", 80);
                cVar2.f23981q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f23969e = jSONObject.optLong("current_time");
                cVar2.f23990z = jSONObject.optInt(TJAdUnitConstants.String.ORIENTATION, 0);
                cVar2.f23948B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f23949C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f23950D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f23951E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f23952F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f23970f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f23971g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f23972h = jSONObject.optInt("close_alert", 0);
                cVar2.f23953G = jSONObject.optInt("rdrct", 20);
                cVar2.f23984t = jSONObject.optInt("rfpv", -1);
                cVar2.f23983s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f23947A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                if (optJSONArray != null) {
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        try {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                            i++;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    arrayList.add(4);
                    arrayList.add(6);
                }
                cVar2.f23985u = arrayList;
                cVar2.f23986v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f23987w = optInt3;
                cVar2.f23967c = jSONObject.optString("placementid");
                cVar2.f23988x = jSONObject.optInt("ltafemty", 10);
                cVar2.f23989y = jSONObject.optInt("ltorwc", 60);
                cVar2.m27396d(jSONObject.optString("ab_id"));
                cVar2.f23955J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f23956K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f23957L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.m27398y(jSONObject.optInt("amount", 1));
                cVar2.f23959N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.f23960O = jSONObject.optInt("currency_id", 1);
                cVar2.m27397e(jSONObject.optString("name", "Virtual Item"));
                cVar2.f23964S = jSONObject.optInt("video_error_rule", 1);
                cVar2.f23965T = jSONObject.optInt("loadtmo", 60);
                return cVar2;
            } catch (Exception e2) {
                e = e2;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: E */
    public final int mo63563E() {
        return this.f23947A;
    }

    /* renamed from: x */
    public final void mo63615x(int i) {
        this.f23947A = i;
    }
}
