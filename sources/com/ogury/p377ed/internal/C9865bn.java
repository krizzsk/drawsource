package com.ogury.p377ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bn */
public final class C9865bn {
    /* renamed from: a */
    public static List<Activity> m28485a(Context context) {
        C10263mq.m29882b(context, "context");
        try {
            List<Activity> arrayList = new ArrayList<>();
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            C10263mq.m29879a((Object) activityInfoArr, "activitiesInfo");
            int i = 0;
            int length = activityInfoArr.length;
            while (i < length) {
                ActivityInfo activityInfo = activityInfoArr[i];
                i++;
                String str = activityInfo.name;
                C10263mq.m29879a((Object) str, "activityInfo.name");
                Activity a = m28484a(str);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return C10190km.m29757a();
        }
    }

    /* renamed from: a */
    private static Activity m28484a(String str) {
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof Activity) {
                return (Activity) newInstance;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
