package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import com.inmobi.media.C5922dh;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6372c;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.C6398k;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p199d.C6356a;
import com.ironsource.sdk.controller.C8142f;
import com.ironsource.sdk.controller.C8171k;
import com.ironsource.sdk.controller.C8173l;
import com.ironsource.sdk.controller.C8192r;
import com.ironsource.sdk.controller.C8199v;
import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8101b;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p280c.C8116a;
import com.ironsource.sdk.p280c.C8123d;
import com.ironsource.sdk.p280c.C8125e;
import com.ironsource.sdk.p284f.C8286a;
import com.ironsource.sdk.p285g.C8289a;
import com.ironsource.sdk.p285g.C8290b;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p285g.C8299e;
import com.ironsource.sdk.p285g.C8300f;
import com.ironsource.sdk.p286h.C8301a;
import com.ironsource.sdk.p286h.C8302b;
import com.ironsource.sdk.p286h.C8305c;
import com.ironsource.sdk.p288j.C8318e;
import com.ironsource.sdk.p288j.C8320g;
import com.ironsource.sdk.p288j.p289a.C8311a;
import com.ironsource.sdk.p288j.p289a.C8312b;
import com.ironsource.sdk.p288j.p289a.C8313c;
import com.ironsource.sdk.p288j.p289a.C8314d;
import com.ironsource.sdk.p290k.C8322b;
import com.ironsource.sdk.p290k.C8326c;
import com.ironsource.sdk.service.C8335a;
import com.ironsource.sdk.service.C8337c;
import com.ironsource.sdk.service.Connectivity.C8330b;
import com.ironsource.sdk.utils.C8341a;
import com.ironsource.sdk.utils.C8342b;
import com.ironsource.sdk.utils.C8345d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.api.VideoType;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.ReportDBAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.x */
public class C8202x extends WebView implements DownloadListener, C8175m, C8326c {
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public static String f19942ab = "success";
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public static String f19943ac = "fail";

    /* renamed from: b */
    public static String f19944b = "is_store";

    /* renamed from: c */
    public static String f19945c = "external_url";

    /* renamed from: d */
    public static String f19946d = "secondary_web_view";

    /* renamed from: y */
    private static int f19947y;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f19948A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f19949B;

    /* renamed from: C */
    private Map<String, String> f19950C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C8322b f19951D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f19952E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f19953F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public CountDownTimer f19954G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f19955H = 50;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f19956I = 50;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f19957J = C5922dh.DEFAULT_POSITION;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public FrameLayout f19958K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public WebChromeClient.CustomViewCallback f19959L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C8314d f19960M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C8313c f19961N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C8318e f19962O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C8312b f19963P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Boolean f19964Q = null;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f19965R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C8142f f19966S;

    /* renamed from: T */
    private Object f19967T = new Object();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f19968U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C8170j f19969V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C8141e f19970W;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public String f19971a = C8202x.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C8330b f19972aa;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public C8223b f19973e;

    /* renamed from: f */
    public CountDownTimer f19974f;

    /* renamed from: g */
    C8222a f19975g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public View f19976h;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public FrameLayout f19977i;
    /* access modifiers changed from: package-private */

    /* renamed from: j */
    public C8258g f19978j;

    /* renamed from: k */
    String f19979k;
    /* access modifiers changed from: package-private */

    /* renamed from: l */
    public C8201w f19980l;
    /* access modifiers changed from: package-private */

    /* renamed from: m */
    public C8290b f19981m;
    /* access modifiers changed from: package-private */

    /* renamed from: n */
    public C8190q f19982n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C8192r f19983o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public C8199v f19984p;
    /* access modifiers changed from: package-private */

    /* renamed from: q */
    public C8171k f19985q;
    /* access modifiers changed from: package-private */

    /* renamed from: r */
    public C8135a f19986r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C8173l f19987s;

    /* renamed from: t */
    C8262y f19988t;

    /* renamed from: u */
    C8139c f19989u;
    /* access modifiers changed from: package-private */

    /* renamed from: v */
    public C8320g f19990v;

    /* renamed from: w */
    private final C6385a f19991w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f19992x = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: z */
    private final String f19993z = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: com.ironsource.sdk.controller.x$a */
    class C8222a extends WebChromeClient {
        private C8222a() {
        }

