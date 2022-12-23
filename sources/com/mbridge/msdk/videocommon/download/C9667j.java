package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8665s;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.download.C9649f;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.List;

/* renamed from: com.mbridge.msdk.videocommon.download.j */
/* compiled from: ResourceManager */
public final class C9667j {

    /* renamed from: a */
    private static String f24072a = "ResourceManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f24073b;

    /* renamed from: com.mbridge.msdk.videocommon.download.j$a */
    /* compiled from: ResourceManager */
    private static class C9669a {

        /* renamed from: a */
        public static C9667j f24075a = new C9667j();
    }

    private C9667j() {
        this.f24073b = C8478e.m24306b(C8476c.MBRIDGE_700_RES);
    }

    /* renamed from: a */
    public static C9667j m27573a() {
        return C9669a.f24075a;
    }

    /* renamed from: b */
    public final void mo63686b() {
        try {
            if (!TextUtils.isEmpty(this.f24073b)) {
                C9649f.C9651a.f24046a.mo63667a(new C8490a() {
                    /* renamed from: b */
                    public final void mo37111b() {
                    }

                    /* renamed from: a */
                    public final void mo37110a() {
                        C8666t.m24867c(C9667j.this.f24073b);
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
    public final synchronized String mo63685a(String str, byte[] bArr) {
        String str2;
        String str3 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str4 = this.f24073b + "/" + SameMD5.getMD5(C8617ae.m24719a(str)) + ".zip";
                    File file = new File(str4);
                    if (C8666t.m24862a(bArr, file)) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters("nc");
                        if (queryParameters != null) {
                            if (queryParameters.size() != 0) {
                                str3 = m27575a(str, str4, file);
                            }
                        }
                        List<String> queryParameters2 = parse.getQueryParameters("md5filename");
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str5 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str5) && str5.equals(C8665s.m24854a(file))) {
                                str3 = m27575a(str, str4, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        C8666t.m24863b(file);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                str2 = e.getMessage();
            }
        }
        str2 = str3;
        return str2;
    }

    /* renamed from: a */
    private String m27575a(String str, String str2, File file) {
        String a = C8666t.m24857a(str2, this.f24073b + "/" + SameMD5.getMD5(C8617ae.m24719a(str)));
        return TextUtils.isEmpty(a) ? C8666t.m24863b(file) : a;
    }

    /* renamed from: a */
    public final String mo63684a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.f24073b + "/" + SameMD5.getMD5(C8617ae.m24719a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!C8666t.m24861a(str6)) {
                return null;
            }
            try {
                C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                if (b != null && !TextUtils.isEmpty(b.mo16200ar())) {
                    File file = new File(str6);
                    C8666t.m24862a(C2427b.m5857a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, C8666t.m24856a(file))).getBytes(), file);
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return Advertisement.FILE_SCHEME + str6 + str3;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
