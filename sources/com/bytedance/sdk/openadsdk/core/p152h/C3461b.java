package com.bytedance.sdk.openadsdk.core.p152h;

import android.content.Context;
import android.os.Looper;
import com.bytedance.mobsec.metasec.p087ov.PglMSConfig;
import com.bytedance.mobsec.metasec.p087ov.PglMSManager;
import com.bytedance.mobsec.metasec.p087ov.PglMSManagerUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.google.common.base.Ascii;
import com.vungle.warren.model.ReportDBAdapter;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.h.b */
/* compiled from: MSSdkImpl */
public class C3461b implements C3460a {

    /* renamed from: b */
    private static volatile boolean f8538b = false;

    /* renamed from: c */
    private static volatile boolean f8539c = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PglMSManager f8540a;

    /* renamed from: d */
    private volatile String f8541d = C3457h.m10580d().mo19764f();

    /* renamed from: e */
    private volatile String f8542e;

    public C3461b() {
        Context a = C3513m.m10963a();
        this.f8542e = C3472j.m10774a(a);
        f8538b = m10635a(this.f8541d, this.f8542e);
    }

    /* renamed from: a */
    private boolean m10635a(String str, String str2) {
        try {
            C2905l.m8114c("mssdk", "Sdk.APP_ID: 1371\n appId: " + str + " \n MS_SDK_LICENCE:" + "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj" + " \n did: " + str2 + " ");
            Context a = C3513m.m10963a();
            PglMSConfig build = new PglMSConfig.Builder("1371", str, "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj", m10638e()).setDeviceID(str2).setClientType(1).setOVRegionType(0).build();
            long currentTimeMillis = System.currentTimeMillis();
            PglMSManagerUtils.init(a, build);
            C3753b.m12287a().mo20572a("init", currentTimeMillis);
            m10637d();
            if (this.f8540a != null) {
                this.f8540a.setDeviceID(str2);
            }
            C2905l.m8114c("mssdk", "init: 成功");
            return true;
        } catch (Throwable th) {
            C2905l.m8114c("mssdk", "init: 失败");
            C2905l.m8112b("MSSdkImpl", "appid 为空，初始化失败！或不包含mssdk模块", th);
            m10639f();
            return false;
        }
    }

    /* renamed from: c */
    private synchronized boolean m10636c() {
        if (!f8538b && f8539c) {
            this.f8541d = C3457h.m10580d().mo19764f();
            this.f8542e = C3472j.m10774a(C3513m.m10963a());
            f8538b = m10635a(this.f8541d, this.f8542e);
        }
        return f8538b;
    }

    /* renamed from: d */
    private void m10637d() {
        if (this.f8540a == null) {
            PglMSManager pglMSManager = PglMSManagerUtils.get("1371");
            this.f8540a = pglMSManager;
            if (pglMSManager != null) {
                pglMSManager.setCollectMode(m10638e());
            }
        }
    }

    /* renamed from: e */
    private int m10638e() {
        int o = C3898x.m12828o();
        if (o == 4 || o == 5) {
            C2905l.m8114c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_USEA");
            return 503;
        }
        C2905l.m8114c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_NONUSEA");
        return 603;
    }

    /* renamed from: a */
    public void mo19786a(final String str) {
        if (m10636c()) {
            m10637d();
            if (this.f8540a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C2882e.m8035a((C2885g) new C2885g("updateDid") {
                        public void run() {
                            if (C3461b.this.f8540a != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C3461b.this.f8540a.setDeviceID(str);
                                C3753b.m12287a().mo20572a("setDeviceID", currentTimeMillis);
                            }
                        }
                    });
                } else {
                    this.f8540a.setDeviceID(str);
                }
                C2905l.m8114c("mssdk did: ", str);
            }
        }
    }

    /* renamed from: b */
    public void mo19788b(String str) {
        if (m10636c()) {
            m10637d();
            if (this.f8540a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8540a.report(str);
                C3753b.m12287a().mo20572a(ReportDBAdapter.ReportColumns.TABLE_NAME, currentTimeMillis);
            }
        }
    }

    /* renamed from: a */
    public String mo19784a() {
        if (!m10636c()) {
            return "";
        }
        m10637d();
        if (this.f8540a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String token = this.f8540a.getToken();
        C3753b.m12287a().mo20572a("getToken", currentTimeMillis);
        C2905l.m8114c("mssdk", "secDeviceToken: " + token);
        return token;
    }

    /* renamed from: a */
    public Map<String, String> mo19785a(String str, byte[] bArr) {
        if (!m10636c()) {
            return new HashMap();
        }
        m10637d();
        if (this.f8540a == null) {
            return new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> featureHash = this.f8540a.getFeatureHash(str, bArr);
        C3753b.m12287a().mo20572a("getFeatureHash", currentTimeMillis);
        return featureHash;
    }

    /* renamed from: b */
    public String mo19787b() {
        try {
            Context a = C3513m.m10963a();
            return m10634a(MessageDigest.getInstance("SHA1").digest(a.getPackageManager().getPackageInfo(a.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    /* renamed from: a */
    private static String m10634a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (byte b = 0; b < bArr.length; b = (byte) (b + 1)) {
            byte b2 = bArr[b] & 255;
            int i = b * 2;
            cArr[i] = charArray[b2 >>> 4];
            cArr[i + 1] = charArray[b2 & Ascii.f18305SI];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    private Class m10639f() {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ov.PglMS");
            f8539c = true;
            C2905l.m8114c("mssdk", "class found");
            return cls;
        } catch (Throwable unused) {
            C2905l.m8114c("mssdk", "class not found ");
            f8539c = false;
            return cls;
        }
    }
}
