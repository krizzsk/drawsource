package com.bytedance.sdk.openadsdk.p178l;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.l.k */
/* compiled from: NetUtils */
public class C3882k {
    /* renamed from: a */
    public static void m12668a(SSWebView sSWebView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.mo17838a(str, (Map<String, String>) hashMap);
    }
}
