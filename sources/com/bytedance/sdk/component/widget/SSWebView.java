package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2915u;
import com.bytedance.sdk.component.widget.p125a.C2929a;
import com.bytedance.sdk.component.widget.p126b.C2931a;
import com.facebook.share.internal.ShareInternalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

public class SSWebView extends FrameLayout {

    /* renamed from: a */
    private C2931a f6554a;

    /* renamed from: b */
    private String f6555b;

    /* renamed from: c */
    private JSONObject f6556c;

    /* renamed from: d */
    private boolean f6557d;

    /* renamed from: e */
    private float f6558e;

    /* renamed from: f */
    private float f6559f;

    /* renamed from: g */
    private long f6560g;

    /* renamed from: h */
    private long f6561h;

    /* renamed from: i */
    private long f6562i;

    /* renamed from: j */
    private boolean f6563j;

    /* renamed from: k */
    private WebView f6564k;

    /* renamed from: l */
    private float f6565l;

    /* renamed from: m */
    private float f6566m;

    /* renamed from: n */
    private int f6567n;

    /* renamed from: o */
    private C2927b f6568o;

    /* renamed from: p */
    private C2915u f6569p;

    /* renamed from: q */
    private AttributeSet f6570q;

    /* renamed from: r */
    private Context f6571r;

    /* renamed from: s */
    private C2928c f6572s;

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$b */
    public interface C2927b {
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$c */
    public interface C2928c {
        /* renamed from: a */
        void mo17905a(boolean z);
    }

