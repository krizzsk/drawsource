package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;

/* renamed from: com.inmobi.media.m */
/* compiled from: LandingPageHandler */
public class C6280m {

    /* renamed from: c */
    private static final String f15808c = C6280m.class.getSimpleName();

    /* renamed from: a */
    public C6177hs f15809a;

    /* renamed from: b */
    public Context f15810b;

    /* renamed from: d */
    private final String f15811d = "inmobinativebrowser";

    /* renamed from: e */
    private final String f15812e = "inmobideeplink";

    /* renamed from: f */
    private final String f15813f = "inmobiswishdeeplink";

    /* renamed from: g */
    private final String f15814g = "url";

    /* renamed from: h */
    private final String f15815h = "primaryUrl";

    /* renamed from: i */
    private final String f15816i = "fallbackUrl";

    /* renamed from: j */
    private final String f15817j = "primaryTrackingUrl";

    /* renamed from: k */
    private final String f15818k = "fallbackTrackingUrl";

    /* renamed from: l */
    private String f15819l = "CustomExpand handling failed";

    /* renamed from: m */
    private C6178ht f15820m;

    /* renamed from: n */
    private C6004f f15821n;

    public C6280m(Context context, C6178ht htVar, C6004f fVar, C6177hs hsVar) {
        this.f15810b = context;
        this.f15820m = htVar;
        this.f15821n = fVar;
        this.f15809a = hsVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r0.equals("EX_NATIVE") != false) goto L_0x00df;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35514a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r6.mo35511a(r7, r8)
            return r1
        L_0x000b:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x001d
            r6.mo35511a(r7, r8)
            return r1
        L_0x001d:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "inmobinativebrowser"
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L_0x002e
            r6.mo35515b(r7, r8, r9)
            return r3
        L_0x002e:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r4 = "inmobideeplink"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x003e
            r6.mo35516c(r7, r8, r9)
            return r3
        L_0x003e:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r4 = "inmobiswishdeeplink"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x008e
            com.inmobi.media.hu r0 = com.inmobi.media.C6179hu.C6181a.f15602a
            com.inmobi.media.hs r1 = r6.f15809a
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r2 = "action"
            java.lang.String r9 = r9.getQueryParameter(r2)
            android.content.Context r2 = com.inmobi.media.C6183hw.m18324c()
            if (r2 == 0) goto L_0x008d
            boolean r4 = com.inmobi.media.C6179hu.m18307a()
            if (r4 == 0) goto L_0x008d
            if (r9 == 0) goto L_0x008d
            int r4 = r9.length()
            if (r4 != 0) goto L_0x006d
            goto L_0x008d
        L_0x006d:
            com.inmobi.swishfolder.adapter.SwishSDK r4 = com.inmobi.swishfolder.adapter.SwishSDK.INSTANCE     // Catch:{ all -> 0x0078 }
            com.inmobi.media.hu$1 r5 = new com.inmobi.media.hu$1     // Catch:{ all -> 0x0078 }
            r5.<init>(r1, r8, r7)     // Catch:{ all -> 0x0078 }
            r4.processSwishDeeplink(r2, r9, r5)     // Catch:{ all -> 0x0078 }
            goto L_0x008d
        L_0x0078:
            r9 = move-exception
            r9.printStackTrace()
            java.lang.String r0 = "Swish Processing Failed"
            r1.mo35394c(r8, r0, r7)
            com.inmobi.media.gj r7 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r8 = new com.inmobi.media.hk
            r8.<init>(r9)
            r7.mo35310a((com.inmobi.media.C6167hk) r8)
        L_0x008d:
            return r3
        L_0x008e:
            com.inmobi.media.C6175hq.m18296a()
            android.content.Context r2 = r6.f15810b
            boolean r2 = com.inmobi.media.C6175hq.m18298a(r2, r9)
            if (r2 == 0) goto L_0x009d
            r6.mo35518e(r7, r8, r9)
            return r3
        L_0x009d:
            boolean r0 = com.inmobi.media.C6193ia.m18371a((android.net.Uri) r0)
            if (r0 == 0) goto L_0x0101
            com.inmobi.media.ht r0 = r6.f15820m
            boolean r0 = r0.f15595a
            if (r0 == 0) goto L_0x00aa
            return r1
        L_0x00aa:
            com.inmobi.media.ht r0 = r6.f15820m
            java.lang.String r0 = r0.f15596b
            r2 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -2032180703: goto L_0x00d4;
                case -702637789: goto L_0x00cb;
                case 112775115: goto L_0x00c1;
                case 409244785: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00de
        L_0x00b7:
            java.lang.String r1 = "IN_NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r1 = 2
            goto L_0x00df
        L_0x00c1:
            java.lang.String r1 = "IN_CUSTOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r1 = r3
            goto L_0x00df
        L_0x00cb:
            java.lang.String r4 = "EX_NATIVE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00d4:
            java.lang.String r1 = "DEFAULT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r1 = 3
            goto L_0x00df
        L_0x00de:
            r1 = r2
        L_0x00df:
            if (r1 == 0) goto L_0x00ed
            if (r1 == r3) goto L_0x00e8
            boolean r7 = r6.m18692f(r7, r8, r9)
            return r7
        L_0x00e8:
            boolean r7 = r6.mo35513a(r9)
            return r7
        L_0x00ed:
            com.inmobi.media.C6176hr.m18300a()
            android.content.Context r0 = r6.f15810b
            boolean r0 = com.inmobi.media.C6176hr.m18301a(r0, r9)
            if (r0 != 0) goto L_0x00fd
            boolean r7 = r6.mo35517d(r7, r8, r9)
            return r7
        L_0x00fd:
            r6.mo35518e(r7, r8, r9)
            return r3
        L_0x0101:
            com.inmobi.media.C6176hr.m18300a()
            android.content.Context r0 = r6.f15810b
            boolean r0 = com.inmobi.media.C6176hr.m18301a(r0, r9)
            if (r0 == 0) goto L_0x0110
            r6.mo35518e(r7, r8, r9)
            return r3
        L_0x0110:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            boolean r9 = com.inmobi.media.C6193ia.m18371a((android.net.Uri) r9)
            if (r9 != 0) goto L_0x011f
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x011f }
        L_0x011f:
            r6.mo35511a(r7, r8)
            com.inmobi.media.ht r7 = r6.f15820m
            boolean r7 = r7.f15595a
            if (r7 != 0) goto L_0x0129
            return r3
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6280m.mo35514a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo35515b(String str, String str2, String str3) {
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f15809a.mo35389a(str2, "Invalid URL", str);
            return;
        }
        C6176hr.m18300a();
        if (C6176hr.m18301a(this.f15810b, queryParameter)) {
            mo35518e(str, str2, str3);
        } else {
            this.f15809a.mo35389a(str2, "Invalid URL", str);
        }
    }

    /* renamed from: c */
    public final boolean mo35516c(String str, String str2, String str3) {
        Uri parse = Uri.parse(str3);
        if (m18690b(parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"))) {
            mo35518e(str, str2, str3);
            return true;
        } else if (m18690b(parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"))) {
            mo35518e(str, str2, str3);
            return true;
        } else {
            this.f15809a.mo35389a(str2, "Invalid URL", str);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m18692f(String str, String str2, String str3) {
        try {
            return mo35517d(str, str2, str3);
        } catch (Exception unused) {
            this.f15809a.mo35389a(str2, "Unexpected error", "open");
            C6195ic.m18378a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            return false;
        }
    }

    /* renamed from: b */
    private boolean m18690b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C6176hr.m18300a();
        if (!C6176hr.m18301a(this.f15810b, str)) {
            return false;
        }
        m18689b(str2);
        return true;
    }

    /* renamed from: b */
    private static void m18689b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C5820bn.m17365a().mo34792a(str, true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.inmobi.media.C6193ia.m18374b(r4.f15810b, r7);
        r4.f15809a.mo35390b(r5, r6, r7);
        r4.f15809a.mo35387a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35517d(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0044
            java.lang.String r1 = "http"
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto L_0x0012
            boolean r1 = android.webkit.URLUtil.isValidUrl(r7)
            if (r1 != 0) goto L_0x0012
            goto L_0x0044
        L_0x0012:
            android.content.Context r1 = r4.f15810b
            java.lang.String r1 = com.inmobi.media.C6155h.m18219a(r1)
            com.inmobi.media.ht r2 = r4.f15820m     // Catch:{ Exception -> 0x0034 }
            boolean r2 = r2.f15597c     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x002f
            if (r2 != 0) goto L_0x0021
            goto L_0x002f
        L_0x0021:
            com.inmobi.media.cr r1 = new com.inmobi.media.cr     // Catch:{ Exception -> 0x0034 }
            android.content.Context r2 = r4.f15810b     // Catch:{ Exception -> 0x0034 }
            com.inmobi.media.f r3 = r4.f15821n     // Catch:{ Exception -> 0x0034 }
            r1.<init>(r7, r2, r3)     // Catch:{ Exception -> 0x0034 }
            r1.mo34872b()     // Catch:{ Exception -> 0x0034 }
            r5 = 1
            return r5
        L_0x002f:
            boolean r5 = r4.mo35513a(r7)     // Catch:{ Exception -> 0x0034 }
            return r5
        L_0x0034:
            android.content.Context r1 = r4.f15810b     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.C6193ia.m18374b(r1, r7)     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.hs r1 = r4.f15809a     // Catch:{ URISyntaxException -> 0x0043 }
            r1.mo35390b(r5, r6, r7)     // Catch:{ URISyntaxException -> 0x0043 }
            com.inmobi.media.hs r5 = r4.f15809a     // Catch:{ URISyntaxException -> 0x0043 }
            r5.mo35387a()     // Catch:{ URISyntaxException -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            com.inmobi.media.hs r7 = r4.f15809a
            java.lang.String r1 = "Invalid URL"
            r7.mo35389a(r6, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6280m.mo35517d(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean mo35513a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        C6175hq.m18296a();
        if (C6175hq.m18298a(this.f15810b, str) || !C6193ia.m18371a(Uri.parse(str))) {
            return false;
        }
        Intent intent = new Intent(this.f15810b, InMobiAdActivity.class);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
        this.f15809a.mo35388a(intent);
        this.f15809a.mo35390b((String) null, (String) null, str);
        return true;
    }

    /* renamed from: a */
    public final void mo35512a(String str, String str2, String str3, String str4) {
        while (true) {
            try {
                C6193ia.m18374b(this.f15810b, str3);
                mo35518e(str, str2, str3);
                return;
            } catch (URISyntaxException unused) {
                this.f15809a.mo35389a(str2, "Cannot resolve URI (" + m18691c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (ActivityNotFoundException unused2) {
                this.f15809a.mo35389a(str2, "Cannot resolve URI (" + m18691c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (Exception unused3) {
                this.f15809a.mo35389a(str2, "Unexpected error", str);
                C6195ic.m18378a((byte) 1, f15808c, "Could not open URL; SDK encountered an unexpected error");
                return;
            }
            str3 = str4;
            str4 = null;
        }
    }

    /* renamed from: c */
    private static String m18691c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: e */
    public final void mo35518e(String str, String str2, String str3) {
        this.f15809a.mo35387a();
        this.f15809a.mo35390b(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo35511a(String str, String str2) {
        this.f15809a.mo35389a(str2, "Invalid URL", str);
    }
}
