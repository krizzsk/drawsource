package com.tapjoy.internal;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJInstallReferrer;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyIntegrationException;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11435ex;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.eu */
class C11427eu extends C11426et {

    /* renamed from: c */
    private boolean f27264c = false;

    /* renamed from: d */
    private String f27265d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TJCurrency f27266e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TapjoyCache f27267f = null;

    /* renamed from: b */
    public final String mo69916b() {
        return "12.10.0";
    }

    C11427eu() {
    }

    /* renamed from: a */
    public final void mo69911a(boolean z) {
        TapjoyLog.setDebugEnabled(z);
    }

    /* renamed from: a */
    public final void mo69893a(Context context, boolean z) {
        TapjoyConnectCore.optOutAdvertisingID(context, z);
    }

    /* renamed from: a */
    public final boolean mo69912a(Context context, String str) {
        return mo69914a(context, str, (Hashtable<String, ?>) null, (TJConnectListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo69914a(final android.content.Context r3, java.lang.String r4, java.util.Hashtable<java.lang.String, ?> r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "TJC_OPTION_ENABLE_LOGGING"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "true"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.setDebugEnabled(r0)     // Catch:{ all -> 0x00c5 }
        L_0x0018:
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The application context is NULL"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0033
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x0033:
            monitor-exit(r2)
            return r0
        L_0x0035:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "The SDK key is NULL. A valid SDK key is required to connect successfully to Tapjoy"
            r4.<init>(r5, r1)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r4)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x004e
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x004e:
            monitor-exit(r2)
            return r0
        L_0x0050:
            com.tapjoy.FiveRocksIntegration.m30637a()     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyAppSettings.init(r3)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.internal.eu$1 r1 = new com.tapjoy.internal.eu$1     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r1.<init>(r3, r6)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            com.tapjoy.TapjoyConnectCore.requestTapjoyConnect(r3, r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x00ad, TapjoyException -> 0x0095 }
            r4 = 1
            r2.f27264c = r4     // Catch:{ all -> 0x00c5 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c5 }
            r1 = 14
            if (r6 >= r1) goto L_0x006f
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is not available on this device."
            com.tapjoy.TapjoyLog.m30842i(r3, r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x006f:
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "TJC_OPTION_DISABLE_AUTOMATIC_SESSION_TRACKING"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "true"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0086
            r0 = r4
        L_0x0086:
            if (r0 != 0) goto L_0x008c
            com.tapjoy.internal.C11477fn.m31440a((android.content.Context) r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x0093
        L_0x008c:
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is disabled."
            com.tapjoy.TapjoyLog.m30842i(r3, r5)     // Catch:{ all -> 0x00c5 }
        L_0x0093:
            monitor-exit(r2)
            return r4
        L_0x0095:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00ab
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00ab:
            monitor-exit(r2)
            return r0
        L_0x00ad:
            r3 = move-exception
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x00c5 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x00c3
            r6.onConnectFailure()     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r2)
            return r0
        L_0x00c5:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11427eu.mo69914a(android.content.Context, java.lang.String, java.util.Hashtable, com.tapjoy.TJConnectListener):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo69913a(final android.content.Context r4, java.lang.String r5, final com.tapjoy.TJConnectListener r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch:{ all -> 0x0074 }
            r0 = 0
            if (r4 != 0) goto L_0x001e
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The application context is NULL"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x001c
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x001c:
            monitor-exit(r3)
            return r0
        L_0x001e:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r5 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "The limited SDK key is NULL. A valid limited SDK key is required to connect successfully to Tapjoy"
            r5.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r4, (com.tapjoy.TapjoyErrorMessage) r5)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0037
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0037:
            monitor-exit(r3)
            return r0
        L_0x0039:
            com.tapjoy.internal.eu$2 r1 = new com.tapjoy.internal.eu$2     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r1.<init>(r4, r6)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            com.tapjoy.TapjoyConnectCore.requestLimitedTapjoyConnect(r4, r5, r1)     // Catch:{ TapjoyIntegrationException -> 0x005c, TapjoyException -> 0x0044 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0044:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x005a
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x005a:
            monitor-exit(r3)
            return r0
        L_0x005c:
            r4 = move-exception
            java.lang.String r5 = "TapjoyAPI"
            com.tapjoy.TapjoyErrorMessage r1 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyErrorMessage$ErrorType r2 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0074 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0074 }
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r5, (com.tapjoy.TapjoyErrorMessage) r1)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0072
            r6.onConnectFailure()     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r3)
            return r0
        L_0x0074:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11427eu.mo69913a(android.content.Context, java.lang.String, com.tapjoy.TJConnectListener):boolean");
    }

