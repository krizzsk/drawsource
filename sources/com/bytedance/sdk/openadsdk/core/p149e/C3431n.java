package com.bytedance.sdk.openadsdk.core.p149e;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2547c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.p126b.C2931a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.n */
/* compiled from: MaterialMeta */
public class C3431n {

    /* renamed from: A */
    private int f8355A = 0;

    /* renamed from: B */
    private long f8356B;

    /* renamed from: C */
    private int f8357C;

    /* renamed from: D */
    private int f8358D;

    /* renamed from: E */
    private C2400b f8359E;

    /* renamed from: F */
    private C2400b f8360F;

    /* renamed from: G */
    private boolean f8361G;

    /* renamed from: H */
    private int f8362H;

    /* renamed from: I */
    private Map<String, Object> f8363I;

    /* renamed from: J */
    private C3432a f8364J;

    /* renamed from: K */
    private String f8365K;

    /* renamed from: L */
    private JSONObject f8366L;

    /* renamed from: M */
    private int f8367M = 0;

    /* renamed from: N */
    private int f8368N = 1;

    /* renamed from: O */
    private String f8369O = "";

    /* renamed from: P */
    private C3408f f8370P = new C3408f();

    /* renamed from: Q */
    private int f8371Q = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;

    /* renamed from: R */
    private int f8372R = 0;

    /* renamed from: S */
    private AdSlot f8373S;

    /* renamed from: T */
    private int f8374T;

    /* renamed from: U */
    private int f8375U = 1;

    /* renamed from: V */
    private String f8376V;

    /* renamed from: W */
    private int f8377W = 0;

    /* renamed from: X */
    private int f8378X = 0;

    /* renamed from: Y */
    private int f8379Y = 0;

    /* renamed from: Z */
    private JSONObject f8380Z;

    /* renamed from: a */
    public boolean f8381a = false;

    /* renamed from: aa */
    private int f8382aa = 1;

    /* renamed from: ab */
    private int f8383ab;

    /* renamed from: ac */
    private String f8384ac;

    /* renamed from: ad */
    private String f8385ad;

    /* renamed from: ae */
    private C3413i f8386ae;

    /* renamed from: af */
    private int f8387af = 1;

    /* renamed from: ag */
    private float f8388ag = 100.0f;

    /* renamed from: ah */
    private String f8389ah;

    /* renamed from: ai */
    private int f8390ai;

    /* renamed from: aj */
    private int f8391aj;

    /* renamed from: ak */
    private int f8392ak;

    /* renamed from: al */
    private int f8393al;

    /* renamed from: am */
    private int f8394am = 2;

    /* renamed from: an */
    private int f8395an = 1;

    /* renamed from: ao */
    private int f8396ao = 0;

    /* renamed from: ap */
    private int f8397ap;

    /* renamed from: aq */
    private C3430m f8398aq;

    /* renamed from: ar */
    private C3434p f8399ar;

    /* renamed from: as */
    private boolean f8400as;

    /* renamed from: at */
    private C3473a f8401at;

    /* renamed from: au */
    private boolean f8402au;

    /* renamed from: av */
    private String f8403av;

    /* renamed from: aw */
    private JSONObject f8404aw;

    /* renamed from: ax */
    private int f8405ax = 0;

    /* renamed from: ay */
    private String f8406ay;

    /* renamed from: az */
    private C3406d f8407az;

    /* renamed from: b */
    private int f8408b;

    /* renamed from: c */
    private int f8409c;

    /* renamed from: d */
    private int f8410d;

    /* renamed from: e */
    private C3417k f8411e;

    /* renamed from: f */
    private C3417k f8412f;

    /* renamed from: g */
    private String f8413g;

    /* renamed from: h */
    private List<C3417k> f8414h = new ArrayList();

    /* renamed from: i */
    private String f8415i;

    /* renamed from: j */
    private List<String> f8416j = new ArrayList();

    /* renamed from: k */
    private List<String> f8417k = new ArrayList();

    /* renamed from: l */
    private List<String> f8418l = new ArrayList();

    /* renamed from: m */
    private String f8419m;

    /* renamed from: n */
    private String f8420n;

    /* renamed from: o */
    private String f8421o;

    /* renamed from: p */
    private String f8422p = "0";

    /* renamed from: q */
    private C3405c f8423q;

    /* renamed from: r */
    private C3412h f8424r;

    /* renamed from: s */
    private int f8425s;

    /* renamed from: t */
    private String f8426t;

    /* renamed from: u */
    private String f8427u;

    /* renamed from: v */
    private String f8428v;

    /* renamed from: w */
    private String f8429w = "";

    /* renamed from: x */
    private int f8430x = 0;

