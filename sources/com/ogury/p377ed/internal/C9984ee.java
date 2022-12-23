package com.ogury.p377ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C9989ej;
import com.smaato.sdk.video.vast.model.C11130Ad;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.ee */
public final class C9984ee {

    /* renamed from: a */
    public static final C9984ee f25116a = new C9984ee();

    /* renamed from: b */
    private static C9959do f25117b = new C9959do();

    private C9984ee() {
    }

    /* renamed from: a */
    private static void m28868a(String str) {
        C10263mq.m29882b(str, "message");
        OguryIntegrationLogger.m28106e(str);
    }

    /* renamed from: a */
    public static C9988ei m28862a(String str, C9989ej ejVar, C9999es esVar) throws C9997eq {
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        String str5;
        String str6;
        String optString;
        C10263mq.m29882b(str, "adStringResponse");
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        JSONObject jSONObject = new JSONObject(str);
        C9959do.m28749a(jSONObject);
        List arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("ad");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        int length = optJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C9981eb ebVar = new C9981eb();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject optJSONObject = jSONObject2.optJSONObject("format");
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("ad_track_urls");
                String optString2 = jSONObject2.optString("ad_content");
                C10263mq.m29879a((Object) optString2, "adJson.optString(\"ad_content\")");
                ebVar.mo64507c(optString2);
                String optString3 = jSONObject2.optString(CampaignEx.JSON_KEY_IMPRESSION_URL);
                C10263mq.m29879a((Object) optString3, "adJson.optString(\"impression_url\")");
                ebVar.mo64513e(optString3);
                String optString4 = jSONObject2.optString("id");
                C10263mq.m29879a((Object) optString4, "adJson.optString(\"id\")");
                ebVar.mo64504b(optString4);
                JSONObject optJSONObject3 = jSONObject2.optJSONObject(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER);
                String str7 = "";
                if (optJSONObject3 == null || (str2 = optJSONObject3.optString("id")) == null) {
                    str2 = str7;
                }
                ebVar.mo64516f(str2);
                String optString5 = jSONObject2.optString("campaign_id");
                C10263mq.m29879a((Object) optString5, "adJson.optString(\"campaign_id\")");
                ebVar.mo64519g(optString5);
                if (optJSONObject == null || (str3 = optJSONObject.optString("webview_base_url")) == null) {
                    str3 = str7;
                }
                ebVar.mo64521h(str3);
                if (optJSONObject == null || (str4 = optJSONObject.optString("mraid_download_url")) == null) {
                    str4 = str7;
                }
                ebVar.mo64527k(str4);
                ebVar.mo64505b(jSONObject2.optBoolean(CampaignEx.KEY_OMID, false));
                ebVar.mo64508c(jSONObject2.optBoolean("is_video", false));
                ebVar.mo64500a(m28865a(jSONObject2.optJSONObject("overlay"), esVar));
                ebVar.mo64497a(m28863a(jSONObject2.optJSONObject("ad_unit"), jSONObject2.optString("id")));
                C10263mq.m29879a((Object) jSONObject2, "adJson");
                ebVar.mo64510d(m28866a(TJAdUnitConstants.String.ORIENTATION, jSONObject2));
                if (optJSONObject == null) {
                    jSONArray = null;
                } else {
                    jSONArray = optJSONObject.optJSONArray("params");
                }
                ebVar.mo64525j(m28867a(jSONArray));
                ebVar.mo64523i(m28869b(jSONObject2));
                ebVar.mo64502a(jSONObject2.optBoolean("has_transparency", false));
                String optString6 = jSONObject2.optString("sdk_close_button_url", str7);
                C10263mq.m29879a((Object) optString6, "adJson.optString(\"sdk_close_button_url\", \"\")");
                ebVar.mo64529l(optString6);
                String optString7 = jSONObject2.optString("landing_page_prefetch_url", str7);
                C10263mq.m29879a((Object) optString7, "adJson.optString(\"landing_page_prefetch_url\", \"\")");
                ebVar.mo64531m(optString7);
                ebVar.mo64511d(jSONObject2.optBoolean("landing_page_disable_javascript", false));
                String optString8 = jSONObject2.optString("landing_page_prefetch_whitelist", str7);
                C10263mq.m29879a((Object) optString8, "adJson.optString(\"landin…_prefetch_whitelist\", \"\")");
                ebVar.mo64532n(optString8);
                ebVar.mo64517f(jSONObject2.optBoolean("ad_keep_alive", false));
                ebVar.mo64501a(C10263mq.m29874a(UUID.randomUUID().toString(), (Object) ebVar.mo64518g()));
                ebVar.mo64514e(!jSONObject2.has("overlay") && !jSONObject2.has("banner"));
                ebVar.mo64496a(ejVar);
                if (C10263mq.m29881a((Object) ebVar.mo64530m().mo64577c(), (Object) ejVar.mo64568a())) {
                    arrayList.add(ebVar);
                } else {
                    C9989ej.C9990a aVar = C9989ej.f25126a;
                    m28868a("[Ads][" + ejVar.mo64569b() + "][load][" + ebVar.mo64530m().mo64573a() + "] Wrong ad unit id type. Expected ad unit id of type " + ejVar.mo64569b() + ", but received ad unit id of type " + C9989ej.C9990a.m28913a(ebVar.mo64530m().mo64577c()) + '.');
                }
                if (optJSONObject2 == null || (str5 = optJSONObject2.optString("ad_track_url")) == null) {
                    str5 = str7;
                }
                ebVar.mo64534o(str5);
                if (optJSONObject2 == null || (str6 = optJSONObject2.optString("ad_precache_url")) == null) {
                    str6 = str7;
                }
                ebVar.mo64536p(str6);
                if (!(optJSONObject2 == null || (optString = optJSONObject2.optString("ad_history_url")) == null)) {
                    str7 = optString;
                }
                ebVar.mo64539q(str7);
                ebVar.mo64498a(m28864a(jSONObject2.optJSONObject("banner")));
                ebVar.mo64499a(m28870c(jSONObject2));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new C9988ei(arrayList);
    }

