package com.bytedance.sdk.openadsdk.p128b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.n */
/* compiled from: LandingPageLog */
public class C3104n {

    /* renamed from: a */
    private static final int[] f7280a = {10, 30, 50, 75, 100};

    /* renamed from: b */
    private int f7281b = 0;

    /* renamed from: c */
    private long f7282c = -1;

    /* renamed from: d */
    private int f7283d = 1;

    /* renamed from: e */
    private AtomicBoolean f7284e = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicBoolean f7285f = new AtomicBoolean(false);

    /* renamed from: g */
    private int f7286g = -1;

    /* renamed from: h */
    private String f7287h;

    /* renamed from: i */
    private String f7288i;

    /* renamed from: j */
    private final Context f7289j = C3513m.m10963a();

    /* renamed from: k */
    private final C3431n f7290k;

    /* renamed from: l */
    private String f7291l = "landingpage";

    /* renamed from: m */
    private long f7292m = 0;

    /* renamed from: n */
    private long f7293n = 0;

    /* renamed from: o */
    private long f7294o = 0;

    /* renamed from: p */
    private long f7295p = 0;

    /* renamed from: q */
    private long f7296q = 0;

    /* renamed from: r */
    private long f7297r = 0;

    /* renamed from: s */
    private boolean f7298s = false;

    /* renamed from: t */
    private boolean f7299t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public AtomicInteger f7300u = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public WebView f7301v;

    /* renamed from: w */
    private boolean f7302w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f7303x = "";

    /* renamed from: y */
    private C3118u f7304y;

    /* renamed from: z */
    private boolean f7305z = false;

    /* renamed from: a */
    public C3431n mo18689a() {
        return this.f7290k;
    }

