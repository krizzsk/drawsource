package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2544a;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.p111c.C2804f;
import com.bytedance.sdk.component.p108d.p117d.C2815g;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.p118e.p120b.C2849d;
import com.bytedance.sdk.component.p118e.p121c.C2856c;
import com.bytedance.sdk.component.p118e.p121c.C2857d;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p143a.C3334a;
import com.bytedance.sdk.openadsdk.core.p148d.C3398b;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3437s;
import com.bytedance.sdk.openadsdk.core.p153i.C3465b;
import com.bytedance.sdk.openadsdk.core.p153i.C3467d;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3099i;
import com.bytedance.sdk.openadsdk.p133c.C3150d;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3869f;
import com.bytedance.sdk.openadsdk.p178l.C3884m;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3889p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.o */
/* compiled from: NetApiImpl */
public class C3562o implements C3516n<C3060a> {

    /* renamed from: g */
    private static volatile boolean f8984g = false;

    /* renamed from: i */
    private static boolean f8985i = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8986a;

    /* renamed from: b */
    private final boolean f8987b;

    /* renamed from: c */
    private final ExecutorService f8988c = Executors.newFixedThreadPool(1);

    /* renamed from: d */
    private final String f8989d;

    /* renamed from: e */
    private long f8990e;

    /* renamed from: f */
    private int f8991f;

