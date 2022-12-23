package com.mbridge.msdk.p078c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p307b.C8510a;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8548b;
import com.mbridge.msdk.foundation.same.net.p312g.C8549c;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.p078c.p079a.C2444b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.c */
/* compiled from: SettingRequestController */
public class C2452c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5072a = C2452c.class.getSimpleName();

    /* renamed from: a */
    public final void mo16302a(final Context context, final String str, final String str2) {
        if (context != null) {
            C8550d dVar = new C8550d();
            dVar.mo57981a("app_id", str);
            dVar.mo57981a("sign", SameMD5.getMD5(str + str2));
            if (C8543d.m24463a().f20934E) {
                dVar.mo57981a("st_net", C8543d.m24463a().f20960i + "");
            }
            C24531 r1 = new C8549c() {
                /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|(1:10)) */
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
                    r4.getSharedPreferences("mb_optimization_setting", 0).edit().putInt("use_thread_pool", 0).apply();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x016c, code lost:
                    r10 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x016d, code lost:
                    r10.printStackTrace();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
                    if (r4 != null) goto L_0x002d;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0029 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo16305a(org.json.JSONObject r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = "web_env_url"
                        java.lang.String r1 = "mraid_js"
                        java.lang.String r2 = "hst_st_t"
                        java.lang.String r3 = "hst_st"
                        java.lang.String r4 = "mb_optimization_setting"
                        java.lang.String r5 = "use_thread_pool"
                        if (r10 == 0) goto L_0x0159
                        r6 = 0
                        int r7 = r10.optInt(r5, r6)     // Catch:{ Exception -> 0x0029 }
                        android.content.Context r8 = r4     // Catch:{ Exception -> 0x0029 }
                        if (r8 == 0) goto L_0x003e
                        android.content.Context r8 = r4     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences r8 = r8.getSharedPreferences(r4, r6)     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences$Editor r7 = r8.putInt(r5, r7)     // Catch:{ Exception -> 0x0029 }
                        r7.apply()     // Catch:{ Exception -> 0x0029 }
                        goto L_0x003e
                    L_0x0029:
                        android.content.Context r7 = r4     // Catch:{ Exception -> 0x016c }
                        if (r7 == 0) goto L_0x003e
                        android.content.Context r7 = r4     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences r4 = r7.getSharedPreferences(r4, r6)     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences$Editor r4 = r4.putInt(r5, r6)     // Catch:{ Exception -> 0x016c }
                        r4.apply()     // Catch:{ Exception -> 0x016c }
                    L_0x003e:
                        java.lang.String r4 = "current_time"
                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016c }
                        r10.put(r4, r5)     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        boolean r4 = r4.f20959h     // Catch:{ Exception -> 0x016c }
                        if (r4 == 0) goto L_0x0063
                        java.lang.String r3 = r10.optString(r2)     // Catch:{ Exception -> 0x016c }
                        boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x016c }
                        if (r3 == 0) goto L_0x0076
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r3 = r3.f20955d     // Catch:{ Exception -> 0x016c }
                        r10.put(r2, r3)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0076
                    L_0x0063:
                        java.lang.String r2 = r10.optString(r3)     // Catch:{ Exception -> 0x016c }
                        boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x016c }
                        if (r2 == 0) goto L_0x0076
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20954c     // Catch:{ Exception -> 0x016c }
                        r10.put(r3, r2)     // Catch:{ Exception -> 0x016c }
                    L_0x0076:
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        boolean r2 = r2.f20959h     // Catch:{ Exception -> 0x016c }
                        if (r2 == 0) goto L_0x0085
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20972u     // Catch:{ Exception -> 0x016c }
                        goto L_0x008b
                    L_0x0085:
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20967p     // Catch:{ Exception -> 0x016c }
                    L_0x008b:
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        boolean r3 = r3.f20959h     // Catch:{ all -> 0x00e7 }
                        if (r3 == 0) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        boolean r3 = r3.f20934E     // Catch:{ all -> 0x00e7 }
                        if (r3 == 0) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        int r3 = r3.f20933D     // Catch:{ all -> 0x00e7 }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        java.util.ArrayList<java.lang.String> r4 = r4.f20936G     // Catch:{ all -> 0x00e7 }
                        int r4 = r4.size()     // Catch:{ all -> 0x00e7 }
                        if (r3 >= r4) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        java.util.ArrayList<java.lang.String> r3 = r3.f20936G     // Catch:{ all -> 0x00e7 }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ all -> 0x00e7 }
                        int r4 = r4.f20933D     // Catch:{ all -> 0x00e7 }
                        java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00e7 }
                        boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00e7 }
                        if (r4 != 0) goto L_0x00f3
                        java.lang.String r4 = "http"
                        boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x00e7 }
                        if (r4 != 0) goto L_0x00d5
                        java.lang.String r4 = "https"
                        boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x00e7 }
                        if (r4 == 0) goto L_0x00f3
                    L_0x00d5:
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
                        r4.<init>()     // Catch:{ all -> 0x00e7 }
                        r4.append(r3)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r3 = "/setting"
                        r4.append(r3)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00e7 }
                        goto L_0x00f3
                    L_0x00e7:
                        r3 = move-exception
                        java.lang.String r4 = com.mbridge.msdk.p078c.C2452c.f5072a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r3 = r3.getMessage()     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r4, r3)     // Catch:{ Exception -> 0x016c }
                    L_0x00f3:
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        int r3 = r3.f20960i     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.c.b r4 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r5 = r5     // Catch:{ Exception -> 0x016c }
                        java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x016c }
                        r4.mo16287b(r5, r6)     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x016c }
                        r4.mo57969c()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r4 = r10.optString(r1)     // Catch:{ Exception -> 0x016c }
                        boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x016c }
                        if (r4 != 0) goto L_0x0124
                        com.mbridge.msdk.c.b.a r4 = com.mbridge.msdk.p078c.p080b.C2446a.m6038a()     // Catch:{ Exception -> 0x016c }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r1 = r10.optString(r1)     // Catch:{ Exception -> 0x016c }
                        r4.mo16296a((android.content.Context) r5, (java.lang.String) r1)     // Catch:{ Exception -> 0x016c }
                    L_0x0124:
                        java.lang.String r1 = r10.optString(r0)     // Catch:{ Exception -> 0x016c }
                        boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x016c }
                        if (r1 != 0) goto L_0x013b
                        com.mbridge.msdk.c.b.b r1 = com.mbridge.msdk.p078c.p080b.C2449b.m6046a()     // Catch:{ Exception -> 0x016c }
                        android.content.Context r4 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r10 = r10.optString(r0)     // Catch:{ Exception -> 0x016c }
                        r1.mo16299a((android.content.Context) r4, (java.lang.String) r10)     // Catch:{ Exception -> 0x016c }
                    L_0x013b:
                        com.mbridge.msdk.foundation.same.report.d r10 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ all -> 0x014c }
                        android.content.Context r0 = r4     // Catch:{ all -> 0x014c }
                        r10.<init>(r0)     // Catch:{ all -> 0x014c }
                        r10.mo58060a()     // Catch:{ all -> 0x014c }
                        r0 = 1
                        java.lang.String r1 = ""
                        r10.mo58061a((int) r0, (int) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x014c }
                        goto L_0x0162
                    L_0x014c:
                        r10 = move-exception
                        java.lang.String r0 = com.mbridge.msdk.p078c.C2452c.f5072a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r10 = r10.getMessage()     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r10)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0162
                    L_0x0159:
                        java.lang.String r10 = com.mbridge.msdk.p078c.C2452c.f5072a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r0 = "app setting is null"
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r10, r0)     // Catch:{ Exception -> 0x016c }
                    L_0x0162:
                        com.mbridge.msdk.c.c r10 = com.mbridge.msdk.p078c.C2452c.this     // Catch:{ Exception -> 0x016c }
                        android.content.Context r0 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r1 = r5     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.p078c.C2452c.m6057a((com.mbridge.msdk.p078c.C2452c) r10, (android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0170
                    L_0x016c:
                        r10 = move-exception
                        r10.printStackTrace()
                    L_0x0170:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p078c.C2452c.C24531.mo16305a(org.json.JSONObject):void");
                }

                /* renamed from: a */
                public final void mo16304a(String str) {
                    String str2 = C8543d.m24463a().f20959h ? C8543d.m24463a().f20972u : C8543d.m24463a().f20967p;
                    try {
                        if (C8543d.m24463a().f20959h && C8543d.m24463a().f20934E && C8543d.m24463a().f20933D < C8543d.m24463a().f20936G.size()) {
                            String str3 = C8543d.m24463a().f20936G.get(C8543d.m24463a().f20933D);
                            if (!TextUtils.isEmpty(str3) && (str3.startsWith("http") || str3.startsWith("https"))) {
                                str2 = str3 + "/setting";
                            }
                        }
                    } catch (Throwable th) {
                        C8672v.m24878d(C2452c.f5072a, th.getMessage());
                    }
                    int i = C8543d.m24463a().f20960i;
                    if (!C8543d.m24463a().f20959h) {
                        C8543d.m24463a().f20932C++;
                    } else {
                        C8543d.m24463a().f20933D++;
                    }
                    C2452c.this.m6059b(context, str, str2);
                    try {
                        C8582d dVar = new C8582d(context);
                        dVar.mo58060a();
                        dVar.mo58061a(2, i, str, str2);
                    } catch (Throwable th2) {
                        C8672v.m24878d(C2452c.f5072a, th2.getMessage());
                    }
                    C8672v.m24878d(C2452c.f5072a, "get app setting error" + str);
                }
            };
            C2444b bVar = new C2444b(context);
            String str3 = C8543d.m24463a().f20967p;
            try {
                if (C8543d.m24463a().f20959h && C8543d.m24463a().f20934E && C8543d.m24463a().f20933D < C8543d.m24463a().f20936G.size()) {
                    String str4 = C8543d.m24463a().f20936G.get(C8543d.m24463a().f20933D);
                    if (!TextUtils.isEmpty(str4) && (str4.startsWith("http") || str4.startsWith("https"))) {
                        str3 = str4 + "/setting";
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(f5072a, th.getMessage());
            }
            bVar.mo57975a(1, str3, dVar, (C8532e) r1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6059b(final Context context, final String str, final String str2) {
        if (!C8543d.m24463a().mo57970d()) {
            try {
                if (!C8543d.m24463a().f20934E) {
                    C8543d.m24463a().f20934E = true;
                    if (System.currentTimeMillis() >= C2461a.m6124a().mo16385a("mkey_spare_host_ts").longValue() + 86400000) {
                        String b = C2461a.m6124a().mo16390b("mkey_spare_host");
                        if (!TextUtils.isEmpty(b)) {
                            for (String str3 : b.split("\n")) {
                                if (!TextUtils.isEmpty(str3.trim()) && !C8543d.m24463a().f20935F.contains(str3.trim())) {
                                    C8543d.m24463a().f20935F.add(str3.trim());
                                    C8543d.m24463a().f20936G.add(str3.trim());
                                }
                            }
                            m6059b(context, str, str2);
                            return;
                        }
                    }
                    new C8548b(context.getApplicationContext()).mo57975a(0, C8543d.m24463a().f20931B, new C8550d(), (C8532e) new C8510a() {
                        /* renamed from: a */
                        public final void mo16125a(String str) {
                            C8672v.m24874a(C2452c.f5072a, "fetch CNDSettingHost success, content = " + str);
                            if (!TextUtils.isEmpty(str)) {
                                C2461a.m6124a().mo16387a("mkey_spare_host_ts", System.currentTimeMillis());
                                C2461a.m6124a().mo16388a("mkey_spare_host", str);
                                for (String str2 : str.split("\n")) {
                                    if (!TextUtils.isEmpty(str2.trim()) && !C8543d.m24463a().f20935F.contains(str2.trim())) {
                                        C8543d.m24463a().f20935F.add(str2.trim());
                                        C8543d.m24463a().f20936G.add(str2.trim());
                                    }
                                }
                                C2452c.this.m6059b(context, str, str2);
                            }
                        }

                        /* renamed from: b */
                        public final void mo16126b(String str) {
                            C8543d.m24463a().f20934E = false;
                            String a = C2452c.f5072a;
                            C8672v.m24874a(a, "fetch CNDSettingHost failed, errorCode = " + str);
                        }
                    });
                }
            } catch (Throwable th) {
                C8543d.m24463a().f20934E = false;
                C8672v.m24878d(f5072a, th.getMessage());
            }
        } else {
            mo16302a(context, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo16303a(final Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = C8388a.m23845e().mo56914h();
            str2 = C8388a.m23845e().mo56916j();
        }
        if (C2445b.m6020a().mo16284a(str3, str) && C2445b.m6020a().mo16283a(str, 2, str3)) {
            C8550d dVar = new C8550d();
            dVar.mo57981a("unit_ids", "[" + str3 + "]");
            dVar.mo57981a("app_id", str);
            dVar.mo57981a("sign", SameMD5.getMD5(str + str2));
            new C2444b(context).mo57975a(1, C8543d.m24463a().f20967p, dVar, (C8532e) new C8549c() {
                /* renamed from: a */
                public final void mo16305a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                                optJSONObject.put("current_time", System.currentTimeMillis());
                                C2445b.m6020a().mo16281a(str, str3, optJSONObject.toString());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        C8672v.m24878d(C2452c.f5072a, "UNIT SETTING IS NULL");
                    }
                    try {
                        new C8582d(context).mo58061a(1, C8543d.m24463a().f20960i, "", C8543d.m24463a().f20959h ? C8543d.m24463a().f20972u : C8543d.m24463a().f20967p);
                    } catch (Throwable th) {
                        C8672v.m24878d(C2452c.f5072a, th.getMessage());
                    }
                }

                /* renamed from: a */
                public final void mo16304a(String str) {
                    try {
                        new C8582d(context).mo58061a(2, C8543d.m24463a().f20960i, str, C8543d.m24463a().f20959h ? C8543d.m24463a().f20972u : C8543d.m24463a().f20967p);
                    } catch (Throwable th) {
                        C8672v.m24878d(C2452c.f5072a, th.getMessage());
                    }
                    String a = C2452c.f5072a;
                    C8672v.m24878d(a, "GET UNITID SETTING ERROR" + str);
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6057a(C2452c cVar, Context context, String str) {
        C2440a b;
        C2445b a = C2445b.m6020a();
        if (!(a == null || (b = a.mo16286b(str)) == null)) {
            MBridgeConstans.OMID_JS_SERVICE_URL = b.mo16201as();
            MBridgeConstans.OMID_JS_H5_URL = b.mo16200ar();
        }
        C2427b.m5859a(context);
        C2427b.m5861b(context);
    }
}
