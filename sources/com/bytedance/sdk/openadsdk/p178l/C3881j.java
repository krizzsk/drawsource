package com.bytedance.sdk.openadsdk.p178l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3666w;

/* renamed from: com.bytedance.sdk.openadsdk.l.j */
/* compiled from: JsBridgeUtils */
public class C3881j {
    /* renamed from: a */
    public static void m12667a(Uri uri, C3666w wVar) {
        if (wVar != null && wVar.mo20352a(uri)) {
            try {
                wVar.mo20358b(uri);
            } catch (Exception e) {
                C2905l.m8117d("WebView", "TTAndroidObj handleUri exception: " + e);
            }
        }
    }

    /* renamed from: a */
    public static String m12666a(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news" + " open_news_u_s/" + i;
    }
}
