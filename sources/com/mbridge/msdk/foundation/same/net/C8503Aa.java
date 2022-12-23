package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8659q;

/* renamed from: com.mbridge.msdk.foundation.same.net.Aa */
public class C8503Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* renamed from: a */
    private static String f20846a = "";

    /* renamed from: b */
    private static void m24364b(String str) {
        String str2;
        Integer c;
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = C8659q.m24802b(str);
            } catch (Throwable th) {
                th.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2) && str2.startsWith(C_START) && str2.endsWith(C_END) && (c = m24365c(str2)) != null) {
                f20846a = String.valueOf(c);
            } else if (!MBridgeConstans.DEBUG) {
                f20846a = "";
            } else {
                m24366g();
                throw new RuntimeException("please don't update this value");
            }
        }
    }

    /* renamed from: c */
    private static Integer m24365c(String str) {
        Integer num;
        Throwable th;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(C_START);
        int indexOf2 = str.indexOf(C_END);
        if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
            return null;
        }
        try {
            num = Integer.valueOf(str.substring(indexOf + 11, indexOf2));
            try {
                if (num.intValue() > 0) {
                    return num;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return num;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
            th.printStackTrace();
            return num;
        }
    }

    /* renamed from: a */
    public static String m24363a() {
        return f20846a;
    }

    /* renamed from: g */
    private static void m24366g() {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 500);
    }
}
