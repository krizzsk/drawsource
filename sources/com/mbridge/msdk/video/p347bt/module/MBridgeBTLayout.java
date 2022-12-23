package com.mbridge.msdk.video.p347bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTLayout */
public class MBridgeBTLayout extends BTBaseView {

    /* renamed from: p */
    private WebView f22746p;

    public void init(Context context) {
    }

    public void onDestory() {
    }

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebView(WebView webView) {
        this.f22746p = webView;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f22746p != null) {
            try {
                if (this.f22640b == null || !this.f22640b.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "landscape");
                    } else {
                        jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "portrait");
                    }
                    jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.f22642d);
                    C8887g.m25669a().mo58687a(this.f22746p, TJAdUnitConstants.String.ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f22746p != null) {
            C9261c.m26212a().mo62503a(this.f22746p, "onSystemBackPressed", this.f22642d);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22746p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f22637n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C8887g.m25669a().mo58687a(this.f22746p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9261c.m26212a().mo62503a(this.f22746p, "broadcast", getInstanceId());
            }
        }
    }

    public void notifyEvent(String str) {
        WebView webView = this.f22746p;
        if (webView != null) {
            m26279a(webView, str, this.f22642d);
        }
    }
}
