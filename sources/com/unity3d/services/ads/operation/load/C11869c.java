package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11862a;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.request.metrics.C12108a;
import com.unity3d.services.core.request.metrics.C12109b;
import com.unity3d.services.core.request.metrics.C12112c;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.webview.bridge.C12144a;
import com.unity3d.services.core.webview.bridge.C12145b;
import com.unity3d.services.core.webview.bridge.invocation.C12154b;
import com.unity3d.services.core.webview.bridge.invocation.C12155c;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.operation.load.c */
/* compiled from: LoadModule */
public class C11869c extends C11862a<C11868b, C11882h> implements C11867a {

    /* renamed from: d */
    private static C11867a f28796d;

    /* renamed from: com.unity3d.services.ads.operation.load.c$a */
    /* compiled from: LoadModule */
    class C11870a implements C12154b {

        /* renamed from: a */
        final /* synthetic */ C11882h f28797a;

        C11870a(C11882h hVar) {
            this.f28797a = hVar;
        }

        /* renamed from: a */
        public void mo70818a() {
        }

        /* renamed from: a */
        public void mo70819a(String str, C12144a aVar) {
            C11869c.this.mo70808a().mo71266a(C12109b.m33005a(C12108a.callback_error, Long.valueOf(this.f28797a.mo70812d())));
            C11869c.this.m32375a(this.f28797a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
            C11869c.this.mo70823a(this.f28797a.f28790b);
        }

        /* renamed from: b */
        public void mo70820b() {
            C11869c.this.mo70808a().mo71266a(C12109b.m33005a(C12108a.callback_timeout, Long.valueOf(this.f28797a.mo70812d())));
            C11869c.this.m32375a(this.f28797a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
            C11869c.this.mo70823a(this.f28797a.f28790b);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.c$b */
    /* compiled from: LoadModule */
    class C11871b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11882h f28799a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsLoadError f28800b;

        /* renamed from: c */
        final /* synthetic */ String f28801c;

        C11871b(C11882h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f28799a = hVar;
            this.f28800b = unityAdsLoadError;
            this.f28801c = str;
        }

        public void run() {
            this.f28799a.mo70833a(this.f28800b, this.f28801c);
        }
    }

    public C11869c(C12112c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public static C11867a m32376b() {
        if (f28796d == null) {
            f28796d = new C11876f(new C11873e(new C11869c(C12120i.m33045a()), InitializationNotificationCenter.getInstance()), new ConfigurationReader());
        }
        return f28796d;
    }

    public void onUnityAdsAdLoaded(String str) {
        C11868b bVar = (C11868b) get(str);
        if (bVar != null && bVar.mo70816b() != null) {
            C11882h b = bVar.mo70816b();
            mo70808a().mo71266a(C12109b.m33006a(Long.valueOf(b.mo70812d())));
            bVar.onUnityAdsAdLoaded(b.f28791c);
            mo70823a(str);
        }
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        C11868b bVar = (C11868b) get(str);
        if (bVar != null && bVar.mo70816b() != null) {
            C11882h b = bVar.mo70816b();
            mo70808a().mo71266a(C12109b.m33003a(unityAdsLoadError, Long.valueOf(b.mo70812d())));
            bVar.onUnityAdsFailedToLoad(b.f28791c, unityAdsLoadError, str2);
            mo70823a(str);
        }
    }

    /* renamed from: a */
    public void mo70810a(C12145b bVar, C11882h hVar) {
        if (TextUtils.isEmpty(hVar.f28791c)) {
            m32375a(hVar, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        C11879g gVar = new C11879g(hVar, new C12155c(this.f28785c, bVar, new C11870a(hVar)));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("headerBiddingOptions", hVar.f28822i.getData());
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONObject2);
            jSONObject.put("listenerId", gVar.mo70811a());
            jSONObject.put(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, hVar.f28791c);
            jSONObject.put("time", C12014b.m32733p());
            mo71344a(gVar);
            gVar.mo70809a(hVar.f28792d.getWebViewBridgeTimeout(), jSONObject);
        } catch (JSONException unused) {
            m32375a(hVar, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        } catch (NullPointerException unused2) {
            m32375a(hVar, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32375a(C11882h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, boolean z) {
        if (hVar != null && hVar.f28821h != null) {
            if (z) {
                mo70808a().mo71266a(C12109b.m33003a(unityAdsLoadError, Long.valueOf(hVar.mo70812d())));
            }
            C12080j.m32879a((Runnable) new C11871b(hVar, unityAdsLoadError, str));
        }
    }
}
