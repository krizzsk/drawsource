package com.unity3d.services.ads.operation.show;

import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.C11862a;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12084a;
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

/* renamed from: com.unity3d.services.ads.operation.show.c */
/* compiled from: ShowModule */
public class C11885c extends C11862a<C11884b, C11897g> implements C11883a {

    /* renamed from: d */
    private static C11883a f28823d = null;

    /* renamed from: e */
    public static String f28824e = "[UnityAds] Placement ID cannot be null";

    /* renamed from: com.unity3d.services.ads.operation.show.c$a */
    /* compiled from: ShowModule */
    class C11886a implements C12154b {

        /* renamed from: a */
        final /* synthetic */ C11897g f28825a;

        C11886a(C11897g gVar) {
            this.f28825a = gVar;
        }

        /* renamed from: a */
        public void mo70818a() {
        }

        /* renamed from: a */
        public void mo70819a(String str, C12144a aVar) {
            C11885c.this.mo70808a().mo71266a(C12109b.m33009b(C12108a.callback_error, Long.valueOf(this.f28825a.mo70812d())));
            C11885c.this.m32404a(this.f28825a, str, UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            C11885c.this.mo70823a(this.f28825a.f28790b);
        }

        /* renamed from: b */
        public void mo70820b() {
            C11885c.this.mo70808a().mo71266a(C12109b.m33009b(C12108a.callback_timeout, Long.valueOf(this.f28825a.mo70812d())));
            C11885c.this.m32404a(this.f28825a, "[UnityAds] Show Invocation Timeout", UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            C11885c.this.mo70823a(this.f28825a.f28790b);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.c$b */
    /* compiled from: ShowModule */
    class C11887b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11897g f28827a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsShowError f28828b;

        /* renamed from: c */
        final /* synthetic */ String f28829c;

        C11887b(C11897g gVar, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.f28827a = gVar;
            this.f28828b = unityAdsShowError;
            this.f28829c = str;
        }

        public void run() {
            this.f28827a.mo70851a(this.f28828b, this.f28829c);
        }
    }

    public C11885c(C12112c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public static C11883a m32405b() {
        if (f28823d == null) {
            f28823d = new C11889e(new C11885c(C12120i.m33045a()), new ConfigurationReader());
        }
        return f28823d;
    }

    public void onUnityAdsShowClick(String str) {
        C11884b bVar = (C11884b) get(str);
        if (bVar != null && bVar.mo70840c() != null) {
            bVar.onUnityAdsShowClick(bVar.mo70840c().f28791c);
        }
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        C11884b bVar = (C11884b) get(str);
        if (bVar != null && bVar.mo70840c() != null) {
            C11897g c = bVar.mo70840c();
            mo70808a().mo71266a(C12109b.m33010b(Long.valueOf(c.mo70812d())));
            bVar.onUnityAdsShowComplete(c.f28791c, unityAdsShowCompletionState);
            mo70823a(str);
        }
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        C11884b bVar = (C11884b) get(str);
        if (bVar != null && bVar.mo70840c() != null) {
            C11897g c = bVar.mo70840c();
            mo70808a().mo71266a(C12109b.m33004a(unityAdsShowError, Long.valueOf(c.mo70812d())));
            bVar.onUnityAdsShowFailure(c.f28791c, unityAdsShowError, str2);
            mo70823a(str);
        }
    }

    public void onUnityAdsShowStart(String str) {
        C11884b bVar = (C11884b) get(str);
        if (bVar != null && bVar.mo70840c() != null) {
            bVar.onUnityAdsShowStart(bVar.mo70840c().f28791c);
        }
    }

    /* renamed from: a */
    public void mo70810a(C12145b bVar, C11897g gVar) {
        if (TextUtils.isEmpty(gVar.f28791c)) {
            m32404a(gVar, f28824e, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        C11892f fVar = new C11892f(gVar, new C12155c(this.f28785c, bVar, new C11886a(gVar)));
        C12084a.m32901a(gVar.f28847h);
        Display defaultDisplay = ((WindowManager) gVar.f28847h.getSystemService("window")).getDefaultDisplay();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("requestedOrientation", gVar.f28847h.getRequestedOrientation());
            jSONObject3.put("rotation", defaultDisplay.getRotation());
            if (Build.VERSION.SDK_INT >= 13) {
                Point point = new Point();
                defaultDisplay.getSize(point);
                jSONObject3.put("width", point.x);
                jSONObject3.put("height", point.y);
            } else {
                jSONObject3.put("width", defaultDisplay.getWidth());
                jSONObject3.put("height", defaultDisplay.getHeight());
            }
            jSONObject2.put("display", jSONObject3);
            jSONObject2.put("headerBiddingOptions", gVar.f28849j.getData());
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONObject2);
            jSONObject.put("listenerId", fVar.mo70811a());
            jSONObject.put(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, gVar.f28791c);
            jSONObject.put("time", C12014b.m32733p());
            mo71344a(fVar);
            fVar.mo70809a(gVar.f28792d.getWebViewBridgeTimeout(), jSONObject);
        } catch (JSONException unused) {
            m32404a(gVar, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        } catch (NullPointerException unused2) {
            m32404a(gVar, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        }
    }

    /* renamed from: b */
    public void mo70835b(String str) {
        C11884b bVar = (C11884b) get(str);
        if (bVar == null || bVar.mo70840c() == null) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32404a(C11897g gVar, String str, UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        if (gVar != null && gVar.f28848i != null) {
            if (z) {
                mo70808a().mo71266a(C12109b.m33004a(unityAdsShowError, Long.valueOf(gVar.mo70812d())));
            }
            C12080j.m32879a((Runnable) new C11887b(gVar, unityAdsShowError, str));
        }
    }
}
