package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.click.b */
/* compiled from: CommonClickUtil */
public final class C6779b {

    /* renamed from: a */
    static Handler f17887a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("rid");
                        String string2 = data.getString("cid_n");
                        str = data.getString(BidResponsedEx.KEY_CID);
                        str3 = string;
                        str2 = string2;
                    } else {
                        str3 = "";
                        str2 = str3;
                        str = str2;
                    }
                    new C8582d(C8388a.m23845e().mo56913g()).mo58062a(i, i2, str3, str2, str);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    };

    /* renamed from: a */
    public static void m20645a(Context context, String str) {
        if (str != null && context != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m20647b(Context context, String str) {
        if (context != null && str != null) {
            try {
                Class.forName("com.mbridge.msdk.activity.MBCommonActivity");
                Intent intent = new Intent(context, Class.forName("com.mbridge.msdk.activity.MBCommonActivity"));
                intent.putExtra("url", str);
                if (!(context instanceof ContextThemeWrapper)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (ClassNotFoundException e) {
                C8672v.m24878d("CommonClickUtil", e.getMessage());
            } catch (Throwable th) {
                C8672v.m24878d("CommonClickUtil", th.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static boolean m20648c(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m20649d(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setData(parse);
            if (parse.getScheme().startsWith(C8659q.m24802b("L7QthdSsLkP8")) && m20646a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            C8672v.m24875a("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m20646a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                context.startActivity(intent);
                return true;
            } else if (C8388a.m23845e().mo56907c() == null) {
                return false;
            } else {
                C8388a.m23845e().mo56907c().startActivity(intent);
                return true;
            }
        } catch (Throwable th) {
            C8672v.m24875a("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: e */
    public static void m20650e(Context context, String str) {
        Intent launchIntentForPackage;
        ResolveInfo next;
        try {
            if (!TextUtils.isEmpty(str) && m20648c(context, str) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (queryIntentActivities.size() > 0 && (next = queryIntentActivities.iterator().next()) != null) {
                    ComponentName componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static String m20643a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    str = str.replaceAll(next, str2);
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m20642a(String str, String str2, String str3) {
        Map<String, C2440a.C2441a> ag;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null || (ag = b.mo16189ag()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            for (Map.Entry<String, C2440a.C2441a> key : ag.entrySet()) {
                String str4 = (String) key.getKey();
                if (!TextUtils.isEmpty(str4) && host.contains(str4)) {
                    C2440a.C2441a aVar = ag.get(str4);
                    if (aVar != null) {
                        return m20643a(m20643a(m20643a(m20643a(str, aVar.mo16275d(), String.valueOf((float) C8660r.m24831j(C8388a.m23845e().mo56913g()))), aVar.mo16274c(), String.valueOf((float) C8660r.m24829i(C8388a.m23845e().mo56913g()))), aVar.mo16271a(), str2), aVar.mo16273b(), str3);
                    }
                    return str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static void m20644a(final Context context, int i, final String str) {
        if (i != 0) {
            try {
                C8498b.m24359a().execute(new Runnable() {
                    public final void run() {
                        try {
                            Method method = Class.forName("com.mbridge.msdk.foundation.tools.o").getMethod("mia", new Class[]{Context.class, String.class});
                            if (context == null) {
                                method.invoke((Object) null, new Object[]{C8388a.m23845e().mo56913g(), str});
                                return;
                            }
                            method.invoke((Object) null, new Object[]{context, str});
                        } catch (Throwable th) {
                            C8672v.m24878d("CommonClickUtil", th.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                C8672v.m24878d("CommonClickUtil", th.getMessage());
            }
        }
    }
}
