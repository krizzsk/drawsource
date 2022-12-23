package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;

public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";

    /* renamed from: a */
    private String f4526a;

    /* renamed from: b */
    private WebView f4527b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EventListener f4528c;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f4528c = eventListener;
        WebView webView = this.f4527b;
        if (webView == null) {
            this.f4526a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    public void onBackPressed() {
        EventListener eventListener = this.f4528c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinWebViewActivity", "No SDK key specified");
            }
            finish();
            return;
        }
        final C1969m mVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
        WebView tryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.f4527b = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(tryToCreateWebView);
        WebSettings settings = this.f4527b.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f4527b.setVerticalScrollBarEnabled(true);
        this.f4527b.setHorizontalScrollBarEnabled(true);
        this.f4527b.setScrollBarStyle(33554432);
        this.f4527b.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                if (C2102v.m5104a()) {
                    C2102v A = mVar.mo14509A();
                    A.mo15012b("AppLovinWebViewActivity", "Handling url load: " + str);
                }
                if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f4528c == null) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                if (!path.endsWith("webview_event")) {
                    return true;
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                if (StringUtils.isValidString(str2)) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if (C2102v.m5104a()) {
                        C2102v A2 = mVar.mo14509A();
                        A2.mo15012b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                    }
                    AppLovinWebViewActivity.this.f4528c.onReceivedEvent(queryParameter);
                    return true;
                } else if (!C2102v.m5104a()) {
                    return true;
                } else {
                    mVar.mo14509A().mo15016e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                    return true;
                }
            }
        });
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (StringUtils.isValidString(this.f4526a)) {
            this.f4527b.loadUrl(this.f4526a);
        }
    }
}
