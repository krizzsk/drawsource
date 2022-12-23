package com.applovin.impl.sdk.p053e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1954j;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.i */
public class C1905i extends C1887a {

    /* renamed from: a */
    private static final AtomicBoolean f3528a = new AtomicBoolean();

    /* renamed from: c */
    private final int f3529c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f3530d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1907a f3531e;

    /* renamed from: com.applovin.impl.sdk.e.i$a */
    public interface C1907a {
        /* renamed from: a */
        void mo14420a(JSONObject jSONObject);
    }

    /* renamed from: com.applovin.impl.sdk.e.i$b */
    private class C1908b extends C1887a {
        public C1908b(C1969m mVar) {
            super("TaskTimeoutFetchBasicSettings", mVar, true);
        }

        public void run() {
            synchronized (C1905i.this.f3530d) {
                if (C1905i.this.f3531e != null) {
                    if (C2102v.m5104a()) {
                        mo14370d("Timing out fetch basic settings...");
                    }
                    C1905i.this.m4274a(new JSONObject());
                }
            }
        }
    }

    public C1905i(int i, C1969m mVar, C1907a aVar) {
        super("TaskFetchBasicSettings", mVar, true);
        this.f3529c = i;
        this.f3531e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4274a(JSONObject jSONObject) {
        synchronized (this.f3530d) {
            if (this.f3531e != null) {
                this.f3531e.mo14420a(jSONObject);
                this.f3531e = null;
            }
        }
    }

    /* renamed from: c */
    private String m4276c() {
        return C2050h.m4951a((String) this.f3496b.mo14534a(C1867b.f3115aP), "5.0/i", mo14369d());
    }

    /* renamed from: h */
    private String m4277h() {
        return C2050h.m4951a((String) this.f3496b.mo14534a(C1867b.f3116aQ), "5.0/i", mo14369d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14415a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f3496b.mo14534a(C1867b.f3348ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3496b.mo14597z());
        }
        Boolean a = C1954j.m4423b().mo14489a(mo14372f());
        if (a != null) {
            hashMap.put("huc", a.toString());
        }
        Boolean a2 = C1954j.m4418a().mo14489a(mo14372f());
        if (a2 != null) {
            hashMap.put("aru", a2.toString());
        }
        Boolean a3 = C1954j.m4425c().mo14489a(mo14372f());
        if (a3 != null) {
            hashMap.put("dns", a3.toString());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|(1:4)|5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)|17|(1:21)|22|(1:24)|25|26|(1:28)|29|30|(1:32)|33|(1:37)|38|(1:41)|42|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x01cc */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01dc A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0250 A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026b A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0286 A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x029d A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02b2 A[Catch:{ JSONException -> 0x02cc }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo14416b() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "screen_size_in"
            java.lang.String r2 = "is_tablet"
            java.lang.String r3 = "revision"
            java.lang.String r4 = "model"
            java.lang.String r5 = "hardware"
            java.lang.String r6 = "brand_name"
            java.lang.String r7 = "brand"
            java.lang.String r8 = "locale"
            java.lang.String r9 = "os"
            java.lang.String r10 = "platform"
            java.lang.String r11 = "target_sdk"
            java.lang.String r12 = "tg"
            java.lang.String r13 = "debug"
            java.lang.String r14 = "test_ads"
            java.lang.String r15 = "app_version"
            r16 = r0
            java.lang.String r0 = "package_name"
            r17 = r2
            java.lang.String r2 = "IABTCF_TCString"
            r18 = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r19 = r4
            java.lang.String r4 = "sdk_version"
            r20 = r5
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "is_cross_promo"
            com.applovin.impl.sdk.m r5 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            boolean r5 = r5.mo14575e()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "init_count"
            int r5 = r1.f3529c     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "server_installed_at"
            com.applovin.impl.sdk.m r5 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            r21 = r6
            com.applovin.impl.sdk.c.b<java.lang.String> r6 = com.applovin.impl.sdk.p051c.C1867b.f3131af     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r5 = r5.mo14534a(r6)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = com.applovin.impl.sdk.utils.Utils.getUserEngagementSdkVersion()     // Catch:{ JSONException -> 0x02cc }
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = "ue_sdk_version"
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x006a:
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            boolean r4 = r4.mo14523P()     // Catch:{ JSONException -> 0x02cc }
            r5 = 1
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = "first_install"
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x0078:
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            boolean r4 = r4.mo14524Q()     // Catch:{ JSONException -> 0x02cc }
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = "first_install_v2"
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x0085:
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.String> r6 = com.applovin.impl.sdk.p051c.C1867b.f3308dz     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r4 = r4.mo14534a(r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x02cc }
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r6 == 0) goto L_0x009a
            java.lang.String r6 = "plugin_version"
            r3.put(r6, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x009a:
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = r4.mo14590t()     // Catch:{ JSONException -> 0x02cc }
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r6 == 0) goto L_0x00ab
            java.lang.String r6 = "mediation_provider"
            r3.put(r6, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x00ab:
            java.lang.String r4 = "installed_mediation_adapters"
            com.applovin.impl.sdk.m r6 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            org.json.JSONArray r6 = com.applovin.impl.mediation.p035d.C1655c.m3371a((com.applovin.impl.sdk.C1969m) r6)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r4 = r4.mo14529V()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r4 = r4.mo14829h()     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r6 = r4.get(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r15)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r15, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r14)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r14, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r13)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r13, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r12)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r12, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r11, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinSdkSettings r0 = r0.mo14586p()     // Catch:{ JSONException -> 0x02cc }
            java.util.List r0 = r0.getInitializationAdUnitIds()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x010d
            int r6 = r0.size()     // Catch:{ JSONException -> 0x02cc }
            if (r6 <= 0) goto L_0x010d
            java.util.List r0 = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r6 = "ad_unit_ids"
            int r11 = r0.size()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = com.applovin.impl.sdk.utils.CollectionUtils.implode(r0, r11)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x010d:
            java.lang.Object r0 = r4.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = "IABTCF_gdprApplies"
            java.lang.Object r0 = r4.get(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14529V()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r0 = r0.mo14823b()     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r10, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r9, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r8, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r7, r2)     // Catch:{ JSONException -> 0x02cc }
            r2 = r21
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r20
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r19
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r18
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r17
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p051c.C1867b.f3265dI     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14534a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "mtl"
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.y r2 = r2.mo14554ad()     // Catch:{ JSONException -> 0x02cc }
            int r2 = r2.mo15026b()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0198:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ all -> 0x01cc }
            android.content.Context r0 = r0.mo14520L()     // Catch:{ all -> 0x01cc }
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x01cc }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x01cc }
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x01cc }
            r2.<init>()     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x01cc
            r0.getMemoryInfo(r2)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "fm"
            long r6 = r2.availMem     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "tm"
            long r6 = r2.totalMem     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "lmt"
            long r6 = r2.threshold     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "lm"
            boolean r2 = r2.lowMemory     // Catch:{ all -> 0x01cc }
            r3.put(r0, r2)     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.AppLovinTargetingDataImpl r0 = r0.mo14588r()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r0 = r0.getAllData()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x02cc }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = "targeting_data"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02cc }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x01e6:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14529V()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o$a r0 = r0.mo14832k()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "dnt"
            boolean r4 = r0.f3940a     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r4 = com.applovin.impl.sdk.p051c.C1867b.f3306dx     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r2.mo14534a(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = r0.f3941b     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = "idfa"
            java.lang.String r0 = r0.f3941b     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x0216:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14529V()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o$b r0 = r0.mo14833l()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r4 = com.applovin.impl.sdk.p051c.C1867b.f3299dq     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r2.mo14534a(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0240
            if (r0 == 0) goto L_0x0240
            java.lang.String r2 = "idfv"
            java.lang.String r4 = r0.f3942a     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.f3943b     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x0240:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.mo14587q()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x025b
            java.lang.String r2 = "user_segment_name"
            com.applovin.impl.sdk.m r4 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(r0, r4)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x025b:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p051c.C1867b.f3302dt     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14534a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "compass_random_token"
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = r2.mo14584n()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0276:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p051c.C1867b.f3304dv     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14534a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0291
            java.lang.String r0 = "applovin_random_token"
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = r2.mo14585o()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0291:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.mediation.debugger.ui.testmode.b r0 = r0.mo14518J()     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.mo13806a()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x02a2
            java.lang.String r0 = "test_mode"
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x02a2:
            com.applovin.impl.sdk.m r0 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.mediation.debugger.ui.testmode.b r0 = r0.mo14518J()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = r0.mo13809c()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x02b7
            java.lang.String r2 = "test_mode_network"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x02b7:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3496b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinSdkSettings r2 = r2.mo14586p()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r2 = r2.getExtraParameters()     // Catch:{ JSONException -> 0x02cc }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "sdk_extra_parameters"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            goto L_0x02d8
        L_0x02cc:
            r0 = move-exception
            boolean r2 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r2 == 0) goto L_0x02d8
            java.lang.String r2 = "Failed to construct JSON body"
            r1.mo14366a(r2, r0)
        L_0x02d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p053e.C1905i.mo14416b():org.json.JSONObject");
    }

    public void run() {
        if (!C2049g.m4947i() && f3528a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f3496b.mo14520L());
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    mo14366a("Cannot update security provider", th);
                }
            }
        }
        Map<String, String> a = mo14415a();
        C2000c<T> a2 = C2000c.m4627a(this.f3496b).mo14724a(m4276c()).mo14734c(m4277h()).mo14725a(a).mo14726a(mo14416b()).mo14736d(((Boolean) this.f3496b.mo14534a(C1867b.f3354ev)).booleanValue()).mo14730b(ShareTarget.METHOD_POST).mo14723a(new JSONObject()).mo14722a(((Integer) this.f3496b.mo14534a(C1867b.f3229cY)).intValue()).mo14733c(((Integer) this.f3496b.mo14534a(C1867b.f3284db)).intValue()).mo14729b(((Integer) this.f3496b.mo14534a(C1867b.f3228cX)).intValue()).mo14728a();
        this.f3496b.mo14526S().mo14430a((C1887a) new C1908b(this.f3496b), C1918o.C1920a.TIMEOUT, ((long) ((Integer) this.f3496b.mo14534a(C1867b.f3228cX)).intValue()) + 250);
        C19061 r1 = new C1935u<JSONObject>(a2, this.f3496b, mo14373g()) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                if (C2102v.m5104a()) {
                    mo14370d("Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C1905i.this.m4274a(jSONObject);
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                C1905i.this.m4274a(jSONObject);
            }
        };
        r1.mo14453a(C1867b.f3115aP);
        r1.mo14455b(C1867b.f3116aQ);
        this.f3496b.mo14526S().mo14428a((C1887a) r1);
    }
}
