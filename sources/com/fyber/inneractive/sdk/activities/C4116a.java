package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5311r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.activities.a */
public class C4116a extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f10141a;

    public C4116a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f10141a = inneractiveInternalBrowserActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        Drawable drawable;
        Drawable drawable2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            drawable = C5292l.m16515d(C4109R.C4110drawable.ia_ib_left_arrow);
        } else {
            drawable = C5292l.m16515d(C4109R.C4110drawable.ia_ib_unleft_arrow);
        }
        this.f10141a.f10132e.setImageDrawable(drawable);
        if (webView.canGoForward()) {
            drawable2 = C5292l.m16515d(C4109R.C4110drawable.ia_ib_right_arrow);
        } else {
            drawable2 = C5292l.m16515d(C4109R.C4110drawable.ia_ib_unright_arrow);
        }
        this.f10141a.f10133f.setImageDrawable(drawable2);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f10141a.f10133f.setImageDrawable(C5292l.m16515d(C4109R.C4110drawable.ia_ib_unright_arrow));
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m16450e("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C4516r.m13797a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", (InneractiveAdRequest) null, (C5233e) null);
        this.f10141a.finish();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C5311r0.m16529a(str)) {
            this.f10141a.f10131d.loadUrl("chrome://crash");
            return true;
        }
        C5262d0.C5263a a = C5262d0.m16464a(this.f10141a.getApplicationContext(), str, true, C5262d0.C5266d.DO_NOT_OPEN_IN_INTERNAL_BROWSER, this.f10141a.f10129b);
        if (a.f13957a == C5262d0.C5265c.FAILED) {
            return !str.startsWith("http");
        }
        InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = InneractiveInternalBrowserActivity.f10127j;
        if (internalBrowserListener != null) {
            internalBrowserListener.onApplicationInBackground();
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f10141a;
        if (!inneractiveInternalBrowserActivity.f10136i) {
            boolean unused = inneractiveInternalBrowserActivity.f10136i = true;
            C4509p pVar = C4509p.FYBER_SUCCESS_CLICK;
            C4361j jVar = this.f10141a.f10128a;
            InneractiveAdRequest inneractiveAdRequest = jVar != null ? jVar.f10712a : null;
            C4511q.C4512a aVar = new C4511q.C4512a(jVar != null ? jVar.mo24293c() : null);
            aVar.f11164c = pVar;
            aVar.f11162a = inneractiveAdRequest;
            aVar.f11165d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str);
            } catch (Exception unused2) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "url", str);
            }
            String str2 = a.f13957a.toString();
            try {
                jSONObject.put("opened_from", str2);
            } catch (Exception unused3) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "opened_from", str2);
            }
            try {
                jSONObject.put("opened_by", "internal_browser");
            } catch (Exception unused4) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "opened_by", "internal_browser");
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
        }
        this.f10141a.finish();
        return true;
    }
}
