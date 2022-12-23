package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.communication.C8868b;
import com.mbridge.msdk.mbsignalcommon.p339b.C8852a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignal extends AbsFeedBackForH5 implements IRewardCommunication {

    /* renamed from: d */
    protected IRewardCommunication f23583d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(context, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f23583d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Context.class, WindVaneWebView.class}).invoke(this.f23583d, new Object[]{context, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f23583d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(obj, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f23583d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Object.class, WindVaneWebView.class}).invoke(this.f23583d, new Object[]{obj, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f23583d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        try {
            if (this.f23583d != null) {
                this.f23583d.getEndScreenInfo(obj, str);
                C8672v.m24878d("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            C8672v.m24878d("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj != null) {
                C8881a aVar = (C8881a) obj;
                if (aVar.f21883a instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.f21883a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((C8852a) windVaneWebView.getWebViewListener()).mo58562a(obj);
                    }
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f23583d != null) {
                this.f23583d.install(obj, str);
            } else if (!TextUtils.isEmpty(str)) {
                if (obj != null) {
                    C8881a aVar = (C8881a) obj;
                    if (aVar.f21883a.getObject() instanceof C9514j) {
                        ((C9514j) aVar.f21883a.getObject()).click(1, str);
                        C8672v.m24878d("JS-Reward-Brigde", "JSCommon install jump success");
                    }
                }
                C8672v.m24878d("JS-Reward-Brigde", "JSCommon install failed");
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "install", th);
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f23583d != null && !TextUtils.isEmpty(str)) {
                this.f23583d.notifyCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f23583d != null && !TextUtils.isEmpty(str)) {
                this.f23583d.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f23583d != null && !TextUtils.isEmpty(str)) {
                this.f23583d.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "triggerCloseBtn", th);
            C8887g.m25669a().mo58688a(obj, m27183a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f23583d != null && !TextUtils.isEmpty(str)) {
                this.f23583d.setOrientation(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f23583d != null && !TextUtils.isEmpty(str)) {
                this.f23583d.handlerPlayableException(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("JS-Reward-Brigde", "handlerPlayableException", th);
        }
    }

    /* renamed from: a */
    private String m27183a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8672v.m24878d("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    public void openURL(Object obj, String str) {
        C8672v.m24878d("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C6779b.m20645a(this.f21907a, optString);
                } else if (optInt == 2) {
                    C6779b.m20647b(this.f21907a, optString);
                }
            } catch (JSONException e) {
                C8672v.m24878d("JS-Reward-Brigde", e.getMessage());
            } catch (Throwable th) {
                C8672v.m24878d("JS-Reward-Brigde", th.getMessage());
            }
        }
    }

    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
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
                    C8672v.m24874a("JS-Reward-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C8868b.m25603a(obj, "exception: " + e2.getLocalizedMessage());
                C8672v.m24875a("JS-Reward-Brigde", "cai", e2);
            } catch (Throwable th) {
                C8868b.m25603a(obj, "exception: " + th.getLocalizedMessage());
                C8672v.m24875a("JS-Reward-Brigde", "cai", th);
            }
        }
    }
}
