package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4284v;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.q */
public final class C4511q extends C4496k {

    /* renamed from: com.fyber.inneractive.sdk.network.q$b */
    public static class C4514b {

        /* renamed from: a */
        public JSONObject f11177a = new JSONObject();

        /* renamed from: a */
        public C4514b mo24695a(String str, Object obj) {
            try {
                this.f11177a.put(str, obj);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    public C4511q(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(C4203a.m13187b());
        mo24686a("osn", APSAnalytics.OS_NAME);
        mo24686a("osv", Build.VERSION.RELEASE);
        mo24686a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C5290k.m16490h());
        mo24686a("sdkv", str7 == null ? "8.1.5" : str7);
        mo24686a("pkgn", C5290k.m16493k());
        mo24686a("pkgv", C5290k.m16494l());
        mo24686a("appid", str);
        mo24686a("session", str2);
        mo24686a("adnt", str3);
        mo24686a("adnt_id", l);
        mo24686a(CampaignEx.JSON_KEY_CREATIVE_ID, str4);
        mo24686a("adomain", str5);
        mo24686a("campaign_id", str6);
    }

    /* renamed from: com.fyber.inneractive.sdk.network.q$a */
    public static class C4512a {

        /* renamed from: h */
        public static final SimpleDateFormat f11161h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        /* renamed from: a */
        public InneractiveAdRequest f11162a;

        /* renamed from: b */
        public C4507o f11163b;

        /* renamed from: c */
        public C4509p f11164c;

        /* renamed from: d */
        public JSONArray f11165d;

        /* renamed from: e */
        public C5233e f11166e;

        /* renamed from: f */
        public JSONArray f11167f;

        /* renamed from: g */
        public boolean f11168g;

        /* renamed from: com.fyber.inneractive.sdk.network.q$a$a */
        public class C4513a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4511q f11169a;

            /* renamed from: b */
            public final /* synthetic */ String f11170b;

            /* renamed from: c */
            public final /* synthetic */ String f11171c;

            /* renamed from: d */
            public final /* synthetic */ String f11172d;

            /* renamed from: e */
            public final /* synthetic */ String f11173e;

            /* renamed from: f */
            public final /* synthetic */ Object f11174f;

            /* renamed from: g */
            public final /* synthetic */ String f11175g;

            public C4513a(C4511q qVar, String str, String str2, String str3, String str4, Object obj, String str5) {
                this.f11169a = qVar;
                this.f11170b = str;
                this.f11171c = str2;
                this.f11172d = str3;
                this.f11173e = str4;
                this.f11174f = obj;
                this.f11175g = str5;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a4, code lost:
                r1 = r0.f11051b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    java.lang.String r1 = r11.f11170b
                    java.lang.String r2 = "contentid"
                    r0.mo24686a(r2, r1)
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    java.lang.String r1 = r11.f11171c
                    java.lang.String r2 = "fairbidv"
                    r0.mo24686a(r2, r1)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.o r1 = r0.f11163b
                    java.lang.String r2 = "%s %s"
                    r3 = 2
                    r4 = 0
                    r5 = 0
                    r6 = 1
                    if (r1 == 0) goto L_0x0059
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    int r1 = r1.f11131a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.String r7 = "err"
                    r0.mo24686a(r7, r1)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.o r0 = r0.f11163b
                    r0.getClass()
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.o r1 = r1.f11163b
                    r0[r5] = r1
                    java.lang.String r1 = "Event dispatcher - dispatching error: %s"
                    com.fyber.inneractive.sdk.util.IAlog.m16446a(r1, r0)
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f13936a
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    java.lang.String r1 = "DISPATCHED_SDK_ERROR"
                    r0[r5] = r1
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.o r1 = r1.f11163b
                    int r1 = r1.f11131a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r6] = r1
                    com.fyber.inneractive.sdk.util.IAlog.m16444a(r6, r4, r2, r0)
                    java.lang.String r0 = "sdk_error_"
                    goto L_0x0099
                L_0x0059:
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11164c
                    if (r0 == 0) goto L_0x0098
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    int r0 = r0.f11158a
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r7 = "event"
                    r1.mo24686a(r7, r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11164c
                    r0.getClass()
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.p r1 = r1.f11164c
                    r0[r5] = r1
                    java.lang.String r1 = "Event dispatcher - dispatching event: %s"
                    com.fyber.inneractive.sdk.util.IAlog.m16446a(r1, r0)
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f13936a
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    java.lang.String r1 = "DISPATCHED_SDK_EVENT"
                    r0[r5] = r1
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.p r1 = r1.f11164c
                    int r1 = r1.f11158a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r6] = r1
                    com.fyber.inneractive.sdk.util.IAlog.m16444a(r6, r4, r2, r0)
                    java.lang.String r0 = "sdk_event_"
                    goto L_0x0099
                L_0x0098:
                    r0 = r4
                L_0x0099:
                    java.lang.String r1 = r11.f11172d
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00aa
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.String r2 = r11.f11172d
                    java.lang.String r7 = "placement_type"
                    r1.mo24686a(r7, r2)
                L_0x00aa:
                    java.lang.String r1 = r11.f11173e
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00bb
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.String r2 = r11.f11173e
                    java.lang.String r7 = "spot_id"
                    r1.mo24686a(r7, r2)
                L_0x00bb:
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.String r2 = com.fyber.inneractive.sdk.util.C5290k.m16489g()
                    java.lang.String r7 = "ciso"
                    r1.mo24686a(r7, r2)
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.Object r2 = r11.f11174f
                    java.lang.String r7 = "ad_type"
                    r1.mo24686a(r7, r2)
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    boolean r1 = r1.f11168g
                    if (r1 == 0) goto L_0x00e3
                    java.lang.String r1 = r11.f11175g
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00e3
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.String r2 = r11.f11175g
                    r1.f11052c = r2
                L_0x00e3:
                    java.lang.String r1 = "UTC"
                    java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                    java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11169a
                    com.fyber.inneractive.sdk.util.k0 r7 = com.fyber.inneractive.sdk.util.C5291k0.m16498f()
                    java.lang.String r7 = r7.f14014a
                    java.lang.String r8 = "n"
                    r2.mo24686a(r8, r7)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11169a
                    long r7 = r1.getTimeInMillis()
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    java.lang.String r8 = "date_created"
                    r2.mo24686a(r8, r7)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11169a     // Catch:{ all -> 0x011a }
                    java.lang.String r7 = "day"
                    java.text.SimpleDateFormat r8 = com.fyber.inneractive.sdk.network.C4511q.C4512a.f11161h     // Catch:{ all -> 0x011a }
                    java.util.Date r9 = r1.getTime()     // Catch:{ all -> 0x011a }
                    java.lang.String r8 = r8.format(r9)     // Catch:{ all -> 0x011a }
                    r2.mo24686a(r7, r8)     // Catch:{ all -> 0x011a }
                L_0x011a:
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11169a
                    r7 = 11
                    int r1 = r1.get(r7)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.String r7 = "hour"
                    r2.mo24686a(r7, r1)
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11169a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.network.o r7 = r0.f11163b
                    if (r7 == 0) goto L_0x0142
                    int r0 = r7.f11131a
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    goto L_0x014a
                L_0x0142:
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11164c
                    int r0 = r0.f11158a
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                L_0x014a:
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    java.lang.String r2 = "table"
                    r1.mo24686a(r2, r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    org.json.JSONArray r0 = r0.f11165d
                    if (r0 == 0) goto L_0x016d
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x016d
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    org.json.JSONArray r1 = r1.f11165d
                    java.lang.String r2 = "experiments"
                    r0.mo24686a(r2, r1)
                L_0x016d:
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    com.fyber.inneractive.sdk.response.e r0 = r0.f11166e
                    if (r0 == 0) goto L_0x0180
                    boolean r0 = r0.f13864A
                    if (r0 == 0) goto L_0x0180
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    java.lang.String r1 = "sdk_bidding"
                    java.lang.String r2 = "1"
                    r0.mo24686a(r1, r2)
                L_0x0180:
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    org.json.JSONArray r0 = r0.f11167f
                    if (r0 == 0) goto L_0x0197
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0197
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4511q.C4512a.this
                    org.json.JSONArray r1 = r1.f11167f
                    java.lang.String r2 = "extra"
                    r0.mo24686a(r2, r1)
                L_0x0197:
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11169a
                    r0.getClass()
                    java.lang.String r1 = r0.f11050a
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x01b0
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r0.f11051b
                    if (r1 == 0) goto L_0x01b0
                    int r1 = r1.size()
                    if (r1 == 0) goto L_0x01b0
                    r1 = r6
                    goto L_0x01b1
                L_0x01b0:
                    r1 = r5
                L_0x01b1:
                    if (r1 == 0) goto L_0x025b
                    com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
                    com.fyber.inneractive.sdk.network.c r1 = r1.f10332G
                    r1.getClass()
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.util.Map<java.lang.String, java.lang.Object> r7 = r0.f11051b
                    java.util.Set r8 = r7.keySet()
                    java.util.Iterator r8 = r8.iterator()
                L_0x01c9:
                    boolean r9 = r8.hasNext()
                    if (r9 == 0) goto L_0x01df
                    java.lang.Object r9 = r8.next()
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object r10 = r7.get(r9)
                    if (r10 == 0) goto L_0x01c9
                    r2.put(r9, r10)     // Catch:{ JSONException -> 0x01c9 }
                    goto L_0x01c9
                L_0x01df:
                    java.lang.String r0 = r0.f11052c
                    if (r0 == 0) goto L_0x021e
                    int r7 = r0.length()
                    r8 = 51200(0xc800, float:7.1746E-41)
                    if (r7 <= r8) goto L_0x0210
                    java.lang.String r9 = "iawrapper"
                    int r9 = r0.indexOf(r9)
                    r10 = -1
                    if (r9 != r10) goto L_0x01f6
                    r9 = r5
                L_0x01f6:
                    r10 = 51199(0xc7ff, float:7.1745E-41)
                    java.lang.String r0 = r0.substring(r9, r10)
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r9[r5] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                    r9[r6] = r7
                    java.lang.String r7 = "Sdk event dispatcher: message size %d is too long! trimming message to %d Characters"
                    com.fyber.inneractive.sdk.util.IAlog.m16446a(r7, r9)
                L_0x0210:
                    java.lang.String r7 = "ad"
                    r2.put(r7, r0)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x021e
                L_0x0216:
                    r0 = move-exception
                    java.lang.Object[] r7 = new java.lang.Object[r5]
                    java.lang.String r8 = "Failed inserting ad body to json"
                    com.fyber.inneractive.sdk.util.IAlog.m16445a(r8, r0, r7)
                L_0x021e:
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f13936a
                    int r7 = com.fyber.inneractive.sdk.util.IAlog.f13936a
                    if (r0 != r6) goto L_0x0235
                    java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0235 }
                    java.lang.String r7 = "%s, Event: %s"
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0235 }
                    java.lang.String r8 = "SDK_EVENT"
                    r3[r5] = r8     // Catch:{ all -> 0x0235 }
                    r3[r6] = r0     // Catch:{ all -> 0x0235 }
                    com.fyber.inneractive.sdk.util.IAlog.m16444a(r6, r4, r7, r3)     // Catch:{ all -> 0x0235 }
                L_0x0235:
                    java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r1.f10998a
                    r0.offer(r2)
                    java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r1.f10998a
                    int r0 = r0.size()
                    r2 = 30
                    if (r0 <= r2) goto L_0x025b
                    android.os.Handler r0 = r1.f11001d
                    r2 = 12312329(0xbbdf09, float:1.7253248E-38)
                    if (r0 == 0) goto L_0x0256
                    boolean r0 = r0.hasMessages(r2)
                    if (r0 == 0) goto L_0x0256
                    android.os.Handler r0 = r1.f11001d
                    r0.removeMessages(r2)
                L_0x0256:
                    r3 = 0
                    r1.mo24658a(r2, r3)
                L_0x025b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4511q.C4512a.C4513a.run():void");
            }
        }

