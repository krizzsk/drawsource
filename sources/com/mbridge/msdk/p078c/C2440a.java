package com.mbridge.msdk.p078c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8456a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.tools.C8646l;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.a */
/* compiled from: Setting */
public final class C2440a {

    /* renamed from: a */
    public static int f4949a = 1500;

    /* renamed from: A */
    private String f4950A = C8543d.m24463a().f20954c;

    /* renamed from: B */
    private String f4951B = C8543d.m24463a().f20955d;

    /* renamed from: C */
    private int f4952C = 120;

    /* renamed from: D */
    private String f4953D = "";

    /* renamed from: E */
    private int f4954E = 1;

    /* renamed from: F */
    private int f4955F = 1;

    /* renamed from: G */
    private int f4956G = 1;

    /* renamed from: H */
    private int f4957H = 0;

    /* renamed from: I */
    private int f4958I = 1;

    /* renamed from: J */
    private int f4959J = 0;

    /* renamed from: K */
    private String f4960K;

    /* renamed from: L */
    private int f4961L = 30;

    /* renamed from: M */
    private int f4962M = 5;

    /* renamed from: N */
    private int f4963N = 0;

    /* renamed from: O */
    private int f4964O = 0;

    /* renamed from: P */
    private int f4965P = 9377;

    /* renamed from: Q */
    private int f4966Q = 0;

    /* renamed from: R */
    private int f4967R = 0;

    /* renamed from: S */
    private int f4968S = 0;

    /* renamed from: T */
    private int f4969T = 2;

    /* renamed from: U */
    private int f4970U = 10;

    /* renamed from: V */
    private String f4971V;

    /* renamed from: W */
    private boolean f4972W = false;

    /* renamed from: X */
    private JSONArray f4973X = new JSONArray();

    /* renamed from: Y */
    private JSONArray f4974Y = new JSONArray();

    /* renamed from: Z */
    private int f4975Z = 0;

    /* renamed from: aA */
    private int f4976aA = 0;

    /* renamed from: aB */
    private C2442b f4977aB;

    /* renamed from: aC */
    private int f4978aC = 0;

    /* renamed from: aD */
    private String f4979aD = "";

    /* renamed from: aE */
    private String f4980aE = "";

    /* renamed from: aF */
    private String f4981aF;

    /* renamed from: aG */
    private String f4982aG;

    /* renamed from: aH */
    private int f4983aH = 0;

    /* renamed from: aI */
    private boolean f4984aI = false;

    /* renamed from: aJ */
    private int f4985aJ = 120;

    /* renamed from: aK */
    private ArrayList<Integer> f4986aK;

    /* renamed from: aL */
    private HashMap<String, String> f4987aL;

    /* renamed from: aM */
    private int f4988aM = 0;

    /* renamed from: aN */
    private int f4989aN = 0;

    /* renamed from: aO */
    private int f4990aO = 0;

    /* renamed from: aP */
    private int f4991aP = 0;

    /* renamed from: aQ */
    private int f4992aQ = 0;

    /* renamed from: aR */
    private int f4993aR = 1;

    /* renamed from: aa */
    private int f4994aa = 0;

    /* renamed from: ab */
    private int f4995ab = 0;

    /* renamed from: ac */
    private int f4996ac = 3;

    /* renamed from: ad */
    private int f4997ad = 600;

    /* renamed from: ae */
    private int f4998ae = 10;

    /* renamed from: af */
    private int f4999af = 8000;

    /* renamed from: ag */
    private int f5000ag = 8000;

    /* renamed from: ah */
    private int f5001ah = IronSourceConstants.RV_AUCTION_REQUEST;

    /* renamed from: ai */
    private int f5002ai = f4949a;

    /* renamed from: aj */
    private int f5003aj = 1;

    /* renamed from: ak */
    private String f5004ak = "";

    /* renamed from: al */
    private boolean f5005al = false;

    /* renamed from: am */
    private List<Integer> f5006am = new ArrayList();

    /* renamed from: an */
    private long f5007an;

    /* renamed from: ao */
    private int f5008ao;

    /* renamed from: ap */
    private String f5009ap = "";

    /* renamed from: aq */
    private String f5010aq = "";

    /* renamed from: ar */
    private String f5011ar = "";

    /* renamed from: as */
    private String f5012as = "";

    /* renamed from: at */
    private String f5013at = "";

    /* renamed from: au */
    private String f5014au = "";

    /* renamed from: av */
    private String f5015av = "";

    /* renamed from: aw */
    private String f5016aw = "";

    /* renamed from: ax */
    private String f5017ax = "";

    /* renamed from: ay */
    private String f5018ay = "";

    /* renamed from: az */
    private Map<String, C2441a> f5019az;

    /* renamed from: b */
    private int f5020b = 0;

    /* renamed from: c */
    private String f5021c;

    /* renamed from: d */
    private int f5022d;

    /* renamed from: e */
    private long f5023e = 86400;

    /* renamed from: f */
    private long f5024f;

    /* renamed from: g */
    private Map<String, String> f5025g;

    /* renamed from: h */
    private boolean f5026h;

    /* renamed from: i */
    private long f5027i;

    /* renamed from: j */
    private boolean f5028j;

    /* renamed from: k */
    private long f5029k;

    /* renamed from: l */
    private long f5030l;

    /* renamed from: m */
    private long f5031m;

    /* renamed from: n */
    private boolean f5032n;

    /* renamed from: o */
    private int f5033o;

    /* renamed from: p */
    private int f5034p;

    /* renamed from: q */
    private long f5035q;

    /* renamed from: r */
    private int f5036r;

    /* renamed from: s */
    private int f5037s;

