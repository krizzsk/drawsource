package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5905db;
import com.inmobi.media.C5912de;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ct */
/* compiled from: JavaScriptBridge */
public class C5880ct {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f14864a = C5880ct.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6301q f14865b;

    /* renamed from: c */
    private final int f14866c;

    /* renamed from: d */
    private C5921dg f14867d;

    @JavascriptInterface
    public void cancelSaveContent(String str, String str2) {
    }

    @JavascriptInterface
    public void fireSkip(String str) {
    }

    @JavascriptInterface
    public void log(String str, String str2) {
    }

    @JavascriptInterface
    public void onOrientationChange(String str) {
    }

    @JavascriptInterface
    public void showAlert(String str, String str2) {
    }

    @JavascriptInterface
    public void storePicture(String str, String str2) {
    }

    public C5880ct(C6301q qVar, int i) {
        this.f14865b = qVar;
        this.f14866c = i;
    }

    @JavascriptInterface
    public void open(final String str, final String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            if (!qVar.mo35628i()) {
                this.f14865b.mo35584c("open");
                return;
            }
            this.f14865b.mo35629l();
            C6269jr.m18643a().mo35508a(new Runnable() {
                public final void run() {
                    C5880ct.this.f14865b.getLandingPageHandler().mo35514a("open", str, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public void openWithoutTracker(final String str, final String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            if (!qVar.mo35628i()) {
                this.f14865b.mo35584c("openWithoutTracker");
            } else {
                C6269jr.m18643a().mo35508a(new Runnable() {
                    public final void run() {
                        C5880ct.this.f14865b.getLandingPageHandler().mo35514a("openWithoutTracker", str, str2);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void openEmbedded(final String str, final String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            if (!qVar.mo35628i()) {
                this.f14865b.mo35584c("openEmbedded");
                return;
            }
            this.f14865b.mo35629l();
            new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5880ct.this.f14865b.getLandingPageHandler().mo35517d("openEmbedded", str, str2);
                    } catch (Exception unused) {
                        C5880ct.this.f14865b.mo35582b(str, "Unexpected error", "openEmbedded");
                        C6195ic.m18378a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
                        String unused2 = C5880ct.f14864a;
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void ping(String str, String str2, boolean z) {
        if (this.f14865b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f14865b.mo35582b(str, "Invalid URL:".concat(String.valueOf(str2)), "ping");
                return;
            }
            try {
                C5820bn.m17365a().mo34792a(str2, z);
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "ping");
                C6195ic.m18378a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public void pingInWebView(String str, String str2, boolean z) {
        if (this.f14865b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f14865b.mo35582b(str, "Invalid URL:".concat(String.valueOf(str2)), "pingInWebView");
                return;
            }
            try {
                C5820bn.m17365a().mo34795b(str2, z);
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "pingInWebView");
                C6195ic.m18378a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public String getPlatformVersion(String str) {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    @JavascriptInterface
    public String getPlatform(String str) {
        C6184hx.m18351d();
        return C6184hx.m18351d();
    }

    @JavascriptInterface
    public void fireAdReady(String str) {
        try {
            C6301q qVar = this.f14865b;
            qVar.f15963w = true;
            if (qVar.getImpressionType() == 0) {
                qVar.mo35627h();
            }
            qVar.getListener().mo34453c(qVar);
        } catch (Exception unused) {
            this.f14865b.mo35582b(str, "Unexpected error", "fireAdReady");
        }
    }

    @JavascriptInterface
    public void fireAdFailed(String str) {
        try {
            this.f14865b.getListener().mo34460d(this.f14865b);
        } catch (Exception unused) {
            this.f14865b.mo35582b(str, "Unexpected error", "fireAdFailed");
        }
    }

    @JavascriptInterface
    public String getDefaultPosition(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return new JSONObject().toString();
        }
        synchronized (qVar.getDefaultPositionMonitor()) {
            this.f14865b.f15950j = true;
            new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5880ct.this.f14865b.mo35587d();
                    } catch (Exception unused) {
                        String unused2 = C5880ct.f14864a;
                    }
                }
            });
            while (this.f14865b.f15950j) {
                try {
                    this.f14865b.getDefaultPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f14865b.getDefaultPosition();
    }

    @JavascriptInterface
    public String getCurrentPosition(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return "";
        }
        synchronized (qVar.getCurrentPositionMonitor()) {
            this.f14865b.f15951k = true;
            new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5880ct.this.f14865b.mo35590e();
                    } catch (Exception unused) {
                        String unused2 = C5880ct.f14864a;
                    }
                }
            });
            while (this.f14865b.f15951k) {
                try {
                    this.f14865b.getCurrentPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f14865b.getCurrentPosition();
    }

    @JavascriptInterface
    public void setExpandProperties(String str, String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null && !"Expanded".equals(qVar.getState())) {
            try {
                this.f14865b.setExpandProperties(C5904da.m17572a(str2));
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "setExpandProperties");
            }
        }
    }

    @JavascriptInterface
    public String getExpandProperties(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return "";
        }
        return qVar.getExpandProperties().f14943c;
    }

    @JavascriptInterface
    public void expand(final String str, final String str2) {
        C6301q qVar;
        if (this.f14866c != 1 && (qVar = this.f14865b) != null) {
            if (!qVar.mo35628i()) {
                this.f14865b.mo35584c(MraidJsMethods.EXPAND);
            } else if (!this.f14865b.f15953m) {
                this.f14865b.mo35582b(str, "Creative is not visible. Ignoring request.", MraidJsMethods.EXPAND);
            } else if (str2 == null || str2.length() == 0 || str2.startsWith("http")) {
                if (URLUtil.isValidUrl(str2)) {
                    this.f14865b.mo35629l();
                }
                new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        int i;
                        try {
                            C6301q a = C5880ct.this.f14865b;
                            String str = str2;
                            if ("Default".equals(a.f15944d) || "Resized".equals(a.f15944d)) {
                                a.f15958r = true;
                                C5909dc dcVar = a.f15946f;
                                if (dcVar.f14963c == null) {
                                    dcVar.f14963c = (ViewGroup) dcVar.f14961a.getParent();
                                    dcVar.f14964d = dcVar.f14963c.indexOfChild(dcVar.f14961a);
                                }
                                C5904da expandProperties = dcVar.f14961a.getExpandProperties();
                                dcVar.f14962b = URLUtil.isValidUrl(str);
                                C6301q qVar = dcVar.f14961a;
                                if (dcVar.f14962b) {
                                    try {
                                        C6301q qVar2 = new C6301q(dcVar.f14961a.getContainerContext(), (byte) 0, (Set<C5951dx>) null, dcVar.f14961a.getImpressionId(), Boolean.FALSE, "DEFAULT");
                                        qVar2.mo35576a(dcVar.f14961a.getListener(), dcVar.f14961a.getAdConfig(), false, false);
                                        qVar2.setOriginalRenderView(dcVar.f14961a);
                                        qVar2.loadUrl(str);
                                        qVar2.setPlacementId(dcVar.f14961a.getPlacementId());
                                        qVar2.setAllowAutoRedirection(dcVar.f14961a.getAllowAutoRedirection());
                                        qVar2.setCreativeId(dcVar.f14961a.getCreativeId());
                                        i = InMobiAdActivity.m23146a((C6234j) qVar2);
                                        if (expandProperties != null) {
                                            qVar2.setUseCustomClose(dcVar.f14961a.f15952l);
                                        }
                                    } catch (Exception e) {
                                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                                        dcVar.f14961a.getListener().mo34472g(dcVar.f14961a);
                                    }
                                } else {
                                    qVar.setShouldFireRenderBeacon(false);
                                    ViewGroup viewGroup = dcVar.f14963c;
                                    FrameLayout frameLayout = new FrameLayout(dcVar.f14961a.getContainerContext());
                                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(dcVar.f14961a.getWidth(), dcVar.f14961a.getHeight());
                                    frameLayout.setId(C6192i.f15626a);
                                    viewGroup.addView(frameLayout, dcVar.f14964d, layoutParams);
                                    viewGroup.removeView(dcVar.f14961a);
                                    i = InMobiAdActivity.m23146a((C6234j) dcVar.f14961a);
                                }
                                dcVar.f14961a.getListener().mo35558d_();
                                Intent intent = new Intent(dcVar.f14961a.getContainerContext(), InMobiAdActivity.class);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", i);
                                if (dcVar.f14965e.equals("htmlUrl")) {
                                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR);
                                } else {
                                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                                }
                                C6183hw.m18313a(dcVar.f14961a.getContainerContext(), intent);
                                a.requestLayout();
                                a.invalidate();
                                a.setFocusable(true);
                                a.setFocusableInTouchMode(true);
                                a.requestFocus();
                            }
                        } catch (Exception unused) {
                            C5880ct.this.f14865b.mo35582b(str, "Unexpected error", MraidJsMethods.EXPAND);
                            C6195ic.m18378a((byte) 1, "InMobi", "Failed to expand ad; SDK encountered an unexpected error");
                            String unused2 = C5880ct.f14864a;
                        }
                    }
                });
            } else {
                this.f14865b.mo35582b(str, "Invalid URL", MraidJsMethods.EXPAND);
            }
        }
    }

    @JavascriptInterface
    public void customExpand(String str, String str2, int i, float f, boolean z, boolean z2) {
        C6301q qVar;
        if (this.f14866c != 1 || (qVar = this.f14865b) == null) {
            return;
        }
        if (str2 == null) {
            qVar.mo35582b(str, "Invalid expandInput", "customExpand");
        } else if (i < 0 || i >= C6324v.values().length) {
            this.f14865b.mo35582b(str, "Invalid inputType", "customExpand");
        } else if (f < 0.0f || f > 1.0f) {
            this.f14865b.mo35582b(str, "Invalid screenPercentage", "customExpand");
        } else {
            C6269jr.m18643a().mo35508a(new Runnable(str2, i, str, f, z2) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ boolean f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C5880ct.this.m17502a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ Exception -> 0x00a3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m17502a(java.lang.String r10, int r11, java.lang.String r12, float r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "customExpand"
            r1 = 1
            com.inmobi.media.q r2 = r9.f14865b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            com.inmobi.media.v[] r2 = com.inmobi.media.C6324v.values()     // Catch:{ Exception -> 0x00a3 }
            r11 = r2[r11]     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.v r2 = com.inmobi.media.C6324v.URL     // Catch:{ Exception -> 0x00a3 }
            if (r11 != r2) goto L_0x0099
            com.inmobi.media.q r2 = r9.f14865b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.m r2 = r2.getLandingPageHandler()     // Catch:{ Exception -> 0x00a3 }
            r3 = 4
            r4 = 3
            r5 = 2
            if (r10 == 0) goto L_0x007f
            boolean r6 = r10.isEmpty()     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x0028
            goto L_0x007f
        L_0x0028:
            android.net.Uri r6 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r7 = r6.getScheme()     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x007b
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x00a3 }
            if (r8 == 0) goto L_0x0039
            goto L_0x007b
        L_0x0039:
            java.lang.String r8 = "inmobinativebrowser"
            boolean r8 = r7.equals(r8)     // Catch:{ Exception -> 0x00a3 }
            if (r8 == 0) goto L_0x0046
            r2.mo35515b(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
        L_0x0044:
            r3 = r5
            goto L_0x0083
        L_0x0046:
            java.lang.String r8 = "inmobideeplink"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x0055
            boolean r2 = r2.mo35516c(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r2 == 0) goto L_0x0083
            goto L_0x0044
        L_0x0055:
            com.inmobi.media.C6175hq.m18296a()     // Catch:{ Exception -> 0x00a3 }
            android.content.Context r7 = r2.f15810b     // Catch:{ Exception -> 0x00a3 }
            boolean r7 = com.inmobi.media.C6175hq.m18298a(r7, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x0064
            r2.mo35518e(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0044
        L_0x0064:
            boolean r6 = com.inmobi.media.C6193ia.m18371a((android.net.Uri) r6)     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x006c
            r3 = r4
            goto L_0x0083
        L_0x006c:
            com.inmobi.media.C6176hr.m18300a()     // Catch:{ Exception -> 0x00a3 }
            android.content.Context r6 = r2.f15810b     // Catch:{ Exception -> 0x00a3 }
            boolean r6 = com.inmobi.media.C6176hr.m18301a(r6, r10)     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x0083
            r2.mo35518e(r0, r12, r10)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0044
        L_0x007b:
            r2.mo35511a(r0, r12)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0082
        L_0x007f:
            r2.mo35511a(r0, r12)     // Catch:{ Exception -> 0x00a3 }
        L_0x0082:
            r3 = r1
        L_0x0083:
            if (r3 != r4) goto L_0x008f
            com.inmobi.media.q r2 = r9.f14865b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r2.mo34985a(r10, r11, r13, r14)     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x008f:
            com.inmobi.media.q r10 = r9.f14865b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r10 = r10.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r10.mo34984a()     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x0099:
            com.inmobi.media.q r2 = r9.f14865b     // Catch:{ Exception -> 0x00a3 }
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch:{ Exception -> 0x00a3 }
            r2.mo34985a(r10, r11, r13, r14)     // Catch:{ Exception -> 0x00a3 }
            return
        L_0x00a3:
            com.inmobi.media.q r10 = r9.f14865b
            java.lang.String r11 = "Unexpected error"
            r10.mo35582b(r12, r11, r0)
            java.lang.String r10 = "InMobi"
            java.lang.String r11 = "Failed to custom expand ad; SDK encountered an unexpected error"
            com.inmobi.media.C6195ic.m18378a((byte) r1, (java.lang.String) r10, (java.lang.String) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5880ct.m17502a(java.lang.String, int, java.lang.String, float, boolean):void");
    }

    @JavascriptInterface
    public void closeCustomExpand(String str) {
        if (this.f14866c == 1 && this.f14865b != null) {
            C6269jr.m18643a().mo35508a(new Runnable() {
                public final void run() {
                    C5880ct.this.m17503b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17503b() {
        if (this.f14865b.getEmbeddedBrowserJSCallbacks() != null) {
            this.f14865b.getEmbeddedBrowserJSCallbacks().mo34984a();
        }
    }

    @JavascriptInterface
    public String getVersion(String str) {
        C6184hx.m18350c();
        return C6184hx.m18350c();
    }

    @JavascriptInterface
    public void setResizeProperties(String str, String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            C5922dh a = C5922dh.m17608a(str2, qVar.getResizeProperties());
            if (a == null) {
                this.f14865b.mo35582b(str, "setResizeProperties", "All mandatory fields are not present");
            }
            this.f14865b.setResizeProperties(a);
        }
    }

    @JavascriptInterface
    public String getResizeProperties(String str) {
        C5922dh resizeProperties;
        JSONObject a;
        C6301q qVar = this.f14865b;
        if (qVar == null || (resizeProperties = qVar.getResizeProperties()) == null || (a = new C6225is().mo35435a(resizeProperties)) == null) {
            return "";
        }
        return a.toString();
    }

    @JavascriptInterface
    public void resize(final String str) {
        if (this.f14866c != 1 && this.f14865b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C6301q a = C5880ct.this.f14865b;
                        if (!"Default".equals(a.f15944d)) {
                            if (!"Resized".equals(a.f15944d)) {
                                return;
                            }
                        }
                        if (a.getResizeProperties() != null) {
                            a.f15958r = true;
                            a.f15947g.mo35026a();
                            a.requestLayout();
                            a.invalidate();
                            a.setFocusable(true);
                            a.setFocusableInTouchMode(true);
                            a.requestFocus();
                            a.setAndUpdateViewState("Resized");
                            a.getListener().mo34552a_(a);
                            a.f15958r = false;
                        }
                    } catch (Exception unused) {
                        C5880ct.this.f14865b.mo35582b(str, "Unexpected error", MraidJsMethods.RESIZE);
                        C6195ic.m18378a((byte) 1, C5880ct.f14864a, "Could not resize ad; SDK encountered an unexpected error");
                        String unused2 = C5880ct.f14864a;
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void setOrientationProperties(String str, String str2) {
        C6269jr.m18643a().mo35508a(new Runnable(str2) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5880ct.this.m17501a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17501a(String str) {
        C5921dg orientationProperties = this.f14865b.getOrientationProperties();
        if (orientationProperties != null) {
            C5921dg a = C5921dg.m17607a(str, orientationProperties);
            this.f14867d = a;
            this.f14865b.setOrientationProperties(a);
        }
    }

    @JavascriptInterface
    public String getOrientationProperties(String str) {
        return this.f14867d.f14998d;
    }

    @JavascriptInterface
    public boolean isViewable(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return false;
        }
        return qVar.f15953m;
    }

    @JavascriptInterface
    public void useCustomClose(final String str, final boolean z) {
        new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5880ct.this.f14865b.mo35586c(z);
                } catch (Exception unused) {
                    C5880ct.this.f14865b.mo35582b(str, "Unexpected error", "useCustomClose");
                    String unused2 = C5880ct.f14864a;
                }
            }
        });
    }

    @JavascriptInterface
    public void playVideo(final String str, final String str2) {
        if (this.f14865b != null) {
            if (str2 == null || str2.trim().length() == 0 || !str2.startsWith("http") || (!str2.endsWith("mp4") && !str2.endsWith("avi") && !str2.endsWith("m4v"))) {
                this.f14865b.mo35582b(str, "Null or empty or invalid media playback URL supplied", MraidJsMethods.PLAY_VIDEO);
            } else {
                new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C6301q a = C5880ct.this.f14865b;
                            String str = str;
                            String trim = str2.trim();
                            if (1 == a.f15945e || "Expanded".equals(a.getViewState())) {
                                if (a.f15942b != null) {
                                    if (a.f15942b.get() != null) {
                                        C5912de deVar = a.f15948h;
                                        Activity activity = (Activity) a.f15942b.get();
                                        deVar.f14975b = new C5905db(activity);
                                        C5905db dbVar = deVar.f14975b;
                                        dbVar.f14953h = C5905db.m17575a(trim);
                                        dbVar.f14952g = "anonymous";
                                        if (dbVar.f14947b == null) {
                                            dbVar.f14947b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
                                            dbVar.f14947b = C5905db.m17576b(dbVar.f14953h);
                                        }
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                        layoutParams.addRule(13);
                                        deVar.f14975b.setLayoutParams(layoutParams);
                                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                                        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
                                            public final boolean onTouch(
/*
Method generation error in method: com.inmobi.media.de.1.onTouch(android.view.View, android.view.MotionEvent):boolean, dex: classes2.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.de.1.onTouch(android.view.View, android.view.MotionEvent):boolean, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        });
                                        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                        relativeLayout.addView(deVar.f14975b);
                                        ((ViewGroup) activity.findViewById(16908290)).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                                        deVar.f14975b.f14948c = relativeLayout;
                                        deVar.f14975b.requestFocus();
                                        deVar.f14975b.setOnKeyListener(new View.OnKeyListener() {
                                            public final boolean onKey(
/*
Method generation error in method: com.inmobi.media.de.2.onKey(android.view.View, int, android.view.KeyEvent):boolean, dex: classes2.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.de.2.onKey(android.view.View, int, android.view.KeyEvent):boolean, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        });
                                        deVar.f14975b.f14949d = new C5905db.C5908b() {
                                            /* renamed from: a */
                                            public final void mo35016a(
/*
Method generation error in method: com.inmobi.media.de.3.a(com.inmobi.media.db):void, dex: classes2.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.de.3.a(com.inmobi.media.db):void, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/

                                            /* renamed from: a */
                                            public final void mo35015a(
/*
Method generation error in method: com.inmobi.media.de.3.a():void, dex: classes2.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.de.3.a():void, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        };
                                        C5905db dbVar2 = deVar.f14975b;
                                        dbVar2.setVideoPath(dbVar2.f14953h);
                                        dbVar2.setOnCompletionListener(dbVar2);
                                        dbVar2.setOnPreparedListener(dbVar2);
                                        dbVar2.setOnErrorListener(dbVar2);
                                        if (dbVar2.f14946a == null && Build.VERSION.SDK_INT >= 19) {
                                            dbVar2.f14946a = new C5905db.C5907a(dbVar2.getContext());
                                            dbVar2.f14946a.setAnchorView(dbVar2);
                                            dbVar2.setMediaController(dbVar2.f14946a);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                a.mo35582b(str, "Media playback is  not allowed before it is visible! Ignoring request ...", MraidJsMethods.PLAY_VIDEO);
                            }
                        } catch (Exception unused) {
                            C5880ct.this.f14865b.mo35582b(str, "Unexpected error", MraidJsMethods.PLAY_VIDEO);
                            C6195ic.m18378a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
                            String unused2 = C5880ct.f14864a;
                        }
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public String getState(String str) {
        return this.f14865b.getState().toLowerCase(Locale.ENGLISH);
    }

    @JavascriptInterface
    public String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C6215il.m18444a().f15672a);
            jSONObject.put("height", C6215il.m18444a().f15673b);
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            this.f14865b.mo35582b(str, "Unexpected error", "getScreenSize");
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMaxSize(java.lang.String r7) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.inmobi.media.q r1 = r6.f14865b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = r1.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x0024
            com.inmobi.media.q r1 = r6.f14865b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            boolean r1 = r1 instanceof android.app.Activity     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x001c
            java.lang.String r7 = r6.getScreenSize(r7)     // Catch:{ Exception -> 0x007e }
            return r7
        L_0x001c:
            com.inmobi.media.q r1 = r6.f14865b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x007e }
        L_0x0024:
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x007e }
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch:{ Exception -> 0x007e }
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x007e }
            int r2 = com.inmobi.media.C6215il.m18449b((int) r2)     // Catch:{ Exception -> 0x007e }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x007e }
            int r3 = com.inmobi.media.C6215il.m18449b((int) r3)     // Catch:{ Exception -> 0x007e }
            com.inmobi.media.q r4 = r6.f14865b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r4 = r4.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r4 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0073
        L_0x0049:
            com.inmobi.media.ct$a r2 = new com.inmobi.media.ct$a     // Catch:{ Exception -> 0x007e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x007e }
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()     // Catch:{ Exception -> 0x007e }
            r1.addOnGlobalLayoutListener(r2)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r1 = r2.f14901d     // Catch:{ Exception -> 0x007e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r3 = r2.f14901d     // Catch:{ InterruptedException -> 0x0064 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0064 }
            goto L_0x0064
        L_0x0062:
            r2 = move-exception
            goto L_0x0071
        L_0x0064:
            int r3 = r2.f14898a     // Catch:{ all -> 0x0062 }
            int r2 = r2.f14899b     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0073
        L_0x0071:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r2     // Catch:{ Exception -> 0x007e }
        L_0x0073:
            java.lang.String r1 = "width"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r1 = "height"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0087
        L_0x007e:
            com.inmobi.media.q r1 = r6.f14865b
            java.lang.String r2 = "Unexpected error"
            java.lang.String r3 = "getMaxSize"
            r1.mo35582b(r7, r2, r3)
        L_0x0087:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5880ct.getMaxSize(java.lang.String):java.lang.String");
    }

    /* renamed from: com.inmobi.media.ct$a */
    /* compiled from: JavaScriptBridge */
    static class C5893a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f14898a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f14899b;

        /* renamed from: c */
        private View f14900c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Boolean f14901d = Boolean.FALSE;

        C5893a(View view) {
            this.f14900c = view;
        }

        public final void onGlobalLayout() {
            try {
                this.f14898a = C6215il.m18449b(this.f14900c.getWidth());
                this.f14899b = C6215il.m18449b(this.f14900c.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f14900c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.f14900c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                synchronized (this.f14901d) {
                    this.f14901d.notify();
                }
            } catch (Exception unused) {
                String unused2 = C5880ct.f14864a;
            }
        }
    }

    @JavascriptInterface
    public void close(final String str) {
        new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5880ct.this.f14865b.getReferenceContainer().mo35450b();
                } catch (Exception unused) {
                    C5880ct.this.f14865b.mo35582b(str, "Unexpected error", "close");
                    C6195ic.m18378a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
                    String unused2 = C5880ct.f14864a;
                }
            }
        });
    }

    @JavascriptInterface
    public String getPlacementType(String str) {
        return 1 == this.f14866c ? "interstitial" : TJAdUnitConstants.String.INLINE;
    }

    @JavascriptInterface
    public String getSdkVersion(String str) {
        C6184hx.m18347b();
        return C6184hx.m18347b();
    }

    @JavascriptInterface
    public String supports(String str, String str2) {
        return String.valueOf(this.f14865b.mo35591e(str2));
    }

    @JavascriptInterface
    public void openExternal(String str, String str2, String str3) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            if (!qVar.mo35628i()) {
                this.f14865b.mo35584c("openExternal");
                return;
            }
            this.f14865b.mo35629l();
            C6280m landingPageHandler = this.f14865b.getLandingPageHandler();
            if (str2 != null) {
                landingPageHandler.mo35512a("openExternal", str, str2, str3);
            } else if (str3 != null) {
                landingPageHandler.mo35512a("openExternal", str, str3, (String) null);
            } else {
                landingPageHandler.f15809a.mo35389a(str, "Empty url and fallback url", "openExternal");
            }
        }
    }

    @JavascriptInterface
    public void asyncPing(String str, String str2) {
        if (!URLUtil.isValidUrl(str2)) {
            this.f14865b.mo35582b(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            final C6156ha haVar = new C6156ha(ShareTarget.METHOD_GET, str2);
            haVar.f15539t = false;
            haVar.f15534o = false;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C6157hb a = new C6153gy(C6146gu.this.f15501b).mo35336a();
                        if (a.mo35349a()) {
                            C6146gu.this.f15502c.mo34959a();
                        } else {
                            C6146gu.this.f15502c.mo34960a(a);
                        }
                    } catch (Exception unused) {
                        String unused2 = C6146gu.f15500a;
                        new C6157hb().f15541a = new C6154gz(-1, "Network request failed with unknown error");
                        C6146gu.this.f15502c.mo34959a();
                    }
                }
            }).start();
        } catch (Exception unused) {
            this.f14865b.mo35582b(str, "Unexpected error", "asyncPing");
        }
    }

    @JavascriptInterface
    public void disableCloseRegion(final String str, final boolean z) {
        if (this.f14865b != null) {
            new Handler(this.f14865b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5880ct.this.f14865b.mo35583b(z);
                    } catch (Exception unused) {
                        C5880ct.this.f14865b.mo35582b(str, "Unexpected error", "disableCloseRegion");
                        String unused2 = C5880ct.f14864a;
                    }
                }
            });
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f14865b.mo35582b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.f14865b.getListener().mo34428a((java.util.HashMap<java.lang.Object, java.lang.Object>) new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r6.f14865b.mo35582b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserInteraction(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.inmobi.media.q r0 = r6.f14865b
            java.lang.String r1 = "onUserInteraction"
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo35628i()
            if (r0 != 0) goto L_0x0012
            com.inmobi.media.q r7 = r6.f14865b
            r7.mo35584c((java.lang.String) r1)
            return
        L_0x0012:
            java.lang.String r0 = "Unexpected error"
            if (r8 != 0) goto L_0x002b
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ Exception -> 0x0025 }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x0025 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0025 }
            r2.<init>()     // Catch:{ Exception -> 0x0025 }
            r8.mo34428a((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x0025 }
            return
        L_0x0025:
            com.inmobi.media.q r8 = r6.f14865b
            r8.mo35582b(r7, r0, r1)
            return
        L_0x002b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x005d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x005d }
            r8.<init>()     // Catch:{ JSONException -> 0x005d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x005d }
        L_0x0039:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x005d }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x005d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x005d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x005d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0039
        L_0x004d:
            com.inmobi.media.q r2 = r6.f14865b     // Catch:{ Exception -> 0x0057 }
            com.inmobi.media.s r2 = r2.getListener()     // Catch:{ Exception -> 0x0057 }
            r2.mo34428a((java.util.HashMap<java.lang.Object, java.lang.Object>) r8)     // Catch:{ Exception -> 0x0057 }
            return
        L_0x0057:
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ JSONException -> 0x005d }
            r8.mo35582b(r7, r0, r1)     // Catch:{ JSONException -> 0x005d }
            return
        L_0x005d:
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ Exception -> 0x006c }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x006c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x006c }
            r2.<init>()     // Catch:{ Exception -> 0x006c }
            r8.mo34428a((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x006c }
            return
        L_0x006c:
            com.inmobi.media.q r8 = r6.f14865b
            r8.mo35582b(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5880ct.onUserInteraction(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.f14865b.mo35582b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.f14865b.getListener().mo34443b(new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f14865b.mo35582b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void incentCompleted(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "incentCompleted"
            java.lang.String r1 = "Unexpected error"
            if (r8 != 0) goto L_0x001b
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ Exception -> 0x0015 }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x0015 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0015 }
            r2.<init>()     // Catch:{ Exception -> 0x0015 }
            r8.mo34443b(r2)     // Catch:{ Exception -> 0x0015 }
            return
        L_0x0015:
            com.inmobi.media.q r8 = r6.f14865b
            r8.mo35582b(r7, r1, r0)
            return
        L_0x001b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x004d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x004d }
            r8.<init>()     // Catch:{ JSONException -> 0x004d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x004d }
        L_0x0029:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x004d }
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x004d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x004d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x004d }
            goto L_0x0029
        L_0x003d:
            com.inmobi.media.q r2 = r6.f14865b     // Catch:{ Exception -> 0x0047 }
            com.inmobi.media.s r2 = r2.getListener()     // Catch:{ Exception -> 0x0047 }
            r2.mo34443b(r8)     // Catch:{ Exception -> 0x0047 }
            return
        L_0x0047:
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ JSONException -> 0x004d }
            r8.mo35582b(r7, r1, r0)     // Catch:{ JSONException -> 0x004d }
            return
        L_0x004d:
            com.inmobi.media.q r8 = r6.f14865b     // Catch:{ Exception -> 0x005c }
            com.inmobi.media.s r8 = r8.getListener()     // Catch:{ Exception -> 0x005c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x005c }
            r2.<init>()     // Catch:{ Exception -> 0x005c }
            r8.mo34443b(r2)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            com.inmobi.media.q r8 = r6.f14865b
            r8.mo35582b(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5880ct.incentCompleted(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String getOrientation(String str) {
        byte b = C6215il.m18448b();
        if (b == 1) {
            return "0";
        }
        if (b == 3) {
            return "90";
        }
        if (b == 2) {
            return "180";
        }
        return b == 4 ? "270" : "-1";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveContent(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "saveContent"
            java.lang.String r1 = ""
            java.lang.String r2 = "\");"
            java.lang.String r3 = "\", 'failed', \""
            java.lang.String r4 = "reason"
            java.lang.String r5 = "sendSaveContentResult(\"saveContent_"
            java.lang.String r6 = "\\\""
            java.lang.String r7 = "\""
            java.lang.String r8 = "url"
            if (r12 == 0) goto L_0x008e
            int r9 = r12.length()
            if (r9 == 0) goto L_0x008e
            if (r13 == 0) goto L_0x008e
            int r9 = r13.length()
            if (r9 != 0) goto L_0x0023
            goto L_0x008e
        L_0x0023:
            com.inmobi.media.q r1 = r10.f14865b     // Catch:{ Exception -> 0x0086 }
            boolean r9 = r1.mo35591e((java.lang.String) r0)     // Catch:{ Exception -> 0x0086 }
            if (r9 != 0) goto L_0x0058
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0086 }
            r9.<init>()     // Catch:{ Exception -> 0x0086 }
            r9.put(r8, r13)     // Catch:{ JSONException -> 0x0037 }
            r13 = 7
            r9.put(r4, r13)     // Catch:{ JSONException -> 0x0037 }
        L_0x0037:
            java.lang.String r13 = r9.toString()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r13.replace(r7, r6)     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0086 }
            r4.append(r12)     // Catch:{ Exception -> 0x0086 }
            r4.append(r3)     // Catch:{ Exception -> 0x0086 }
            r4.append(r13)     // Catch:{ Exception -> 0x0086 }
            r4.append(r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0086 }
            r1.mo35579a((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0058:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x0086 }
            r2.<init>()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bq r3 = new com.inmobi.media.bq     // Catch:{ Exception -> 0x0086 }
            r4 = -1
            r3.<init>(r4, r13)     // Catch:{ Exception -> 0x0086 }
            r2.add(r3)     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.ay r13 = new com.inmobi.media.ay     // Catch:{ Exception -> 0x0086 }
            java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bj r1 = r1.f15965y     // Catch:{ Exception -> 0x0086 }
            r13.<init>((java.lang.String) r3, (java.util.Set<com.inmobi.media.C5841bq>) r2, (com.inmobi.media.C5816bj) r1, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            r13.f14545f = r11     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bi r12 = com.inmobi.media.C5806bi.m17300a()     // Catch:{ Exception -> 0x0086 }
            java.util.concurrent.ExecutorService r1 = r12.f14598a     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.bi$3 r2 = new com.inmobi.media.bi$3     // Catch:{ Exception -> 0x0086 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0086 }
            r1.execute(r2)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0086:
            com.inmobi.media.q r12 = r10.f14865b
            java.lang.String r13 = "Unexpected error"
            r12.mo35582b(r11, r13, r0)
            return
        L_0x008e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r13 != 0) goto L_0x0096
            r13 = r1
        L_0x0096:
            r0.put(r8, r13)     // Catch:{ JSONException -> 0x009e }
            r13 = 8
            r0.put(r4, r13)     // Catch:{ JSONException -> 0x009e }
        L_0x009e:
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = r13.replace(r7, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            if (r12 != 0) goto L_0x00ae
            r12 = r1
        L_0x00ae:
            r0.append(r12)
            r0.append(r3)
            r0.append(r13)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            com.inmobi.media.q r13 = r10.f14865b
            r13.mo35579a((java.lang.String) r11, (java.lang.String) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5880ct.saveContent(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String isDeviceMuted(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            qVar.getMediaProcessor();
            z = C5912de.m17590a();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public String isHeadphonePlugged(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            qVar.getMediaProcessor();
            z = C5912de.m17592d();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public void registerDeviceMuteEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                C5912de mediaProcessor = qVar.getMediaProcessor();
                Context c = C6183hw.m18324c();
                if (c != null && mediaProcessor.f14976c == null) {
                    mediaProcessor.f14976c = new C5912de.C5917b(str);
                    c.registerReceiver(mediaProcessor.f14976c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                }
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "registerDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceMuteEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35018b();
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void registerDeviceVolumeChangeEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                C5912de mediaProcessor = qVar.getMediaProcessor();
                Context c = C6183hw.m18324c();
                if (c != null && mediaProcessor.f14977d == null) {
                    mediaProcessor.f14977d = new C5912de.C5918c(str, c, new Handler());
                    c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, mediaProcessor.f14977d);
                }
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceVolumeChangeEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35019c();
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public int getDeviceVolume(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return -1;
        }
        try {
            C5912de mediaProcessor = qVar.getMediaProcessor();
            Context c = C6183hw.m18324c();
            if (c == null) {
                return -1;
            }
            if (mediaProcessor.f14974a.getRenderingConfig().enablePubMuteControl && C6183hw.m18331e()) {
                return 0;
            }
            AudioManager audioManager = (AudioManager) c.getSystemService("audio");
            if (audioManager == null) {
                return -1;
            }
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            this.f14865b.mo35582b(str, "Unexpected error", "getDeviceVolume");
            return -1;
        }
    }

    @JavascriptInterface
    public void registerHeadphonePluggedEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                C5912de mediaProcessor = qVar.getMediaProcessor();
                Context c = C6183hw.m18324c();
                if (c != null && mediaProcessor.f14978e == null) {
                    mediaProcessor.f14978e = new C5912de.C5916a(str);
                    c.registerReceiver(mediaProcessor.f14978e, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                }
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "registerHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterHeadphonePluggedEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.getMediaProcessor().mo35020e();
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void disableBackButton(String str, boolean z) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            qVar.setDisableBackButton(z);
        }
    }

    @JavascriptInterface
    public boolean isBackButtonDisabled(String str) {
        C6301q qVar = this.f14865b;
        if (qVar == null) {
            return false;
        }
        return qVar.f15955o;
    }

    @JavascriptInterface
    public void registerBackButtonPressedEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.f15956p = str;
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "registerBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterBackButtonPressedEventListener(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.f15956p = null;
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void setCloseEndCardTracker(String str, String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            try {
                qVar.setCloseEndCardTracker(str2);
            } catch (Exception unused) {
                this.f14865b.mo35582b(str, "Unexpected error", "getDownloadStatus");
            }
        }
    }

    @JavascriptInterface
    public void fireComplete(String str) {
        if (this.f14865b == null) {
        }
    }

    @JavascriptInterface
    public void showEndCard(String str) {
        C6301q qVar = this.f14865b;
        if (qVar != null) {
            C6234j referenceContainer = qVar.getReferenceContainer();
            if (referenceContainer instanceof C6281n) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C6281n.this.f15852p = true;
                        C6281n.this.mo35530c((C5847bw) null);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void saveBlob(String str, String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null && qVar.f15960t != null) {
            qVar.f15960t.mo34424a(str2, qVar.f15959s);
        }
    }

    @JavascriptInterface
    public void getBlob(String str, String str2) {
        C6301q qVar = this.f14865b;
        if (qVar != null && qVar.f15960t != null) {
            qVar.f15960t.mo34425a(str, str2, qVar, qVar.f15959s);
        }
    }

    @JavascriptInterface
    public String getRenderableAdIndexes(String str) {
        return this.f14865b.getRenderableAdIndexes().toString();
    }

    @JavascriptInterface
    public int getCurrentRenderingIndex(String str) {
        return this.f14865b.getCurrentRenderingPodAdIndex();
    }

    @JavascriptInterface
    public void showAd(String str, int i) {
        C6301q qVar = this.f14865b;
        if (!qVar.f15953m || qVar.f15962v == null) {
            qVar.mo35589d(false);
        } else {
            qVar.f15962v.mo34406a(i, qVar, (Context) qVar.f15942b.get());
        }
    }

    @JavascriptInterface
    public long timeSinceShow(String str) {
        C6301q qVar = this.f14865b;
        if (qVar.f15962v != null) {
            return qVar.f15962v.mo34447b_();
        }
        return 0;
    }

    @JavascriptInterface
    public void closeAll(String str) {
        C6301q qVar = this.f14865b;
        if (qVar.f15962v != null) {
            qVar.f15962v.mo34556b();
        }
        if (qVar.f15942b.get() != null) {
            ((Activity) qVar.f15942b.get()).finish();
        }
    }

    @JavascriptInterface
    public void loadAd(String str, int i) {
        C6301q qVar = this.f14865b;
        if (!qVar.f15953m || qVar.f15962v == null) {
            qVar.mo35580a(false);
        } else {
            qVar.f15962v.mo34551a(i, qVar);
        }
    }

    @JavascriptInterface
    public void setAdContext(String str, String str2) {
        C6278k adPodHandler = this.f14865b.getAdPodHandler();
        if (adPodHandler != null) {
            adPodHandler.mo34423a(str2);
        }
    }

    @JavascriptInterface
    public String getAdContext(String str) {
        C6278k adPodHandler = this.f14865b.getAdPodHandler();
        if (adPodHandler != null) {
            return adPodHandler.mo34462e();
        }
        return null;
    }

    @JavascriptInterface
    public long getShowTimeStamp(String str) {
        return this.f14865b.getShowTimeStamp();
    }

    @JavascriptInterface
    public void impressionFired(String str) {
        C6301q qVar = this.f14865b;
        qVar.getListener().mo34421a(qVar.getTelemetryOnAdImpression());
    }
}
