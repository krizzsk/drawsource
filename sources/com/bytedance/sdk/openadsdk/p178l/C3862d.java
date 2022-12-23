package com.bytedance.sdk.openadsdk.p178l;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3919c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.l.d */
/* compiled from: CommonDialogHelper */
public class C3862d {

    /* renamed from: a */
    private static final Map<String, C3864a> f9920a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f9921b;

    /* renamed from: com.bytedance.sdk.openadsdk.l.d$a */
    /* compiled from: CommonDialogHelper */
    public interface C3864a {
        /* renamed from: a */
        void mo20730a();

        /* renamed from: b */
        void mo20731b();

        /* renamed from: c */
        void mo20732c();
    }

    /* renamed from: a */
    public static void m12590a(String str) {
        m12591a(str, 1);
    }

    /* renamed from: b */
    public static void m12593b(String str) {
        m12591a(str, 2);
    }

    /* renamed from: c */
    public static void m12594c(String str) {
        m12591a(str, 3);
    }

    /* renamed from: d */
    public static C3864a m12595d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f9920a.remove(str);
    }

    /* renamed from: a */
    private static void m12591a(final String str, final int i) {
        if (!TextUtils.isEmpty(str)) {
            if (C3948b.m12959c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C3862d.m12592b().broadcastDialogListener(str, i);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3864a d = m12595d(str);
            if (d != null) {
                if (i == 1) {
                    d.mo20730a();
                } else if (i == 2) {
                    d.mo20731b();
                } else if (i != 3) {
                    d.mo20732c();
                } else {
                    d.mo20732c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m12592b() {
        if (f9921b == null) {
            f9921b = C3919c.asInterface(C3912a.m12924a(C3513m.m10963a()).mo20782a(2));
        }
        return f9921b;
    }
}