    public SSWebView(Context context) {
        super(m8196a(context));
        this.f6558e = 0.0f;
        this.f6559f = 0.0f;
        this.f6560g = 0;
        this.f6561h = 0;
        this.f6562i = 0;
        this.f6563j = false;
        this.f6565l = 20.0f;
        this.f6566m = 50.0f;
        try {
            this.f6564k = new WebView(m8196a(context));
            mo17840b();
        } catch (Throwable unused) {
        }
        m8198b(m8196a(context));
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(m8196a(context), attributeSet);
        this.f6558e = 0.0f;
        this.f6559f = 0.0f;
        this.f6560g = 0;
        this.f6561h = 0;
        this.f6562i = 0;
        boolean z = false;
        this.f6563j = false;
        this.f6565l = 20.0f;
        this.f6566m = 50.0f;
        try {
            if (C2929a.m8227a().mo17907b() != null && C2929a.m8227a().mo17907b().mo17909a()) {
                int h = C2914t.m8161h(context, "tt_delay_init");
                int i = 0;
                boolean z2 = false;
                while (i < attributeSet.getAttributeCount()) {
                    try {
                        if (attributeSet.getAttributeNameResource(i) == h) {
                            z2 = attributeSet.getAttributeBooleanValue(i, false);
                        }
                        i++;
                    } catch (Throwable unused) {
                    }
                }
                z = z2;
            }
        } catch (Throwable unused2) {
        }
        this.f6571r = context;
        if (!z) {
            this.f6570q = attributeSet;
            mo17833a();
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(m8196a(context), attributeSet, i);
        this.f6558e = 0.0f;
        this.f6559f = 0.0f;
        this.f6560g = 0;
        this.f6561h = 0;
        this.f6562i = 0;
        this.f6563j = false;
        this.f6565l = 20.0f;
        this.f6566m = 50.0f;
        try {
            this.f6564k = new WebView(m8196a(context), attributeSet, i);
            mo17840b();
        } catch (Throwable unused) {
        }
        m8198b(m8196a(context));
    }

    /* renamed from: a */
    private static Context m8196a(Context context) {
        return (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    private void m8197a(MotionEvent motionEvent) {
        if (this.f6557d && this.f6554a != null) {
            if ((this.f6555b != null || this.f6556c != null) && motionEvent != null) {
                try {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f6558e = motionEvent.getRawX();
                        this.f6559f = motionEvent.getRawY();
                        this.f6560g = System.currentTimeMillis();
                        this.f6556c = new JSONObject();
                        if (this.f6564k != null) {
                            this.f6564k.setTag(C2914t.m8158e(getContext(), "tt_id_click_begin"), Long.valueOf(this.f6560g));
                        }
                    } else if (action == 1 || action == 3) {
                        this.f6556c.put("start_x", String.valueOf(this.f6558e));
                        this.f6556c.put("start_y", String.valueOf(this.f6559f));
                        this.f6556c.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f6558e));
                        this.f6556c.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f6559f));
                        this.f6556c.put("url", String.valueOf(getUrl()));
                        this.f6556c.put("tag", "");
                        this.f6561h = System.currentTimeMillis();
                        if (this.f6564k != null) {
                            this.f6564k.setTag(C2914t.m8158e(getContext(), "tt_id_click_end"), Long.valueOf(this.f6561h));
                        }
                        this.f6556c.put("down_time", this.f6560g);
                        this.f6556c.put("up_time", this.f6561h);
                        if (C2929a.m8227a().mo17907b() != null && this.f6562i != this.f6560g) {
                            this.f6562i = this.f6560g;
                            C2929a.m8227a().mo17907b().mo17908a(this.f6554a, this.f6555b, "in_web_click", this.f6556c, this.f6561h - this.f6560g);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m8198b(Context context) {
        m8200c(context);
        m8203p();
        m8202o();
    }

    /* renamed from: b */
    private static boolean m8199b(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private static void m8200c(Context context) {
        if (Build.VERSION.SDK_INT == 17 && context != null) {
            try {
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                if (accessibilityManager == null) {
                    return;
                }
                if (accessibilityManager.isEnabled()) {
                    Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setState", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(accessibilityManager, new Object[]{0});
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m8201c(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass != null && loadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return loadClass2 != null && loadClass2.isInstance(view);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: o */
    private void m8202o() {
        try {
            this.f6564k.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f6564k.removeJavascriptInterface("accessibility");
            this.f6564k.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private void m8203p() {
        try {
            WebSettings settings = this.f6564k.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.f6564k.getSettings()) != null) {
                settings.setJavaScriptEnabled(!Uri.parse(str).getScheme().equals(ShareInternalUtility.STAGING_PARAM));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewParent mo17832a(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (m8199b(view2) || m8201c(view2)) ? parent : mo17832a(view2);
    }

    /* renamed from: a */
    public void mo17833a() {
        try {
            this.f6564k = this.f6570q == null ? new WebView(m8196a(this.f6571r)) : new WebView(m8196a(this.f6571r), this.f6570q);
            mo17840b();
            m8198b(m8196a(this.f6571r));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17834a(Object obj, String str) {
        try {
            this.f6564k.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17835a(String str) {
        try {
            setJavaScriptEnabled(str);
            this.f6564k.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17836a(String str, ValueCallback<String> valueCallback) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f6564k.evaluateJavascript(str, valueCallback);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17837a(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.f6564k.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17838a(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.f6564k.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17839a(boolean z) {
        try {
            this.f6564k.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo17840b() {
        if (this.f6564k != null) {
            removeAllViews();
            setBackground((Drawable) null);
            try {
                this.f6564k.setId(C2914t.m8158e(getContext(), "tt_id_root_web_view"));
            } catch (Throwable unused) {
            }
            addView(this.f6564k, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: b */
    public void mo17841b(String str) {
        try {
            this.f6564k.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo17842c() {
        try {
            this.f6564k.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void computeScroll() {
        try {
            this.f6564k.computeScroll();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo17844d() {
        try {
            this.f6564k.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2928c cVar = this.f6572s;
        if (cVar != null) {
            cVar.mo17905a(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo17846e() {
        try {
            return this.f6564k.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public void mo17847f() {
        try {
            this.f6564k.goBack();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public boolean mo17848g() {
        try {
            return this.f6564k.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return this.f6564k.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public C2931a getMaterialMeta() {
        return this.f6554a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r3.f6564k.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getOriginalUrl() {
        /*
            r3 = this;
            android.webkit.WebView r0 = r3.f6564k     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r0.getOriginalUrl()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "data:text/html"
            boolean r1 = r0.startsWith(r1)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            android.webkit.WebView r1 = r3.f6564k     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r1.getUrl()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r2 = "file://"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x0021
            r0 = r1
        L_0x0021:
            return r0
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.widget.SSWebView.getOriginalUrl():java.lang.String");
    }

    public int getProgress() {
        try {
            return this.f6564k.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getTag() {
        return this.f6555b;
    }

    public String getUrl() {
        try {
            return this.f6564k.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        try {
            return this.f6564k.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.f6564k;
    }

    /* renamed from: h */
    public void mo17857h() {
        try {
            this.f6564k.goForward();
        } catch (Throwable unused) {
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public void mo17859i() {
        WebView webView = this.f6564k;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* renamed from: j */
    public void mo17860j() {
        try {
            this.f6564k.clearHistory();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    public void mo17861k() {
        try {
            this.f6564k.onPause();
            if (this.f6572s != null) {
                this.f6572s.mo17905a(false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    public void mo17862l() {
        try {
            this.f6564k.destroy();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public void mo17863m() {
        try {
            this.f6564k.clearView();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public void mo17864n() {
        try {
            this.f6564k.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2915u uVar = this.f6569p;
        if (uVar != null) {
            uVar.mo17823b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent a;
        try {
            m8197a(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f6563j && (a = mo17832a((View) this)) != null) {
                a.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2915u uVar = this.f6569p;
        if (uVar == null) {
            return;
        }
        if (z) {
            uVar.mo17820a();
        } else {
            uVar.mo17823b();
        }
    }

    public void removeAllViews() {
        try {
            this.f6564k.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.f6564k.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.f6564k.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.f6564k.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            this.f6564k.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.f6564k.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.f6564k.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.f6567n = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.f6564k.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.f6564k.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.f6564k.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.f6564k.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.f6564k.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.f6564k.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.f6563j = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.f6564k.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.f6564k.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.f6557d = z;
    }

    public void setLayerType(int i, Paint paint) {
        try {
            this.f6564k.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.f6564k.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.f6564k.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(C2931a aVar) {
        this.f6554a = aVar;
    }

    public void setMixedContentMode(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f6564k.getSettings().setMixedContentMode(i);
            }
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.f6564k.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(C2927b bVar) {
        this.f6568o = bVar;
    }

    public void setOverScrollMode(int i) {
        try {
            this.f6564k.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.f6565l = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.f6564k.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f6555b = str;
    }

    public void setTouchStateListener(C2928c cVar) {
        this.f6572s = cVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.f6564k.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.f6564k.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.f6564k.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.f6564k.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof C2928c) {
                setTouchStateListener((C2928c) webViewClient);
            } else {
                setTouchStateListener((C2928c) null);
            }
            if (webViewClient == null) {
                webViewClient = new C2926a();
            }
            this.f6564k.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.f6566m = f;
    }

    /* renamed from: com.bytedance.sdk.component.widget.SSWebView$a */
    public static class C2926a extends WebViewClient {
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                if (webView != null) {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            }
            if (webView != null) {
                ViewGroup viewGroup2 = (ViewGroup) webView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(webView);
                }
                webView.destroy();
            }
            return true;
        }
    }
}
