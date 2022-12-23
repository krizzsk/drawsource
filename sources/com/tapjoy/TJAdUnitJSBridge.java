package com.tapjoy;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11325ce;
import com.tapjoy.internal.C11422es;
import com.tapjoy.internal.C11500ga;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TJAdUnitJSBridge implements TJWebViewJSInterfaceListener {

    /* renamed from: a */
    public TJAdUnit f26536a;
    public boolean allowRedirect;

    /* renamed from: b */
    public WebView f26537b;

    /* renamed from: c */
    final ConcurrentLinkedQueue<Pair<String, JSONObject>> f26538c;
    public boolean closeRequested;
    public boolean customClose;

    /* renamed from: d */
    private TJWebViewJSInterface f26539d;
    public boolean didLaunchOtherActivity;

    /* renamed from: e */
    private TJAdUnitJSBridge f26540e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f26541f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TJAdUnitActivity f26542g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TJSplitWebView f26543h;

    /* renamed from: i */
    private ProgressDialog f26544i;

    /* renamed from: j */
    private View f26545j;

    /* renamed from: k */
    private boolean f26546k;

    /* renamed from: l */
    private C11422es f26547l;
    public String otherActivityCallbackID;
    public String splitWebViewCallbackID;

    public interface AdUnitAsyncTaskListner {
        void onComplete(boolean z);
    }

    public void destroy() {
    }

    public TJAdUnitJSBridge(Context context, TJAdUnit tJAdUnit) {
        this(context, (WebView) tJAdUnit.getWebView());
        this.f26536a = tJAdUnit;
    }

    public TJAdUnitJSBridge(Context context, WebView webView) {
        this.f26545j = null;
        this.didLaunchOtherActivity = false;
        this.allowRedirect = true;
        this.otherActivityCallbackID = null;
        this.customClose = false;
        this.closeRequested = false;
        this.splitWebViewCallbackID = null;
        this.f26547l = new C11422es(this);
        this.f26538c = new ConcurrentLinkedQueue<>();
        TapjoyLog.m30842i("TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        this.f26541f = context;
        this.f26537b = webView;
        this.f26540e = this;
        if (webView == null) {
            TapjoyLog.m30840e("TJAdUnitJSBridge", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        TJWebViewJSInterface tJWebViewJSInterface = new TJWebViewJSInterface(this.f26537b, this);
        this.f26539d = tJWebViewJSInterface;
        this.f26537b.addJavascriptInterface(tJWebViewJSInterface, TJAdUnitConstants.JAVASCRIPT_INTERFACE_ID);
        setEnabled(true);
    }

    public void onDispatchMethod(String str, JSONObject jSONObject) {
        if (this.f26546k) {
            try {
                String optString = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, (String) null);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Method method = TJAdUnitJSBridge.class.getMethod(str, new Class[]{JSONObject.class, String.class});
                TapjoyLog.m30839d("TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + optString);
                if (this.f26539d != null) {
                    method.invoke(this.f26540e, new Object[]{jSONObject2, optString});
                }
            } catch (Exception e) {
                e.printStackTrace();
                invokeJSCallback((String) null, Boolean.FALSE);
            }
        } else {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
            this.f26538c.add(new Pair(str, jSONObject));
        }
    }

    public void setupSdkBeacons(JSONObject jSONObject, String str) {
        TapjoyLog.m30839d("TJAdUnitJSBridge", "setupSdkBeacons_method: ".concat(String.valueOf(jSONObject)));
        try {
            String string = jSONObject.getString("url");
            JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.BEACON_PATH_MAP);
            this.f26536a.setSdkBeacon(new C11500ga(string, jSONObject.getJSONObject("params"), jSONObject2));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void alert(org.json.JSONObject r10, final java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r2 = "alert_method: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "TJAdUnitJSBridge"
            com.tapjoy.TapjoyLog.m30839d(r2, r1)
            r1 = 1
            r3 = 0
            java.lang.String r4 = "title"
            java.lang.String r4 = r10.getString(r4)     // Catch:{ Exception -> 0x002b }
            java.lang.String r5 = "message"
            java.lang.String r0 = r10.getString(r5)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r5 = "buttons"
            org.json.JSONArray r10 = r10.getJSONArray(r5)     // Catch:{ Exception -> 0x0026 }
            goto L_0x003d
        L_0x0026:
            r10 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x002d
        L_0x002b:
            r10 = move-exception
            r4 = r0
        L_0x002d:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5[r3] = r6
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r5)
            r10.printStackTrace()
            r10 = 0
            r8 = r4
            r4 = r0
            r0 = r8
        L_0x003d:
            com.tapjoy.TJAdUnitActivity r5 = r9.f26542g
            if (r5 == 0) goto L_0x00bc
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r2 < r6) goto L_0x005c
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r6 = 16974394(0x103023a, float:2.4062497E-38)
            r2.<init>(r5, r6)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
            goto L_0x006d
        L_0x005c:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
        L_0x006d:
            if (r10 == 0) goto L_0x00b2
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0076
            goto L_0x00b2
        L_0x0076:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = r3
        L_0x007c:
            int r5 = r10.length()
            if (r4 >= r5) goto L_0x00a8
            if (r4 == 0) goto L_0x008a
            if (r4 == r1) goto L_0x0088
            r5 = -1
            goto L_0x008b
        L_0x0088:
            r5 = -3
            goto L_0x008b
        L_0x008a:
            r5 = -2
        L_0x008b:
            java.lang.String r6 = r10.getString(r4)     // Catch:{ Exception -> 0x0093 }
            r2.add(r6)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0097:
            java.lang.Object r6 = r2.get(r4)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.tapjoy.TJAdUnitJSBridge$1 r7 = new com.tapjoy.TJAdUnitJSBridge$1
            r7.<init>(r11)
            r0.setButton(r5, r6, r7)
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00a8:
            r0.setCancelable(r3)
            r0.setCanceledOnTouchOutside(r3)
            r0.show()
            return
        L_0x00b2:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10[r3] = r0
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r10)
            return
        L_0x00bc:
            java.lang.String r10 = "Cannot alert -- TJAdUnitActivity is null"
            com.tapjoy.TapjoyLog.m30839d(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.alert(org.json.JSONObject, java.lang.String):void");
    }

    public void closeRequested(Boolean bool) {
        TJSplitWebView tJSplitWebView = this.f26543h;
        if (tJSplitWebView == null) {
            this.closeRequested = true;
            HashMap hashMap = new HashMap();
            hashMap.put(TJAdUnitConstants.String.FORCE_CLOSE, bool);
            invokeJSAdunitMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, (Map<String, Object>) hashMap);
        } else if (!tJSplitWebView.goBack()) {
            this.f26543h.mo69473a();
        }
    }

    public void getVolume(JSONObject jSONObject, String str) {
        HashMap<String, Object> volumeArgs = getVolumeArgs();
        if (volumeArgs != null) {
            invokeJSCallback(str, (Map<String, Object>) volumeArgs);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void onVolumeChanged() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.VOLUME_CHANGED, (Map<String, Object>) getVolumeArgs());
    }

    public HashMap<String, Object> getVolumeArgs() {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit == null) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "No ad unit provided");
            return null;
        }
        String format = String.format("%.2f", new Object[]{Float.valueOf(tJAdUnit.getVolume())});
        boolean isMuted = this.f26536a.isMuted();
        TapjoyLog.m30839d("TJAdUnitJSBridge", "getVolumeArgs: volume=" + format + "; isMuted=" + isMuted);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(TJAdUnitConstants.String.CURRENT_VOLUME, format);
        hashMap.put(TJAdUnitConstants.String.IS_MUTED, Boolean.valueOf(isMuted));
        return hashMap;
    }

    public void dismiss(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f26542g;
        if (tJAdUnitActivity != null) {
            invokeJSCallback(str, Boolean.TRUE);
            tJAdUnitActivity.finish();
            return;
        }
        TapjoyLog.m30839d("TJAdUnitJSBridge", "Cannot dismiss -- TJAdUnitActivity is null");
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void display() {
        invokeJSAdunitMethod("display", new Object[0]);
    }

    public void displayStoreURL(JSONObject jSONObject, String str) {
        displayURL(jSONObject, str);
    }

    public void dismissStoreView(JSONObject jSONObject, String str) {
        dismissSplitView(jSONObject, str);
    }

    public void displayURL(JSONObject jSONObject, String str) {
        final String str2;
        final String str3;
        try {
            String optString = jSONObject.optString("style");
            final String string = jSONObject.getString("url");
            final JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
            final JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
            final String optString2 = jSONObject.optString("userAgent", (String) null);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER);
            if (optJSONObject2 != null) {
                String optString3 = optJSONObject2.optString("on", (String) null);
                str2 = optJSONObject2.optString("to", (String) null);
                str3 = optString3;
            } else {
                str3 = null;
                str2 = null;
            }
            if (TJAdUnitConstants.String.STYLE_SPLIT.equals(optString)) {
                final JSONObject jSONObject2 = jSONObject;
                final String str4 = str;
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (TJAdUnitJSBridge.this.f26537b != null) {
                            if (TJAdUnitJSBridge.this.f26543h == null) {
                                ViewParent parent = TJAdUnitJSBridge.this.f26537b.getParent();
                                if (parent instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) parent;
                                    TJSplitWebView unused = TJAdUnitJSBridge.this.f26543h = new TJSplitWebView(TJAdUnitJSBridge.this.f26542g, jSONObject2, TJAdUnitJSBridge.this);
                                    viewGroup.addView(TJAdUnitJSBridge.this.f26543h, new RelativeLayout.LayoutParams(-1, -1));
                                    TJAdUnitJSBridge.this.f26543h.animateOpen(viewGroup);
                                }
                            } else if (TJAdUnitJSBridge.this.f26543h != null) {
                                TJAdUnitJSBridge.this.f26543h.setExitHosts(optJSONArray);
                                TJAdUnitJSBridge.this.f26543h.applyLayoutOption(optJSONObject);
                            }
                            if (TJAdUnitJSBridge.this.f26543h != null) {
                                if (optString2 != null) {
                                    TJAdUnitJSBridge.this.f26543h.setUserAgent(optString2);
                                }
                                TJAdUnitJSBridge.this.f26543h.setTrigger(str3, str2);
                                TJAdUnitJSBridge.this.splitWebViewCallbackID = str4;
                                try {
                                    TJAdUnitJSBridge.this.f26543h.loadUrl(string);
                                    return;
                                } catch (Exception e) {
                                    TapjoyLog.m30844w("TJAdUnitJSBridge", e.getMessage());
                                    return;
                                }
                            }
                        }
                        TJSplitWebView unused2 = TJAdUnitJSBridge.this.f26543h = null;
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                        TJAdUnitJSBridge.this.invokeJSCallback(str4, Boolean.FALSE);
                    }
                });
                return;
            }
            this.didLaunchOtherActivity = true;
            this.otherActivityCallbackID = str;
            this.f26541f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.TRUE);
            e.printStackTrace();
        }
    }

    public void clearCache(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            TapjoyCache.getInstance().clearTapjoyCache();
            invokeJSCallback(str, Boolean.TRUE);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void setPrerenderLimit(JSONObject jSONObject, String str) {
        try {
            TJPlacementManager.setPreRenderedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_PRE_RENDERED_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to set Tapjoy placement pre-render limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEventPreloadLimit(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            try {
                TJPlacementManager.setCachedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_CACHE_LIMIT));
                invokeJSCallback(str, Boolean.TRUE);
            } catch (Exception unused) {
                TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to set Tapjoy cache's event preload limit. Invalid parameters.");
                invokeJSCallback(str, Boolean.FALSE);
            }
        } else {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void removeAssetFromCache(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, Boolean.valueOf(TapjoyCache.getInstance().removeAssetFromCache(string)));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cacheAsset(JSONObject jSONObject, String str) {
        String str2;
        Long l = 0L;
        try {
            String string = jSONObject.getString("url");
            try {
                str2 = jSONObject.getString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            } catch (Exception unused) {
                str2 = "";
            }
            try {
                l = Long.valueOf(jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE));
            } catch (Exception unused2) {
            }
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().cacheAssetFromURL(string, str2, l.longValue()));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused3) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cachePathForURL(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().getPathOfCachedURL(string));
                return;
            }
            invokeJSCallback(str, "");
        } catch (Exception unused) {
            invokeJSCallback(str, "");
        }
    }

    public void getCachedAssets(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            invokeJSCallback(str, TapjoyCache.getInstance().cachedAssetsToJSON());
            return;
        }
        invokeJSCallback(str, "");
    }

    public void contentReady(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit != null) {
            tJAdUnit.fireContentReady();
            invokeJSCallback(str, Boolean.TRUE);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void getOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit == null) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, JSONObject.NULL);
            return;
        }
        String screenOrientationString = tJAdUnit.getScreenOrientationString();
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.ORIENTATION, screenOrientationString);
        hashMap.put("width", Integer.valueOf(this.f26536a.getScreenWidth()));
        hashMap.put("height", Integer.valueOf(this.f26536a.getScreenHeight()));
        invokeJSCallback(str, (Map<String, Object>) hashMap);
    }

    public void setOrientation(JSONObject jSONObject, String str) {
        int i;
        if (this.f26536a == null) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.ORIENTATION);
            if (!string.equals("landscape")) {
                if (!string.equals(TJAdUnitConstants.String.LANDSCAPE_LEFT)) {
                    i = string.equals(TJAdUnitConstants.String.LANDSCAPE_RIGHT) ? 8 : 1;
                    this.f26536a.setOrientation(i);
                    invokeJSCallback(str, Boolean.TRUE);
                }
            }
            i = 0;
            this.f26536a.setOrientation(i);
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void unsetOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit == null) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        try {
            tJAdUnit.unsetOrientation();
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setBackgroundColor(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("backgroundColor");
            TJAdUnit tJAdUnit = this.f26536a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundColor(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to set background color. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setBackgroundWebViewContent(JSONObject jSONObject, final String str) {
        TapjoyLog.m30839d("TJAdUnitJSBridge", "setBackgroundWebViewContent");
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_CONTENT);
            TJAdUnit tJAdUnit = this.f26536a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundContent(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to set background content. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void displayVideo(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("url");
            if (string.length() <= 0 || string == "") {
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            this.f26536a.loadVideoUrl(string, new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void playVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.playVideo()));
        }
    }

    public void pauseVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f26536a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.pauseVideo()));
        }
    }

    public void clearVideo(JSONObject jSONObject, final String str) {
        if (this.f26536a != null) {
            this.f26536a.clearVideo(new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            }, jSONObject.optBoolean(TJAdUnitConstants.String.VISIBLE, false));
        }
    }

    public void setVideoMute(JSONObject jSONObject, String str) {
        try {
            this.f26536a.mo69169a(jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (JSONException unused) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Failed to parse 'enabled' from json params.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setVideoMargins(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        try {
            final float optDouble = (float) jSONObject.optDouble("top", 0.0d);
            final float optDouble2 = (float) jSONObject.optDouble("right", 0.0d);
            final float optDouble3 = (float) jSONObject.optDouble(TJAdUnitConstants.String.BOTTOM, 0.0d);
            final float optDouble4 = (float) jSONObject.optDouble("left", 0.0d);
            final TJAdUnitActivity tJAdUnitActivity = this.f26542g;
            if (tJAdUnitActivity != null) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        TJAdUnitActivity tJAdUnitActivity = tJAdUnitActivity;
                        float f = optDouble4;
                        float f2 = optDouble;
                        float f3 = optDouble2;
                        float f4 = optDouble3;
                        DisplayMetrics displayMetrics = tJAdUnitActivity.getResources().getDisplayMetrics();
                        ViewGroup viewGroup = (ViewGroup) tJAdUnitActivity.f26523a.getVideoView().getParent();
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).setMargins((int) TypedValue.applyDimension(1, f, displayMetrics), (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, f3, displayMetrics), (int) TypedValue.applyDimension(1, f4, displayMetrics));
                        viewGroup.requestLayout();
                    }
                });
                invokeJSCallback(str2, Boolean.TRUE);
                return;
            }
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Cannot setVideoMargins -- TJAdUnitActivity is null");
            invokeJSCallback(str2, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str2, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void log(JSONObject jSONObject, String str) {
        try {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Logging message=" + jSONObject.getString("message"));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void openApp(JSONObject jSONObject, String str) {
        try {
            this.f26541f.startActivity(this.f26541f.getPackageManager().getLaunchIntentForPackage(jSONObject.getString(TJAdUnitConstants.String.BUNDLE)));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void nativeEval(final JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        TJAdUnitJSBridge.this.f26537b.evaluateJavascript(jSONObject.getString("command"), (ValueCallback) null);
                    } else {
                        WebView webView = TJAdUnitJSBridge.this.f26537b;
                        webView.loadUrl("javascript:" + jSONObject.getString("command"));
                    }
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                } catch (Exception unused) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:4|5)|6|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void present(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "visible"
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = "transparent"
            java.lang.String r4 = r6.getString(r4)     // Catch:{ Exception -> 0x001a }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            java.lang.String r4 = "customClose"
            java.lang.String r6 = r6.getString(r4)     // Catch:{ Exception -> 0x002a }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x002a }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x002a }
            r5.customClose = r6     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            com.tapjoy.TJAdUnitJSBridge$a r6 = new com.tapjoy.TJAdUnitJSBridge$a     // Catch:{ Exception -> 0x0045 }
            android.webkit.WebView r4 = r5.f26537b     // Catch:{ Exception -> 0x0045 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 2
            java.lang.Boolean[] r4 = new java.lang.Boolean[r4]     // Catch:{ Exception -> 0x0045 }
            r4[r0] = r3     // Catch:{ Exception -> 0x0045 }
            r4[r1] = r2     // Catch:{ Exception -> 0x0045 }
            r6.execute(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0045 }
            r6[r0] = r2     // Catch:{ Exception -> 0x0045 }
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0045 }
            return
        L_0x0045:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1[r0] = r2
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r1)
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.present(org.json.JSONObject, java.lang.String):void");
    }

    public void triggerEvent(JSONObject jSONObject, String str) {
        if (this.f26536a != null) {
            try {
                String string = jSONObject.getString("eventName");
                if (string.equals("start")) {
                    this.f26536a.fireOnVideoStart();
                } else if (string.equals("complete")) {
                    this.f26536a.fireOnVideoComplete();
                } else if (string.equals("error")) {
                    this.f26536a.fireOnVideoError("Error while trying to play video.");
                } else if (string.equals("click")) {
                    this.f26536a.fireOnClick();
                }
            } catch (Exception unused) {
                TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to triggerEvent. No event name.");
            }
        }
    }

    public void invokeJSAdunitMethod(String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f26539d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((ArrayList<?>) arrayList, str, (String) null);
        }
    }

    public void invokeJSAdunitMethod(String str, Map<String, Object> map) {
        TJWebViewJSInterface tJWebViewJSInterface = this.f26539d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((Map<?, ?>) map, str, (String) null);
        }
    }

    public void invokeJSCallback(String str, Object... objArr) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f26539d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback((ArrayList<?>) arrayList, "", str);
        }
    }

    public void invokeJSCallback(String str, Map<String, Object> map) {
        this.f26539d.callback((Map<?, ?>) map, "", str);
    }

    public void flushBacklogMessageQueue() {
        while (true) {
            Pair poll = this.f26538c.poll();
            if (poll != null) {
                onDispatchMethod((String) poll.first, (JSONObject) poll.second);
            } else {
                return;
            }
        }
    }

    public void flushMessageQueue() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f26539d;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.flushMessageQueue();
        }
    }

    public void setAllowRedirect(JSONObject jSONObject, String str) {
        boolean z;
        try {
            z = jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED);
        } catch (Exception unused) {
            z = true;
        }
        this.allowRedirect = z;
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f26542g = tJAdUnitActivity;
    }

    public void setSpinnerVisible(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("message");
            TJAdUnitActivity tJAdUnitActivity = this.f26542g;
            if (tJAdUnitActivity != null) {
                if (z) {
                    this.f26544i = ProgressDialog.show(tJAdUnitActivity, optString, optString2);
                } else if (this.f26544i != null) {
                    this.f26544i.dismiss();
                }
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Cannot setSpinnerVisible -- TJAdUnitActivity is null");
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonVisible(JSONObject jSONObject, String str) {
        try {
            final boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f26542g;
                    if (b != null) {
                        b.setCloseButtonVisibility(z);
                    } else {
                        TapjoyLog.m30839d("TJAdUnitJSBridge", "Cannot setCloseButtonVisible -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonClickable(JSONObject jSONObject, String str) {
        try {
            final boolean optBoolean = jSONObject.optBoolean(TJAdUnitConstants.String.CLICKABLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f26542g;
                    if (b != null) {
                        b.setCloseButtonClickable(optBoolean);
                    } else {
                        TapjoyLog.m30839d("TJAdUnitJSBridge", "Cannot setCloseButtonClickable -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void shouldClose(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f26542g;
        try {
            Boolean bool = Boolean.FALSE;
            if (Boolean.valueOf(jSONObject.getString("close")).booleanValue() && tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            e.printStackTrace();
        }
        this.closeRequested = false;
    }

    public void setLoggingLevel(JSONObject jSONObject, String str) {
        try {
            TapjoyAppSettings.getInstance().saveLoggingLevel(String.valueOf(jSONObject.getString(TJAdUnitConstants.String.LOGGING_LEVEL)));
        } catch (Exception e) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "setLoggingLevel exception " + e.getLocalizedMessage());
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void clearLoggingLevel(JSONObject jSONObject, String str) {
        TapjoyAppSettings.getInstance().clearLoggingLevel();
    }

    public void attachVolumeListener(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean("attach");
            int optInt = jSONObject.optInt(TJAdUnitConstants.String.INTERVAL, 500);
            if (optInt > 0) {
                this.f26536a.attachVolumeListener(z, optInt);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.m30839d("TJAdUnitJSBridge", "Invalid `interval` value passed to attachVolumeListener(): interval=".concat(String.valueOf(optInt)));
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            TapjoyLog.m30839d("TJAdUnitJSBridge", "attachVolumeListener exception " + e.toString());
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void initMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void startMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void triggerMoatVideoEvent(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void initViewabilityTracker(JSONObject jSONObject, String str) {
        C11422es esVar = this.f26547l;
        if (!esVar.mo69880a(jSONObject)) {
            esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        C11422es.m31238b(jSONObject);
        if (TextUtils.isEmpty(C11422es.f27246b)) {
            esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        TapjoyUtil.runOnMainThread(new Runnable(jSONObject, str) {

            /* renamed from: a */
            final /* synthetic */ JSONObject f27252a;

            /* renamed from: b */
            final /* synthetic */ String f27253b;

            {
                this.f27252a = r2;
                this.f27253b = r3;
            }

            public final void run() {
                try {
                    if (!C11325ce.m31032b()) {
                        C11325ce.m31031a(C11422es.this.f27247a.f26537b.getContext());
                    }
                    if (C11325ce.m31032b()) {
                        TapjoyLog.m30839d("TJOMViewabilityAgent", "initialized");
                        List a = C11422es.m31237b(this.f27252a.optJSONArray(TJAdUnitConstants.String.VENDORS));
                        C11342cv b = C11422es.this.f27250e;
                        String a2 = C11422es.f27246b;
                        C11368dq.m31091a((Object) b, "Partner is null");
                        C11368dq.m31091a((Object) a2, "OM SDK JS script content is null");
                        C11368dq.m31091a((Object) a, "VerificationScriptResources is null");
                        C11335co coVar = new C11335co(b, a2, a, "", "", C11336cp.f27036b);
                        C11337cq cqVar = C11337cq.f27043d;
                        C11340ct ctVar = C11340ct.f27059d;
                        C11341cu cuVar = C11341cu.f27066a;
                        C11368dq.m31091a((Object) cqVar, "CreativeType is null");
                        C11368dq.m31091a((Object) ctVar, "ImpressionType is null");
                        C11368dq.m31091a((Object) cuVar, "Impression owner is null");
                        if (cuVar != C11341cu.f27068c) {
                            if (cqVar == C11337cq.f27040a) {
                                if (cuVar == C11341cu.f27066a) {
                                    throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                                }
                            }
                            if (ctVar == C11340ct.f27056a) {
                                if (cuVar == C11341cu.f27066a) {
                                    throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                                }
                            }
                            C11334cn cnVar = new C11334cn(cqVar, ctVar, cuVar, cuVar);
                            C11422es esVar = C11422es.this;
                            if (C11325ce.m31032b()) {
                                C11368dq.m31091a((Object) cnVar, "AdSessionConfiguration is null");
                                C11368dq.m31091a((Object) coVar, "AdSessionContext is null");
                                C11333cm unused = esVar.f27249d = new C11344cx(cnVar, coVar);
                                C11422es.this.f27249d.mo69780a(C11422es.this.f27247a.f26536a.getWebView());
                                C11422es esVar2 = C11422es.this;
                                C11333cm c = C11422es.this.f27249d;
                                C11344cx cxVar = (C11344cx) c;
                                C11368dq.m31091a((Object) c, "AdSession is null");
                                if (!(C11341cu.f27066a == cxVar.f27077a.f27023b)) {
                                    throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
                                } else if (!cxVar.f27080d) {
                                    C11368dq.m31090a(cxVar);
                                    if (cxVar.f27079c.f27143b == null) {
                                        C11346cz czVar = new C11346cz(cxVar);
                                        cxVar.f27079c.f27143b = czVar;
                                        C11346cz unused2 = esVar2.f27251f = czVar;
                                        C11422es esVar3 = C11422es.this;
                                        C11333cm c2 = C11422es.this.f27249d;
                                        C11344cx cxVar2 = (C11344cx) c2;
                                        C11368dq.m31091a((Object) c2, "AdSession is null");
                                        if (cxVar2.f27079c.f27142a == null) {
                                            C11368dq.m31090a(cxVar2);
                                            C11332cl clVar = new C11332cl(cxVar2);
                                            cxVar2.f27079c.f27142a = clVar;
                                            C11332cl unused3 = esVar3.f27248c = clVar;
                                            C11422es.this.f27247a.invokeJSCallback(this.f27253b, Boolean.TRUE);
                                            return;
                                        }
                                        throw new IllegalStateException("AdEvents already exists for AdSession");
                                    }
                                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                                } else {
                                    throw new IllegalStateException("AdSession is started");
                                }
                            } else {
                                throw new IllegalStateException("Method called before OM SDK activation");
                            }
                        } else {
                            throw new IllegalArgumentException("Impression owner is none");
                        }
                    } else {
                        TapjoyLog.m30839d("TJOMViewabilityAgent", "Failed to initialize");
                        C11422es.this.f27247a.invokeJSCallback(this.f27253b, Boolean.FALSE);
                    }
                } catch (Exception e) {
                    TapjoyLog.m30839d("TJOMViewabilityAgent", "Failed to init with exception: " + e.getMessage());
                    C11422es.this.f27247a.invokeJSCallback(this.f27253b, Boolean.FALSE);
                }
            }
        });
    }

    public void startViewabilityTracker(JSONObject jSONObject, String str) {
        C11422es esVar = this.f26547l;
        if (!C11325ce.m31032b()) {
            TapjoyLog.m30839d("TJOMViewabilityAgent", "Can not start -- TJOMViewabilityAgent is not initialized");
            esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        esVar.f27247a.invokeJSCallback(str, Boolean.TRUE);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    C11422es.this.f27249d.mo69779a();
                } catch (Exception e) {
                    TapjoyLog.m30839d("TJOMViewabilityAgent", "Failed to start with exception: " + e.getMessage());
                }
            }
        });
    }

    public void triggerViewabilityEvent(JSONObject jSONObject, String str) {
        C11422es esVar = this.f26547l;
        if (!C11325ce.m31032b()) {
            TapjoyLog.m30839d("TJOMViewabilityAgent", "Can not triggerEvent -- TJOMViewabilityAgent is not initialized");
            esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
        } else if (jSONObject == null) {
            TapjoyLog.m30839d("TJOMViewabilityAgent", "Can not triggerEvent -- json parameter is null");
            esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
        } else {
            String optString = jSONObject.optString("eventName", (String) null);
            if (optString == null) {
                TapjoyLog.m30839d("TJOMViewabilityAgent", "triggerEvent: params json did not contain 'eventName'");
                esVar.f27247a.invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            TapjoyUtil.runOnMainThread(new Runnable(optString, jSONObject, str) {

                /* renamed from: a */
                final /* synthetic */ String f27256a;

                /* renamed from: b */
                final /* synthetic */ JSONObject f27257b;

                /* renamed from: c */
                final /* synthetic */ String f27258c;

                {
                    this.f27256a = r2;
                    this.f27257b = r3;
                    this.f27258c = r4;
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(2:15|16)|17|18|(2:20|(1:22)(2:23|24))) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0095 */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x009d A[Catch:{ Exception -> 0x039a }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r18 = this;
                        r1 = r18
                        java.lang.String r0 = "errorType"
                        java.lang.String r2 = "complete"
                        java.lang.String r3 = "adUserInteraction"
                        java.lang.String r4 = "skipped"
                        java.lang.String r5 = "thirdQuartile"
                        java.lang.String r6 = "midpoint"
                        java.lang.String r7 = "firstQuartile"
                        java.lang.String r8 = "start"
                        java.lang.String r9 = "bufferStart"
                        java.lang.String r10 = "TJOMViewabilityAgent"
                        r11 = 0
                        r12 = 1
                        java.lang.String r13 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r14 = "loaded"
                        boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r14 = "triggerEvent: event name '"
                        if (r13 == 0) goto L_0x006e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cl r0 = r0.f27248c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.da r2 = com.tapjoy.internal.C11348da.f27102d     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "Position is null"
                        com.tapjoy.internal.C11368dq.m31091a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.db r3 = new com.tapjoy.internal.db     // Catch:{ Exception -> 0x039a }
                        r3.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "VastProperties is null"
                        com.tapjoy.internal.C11368dq.m31091a((java.lang.Object) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31094c(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r2 = r3.mo69792a()     // Catch:{ Exception -> 0x039a }
                        boolean r3 = r0.f27084h     // Catch:{ Exception -> 0x039a }
                        if (r3 != 0) goto L_0x0066
                        com.tapjoy.internal.du r3 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.dh r4 = com.tapjoy.internal.C11356dh.m31057a()     // Catch:{ Exception -> 0x039a }
                        android.webkit.WebView r3 = r3.mo69822c()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "publishLoadedEvent"
                        java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x039a }
                        r6[r11] = r2     // Catch:{ Exception -> 0x039a }
                        r4.mo69806a((android.webkit.WebView) r3, (java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x039a }
                        r0.f27084h = r12     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0066:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Loaded event can only be sent once"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x006e:
                        java.lang.String r13 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r15 = "impression"
                        boolean r13 = r13.equals(r15)     // Catch:{ Exception -> 0x039a }
                        if (r13 == 0) goto L_0x00c0
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cl r0 = r0.f27248c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31090a(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31094c(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r2.mo69789d()     // Catch:{ Exception -> 0x039a }
                        if (r2 != 0) goto L_0x0095
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x0095 }
                        r2.mo69779a()     // Catch:{ Exception -> 0x0095 }
                    L_0x0095:
                        com.tapjoy.internal.cx r2 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r2.mo69789d()     // Catch:{ Exception -> 0x039a }
                        if (r2 == 0) goto L_0x034a
                        com.tapjoy.internal.cx r0 = r0.f27021a     // Catch:{ Exception -> 0x039a }
                        boolean r2 = r0.f27083g     // Catch:{ Exception -> 0x039a }
                        if (r2 != 0) goto L_0x00b8
                        com.tapjoy.internal.du r2 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.dh r3 = com.tapjoy.internal.C11356dh.m31057a()     // Catch:{ Exception -> 0x039a }
                        android.webkit.WebView r2 = r2.mo69822c()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "publishImpressionEvent"
                        java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x039a }
                        r3.mo69806a((android.webkit.WebView) r2, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ Exception -> 0x039a }
                        r0.f27083g = r12     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00b8:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Impression event can only be sent once"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x00c0:
                        java.lang.String r13 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r13 = r13.equals(r9)     // Catch:{ Exception -> 0x039a }
                        if (r13 == 0) goto L_0x00dc
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r9)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00dc:
                        java.lang.String r9 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r13 = "bufferEnd"
                        boolean r9 = r9.equals(r13)     // Catch:{ Exception -> 0x039a }
                        if (r9 == 0) goto L_0x00fc
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "bufferFinish"
                        r0.mo69818a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x00fc:
                        java.lang.String r9 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r13 = "deviceVolume"
                        java.lang.String r15 = "mediaPlayerVolume"
                        r16 = 1065353216(0x3f800000, float:1.0)
                        r17 = 0
                        if (r9 == 0) goto L_0x0172
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27247a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r0 = r0.f26536a     // Catch:{ Exception -> 0x039a }
                        boolean r0 = r0.isMuted()     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x011c
                        r16 = r17
                    L_0x011c:
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r2 = r2.f27247a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r2 = r2.f26536a     // Catch:{ Exception -> 0x039a }
                        android.widget.VideoView r2 = r2.getVideoView()     // Catch:{ Exception -> 0x039a }
                        int r2 = r2.getDuration()     // Catch:{ Exception -> 0x039a }
                        float r2 = (float) r2     // Catch:{ Exception -> 0x039a }
                        int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
                        if (r3 <= 0) goto L_0x016a
                        com.tapjoy.internal.C11346cz.m31048a(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r3 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r3)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r3.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "duration"
                        java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11365do.m31083a(r3, r4, r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r2 = java.lang.Float.valueOf(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11365do.m31083a(r3, r15, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.di r2 = com.tapjoy.internal.C11358di.m31067a()     // Catch:{ Exception -> 0x039a }
                        float r2 = r2.f27128a     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11365do.m31083a(r3, r13, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69819a((java.lang.String) r8, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x016a:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "Invalid Media duration"
                        r0.<init>(r2)     // Catch:{ Exception -> 0x039a }
                        throw r0     // Catch:{ Exception -> 0x039a }
                    L_0x0172:
                        java.lang.String r8 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x039a }
                        if (r8 == 0) goto L_0x018e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r7)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x018e:
                        java.lang.String r7 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r7 = r7.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r7 == 0) goto L_0x01aa
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r6)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01aa:
                        java.lang.String r6 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x039a }
                        if (r6 == 0) goto L_0x01c6
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r5)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01c6:
                        java.lang.String r5 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r6 = "paused"
                        boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x01e6
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "pause"
                        r0.mo69818a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x01e6:
                        java.lang.String r5 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r6 = "playing"
                        boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x0206
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "resume"
                        r0.mo69818a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0206:
                        java.lang.String r5 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x039a }
                        if (r5 == 0) goto L_0x0222
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r4)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0222:
                        java.lang.String r4 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "volumeChanged"
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x039a }
                        if (r4 == 0) goto L_0x026e
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27247a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnit r0 = r0.f26536a     // Catch:{ Exception -> 0x039a }
                        boolean r0 = r0.isMuted()     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x023c
                        r16 = r17
                    L_0x023c:
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11346cz.m31048a(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r2 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r2)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r2.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r3 = java.lang.Float.valueOf(r16)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11365do.m31083a(r2, r15, r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.di r3 = com.tapjoy.internal.C11358di.m31067a()     // Catch:{ Exception -> 0x039a }
                        float r3 = r3.f27128a     // Catch:{ Exception -> 0x039a }
                        java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11365do.m31083a(r2, r13, r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "volumeChange"
                        r0.mo69819a((java.lang.String) r3, (org.json.JSONObject) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x026e:
                        java.lang.String r4 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x039a }
                        if (r4 == 0) goto L_0x029b
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cy r2 = com.tapjoy.internal.C11345cy.f27087a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r4 = "InteractionType is null"
                        com.tapjoy.internal.C11368dq.m31091a((java.lang.Object) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r4 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r4)     // Catch:{ Exception -> 0x039a }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x039a }
                        r4.<init>()     // Catch:{ Exception -> 0x039a }
                        java.lang.String r5 = "interactionType"
                        com.tapjoy.internal.C11365do.m31083a(r4, r5, r2)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69819a((java.lang.String) r3, (org.json.JSONObject) r4)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x029b:
                        java.lang.String r3 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x039a }
                        if (r3 == 0) goto L_0x02b7
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cz r0 = r0.f27251f     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r3 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.C11368dq.m31093b(r3)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cx r0 = r0.f27091a     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.du r0 = r0.f27079c     // Catch:{ Exception -> 0x039a }
                        r0.mo69818a((java.lang.String) r2)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x02b7:
                        java.lang.String r2 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "sessionError"
                        boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x039a }
                        if (r2 == 0) goto L_0x0331
                        org.json.JSONObject r2 = r1.f27257b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r2 = r2.getString(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r3 = "video"
                        boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r3 = "message"
                        if (r2 == 0) goto L_0x02e3
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11422es.this     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cm r2 = r2.f27249d     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cr r4 = com.tapjoy.internal.C11338cr.f27048b     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r5 = r1.f27257b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r5 = r5.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.mo69781a(r4, r5)     // Catch:{ JSONException -> 0x031a }
                        goto L_0x02f4
                    L_0x02e3:
                        com.tapjoy.internal.es r2 = com.tapjoy.internal.C11422es.this     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cm r2 = r2.f27249d     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.internal.cr r4 = com.tapjoy.internal.C11338cr.f27047a     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r5 = r1.f27257b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r5 = r5.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.mo69781a(r4, r5)     // Catch:{ JSONException -> 0x031a }
                    L_0x02f4:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r4 = "Session Error: "
                        r2.<init>(r4)     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r4 = r1.f27257b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x031a }
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = ", "
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        org.json.JSONObject r0 = r1.f27257b     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x031a }
                        r2.append(r0)     // Catch:{ JSONException -> 0x031a }
                        java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x031a }
                        com.tapjoy.TapjoyLog.m30839d(r10, r0)     // Catch:{ JSONException -> 0x031a }
                        goto L_0x034a
                    L_0x031a:
                        r0 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039a }
                        java.lang.String r3 = "Failed to getting session error information: "
                        r2.<init>(r3)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x039a }
                        r2.append(r0)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TapjoyLog.m30839d(r10, r0)     // Catch:{ Exception -> 0x039a }
                        goto L_0x034a
                    L_0x0331:
                        java.lang.String r0 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "sessionFinish"
                        boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x039a }
                        if (r0 == 0) goto L_0x0372
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.cm r0 = r0.f27249d     // Catch:{ Exception -> 0x039a }
                        r0.mo69782b()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        r2 = 0
                        com.tapjoy.internal.C11333cm unused = r0.f27249d = r2     // Catch:{ Exception -> 0x039a }
                    L_0x034a:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>(r14)
                        java.lang.String r2 = r1.f27256a
                        r0.append(r2)
                        java.lang.String r2 = "'"
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        com.tapjoy.TapjoyLog.m30839d(r10, r0)
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27247a
                        java.lang.String r2 = r1.f27258c
                        java.lang.Object[] r3 = new java.lang.Object[r12]
                        java.lang.Boolean r4 = java.lang.Boolean.TRUE
                        r3[r11] = r4
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)
                        return
                    L_0x0372:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039a }
                        r0.<init>(r14)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = r1.f27256a     // Catch:{ Exception -> 0x039a }
                        r0.append(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = "' not found"
                        r0.append(r2)     // Catch:{ Exception -> 0x039a }
                        java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TapjoyLog.m30839d(r10, r0)     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this     // Catch:{ Exception -> 0x039a }
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27247a     // Catch:{ Exception -> 0x039a }
                        java.lang.String r2 = r1.f27258c     // Catch:{ Exception -> 0x039a }
                        java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x039a }
                        java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x039a }
                        r3[r11] = r4     // Catch:{ Exception -> 0x039a }
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ Exception -> 0x039a }
                        return
                    L_0x039a:
                        r0 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "triggerEvent exception:"
                        r2.<init>(r3)
                        java.lang.String r0 = r0.getMessage()
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        com.tapjoy.TapjoyLog.m30839d(r10, r0)
                        com.tapjoy.internal.es r0 = com.tapjoy.internal.C11422es.this
                        com.tapjoy.TJAdUnitJSBridge r0 = r0.f27247a
                        java.lang.String r2 = r1.f27258c
                        java.lang.Object[] r3 = new java.lang.Object[r12]
                        java.lang.Boolean r4 = java.lang.Boolean.FALSE
                        r3[r11] = r4
                        r0.invokeJSCallback((java.lang.String) r2, (java.lang.Object[]) r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11422es.C114253.run():void");
                }
            });
        }
    }

    public void startUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m30839d("TJAdUnitJSBridge", "Empty name for startUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f26536a != null) {
                this.f26536a.startAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to startUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void endUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m30839d("TJAdUnitJSBridge", "Empty name for endUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f26536a != null) {
                this.f26536a.endAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to endUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void sendUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m30839d("TJAdUnitJSBridge", "Empty name for sendUsageTrackingEvent");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            if (this.f26536a != null) {
                this.f26536a.sendAdContentTracking(string, jSONObject);
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (JSONException e) {
            TapjoyLog.m30844w("TJAdUnitJSBridge", "Unable to sendUsageTrackingEvent. Invalid parameters: ".concat(String.valueOf(e)));
        }
    }

    public void hasSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f26543h != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
            }
        });
    }

    public void dismissSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f26543h != null) {
                    String str = str;
                    if (str != null) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    }
                    if (TJAdUnitJSBridge.this.splitWebViewCallbackID != null) {
                        TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                        tJAdUnitJSBridge.invokeJSCallback(tJAdUnitJSBridge.splitWebViewCallbackID, Boolean.TRUE);
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                    }
                    ((ViewGroup) TJAdUnitJSBridge.this.f26543h.getParent()).removeView(TJAdUnitJSBridge.this.f26543h);
                    TJSplitWebView unused = TJAdUnitJSBridge.this.f26543h = null;
                    return;
                }
                String str2 = str;
                if (str2 != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str2, Boolean.FALSE);
                }
            }
        });
    }

    public void getSplitViewURL(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f26543h != null) {
                    TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                    tJAdUnitJSBridge.invokeJSCallback(str, tJAdUnitJSBridge.f26543h.getLastUrl());
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, JSONObject.NULL);
            }
        });
    }

    public void isNetworkAvailable(JSONObject jSONObject, String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f26541f.getSystemService("connectivity")).getActiveNetworkInfo();
            invokeJSCallback(str, Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()));
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEnabled(boolean z) {
        this.f26546k = z;
        if (z) {
            flushBacklogMessageQueue();
        }
    }

    public void cleanUpJSBridge() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f26539d;
        if (tJWebViewJSInterface != null) {
            if (tJWebViewJSInterface.f26737a != null) {
                this.f26539d.f26737a.removeAllViews();
                this.f26539d.f26737a.destroy();
                this.f26539d.f26737a = null;
            }
            this.f26539d = null;
        }
    }

    /* renamed from: com.tapjoy.TJAdUnitJSBridge$a */
    class C11213a extends AsyncTask<Boolean, Void, Boolean[]> {

        /* renamed from: a */
        WebView f26586a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return (Boolean[]) objArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean[] boolArr = (Boolean[]) obj;
            final boolean booleanValue = boolArr[0].booleanValue();
            final boolean booleanValue2 = boolArr[1].booleanValue();
            if (TJAdUnitJSBridge.this.f26541f instanceof Activity) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (booleanValue) {
                            C11213a.this.f26586a.setVisibility(0);
                            if (booleanValue2) {
                                if (C11213a.this.f26586a.getParent() instanceof RelativeLayout) {
                                    ((RelativeLayout) C11213a.this.f26586a.getParent()).getBackground().setAlpha(0);
                                    ((RelativeLayout) C11213a.this.f26586a.getParent()).setBackgroundColor(0);
                                }
                                if (Build.VERSION.SDK_INT >= 11) {
                                    C11213a.this.f26586a.setLayerType(1, (Paint) null);
                                    return;
                                }
                                return;
                            }
                            if (C11213a.this.f26586a.getParent() instanceof RelativeLayout) {
                                ((RelativeLayout) C11213a.this.f26586a.getParent()).getBackground().setAlpha(255);
                                ((RelativeLayout) C11213a.this.f26586a.getParent()).setBackgroundColor(-1);
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                C11213a.this.f26586a.setLayerType(0, (Paint) null);
                                return;
                            }
                            return;
                        }
                        C11213a.this.f26586a.setVisibility(4);
                        if (C11213a.this.f26586a.getParent() instanceof RelativeLayout) {
                            ((RelativeLayout) C11213a.this.f26586a.getParent()).getBackground().setAlpha(0);
                            ((RelativeLayout) C11213a.this.f26586a.getParent()).setBackgroundColor(0);
                        }
                    }
                });
            } else {
                TapjoyLog.m30841e("TJAdUnitJSBridge", "Unable to present offerwall. No Activity context provided.");
            }
        }

        public C11213a(WebView webView) {
            this.f26586a = webView;
        }
    }

    public void onVideoReady(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_READY_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_DURATION, Integer.valueOf(i));
        hashMap.put(TJAdUnitConstants.String.VIDEO_WIDTH, Integer.valueOf(i2));
        hashMap.put(TJAdUnitConstants.String.VIDEO_HEIGHT, Integer.valueOf(i3));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoStarted(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_START_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoProgress(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PROGRESS_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoPaused(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PAUSE_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoCompletion() {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_COMPLETE_EVENT);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoInfo(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_INFO_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_INFO, str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void onVideoError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_ERROR_EVENT);
        hashMap.put("error", str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map<String, Object>) hashMap);
    }

    public void notifyOrientationChanged(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.ORIENTATION, str);
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.ORIENTATION_CHANGED_EVENT, (Map<String, Object>) hashMap);
    }
}
