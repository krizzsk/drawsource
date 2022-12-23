package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.a */
/* compiled from: CommonBannerSignalCommunicationImp */
public abstract class C8867a implements C8870c {

    /* renamed from: a */
    public static final String f21848a = C8867a.class.getSimpleName();

    /* renamed from: f */
    public void mo58613f(Object obj, String str) {
        try {
            if (obj instanceof C8881a) {
                C8887g.m25669a().mo58686a(((C8881a) obj).f21883a);
            }
        } catch (Throwable th) {
            C8672v.m24875a(f21848a, "onSignalCommunication", th);
        }
    }

    /* renamed from: c */
    public void mo58385c(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "readyStatus: " + str);
    }

    /* renamed from: a */
    public void mo58382a(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "init: " + str);
    }

    /* renamed from: b */
    public void mo58384b(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "click: " + str);
    }

    /* renamed from: d */
    public void mo58386d(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "toggleCloseBtn: " + str);
    }

    /* renamed from: e */
    public void mo58387e(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "triggerCloseBtn: " + str);
    }

    /* renamed from: i */
    public void mo58388i(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "sendImpressions: " + str);
    }

    /* renamed from: k */
    public final void mo58616k(Object obj, String str) {
        C8672v.m24874a(f21848a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    String optString = jSONObject.optString("url");
                    int optInt2 = jSONObject.optInt(ReportDBAdapter.ReportColumns.TABLE_NAME);
                    if (optInt2 == 0) {
                        C6765a.m20557a(C8388a.m23845e().mo56913g(), (CampaignEx) null, "", optString, false, optInt != 0);
                    } else {
                        C6765a.m20558a(C8388a.m23845e().mo56913g(), (CampaignEx) null, "", optString, false, optInt != 0, optInt2);
                    }
                }
                C8887g.m25669a().mo58688a(obj, C8868b.m25602a(0));
            } catch (Throwable th) {
                C8672v.m24875a(f21848a, "reportUrls", th);
            }
        }
    }

    /* renamed from: l */
    public final void mo58617l(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "increaseOfferFrequence:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                C8868b.m25604a(obj, new JSONObject(str));
            } catch (Throwable th) {
                C8672v.m24875a(f21848a, "increaseOfferFrequence", th);
            }
        }
    }

    /* renamed from: h */
    public void mo58615h(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "resetCountdown: " + str);
    }

    /* renamed from: m */
    public final void mo58618m(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "handlerH5Exception: " + str);
    }

    /* renamed from: g */
    public void mo58614g(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "install: " + str);
    }

    /* renamed from: n */
    public final void mo58619n(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f21848a;
        C8672v.m24878d(str2, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
            return;
        }
        Context g = C8388a.m23845e().mo56913g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8881a) && (windVaneWebView = ((C8881a) obj).f21883a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8672v.m24878d(f21848a, e.getMessage());
                }
            }
            if (g != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C6779b.m20645a(g, optString);
                    } else if (optInt == 2) {
                        C6779b.m20647b(g, optString);
                    }
                } catch (JSONException e2) {
                    C8672v.m24878d(f21848a, e2.getMessage());
                } catch (Throwable th) {
                    C8672v.m24878d(f21848a, th.getMessage());
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo58620o(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f21848a;
        C8672v.m24878d(str2, "getNetstat:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
            return;
        }
        Context g = C8388a.m23845e().mo56913g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8881a) && (windVaneWebView = ((C8881a) obj).f21883a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8672v.m24878d(f21848a, e.getMessage());
                }
            }
            if (g == null) {
                C8887g.m25669a().mo58688a(obj, C8868b.m25602a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", C8660r.m24840o(g));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                C8887g.m25669a().mo58688a(obj, jSONObject2);
            } catch (Throwable th) {
                C8672v.m24878d(f21848a, th.getMessage());
                C8887g.m25669a().mo58688a(obj, C8868b.m25602a(1));
            }
        }
    }

    /* renamed from: j */
    public void mo58389j(Object obj, String str) {
        String str2 = f21848a;
        C8672v.m24874a(str2, "getFileInfo:" + str);
    }
}
