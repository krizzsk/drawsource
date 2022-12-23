package p010by.saygames;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.saygames.saypromo.SayPromo;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p010by.saygames.anr.SayAnrService;
import p010by.saygames.p011ui.SayKitUi;

/* renamed from: by.saygames.SayKit */
public class SayKit {
    public static int CurrentAdType = 0;
    public static String CurrentViewName = "Unity";
    private static String _advertisingId = null;
    private static boolean _idfaInitialized = false;
    private static boolean _initialized = false;
    private static boolean _isReferenceSent = false;
    private static SayKitReferrenceData _referrenceData;
    private static IInstallReferrerListener installReferrerListener;
    private static ISayKitBridgeCallbacks sayKitBridgeCallbacks;

    /* renamed from: by.saygames.SayKit$IInstallReferrerListener */
    public interface IInstallReferrerListener {
        void UpdateInstallReferrer();
    }

    /* renamed from: by.saygames.SayKit$ISayKitBridgeCallbacks */
    public interface ISayKitBridgeCallbacks {
        void ConsentPopupCallback();

        void IDFAPopupShowedEventCallback(String str);

        void IDFARedirectToSettingsCallback();

        void NotificationTokenCallback();
    }

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public static void trackSystemEvents(int i) {
        boolean z = i == 1;
        _isReferenceSent = z;
        if (!z && _referrenceData != null) {
            TrackInstallReferenceEvent();
        }
        trackInstallerInfo();
        _initialized = true;
    }

    public static void InitANRService(int i, int i2, int i3) {
        SayAnrService.instance.initialize(i, i2, i3);
    }

