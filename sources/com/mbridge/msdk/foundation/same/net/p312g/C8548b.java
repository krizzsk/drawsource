package com.mbridge.msdk.foundation.same.net.p312g;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.p299a.C8404a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.C8503Aa;
import com.mbridge.msdk.foundation.same.net.C8505a;
import com.mbridge.msdk.foundation.same.net.C8509b;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.C8558l;
import com.mbridge.msdk.foundation.same.net.C8563n;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.b */
/* compiled from: CommonAsyncHttpRequest */
public class C8548b {

    /* renamed from: b */
    private static final String f20979b = C8548b.class.getSimpleName();

    /* renamed from: a */
    protected Context f20980a;

    public C8548b(Context context) {
        if (context == null) {
            this.f20980a = C8388a.m23845e().mo56913g();
        } else {
            this.f20980a = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public void mo16280a(String str, C8550d dVar) {
        if (dVar != null) {
            dVar.mo57981a("open", C8469a.f20760u);
            String a = C8503Aa.m24363a();
            if (a == null) {
                a = "";
            }
            dVar.mo57981a("channel", a);
            dVar.mo57981a("band_width", C8505a.m24367a().mo57915e() + "");
            String str2 = dVar.mo57982b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    dVar.mo57981a("ch_info", customInfoByUnitId);
                }
                C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), str2);
                if (e != null && !TextUtils.isEmpty(e.mo16306a())) {
                    dVar.mo57981a("u_stid", e.mo16306a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo57975a(int i, String str, C8550d dVar, C8532e eVar) {
        m24479b(i, str, dVar, new C8509b(), eVar, false);
    }

    /* renamed from: b */
    public final void mo57977b(int i, String str, C8550d dVar, C8532e eVar) {
        mo57976a(i, str, dVar, new C8509b(), eVar, true);
    }

    /* renamed from: a */
    public final void mo57976a(int i, String str, C8550d dVar, C8558l lVar, C8532e eVar, boolean z) {
        m24479b(i, str, dVar, lVar, eVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24479b(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.p312g.C8550d r16, com.mbridge.msdk.foundation.same.net.C8558l r17, com.mbridge.msdk.foundation.same.net.C8532e r18, boolean r19) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r10 = r18
            if (r16 != 0) goto L_0x0013
            com.mbridge.msdk.foundation.same.net.g.d r0 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x000e }
            r0.<init>()     // Catch:{ Exception -> 0x000e }
            r11 = r13
            r1 = r0
            goto L_0x0016
        L_0x000e:
            r0 = move-exception
            r11 = r13
            r1 = r16
            goto L_0x006e
        L_0x0013:
            r11 = r13
            r1 = r16
        L_0x0016:
            r13.mo16280a(r15, r1)     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.p312g.C8551e.m24500c(r1)     // Catch:{ Exception -> 0x006d }
            java.util.Map r0 = r1.mo57982b()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "sign"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x002d
            r0 = r4
        L_0x002d:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x006d }
            java.lang.String r7 = "ts"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r8.<init>()     // Catch:{ Exception -> 0x006d }
            r8.append(r5)     // Catch:{ Exception -> 0x006d }
            r8.append(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x006d }
            r1.mo57981a(r7, r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "st"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r7.<init>()     // Catch:{ Exception -> 0x006d }
            r7.append(r5)     // Catch:{ Exception -> 0x006d }
            r7.append(r0)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)     // Catch:{ Exception -> 0x006d }
            r1.mo57981a(r4, r0)     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.f.c r0 = com.mbridge.msdk.foundation.same.net.p311f.C8539c.m24459a()     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.k r0 = r0.mo57963a((com.mbridge.msdk.foundation.same.net.p312g.C8550d) r1)     // Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0077
            r10.mo57895a(r0)     // Catch:{ Exception -> 0x006d }
            return
        L_0x006d:
            r0 = move-exception
        L_0x006e:
            java.lang.String r4 = f20979b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r4, r0)
        L_0x0077:
            r12 = r1
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()
            java.lang.String r0 = r0.f20954c
            boolean r0 = r15.contains(r0)
            if (r0 == 0) goto L_0x00ec
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()
            boolean r0 = r0.f20959h
            if (r0 == 0) goto L_0x00ec
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.f20955d     // Catch:{ all -> 0x00bd }
            android.net.Uri r4 = android.net.Uri.parse(r15)     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r5.<init>()     // Catch:{ all -> 0x00bd }
            r5.append(r0)     // Catch:{ all -> 0x00bd }
            r5.append(r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "uri"
            r1.put(r4, r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "data"
            java.lang.String r4 = r12.mo57979a()     // Catch:{ all -> 0x00bd }
            r1.put(r0, r4)     // Catch:{ all -> 0x00bd }
            goto L_0x00c7
        L_0x00bd:
            r0 = move-exception
            java.lang.String r4 = f20979b     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r4, r0)     // Catch:{ all -> 0x00e2 }
        L_0x00c7:
            com.mbridge.msdk.foundation.same.net.m r4 = com.mbridge.msdk.foundation.same.net.C8559m.m24550a()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = r0.f20955d     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e2 }
            int r6 = r0.f20958g     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00e2 }
            r8 = 1
            r9 = r18
            r4.mo58017a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e2 }
            return
        L_0x00e2:
            r0 = move-exception
            java.lang.String r1 = f20979b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x00ec:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r1 = "?"
            r0.append(r1)
            java.lang.String r1 = r12.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r4 = r4.mo56914h()
            com.mbridge.msdk.c.a r1 = r1.mo16294f(r4)
            int r4 = r0.length()
            int r5 = r1.mo16233h()
            if (r4 < r5) goto L_0x0136
            com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()
            java.lang.String r4 = r4.f20954c
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0136
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r17
            r6 = r18
            r1.m24477a((int) r2, (java.lang.String) r3, (com.mbridge.msdk.foundation.same.net.p312g.C8550d) r4, (com.mbridge.msdk.foundation.same.net.C8558l) r5, (com.mbridge.msdk.foundation.same.net.C8532e) r6)
            return
        L_0x0136:
            int r4 = r0.length()
            int r1 = r1.mo16235i()
            if (r4 < r1) goto L_0x014e
            if (r19 == 0) goto L_0x014e
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r17
            r6 = r18
            r1.m24477a((int) r2, (java.lang.String) r3, (com.mbridge.msdk.foundation.same.net.p312g.C8550d) r4, (com.mbridge.msdk.foundation.same.net.C8558l) r5, (com.mbridge.msdk.foundation.same.net.C8532e) r6)
            return
        L_0x014e:
            r1 = 0
            r3 = 0
            if (r2 == 0) goto L_0x0165
            r4 = 1
            if (r2 == r4) goto L_0x015f
            r4 = 2
            if (r2 == r4) goto L_0x0159
            goto L_0x016b
        L_0x0159:
            com.mbridge.msdk.foundation.same.net.d.c r2 = new com.mbridge.msdk.foundation.same.net.d.c
            r2.<init>(r1, r0, r3, r10)
            goto L_0x016a
        L_0x015f:
            com.mbridge.msdk.foundation.same.net.d.d r2 = new com.mbridge.msdk.foundation.same.net.d.d
            r2.<init>(r1, r0, r3, r10)
            goto L_0x016a
        L_0x0165:
            com.mbridge.msdk.foundation.same.net.d.f r2 = new com.mbridge.msdk.foundation.same.net.d.f
            r2.<init>(r1, r0, r3, r10)
        L_0x016a:
            r3 = r2
        L_0x016b:
            if (r3 == 0) goto L_0x017c
            r1 = r17
            r3.mo57988a((com.mbridge.msdk.foundation.same.net.C8558l) r1)
            int r0 = r3.mo57948g()
            r3.mo57996b(r0)
            com.mbridge.msdk.foundation.same.net.C8563n.m24558a((com.mbridge.msdk.foundation.same.net.C8554i) r3)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p312g.C8548b.m24479b(int, java.lang.String, com.mbridge.msdk.foundation.same.net.g.d, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean):void");
    }

    /* renamed from: a */
    public static void m24478a(File file, String str, C8532e eVar) {
        C8563n.m24556a().mo57949a(file, str, eVar);
    }

    /* renamed from: a */
    public final void mo57973a(int i, C8550d dVar, C8532e eVar, String str) {
        mo57974a(i, dVar, eVar, str, (C8558l) new C8509b());
    }

    /* renamed from: a */
    public final void mo57974a(int i, C8550d dVar, C8532e eVar, String str, C8558l lVar) {
        int i2;
        C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
        if (TextUtils.isEmpty(str)) {
            i2 = f.mo16180aD();
        } else {
            i2 = f.mo16179aC();
        }
        String a = C8543d.m24463a().mo57965a(str, i2);
        if (i2 >= 2) {
            if (i2 % 2 == 0) {
                if (dVar == null) {
                    dVar = new C8550d();
                }
                JSONArray b = C8404a.m23901a().mo56965b();
                if (b != null) {
                    String jSONArray = b.toString();
                    int b2 = C8543d.m24463a().mo57968b();
                    if (b2 <= 0 || jSONArray.length() <= b2) {
                        dVar.mo57981a(C8550d.f20985e, jSONArray);
                    } else {
                        mo57978c(i, a, dVar, eVar);
                        return;
                    }
                }
            }
            C8550d dVar2 = dVar;
            if (lVar == null) {
                mo57977b(i, a, dVar2, eVar);
            } else {
                mo57976a(i, a, dVar2, lVar, eVar, true);
            }
        } else if (lVar == null) {
            m24480d(i, a, dVar, eVar);
        } else {
            m24476a(i, a, dVar, eVar, lVar);
        }
    }

    /* renamed from: d */
    private void m24480d(int i, String str, C8550d dVar, C8532e eVar) {
        String str2 = dVar.mo57982b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.mo57981a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        dVar.mo57981a(UserDataStore.STATE, SameMD5.getMD5(currentTimeMillis + str2));
        m24477a(i, str, dVar, (C8558l) new C8509b(), eVar);
    }

    /* renamed from: a */
    private void m24476a(int i, String str, C8550d dVar, C8532e eVar, C8558l lVar) {
        String str2 = dVar.mo57982b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.mo57981a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        dVar.mo57981a(UserDataStore.STATE, SameMD5.getMD5(currentTimeMillis + str2));
        if (lVar != null) {
            m24477a(i, str, dVar, lVar, eVar);
            return;
        }
        m24477a(i, str, dVar, (C8558l) new C8509b(), eVar);
    }

    /* renamed from: c */
    public final void mo57978c(int i, String str, C8550d dVar, C8532e eVar) {
        m24477a(i, str, dVar, (C8558l) new C8509b(), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[SYNTHETIC, Splitter:B:36:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc A[Catch:{ Exception -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24477a(int r16, java.lang.String r17, com.mbridge.msdk.foundation.same.net.p312g.C8550d r18, com.mbridge.msdk.foundation.same.net.C8558l r19, com.mbridge.msdk.foundation.same.net.C8532e r20) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            r9 = r20
            if (r18 != 0) goto L_0x0015
            com.mbridge.msdk.foundation.same.net.g.d r0 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x0010 }
            r0.<init>()     // Catch:{ Exception -> 0x0010 }
            r10 = r15
            r3 = r0
            goto L_0x0018
        L_0x0010:
            r0 = move-exception
            r10 = r15
            r3 = r18
            goto L_0x002f
        L_0x0015:
            r10 = r15
            r3 = r18
        L_0x0018:
            r15.mo16280a(r2, r3)     // Catch:{ Exception -> 0x002e }
            com.mbridge.msdk.foundation.same.net.p312g.C8551e.m24500c(r3)     // Catch:{ Exception -> 0x002e }
            com.mbridge.msdk.foundation.same.net.f.c r0 = com.mbridge.msdk.foundation.same.net.p311f.C8539c.m24459a()     // Catch:{ Exception -> 0x002e }
            com.mbridge.msdk.foundation.same.net.k r0 = r0.mo57963a((com.mbridge.msdk.foundation.same.net.p312g.C8550d) r3)     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x0038
            if (r9 == 0) goto L_0x0038
            r9.mo57895a(r0)     // Catch:{ Exception -> 0x002e }
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            java.lang.String r4 = f20979b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r4, r0)
        L_0x0038:
            r11 = r3
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()
            java.lang.String r0 = r0.f20952a
            boolean r0 = r2.contains(r0)
            r12 = 2
            r13 = 1
            if (r0 == 0) goto L_0x00ed
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r3.mo56914h()
            com.mbridge.msdk.c.a r3 = r0.mo16286b(r3)
            java.lang.String r4 = ""
            r0 = 0
            if (r3 == 0) goto L_0x0093
            int r5 = r3.mo16193ak()
            java.lang.String r6 = r3.mo16178aB()
            java.util.Map r0 = r11.mo57982b()     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = "data"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x007d }
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x007d }
            boolean r0 = com.mbridge.msdk.foundation.same.report.C8598e.m24569a(r3, r7)     // Catch:{ Exception -> 0x007a }
            if (r0 != 0) goto L_0x0078
            return
        L_0x0078:
            r4 = r7
            goto L_0x0081
        L_0x007a:
            r0 = move-exception
            r4 = r7
            goto L_0x007e
        L_0x007d:
            r0 = move-exception
        L_0x007e:
            r0.printStackTrace()
        L_0x0081:
            int r0 = r3.mo16249p()
            java.lang.String r7 = r3.mo16214c()
            java.lang.String r8 = "a_stid"
            r11.mo57981a(r8, r7)
            r14 = r4
            r4 = r0
            r0 = r5
            r5 = r14
            goto L_0x0097
        L_0x0093:
            java.lang.String r6 = "UNKNOWN"
            r5 = r4
            r4 = r0
        L_0x0097:
            java.lang.String r7 = "country_code"
            r11.mo57981a(r7, r6)
            if (r0 != r12) goto L_0x00cc
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00ca }
            if (r0 != 0) goto L_0x00c9
            boolean r0 = com.mbridge.msdk.foundation.same.report.C8598e.m24569a(r3, r5)     // Catch:{ Exception -> 0x00ca }
            if (r0 == 0) goto L_0x00c9
            if (r4 == r13) goto L_0x00af
            r0 = 3
            if (r4 != r0) goto L_0x012e
        L_0x00af:
            com.mbridge.msdk.foundation.same.net.m r3 = com.mbridge.msdk.foundation.same.net.C8559m.m24550a()     // Catch:{ Exception -> 0x00ca }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r4 = r0.f20956e     // Catch:{ Exception -> 0x00ca }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x00ca }
            int r5 = r0.f20957f     // Catch:{ Exception -> 0x00ca }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x00ca }
            r7 = 0
            r8 = r20
            r3.mo58017a(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ca }
        L_0x00c9:
            return
        L_0x00ca:
            r0 = move-exception
            goto L_0x00e9
        L_0x00cc:
            if (r0 != r13) goto L_0x012e
            com.mbridge.msdk.foundation.same.net.m r3 = com.mbridge.msdk.foundation.same.net.C8559m.m24550a()     // Catch:{ Exception -> 0x00ca }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r4 = r0.f20956e     // Catch:{ Exception -> 0x00ca }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x00ca }
            int r5 = r0.f20957f     // Catch:{ Exception -> 0x00ca }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x00ca }
            r7 = 0
            r8 = r20
            r3.mo58017a(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ca }
            return
        L_0x00e9:
            r0.printStackTrace()
            goto L_0x012e
        L_0x00ed:
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()
            java.lang.String r0 = r0.f20965n
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x012e
            if (r11 == 0) goto L_0x0114
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "?"
            r0.append(r2)
            java.lang.String r2 = r11.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0115
        L_0x0114:
            r0 = r2
        L_0x0115:
            com.mbridge.msdk.foundation.db.a.a r2 = com.mbridge.msdk.foundation.p298db.p299a.C8404a.m23901a()
            org.json.JSONArray r2 = r2.mo56965b()
            if (r2 == 0) goto L_0x012f
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.same.net.g.d r11 = new com.mbridge.msdk.foundation.same.net.g.d
            r11.<init>()
            java.lang.String r3 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20985e
            r11.mo57981a(r3, r2)
            goto L_0x012f
        L_0x012e:
            r0 = r2
        L_0x012f:
            r2 = 0
            java.lang.String r3 = "application/x-www-form-urlencoded"
            java.lang.String r4 = "Content-Type"
            if (r1 == 0) goto L_0x0155
            if (r1 == r13) goto L_0x0148
            if (r1 == r12) goto L_0x013b
            goto L_0x0161
        L_0x013b:
            com.mbridge.msdk.foundation.same.net.d.c r2 = new com.mbridge.msdk.foundation.same.net.d.c
            java.lang.String r1 = r11.toString()
            r2.<init>(r13, r0, r1, r9)
            r2.mo57994a((java.lang.String) r4, (java.lang.String) r3)
            goto L_0x0161
        L_0x0148:
            com.mbridge.msdk.foundation.same.net.d.d r2 = new com.mbridge.msdk.foundation.same.net.d.d
            java.lang.String r1 = r11.toString()
            r2.<init>(r13, r0, r1, r9)
            r2.mo57994a((java.lang.String) r4, (java.lang.String) r3)
            goto L_0x0161
        L_0x0155:
            com.mbridge.msdk.foundation.same.net.d.f r2 = new com.mbridge.msdk.foundation.same.net.d.f
            java.lang.String r1 = r11.toString()
            r2.<init>(r13, r0, r1, r9)
            r2.mo57994a((java.lang.String) r4, (java.lang.String) r3)
        L_0x0161:
            if (r2 == 0) goto L_0x016b
            r1 = r19
            r2.mo57988a((com.mbridge.msdk.foundation.same.net.C8558l) r1)
            com.mbridge.msdk.foundation.same.net.C8563n.m24558a((com.mbridge.msdk.foundation.same.net.C8554i) r2)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p312g.C8548b.m24477a(int, java.lang.String, com.mbridge.msdk.foundation.same.net.g.d, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e):void");
    }
}
