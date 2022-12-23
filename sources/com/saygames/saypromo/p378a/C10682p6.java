package com.saygames.saypromo.p378a;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.p6 */
public final class C10682p6 extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C10690q6 f26311a;

    C10682p6(C10690q6 q6Var) {
        this.f26311a = q6Var;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r4, java.lang.String r5) {
        /*
            r3 = this;
            com.saygames.saypromo.a.q6 r4 = r3.f26311a
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0024 }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ all -> 0x0024 }
            java.lang.String r5 = "sp_mraid.js"
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ all -> 0x0024 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0024 }
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0024 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r4 = kotlin.p403io.TextStreamsKt.readText(r5)     // Catch:{ all -> 0x001f }
            r5.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0025
        L_0x001f:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = 0
        L_0x0025:
            if (r4 != 0) goto L_0x0028
            return
        L_0x0028:
            com.saygames.saypromo.a.q6 r5 = r3.f26311a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "javascript:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.loadUrl(r4)
            com.saygames.saypromo.a.q6 r4 = r3.f26311a
            java.lang.String r5 = "javascript:window.mraidbridge.fireReadyEvent();"
            r4.loadUrl(r5)
            com.saygames.saypromo.a.q6 r4 = r3.f26311a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "javascript:window.mraidbridge.setMaxSize("
            r5.append(r0)
            com.saygames.saypromo.a.q6 r0 = r3.f26311a
            int r0 = r0.getWidth()
            r5.append(r0)
            java.lang.String r0 = ", "
            r5.append(r0)
            com.saygames.saypromo.a.q6 r1 = r3.f26311a
            int r1 = r1.getHeight()
            r5.append(r1)
            java.lang.String r1 = ");"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.loadUrl(r5)
            com.saygames.saypromo.a.q6 r4 = r3.f26311a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "javascript:window.mraidbridge.setScreenSize("
            r5.append(r2)
            com.saygames.saypromo.a.q6 r2 = r3.f26311a
            int r2 = r2.getWidth()
            r5.append(r2)
            r5.append(r0)
            com.saygames.saypromo.a.q6 r0 = r3.f26311a
            int r0 = r0.getHeight()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.loadUrl(r5)
            com.saygames.saypromo.a.q6 r4 = r3.f26311a
            java.lang.String r5 = "javascript:window.mraidbridge.fireChangeEvent( { viewable: true, state: 'default' } );"
            r4.loadUrl(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saygames.saypromo.p378a.C10682p6.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C10690q6 q6Var = this.f26311a;
        C10690q6.m30558a(q6Var, "onReceivedError: errorCode=" + i + ", description=" + str + ", failingUrl=" + str2, (Throwable) null);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (StringsKt.startsWith$default(str, "mraid://open?", false, 2, (Object) null)) {
            this.f26311a.loadUrl("javascript:window.mraidbridge.nativeCallComplete('open');");
        }
        try {
            C10626i6 a = this.f26311a.f26318b.mo65490a(str);
            C10666n6 a2 = this.f26311a.f26319c;
            if (a2 == null) {
                return true;
            }
            ((C10541Y) a2).mo65399a(a);
            return true;
        } catch (Throwable th) {
            C10690q6.m30558a(this.f26311a, "shouldOverrideUrlLoading", th);
            return true;
        }
    }
}
