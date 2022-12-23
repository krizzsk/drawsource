package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3167e;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3575q;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

public class TTWebsiteActivity extends Activity {

    /* renamed from: a */
    private String f7083a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3167e f7084b;

    /* renamed from: a */
    public static void m8711a(Context context, C3431n nVar, String str) {
        if (context != null) {
            C3090e.m8916b(context, nVar, str, "open_policy");
            if (!TextUtils.isEmpty(C3513m.m10973h().mo19879s())) {
                String jSONObject = nVar != null ? nVar.mo19584ar().toString() : "";
                Intent intent = new Intent(context, TTWebsiteActivity.class);
                intent.putExtra("metaString", jSONObject);
                C2889b.m8066a(context, intent, (C2889b.C2890a) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        final String stringExtra = getIntent().getStringExtra("metaString");
        setContentView(C2914t.m8159f(this, "tt_activity_website"));
        final WebView webView = (WebView) findViewById(C2914t.m8158e(this, "tt_ad_website"));
        final ImageView imageView = (ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_close"));
        final ProgressBar progressBar = (ProgressBar) findViewById(C2914t.m8158e(this, "tt_titlebar_browser_progress"));
        ((ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_back"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    TTWebsiteActivity.this.finish();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.this.finish();
            }
        });
        imageView.setVisibility(4);
        imageView.setClickable(false);
        ((TextView) findViewById(C2914t.m8158e(this, "tt_titlebar_title"))).setText(C2914t.m8151a(this, "tt_privacy_title"));
        ((ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_go_to_webview"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = webView.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    C2889b.m8066a(TTWebsiteActivity.this, intent, (C2889b.C2890a) null);
                }
            }
        });
        ((ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_debug_info"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TTWebsiteActivity.this.f7084b == null) {
                    C3167e unused = TTWebsiteActivity.this.f7084b = new C3167e(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f7084b.mo18804a(stringExtra);
                    TTWebsiteActivity.this.f7084b.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f7084b.show();
            }
        });
        if (C3513m.m10973h() != null) {
            this.f7083a = C3513m.m10973h().mo19879s();
        }
        C2905l.m8118e("TTWebsiteActivity", "mWebsiteUrl=" + this.f7083a);
        if (this.f7083a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            try {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSavePassword(false);
                webView.getSettings().setAllowFileAccess(false);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
            try {
                webView.loadUrl(this.f7083a, hashMap);
            } catch (Throwable unused2) {
                webView.loadUrl(this.f7083a);
            }
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (progressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                        if (i == 100) {
                            progressBar.setVisibility(8);
                            if (webView.canGoBack()) {
                                imageView.setVisibility(0);
                                imageView.setClickable(true);
                                return;
                            }
                            imageView.setVisibility(4);
                            imageView.setClickable(false);
                            return;
                        }
                        progressBar.setVisibility(0);
                        progressBar.setProgress(i);
                    }
                }
            });
            webView.setWebViewClient(new SSWebView.C2926a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    C2905l.m8118e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....view=" + webView + ",request=" + webResourceRequest);
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        C2905l.m8118e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url1=" + webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    C2905l.m8118e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url2=" + webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C2905l.m8118e("TTWebsiteActivity", "onPageFinished invoke....url=" + str);
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    C2905l.m8118e("TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=" + webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    C2905l.m8118e("TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    C2905l.m8118e("TTWebsiteActivity", "onReceivedError invoke....description=" + str + ",failingUrl=" + str2);
                }
            });
            C3575q.m11308a(webView);
            return;
        }
        finish();
    }
}
