package com.mbridge.msdk.mbbanner.common.p325c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbbanner.common.p323a.C8730b;
import com.mbridge.msdk.mbbanner.common.p323a.C8731c;
import com.mbridge.msdk.mbbanner.common.p323a.C8732d;
import com.mbridge.msdk.mbbanner.common.p324b.C8734b;
import com.mbridge.msdk.mbbanner.common.p324b.C8736d;
import com.mbridge.msdk.mbbanner.common.p324b.C8737e;
import com.mbridge.msdk.mbbanner.common.p324b.C8738f;
import com.mbridge.msdk.mbbanner.common.p327e.C8769a;
import com.mbridge.msdk.mbbanner.common.p328f.C8770a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.common.util.C8773a;
import com.mbridge.msdk.videocommon.download.C9652g;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.b */
/* compiled from: BannerLoader */
public class C8750b {

    /* renamed from: a */
    private static final String f21489a = C8750b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f21490b;

    /* renamed from: c */
    private int f21491c = 0;

    /* renamed from: d */
    private C8731c f21492d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8773a f21493e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8734b f21494f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8736d f21495g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f21496h = false;

    /* renamed from: i */
    private Timer f21497i = new Timer();

    /* renamed from: j */
    private volatile List<String> f21498j = new ArrayList();

    /* renamed from: k */
    private volatile boolean f21499k = false;

    /* renamed from: l */
    private volatile boolean f21500l = false;

    /* renamed from: m */
    private volatile boolean f21501m = false;

    public C8750b(Context context, C8731c cVar, C8734b bVar, C8773a aVar) {
        this.f21490b = context.getApplicationContext();
        this.f21492d = cVar;
        this.f21494f = bVar;
        this.f21493e = aVar;
    }

    /* renamed from: a */
    private void m25221a(String str) {
        if (this.f21501m) {
            return;
        }
        if ((this.f21499k || this.f21500l) && this.f21498j.size() == 0) {
            this.f21496h = true;
            this.f21501m = true;
            this.f21497i.cancel();
            this.f21493e.mo58422a(this.f21494f, str);
            this.f21495g.mo58371a(str);
        }
    }

    /* renamed from: a */
    public final void mo58397a(String str, int i, String str2, boolean z) {
        if (!z) {
            this.f21497i.cancel();
            this.f21496h = true;
            this.f21493e.mo58425b(this.f21494f, str);
            this.f21495g.mo58371a(str);
        } else if (i == 1) {
            synchronized (this) {
                this.f21498j.remove(str2);
                if (this.f21498j.size() == 0) {
                    m25221a(str);
                }
            }
        } else if (i == 2) {
            this.f21500l = true;
            m25221a(str);
        } else if (i == 3) {
            this.f21499k = true;
            m25221a(str);
        }
    }

