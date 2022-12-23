package com.mbridge.msdk.video.p347bt.p348a;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.p338a.C8849a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.b */
/* compiled from: HandlerH5MessageManager */
public final class C9258b {

    /* renamed from: a */
    int f22599a;

    /* renamed from: b */
    int f22600b;

    /* renamed from: c */
    private String f22601c;

    /* renamed from: com.mbridge.msdk.video.bt.a.b$a */
    /* compiled from: HandlerH5MessageManager */
    private static final class C9260a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C9258b f22602a = new C9258b();
    }

    private C9258b() {
        this.f22601c = "handlerNativeResult";
        this.f22599a = 0;
        this.f22600b = 1;
    }

    /* renamed from: a */
    public static C9258b m26207a() {
        return C9260a.f22602a;
    }

    /* renamed from: a */
    public final void mo62484a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                            JSONObject optJSONObject = jSONObject.optJSONObject(IronSourceConstants.EVENTS_RESULT);
                            int i = 0;
                            if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                                i = optJSONObject.optInt("type", 0);
                            }
                            m26208a(this.f22599a, "receivedMessage", obj);
                            if (optString.equalsIgnoreCase("reporter")) {
                                C8849a.m25542a().mo58560a(obj, optString2, optJSONArray, i);
                                return;
                            } else if (optString.equalsIgnoreCase("MediaPlayer")) {
                                C9256a.m26201a().mo62481a(obj, optString2, optJSONArray, i);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    m26208a(this.f22600b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                C8672v.m24874a("HandlerH5MessageManager", e.getMessage());
                m26208a(this.f22600b, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                C8672v.m24874a("HandlerH5MessageManager", th.getMessage());
                m26208a(this.f22600b, th.getMessage(), obj);
                return;
            }
        }
        m26208a(this.f22600b, "params is null", obj);
    }

    /* renamed from: a */
    private void m26208a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C8672v.m24874a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            C8672v.m24874a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
