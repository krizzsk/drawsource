package com.unity3d.services.ads.webplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.webplayer.f */
/* compiled from: WebPlayerView */
public class C11929f extends WebView {

    /* renamed from: a */
    private Map<String, String> f28972a;

    /* renamed from: b */
    private JSONObject f28973b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Method f28974c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f28975d;

    /* renamed from: e */
    private Runnable f28976e = null;

    /* renamed from: com.unity3d.services.ads.webplayer.f$a */
    /* compiled from: WebPlayerView */
    class C11930a implements View.OnLayoutChangeListener {
        C11930a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C11929f.this.mo70895a();
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$b */
    /* compiled from: WebPlayerView */
    class C11931b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View.OnLayoutChangeListener f28978a;

        C11931b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f28978a = onLayoutChangeListener;
        }

        public void run() {
            C11929f.this.removeOnLayoutChangeListener(this.f28978a);
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$c */
    /* compiled from: WebPlayerView */
    private class C11932c implements Runnable {

        /* renamed from: a */
        private String f28980a = null;

        /* renamed from: b */
        private WebView f28981b = null;

        public C11932c(String str, WebView webView) {
            this.f28980a = str;
            this.f28981b = webView;
        }

        public void run() {
            String str = this.f28980a;
            if (str != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        C11929f.this.f28974c.invoke(this.f28981b, new Object[]{this.f28980a, null});
                        return;
                    }
                    C11929f.this.loadUrl(str);
                } catch (Exception e) {
                    C12065a.m32842a("Error while processing JavaScriptString", e);
                }
            } else {
                C12065a.m32848c("Could not process JavaScript, the string is NULL");
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$d */
    /* compiled from: WebPlayerView */
    private class C11933d extends WebChromeClient {
        private C11933d() {
        }

        public void onCloseWindow(WebView webView) {
            if (C11929f.this.m32503c("onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (C11929f.this.m32504d("onCloseWindow")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.CLOSE_WINDOW, C11929f.this.f28975d);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r8) {
            /*
                r7 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "onConsoleMessage"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r0 = super.onConsoleMessage(r8)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r1 = r1.m32504d(r2)
                if (r1 == 0) goto L_0x003f
                if (r8 == 0) goto L_0x0023
                java.lang.String r8 = r8.message()
                goto L_0x0025
            L_0x0023:
                java.lang.String r8 = ""
            L_0x0025:
                com.unity3d.services.core.webview.a r1 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r4 = com.unity3d.services.ads.webplayer.C11926c.CONSOLE_MESSAGE
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r8
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r8 = r8.f28975d
                r6 = 1
                r5[r6] = r8
                r1.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r4, (java.lang.Object[]) r5)
            L_0x003f:
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r8 = r8.m32496a((java.lang.String) r2)
                if (r8 == 0) goto L_0x0054
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                java.lang.Object r8 = r8.m32492a(r2, r1, r0)
                r0 = r8
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x0054:
                boolean r8 = r0.booleanValue()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11933d.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Boolean bool = Boolean.FALSE;
            Boolean valueOf = C11929f.this.m32503c("onCreateWindow") ? Boolean.valueOf(super.onCreateWindow(webView, z, z2, message)) : bool;
            if (C11929f.this.m32504d("onCreateWindow")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.CREATE_WINDOW, Boolean.valueOf(z), Boolean.valueOf(z2), message, C11929f.this.f28975d);
            }
            if (C11929f.this.m32496a("onCreateWindow")) {
                valueOf = (Boolean) C11929f.this.m32492a("onCreateWindow", Boolean.class, bool);
            }
            return valueOf.booleanValue();
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (C11929f.this.m32503c("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (C11929f.this.m32504d("onGeolocationPermissionsShowPrompt")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.GEOLOCATION_PERMISSIONS_SHOW, str, C11929f.this.f28975d);
            }
        }

        public void onHideCustomView() {
            if (C11929f.this.m32503c("onHideCustomView")) {
                super.onHideCustomView();
            }
            if (C11929f.this.m32504d("onHideCustomView")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.HIDE_CUSTOM_VIEW, C11929f.this.f28975d);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsAlert(android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, android.webkit.JsResult r10) {
            /*
                r6 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "onJsAlert"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r7 = super.onJsAlert(r7, r8, r9, r10)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32504d(r2)
                if (r7 == 0) goto L_0x003c
                com.unity3d.services.core.webview.a r7 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r1 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r3 = com.unity3d.services.ads.webplayer.C11926c.JS_ALERT
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r8
                r8 = 1
                r4[r8] = r9
                r8 = 2
                r4[r8] = r10
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r8 = r8.f28975d
                r9 = 3
                r4[r9] = r8
                r7.mo71310a((java.lang.Enum) r1, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            L_0x003c:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32496a((java.lang.String) r2)
                if (r7 == 0) goto L_0x0051
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
                java.lang.Object r7 = r7.m32492a(r2, r9, r8)
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x0051:
                boolean r7 = r0.booleanValue()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11933d.onJsAlert(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsConfirm(android.webkit.WebView r6, java.lang.String r7, java.lang.String r8, android.webkit.JsResult r9) {
            /*
                r5 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "onJsConfirm"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r6 = super.onJsConfirm(r6, r7, r8, r9)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r6 = r6.m32504d(r2)
                if (r6 == 0) goto L_0x0039
                com.unity3d.services.core.webview.a r6 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r9 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r1 = com.unity3d.services.ads.webplayer.C11926c.JS_CONFIRM
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r7
                r7 = 1
                r3[r7] = r8
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r7 = r7.f28975d
                r8 = 2
                r3[r8] = r7
                r6.mo71310a((java.lang.Enum) r9, (java.lang.Enum) r1, (java.lang.Object[]) r3)
            L_0x0039:
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r6 = r6.m32496a((java.lang.String) r2)
                if (r6 == 0) goto L_0x004e
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
                java.lang.Object r6 = r6.m32492a(r2, r8, r7)
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x004e:
                boolean r6 = r0.booleanValue()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11933d.onJsConfirm(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsPrompt(android.webkit.WebView r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, android.webkit.JsPromptResult r10) {
            /*
                r5 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "onJsPrompt"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r6 = super.onJsPrompt(r6, r7, r8, r9, r10)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r6 = r6.m32504d(r2)
                if (r6 == 0) goto L_0x003c
                com.unity3d.services.core.webview.a r6 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r10 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r1 = com.unity3d.services.ads.webplayer.C11926c.JS_PROMPT
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r7
                r7 = 1
                r3[r7] = r8
                r7 = 2
                r3[r7] = r9
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r7 = r7.f28975d
                r8 = 3
                r3[r8] = r7
                r6.mo71310a((java.lang.Enum) r10, (java.lang.Enum) r1, (java.lang.Object[]) r3)
            L_0x003c:
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r6 = r6.m32496a((java.lang.String) r2)
                if (r6 == 0) goto L_0x0051
                com.unity3d.services.ads.webplayer.f r6 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
                java.lang.Object r6 = r6.m32492a(r2, r8, r7)
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x0051:
                boolean r6 = r0.booleanValue()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11933d.onJsPrompt(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (C11929f.this.m32503c("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (C11929f.this.m32504d("onPermissionRequest")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.PERMISSION_REQUEST, (permissionRequest == null || permissionRequest.getOrigin() == null) ? "" : permissionRequest.getOrigin().toString(), C11929f.this.f28975d);
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            if (C11929f.this.m32503c("onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (C11929f.this.m32504d("onProgressChanged")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.PROGRESS_CHANGED, Integer.valueOf(i), C11929f.this.f28975d);
            }
        }

        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (C11929f.this.m32503c("onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (C11929f.this.m32504d("onReceivedIcon")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.RECEIVED_ICON, C11929f.this.f28975d);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (C11929f.this.m32503c("onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (C11929f.this.m32504d("onReceivedTitle")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.RECEIVED_TITLE, str, C11929f.this.f28975d);
            }
        }

        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (C11929f.this.m32503c("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (C11929f.this.m32504d("onReceivedTouchIconUrl")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.RECEIVED_TOUCH_ICON_URL, str, Boolean.valueOf(z), C11929f.this.f28975d);
            }
        }

        public void onRequestFocus(WebView webView) {
            if (C11929f.this.m32503c("onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (C11929f.this.m32504d("onRequestFocus")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.REQUEST_FOCUS, C11929f.this.f28975d);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C11929f.this.m32503c("onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (C11929f.this.m32504d("onShowCustomView")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.SHOW_CUSTOM_VIEW, C11929f.this.f28975d);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onShowFileChooser(android.webkit.WebView r7, android.webkit.ValueCallback<android.net.Uri[]> r8, android.webkit.WebChromeClient.FileChooserParams r9) {
            /*
                r6 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "onShowFileChooser"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r7 = super.onShowFileChooser(r7, r8, r9)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32504d(r2)
                if (r7 == 0) goto L_0x0033
                com.unity3d.services.core.webview.a r7 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r9 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r1 = com.unity3d.services.ads.webplayer.C11926c.SHOW_FILE_CHOOSER
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.unity3d.services.ads.webplayer.f r4 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r4 = r4.f28975d
                r5 = 0
                r3[r5] = r4
                r7.mo71310a((java.lang.Enum) r9, (java.lang.Enum) r1, (java.lang.Object[]) r3)
            L_0x0033:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32496a((java.lang.String) r2)
                if (r7 == 0) goto L_0x0052
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r7 = r7.m32492a(r2, r0, r9)
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r7 = r0.booleanValue()
                if (r7 == 0) goto L_0x0052
                r7 = 0
                r8.onReceiveValue(r7)
            L_0x0052:
                boolean r7 = r0.booleanValue()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11933d.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }

        /* synthetic */ C11933d(C11929f fVar, C11930a aVar) {
            this();
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$e */
    /* compiled from: WebPlayerView */
    private class C11934e extends WebViewClient {

        /* renamed from: com.unity3d.services.ads.webplayer.f$e$a */
        /* compiled from: WebPlayerView */
        class C11935a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WebView f28985a;

            C11935a(WebView webView) {
                this.f28985a = webView;
            }

            public void run() {
                C12081k.m32885a(this.f28985a);
                this.f28985a.destroy();
            }
        }

        private C11934e() {
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (C11929f.this.m32503c("onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (C11929f.this.m32504d("onFormResubmission")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.FORM_RESUBMISSION, C11929f.this.f28975d);
            }
        }

        public void onLoadResource(WebView webView, String str) {
            if (C11929f.this.m32503c("onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (C11929f.this.m32504d("onLoadResource")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.LOAD_RESOUCE, str, C11929f.this.f28975d);
            }
        }

        public void onPageCommitVisible(WebView webView, String str) {
            if (C11929f.this.m32503c("onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (C11929f.this.m32504d("onPageCommitVisible")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.PAGE_COMMIT_VISIBLE, str, C11929f.this.f28975d);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (C11929f.this.m32503c("onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (C11929f.this.m32504d("onPageFinished")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.PAGE_FINISHED, str, C11929f.this.f28975d);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (C11929f.this.m32503c("onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (C11929f.this.m32504d("onPageStarted")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.PAGE_STARTED, str, C11929f.this.f28975d);
            }
        }

        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            String str;
            if (C11929f.this.m32503c("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (C11929f.this.m32504d("onReceivedClientCertRequest")) {
                int i = -1;
                if (clientCertRequest != null) {
                    String host = clientCertRequest.getHost();
                    int port = clientCertRequest.getPort();
                    str = host;
                    i = port;
                } else {
                    str = "";
                }
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.CLIENT_CERT_REQUEST, str, Integer.valueOf(i), C11929f.this.f28975d);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (C11929f.this.m32503c("onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (C11929f.this.m32504d("onReceivedError")) {
                C11927d.m32479a(C11929f.this.f28975d, str2, str);
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (C11929f.this.m32503c("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (C11929f.this.m32504d("onReceivedHttpAuthRequest")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.HTTP_AUTH_REQUEST, str, str2, C11929f.this.f28975d);
            }
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (C11929f.this.m32503c("onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (C11929f.this.m32504d("onReceivedHttpError")) {
                String str = "";
                String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? str : webResourceRequest.getUrl().toString();
                int i = -1;
                if (webResourceResponse != null) {
                    i = webResourceResponse.getStatusCode();
                    str = webResourceResponse.getReasonPhrase();
                }
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.HTTP_ERROR, uri, str, Integer.valueOf(i), C11929f.this.f28975d);
            }
        }

        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (C11929f.this.m32503c("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (C11929f.this.m32504d("onReceivedLoginRequest")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.LOGIN_REQUEST, str, str2, str3, C11929f.this.f28975d);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            C12065a.m32846b("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            if (C11929f.this.m32504d("onReceivedSslError")) {
                String url = sslError.getUrl();
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.SSL_ERROR, url, C11929f.this.f28975d);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C12080j.m32879a((Runnable) new C11935a(webView));
            String b = C11929f.this.f28975d;
            String url = C11929f.this.getUrl();
            C11927d.m32479a(b, url, "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            C12065a.m32848c("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            if (C11929f.this.m32503c("onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (C11929f.this.m32504d("onScaleChanged")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.SCALE_CHANGED, Float.valueOf(f), Float.valueOf(f2), C11929f.this.f28975d);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (C11929f.this.m32503c("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (C11929f.this.m32504d("onUnhandledKeyEvent")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.UNHANDLED_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), C11929f.this.f28975d);
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse shouldInterceptRequest = C11929f.this.m32503c("shouldInterceptRequest") ? super.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (C11929f.this.m32504d("shouldInterceptRequest")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), C11929f.this.f28975d);
            }
            return shouldInterceptRequest;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideKeyEvent(android.webkit.WebView r8, android.view.KeyEvent r9) {
            /*
                r7 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "shouldOverrideKeyEvent"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r8 = super.shouldOverrideKeyEvent(r8, r9)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r8 = r8.m32504d(r2)
                if (r8 == 0) goto L_0x0049
                com.unity3d.services.core.webview.a r8 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r1 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r3 = com.unity3d.services.ads.webplayer.C11926c.SHOULD_OVERRIDE_KEY_EVENT
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r5 = r9.getKeyCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r4[r6] = r5
                int r9 = r9.getAction()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5 = 1
                r4[r5] = r9
                com.unity3d.services.ads.webplayer.f r9 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r9 = r9.f28975d
                r5 = 2
                r4[r5] = r9
                r8.mo71310a((java.lang.Enum) r1, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            L_0x0049:
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r8 = r8.m32496a((java.lang.String) r2)
                if (r8 == 0) goto L_0x005e
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r8 = r8.m32492a(r2, r0, r9)
                r0 = r8
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x005e:
                boolean r8 = r0.booleanValue()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11934e.shouldOverrideKeyEvent(android.webkit.WebView, android.view.KeyEvent):boolean");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r8, android.webkit.WebResourceRequest r9) {
            /*
                r7 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "shouldOverrideUrlLoading"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r8 = super.shouldOverrideUrlLoading(r8, r9)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r8 = r8.m32504d(r2)
                if (r8 == 0) goto L_0x0045
                com.unity3d.services.core.webview.a r8 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r1 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r3 = com.unity3d.services.ads.webplayer.C11926c.SHOULD_OVERRIDE_URL_LOADING
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                android.net.Uri r5 = r9.getUrl()
                java.lang.String r5 = r5.toString()
                r6 = 0
                r4[r6] = r5
                java.lang.String r9 = r9.getMethod()
                r5 = 1
                r4[r5] = r9
                com.unity3d.services.ads.webplayer.f r9 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r9 = r9.f28975d
                r5 = 2
                r4[r5] = r9
                r8.mo71310a((java.lang.Enum) r1, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            L_0x0045:
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r8 = r8.m32496a((java.lang.String) r2)
                if (r8 == 0) goto L_0x005a
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r8 = r8.m32492a(r2, r0, r9)
                r0 = r8
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x005a:
                boolean r8 = r0.booleanValue()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11934e.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
        }

        /* synthetic */ C11934e(C11929f fVar, C11930a aVar) {
            this();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (C11929f.this.m32503c("onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (C11929f.this.m32504d("onReceivedError")) {
                String str = "";
                String charSequence = (webResourceError == null || webResourceError.getDescription() == null) ? str : webResourceError.getDescription().toString();
                if (!(webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                    str = webResourceRequest.getUrl().toString();
                }
                C11927d.m32479a(C11929f.this.f28975d, str, charSequence);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                com.unity3d.services.ads.webplayer.f r1 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r2 = "shouldOverrideUrlLoading"
                boolean r1 = r1.m32503c((java.lang.String) r2)
                if (r1 == 0) goto L_0x0014
                boolean r7 = super.shouldOverrideUrlLoading(r7, r8)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            L_0x0014:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32504d(r2)
                if (r7 == 0) goto L_0x0036
                com.unity3d.services.core.webview.a r7 = com.unity3d.services.core.webview.C12136a.m33103c()
                com.unity3d.services.core.webview.b r1 = com.unity3d.services.core.webview.C12143b.WEBPLAYER
                com.unity3d.services.ads.webplayer.c r3 = com.unity3d.services.ads.webplayer.C11926c.SHOULD_OVERRIDE_URL_LOADING
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r8
                com.unity3d.services.ads.webplayer.f r8 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.String r8 = r8.f28975d
                r5 = 1
                r4[r5] = r8
                r7.mo71310a((java.lang.Enum) r1, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            L_0x0036:
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                boolean r7 = r7.m32496a((java.lang.String) r2)
                if (r7 == 0) goto L_0x004b
                com.unity3d.services.ads.webplayer.f r7 = com.unity3d.services.ads.webplayer.C11929f.this
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r7 = r7.m32492a(r2, r0, r8)
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
            L_0x004b:
                boolean r7 = r0.booleanValue()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.webplayer.C11929f.C11934e.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$f */
    /* compiled from: WebPlayerView */
    private class C11936f implements DownloadListener {
        private C11936f() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (C11929f.this.m32504d("onDownloadStart")) {
                C12136a.m33103c().mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.DOWNLOAD_START, str, str2, str3, str4, Long.valueOf(j), C11929f.this.f28975d);
            }
        }

        /* synthetic */ C11936f(C11929f fVar, C11930a aVar) {
            this();
        }
    }

    public C11929f(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(context);
        this.f28975d = str;
        WebSettings settings = getSettings();
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (i >= 19) {
            try {
                this.f28974c = WebView.class.getMethod("evaluateJavascript", new Class[]{String.class, ValueCallback.class});
            } catch (NoSuchMethodException e) {
                C12065a.m32842a("Method evaluateJavascript not found", (Exception) e);
                this.f28974c = null;
            }
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        C12081k.m32886a((View) this, (Drawable) new ColorDrawable(0));
        setBackgroundResource(0);
        mo70896a(jSONObject, jSONObject2);
        setWebViewClient(new C11934e(this, (C11930a) null));
        setWebChromeClient(new C11933d(this, (C11930a) null));
        setDownloadListener(new C11936f(this, (C11930a) null));
        addJavascriptInterface(new C11924a(str), "webplayerbridge");
        C11937g.m32510a().mo70944a(str, this);
        m32499b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m32504d(String str) {
        try {
            JSONObject jSONObject = this.f28973b;
            if (jSONObject == null || !jSONObject.has(str) || !this.f28973b.getJSONObject(str).has("sendEvent")) {
                return false;
            }
            return this.f28973b.getJSONObject(str).getBoolean("sendEvent");
        } catch (Exception e) {
            C12065a.m32842a("Error getting send event status", e);
            return false;
        }
    }

    public void destroy() {
        super.destroy();
        C11937g.m32510a().mo70945b(this.f28975d);
        Runnable runnable = this.f28976e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public Map<String, String> getErroredSettings() {
        return this.f28972a;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo70895a();
    }

    public void setEventSettings(JSONObject jSONObject) {
        this.f28973b = jSONObject;
    }

    /* renamed from: c */
    public void mo70898c(JSONArray jSONArray) {
        mo70897b("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    /* renamed from: b */
    private void m32499b() {
        Runnable runnable = this.f28976e;
        if (runnable != null) {
            runnable.run();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            C11930a aVar = new C11930a();
            addOnLayoutChangeListener(aVar);
            this.f28976e = new C11931b(aVar);
        }
    }

    /* renamed from: a */
    public void mo70896a(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> map = this.f28972a;
        if (map != null) {
            map.clear();
        }
        m32491a((Object) getSettings(), jSONObject);
        m32491a((Object) this, jSONObject2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m32503c(String str) {
        try {
            JSONObject jSONObject = this.f28973b;
            if (jSONObject == null || !jSONObject.has(str) || !this.f28973b.getJSONObject(str).has("callSuper")) {
                return true;
            }
            return this.f28973b.getJSONObject(str).getBoolean("callSuper");
        } catch (Exception e) {
            C12065a.m32842a("Error getting super call status", e);
            return true;
        }
    }

    /* renamed from: a */
    public void mo70895a() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        C11927d.m32477a(this.f28975d, iArr[0], iArr[1], getWidth(), getHeight(), Build.VERSION.SDK_INT >= 11 ? getAlpha() : 1.0f);
    }

    /* renamed from: b */
    public void mo70897b(String str) {
        C12080j.m32879a((Runnable) new C11932c(str, this));
    }

    /* renamed from: b */
    private Object[] m32501b(JSONArray jSONArray) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (string2 != null && string.equals("Enum")) {
                    objArr2[i] = Enum.valueOf(Class.forName(string2), (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        return objArr;
    }

    /* renamed from: a */
    private Object m32491a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, m32497a(jSONArray)).invoke(obj, m32501b(jSONArray));
                } catch (Exception e) {
                    m32494a(next, e.getMessage());
                    C12065a.m32842a("Setting errored", e);
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    private Class<?>[] m32497a(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                clsArr[i] = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
            } else {
                clsArr[i] = mo70894a(jSONArray.get(i).getClass());
            }
        }
        return clsArr;
    }

    /* renamed from: a */
    public Class<?> mo70894a(Class<?> cls) {
        String name = cls.getName();
        if (name.equals("java.lang.Byte")) {
            return Byte.TYPE;
        }
        if (name.equals("java.lang.Short")) {
            return Short.TYPE;
        }
        if (name.equals("java.lang.Integer")) {
            return Integer.TYPE;
        }
        if (name.equals("java.lang.Long")) {
            return Long.TYPE;
        }
        if (name.equals("java.lang.Character")) {
            return Character.TYPE;
        }
        if (name.equals("java.lang.Float")) {
            return Float.TYPE;
        }
        if (name.equals("java.lang.Double")) {
            return Double.TYPE;
        }
        if (name.equals("java.lang.Boolean")) {
            return Boolean.TYPE;
        }
        return name.equals("java.lang.Void") ? Void.TYPE : cls;
    }

    /* renamed from: a */
    private void m32494a(String str, String str2) {
        if (this.f28972a == null) {
            this.f28972a = new HashMap();
        }
        this.f28972a.put(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> T m32492a(String str, Class<T> cls, T t) {
        try {
            JSONObject jSONObject = this.f28973b;
            if (jSONObject != null && jSONObject.has(str) && this.f28973b.getJSONObject(str).has("returnValue")) {
                return cls.cast(this.f28973b.getJSONObject(str).get("returnValue"));
            }
        } catch (Exception e) {
            C12065a.m32842a("Error getting default return value", e);
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m32496a(String str) {
        try {
            JSONObject jSONObject = this.f28973b;
            if (jSONObject == null || !jSONObject.has(str) || !this.f28973b.getJSONObject(str).has("returnValue")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C12065a.m32842a("Error getting default return value", e);
            return false;
        }
    }
}
