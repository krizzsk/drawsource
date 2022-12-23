package com.applovin.impl.mediation.debugger.p037b.p039b;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p036a.C1663b;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.b */
public class C1671b implements AppLovinCommunicatorSubscriber, Comparable<C1671b> {

    /* renamed from: A */
    private final Map<MaxAdFormat, C1663b> f2378A;

    /* renamed from: a */
    private final C1969m f2379a;

    /* renamed from: b */
    private final C1672a f2380b;

    /* renamed from: c */
    private int f2381c;

    /* renamed from: d */
    private final boolean f2382d;

    /* renamed from: e */
    private final boolean f2383e;

    /* renamed from: f */
    private final boolean f2384f;

    /* renamed from: g */
    private final boolean f2385g;

    /* renamed from: h */
    private final boolean f2386h;

    /* renamed from: i */
    private final boolean f2387i;

    /* renamed from: j */
    private final boolean f2388j;

    /* renamed from: k */
    private final boolean f2389k;

    /* renamed from: l */
    private final String f2390l;

    /* renamed from: m */
    private final String f2391m;

    /* renamed from: n */
    private final String f2392n;

    /* renamed from: o */
    private String f2393o;

    /* renamed from: p */
    private final String f2394p;

    /* renamed from: q */
    private final String f2395q;

    /* renamed from: r */
    private final String f2396r;

    /* renamed from: s */
    private final int f2397s;

    /* renamed from: t */
    private final List<MaxAdFormat> f2398t;

    /* renamed from: u */
    private final List<C1675d> f2399u;

    /* renamed from: v */
    private final List<C1670a> f2400v;

    /* renamed from: w */
    private final List<String> f2401w;

    /* renamed from: x */
    private final C1674c f2402x;

    /* renamed from: y */
    private final boolean f2403y;

    /* renamed from: z */
    private final String f2404z;

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$a */
    public enum C1672a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e */
        private final String f2410e;

