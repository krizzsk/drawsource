package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.communication.C8868b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignalH5 implements IRewardCommunication {

    /* renamed from: a */
    protected IJSFactory f23584a;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f23584a = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f23584a = (IJSFactory) obj;
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            if (this.f23584a != null) {
                String a = this.f23584a.getIJSRewardVideoV1().mo63272a();
                if (!TextUtils.isEmpty(a)) {
                    str2 = Base64.encodeToString(a.getBytes(), 2);
                    C8672v.m24874a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    C8672v.m24874a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                C8887g.m25669a().mo58688a(obj, str2);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f23584a != null) {
                C8672v.m24874a("JS-Reward-Communication", "install:" + str);
                if (this.f23584a.getJSContainerModule().endCardShowing()) {
                    this.f23584a.getJSCommon().click(3, str);
                } else {
                    this.f23584a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "install", th);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C8672v.m24878d("JS-Reward-Communication", "openURL:" + str);
        Context g = C8388a.m23845e().mo56913g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8881a) && (windVaneWebView = ((C8881a) obj).f21883a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8672v.m24878d("JS-Reward-Communication", e.getMessage());
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
                    C8672v.m24878d("JS-Reward-Communication", e2.getMessage());
                } catch (Throwable th) {
                    C8672v.m24878d("JS-Reward-Communication", th.getMessage());
                }
            }
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f23584a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8672v.m24874a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
                this.f23584a.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f23584a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8672v.m24874a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
                this.f23584a.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f23584a != null && !TextUtils.isEmpty(str)) {
                C8887g.m25669a().mo58688a(obj, m27184a(0));
                this.f23584a.getIJSRewardVideoV1().mo63273a(new JSONObject(str).optString("state"));
                C8672v.m24874a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "triggerCloseBtn", th);
            C8887g.m25669a().mo58688a(obj, m27184a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f23584a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                C8672v.m24874a("JS-Reward-Communication", "setOrientation,state:" + str);
                this.f23584a.getIJSRewardVideoV1().mo63274b(optString);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f23584a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("msg");
                C8672v.m24874a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
                this.f23584a.getIJSRewardVideoV1().mo63275c(optString);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    /* renamed from: a */
    private String m27184a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8672v.m24878d("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    public void cai(Object obj, String str) {
        C8672v.m24874a("JS-Reward-Communication", "cai:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    C8868b.m25603a(obj, "packageName is empty");
                }
                int i = C8677z.m24934c(C8388a.m23845e().mo56913g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", C8868b.f21850b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                    jSONObject.put("data", jSONObject2);
                    C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C8868b.m25603a(obj, e.getMessage());
                    C8672v.m24874a("JS-Reward-Communication", e.getMessage());
                }
            } catch (JSONException e2) {
                C8868b.m25603a(obj, "exception: " + e2.getLocalizedMessage());
                C8672v.m24875a("JS-Reward-Communication", "cai", e2);
            } catch (Throwable th) {
                C8868b.m25603a(obj, "exception: " + th.getLocalizedMessage());
                C8672v.m24875a("JS-Reward-Communication", "cai", th);
            }
        }
    }
}
