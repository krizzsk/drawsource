package com.bytedance.sdk.component.adexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2531c;

/* renamed from: com.bytedance.sdk.component.adexpress.c */
/* compiled from: ExpressRuntime */
public class C2570c {
    /* renamed from: a */
    public static Context m6618a() {
        if (C2529a.m6339a().mo16550c() == null) {
            return null;
        }
        return C2529a.m6339a().mo16550c().mo16558b();
    }

    /* renamed from: b */
    public static boolean m6619b() {
        C2531c c = C2529a.m6339a().mo16550c();
        if (c != null && c.mo16565i() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m6620c() {
        return C2529a.m6339a().mo16550c().mo16567k();
    }
}
