package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.amazon.aps.shared.APSAnalytics;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2643b;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2535b;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2893e;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2901k;
import com.bytedance.sdk.component.widget.SSWebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f */
/* compiled from: DynamicJsParser */
public class C2630f implements C2637i {

    /* renamed from: e */
    private static String f5707e;

    /* renamed from: f */
    private static final Set<String> f5708f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill"})));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5709a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SSWebView f5710b;

    /* renamed from: c */
    private String f5711c;

    /* renamed from: d */
    private C2643b f5712d;

    public C2630f(Context context, String str) {
        this.f5709a = context;
        this.f5711c = str;
        SSWebView sSWebView = new SSWebView(this.f5709a);
        this.f5710b = sSWebView;
        sSWebView.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5710b.mo17834a((Object) new C2632a(), "JS_DYNAMIC_LAYOUT_OBJ");
        }
        this.f5710b.mo17835a("about:blank");
        m7036a();
    }

    /* renamed from: a */
    public static void m7038a(String str) {
        f5707e = str;
    }

    /* renamed from: a */
    private void m7036a() {
        if (!m7049i() || Build.VERSION.SDK_INT < 19) {
            m7041b();
        } else {
            m7043c();
        }
        m7041b();
    }

    /* renamed from: b */
    private void m7041b() {
        SSWebView sSWebView;
        String e = m7045e();
        if (!TextUtils.isEmpty(e) && (sSWebView = this.f5710b) != null) {
            C2901k.m8099a(sSWebView.getWebView(), e);
        }
    }

    /* renamed from: c */
    private void m7043c() {
        try {
            String f = m7046f();
            String h = m7048h();
            if (TextUtils.isEmpty(h)) {
                m7041b();
                return;
            }
            SSWebView sSWebView = this.f5710b;
            sSWebView.mo17836a(f + h, (ValueCallback<String>) null);
        } catch (Throwable unused) {
            m7041b();
        }
    }

    /* renamed from: a */
    public void mo17120a(C2643b bVar) {
        this.f5712d = bVar;
    }

    /* renamed from: a */
    public void mo17119a(C2563l lVar) {
        C2643b bVar;
        if (TextUtils.isEmpty(f5707e) && (bVar = this.f5712d) != null) {
            bVar.mo16796a((C2618h) null);
            m7047g();
        }
        C2640l.m7085b(m7040b(lVar));
        m7044d();
    }

    /* renamed from: b */
    private String m7040b(C2563l lVar) {
        return lVar == null ? "" : lVar.mo16688r();
    }

    /* renamed from: d */
    private void m7044d() {
        String str = "javascript:var res = getLayoutInfo(" + this.f5711c + ");window." + "JS_DYNAMIC_LAYOUT_OBJ" + ".calculateResult(JSON.stringify(res));";
        SSWebView sSWebView = this.f5710b;
        if (sSWebView != null) {
            C2901k.m8099a(sSWebView.getWebView(), str);
        }
    }

    /* renamed from: e */
    private static String m7045e() {
        String str;
        if (TextUtils.isEmpty(f5707e)) {
            return null;
        }
        String f = m7046f();
        if (m7049i()) {
            str = "(function () {var se = document.createElement('script');se.type = 'text/javascript';se.src = '" + ("file//" + C2535b.m6383f() + "/" + C2893e.m8077a(f5707e)) + "';document.body.appendChild(se);})();";
        } else {
            str = "(function () {var JS_TTDYNAMIC_URL = '" + f5707e + "';var xhrObj = new XMLHttpRequest();xhrObj.open('GET', JS_TTDYNAMIC_URL, false);xhrObj.send('');var se = document.createElement('script');se.type = 'text/javascript';se.text = xhrObj.responseText;document.getElementsByTagName('head')[0].appendChild(se);})();";
        }
        return "javascript:" + f + str;
    }

    /* renamed from: f */
    private static String m7046f() {
        return "var global = Function('return this')();global.jsCoreGlobal = {width:" + C2572b.m6626b(C2529a.m6339a().mo16550c().mo16558b(), (float) C2572b.m6624a(C2529a.m6339a().mo16550c().mo16558b())) + ",height:" + C2572b.m6626b(C2529a.m6339a().mo16550c().mo16558b(), (float) C2572b.m6625b(C2529a.m6339a().mo16550c().mo16558b())) + ",os:'Android'};global.systemFontSizeRatioNative = " + 1.2d + ";";
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f$a */
    /* compiled from: DynamicJsParser */
    private class C2632a {
        @JavascriptInterface
        public double systemFontSizeRatioNative() {
            return 1.2d;
        }

        private C2632a() {
        }

        @JavascriptInterface
        public String jsCoreGlobal() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", C2572b.m6626b(C2630f.this.f5709a, (float) C2572b.m6624a(C2630f.this.f5709a)));
                jSONObject.put("height", C2572b.m6626b(C2630f.this.f5709a, (float) C2572b.m6625b(C2630f.this.f5709a)));
                jSONObject.put("os", APSAnalytics.OS_NAME);
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @JavascriptInterface
        public String getDomSizeFromNative(String str, String str2, String str3, boolean z, boolean z2, int i) {
            return C2640l.m7084b(str, str2, str3, z, z2, i);
        }

        @JavascriptInterface
        public void calculateResult(String str) {
            C2630f.this.m7042b(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7042b(String str) {
        C2618h hVar = new C2618h();
        try {
            C2618h.m6958a(new JSONObject(str), hVar, (C2618h) null);
        } catch (Exception unused) {
            hVar = null;
        }
        C2643b bVar = this.f5712d;
        if (bVar != null) {
            bVar.mo16796a(hVar);
        }
        m7047g();
    }

    /* renamed from: g */
    private void m7047g() {
        C2898h.m8094b().post(new Runnable() {
            public void run() {
                if (C2630f.this.f5710b != null) {
                    C2630f.this.f5710b.mo17862l();
                }
                SSWebView unused = C2630f.this.f5710b = null;
            }
        });
    }

    /* renamed from: h */
    private String m7048h() {
        try {
            return mo17118a((InputStream) new FileInputStream(C2535b.m6383f() + "/" + C2893e.m8077a(f5707e)));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    private static boolean m7049i() {
        if (TextUtils.isEmpty(f5707e)) {
            return false;
        }
        String a = C2893e.m8077a(f5707e);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return new File(C2535b.m6383f(), a).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17118a(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "is error"
            java.lang.String r1 = "br error"
            java.lang.String r2 = "TemplateToModelParser"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            r6.<init>(r8)     // Catch:{ all -> 0x0039 }
            r5.<init>(r6)     // Catch:{ all -> 0x0039 }
        L_0x0016:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x0020
            r4.append(r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0016
        L_0x0020:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0037 }
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r1, r4)
        L_0x002c:
            if (r8 == 0) goto L_0x0036
            r8.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r0, r8)
        L_0x0036:
            return r3
        L_0x0037:
            r4 = move-exception
            goto L_0x003b
        L_0x0039:
            r4 = move-exception
            r5 = r3
        L_0x003b:
            java.lang.String r6 = "readStream error"
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r6, r4)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r1, r4)
        L_0x004a:
            if (r8 == 0) goto L_0x0054
            r8.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r0, r8)
        L_0x0054:
            return r3
        L_0x0055:
            r3 = move-exception
            if (r5 == 0) goto L_0x0060
            r5.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r1, r4)
        L_0x0060:
            if (r8 == 0) goto L_0x006a
            r8.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8106a(r2, r0, r8)
        L_0x006a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p099c.C2630f.mo17118a(java.io.InputStream):java.lang.String");
    }
}
