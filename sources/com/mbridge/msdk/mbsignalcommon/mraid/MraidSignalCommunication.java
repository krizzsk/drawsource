package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.p218b.C6782a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import org.json.JSONObject;

public class MraidSignalCommunication extends AbsFeedBackForH5 {

    /* renamed from: d */
    private C8873b f21853d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C8873b) {
                this.f21853d = (C8873b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C8873b)) {
                this.f21853d = (C8873b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof C8873b)) {
                this.f21853d = (C8873b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof C8881a) {
            C8881a aVar = (C8881a) obj;
            windVaneWebView = aVar.f21883a;
            C8871a.C8872a.f21854a.mo58632a((WebView) aVar.f21883a, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            C8672v.m24878d("MraidSignalCommunication", "MRAID Open " + optString);
            if (this.f21853d != null && !TextUtils.isEmpty(optString)) {
                if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= ((long) C6782a.f17892c) || !C6782a.m20651a(this.f21853d.getMraidCampaign(), windVaneWebView.getUrl(), C6782a.f17890a)) {
                    this.f21853d.open(optString);
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void close(Object obj, String str) {
        if (obj instanceof C8881a) {
            C8871a.C8872a.f21854a.mo58632a((WebView) ((C8881a) obj).f21883a, "close");
        }
        try {
            C8672v.m24878d("MraidSignalCommunication", "MRAID close");
            if (this.f21853d != null) {
                this.f21853d.close();
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof C8881a) {
            C8871a.C8872a.f21854a.mo58632a((WebView) ((C8881a) obj).f21883a, MraidJsMethods.UNLOAD);
        }
        try {
            C8672v.m24878d("MraidSignalCommunication", "MRAID unload");
            if (this.f21853d != null) {
                this.f21853d.unload();
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof C8881a) {
            C8871a.C8872a.f21854a.mo58632a((WebView) ((C8881a) obj).f21883a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            C8672v.m24878d("MraidSignalCommunication", "MRAID useCustomClose " + optString);
            if (!TextUtils.isEmpty(optString) && this.f21853d != null) {
                this.f21853d.useCustomClose(optString.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof C8881a) {
            C8871a.C8872a.f21854a.mo58632a((WebView) ((C8881a) obj).f21883a, MraidJsMethods.EXPAND);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            C8672v.m24878d("MraidSignalCommunication", "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f21853d != null) {
                this.f21853d.expand(optString, optString2.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof C8881a) {
            C8871a.C8872a.f21854a.mo58632a((WebView) ((C8881a) obj).f21883a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            C8672v.m24878d("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f21853d != null) {
                optString.toLowerCase().equals("true");
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode == 729267099) {
                    str2 = "portrait";
                } else if (hashCode == 1430647483) {
                    str2 = "landscape";
                } else {
                    return;
                }
                boolean equals = lowerCase.equals(str2);
            }
        } catch (Throwable th) {
            C8672v.m24875a("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }
}