        /* synthetic */ C8222a(C8202x xVar, byte b) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C8202x.this.f19989u.mo56396a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m23749i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new C8224c(C8202x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m23749i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.m23749i("Test", "onHideCustomView");
            if (C8202x.this.f19976h != null) {
                C8202x.this.f19976h.setVisibility(8);
                C8202x.this.f19958K.removeView(C8202x.this.f19976h);
                View unused = C8202x.this.f19976h = null;
                C8202x.this.f19958K.setVisibility(8);
                C8202x.this.f19959L.onCustomViewHidden();
                C8202x.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m23749i("Test", "onShowCustomView");
            C8202x.this.setVisibility(8);
            if (C8202x.this.f19976h != null) {
                Logger.m23749i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m23749i("Test", "mCustomView == null");
            C8202x.this.f19958K.addView(view);
            View unused = C8202x.this.f19976h = view;
            WebChromeClient.CustomViewCallback unused2 = C8202x.this.f19959L = customViewCallback;
            C8202x.this.f19958K.setVisibility(0);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$b */
    static class C8223b {

        /* renamed from: a */
        C8293d.C8298e f20029a;

        /* renamed from: b */
        String f20030b;

        public C8223b(C8293d.C8298e eVar, String str) {
            this.f20029a = eVar;
            this.f20030b = str;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$c */
    class C8224c extends WebViewClient {
        private C8224c() {
        }

        /* synthetic */ C8224c(C8202x xVar, byte b) {
            this();
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C8202x.this.f19971a;
            Logger.m23747e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = C8202x.this.f19989u.mo56396a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(C8202x.f19945c, str);
            intent.putExtra(C8202x.f19946d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$d */
    public class C8225d {

        /* renamed from: com.ironsource.sdk.controller.x$d$a */
        public class C8255a {
            public C8255a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo56641a(boolean z, String str, C8300f fVar) {
                fVar.mo56741a(z ? C8202x.f19942ab : C8202x.f19943ac, str);
                C8202x.m23417a(C8202x.this, fVar.toString(), z, (String) null, (String) null);
            }

            /* renamed from: a */
            public final void mo56642a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = C8202x.f19942ab;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                } else {
                    str2 = C8202x.f19943ac;
                }
                jSONObject.put(str2, str);
                C8202x.m23417a(C8202x.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        public C8225d() {
        }

        /* renamed from: a */
        private void m23526a(String str, boolean z) {
            C8292c a = C8202x.this.f19969V.mo56461a(C8293d.C8298e.Interstitial, str);
            if (a != null) {
                a.f20222f = z;
            }
        }

        /* renamed from: a */
        private void m23527a(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.mo56373a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.mo56373a()));
                }
            } catch (Exception e) {
                C8104d.m23161a(C8106f.f19634m, (Map<String, Object>) new C8100a().mo56293a("callfailreason", e.getMessage()).f19613a);
                Logger.m23745d(C8202x.this.f19971a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: a */
        private void m23528a(JSONObject jSONObject, String str) {
            if (m23529a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.m23745d(C8202x.this.f19971a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: a */
        private static boolean m23529a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        private void m23530b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C8202x.this.f19966S.mo56410f());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "adClicked(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                final C8293d.C8298e e = C8202x.m23451h(d);
                final C8311a a = C8202x.this.m23426b(e);
                if (e != null && a != null) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            a.mo56682b(e, fetchDemandSourceId);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            final String str2;
            final boolean z;
            final boolean z2;
            C8292c a;
            Log.d(C8202x.this.f19992x, "adCredited(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("credits");
            boolean z3 = false;
            final int parseInt = d != null ? Integer.parseInt(d) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d2 = fVar.mo56746d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(C8202x.this.f19992x, "adCredited | product type is missing");
            }
            if (!C8293d.C8298e.Interstitial.toString().equalsIgnoreCase(d2)) {
                String d3 = fVar.mo56746d("total");
                final int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
                if (!C8293d.C8298e.OfferWall.toString().equalsIgnoreCase(d2)) {
                    z2 = false;
                    z = false;
                    str2 = null;
                } else if (fVar.mo56744b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.mo56744b("timestamp") || fVar.mo56744b("totalCreditsFlag")) {
                    C8202x.m23417a(C8202x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.mo56746d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d3 + C8202x.this.f19948A + C8202x.this.f19949B))) {
                        z3 = true;
                    } else {
                        C8202x.m23417a(C8202x.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e = fVar.mo56747e("totalCreditsFlag");
                    str2 = fVar.mo56746d("timestamp");
                    z = e;
                    z2 = z3;
                }
                if (C8202x.this.mo56504a(d2)) {
                    final String str3 = str;
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            if (d2.equalsIgnoreCase(C8293d.C8298e.RewardedVideo.toString())) {
                                C8202x.this.f19960M.mo56669a(fetchDemandSourceId, parseInt);
                            } else if (d2.equalsIgnoreCase(C8293d.C8298e.OfferWall.toString()) && z2 && C8202x.this.f19962O.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str2)) {
                                if (C8342b.m23758a().mo56793a(str2, C8202x.this.f19948A, C8202x.this.f19949B)) {
                                    C8202x.m23417a(C8202x.this, str3, true, (String) null, (String) null);
                                } else {
                                    C8202x.m23417a(C8202x.this, str3, false, "Time Stamp could not be stored", (String) null);
                                }
                            }
                        }
                    });
                }
            } else if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString()) && (a = C8202x.this.f19969V.mo56461a(C8293d.C8298e.Interstitial, fetchDemandSourceId)) != null) {
                if (a.f20220d != null && a.f20220d.containsKey(VideoType.REWARDED)) {
                    z3 = Boolean.parseBoolean(a.f20220d.get(VideoType.REWARDED));
                }
                if (z3) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            C8202x.this.f19961N.mo56684b(fetchDemandSourceId, parseInt);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8300f(str));
            final C8289a aVar = new C8289a(str);
            if (!aVar.f20198c) {
                C8202x.m23417a(C8202x.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            String str2 = aVar.f20196a;
            if (C8293d.C8298e.RewardedVideo.toString().equalsIgnoreCase(str2) && C8202x.this.mo56504a(str2)) {
                final int parseInt = Integer.parseInt(aVar.f20197b);
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        if (parseInt > 0) {
                            Log.d(C8202x.this.f19971a, "onRVInitSuccess()");
                            C8202x.this.f19960M.mo56665a(C8293d.C8298e.RewardedVideo, fetchDemandSourceId, aVar);
                            return;
                        }
                        C8202x.this.f19960M.mo56683b(fetchDemandSourceId);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "adViewAPI(" + str + ")");
                C8202x.this.f19986r.mo56392a(new C8300f(str).toString(), new C8255a());
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C8202x.this.f19971a;
                Logger.m23749i(b2, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m23747e(C8202x.this.f19971a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C8293d.C8298e e;
            Map<String, C8292c> a;
            C8292c remove;
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "cleanAdInstance(" + str + ")");
                C8300f fVar = new C8300f(str);
                String d = fVar.mo56746d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (e = C8202x.m23451h(d)) != null) {
                    C8170j y = C8202x.this.f19969V;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (a = y.mo56463a(e)) != null && (remove = a.remove(fetchDemandSourceId)) != null) {
                        remove.f20223g = null;
                        if (remove.f20220d != null) {
                            remove.f20220d.clear();
                        }
                        remove.f20220d = null;
                    }
                }
            } catch (Exception e2) {
                C8202x.m23417a(C8202x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                C8342b a = C8342b.m23758a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a.f20330a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a.f20330a.edit();
                for (String str2 : strArr) {
                    if (C8342b.m23760b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                C8300f fVar = new C8300f(str);
                if (!arrayList.isEmpty()) {
                    fVar.mo56741a("removedAdsLastUpdateTime", arrayList.toString());
                }
                C8202x.m23417a(C8202x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                C8202x.m23417a(C8202x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "deleteFile(" + str + ")");
                C8300f fVar = new C8300f(str);
                String d = fVar.mo56746d(ShareInternalUtility.STAGING_PARAM);
                String d2 = fVar.mo56746d("path");
                if (d2 != null) {
                    if (!TextUtils.isEmpty(d)) {
                        C8305c cVar = new C8305c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8202x.this.f19965R, d2), d);
                        if (!cVar.exists()) {
                            C8202x.m23417a(C8202x.this, str, false, "File not exist", "1");
                            return;
                        }
                        C8202x.m23417a(C8202x.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                C8202x.m23417a(C8202x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e) {
                C8202x.m23417a(C8202x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "deleteFolder(" + str + ")");
                String d = new C8300f(str).mo56746d("path");
                if (d == null) {
                    C8202x.m23417a(C8202x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C8305c cVar = new C8305c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8202x.this.f19965R, d));
                if (!cVar.exists()) {
                    C8202x.m23417a(C8202x.this, str, false, "Folder not exist", "1");
                    return;
                }
                C8202x.m23417a(C8202x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                C8202x.m23417a(C8202x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "deviceDataAPI(" + str + ")");
                C8300f fVar = new C8300f(str);
                C8171k I = C8202x.this.f19985q;
                String fVar2 = fVar.toString();
                C8255a aVar = new C8255a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C8171k.C8172a aVar2 = new C8171k.C8172a((byte) 0);
                aVar2.f19859a = jSONObject.optString("deviceDataFunction");
                aVar2.f19860b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f19861c = jSONObject.optString("success");
                aVar2.f19862d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f19859a)) {
                    String str2 = aVar2.f19861c;
                    C8300f fVar3 = new C8300f();
                    fVar3.mo56741a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(C6393h.m19107d())));
                    fVar3.mo56741a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C6393h.m19106d(I.f19858a))));
                    fVar3.mo56741a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(C6393h.m19110e(I.f19858a))));
                    fVar3.mo56741a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(C6393h.m19112f(I.f19858a))));
                    fVar3.mo56741a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(C6393h.m19114g(I.f19858a))));
                    fVar3.mo56741a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(C6393h.m19116h(I.f19858a))));
                    aVar.mo56641a(true, str2, fVar3);
                    return;
                }
                String str3 = C8171k.f19857b;
                Logger.m23749i(str3, "unhandled API request " + fVar2);
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C8202x.this.f19971a;
                Logger.m23749i(b2, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            Logger.m23749i(C8202x.this.f19971a, "displayWebView(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8300f fVar = new C8300f(str);
            boolean booleanValue = ((Boolean) fVar.mo56745c("display")).booleanValue();
            String d = fVar.mo56746d("productType");
            boolean e = fVar.mo56747e("standaloneView");
            String d2 = fVar.mo56746d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.mo56747e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = C8202x.this.f19968U = fVar.mo56747e("immersive");
                boolean e3 = fVar.mo56747e("activityThemeTranslucent");
                if (C8202x.this.f19978j != C8258g.Display) {
                    C8202x.this.f19978j = C8258g.Display;
                    Logger.m23749i(C8202x.this.f19971a, "State: " + C8202x.this.f19978j);
                    Activity a = C8202x.this.f19989u.mo56396a();
                    String str2 = C8202x.this.f19979k;
                    int k = C6393h.m19122k(a);
                    if (e) {
                        C8167i iVar = new C8167i(a);
                        iVar.addView(C8202x.this.f19977i);
                        iVar.f19851b = C8202x.this;
                        iVar.f19851b.f19990v = iVar;
                        iVar.f19851b.requestFocus();
                        iVar.f19850a = iVar.f19851b.f19989u.mo56396a();
                        if (((((Activity) iVar.f19850a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.mo56455a()) <= 0) {
                            i = 0;
                        }
                        int b = iVar.mo56456b();
                        try {
                            if (iVar.f19850a != null) {
                                int o = C6393h.m19130o(iVar.f19850a);
                                if (o == 1) {
                                    iVar.setPadding(0, i, 0, b);
                                } else if (o == 2) {
                                    iVar.setPadding(0, i, b, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f19850a).runOnUiThread(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.controller.i.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.i.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        return;
                    }
                    Intent intent = e3 ? new Intent(a, InterstitialActivity.class) : new Intent(a, ControllerActivity.class);
                    if (C8293d.C8298e.RewardedVideo.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C6393h.m19126m(a));
                        }
                        intent.putExtra("productType", C8293d.C8298e.RewardedVideo.toString());
                        C8202x.this.f19981m.f20206e = C8293d.C8298e.RewardedVideo.ordinal();
                        C8202x.this.f19981m.f20204c = fetchDemandSourceId;
                        if (C8202x.this.mo56504a(C8293d.C8298e.RewardedVideo.toString())) {
                            C8202x.this.f19960M.mo56688c(C8293d.C8298e.RewardedVideo, fetchDemandSourceId);
                        }
                    } else if (C8293d.C8298e.OfferWall.toString().equalsIgnoreCase(d)) {
                        intent.putExtra("productType", C8293d.C8298e.OfferWall.toString());
                        C8202x.this.f19981m.f20206e = C8293d.C8298e.OfferWall.ordinal();
                    } else if (C8293d.C8298e.Interstitial.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C6393h.m19126m(a));
                        }
                        intent.putExtra("productType", C8293d.C8298e.Interstitial.toString());
                    }
                    if (d2 != null) {
                        intent.putExtra("adViewId", d2);
                    }
                    intent.putExtra("ctrWVPauseResume", e2);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", C8202x.this.f19968U);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", k);
                    C8223b unused3 = C8202x.this.f19973e = new C8223b(C8202x.m23451h(d), fetchDemandSourceId);
                    a.startActivity(intent);
                    return;
                }
                Logger.m23749i(C8202x.this.f19971a, "State: " + C8202x.this.f19978j);
                return;
            }
            C8202x.this.f19978j = C8258g.Gone;
            C8202x.this.mo56512j();
        }

        @JavascriptInterface
        public void fileSystemAPI(final String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "fileSystemAPI(" + str + ")");
            C8202x.this.mo56505b((Runnable) new Runnable() {
                public final void run() {
                    JSONObject a;
                    try {
                        C8173l r = C8202x.this.f19987s;
                        JSONObject jSONObject = new JSONObject(str);
                        C8255a aVar = new C8255a();
                        C8176n nVar = new C8176n(jSONObject);
                        C8177o oVar = new C8177o(aVar);
                        try {
                            String str = nVar.f19868a;
                            JSONObject jSONObject2 = nVar.f19869b;
                            char c = 65535;
                            boolean z = false;
                            switch (str.hashCode()) {
                                case -2073025383:
                                    if (str.equals("saveFile")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1137024519:
                                    if (str.equals("deleteFolder")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -318115535:
                                    if (str.equals("getTotalSizeOfFiles")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 537556755:
                                    if (str.equals("updateAttributesOfFile")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 1764172231:
                                    if (str.equals("deleteFile")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1953259713:
                                    if (str.equals("getFiles")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    C8305c a2 = C8173l.m23321a(jSONObject2, r.f19863a);
                                    C8302b bVar = r.f19864b;
                                    if (a2.exists()) {
                                        if (a2.delete()) {
                                            bVar.f20264d.mo56753a(a2.getName());
                                        } else {
                                            throw new Exception("Failed to delete file");
                                        }
                                    }
                                    a = C8173l.m23324a(nVar, a2.mo56750a());
                                } else if (c == 2) {
                                    C8305c b = C8173l.m23325b(jSONObject2, r.f19863a);
                                    C8302b bVar2 = r.f19864b;
                                    if (b.exists()) {
                                        ArrayList<C8305c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b);
                                        if (IronSourceStorageUtils.deleteFolderContentRecursive(b) && b.delete()) {
                                            z = true;
                                        }
                                        if (z) {
                                            bVar2.f20264d.mo56755a(filesInFolderRecursive);
                                        } else {
                                            throw new Exception("Failed to delete folder");
                                        }
                                    }
                                    a = C8173l.m23324a(nVar, b.mo56750a());
                                } else if (c == 3) {
                                    C8305c b2 = C8173l.m23325b(jSONObject2, r.f19863a);
                                    C8302b bVar3 = r.f19864b;
                                    if (b2.exists()) {
                                        a = C8173l.m23324a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b2, bVar3.f20264d.mo56752a()));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 4) {
                                    C8305c b3 = C8173l.m23325b(jSONObject2, r.f19863a);
                                    if (b3.exists()) {
                                        a = C8173l.m23322a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b3));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 5) {
                                    C8305c a3 = C8173l.m23321a(jSONObject2, r.f19863a);
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                                    C8302b bVar4 = r.f19864b;
                                    if (optJSONObject == null) {
                                        throw new Exception("Missing attributes to update");
                                    } else if (!a3.exists()) {
                                        throw new Exception("File does not exist");
                                    } else if (bVar4.f20264d.mo56756b(a3.getName(), optJSONObject)) {
                                        oVar.mo56469a(nVar, C8173l.m23324a(nVar, a3.mo56750a()));
                                        return;
                                    } else {
                                        throw new Exception("Failed to update attribute");
                                    }
                                } else {
                                    return;
                                }
                                oVar.mo56469a(nVar, a);
                                return;
                            }
                            C8305c a4 = C8173l.m23321a(jSONObject2, r.f19863a);
                            String optString = jSONObject2.optString("fileUrl");
                            C8173l.C81741 r5 = new C8326c(oVar, nVar) {

                                /* renamed from: a */
                                private /* synthetic */ C8177o f19865a;

                                /* renamed from: b */
                                private /* synthetic */ C8176n f19866b;

                                /* renamed from: a */
                                public final void mo56466a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/

                                /* renamed from: a */
                                public final void mo56467a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            };
                            C8302b bVar5 = r.f19864b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            } else if (C6393h.m19096a(bVar5.f20262b.f20274b) <= 0) {
                                throw new Exception("no_disk_space");
                            } else if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            } else if (C6363a.C63641.m19012b(bVar5.f20261a)) {
                                C8301a aVar2 = bVar5.f20263c;
                                String path = a4.getPath();
                                C8302b.C83031 r8 = new C8326c(r5) {

                                    /* renamed from: a */
                                    private /* synthetic */ C8326c f20265a;

                                    /* renamed from: a */
                                    public final void mo56466a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/

                                    /* renamed from: a */
                                    public final void mo56467a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/
                                };
                                if (path != null) {
                                    aVar2.f20260a.put(path, r8);
                                }
                                if (a4.exists()) {
                                    Message message = new Message();
                                    message.obj = a4;
                                    message.what = 1015;
                                    bVar5.f20263c.sendMessage(message);
                                    return;
                                }
                                bVar5.f20262b.mo56761a(a4, optString, bVar5.f20263c);
                            } else {
                                throw new Exception("no_network_connection");
                            }
                        } catch (Exception e) {
                            oVar.mo56470b(nVar, C8173l.m23323a(nVar, e.getMessage()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Logger.m23749i(C8202x.this.f19971a, "fileSystemAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r0 = r0.f19971a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r0 = new com.ironsource.sdk.p285g.C8300f(r5).mo56746d(com.ironsource.sdk.controller.C8202x.f19942ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r1 = new com.ironsource.sdk.p285g.C8300f(r5).mo56746d(com.ironsource.sdk.controller.C8202x.f19943ac)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.mo56746d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p285g.C8300f) r2)
                com.ironsource.sdk.controller.x r3 = com.ironsource.sdk.controller.C8202x.this
                java.lang.Object[] r5 = r3.m23440c((java.lang.String) r5, (java.lang.String) r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C8202x.m23412a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                r0.mo56506b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8202x.C8225d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            C8202x xVar;
            String str2;
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "getCachedFilesMap(" + str + ")");
            String b2 = new C8300f(str).mo56746d(C8202x.f19942ab);
            if (!TextUtils.isEmpty(b2)) {
                C8300f fVar = new C8300f(str);
                if (!fVar.mo56743a("path")) {
                    xVar = C8202x.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.mo56745c("path");
                    if (!IronSourceStorageUtils.isPathExist(C8202x.this.f19965R, str3)) {
                        xVar = C8202x.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        C8202x.this.mo56506b(C8202x.m23412a(b2, IronSourceStorageUtils.getCachedFilesMap(C8202x.this.f19965R, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                C8202x.m23417a(xVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "getConnectivityInfo(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d(C8202x.f19942ab);
            String d2 = fVar.mo56746d(C8202x.f19943ac);
            JSONObject jSONObject = new JSONObject();
            if (C8202x.this.f19972aa != null) {
                C8330b m = C8202x.this.f19972aa;
                jSONObject = m.f20294a.mo56770c(C8202x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = C8202x.m23429b(d, jSONObject.toString());
            } else {
                str2 = C8202x.m23429b(d2, C8202x.m23413a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            C8202x.this.mo56506b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "getControllerConfig(" + str + ")");
            String d = new C8300f(str).mo56746d(C8202x.f19942ab);
            if (!TextUtils.isEmpty(d)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                m23527a(controllerConfigAsJSONObject);
                m23528a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                m23530b(controllerConfigAsJSONObject);
                C8202x.this.mo56506b(C8202x.m23429b(d, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r0 = r0.f19971a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.mo56746d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p285g.C8300f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.mo56746d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.x r7 = com.ironsource.sdk.controller.C8202x.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.f19969V     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.mo56461a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f20219c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = r5
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p285g.C8300f(r9).mo56746d(com.ironsource.sdk.controller.C8202x.f19942ab)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f20219c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p285g.C8300f(r9).mo56746d(com.ironsource.sdk.controller.C8202x.f19943ac)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.C8202x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.C8202x.m23429b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8202x.this     // Catch:{ Exception -> 0x008c }
                r1.mo56506b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.C8202x.m23417a((com.ironsource.sdk.controller.C8202x) r1, (java.lang.String) r9, (boolean) r5, (java.lang.String) r2, (java.lang.String) r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8202x.C8225d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r0 = r0.f19971a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r0 = new com.ironsource.sdk.p285g.C8300f(r5).mo56746d(com.ironsource.sdk.controller.C8202x.f19942ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r5 = new com.ironsource.sdk.p285g.C8300f(r5).mo56746d(com.ironsource.sdk.controller.C8202x.f19943ac)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C8202x.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.m23439c((android.content.Context) r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C8202x.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C8202x.m23412a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C8202x.this
                r0.mo56506b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8202x.C8225d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "getDeviceVolume(" + str + ")");
            try {
                C8341a.m23755a(C8202x.this.f19989u.mo56396a());
                float b2 = C8341a.m23757b(C8202x.this.f19989u.mo56396a());
                C8300f fVar = new C8300f(str);
                fVar.mo56741a("deviceVolume", String.valueOf(b2));
                C8202x.m23417a(C8202x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a = C8202x.this.f19989u.mo56396a();
            if (a != null) {
                String b = new C8300f(str).mo56746d(C8202x.f19942ab);
                String jSONObject = SDKUtils.getOrientation(a).toString();
                if (!TextUtils.isEmpty(b)) {
                    C8202x.this.mo56506b(C8202x.m23412a(b, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "getUserData(" + str2 + ")");
            C8300f fVar = new C8300f(str2);
            if (!fVar.mo56743a(SDKConstants.PARAM_KEY)) {
                C8202x.m23417a(C8202x.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String b2 = new C8300f(str2).mo56746d(C8202x.f19942ab);
            String d = fVar.mo56746d(SDKConstants.PARAM_KEY);
            String string = C8342b.m23758a().f20330a.getString(d, (String) null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            C8202x.this.mo56506b(C8202x.m23429b(b2, C8202x.m23413a(d, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "iabTokenAPI(" + str + ")");
                C8300f fVar = new C8300f(str);
                C8199v q = C8202x.this.f19984p;
                String fVar2 = fVar.toString();
                C8255a aVar = new C8255a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C8199v.C8200a aVar2 = new C8199v.C8200a((byte) 0);
                aVar2.f19938a = jSONObject.optString("functionName");
                aVar2.f19939b = jSONObject.optJSONObject("functionParams");
                aVar2.f19940c = jSONObject.optString("success");
                aVar2.f19941d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f19938a)) {
                    JSONObject jSONObject2 = aVar2.f19939b;
                    C8300f fVar3 = new C8300f();
                    try {
                        C8337c cVar = q.f19934c;
                        C6538a.m19817a("ctgp", jSONObject2);
                        q.f19933b.mo56784a(jSONObject2);
                        aVar.mo56641a(true, aVar2.f19940c, fVar3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str2 = C8199v.f19932a;
                        Logger.m23749i(str2, "updateToken exception " + e.getMessage());
                        aVar.mo56641a(false, aVar2.f19941d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f19938a)) {
                    try {
                        aVar.mo56642a(true, aVar2.f19940c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? q.mo56496a() : q.f19933b.mo56785b(q.f19935d));
                    } catch (Exception e2) {
                        String str3 = aVar2.f19941d;
                        String message = e2.getMessage();
                        C8300f fVar4 = new C8300f();
                        fVar4.mo56741a(C8202x.f19943ac, str3);
                        fVar4.mo56741a("data", message);
                        C8202x.m23417a(C8202x.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = C8199v.f19932a;
                    Logger.m23749i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C8202x.this.f19971a;
                Logger.m23749i(b2, "iabTokenAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "initController(" + str + ")");
            C8300f fVar = new C8300f(str);
            if (C8202x.this.f19974f != null) {
                C8202x.this.f19974f.cancel();
                C8202x.this.f19974f = null;
            }
            if (fVar.mo56743a("stage")) {
                String d = fVar.mo56746d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    boolean unused = C8202x.this.f19952E = true;
                    C8202x.this.f19970W.mo56402b();
                } else if (TJAdUnitConstants.String.VIDEO_LOADED.equalsIgnoreCase(d)) {
                    C8202x.this.f19970W.mo56400a();
                } else if ("failed".equalsIgnoreCase(d)) {
                    String d2 = fVar.mo56746d("errMsg");
                    C8141e h = C8202x.this.f19970W;
                    h.mo56401a("controller js failed to initialize : " + d2);
                } else {
                    Logger.m23749i(C8202x.this.f19971a, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        String b = C8202x.this.f19971a;
                        Logger.m23749i(b, "omidAPI(" + str + ")");
                        C8202x.this.f19982n.mo56482a(new C8300f(str).toString(), new C8255a());
                    } catch (Exception e) {
                        e.printStackTrace();
                        String b2 = C8202x.this.f19971a;
                        Logger.m23749i(b2, "omidAPI failed with exception " + e.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onAdWindowsClosed(" + str + ")");
            C8202x.this.f19981m.f20206e = -1;
            C8202x.this.f19981m.f20204c = null;
            C8223b unused = C8202x.this.f19973e = null;
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8293d.C8298e e = C8202x.m23451h(d);
            String z = C8202x.this.f19992x;
            Log.d(z, "onAdClosed() with type " + e);
            if (C8202x.this.mo56504a(d)) {
                C8202x.this.mo56500a(e, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetApplicationInfoFail(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetApplicationInfoSuccess(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetCachedFilesMapFail(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetCachedFilesMapSuccess(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetDeviceStatusFail(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetDeviceStatusSuccess(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onGetUserCreditsFail(" + str + ")");
            final String d = new C8300f(str).mo56746d("errMsg");
            if (C8202x.this.mo56504a(C8293d.C8298e.OfferWall.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8202x.this.f19962O.onGetOWCreditsFailed(str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onInitBannerFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m23749i(C8202x.this.f19971a, "onInitBannerFail failed with no demand source");
                return;
            }
            C8292c a = C8202x.this.f19969V.mo56461a(C8293d.C8298e.Banner, fetchDemandSourceId);
            if (a != null) {
                a.mo56724a(3);
            }
            if (C8202x.this.mo56504a(C8293d.C8298e.Banner.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8202x.this.f19971a;
                        Log.d(b, "onBannerInitFail(message:" + str + ")");
                        C8202x.this.f19963P.mo56666a(C8293d.C8298e.Banner, fetchDemandSourceId, str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m23749i(C8202x.this.f19971a, "onInitBannerSuccess()");
            C8202x.m23437c(C8202x.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8300f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m23749i(C8202x.this.f19971a, "onInitBannerSuccess failed with no demand source");
            } else if (C8202x.this.mo56504a(C8293d.C8298e.Banner.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8202x.this.f19971a, "onBannerInitSuccess()");
                        C8202x.this.f19963P.mo56665a(C8293d.C8298e.Banner, fetchDemandSourceId, (C8289a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onInitInterstitialFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m23749i(C8202x.this.f19971a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C8292c a = C8202x.this.f19969V.mo56461a(C8293d.C8298e.Interstitial, fetchDemandSourceId);
            if (a != null) {
                a.mo56724a(3);
            }
            if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8202x.this.f19971a;
                        Log.d(b, "onInterstitialInitFail(message:" + str + ")");
                        C8202x.this.f19961N.mo56666a(C8293d.C8298e.Interstitial, fetchDemandSourceId, str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m23749i(C8202x.this.f19971a, "onInitInterstitialSuccess()");
            C8202x.m23437c(C8202x.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8300f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m23749i(C8202x.this.f19971a, "onInitInterstitialSuccess failed with no demand source");
            } else if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8202x.this.f19971a, "onInterstitialInitSuccess()");
                        C8202x.this.f19961N.mo56665a(C8293d.C8298e.Interstitial, fetchDemandSourceId, (C8289a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onInitOfferWallFail(" + str + ")");
            C8202x.this.f19981m.f20210i = false;
            final String d = new C8300f(str).mo56746d("errMsg");
            if (C8202x.this.f19981m.f20209h) {
                C8202x.this.f19981m.f20209h = false;
                if (C8202x.this.mo56504a(C8293d.C8298e.OfferWall.toString())) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            String b = C8202x.this.f19971a;
                            Log.d(b, "onOfferWallInitFail(message:" + str + ")");
                            C8202x.this.f19962O.onOfferwallInitFail(str);
                        }
                    });
                }
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            C8202x.m23437c(C8202x.this, "onInitOfferWallSuccess", "true");
            C8202x.this.f19981m.f20210i = true;
            if (C8202x.this.f19981m.f20209h) {
                C8202x.this.f19981m.f20209h = false;
                if (C8202x.this.mo56504a(C8293d.C8298e.OfferWall.toString())) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C8202x.this.f19971a, "onOfferWallInitSuccess()");
                            C8202x.this.f19962O.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onInitRewardedVideoFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8292c a = C8202x.this.f19969V.mo56461a(C8293d.C8298e.RewardedVideo, fetchDemandSourceId);
            if (a != null) {
                a.mo56724a(3);
            }
            if (C8202x.this.mo56504a(C8293d.C8298e.RewardedVideo.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8202x.this.f19971a;
                        Log.d(b, "onRVInitFail(message:" + str + ")");
                        C8202x.this.f19960M.mo56666a(C8293d.C8298e.RewardedVideo, fetchDemandSourceId, str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m23749i(C8202x.this.f19971a, "onLoadBannerFail()");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && C8202x.this.mo56504a(C8293d.C8298e.Banner.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C8202x.this.f19971a, "onLoadBannerFail()");
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8202x.this.f19963P.mo56694d(fetchDemandSourceId, str);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m23749i(C8202x.this.f19971a, "onLoadBannerSuccess()");
            C8300f fVar = new C8300f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.mo56746d("adViewId");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8125e a = C8123d.m23224a().mo56345a(d);
            if (a == null) {
                C8312b E = C8202x.this.f19963P;
                E.mo56694d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (a instanceof C8116a) {
                final C8116a aVar = (C8116a) a;
                if (C8202x.this.mo56504a(C8293d.C8298e.Banner.toString())) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C8202x.this.f19971a, "onBannerLoadSuccess()");
                            C8202x.this.f19963P.mo56670a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onLoadInterstitialFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m23526a(fetchDemandSourceId, false);
                if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C8202x.this.f19961N.mo56685b(fetchDemandSourceId, str);
                        }
                    });
                }
                C8202x.m23437c(C8202x.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8300f(str));
            m23526a(fetchDemandSourceId, true);
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        C8202x.this.f19961N.mo56689c(fetchDemandSourceId);
                    }
                });
            }
            C8202x.m23437c(C8202x.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowInterstitialFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m23526a(fetchDemandSourceId, false);
                if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C8202x.this.f19961N.mo56690c(fetchDemandSourceId, str);
                        }
                    });
                }
                C8202x.m23437c(C8202x.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowInterstitialSuccess(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C8300f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m23749i(C8202x.this.f19971a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C8202x.this.f19981m.f20206e = C8293d.C8298e.Interstitial.ordinal();
            C8202x.this.f19981m.f20204c = fetchDemandSourceId;
            if (C8202x.this.mo56504a(C8293d.C8298e.Interstitial.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        C8202x.this.f19961N.mo56688c(C8293d.C8298e.Interstitial, fetchDemandSourceId);
                        C8202x.this.f19961N.mo56693d(fetchDemandSourceId);
                    }
                });
                C8202x.m23437c(C8202x.this, "onShowInterstitialSuccess", str);
            }
            m23526a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowOfferWallFail(" + str + ")");
            final String d = new C8300f(str).mo56746d("errMsg");
            if (C8202x.this.mo56504a(C8293d.C8298e.OfferWall.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C8202x.this.f19962O.onOWShowFail(str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowOfferWallSuccess(" + str + ")");
            C8202x.this.f19981m.f20206e = C8293d.C8298e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (C8202x.this.mo56504a(C8293d.C8298e.OfferWall.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        C8202x.this.f19962O.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowRewardedVideoFail(" + str + ")");
            C8300f fVar = new C8300f(str);
            final String d = fVar.mo56746d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (C8202x.this.mo56504a(C8293d.C8298e.RewardedVideo.toString())) {
                C8202x.this.mo56507c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C8202x.this.f19971a;
                        Log.d(b, "onRVShowFail(message:" + d + ")");
                        C8202x.this.f19960M.mo56671a(fetchDemandSourceId, str);
                    }
                });
            }
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onShowRewardedVideoSuccess(" + str + ")");
            C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
            C8202x.m23437c(C8202x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String b = C8202x.this.f19971a;
            Log.d(b, "onVideoStatusChanged(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("productType");
            if (C8202x.this.f19980l != null && !TextUtils.isEmpty(d)) {
                String d2 = fVar.mo56746d("status");
                if ("started".equalsIgnoreCase(d2)) {
                    C8202x.this.f19980l.onVideoStarted();
                } else if (TJAdUnitConstants.String.VIDEO_PAUSED.equalsIgnoreCase(d2)) {
                    C8202x.this.f19980l.onVideoPaused();
                } else if (TJAdUnitConstants.String.VIDEO_PLAYING.equalsIgnoreCase(d2)) {
                    C8202x.this.f19980l.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d2)) {
                    C8202x.this.f19980l.onVideoEnded();
                } else if (TJAdUnitConstants.String.VIDEO_STOPPED.equalsIgnoreCase(d2)) {
                    C8202x.this.f19980l.onVideoStopped();
                } else {
                    String b2 = C8202x.this.f19971a;
                    Logger.m23749i(b2, "onVideoStatusChanged: unknown status: " + d2);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            Logger.m23749i(C8202x.this.f19971a, "openUrl(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("url");
            String d2 = fVar.mo56746d("method");
            String d3 = fVar.mo56746d(CampaignEx.JSON_KEY_PACKAGE_NAME);
            Activity a = C8202x.this.f19989u.mo56396a();
            try {
                String lowerCase = d2.toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase.equals(TapjoyConstants.TJC_STORE)) {
                        c = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c = 0;
                }
                if (c == 0) {
                    C6363a.C63641.m19008a(a, d, d3);
                } else if (c == 1) {
                    Intent intent = new Intent(a, OpenUrlActivity.class);
                    intent.putExtra(C8202x.f19945c, d);
                    intent.putExtra(C8202x.f19946d, true);
                    intent.putExtra("immersive", C8202x.this.f19968U);
                    a.startActivity(intent);
                } else if (c == 2) {
                    Intent intent2 = new Intent(a, OpenUrlActivity.class);
                    intent2.putExtra(C8202x.f19945c, d);
                    intent2.putExtra(C8202x.f19944b, true);
                    intent2.putExtra(C8202x.f19946d, true);
                    a.startActivity(intent2);
                }
            } catch (Exception e) {
                C8202x.m23417a(C8202x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    C8202x.this.mo56513k();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            C8300f fVar;
            String str2;
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "permissionsAPI(" + str + ")");
                C8300f fVar2 = new C8300f(str);
                C8192r H = C8202x.this.f19983o;
                String fVar3 = fVar2.toString();
                C8255a aVar = new C8255a();
                JSONObject jSONObject = new JSONObject(fVar3);
                C8192r.C8193a aVar2 = new C8192r.C8193a((byte) 0);
                aVar2.f19914a = jSONObject.optString("functionName");
                aVar2.f19915b = jSONObject.optJSONObject("functionParams");
                aVar2.f19916c = jSONObject.optString("success");
                aVar2.f19917d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f19914a)) {
                    JSONObject jSONObject2 = aVar2.f19915b;
                    fVar = new C8300f();
                    try {
                        fVar.mo56742a("permissions", C6372c.m19028a(H.f19913a, jSONObject2.getJSONArray("permissions")));
                        aVar.mo56641a(true, aVar2.f19916c, fVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = C8192r.f19912b;
                        Logger.m23749i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.mo56741a("errMsg", e.getMessage());
                        str2 = aVar2.f19917d;
                        aVar.mo56641a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f19914a)) {
                    JSONObject jSONObject3 = aVar2.f19915b;
                    fVar = new C8300f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.mo56741a("permission", string);
                        if (C6372c.m19029a(H.f19913a, string)) {
                            fVar.mo56741a("status", String.valueOf(C6372c.m19031b(H.f19913a, string)));
                            aVar.mo56641a(true, aVar2.f19916c, fVar);
                            return;
                        }
                        fVar.mo56741a("status", "unhandledPermission");
                        aVar.mo56641a(false, aVar2.f19917d, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.mo56741a("errMsg", e2.getMessage());
                        str2 = aVar2.f19917d;
                        aVar.mo56641a(false, str2, fVar);
                    }
                } else {
                    String str4 = C8192r.f19912b;
                    Logger.m23749i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C8202x.this.f19971a;
                Logger.m23749i(b2, "permissionsAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "postAdEventNotification(" + str2 + ")");
                C8300f fVar = new C8300f(str2);
                final String d = fVar.mo56746d("eventName");
                if (TextUtils.isEmpty(d)) {
                    C8202x.m23417a(C8202x.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.mo56746d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.mo56745c("extData");
                String d3 = fVar.mo56746d("productType");
                C8293d.C8298e e = C8202x.m23451h(d3);
                if (C8202x.this.mo56504a(d3)) {
                    String b2 = new C8300f(str2).mo56746d(C8202x.f19942ab);
                    if (!TextUtils.isEmpty(b2)) {
                        C8202x.this.mo56506b(C8202x.m23412a(b2, C8202x.m23413a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    final C8293d.C8298e eVar = e;
                    final String str4 = str3;
                    final JSONObject jSONObject2 = jSONObject;
                    C8202x.this.mo56507c((Runnable) new Runnable() {
                        public final void run() {
                            if (eVar == C8293d.C8298e.Interstitial || eVar == C8293d.C8298e.RewardedVideo || eVar == C8293d.C8298e.Banner) {
                                C8311a a = C8202x.this.m23426b(eVar);
                                if (a != null) {
                                    a.mo56667a(eVar, str4, d, jSONObject2);
                                }
                            } else if (eVar == C8293d.C8298e.OfferWall) {
                                C8202x.this.f19962O.onOfferwallEventNotificationReceived(d, jSONObject2);
                            }
                        }
                    });
                    return;
                }
                C8202x.m23417a(C8202x.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "removeCloseEventHandler(" + str + ")");
            if (C8202x.this.f19954G != null) {
                C8202x.this.f19954G.cancel();
            }
            boolean unused = C8202x.this.f19953F = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    C8202x.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    C8202x.this.mo56514l();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String b = C8202x.this.f19971a;
                Logger.m23749i(b, "saveFile(" + str + ")");
                C8300f fVar = new C8300f(str);
                String d = fVar.mo56746d("path");
                String d2 = fVar.mo56746d(ShareInternalUtility.STAGING_PARAM);
                if (TextUtils.isEmpty(d2)) {
                    C8202x.m23417a(C8202x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C8305c cVar = new C8305c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C8202x.this.f19965R, d), SDKUtils.getFileName(d2));
                if (C6393h.m19096a(C8202x.this.f19965R) <= 0) {
                    C8202x.m23417a(C8202x.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    C8202x.m23417a(C8202x.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    C8202x.m23417a(C8202x.this, str, false, "file_already_exist", (String) null);
                } else if (!C6363a.C63641.m19012b(C8202x.this.getContext())) {
                    C8202x.m23417a(C8202x.this, str, false, "no_network_connection", (String) null);
                } else {
                    C8202x.m23417a(C8202x.this, str, true, (String) null, (String) null);
                    C8322b o = C8202x.this.f19951D;
                    o.mo56761a(cVar, d2, o.f20273a);
                }
            } catch (Exception e) {
                C8202x.m23417a(C8202x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setBackButtonState(" + str + ")");
            String d = new C8300f(str).mo56746d("state");
            SharedPreferences.Editor edit = C8342b.m23758a().f20330a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setForceClose(" + str + ")");
            C8300f fVar = new C8300f(str);
            String d = fVar.mo56746d("width");
            String d2 = fVar.mo56746d("height");
            int unused = C8202x.this.f19955H = Integer.parseInt(d);
            int unused2 = C8202x.this.f19956I = Integer.parseInt(d2);
            String unused3 = C8202x.this.f19957J = fVar.mo56746d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setMixedContentAlwaysAllow(" + str + ")");
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        C8202x.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setOrientation(" + str + ")");
            String d = new C8300f(str).mo56746d(TJAdUnitConstants.String.ORIENTATION);
            C8202x.this.f19979k = d;
            if (C8202x.this.f19990v != null) {
                C8202x.this.f19990v.onOrientationChanged(d, C6393h.m19122k(C8202x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = C8342b.m23758a().f20330a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "removeCloseEventHandler(" + str + ")");
            C8202x.this.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    C8202x.this.setOnTouchListener(new C8259h(C8202x.this, (byte) 0));
                }
            });
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setUserData(" + str2 + ")");
            C8300f fVar = new C8300f(str2);
            if (!fVar.mo56743a(SDKConstants.PARAM_KEY)) {
                C8202x.m23417a(C8202x.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.mo56743a("value")) {
                C8202x.m23417a(C8202x.this, str2, false, "value does not exist", (String) null);
            } else {
                String d = fVar.mo56746d(SDKConstants.PARAM_KEY);
                String d2 = fVar.mo56746d("value");
                SharedPreferences.Editor edit = C8342b.m23758a().f20330a.edit();
                edit.putString(d, d2);
                edit.apply();
                C8202x.this.mo56506b(C8202x.m23429b(new C8300f(str2).mo56746d(C8202x.f19942ab), C8202x.m23413a(d, d2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String b = C8202x.this.f19971a;
            Logger.m23749i(b, "setWebviewBackgroundColor(" + str + ")");
            C8202x.m23448g(C8202x.this, str);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$e */
    interface C8256e {
        /* renamed from: a */
        void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.x$f */
    static class C8257f {

        /* renamed from: a */
        String f20109a;

        /* renamed from: b */
        String f20110b;

        C8257f() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$g */
    public enum C8258g {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.x$h */
    class C8259h implements View.OnTouchListener {
        private C8259h() {
        }

        /* synthetic */ C8259h(C8202x xVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String b = C8202x.this.f19971a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.m23749i(b, sb.toString());
                int m = C6393h.m19125m();
                int n = C6393h.m19127n();
                Logger.m23749i(C8202x.this.f19971a, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) C8202x.this.f19955H);
                int dpToPx2 = SDKUtils.dpToPx((long) C8202x.this.f19956I);
                if (C5922dh.DEFAULT_POSITION.equalsIgnoreCase(C8202x.this.f19957J)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(C8202x.this.f19957J)) {
                    if ("bottom-right".equalsIgnoreCase(C8202x.this.f19957J)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(C8202x.this.f19957J)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = C8202x.this.f19953F = false;
                    if (C8202x.this.f19954G != null) {
                        C8202x.this.f19954G.cancel();
                    }
                    CountDownTimer unused2 = C8202x.this.f19954G = new CountDownTimer(2000, 500) {
                        public final void onFinish() {
                            Logger.m23749i(C8202x.this.f19971a, "Close Event Timer Finish");
                            if (C8202x.this.f19953F) {
                                boolean unused = C8202x.this.f19953F = false;
                            } else {
                                C8202x.this.mo56509e(TJAdUnitConstants.String.FORCE_CLOSE);
                            }
                        }

                        public final void onTick(long j) {
                            String b = C8202x.this.f19971a;
                            Logger.m23749i(b, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$i */
    class C8261i extends WebViewClient {
        private C8261i() {
        }

        /* synthetic */ C8261i(C8202x xVar, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.m23749i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                C8202x.this.mo56506b(C8202x.m23447g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m23749i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m23749i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && C8202x.this.f19970W != null) {
                C8141e h = C8202x.this.f19970W;
                h.mo56401a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C8202x.this.f19971a;
            Log.e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C8202x.this.f19970W != null) {
                C8202x.this.f19970W.mo56403b(str);
            }
            C8202x xVar = C8202x.this;
            if (xVar.f19973e == null) {
                return true;
            }
            xVar.mo56512j();
            C8293d.C8298e eVar = xVar.f19973e.f20029a;
            String str2 = xVar.f19973e.f20030b;
            if (!xVar.mo56504a(eVar.toString())) {
                return true;
            }
            xVar.mo56500a(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.m23749i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = Advertisement.FILE_SCHEME + C8202x.this.f19965R + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m23749i("shouldOverrideUrlLoading", str);
            try {
                if (C8202x.this.mo56510f(str)) {
                    C8202x.this.mo56511i();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C8202x(Context context, C8170j jVar, C8139c cVar, C8141e eVar, C6385a aVar) {
        super(context);
        Logger.m23749i(this.f19971a, "C'tor");
        this.f19989u = cVar;
        this.f19970W = eVar;
        this.f19991w = aVar;
        this.f19965R = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.f19969V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f19977i = new FrameLayout(context);
        this.f19958K = new FrameLayout(context);
        this.f19958K.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19958K.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f19977i.addView(this.f19958K, layoutParams);
        this.f19977i.addView(frameLayout);
        this.f19981m = new C8290b();
        C8322b a = mo56497a();
        this.f19951D = a;
        a.f20273a.f20271a = this;
        this.f19966S = new C8142f(SDKUtils.getNetworkConfiguration(), this.f19965R, SDKUtils.getControllerUrl(), this.f19951D);
        this.f19975g = new C8222a(this, (byte) 0);
        setWebViewClient(new C8261i(this, (byte) 0));
        setWebChromeClient(this.f19975g);
        C8345d.m23776a(this);
        C8195t tVar = new C8195t(UUID.randomUUID().toString());
        addJavascriptInterface(new C8166h(new C8140d(new C8225d()), tVar), APSAnalytics.OS_NAME);
        addJavascriptInterface(new C8194s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.f19972aa = new C8330b(SDKUtils.getControllerConfigAsJSONObject(), context) {
            /* renamed from: a */
            public final void mo56518a() {
                if (C8202x.this.f19952E) {
                    C8202x.this.mo56508d("none");
                }
            }

            /* renamed from: a */
            public final void mo56519a(String str) {
                if (C8202x.this.f19952E) {
                    C8202x.this.mo56508d(str);
                }
            }

            /* renamed from: a */
            public final void mo56520a(String str, JSONObject jSONObject) {
                if (jSONObject != null && C8202x.this.f19952E) {
                    try {
                        jSONObject.put("connectionType", str);
                        C8202x xVar = C8202x.this;
                        String str2 = xVar.f19971a;
                        Logger.m23749i(str2, "device connection info changed: " + jSONObject.toString());
                        xVar.mo56506b(C8202x.m23429b("connectionInfoChanged", C8202x.m23413a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mo56411a(context);
        f19947y = FeaturesManager.getInstance().getDebugMode();
    }

    /* renamed from: a */
    private String m23411a(C8293d.C8298e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C8292c a = this.f19969V.mo56461a(eVar, fetchDemandSourceId);
        if (a != null) {
            if (a.f20220d != null) {
                hashMap.putAll(a.f20220d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a2 = m23414a(eVar);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        C8286a.C8287a a3 = C8286a.C8287a.m23624a(eVar);
        return m23412a(a3.f20186a, flatMapToJsonAsString, a3.f20187b, a3.f20188c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m23412a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    /* renamed from: a */
    public static String m23413a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private Map<String, String> m23414a(C8293d.C8298e eVar) {
        if (eVar == C8293d.C8298e.OfferWall) {
            return this.f19950C;
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m23416a(C8202x xVar, final String str, final C8293d.C8298e eVar, final C8292c cVar) {
        if (xVar.mo56504a(eVar.toString())) {
            xVar.mo56507c((Runnable) new Runnable() {
                public final void run() {
                    if (C8293d.C8298e.RewardedVideo == eVar || C8293d.C8298e.Interstitial == eVar || C8293d.C8298e.Banner == eVar) {
                        C8292c cVar = cVar;
                        if (cVar != null && !TextUtils.isEmpty(cVar.f20218b)) {
                            C8311a a = C8202x.this.m23426b(eVar);
                            String b = C8202x.this.f19971a;
                            Log.d(b, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                            if (a != null) {
                                a.mo56666a(eVar, cVar.f20218b, str);
                            }
                        }
                    } else if (C8293d.C8298e.OfferWall == eVar) {
                        C8202x.this.f19962O.onOfferwallInitFail(str);
                    } else if (C8293d.C8298e.OfferWallCredits == eVar) {
                        C8202x.this.f19962O.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m23417a(com.ironsource.sdk.controller.C8202x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = f19942ab
            java.lang.String r1 = r0.mo56746d(r1)
            java.lang.String r2 = f19943ac
            java.lang.String r0 = r0.mo56746d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005a
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x003e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003e }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003e }
        L_0x003e:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0053
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0053 }
        L_0x0053:
            java.lang.String r4 = m23429b((java.lang.String) r1, (java.lang.String) r4)
            r3.mo56506b((java.lang.String) r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8202x.m23417a(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m23418a(C8202x xVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview") && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: a */
    private void m23419a(String str, String str2, C8293d.C8298e eVar, C8292c cVar, C8256e eVar2) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.mo56527a("User id or Application key are missing", eVar, cVar);
            return;
        }
        C8257f fVar = new C8257f();
        if (eVar == C8293d.C8298e.RewardedVideo || eVar == C8293d.C8298e.Interstitial || eVar == C8293d.C8298e.OfferWall || eVar == C8293d.C8298e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f19948A);
            hashMap.put("applicationUserId", this.f19949B);
            if (cVar != null) {
                if (cVar.f20220d != null) {
                    hashMap.putAll(cVar.f20220d);
                    C8335a aVar = C8335a.f20301a;
                    hashMap.put("loadStartTime", String.valueOf(C8335a.m23713a(cVar.f20218b)));
                }
                hashMap.put("demandSourceName", cVar.f20217a);
                hashMap.put("demandSourceId", cVar.f20218b);
            }
            Map<String, String> a = m23414a(eVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            C8286a.C8287a aVar2 = new C8286a.C8287a();
            if (eVar == C8293d.C8298e.RewardedVideo) {
                aVar2.f20186a = "initRewardedVideo";
                aVar2.f20187b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == C8293d.C8298e.Interstitial) {
                aVar2.f20186a = "initInterstitial";
                aVar2.f20187b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == C8293d.C8298e.OfferWall) {
                aVar2.f20186a = "initOfferWall";
                aVar2.f20187b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == C8293d.C8298e.Banner) {
                    aVar2.f20186a = "initBanner";
                    aVar2.f20187b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = m23412a(aVar2.f20186a, flatMapToJsonAsString, aVar2.f20187b, aVar2.f20188c);
                str3 = aVar2.f20186a;
            }
            aVar2.f20188c = str5;
            str4 = m23412a(aVar2.f20186a, flatMapToJsonAsString, aVar2.f20187b, aVar2.f20188c);
            str3 = aVar2.f20186a;
        } else {
            if (eVar == C8293d.C8298e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = m23412a(str3, m23413a("productType", "OfferWall", "applicationKey", this.f19948A, "applicationUserId", this.f19949B, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            mo56506b(fVar.f20110b);
        }
        fVar.f20109a = str3;
        fVar.f20110b = str4;
        mo56506b(fVar.f20110b);
    }

    /* renamed from: a */
    private void m23420a(String str, String str2, String str3) {
        try {
            mo56506b(m23429b("assetCachedFailed", m23413a(ShareInternalUtility.STAGING_PARAM, str, "path", m23454i(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static int m23424b() {
        return f19947y;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8311a m23426b(C8293d.C8298e eVar) {
        if (eVar == C8293d.C8298e.Interstitial) {
            return this.f19961N;
        }
        if (eVar == C8293d.C8298e.RewardedVideo) {
            return this.f19960M;
        }
        if (eVar == C8293d.C8298e.Banner) {
            return this.f19963P;
        }
        return null;
    }

    /* renamed from: b */
    public static String m23429b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* renamed from: b */
    private String m23430b(JSONObject jSONObject) {
        C8341a a = C8341a.m23755a(getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append("&");
        }
        String str = a.f20325c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + CertificateUtil.DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + CertificateUtil.DELIMITER + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(f19947y);
        }
        return sb.toString();
    }

    /* renamed from: b */
    static /* synthetic */ void m23431b(C8202x xVar, Context context) {
        try {
            if (xVar.f19972aa != null) {
                xVar.f19972aa.f20294a.mo56768a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m23436c(C8202x xVar, Context context) {
        try {
            if (xVar.f19972aa != null) {
                xVar.f19972aa.f20294a.mo56769b(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m23437c(C8202x xVar, final String str, String str2) {
        final String d = new C8300f(str2).mo56746d("errMsg");
        if (!TextUtils.isEmpty(d)) {
            xVar.mo56501a((Runnable) new Runnable() {
                public final void run() {
                    if (C8202x.m23424b() == C8293d.C8297d.MODE_3.f20249d) {
                        Activity a = C8202x.this.f19989u.mo56396a();
                        Toast.makeText(a, str + " : " + d, 1).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m23439c(Context context) {
        boolean z;
        C8341a a = C8341a.m23755a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(C6393h.m19130o(context)));
            String str = a.f20323a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f20324b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m23749i(this.f19971a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a.f20325c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z = true;
                }
                String str4 = a.f20326d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String str5 = a.f20326d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a.f20327e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (a.f20328f != null && a.f20328f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f20328f));
                }
                String a2 = C6356a.m18974a(context);
                if (!a2.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), C6356a.m18979c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C6393h.m19096a(this.f19965R))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(C6393h.m19125m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z = true;
                }
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(String.valueOf(C6393h.m19127n())));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf4 = String.valueOf(C6393h.m19129o());
                if (!TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf4));
                }
                String valueOf5 = String.valueOf(C6393h.m19120j());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf5));
                }
                C8341a.m23755a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C8341a.m23757b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), C6393h.m19141v(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C6363a.C63641.m19014c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C6363a.C63641.m19017d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), C6363a.C63641.m19020f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C6363a.C63641.m19019e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C6372c.m19030b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C6372c.m19027a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C6372c.m19032c(context)));
                String d = C6372c.m19034d(context);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), C6398k.m19149a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), C6393h.m19145z(context));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e2) {
            e = e2;
            z = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m23440c(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            C8293d.C8298e h = m23451h(str);
            if (h == C8293d.C8298e.OfferWall) {
                map = this.f19950C;
            } else {
                C8292c a = this.f19969V.mo56461a(h, str2);
                if (a != null) {
                    Map<String, String> map2 = a.f20220d;
                    map2.put("demandSourceName", a.f20217a);
                    map2.put("demandSourceId", a.f20218b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f19949B)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f19949B));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f19948A)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f19948A));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase("0")) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* renamed from: g */
    static String m23447g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* renamed from: g */
    static /* synthetic */ void m23448g(C8202x xVar, String str) {
        C8300f fVar = new C8300f(str);
        String d = fVar.mo56746d("color");
        String d2 = fVar.mo56746d("adViewId");
        int parseColor = !TJAdUnitConstants.String.TRANSPARENT.equalsIgnoreCase(d) ? Color.parseColor(d) : 0;
        if (d2 != null) {
            WebView b = C8123d.m23224a().mo56345a(d2).mo56331b();
            if (b != null) {
                b.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        xVar.setBackgroundColor(parseColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C8293d.C8298e m23451h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.Interstitial.toString())) {
            return C8293d.C8298e.Interstitial;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.RewardedVideo.toString())) {
            return C8293d.C8298e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.OfferWall.toString())) {
            return C8293d.C8298e.OfferWall;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.Banner.toString())) {
            return C8293d.C8298e.Banner;
        }
        return null;
    }

    /* renamed from: h */
    static /* synthetic */ void m23452h(C8202x xVar, String str) {
        try {
            String str2 = xVar.f19971a;
            Logger.m23749i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.f19971a;
            Logger.m23747e(str3, "WebViewController::load: " + th);
        }
    }

    /* renamed from: i */
    private String m23454i(String str) {
        String str2 = this.f19965R + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8322b mo56497a() {
        return C8322b.m23683a(this.f19965R, this.f19991w);
    }

    /* renamed from: a */
    public final void mo56498a(int i) {
        if (this.f19966S.mo56405a()) {
            final JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            String b = m23430b(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                b = String.format("%s&sessionid=%s", new Object[]{b, initSDKParams.get("sessionid")});
            }
            final String str = this.f19966S.mo56408d().toURI().toString() + "?" + b;
            this.f19991w.mo35891a(new Runnable() {
                public final void run() {
                    C8202x.m23418a(C8202x.this, controllerConfigAsJSONObject);
                    C8202x.m23452h(C8202x.this, "about:blank");
                    C8202x.m23452h(C8202x.this, str);
                }
            });
            this.f19974f = new CountDownTimer(50000, 1000, i) {

                /* renamed from: b */
                private /* synthetic */ int f20003b;

                {
                    this.f20003b = r6;
                }

                public final void onFinish() {
                    Logger.m23749i(C8202x.this.f19971a, "Loading Controller Timer Finish");
                    int i = this.f20003b;
                    if (i == 3) {
                        C8202x.this.mo56507c((Runnable) new Runnable() {
                            public final void run() {
                                C8202x.this.f19970W.mo56401a("controller html - failed to load into web-view");
                            }
                        });
                    } else {
                        C8202x.this.mo56498a(i + 1);
                    }
                }

                public final void onTick(long j) {
                    String b = C8202x.this.f19971a;
                    Logger.m23749i(b, "Loading Controller Timer Tick " + j);
                }
            }.start();
            return;
        }
        Logger.m23749i(this.f19971a, "load(): Mobile Controller HTML Does not exist");
    }

    /* renamed from: a */
    public final void mo56411a(final Context context) {
        mo56505b((Runnable) new Runnable() {
            public final void run() {
                C8202x.m23431b(C8202x.this, context);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56499a(com.ironsource.sdk.p285g.C8290b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f19967T
            monitor-enter(r0)
            boolean r1 = r11.f20205d     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = r10.f19952E     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0144 }
            r2.append(r11)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f20206e     // Catch:{ all -> 0x0144 }
            r2 = -1
            if (r1 == r2) goto L_0x0089
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p285g.C8293d.C8298e.RewardedVideo     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onRVAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p285g.C8293d.C8298e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f20204c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m23426b((com.ironsource.sdk.p285g.C8293d.C8298e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
        L_0x0047:
            r4.mo56664a(r1, r3)     // Catch:{ all -> 0x0144 }
            goto L_0x0083
        L_0x004b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p285g.C8293d.C8298e.Interstitial     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x006b
            java.lang.String r1 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p285g.C8293d.C8298e.Interstitial     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f20204c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m23426b((com.ironsource.sdk.p285g.C8293d.C8298e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
            goto L_0x0047
        L_0x006b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p285g.C8293d.C8298e.OfferWall     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x0083
            java.lang.String r1 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.e r1 = r10.f19962O     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0083
            com.ironsource.sdk.j.e r1 = r10.f19962O     // Catch:{ all -> 0x0144 }
            r1.onOWAdClosed()     // Catch:{ all -> 0x0144 }
        L_0x0083:
            r11.f20206e = r2     // Catch:{ all -> 0x0144 }
            r1 = 0
            r11.f20204c = r1     // Catch:{ all -> 0x0144 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r1 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
        L_0x0090:
            java.lang.String r1 = r11.f20207f     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f20208g     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f19969V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p285g.C8293d.C8298e.Interstitial     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo56465b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00a0:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p285g.C8292c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f20221e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00a0
            java.lang.String r5 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r4.f20217a     // Catch:{ all -> 0x0144 }
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.c r5 = r10.f19961N     // Catch:{ all -> 0x0144 }
            r10.mo56417a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p285g.C8292c) r4, (com.ironsource.sdk.p288j.p289a.C8313c) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x00a0
        L_0x00e1:
            java.lang.String r1 = r11.f20202a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f20203b     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f19969V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p285g.C8293d.C8298e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo56465b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p285g.C8292c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f20221e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00f1
            java.lang.String r6 = r4.f20217a     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r7 = r10.f19960M     // Catch:{ all -> 0x0144 }
            r7.mo56683b(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f19971a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r6 = r10.f19960M     // Catch:{ all -> 0x0144 }
            r10.mo56418a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p285g.C8292c) r4, (com.ironsource.sdk.p288j.p289a.C8314d) r6)     // Catch:{ all -> 0x0144 }
            goto L_0x00f1
        L_0x013d:
            r1 = 0
            r11.f20205d = r1     // Catch:{ all -> 0x0144 }
        L_0x0140:
            r10.f19981m = r11     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C8202x.mo56499a(com.ironsource.sdk.g.b):void");
    }

    /* renamed from: a */
    public final void mo56412a(C8292c cVar, Map<String, String> map, C8312b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56723a()});
        if (map != null) {
            mo56506b(m23412a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    /* renamed from: a */
    public final void mo56413a(C8292c cVar, Map<String, String> map, C8313c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56723a()});
        this.f19981m.mo56717a(cVar.f20218b, true);
        mo56506b(m23412a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56500a(final C8293d.C8298e eVar, final String str) {
        mo56507c((Runnable) new Runnable() {
            public final void run() {
                if (eVar == C8293d.C8298e.RewardedVideo || eVar == C8293d.C8298e.Interstitial) {
                    C8311a a = C8202x.this.m23426b(eVar);
                    if (a != null) {
                        a.mo56664a(eVar, str);
                    }
                } else if (eVar == C8293d.C8298e.OfferWall) {
                    C8202x.this.f19962O.onOWAdClosed();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56466a(C8305c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C8142f fVar = this.f19966S;
            C82164 r0 = new Runnable() {
                public final void run() {
                    C8202x.this.mo56498a(1);
                }
            };
            if (!fVar.mo56405a()) {
                if (fVar.f19762c == C8142f.C8145a.f19770b) {
                    fVar.mo56407c();
                }
                fVar.f19763d = C8142f.C8146b.CONTROLLER_FROM_SERVER;
                fVar.mo56404a(fVar.f19763d);
                r0.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            mo56506b(m23429b("assetCached", m23413a(ShareInternalUtility.STAGING_PARAM, name, "path", m23454i(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e) {
            m23420a(name, parent, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo56467a(C8305c cVar, final C8299e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C8142f fVar = this.f19966S;
            C82175 r0 = new Runnable() {
                public final void run() {
                    C8202x.this.mo56498a(1);
                }
            };
            C82186 r1 = new Runnable() {
                public final void run() {
                    C8141e h = C8202x.this.f19970W;
                    h.mo56401a("controller html - failed to download - " + eVar.f20257a);
                }
            };
            if (fVar.mo56405a()) {
                return;
            }
            if (fVar.f19762c != C8142f.C8145a.f19770b || !fVar.mo56409e()) {
                C8100a a = new C8100a().mo56293a("generalmessage", Integer.valueOf(fVar.f19761b));
                if (fVar.f19760a > 0) {
                    a.mo56293a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f19760a));
                }
                C8104d.m23161a(C8106f.f19641t, (Map<String, Object>) a.f19613a);
                r1.run();
                return;
            }
            fVar.f19763d = C8142f.C8146b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.mo56404a(fVar.f19763d);
            r0.run();
            return;
        }
        m23420a(cVar.getName(), cVar.getParent(), eVar.f20257a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56501a(Runnable runnable) {
        C6385a aVar = this.f19991w;
        if (aVar != null) {
            aVar.mo35891a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo56415a(String str, C8313c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f19981m.mo56717a(str, true);
        mo56506b(m23412a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo56502a(String str, String str2) {
        mo56506b(m23429b("onNativeLifeCycleEvent", m23413a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: a */
    public final void mo56416a(String str, String str2, C8292c cVar, C8312b bVar) {
        this.f19948A = str;
        this.f19949B = str2;
        this.f19963P = bVar;
        m23419a(str, str2, C8293d.C8298e.Banner, cVar, (C8256e) new C8256e() {
            /* renamed from: a */
            public final void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar) {
                C8202x.m23416a(C8202x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56417a(String str, String str2, C8292c cVar, C8313c cVar2) {
        this.f19948A = str;
        this.f19949B = str2;
        this.f19961N = cVar2;
        this.f19981m.f20207f = str;
        this.f19981m.f20208g = this.f19949B;
        m23419a(this.f19948A, this.f19949B, C8293d.C8298e.Interstitial, cVar, (C8256e) new C8256e() {
            /* renamed from: a */
            public final void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar) {
                C8202x.m23416a(C8202x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56418a(String str, String str2, C8292c cVar, C8314d dVar) {
        this.f19948A = str;
        this.f19949B = str2;
        this.f19960M = dVar;
        this.f19981m.f20202a = str;
        this.f19981m.f20203b = str2;
        m23419a(str, str2, C8293d.C8298e.RewardedVideo, cVar, (C8256e) new C8256e() {
            /* renamed from: a */
            public final void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar) {
                C8202x.m23416a(C8202x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56419a(String str, String str2, C8318e eVar) {
        this.f19948A = str;
        this.f19949B = str2;
        this.f19962O = eVar;
        m23419a(str, str2, C8293d.C8298e.OfferWallCredits, (C8292c) null, (C8256e) new C8256e() {
            /* renamed from: a */
            public final void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar) {
                C8202x.m23416a(C8202x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56420a(String str, String str2, Map<String, String> map, C8318e eVar) {
        this.f19948A = str;
        this.f19949B = str2;
        this.f19950C = map;
        this.f19962O = eVar;
        this.f19981m.f20211j = map;
        this.f19981m.f20209h = true;
        m23419a(this.f19948A, this.f19949B, C8293d.C8298e.OfferWall, (C8292c) null, (C8256e) new C8256e() {
            /* renamed from: a */
            public final void mo56527a(String str, C8293d.C8298e eVar, C8292c cVar) {
                C8202x.m23416a(C8202x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo56421a(Map<String, String> map, C8318e eVar) {
        this.f19950C = map;
        mo56506b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    /* renamed from: a */
    public final void mo56422a(JSONObject jSONObject) {
        mo56506b(m23429b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public final void mo56423a(JSONObject jSONObject, C8313c cVar) {
        mo56506b(m23411a(C8293d.C8298e.Interstitial, jSONObject));
    }

    /* renamed from: a */
    public final void mo56424a(JSONObject jSONObject, C8314d dVar) {
        mo56506b(m23411a(C8293d.C8298e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public final void mo56503a(boolean z, String str) {
        mo56506b(m23429b("viewableChange", m23413a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo56504a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m23745d(this.f19971a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C8293d.C8298e.Interstitial.toString()) ? !str.equalsIgnoreCase(C8293d.C8298e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C8293d.C8298e.Banner.toString()) ? (str.equalsIgnoreCase(C8293d.C8298e.OfferWall.toString()) || str.equalsIgnoreCase(C8293d.C8298e.OfferWallCredits.toString())) && this.f19962O != null : this.f19963P != null : this.f19960M != null : this.f19961N != null) {
            z = true;
        }
        if (!z) {
            Logger.m23745d(this.f19971a, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo56425b(final Context context) {
        mo56505b((Runnable) new Runnable() {
            public final void run() {
                C8202x.m23436c(C8202x.this, context);
            }
        });
    }

    /* renamed from: b */
    public final void mo56426b(C8292c cVar, Map<String, String> map, C8313c cVar2) {
        mo56506b(m23411a(C8293d.C8298e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo56723a()}))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56505b(Runnable runnable) {
        C6385a aVar = this.f19991w;
        if (aVar != null) {
            aVar.mo35892b(runnable);
        }
    }

    /* renamed from: b */
    public void mo56506b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (f19947y != C8293d.C8297d.MODE_0.f20249d && (f19947y < C8293d.C8297d.MODE_1.f20249d || f19947y > C8293d.C8297d.MODE_3.f20249d)) {
                str2 = "empty";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            final String str3 = "javascript:" + sb.toString();
            Logger.m23749i(this.f19971a, str3);
            mo56501a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        if (C8202x.this.f19964Q != null) {
                            if (C8202x.this.f19964Q.booleanValue()) {
                                C8202x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            } else {
                                C8202x.this.loadUrl(str3);
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            C8202x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            Boolean unused = C8202x.this.f19964Q = Boolean.TRUE;
                        } else {
                            C8202x.this.loadUrl(str3);
                            Boolean unused2 = C8202x.this.f19964Q = Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        String b = C8202x.this.f19971a;
                        Logger.m23747e(b, "injectJavascript: " + th.toString());
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final C8293d.C8296c mo56427c() {
        return C8293d.C8296c.Web;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo56507c(Runnable runnable) {
        C6385a aVar = this.f19991w;
        if (aVar != null) {
            aVar.mo35893c(runnable);
        }
    }

    /* renamed from: c */
    public final boolean mo56428c(String str) {
        C8292c a = this.f19969V.mo56461a(C8293d.C8298e.Interstitial, str);
        return a != null && a.f20222f;
    }

    /* renamed from: d */
    public final void mo56429d() {
        mo56506b(m23412a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    /* renamed from: d */
    public final void mo56508d(String str) {
        String str2 = this.f19971a;
        Logger.m23749i(str2, "device status changed, connection type " + str);
        C8101b.m23155a(str);
        mo56506b(m23429b("deviceStatusChanged", m23413a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        C8322b bVar = this.f19951D;
        if (bVar != null) {
            bVar.mo56759a();
        }
        C8330b bVar2 = this.f19972aa;
        if (bVar2 != null) {
            bVar2.f20294a.mo56767a();
        }
        CountDownTimer countDownTimer = this.f19974f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: e */
    public final void mo56431e() {
        mo56506b(m23447g("enterForeground"));
    }

    /* renamed from: e */
    public final void mo56509e(String str) {
        if (str.equals(TJAdUnitConstants.String.FORCE_CLOSE)) {
            mo56512j();
        }
        mo56506b(m23429b("engageEnd", m23413a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: f */
    public final void mo56432f() {
        mo56506b(m23447g("enterBackground"));
    }

    /* renamed from: f */
    public final boolean mo56510f(String str) {
        List<String> b = C8342b.m23758a().mo56794b();
        try {
            if (b.isEmpty()) {
                return false;
            }
            for (String contains : b) {
                if (str.contains(contains)) {
                    C6363a.C63641.m19008a(this.f19989u.mo56396a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final void mo56433g() {
        mo56499a(this.f19981m);
    }

    /* renamed from: h */
    public final void mo56434h() {
        C8100a aVar = new C8100a();
        C8142f fVar = this.f19966S;
        aVar.mo56293a("generalmessage", Integer.valueOf(fVar.f19761b));
        C8104d.m23161a(C8106f.f19639r, (Map<String, Object>) aVar.f19613a);
        fVar.f19760a = System.currentTimeMillis();
        if (this.f19966S.mo56406b()) {
            mo56498a(1);
        }
    }

    /* renamed from: i */
    public final void mo56511i() {
        mo56506b(m23447g("interceptedUrlToStore"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56512j() {
        C8320g gVar = this.f19990v;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    /* renamed from: k */
    public final void mo56513k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f19971a;
            Logger.m23749i(str, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: l */
    public final void mo56514l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f19971a;
            Logger.m23749i(str, "WebViewController: onResume() - " + th);
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.f19971a;
        Logger.m23749i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8320g gVar;
        if (i != 4 || (gVar = this.f19990v) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
