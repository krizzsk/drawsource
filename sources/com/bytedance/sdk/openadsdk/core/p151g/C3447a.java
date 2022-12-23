package com.bytedance.sdk.openadsdk.core.p151g;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.bytedance.sdk.component.utils.C2905l;

/* renamed from: com.bytedance.sdk.openadsdk.core.g.a */
/* compiled from: MIUIPermissionUtils */
public class C3447a {

    /* renamed from: a */
    private static final String f8494a = C3447a.class.getSimpleName();

    /* renamed from: a */
    public static boolean m10555a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m10556b(context, str);
        }
        return m10557c(context, str);
    }

    /* renamed from: b */
    private static boolean m10556b(Context context, String str) {
        String str2 = f8494a;
        C2905l.m8118e(str2, "checkPermissinKITKATNew，permission：" + str);
        try {
            str.hashCode();
            String lowerCase = str.replaceFirst("android.permission.", "android:").toLowerCase();
            int checkOp = ((AppOpsManager) context.getSystemService("appops")).checkOp(lowerCase, Binder.getCallingUid(), context.getPackageName());
            String str3 = f8494a;
            C2905l.m8118e(str3, "checkPermissinKITKATNew，locationOp,permission：" + checkOp + "," + lowerCase);
            if (checkOp == 0) {
                return true;
            }
            String str4 = f8494a;
            C2905l.m8118e(str4, "checkPermissinKITKATNew，false,permission：" + lowerCase);
            return false;
        } catch (Exception e) {
            String str5 = f8494a;
            C2905l.m8118e(str5, "If there is an error in the permission check, it returns true by default, and the exception code is: " + e);
            return true;
        }
    }

    /* renamed from: c */
    private static boolean m10557c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
