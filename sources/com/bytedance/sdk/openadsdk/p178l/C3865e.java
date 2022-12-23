package com.bytedance.sdk.openadsdk.p178l;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3920d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.l.e */
/* compiled from: CommonPermissionUtils */
public class C3865e {

    /* renamed from: a */
    private static final Map<String, C3868a> f9924a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f9925b;

    /* renamed from: com.bytedance.sdk.openadsdk.l.e$a */
    /* compiled from: CommonPermissionUtils */
    public interface C3868a {
        /* renamed from: a */
        void mo20735a();

        /* renamed from: a */
        void mo20736a(String str);
    }

    /* renamed from: a */
    public static void m12600a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C3948b.m12959c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C2905l.m8111b("MultiProcess", "handleYes-1，key=" + str);
                            C3865e.m12602b().broadcastPermissionListener(str, (String) null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3868a b = m12603b(str);
            if (b != null) {
                b.mo20735a();
            }
        }
    }

    /* renamed from: a */
    public static void m12601a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (C3948b.m12959c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C2905l.m8111b("MultiProcess", "handleNo-1，key=" + str + "，permission=" + str2);
                            C3865e.m12602b().broadcastPermissionListener(str, str2);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3868a b = m12603b(str);
            if (b != null) {
                b.mo20736a(str2);
            }
        }
    }

    /* renamed from: b */
    private static C3868a m12603b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f9924a.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m12602b() {
        if (f9925b == null) {
            f9925b = C3920d.asInterface(C3912a.m12924a(C3513m.m10963a()).mo20782a(4));
        }
        return f9925b;
    }
}
