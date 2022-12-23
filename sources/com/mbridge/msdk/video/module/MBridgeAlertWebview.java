package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;

public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f23193y;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62968a() {
        if (TextUtils.isEmpty(this.f23292v)) {
            return "";
        }
        C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23292v, false);
        String str = C9640c.f23946a;
        this.f23193y = str;
        return !TextUtils.isEmpty(str) ? C9652g.m27539a().mo63670b(this.f23193y) : "";
    }

    public void preLoadData(C9618b bVar) {
        String a = mo62968a();
        if (!this.f23200f || this.f23196b == null || TextUtils.isEmpty(a)) {
            this.f23199e.mo62631a(101, "");
            return;
        }
        BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f23196b);
        mBDownloadListener.setTitle(this.f23196b.getAppName());
        this.f23287q.setDownloadListener(mBDownloadListener);
        this.f23287q.setCampaignId(this.f23196b.getId());
        setCloseVisible(8);
        this.f23287q.setApiManagerJSFactory(bVar);
        this.f23287q.setWebViewListener(new C8853b() {
            /* renamed from: a */
            public final void mo58279a(WebView webView, String str) {
                super.mo58279a(webView, str);
                C8672v.m24878d("MBridgeAlertWebview", "finish+" + str);
                C8887g.m25669a().mo58687a(webView, "onSignalCommunication", "");
            }

            /* renamed from: a */
            public final void mo58277a(WebView webView, int i, String str, String str2) {
                super.mo58277a(webView, i, str, str2);
                C8672v.m24878d("MBridgeAlertWebview", "onReceivedError");
                if (!MBridgeAlertWebview.this.f23291u) {
                    C8672v.m24874a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    C8598e.m24670a(MBridgeAlertWebview.this.f23195a, MBridgeAlertWebview.this.f23196b, MBridgeAlertWebview.this.f23193y, MBridgeAlertWebview.this.f23292v, 2, str);
                    MBridgeAlertWebview.this.f23291u = true;
                }
            }

            /* renamed from: a */
            public final void mo58276a(WebView webView, int i) {
                String str;
                super.mo58276a(webView, i);
                C8672v.m24878d("MBridgeAlertWebview", "readyState  :  " + i);
                if (!MBridgeAlertWebview.this.f23291u) {
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    mBridgeAlertWebview.f23290t = z;
                    if (MBridgeAlertWebview.this.f23290t) {
                        str = "readyState state is " + i;
                    } else {
                        str = "";
                    }
                    C8598e.m24670a(MBridgeAlertWebview.this.f23195a, MBridgeAlertWebview.this.f23196b, MBridgeAlertWebview.this.f23193y, MBridgeAlertWebview.this.f23292v, i, str);
                }
            }
        });
        setHtmlSource(C9661h.m27556a().mo63674b(a));
        this.f23290t = false;
        if (TextUtils.isEmpty(this.f23289s)) {
            C8672v.m24874a(MBridgeBaseView.TAG, "load url:" + a);
            this.f23287q.loadUrl(a);
        } else {
            C8672v.m24874a(MBridgeBaseView.TAG, "load html...");
            this.f23287q.loadDataWithBaseURL(a, this.f23289s, "text/html", "UTF-8", (String) null);
        }
        this.f23287q.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    public void webviewshow() {
        if (this.f23285o != null) {
            this.f23285o.setBackgroundColor(0);
        }
        super.webviewshow();
        C8598e.m24668a(this.f23195a, this.f23196b, this.f23193y, this.f23292v, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo62969b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }
}
