package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.sdk.p281d.C8265b;
import com.ironsource.sdk.utils.C8342b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: a */
    private static final int f19730a = SDKUtils.generateViewId();

    /* renamed from: b */
    private static final int f19731b = SDKUtils.generateViewId();

    /* renamed from: c */
    private WebView f19732c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8202x f19733d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressBar f19734e;

    /* renamed from: f */
    private boolean f19735f;

    /* renamed from: g */
    private RelativeLayout f19736g;

    /* renamed from: h */
    private String f19737h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f19738i = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f19739j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f19740k = new Runnable() {
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f19739j));
        }
    };

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class C8134a extends WebViewClient {
        private C8134a() {
        }

        /* synthetic */ C8134a(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f19734e.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f19734e.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m23747e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = C8342b.m23758a().mo56794b();
            if (!b.isEmpty()) {
                for (String contains : b) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f19733d.mo56511i();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f19733d != null) {
                                C8202x d = OpenUrlActivity.this.f19733d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d.mo56506b(C8202x.m23429b("failedToStartStoreActivity", C8202x.m23413a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        C8202x xVar;
        if (this.f19735f && (xVar = this.f19733d) != null) {
            xVar.mo56509e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f19732c.stopLoading();
        this.f19732c.clearHistory();
        try {
            this.f19732c.loadUrl(str);
        } catch (Throwable th) {
            Logger.m23747e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f19732c.canGoBack()) {
            this.f19732c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m23749i("OpenUrlActivity", "onCreate()");
        try {
            this.f19733d = (C8202x) C8265b.m23538a((Context) this).f20120a.f19781a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f19737h = extras.getString(C8202x.f19945c);
            this.f19735f = extras.getBoolean(C8202x.f19946d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f19739j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            OpenUrlActivity.this.f19738i.removeCallbacks(OpenUrlActivity.this.f19740k);
                            OpenUrlActivity.this.f19738i.postDelayed(OpenUrlActivity.this.f19740k, 500);
                        }
                    }
                });
                runOnUiThread(this.f19740k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19736g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f19732c;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f19739j && (i == 25 || i == 24)) {
            this.f19738i.postDelayed(this.f19740k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C8202x xVar = this.f19733d;
        if (xVar != null) {
            xVar.mo56503a(false, "secondary");
            if (this.f19736g != null && (viewGroup = (ViewGroup) this.f19732c.getParent()) != null) {
                if (viewGroup.findViewById(f19730a) != null) {
                    viewGroup.removeView(this.f19732c);
                }
                if (viewGroup.findViewById(f19731b) != null) {
                    viewGroup.removeView(this.f19734e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f19732c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f19732c = webView;
            webView.setId(f19730a);
            this.f19732c.getSettings().setJavaScriptEnabled(true);
            this.f19732c.setWebViewClient(new C8134a(this, (byte) 0));
            loadUrl(this.f19737h);
        }
        if (findViewById(f19730a) == null) {
            this.f19736g.addView(this.f19732c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f19734e == null) {
            this.f19734e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f19734e.setId(f19731b);
        }
        if (findViewById(f19731b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f19734e.setLayoutParams(layoutParams);
            this.f19734e.setVisibility(4);
            this.f19736g.addView(this.f19734e);
        }
        C8202x xVar = this.f19733d;
        if (xVar != null) {
            xVar.mo56503a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f19739j && z) {
            runOnUiThread(this.f19740k);
        }
    }
}
