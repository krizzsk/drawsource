package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.h */
/* compiled from: CustomTabsPackageHelper */
public final class C6155h {

    /* renamed from: a */
    private static final String f15519a = C6155h.class.getSimpleName();

    /* renamed from: b */
    private static String f15520b;

    private C6155h() {
    }

    /* renamed from: a */
    public static String m18219a(Context context) {
        if (context == null || f15520b != null) {
            return f15520b;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo next : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(next.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(next.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f15520b = null;
            } else if (arrayList.size() == 1) {
                f15520b = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !m18220a(context, intent) && arrayList.contains(str)) {
                f15520b = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f15520b = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f15520b = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f15520b = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f15520b = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f15520b;
    }

    /* renamed from: a */
    private static boolean m18220a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e(f15519a, "Runtime exception while getting specialized handlers");
        }
    }
}