    /* renamed from: y */
    private int f8431y = 2;

    /* renamed from: z */
    private List<FilterWord> f8432z = new ArrayList();

    /* renamed from: a */
    public static C2401c m10306a(String str, C3431n nVar) {
        C3898x.m12754a(nVar);
        nVar.mo19506A(0);
        nVar.mo19508B(0);
        return new C2401c(str, nVar.mo19517J(), nVar.mo19562aF(), nVar.mo19560aD(), nVar.mo19561aE());
    }

    /* renamed from: a */
    public static boolean m10307a(C3431n nVar) {
        return (nVar == null || nVar.mo19517J() == null || nVar.mo19517J().mo15940d() == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m10308a(C3431n nVar, boolean z, boolean z2, boolean z3) {
        C2400b bVar;
        C2400b bVar2;
        if (m10307a(nVar) || z3 || nVar == null || (bVar = nVar.f8359E) == null || TextUtils.isEmpty(bVar.mo15955j())) {
            return false;
        }
        if (nVar == null || (bVar2 = nVar.f8359E) == null || bVar2.mo15929a() != 1) {
            C2905l.m8111b("MaterialMeta", "can show end card follow js WebViewClient");
            return z;
        }
        C2905l.m8111b("MaterialMeta", "can show end card follow js");
        return z2;
    }

    /* renamed from: b */
    private JSONObject m10309b(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord b : filterWord.getOptions()) {
                        jSONArray.put(m10309b(b));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.f8359E;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10310b(com.bytedance.sdk.openadsdk.core.p149e.C3431n r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0010
            com.bykv.vk.openvk.component.video.api.c.b r2 = r2.f8359E
            if (r2 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            int r2 = r2.mo15929a()
            r1 = 1
            if (r2 != r1) goto L_0x0010
            r0 = r1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p149e.C3431n.m10310b(com.bytedance.sdk.openadsdk.core.e.n):boolean");
    }

    /* renamed from: c */
    public static boolean m10311c(C3431n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.mo19589aw() || nVar.mo19570ad() == 5 || nVar.mo19570ad() == 15 || nVar.mo19570ad() == 50;
    }

    /* renamed from: A */
    public int mo19505A() {
        return this.f8382aa;
    }

    /* renamed from: A */
    public void mo19506A(int i) {
        this.f8396ao = i;
    }

    /* renamed from: B */
    public int mo19507B() {
        return this.f8383ab;
    }

    /* renamed from: B */
    public void mo19508B(int i) {
        this.f8397ap = i;
    }

    /* renamed from: C */
    public int mo19509C() {
        return this.f8358D;
    }

    /* renamed from: C */
    public void mo19510C(int i) {
        this.f8405ax = i;
    }

    /* renamed from: D */
    public String mo19511D() {
        return this.f8365K;
    }

    /* renamed from: E */
    public boolean mo19512E() {
        return mo19509C() == 100;
    }

    /* renamed from: F */
    public int mo19513F() {
        return this.f8362H;
    }

    /* renamed from: G */
    public C3432a mo19514G() {
        return this.f8364J;
    }

    /* renamed from: H */
    public C2547c mo19515H() {
        if (mo19514G() == null) {
            return null;
        }
        String b = mo19514G().mo19672b();
        String d = mo19514G().mo19676d();
        String c = mo19514G().mo19674c();
        String e = mo19514G().mo19678e();
        String a = mo19514G().mo19670a();
        int f = C3898x.m12794f(this);
        C2547c e2 = C2547c.m6455a().mo16625a(b).mo16626b(c).mo16627c(d).mo16628d(e).mo16629e(a);
        return e2.mo16630f(f + "");
    }

    /* renamed from: I */
    public int mo19516I() {
        C3413i iVar = this.f8386ae;
        if (iVar == null) {
            return 0;
        }
        return iVar.mo19449a();
    }

    /* renamed from: J */
    public C2400b mo19517J() {
        return this.f8359E;
    }

    /* renamed from: K */
    public String mo19518K() {
        return this.f8426t;
    }

    /* renamed from: L */
    public int mo19519L() {
        return this.f8408b;
    }

    /* renamed from: M */
    public C3417k mo19520M() {
        return this.f8411e;
    }

    /* renamed from: N */
    public C3417k mo19521N() {
        return this.f8412f;
    }

    /* renamed from: O */
    public String mo19522O() {
        return this.f8413g;
    }

    /* renamed from: P */
    public List<C3417k> mo19523P() {
        return this.f8414h;
    }

    /* renamed from: Q */
    public String mo19524Q() {
        return this.f8415i;
    }

    /* renamed from: R */
    public List<String> mo19525R() {
        return this.f8416j;
    }

    /* renamed from: S */
    public List<String> mo19526S() {
        return this.f8417k;
    }

    /* renamed from: T */
    public List<String> mo19527T() {
        return this.f8418l;
    }

    /* renamed from: U */
    public String mo19528U() {
        return this.f8419m;
    }

    /* renamed from: V */
    public String mo19529V() {
        return this.f8420n;
    }

    /* renamed from: W */
    public String mo19530W() {
        String str;
        if (!TextUtils.isEmpty(this.f8421o)) {
            return this.f8421o;
        }
        Context a = C3513m.m10963a();
        int L = mo19519L();
        if (L == 2 || L == 3) {
            if (a == null) {
                return this.f8421o;
            }
            str = "tt_video_mobile_go_detail";
        } else if (L != 4) {
            return this.f8421o;
        } else {
            if (a == null) {
                return this.f8421o;
            }
            str = "tt_video_download_apk";
        }
        return C2914t.m8151a(a, str);
    }

    /* renamed from: X */
    public String mo19531X() {
        return this.f8421o;
    }

    /* renamed from: Y */
    public String mo19532Y() {
        return this.f8422p;
    }

    /* renamed from: Z */
    public String mo19533Z() {
        return this.f8427u;
    }

    /* renamed from: a */
    public C3430m mo19534a() {
        return this.f8398aq;
    }

    /* renamed from: a */
    public void mo19535a(double d) {
        this.f8395an = (d == 2.0d || d == 1.0d) ? (int) d : 1;
    }

    /* renamed from: a */
    public void mo19536a(float f) {
        this.f8388ag = f;
    }

    /* renamed from: a */
    public void mo19537a(int i) {
        mo19538a(i, -1);
    }

    /* renamed from: a */
    public void mo19538a(int i, int i2) {
        int i3;
        this.f8410d = i;
        this.f8409c = i;
        if (this.f8373S == null) {
            this.f8409c = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = C3898x.m12790e(this);
        }
        if (this.f8373S.getNativeAdType() == 3 || this.f8373S.getDurationSlotType() == 3 || i2 == 3) {
            i3 = 14;
        } else if (this.f8373S.getNativeAdType() == 7 || this.f8373S.getNativeAdType() == 8 || this.f8373S.getDurationSlotType() == 7 || this.f8373S.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (C3434p.m10497i(this)) {
                i3 = 12;
            } else if (C3434p.m10489a(this)) {
                i3 = 9;
            } else {
                if (this.f8410d == 5 && !C3418l.m10268c(this)) {
                    this.f8409c = 7;
                }
                if (this.f8410d == 6 && !C3418l.m10266b(this)) {
                    this.f8409c = 7;
                }
                if (this.f8410d == 8 && mo19509C() != 100) {
                    this.f8409c = 7;
                }
                if (i < 5) {
                    this.f8409c = 7;
                    return;
                }
                return;
            }
        } else if (C3434p.m10489a(this)) {
            this.f8409c = 4;
            return;
        } else {
            if (this.f8410d == 4 && !C3434p.m10489a(this)) {
                this.f8409c = 0;
            }
            if (i >= 5) {
                this.f8409c = 0;
                return;
            } else if (this.f8410d == 2 && mo19519L() != 3) {
                this.f8409c = 0;
                return;
            } else if (i == 0 || (i == 1 && mo19519L() != 3)) {
                this.f8409c = 0;
                return;
            } else {
                return;
            }
        }
        this.f8409c = i3;
    }

    /* renamed from: a */
    public void mo19539a(long j) {
        this.f8356B = j;
    }

    /* renamed from: a */
    public void mo19540a(C2400b bVar) {
        this.f8359E = bVar;
    }

    /* renamed from: a */
    public void mo19541a(AdSlot adSlot) {
        this.f8373S = adSlot;
    }

    /* renamed from: a */
    public void mo19542a(FilterWord filterWord) {
        this.f8432z.add(filterWord);
    }

    /* renamed from: a */
    public void mo19543a(C3405c cVar) {
        this.f8423q = cVar;
    }

    /* renamed from: a */
    public void mo19544a(C3406d dVar) {
        this.f8407az = dVar;
    }

    /* renamed from: a */
    public void mo19545a(C3408f fVar) {
        this.f8370P = fVar;
    }

    /* renamed from: a */
    public void mo19546a(C3412h hVar) {
        this.f8424r = hVar;
    }

    /* renamed from: a */
    public void mo19547a(C3413i iVar) {
        this.f8386ae = iVar;
    }

    /* renamed from: a */
    public void mo19548a(C3417k kVar) {
        this.f8411e = kVar;
    }

    /* renamed from: a */
    public void mo19549a(C3430m mVar) {
        this.f8398aq = mVar;
    }

    /* renamed from: a */
    public void mo19550a(C3432a aVar) {
        this.f8364J = aVar;
        C2547c H = mo19515H();
        if (H != null) {
            C2533a.m6368a(H);
        }
    }

    /* renamed from: a */
    public void mo19551a(C3434p pVar) {
        this.f8399ar = pVar;
    }

    /* renamed from: a */
    public void mo19552a(C3473a aVar) {
        this.f8401at = aVar;
    }

    /* renamed from: a */
    public void mo19553a(String str) {
        this.f8429w = str;
    }

    /* renamed from: a */
    public void mo19554a(Map<String, Object> map) {
        this.f8363I = map;
    }

    /* renamed from: a */
    public void mo19555a(JSONObject jSONObject) {
        this.f8380Z = jSONObject;
    }

    /* renamed from: a */
    public void mo19556a(boolean z) {
        this.f8381a = z;
    }

    /* renamed from: aA */
    public int mo19557aA() {
        JSONObject jSONObject = this.f8404aw;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    /* renamed from: aB */
    public JSONObject mo19558aB() {
        return this.f8404aw;
    }

    /* renamed from: aC */
    public C2931a mo19559aC() {
        C2931a aVar = new C2931a();
        aVar.mo17911a(this.f8362H);
        aVar.mo17914b(this.f8422p);
        aVar.mo17912a(mo19569ac());
        return aVar;
    }

    /* renamed from: aD */
    public int mo19560aD() {
        return this.f8396ao;
    }

    /* renamed from: aE */
    public int mo19561aE() {
        return this.f8397ap;
    }

    /* renamed from: aF */
    public C2400b mo19562aF() {
        return this.f8360F;
    }

    /* renamed from: aG */
    public boolean mo19563aG() {
        C2400b bVar = this.f8359E;
        return bVar == null || bVar.mo15962q() != 1;
    }

    /* renamed from: aH */
    public JSONObject mo19564aH() {
        if (this.f8366L == null) {
            try {
                if (!TextUtils.isEmpty(this.f8428v)) {
                    this.f8366L = new JSONObject(this.f8428v);
                }
            } catch (JSONException unused) {
            }
        }
        return this.f8366L;
    }

    /* renamed from: aI */
    public int mo19565aI() {
        return this.f8405ax;
    }

    /* renamed from: aJ */
    public String mo19566aJ() {
        return this.f8406ay;
    }

    /* renamed from: aa */
    public C3405c mo19567aa() {
        return this.f8423q;
    }

    /* renamed from: ab */
    public C3412h mo19568ab() {
        return this.f8424r;
    }

    /* renamed from: ac */
    public String mo19569ac() {
        return this.f8428v;
    }

    /* renamed from: ad */
    public int mo19570ad() {
        return this.f8425s;
    }

    /* renamed from: ae */
    public List<FilterWord> mo19571ae() {
        return this.f8432z;
    }

    /* renamed from: af */
    public String mo19572af() {
        return this.f8385ad;
    }

    /* renamed from: ag */
    public long mo19573ag() {
        return this.f8356B;
    }

    /* renamed from: ah */
    public int mo19574ah() {
        return this.f8357C;
    }

    /* renamed from: ai */
    public boolean mo19575ai() {
        return this.f8361G;
    }

    /* renamed from: aj */
    public Map<String, Object> mo19576aj() {
        return this.f8363I;
    }

    /* renamed from: ak */
    public JSONObject mo19577ak() {
        return this.f8380Z;
    }

    /* renamed from: al */
    public String mo19578al() {
        return this.f8376V;
    }

    /* renamed from: am */
    public int mo19579am() {
        if (this.f8387af != 2) {
            this.f8387af = 1;
        }
        return this.f8387af;
    }

    /* renamed from: an */
    public float mo19580an() {
        if (this.f8388ag <= 0.0f) {
            this.f8388ag = 100.0f;
        }
        return (this.f8388ag * 1000.0f) / 1000.0f;
    }

    /* renamed from: ao */
    public boolean mo19581ao() {
        if (this.f8414h.isEmpty()) {
            return false;
        }
        if (this.f8425s == 4 && this.f8414h.size() < 3) {
            return false;
        }
        for (C3417k e : this.f8414h) {
            if (!e.mo19477e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ap */
    public boolean mo19582ap() {
        return !this.f8400as && mo19583aq() == 1;
    }

    /* renamed from: aq */
    public int mo19583aq() {
        return this.f8355A;
    }

    /* renamed from: ar */
    public JSONObject mo19584ar() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", mo19519L());
            jSONObject.put("interaction_method", mo19618g());
            jSONObject.put("target_url", mo19522O());
            jSONObject.put("app_log_url", mo19533Z());
            jSONObject.put("gecko_id", mo19572af());
            jSONObject.put(ShareConstants.MEDIA_EXTENSION, mo19558aB());
            jSONObject.put("ad_id", mo19532Y());
            jSONObject.put("source", mo19518K());
            jSONObject.put("screenshot", mo19575ai());
            jSONObject.put("dislike_control", mo19583aq());
            jSONObject.put("play_bar_show_time", mo19668z());
            jSONObject.put("play_bar_style", mo19660v());
            jSONObject.put("if_block_lp", mo19637m());
            jSONObject.put("cache_sort", mo19505A());
            jSONObject.put("if_sp_cache", mo19507B());
            jSONObject.put("render_control", mo19634l());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, mo19625i());
            jSONObject2.put("other", mo19621h());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, mo19628j());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, mo19631k());
            jSONObject.put("reward_data", jSONObject3);
            C3417k M = mo19520M();
            if (M != null) {
                if (!TextUtils.isEmpty(M.mo19468a())) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", M.mo19468a());
                    jSONObject4.put("height", M.mo19475c());
                    jSONObject4.put("width", M.mo19472b());
                    jSONObject.put(RewardPlus.ICON, jSONObject4);
                }
            }
            C3417k N = mo19521N();
            if (N != null && !TextUtils.isEmpty(N.mo19468a())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", N.mo19468a());
                jSONObject5.put("height", N.mo19475c());
                jSONObject5.put("width", N.mo19472b());
                jSONObject.put("cover_image", jSONObject5);
            }
            JSONObject ak = mo19577ak();
            if (ak != null) {
                jSONObject.put("session_params", ak);
            }
            C3408f w = mo19662w();
            if (w != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("click_upper_content_area", w.f8216a);
                jSONObject6.put("click_upper_non_content_area", w.f8217b);
                jSONObject6.put("click_lower_content_area", w.f8218c);
                jSONObject6.put("click_lower_non_content_area", w.f8219d);
                jSONObject6.put("click_button_area", w.f8220e);
                jSONObject6.put("click_video_area", w.f8221f);
                jSONObject.put("click_area", jSONObject6);
            }
            AdSlot x = mo19664x();
            if (x != null) {
                jSONObject.put("adslot", x.toJsonObj());
            }
            List<C3417k> P = mo19523P();
            if (P != null) {
                JSONArray jSONArray = new JSONArray();
                for (C3417k next : P) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("url", next.mo19468a());
                    jSONObject7.put("height", next.mo19475c());
                    jSONObject7.put("width", next.mo19472b());
                    jSONObject7.put("image_preview", next.mo19478f());
                    jSONObject7.put("image_key", next.mo19479g());
                    jSONArray.put(jSONObject7);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> R = mo19525R();
            if (R != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String put : R) {
                    jSONArray2.put(put);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> S = mo19526S();
            if (S != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String put2 : S) {
                    jSONArray3.put(put2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> T = mo19527T();
            if (T != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String put3 : T) {
                    jSONArray4.put(put3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", mo19524Q());
            jSONObject.put("title", mo19528U());
            jSONObject.put("description", mo19529V());
            jSONObject.put("ext", mo19569ac());
            jSONObject.put("image_mode", mo19570ad());
            jSONObject.put("cover_click_area", mo19509C());
            jSONObject.put("intercept_flag", mo19666y());
            jSONObject.put("button_text", mo19530W());
            jSONObject.put("ad_logo", mo19658u());
            jSONObject.put("video_adaptation", mo19656t());
            jSONObject.put("feed_video_opentype", mo19646p());
            jSONObject.put(TJAdUnitConstants.String.ORIENTATION, mo19579am());
            jSONObject.put("aspect_ratio", (double) mo19580an());
            C3405c aa = mo19567aa();
            if (aa != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, aa.mo19404b());
                jSONObject8.put(CampaignEx.JSON_KEY_PACKAGE_NAME, aa.mo19407c());
                jSONObject8.put(DownloadModel.DOWNLOAD_URL, aa.mo19400a());
                jSONObject8.put("score", aa.mo19409d());
                jSONObject8.put("comment_num", aa.mo19410e());
                jSONObject8.put(CampaignEx.JSON_KEY_APP_SIZE, aa.mo19411f());
                jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject8);
            }
            C3412h ab = mo19568ab();
            if (ab != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("deeplink_url", ab.mo19443a());
                jSONObject9.put("fallback_url", ab.mo19446b());
                jSONObject9.put("fallback_type", ab.mo19448c());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject9);
            }
            List<FilterWord> ae = mo19571ae();
            if (ae != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord b : ae) {
                    JSONObject b2 = m10309b(b);
                    if (b2 != null) {
                        jSONArray5.put(b2);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            mo19611e().mo19684a(jSONObject);
            jSONObject.put("count_down", mo19574ah());
            jSONObject.put("expiration_time", mo19573ag());
            C2400b J = mo19517J();
            if (J != null) {
                jSONObject.put("video", J.mo15961p());
            }
            C2400b aF = mo19562aF();
            if (aF != null) {
                jSONObject.put("h265_video", aF.mo15961p());
            }
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("if_send_click", mo19516I());
            jSONObject.put("download_conf", jSONObject10);
            if (mo19576aj() != null) {
                JSONObject jSONObject11 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = mo19576aj().entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    for (Map.Entry next2 : entrySet) {
                        jSONObject11.put((String) next2.getKey(), next2.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject11);
            }
            C3432a G = mo19514G();
            if (G != null) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("id", G.mo19672b());
                jSONObject12.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, G.mo19674c());
                jSONObject12.put("url", G.mo19676d());
                jSONObject12.put("data", G.mo19678e());
                jSONObject12.put("diff_data", G.mo19680f());
                jSONObject12.put("version", G.mo19670a());
                jSONObject12.put("dynamic_creative", G.mo19682g());
                jSONObject.put("tpl_info", jSONObject12);
            }
            jSONObject.put("creative_extra", mo19511D());
            jSONObject.put("market_url", mo19578al());
            jSONObject.put("auction_price", mo19654s());
            jSONObject.put("ad_info", mo19640n());
            jSONObject.put("is_package_open", mo19585as());
            jSONObject.put("playable_duration_time", mo19586at());
            jSONObject.put("playable_endcard_close_time", mo19587au());
            jSONObject.put("endcard_close_time", mo19588av());
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("render_sequence", mo19649q());
            jSONObject13.put("backup_render_control", mo19652r());
            jSONObject.put("render", jSONObject13);
            if (this.f8398aq == null) {
                C3430m mVar = new C3430m();
                this.f8398aq = mVar;
                mVar.mo19501a("");
                this.f8398aq.mo19500a(10);
                this.f8398aq.mo19503b(20);
            }
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("onlylp_loading_maxtime", this.f8398aq.mo19499a());
            jSONObject14.put("straight_lp_showtime", this.f8398aq.mo19502b());
            jSONObject14.put("loading_text", this.f8398aq.mo19504c());
            jSONObject.put("interaction_method_params", jSONObject14);
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("splash_clickarea", mo19601c());
            jSONObject15.put("splash_layout_id", mo19607d());
            jSONObject.put("splash_control", jSONObject15);
            if (this.f8402au) {
                jSONObject.put("is_html", true);
                jSONObject.put("dsp_html", this.f8403av);
            }
            if (this.f8400as) {
                jSONObject.put("is_vast", true);
                jSONObject.put("vast_json", this.f8401at.mo19906j());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: as */
    public int mo19585as() {
        return this.f8390ai;
    }

    /* renamed from: at */
    public int mo19586at() {
        int i = this.f8391aj;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    /* renamed from: au */
    public int mo19587au() {
        return this.f8392ak;
    }

    /* renamed from: av */
    public int mo19588av() {
        return this.f8393al;
    }

    /* renamed from: aw */
    public boolean mo19589aw() {
        return this.f8400as;
    }

    /* renamed from: ax */
    public C3473a mo19590ax() {
        if (this.f8400as) {
            return this.f8401at;
        }
        return null;
    }

    /* renamed from: ay */
    public boolean mo19591ay() {
        return this.f8402au;
    }

    /* renamed from: az */
    public String mo19592az() {
        return this.f8403av;
    }

    /* renamed from: b */
    public C3406d mo19593b() {
        return this.f8407az;
    }

    /* renamed from: b */
    public void mo19594b(double d) {
        this.f8394am = (d == 2.0d || d == 1.0d) ? (int) d : 2;
    }

    /* renamed from: b */
    public void mo19595b(int i) {
        this.f8409c = i;
    }

    /* renamed from: b */
    public void mo19596b(C2400b bVar) {
        this.f8360F = bVar;
    }

    /* renamed from: b */
    public void mo19597b(C3417k kVar) {
        this.f8412f = kVar;
    }

    /* renamed from: b */
    public void mo19598b(String str) {
        this.f8389ah = str;
    }

    /* renamed from: b */
    public void mo19599b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8408b = 4;
            this.f8422p = jSONObject.optString("id");
            this.f8426t = jSONObject.optString("source");
            C3405c cVar = new C3405c();
            this.f8423q = cVar;
            cVar.mo19408c(jSONObject.optString("pkg_name"));
            this.f8423q.mo19406b(jSONObject.optString("name"));
            this.f8423q.mo19403a(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        }
    }

    /* renamed from: b */
    public void mo19600b(boolean z) {
        this.f8361G = z;
    }

    /* renamed from: c */
    public int mo19601c() {
        C3406d dVar = this.f8407az;
        if (dVar == null) {
            return 2;
        }
        return dVar.mo19413a();
    }

    /* renamed from: c */
    public void mo19602c(int i) {
        this.f8430x = i;
    }

    /* renamed from: c */
    public void mo19603c(C3417k kVar) {
        this.f8414h.add(kVar);
    }

    /* renamed from: c */
    public void mo19604c(String str) {
        this.f8384ac = str;
    }

    /* renamed from: c */
    public void mo19605c(JSONObject jSONObject) {
        this.f8404aw = jSONObject;
    }

    /* renamed from: c */
    public void mo19606c(boolean z) {
        this.f8400as = z;
    }

    /* renamed from: d */
    public int mo19607d() {
        C3406d dVar = this.f8407az;
        if (dVar == null) {
            return 1;
        }
        return dVar.mo19415b();
    }

    /* renamed from: d */
    public void mo19608d(int i) {
        this.f8431y = i;
    }

    /* renamed from: d */
    public void mo19609d(String str) {
        this.f8365K = str;
    }

    /* renamed from: d */
    public void mo19610d(boolean z) {
        this.f8402au = z;
    }

    /* renamed from: e */
    public C3434p mo19611e() {
        return this.f8399ar;
    }

    /* renamed from: e */
    public void mo19612e(int i) {
        this.f8377W = i;
    }

    /* renamed from: e */
    public void mo19613e(String str) {
        this.f8426t = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3431n nVar = (C3431n) obj;
        return this.f8422p.equals(nVar.f8422p) && this.f8428v.equals(nVar.f8428v);
    }

    /* renamed from: f */
    public int mo19615f() {
        return this.f8409c;
    }

    /* renamed from: f */
    public void mo19616f(int i) {
        this.f8379Y = i;
    }

    /* renamed from: f */
    public void mo19617f(String str) {
        this.f8413g = str;
    }

    /* renamed from: g */
    public int mo19618g() {
        return this.f8410d;
    }

    /* renamed from: g */
    public void mo19619g(int i) {
        this.f8367M = i;
    }

    /* renamed from: g */
    public void mo19620g(String str) {
        this.f8415i = str;
    }

    /* renamed from: h */
    public int mo19621h() {
        return this.f8395an;
    }

    /* renamed from: h */
    public void mo19622h(int i) {
        this.f8368N = i;
    }

    /* renamed from: h */
    public void mo19623h(String str) {
        this.f8419m = str;
    }

    public int hashCode() {
        return (this.f8422p.hashCode() * 31) + this.f8428v.hashCode();
    }

    /* renamed from: i */
    public int mo19625i() {
        return this.f8394am;
    }

    /* renamed from: i */
    public void mo19626i(int i) {
        this.f8378X = i;
    }

    /* renamed from: i */
    public void mo19627i(String str) {
        this.f8420n = str;
    }

    /* renamed from: j */
    public String mo19628j() {
        return this.f8429w;
    }

    /* renamed from: j */
    public void mo19629j(int i) {
        this.f8375U = i;
    }

    /* renamed from: j */
    public void mo19630j(String str) {
        this.f8421o = str;
    }

    /* renamed from: k */
    public int mo19631k() {
        return this.f8430x;
    }

    /* renamed from: k */
    public void mo19632k(int i) {
        this.f8372R = i;
    }

    /* renamed from: k */
    public void mo19633k(String str) {
        this.f8422p = str;
    }

    /* renamed from: l */
    public int mo19634l() {
        int i = this.f8409c;
        if (i == 5 || i == 6) {
            return 1;
        }
        return this.f8431y;
    }

    /* renamed from: l */
    public void mo19635l(int i) {
        this.f8374T = i;
    }

    /* renamed from: l */
    public void mo19636l(String str) {
        this.f8427u = str;
    }

    /* renamed from: m */
    public int mo19637m() {
        return this.f8377W;
    }

    /* renamed from: m */
    public void mo19638m(int i) {
        this.f8371Q = i;
    }

    /* renamed from: m */
    public void mo19639m(String str) {
        this.f8428v = str;
    }

    /* renamed from: n */
    public String mo19640n() {
        return this.f8389ah;
    }

    /* renamed from: n */
    public void mo19641n(int i) {
        this.f8382aa = i;
    }

    /* renamed from: n */
    public void mo19642n(String str) {
        this.f8385ad = str;
    }

    /* renamed from: o */
    public void mo19643o(int i) {
        this.f8383ab = i;
    }

    /* renamed from: o */
    public void mo19644o(String str) {
        this.f8376V = str;
    }

    /* renamed from: o */
    public boolean mo19645o() {
        return this.f8377W == 1;
    }

    /* renamed from: p */
    public int mo19646p() {
        return this.f8379Y;
    }

    /* renamed from: p */
    public void mo19647p(int i) {
        this.f8358D = i;
    }

    /* renamed from: p */
    public void mo19648p(String str) {
        this.f8403av = str;
    }

    /* renamed from: q */
    public int mo19649q() {
        return this.f8367M;
    }

    /* renamed from: q */
    public void mo19650q(int i) {
        this.f8362H = i;
    }

    /* renamed from: q */
    public void mo19651q(String str) {
        this.f8406ay = str;
    }

    /* renamed from: r */
    public int mo19652r() {
        return this.f8368N;
    }

    /* renamed from: r */
    public void mo19653r(int i) {
        this.f8408b = i;
    }

    /* renamed from: s */
    public String mo19654s() {
        return this.f8384ac;
    }

    /* renamed from: s */
    public void mo19655s(int i) {
        this.f8425s = i;
    }

    /* renamed from: t */
    public int mo19656t() {
        return this.f8378X;
    }

    /* renamed from: t */
    public void mo19657t(int i) {
        this.f8357C = i;
    }

    /* renamed from: u */
    public int mo19658u() {
        return this.f8375U;
    }

    /* renamed from: u */
    public void mo19659u(int i) {
        this.f8387af = i;
    }

    /* renamed from: v */
    public int mo19660v() {
        if (mo19589aw()) {
            return 5;
        }
        if (mo19580an() != 100.0f || mo19634l() == 2) {
            return 0;
        }
        return this.f8372R;
    }

    /* renamed from: v */
    public void mo19661v(int i) {
        this.f8355A = i;
    }

    /* renamed from: w */
    public C3408f mo19662w() {
        return this.f8370P;
    }

    /* renamed from: w */
    public void mo19663w(int i) {
        this.f8390ai = i;
    }

    /* renamed from: x */
    public AdSlot mo19664x() {
        return this.f8373S;
    }

    /* renamed from: x */
    public void mo19665x(int i) {
        this.f8391aj = i;
    }

    /* renamed from: y */
    public int mo19666y() {
        return this.f8374T;
    }

    /* renamed from: y */
    public void mo19667y(int i) {
        this.f8392ak = i;
    }

    /* renamed from: z */
    public int mo19668z() {
        return this.f8371Q;
    }

    /* renamed from: z */
    public void mo19669z(int i) {
        this.f8393al = i;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.n$a */
    /* compiled from: MaterialMeta */
    public static class C3432a {

        /* renamed from: a */
        private String f8433a;

        /* renamed from: b */
        private String f8434b;

        /* renamed from: c */
        private String f8435c;

        /* renamed from: d */
        private String f8436d;

        /* renamed from: e */
        private String f8437e;

        /* renamed from: f */
        private String f8438f;

        /* renamed from: g */
        private String f8439g;

        /* renamed from: a */
        public String mo19670a() {
            return this.f8438f;
        }

        /* renamed from: a */
        public void mo19671a(String str) {
            this.f8438f = str;
        }

        /* renamed from: b */
        public String mo19672b() {
            return this.f8433a;
        }

        /* renamed from: b */
        public void mo19673b(String str) {
            this.f8433a = str;
        }

        /* renamed from: c */
        public String mo19674c() {
            return this.f8434b;
        }

        /* renamed from: c */
        public void mo19675c(String str) {
            this.f8434b = str;
        }

        /* renamed from: d */
        public String mo19676d() {
            return this.f8435c;
        }

        /* renamed from: d */
        public void mo19677d(String str) {
            this.f8435c = str;
        }

        /* renamed from: e */
        public String mo19678e() {
            return this.f8436d;
        }

        /* renamed from: e */
        public void mo19679e(String str) {
            this.f8436d = str;
        }

        /* renamed from: f */
        public String mo19680f() {
            return this.f8437e;
        }

        /* renamed from: f */
        public void mo19681f(String str) {
            this.f8437e = str;
        }

        /* renamed from: g */
        public String mo19682g() {
            return this.f8439g;
        }

        /* renamed from: g */
        public void mo19683g(String str) {
            this.f8439g = str;
        }
    }
}
