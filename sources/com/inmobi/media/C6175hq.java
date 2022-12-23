package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.applovin.impl.sdk.utils.Utils;

/* renamed from: com.inmobi.media.hq */
/* compiled from: AppstoreLinkHandler */
public final class C6175hq {

    /* renamed from: a */
    private static C6175hq f15593a;

    private C6175hq() {
    }

    /* renamed from: a */
    public static synchronized C6175hq m18296a() {
        C6175hq hqVar;
        synchronized (C6175hq.class) {
            if (f15593a == null) {
                f15593a = new C6175hq();
            }
            hqVar = f15593a;
        }
        return hqVar;
    }

    /* renamed from: a */
    private static boolean m18299a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (Utils.PLAY_STORE_SCHEME.equals(parse.getScheme()) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m18297a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18298a(Context context, String str) {
        if (!m18299a(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (m18297a(context)) {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        }
        C6176hr.m18300a();
        if (C6176hr.m18301a(context, str)) {
            return true;
        }
        return false;
    }
}
