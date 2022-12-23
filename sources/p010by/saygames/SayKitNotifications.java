package p010by.saygames;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* renamed from: by.saygames.SayKitNotifications */
public class SayKitNotifications {
    private static final String TAG = "SayKitNotifications";
    static String extraAppLaunchedFromNotification = null;
    static boolean isAppLaunchedFromNotification = false;
    static String token = "";

    public static String getToken() {
        return token;
    }

    public static void init() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(Task<String> task) {
                if (!task.isSuccessful()) {
                    SayKitLog.Log("w", SayKitNotifications.TAG, "getInstanceId failed", task.getException());
                    SayKitEvents.track("notification_token", 2, 0, "", "Denied");
                    return;
                }
                String result = task.getResult();
                SayKitLog.Log(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, SayKitNotifications.TAG, result);
                SayKitNotifications.token = result;
                if (result.isEmpty()) {
                    SayKitEvents.track("notification_token", 1, 0, "", "Denied");
                } else {
                    SayKitEvents.track("notification_token", 0, 0, result, "Authorized");
                }
                SayKit.sendNotificationTokenEvent();
            }
        });
    }
}