    /* renamed from: a */
    public final void mo58398a(String str, String str2, C8730b bVar, C8736d dVar) {
        boolean z;
        try {
            this.f21495g = dVar;
            C87522 r11 = new C8770a() {
                /* renamed from: a */
                public final void mo58401a(CampaignUnit campaignUnit) {
                    try {
                        C8750b.this.f21493e.mo58421a(C8750b.this.f21494f, campaignUnit, this.f20918d);
                        C8750b.m25220a(C8750b.this, this.f20918d, campaignUnit);
                    } catch (Exception e) {
                        C8750b.this.f21493e.mo58423a(C8750b.this.f21494f, e.getMessage(), this.f20918d);
                        C8750b.this.f21495g.mo58371a(this.f20918d);
                    }
                }

                /* renamed from: a */
                public final void mo58400a(int i, String str) {
                    C8750b.this.f21493e.mo58423a(C8750b.this.f21494f, str, this.f20918d);
                    C8750b.this.f21495g.mo58371a(this.f20918d);
                }
            };
            r11.f20918d = str2;
            r11.f20919e = str;
            r11.f20920f = 296;
            C8769a aVar = new C8769a(this.f21490b);
            this.f21491c = m25225b(str2);
            C8550d a = C8732d.m25156a(false, this.f21490b, str2, this.f21492d.mo58359a(), this.f21491c, bVar);
            String g = C8677z.m24946g(str2);
            if (!TextUtils.isEmpty(g)) {
                a.mo57981a("j", g);
            }
            String c = bVar.mo58357c();
            if (!TextUtils.isEmpty(c)) {
                r11.mo58418a(c);
                z = true;
            } else {
                z = false;
            }
            this.f21493e.mo58424a(z);
            aVar.mo57973a(1, a, (C8532e) r11, c);
        } catch (Exception e) {
            e.printStackTrace();
            this.f21493e.mo58423a(this.f21494f, e.getMessage(), str2);
            this.f21495g.mo58371a(str2);
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m25219a(String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    for (int i = 0; i < ads.size(); i++) {
                        CampaignEx campaignEx = ads.get(i);
                        if (!(campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl())))) {
                            if (C8677z.m24930b(campaignEx)) {
                                campaignEx.setRtinsType(C8677z.m24934c(this.f21490b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (campaignEx.getWtick() != 1) {
                                if (C8677z.m24934c(this.f21490b, campaignEx.getPackageName())) {
                                    if (C8677z.m24930b(campaignEx)) {
                                        arrayList.add(campaignEx);
                                    } else {
                                        C8677z.m24917a(str, campaignEx, C8469a.f20761v);
                                    }
                                }
                            }
                            arrayList.add(campaignEx);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m25222a(String str, List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            for (CampaignEx next : list) {
                if (!TextUtils.isEmpty(next.getImageUrl())) {
                    this.f21498j.add(next.getImageUrl());
                    C8481b.m24310a(this.f21490b).mo57883a(next.getImageUrl(), (C8484c) new C8738f(this, str));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC, Splitter:B:24:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m25218a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x009a
            r0 = 0
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8617ae.m24719a(r8)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch:{ Exception -> 0x005e }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x005e }
            if (r4 == 0) goto L_0x0025
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x005e }
        L_0x0025:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ Exception -> 0x005e }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x005e }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x005e }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x005e }
            r2.getPath()     // Catch:{ Exception -> 0x005e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005e }
            r2.<init>(r4)     // Catch:{ Exception -> 0x005e }
            byte[] r0 = r8.getBytes()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.write(r0)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.flush()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0052:
            r1 = r0
            goto L_0x006c
        L_0x0054:
            r7 = move-exception
            r0 = r2
            goto L_0x008f
        L_0x0057:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x005f
        L_0x005c:
            r7 = move-exception
            goto L_0x008f
        L_0x005e:
            r2 = move-exception
        L_0x005f:
            r2.printStackTrace()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x006c
            r0.close()     // Catch:{ Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006c:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            r3 = 2
            if (r2 == 0) goto L_0x008a
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L_0x008a
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r0 = 1
            r6.mo58397a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008a:
            r0 = 0
            r6.mo58397a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008f:
            if (r0 == 0) goto L_0x0099
            r0.close()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0099:
            throw r7
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p325c.C8750b.m25218a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private int m25225b(String str) {
        try {
            int b = this.f21492d.mo58362b();
            if (b > this.f21492d.mo58363c()) {
                return 0;
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25220a(C8750b bVar, final String str, final CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            bVar.f21493e.mo58423a(bVar.f21494f, "campaignUnit is NULL!", str);
            bVar.f21495g.mo58371a(str);
            return;
        }
        List<CampaignEx> a = bVar.m25219a(str, campaignUnit);
        new Thread(new Runnable() {
            public final void run() {
                C8417j.m23986a((C8412f) C8414g.m23969a(C8750b.this.f21490b)).mo57031b();
                CampaignUnit campaignUnit = campaignUnit;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(C8750b.this.f21490b, campaignUnit.getAds());
                }
            }
        }).start();
        if (a == null || a.size() == 0) {
            bVar.f21493e.mo58423a(bVar.f21494f, "Need show campaign list is NULL!", str);
            bVar.f21495g.mo58371a(str);
            return;
        }
        bVar.f21497i.schedule(new TimerTask() {
            public final void run() {
                if (!C8750b.this.f21496h) {
                    boolean unused = C8750b.this.f21496h = true;
                    C8750b.this.mo58397a(str, -1, "", false);
                }
            }
        }, (long) 60000);
        bVar.f21492d.mo58361a(campaignUnit.getSessionId());
        int i = bVar.f21491c;
        int i2 = 0;
        if (a != null) {
            try {
                if (a.size() > 0) {
                    i += a.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i > bVar.f21492d.mo58363c()) {
            i = 0;
        }
        if (C8616ad.m24718b(str)) {
            bVar.f21492d.mo58360a(i);
        }
        CampaignEx campaignEx = a.get(0);
        String trim = campaignEx.getBannerUrl().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                C9652g.m27539a().mo63669a(trim, new C8737e(bVar, str));
            }
            if (a != null && a.size() > 0) {
                while (i2 < a.size()) {
                    a.get(i2).setBannerUrl(campaignEx.getBannerUrl());
                    a.get(i2).setHasMBTplMark(true);
                    i2++;
                }
            }
        } else {
            String trim2 = campaignEx.getBannerHtml().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a2 = bVar.m25218a(str, trim2);
                if (a != null && a.size() > 0) {
                    while (i2 < a.size()) {
                        a.get(i2).setBannerHtml(a2);
                        a.get(i2).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                        i2++;
                    }
                }
            } else {
                bVar.f21500l = true;
                bVar.f21499k = true;
            }
        }
        bVar.m25222a(str, a);
    }
}