    /* renamed from: t */
    private String f5038t;

    /* renamed from: u */
    private int f5039u;

    /* renamed from: v */
    private List<C8456a> f5040v;

    /* renamed from: w */
    private boolean f5041w = false;

    /* renamed from: x */
    private int f5042x = 3;

    /* renamed from: y */
    private boolean f5043y = true;

    /* renamed from: z */
    private int f5044z;

    /* renamed from: a */
    public final void mo16173a(int i) {
        this.f5044z = i;
    }

    /* renamed from: a */
    public final int mo16172a() {
        return this.f5044z;
    }

    /* renamed from: b */
    public final List<C8456a> mo16209b() {
        return this.f5040v;
    }

    /* renamed from: c */
    public final String mo16214c() {
        return this.f4953D;
    }

    /* renamed from: d */
    public final int mo16218d() {
        return this.f4952C;
    }

    /* renamed from: b */
    public final void mo16210b(int i) {
        this.f4952C = i;
    }

    /* renamed from: e */
    public final int mo16223e() {
        return this.f5020b;
    }

    /* renamed from: c */
    public final void mo16215c(int i) {
        this.f5020b = i;
    }

    /* renamed from: a */
    public final void mo16176a(boolean z) {
        this.f4972W = z;
    }

    /* renamed from: f */
    public final boolean mo16230f() {
        return this.f4972W;
    }

    /* renamed from: g */
    public final int mo16231g() {
        return this.f5001ah;
    }

    /* renamed from: h */
    public final int mo16233h() {
        return this.f4999af;
    }

    /* renamed from: i */
    public final int mo16235i() {
        return this.f5000ag;
    }

    /* renamed from: b */
    public final void mo16213b(boolean z) {
        this.f5005al = z;
    }

    /* renamed from: j */
    public final boolean mo16238j() {
        return this.f5005al;
    }

    /* renamed from: k */
    public final int mo16239k() {
        return this.f4994aa;
    }

    /* renamed from: l */
    public final int mo16241l() {
        return this.f4995ab;
    }

    /* renamed from: m */
    public final int mo16243m() {
        return this.f4996ac;
    }

    /* renamed from: n */
    public final int mo16245n() {
        return this.f4997ad;
    }

    /* renamed from: o */
    public final int mo16247o() {
        return this.f4998ae;
    }

    /* renamed from: p */
    public final int mo16249p() {
        return this.f4975Z;
    }

    /* renamed from: q */
    public final JSONArray mo16251q() {
        return this.f4973X;
    }

    /* renamed from: r */
    public final JSONArray mo16253r() {
        return this.f4974Y;
    }

    /* renamed from: s */
    public final String mo16255s() {
        return this.f4971V;
    }

    /* renamed from: a */
    public final void mo16175a(String str) {
        this.f4971V = str;
    }

    /* renamed from: d */
    public final void mo16219d(int i) {
        if (i > 0) {
            this.f4970U = i;
        }
    }

    /* renamed from: t */
    public final int mo16257t() {
        return this.f4970U;
    }

    /* renamed from: e */
    public final void mo16224e(int i) {
        this.f4966Q = i;
    }

    /* renamed from: u */
    public final int mo16260u() {
        return this.f4966Q;
    }

    /* renamed from: f */
    public final void mo16228f(int i) {
        this.f4967R = i;
    }

    /* renamed from: v */
    public final int mo16262v() {
        return this.f4967R;
    }

    /* renamed from: g */
    public final void mo16232g(int i) {
        this.f4968S = i;
    }

    /* renamed from: w */
    public final int mo16264w() {
        return this.f4968S;
    }

    /* renamed from: h */
    public final void mo16234h(int i) {
        this.f4969T = i;
    }

    /* renamed from: x */
    public final int mo16266x() {
        return this.f4969T;
    }

    /* renamed from: y */
    public final String mo16268y() {
        return this.f4950A;
    }

    /* renamed from: z */
    public final String mo16270z() {
        return this.f4951B;
    }

    /* renamed from: i */
    public final boolean mo16236i(int i) {
        return this.f5006am.contains(Integer.valueOf(i));
    }

    /* renamed from: A */
    public final int mo16146A() {
        return this.f4954E;
    }

    /* renamed from: j */
    public final void mo16237j(int i) {
        this.f4954E = i;
    }

    /* renamed from: B */
    public final int mo16147B() {
        return this.f4955F;
    }

    /* renamed from: k */
    public final void mo16240k(int i) {
        this.f4955F = i;
    }

    /* renamed from: C */
    public final int mo16148C() {
        return this.f4956G;
    }

    /* renamed from: l */
    public final void mo16242l(int i) {
        this.f4956G = i;
    }

    /* renamed from: D */
    public final int mo16149D() {
        return this.f4957H;
    }

    /* renamed from: m */
    public final void mo16244m(int i) {
        this.f4957H = i;
    }

    /* renamed from: E */
    public final int mo16150E() {
        return this.f4958I;
    }

    /* renamed from: n */
    public final void mo16246n(int i) {
        this.f4958I = i;
    }

    /* renamed from: F */
    public final int mo16151F() {
        return this.f4959J;
    }

    /* renamed from: o */
    public final void mo16248o(int i) {
        this.f4959J = i;
    }

    /* renamed from: G */
    public final int mo16152G() {
        return this.f5039u;
    }

    /* renamed from: p */
    public final void mo16250p(int i) {
        this.f5039u = i;
    }

    /* renamed from: H */
    public final String mo16153H() {
        return this.f5038t;
    }

    /* renamed from: b */
    public final void mo16212b(String str) {
        this.f5038t = str;
    }

    /* renamed from: I */
    public final int mo16154I() {
        return this.f5037s;
    }

