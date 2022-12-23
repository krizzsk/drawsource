package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.download.C9649f;
import java.io.File;

/* renamed from: com.mbridge.msdk.videocommon.download.h */
/* compiled from: HTMLResourceManager */
public final class C9661h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f24063a;

    /* renamed from: com.mbridge.msdk.videocommon.download.h$a */
    /* compiled from: HTMLResourceManager */
    private static class C9663a {

        /* renamed from: a */
        public static C9661h f24065a = new C9661h();
    }

    private C9661h() {
        this.f24063a = C8478e.m24306b(C8476c.MBRIDGE_700_HTML);
    }

    /* renamed from: a */
    public static C9661h m27556a() {
        return C9663a.f24065a;
    }

    /* renamed from: b */
    public final void mo63675b() {
        try {
            if (!TextUtils.isEmpty(this.f24063a)) {
                C9649f.C9651a.f24046a.mo63667a(new C8490a() {
                    /* renamed from: b */
                    public final void mo37111b() {
                    }

                    /* renamed from: a */
                    public final void mo37110a() {
                        C8666t.m24867c(C9661h.this.f24063a);
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo63673a(String str, byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            if (bArr.length <= 0) {
                return false;
            }
            if (C8666t.m24862a(bArr, new File(this.f24063a + "/" + SameMD5.getMD5(C8617ae.m24719a(str)) + ".html"))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final String mo63672a(String str) {
        try {
            String str2 = this.f24063a + "/" + SameMD5.getMD5(C8617ae.m24719a(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b != null && !TextUtils.isEmpty(b.mo16200ar())) {
                C8666t.m24862a(C2427b.m5857a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, C8666t.m24856a(file))).getBytes(), file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo63674b(String str) {
        try {
            String md5 = SameMD5.getMD5(C8617ae.m24719a(str));
            File file = new File(this.f24063a + "/" + md5 + ".html");
            if (file.exists()) {
                return C8666t.m24856a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