    /* renamed from: a */
    private static C9991ek m28863a(JSONObject jSONObject, String str) {
        C9991ek ekVar = new C9991ek();
        if (jSONObject == null) {
            return ekVar;
        }
        String optString = jSONObject.optString("id");
        String str2 = "";
        if (optString == null) {
            optString = str2;
        }
        ekVar.mo64574a(optString);
        if (str == null) {
            str = str2;
        }
        ekVar.mo64576b(str);
        String optString2 = jSONObject.optString("type");
        if (optString2 == null) {
            optString2 = str2;
        }
        ekVar.mo64578c(optString2);
        if (C10263mq.m29881a((Object) ekVar.mo64577c(), (Object) "optin_video")) {
            String optString3 = jSONObject.optString("app_user_id");
            if (optString3 == null) {
                optString3 = str2;
            }
            ekVar.mo64582e(optString3);
            String optString4 = jSONObject.optString("reward_launch");
            if (optString4 == null) {
                optString4 = str2;
            }
            ekVar.mo64580d(optString4);
            RewardItem e = ekVar.mo64581e();
            String optString5 = jSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME);
            if (optString5 == null) {
                optString5 = str2;
            }
            e.setName(optString5);
            RewardItem e2 = ekVar.mo64581e();
            String optString6 = jSONObject.optString("reward_value");
            if (optString6 != null) {
                str2 = optString6;
            }
            e2.setValue(str2);
        }
        return ekVar;
    }

    /* renamed from: a */
    private static C9993em m28864a(JSONObject jSONObject) {
        C9993em emVar = new C9993em();
        if (jSONObject == null) {
            return new C9993em();
        }
        emVar.mo64584a(jSONObject.optBoolean("full_width", false));
        emVar.mo64586b(jSONObject.optBoolean("auto_refresh", false));
        emVar.mo64583a(jSONObject.optInt("auto_refresh_rate", 0));
        return emVar;
    }

    /* renamed from: b */
    private static String m28869b(JSONObject jSONObject) {
        String str = "";
        String optString = jSONObject.optString("client_tracker_pattern", str);
        if (!C10263mq.m29881a((Object) optString, (Object) "null")) {
            str = optString;
        }
        C10263mq.m29879a((Object) str, "clientTrackerPattern");
        return str;
    }

    /* renamed from: a */
    private static String m28867a(JSONArray jSONArray) {
        int i;
        JSONObject optJSONObject;
        String optString;
        if (jSONArray != null && jSONArray.length() - 1 >= 0) {
            while (true) {
                int i2 = i - 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (C10263mq.m29881a((Object) jSONObject.getString("name"), (Object) "zones")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("value");
                    if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (optString = optJSONObject.optString("name")) == null) {
                        return "";
                    }
                    return optString;
                } else if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static String m28866a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("params");
        if (optJSONArray == null) {
            return "";
        }
        int i = 0;
        int length = optJSONArray.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (C10263mq.m29881a((Object) jSONObject2.getString("name"), (Object) str)) {
                    String string = jSONObject2.getString("value");
                    C10263mq.m29879a((Object) string, "paramElement.getString(\"value\")");
                    return string;
                } else if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static C10000et m28865a(JSONObject jSONObject, C9999es esVar) {
        JSONObject jSONObject2;
        Integer num;
        C10000et etVar = new C10000et();
        if (esVar == null) {
            return etVar;
        }
        boolean z = true;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("draggable", true);
        }
        etVar.mo64598a(z);
        Integer num2 = null;
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("initial_size");
        }
        if (jSONObject2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(jSONObject2.optInt("width"));
        }
        etVar.mo64597a(C10054gi.m29196b(num == null ? esVar.mo64595a() : num.intValue()));
        if (jSONObject2 != null) {
            num2 = Integer.valueOf(jSONObject2.getInt("height"));
        }
        etVar.mo64601b(C10054gi.m29196b(num2 == null ? esVar.mo64596b() : num2.intValue()));
        return etVar;
    }

    /* renamed from: c */
    private static C9994en m28870c(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_impression", false);
        String optString = jSONObject.optString("impression_source", "");
        C9996ep epVar = C9996ep.f25149a;
        C10263mq.m29879a((Object) optString, "impressionSourceString");
        return new C9994en(optBoolean, C9996ep.m28933a(optString));
    }
}
