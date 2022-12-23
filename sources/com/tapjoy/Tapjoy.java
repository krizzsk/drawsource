package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.tapjoy.internal.C11426et;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public final class Tapjoy {
    public static final String INTENT_EXTRA_PUSH_PAYLOAD = "com.tapjoy.PUSH_PAYLOAD";

    public static String getVersion() {
        return C11426et.m31243a().mo69916b();
    }

    public static void setDebugEnabled(boolean z) {
        C11426et.m31243a().mo69911a(z);
    }

    public static boolean connect(Context context, String str) {
        return C11426et.m31243a().mo69912a(context, str);
    }

    public static boolean connect(Context context, String str, Hashtable<String, ?> hashtable) {
        return C11426et.m31243a().mo69914a(context, str, hashtable, (TJConnectListener) null);
    }

    public static synchronized boolean connect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C11426et.m31243a().mo69914a(context, str, hashtable, tJConnectListener);
        }
        return a;
    }

    public static TJPlacement getPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C11426et.m31243a().mo69884a(str, tJPlacementListener);
    }

    public static void setActivity(Activity activity) {
        C11426et.m31243a().mo69890a(activity);
    }

    public static void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        C11426et.m31243a().mo69896a(tJGetCurrencyBalanceListener);
    }

    public static void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        C11426et.m31243a().mo69888a(i, tJSpendCurrencyListener);
    }

    public static void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        C11426et.m31243a().mo69887a(i, tJAwardCurrencyListener);
    }

    public static void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        C11426et.m31243a().mo69895a(tJEarnedCurrencyListener);
    }

    @Deprecated
    public static void setCurrencyMultiplier(float f) {
        C11426et.m31243a().mo69885a(f);
    }

    @Deprecated
    public static float getCurrencyMultiplier() {
        return C11426et.m31243a().mo69923c();
    }

    public static void trackPurchase(String str, String str2, double d, String str3) {
        C11426et.m31243a().mo69902a(str, str2, d, str3);
    }

    public static void trackPurchase(String str, String str2, String str3, String str4) {
        C11426et.m31243a().mo69904a(str, str2, str3, str4);
    }

    @Deprecated
    public static void trackPurchase(String str, String str2) {
        C11426et.m31243a().mo69901a(str, str2);
    }

    public static void trackEvent(String str) {
        C11426et.m31243a().mo69898a(str);
    }

    public static void trackEvent(String str, long j) {
        C11426et.m31243a().mo69899a(str, j);
    }

    public static void trackEvent(String str, String str2, long j) {
        C11426et.m31243a().mo69903a(str, str2, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4) {
        C11426et.m31243a().mo69921b(str, str2, str3, str4);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, long j) {
        C11426et.m31243a().mo69905a(str, str2, str3, str4, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j) {
        C11426et.m31243a().mo69906a(str, str2, str3, str4, str5, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C11426et.m31243a().mo69907a(str, str2, str3, str4, str5, j, str6, j2);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C11426et.m31243a().mo69908a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11426et.m31243a().mo69909a(str, str2, str3, str4, map);
    }

    public static void startSession() {
        C11426et.m31243a().mo69927d();
    }

    public static void endSession() {
        C11426et.m31243a().mo69930e();
    }

    public static void onActivityStart(Activity activity) {
        C11426et.m31243a().mo69918b(activity);
    }

    public static void onActivityStop(Activity activity) {
        C11426et.m31243a().mo69924c(activity);
    }

    @Deprecated
    public static void setUserID(String str) {
        setUserID(str, (TJSetUserIDListener) null);
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        C11426et.m31243a().mo69900a(str, tJSetUserIDListener);
    }

    public static void setUserLevel(int i) {
        C11426et.m31243a().mo69886a(i);
    }

    public static void setUserFriendCount(int i) {
        C11426et.m31243a().mo69917b(i);
    }

    public static void setAppDataVersion(String str) {
        C11426et.m31243a().mo69920b(str);
    }

    public static void setUserCohortVariable(int i, String str) {
        C11426et.m31243a().mo69889a(i, str);
    }

    public static Set<String> getUserTags() {
        return C11426et.m31243a().mo69933f();
    }

    public static void setUserTags(Set<String> set) {
        C11426et.m31243a().mo69910a(set);
    }

    public static void clearUserTags() {
        C11426et.m31243a().mo69934g();
    }

    public static void addUserTag(String str) {
        C11426et.m31243a().mo69925c(str);
    }

    public static void removeUserTag(String str) {
        C11426et.m31243a().mo69928d(str);
    }

    public static void setVideoListener(TJVideoListener tJVideoListener) {
        C11426et.m31243a().mo69897a(tJVideoListener);
    }

    public static void actionComplete(String str) {
        C11426et.m31243a().mo69931e(str);
    }

    public static void setDeviceToken(String str) {
        C11426et.m31243a().mo69936h(str);
    }

    public static void setReceiveRemoteNotification(Context context, Map<String, String> map) {
        C11426et.m31243a().mo69892a(context, map);
    }

    public static void activateInstallReferrerClient(Context context) {
        try {
            C11426et.m31243a().mo69891a(context);
        } catch (TapjoyIntegrationException e) {
            Log.w("Tapjoy", e.getMessage());
        }
    }

    public static void setInstallReferrer(Context context, String str) {
        C11426et.m31243a().mo69919b(context, str);
    }

    public static boolean isPushNotificationDisabled() {
        return C11426et.m31243a().mo69937h();
    }

    public static void setPushNotificationDisabled(boolean z) {
        C11426et.m31243a().mo69922b(z);
    }

    public static void loadSharedLibrary() {
        try {
            System.loadLibrary("tapjoy");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        C11426et.m31243a().mo69894a(gLSurfaceView);
    }

    public static String getSupportURL() {
        return C11426et.m31243a().mo69932f((String) null);
    }

    public static String getSupportURL(String str) {
        return C11426et.m31243a().mo69932f(str);
    }

    public static String getUserToken() {
        return C11426et.m31243a().mo69941k();
    }

    public static boolean isConnected() {
        return C11426et.m31243a().mo69939i();
    }

    @Deprecated
    public static void subjectToGDPR(boolean z) {
        C11426et.m31243a().mo69926c(z);
    }

    @Deprecated
    public static void setUserConsent(String str) {
        C11426et.m31243a().mo69935g(str);
    }

    @Deprecated
    public static void belowConsentAge(boolean z) {
        C11426et.m31243a().mo69929d(z);
    }

    public static synchronized boolean limitedConnect(Context context, String str, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C11426et.m31243a().mo69913a(context, str, tJConnectListener);
        }
        return a;
    }

    public static boolean isLimitedConnected() {
        return C11426et.m31243a().mo69940j();
    }

    public static TJPlacement getLimitedPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C11426et.m31243a().mo69915b(str, tJPlacementListener);
    }

    public static void setCustomParameter(String str) {
        C11426et.m31243a().mo69938i(str);
    }

    public static String getCustomParameter() {
        return C11426et.m31243a().mo69942l();
    }

    public static TJPrivacyPolicy getPrivacyPolicy() {
        return C11426et.m31243a().mo69943m();
    }

    public static void optOutAdvertisingID(Context context, boolean z) {
        C11426et.m31243a().mo69893a(context, z);
    }
}
