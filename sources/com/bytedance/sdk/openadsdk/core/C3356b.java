package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3405c;
import com.bytedance.sdk.openadsdk.core.p149e.C3406d;
import com.bytedance.sdk.openadsdk.core.p149e.C3408f;
import com.bytedance.sdk.openadsdk.core.p149e.C3412h;
import com.bytedance.sdk.openadsdk.core.p149e.C3413i;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3430m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3480b;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.p156a.C3478d;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.b */
/* compiled from: AdInfoFactory */
public class C3356b {
    /* renamed from: a */
    private static int m9929a(C2400b bVar, boolean z) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.mo15953i())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(bVar.mo15951h())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    /* renamed from: a */
    private static int m9930a(C3405c cVar) {
        return cVar == null ? TTAdConstant.DOWNLOAD_APP_INFO_CODE : TextUtils.isEmpty(cVar.mo19400a()) ? 408 : 200;
    }

    /* renamed from: a */
    private static int m9931a(C3412h hVar) {
        if (hVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hVar.mo19443a())) {
            return 403;
        }
        return TextUtils.isEmpty(hVar.mo19446b()) ? TTAdConstant.DEEPLINK_FALLBACK_CODE : (hVar.mo19448c() == 1 || hVar.mo19448c() == 2) ? 200 : 405;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r0 != 50) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9932a(com.bytedance.sdk.openadsdk.core.p149e.C3431n r6) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r6.mo19532Y()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r6.mo19532Y()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L_0x001e
            goto L_0x00b2
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.e.h r1 = r6.mo19568ab()
            int r1 = m9931a((com.bytedance.sdk.openadsdk.core.p149e.C3412h) r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x002b
            return r1
        L_0x002b:
            boolean r3 = r6.mo19591ay()
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r6.mo19592az()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            r2 = 0
            java.lang.String r3 = "banner_ad"
            java.lang.String r4 = "load_html_fail"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8919b((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r6, (java.lang.String) r3, (java.lang.String) r4, (org.json.JSONObject) r2)
            return r0
        L_0x004a:
            int r0 = r6.mo19519L()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0063
            if (r0 == r3) goto L_0x0058
            goto L_0x0078
        L_0x0058:
            com.bytedance.sdk.openadsdk.core.e.c r0 = r6.mo19567aa()
            int r1 = m9930a((com.bytedance.sdk.openadsdk.core.p149e.C3405c) r0)
            if (r1 == r2) goto L_0x0078
            return r1
        L_0x0063:
            boolean r0 = m9942b((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r6)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r6.mo19522O()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            r6 = 406(0x196, float:5.69E-43)
            return r6
        L_0x0078:
            boolean r0 = r6.mo19589aw()
            if (r0 != 0) goto L_0x00b1
            int r0 = r6.mo19570ad()
            if (r0 == r5) goto L_0x00a7
            if (r0 == r4) goto L_0x00a7
            if (r0 == r3) goto L_0x00a7
            r3 = 5
            if (r0 == r3) goto L_0x0098
            r3 = 15
            if (r0 == r3) goto L_0x0098
            r3 = 16
            if (r0 == r3) goto L_0x00a7
            r3 = 50
            if (r0 == r3) goto L_0x0098
            goto L_0x00b1
        L_0x0098:
            com.bykv.vk.openvk.component.video.api.c.b r0 = r6.mo19517J()
            boolean r6 = r6.mo19589aw()
            int r1 = m9929a((com.bykv.p054vk.openvk.component.video.api.p071c.C2400b) r0, (boolean) r6)
            if (r1 == r2) goto L_0x00b1
            return r1
        L_0x00a7:
            java.util.List r6 = r6.mo19523P()
            int r1 = m9933a((java.util.List<com.bytedance.sdk.openadsdk.core.p149e.C3417k>) r6)
            if (r1 == r2) goto L_0x00b1
        L_0x00b1:
            return r1
        L_0x00b2:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3356b.m9932a(com.bytedance.sdk.openadsdk.core.e.n):int");
    }

    /* renamed from: a */
    private static int m9933a(List<C3417k> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (C3417k next : list) {
            if (next == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(next.mo19468a())) {
                return 412;
            }
        }
        return 200;
    }

    /* renamed from: a */
    public static Pair<C3402a, ArrayList<Integer>> m9934a(JSONObject jSONObject, AdSlot adSlot, C3433o oVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C3402a aVar = new C3402a();
            aVar.mo19385a(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
            aVar.mo19382a(jSONObject.optInt("ret"));
            aVar.mo19387b(jSONObject.optString("message"));
            String optString = jSONObject.optString("auction_price");
            if (aVar.mo19381a() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C3431n b = m9941b(optJSONArray.optJSONObject(i), adSlot, oVar);
                    int a = m9932a(b);
                    if (a != 200) {
                        arrayList.add(Integer.valueOf(a));
                    } else {
                        b.mo19604c(optString);
                        aVar.mo19384a(b);
                    }
                }
            }
            return new Pair<>(aVar, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C3431n m9935a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m9941b(jSONObject, (AdSlot) null, (C3433o) null);
    }

    /* renamed from: a */
    private static C3473a m9936a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c = C3904y.m12877c(C3513m.m10963a());
        int d = C3904y.m12881d(C3513m.m10963a());
        if (i == 2) {
            int i2 = d;
            d = c;
            c = i2;
        }
        return new C3478d(C3513m.m10963a(), c, d).mo19909b(str, (List<C3487c>) new ArrayList());
    }

    /* renamed from: a */
    private static void m9937a(C3431n nVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            C3090e.m8919b(C3513m.m10963a(), nVar, str, "load_vast_fail", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m9938a(C3431n nVar, String str, C3473a aVar, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "load_vast_fail";
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.mo19905i()) && !TextUtils.isEmpty(aVar.mo19901f())) {
                    if (aVar.mo19904h() > 0.0d) {
                        jSONObject.put("duration", System.currentTimeMillis() - j);
                        str2 = "load_vast_success";
                    }
                }
                jSONObject.put("reason_code", -3);
            } else {
                jSONObject.put("reason_code", -2);
                jSONObject.put("error_code", C3480b.f8691e);
            }
            C3090e.m8919b(C3513m.m10963a(), nVar, str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m9939a(C3473a aVar, C3431n nVar) {
        aVar.mo19889a(nVar);
        int L = nVar.mo19519L();
        if (!(L == 2 || L == 3)) {
            nVar.mo19653r(2);
        }
        nVar.mo19608d(1);
        nVar.mo19606c(true);
        nVar.mo19552a(aVar);
        if (!TextUtils.isEmpty(aVar.mo19897d())) {
            nVar.mo19623h(aVar.mo19897d());
        }
        if (!TextUtils.isEmpty(aVar.mo19899e())) {
            nVar.mo19627i(aVar.mo19899e());
        }
        nVar.mo19617f(aVar.mo19901f());
        C3417k kVar = null;
        nVar.mo19543a((C3405c) null);
        C2400b J = nVar.mo19517J();
        if (J == null) {
            J = new C2400b();
        }
        J.mo15939c(aVar.mo19903g());
        J.mo15930a(aVar.mo19904h());
        J.mo15936b((String) null);
        J.mo15942d((String) null);
        nVar.mo19540a(J);
        if (aVar.mo19893b() != null) {
            kVar = new C3417k();
            kVar.mo19470a(aVar.mo19893b().mo19939e());
            kVar.mo19469a(aVar.mo19893b().mo19935b());
            kVar.mo19473b(aVar.mo19893b().mo19937c());
        }
        nVar.mo19548a(kVar);
    }

    /* renamed from: b */
    private static C3406d m9940b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        C3406d dVar = new C3406d();
        dVar.mo19414a(optInt);
        dVar.mo19416b(optInt2);
        return dVar;
    }

    /* renamed from: b */
    public static C3431n m9941b(JSONObject jSONObject, AdSlot adSlot, C3433o oVar) {
        C3473a aVar;
        if (jSONObject == null) {
            return null;
        }
        C3431n nVar = new C3431n();
        nVar.mo19653r(jSONObject.optInt("interaction_type"));
        nVar.mo19617f(jSONObject.optString("target_url"));
        nVar.mo19633k(jSONObject.optString("ad_id"));
        nVar.mo19636l(jSONObject.optString("app_log_url"));
        nVar.mo19613e(jSONObject.optString("source"));
        nVar.mo19661v(jSONObject.optInt("dislike_control", 0));
        nVar.mo19638m(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        nVar.mo19642n(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("set_click_type");
            nVar.mo19594b(optJSONObject.optDouble(SDKConstants.PARAM_GAME_REQUESTS_CTA, 2.0d));
            nVar.mo19535a(optJSONObject.optDouble("other", 1.0d));
        }
        nVar.mo19605c(jSONObject.optJSONObject(ShareConstants.MEDIA_EXTENSION));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(RewardPlus.ICON);
        nVar.mo19600b(jSONObject.optBoolean("screenshot", false));
        nVar.mo19632k(jSONObject.optInt("play_bar_style", 0));
        nVar.mo19644o(jSONObject.optString("market_url", ""));
        nVar.mo19626i(jSONObject.optInt("video_adaptation", 0));
        nVar.mo19616f(jSONObject.optInt("feed_video_opentype", 0));
        nVar.mo19555a(jSONObject.optJSONObject("session_params"));
        nVar.mo19604c(jSONObject.optString("auction_price", ""));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("render");
        if (optJSONObject3 != null) {
            nVar.mo19619g(optJSONObject3.optInt("render_sequence", 0));
            nVar.mo19622h(optJSONObject3.optInt("backup_render_control", 1));
        }
        nVar.mo19608d(jSONObject.optInt("render_control", oVar != null ? oVar.f8445f : 1));
        if (optJSONObject2 != null) {
            C3417k kVar = new C3417k();
            kVar.mo19470a(optJSONObject2.optString("url"));
            kVar.mo19473b(optJSONObject2.optInt("height"));
            kVar.mo19469a(optJSONObject2.optInt("width"));
            nVar.mo19548a(kVar);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject4 != null) {
            nVar.mo19602c(optJSONObject4.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            nVar.mo19553a(optJSONObject4.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject5 != null) {
            C3417k kVar2 = new C3417k();
            kVar2.mo19470a(optJSONObject5.optString("url"));
            kVar2.mo19473b(optJSONObject5.optInt("height"));
            kVar2.mo19469a(optJSONObject5.optInt("width"));
            nVar.mo19597b(kVar2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C3417k kVar3 = new C3417k();
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                kVar3.mo19470a(optJSONObject6.optString("url"));
                kVar3.mo19473b(optJSONObject6.optInt("height"));
                kVar3.mo19469a(optJSONObject6.optInt("width"));
                kVar3.mo19471a(optJSONObject6.optBoolean("image_preview"));
                kVar3.mo19474b(optJSONObject6.optString("image_key"));
                nVar.mo19603c(kVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                nVar.mo19525R().add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                nVar.mo19526S().add(optJSONArray3.optString(i3));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                nVar.mo19527T().add(optJSONArray4.optString(i4));
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("click_area");
        if (optJSONObject7 != null) {
            C3408f fVar = new C3408f();
            fVar.f8216a = optJSONObject7.optBoolean("click_upper_content_area", true);
            fVar.f8217b = optJSONObject7.optBoolean("click_upper_non_content_area", true);
            fVar.f8218c = optJSONObject7.optBoolean("click_lower_content_area", true);
            fVar.f8219d = optJSONObject7.optBoolean("click_lower_non_content_area", true);
            fVar.f8220e = optJSONObject7.optBoolean("click_button_area", true);
            fVar.f8221f = optJSONObject7.optBoolean("click_video_area", true);
            nVar.mo19545a(fVar);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("adslot");
        if (optJSONObject8 != null) {
            adSlot = m9943c(optJSONObject8);
        }
        nVar.mo19541a(adSlot);
        nVar.mo19635l(jSONObject.optInt("intercept_flag", 0));
        nVar.mo19620g(jSONObject.optString("phone_num"));
        nVar.mo19623h(jSONObject.optString("title"));
        nVar.mo19627i(jSONObject.optString("description"));
        nVar.mo19630j(jSONObject.optString("button_text"));
        nVar.mo19629j(jSONObject.optInt("ad_logo", 1));
        nVar.mo19639m(jSONObject.optString("ext"));
        nVar.mo19647p(jSONObject.optInt("cover_click_area", 0));
        nVar.mo19655s(jSONObject.optInt("image_mode"));
        nVar.mo19659u(jSONObject.optInt(TJAdUnitConstants.String.ORIENTATION, 1));
        nVar.mo19536a((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nVar.mo19647p(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject9 = jSONObject.optJSONObject(TapjoyConstants.TJC_APP_PLACEMENT);
        JSONObject optJSONObject10 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        nVar.mo19543a(m9945e(optJSONObject9));
        nVar.mo19549a(m9946f(jSONObject.optJSONObject("interaction_method_params")));
        nVar.mo19546a(m9948h(optJSONObject10));
        nVar.mo19551a(new C3434p(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                FilterWord d = m9944d(optJSONArray5.optJSONObject(i5));
                if (d != null && d.isValid()) {
                    nVar.mo19542a(d);
                }
            }
        }
        nVar.mo19657t(jSONObject.optInt("count_down"));
        nVar.mo19539a(jSONObject.optLong("expiration_time"));
        nVar.mo19508B(jSONObject.optInt("video_encode_type", 0));
        nVar.mo19506A(jSONObject.optInt("player_type", 0));
        JSONObject optJSONObject11 = jSONObject.optJSONObject("video");
        if (optJSONObject11 != null) {
            nVar.mo19540a(m9949i(optJSONObject11));
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject12 != null) {
            nVar.mo19596b(m9949i(optJSONObject12));
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject13 != null) {
            nVar.mo19547a(m9947g(optJSONObject13));
        }
        nVar.mo19554a(m9950j(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject14 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject14 != null) {
            C3431n.C3432a aVar2 = new C3431n.C3432a();
            aVar2.mo19673b(optJSONObject14.optString("id"));
            aVar2.mo19675c(optJSONObject14.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5));
            aVar2.mo19677d(optJSONObject14.optString("url"));
            aVar2.mo19679e(optJSONObject14.optString("data"));
            aVar2.mo19681f(optJSONObject14.optString("diff_data"));
            aVar2.mo19683g(optJSONObject14.optString("dynamic_creative"));
            aVar2.mo19671a(optJSONObject14.optString("version"));
            nVar.mo19550a(aVar2);
        }
        nVar.mo19609d(jSONObject.optString("creative_extra"));
        nVar.mo19612e(jSONObject.optInt("if_block_lp", 0));
        nVar.mo19641n(jSONObject.optInt("cache_sort", 1));
        nVar.mo19643o(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject15 != null) {
            nVar.mo19544a(m9940b(optJSONObject15));
        }
        nVar.mo19663w(jSONObject.optInt("is_package_open", 1));
        nVar.mo19598b(jSONObject.optString("ad_info", (String) null));
        nVar.mo19650q(jSONObject.optInt("ua_policy", 2));
        nVar.mo19665x(jSONObject.optInt("playable_duration_time", 20));
        nVar.mo19667y(jSONObject.optInt("playable_endcard_close_time", -1));
        nVar.mo19669z(jSONObject.optInt("endcard_close_time", -1));
        nVar.mo19537a(jSONObject.optInt("interaction_method"));
        nVar.mo19610d(jSONObject.optBoolean("is_html"));
        nVar.mo19648p(jSONObject.optString("dsp_html"));
        if (jSONObject.optBoolean("is_vast", false)) {
            if (jSONObject.has("vast_json")) {
                aVar = C3473a.m10781a(jSONObject.optJSONObject("vast_json"));
            } else {
                String b = C3898x.m12769b(C3898x.m12790e(nVar));
                String optString = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString)) {
                    m9937a(nVar, b);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                aVar = m9936a(optString, nVar.mo19579am());
                m9938a(nVar, b, aVar, currentTimeMillis);
                if (aVar != null) {
                    aVar.mo19902f(b);
                }
            }
            if (aVar == null) {
                return null;
            }
            m9939a(aVar, nVar);
        }
        return nVar;
    }

    /* renamed from: b */
    private static boolean m9942b(C3431n nVar) {
        return !nVar.mo19589aw() && !nVar.mo19591ay();
    }

    /* renamed from: c */
    private static AdSlot m9943c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("mCodeId", "");
        int optInt = jSONObject2.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject2.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject2.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject2.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject2.optString("mRewardName", "");
        int optInt4 = jSONObject2.optInt("mRewardAmount", 0);
        String optString3 = jSONObject2.optString("mMediaExtra", "");
        String optString4 = jSONObject2.optString("mUserID", "");
        jSONObject2.optInt("mOrientation", 2);
        int optInt5 = jSONObject2.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject2.optBoolean("mIsExpressAd", false);
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject2.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject2.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(jSONObject2.optBoolean("mIsAutoPlay", false)).isExpressAd(optBoolean2).withBid(jSONObject2.optString("mBidAdm", "")).build();
    }

    /* renamed from: d */
    private static FilterWord m9944d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord d = m9944d(optJSONArray.optJSONObject(i));
                    if (d != null && d.isValid()) {
                        filterWord.addOption(d);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static C3405c m9945e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3405c cVar = new C3405c();
        cVar.mo19406b(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        cVar.mo19408c(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        cVar.mo19403a(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        cVar.mo19401a(jSONObject.optDouble("score", -1.0d));
        cVar.mo19402a(jSONObject.optInt("comment_num", -1));
        cVar.mo19405b(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        return cVar;
    }

    /* renamed from: f */
    private static C3430m m9946f(JSONObject jSONObject) {
        C3430m mVar = new C3430m();
        if (jSONObject == null) {
            mVar.mo19500a(10);
            mVar.mo19503b(20);
            mVar.mo19501a("");
            return mVar;
        }
        mVar.mo19500a(jSONObject.optLong("onlylp_loading_maxtime", 10));
        mVar.mo19503b(jSONObject.optLong("straight_lp_showtime", 20));
        mVar.mo19501a(jSONObject.optString("loading_text", ""));
        return mVar;
    }

    /* renamed from: g */
    private static C3413i m9947g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3413i iVar = new C3413i();
        iVar.mo19450a(jSONObject.optInt("if_send_click", 0));
        return iVar;
    }

    /* renamed from: h */
    private static C3412h m9948h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3412h hVar = new C3412h();
        hVar.mo19445a(jSONObject.optString("deeplink_url"));
        hVar.mo19447b(jSONObject.optString("fallback_url"));
        hVar.mo19444a(jSONObject.optInt("fallback_type"));
        return hVar;
    }

    /* renamed from: i */
    private static C2400b m9949i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2400b bVar = new C2400b();
        bVar.mo15935b(jSONObject.optInt("cover_height"));
        bVar.mo15938c(jSONObject.optInt("cover_width"));
        bVar.mo15933a(jSONObject.optString("resolution"));
        bVar.mo15932a(jSONObject.optLong("size"));
        bVar.mo15930a(jSONObject.optDouble("video_duration", 0.0d));
        bVar.mo15936b(jSONObject.optString("cover_url"));
        bVar.mo15939c(jSONObject.optString("video_url"));
        bVar.mo15942d(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        bVar.mo15945e(jSONObject.optString("playable_download_url"));
        bVar.mo15948f(jSONObject.optString("file_hash"));
        int i = 0;
        bVar.mo15952h(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.mo15954i(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.mo15931a(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.mo15944e(jSONObject.optInt("video_preload_size", 307200));
        bVar.mo15947f(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.mo15950g(jSONObject.optInt("execute_cached_type", 0));
        if (jSONObject.optDouble("endcard_render", 0.0d) == 1.0d) {
            i = 1;
        }
        bVar.mo15941d(i);
        return bVar;
    }

    /* renamed from: j */
    private static Map<String, Object> m9950j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b$a */
    /* compiled from: AdInfoFactory */
    static class C3357a {
        C3357a() {
        }

        /* renamed from: a */
        public static C3357a m9951a() {
            return new C3357a();
        }

        /* renamed from: a */
        public C3357a mo19290a(boolean z) {
            if (z) {
                m9952a(300);
            }
            return this;
        }

        /* renamed from: b */
        public C3357a mo19291b(boolean z) {
            if (z) {
                m9952a((int) ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR);
            }
            return this;
        }

        /* renamed from: c */
        public C3357a mo19292c(boolean z) {
            if (z) {
                m9952a(302);
            }
            return this;
        }

        /* renamed from: d */
        public C3357a mo19293d(boolean z) {
            if (z) {
                m9952a((int) ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
            }
            return this;
        }

        /* renamed from: e */
        public C3357a mo19294e(boolean z) {
            if (z) {
                m9952a((int) ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR);
            }
            return this;
        }

        /* renamed from: f */
        public C3357a mo19295f(boolean z) {
            if (z) {
                m9952a((int) IronSourceConstants.OFFERWALL_OPENED);
            }
            return this;
        }

        /* renamed from: a */
        private void m9952a(final int i) {
            C3513m.m10974i().mo20586a(new C3750a() {
                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    return C3752b.m12257b().mo20544a("creative_error").mo20545b(i).mo20546b(C3446g.m10554b(i));
                }
            });
        }

        /* renamed from: a */
        public static void m9953a(C3402a aVar) {
            if (aVar != null && aVar.mo19386b() != null && !aVar.mo19386b().isEmpty()) {
                for (C3431n next : aVar.mo19386b()) {
                    boolean z = false;
                    C3357a d = m9951a().mo19290a(TextUtils.isEmpty(next.mo19528U())).mo19291b(TextUtils.isEmpty(next.mo19529V())).mo19292c(TextUtils.isEmpty(next.mo19531X())).mo19295f(next.mo19520M() == null || TextUtils.isEmpty(next.mo19520M().mo19468a())).mo19293d(next.mo19567aa() == null || next.mo19567aa().mo19409d() == -1.0d || m9954a(next));
                    if (next.mo19567aa() == null || next.mo19567aa().mo19410e() == -1 || m9955b(next)) {
                        z = true;
                    }
                    d.mo19294e(z);
                }
            }
        }

        /* renamed from: a */
        public static boolean m9954a(C3431n nVar) {
            try {
                double optDouble = new JSONObject(nVar.mo19514G().mo19682g()).optDouble("score_exact_i18n", -1.0d);
                return optDouble < 0.0d || optDouble > 5.0d;
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public static boolean m9955b(C3431n nVar) {
            try {
                return new JSONObject(nVar.mo19514G().mo19682g()).optInt("comment_num_i18n", -1) < 0;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
