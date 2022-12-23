package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.inmobi.media.hx */
/* compiled from: SdkInfo */
public final class C6184hx {

    /* renamed from: a */
    private static String f15611a = "dir";

    /* renamed from: b */
    private static String f15612b;

    /* renamed from: b */
    public static String m18347b() {
        return "10.0.9";
    }

    /* renamed from: c */
    public static String m18350c() {
        return "2.0";
    }

    /* renamed from: d */
    public static String m18351d() {
        return "android";
    }

    /* renamed from: e */
    public static String m18352e() {
        return "https://www.inmobi.com/products/sdk/#downloads";
    }

    /* renamed from: a */
    public static String m18342a() {
        String str = "pr-SAND-" + m18347b() + "-20220805";
        if (TextUtils.isEmpty("")) {
            return str;
        }
        return str + "-" + "";
    }

    /* renamed from: a */
    public static String m18343a(Context context) {
        return C6165hi.m18257a(context, "sdk_version_store").mo35372b("sdk_version");
    }

    /* renamed from: a */
    public static void m18344a(Context context, String str) {
        C6165hi.m18257a(context, "sdk_version_store").mo35369a("sdk_version", str);
    }

    /* renamed from: b */
    public static boolean m18349b(Context context) {
        return C6165hi.m18257a(context, "sdk_version_store").mo35373b("db_deletion_failed", false);
    }

    /* renamed from: a */
    public static void m18345a(Context context, boolean z) {
        C6165hi.m18257a(context, "sdk_version_store").mo35370a("db_deletion_failed", z);
    }

    /* renamed from: a */
    public static void m18346a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f15611a = str;
        }
    }

    /* renamed from: b */
    public static void m18348b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f15612b = str;
        }
    }

    /* renamed from: f */
    public static String m18353f() {
        return f15612b;
    }

    /* renamed from: g */
    public static String m18354g() {
        return f15611a;
    }
}
