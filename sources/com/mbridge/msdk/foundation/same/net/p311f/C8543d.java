package com.mbridge.msdk.foundation.same.net.p311f;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.d */
/* compiled from: RequestUrlUtil */
public final class C8543d {

    /* renamed from: A */
    public String f20930A;

    /* renamed from: B */
    public String f20931B;

    /* renamed from: C */
    public int f20932C;

    /* renamed from: D */
    public int f20933D;

    /* renamed from: E */
    public boolean f20934E;

    /* renamed from: F */
    public ArrayList<String> f20935F;

    /* renamed from: G */
    public ArrayList<String> f20936G;

    /* renamed from: H */
    private final String f20937H;

    /* renamed from: I */
    private boolean f20938I;

    /* renamed from: J */
    private int f20939J;

    /* renamed from: K */
    private String f20940K;

    /* renamed from: L */
    private String f20941L;

    /* renamed from: M */
    private String f20942M;

    /* renamed from: N */
    private String f20943N;

    /* renamed from: O */
    private String f20944O;

    /* renamed from: P */
    private String f20945P;

    /* renamed from: Q */
    private String f20946Q;

    /* renamed from: R */
    private String f20947R;

    /* renamed from: S */
    private String f20948S;

    /* renamed from: T */
    private String f20949T;

    /* renamed from: U */
    private String f20950U;

    /* renamed from: V */
    private String f20951V;

    /* renamed from: a */
    public String f20952a;

    /* renamed from: b */
    public String f20953b;

    /* renamed from: c */
    public String f20954c;

    /* renamed from: d */
    public String f20955d;

    /* renamed from: e */
    public String f20956e;

    /* renamed from: f */
    public int f20957f;

    /* renamed from: g */
    public int f20958g;

    /* renamed from: h */
    public boolean f20959h;

    /* renamed from: i */
    public int f20960i;

    /* renamed from: j */
    public String f20961j;

    /* renamed from: k */
    public String f20962k;

    /* renamed from: l */
    public String f20963l;

    /* renamed from: m */
    public String f20964m;

    /* renamed from: n */
    public String f20965n;

    /* renamed from: o */
    public String f20966o;

    /* renamed from: p */
    public String f20967p;

    /* renamed from: q */
    public String f20968q;

    /* renamed from: r */
    public String f20969r;

    /* renamed from: s */
    public String f20970s;

    /* renamed from: t */
    public String f20971t;

    /* renamed from: u */
    public String f20972u;

    /* renamed from: v */
    public String f20973v;

    /* renamed from: w */
    public String f20974w;

    /* renamed from: x */
    public String f20975x;

    /* renamed from: y */
    public String f20976y;

    /* renamed from: z */
    public String f20977z;