        private C1672a(String str) {
            this.f2410e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m3460a() {
            return this.f2410e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$b */
    public enum C1673b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f */
        private final String f2417f;

        /* renamed from: g */
        private final int f2418g;

        /* renamed from: h */
        private final String f2419h;

        private C1673b(String str, int i, String str2) {
            this.f2417f = str;
            this.f2418g = i;
            this.f2419h = str2;
        }

        /* renamed from: a */
        public String mo13679a() {
            return this.f2417f;
        }

        /* renamed from: b */
        public int mo13680b() {
            return this.f2418g;
        }

        /* renamed from: c */
        public String mo13681c() {
            return this.f2419h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1671b(org.json.JSONObject r19, com.applovin.impl.sdk.C1969m r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "MediatedNetwork"
            r18.<init>()
            r1.f2379a = r3
            java.lang.String r0 = "name"
            java.lang.String r5 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2390l = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2391m = r0
            java.lang.String r6 = "adapter_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r6, r5)
            r1.f2392n = r0
            java.lang.String r0 = "latest_adapter_version"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2395q = r0
            java.util.List r0 = r18.m3430a((org.json.JSONObject) r19)
            r1.f2401w = r0
            r7 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "hide_if_missing"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.f2388j = r8
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "configuration"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r9, (org.json.JSONObject) r8)
            java.util.List r9 = r1.m3431a(r8, r3)
            r1.f2399u = r9
            com.applovin.impl.mediation.debugger.b.b.c r9 = new com.applovin.impl.mediation.debugger.b.b.c
            r9.<init>(r8, r3)
            r1.f2402x = r9
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "test_mode"
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r10, (org.json.JSONObject) r9)
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            java.lang.String r12 = "supported"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r12, r11)
            boolean r11 = r11.booleanValue()
            r1.f2386h = r11
            java.lang.String r11 = "test_mode_requires_init"
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r11, r0)
            boolean r0 = r0.booleanValue()
            r1.f2387i = r0
            java.lang.String r0 = "message"
            r11 = 0
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r0, r11)
            r1.f2396r = r0
            java.lang.String r0 = "existence_classes"
            java.util.List r0 = com.applovin.impl.sdk.utils.JsonUtils.getList(r2, r0, r11)
            if (r0 == 0) goto L_0x009c
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassesExistence(r0)
            goto L_0x00a6
        L_0x009c:
            java.lang.String r0 = "existence_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
        L_0x00a6:
            r1.f2382d = r0
            java.util.List r9 = java.util.Collections.emptyList()
            java.lang.String r0 = r1.f2392n
            com.applovin.mediation.adapter.MaxAdapter r0 = com.applovin.impl.mediation.p035d.C1655c.m3374b(r0, r3)
            if (r0 == 0) goto L_0x0131
            r1.f2383e = r10
            java.lang.String r12 = r0.getAdapterVersion()     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x00d5 }
            if (r13 == 0) goto L_0x00c5
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x00d5 }
            goto L_0x00c6
        L_0x00c5:
            r13 = r5
        L_0x00c6:
            java.util.List r9 = r1.m3429a((com.applovin.mediation.adapter.MaxAdapter) r0)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.isBeta()     // Catch:{ all -> 0x00d3 }
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r0
            goto L_0x00fd
        L_0x00d3:
            r0 = move-exception
            goto L_0x00db
        L_0x00d5:
            r0 = move-exception
            r13 = r5
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            r12 = r5
            r13 = r12
        L_0x00db:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Failed to load adapter for network "
            r14.append(r15)
            java.lang.String r15 = r1.f2390l
            r14.append(r15)
            java.lang.String r15 = ". Please check that you have a compatible network SDK integrated. Error: "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.applovin.impl.sdk.C2102v.m5110i(r4, r0)
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r7
        L_0x00fd:
            java.lang.String r0 = r1.f2392n     // Catch:{ all -> 0x0123 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r15 = "loadNativeAd"
            r11 = 3
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ all -> 0x0123 }
            java.lang.Class<com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters> r16 = com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class
            r11[r7] = r16     // Catch:{ all -> 0x0123 }
            java.lang.Class<android.app.Activity> r16 = android.app.Activity.class
            r11[r10] = r16     // Catch:{ all -> 0x0123 }
            r16 = 2
            java.lang.Class<com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener> r17 = com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class
            r11[r16] = r17     // Catch:{ all -> 0x0123 }
            java.lang.reflect.Method r11 = r0.getMethod(r15, r11)     // Catch:{ all -> 0x0123 }
            java.lang.Class r11 = r11.getDeclaringClass()     // Catch:{ all -> 0x0123 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x012e
        L_0x0123:
            r0 = move-exception
            com.applovin.impl.sdk.v r11 = r20.mo14509A()
            java.lang.String r15 = "Failed to check if adapter overrides MaxNativeAdAdapter"
            r11.mo15013b(r4, r15, r0)
            r0 = r7
        L_0x012e:
            r4 = r9
            r9 = r12
            goto L_0x0137
        L_0x0131:
            r1.f2383e = r7
            r13 = r5
            r14 = r13
            r0 = r7
            r4 = r0
        L_0x0137:
            r1.f2394p = r13
            r1.f2393o = r14
            r1.f2398t = r9
            r1.f2389k = r0
            java.util.List r0 = r1.m3432a(r8, r13, r3)
            r1.f2400v = r0
            java.lang.String r0 = "alternative_network"
            r9 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r0, (org.json.JSONObject) r9)
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r6, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
            r1.f2385g = r0
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = r18.m3428A()
            r1.f2380b = r0
            java.lang.String r0 = r1.f2395q
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0168
            if (r4 != 0) goto L_0x0168
            r0 = r10
            goto L_0x0169
        L_0x0168:
            r0 = r7
        L_0x0169:
            r1.f2384f = r0
            android.content.Context r0 = r20.mo14520L()
            java.lang.String r2 = r1.f2390l
            java.lang.String r3 = "_"
            int r2 = r2.lastIndexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x0185
            java.lang.String r3 = r1.f2390l
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r2 = r3.substring(r7, r2)
            goto L_0x018b
        L_0x0185:
            java.lang.String r2 = r1.f2390l
            java.lang.String r2 = r2.toLowerCase()
        L_0x018b:
            android.content.res.Resources r3 = r0.getResources()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "applovin_ic_mediation_"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = r0.getPackageName()
            java.lang.String r5 = "drawable"
            int r2 = r3.getIdentifier(r2, r5, r4)
            r1.f2397s = r2
            com.applovin.mediation.adapter.MaxAdapter$InitializationStatus r2 = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED
            int r2 = r2.getCode()
            r1.f2381c = r2
            com.applovin.communicator.AppLovinCommunicator r0 = com.applovin.communicator.AppLovinCommunicator.getInstance(r0)
            java.lang.String r2 = "adapter_initialization_status"
            r0.subscribe((com.applovin.communicator.AppLovinCommunicatorSubscriber) r1, (java.lang.String) r2)
            java.lang.String r0 = "amazon_marketplace"
            r2 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r0, (org.json.JSONObject) r2)
            if (r0 == 0) goto L_0x0218
            boolean r3 = r1.f2382d
            if (r3 == 0) goto L_0x0218
            r1.f2403y = r10
            java.lang.String r3 = "test_mode_app_id"
            java.lang.String r3 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r3, r2)
            r1.f2404z = r3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "test_mode_slot_ids"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r3, (org.json.JSONObject) r2)
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r0.length()
            r2.<init>(r3)
            java.util.Iterator r3 = r0.keys()
        L_0x01ec:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.applovin.mediation.MaxAdFormat r5 = com.applovin.mediation.MaxAdFormat.formatFromString(r4)
            r6 = 0
            org.json.JSONObject r4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r4, (org.json.JSONObject) r6)
            if (r5 == 0) goto L_0x01ec
            if (r4 != 0) goto L_0x0206
            goto L_0x01ec
        L_0x0206:
            java.lang.String r7 = "uuid"
            java.lang.String r7 = com.applovin.impl.sdk.utils.JsonUtils.getString(r4, r7, r6)
            if (r7 != 0) goto L_0x020f
            goto L_0x01ec
        L_0x020f:
            com.applovin.impl.mediation.debugger.a.b r6 = new com.applovin.impl.mediation.debugger.a.b
            r6.<init>(r7, r4, r5)
            r2.put(r5, r6)
            goto L_0x01ec
        L_0x0218:
            r1.f2403y = r7
            r2 = 0
            r1.f2404z = r2
        L_0x021d:
            r1.f2378A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.<init>(org.json.JSONObject, com.applovin.impl.sdk.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.f2405a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3.f2385g != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r3.f2383e != false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a m3428A() {
        /*
            r3 = this;
            boolean r0 = r3.f2382d
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f2383e
            if (r0 == 0) goto L_0x000b
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.COMPLETE
            goto L_0x0019
        L_0x000b:
            boolean r0 = r3.f2385g
            if (r0 == 0) goto L_0x0014
            goto L_0x0017
        L_0x0010:
            boolean r0 = r3.f2383e
            if (r0 == 0) goto L_0x0017
        L_0x0014:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.INCOMPLETE_INTEGRATION
            goto L_0x0019
        L_0x0017:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.MISSING
        L_0x0019:
            com.applovin.impl.mediation.debugger.b.b.b$a r1 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.MISSING
            if (r0 != r1) goto L_0x001e
            return r0
        L_0x001e:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.d> r1 = r3.f2399u
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.d r2 = (com.applovin.impl.mediation.debugger.p037b.p039b.C1675d) r2
            boolean r2 = r2.mo13687c()
            if (r2 != 0) goto L_0x0024
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.INVALID_INTEGRATION
            return r0
        L_0x0039:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.a> r1 = r3.f2400v
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.a r2 = (com.applovin.impl.mediation.debugger.p037b.p039b.C1670a) r2
            boolean r2 = r2.mo13649c()
            if (r2 != 0) goto L_0x003f
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.INVALID_INTEGRATION
            return r0
        L_0x0054:
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f2402x
            boolean r1 = r1.mo13682a()
            if (r1 == 0) goto L_0x0066
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f2402x
            boolean r1 = r1.mo13683b()
            if (r1 != 0) goto L_0x0066
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.C1672a.INVALID_INTEGRATION
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p037b.p039b.C1671b.m3428A():com.applovin.impl.mediation.debugger.b.b.b$a");
    }

    /* renamed from: a */
    private List<MaxAdFormat> m3429a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m3430a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", (JSONArray) null), (List) null);
    }

    /* renamed from: a */
    private List<C1675d> m3431a(JSONObject jSONObject, C1969m mVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f2392n.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C1675d dVar = new C1675d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", mVar.mo14520L());
            if (dVar.mo13687c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C1675d(next, jSONObject2.getString(next), mVar.mo14520L()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C1670a> m3432a(JSONObject jSONObject, String str, C1969m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1670a(jSONObject2, mVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C1670a.m3424a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", (String) null), JsonUtils.getString(jSONObject3, "max_adapter_version", (String) null))) {
                arrayList.add(new C1670a(jSONObject3, mVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public int compareTo(C1671b bVar) {
        return this.f2391m.compareToIgnoreCase(bVar.f2391m);
    }

    /* renamed from: a */
    public C1672a mo13651a() {
        return this.f2380b;
    }

    /* renamed from: b */
    public int mo13652b() {
        return this.f2381c;
    }

    /* renamed from: c */
    public C1673b mo13653c() {
        return !this.f2386h ? C1673b.NOT_SUPPORTED : this.f2380b == C1672a.INVALID_INTEGRATION ? C1673b.INVALID_INTEGRATION : !this.f2379a.mo14518J().mo13806a() ? C1673b.DISABLED : (!this.f2387i || !(this.f2381c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f2381c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? C1673b.READY : C1673b.NOT_INITIALIZED;
    }

    /* renamed from: d */
    public boolean mo13655d() {
        return this.f2382d;
    }

    /* renamed from: e */
    public boolean mo13656e() {
        return this.f2383e;
    }

    /* renamed from: f */
    public boolean mo13657f() {
        return this.f2384f;
    }

    /* renamed from: g */
    public boolean mo13658g() {
        return this.f2380b == C1672a.MISSING && this.f2388j;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public String mo13659h() {
        return this.f2390l;
    }

    /* renamed from: i */
    public String mo13660i() {
        return this.f2391m;
    }

    /* renamed from: j */
    public String mo13661j() {
        return this.f2393o;
    }

    /* renamed from: k */
    public String mo13662k() {
        return this.f2394p;
    }

    /* renamed from: l */
    public String mo13663l() {
        return this.f2395q;
    }

    /* renamed from: m */
    public String mo13664m() {
        return this.f2392n;
    }

    /* renamed from: n */
    public List<String> mo13665n() {
        return this.f2401w;
    }

    /* renamed from: o */
    public int mo13666o() {
        return this.f2397s;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f2392n.equals(string)) {
            this.f2381c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b = C1655c.m3374b(string, this.f2379a);
            if (b != null && !this.f2393o.equals(b.getSdkVersion())) {
                this.f2393o = b.getSdkVersion();
                this.f2379a.mo14557ag().mo14484a(this.f2393o, string);
            }
        }
    }

    /* renamed from: p */
    public List<MaxAdFormat> mo13667p() {
        return this.f2398t;
    }

    /* renamed from: q */
    public boolean mo13668q() {
        return this.f2389k;
    }

    /* renamed from: r */
    public List<C1675d> mo13669r() {
        return this.f2399u;
    }

    /* renamed from: s */
    public List<C1670a> mo13670s() {
        return this.f2400v;
    }

    /* renamed from: t */
    public final C1674c mo13671t() {
        return this.f2402x;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f2390l + ", displayName=" + this.f2391m + ", sdkAvailable=" + this.f2382d + ", sdkVersion=" + this.f2393o + ", adapterAvailable=" + this.f2383e + ", adapterVersion=" + this.f2394p + "}";
    }

    /* renamed from: u */
    public String mo13673u() {
        return this.f2396r;
    }

    /* renamed from: v */
    public final C1969m mo13674v() {
        return this.f2379a;
    }

    /* renamed from: w */
    public final String mo13675w() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f2390l);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f2380b.m3460a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f2382d || TextUtils.isEmpty(this.f2393o)) ? str : this.f2393o);
        sb.append("\nAdapter - ");
        if (this.f2383e && !TextUtils.isEmpty(this.f2394p)) {
            str = this.f2394p;
        }
        sb.append(str);
        if (this.f2402x.mo13682a() && !this.f2402x.mo13683b()) {
            sb.append("\n* ");
            sb.append(this.f2402x.mo13684c());
        }
        for (C1675d next : mo13669r()) {
            if (!next.mo13687c()) {
                sb.append("\n* MISSING ");
                sb.append(next.mo13685a());
                sb.append(": ");
                sb.append(next.mo13686b());
            }
        }
        for (C1670a next2 : mo13670s()) {
            if (!next2.mo13649c()) {
                sb.append("\n* MISSING ");
                sb.append(next2.mo13647a());
                sb.append(": ");
                sb.append(next2.mo13648b());
            }
        }
        return sb.toString();
    }

    /* renamed from: x */
    public boolean mo13676x() {
        return this.f2403y;
    }

    /* renamed from: y */
    public String mo13677y() {
        return this.f2404z;
    }

    /* renamed from: z */
    public Map<MaxAdFormat, C1663b> mo13678z() {
        return this.f2378A;
    }
}
