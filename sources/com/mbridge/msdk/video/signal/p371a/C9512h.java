package com.mbridge.msdk.video.signal.p371a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.h */
/* compiled from: JSActivityProxy */
public final class C9512h extends C9503a {

    /* renamed from: a */
    private WebView f23558a;

    /* renamed from: b */
    private int f23559b = 0;

    public C9512h(WebView webView) {
        this.f23558a = webView;
    }

    /* renamed from: a */
    public final void mo63228a() {
        super.mo63228a();
        this.f23559b = 1;
        C8887g.m25669a().mo58687a(this.f23558a, "onSystemPause", "");
    }

    /* renamed from: b */
    public final void mo63231b() {
        super.mo63231b();
        this.f23559b = 0;
        C8887g.m25669a().mo58687a(this.f23558a, "onSystemResume", "");
    }

    /* renamed from: f */
    public final void mo63235f() {
        super.mo63235f();
        C8887g.m25669a().mo58687a(this.f23558a, "onSystemDestory", "");
    }

    /* renamed from: a */
    public final void mo63230a(Configuration configuration) {
        super.mo63230a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "landscape");
            } else {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "portrait");
            }
            C8887g.m25669a().mo58687a(this.f23558a, TJAdUnitConstants.String.ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void mo63236g() {
        super.mo63236g();
        C8887g.m25669a().mo58687a(this.f23558a, "onSystemBackPressed", "");
    }

    /* renamed from: a */
    public final void mo63229a(int i) {
        super.mo63229a(i);
        this.f23559b = i;
    }

    /* renamed from: h */
    public final int mo63237h() {
        return this.f23559b;
    }
}
