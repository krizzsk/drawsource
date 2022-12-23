package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2891c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.p152h.C3460a;
import com.bytedance.sdk.openadsdk.core.p152h.C3461b;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.r */
/* compiled from: SecSdkHelper */
public class C3576r {

    /* renamed from: a */
    private static C3460a f9037a;

    /* renamed from: b */
    private String f9038b;

    /* renamed from: com.bytedance.sdk.openadsdk.core.r$a */
    /* compiled from: SecSdkHelper */
    private static class C3578a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3576r f9039a = new C3576r();
    }

    private C3576r() {
        this.f9038b = null;
        f9037a = new C3461b();
    }

    /* renamed from: a */
    public void mo20123a(String str) {
        C3460a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f9037a) != null) {
            aVar.mo19786a(str);
        }
    }

    /* renamed from: a */
    public static C3576r m11309a() {
        return C3578a.f9039a;
    }

    /* renamed from: b */
    public void mo20125b(String str) {
        C3460a aVar = f9037a;
        if (aVar != null) {
            aVar.mo19788b(str);
        }
    }

    /* renamed from: b */
    public String mo20124b() {
        try {
            C2905l.m8114c("mssdk", "进入getSha1");
            if (!TextUtils.isEmpty(this.f9038b)) {
                C2905l.m8114c("mssdk", "sha1 内存 getSha1 " + this.f9038b);
                return this.f9038b;
            }
            String a = C3457h.m10577a("sdk_app_sha1", 2592000000L);
            this.f9038b = a;
            if (!TextUtils.isEmpty(a)) {
                C2905l.m8114c("mssdk", "sha1 return sha1: " + this.f9038b);
                return this.f9038b;
            }
            if (f9037a != null) {
                this.f9038b = f9037a.mo19787b();
                C2905l.m8114c("mssdk", "sha1: mssdk:  " + this.f9038b);
            }
            if (m11310c(this.f9038b)) {
                String upperCase = this.f9038b.toUpperCase();
                this.f9038b = upperCase;
                C3457h.m10579a("sdk_app_sha1", upperCase);
                return this.f9038b;
            }
            String a2 = C2891c.m8069a(C3513m.m10963a());
            this.f9038b = a2;
            if (!m11310c(a2)) {
                return "";
            }
            String upperCase2 = this.f9038b.toUpperCase();
            this.f9038b = upperCase2;
            C3457h.m10579a("sdk_app_sha1", upperCase2);
            return this.f9038b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    private boolean m11310c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(CertificateUtil.DELIMITER)) == null || split.length < 20) {
            return false;
        }
        for (String equals : split) {
            if (!"00".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String mo20126c() {
        C3460a aVar = f9037a;
        if (aVar == null) {
            return "";
        }
        String a = aVar.mo19784a();
        C2905l.m8114c("mssdk", "sec_did: " + a);
        return a != null ? a : "";
    }

    /* renamed from: a */
    public Map<String, String> mo20122a(String str, byte[] bArr) {
        C3460a aVar = f9037a;
        if (aVar != null) {
            return aVar.mo19785a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", bArr);
        }
        return new HashMap();
    }
}
