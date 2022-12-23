package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.C8897b;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public class WindVaneWebViewForNV extends WindVaneWebView {

    /* renamed from: e */
    private static String f22072e = "WindVaneWebViewForNV";

    /* renamed from: f */
    private C8897b f22073f;

    /* renamed from: g */
    private boolean f22074g = false;

    public void setInterceptTouch(boolean z) {
        this.f22074g = z;
    }

    public void setBackListener(C8897b bVar) {
        this.f22073f = bVar;
    }

    public WindVaneWebViewForNV(Context context) {
        super(context);
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22074g) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8897b bVar;
        if (i != 4 || (bVar = this.f22073f) == null) {
            return super.onKeyDown(i, keyEvent);
        }
        bVar.mo58710a();
        return true;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            C8887g.m25669a().mo58687a((WebView) this, "webviewshow", "");
            C8468m mVar = new C8468m();
            mVar.mo57840k(campaignEx.getRequestId());
            mVar.mo57842l(campaignEx.getRequestIdNotice());
            if (getContext() == null) {
                return;
            }
            if (getContext().getApplicationContext() != null) {
                mVar.mo57846n(campaignEx.getId());
                mVar.mo57816a(campaignEx.isMraid() ? C8468m.f20702a : C8468m.f20703b);
                C8580c.m24605a(mVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void orientation(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "landscape");
            } else {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "portrait");
            }
            C8887g.m25669a().mo58687a((WebView) this, TJAdUnitConstants.String.ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
