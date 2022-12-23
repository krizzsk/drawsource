package com.mbridge.msdk.video.signal.p371a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.l */
/* compiled from: JSNotifyProxy */
public final class C9517l extends C9509e {

    /* renamed from: a */
    private WebView f23579a;

    public C9517l(WebView webView) {
        this.f23579a = webView;
    }

    /* renamed from: a */
    public final void mo63267a(int i) {
        super.mo63267a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            C8887g.m25669a().mo58687a(this.f23579a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo63269a(int i, String str) {
        super.mo63269a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            C8887g.m25669a().mo58687a(this.f23579a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo63270a(MBridgeVideoView.C9471a aVar) {
        super.mo63270a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m27143a(aVar.f23467a, aVar.f23468b));
            jSONObject.put("time", String.valueOf(aVar.f23467a));
            jSONObject.put("duration", String.valueOf(aVar.f23468b));
            C8887g.m25669a().mo58687a(this.f23579a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m27143a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8677z.m24904a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    /* renamed from: a */
    public final void mo63271a(Object obj) {
        super.mo63271a(obj);
        C8887g.m25669a().mo58687a(this.f23579a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    /* renamed from: a */
    public final void mo63268a(int i, int i2, int i3, int i4) {
        super.mo63268a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = "portrait";
            }
            jSONObject2.put(TJAdUnitConstants.String.ORIENTATION, str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            C8887g.m25669a().mo58687a(this.f23579a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