    public C3104n(Context context, C3431n nVar, WebView webView) {
        this.f7290k = nVar;
        this.f7301v = webView;
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f7301v.addJavascriptInterface(new C3107a(), "JS_LANDING_PAGE_LOG_OBJ");
            }
            if (nVar != null && nVar.mo19564aH() != null) {
                this.f7282c = nVar.mo19564aH().optLong("page_id", -1);
            }
        }
    }

    /* renamed from: a */
    public void mo18690a(long j) {
        this.f7294o = j;
    }

    /* renamed from: a */
    public void mo18698a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7291l = str;
        }
    }

    /* renamed from: b */
    public C3118u mo18699b() {
        return this.f7304y;
    }

    /* renamed from: a */
    public void mo18697a(C3118u uVar) {
        this.f7304y = uVar;
    }

    /* renamed from: a */
    public C3104n mo18688a(boolean z) {
        this.f7302w = z;
        return this;
    }

    /* renamed from: c */
    public boolean mo18700c() {
        return this.f7305z;
    }

    /* renamed from: a */
    public void mo18691a(WebView webView, int i) {
        if (webView != null) {
            C2905l.m8111b("LandingPageLog", "onWebProgress: " + i);
            if (this.f7295p == 0 && i > 0) {
                this.f7295p = System.currentTimeMillis();
            } else if (this.f7296q == 0 && i == 100) {
                this.f7296q = System.currentTimeMillis();
            }
            if (this.f7281b == f7280a.length) {
                return;
            }
            if ("landingpage".equals(this.f7291l) || "landingpage_endcard".equals(this.f7291l) || "landingpage_split_screen".equals(this.f7291l) || "landingpage_direct".equals(this.f7291l)) {
                int i2 = this.f7281b;
                while (true) {
                    int[] iArr = f7280a;
                    if (i2 < iArr.length && i >= iArr[this.f7281b]) {
                        int i3 = i2 + 1;
                        this.f7281b = i3;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", webView.getUrl());
                            if (this.f7282c != -1) {
                                jSONObject.put("page_id", this.f7282c);
                            }
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put("pct", f7280a[i2]);
                        } catch (Exception unused) {
                        }
                        m9002a("progress_load_finish", jSONObject);
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo18694a(WebView webView, String str, Bitmap bitmap) {
        C2905l.m8111b("LandingPageLog", "onWebStarted: " + String.valueOf(str));
        C3118u uVar = this.f7304y;
        if (uVar != null) {
            uVar.mo18735e();
        }
        if (this.f7284e.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (Exception unused) {
            }
            m9002a("load_start", jSONObject);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0082 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18695a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onWebFinished: "
            r0.append(r1)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "LandingPageLog"
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r0, (java.lang.String) r12)
            com.bytedance.sdk.openadsdk.b.u r12 = r10.f7304y
            if (r12 == 0) goto L_0x0021
            r12.mo18737f()
        L_0x0021:
            r12 = 1
            if (r11 == 0) goto L_0x0033
            boolean r0 = r10.f7298s
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.f7302w
            if (r0 == 0) goto L_0x0033
            r10.f7298s = r12
            java.lang.String r0 = "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});"
            com.bytedance.sdk.component.utils.C2901k.m8099a(r11, r0)
        L_0x0033:
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.f7285f
            r0 = 0
            boolean r11 = r11.compareAndSet(r0, r12)
            if (r11 != 0) goto L_0x003d
            return
        L_0x003d:
            int r11 = r10.f7283d
            r1 = 3
            r2 = 2
            if (r11 == r1) goto L_0x0045
            r10.f7283d = r2
        L_0x0045:
            long r3 = java.lang.System.currentTimeMillis()
            r10.f7292m = r3
            int r11 = r10.f7283d
            if (r11 != r2) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r12 = r0
        L_0x0051:
            java.lang.String r11 = "render_type_2"
            java.lang.String r1 = "h5"
            java.lang.String r2 = "render_type"
            java.lang.String r3 = "error_url"
            java.lang.String r4 = "error_msg"
            java.lang.String r5 = "error_code"
            if (r12 == 0) goto L_0x00cd
            long r6 = r10.f7296q
            long r8 = r10.f7295p
            long r6 = r6 - r8
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r8 = r10.f7286g     // Catch:{ Exception -> 0x0082 }
            r12.put(r5, r8)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = r10.f7287h     // Catch:{ Exception -> 0x0082 }
            r12.put(r4, r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = r10.f7288i     // Catch:{ Exception -> 0x0082 }
            r12.put(r3, r4)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r11, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            com.bytedance.sdk.openadsdk.core.i.f r11 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.core.i.c r11 = r11.mo19866k()     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r13 = r11.f8579a     // Catch:{ all -> 0x00c0 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00c0 }
            if (r13 != 0) goto L_0x00c0
            boolean r13 = r11.f8580b     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r11 = r11.f8579a     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.i.d r13 = com.bytedance.sdk.openadsdk.p174i.C3792d.m12395a()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.a r13 = r13.mo20615b()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.b.b r13 = r13.mo17684c()     // Catch:{ all -> 0x00c0 }
            r13.mo17711a((java.lang.String) r11)     // Catch:{ all -> 0x00c0 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "content-type"
            java.lang.String r1 = "application/json; charset=utf-8"
            r11.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            r13.mo17716d(r11)     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.b.n$1 r11 = new com.bytedance.sdk.openadsdk.b.n$1     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            r13.mo17708a(r11)     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = 600000(0x927c0, double:2.964394E-318)
            long r0 = java.lang.Math.min(r6, r0)
            java.lang.String r11 = "load_finish"
            r10.m9003a((java.lang.String) r11, (org.json.JSONObject) r12, (long) r0)
            goto L_0x00f0
        L_0x00cd:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r13 = r10.f7286g     // Catch:{ Exception -> 0x00eb }
            r12.put(r5, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.f7287h     // Catch:{ Exception -> 0x00eb }
            r12.put(r4, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.f7288i     // Catch:{ Exception -> 0x00eb }
            r12.put(r3, r13)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r11, r13)     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            java.lang.String r11 = "load_fail"
            r10.m9002a((java.lang.String) r11, (org.json.JSONObject) r12)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3104n.mo18695a(android.webkit.WebView, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m9004b(String str) {
        return "javascript:" + str;
    }

    /* renamed from: a */
    public void mo18692a(WebView webView, int i, String str, String str2, String str3) {
        C2905l.m8111b("LandingPageLog", "onWebError: " + i + ", " + String.valueOf(str) + ", " + String.valueOf(str2));
        C3118u uVar = this.f7304y;
        if (uVar != null) {
            uVar.mo18738g();
        }
        if (!(str3 != null && str3.startsWith("image")) && this.f7283d != 2) {
            this.f7283d = 3;
        }
        this.f7286g = i;
        this.f7287h = str;
        this.f7288i = str2;
    }

    /* renamed from: d */
    public void mo18701d() {
        C2905l.m8111b("LandingPageLog", "onResume");
        if (this.f7297r == 0) {
            this.f7297r = System.currentTimeMillis();
        }
        this.f7292m = System.currentTimeMillis();
    }

    /* renamed from: e */
    public void mo18702e() {
        C2905l.m8111b("LandingPageLog", "onStop");
        if ("landingpage".equals(this.f7291l) || "landingpage_endcard".equals(this.f7291l) || "landingpage_split_screen".equals(this.f7291l) || "landingpage_direct".equals(this.f7291l)) {
            if (!(this.f7283d == 2)) {
                return;
            }
            if (this.f7294o > 0 || !mo18700c()) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f7293n = currentTimeMillis;
                long max = currentTimeMillis - Math.max(this.f7292m, this.f7294o);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f7283d);
                    jSONObject.put("max_scroll_percent", this.f7300u.get());
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                m9003a("stay_page", jSONObject, Math.min(max, 600000));
            }
        }
    }

    /* renamed from: a */
    public void mo18696a(SSWebView sSWebView) {
        int I;
        Bitmap a;
        C3431n nVar;
        if (("landingpage".equals(this.f7291l) || "landingpage_endcard".equals(this.f7291l) || "landingpage_split_screen".equals(this.f7291l) || "landingpage_direct".equals(this.f7291l)) && (I = C3513m.m10973h().mo19832I()) != 0 && new Random().nextInt(100) + 1 <= I && sSWebView != null && sSWebView.getWebView() != null && sSWebView.getVisibility() == 0 && (a = C3904y.m12847a(sSWebView)) != null && (nVar = this.f7290k) != null) {
            C3904y.m12863a(nVar, this.f7291l, "landing_page_blank", a, sSWebView.getUrl(), this.f7282c);
        }
    }

    /* renamed from: f */
    public void mo18703f() {
        C2905l.m8111b("LandingPageLog", "onDestroy");
        this.f7301v = null;
        if (this.f7285f.compareAndSet(false, true)) {
            C3090e.m8891a(this.f7289j, this.f7290k, this.f7291l, System.currentTimeMillis() - this.f7297r);
        }
    }

    /* renamed from: a */
    public void mo18693a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || TextUtils.isEmpty(webResourceRequest.getUrl().toString())) {
        }
    }

    /* renamed from: a */
    private void m9002a(String str, JSONObject jSONObject) {
        m9003a(str, jSONObject, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:9|10|11|(1:13)(1:14)|15|(1:17)(1:18)|19|20|21|22|(3:23|24|(1:26))|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ JSONException -> 0x0052 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9003a(java.lang.String r7, org.json.JSONObject r8, long r9) {
        /*
            r6 = this;
            boolean r0 = r6.f7302w
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r6.f7290k
            if (r0 == 0) goto L_0x0090
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0011
            goto L_0x0090
        L_0x0011:
            r0 = 0
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = "is_playable"
            com.bytedance.sdk.openadsdk.core.e.n r2 = r6.f7290k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10489a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2)     // Catch:{ JSONException -> 0x0039 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r1 = "usecache"
            com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.m11391a()     // Catch:{ JSONException -> 0x0039 }
            com.bytedance.sdk.openadsdk.core.e.n r5 = r6.f7290k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = r2.mo20169a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r5)     // Catch:{ JSONException -> 0x0039 }
            if (r2 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0039 }
        L_0x0039:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r1.<init>()     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r0 = "ad_extra_data"
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x0052 }
            r1.put(r0, r8)     // Catch:{ JSONException -> 0x0052 }
            r2 = 0
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0052
            java.lang.String r8 = "duration"
            r1.put(r8, r9)     // Catch:{ JSONException -> 0x0052 }
        L_0x0052:
            r0 = r1
        L_0x0053:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sendEvent: "
            r8.append(r9)
            java.lang.String r9 = r6.f7291l
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            r8.append(r9)
            java.lang.String r9 = ", ext="
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "LandingPageLog"
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r9, (java.lang.String) r8)
            android.content.Context r8 = r6.f7289j
            com.bytedance.sdk.openadsdk.core.e.n r9 = r6.f7290k
            java.lang.String r10 = r6.f7291l
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8923c((android.content.Context) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r9, (java.lang.String) r10, (java.lang.String) r7, (org.json.JSONObject) r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3104n.m9003a(java.lang.String, org.json.JSONObject, long):void");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.n$a */
    /* compiled from: LandingPageLog */
    private class C3107a {
        private C3107a() {
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i = 100;
                } else if (intValue >= 0) {
                    i = intValue;
                }
            } catch (Throwable unused) {
            }
            C3104n.this.f7300u.set(i);
        }

        @JavascriptInterface
        public String getUrl() {
            return C3104n.this.f7303x;
        }
    }
}
