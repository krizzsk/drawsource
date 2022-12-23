package com.mbridge.msdk.interstitial.p317a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8461f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8538b;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.p318b.C8696a;
import com.mbridge.msdk.interstitial.p319c.C8697a;
import com.mbridge.msdk.interstitial.p320d.C8702a;
import com.mbridge.msdk.interstitial.p320d.C8703b;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.interstitial.a.a */
/* compiled from: IntersAdapter */
public final class C8692a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f21313a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21314b;

    /* renamed from: c */
    private String f21315c;

    /* renamed from: d */
    private int f21316d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f21317e;

    /* renamed from: f */
    private int f21318f;

    /* renamed from: g */
    private String f21319g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8697a.C8699a f21320h;

    /* renamed from: i */
    private C2456d f21321i;

    /* renamed from: j */
    private Handler f21322j;

    public C8692a(Context context, String str, String str2, String str3, boolean z) {
        this.f21313a = context;
        this.f21314b = str;
        this.f21315c = str2;
        this.f21319g = str3;
        this.f21317e = z;
        C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), str);
        this.f21321i = e;
        if (e == null) {
            this.f21321i = C2456d.m6072f(this.f21314b);
        }
        this.f21322j = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                try {
                    int i = message.what;
                    if (i != 3) {
                        if (i == 4) {
                            if (C8692a.this.f21320h != null && message.obj != null && (message.obj instanceof String)) {
                                C8692a.this.f21320h.mo58224b(C8692a.this.f21317e, (String) message.obj);
                            }
                        }
                    } else if (C8692a.this.f21320h != null && message.obj != null && (message.obj instanceof String)) {
                        C8692a.this.f21320h.mo58223a(C8692a.this.f21317e, (String) message.obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public final CampaignEx mo58204a() {
        try {
            if (TextUtils.isEmpty(this.f21314b)) {
                return null;
            }
            m24991e();
            List<CampaignEx> f = m24992f();
            if (f != null) {
                if (f.size() > 0) {
                    for (int i = 0; i < f.size(); i++) {
                        CampaignEx campaignEx = f.get(i);
                        if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                            return campaignEx;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo58206b() {
        if (this.f21313a == null) {
            m24985b("context is null");
        } else if (TextUtils.isEmpty(this.f21314b)) {
            m24985b("unitid is null");
        } else {
            C2456d dVar = this.f21321i;
            if (dVar == null) {
                m24985b("unitSetting is null please call load");
            } else if (dVar.mo16324o() <= 0) {
                m24985b("controller don't request ad");
            } else {
                m24991e();
                List<CampaignEx> f = m24992f();
                String str = "";
                if (f == null || f.size() <= 0) {
                    try {
                        if (this.f21313a == null) {
                            m24985b("context is null");
                        } else if (TextUtils.isEmpty(this.f21314b)) {
                            m24985b("unitid is null");
                        } else if (this.f21321i == null) {
                            m24985b("unitSetting is null please call load");
                        } else {
                            String h = C8388a.m23845e().mo56914h();
                            String md5 = SameMD5.getMD5(C8388a.m23845e().mo56914h() + C8388a.m23845e().mo56916j());
                            int i = this.f21317e ? 3 : 2;
                            this.f21318f = 1;
                            if (this.f21321i.mo16325p() > 0) {
                                this.f21318f = this.f21321i.mo16325p();
                            }
                            int o = this.f21321i.mo16324o() > 0 ? this.f21321i.mo16324o() : 1;
                            String a = C8473d.m24277a(this.f21314b, "interstitial");
                            this.f21316d = m24994h();
                            String j = m24996j();
                            if (TextUtils.isEmpty(this.f21319g)) {
                                this.f21319g = "0";
                            }
                            C8550d dVar2 = new C8550d();
                            C8538b.m24455a(dVar2, "app_id", h);
                            C8538b.m24455a(dVar2, MBridgeConstans.PROPERTIES_UNIT_ID, this.f21314b);
                            if (!TextUtils.isEmpty(this.f21315c)) {
                                C8538b.m24455a(dVar2, MBridgeConstans.PLACEMENT_ID, this.f21315c);
                            }
                            C8538b.m24455a(dVar2, "sign", md5);
                            C8538b.m24455a(dVar2, "category", this.f21319g);
                            C8538b.m24455a(dVar2, "req_type", i + str);
                            C8538b.m24455a(dVar2, "ad_num", o + str);
                            C8538b.m24455a(dVar2, "tnum", this.f21318f + str);
                            C8538b.m24455a(dVar2, "only_impression", "1" + str);
                            C8538b.m24455a(dVar2, "ping_mode", "1");
                            C8538b.m24455a(dVar2, C8550d.f20982b, a);
                            C8538b.m24455a(dVar2, C8550d.f20983c, m24988d());
                            C8538b.m24455a(dVar2, CampaignEx.JSON_KEY_AD_SOURCE_ID, 1 + str);
                            C8538b.m24455a(dVar2, C8550d.f20981a, j);
                            C8538b.m24455a(dVar2, "ad_type", 279 + str);
                            C8538b.m24455a(dVar2, "offset", this.f21316d + str);
                            String g = C8677z.m24946g(this.f21314b);
                            if (!TextUtils.isEmpty(g)) {
                                dVar2.mo57981a("j", g);
                            }
                            C8702a aVar = new C8702a(this.f21313a);
                            C86942 r1 = new C8703b() {
                                /* renamed from: a */
                                public final void mo58210a(CampaignUnit campaignUnit) {
                                    try {
                                        C8692a.m24979a(C8692a.this, campaignUnit);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        C8692a.this.m24985b("can't show because unknow error");
                                        C8692a.this.m24995i();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo58209a(int i, String str) {
                                    C8672v.m24878d("IntersAdapter", str);
                                    C8692a.this.m24985b(str);
                                    C8692a.this.m24995i();
                                }
                            };
                            r1.f20918d = this.f21314b;
                            r1.f20919e = this.f21315c;
                            r1.f20920f = 279;
                            aVar.mo57973a(1, dVar2, (C8532e) r1, str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        m24985b("can't show because unknow error");
                        m24995i();
                    }
                } else {
                    CampaignEx campaignEx = f.get(0);
                    if (campaignEx != null) {
                        str = campaignEx.getRequestId();
                    }
                    m24981a(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24981a(String str) {
        if (this.f21322j != null) {
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 3;
            this.f21322j.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24985b(String str) {
        try {
            if (this.f21322j != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f21322j.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private String m24988d() {
        String str = "";
        try {
            JSONArray a = C8677z.m24914a(this.f21313a, this.f21314b);
            if (a.length() > 0) {
                str = C8677z.m24912a(a);
            }
            C8672v.m24876b("IntersAdapter", "get excludes:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: e */
    private void m24991e() {
        try {
            if (C8696a.m25003a() != null) {
                C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                C8696a.m25003a().mo58213a(b.mo16162Q() * 1000, this.f21314b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private List<CampaignEx> m24992f() {
        try {
            if (C8696a.m25003a() != null) {
                return C8696a.m25003a().mo58212a(this.f21314b, 1);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58205a(C8697a.C8699a aVar) {
        this.f21320h = aVar;
    }

    /* renamed from: a */
    private List<CampaignEx> m24978a(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int p = this.f21321i.mo16325p();
                    int i = 0;
                    while (true) {
                        if (i >= list.size() || i >= this.f21318f) {
                            break;
                        } else if (arrayList.size() >= p) {
                            break;
                        } else {
                            CampaignEx campaignEx = list.get(i);
                            if (campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                if (campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                                    if (C8677z.m24930b(campaignEx)) {
                                        campaignEx.setRtinsType(C8677z.m24934c(this.f21313a, campaignEx.getPackageName()) ? 1 : 2);
                                    }
                                    if (campaignEx.getWtick() != 1) {
                                        if (C8677z.m24934c(this.f21313a, campaignEx.getPackageName())) {
                                            if (C8677z.m24930b(campaignEx)) {
                                                arrayList.add(campaignEx);
                                            } else {
                                                C8677z.m24917a(this.f21314b, campaignEx, C8469a.f20761v);
                                            }
                                        }
                                    }
                                    arrayList.add(campaignEx);
                                }
                            }
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC, Splitter:B:29:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb A[SYNTHETIC, Splitter:B:41:0x00eb] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m24982b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "5"
            java.lang.String r1 = ""
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.size()
            r2.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L_0x0011:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r11.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r4 = r3.isMraid()
            if (r4 == 0) goto L_0x00f4
            java.lang.String r4 = r3.getMraid()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00f4
            r4 = 0
            com.mbridge.msdk.foundation.same.b.c r5 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r5)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C8617ae.m24719a(r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r6)     // Catch:{ Exception -> 0x00ad }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00ad }
            if (r7 == 0) goto L_0x004e
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ad }
        L_0x004e:
            java.lang.String r7 = ".html"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x00ad }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00ad }
            r7.<init>(r5, r6)     // Catch:{ Exception -> 0x00ad }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ad }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.<init>()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.c.b.a r6 = com.mbridge.msdk.p078c.p080b.C2446a.m6038a()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = r6.mo16297b()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            if (r8 != 0) goto L_0x007e
            java.lang.String r8 = "<script>"
            r4.append(r8)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = "</script>"
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
        L_0x007e:
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.write(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.flush()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r3.setMraid(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r10.f21314b     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.foundation.same.report.C8580c.m24604a(r3, r1, r4, r0)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00a3:
            r11 = move-exception
            r4 = r5
            goto L_0x00e9
        L_0x00a6:
            r4 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x00ae
        L_0x00ab:
            r11 = move-exception
            goto L_0x00e9
        L_0x00ad:
            r5 = move-exception
        L_0x00ae:
            r5.printStackTrace()     // Catch:{ all -> 0x00ab }
            r3.setMraid(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r10.f21314b     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.same.report.C8580c.m24604a(r3, r5, r6, r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00c7
            r4.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00c7:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getMraid()
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x00e2
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L_0x00e2
            boolean r4 = r4.canRead()
            if (r4 != 0) goto L_0x00f4
        L_0x00e2:
            java.lang.String r3 = "mraid resource write fail"
            r10.m24985b((java.lang.String) r3)
            goto L_0x0011
        L_0x00e9:
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            throw r11
        L_0x00f4:
            r2.add(r3)
            goto L_0x0011
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p317a.C8692a.m24982b(java.util.List):java.util.List");
    }

    /* renamed from: g */
    private int m24993g() {
        try {
            Map<String, Integer> map = C8697a.f21333d;
            int intValue = (TextUtils.isEmpty(this.f21314b) || map == null || !map.containsKey(this.f21314b)) ? 1 : map.get(this.f21314b).intValue();
            if (intValue <= 0) {
                return 1;
            }
            return intValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* renamed from: h */
    private int m24994h() {
        int i = 0;
        try {
            int a = !TextUtils.isEmpty(this.f21314b) ? C8697a.m25009a(this.f21314b) : 0;
            if (a <= m24993g()) {
                i = a;
            }
            C8672v.m24876b("IntersAdapter", "getCurrentOffset:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m24995i() {
        try {
            if (!TextUtils.isEmpty(this.f21314b)) {
                C8697a.m25014a(this.f21314b, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private String m24996j() {
        try {
            if (!TextUtils.isEmpty(C8697a.f21331a)) {
                return C8697a.f21331a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public final boolean mo58207c() {
        return this.f21317e;
    }

    /* renamed from: a */
    static /* synthetic */ void m24979a(C8692a aVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            aVar.m24985b("no server ads available");
            return;
        }
        final ArrayList<CampaignEx> ads = campaignUnit.getAds();
        final List<CampaignEx> a = aVar.m24978a((List<CampaignEx>) ads);
        if (campaignUnit != null) {
            String sessionId = campaignUnit.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                C8672v.m24876b("IntersAdapter", "onload sessionId:" + sessionId);
                C8697a.f21331a = sessionId;
            }
        }
        try {
            aVar.f21316d += aVar.f21318f;
            if (aVar.f21316d > aVar.m24993g()) {
                aVar.f21316d = 0;
            }
            if (!TextUtils.isEmpty(aVar.f21314b)) {
                C8697a.m25014a(aVar.f21314b, aVar.f21316d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            public final void run() {
                List list = a;
                if (list == null || list.size() <= 0) {
                    C8692a.this.m24985b("no ads available");
                } else {
                    String d = C8692a.this.f21314b;
                    List<CampaignEx> a = C8692a.this.m24982b((List<CampaignEx>) a);
                    if (C8696a.m25003a() != null) {
                        C8696a a2 = C8696a.m25003a();
                        try {
                            if (!TextUtils.isEmpty(d) && a != null && a.size() > 0) {
                                for (CampaignEx b : a) {
                                    a2.mo58216b(b, d);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    CampaignEx campaignEx = (CampaignEx) a.get(0);
                    C8692a.this.m24981a(campaignEx != null ? campaignEx.getRequestId() : "");
                }
                C8417j.m23986a((C8412f) C8414g.m23969a(C8692a.this.f21313a)).mo57031b();
                List list2 = ads;
                if (list2 != null && list2.size() > 0) {
                    C8692a.m24984b(C8692a.this, ads);
                }
            }
        }).start();
    }

    /* renamed from: b */
    static /* synthetic */ void m24984b(C8692a aVar, List list) {
        if (aVar.f21313a != null && list != null && list.size() != 0) {
            C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(aVar.f21313a));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo57029a(campaignEx.getId()))) {
                    C8461f fVar = new C8461f();
                    fVar.mo57724a(campaignEx.getId());
                    fVar.mo57722a(campaignEx.getFca());
                    fVar.mo57726b(campaignEx.getFcb());
                    fVar.mo57730d(0);
                    fVar.mo57728c(0);
                    fVar.mo57723a(System.currentTimeMillis());
                    a.mo57028a(fVar);
                }
            }
        }
    }
}