    /* renamed from: h */
    private C2832n f8992h = new C2832n() {
        /* renamed from: a */
        public void mo17178a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo17179a(C2828j jVar) {
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$a */
    /* compiled from: NetApiImpl */
    public static class C3572a {

        /* renamed from: a */
        final int f9018a;

        /* renamed from: b */
        final long f9019b;

        /* renamed from: c */
        final long f9020c;

        /* renamed from: d */
        final int f9021d;

        /* renamed from: e */
        final String f9022e;

        /* renamed from: f */
        final int f9023f;

        /* renamed from: g */
        final String f9024g;

        /* renamed from: h */
        public final C3402a f9025h;

        /* renamed from: i */
        final String f9026i;

        /* renamed from: j */
        final ArrayList<Integer> f9027j;

        private C3572a(String str, int i, int i2, String str2, int i3, String str3, C3402a aVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.f9018a = i;
            this.f9021d = i2;
            this.f9022e = str2;
            this.f9024g = str3;
            this.f9025h = aVar;
            this.f9026i = str;
            this.f9023f = i3;
            this.f9019b = j;
            this.f9020c = j2;
            this.f9027j = arrayList;
        }

        /* renamed from: a */
        public static C3572a m11294a(JSONObject jSONObject, AdSlot adSlot, C3433o oVar) {
            C3572a aVar;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString(C2722f.f1659536876631dc("dhf"));
            int optInt = jSONObject2.optInt(C2722f.f1659536876631dc("psm`avunfnUe`kP}b"));
            long optLong = jSONObject2.optLong(C2722f.f1659536876631dc("s^pfg`oqmV~x"));
            long optLong2 = jSONObject2.optLong(C2722f.f1659536876631dc("s^qfjaYs{"));
            int optInt2 = jSONObject2.optInt(C2722f.f1659536876631dc("sucwqvYdgmo"));
            String optString2 = jSONObject2.optString(C2722f.f1659536876631dc("ddq`"));
            String optString3 = jSONObject2.optString(C2722f.f1659536876631dc("rdsvavrXam"));
            int optInt3 = jSONObject2.optInt(C2722f.f1659536876631dc("rdcpkk"));
            Pair<C3402a, ArrayList<Integer>> a = C3356b.m9934a(jSONObject, adSlot, oVar);
            if (!(a == null || a.first == null)) {
                ((C3402a) a.first).mo19383a(jSONObject2.optLong(C2722f.f1659536876631dc("rdsvavrXio~n~")));
            }
            if (a == null) {
                return aVar;
            }
            new C3572a(optString, optInt, optInt2, optString2, optInt3, optString3, (C3402a) a.first, optLong, optLong2, (ArrayList) a.second);
            return aVar;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$b */
    /* compiled from: NetApiImpl */
    public static class C3573b {

        /* renamed from: a */
        public final int f9028a;

        /* renamed from: b */
        public final boolean f9029b;

        /* renamed from: c */
        public final C3437s f9030c;

        private C3573b(int i, boolean z, C3437s sVar) {
            this.f9028a = i;
            this.f9029b = z;
            this.f9030c = sVar;
        }

        /* renamed from: a */
        public static C3573b m11295a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(C2736e.e1659536876632dc("cnff"));
            boolean optBoolean = jSONObject.optBoolean(C2736e.e1659536876632dc("vdpjb|"));
            JSONObject optJSONObject = jSONObject.optJSONObject(C2736e.e1659536876632dc("d`vb"));
            C3437s sVar = new C3437s();
            if (optJSONObject != null) {
                try {
                    sVar.mo19707a(optJSONObject.optInt(C2736e.e1659536876632dc("rdcpkk")));
                    sVar.mo19710b(optJSONObject.optInt(C2736e.e1659536876632dc("cnps[qwm")));
                    sVar.mo19711c(optJSONObject.optInt(C2736e.e1659536876632dc("rdubvaYfefex")));
                    sVar.mo19708a(optJSONObject.optString(C2736e.e1659536876632dc("rdubvaYiido")));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return new C3573b(optInt, optBoolean, sVar);
        }
    }

    C3562o(Context context) {
        this.f8986a = context;
        this.f8987b = m11264d();
        this.f8989d = m11269g();
    }

    /* renamed from: a */
    private static String m11229a(int i) {
        String str;
        if (i != 120) {
            if (i != 160) {
                if (i == 240) {
                    str = "herj";
                } else if (i == 320) {
                    str = "xifsm";
                } else if (i == 480) {
                    str = "xyjgtl";
                } else if (i == 640) {
                    str = "xyzk`uo";
                }
            }
            return C3924h.h1659536876613dc("merj");
        }
        str = "lerj";
        return C3924h.h1659536876613dc(str);
    }

    /* renamed from: a */
    private static String m11230a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C2863b.b1659536876590dc("pimma"));
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static JSONObject m11231a(AdSlot adSlot) {
        C3574p pVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2722f.f1659536876631dc("pdppkkgkasooSlj"), C3513m.m10973h().mo19824A());
            jSONObject.put(C3886o.o1659536876602dc("llv"), C3869f.m12612b());
            jSONObject.put(C3886o.o1659536876602dc("cnrse"), C3457h.m10580d().mo19771k());
            jSONObject.put(C3886o.o1659536876602dc("gerq"), C3457h.m10580d().mo19770j());
            jSONObject.put(C3886o.o1659536876602dc("ir]d`utX}zoy"), C3513m.m10973h().mo19884x());
            jSONObject.put(C3886o.o1659536876602dc("cbrb"), C3457h.m10580d().mo19782v());
            if (!(adSlot == null || !C3574p.f9031a.containsKey(Integer.valueOf(adSlot.getCodeId())) || (pVar = C3574p.f9031a.get(Integer.valueOf(adSlot.getCodeId()))) == null)) {
                jSONObject.put(C3886o.o1659536876602dc("l`qweaiji`d"), pVar.mo20117b());
                jSONObject.put(C3886o.o1659536876602dc("l`qwfphcdl"), pVar.mo20119c());
                jSONObject.put(C3886o.o1659536876602dc("l`qwgiodc"), pVar.mo20120d());
                jSONObject.put(C3886o.o1659536876602dc("l`qwwnow"), pVar.mo20121e());
            }
            m11252a(jSONObject, C3886o.o1659536876602dc("kd{tkwbt"), C3457h.m10580d().mo19773m());
            m11252a(jSONObject, C3886o.o1659536876602dc("d`vb"), m11253b(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126 A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148 A[Catch:{ Exception -> 0x017d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11232a(com.bytedance.sdk.openadsdk.AdSlot r6, int r7, com.bytedance.sdk.openadsdk.core.p149e.C3433o r8) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ie"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "aevzt`"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r7)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 != 0) goto L_0x0092
        L_0x003f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r1.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = "ae]j`"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x005d:
            java.lang.String r2 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "csgbplpbW`n"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0076:
            java.lang.String r2 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "eyv"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0089:
            java.lang.String r2 = "psgum`qXimy"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r2)     // Catch:{ Exception -> 0x017d }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x017d }
        L_0x0092:
            java.lang.String r1 = "rdlgawYjm}bdh"
            java.lang.String r2 = "abaftqccWzcqi"
            r3 = 1
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r1)     // Catch:{ Exception -> 0x017d }
            int r4 = r8.f8445f     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x017d }
            int r1 = r8.f8445f     // Catch:{ Exception -> 0x017d }
            if (r1 != r3) goto L_0x00b6
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
        L_0x00ae:
            int r4 = r6.getImgAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m11251a((org.json.JSONObject) r0, (java.lang.String) r1, (int) r2, (int) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00b6:
            int r1 = r8.f8445f     // Catch:{ Exception -> 0x017d }
            r4 = 2
            if (r1 != r4) goto L_0x00db
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x017d }
            float r2 = r6.getExpressViewAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            float r4 = r6.getExpressViewAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m11250a((org.json.JSONObject) r0, (java.lang.String) r1, (float) r2, (float) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00cb:
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            goto L_0x00ae
        L_0x00db:
            java.lang.String r1 = "puro[lbt"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            org.json.JSONArray r2 = r2.mo19853g((java.lang.String) r4)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "pnq"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            int r2 = com.bytedance.sdk.openadsdk.AdSlot.getPosition(r7)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "ir]pquvhz}Uo|a"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            boolean r2 = r6.isSupportDeepLink()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getNativeAdType()     // Catch:{ Exception -> 0x017d }
            if (r1 > 0) goto L_0x0117
            r1 = 9
            if (r7 == r1) goto L_0x0117
            r1 = 5
            if (r7 != r1) goto L_0x0120
        L_0x0117:
            java.lang.String r1 = "ir]lvlanfVko"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.C2736e.e1659536876632dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0120:
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
            if (r1 >= r3) goto L_0x0127
            r1 = r3
        L_0x0127:
            r2 = 3
            if (r1 <= r2) goto L_0x012b
            r1 = r2
        L_0x012b:
            r2 = 7
            if (r7 == r2) goto L_0x0132
            r2 = 8
            if (r7 != r2) goto L_0x0133
        L_0x0132:
            r1 = r3
        L_0x0133:
            if (r8 == 0) goto L_0x013d
            org.json.JSONArray r8 = r8.f8444e     // Catch:{ Exception -> 0x017d }
            if (r8 == 0) goto L_0x013d
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
        L_0x013d:
            java.lang.String r8 = "ae]`kphs"
            java.lang.String r8 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r8)     // Catch:{ Exception -> 0x017d }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            if (r7 != r3) goto L_0x017d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r7.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "ir]qkqgsmVhjbck}"
            java.lang.String r8 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getIsRotateBanner()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Ysado"
            java.lang.String r8 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getRotateTime()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Yhzmoy"
            java.lang.String r8 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r8)     // Catch:{ Exception -> 0x017d }
            int r6 = r6.getRotateOrder()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x017d }
            java.lang.String r6 = "b`lmaw"
            java.lang.String r6 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r6)     // Catch:{ Exception -> 0x017d }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.m11232a(com.bytedance.sdk.openadsdk.AdSlot, int, com.bytedance.sdk.openadsdk.core.e.o):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ all -> 0x015a }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11233a(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.p149e.C3433o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "aqr"
            java.lang.String r1 = "4/7-4+1"
            java.lang.String r2 = "ae]p`nYqm{ybcc"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x015a }
            r4.<init>()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x0020
            java.lang.String r5 = r12.f8440a     // Catch:{ all -> 0x015a }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x015a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x015a }
            if (r5 == 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            java.lang.String r5 = r12.f8440a     // Catch:{ all -> 0x015a }
            goto L_0x0024
        L_0x0020:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12779c()     // Catch:{ all -> 0x015a }
        L_0x0024:
            r6 = 7
            java.lang.String r7 = "rds\\p|vb"
            if (r13 != r6) goto L_0x0039
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8441b     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8441b     // Catch:{ all -> 0x015a }
        L_0x0035:
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x005a
        L_0x0039:
            r6 = 8
            if (r13 != r6) goto L_0x004a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8442c     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8442c     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x004a:
            r6 = 3
            if (r13 != r6) goto L_0x005a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8443d     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8443d     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.mo19849e()     // Catch:{ all -> 0x008e }
            com.bytedance.sdk.openadsdk.core.i.f r7 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.mo19852f()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x008e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x008e }
            r8.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "vdppmjh"
            java.lang.String r9 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r9)     // Catch:{ all -> 0x008e }
            r8.put(r9, r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "p`pbi"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)     // Catch:{ all -> 0x008e }
            r8.put(r6, r7)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "acvfwq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)     // Catch:{ all -> 0x008e }
            r4.put(r6, r8)     // Catch:{ all -> 0x008e }
        L_0x008e:
            java.lang.String r6 = "rdsvavrXam"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r6)     // Catch:{ all -> 0x015a }
            r4.put(r6, r5)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r1)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = "snwqg`Ysqyo"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r6 = r10.m11255b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r6)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r10.f8986a     // Catch:{ all -> 0x015a }
            r6 = 1
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.p178l.C3869f.m12607a(r0, r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "ddtjg`"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r7, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "urgq"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r7 = m11231a((com.bytedance.sdk.openadsdk.AdSlot) r11)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "u`"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12768b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "cicmj`j"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "m`km"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x015a }
            r0.<init>()     // Catch:{ all -> 0x015a }
            org.json.JSONObject r13 = r10.m11232a((com.bytedance.sdk.openadsdk.AdSlot) r11, (int) r13, (com.bytedance.sdk.openadsdk.core.p149e.C3433o) r12)     // Catch:{ all -> 0x015a }
            r0.put(r13)     // Catch:{ all -> 0x015a }
            java.lang.String r13 = "aeqokqu"
            java.lang.String r13 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r13)     // Catch:{ all -> 0x015a }
            r4.put(r13, r0)     // Catch:{ all -> 0x015a }
            r10.m11249a((org.json.JSONObject) r4, (com.bytedance.sdk.openadsdk.core.p149e.C3433o) r12)     // Catch:{ all -> 0x015a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015a }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r7
            java.lang.String r0 = "tr"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r0, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = ""
            java.lang.String r7 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            if (r7 == 0) goto L_0x0135
            if (r5 == 0) goto L_0x0135
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r11.concat(r5)     // Catch:{ all -> 0x015a }
        L_0x0135:
            java.lang.String r11 = "rds\\wlai"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.component.utils.C2893e.m8077a((java.lang.String) r0)     // Catch:{ all -> 0x015a }
            r4.put(r11, r12)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r3 = com.bytedance.sdk.component.utils.C2888a.m8062a((org.json.JSONObject) r4)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r1)     // Catch:{ all -> 0x015a }
            r3.put(r11, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = "owgqw`gX~lxxeb`Pdhbv"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r11)     // Catch:{ all -> 0x015a }
            r3.put(r11, r6)     // Catch:{ all -> 0x015a }
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.m11233a(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.e.o, int):org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11234a(long j, String str, int i, C3572a aVar, int i2, String str2) {
    }

    /* renamed from: a */
    private void m11235a(C3060a aVar) {
        if (aVar != null) {
            String optString = aVar.mo18566b().optString(C3513m.m1659536876602dc("lne\\a}rui"), "");
            long c = C3898x.m12778c(optString);
            int d = C3898x.m12784d(optString);
            if (c == 0) {
                c = this.f8990e;
            }
            this.f8990e = c;
            if (d == 0) {
                d = this.f8991f;
            }
            this.f8991f = d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11236a(C3402a aVar) {
        List<C3431n> b = aVar.mo19386b();
        if (b != null && b.size() != 0) {
            for (int i = 0; i < b.size(); i++) {
                C3431n nVar = b.get(i);
                if (nVar != null && nVar.mo19593b() == null) {
                    m11248a("", nVar.mo19520M());
                    m11248a("", nVar.mo19521N());
                    List<C3417k> P = nVar.mo19523P();
                    if (P != null && P.size() > 0) {
                        for (int i2 = 0; i2 < P.size(); i2++) {
                            m11237a(nVar, P.get(i2));
                        }
                    }
                    if (nVar.mo19517J() != null) {
                        m11248a(nVar.mo19517J().mo15951h(), (C3417k) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m11237a(final C3431n nVar, C3417k kVar) {
        C2905l.m8114c(C2815g.g1659536876620dc("ile@efnb"), C2815g.g1659536876620dc("lncgMhaFfmXn|b|{*1"));
        if (kVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            C3707a.m12122a(kVar).mo17633a((C2832n) new C2832n() {
                /* renamed from: a */
                public void mo17178a(int i, String str, Throwable th) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C2856c.c1659536876586dc("esplvZehll"), i);
                        jSONObject.put(C2856c.c1659536876586dc("esplvZkb{zkli"), str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C2905l.m8114c(C2856c.c1659536876586dc("ile@efnb"), C2856c.c1659536876586dc("lncgMhaFfmXn|b|{*1夣贶"));
                    Context a = C3562o.this.f8986a;
                    C3431n nVar = nVar;
                    C3090e.m8917b(a, nVar, C3898x.m12754a(nVar), C2856c.c1659536876586dc("lncg[lkfolUn~a}"), currentTimeMillis, jSONObject);
                }

                /* renamed from: a */
                public void mo17179a(C2828j jVar) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C2856c.c1659536876586dc("psgokdbX{`pn"), jVar.mo17651f() / 1024);
                        jSONObject.put(C2856c.c1659536876586dc("lnabhZefkao"), jVar.mo17649d() ? 1 : 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C2905l.m8114c(C2856c.c1659536876586dc("ile@efnb"), C2856c.c1659536876586dc("lncgMhaFfmXn|b|{*1戂劌"));
                    Context a = C3562o.this.f8986a;
                    C3431n nVar = nVar;
                    C3090e.m8917b(a, nVar, C3898x.m12754a(nVar), C2856c.c1659536876586dc("lncg[lkfolUxynmjcb"), currentTimeMillis, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11238a(C3433o oVar, long j, long j2, int i, long j3, C3431n nVar, String str) {
        if (C3513m.m10973h().mo19829F()) {
            JSONObject jSONObject = new JSONObject();
            long j4 = 0;
            if (oVar != null) {
                try {
                    if (oVar.f8446g > 0) {
                        jSONObject.put(C2815g.g1659536876620dc("cmkfjqYt|hxSygbu"), j - oVar.f8446g);
                        j4 = j3 - oVar.f8446g;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(C2815g.g1659536876620dc("ndvtkwmX|`gn"), j2 - j);
            jSONObject.put(C2815g.g1659536876620dc("sdtfvZrnel"), i);
            jSONObject.put(C2815g.g1659536876620dc("cmkfjqYbfmUe`k"), j3 - j2);
            C3090e.m8895a(this.f8986a, nVar, str, C2815g.g1659536876620dc("lncg[dbX|`gn"), j4, jSONObject);
            while (true) {
                char c = 19;
                while (true) {
                    switch (c) {
                        case 18:
                            return;
                        case 20:
                        default:
                            c = 18;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11239a(C3516n.C3517a aVar, C3403b bVar) {
        aVar.mo18456a(-1, C3446g.m10553a(-1));
        bVar.mo19391a(-1);
        C3403b.m10134a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11240a(C3516n.C3518b bVar) {
        bVar.mo18497a(-1, C3446g.m10553a(-1));
    }

    /* renamed from: a */
    private void m11248a(String str, C3417k kVar) {
        if (!TextUtils.isEmpty(str)) {
            C3707a.m12123a(str).mo17633a(this.f8992h);
        } else if (kVar != null) {
            C3707a.m12122a(kVar).mo17633a(this.f8992h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = 'J';
        r3 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        switch(r3) {
            case 55: goto L_0x0029;
            case 56: goto L_0x0029;
            case 57: goto L_0x0021;
            default: goto L_0x0020;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11249a(org.json.JSONObject r2, com.bytedance.sdk.openadsdk.core.p149e.C3433o r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0029
            org.json.JSONArray r0 = r3.f8444e
            if (r0 != 0) goto L_0x0007
            goto L_0x0029
        L_0x0007:
            java.lang.String r0 = "snwqg`YsmdkbS}|`tdqgK|rd"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r0)     // Catch:{ Exception -> 0x0029 }
            org.json.JSONArray r3 = r3.f8444e     // Catch:{ Exception -> 0x0029 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0029 }
        L_0x0012:
            r2 = 73
            r3 = 96
        L_0x0016:
            switch(r2) {
                case 72: goto L_0x0021;
                case 73: goto L_0x001a;
                case 74: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0026
        L_0x001a:
            switch(r3) {
                case 94: goto L_0x0012;
                case 95: goto L_0x0021;
                case 96: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r3) {
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0012
        L_0x0021:
            r2 = 74
            r3 = 55
            goto L_0x0016
        L_0x0026:
            r2 = 72
            goto L_0x0016
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.m11249a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.e.o):void");
    }

    /* renamed from: a */
    private void m11250a(JSONObject jSONObject, String str, float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject2.put(C3513m.m1659536876602dc("whfwl"), (int) f);
                jSONObject2.put(C3513m.m1659536876602dc("hdkdlq"), (int) f2);
                jSONArray.put(jSONObject2);
                jSONObject.put(str, jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m11251a(JSONObject jSONObject, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject2.put(C3513m.m1659536876602dc("whfwl"), i);
                jSONObject2.put(C3513m.m1659536876602dc("hdkdlq"), i2);
                jSONArray.put(jSONObject2);
                jSONObject.put(str, jSONArray);
                char c = 'I';
                while (true) {
                    switch (c) {
                        case 'H':
                            return;
                        default:
                            c = 'H';
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m11252a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }

    /* renamed from: b */
    private static String m11253b(AdSlot adSlot) {
        if (adSlot == null) {
            return "";
        }
        String n = C3457h.m10580d().mo19774n();
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(n)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return n;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(C2857d.d1659536876571dc("n`of"), (String) null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(n);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(C2857d.d1659536876571dc("n`of"), (String) null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return n;
        }
    }

    /* renamed from: b */
    private JSONArray m11254b(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord id : list) {
            jSONArray.put(id.getId());
        }
        return jSONArray;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m11255b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3924h.h1659536876613dc("aqrj`"), C3457h.m10580d().mo19764f());
            jSONObject.put(C3924h.h1659536876613dc("n`of"), C3457h.m10580d().mo19767g());
            m11270g(jSONObject);
            Context a = C3513m.m10963a();
            String str = "";
            if (a != null) {
                try {
                    str = a.getPackageResourcePath();
                } catch (Throwable th) {
                    String h1659536876613dc = C3924h.h1659536876613dc("NdvBtlOjxe");
                    C2905l.m8118e(h1659536876613dc, C3924h.h1659536876613dc("f`koaa&sg)mnx-zgu1scdytymstr=wqSUCOHDRNGG\n[MNENWT\u0012CUA^\u0019\u0018\\HISO\u0004\u001f") + th.getMessage());
                }
            }
            jSONObject.put(C3924h.h1659536876613dc("p`ahebcXagymabP`pf{"), str);
            int i = 0;
            C3898x.m12763a(jSONObject, false);
            jSONObject.put(C3924h.h1659536876613dc("ir]selbXiyz"), C3457h.m10580d().mo19772l());
            if (C3579s.m11317a() != null) {
                jSONObject.put(C3924h.h1659536876613dc("aqi\\wlai"), C3579s.m11317a());
            }
            jSONObject.put(C3924h.h1659536876613dc("aqr\\vphiagmTxdcj"), (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
            jSONObject.put(C3924h.h1659536876613dc("flumehc"), C3869f.m12629h(this.f8986a));
            String h1659536876613dc2 = C3924h.h1659536876613dc("ir]jjlr");
            if (TTAdSdk.isInitSuccess()) {
                i = 1;
            }
            jSONObject.put(h1659536876613dc2, i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m11256b(C3431n nVar, List<FilterWord> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C2856c.c1659536876586dc("abvjkk"), C2856c.c1659536876586dc("dhqomnc"));
            jSONObject2.put(C2856c.c1659536876586dc("thofwqgjx"), System.currentTimeMillis());
            jSONObject2.put(C2856c.c1659536876586dc("ae]p`nYqm{ybcc"), C2856c.c1659536876586dc("4/7-4+1"));
            jSONObject2.put(C2856c.c1659536876586dc("eyvqe"), nVar.mo19569ac());
            jSONObject2.put(C2856c.c1659536876586dc("fhnwawYpg{nx"), m11254b(list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(C2856c.c1659536876586dc("abvjkku"), jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    @JProtect
    /* renamed from: b */
    public void m11257b(AdSlot adSlot, C3433o oVar, int i, C3516n.C3517a aVar) {
        AdSlot adSlot2 = adSlot;
        C3516n.C3517a aVar2 = aVar;
        final C3403b bVar = new C3403b();
        bVar.mo19392a(adSlot2);
        if (!C3470e.m10697a()) {
            if (aVar2 != null) {
                aVar2.mo18456a(1000, C2857d.d1659536876571dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                bVar.mo19391a(1000);
                C3403b.m10134a(bVar);
            }
        } else if (C3513m.m10973h().mo19886z()) {
            C3467d.m10678a((C3465b) null).mo19820a(false);
            if (aVar2 != null) {
                if (m11259b(adSlot.getCodeId())) {
                    aVar2.mo18456a(-8, C3446g.m10553a(-8));
                    bVar.mo19391a(-8);
                    C3403b.m10134a(bVar);
                } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C3753b.m12287a().mo20577c();
                    bVar.mo19396b(2);
                    bVar.mo19393a(adSlot.getBidAdm());
                    String f1659536876631dc = C2722f.f1659536876631dc("bhfgmka");
                    C2905l.m8111b(f1659536876631dc, C2722f.f1659536876631dc("gdvB`%dnlHnf,d}/fp~zp９c8nswp=zvRDAWH\\\u0006WI[YN\fYFJ\u0010CWGAGXR\\\u0019[_JXLK)2'.!+2}h\u000b#/\r)#bn\u001c\u0016fyk") + C2414b.m5821a(adSlot.getBidAdm()));
                    if (C3513m.m10973h().mo19827D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C3898x.m12760a(C2857d.d1659536876571dc("P`ldh`YCmklS@aku"), adSlot.getBidAdm(), this.f8986a);
                    }
                    try {
                        JSONObject a = mo19982a(new JSONObject(adSlot.getBidAdm()));
                        if (a == null) {
                            m11239a(aVar2, bVar);
                            return;
                        }
                        C3572a a2 = C3572a.m11294a(a, adSlot2, oVar);
                        bVar.mo19394a(a2.f9027j);
                        C3472j.m10775a(this.f8986a, a2.f9026i);
                        if (a2.f9021d != 20000) {
                            aVar2.mo18456a(a2.f9021d, a2.f9022e);
                            bVar.mo19391a(a2.f9021d);
                            C3403b.m10134a(bVar);
                        } else if (a2.f9025h == null) {
                            m11239a(aVar2, bVar);
                        } else {
                            if (a2.f9025h.mo19386b() != null && a2.f9025h.mo19386b().size() > 0) {
                                C3090e.m8904a(a2.f9025h.mo19386b().get(0), C3898x.m12769b(i));
                            }
                            a2.f9025h.mo19389c(a.toString());
                            aVar2.mo18457a(a2.f9025h, bVar);
                            m11236a(a2.f9025h);
                        }
                    } catch (Throwable th) {
                        C2905l.m8115c(C2857d.d1659536876571dc("NdvBtlOjxe"), C2857d.d1659536876571dc("gdv#ea&bz{ey6-"), th);
                        m11239a(aVar2, bVar);
                    }
                } else {
                    C3433o oVar2 = oVar;
                    JSONObject a3 = m11233a(adSlot, oVar, i);
                    if (a3 == null) {
                        aVar2.mo18456a(-9, C3446g.m10553a(-9));
                        bVar.mo19391a(-9);
                        C3403b.m10134a(bVar);
                        return;
                    }
                    if (C3513m.m10973h().mo19827D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C3898x.m12760a(C2722f.f1659536876631dc("P`ldh`YCmklS@aku"), a3.toString(), this.f8986a);
                    }
                    String a4 = C3898x.m12756a(C2722f.f1659536876631dc("/`rj+db(}gcdb\"}k{>uv`Jwsk6"), true);
                    C2849d b = C3792d.m12395a().mo20615b().mo17683b();
                    try {
                        b.mo17711a(C3150d.m9112a(b, a4));
                    } catch (Exception unused) {
                    }
                    b.mo17720a(a3);
                    HashMap hashMap = new HashMap();
                    hashMap.put(C2722f.f1659536876631dc("eyvqeZrnelUxxl|{"), Long.valueOf(System.currentTimeMillis()));
                    b.mo17717e(hashMap);
                    Map<String, String> a5 = C3579s.m11318a(a4, a3.toString());
                    if (a5 != null && a5.size() > 0) {
                        C2905l.m8114c(C2722f.f1659536876631dc("mrqgo%kt{maCiljjbb("), a5.toString());
                        for (String next : a5.keySet()) {
                            try {
                                b.mo17714b(next, a5.get(next));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    try {
                        b.mo17714b(C2722f.f1659536876631dc("Urgq)Dabf}"), C3898x.m12768b());
                    } catch (Exception unused3) {
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final AtomicLong atomicLong = new AtomicLong(currentTimeMillis);
                    final AtomicLong atomicLong2 = new AtomicLong(currentTimeMillis);
                    final C3516n.C3517a aVar3 = aVar;
                    final AdSlot adSlot3 = adSlot;
                    final int i2 = i;
                    final C3433o oVar3 = oVar;
                    b.mo17719a((C2842a) new C2842a() {
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                            */
                        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
                        /* renamed from: a */
                        public void mo17693a(com.bytedance.sdk.component.p118e.p120b.C2848c r23, com.bytedance.sdk.component.p118e.C2843b r24) {
                            /*
                                r22 = this;
                                r1 = r22
                                java.lang.String r2 = "p`ppaZ`fae"
                                if (r24 == 0) goto L_0x030c
                                boolean r0 = r24.mo17701f()
                                if (r0 == 0) goto L_0x02dc
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r24.mo17699d()     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
                                r3.<init>(r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ all -> 0x02ab }
                                boolean r4 = r4.mo19827D()     // Catch:{ all -> 0x02ab }
                                if (r4 == 0) goto L_0x0046
                                com.bytedance.sdk.openadsdk.TTAdManager r4 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()     // Catch:{ all -> 0x02ab }
                                int r4 = r4.getDebugLog()     // Catch:{ all -> 0x02ab }
                                r5 = 1
                                if (r4 != r5) goto L_0x0046
                                java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "P`ldh`YCmklS@aku"
                                java.lang.String r5 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r6 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r6 = r6.f8986a     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.p178l.C3898x.m12760a((java.lang.String) r5, (java.lang.String) r4, (android.content.Context) r6)     // Catch:{ all -> 0x02ab }
                            L_0x0046:
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r4.mo19393a((java.lang.String) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r0 = r0.mo19982a((org.json.JSONObject) r3)     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x0076
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m11239a((com.bytedance.sdk.openadsdk.core.C3516n.C3517a) r3, (com.bytedance.sdk.openadsdk.core.p149e.C3403b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17702g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r10 = 0
                                r11 = -1
                                java.lang.String r0 = "m`vf$ugu{lUmmdb"
                                java.lang.String r12 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r0)     // Catch:{ all -> 0x02ab }
                                r5.m11234a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x0076:
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r4 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o$a r10 = com.bytedance.sdk.openadsdk.core.C3562o.C3572a.m11294a(r0, r3, r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4     // Catch:{ all -> 0x02ab }
                                java.util.ArrayList<java.lang.Integer> r4 = r10.f9027j     // Catch:{ all -> 0x02ab }
                                r3.mo19394a((java.util.ArrayList<java.lang.Integer>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C3356b.C3357a.m9953a((com.bytedance.sdk.openadsdk.core.p149e.C3402a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r3 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r3 = r3.f8986a     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f9026i     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C3472j.m10775a(r3, r4)     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9021d     // Catch:{ all -> 0x02ab }
                                r4 = 20000(0x4e20, float:2.8026E-41)
                                if (r3 == r4) goto L_0x00e6
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9021d     // Catch:{ all -> 0x02ab }
                                r0.mo19391a((int) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10973h()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.mo19874o()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x00bf
                                int r0 = r10.f9021d     // Catch:{ all -> 0x02ab }
                                r3 = 40029(0x9c5d, float:5.6093E-41)
                                if (r0 != r3) goto L_0x00bf
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                r3 = -100
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3446g.m10553a(r3)     // Catch:{ all -> 0x02ab }
                            L_0x00bb:
                                r0.mo18456a((int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02ab }
                                goto L_0x00c6
                            L_0x00bf:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9021d     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f9022e     // Catch:{ all -> 0x02ab }
                                goto L_0x00bb
                            L_0x00c6:
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p149e.C3403b.m10134a((com.bytedance.sdk.openadsdk.core.p149e.C3403b) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17702g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                int r11 = r10.f9021d     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f9023f     // Catch:{ all -> 0x02ab }
                                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02ab }
                                r5.m11234a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                goto L_0x02aa
                            L_0x00e6:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                if (r3 != 0) goto L_0x010a
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m11239a((com.bytedance.sdk.openadsdk.core.C3516n.C3517a) r3, (com.bytedance.sdk.openadsdk.core.p149e.C3403b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17702g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r2)     // Catch:{ all -> 0x02ab }
                                r5.m11234a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x010a:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02ab }
                                r3.mo19389c(r0)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r9     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r0 = r0.f8448i     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r11 = r0.f8448i     // Catch:{ all -> 0x02ab }
                                long r12 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r14 = r0.get()     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f9018a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r3 = r9     // Catch:{ all -> 0x02ab }
                                long r17 = r3.get()     // Catch:{ all -> 0x02ab }
                                r16 = r0
                                r11.mo19696a(r12, r14, r16, r17)     // Catch:{ all -> 0x02ab }
                            L_0x013f:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.mo18457a((com.bytedance.sdk.openadsdk.core.p149e.C3402a) r3, (com.bytedance.sdk.openadsdk.core.p149e.C3403b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                r0.m11236a((com.bytedance.sdk.openadsdk.core.p149e.C3402a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p149e.C3402a.m10124a((com.bytedance.sdk.openadsdk.core.p149e.C3402a) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19386b()     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x02a4
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19386b()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x02a1
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9025h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19386b()     // Catch:{ all -> 0x02ab }
                                r3 = 0
                                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.n r0 = (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0     // Catch:{ all -> 0x02ab }
                                int r3 = r7     // Catch:{ all -> 0x02ab }
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12769b((int) r3)     // Catch:{ all -> 0x02ab }
                                java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x02ab }
                                r4.<init>()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                if (r5 == 0) goto L_0x01cb
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                long r5 = r5.f8446g     // Catch:{ all -> 0x02ab }
                                r7 = 0
                                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                                if (r5 <= 0) goto L_0x01cb
                                java.lang.String r5 = "cmkfjqYt|hxSygbu"
                                java.lang.String r5 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f8446g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "lncg[qu"
                                java.lang.String r5 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r6 = r8     // Catch:{ all -> 0x02ab }
                                long r6 = r6.f8446g     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "tnvbhZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f8446g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                            L_0x01cb:
                                java.lang.String r5 = "rdsvavrX|z"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9019b     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^qfjaYs{"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9020c     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^gm`Zrt"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "ndvtkwmX|`gn"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17702g()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "gn]wmhc"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9019b     // Catch:{ all -> 0x02ab }
                                long r8 = r10     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "sdtfvZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                int r6 = r10.f9018a     // Catch:{ all -> 0x02ab }
                                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "b`ah[qojm"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                long r8 = r10.f9020c     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "cmkfjqYbfmUe`k"
                                java.lang.String r5 = com.bytedance.sdk.component.p118e.p121c.C2856c.c1659536876586dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r8 = r3     // Catch:{ all -> 0x02ab }
                                long r8 = r8.get()     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.p128b.C3090e.m8910a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0, (java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r11 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r12 = r8     // Catch:{ all -> 0x02ab }
                                long r13 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r4 = r3     // Catch:{ all -> 0x02ab }
                                long r15 = r4.get()     // Catch:{ all -> 0x02ab }
                                int r4 = r10.f9018a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r5 = r9     // Catch:{ all -> 0x02ab }
                                long r18 = r5.get()     // Catch:{ all -> 0x02ab }
                                r17 = r4
                                r20 = r0
                                r21 = r3
                                r11.m11238a((com.bytedance.sdk.openadsdk.core.p149e.C3433o) r12, (long) r13, (long) r15, (int) r17, (long) r18, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r20, (java.lang.String) r21)     // Catch:{ all -> 0x02ab }
                                goto L_0x030c
                            L_0x02a1:
                                r0 = 53
                                goto L_0x02a6
                            L_0x02a4:
                                r0 = 51
                            L_0x02a6:
                                switch(r0) {
                                    case 51: goto L_0x030c;
                                    case 52: goto L_0x02aa;
                                    case 53: goto L_0x030c;
                                    default: goto L_0x02a9;
                                }
                            L_0x02a9:
                                goto L_0x02a4
                            L_0x02aa:
                                return
                            L_0x02ab:
                                r0 = move-exception
                                java.lang.String r3 = "NdvBtlOjxe"
                                java.lang.String r3 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r3)
                                java.lang.String r4 = "gdv#ea&bz{ey6-"
                                java.lang.String r4 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r4)
                                com.bytedance.sdk.component.utils.C2905l.m8115c(r3, r4, r0)
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3562o.this
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4
                                r0.m11239a((com.bytedance.sdk.openadsdk.core.C3516n.C3517a) r3, (com.bytedance.sdk.openadsdk.core.p149e.C3403b) r4)
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3562o.this
                                long r6 = r24.mo17702g()
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6
                                java.lang.String r8 = r0.getCodeId()
                                int r9 = r7
                                r10 = 0
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.component.p108d.p117d.C2815g.g1659536876620dc(r2)
                                r5.m11234a(r6, r8, r9, r10, r11, r12)
                                goto L_0x030c
                            L_0x02dc:
                                int r0 = r24.mo17695a()
                                java.lang.String r2 = r24.mo17697b()
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                r3.mo18456a((int) r0, (java.lang.String) r2)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                r3.mo19391a((int) r0)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                com.bytedance.sdk.openadsdk.core.p149e.C3403b.m10134a((com.bytedance.sdk.openadsdk.core.p149e.C3403b) r3)
                                com.bytedance.sdk.openadsdk.core.o r13 = com.bytedance.sdk.openadsdk.core.C3562o.this
                                long r14 = r24.mo17702g()
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6
                                java.lang.String r16 = r3.getCodeId()
                                int r3 = r7
                                r18 = 0
                                r17 = r3
                                r19 = r0
                                r20 = r2
                                r13.m11234a(r14, r16, r17, r18, r19, r20)
                            L_0x030c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.C35653.mo17693a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                        }

                        /* renamed from: a */
                        public void mo17694a(C2848c cVar, IOException iOException) {
                            if (C3513m.m10973h().mo19827D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                                C3898x.m12760a(C2857d.d1659536876571dc("P`ldh`YCmklS@aku"), iOException != null ? iOException.getMessage() : null, C3562o.this.f8986a);
                            }
                            long longValue = ((Long) cVar.mo17715c().get(C2857d.d1659536876571dc("eyvqeZrnelUxxl|{"))).longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            String message = iOException != null ? iOException.getMessage() : "";
                            if (iOException != null && SocketTimeoutException.class.equals(iOException.getCause())) {
                                aVar3.mo18456a(602, message);
                            }
                            aVar3.mo18456a(602, message);
                            C2905l.m8107a(C2857d.d1659536876571dc("NdvBtlOjxe"), C2857d.d1659536876571dc("ooDbmisum3*"), 601);
                            bVar.mo19391a(601);
                            C3403b.m10134a(bVar);
                            C3562o.this.m11234a(currentTimeMillis - longValue, adSlot3.getCodeId(), i2, (C3572a) null, 601, message);
                        }
                    });
                    C3393d.m10099a().mo19374b();
                }
            }
        } else if (aVar2 != null) {
            aVar2.mo18456a(-16, C3446g.m10553a(-16));
            bVar.mo19391a(1001);
            C3403b.m10134a(bVar);
        }
    }

    /* renamed from: b */
    private void m11258b(JSONObject jSONObject, String str) {
        C2849d b = C3792d.m12395a().mo20615b().mo17683b();
        b.mo17711a(str);
        b.mo17720a(jSONObject);
        b.mo17718a();
    }

    /* renamed from: b */
    private boolean m11259b(String str) {
        if (C3398b.m10115a()) {
            return true;
        }
        if (!C3398b.m10116a(str)) {
            return false;
        }
        String b = C3398b.m10117b();
        if (!TextUtils.isEmpty(b)) {
            C3090e.m8900a(this.f8986a, b, System.currentTimeMillis());
        }
        return true;
    }

    @JProtect
    /* renamed from: c */
    private JSONObject m11260c() {
        char c = ' ';
        while (true) {
            switch (c) {
                case 31:
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C3924h.h1659536876613dc("u`"), C3898x.m12768b());
                        jSONObject.put(C3924h.h1659536876613dc("ae]p`nYqm{ybcc"), C3924h.h1659536876613dc("4/7-4+1"));
                        jSONObject.put(C3924h.h1659536876613dc("sho\\ku"), m11230a(this.f8986a));
                        int i = 1;
                        jSONObject.put(C3924h.h1659536876613dc("rnmw"), this.f8987b ? 1 : 0);
                        jSONObject.put(C3924h.h1659536876613dc("thof~jhb"), m11267f());
                        jSONObject.put(C3924h.h1659536876613dc("abafwv"), C3884m.m12673a(this.f8986a));
                        jSONObject.put(C3924h.h1659536876613dc("or"), C3924h.h1659536876613dc("Aofqklb"));
                        jSONObject.put(C3924h.h1659536876613dc("or]uawungg"), Build.VERSION.RELEASE);
                        jSONObject.put(C3924h.h1659536876613dc("or]btl"), Build.VERSION.SDK_INT);
                        jSONObject.put(C3924h.h1659536876613dc("ddtjg`Ysqyo"), this.f8989d);
                        jSONObject.put(C3924h.h1659536876613dc("ddtjg`Yjgmog"), Build.MODEL);
                        jSONObject.put(C3924h.h1659536876613dc("ddtjg`Yezhdo"), Build.BRAND);
                        jSONObject.put(C3924h.h1659536876613dc("ddtjg`Yjigmmnzzbt`"), Build.MANUFACTURER);
                        jSONObject.put(C3924h.h1659536876613dc("l`ldqdab"), Locale.getDefault().getLanguage());
                        jSONObject.put(C3924h.h1659536876613dc("rdqlhprngg"), C3904y.m12881d(this.f8986a) + C3924h.h1659536876613dc("x") + C3904y.m12877c(this.f8986a));
                        jSONObject.put(C3924h.h1659536876613dc("dhqshdXlldxeyw"), m11229a(C3904y.m12890g(this.f8986a)));
                        jSONObject.put(C3924h.h1659536876613dc("ddlpmqXlyc"), C3904y.m12890g(this.f8986a));
                        jSONObject.put(C3924h.h1659536876613dc("ddtjg`Ynl"), C3472j.m10774a(this.f8986a));
                        jSONObject.put(C3924h.h1659536876613dc("ahf"), C3924h.h1659536876613dc("1252"));
                        jSONObject.put(C3924h.h1659536876613dc("rno"), m11265e());
                        jSONObject.put(C3924h.h1659536876613dc("cqw\\ego"), Build.CPU_ABI);
                        jSONObject.put(C3924h.h1659536876613dc("uu"), this.f8991f);
                        jSONObject.put(C3924h.h1659536876613dc("uhf"), this.f8990e);
                        jSONObject.put(C3924h.h1659536876613dc("gnmdh`Yfam"), C3970a.m13090a().mo20862b());
                        jSONObject.put(C3924h.h1659536876613dc("lnabh`Ykigm~mjk"), C3869f.m12618c());
                        jSONObject.put(C3924h.h1659536876613dc("sbpfakYez`mcx"), Math.ceil((double) (C3869f.m12620d() * 10.0f)) / 10.0d);
                        String h1659536876613dc = C3924h.h1659536876613dc("ir]pgwcbfVemj");
                        if (C3869f.m12610a()) {
                            i = 0;
                        }
                        jSONObject.put(h1659536876613dc, i);
                        C3471f h = C3513m.m10973h();
                        jSONObject.put(C3924h.h1659536876613dc("fnp`aZjffnjkh"), C2914t.m8151a(this.f8986a, C3924h.h1659536876613dc("tu]`ljitmVfjbj{nwt")));
                        if (h.mo19876p(C3924h.h1659536876613dc("moa"))) {
                            jSONObject.put(C3924h.h1659536876613dc("moa"), C3889p.m12705c());
                        }
                        if (h.mo19876p(C3924h.h1659536876613dc("mba"))) {
                            jSONObject.put(C3924h.h1659536876613dc("mba"), C3889p.m12704b());
                        }
                    } catch (Exception unused) {
                    }
                    return jSONObject;
                case ' ':
                case '!':
                    break;
                default:
                    if (c <= 'N') {
                        break;
                    }
            }
            c = 31;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11261c(String str) {
        C2846b c = C3792d.m12395a().mo20615b().mo17684c();
        c.mo17711a(str);
        c.mo17708a(new C2842a() {
            /* renamed from: a */
            public void mo17693a(C2848c cVar, C2843b bVar) {
                C2905l.m8111b(C3886o.o1659536876602dc("cmkfjq&eamnbbj.|erqvgf"), bVar.mo17699d());
            }

            /* renamed from: a */
            public void mo17694a(C2848c cVar, IOException iOException) {
                C2905l.m8111b(C3886o.o1659536876602dc("cmkfjq&eamnbbj.iqx~"), iOException.toString());
            }
        });
    }

    /* renamed from: c */
    private boolean m11262c(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @JProtect
    /* renamed from: d */
    private void m11263d(JSONObject jSONObject) {
        if (C3457h.m10580d().mo19779s()) {
            try {
                jSONObject.getJSONObject(C3886o.o1659536876602dc("hdcgaw")).put(C3886o.o1659536876602dc("ahf"), C3886o.o1659536876602dc("4441"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            JSONObject a = C2888a.m8062a(jSONObject);
            if (m11262c(a)) {
                jSONObject = a;
            }
            Map<String, String> e2 = m11266e(jSONObject);
            C2849d b = C3792d.m12395a().mo20615b().mo17683b();
            b.mo17711a(C3898x.m12819l());
            if (e2 != null) {
                for (Map.Entry next : e2.entrySet()) {
                    try {
                        b.mo17714b((String) next.getKey(), (String) next.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
            b.mo17721c(jSONObject.toString());
            try {
                b.mo17714b(C3886o.o1659536876602dc("Urgq)Dabf}"), C3898x.m12768b());
            } catch (Exception unused2) {
            }
            b.mo17719a((C2842a) new C2842a() {
                /* renamed from: a */
                public void mo17693a(C2848c cVar, C2843b bVar) {
                    if (bVar == null || !bVar.mo17701f()) {
                        C2905l.m8114c(C2856c.c1659536876586dc("NdvBtlOjxe"), C2856c.c1659536876586dc("ooPfwuii{l0+Bhz]ubb|zfs7qj:uiqr"));
                        return;
                    }
                    C2905l.m8107a(C2856c.c1659536876586dc("NdvBtlOjxe"), C2856c.c1659536876586dc("ooPfwuii{l0+"), bVar.mo17699d());
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                    C2905l.m8107a(C3513m.m1659536876602dc("NdvBtlOjxe"), C3513m.m1659536876602dc("ooDbmisum3*"), iOException.getMessage());
                }
            });
        }
    }

    /* renamed from: d */
    private static boolean m11264d() {
        try {
            return new File(C2815g.g1659536876620dc("/r{pp`k(j`d$x")).exists() || new File(C2815g.g1659536876620dc("/r{pp`k(pkce#~{")).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @JProtect
    /* renamed from: e */
    private static String m11265e() {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (C3886o.m12684e()) {
                str = "MHWJ)";
            } else if (C3886o.m12679b()) {
                str = "FM[NA(";
            } else {
                String n = C3886o.m12693n();
                if (C3886o.m12677a(n)) {
                    sb.append(C2863b.b1659536876590dc("ELWJ)"));
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    str = "-";
                }
                sb.append(Build.VERSION.INCREMENTAL);
                return sb.toString();
            }
            sb.append(C2863b.b1659536876590dc(str));
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: e */
    private Map<String, String> m11266e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(C2804f.f1659536876622dc("Cnlwakr*\\pzn"), C2804f.f1659536876622dc("aqromfgsafd$f~aa+1q{ugerl$ooz0&"));
        if (m11262c(jSONObject)) {
            hashMap.put(C2804f.f1659536876622dc("Cnlwakr*Mgidhd`h"), C2804f.f1659536876622dc("uokljZuccVoeobjj"));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static int m11267f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: f */
    private boolean m11268f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            boolean equalsIgnoreCase = jSONObject.optString(C2804f.f1659536876622dc("mdqpebc")).equalsIgnoreCase(C2804f.f1659536876622dc("sta`avu"));
            while (true) {
                char c = '^';
                char c2 = '}';
                while (true) {
                    switch (c) {
                        case '^':
                            break;
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    break;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '7':
                        case '9':
                            break;
                        case '8':
                            break;
                    }
                    c = '_';
                    c2 = '_';
                }
            }
            return equalsIgnoreCase;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    private String m11269g() {
        String str;
        if (C3869f.m12619c(this.f8986a)) {
            str = "tw";
        } else if (C3869f.m12615b(this.f8986a)) {
            return C3924h.h1659536876613dc("aofqklbXxhn");
        } else {
            str = "aofqklb";
        }
        return C3924h.h1659536876613dc(str);
    }

    @JProtect
    /* renamed from: g */
    private void m11270g(JSONObject jSONObject) {
        try {
            jSONObject.put(C2736e.e1659536876632dc("p`ahebcXfhgn"), C3898x.m12785d());
            jSONObject.put(C2736e.e1659536876632dc("vdppmjhXkfnn"), C3898x.m12791e());
            jSONObject.put(C2736e.e1659536876632dc("vdppmjh"), C3898x.m12797f());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public C2544a mo19980a() {
        if (!C3470e.m10697a()) {
            return null;
        }
        C2846b c = C3792d.m12395a().mo20615b().mo17684c();
        try {
            c.mo17711a(C3150d.m9112a(c, C3513m.m10973h().mo19882v()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2843b a = c.mo17707a();
        if (a == null) {
            return null;
        }
        try {
            if (a.mo17701f()) {
                return C2544a.m6422e(a.mo17699d());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:5|(1:11)|12|13|14|(2:17|15)|64|18|19|20|(1:22)|23|(2:25|(6:29|30|31|66|65|26))|32|33|34|35|36|37|38|(1:45)(1:44)|46|(1:48)(1:49)|(2:(1:57)|58)(1:53)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0147, code lost:
        com.bytedance.sdk.component.utils.C2905l.m8115c(com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc("NdvBtlOjxe"), com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc("uqnleaCqmg~+i|`b"), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        return new com.bytedance.sdk.openadsdk.p128b.C3099i(false, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc("sdpumfcXj|yr"), false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[ADDED_TO_REGION, Catch:{ all -> 0x0146 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.p128b.C3099i mo19981a(java.util.List<com.bytedance.sdk.openadsdk.p128b.C3060a> r8) {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.core.p153i.C3470e.m10697a()     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0009
            r8 = 0
            return r8
        L_0x0009:
            java.lang.String r1 = ""
            int r2 = r8.size()     // Catch:{ all -> 0x0146 }
            if (r2 <= 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r2     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r2 = r2.mo18566b()     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r1 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r1     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r1 = r1.mo18566b()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "aqr\\hjaX}{f"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = r1.optString(r2)     // Catch:{ all -> 0x0146 }
        L_0x0037:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            r2.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r8.get(r0)     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r3 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r3     // Catch:{ JSONException -> 0x0091 }
            r7.m11235a((com.bytedance.sdk.openadsdk.p128b.C3060a) r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r3 = "hdcgaw"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r3)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r7.m11260c()     // Catch:{ JSONException -> 0x0091 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x0091 }
        L_0x005b:
            boolean r4 = r8.hasNext()     // Catch:{ JSONException -> 0x0091 }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r8.next()     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r4 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r4     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r4.mo18567c()     // Catch:{ JSONException -> 0x0091 }
            r3.put(r4)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x005b
        L_0x006f:
            java.lang.String r8 = "ewgmp"
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "_fgm[qojm"
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "lnabhZrnel"
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x0091:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.C2888a.m8062a((org.json.JSONObject) r2)     // Catch:{ all -> 0x0146 }
            boolean r3 = r7.m11262c((org.json.JSONObject) r8)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x009c
            r8 = r2
        L_0x009c:
            java.util.Map r3 = r7.m11266e(r8)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.i.d r4 = com.bytedance.sdk.openadsdk.p174i.C3792d.m12395a()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.a r4 = r4.mo20615b()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.b.d r4 = r4.mo17683b()     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12807h((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            r4.mo17711a((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0146 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0146 }
        L_0x00bd:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0146 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0146 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00bd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bd }
            r4.mo17714b(r5, r3)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00d9:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0146 }
            r4.mo17721c(r8)     // Catch:{ all -> 0x0146 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r8)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12768b()     // Catch:{ Exception -> 0x00ed }
            r4.mo17714b(r8, r1)     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            com.bytedance.sdk.component.e.b r8 = r4.mo17718a()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0113
            boolean r1 = r8.mo17701f()     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = r8.mo17699d()     // Catch:{ all -> 0x0146 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0146 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0113
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = r8.mo17699d()     // Catch:{ all -> 0x0146 }
            r1.<init>(r3)     // Catch:{ all -> 0x0146 }
            boolean r1 = r7.m11268f(r1)     // Catch:{ all -> 0x0146 }
            goto L_0x0114
        L_0x0113:
            r1 = r0
        L_0x0114:
            java.lang.String r3 = "esplv%sicge|b"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.C3513m.m1659536876602dc(r3)     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0121
            int r4 = r8.mo17695a()     // Catch:{ all -> 0x0146 }
            goto L_0x0122
        L_0x0121:
            r4 = r0
        L_0x0122:
            if (r1 != 0) goto L_0x0130
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0130
            java.lang.String r8 = "sdpuaw&tip*ecy.|erqvgf"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r8)     // Catch:{ all -> 0x0146 }
            r8 = 1
            goto L_0x013d
        L_0x0130:
            if (r8 == 0) goto L_0x013c
            java.lang.String r5 = r8.mo17697b()     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x013c
            java.lang.String r3 = r8.mo17697b()     // Catch:{ all -> 0x0146 }
        L_0x013c:
            r8 = r0
        L_0x013d:
            r7.m11263d(r2)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.i r2 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x0146 }
            r2.<init>(r1, r4, r3, r8)     // Catch:{ all -> 0x0146 }
            return r2
        L_0x0146:
            r8 = move-exception
            java.lang.String r1 = "NdvBtlOjxe"
            java.lang.String r1 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r1)
            java.lang.String r2 = "uqnleaCqmg~+i|`b"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r2)
            com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r2, r8)
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r1 = 509(0x1fd, float:7.13E-43)
            java.lang.String r2 = "sdpumfcXj|yr"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(r2)
            r8.<init>(r0, r1, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.mo19981a(java.util.List):com.bytedance.sdk.openadsdk.b.i");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo19982a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "atawmjhXx{chi"
            if (r6 != 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r1 = f8985i     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "cxrkaw"
            java.lang.String r1 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r1)     // Catch:{ Exception -> 0x0045 }
            r2 = -1
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = "mdqpebc"
            java.lang.String r2 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r6.optString(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = ""
            java.lang.String r3 = r6.optString(r3, r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 3
            if (r1 != r4) goto L_0x002f
            java.lang.String r2 = com.bytedance.sdk.component.utils.C2888a.m8064b(r2)     // Catch:{ Exception -> 0x0045 }
        L_0x002f:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0045 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0045 }
            if (r1 != 0) goto L_0x0045
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.lang.String r0 = com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(r0)     // Catch:{ all -> 0x0046 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0046
        L_0x0045:
            r1 = r6
        L_0x0046:
            boolean r0 = f8985i
            if (r0 == 0) goto L_0x004b
            r6 = r1
        L_0x004b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.mo19982a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo19983a(AdSlot adSlot, C3433o oVar, int i, C3516n.C3517a aVar) {
        final C3334a aVar2 = new C3334a(aVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final AdSlot adSlot2 = adSlot;
            final C3433o oVar2 = oVar;
            final int i2 = i;
            C3502k.m10921c().post(new C2885g(C3924h.h1659536876613dc("gdvB`")) {
                public void run() {
                    C3562o.this.m11257b(adSlot2, oVar2, i2, aVar2);
                }
            });
            return;
        }
        m11257b(adSlot, oVar, i, aVar2);
    }

    /* renamed from: a */
    public void mo19984a(C3431n nVar, List<FilterWord> list) {
        JSONObject b;
        if (C3470e.m10697a() && (b = m11256b(nVar, list)) != null) {
            C2849d b2 = C3792d.m12395a().mo20615b().mo17683b();
            b2.mo17711a(C3898x.m12802g(C2856c.c1659536876586dc("/`rj+db(}gcdb\"jfc}{xqJsa}wn4")));
            b2.mo17721c(C2888a.m8062a(b).toString());
            b2.mo17719a((C2842a) new C2842a() {
                /* renamed from: a */
                public void mo17693a(C2848c cVar, C2843b bVar) {
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                }
            });
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[LOOP:0: B:5:0x0020->B:9:0x0031, LOOP_END] */
    /* renamed from: a */
    public void mo19985a(final java.lang.String r3) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0019
            com.bytedance.sdk.openadsdk.core.o$9 r0 = new com.bytedance.sdk.openadsdk.core.o$9
            java.lang.String r1 = "uqnleaEkaldNdjkyu"
            java.lang.String r1 = com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(r1)
            r0.<init>(r1, r3)
            com.bytedance.sdk.component.p123f.C2882e.m8035a((com.bytedance.sdk.component.p123f.C2885g) r0)
            goto L_0x002c
        L_0x0019:
            r2.m11261c((java.lang.String) r3)
        L_0x001c:
            r3 = 74
            r0 = 55
        L_0x0020:
            switch(r3) {
                case 72: goto L_0x001c;
                case 73: goto L_0x0024;
                case 74: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0031
        L_0x0024:
            switch(r0) {
                case 94: goto L_0x002c;
                case 95: goto L_0x002b;
                case 96: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r0) {
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x002c
        L_0x002b:
            return
        L_0x002c:
            r3 = 73
            r0 = 96
            goto L_0x0020
        L_0x0031:
            r3 = 72
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.mo19985a(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo19986a(JSONObject jSONObject, final C3516n.C3518b bVar) {
        while (true) {
            char c = '_';
            char c2 = '_';
            while (true) {
                switch (c) {
                    case '^':
                        if (c2 != '\'') {
                            break;
                        } else {
                            continue;
                        }
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                continue;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '^';
                c2 = '}';
            }
        }
        if (!C3470e.m10697a()) {
            if (bVar != null) {
                bVar.mo18497a(1000, C3924h.h1659536876613dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
            }
        } else if (jSONObject != null && bVar != null) {
            JSONObject a = C2888a.m8062a(jSONObject);
            C2849d b = C3792d.m12395a().mo20615b().mo17683b();
            try {
                b.mo17711a(C3150d.m9112a(b, C3898x.m12802g(C3924h.h1659536876613dc("/`rj+db(}gcdb\"}k{>`vctdsGosyr1mEVCQ@\n"))));
            } catch (Exception e) {
                e.printStackTrace();
            }
            b.mo17721c(a.toString());
            b.mo17719a((C2842a) new C2842a() {
                /* JADX WARNING: Can't wrap try/catch for region: R(8:5|6|(1:8)|9|(3:11|12|13)|14|15|(2:17|18)(2:19|(2:21|22)(2:23|35))) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ JSONException -> 0x0073 }] */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[Catch:{ JSONException -> 0x0073 }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo17693a(com.bytedance.sdk.component.p118e.p120b.C2848c r4, com.bytedance.sdk.component.p118e.C2843b r5) {
                    /*
                        r3 = this;
                        if (r5 == 0) goto L_0x009f
                        boolean r4 = r5.mo17701f()
                        if (r4 == 0) goto L_0x007a
                        java.lang.String r4 = r5.mo17699d()
                        java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                        boolean r4 = android.text.TextUtils.isEmpty(r4)
                        if (r4 != 0) goto L_0x007a
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = r5.mo17699d()     // Catch:{ JSONException -> 0x0073 }
                        r4.<init>(r5)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = "cxrkaw"
                        java.lang.String r5 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r5)     // Catch:{ JSONException -> 0x0073 }
                        r0 = -1
                        int r5 = r4.optInt(r5, r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x0073 }
                        r1 = 0
                        r2 = 3
                        if (r5 != r2) goto L_0x003a
                        java.lang.String r1 = com.bytedance.sdk.component.utils.C2888a.m8064b(r0)     // Catch:{ JSONException -> 0x0073 }
                    L_0x003a:
                        r5 = r1
                        java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ JSONException -> 0x0073 }
                        boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x0049
                        org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0049 }
                        r5.<init>(r1)     // Catch:{ all -> 0x0049 }
                        r4 = r5
                    L_0x0049:
                        com.bytedance.sdk.openadsdk.core.o$b r4 = com.bytedance.sdk.openadsdk.core.C3562o.C3573b.m11295a(r4)     // Catch:{ JSONException -> 0x0073 }
                        int r5 = r4.f9028a     // Catch:{ JSONException -> 0x0073 }
                        r0 = 20000(0x4e20, float:2.8026E-41)
                        if (r5 == r0) goto L_0x0061
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        int r0 = r4.f9028a     // Catch:{ JSONException -> 0x0073 }
                        int r4 = r4.f9028a     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3446g.m10553a(r4)     // Catch:{ JSONException -> 0x0073 }
                        r5.mo18497a(r0, r4)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x0061:
                        com.bytedance.sdk.openadsdk.core.e.s r5 = r4.f9030c     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x006d
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C3562o.this     // Catch:{ JSONException -> 0x0073 }
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r4.m11240a((com.bytedance.sdk.openadsdk.core.C3516n.C3518b) r5)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x006d:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r5.mo18498a(r4)     // Catch:{ JSONException -> 0x0073 }
                        goto L_0x00a6
                    L_0x0073:
                        r4 = move-exception
                        org.json.JSONException r4 = (org.json.JSONException) r4
                        r4.printStackTrace()
                        goto L_0x009f
                    L_0x007a:
                        r4 = -2
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3446g.m10553a(r4)
                        int r0 = r5.mo17695a()
                        boolean r1 = r5.mo17701f()
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r1 = r5.mo17697b()
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r4 = r5.mo17697b()
                    L_0x0099:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r5.mo18497a(r0, r4)
                        goto L_0x00a6
                    L_0x009f:
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C3562o.this
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r4.m11240a((com.bytedance.sdk.openadsdk.core.C3516n.C3518b) r5)
                    L_0x00a6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3562o.C35708.mo17693a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                    bVar.mo18497a(-2, iOException.getMessage());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo19987a(JSONObject jSONObject, String str) {
        m11258b(jSONObject, str);
    }

    /* renamed from: b */
    public C3099i mo19988b(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (!C3470e.m10697a() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        JSONObject a = C2888a.m8062a(jSONObject);
        C2849d b = C3792d.m12395a().mo20615b().mo17683b();
        try {
            b.mo17711a(C3898x.m12802g(C2857d.d1659536876571dc("/`rj+db(}gcdb\"}k{>aguae8zxnxt2")));
            b.mo17721c(a.toString());
            b.mo17714b(C2857d.d1659536876571dc("Urgq)Dabf}"), C3898x.m12768b());
        } catch (Exception unused) {
        }
        C2843b a2 = b.mo17718a();
        String d1659536876571dc = C2857d.d1659536876571dc("esplv%sicge|b");
        boolean z3 = false;
        if (a2 == null) {
            try {
                return new C3099i(false, 0, d1659536876571dc, false);
            } catch (Throwable unused2) {
                i2 = 0;
                z2 = false;
                z = z3;
                i = i2;
                return new C3099i(z2, i, d1659536876571dc, z);
            }
        } else {
            z = true;
            if (!a2.mo17701f() || TextUtils.isEmpty(a2.mo17699d())) {
                z2 = false;
                z = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(a2.mo17699d());
                int optInt = jSONObject2.optInt(C2857d.d1659536876571dc("cnff"), -1);
                d1659536876571dc = jSONObject2.optString(C2857d.d1659536876571dc("d`vb"), "");
                z2 = optInt == 20000;
                if (optInt != 60005) {
                    z = false;
                }
            }
            try {
                i = a2.mo17695a();
                if (!a2.mo17701f()) {
                    d1659536876571dc = a2.mo17697b();
                }
            } catch (Throwable unused3) {
                i2 = 0;
                z3 = z;
                z = z3;
                i = i2;
                return new C3099i(z2, i, d1659536876571dc, z);
            }
            return new C3099i(z2, i, d1659536876571dc, z);
        }
    }
}
