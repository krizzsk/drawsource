package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.core.p149e.C3412h;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3110p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.y */
/* compiled from: WebHelper */
public class C3704y {

    /* renamed from: a */
    private static boolean f9600a = false;

    /* renamed from: a */
    public static void m12112a(boolean z) {
        f9600a = z;
    }

    /* renamed from: a */
    public static boolean m12113a(Context context, C3431n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, C3968c cVar, boolean z) {
        String str2;
        String str3;
        Context context2 = context;
        C3431n nVar2 = nVar;
        String str4 = str;
        if (context2 == null || nVar2 == null || i == -1) {
            return false;
        }
        C3412h ab = nVar.mo19568ab();
        if (ab != null) {
            String a = ab.mo19443a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(ab.mo19443a());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!C3898x.m12821l(context)) {
                    try {
                        if (C3513m.m10973h().mo19842c()) {
                            C3898x.m12772b(nVar, str4);
                        }
                        if (!(context2 instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        C3090e.m8924d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                        context.startActivity(intent);
                        C3110p.m9026a().mo18708a(nVar, str4);
                        return true;
                    } catch (Throwable unused) {
                        a = nVar.mo19522O();
                    }
                } else if (C3898x.m12765a(context, intent)) {
                    if (C3513m.m10973h().mo19842c()) {
                        C3898x.m12772b(nVar, str4);
                    }
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    final Context context3 = context;
                    final C3431n nVar3 = nVar;
                    final int i2 = i;
                    final String str5 = str;
                    final boolean z2 = z;
                    C2889b.m8066a(context, intent, new C2889b.C2890a() {
                        /* renamed from: a */
                        public void mo17808a() {
                        }

                        /* renamed from: a */
                        public void mo17809a(Throwable th) {
                            if (!C3513m.m10973h().mo19842c()) {
                                C3704y.m12115a(context3, nVar3.mo19522O(), nVar3, i2, str5, z2);
                                C2905l.m8115c("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", th);
                            }
                        }
                    });
                    C3090e.m8924d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                    C3110p.m9026a().mo18708a(nVar, str4);
                    return true;
                }
            }
            if (ab.mo19448c() != 2 || nVar.mo19570ad() == 5 || nVar.mo19570ad() == 15) {
                if (ab.mo19448c() == 1) {
                    a = ab.mo19446b();
                } else {
                    a = nVar.mo19522O();
                }
            } else if (cVar != null) {
                if (cVar.mo20855a()) {
                    C3090e.m8924d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else if (cVar.mo20861e()) {
                    C3090e.m8924d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else {
                    C3090e.m8924d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return false;
                }
            }
            C3090e.m8924d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
            str2 = a;
        } else {
            if (!nVar.mo19589aw() || nVar.mo19590ax() == null) {
                str3 = nVar.mo19522O();
            } else {
                str3 = nVar.mo19590ax().mo19905i();
            }
            str2 = str3;
        }
        return m12114a(context, nVar, i, tTNativeAd, tTNativeExpressAd, str, z, str2);
    }

    /* renamed from: a */
    public static boolean m12114a(Context context, C3431n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, boolean z, String str2) {
        Context context2 = context;
        if (TextUtils.isEmpty(str2) && !C3434p.m10489a(nVar)) {
            return false;
        }
        if (nVar.mo19519L() != 2) {
            C2889b.m8066a(context, m12111a(context, str2, nVar, i, tTNativeAd, tTNativeExpressAd, str, z), (C2889b.C2890a) null);
            f9600a = false;
            return true;
        } else if (!C2909o.m8134a(str2)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setData(Uri.parse(str2));
                if (!(context2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C2889b.m8066a(context, intent, (C2889b.C2890a) null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m12115a(Context context, String str, C3431n nVar, int i, String str2, boolean z) {
        try {
            context.startActivity(m12111a(context, str, nVar, i, (TTNativeAd) null, (TTNativeExpressAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m12111a(Context context, String str, C3431n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str2, boolean z) {
        Intent intent;
        if (!C3434p.m10489a(nVar) || (tTNativeAd == null && tTNativeExpressAd == null)) {
            intent = (nVar.mo19519L() != 3 || (nVar.mo19615f() != 2 && (nVar.mo19615f() != 1 || !f9600a)) || nVar.f8381a) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", m12116a(nVar, z));
            String c = C3434p.m10491c(nVar);
            if (!TextUtils.isEmpty(c)) {
                if (c.contains("?")) {
                    str = c + "&orientation=portrait";
                } else {
                    str = c + "?orientation=portrait";
                }
            }
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", nVar.mo19572af());
        intent.putExtra("web_title", nVar.mo19528U());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", nVar.mo19532Y());
        intent.putExtra("log_extra", nVar.mo19569ac());
        C3949a aVar = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, nVar.mo19520M() == null ? null : nVar.mo19520M().mo19468a());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (C3948b.m12959c()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, nVar.mo19584ar().toString());
        } else {
            C3580t.m11322a().mo20140h();
            C3580t.m11322a().mo20130a(nVar);
        }
        if (nVar.mo19570ad() == 5 || nVar.mo19570ad() == 15 || nVar.mo19570ad() == 50) {
            if (tTNativeAd != null) {
                if (tTNativeAd instanceof C3949a.C3950a) {
                    aVar = ((C3949a.C3950a) tTNativeAd).mo18856f();
                }
                if (aVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo20849a().toString());
                }
            }
            if (!(tTNativeExpressAd == null || (aVar = tTNativeExpressAd.getVideoModel()) == null)) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo20849a().toString());
            }
            if (aVar != null) {
                intent.putExtra("video_is_auto_play", aVar.f10059d);
                if (C2905l.m8116c()) {
                    C2905l.m8114c("videoDataModel", "videoDataModel=" + aVar.mo20849a().toString());
                }
            }
        }
        return intent;
    }

    /* renamed from: a */
    private static boolean m12116a(C3431n nVar, boolean z) {
        if (z && nVar != null && nVar.mo19519L() == 4 && C3434p.m10489a(nVar)) {
            return true;
        }
        return false;
    }
}