    public static void updateAmazonMobileAds() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplication()).edit();
        edit.putString("aps_gdpr_pub_pref_li", "1");
        edit.apply();
    }

    public static void showRateAppPopup() {
        if (Build.VERSION.SDK_INT >= 21) {
            ReviewManager create = ReviewManagerFactory.create(getActivity().getApplicationContext());
            create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() {
                public final void onComplete(Task task) {
                    SayKit.lambda$showRateAppPopup$1(ReviewManager.this, task);
                }
            });
            return;
        }
        getActivity().startActivity(new Intent(getActivity(), RateAppActivity.class));
    }

    static /* synthetic */ void lambda$showRateAppPopup$1(ReviewManager reviewManager, Task task) {
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(getActivity(), (ReviewInfo) task.getResult()).addOnCompleteListener($$Lambda$SayKit$Z6K_VCNEqiq747Mf8Zoi8bY1s.INSTANCE);
        }
    }

    public static void SetUnityIDFVToSayPromo(String str) {
        SayPromo.getInstance(getActivity()).setDeviceId(str);
    }

    public static String GetIDFA() {
        return _idfaInitialized ? _advertisingId : "";
    }

    public static void InitializeIDFA() {
        SayPromo.getInstance(getActivity()).loadAdvertisingId($$Lambda$SayKit$15KIeOAi31RykRhDIE5iFFvNM.INSTANCE);
    }

    static /* synthetic */ void lambda$InitializeIDFA$2(String str) {
        _advertisingId = str;
        _idfaInitialized = true;
    }

    public static void UpdateCurrentView(String str, int i) {
        CurrentViewName = str;
        CurrentAdType = i;
    }

    public static void OpenSupportPage(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str + "&session=" + SayKitEvents.session));
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                getActivity().startActivity(intent);
            }
        } catch (Error | Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public static void ShowConsentPopup(int i, String str, String str2, String str3, String str4, int i2) {
        if (i == 0) {
            ShowConsentPopupOld(str, str2, str4);
            return;
        }
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        ShowConsentPopupNew(z, str, str2, str3, str4);
    }

    private static void ShowConsentPopupNew(boolean z, String str, String str2, String str3, String str4) {
        try {
            SayKitUi.showGdprConsentNew(getActivity(), z, str, str2, str3, str4, $$Lambda$SayKit$hdzoikEKpfcInG6AeJheXIaypsA.INSTANCE);
        } catch (Throwable th) {
            FirebaseCrashlytics.getInstance().recordException(th);
            SayKitEvents.track("sk_exception", 0, 0, th.getMessage(), "Consent");
        }
    }

    static /* synthetic */ void lambda$ShowConsentPopupNew$3() {
        ISayKitBridgeCallbacks iSayKitBridgeCallbacks = sayKitBridgeCallbacks;
        if (iSayKitBridgeCallbacks != null) {
            iSayKitBridgeCallbacks.ConsentPopupCallback();
        }
    }

    private static void ShowConsentPopupOld(String str, String str2, String str3) {
        try {
            SayKitUi.showGdprConsentOld(getActivity(), str, str2, str3, $$Lambda$SayKit$n1s9LwWkD6IjaMSDWPUHTnt8xFw.INSTANCE);
        } catch (Throwable th) {
            FirebaseCrashlytics.getInstance().recordException(th);
            SayKitEvents.track("sk_exception", 0, 0, th.getMessage(), "Consent");
        }
    }

    static /* synthetic */ void lambda$ShowConsentPopupOld$4() {
        ISayKitBridgeCallbacks iSayKitBridgeCallbacks = sayKitBridgeCallbacks;
        if (iSayKitBridgeCallbacks != null) {
            iSayKitBridgeCallbacks.ConsentPopupCallback();
        }
    }

    public static void SetReferenceData(String str, int i, int i2, int i3, String str2, boolean z) {
        SayKitReferrenceData sayKitReferrenceData = new SayKitReferrenceData();
        _referrenceData = sayKitReferrenceData;
        sayKitReferrenceData.referrerUrl = str;
        _referrenceData.referrerClickTime = i;
        _referrenceData.appInstallTime = i2;
        _referrenceData.instantExperienceLaunchedParam = i3;
        _referrenceData.errorMessage = str2;
        _referrenceData.isError = z;
        if (_initialized && !_isReferenceSent) {
            TrackInstallReferenceEvent();
        }
    }

    private static void TrackInstallReferenceEvent() {
        try {
            if (_referrenceData != null) {
                _isReferenceSent = true;
                if (_referrenceData.isError) {
                    SayKitEvents.track("install_referrer_error", 0, 0, _referrenceData.errorMessage);
                    return;
                }
                SayKitEvents.track(Constants.INSTALL_REFERRER, _referrenceData.referrerClickTime, _referrenceData.appInstallTime, _referrenceData.instantExperienceLaunchedParam, _referrenceData.referrerUrl);
                if (installReferrerListener != null) {
                    installReferrerListener.UpdateInstallReferrer();
                }
            }
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
    }

    private static void trackInstallerInfo() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = getActivity().getPackageManager().getInstallSourceInfo(getActivity().getPackageName());
                if (installSourceInfo.getInstallingPackageName() != null) {
                    SayKitEvents.track("play_store", 1, 0, installSourceInfo.getInstallingPackageName());
                    return;
                } else {
                    SayKitEvents.track("play_store", 0, 0, "");
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchMethodError e) {
            Log.e("SayKit", e.getMessage());
        }
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"com.android.vending", "com.google.android.feedback"}));
            String installerPackageName = getActivity().getPackageManager().getInstallerPackageName(getActivity().getPackageName());
            if (installerPackageName != null && arrayList.contains(installerPackageName)) {
                SayKitEvents.track("play_store", 1, 0, installerPackageName);
            } else {
                SayKitEvents.track("play_store", 0, 0, "");
            }
        } catch (Error | Exception e2) {
            Log.e("SayKit", e2.getMessage());
        }
    }

    public static String propsStrFromDictionary(Map<String, String> map) {
        StringBuilder sb = new StringBuilder(64);
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void setListener(IInstallReferrerListener iInstallReferrerListener) {
        installReferrerListener = iInstallReferrerListener;
    }

    public static void setSayKitBridgeListener(ISayKitBridgeCallbacks iSayKitBridgeCallbacks) {
        sayKitBridgeCallbacks = iSayKitBridgeCallbacks;
    }

    public static void sendNotificationTokenEvent() {
        ISayKitBridgeCallbacks iSayKitBridgeCallbacks = sayKitBridgeCallbacks;
        if (iSayKitBridgeCallbacks != null) {
            iSayKitBridgeCallbacks.NotificationTokenCallback();
        }
    }
}
