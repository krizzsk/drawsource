package com.com.bytedance.overseas.sdk.p186b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3388c;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.com.bytedance.overseas.sdk.b.a */
/* compiled from: AdvertisingIdHelper */
public class C3970a {

    /* renamed from: c */
    private static volatile C3970a f10086c;

    /* renamed from: a */
    private String f10087a = "";

    /* renamed from: b */
    private final ExecutorService f10088b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static C3970a m13090a() {
        if (f10086c == null) {
            synchronized (C3970a.class) {
                if (f10086c == null) {
                    f10086c = new C3970a();
                }
            }
        }
        return f10086c;
    }

    private C3970a() {
    }

    /* renamed from: b */
    public String mo20862b() {
        if (!C3513m.m10973h().mo19876p(VungleApiClient.GAID)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f10087a)) {
            return this.f10087a;
        }
        String b = C3388c.m10078a(C3513m.m10963a()).mo19370b(VungleApiClient.GAID, "");
        this.f10087a = b;
        return b;
    }

    /* renamed from: a */
    public static void m13091a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3388c.m10078a(C3513m.m10963a()).mo19366a(VungleApiClient.GAID, str);
        }
    }

    /* renamed from: b */
    public void mo20863b(String str) {
        this.f10087a = str;
    }
}