    /* renamed from: com.mbridge.msdk.foundation.same.net.f.d$a */
    /* compiled from: RequestUrlUtil */
    private static class C8545a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8543d f20978a = new C8543d();
    }

    private C8543d() {
        this.f20937H = "RequestUrlUtil";
        this.f20938I = true;
        this.f20939J = 0;
        this.f20940K = "https://{}hb.rayjump.com";
        this.f20952a = "https://analytics.rayjump.com";
        this.f20953b = "https://net.rayjump.com";
        this.f20954c = "https://configure.rayjump.com";
        this.f20955d = "configure-tcp.rayjump.com";
        this.f20956e = C8659q.m24802b("DkPtYdQTLkfAW+xUhoPwLkPTHkJBDkM/Yr5T");
        this.f20957f = 9377;
        this.f20958g = 9377;
        this.f20959h = false;
        this.f20960i = 1;
        this.f20941L = "/bid";
        this.f20942M = "/load";
        this.f20943N = "/openapi/ad/v3";
        this.f20944O = "/openapi/ad/v4";
        this.f20945P = "/openapi/ad/v5";
        this.f20946Q = "/image";
        this.f20947R = "/mapping";
        this.f20948S = "/setting";
        this.f20949T = "/sdk/customid";
        this.f20950U = "/rewardsetting";
        this.f20951V = "/appwall/setting";
        this.f20961j = this.f20940K + this.f20941L;
        this.f20962k = this.f20940K + this.f20942M;
        this.f20963l = this.f20953b + this.f20943N;
        this.f20964m = this.f20953b + this.f20944O;
        this.f20965n = this.f20953b + this.f20945P;
        this.f20966o = this.f20953b + this.f20946Q;
        this.f20967p = this.f20954c + this.f20948S;
        this.f20968q = this.f20954c + this.f20949T;
        this.f20969r = this.f20954c + this.f20950U;
        this.f20970s = this.f20954c + this.f20947R;
        this.f20971t = this.f20954c + this.f20951V;
        this.f20972u = this.f20955d + this.f20948S;
        this.f20973v = this.f20955d + this.f20949T;
        this.f20974w = this.f20955d + this.f20950U;
        this.f20975x = this.f20955d + this.f20947R;
        this.f20976y = this.f20955d + this.f20951V;
        this.f20977z = "https://detect.rayjump.com/mapi/find";
        this.f20930A = "https://detect.rayjump.com/mapi/result";
        this.f20931B = "https://d1tru86qrby720.cloudfront.net/hostsetting";
        this.f20932C = 0;
        this.f20933D = 0;
        this.f20934E = false;
        this.f20935F = new ArrayList<>(Arrays.asList(new String[]{"https://configure.rayjump.com", "https://policy.rayjump.com", "https://lazy.rayjump.com", "https://check.rayjump.com"}));
        this.f20936G = new ArrayList<>(Arrays.asList(new String[]{"configure-tcp.rayjump.com", "policy-tcp.rayjump.com", "lazy-tcp.rayjump.com", "check-tcp.rayjump.com"}));
    }

    /* renamed from: a */
    public static C8543d m24463a() {
        return C8545a.f20978a;
    }

    /* renamed from: b */
    public final int mo57968b() {
        return this.f20939J;
    }

    /* renamed from: a */
    public final void mo57967a(int i) {
        this.f20939J = i;
    }

    /* renamed from: a */
    public final String mo57965a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return mo57966a(true, split[1]);
                }
                return mo57966a(true, "");
            }
        } catch (Exception e) {
            C8672v.m24878d("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.f20965n : this.f20963l;
    }

    /* renamed from: a */
    public final String mo57966a(boolean z, String str) {
        if (!z) {
            return this.f20961j.replace(JsonUtils.EMPTY_JSON, "");
        }
        if (!this.f20962k.contains(JsonUtils.EMPTY_JSON) || TextUtils.isEmpty(str)) {
            return this.f20962k.replace(JsonUtils.EMPTY_JSON, "");
        }
        String str2 = this.f20962k;
        return str2.replace(JsonUtils.EMPTY_JSON, str + "-");
    }

    /* renamed from: c */
    public final void mo57969c() {
        HashMap<String, String> az;
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b != null) {
            this.f20959h = b.mo16181aE() == 2;
            this.f20960i = b.mo16181aE();
            this.f20938I = !b.mo16236i(2);
            if (b.mo16208az() != null && b.mo16208az().size() > 0 && (az = b.mo16208az()) != null && az.size() > 0) {
                if (az.containsKey("v") && !TextUtils.isEmpty(az.get("v")) && m24464a(az.get("v"))) {
                    this.f20953b = az.get("v");
                    this.f20963l = this.f20953b + this.f20943N;
                    this.f20964m = this.f20953b + this.f20944O;
                    this.f20965n = this.f20953b + this.f20945P;
                    this.f20966o = this.f20953b + this.f20946Q;
                }
                if (az.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(az.get(CampaignEx.JSON_KEY_HB)) && m24464a(az.get(CampaignEx.JSON_KEY_HB))) {
                    this.f20940K = az.get(CampaignEx.JSON_KEY_HB);
                    this.f20961j = this.f20940K + this.f20941L;
                    this.f20962k = this.f20940K + this.f20942M;
                }
                if (az.containsKey("lg") && !TextUtils.isEmpty(az.get("lg"))) {
                    String str = az.get("lg");
                    if (m24464a(str)) {
                        this.f20952a = str;
                    } else {
                        this.f20956e = str;
                    }
                }
                if (az.containsKey(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE) && !TextUtils.isEmpty(az.get(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE)) && m24464a(az.get(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE))) {
                    this.f20930A = az.get(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);
                }
                if (az.containsKey("df") && !TextUtils.isEmpty(az.get("df")) && m24464a(az.get("df"))) {
                    this.f20977z = az.get("df");
                }
            }
            String y = b.mo16268y();
            if (!TextUtils.isEmpty(y)) {
                this.f20954c = y;
                mo57971e();
                this.f20935F.add(0, y);
            }
            String z = b.mo16270z();
            if (!TextUtils.isEmpty(z)) {
                this.f20955d = z;
                mo57972f();
                this.f20936G.add(0, z);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo57970d() {
        try {
            if (!this.f20959h) {
                if (this.f20935F != null && this.f20932C <= this.f20935F.size() - 1) {
                    this.f20954c = this.f20935F.get(this.f20932C);
                    mo57971e();
                    return true;
                }
            } else if (this.f20936G != null && this.f20933D <= this.f20936G.size() - 1) {
                if (!m24464a(this.f20936G.get(this.f20933D))) {
                    this.f20955d = this.f20936G.get(this.f20933D);
                    mo57972f();
                }
                return true;
            }
            if (this.f20934E) {
                this.f20932C = 0;
                this.f20933D = 0;
            }
            return false;
        } catch (Throwable th) {
            C8672v.m24874a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m24464a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    /* renamed from: e */
    public final void mo57971e() {
        this.f20967p = this.f20954c + this.f20948S;
        this.f20968q = this.f20954c + this.f20949T;
        this.f20969r = this.f20954c + this.f20950U;
        this.f20970s = this.f20954c + this.f20947R;
        this.f20971t = this.f20954c + this.f20951V;
    }

    /* renamed from: f */
    public final void mo57972f() {
        this.f20972u = this.f20955d + this.f20948S;
        this.f20973v = this.f20955d + this.f20949T;
        this.f20974w = this.f20955d + this.f20950U;
        this.f20975x = this.f20955d + this.f20947R;
        this.f20976y = this.f20955d + this.f20951V;
    }
}