        public C4512a(C4507o oVar, InneractiveAdRequest inneractiveAdRequest, C5233e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f11163b = oVar;
            this.f11162a = inneractiveAdRequest;
            this.f11165d = null;
        }

        /* renamed from: a */
        public C4512a mo24692a(Object... objArr) {
            if (objArr.length > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    String obj = objArr[i].toString();
                    Object obj2 = objArr[i + 1];
                    try {
                        jSONObject.put(obj, obj2);
                    } catch (Exception unused) {
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", obj, obj2);
                    }
                }
                this.f11167f.put(jSONObject);
            }
            return this;
        }

        public C4512a(C4509p pVar, InneractiveAdRequest inneractiveAdRequest, C5233e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f11164c = pVar;
            this.f11162a = inneractiveAdRequest;
            this.f11165d = null;
        }

        public C4512a(C5233e eVar) {
            this.f11168g = false;
            this.f11166e = eVar;
            this.f11167f = new JSONArray();
        }

        /* renamed from: a */
        public void mo24693a(String str) {
            String str2;
            String str3;
            String str4;
            Long l;
            String str5;
            String str6;
            String str7;
            String str8;
            UnitDisplayType unitDisplayType;
            Integer num;
            String str9;
            boolean z;
            boolean z2;
            UnitDisplayType unitDisplayType2;
            UnitDisplayType unitDisplayType3;
            C5233e eVar = this.f11166e;
            if (eVar != null) {
                ImpressionData impressionData = eVar.f13882r;
                String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
                ImpressionData impressionData2 = this.f11166e.f13882r;
                String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
                ImpressionData impressionData3 = this.f11166e.f13882r;
                Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
                ImpressionData impressionData4 = this.f11166e.f13882r;
                String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
                ImpressionData impressionData5 = this.f11166e.f13882r;
                String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
                ImpressionData impressionData6 = this.f11166e.f13882r;
                if (impressionData6 != null) {
                    str6 = impressionId;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                    str2 = impressionData6.getCampaignId();
                } else {
                    str6 = impressionId;
                    str2 = null;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                }
            } else {
                str6 = null;
                str5 = null;
                l = null;
                str4 = null;
                str3 = null;
                str2 = null;
            }
            IAConfigManager iAConfigManager = IAConfigManager.f10324J;
            C4511q qVar = new C4511q(iAConfigManager.f10337c, str6, str5, l, str4, str3, str2, str);
            InneractiveAdRequest inneractiveAdRequest = this.f11162a;
            C4288z selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                C4287y yVar = (C4287y) selectedUnitConfig;
                C4284v vVar = yVar.f10547d;
                Track track = Track.ERRORS;
                Set<Track> set = vVar.f10540a;
                if (set == null) {
                    z = false;
                } else {
                    z = set.contains(track);
                }
                if (z) {
                    C4269r rVar = yVar.f10546c;
                    if (rVar == null || (unitDisplayType3 = rVar.f10490b) == null) {
                        C4204a0 a0Var = yVar.f10549f;
                        z2 = (a0Var == null || (unitDisplayType2 = a0Var.f10378j) == null) ? false : unitDisplayType2.isDeprecated();
                    } else {
                        z2 = unitDisplayType3.isDeprecated();
                    }
                    if (z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C5233e eVar2 = this.f11166e;
            if (eVar2 == null) {
                str7 = null;
            } else {
                str7 = eVar2.f13868d;
            }
            if (TextUtils.isEmpty(iAConfigManager.f10355u)) {
                str8 = null;
            } else {
                str8 = iAConfigManager.f10355u;
            }
            if (this.f11163b == null && this.f11164c == null) {
                IAlog.m16446a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.f11162a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f10347m)) {
                sb.append(iAConfigManager.f10347m);
                sb.append("_");
            }
            C5233e eVar3 = this.f11166e;
            if (eVar3 == null) {
                unitDisplayType = null;
            } else {
                unitDisplayType = eVar3.f13878n;
            }
            sb.append(unitDisplayType != null ? unitDisplayType.toString() : "unknown");
            String sb2 = sb.toString();
            C5233e eVar4 = this.f11166e;
            if (eVar4 == null) {
                num = null;
            } else {
                num = Integer.valueOf(eVar4.f13871g);
            }
            C5233e eVar5 = this.f11166e;
            if (eVar5 == null) {
                str9 = "";
            } else {
                str9 = eVar5.f13872h;
            }
            C5299n.m16520a(new C4513a(qVar, str7, str8, sb2, spotId, num, str9));
        }
    }
}
