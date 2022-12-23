package com.bytedance.sdk.openadsdk.p167f.p168a;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p088a.C2491e;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.openadsdk.core.C3666w;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.e */
/* compiled from: OldBridgeSyncMethod */
public class C3740e extends C2491e<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f9670a;

    /* renamed from: b */
    private C3666w f9671b;

    public C3740e(String str, C3666w wVar) {
        this.f9671b = wVar;
        this.f9670a = str;
    }

    /* renamed from: a */
    public static void m12228a(C2512r rVar, C3666w wVar) {
        rVar.mo16525a("appInfo", (C2491e<?, ?>) new C3740e("appInfo", wVar));
        rVar.mo16525a("adInfo", (C2491e<?, ?>) new C3740e("adInfo", wVar));
        rVar.mo16525a("sendLog", (C2491e<?, ?>) new C3740e("sendLog", wVar));
        rVar.mo16525a("playable_style", (C2491e<?, ?>) new C3740e("playable_style", wVar));
        rVar.mo16525a("getTemplateInfo", (C2491e<?, ?>) new C3740e("getTemplateInfo", wVar));
        rVar.mo16525a("getTeMaiAds", (C2491e<?, ?>) new C3740e("getTeMaiAds", wVar));
        rVar.mo16525a("isViewable", (C2491e<?, ?>) new C3740e("isViewable", wVar));
        rVar.mo16525a("getScreenSize", (C2491e<?, ?>) new C3740e("getScreenSize", wVar));
        rVar.mo16525a("getCloseButtonInfo", (C2491e<?, ?>) new C3740e("getCloseButtonInfo", wVar));
        rVar.mo16525a("getVolume", (C2491e<?, ?>) new C3740e("getVolume", wVar));
        rVar.mo16525a("removeLoading", (C2491e<?, ?>) new C3740e("removeLoading", wVar));
        rVar.mo16525a("sendReward", (C2491e<?, ?>) new C3740e("sendReward", wVar));
        rVar.mo16525a("subscribe_app_ad", (C2491e<?, ?>) new C3740e("subscribe_app_ad", wVar));
        rVar.mo16525a("download_app_ad", (C2491e<?, ?>) new C3740e("download_app_ad", wVar));
        rVar.mo16525a("cancel_download_app_ad", (C2491e<?, ?>) new C3740e("cancel_download_app_ad", wVar));
        rVar.mo16525a("unsubscribe_app_ad", (C2491e<?, ?>) new C3740e("unsubscribe_app_ad", wVar));
        rVar.mo16525a("landscape_click", (C2491e<?, ?>) new C3740e("landscape_click", wVar));
        rVar.mo16525a("clickEvent", (C2491e<?, ?>) new C3740e("clickEvent", wVar));
        rVar.mo16525a("renderDidFinish", (C2491e<?, ?>) new C3740e("renderDidFinish", wVar));
        rVar.mo16525a("dynamicTrack", (C2491e<?, ?>) new C3740e("dynamicTrack", wVar));
        rVar.mo16525a("skipVideo", (C2491e<?, ?>) new C3740e("skipVideo", wVar));
        rVar.mo16525a("muteVideo", (C2491e<?, ?>) new C3740e("muteVideo", wVar));
        rVar.mo16525a("changeVideoState", (C2491e<?, ?>) new C3740e("changeVideoState", wVar));
        rVar.mo16525a("getCurrentVideoState", (C2491e<?, ?>) new C3740e("getCurrentVideoState", wVar));
        rVar.mo16525a("send_temai_product_ids", (C2491e<?, ?>) new C3740e("send_temai_product_ids", wVar));
        rVar.mo16525a("getMaterialMeta", (C2491e<?, ?>) new C3740e("getMaterialMeta", wVar));
        rVar.mo16525a("endcard_load", (C2491e<?, ?>) new C3740e("endcard_load", wVar));
        rVar.mo16525a("pauseWebView", (C2491e<?, ?>) new C3740e("pauseWebView", wVar));
        rVar.mo16525a("pauseWebViewTimers", (C2491e<?, ?>) new C3740e("pauseWebViewTimers", wVar));
        rVar.mo16525a("webview_time_track", (C2491e<?, ?>) new C3740e("webview_time_track", wVar));
        rVar.mo16525a("openPrivacy", (C2491e<?, ?>) new C3740e("openPrivacy", wVar));
        rVar.mo16525a("openAdLandPageLinks", (C2491e<?, ?>) new C3740e("openAdLandPageLinks", wVar));
        rVar.mo16525a("getNativeSiteCustomData", (C2491e<?, ?>) new C3740e("getNativeSiteCustomData", wVar));
        rVar.mo16525a("close", (C2491e<?, ?>) new C3740e("close", wVar));
    }

    /* renamed from: a */
    public JSONObject mo16486a(JSONObject jSONObject, C2492f fVar) throws Exception {
        while (true) {
            char c = '_';
            char c2 = '_';
            while (true) {
                switch (c) {
                    case '^':
                        if (c2 != '\'') {
                            break;
                        } else {
                            continue;
                        }
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                continue;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '^';
                c2 = '}';
            }
        }
        C3666w.C3676a aVar = new C3666w.C3676a();
        aVar.f9432a = NotificationCompat.CATEGORY_CALL;
        aVar.f9434c = this.f9670a;
        aVar.f9435d = jSONObject;
        return this.f9671b.mo20349a(aVar, 3);
    }
}
