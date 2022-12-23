package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11480fo;
import com.tapjoy.internal.C11500ga;
import com.tapjoy.internal.C11520gi;
import com.tapjoy.internal.C11589hx;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class TJAdUnit implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public static TJVideoListener f26459a;

    /* renamed from: A */
    private int f26460A = -1;

    /* renamed from: B */
    private int f26461B;

    /* renamed from: C */
    private int f26462C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f26463D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f26464E;

    /* renamed from: F */
    private C11480fo f26465F;

    /* renamed from: G */
    private C11500ga f26466G;

    /* renamed from: H */
    private final Runnable f26467H = new Runnable() {
        public final void run() {
            int streamVolume = TJAdUnit.this.f26486p.getStreamVolume(3);
            if (TJAdUnit.this.f26487q != streamVolume) {
                int unused = TJAdUnit.this.f26487q = streamVolume;
                TJAdUnit.this.f26477g.onVolumeChanged();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final Runnable f26468I = new Runnable() {
        public final void run() {
            if (TJAdUnit.this.f26472b.getCurrentPosition() != 0) {
                if (!TJAdUnit.this.f26483m) {
                    boolean unused = TJAdUnit.this.f26483m = true;
                }
                TJAdUnit.this.f26477g.onVideoStarted(TJAdUnit.this.f26481k);
                TJAdUnit.this.f26469J.run();
            } else if (!TJAdUnit.this.f26463D) {
                TJAdUnit.this.f26473c.postDelayed(TJAdUnit.this.f26468I, 200);
            } else {
                boolean unused2 = TJAdUnit.this.f26464E = true;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Runnable f26469J = new Runnable() {
        public final void run() {
            TJAdUnit.this.f26477g.onVideoProgress(TJAdUnit.this.f26472b.getCurrentPosition());
            TJAdUnit.this.f26473c.postDelayed(TJAdUnit.this.f26469J, 500);
        }
    };

    /* renamed from: K */
    private WebViewClient f26470K = new WebViewClient() {
        public final void onLoadResource(WebView webView, String str) {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return m30691a(str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return m30691a(webResourceRequest.getUrl().toString());
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            TapjoyLog.m30839d("TJAdUnit", "onPageStarted: ".concat(String.valueOf(str)));
            if (TJAdUnit.this.f26477g != null) {
                TJAdUnit.this.f26477g.allowRedirect = true;
                TJAdUnit.this.f26477g.customClose = false;
                TJAdUnit.this.f26477g.closeRequested = false;
                TJAdUnit.this.m30656b();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m30839d("TJAdUnit", "onPageFinished: ".concat(String.valueOf(str)));
            if (TJAdUnit.this.f26476f != null) {
                TJAdUnit.this.f26476f.setProgressSpinnerVisibility(false);
            }
            boolean unused = TJAdUnit.this.f26496z = true;
            if (TJAdUnit.this.f26492v) {
                TJAdUnit.this.m30651a();
            }
            if (TJAdUnit.this.f26477g != null) {
                TJAdUnit.this.f26477g.flushMessageQueue();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m30839d("TJAdUnit", "error:".concat(String.valueOf(str)));
            if (TJAdUnit.this.f26476f != null) {
                TJAdUnit.this.f26476f.showErrorDialog();
            }
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().mo70030a("loadFailure");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            TapjoyLog.m30840e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().mo70030a("terminated");
            }
            if (TJAdUnit.this.f26472b != null && (TJAdUnit.this.f26483m || TJAdUnit.this.f26472b.getDuration() > 0)) {
                boolean unused = TJAdUnit.this.f26483m = false;
                boolean unused2 = TJAdUnit.this.f26482l = true;
                TJAdUnit.this.fireOnVideoError("WebView loading while trying to play video.");
            }
            if (TJAdUnit.this.f26478h != null) {
                ViewGroup viewGroup = (ViewGroup) TJAdUnit.this.f26478h.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJAdUnit.this.f26478h);
                }
                TJAdUnit.this.f26478h.removeAllViews();
                TJAdUnit.this.f26478h.destroy();
                TJWebView unused3 = TJAdUnit.this.f26478h = null;
            }
            if (TJAdUnit.this.f26479i != null) {
                ViewGroup viewGroup2 = (ViewGroup) TJAdUnit.this.f26479i.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(TJAdUnit.this.f26479i);
                }
                TJAdUnit.this.f26479i.removeAllViews();
                TJAdUnit.this.f26479i.destroy();
                TJWebView unused4 = TJAdUnit.this.f26479i = null;
            }
            if (TJAdUnit.this.f26477g != null) {
                TJAdUnit.this.f26477g.cleanUpJSBridge();
                TJAdUnitJSBridge unused5 = TJAdUnit.this.f26477g = null;
            }
            if (TJAdUnit.this.f26476f != null) {
                TJAdUnit.this.f26476f.finish();
            }
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TapjoyCachedAssetData cachedDataForURL;
            WebResourceResponse a;
            if (TapjoyCache.getInstance() == null || (cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(str)) == null || (a = m30690a(cachedDataForURL)) == null) {
                return super.shouldInterceptRequest(webView, str);
            }
            TapjoyLog.m30839d("TJAdUnit", "Reading request for " + str + " from cache -- localPath: " + cachedDataForURL.getLocalFilePath());
            return a;
        }

        /* renamed from: a */
        private boolean m30691a(String str) {
            if (!TJAdUnit.this.m30669f() || !URLUtil.isValidUrl(str)) {
                if (TJAdUnit.this.f26476f != null) {
                    TJAdUnit.this.f26476f.showErrorDialog();
                }
                return true;
            } else if (TJAdUnit.m30659b(str)) {
                return false;
            } else {
                if (TJAdUnit.this.f26477g.allowRedirect) {
                    Uri parse = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    if (TJAdUnit.this.f26479i.getContext() != null) {
                        try {
                            TJAdUnit.this.f26479i.getContext().startActivity(intent);
                            return true;
                        } catch (Exception e) {
                            TapjoyLog.m30841e("TJAdUnit", "Exception in loading URL. " + e.getMessage());
                        }
                    }
                } else if (str.startsWith("javascript:") && Build.VERSION.SDK_INT >= 19) {
                    try {
                        TJAdUnit.this.f26479i.evaluateJavascript(str.replaceFirst("javascript:", ""), (ValueCallback) null);
                        return true;
                    } catch (Exception e2) {
                        TapjoyLog.m30841e("TJAdUnit", "Exception in evaluateJavascript. Device not supported. " + e2.toString());
                    }
                }
                return false;
            }
        }

        /* renamed from: a */
        private static WebResourceResponse m30690a(TapjoyCachedAssetData tapjoyCachedAssetData) {
            if (tapjoyCachedAssetData == null) {
                return null;
            }
            try {
                return new WebResourceResponse(tapjoyCachedAssetData.getMimeType(), "UTF-8", new FileInputStream(tapjoyCachedAssetData.getLocalFilePath()));
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* renamed from: L */
    private WebChromeClient f26471L = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            TapjoyLog.m30839d("TJAdUnit", str2);
            return false;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (!TJAdUnit.this.f26477g.closeRequested) {
                return true;
            }
            String[] strArr = {"Uncaught", "uncaught", "Error", "error", "not defined"};
            if (TJAdUnit.this.f26476f == null) {
                return true;
            }
            for (int i = 0; i < 5; i++) {
                if (consoleMessage.message().contains(strArr[i])) {
                    TJAdUnit.this.f26476f.handleClose();
                    return true;
                }
            }
            return true;
        }
    };

    /* renamed from: b */
    VideoView f26472b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f26473c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private TJAdUnitWebViewListener f26474d;

    /* renamed from: e */
    private TJAdUnitVideoListener f26475e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TJAdUnitActivity f26476f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TJAdUnitJSBridge f26477g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TJWebView f26478h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TJWebView f26479i;

    /* renamed from: j */
    private MediaPlayer f26480j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f26481k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f26482l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f26483m;

    /* renamed from: n */
    private boolean f26484n;
    @Nullable

    /* renamed from: o */
    private ScheduledFuture<?> f26485o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AudioManager f26486p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f26487q = 0;

    /* renamed from: r */
    private int f26488r;

    /* renamed from: s */
    private boolean f26489s;

    /* renamed from: t */
    private boolean f26490t;

    /* renamed from: u */
    private boolean f26491u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f26492v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f26493w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f26494x;

    /* renamed from: y */
    private volatile boolean f26495y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f26496z;

    public interface TJAdUnitVideoListener {
        void onVideoCompleted();

        void onVideoError(String str);

        void onVideoStart();
    }

    public interface TJAdUnitWebViewListener {
        void onClick();

        void onClosed();

        void onContentReady();
    }

    /* renamed from: a */
    private static boolean m30652a(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    /* renamed from: b */
    private static boolean m30657b(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo69170a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() && !this.f26495y && context != null) {
            TapjoyLog.m30839d("TJAdUnit", "Constructing ad unit");
            this.f26495y = true;
            try {
                TJWebView tJWebView = new TJWebView(context);
                this.f26478h = tJWebView;
                tJWebView.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html><head><title>Tapjoy Background Webview</title></head></html>", "text/html", "utf-8", (String) null);
                TJWebView tJWebView2 = new TJWebView(context);
                this.f26479i = tJWebView2;
                tJWebView2.setWebViewClient(this.f26470K);
                this.f26479i.setWebChromeClient(this.f26471L);
                VideoView videoView = new VideoView(context);
                this.f26472b = videoView;
                videoView.setOnCompletionListener(this);
                this.f26472b.setOnErrorListener(this);
                this.f26472b.setOnPreparedListener(this);
                this.f26472b.setVisibility(4);
                this.f26477g = new TJAdUnitJSBridge(context, this);
                if (context instanceof TJAdUnitActivity) {
                    setAdUnitActivity((TJAdUnitActivity) context);
                }
            } catch (Exception e) {
                TapjoyLog.m30844w("TJAdUnit", e.getMessage());
                return false;
            }
        }
        return this.f26495y;
    }

    public boolean preload(TJPlacementData tJPlacementData, Context context) {
        if (this.f26493w || !tJPlacementData.isPrerenderingRequested() || !TJPlacementManager.canPreRenderPlacement() || TapjoyConnectCore.isViewOpen()) {
            fireContentReady();
            return false;
        }
        TapjoyLog.m30842i("TJAdUnit", "Pre-rendering ad unit for placement: " + tJPlacementData.getPlacementName());
        TJPlacementManager.incrementPlacementPreRenderCount();
        load(tJPlacementData, true, context);
        return true;
    }

    public void load(final TJPlacementData tJPlacementData, final boolean z, final Context context) {
        this.f26493w = false;
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnit.this.mo69170a(context)) {
                    TapjoyLog.m30842i("TJAdUnit", "Loading ad unit content");
                    boolean z = true;
                    boolean unused = TJAdUnit.this.f26493w = true;
                    try {
                        if (!TextUtils.isEmpty(tJPlacementData.getRedirectURL())) {
                            if (tJPlacementData.isPreloadDisabled()) {
                                TJAdUnit.this.f26479i.postUrl(tJPlacementData.getRedirectURL(), (byte[]) null);
                            } else {
                                TJAdUnit.this.f26479i.loadUrl(tJPlacementData.getRedirectURL());
                            }
                        } else if (tJPlacementData.getBaseURL() == null || tJPlacementData.getHttpResponse() == null) {
                            TapjoyLog.m30840e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                            boolean unused2 = TJAdUnit.this.f26493w = false;
                        } else {
                            TJAdUnit.this.f26479i.loadDataWithBaseURL(tJPlacementData.getBaseURL(), tJPlacementData.getHttpResponse(), "text/html", "utf-8", (String) null);
                        }
                    } catch (Exception unused3) {
                        TapjoyLog.m30840e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                        boolean unused4 = TJAdUnit.this.f26493w = false;
                    }
                    TJAdUnit tJAdUnit = TJAdUnit.this;
                    if (!tJAdUnit.f26493w || !z) {
                        z = false;
                    }
                    boolean unused5 = tJAdUnit.f26494x = z;
                }
            }
        });
    }

    public void resume(TJAdUnitSaveStateData tJAdUnitSaveStateData) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge == null) {
            TJAdUnitActivity tJAdUnitActivity = this.f26476f;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
                TapjoyLog.m30844w("TJAdUnit", "Failed to resume TJAdUnit. TJAdUnitBridge is null.");
                return;
            }
            return;
        }
        if (tJAdUnitJSBridge.didLaunchOtherActivity) {
            TapjoyLog.m30839d("TJAdUnit", "onResume bridge.didLaunchOtherActivity callbackID: " + this.f26477g.otherActivityCallbackID);
            TJAdUnitJSBridge tJAdUnitJSBridge2 = this.f26477g;
            tJAdUnitJSBridge2.invokeJSCallback(tJAdUnitJSBridge2.otherActivityCallbackID, Boolean.TRUE);
            this.f26477g.didLaunchOtherActivity = false;
        }
        this.f26463D = false;
        this.f26477g.setEnabled(true);
        if (tJAdUnitSaveStateData != null) {
            int i = tJAdUnitSaveStateData.seekTime;
            this.f26481k = i;
            this.f26472b.seekTo(i);
            if (this.f26480j != null) {
                this.f26489s = tJAdUnitSaveStateData.isVideoMuted;
            }
        }
        if (this.f26464E) {
            this.f26464E = false;
            this.f26473c.postDelayed(this.f26468I, 200);
        }
    }

    public void pause() {
        this.f26463D = true;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setEnabled(false);
        }
        pauseVideo();
    }

    public void invokeBridgeCallback(String str, Object... objArr) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge != null && str != null) {
            tJAdUnitJSBridge.invokeJSCallback(str, objArr);
        }
    }

    public void destroy() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.destroy();
        }
        m30664d();
        TJWebView tJWebView = this.f26478h;
        if (tJWebView != null) {
            tJWebView.removeAllViews();
            this.f26478h = null;
        }
        TJWebView tJWebView2 = this.f26479i;
        if (tJWebView2 != null) {
            tJWebView2.removeAllViews();
            this.f26479i = null;
        }
        this.f26495y = false;
        this.f26492v = false;
        setAdUnitActivity((TJAdUnitActivity) null);
        m30656b();
        this.f26480j = null;
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f26474d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClosed();
        }
        resetContentLoadState();
    }

    public void resetContentLoadState() {
        this.f26493w = false;
        this.f26496z = false;
        this.f26494x = false;
        this.f26460A = -1;
        this.f26491u = false;
        this.f26489s = false;
    }

    public void setVisible(boolean z) {
        this.f26477g.notifyOrientationChanged(getScreenOrientationString(), this.f26461B, this.f26462C);
        this.f26492v = z;
        if (z && this.f26496z) {
            m30651a();
        }
    }

    public void fireContentReady() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f26474d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onContentReady();
        }
    }

    public void fireOnClick() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f26474d;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClick();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30651a() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.display();
        }
    }

    public void closeRequested(boolean z) {
        this.f26477g.closeRequested(Boolean.valueOf(z));
    }

    public void setOrientation(int i) {
        TJAdUnitActivity tJAdUnitActivity = this.f26476f;
        if (tJAdUnitActivity != null) {
            int c = m30660c();
            int i2 = this.f26460A;
            if (i2 != -1) {
                c = i2;
            }
            if ((m30652a(c) && m30652a(i)) || (m30657b(c) && m30657b(i))) {
                i = c;
            }
            tJAdUnitActivity.setRequestedOrientation(i);
            this.f26460A = i;
            this.f26491u = true;
        }
    }

    public void unsetOrientation() {
        TJAdUnitActivity tJAdUnitActivity = this.f26476f;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.setRequestedOrientation(-1);
        }
        this.f26460A = -1;
        this.f26491u = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30656b() {
        TapjoyLog.m30839d("TJAdUnit", "detachVolumeListener");
        ScheduledFuture<?> scheduledFuture = this.f26485o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f26485o = null;
        }
        this.f26486p = null;
    }

    /* renamed from: c */
    private int m30660c() {
        TJAdUnitActivity tJAdUnitActivity = this.f26476f;
        if (tJAdUnitActivity == null) {
            return -1;
        }
        int rotation = tJAdUnitActivity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        tJAdUnitActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f26461B = displayMetrics.widthPixels;
        this.f26462C = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && this.f26462C > this.f26461B) || ((rotation == 1 || rotation == 3) && this.f26461B > this.f26462C)) {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            return 8;
                        }
                    }
                }
                return 0;
            }
            return 1;
        }
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation == 2) {
                    return 8;
                }
                if (rotation != 3) {
                    TapjoyLog.m30844w("TJAdUnit", "Unknown screen orientation. Defaulting to landscape.");
                }
            }
            return 1;
        }
        return 0;
        return 9;
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f26476f = tJAdUnitActivity;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setAdUnitActivity(tJAdUnitActivity);
        }
    }

    public void setAdContentTracker(C11480fo foVar) {
        this.f26465F = foVar;
    }

    public void setBackgroundColor(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m30839d("TJAdUnit", "setBackgroundColor: " + str);
                    TJAdUnit.this.f26478h.setBackgroundColor(Color.parseColor(str));
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m30839d("TJAdUnit", "Error setting background color. backgroundWebView: " + TJAdUnit.this.f26478h + ", hexColor: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setBackgroundContent(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m30839d("TJAdUnit", "setBackgroundContent: " + str);
                    TJAdUnit.this.f26478h.loadDataWithBaseURL((String) null, str, "text/html", "utf-8", (String) null);
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m30839d("TJAdUnit", "Error setting background content. backgroundWebView: " + TJAdUnit.this.f26478h + ", content: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setWebViewListener(TJAdUnitWebViewListener tJAdUnitWebViewListener) {
        this.f26474d = tJAdUnitWebViewListener;
    }

    public void setVideoListener(TJAdUnitVideoListener tJAdUnitVideoListener) {
        this.f26475e = tJAdUnitVideoListener;
    }

    public int getLockedOrientation() {
        return this.f26460A;
    }

    public int getScreenWidth() {
        return this.f26461B;
    }

    public int getScreenHeight() {
        return this.f26462C;
    }

    public String getScreenOrientationString() {
        return m30652a(m30660c()) ? "landscape" : "portrait";
    }

    public boolean hasCalledLoad() {
        return this.f26493w;
    }

    public boolean isPrerendered() {
        return this.f26494x;
    }

    public boolean isLockedOrientation() {
        return this.f26491u;
    }

    public TJWebView getBackgroundWebView() {
        return this.f26478h;
    }

    public TJWebView getWebView() {
        return this.f26479i;
    }

    public boolean getCloseRequested() {
        return this.f26477g.closeRequested;
    }

    public void loadVideoUrl(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnit.this.f26472b != null) {
                    TapjoyLog.m30842i("TJAdUnit", "loadVideoUrl: " + str);
                    TJAdUnit.this.f26472b.setVideoPath(str);
                    TJAdUnit.this.f26472b.setVisibility(0);
                    TJAdUnit.this.f26472b.seekTo(0);
                    adUnitAsyncTaskListner.onComplete(true);
                    return;
                }
                adUnitAsyncTaskListner.onComplete(false);
            }
        });
    }

    public boolean playVideo() {
        TapjoyLog.m30842i("TJAdUnit", MraidJsMethods.PLAY_VIDEO);
        VideoView videoView = this.f26472b;
        if (videoView == null) {
            return false;
        }
        videoView.start();
        this.f26484n = false;
        this.f26473c.postDelayed(this.f26468I, 200);
        return true;
    }

    public boolean pauseVideo() {
        m30664d();
        VideoView videoView = this.f26472b;
        if (videoView == null || !videoView.isPlaying()) {
            return false;
        }
        this.f26472b.pause();
        this.f26481k = this.f26472b.getCurrentPosition();
        TapjoyLog.m30842i("TJAdUnit", "Video paused at: " + this.f26481k);
        this.f26477g.onVideoPaused(this.f26481k);
        return true;
    }

    public void clearVideo(final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner, final boolean z) {
        if (this.f26472b != null) {
            m30664d();
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnit.this.f26472b.setVisibility(z ? 0 : 4);
                    TJAdUnit.this.f26472b.stopPlayback();
                    boolean unused = TJAdUnit.this.f26483m = false;
                    boolean unused2 = TJAdUnit.this.f26482l = false;
                    int unused3 = TJAdUnit.this.f26481k = 0;
                    adUnitAsyncTaskListner.onComplete(true);
                }
            });
            return;
        }
        adUnitAsyncTaskListner.onComplete(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69169a(boolean z) {
        MediaPlayer mediaPlayer = this.f26480j;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
            if (this.f26490t != z) {
                this.f26490t = z;
                this.f26477g.onVolumeChanged();
                return;
            }
            return;
        }
        this.f26489s = z;
    }

    public void attachVolumeListener(boolean z, int i) {
        TJAdUnitActivity tJAdUnitActivity;
        TapjoyLog.m30839d("TJAdUnit", "attachVolumeListener: isAttached=" + z + "; interval=" + i);
        m30656b();
        if (z && (tJAdUnitActivity = this.f26476f) != null) {
            AudioManager audioManager = (AudioManager) tJAdUnitActivity.getSystemService("audio");
            this.f26486p = audioManager;
            this.f26487q = audioManager.getStreamVolume(3);
            this.f26488r = this.f26486p.getStreamMaxVolume(3);
            long j = (long) i;
            this.f26485o = C11589hx.f27868a.scheduleWithFixedDelay(this.f26467H, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public VideoView getVideoView() {
        return this.f26472b;
    }

    public int getVideoSeekTime() {
        return this.f26481k;
    }

    public boolean isVideoComplete() {
        return this.f26484n;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        TapjoyLog.m30842i("TJAdUnit", "video -- onPrepared");
        final int duration = this.f26472b.getDuration();
        final int measuredWidth = this.f26472b.getMeasuredWidth();
        final int measuredHeight = this.f26472b.getMeasuredHeight();
        this.f26480j = mediaPlayer;
        boolean z = this.f26489s;
        if (z) {
            mo69169a(z);
        }
        if (this.f26481k <= 0 || this.f26472b.getCurrentPosition() == this.f26481k) {
            TJAdUnitJSBridge tJAdUnitJSBridge = this.f26477g;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.onVideoReady(duration, measuredWidth, measuredHeight);
            }
        } else {
            this.f26480j.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    TJAdUnit.this.f26477g.onVideoReady(duration, measuredWidth, measuredHeight);
                }
            });
        }
        this.f26480j.setOnInfoListener(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        TapjoyLog.m30840e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating the VideoView: " + i + " - " + i2));
        this.f26482l = true;
        m30664d();
        String str2 = (i != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED") + " -- ";
        if (i2 == -1010) {
            str = str2 + "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str = str2 + "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str = str2 + "MEDIA_ERROR_IO";
        } else if (i2 != -110) {
            str = str2 + "MEDIA_ERROR_EXTRA_UNKNOWN";
        } else {
            str = str2 + "MEDIA_ERROR_TIMED_OUT";
        }
        this.f26477g.onVideoError(str);
        if (i == 1 || i2 == -1004) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m30664d() {
        this.f26473c.removeCallbacks(this.f26468I);
        this.f26473c.removeCallbacks(this.f26469J);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        TapjoyLog.m30842i("TJAdUnit", "video -- onCompletion");
        m30664d();
        this.f26484n = true;
        if (!this.f26482l) {
            this.f26477g.onVideoCompletion();
        }
        this.f26482l = false;
    }

    public void fireOnVideoStart() {
        TapjoyLog.m30843v("TJAdUnit", "Firing onVideoStart");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoStart();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f26475e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoStart();
        }
    }

    public void fireOnVideoError(String str) {
        TapjoyLog.m30841e("TJAdUnit", "Firing onVideoError with error: ".concat(String.valueOf(str)));
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoError(3);
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f26475e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoError(str);
        }
    }

    public void fireOnVideoComplete() {
        TapjoyLog.m30843v("TJAdUnit", "Firing onVideoComplete");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoComplete();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f26475e;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoCompleted();
        }
    }

    public float getVolume() {
        return ((float) this.f26487q) / ((float) this.f26488r);
    }

    public boolean isMuted() {
        return this.f26490t;
    }

    public void startAdContentTracking(String str, JSONObject jSONObject) {
        C11480fo foVar = this.f26465F;
        if (foVar != null) {
            foVar.mo70001a(str, jSONObject);
        }
    }

    public void endAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f26465F != null) {
            m30666e();
            this.f26465F.mo70002b(str, jSONObject);
        }
    }

    public void sendAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f26465F != null) {
            m30666e();
            C11480fo foVar = this.f26465F;
            Map<String, Object> a = C11480fo.m31443a(jSONObject);
            C11520gi.m31534e(str).mo70067a(foVar.f27581a).mo70067a(a).mo70070b(C11480fo.m31444b(jSONObject)).mo70071c();
        }
    }

    /* renamed from: e */
    private void m30666e() {
        C11480fo foVar = this.f26465F;
        if (foVar != null) {
            foVar.mo70014a("prerendered", Boolean.valueOf(this.f26494x));
        }
    }

    public void setSdkBeacon(C11500ga gaVar) {
        this.f26466G = gaVar;
        if (gaVar != null && this.f26492v) {
            gaVar.mo70029a();
        }
    }

    public C11500ga getSdkBeacon() {
        return this.f26466G;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        if (i == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i != 801) {
            switch (i) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        this.f26477g.onVideoInfo(str);
        return false;
    }

    public TJVideoListener getPublisherVideoListener() {
        return f26459a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m30659b(String str) {
        try {
            String host = new URL(TapjoyConnectCore.getHostURL()).getHost();
            if ((host == null || !str.contains(host)) && !str.contains(TapjoyConnectCore.getRedirectDomain()) && !str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()))) {
                return false;
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m30669f() {
        NetworkInfo activeNetworkInfo;
        try {
            if (this.f26479i.getContext() == null || (activeNetworkInfo = ((ConnectivityManager) this.f26479i.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TapjoyLog.m30839d("TJAdUnit", "Exception getting NetworkInfo: " + e.getLocalizedMessage());
        }
        return false;
    }

    public void notifyOrientationChanged() {
        this.f26477g.notifyOrientationChanged(getScreenOrientationString(), this.f26461B, this.f26462C);
    }
}
