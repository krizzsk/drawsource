package com.mbridge.msdk.p075a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import com.iab.omid.library.mmadbridge.adsession.Partner;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p307b.C8510a;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.a.b */
/* compiled from: OmsdkUtils */
public final class C2427b {
    /* renamed from: a */
    public static void m5859a(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new C8582d(context).mo58069a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else if (context != null) {
            try {
                new C2426a(context.getApplicationContext()).mo57975a(0, MBridgeConstans.OMID_JS_SERVICE_URL, (C8550d) null, (C8532e) new C8510a() {
                    /* renamed from: a */
                    public final void mo16125a(String str) {
                        MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
                        C8672v.m24874a("OMSDK", "fetch OMJSContent success, content = " + str);
                        new Thread(new Runnable(str) {

                            /* renamed from: a */
                            final /* synthetic */ String f4933a;

                            {
                                this.f4933a = r1;
                            }

                            public final void run() {
                                try {
                                    File file = new File(C8478e.m24306b(C8476c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    C8666t.m24862a(this.f4933a.getBytes(), file);
                                } catch (Exception e) {
                                    C8672v.m24874a("OMSDK", e.getMessage());
                                }
                            }
                        }).start();
                    }

                    /* renamed from: b */
                    public final void mo16126b(String str) {
                        C8672v.m24874a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
                        new C8582d(context).mo58069a("", "", "", "", "fetch OM failed, request failed");
                    }
                });
            } catch (Exception e) {
                C8672v.m24878d("OMSDK", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m5861b(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new C8582d(context).mo58069a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else if (context != null) {
            try {
                new C2426a(context.getApplicationContext()).mo57975a(0, MBridgeConstans.OMID_JS_H5_URL, (C8550d) null, (C8532e) new C8510a() {
                    /* renamed from: a */
                    public final void mo16125a(String str) {
                        MBridgeConstans.OMID_JS_H5_CONTENT = str;
                        C8672v.m24874a("OMSDK", "fetch OMJSH5Content success, content = " + str);
                        new Thread(new Runnable(str) {

                            /* renamed from: a */
                            final /* synthetic */ String f4934a;

                            {
                                this.f4934a = r1;
                            }

                            public final void run() {
                                try {
                                    File file = new File(C8478e.m24306b(C8476c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    C8666t.m24862a(this.f4934a.getBytes(), file);
                                } catch (Exception e) {
                                    C8672v.m24874a("OMSDK", e.getMessage());
                                }
                            }
                        }).start();
                    }

                    /* renamed from: b */
                    public final void mo16126b(String str) {
                        C8672v.m24874a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
                        new C8582d(context).mo58069a("", "", "", "", "fetch OM H5 failed, request failed");
                    }
                });
            } catch (Exception e) {
                C8672v.m24878d("OMSDK", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    private static void m5862c(Context context) {
        if (!Omid.isActive()) {
            Omid.activate(context);
        }
    }

    /* renamed from: a */
    private static List<VerificationScriptResource> m5858a(String str, Context context, String str2, String str3, String str4, String str5) {
        VerificationScriptResource verificationScriptResource;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (!TextUtils.isEmpty(optString2)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(optString, url, optString2);
                    } else if (TextUtils.isEmpty(optString)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                    } else {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                    }
                    arrayList.add(verificationScriptResource);
                }
            }
        } catch (IllegalArgumentException e) {
            C8672v.m24878d("OMSDK", e.getMessage());
            C8582d dVar = new C8582d(context);
            dVar.mo58069a(str2, str5, str3, str4, "failed, exception " + e.getMessage());
        } catch (MalformedURLException e2) {
            C8672v.m24878d("OMSDK", e2.getMessage());
            C8582d dVar2 = new C8582d(context);
            dVar2.mo58069a(str2, str5, str3, str4, "failed, exception " + e2.getMessage());
        } catch (JSONException e3) {
            C8672v.m24878d("OMSDK", e3.getMessage());
            C8582d dVar3 = new C8582d(context);
            dVar3.mo58069a(str2, str5, str3, str4, "failed, exception " + e3.getMessage());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static AdSession m5854a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m5856a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m5860b();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(campaignEx.getOmid())) {
            C8672v.m24874a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new C8582d(context).mo58069a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        m5862c(context);
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.JAVASCRIPT, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.DEFINED_BY_JAVASCRIPT) ? Owner.NONE : Owner.NATIVE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), webView, (String) null, (String) null));
        createAdSession.registerAdView(webView);
        return createAdSession;
    }

    /* renamed from: a */
    public static AdSession m5855a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Context context2 = context;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m5856a();
        }
        AdSession adSession = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            String str7 = str2;
            C8672v.m24874a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new C8582d(context2).mo58069a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            m5862c(context);
            try {
                adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, z ? Owner.NONE : Owner.NATIVE, false), AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), MBridgeConstans.OMID_JS_SERVICE_CONTENT, m5858a(str, context, str2, str3, str4, str6), str5, str2));
                C8672v.m24874a("OMSDK", "adSession create success");
                return adSession;
            } catch (IllegalArgumentException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
                C8672v.m24878d("OMSDK", e.getMessage());
                C8582d dVar = new C8582d(context2);
                dVar.mo58069a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return adSession;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            String str8 = str2;
            C8672v.m24878d("OMSDK", e.getMessage());
            C8582d dVar2 = new C8582d(context2);
            dVar2.mo58069a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        } catch (Exception e4) {
            e = e4;
            String str9 = str2;
            C8672v.m24878d("OMSDK", e.getMessage());
            C8582d dVar3 = new C8582d(context2);
            dVar3.mo58069a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        }
    }

    /* renamed from: a */
    private static String m5856a() {
        try {
            return C8666t.m24856a(new File(C8478e.m24306b(C8476c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e) {
            C8672v.m24874a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    private static String m5860b() {
        try {
            File file = new File(C8478e.m24306b(C8476c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (file.exists()) {
                return C8666t.m24856a(file);
            }
            return "";
        } catch (Exception e) {
            C8672v.m24874a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static String m5857a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m5860b();
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", "https://s3-us-west-2.amazonaws.com/omsdk-files/compliance-js/omid-validation-verification-script-v1.js");
    }
}
