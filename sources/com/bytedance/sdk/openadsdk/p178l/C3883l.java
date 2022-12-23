package com.bytedance.sdk.openadsdk.p178l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2889b;

/* renamed from: com.bytedance.sdk.openadsdk.l.l */
/* compiled from: OpenUtils */
public class C3883l {
    /* renamed from: a */
    public static void m12669a(Activity activity, String str) {
        if (m12672c(activity, str)) {
            C2889b.m8066a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)), (C2889b.C2890a) null);
        }
    }

    /* renamed from: b */
    public static boolean m12671b(Activity activity, String str) {
        if (!m12672c(activity, str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            activity.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m12672c(Activity activity, String str) {
        return m12670a(activity) && !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public static boolean m12670a(Activity activity) {
        return activity != null && !activity.isDestroyed() && !activity.isFinishing();
    }
}