    /* renamed from: J */
    public final int mo16155J() {
        return this.f5036r;
    }

    /* renamed from: K */
    public final long mo16156K() {
        if (this.f5035q <= 0) {
            this.f5035q = 7200;
        }
        return this.f5035q;
    }

    /* renamed from: a */
    public final void mo16174a(long j) {
        this.f5035q = j;
    }

    /* renamed from: L */
    public final int mo16157L() {
        return this.f5008ao;
    }

    /* renamed from: q */
    public final void mo16252q(int i) {
        this.f5008ao = i;
    }

    /* renamed from: M */
    public final long mo16158M() {
        return this.f5007an;
    }

    /* renamed from: b */
    public final void mo16211b(long j) {
        this.f5007an = j;
    }

    /* renamed from: N */
    public final boolean mo16159N() {
        return this.f5032n;
    }

    /* renamed from: c */
    public final void mo16217c(boolean z) {
        this.f5032n = z;
    }

    /* renamed from: O */
    public final long mo16160O() {
        return this.f5031m;
    }

    /* renamed from: P */
    public final boolean mo16161P() {
        return this.f5028j;
    }

    /* renamed from: d */
    public final void mo16222d(boolean z) {
        this.f5028j = z;
    }

    /* renamed from: Q */
    public final long mo16162Q() {
        return this.f5029k;
    }

    /* renamed from: c */
    public final void mo16216c(long j) {
        this.f5029k = j;
    }

    /* renamed from: d */
    public final void mo16220d(long j) {
        this.f5030l = j;
    }

    public final String toString() {
        return " cfc=" + this.f5022d + " getpf=" + this.f5023e + " rurl=" + this.f5028j;
    }

    /* renamed from: R */
    public final int mo16163R() {
        return this.f5022d;
    }

    /* renamed from: r */
    public final void mo16254r(int i) {
        this.f5022d = i;
    }

