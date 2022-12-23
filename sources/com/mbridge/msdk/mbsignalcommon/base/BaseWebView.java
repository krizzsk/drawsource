package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.lang.reflect.Method;

public class BaseWebView extends WebView {

    /* renamed from: a */
    protected Context f21823a;

    /* renamed from: b */
    private View.OnTouchListener f21824b = new View.OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                BaseWebView.this.lastTouchTime = System.currentTimeMillis();
            }
            if (BaseWebView.this.f21825c != null) {
                return BaseWebView.this.f21825c.onTouch(view, motionEvent);
            }
            return false;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View.OnTouchListener f21825c;
    public long lastTouchTime = 0;
    public C8857b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.f21823a = context;
        mo58576a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21823a = context;
        mo58576a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21823a = context;
        mo58576a();
    }

    public void setFilter(C8856a aVar) {
        C8857b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.mo58584a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58576a() {
        if (this.mWebViewClient == null) {
            C8857b bVar = new C8857b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                settings.setSafeBrowsingEnabled(false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            settings.setAllowUniversalAccessFromFileURLs(true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 5) {
            settings.setDatabaseEnabled(true);
            String path = this.f21823a.getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            Class<WebSettings> cls = WebSettings.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setDisplayZoomControls", new Class[]{Boolean.TYPE});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, new Object[]{false});
            } catch (Exception unused) {
            }
        }
        super.setOnTouchListener(this.f21824b);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f21825c = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, (Paint) null);
        setBackgroundColor(0);
    }

    public void reload() {
        super.reload();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C8857b) {
            this.mWebViewClient = (C8857b) webViewClient;
        }
    }
}