    /* renamed from: a */
    public final TJPlacement mo69884a(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m30758a(str, "", "", tJPlacementListener);
    }

    /* renamed from: b */
    public final TJPlacement mo69915b(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.m30759b(str, "", "", tJPlacementListener);
    }

    /* renamed from: a */
    public final void mo69890a(Activity activity) {
        if (activity != null) {
            C11285b.m30880a(activity);
        } else {
            TapjoyLog.m30840e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Cannot set activity to NULL"));
        }
    }

    /* renamed from: a */
    public final void mo69885a(float f) {
        if (m31307k("setCurrencyMultiplier")) {
            TapjoyConnectCore.getInstance().setCurrencyMultiplier(f);
        }
    }

    /* renamed from: c */
    public final float mo69923c() {
        if (m31307k("getCurrencyMultiplier")) {
            return TapjoyConnectCore.getInstance().getCurrencyMultiplier();
        }
        return 1.0f;
    }

    /* renamed from: e */
    public final void mo69931e(String str) {
        if (m31306j("actionComplete")) {
            TapjoyConnectCore.getInstance().actionComplete(str);
        }
    }

    /* renamed from: a */
    public final void mo69896a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        if (this.f27266e != null && m31306j("getCurrencyBalance")) {
            this.f27266e.getCurrencyBalance(tJGetCurrencyBalanceListener);
        }
    }

    /* renamed from: a */
    public final void mo69888a(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (this.f27266e != null && m31306j("spendCurrency")) {
            this.f27266e.spendCurrency(i, tJSpendCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo69887a(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (this.f27266e != null && m31306j("awardCurrency")) {
            this.f27266e.awardCurrency(i, tJAwardCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo69895a(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        if (this.f27266e != null && m31306j("setEarnedCurrencyListener")) {
            this.f27266e.setEarnedCurrencyListener(tJEarnedCurrencyListener);
        }
    }

    /* renamed from: a */
    public final void mo69897a(TJVideoListener tJVideoListener) {
        if (m31307k("setVideoListener")) {
            TJAdUnit.f26459a = tJVideoListener;
        }
    }

    /* renamed from: a */
    public final void mo69904a(String str, String str2, String str3, String str4) {
        C11539gx.m31583a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo69901a(String str, String str2) {
        C11539gx.m31583a(str, (String) null, (String) null, str2);
    }

    /* renamed from: a */
    public final void mo69898a(String str) {
        C11539gx.m31584a((String) null, str, (String) null, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo69899a(String str, long j) {
        C11539gx.m31584a((String) null, str, (String) null, (String) null, j);
    }

    /* renamed from: a */
    public final void mo69903a(String str, String str2, long j) {
        C11539gx.m31584a(str, str2, (String) null, (String) null, j);
    }

    /* renamed from: b */
    public final void mo69921b(String str, String str2, String str3, String str4) {
        C11539gx.m31584a(str, str2, str3, str4, 0);
    }

    /* renamed from: a */
    public final void mo69905a(String str, String str2, String str3, String str4, long j) {
        C11539gx.m31584a(str, str2, str3, str4, j);
    }

    /* renamed from: a */
    public final void mo69906a(String str, String str2, String str3, String str4, String str5, long j) {
        C11539gx.m31585a(str, str2, str3, str4, str5, j, (String) null, 0, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo69907a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C11539gx.m31585a(str, str2, str3, str4, str5, j, str6, j2, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo69908a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C11539gx.m31585a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    /* renamed from: d */
    public final void mo69927d() {
        if (m31307k("startSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C11477fn.m31439a();
            }
            TapjoyConnectCore.getInstance().appResume();
            C11558hj.m31644a().mo70129e();
        }
    }

    /* renamed from: e */
    public final void mo69930e() {
        if (m31307k("endSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                C11477fn.m31439a();
            }
            C11558hj.m31644a().f27752m = false;
            TapjoyConnectCore.getInstance().appPause();
            C11558hj.m31644a().mo70130f();
        }
    }

    /* renamed from: b */
    public final void mo69918b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C11477fn.m31439a();
        }
        C11558hj.m31644a().f27752m = true;
        C11558hj.m31644a().mo70111a(activity);
    }

    /* renamed from: c */
    public final void mo69924c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            C11477fn.m31439a();
        }
        C11558hj.m31644a().mo70122b(activity);
    }

    /* renamed from: a */
    public final void mo69900a(String str, TJSetUserIDListener tJSetUserIDListener) {
        if (m31307k("setUserID")) {
            TapjoyConnectCore.setUserID(str, tJSetUserIDListener);
            C11558hj a = C11558hj.m31644a();
            if (a.mo70127c("setUserId")) {
                a.f27745f.mo70152b(C11549he.m31608a(str));
            }
        } else if (tJSetUserIDListener != null) {
            tJSetUserIDListener.onSetUserIDFailure(this.f27265d);
        }
    }

    /* renamed from: i */
    public final void mo69938i(String str) {
        TapjoyConnectCore.setCustomParameter(str);
    }

    /* renamed from: l */
    public final String mo69942l() {
        return TapjoyConnectCore.getCustomParameter();
    }

    /* renamed from: f */
    public final Set<String> mo69933f() {
        return C11558hj.m31644a().mo70126c();
    }

    /* renamed from: a */
    public final void mo69910a(Set<String> set) {
        C11558hj.m31644a().mo70121a(set);
    }

    /* renamed from: g */
    public final void mo69934g() {
        C11558hj.m31644a().mo70121a((Set<String>) null);
    }

    /* renamed from: c */
    public final void mo69925c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11558hj a = C11558hj.m31644a();
            Set<String> c = a.mo70126c();
            if (c.add(str)) {
                a.mo70121a(c);
            }
        }
    }

    /* renamed from: d */
    public final void mo69928d(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11558hj a = C11558hj.m31644a();
            Set<String> c = a.mo70126c();
            if (c.remove(str)) {
                a.mo70121a(c);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo69937h() {
        C11558hj a = C11558hj.m31644a();
        if (!a.mo70127c("isPushNotificationDisabled")) {
            return false;
        }
        boolean f = a.f27745f.mo70156f();
        C11554hg.m31622a("isPushNotificationDisabled = {}", Boolean.valueOf(f));
        return f;
    }

    /* renamed from: b */
    public final void mo69922b(boolean z) {
        String str;
        Object[] objArr;
        String str2;
        C11558hj a = C11558hj.m31644a();
        if (a.mo70127c("setPushNotificationDisabled")) {
            boolean a2 = a.f27745f.mo70149a(z);
            char c = 0;
            String str3 = "setPushNotificationDisabled({}) called, but it is already {}";
            if (a2) {
                objArr = new Object[1];
                str = Boolean.valueOf(z);
                str3 = "setPushNotificationDisabled({}) called";
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(z);
                str = z ? "disabled" : TJAdUnitConstants.String.ENABLED;
                c = 1;
                objArr = objArr2;
            }
            objArr[c] = str;
            C11554hg.m31622a(str3, objArr);
            if (a2 && a.f27749j && !TextUtils.isEmpty(a.f27743d)) {
                if (a.f27753n != null) {
                    str2 = null;
                } else {
                    C11568hl a3 = C11568hl.m31691a(a.f27744e);
                    str2 = C11534gs.m31572b(a3.f28186b.mo70137a(a3.f28185a));
                }
                a.mo70113a(str2);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo69939i() {
        return this.f27262a;
    }

    /* renamed from: j */
    public final boolean mo69940j() {
        return this.f27263b;
    }

    /* renamed from: f */
    public final String mo69932f(String str) {
        if (m31306j("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(str);
        }
        return null;
    }

    /* renamed from: k */
    public final String mo69941k() {
        return TapjoyConnectCore.getUserToken();
    }

    /* renamed from: h */
    public final void mo69936h(String str) {
        C11558hj.m31644a().mo70113a(str);
    }

    /* renamed from: a */
    public final void mo69892a(Context context, Map<String, String> map) {
        boolean z;
        Map<String, String> map2 = map;
        C11558hj a = C11558hj.m31644a();
        if (a.f27744e == null) {
            a.mo70123b(context);
        }
        C11568hl.m31691a(a.f27744e);
        Context context2 = a.f27744e;
        Object[] objArr = new Object[1];
        String str = map2.get("fiverocks");
        if (str == null) {
            return;
        }
        if (C11570hm.m31698a(context2).mo70156f()) {
            C11557hi hiVar = C11558hj.m31645a(context2).f27746g;
            C11435ex.C11436a a2 = hiVar.mo70101a(C11445fa.APP, "push_ignore");
            a2.f27341s = new C11456fe((String) null, (String) null, str);
            hiVar.mo70103a(a2);
            return;
        }
        String str2 = map2.get("title");
        String str3 = map2.get("message");
        if (str3 != null) {
            String str4 = map2.get("rich");
            String str5 = map2.get("sound");
            String str6 = map2.get("payload");
            String str7 = map2.get("always");
            boolean z2 = "true".equals(str7) || Boolean.TRUE.equals(str7);
            String str8 = map2.get("repeatable");
            boolean z3 = "true".equals(str8) || Boolean.TRUE.equals(str8);
            String str9 = map2.get("placement");
            int b = C11568hl.m31693b(map2.get("nid"));
            String str10 = map2.get("channel_id");
            if (z2 || !C11558hj.m31645a(context2).mo70128d()) {
                int i = b;
                boolean z4 = z3;
                Notification a3 = C11568hl.m31690a(context2, str, C11534gs.m31571a(str2), str3, C11568hl.m31692a((Object) str4), C11568hl.m31692a((Object) str5), str6, str9, b, str10);
                C11558hj a4 = C11558hj.m31645a(context2);
                long currentTimeMillis = System.currentTimeMillis();
                a4.mo70123b(context2);
                if (a4.f27745f.mo70148a(str, currentTimeMillis, z4)) {
                    C11557hi hiVar2 = a4.f27746g;
                    C11435ex.C11436a a5 = hiVar2.mo70101a(C11445fa.APP, "push_show");
                    a5.f27341s = new C11456fe((String) null, (String) null, str);
                    hiVar2.mo70103a(a5);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((NotificationManager) context2.getSystemService("notification")).notify(i, a3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69891a(Context context) {
        C11558hj a = C11558hj.m31644a();
        if (a.f27744e == null) {
            a.mo70123b(context);
        }
        if (a.mo70124b()) {
            new TJInstallReferrer().init(context);
            return;
        }
        throw new TapjoyIntegrationException("InstallReferrerClient APIs aren't available in your project. To use activateInstallReferrerClient() API,`com.android.installreferrer:installreferrer` dependency is required to your project level build.gradle file");
    }

    /* renamed from: b */
    public final void mo69919b(Context context, String str) {
        C11558hj a = C11558hj.m31644a();
        if (a.f27744e == null) {
            a.mo70123b(context);
        }
        C11558hj.m31646a(a.f27744e, str);
    }

    /* renamed from: j */
    private boolean m31306j(String str) {
        if (this.f27262a) {
            return true;
        }
        TapjoyLog.m30844w("TapjoyAPI", "Can not call " + str + " because Tapjoy SDK has not successfully connected.");
        return false;
    }

    /* renamed from: k */
    private boolean m31307k(String str) {
        if (this.f27264c) {
            return true;
        }
        this.f27265d = "Can not call " + str + " because Tapjoy SDK is not initialized.";
        TapjoyLog.m30840e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, this.f27265d));
        return false;
    }

    /* renamed from: c */
    public final void mo69926c(boolean z) {
        C11519gh.m31513a().mo70055a(z);
    }

    /* renamed from: g */
    public final void mo69935g(String str) {
        C11519gh.m31513a().mo70054a(str);
    }

    /* renamed from: d */
    public final void mo69929d(boolean z) {
        C11519gh.m31513a().mo70057b(z);
    }

    /* renamed from: m */
    public final TJPrivacyPolicy mo69943m() {
        return TJPrivacyPolicy.getInstance();
    }

    /* renamed from: a */
    public final void mo69902a(String str, String str2, double d, String str3) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70125b("trackPurchase")) {
            String str4 = str;
            String a2 = C11549he.m31609a(str, "trackPurchase", InAppPurchaseMetaData.KEY_PRODUCT_ID);
            if (a2 != null) {
                String str5 = str2;
                String a3 = C11549he.m31609a(str2, "trackPurchase", "currencyCode");
                if (a3 == null) {
                    return;
                }
                if (a3.length() != 3) {
                    C11554hg.m31621a("trackPurchase", "currencyCode", "invalid currency code");
                    return;
                }
                a.f27746g.mo70104a(a2, a3.toUpperCase(Locale.US), d, (String) null, (String) null, C11549he.m31610b(str3));
                C11554hg.m31620a("trackPurchase called");
            }
        }
    }

    /* renamed from: a */
    public final void mo69909a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70125b("trackEvent") && !TextUtils.isEmpty(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null && map.size() > 0) {
                for (Map.Entry next : map.entrySet()) {
                    Object key = next.getKey();
                    if (key == null) {
                        if (C11554hg.f27724a) {
                            C11689w.m32061a("Tapjoy", "{}: {} must not be null", "trackEvent", "key in values map");
                            return;
                        }
                        return;
                    } else if (key instanceof String) {
                        String a2 = C11549he.m31609a((String) key, "trackEvent", "key in values map");
                        if (a2 != null) {
                            Object value = next.getValue();
                            if (value instanceof Number) {
                                linkedHashMap.put(a2, Long.valueOf(((Number) value).longValue()));
                            } else {
                                C11554hg.m31621a("trackEvent", "value in values map", "must be a long");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            a.f27746g.mo70106a(str, str2, str3, str4, linkedHashMap);
            C11554hg.m31622a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo69886a(int i) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70127c("setUserLevel")) {
            C11554hg.m31622a("setUserLevel({}) called", Integer.valueOf(i));
            a.f27745f.mo70146a(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo69917b(int i) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70127c("setUserFriendCount")) {
            C11554hg.m31622a("setUserFriendCount({}) called", Integer.valueOf(i));
            a.f27745f.mo70151b(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    /* renamed from: b */
    public final void mo69920b(String str) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70127c("setAppDataVersion")) {
            a.f27745f.mo70147a(C11549he.m31608a(str));
        }
    }

    /* renamed from: a */
    public final void mo69889a(int i, String str) {
        C11558hj a = C11558hj.m31644a();
        if (a.mo70127c("setUserCohortVariable")) {
            boolean z = i > 0 && i <= 5;
            if (C11554hg.f27724a && !z) {
                C11554hg.m31625b("setCohortVariable: variableIndex is out of range");
            }
            if (z) {
                C11554hg.m31622a("setUserCohortVariable({}, {}) called", Integer.valueOf(i), str);
                a.f27745f.mo70145a(i, C11549he.m31608a(str));
            }
        }
    }

    /* renamed from: a */
    public final void mo69894a(GLSurfaceView gLSurfaceView) {
        C11558hj.m31644a();
        C11558hj.m31647a(gLSurfaceView);
    }
}
