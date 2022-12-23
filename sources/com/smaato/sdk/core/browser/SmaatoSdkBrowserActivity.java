package com.smaato.sdk.core.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p384fi.Consumer;
import com.smaato.sdk.core_light.C10895R;

public class SmaatoSdkBrowserActivity extends Activity implements BrowserView {
    private static final String LOG_TAG = "com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity";
    /* access modifiers changed from: private */
    @Inject
    public BrowserPresenter browserPresenter;
    private View btnNavigationBackward;
    private View btnNavigationForward;
    @Inject
    private Logger logger;
    private ProgressBar progressBar;
    private TextView tvHostname;
    private WebView webView;

    public static Intent createIntent(Context context, String str) {
        Objects.requireNonNull(context, "Parameter context cannot be null for SmaatoSdkBrowserActivity::createIntent");
        Objects.requireNonNull(str, "Parameter url cannot be null for SmaatoSdkBrowserActivity::createIntent");
        Intent intent = new Intent(context, SmaatoSdkBrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("KEY_CTA_URL", str);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject((Activity) this);
        if (this.browserPresenter == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized.");
            finish();
            return;
        }
        setContentView(C10895R.layout.smaato_sdk_corelight_activity_internal_browser);
        initViews();
        initWebView();
        initLogic();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Objects.onNotNull(this.browserPresenter, $$Lambda$_xH7XsVTZB0hRcN5JSoYlEDrFv4.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Objects.onNotNull(this.browserPresenter, $$Lambda$dWdInfO6XN4ddHAUECmtK31crFc.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Objects.onNotNull(this.browserPresenter, $$Lambda$JO76bjlBJ5VXWw5msPJKAupQnvM.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Objects.onNotNull(this.browserPresenter, $$Lambda$mhUkOmav4YNRhITdGxUXfCL8MfA.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Objects.onNotNull(this.webView, $$Lambda$MnnyuaHVDkjXez9DGXvzyGZK4c.INSTANCE);
        Objects.onNotNull(this.browserPresenter, $$Lambda$R86vL1LYd4bfRfllP6LfOcvV7k.INSTANCE);
    }

    private void initViews() {
        this.webView = (WebView) findViewById(C10895R.C10897id.webView);
        this.progressBar = (ProgressBar) findViewById(C10895R.C10897id.progressBar);
        findViewById(C10895R.C10897id.btnClose).setOnClickListener(new DoubleClickPreventionListener() {
            /* access modifiers changed from: protected */
            public void processClick() {
                SmaatoSdkBrowserActivity.this.finish();
            }
        });
        findViewById(C10895R.C10897id.btnRefresh).setOnClickListener(new DoubleClickPreventionListener() {
            /* access modifiers changed from: protected */
            public void processClick() {
                Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, $$Lambda$OycmKNItiN79aTZc0jQAv7_zk.INSTANCE);
            }
        });
        View findViewById = findViewById(C10895R.C10897id.btnBackward);
        this.btnNavigationBackward = findViewById;
        findViewById.setOnClickListener(new DoubleClickPreventionListener() {
            /* access modifiers changed from: protected */
            public void processClick() {
                Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, $$Lambda$zg6nko2q9HAOFDuGvnWKuuxwxIc.INSTANCE);
            }
        });
        View findViewById2 = findViewById(C10895R.C10897id.btnForward);
        this.btnNavigationForward = findViewById2;
        findViewById2.setOnClickListener(new DoubleClickPreventionListener() {
            /* access modifiers changed from: protected */
            public void processClick() {
                Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, $$Lambda$3Who52wYNLeQhFdpTsxGL2qI3mk.INSTANCE);
            }
        });
        findViewById(C10895R.C10897id.btnOpenExternal).setOnClickListener(new DoubleClickPreventionListener() {
            /* access modifiers changed from: protected */
            public void processClick() {
                Objects.onNotNull(SmaatoSdkBrowserActivity.this.browserPresenter, $$Lambda$SZooymytBc3co7R0LbcHuAKC8E.INSTANCE);
            }
        });
        TextView textView = (TextView) findViewById(C10895R.C10897id.tvHostname);
        this.tvHostname = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return SmaatoSdkBrowserActivity.this.lambda$initViews$0$SmaatoSdkBrowserActivity(view);
            }
        });
    }

    public /* synthetic */ boolean lambda$initViews$0$SmaatoSdkBrowserActivity(View view) {
        Objects.onNotNull(this.browserPresenter, $$Lambda$3kQ6XBVCKF9lr3VvE5pBizjEdg.INSTANCE);
        return true;
    }

    private void initWebView() {
        WebView webView2 = this.webView;
        if (webView2 != null) {
            WebSettings settings = webView2.getSettings();
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
    }

    private void initLogic() {
        if (this.webView != null) {
            Objects.onNotNull(this.browserPresenter, new Consumer() {
                public final void accept(Object obj) {
                    SmaatoSdkBrowserActivity.this.lambda$initLogic$1$SmaatoSdkBrowserActivity((BrowserPresenter) obj);
                }
            });
        }
        Objects.onNotNull(this.browserPresenter, new Consumer(getIntent().getStringExtra("KEY_CTA_URL")) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((BrowserPresenter) obj).loadUrl(this.f$0);
            }
        });
    }

    public /* synthetic */ void lambda$initLogic$1$SmaatoSdkBrowserActivity(BrowserPresenter browserPresenter2) {
        browserPresenter2.initWithView(this, this.webView);
    }

    public void showHostname(String str) {
        Objects.onNotNull(this.tvHostname, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((TextView) obj).setText(this.f$0);
            }
        });
    }

    public void showConnectionSecure(boolean z) {
        Objects.onNotNull(this.tvHostname, new Consumer(z ? C10895R.C10896drawable.smaato_sdk_corelight_ic_browser_secure_connection : 0) {
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((TextView) obj).setCompoundDrawablesWithIntrinsicBounds(this.f$0, 0, 0, 0);
            }
        });
    }

    public void setPageNavigationBackEnabled(boolean z) {
        Objects.onNotNull(this.btnNavigationBackward, new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((View) obj).setEnabled(this.f$0);
            }
        });
    }

    public void setPageNavigationForwardEnabled(boolean z) {
        Objects.onNotNull(this.btnNavigationForward, new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((View) obj).setEnabled(this.f$0);
            }
        });
    }

    public void launchExternalBrowser(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            }
        }
        finish();
    }

    public void redirectToExternalApp(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            }
        }
    }

    public void showProgressIndicator() {
        Objects.onNotNull(this.progressBar, $$Lambda$SmaatoSdkBrowserActivity$hvlZkE8bm6yLtLVQxKHjFKZNJ60.INSTANCE);
    }

    public void hideProgressIndicator() {
        Objects.onNotNull(this.progressBar, $$Lambda$SmaatoSdkBrowserActivity$0zpKhhcHZgcHEUO30PtJN8emtrw.INSTANCE);
    }

    public void updateProgressIndicator(int i) {
        Objects.onNotNull(this.progressBar, new Consumer(i) {
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((ProgressBar) obj).setProgress(this.f$0);
            }
        });
    }

    public void closeBrowser() {
        finish();
    }
}
