package com.inmobi.media;

import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;

/* renamed from: com.inmobi.media.cp */
/* compiled from: AdNetworkRequest */
public final class C5876cp extends C6156ha {

    /* renamed from: u */
    private static final String f14837u = C5876cp.class.getSimpleName();

    /* renamed from: w */
    private static String f14838w;

    /* renamed from: x */
    private static Map<String, String> f14839x = null;

    /* renamed from: a */
    public String f14840a;

    /* renamed from: b */
    public String f14841b;

    /* renamed from: c */
    public String f14842c;

    /* renamed from: d */
    public Map<String, String> f14843d;

    /* renamed from: e */
    public ASRequestParams f14844e;

    /* renamed from: v */
    private C5791bc f14845v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5876cp(java.lang.String r8, com.inmobi.media.C6236ja r9, java.lang.String r10, com.inmobi.media.C5791bc r11) {
        /*
            r7 = this;
            java.lang.String r0 = f14838w
            if (r0 != 0) goto L_0x0006
            r3 = r8
            goto L_0x0007
        L_0x0006:
            r3 = r0
        L_0x0007:
            f14838w = r3
            r5 = 0
            java.lang.String r2 = "POST"
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r8 = "json"
            r7.f14840a = r8
            r7.f14845v = r11
            java.lang.String r8 = com.inmobi.media.C6183hw.m18332f()
            r7.f15538s = r8
            java.util.Map r8 = r7.f15527h
            java.util.Map r9 = com.inmobi.media.C6215il.m18451c()
            r8.putAll(r9)
            java.util.Map r8 = r7.f15527h
            com.inmobi.media.ii r9 = com.inmobi.media.C6205ii.m18418a()
            java.lang.String r9 = r9.f15655b
            java.lang.String r11 = "u-appIS"
            r8.put(r11, r9)
            java.util.Map r8 = r7.f15527h
            com.inmobi.media.bc r9 = r7.f14845v
            java.lang.String r9 = r9.mo34735o()
            java.lang.String r11 = "client-request-id"
            r8.put(r11, r9)
            if (r10 == 0) goto L_0x004b
            java.util.Map r8 = r7.f15527h
            java.lang.String r9 = "u-appcache"
            r8.put(r9, r10)
        L_0x004b:
            java.util.Map r8 = r7.f15527h
            java.lang.String r9 = "sdk-flavor"
            java.lang.String r10 = "row"
            r8.put(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5876cp.<init>(java.lang.String, com.inmobi.media.ja, java.lang.String, com.inmobi.media.bc):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0267  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34869a() {
        /*
            r11 = this;
            super.mo34869a()
            com.inmobi.media.cl r0 = com.inmobi.media.C6273ju.m18658a()
            java.lang.String r1 = r0.f14830a
            if (r1 == 0) goto L_0x0014
            java.util.Map r1 = r11.f15527h
            java.lang.String r2 = r0.f14830a
            java.lang.String r3 = "ufid"
            r1.put(r3, r2)
        L_0x0014:
            java.util.Map r1 = r11.f15527h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = r0.f14831b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "is-unifid-service-used"
            r1.put(r2, r0)
            java.util.Map r0 = r11.f15527h
            java.lang.String r1 = r11.f14840a
            java.lang.String r2 = "format"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f15527h
            java.lang.String r1 = r11.f14841b
            java.lang.String r2 = "adtype"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.jd r1 = com.inmobi.media.C6240jd.m18548a()
            java.util.HashMap r1 = r1.mo35468d()
            r0.putAll(r1)
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.jd r1 = com.inmobi.media.C6240jd.m18548a()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = com.inmobi.media.C6240jd.m18552c()
            java.lang.String r4 = "DENIED"
            if (r3 == 0) goto L_0x0063
            boolean r1 = r1.mo35469e()
            if (r1 == 0) goto L_0x0063
            java.lang.String r4 = "AUTHORISED"
        L_0x0063:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r4.toLowerCase(r1)
            java.lang.String r3 = "loc-consent-status"
            r2.put(r3, r1)
            r0.putAll(r2)
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.C6246jf.m18571a()
            java.lang.String r1 = com.inmobi.media.C6183hw.m18341m()
            com.inmobi.media.jm r2 = com.inmobi.media.C6258jo.m18615c()
            r3 = 0
            if (r2 == 0) goto L_0x0086
            java.lang.String r4 = r2.mo35486e()
            goto L_0x0087
        L_0x0086:
            r4 = r3
        L_0x0087:
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0093
            boolean r7 = r2.mo35485d()
            if (r7 == 0) goto L_0x0093
            r7 = r6
            goto L_0x0094
        L_0x0093:
            r7 = r5
        L_0x0094:
            if (r1 == 0) goto L_0x00a3
            com.inmobi.media.gh$b r1 = com.inmobi.media.C6246jf.m18570a(r1)
            com.inmobi.media.gh$d r1 = r1.f15439w
            boolean r1 = r1.cwe
            if (r1 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r1 = r5
            goto L_0x00a4
        L_0x00a3:
            r1 = r6
        L_0x00a4:
            if (r4 == 0) goto L_0x00af
            boolean r2 = r2.mo35483b()
            if (r2 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r2 = r5
            goto L_0x00b0
        L_0x00af:
            r2 = r6
        L_0x00b0:
            if (r7 == 0) goto L_0x00bf
            com.inmobi.media.gh$b r4 = com.inmobi.media.C6246jf.m18570a(r4)
            com.inmobi.media.gh$d r4 = r4.f15439w
            boolean r4 = r4.cwe
            if (r4 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r4 = r5
            goto L_0x00c0
        L_0x00bf:
            r4 = r6
        L_0x00c0:
            if (r1 == 0) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            if (r4 == 0) goto L_0x00c8
            r1 = r6
            goto L_0x00c9
        L_0x00c8:
            r1 = r5
        L_0x00c9:
            r2 = 29
            if (r1 == 0) goto L_0x010e
            boolean r1 = com.inmobi.media.C6183hw.m18318a()
            if (r1 == 0) goto L_0x00f2
            android.content.Context r1 = com.inmobi.media.C6183hw.m18324c()
            java.lang.String r4 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.inmobi.media.C6197ie.m18393a(r1, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r2) goto L_0x00e2
            goto L_0x00f3
        L_0x00e2:
            android.content.Context r4 = com.inmobi.media.C6183hw.m18324c()
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = com.inmobi.media.C6197ie.m18393a(r4, r7)
            if (r1 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00f2
            r1 = r6
            goto L_0x00f3
        L_0x00f2:
            r1 = r5
        L_0x00f3:
            if (r1 != 0) goto L_0x00f6
            goto L_0x010e
        L_0x00f6:
            com.inmobi.media.C6246jf.m18571a()
            com.inmobi.media.gh$b r1 = com.inmobi.media.C6246jf.m18573e()
            com.inmobi.media.gh$d r1 = r1.f15439w
            int r1 = r1.f15440wf
            boolean r4 = com.inmobi.media.C6252jk.m18593a((int) r1)
            boolean r1 = com.inmobi.media.C6252jk.m18594a((int) r1, (int) r6)
            com.inmobi.media.jj r1 = com.inmobi.media.C6252jk.m18592a((boolean) r4, (boolean) r1)
            goto L_0x010f
        L_0x010e:
            r1 = r3
        L_0x010f:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r1 == 0) goto L_0x0121
            long r7 = r1.f15750a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "c-ap-bssid"
            r4.put(r7, r1)
        L_0x0121:
            r0.putAll(r4)
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.C6246jf.m18571a()
            boolean r1 = com.inmobi.media.C6246jf.m18576h()
            if (r1 == 0) goto L_0x0136
            java.util.List r1 = com.inmobi.media.C6253jl.m18599b()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L_0x0137
        L_0x0136:
            r1 = r3
        L_0x0137:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r1 == 0) goto L_0x015a
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x015a
            int r7 = r1.size()
            int r7 = r7 - r6
            java.lang.Object r1 = r1.get(r7)
            com.inmobi.media.jj r1 = (com.inmobi.media.C6251jj) r1
            long r7 = r1.f15750a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "v-ap-bssid"
            r4.put(r7, r1)
        L_0x015a:
            r0.putAll(r4)
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.bc r1 = r11.f14845v
            java.lang.String r1 = r1.mo34715a()
            java.util.Map r1 = com.inmobi.media.C6250ji.m18585a((java.lang.String) r1)
            r0.putAll(r1)
            java.util.Map r0 = r11.f15527h
            java.util.Map r1 = com.inmobi.media.C6250ji.m18584a()
            r0.putAll(r1)
            java.util.Map r0 = r11.f15527h
            java.util.Map r1 = com.inmobi.media.C6250ji.m18587b()
            r0.putAll(r1)
            java.lang.String r0 = r11.f14842c
            if (r0 == 0) goto L_0x018b
            java.util.Map r0 = r11.f15527h
            java.lang.String r1 = r11.f14842c
            java.lang.String r4 = "p-keywords"
            r0.put(r4, r1)
        L_0x018b:
            com.inmobi.media.bc r0 = r11.f14845v
            java.lang.String r0 = r0.mo34734n()
            java.lang.String r1 = "M10N_CONTEXT_ACTIVITY"
            if (r0 == 0) goto L_0x01a5
            com.inmobi.media.bc r0 = r11.f14845v
            java.lang.String r0 = r0.mo34734n()
            java.lang.String r4 = "others"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r1 = "M10N_CONTEXT_OTHER"
        L_0x01a5:
            java.util.Map r0 = r11.f15527h
            java.lang.String r4 = "m10n_context"
            r0.put(r4, r1)
            com.inmobi.media.bc r0 = r11.f14845v
            java.util.Map r0 = r0.mo34720c()
            if (r0 == 0) goto L_0x01ec
            com.inmobi.media.bc r0 = r11.f14845v
            java.util.Map r0 = r0.mo34720c()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ec
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Map r4 = r11.f15527h
            java.lang.Object r7 = r1.getKey()
            boolean r4 = r4.containsKey(r7)
            if (r4 != 0) goto L_0x01c2
            java.util.Map r4 = r11.f15527h
            java.lang.Object r7 = r1.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.put(r7, r1)
            goto L_0x01c2
        L_0x01ec:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f14843d
            if (r0 == 0) goto L_0x01f7
            java.util.Map r0 = r11.f15527h
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.f14843d
            r0.putAll(r1)
        L_0x01f7:
            com.inmobi.media.bc r0 = r11.f14845v
            long r0 = r0.mo34730j()
            r7 = -9223372036854775808
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0214
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.bc r1 = r11.f14845v
            long r9 = r1.mo34730j()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "im-plid"
            r0.put(r4, r1)
        L_0x0214:
            com.inmobi.media.bc r0 = r11.f14845v
            long r0 = r0.mo34729i()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x022f
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.bc r1 = r11.f14845v
            long r9 = r1.mo34729i()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "as-plid"
            r0.put(r4, r1)
        L_0x022f:
            java.util.Map r0 = r11.f15527h
            com.inmobi.media.bc r1 = r11.f14845v
            java.lang.String r1 = r1.mo34717b()
            java.lang.String r4 = "int-origin"
            r0.put(r4, r1)
            java.lang.String r0 = r11.f15538s
            java.lang.String r1 = "signals"
            com.inmobi.media.fu r0 = com.inmobi.media.C6094fv.m18084a(r1, r0, r3)
            com.inmobi.media.gh r0 = (com.inmobi.media.C6120gh) r0
            org.json.JSONObject r0 = r0.ext
            if (r0 == 0) goto L_0x025b
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x025b
            java.util.Map r1 = r11.f15527h
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "im-ext"
            r1.put(r4, r0)
        L_0x025b:
            java.util.Map r0 = r11.f15527h
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14844e
            if (r1 == 0) goto L_0x0267
            boolean r1 = r1.f16035e
            if (r1 == 0) goto L_0x0267
            r1 = r6
            goto L_0x0268
        L_0x0267:
            r1 = r5
        L_0x0268:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "has-dynamic-mediation"
            r0.put(r4, r1)
            com.inmobi.media.bc r0 = r11.f14845v
            long r0 = r0.mo34729i()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0290
            com.inmobi.media.jm r0 = com.inmobi.media.C6258jo.m18615c()
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = r0.mo35488g()
            goto L_0x0287
        L_0x0286:
            r0 = r3
        L_0x0287:
            if (r0 == 0) goto L_0x0290
            java.util.Map r1 = r11.f15527h
            java.lang.String r4 = "as-ext"
            r1.put(r4, r0)
        L_0x0290:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f14844e
            if (r0 == 0) goto L_0x02df
            java.lang.String r0 = r0.f16032b
            if (r0 == 0) goto L_0x02a3
            java.util.Map r0 = r11.f15527h
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14844e
            java.lang.String r1 = r1.f16032b
            java.lang.String r4 = "a9_params"
            r0.put(r4, r1)
        L_0x02a3:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f14844e
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f16033c
            if (r0 == 0) goto L_0x02bd
            java.util.Map r0 = r11.f15527h
            org.json.JSONObject r1 = new org.json.JSONObject
            com.inmobi.unification.sdk.model.ASRequestParams r4 = r11.f14844e
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f16033c
            r1.<init>(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "bid-tokens"
            r0.put(r4, r1)
        L_0x02bd:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f14844e
            java.lang.String r0 = r0.f16031a
            if (r0 == 0) goto L_0x02ce
            java.util.Map r0 = r11.f15527h
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14844e
            java.lang.String r1 = r1.f16031a
            java.lang.String r4 = "publisher_keys"
            r0.put(r4, r1)
        L_0x02ce:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f14844e
            java.lang.String r0 = r0.f16034d
            if (r0 == 0) goto L_0x02df
            java.util.Map r0 = r11.f15527h
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14844e
            java.lang.String r1 = r1.f16034d
            java.lang.String r4 = "vc_user_id"
            r0.put(r4, r1)
        L_0x02df:
            java.util.Map<java.lang.String, java.lang.String> r0 = f14839x
            if (r0 == 0) goto L_0x02e6
            r11.mo35338a((java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x02e6:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x02f7
            java.lang.String r0 = com.inmobi.media.C6215il.m18452d()
            if (r0 == 0) goto L_0x02f7
            java.util.Map r1 = r11.f15527h
            java.lang.String r2 = "d-device-gesture-margins"
            r1.put(r2, r0)
        L_0x02f7:
            java.util.Map r0 = r11.f15527h
            java.lang.String r1 = r11.f15538s
            java.lang.String r2 = "ads"
            com.inmobi.media.fu r1 = com.inmobi.media.C6094fv.m18084a(r2, r1, r3)
            com.inmobi.media.ft r1 = (com.inmobi.media.C6074ft) r1
            if (r1 == 0) goto L_0x030b
            boolean r1 = r1.cctEnabled
            if (r1 == 0) goto L_0x030b
            r1 = r6
            goto L_0x030c
        L_0x030b:
            r1 = r5
        L_0x030c:
            if (r1 == 0) goto L_0x0319
            android.content.Context r1 = com.inmobi.media.C6183hw.m18324c()
            java.lang.String r1 = com.inmobi.media.C6155h.m18219a(r1)
            if (r1 == 0) goto L_0x0319
            r5 = r6
        L_0x0319:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "cct-enabled"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f15527h
            java.util.HashMap r1 = com.inmobi.media.C6221ip.m18481d()
            r0.putAll(r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18430c()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18431d()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18432e()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18433f()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18434g()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18435h()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18436i()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18437j()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18438k()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18439l()
            m18221a(r0, r1)
            java.util.Map r0 = r11.f15527h
            androidx.core.util.Pair r1 = com.inmobi.media.C6210ik.m18440m()
            m18221a(r0, r1)
            com.inmobi.media.ij r0 = com.inmobi.media.C6207ij.C6209a.f15663a
            java.util.Map r1 = r11.f15527h
            r0.mo35426a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5876cp.mo34869a():void");
    }
}