    /* renamed from: S */
    public final long mo16164S() {
        return this.f5023e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.mbridge.msdk.c.a} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.List<com.mbridge.msdk.foundation.entity.a>] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:166|167) */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r8.f5005al = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r8.f4972W = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0504 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x0538 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0548 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.p078c.C2440a m5883c(java.lang.String r16) {
        /*
            java.lang.String r1 = "omsdkjs_h5_url"
            java.lang.String r2 = "omsdkjs_url"
            java.lang.String r0 = "plctb"
            java.lang.String r3 = "pcrn"
            java.lang.String r4 = "plct"
            java.lang.String r5 = ""
            r6 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r16)     // Catch:{ Exception -> 0x054f }
            if (r7 != 0) goto L_0x0553
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x054f }
            r8 = r16
            r7.<init>(r8)     // Catch:{ Exception -> 0x054f }
            com.mbridge.msdk.c.a r8 = new com.mbridge.msdk.c.a     // Catch:{ Exception -> 0x054f }
            r8.<init>()     // Catch:{ Exception -> 0x054f }
            java.lang.String r9 = "cc"
            java.lang.String r9 = r7.optString(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5021c = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "mv_wildcard"
            java.lang.String r10 = "mbridge"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ Exception -> 0x054c }
            r8.f5038t = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "cfc"
            int r9 = r7.optInt(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5022d = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "getpf"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5023e = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "current_time"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5027i = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "cfb"
            boolean r9 = r7.optBoolean(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5026h = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = "awct"
            long r9 = r7.optLong(r9)     // Catch:{ Exception -> 0x054c }
            r8.f5030l = r9     // Catch:{ Exception -> 0x054c }
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x054c }
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0066
            r9 = 3600(0xe10, double:1.7786E-320)
            goto L_0x006a
        L_0x0066:
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x054c }
        L_0x006a:
            r8.f5029k = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "rurl"
            boolean r4 = r7.optBoolean(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5028j = r4     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "uct"
            long r9 = r7.optLong(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5031m = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "ujds"
            boolean r4 = r7.optBoolean(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5032n = r4     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "n2"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5033o = r4     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "n3"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5034p = r4     // Catch:{ Exception -> 0x054c }
            java.lang.String r4 = "is_startup_crashsystem"
            int r4 = r7.optInt(r4)     // Catch:{ Exception -> 0x054c }
            r8.f5039u = r4     // Catch:{ Exception -> 0x054c }
            int r4 = r7.optInt(r3)     // Catch:{ Exception -> 0x054c }
            r8.f5036r = r4     // Catch:{ Exception -> 0x054c }
            long r9 = r7.optLong(r0)     // Catch:{ Exception -> 0x054c }
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x00ad
            r9 = 7200(0x1c20, double:3.5573E-320)
            goto L_0x00b1
        L_0x00ad:
            long r9 = r7.optLong(r0)     // Catch:{ Exception -> 0x054c }
        L_0x00b1:
            r8.f5035q = r9     // Catch:{ Exception -> 0x054c }
            r0 = 100
            int r0 = r7.optInt(r3, r0)     // Catch:{ Exception -> 0x054c }
            r8.f5036r = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "opent"
            r3 = 1
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f5037s = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "sfct"
            r9 = 1800(0x708, double:8.893E-321)
            long r9 = r7.optLong(r0, r9)     // Catch:{ Exception -> 0x054c }
            r8.f5007an = r9     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "upgd"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4955F = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "upsrl"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4954E = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "updevid"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4956G = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "sc"
            r4 = 0
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4957H = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "up_tips"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4958I = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "iseu"
            r9 = -1
            int r0 = r7.optInt(r0, r9)     // Catch:{ Exception -> 0x054c }
            r8.f4959J = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "jm_unit"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x054c }
            r8.f4960K = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "atf"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x0149
            int r10 = r0.length()     // Catch:{ Exception -> 0x014e }
            if (r10 <= 0) goto L_0x0149
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x014e }
            r6.<init>()     // Catch:{ Exception -> 0x014e }
            r10 = r4
        L_0x011c:
            int r13 = r0.length()     // Catch:{ Exception -> 0x014e }
            if (r10 >= r13) goto L_0x0149
            java.lang.String r13 = r0.optString(r10)     // Catch:{ Exception -> 0x014e }
            boolean r14 = com.mbridge.msdk.foundation.tools.C8616ad.m24718b(r13)     // Catch:{ Exception -> 0x014e }
            if (r14 == 0) goto L_0x0145
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x014e }
            r14.<init>(r13)     // Catch:{ Exception -> 0x014e }
            com.mbridge.msdk.foundation.entity.a r13 = new com.mbridge.msdk.foundation.entity.a     // Catch:{ Exception -> 0x014e }
            java.lang.String r15 = "adtype"
            int r15 = r14.optInt(r15)     // Catch:{ Exception -> 0x014e }
            java.lang.String r3 = "unitid"
            java.lang.String r3 = r14.optString(r3)     // Catch:{ Exception -> 0x014e }
            r13.<init>(r15, r3)     // Catch:{ Exception -> 0x014e }
            r6.add(r13)     // Catch:{ Exception -> 0x014e }
        L_0x0145:
            int r10 = r10 + 1
            r3 = 1
            goto L_0x011c
        L_0x0149:
            if (r6 == 0) goto L_0x0152
            r8.f5040v = r6     // Catch:{ Exception -> 0x014e }
            goto L_0x0152
        L_0x014e:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x054c }
        L_0x0152:
            java.lang.String r0 = "adct"
            r3 = 259200(0x3f480, float:3.63217E-40)
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f5008ao = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "confirm_title"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5009ap = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "confirm_description"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5010aq = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "confirm_t"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5011ar = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "confirm_c_rv"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5012as = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "confirm_c_play"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5013at = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "adchoice_icon"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5014au = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "adchoice_link"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5016aw = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "adchoice_size"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5015av = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "platform_logo"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5018ay = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "platform_name"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f5017ax = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "cdnate_cfg"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            java.util.Map r0 = m5884f((java.lang.String) r0)     // Catch:{ Exception -> 0x054c }
            r8.f5019az = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "atrqt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f5020b = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "iupdid"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4978aC = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "mcs"
            r3 = 120(0x78, float:1.68E-43)
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4952C = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "ab_id"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4953D = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = r7.optString(r2, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4979aD = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = r7.optString(r1, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4980aE = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "rty_tk_clk"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4995ab = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "rty_tk_imp"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4994aa = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "rty_cnt"
            r6 = 3
            int r0 = r7.optInt(r0, r6)     // Catch:{ Exception -> 0x054c }
            r8.f4996ac = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "rty_to"
            r10 = 600(0x258, float:8.41E-43)
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x054c }
            r8.f4997ad = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "rty_inr"
            r10 = 10
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x054c }
            r8.f4998ae = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = r7.optString(r2, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4979aD = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = r7.optString(r1, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4980aE = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "tcto"
            long r0 = r7.optLong(r0)     // Catch:{ Exception -> 0x054c }
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x022f
            r0 = 10
            r8.f5024f = r0     // Catch:{ Exception -> 0x054c }
            goto L_0x0263
        L_0x022f:
            r8.f5024f = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "jt"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x054c }
            if (r0 == 0) goto L_0x0263
            int r1 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r1 <= 0) goto L_0x0263
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x054c }
            r1.<init>()     // Catch:{ Exception -> 0x054c }
            r2 = r4
        L_0x0245:
            int r11 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r2 >= r11) goto L_0x0261
            org.json.JSONObject r11 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x054c }
            java.lang.String r12 = "domain"
            java.lang.String r12 = r11.optString(r12)     // Catch:{ Exception -> 0x054c }
            java.lang.String r13 = "format"
            java.lang.String r11 = r11.optString(r13)     // Catch:{ Exception -> 0x054c }
            r1.put(r12, r11)     // Catch:{ Exception -> 0x054c }
            int r2 = r2 + 1
            goto L_0x0245
        L_0x0261:
            r8.f5025g = r1     // Catch:{ Exception -> 0x054c }
        L_0x0263:
            java.lang.String r0 = "mraid_js"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x054c }
            r8.f4982aG = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "web_env_url"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x054c }
            r8.f4981aF = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "alrbs"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r1 = 2
            if (r0 > r1) goto L_0x027e
            if (r0 >= 0) goto L_0x027f
        L_0x027e:
            r0 = r4
        L_0x027f:
            r8.f4983aH = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "GDPR_area"
            boolean r0 = r7.optBoolean(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4984aI = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "ct"
            int r0 = r7.optInt(r0, r3)     // Catch:{ Exception -> 0x054c }
            r8.f4985aJ = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "ercd"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x054c }
            if (r0 == 0) goto L_0x02ca
            int r1 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r1 <= 0) goto L_0x02ca
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x054c }
            r1.<init>()     // Catch:{ Exception -> 0x054c }
            r2 = r4
        L_0x02a5:
            int r3 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r2 >= r3) goto L_0x02bb
            int r3 = r0.optInt(r2)     // Catch:{ Exception -> 0x054c }
            if (r3 == 0) goto L_0x02b8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x054c }
            r1.add(r3)     // Catch:{ Exception -> 0x054c }
        L_0x02b8:
            int r2 = r2 + 1
            goto L_0x02a5
        L_0x02bb:
            int r0 = r1.size()     // Catch:{ Exception -> 0x054c }
            if (r0 <= 0) goto L_0x02ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x054c }
            r1.add(r0)     // Catch:{ Exception -> 0x054c }
            r8.f4986aK = r1     // Catch:{ Exception -> 0x054c }
        L_0x02ca:
            java.lang.String r0 = "hst"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x054c }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x054c }
            if (r1 != 0) goto L_0x032d
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r0)     // Catch:{ Exception -> 0x0323 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0323 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0323 }
            java.util.Iterator r0 = r1.keys()     // Catch:{ Exception -> 0x0323 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0323 }
            r2.<init>()     // Catch:{ Exception -> 0x0323 }
        L_0x02e8:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0323 }
            if (r3 == 0) goto L_0x031a
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0323 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r9)     // Catch:{ Exception -> 0x0323 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0323 }
            if (r9 != 0) goto L_0x02e8
            java.lang.String r9 = r1.optString(r3)     // Catch:{ Exception -> 0x0323 }
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0323 }
            goto L_0x02e8
        L_0x031a:
            int r0 = r2.size()     // Catch:{ Exception -> 0x0323 }
            if (r0 <= 0) goto L_0x032d
            r8.f4987aL = r2     // Catch:{ Exception -> 0x0323 }
            goto L_0x032d
        L_0x0323:
            r0 = move-exception
            java.lang.String r1 = "SETTING"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x054c }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)     // Catch:{ Exception -> 0x054c }
        L_0x032d:
            java.lang.String r0 = "refactor_switch"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x054c }
            if (r0 == 0) goto L_0x0373
            int r1 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r1 <= 0) goto L_0x0373
            r1 = r4
        L_0x033c:
            int r2 = r0.length()     // Catch:{ Exception -> 0x054c }
            if (r1 >= r2) goto L_0x0373
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x054c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x054c }
        L_0x034a:
            boolean r9 = r3.hasNext()     // Catch:{ Exception -> 0x054c }
            if (r9 == 0) goto L_0x0370
            java.lang.Object r9 = r3.next()     // Catch:{ Exception -> 0x054c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x054c }
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x054c }
            if (r11 != 0) goto L_0x034a
            boolean r11 = r2.getBoolean(r9)     // Catch:{ Exception -> 0x054c }
            if (r11 == 0) goto L_0x034a
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x054c }
            java.util.List<java.lang.Integer> r11 = r8.f5006am     // Catch:{ Exception -> 0x054c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x054c }
            r11.add(r9)     // Catch:{ Exception -> 0x054c }
            goto L_0x034a
        L_0x0370:
            int r1 = r1 + 1
            goto L_0x033c
        L_0x0373:
            java.lang.String r0 = "lqcnt"
            r1 = 30
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "lqto"
            r2 = 5
            int r1 = r7.optInt(r1, r2)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r2 = "lqswt"
            int r2 = r7.optInt(r2, r4)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r3 = "lqtype"
            int r3 = r7.optInt(r3, r4)     // Catch:{ Exception -> 0x0420 }
            r8.f4962M = r1     // Catch:{ Exception -> 0x0420 }
            r8.f4961L = r0     // Catch:{ Exception -> 0x0420 }
            r8.f4963N = r2     // Catch:{ Exception -> 0x0420 }
            r8.f4964O = r3     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_bl"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 != 0) goto L_0x03a8
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0420 }
            r0.<init>()     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000088"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
        L_0x03a8:
            r8.f4974Y = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_wl"
            org.json.JSONArray r0 = r7.optJSONArray(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 != 0) goto L_0x03cb
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0420 }
            r0.<init>()     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000041"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000042"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000032"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r1 = "2000079"
            r0.put(r1)     // Catch:{ Exception -> 0x0420 }
        L_0x03cb:
            r8.f4973X = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lg_wl_rt"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x0420 }
            r8.f4975Z = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "srml"
            r1 = 8000(0x1f40, float:1.121E-41)
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f4999af = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lrml"
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f5000ag = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "wgl_d_ms"
            r1 = 1300(0x514, float:1.822E-42)
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f5001ah = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "dp_ct"
            int r1 = f4949a     // Catch:{ Exception -> 0x0420 }
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0420 }
            r8.f5002ai = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.click.p218b.C6782a.f17892c = r0     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = "lqpt"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x0420 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r0)     // Catch:{ Exception -> 0x0420 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0420 }
            if (r0 <= 0) goto L_0x0420
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 >= r1) goto L_0x0420
            r8.f4965P = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x0420 }
            r1.f20957f = r0     // Catch:{ Exception -> 0x0420 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x0420 }
            r1.f20958g = r0     // Catch:{ Exception -> 0x0420 }
        L_0x0420:
            java.lang.String r0 = "wvddt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4988aM = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "hst_st"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4950A = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "hst_st_t"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x054c }
            r8.f4951B = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "l"
            int r0 = r7.optInt(r0, r6)     // Catch:{ Exception -> 0x045c }
            java.lang.String r1 = "k"
            int r1 = r7.optInt(r1, r4)     // Catch:{ Exception -> 0x045c }
            r2 = 1
            if (r1 != r2) goto L_0x0449
            r1 = r2
            goto L_0x044a
        L_0x0449:
            r1 = r4
        L_0x044a:
            java.lang.String r3 = "m"
            int r3 = r7.optInt(r3, r2)     // Catch:{ Exception -> 0x045c }
            if (r3 != r2) goto L_0x0454
            r2 = 1
            goto L_0x0455
        L_0x0454:
            r2 = r4
        L_0x0455:
            r8.f5042x = r0     // Catch:{ Exception -> 0x045c }
            r8.f5041w = r1     // Catch:{ Exception -> 0x045c }
            r8.f5043y = r2     // Catch:{ Exception -> 0x045c }
            goto L_0x0466
        L_0x045c:
            r0 = move-exception
            java.lang.String r1 = "Setting"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x054c }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)     // Catch:{ Exception -> 0x054c }
        L_0x0466:
            java.lang.String r0 = "fbk_swt"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x054c }
            r8.f4976aA = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "fbk"
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ Exception -> 0x054c }
            com.mbridge.msdk.c.a$b r0 = com.mbridge.msdk.p078c.C2440a.C2442b.m6014a(r0)     // Catch:{ Exception -> 0x054c }
            r8.f4977aB = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "ad_connection_timeout"
            int r1 = com.mbridge.msdk.foundation.same.C8469a.f20762w     // Catch:{ Exception -> 0x04e5 }
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r1 = "ad_read_timeout"
            int r2 = com.mbridge.msdk.foundation.same.C8469a.f20763x     // Catch:{ Exception -> 0x04e5 }
            int r1 = r7.optInt(r1, r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = "ad_write_timeout"
            int r3 = com.mbridge.msdk.foundation.same.C8469a.f20764y     // Catch:{ Exception -> 0x04e5 }
            int r2 = r7.optInt(r2, r3)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r3 = "ad_retry_count"
            int r6 = com.mbridge.msdk.foundation.same.C8469a.f20765z     // Catch:{ Exception -> 0x04e5 }
            int r3 = r7.optInt(r3, r6)     // Catch:{ Exception -> 0x04e5 }
            if (r0 > 0) goto L_0x049e
            int r0 = com.mbridge.msdk.foundation.same.C8469a.f20762w     // Catch:{ Exception -> 0x04e5 }
        L_0x049e:
            r8.f4968S = r0     // Catch:{ Exception -> 0x04e5 }
            if (r1 > 0) goto L_0x04a4
            int r1 = com.mbridge.msdk.foundation.same.C8469a.f20763x     // Catch:{ Exception -> 0x04e5 }
        L_0x04a4:
            r8.f4966Q = r1     // Catch:{ Exception -> 0x04e5 }
            if (r2 > 0) goto L_0x04aa
            int r2 = com.mbridge.msdk.foundation.same.C8469a.f20764y     // Catch:{ Exception -> 0x04e5 }
        L_0x04aa:
            r8.f4967R = r2     // Catch:{ Exception -> 0x04e5 }
            if (r3 >= 0) goto L_0x04b0
            int r3 = com.mbridge.msdk.foundation.same.C8469a.f20765z     // Catch:{ Exception -> 0x04e5 }
        L_0x04b0:
            r8.f4969T = r3     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "max_download_task_size"
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x04e5 }
            if (r0 > 0) goto L_0x04bb
            r0 = r10
        L_0x04bb:
            r8.f5044z = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "max_bitmap_cache_size"
            int r0 = r7.optInt(r0, r10)     // Catch:{ Exception -> 0x04e5 }
            r8.mo16219d((int) r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "t_t"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4991aP = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "h_t"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4990aO = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "gtp"
            int r0 = r7.optInt(r0)     // Catch:{ Exception -> 0x04e5 }
            r8.f4992aQ = r0     // Catch:{ Exception -> 0x04e5 }
            com.mbridge.msdk.foundation.same.net.f.d r1 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x04e5 }
            r1.mo57967a((int) r0)     // Catch:{ Exception -> 0x04e5 }
        L_0x04e5:
            java.lang.String r0 = "http_track_url"
            java.lang.String r0 = r7.optString(r0, r5)     // Catch:{ Exception -> 0x04ed }
            r8.f4971V = r0     // Catch:{ Exception -> 0x04ed }
        L_0x04ed:
            java.lang.String r0 = "st_net"
            r1 = 1
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x054c }
            r8.f4993aR = r0     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = "check_webview"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0504 }
            if (r0 != 0) goto L_0x0500
            r2 = r4
            goto L_0x0501
        L_0x0500:
            r2 = 1
        L_0x0501:
            r8.f5005al = r2     // Catch:{ Exception -> 0x0504 }
            goto L_0x0506
        L_0x0504:
            r8.f5005al = r4     // Catch:{ Exception -> 0x054c }
        L_0x0506:
            java.lang.String r0 = "swxid"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x054c }
            java.lang.String r1 = r8.f5004ak     // Catch:{ Exception -> 0x054c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x054c }
            if (r1 != 0) goto L_0x052d
            r8.f5004ak = r0     // Catch:{ Exception -> 0x054c }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x054c }
            java.lang.String r0 = r0.mo56915i()     // Catch:{ Exception -> 0x054c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x054c }
            if (r0 == 0) goto L_0x052d
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x054c }
            java.lang.String r1 = r8.f5004ak     // Catch:{ Exception -> 0x054c }
            r0.mo56909c((java.lang.String) r1)     // Catch:{ Exception -> 0x054c }
        L_0x052d:
            java.lang.String r0 = "ch_nv_im_cb"
            r1 = 1
            int r0 = r7.optInt(r0, r1)     // Catch:{ Exception -> 0x0538 }
            r8.f5003aj = r0     // Catch:{ Exception -> 0x0538 }
            goto L_0x053a
        L_0x0537:
            r1 = 1
        L_0x0538:
            r8.f5003aj = r1     // Catch:{ Exception -> 0x054c }
        L_0x053a:
            java.lang.String r0 = "do_us_fi_re"
            int r0 = r7.optInt(r0, r4)     // Catch:{ Exception -> 0x0548 }
            if (r0 == 0) goto L_0x0544
            r3 = r1
            goto L_0x0545
        L_0x0544:
            r3 = r4
        L_0x0545:
            r8.f4972W = r3     // Catch:{ Exception -> 0x0548 }
            goto L_0x054a
        L_0x0548:
            r8.f4972W = r4     // Catch:{ Exception -> 0x054c }
        L_0x054a:
            r6 = r8
            goto L_0x0553
        L_0x054c:
            r0 = move-exception
            r6 = r8
            goto L_0x0550
        L_0x054f:
            r0 = move-exception
        L_0x0550:
            r0.printStackTrace()
        L_0x0553:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p078c.C2440a.m5883c(java.lang.String):com.mbridge.msdk.c.a");
    }

    /* renamed from: T */
    public final long mo16165T() {
        return this.f5027i;
    }

    /* renamed from: U */
    public final long mo16166U() {
        return this.f5024f * 1000;
    }

    /* renamed from: e */
    public final void mo16225e(long j) {
        this.f5024f = j;
    }

    /* renamed from: a */
    public static String m5882a(Context context, String str) {
        try {
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                return "";
            }
            if (b.f5025g == null) {
                return "";
            }
            String host = Uri.parse(str).getHost();
            for (Map.Entry<String, String> key : b.f5025g.entrySet()) {
                String str2 = (String) key.getKey();
                if (!TextUtils.isEmpty(host) && host.contains(str2)) {
                    String str3 = b.f5025g.get(str2);
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    return str3.replace("{gaid}", C8660r.m24832k());
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final void mo16227e(boolean z) {
        this.f5026h = z;
    }

    /* renamed from: V */
    public final int mo16167V() {
        return this.f5033o;
    }

    /* renamed from: W */
    public final int mo16168W() {
        return this.f5034p;
    }

    /* renamed from: X */
    public final String mo16169X() {
        return this.f5009ap;
    }

    /* renamed from: Y */
    public final String mo16170Y() {
        return this.f5010aq;
    }

    /* renamed from: Z */
    public final String mo16171Z() {
        return this.f5011ar;
    }

    /* renamed from: aa */
    public final String mo16183aa() {
        return this.f5012as;
    }

    /* renamed from: ab */
    public final String mo16184ab() {
        return this.f5013at;
    }

    /* renamed from: ac */
    public final void mo16185ac() {
        String language = Locale.getDefault().getLanguage();
        boolean z = true;
        if (!(!TextUtils.isEmpty(this.f5009ap) && !TextUtils.isEmpty(this.f5010aq) && !TextUtils.isEmpty(this.f5011ar) && !TextUtils.isEmpty(this.f5012as))) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f5009ap = "Confirm to close? ";
                this.f5010aq = "You will not be rewarded after closing the window";
                this.f5011ar = "Close it";
                this.f5012as = "Continue";
            } else {
                this.f5009ap = "确认关闭？";
                this.f5010aq = "关闭后您将不会获得任何奖励噢~ ";
                this.f5011ar = "确认关闭";
                this.f5012as = "继续观看";
            }
        }
        if (TextUtils.isEmpty(this.f5009ap) || TextUtils.isEmpty(this.f5010aq) || TextUtils.isEmpty(this.f5011ar) || TextUtils.isEmpty(this.f5013at)) {
            z = false;
        }
        if (z) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f5009ap = "Confirm to close? ";
            this.f5010aq = "You will not be rewarded after closing the window";
            this.f5011ar = "Close it";
            this.f5013at = "Continue";
            return;
        }
        this.f5009ap = "确认关闭？";
        this.f5010aq = "关闭后您将不会获得任何奖励噢~ ";
        this.f5011ar = "确认关闭";
        this.f5013at = "继续试玩";
    }

    /* renamed from: ad */
    public final String mo16186ad() {
        return this.f5014au;
    }

    /* renamed from: ae */
    public final String mo16187ae() {
        return this.f5015av;
    }

    /* renamed from: af */
    public final String mo16188af() {
        return this.f5016aw;
    }

    /* renamed from: ag */
    public final Map<String, C2441a> mo16189ag() {
        return this.f5019az;
    }

    /* renamed from: f */
    private static Map<String, C2441a> m5884f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C2441a aVar = new C2441a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.mo16272a(optJSONObject);
                }
                hashMap.put(next, aVar);
            }
            return hashMap;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: ah */
    public final int mo16190ah() {
        return this.f4961L;
    }

    /* renamed from: ai */
    public final int mo16191ai() {
        return this.f4962M;
    }

    /* renamed from: aj */
    public final int mo16192aj() {
        return this.f4963N;
    }

    /* renamed from: ak */
    public final int mo16193ak() {
        return this.f4964O;
    }

    /* renamed from: al */
    public final boolean mo16194al() {
        return this.f5041w;
    }

    /* renamed from: am */
    public final int mo16195am() {
        return this.f5042x;
    }

    /* renamed from: an */
    public final boolean mo16196an() {
        return this.f5043y;
    }

    /* renamed from: ao */
    public final int mo16197ao() {
        return this.f4976aA;
    }

    /* renamed from: ap */
    public final C2442b mo16198ap() {
        return this.f4977aB;
    }

    /* renamed from: aq */
    public final int mo16199aq() {
        return this.f5003aj;
    }

    /* renamed from: s */
    public final void mo16256s(int i) {
        this.f5003aj = i;
    }

    /* renamed from: com.mbridge.msdk.c.a$b */
    /* compiled from: Setting */
    public static class C2442b {

        /* renamed from: a */
        private String f5049a;

        /* renamed from: b */
        private String f5050b;

        /* renamed from: c */
        private String f5051c;

        /* renamed from: d */
        private JSONArray f5052d;

        /* renamed from: a */
        public static C2442b m6014a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C2442b bVar = new C2442b();
            Context g = C8388a.m23845e().mo56913g();
            bVar.f5049a = jSONObject.optString("title", g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_title", "string")));
            bVar.f5050b = jSONObject.optString("cancel", g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_close_close", "string")));
            bVar.f5051c = jSONObject.optString("submit", g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_close_submit", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.f5052d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f5052d = jSONArray;
                jSONArray.put(g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_content_stuck", "string")));
                bVar.f5052d.put(g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_content_cnr", "string")));
                bVar.f5052d.put(g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_content_balck_screen", "string")));
                bVar.f5052d.put(g.getString(C8658p.m24799a(g, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return bVar;
        }

        /* renamed from: a */
        public final String mo16276a() {
            return this.f5049a;
        }

        /* renamed from: b */
        public final String mo16277b() {
            return this.f5050b;
        }

        /* renamed from: c */
        public final String mo16278c() {
            return this.f5051c;
        }

        /* renamed from: d */
        public final JSONArray mo16279d() {
            return this.f5052d;
        }
    }

    /* renamed from: com.mbridge.msdk.c.a$a */
    /* compiled from: Setting */
    public static class C2441a {

        /* renamed from: a */
        private List<String> f5045a;

        /* renamed from: b */
        private List<String> f5046b;

        /* renamed from: c */
        private List<String> f5047c;

        /* renamed from: d */
        private List<String> f5048d;

        /* renamed from: a */
        public final List<String> mo16271a() {
            return this.f5045a;
        }

        /* renamed from: b */
        public final List<String> mo16273b() {
            return this.f5046b;
        }

        /* renamed from: c */
        public final List<String> mo16274c() {
            return this.f5047c;
        }

        /* renamed from: d */
        public final List<String> mo16275d() {
            return this.f5048d;
        }

        /* renamed from: a */
        public final void mo16272a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f5045a = C8646l.m24775a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f5046b = C8646l.m24775a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f5047c = C8646l.m24775a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f5048d = C8646l.m24775a(optJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ar */
    public final String mo16200ar() {
        return this.f4980aE;
    }

    /* renamed from: d */
    public final void mo16221d(String str) {
        this.f4980aE = str;
    }

    /* renamed from: as */
    public final String mo16201as() {
        return this.f4979aD;
    }

    /* renamed from: e */
    public final void mo16226e(String str) {
        this.f4979aD = str;
    }

    /* renamed from: at */
    public final String mo16202at() {
        return this.f4981aF;
    }

    /* renamed from: au */
    public final String mo16203au() {
        return this.f4982aG;
    }

    /* renamed from: av */
    public final int mo16204av() {
        return this.f4983aH;
    }

    /* renamed from: t */
    public final void mo16258t(int i) {
        this.f4983aH = i;
    }

    /* renamed from: aw */
    public final boolean mo16205aw() {
        return this.f4984aI;
    }

    /* renamed from: f */
    public final void mo16229f(boolean z) {
        this.f4984aI = z;
    }

    /* renamed from: ax */
    public final int mo16206ax() {
        return this.f4985aJ;
    }

    /* renamed from: u */
    public final void mo16261u(int i) {
        this.f4985aJ = i;
    }

    /* renamed from: ay */
    public final ArrayList<Integer> mo16207ay() {
        return this.f4986aK;
    }

    /* renamed from: az */
    public final HashMap<String, String> mo16208az() {
        return this.f4987aL;
    }

    /* renamed from: aA */
    public final int mo16177aA() {
        return this.f4988aM;
    }

    /* renamed from: v */
    public final void mo16263v(int i) {
        this.f4989aN = i;
    }

    /* renamed from: aB */
    public final String mo16178aB() {
        return this.f5021c;
    }

    /* renamed from: aC */
    public final int mo16179aC() {
        return this.f4990aO;
    }

    /* renamed from: w */
    public final void mo16265w(int i) {
        this.f4990aO = i;
    }

    /* renamed from: aD */
    public final int mo16180aD() {
        return this.f4991aP;
    }

    /* renamed from: x */
    public final void mo16267x(int i) {
        this.f4991aP = i;
    }

    /* renamed from: aE */
    public final int mo16181aE() {
        return this.f4993aR;
    }

    /* renamed from: y */
    public final void mo16269y(int i) {
        this.f4993aR = i;
    }

    /* renamed from: aF */
    public final String mo16182aF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", this.f5021c);
            jSONObject.put("cfc", this.f5022d);
            jSONObject.put("cfb", this.f5026h);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f5029k);
            jSONObject.put("awct", this.f5030l);
            jSONObject.put("rurl", this.f5028j);
            jSONObject.put("ujds", this.f5032n);
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, this.f5035q);
            jSONObject.put("tcto", this.f5024f);
            jSONObject.put("mv_wildcard", this.f5038t);
            jSONObject.put("is_startup_crashsystem", this.f5039u);
            jSONObject.put("sfct", this.f5007an);
            jSONObject.put("pcrn", this.f5036r);
            jSONObject.put("adct", this.f5008ao);
            jSONObject.put("atrqt", this.f5020b);
            jSONObject.put("omsdkjs_url", this.f4979aD);
            jSONObject.put("mcs", this.f4952C);
            jSONObject.put("GDPR_area", this.f4984aI);
            jSONObject.put("alrbs", this.f4983aH);
            jSONObject.put(UserDataStore.CITY, this.f4985aJ);
            jSONObject.put("isDefault", this.f4989aN);
            jSONObject.put("st_net", this.f4993aR);
            return jSONObject.toString();
        } catch (Throwable th) {
            C8672v.m24878d("Setting", th.getMessage());
            return null;
        }
    }
}
