package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8465j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.p304e.C8493b;
import com.mbridge.msdk.foundation.same.p304e.C8495c;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbnative.p332a.C8798b;
import com.mbridge.msdk.mbnative.p332a.C8799c;
import com.mbridge.msdk.mbnative.p333b.C8800a;
import com.mbridge.msdk.mbnative.p336e.p337a.C8843b;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.OnImageLoadListener;
import com.mbridge.msdk.p076b.p077a.C2436a;
import com.mbridge.msdk.p078c.C2452c;
import com.mbridge.msdk.p078c.C2456d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbnative.controller.b */
/* compiled from: NativePreloadController */
public class C8825b {

    /* renamed from: d */
    private static final String f21741d = C8825b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Map<String, Map<Long, Object>> f21742e = new HashMap();

    /* renamed from: f */
    private static Map<String, Boolean> f21743f = new HashMap();

    /* renamed from: g */
    private static Map<String, C8465j> f21744g = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Map<String, Integer> f21745h = new HashMap();

    /* renamed from: i */
    private static Map<String, Integer> f21746i = new HashMap();

    /* renamed from: j */
    private static C8825b f21747j = null;

    /* renamed from: u */
    private static int f21748u = -1;

    /* renamed from: v */
    private static int f21749v = -2;

    /* renamed from: a */
    Queue<Integer> f21750a = null;

    /* renamed from: b */
    Queue<Long> f21751b = null;

    /* renamed from: c */
    protected List<Integer> f21752c;

    /* renamed from: k */
    private C2452c f21753k;

    /* renamed from: l */
    private C6765a f21754l;

    /* renamed from: m */
    private C2456d f21755m;

    /* renamed from: n */
    private String f21756n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f21757o;

    /* renamed from: p */
    private int f21758p = 0;

    /* renamed from: q */
    private Map<String, Object> f21759q;

    /* renamed from: r */
    private List<Integer> f21760r;

    /* renamed from: s */
    private List<Integer> f21761s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f21762t;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f21763w;

    /* renamed from: x */
    private int f21764x;

    /* renamed from: y */
    private int f21765y;

    /* renamed from: z */
    private C8493b f21766z = new C8493b(C8388a.m23845e().mo56913g());

    public C8825b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f21757o = new Handler() {
            public final void handleMessage(Message message) {
            }
        };
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24878d(f21741d, "init cam cache failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24878d(f21741d, "ADNUM MUST BE INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017d, code lost:
        r3 = r0.get(com.mbridge.msdk.MBridgeConstans.PRELOAD_RESULT_LISTENER);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x0416 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0165 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02e9 A[Catch:{ Exception -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f3 A[Catch:{ Exception -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0319 A[Catch:{ all -> 0x0416 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x041e A[Catch:{ Exception -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0224 A[Catch:{ Exception -> 0x0427 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58520a(java.util.Map<java.lang.String, java.lang.Object> r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r0 = r24
            r12 = r25
            java.lang.String r13 = "native_info"
            java.lang.String r14 = "com.mbridge.msdk.videocommon.download.c"
            java.lang.String r1 = "app_key"
            java.lang.String r2 = "app_id"
            java.lang.String r3 = "preload_result_listener"
            java.lang.String r4 = "ad_num"
            java.lang.String r5 = "catetory"
            java.lang.String r6 = "ad_frame_num"
            java.lang.String r7 = "isPreloadImg"
            java.lang.String r8 = "unit_id"
            java.lang.String r9 = "_"
            r11.f21759q = r0     // Catch:{ Exception -> 0x0427 }
            r15 = 0
            r11.f21763w = r15     // Catch:{ Exception -> 0x0427 }
            boolean r10 = r0.containsKey(r8)     // Catch:{ Exception -> 0x0427 }
            if (r10 != 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x0427 }
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0427 }
            int r8 = r12 + 1
            r16 = 2
            int r8 = r8 % 2
            java.util.Map<java.lang.String, java.util.Map<java.lang.Long, java.lang.Object>> r15 = f21742e     // Catch:{ Exception -> 0x0427 }
            r17 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0427 }
            r13.<init>()     // Catch:{ Exception -> 0x0427 }
            r13.append(r8)     // Catch:{ Exception -> 0x0427 }
            r13.append(r9)     // Catch:{ Exception -> 0x0427 }
            r13.append(r10)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = r13.toString()     // Catch:{ Exception -> 0x0427 }
            boolean r8 = r15.containsKey(r8)     // Catch:{ Exception -> 0x0427 }
            if (r8 == 0) goto L_0x006c
            java.util.Map<java.lang.String, java.util.Map<java.lang.Long, java.lang.Object>> r8 = f21742e     // Catch:{ Exception -> 0x0427 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0427 }
            r13.<init>()     // Catch:{ Exception -> 0x0427 }
            r13.append(r12)     // Catch:{ Exception -> 0x0427 }
            r13.append(r9)     // Catch:{ Exception -> 0x0427 }
            r13.append(r10)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0427 }
            boolean r8 = r8.containsKey(r13)     // Catch:{ Exception -> 0x0427 }
            if (r8 != 0) goto L_0x006c
            return
        L_0x006c:
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0427 }
            if (r8 == 0) goto L_0x0073
            return
        L_0x0073:
            boolean r8 = r0.containsKey(r7)     // Catch:{ Exception -> 0x0427 }
            if (r8 == 0) goto L_0x0085
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x0427 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0427 }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0427 }
            r11.f21762t = r7     // Catch:{ Exception -> 0x0427 }
        L_0x0085:
            com.mbridge.msdk.click.a r7 = r11.f21754l     // Catch:{ Exception -> 0x0427 }
            if (r7 != 0) goto L_0x0099
            com.mbridge.msdk.click.a r7 = new com.mbridge.msdk.click.a     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0427 }
            android.content.Context r8 = r8.mo56913g()     // Catch:{ Exception -> 0x0427 }
            r7.<init>(r8, r10)     // Catch:{ Exception -> 0x0427 }
            r11.f21754l = r7     // Catch:{ Exception -> 0x0427 }
            goto L_0x009e
        L_0x0099:
            com.mbridge.msdk.click.a r7 = r11.f21754l     // Catch:{ Exception -> 0x0427 }
            r7.mo37045a((java.lang.String) r10)     // Catch:{ Exception -> 0x0427 }
        L_0x009e:
            boolean r7 = r0.containsKey(r6)     // Catch:{ Exception -> 0x0427 }
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0427 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0427 }
            r11.f21758p = r6     // Catch:{ Exception -> 0x0427 }
        L_0x00b0:
            boolean r6 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0427 }
            if (r6 == 0) goto L_0x00be
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0427 }
            r11.f21756n = r5     // Catch:{ Exception -> 0x0427 }
        L_0x00be:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = f21743f     // Catch:{ Exception -> 0x0427 }
            boolean r5 = r5.containsKey(r10)     // Catch:{ Exception -> 0x0427 }
            r13 = 1
            if (r5 == 0) goto L_0x013b
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = f21743f     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ Exception -> 0x0427 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x0427 }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0427 }
            if (r5 == 0) goto L_0x013b
            java.util.Map<java.lang.String, java.util.Map<java.lang.Long, java.lang.Object>> r5 = f21742e     // Catch:{ Exception -> 0x0427 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0427 }
            r6.<init>()     // Catch:{ Exception -> 0x0427 }
            r6.append(r12)     // Catch:{ Exception -> 0x0427 }
            r6.append(r9)     // Catch:{ Exception -> 0x0427 }
            r6.append(r10)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r6 = r5.get(r6)     // Catch:{ Exception -> 0x0427 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.b r7 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = r8.mo56914h()     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.a r7 = r7.mo16286b(r8)     // Catch:{ Exception -> 0x0427 }
            if (r6 == 0) goto L_0x013b
            int r8 = r6.size()     // Catch:{ Exception -> 0x0427 }
            if (r8 <= 0) goto L_0x013b
            java.util.Set r6 = r6.keySet()     // Catch:{ Exception -> 0x0427 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r6 = r6.next()     // Catch:{ Exception -> 0x0427 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0427 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0427 }
            if (r7 != 0) goto L_0x0123
            com.mbridge.msdk.c.b r7 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.a r7 = r7.mo16285b()     // Catch:{ Exception -> 0x0427 }
        L_0x0123:
            long r18 = r7.mo16162Q()     // Catch:{ Exception -> 0x0427 }
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r20
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x0427 }
            long r8 = r8 - r6
            int r6 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r6 < 0) goto L_0x0138
            r5.remove(r10)     // Catch:{ Exception -> 0x0427 }
            goto L_0x013b
        L_0x0138:
            if (r12 != r13) goto L_0x013b
            return
        L_0x013b:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = f21743f     // Catch:{ Exception -> 0x0427 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x0427 }
            r5.put(r10, r6)     // Catch:{ Exception -> 0x0427 }
            r11.f21765y = r13     // Catch:{ Exception -> 0x0427 }
            boolean r5 = r0.containsKey(r4)     // Catch:{ Exception -> 0x0165 }
            if (r5 == 0) goto L_0x016c
            java.lang.Object r4 = r0.get(r4)     // Catch:{ Exception -> 0x0165 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0165 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0165 }
            r11.f21765y = r4     // Catch:{ Exception -> 0x0165 }
            if (r4 >= r13) goto L_0x015c
            r11.f21765y = r13     // Catch:{ Exception -> 0x0165 }
        L_0x015c:
            int r4 = r11.f21765y     // Catch:{ Exception -> 0x0165 }
            r5 = 10
            if (r4 <= r5) goto L_0x016c
            r11.f21765y = r5     // Catch:{ Exception -> 0x0165 }
            goto L_0x016c
        L_0x0165:
            java.lang.String r4 = f21741d     // Catch:{ Exception -> 0x0427 }
            java.lang.String r5 = "ADNUM MUST BE INTEGER"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r4, r5)     // Catch:{ Exception -> 0x0427 }
        L_0x016c:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f21745h     // Catch:{ Exception -> 0x0427 }
            int r5 = r11.f21765y     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0427 }
            r4.put(r10, r5)     // Catch:{ Exception -> 0x0427 }
            boolean r4 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0427 }
            if (r4 == 0) goto L_0x018c
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x0427 }
            if (r3 == 0) goto L_0x018c
            com.mbridge.msdk.out.PreloadListener r3 = (com.mbridge.msdk.out.PreloadListener) r3     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.b.a.a r4 = new com.mbridge.msdk.b.a.a     // Catch:{ Exception -> 0x0427 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0427 }
            r9 = r4
            goto L_0x018d
        L_0x018c:
            r9 = 0
        L_0x018d:
            boolean r3 = r0.containsKey(r2)     // Catch:{ Exception -> 0x0427 }
            if (r3 == 0) goto L_0x01ae
            boolean r3 = r0.containsKey(r1)     // Catch:{ Exception -> 0x0427 }
            if (r3 == 0) goto L_0x01ae
            java.lang.String r3 = "key_word"
            boolean r3 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0427 }
            if (r3 == 0) goto L_0x01ae
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0427 }
            goto L_0x01b0
        L_0x01ae:
            r1 = 0
            r2 = 0
        L_0x01b0:
            com.mbridge.msdk.c.c r3 = r11.f21753k     // Catch:{ Exception -> 0x0427 }
            if (r3 != 0) goto L_0x01bb
            com.mbridge.msdk.c.c r3 = new com.mbridge.msdk.c.c     // Catch:{ Exception -> 0x0427 }
            r3.<init>()     // Catch:{ Exception -> 0x0427 }
            r11.f21753k = r3     // Catch:{ Exception -> 0x0427 }
        L_0x01bb:
            com.mbridge.msdk.c.c r3 = r11.f21753k     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0427 }
            android.content.Context r4 = r4.mo56913g()     // Catch:{ Exception -> 0x0427 }
            r3.mo16303a((android.content.Context) r4, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r10)     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.d r1 = r1.mo16292e(r2, r10)     // Catch:{ Exception -> 0x0427 }
            r11.f21755m = r1     // Catch:{ Exception -> 0x0427 }
            if (r1 != 0) goto L_0x01da
            com.mbridge.msdk.c.d r1 = com.mbridge.msdk.p078c.C2456d.m6070d(r10)     // Catch:{ Exception -> 0x0427 }
            r11.f21755m = r1     // Catch:{ Exception -> 0x0427 }
        L_0x01da:
            java.lang.String r1 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0427 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = ""
            if (r1 == 0) goto L_0x01fe
            java.lang.String r1 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0427 }
            if (r1 == 0) goto L_0x01fe
            java.lang.String r1 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0427 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0427 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0427 }
            if (r2 == 0) goto L_0x01fb
            goto L_0x01fe
        L_0x01fb:
            r18 = r1
            goto L_0x0200
        L_0x01fe:
            r18 = r8
        L_0x0200:
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            java.util.List r1 = r1.mo16326q()     // Catch:{ Exception -> 0x0427 }
            r11.f21760r = r1     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            java.util.List r1 = r1.mo16327r()     // Catch:{ Exception -> 0x0427 }
            r11.f21752c = r1     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            java.util.List r1 = r1.mo16327r()     // Catch:{ Exception -> 0x0427 }
            r11.f21761s = r1     // Catch:{ Exception -> 0x0427 }
            java.util.List<java.lang.Integer> r1 = r11.f21760r     // Catch:{ Exception -> 0x0427 }
            if (r1 == 0) goto L_0x041e
            java.util.List<java.lang.Integer> r1 = r11.f21760r     // Catch:{ Exception -> 0x0427 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0427 }
            if (r1 <= 0) goto L_0x041e
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Exception -> 0x0427 }
            r1.<init>()     // Catch:{ Exception -> 0x0427 }
            r11.f21750a = r1     // Catch:{ Exception -> 0x0427 }
            java.util.List<java.lang.Integer> r1 = r11.f21760r     // Catch:{ Exception -> 0x0427 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0427 }
        L_0x0231:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0427 }
            if (r2 == 0) goto L_0x0243
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0427 }
            java.util.Queue<java.lang.Integer> r3 = r11.f21750a     // Catch:{ Exception -> 0x0427 }
            r3.add(r2)     // Catch:{ Exception -> 0x0427 }
            goto L_0x0231
        L_0x0243:
            java.util.List<java.lang.Integer> r1 = r11.f21761s     // Catch:{ Exception -> 0x0427 }
            if (r1 == 0) goto L_0x0279
            java.util.List<java.lang.Integer> r1 = r11.f21761s     // Catch:{ Exception -> 0x0427 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0427 }
            if (r1 <= 0) goto L_0x0279
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Exception -> 0x0427 }
            r1.<init>()     // Catch:{ Exception -> 0x0427 }
            r11.f21751b = r1     // Catch:{ Exception -> 0x0427 }
            java.util.List<java.lang.Integer> r1 = r11.f21761s     // Catch:{ Exception -> 0x0427 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0427 }
        L_0x025c:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0427 }
            if (r2 == 0) goto L_0x0279
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0427 }
            java.util.Queue<java.lang.Long> r3 = r11.f21751b     // Catch:{ Exception -> 0x0427 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0427 }
            int r2 = r2 * 1000
            long r4 = (long) r2     // Catch:{ Exception -> 0x0427 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0427 }
            r3.add(r2)     // Catch:{ Exception -> 0x0427 }
            goto L_0x025c
        L_0x0279:
            java.util.List<java.lang.Integer> r1 = r11.f21760r     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0427 }
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x0427 }
            if (r1 == 0) goto L_0x02d5
            if (r12 != 0) goto L_0x02d5
            java.util.List<java.lang.Integer> r1 = r11.f21752c     // Catch:{ Exception -> 0x02d5 }
            java.util.List<java.lang.Integer> r2 = r11.f21760r     // Catch:{ Exception -> 0x02d5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02d5 }
            int r2 = r2.indexOf(r3)     // Catch:{ Exception -> 0x02d5 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x02d5 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x02d5 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x02d5 }
            int r1 = r1 * 1000
            long r3 = (long) r1     // Catch:{ Exception -> 0x02d5 }
            r2 = 1
            com.mbridge.msdk.c.d r6 = r11.f21755m     // Catch:{ Exception -> 0x02d5 }
            r19 = 0
            r1 = r23
            r5 = r25
            r7 = r10
            r22 = r8
            r8 = r18
            r20 = r9
            r15 = r10
            r10 = r19
            r1.m25454a((int) r2, (long) r3, (int) r5, (com.mbridge.msdk.p078c.C2456d) r6, (java.lang.String) r7, (java.lang.String) r8, (com.mbridge.msdk.p076b.p077a.C2436a) r9, (boolean) r10)     // Catch:{ Exception -> 0x02d2 }
            com.mbridge.msdk.mbnative.a.b r1 = com.mbridge.msdk.mbnative.p332a.C8799c.m25351a(r13)     // Catch:{ Exception -> 0x02d2 }
            if (r1 == 0) goto L_0x02d2
            r2 = 0
            java.lang.Object r1 = r1.mo58484b(r15, r2)     // Catch:{ Exception -> 0x02d2 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x02d2 }
            if (r1 == 0) goto L_0x02d2
            int r1 = r1.size()     // Catch:{ Exception -> 0x02d2 }
            if (r1 <= 0) goto L_0x02d2
            r6 = r20
            r1 = 0
            r11.mo58521a((boolean) r13, (com.mbridge.msdk.p076b.p077a.C2436a) r6, (java.lang.String) r1)     // Catch:{ Exception -> 0x02d9 }
            goto L_0x02d9
        L_0x02d2:
            r6 = r20
            goto L_0x02d9
        L_0x02d5:
            r22 = r8
            r6 = r9
            r15 = r10
        L_0x02d9:
            com.mbridge.msdk.c.d r3 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            r1 = r23
            r2 = r25
            r4 = r15
            r5 = r18
            r1.m25456a((int) r2, (com.mbridge.msdk.p078c.C2456d) r3, (java.lang.String) r4, (java.lang.String) r5, (com.mbridge.msdk.p076b.p077a.C2436a) r6)     // Catch:{ Exception -> 0x0427 }
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            if (r1 == 0) goto L_0x02f3
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ Exception -> 0x0427 }
            int r1 = r1.mo16331u()     // Catch:{ Exception -> 0x0427 }
            int r2 = r11.f21765y     // Catch:{ Exception -> 0x0427 }
            int r1 = r1 * r2
            goto L_0x02f4
        L_0x02f3:
            r1 = r13
        L_0x02f4:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = f21746i     // Catch:{ Exception -> 0x0427 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0427 }
            r2.put(r15, r1)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r1 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0416 }
            java.lang.Class.forName(r14)     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0416 }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.mbnative.controller.C8832c.m25499a(r1, r15)     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.tools.C8666t.m24864b()     // Catch:{ all -> 0x0416 }
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0416 }
            if (r1 != 0) goto L_0x0431
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0416 }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.db.g r1 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r1)     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.db.e r1 = com.mbridge.msdk.foundation.p298db.C8410e.m23925a((com.mbridge.msdk.foundation.p298db.C8412f) r1)     // Catch:{ all -> 0x0416 }
            r1.mo56984a()     // Catch:{ all -> 0x0416 }
            r1 = r17
            boolean r2 = r0.containsKey(r1)     // Catch:{ all -> 0x0416 }
            if (r2 == 0) goto L_0x033b
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0416 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0416 }
            goto L_0x033c
        L_0x033b:
            r0 = 0
        L_0x033c:
            int r0 = r11.m25451a((java.lang.String) r0)     // Catch:{ all -> 0x0416 }
            if (r0 > 0) goto L_0x0344
            int r0 = r11.f21765y     // Catch:{ all -> 0x0416 }
        L_0x0344:
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x0416 }
            r2 = r22
            com.mbridge.msdk.c.d r1 = r1.mo16292e(r2, r15)     // Catch:{ all -> 0x0416 }
            r11.f21755m = r1     // Catch:{ all -> 0x0416 }
            if (r1 != 0) goto L_0x0358
            com.mbridge.msdk.c.d r1 = com.mbridge.msdk.p078c.C2456d.m6070d(r15)     // Catch:{ all -> 0x0416 }
            r11.f21755m = r1     // Catch:{ all -> 0x0416 }
        L_0x0358:
            com.mbridge.msdk.c.d r1 = r11.f21755m     // Catch:{ all -> 0x0416 }
            java.util.List r1 = r1.mo16326q()     // Catch:{ all -> 0x0416 }
            r11.f21760r = r1     // Catch:{ all -> 0x0416 }
            if (r1 == 0) goto L_0x0381
            int r1 = r1.size()     // Catch:{ all -> 0x0416 }
            if (r1 <= 0) goto L_0x0381
            java.util.List<java.lang.Integer> r1 = r11.f21760r     // Catch:{ all -> 0x0416 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0416 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0416 }
            if (r1 == 0) goto L_0x0381
            com.mbridge.msdk.mbnative.a.b r1 = com.mbridge.msdk.mbnative.p332a.C8799c.m25351a(r13)     // Catch:{ all -> 0x0416 }
            if (r1 == 0) goto L_0x0381
            java.lang.Object r0 = r1.mo58484b(r15, r0)     // Catch:{ all -> 0x0416 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0416 }
            goto L_0x0382
        L_0x0381:
            r0 = 0
        L_0x0382:
            if (r0 == 0) goto L_0x0431
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0416 }
            r1.<init>()     // Catch:{ all -> 0x0416 }
            r2 = 0
        L_0x038a:
            int r3 = r0.size()     // Catch:{ all -> 0x0416 }
            if (r2 >= r3) goto L_0x03a6
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3     // Catch:{ all -> 0x0416 }
            java.lang.String r4 = r3.getVideoUrlEncode()     // Catch:{ all -> 0x0416 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0416 }
            if (r4 != 0) goto L_0x03a3
            r1.add(r3)     // Catch:{ all -> 0x0416 }
        L_0x03a3:
            int r2 = r2 + 1
            goto L_0x038a
        L_0x03a6:
            int r0 = r1.size()     // Catch:{ all -> 0x0416 }
            if (r0 <= 0) goto L_0x0431
            java.lang.Class r0 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0416 }
            java.lang.String r2 = "getInstance"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0416 }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch:{ all -> 0x0416 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0416 }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch:{ all -> 0x0416 }
            java.lang.String r3 = "com.mbridge.msdk.videocommon.listener.a"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0416 }
            java.lang.String r4 = "createUnitCache"
            r5 = 5
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0416 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x0416 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r13] = r7     // Catch:{ all -> 0x0416 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r16] = r7     // Catch:{ all -> 0x0416 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0416 }
            r8 = 3
            r6[r8] = r7     // Catch:{ all -> 0x0416 }
            r7 = 4
            r6[r7] = r3     // Catch:{ all -> 0x0416 }
            java.lang.reflect.Method r3 = r0.getMethod(r4, r6)     // Catch:{ all -> 0x0416 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0416 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0416 }
            android.content.Context r5 = r5.mo56913g()     // Catch:{ all -> 0x0416 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0416 }
            r4[r13] = r15     // Catch:{ all -> 0x0416 }
            r4[r16] = r1     // Catch:{ all -> 0x0416 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0416 }
            r4[r8] = r1     // Catch:{ all -> 0x0416 }
            r1 = 0
            r4[r7] = r1     // Catch:{ all -> 0x0416 }
            r3.invoke(r2, r4)     // Catch:{ all -> 0x0416 }
            java.lang.String r1 = "load"
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ all -> 0x0416 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0416 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x0416 }
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x0416 }
            r1[r5] = r15     // Catch:{ all -> 0x0416 }
            r0.invoke(r2, r1)     // Catch:{ all -> 0x0416 }
            goto L_0x0431
        L_0x0416:
            java.lang.String r0 = f21741d     // Catch:{ Exception -> 0x0427 }
            java.lang.String r1 = "init cam cache failed"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r1)     // Catch:{ Exception -> 0x0427 }
            goto L_0x0431
        L_0x041e:
            r6 = r9
            if (r6 == 0) goto L_0x0426
            java.lang.String r0 = "don't have sorceList"
            r6.onPreloadFaild(r0)     // Catch:{ Exception -> 0x0427 }
        L_0x0426:
            return
        L_0x0427:
            r0 = move-exception
            java.lang.String r1 = f21741d
            java.lang.String r0 = com.mbridge.msdk.mbnative.p333b.C8800a.m25352a(r0)
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x0431:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.C8825b.mo58520a(java.util.Map, int):void");
    }

    /* renamed from: a */
    private int m25451a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(f21741d, C8800a.m25352a(e));
        }
        return 0;
    }

    /* renamed from: a */
    private void m25456a(int i, C2456d dVar, String str, String str2, C2436a aVar) {
        Queue<Integer> queue = this.f21750a;
        if (queue != null && queue.size() > 0) {
            try {
                int intValue = this.f21750a.poll().intValue();
                long j = (long) MBridgeConstans.REQUEST_TIME_OUT;
                if (this.f21751b != null && this.f21751b.size() > 0) {
                    j = this.f21751b.poll().longValue();
                }
                String str3 = f21741d;
                C8672v.m24876b(str3, "preload start queue adsource = " + intValue);
                m25455a(intValue, j, str, str2, this.f21759q, i, dVar, aVar);
            } catch (Throwable unused) {
                C8672v.m24878d(f21741d, "queue poll exception");
            }
        }
    }

    /* renamed from: a */
    private void m25455a(int i, long j, String str, String str2, Map<String, Object> map, int i2, C2456d dVar, C2436a aVar) {
        C8798b<String, List<Campaign>> a;
        int i3 = i;
        if (i3 == 1 || (a = C8799c.m25351a(i)) == null) {
            String str3 = str;
        } else {
            String str4 = str;
            List b = a.mo58484b(str, this.f21765y);
            if (b != null && b.size() > 0) {
                mo58521a(true, aVar, (String) null);
                return;
            }
        }
        C2436a aVar2 = aVar;
        if (i3 == 1) {
            m25454a(i, j, i2, dVar, str, str2, aVar, true);
        } else if (i3 != 2) {
            m25454a(i, j, i2, dVar, str, str2, aVar, false);
        } else {
            m25454a(2, j, i2, dVar, str, str2, aVar, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b1 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c0 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ed A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0302 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0325 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0328 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0377 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0382 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0447 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x044e A[Catch:{ Exception -> 0x0476 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25454a(int r25, long r26, int r28, com.mbridge.msdk.p078c.C2456d r29, java.lang.String r30, java.lang.String r31, com.mbridge.msdk.p076b.p077a.C2436a r32, boolean r33) {
        /*
            r24 = this;
            r8 = r24
            r1 = r25
            r9 = r28
            r10 = r30
            r7 = r31
            r11 = r32
            r12 = r33
            java.lang.String r2 = "native_video_height"
            java.lang.String r3 = "native_video_width"
            java.lang.String r0 = "app_key"
            java.lang.String r4 = "1"
            java.lang.String r5 = "native_info"
            java.lang.String r6 = "key_word"
            com.mbridge.msdk.foundation.controller.a r13 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            android.content.Context r13 = r13.mo56913g()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.db.g r13 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r13)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.db.e r13 = com.mbridge.msdk.foundation.p298db.C8410e.m23925a((com.mbridge.msdk.foundation.p298db.C8412f) r13)     // Catch:{ Exception -> 0x0476 }
            r13.mo56984a()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.c.d r13 = r8.f21755m     // Catch:{ Exception -> 0x0476 }
            int r13 = r13.mo16324o()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.c.d r14 = r8.f21755m     // Catch:{ Exception -> 0x0476 }
            int r14 = r14.mo16325p()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.mbnative.e.a.a r15 = new com.mbridge.msdk.mbnative.e.a.a     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.controller.a r16 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            r29 = r14
            android.content.Context r14 = r16.mo56913g()     // Catch:{ Exception -> 0x0476 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.same.net.g.d r14 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x0476 }
            r14.<init>()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.controller.a r16 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r16 = r16.mo56914h()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.controller.a r17 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r17 = r17.mo56916j()     // Catch:{ Exception -> 0x0476 }
            r18 = r15
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            r19 = r2
            java.lang.String r2 = "app_id"
            if (r15 == 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r15 = r15.containsKey(r2)     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r15 = r15.containsKey(r0)     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r15 = r15.containsKey(r6)     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r15 = r15.get(r6)     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r15 = r15.get(r2)     // Catch:{ Exception -> 0x0476 }
            boolean r15 = r15 instanceof java.lang.String     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x009b
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r15 = r15.get(r2)     // Catch:{ Exception -> 0x0476 }
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x0476 }
        L_0x009b:
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r15 = r15.get(r0)     // Catch:{ Exception -> 0x0476 }
            boolean r15 = r15 instanceof java.lang.String     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x00af
            java.util.Map<java.lang.String, java.lang.Object> r15 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r15.get(r0)     // Catch:{ Exception -> 0x0476 }
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x0476 }
        L_0x00af:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x00c2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0476 }
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0476 }
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = "smart"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8659q.m24801a(r0)     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r6, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x00d2:
            r0 = r16
            r6 = r17
            r14.mo57981a(r2, r0)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = "unit_id"
            r14.mo57981a(r2, r10)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = "req_type"
            r14.mo57981a(r2, r4)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = r8.f21756n     // Catch:{ Exception -> 0x0476 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0476 }
            if (r2 != 0) goto L_0x00f2
            java.lang.String r2 = "category"
            java.lang.String r15 = r8.f21756n     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r2, r15)     // Catch:{ Exception -> 0x0476 }
        L_0x00f2:
            boolean r2 = android.text.TextUtils.isEmpty(r31)     // Catch:{ Exception -> 0x0476 }
            if (r2 != 0) goto L_0x00fd
            java.lang.String r2 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r2, r7)     // Catch:{ Exception -> 0x0476 }
        L_0x00fd:
            java.lang.String r2 = "sign"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r15.<init>()     // Catch:{ Exception -> 0x0476 }
            r15.append(r0)     // Catch:{ Exception -> 0x0476 }
            r15.append(r6)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r2, r0)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = "only_impression"
            r14.mo57981a(r0, r4)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8677z.m24946g((java.lang.String) r30)     // Catch:{ Exception -> 0x0476 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0476 }
            if (r2 != 0) goto L_0x0129
            java.lang.String r2 = "j"
            r14.mo57981a(r2, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x0129:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f21745h     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x0476 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0476 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0476 }
            int r0 = f21748u     // Catch:{ Exception -> 0x0476 }
            if (r13 == r0) goto L_0x0464
            if (r13 == 0) goto L_0x0464
            if (r2 != 0) goto L_0x013f
            goto L_0x0464
        L_0x013f:
            r15 = 1
            if (r9 != 0) goto L_0x0188
            com.mbridge.msdk.mbnative.a.b r0 = com.mbridge.msdk.mbnative.p332a.C8799c.m25351a(r25)     // Catch:{ Exception -> 0x0476 }
            if (r12 == 0) goto L_0x0171
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r0.mo58484b(r10, r2)     // Catch:{ Exception -> 0x0476 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x015d
            int r0 = r0.size()     // Catch:{ Exception -> 0x0476 }
            if (r0 <= 0) goto L_0x015d
            r0 = 0
            r8.mo58521a((boolean) r15, (com.mbridge.msdk.p076b.p077a.C2436a) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x0476 }
            return
        L_0x015d:
            boolean r0 = r8.f21763w     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0170
            java.lang.String r2 = ""
            r1 = r24
            r3 = r28
            r4 = r30
            r5 = r31
            r6 = r32
            r1.mo58518a((java.lang.String) r2, (int) r3, (java.lang.String) r4, (java.lang.String) r5, (com.mbridge.msdk.p076b.p077a.C2436a) r6)     // Catch:{ Exception -> 0x0476 }
        L_0x0170:
            return
        L_0x0171:
            if (r1 == r15) goto L_0x0188
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r0.mo58484b(r10, r2)     // Catch:{ Exception -> 0x0476 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0188
            int r0 = r0.size()     // Catch:{ Exception -> 0x0476 }
            if (r0 <= 0) goto L_0x0188
            r0 = 0
            r8.mo58521a((boolean) r15, (com.mbridge.msdk.p076b.p077a.C2436a) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x0476 }
            return
        L_0x0188:
            java.lang.String r6 = "ad_num"
            java.lang.String r15 = ""
            if (r2 == 0) goto L_0x01a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r0.<init>()     // Catch:{ Exception -> 0x0476 }
            r0.append(r2)     // Catch:{ Exception -> 0x0476 }
            r0.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r6, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x01a0:
            int r0 = r8.f21758p     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = "frame_num"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r9.<init>()     // Catch:{ Exception -> 0x0476 }
            int r12 = r8.f21758p     // Catch:{ Exception -> 0x0476 }
            r9.append(r12)     // Catch:{ Exception -> 0x0476 }
            r9.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r0, r9)     // Catch:{ Exception -> 0x0476 }
        L_0x01ba:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x027b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0476 }
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0476 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0476 }
            if (r0 != 0) goto L_0x0274
            java.lang.String r0 = f21741d     // Catch:{ Exception -> 0x0476 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r12.<init>()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r11 = "nativeinfo"
            r12.append(r11)     // Catch:{ Exception -> 0x0476 }
            r12.append(r9)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r11)     // Catch:{ Exception -> 0x0476 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x025b }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x025b }
            int r11 = r0.length()     // Catch:{ JSONException -> 0x025b }
            if (r11 <= 0) goto L_0x0246
            r21 = r9
            r11 = 0
            r12 = 0
            r20 = 0
        L_0x01f8:
            int r9 = r0.length()     // Catch:{ JSONException -> 0x0240 }
            if (r11 >= r9) goto L_0x0239
            java.lang.Object r9 = r0.opt(r11)     // Catch:{ JSONException -> 0x0240 }
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch:{ JSONException -> 0x0240 }
            r22 = r12
            java.lang.String r12 = "id"
            r23 = r2
            r2 = 0
            int r12 = r9.optInt(r12, r2)     // Catch:{ JSONException -> 0x0231 }
            r2 = 2
            if (r2 != r12) goto L_0x021e
            int r12 = r9.optInt(r6)     // Catch:{ JSONException -> 0x0231 }
            if (r13 <= 0) goto L_0x022c
            r9.put(r6, r13)     // Catch:{ JSONException -> 0x021c }
            goto L_0x022c
        L_0x021c:
            r0 = move-exception
            goto L_0x0263
        L_0x021e:
            r2 = 3
            if (r2 != r12) goto L_0x022a
            int r20 = r9.optInt(r6)     // Catch:{ JSONException -> 0x0231 }
            if (r13 <= 0) goto L_0x022a
            r9.put(r6, r13)     // Catch:{ JSONException -> 0x0231 }
        L_0x022a:
            r12 = r22
        L_0x022c:
            int r11 = r11 + 1
            r2 = r23
            goto L_0x01f8
        L_0x0231:
            r0 = move-exception
            goto L_0x0236
        L_0x0233:
            r0 = move-exception
            r23 = r2
        L_0x0236:
            r12 = r22
            goto L_0x0263
        L_0x0239:
            r23 = r2
            r22 = r12
            r2 = r20
            goto L_0x024c
        L_0x0240:
            r0 = move-exception
            r23 = r2
            r22 = r12
            goto L_0x0263
        L_0x0246:
            r23 = r2
            r21 = r9
            r2 = 0
            r12 = 0
        L_0x024c:
            int r9 = java.lang.Math.max(r12, r2)     // Catch:{ JSONException -> 0x0257 }
            r8.f21764x = r9     // Catch:{ JSONException -> 0x0257 }
            java.lang.String r9 = r0.toString()     // Catch:{ JSONException -> 0x0257 }
            goto L_0x0270
        L_0x0257:
            r0 = move-exception
            r20 = r2
            goto L_0x0263
        L_0x025b:
            r0 = move-exception
            r23 = r2
            r21 = r9
            r12 = 0
            r20 = 0
        L_0x0263:
            java.lang.String r2 = f21741d     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = com.mbridge.msdk.mbnative.p333b.C8800a.m25352a(r0)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)     // Catch:{ Exception -> 0x0476 }
            r2 = r20
            r9 = r21
        L_0x0270:
            r14.mo57981a(r5, r9)     // Catch:{ Exception -> 0x0476 }
            goto L_0x0278
        L_0x0274:
            r23 = r2
            r2 = 0
            r12 = 0
        L_0x0278:
            r13 = r23
            goto L_0x0288
        L_0x027b:
            r23 = r2
            int r0 = f21749v     // Catch:{ Exception -> 0x0476 }
            if (r13 == r0) goto L_0x0284
            if (r13 == 0) goto L_0x0284
            goto L_0x0286
        L_0x0284:
            r13 = r23
        L_0x0286:
            r2 = 0
            r12 = 0
        L_0x0288:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r0.<init>()     // Catch:{ Exception -> 0x0476 }
            r0.append(r13)     // Catch:{ Exception -> 0x0476 }
            r0.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r6, r0)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = "ping_mode"
            r14.mo57981a(r0, r4)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.c.a r0 = r0.mo16286b(r4)     // Catch:{ Exception -> 0x0476 }
            if (r0 != 0) goto L_0x02b8
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0476 }
            r0.mo16285b()     // Catch:{ Exception -> 0x0476 }
        L_0x02b8:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r0 = com.mbridge.msdk.mbnative.controller.NativeController.m25380a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ Exception -> 0x0476 }
            if (r0 != 0) goto L_0x02db
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0476 }
            android.content.Context r0 = r0.mo56913g()     // Catch:{ Exception -> 0x0476 }
            org.json.JSONArray r0 = com.mbridge.msdk.foundation.tools.C8677z.m24914a((android.content.Context) r0, (java.lang.String) r10)     // Catch:{ Exception -> 0x0476 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x0476 }
            if (r4 <= 0) goto L_0x02db
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20983c     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8677z.m24912a((org.json.JSONArray) r0)     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r4, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x02db:
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.entity.j> r0 = f21744g     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0302
            java.util.Map<java.lang.String, com.mbridge.msdk.foundation.entity.j> r0 = f21744g     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.foundation.entity.j r0 = (com.mbridge.msdk.foundation.entity.C8465j) r0     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0302
            r4 = 1
            if (r1 == r4) goto L_0x02fd
            r4 = 2
            if (r1 == r4) goto L_0x02f8
            int r0 = r0.mo57791b()     // Catch:{ Exception -> 0x0476 }
            goto L_0x0303
        L_0x02f8:
            int r0 = r0.mo57789a()     // Catch:{ Exception -> 0x0476 }
            goto L_0x0303
        L_0x02fd:
            int r0 = r0.mo57791b()     // Catch:{ Exception -> 0x0476 }
            goto L_0x0303
        L_0x0302:
            r0 = 0
        L_0x0303:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r5 = "tnum"
            if (r4 == 0) goto L_0x0325
            r4 = 1
            if (r1 != r4) goto L_0x0326
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r4.<init>()     // Catch:{ Exception -> 0x0476 }
            int r6 = r8.f21764x     // Catch:{ Exception -> 0x0476 }
            r4.append(r6)     // Catch:{ Exception -> 0x0476 }
            r4.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r5, r4)     // Catch:{ Exception -> 0x0476 }
            goto L_0x033c
        L_0x0325:
            r4 = 1
        L_0x0326:
            if (r1 != r4) goto L_0x033c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r4.<init>()     // Catch:{ Exception -> 0x0476 }
            int r6 = r8.f21765y     // Catch:{ Exception -> 0x0476 }
            r4.append(r6)     // Catch:{ Exception -> 0x0476 }
            r4.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r5, r4)     // Catch:{ Exception -> 0x0476 }
        L_0x033c:
            java.lang.String r4 = "offset"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r5.<init>()     // Catch:{ Exception -> 0x0476 }
            r5.append(r0)     // Catch:{ Exception -> 0x0476 }
            r5.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r4, r0)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = "ad_type"
            java.lang.String r4 = "42"
            r14.mo57981a(r0, r4)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = "ad_source_id"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r4.<init>()     // Catch:{ Exception -> 0x0476 }
            r4.append(r1)     // Catch:{ Exception -> 0x0476 }
            r4.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r0, r4)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = "native"
            java.lang.String r0 = com.mbridge.msdk.foundation.same.p300a.C8473d.m24277a(r10, r0)     // Catch:{ Exception -> 0x0476 }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0476 }
            if (r4 != 0) goto L_0x037c
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20982b     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r4, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x037c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0476 }
            r4 = 14
            if (r0 < r4) goto L_0x03ef
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x03b4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x03b4
            java.lang.String r0 = "video_width"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r4.<init>()     // Catch:{ Exception -> 0x0476 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0476 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0476 }
            r4.append(r3)     // Catch:{ Exception -> 0x0476 }
            r4.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r0, r3)     // Catch:{ Exception -> 0x0476 }
        L_0x03b4:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            r3 = r19
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x03e8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x03e8
            java.lang.String r0 = "video_height"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r4.<init>()     // Catch:{ Exception -> 0x0476 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0476 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0476 }
            r4.append(r3)     // Catch:{ Exception -> 0x0476 }
            r4.append(r15)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0476 }
            r14.mo57981a(r0, r3)     // Catch:{ Exception -> 0x0476 }
        L_0x03e8:
            java.lang.String r0 = "video_version"
            java.lang.String r3 = "2.0"
            r14.mo57981a(r0, r3)     // Catch:{ Exception -> 0x0476 }
        L_0x03ef:
            com.mbridge.msdk.mbnative.controller.b$a r0 = new com.mbridge.msdk.mbnative.controller.b$a     // Catch:{ Exception -> 0x0476 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0476 }
            r0.f20918d = r10     // Catch:{ Exception -> 0x0476 }
            r0.f20919e = r7     // Catch:{ Exception -> 0x0476 }
            r3 = 42
            r0.f20920f = r3     // Catch:{ Exception -> 0x0476 }
            r3 = r23
            r0.mo58531f((int) r3)     // Catch:{ Exception -> 0x0476 }
            r0.mo58529d((int) r12)     // Catch:{ Exception -> 0x0476 }
            r0.mo58530e((int) r2)     // Catch:{ Exception -> 0x0476 }
            r2 = r29
            r0.mo58528c((int) r2)     // Catch:{ Exception -> 0x0476 }
            r9 = r32
            r0.mo58524a((com.mbridge.msdk.p076b.p077a.C2436a) r9)     // Catch:{ Exception -> 0x0476 }
            r2 = 1
            r11 = r33
            if (r1 != r2) goto L_0x0418
            if (r11 == 0) goto L_0x041b
        L_0x0418:
            r0.mo58527b((boolean) r2)     // Catch:{ Exception -> 0x0476 }
        L_0x041b:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f21759q     // Catch:{ Exception -> 0x0476 }
            java.util.List r1 = com.mbridge.msdk.mbnative.controller.NativeController.m25385b((java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ Exception -> 0x0476 }
            r0.mo58526a((java.util.List<java.lang.String>) r1)     // Catch:{ Exception -> 0x0476 }
            com.mbridge.msdk.mbnative.controller.b$b r12 = new com.mbridge.msdk.mbnative.controller.b$b     // Catch:{ Exception -> 0x0476 }
            r3 = 1
            r1 = r12
            r2 = r24
            r4 = r0
            r5 = r28
            r6 = r30
            r7 = r31
            r1.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0476 }
            r0.mo58525a((java.lang.Runnable) r12)     // Catch:{ Exception -> 0x0476 }
            r3 = r28
            r0.mo58557g(r3)     // Catch:{ Exception -> 0x0476 }
            r12.mo58535a((com.mbridge.msdk.p076b.p077a.C2436a) r9)     // Catch:{ Exception -> 0x0476 }
            r12.mo58537a((boolean) r11)     // Catch:{ Exception -> 0x0476 }
            r12.mo58536a((java.lang.String) r10)     // Catch:{ Exception -> 0x0476 }
            if (r3 != 0) goto L_0x044e
            r1 = r18
            r2 = 1
            r1.mo57973a((int) r2, (com.mbridge.msdk.foundation.same.net.p312g.C8550d) r14, (com.mbridge.msdk.foundation.same.net.C8532e) r0, (java.lang.String) r15)     // Catch:{ Exception -> 0x0476 }
            goto L_0x045c
        L_0x044e:
            r1 = r18
            r2 = 1
            if (r3 != r2) goto L_0x045c
            com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p311f.C8543d.m24463a()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r3.f20964m     // Catch:{ Exception -> 0x0476 }
            r1.mo57977b(r2, r3, r14, r0)     // Catch:{ Exception -> 0x0476 }
        L_0x045c:
            android.os.Handler r0 = r8.f21757o     // Catch:{ Exception -> 0x0476 }
            r1 = r26
            r0.postDelayed(r12, r1)     // Catch:{ Exception -> 0x0476 }
            goto L_0x0489
        L_0x0464:
            r3 = r9
            r9 = r11
            java.lang.String r2 = "The request was refused"
            r1 = r24
            r3 = r28
            r4 = r30
            r5 = r31
            r6 = r32
            r1.mo58518a((java.lang.String) r2, (int) r3, (java.lang.String) r4, (java.lang.String) r5, (com.mbridge.msdk.p076b.p077a.C2436a) r6)     // Catch:{ Exception -> 0x0476 }
            return
        L_0x0476:
            r0 = move-exception
            java.lang.String r1 = f21741d
            java.lang.String r2 = com.mbridge.msdk.mbnative.p333b.C8800a.m25352a(r0)
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r2)
            java.lang.String r1 = f21741d
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x0489:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.C8825b.m25454a(int, long, int, com.mbridge.msdk.c.d, java.lang.String, java.lang.String, com.mbridge.msdk.b.a.a, boolean):void");
    }

    /* renamed from: a */
    public static void m25457a(int i, String str) {
        C8465j jVar;
        if (f21744g.containsKey(str)) {
            jVar = f21744g.get(str);
        } else {
            jVar = new C8465j();
        }
        int intValue = f21745h.get(str).intValue();
        int intValue2 = f21746i.containsKey(str) ? f21746i.get(str).intValue() : 1;
        int i2 = 0;
        if (i == 1) {
            int b = intValue + jVar.mo57791b();
            if (b <= intValue2) {
                i2 = b;
            }
            jVar.mo57792b(i2);
        } else if (i == 2) {
            int a = intValue + jVar.mo57789a();
            if (a <= intValue2) {
                i2 = a;
            }
            jVar.mo57790a(i2);
        }
        f21744g.put(str, jVar);
    }

    /* renamed from: b */
    public static void m25461b(int i, String str) {
        if (f21744g.containsKey(str)) {
            C8465j jVar = f21744g.get(str);
            if (i == 1) {
                jVar.mo57792b(0);
            } else if (i == 2) {
                jVar.mo57790a(0);
            }
            f21744g.put(str, jVar);
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.b$a */
    /* compiled from: NativePreloadController */
    public class C8827a extends C8843b implements C8495c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f21769b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f21770c;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f21771g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f21772h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f21773i;

        /* renamed from: j */
        private List<String> f21774j = null;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f21775k = false;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Runnable f21776l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f21777m = true;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C2436a f21778n;

        /* renamed from: a */
        public final void mo58526a(List<String> list) {
            this.f21774j = list;
        }

        /* renamed from: c */
        public final void mo58528c(int i) {
            this.f21773i = i;
        }

        /* renamed from: d */
        public final void mo58529d(int i) {
            this.f21771g = i;
        }

        /* renamed from: e */
        public final void mo58530e(int i) {
            this.f21772h = i;
        }

        /* renamed from: f */
        public final void mo58531f(int i) {
            this.f21770c = i;
        }

        public C8827a(int i) {
            this.f21769b = i;
        }

        /* renamed from: a */
        public final void mo58524a(C2436a aVar) {
            this.f21778n = aVar;
        }

        /* renamed from: b */
        public final void mo58527b(boolean z) {
            this.f21777m = z;
        }

        /* renamed from: a */
        public final void mo57905a(boolean z) {
            this.f21775k = z;
        }

        /* renamed from: a */
        public final void mo58508a(List<C8513b> list, final CampaignUnit campaignUnit) {
            boolean unused = C8825b.this.f21763w = true;
            C8825b.this.mo58521a(true, this.f21778n, (String) null);
            C8825b.this.mo58519a(new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    int i = 1;
                    if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD || Looper.myLooper() != null) {
                        z = false;
                    } else {
                        Looper.prepare();
                        z = true;
                    }
                    if (C8827a.this.f21776l != null) {
                        C8825b.this.f21757o.removeCallbacks(C8827a.this.f21776l);
                    }
                    if (C8825b.f21742e.containsKey("0_" + C8827a.this.f20918d)) {
                        C8825b.f21742e.remove("0_" + C8827a.this.f20918d);
                    }
                    if (C8827a.this.f21773i > 0) {
                        if (campaignUnit.ads.size() > C8827a.this.f21773i) {
                            C8827a aVar = C8827a.this;
                            int unused = aVar.f21770c = aVar.f21773i;
                        } else {
                            int unused2 = C8827a.this.f21770c = campaignUnit.ads.size();
                        }
                    } else if (C8827a.this.f21773i == -1) {
                        int unused3 = C8827a.this.f21770c = 0;
                    } else if (C8827a.this.f21773i == -3) {
                        int unused4 = C8827a.this.f21770c = campaignUnit.ads.size();
                    } else if (C8827a.this.f21773i == -2) {
                        if (campaignUnit.getTemplate() == 3) {
                            if (C8827a.this.f21772h != 0) {
                                C8827a aVar2 = C8827a.this;
                                int unused5 = aVar2.f21770c = aVar2.f21772h;
                            }
                        } else if (C8827a.this.f21771g != 0) {
                            C8827a aVar3 = C8827a.this;
                            int unused6 = aVar3.f21770c = aVar3.f21771g;
                        }
                        if (C8827a.this.f21770c <= 0) {
                            int unused7 = C8827a.this.f21770c = ((Integer) C8825b.f21745h.get(C8827a.this.f20918d)).intValue();
                        }
                    }
                    if (campaignUnit.ads.size() < C8827a.this.f21770c) {
                        int unused8 = C8827a.this.f21770c = campaignUnit.ads.size();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < campaignUnit.ads.size(); i2++) {
                        CampaignEx campaignEx = campaignUnit.ads.get(i2);
                        campaignEx.setCampaignUnitId(C8827a.this.f20918d);
                        if (arrayList.size() < C8827a.this.f21770c && campaignEx.getOfferType() != 99) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        }
                        C8825b.this.mo58522a(C8825b.this.f21762t, (Campaign) campaignEx);
                    }
                    C8825b.m25458a(C8825b.this, (List) arrayList2, C8827a.this.f20918d);
                    if (campaignUnit.getAds().get(0) != null) {
                        i = campaignUnit.getAds().get(0).getType();
                    }
                    C8798b<String, List<Campaign>> a = C8799c.m25351a(i);
                    if (a != null) {
                        a.mo58481a(C8827a.this.f20918d, arrayList);
                    }
                    C8825b.m25457a(C8827a.this.f21769b, C8827a.this.f20918d);
                    if (Looper.myLooper() != null && z) {
                        Looper.loop();
                    }
                    if (campaignUnit.getAds().get(0) != null) {
                        C6779b.m20644a(C8388a.m23845e().mo56913g(), campaignUnit.getAds().get(0).getMaitve(), campaignUnit.getAds().get(0).getMaitve_src());
                    }
                }
            }));
        }

        /* renamed from: a */
        public final void mo58505a(final int i, final String str) {
            C8825b.this.mo58519a(new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD || Looper.myLooper() != null) {
                        z = false;
                    } else {
                        Looper.prepare();
                        z = true;
                    }
                    if (!C8827a.this.f21775k) {
                        if (C8827a.this.f21776l != null) {
                            C8825b.this.f21757o.removeCallbacks(C8827a.this.f21776l);
                        }
                        if (C8827a.this.mo58556g() == 1 || C8827a.this.f21777m) {
                            C8825b.this.mo58518a(str, C8827a.this.mo58556g(), C8827a.this.f20918d, C8827a.this.f20919e, C8827a.this.f21778n);
                        }
                    } else if (C8827a.this.f21777m) {
                        C8825b.this.mo58518a(str, C8827a.this.mo58556g(), C8827a.this.f20918d, C8827a.this.f20919e, C8827a.this.f21778n);
                    }
                    if (i == -1) {
                        C8825b.m25461b(C8827a.this.f21769b, C8827a.this.f20918d);
                    }
                    if (Looper.myLooper() != null && z) {
                        Looper.loop();
                    }
                }
            }));
        }

        /* renamed from: a */
        public final void mo58525a(Runnable runnable) {
            this.f21776l = runnable;
        }

        /* renamed from: b */
        public final void mo58509b(final List<Frame> list) {
            C8825b.this.mo58519a(new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD || Looper.myLooper() != null) {
                        z = false;
                    } else {
                        Looper.prepare();
                        z = true;
                    }
                    if (!C8827a.this.f21775k && C8827a.this.f21776l != null) {
                        C8825b.this.f21757o.removeCallbacks(C8827a.this.f21776l);
                    }
                    List list = list;
                    if (list != null && list.size() > 0) {
                        for (Frame campaigns : list) {
                            for (CampaignEx a : campaigns.getCampaigns()) {
                                C8825b.this.mo58522a(C8825b.this.f21762t, (Campaign) a);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(Long.valueOf(System.currentTimeMillis()), list);
                        Map f = C8825b.f21742e;
                        if (f.containsKey("1_" + C8827a.this.f20918d)) {
                            Map f2 = C8825b.f21742e;
                            f2.remove("1_" + C8827a.this.f20918d);
                        }
                        Map f3 = C8825b.f21742e;
                        f3.put("1_" + C8827a.this.f20918d, hashMap);
                    }
                    if (Looper.myLooper() != null && z) {
                        Looper.loop();
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public final void mo58518a(String str, int i, String str2, String str3, C2436a aVar) {
        Log.e(f21741d, str);
        try {
            if ((this.f21750a == null || this.f21750a.size() > 0) && this.f21750a != null) {
                m25456a(i, this.f21755m, str2, str3, aVar);
                return;
            }
            mo58521a(false, aVar, str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.b$b */
    /* compiled from: NativePreloadController */
    public class C8831b implements Runnable {

        /* renamed from: b */
        private int f21787b;

        /* renamed from: c */
        private C8495c f21788c;

        /* renamed from: d */
        private int f21789d;

        /* renamed from: e */
        private String f21790e;

        /* renamed from: f */
        private String f21791f;

        /* renamed from: g */
        private C2436a f21792g;

        /* renamed from: h */
        private boolean f21793h = false;

        /* renamed from: a */
        public final void mo58537a(boolean z) {
            this.f21793h = z;
        }

        /* renamed from: a */
        public final void mo58535a(C2436a aVar) {
            this.f21792g = aVar;
        }

        /* renamed from: a */
        public final void mo58536a(String str) {
            this.f21790e = str;
        }

        public C8831b(int i, C8495c cVar, int i2, String str, String str2) {
            this.f21787b = i;
            this.f21788c = cVar;
            this.f21789d = i2;
            this.f21790e = str;
            this.f21791f = str2;
        }

        public final void run() {
            this.f21788c.mo57905a(true);
            int i = this.f21787b;
            if (i == 1) {
                boolean unused = C8825b.this.f21763w = true;
                if (this.f21793h || this.f21789d == 1) {
                    C8825b.this.mo58518a("REQUEST_TIMEOUT", this.f21789d, this.f21790e, this.f21791f, this.f21792g);
                }
            } else if (i == 2) {
                C8825b.this.mo58518a("REQUEST_TIMEOUT", this.f21789d, this.f21790e, this.f21791f, this.f21792g);
            }
        }
    }

    /* renamed from: a */
    public static Map<String, Map<Long, Object>> m25453a() {
        return f21742e;
    }

    /* renamed from: b */
    public static Map<String, Boolean> m25460b() {
        return f21743f;
    }

    /* renamed from: c */
    public static Map<String, C8465j> m25463c() {
        return f21744g;
    }

    /* renamed from: d */
    public static Map<String, Integer> m25464d() {
        return f21745h;
    }

    /* renamed from: e */
    public static Map<String, Integer> m25465e() {
        return f21746i;
    }

    /* renamed from: a */
    public final void mo58521a(boolean z, C2436a aVar, String str) {
        if (z) {
            if (aVar != null && !aVar.mo16143a()) {
                aVar.mo16142a(true);
                aVar.onPreloadSucceed();
            }
        } else if (aVar != null && !aVar.mo16143a()) {
            aVar.mo16142a(true);
            aVar.onPreloadFaild(str);
        }
    }

    /* renamed from: a */
    public final void mo58522a(boolean z, Campaign campaign) {
        if (campaign != null) {
            if (z && campaign.getIconDrawable() == null) {
                campaign.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
            }
            if (z && campaign.getBigDrawable() == null) {
                campaign.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo58519a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24878d(f21741d, "please import the videocommon aar");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x007c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m25458a(com.mbridge.msdk.mbnative.controller.C8825b r11, java.util.List r12, java.lang.String r13) {
        /*
            java.lang.String r11 = "com.mbridge.msdk.videocommon.download.c"
            if (r12 == 0) goto L_0x008e
            int r0 = r12.size()     // Catch:{ Exception -> 0x0084 }
            if (r0 <= 0) goto L_0x008e
            java.lang.String r0 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x007c }
            java.lang.Class.forName(r11)     // Catch:{ Exception -> 0x007c }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = "getInstance"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r0 = r11.getMethod(r0, r2)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x007c }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x008e
            java.lang.String r2 = "com.mbridge.msdk.videocommon.listener.a"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "createUnitCache"
            r5 = 5
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ Exception -> 0x007c }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 1
            r6[r8] = r7     // Catch:{ Exception -> 0x007c }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r9 = 2
            r6[r9] = r7     // Catch:{ Exception -> 0x007c }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007c }
            r10 = 3
            r6[r10] = r7     // Catch:{ Exception -> 0x007c }
            r7 = 4
            r6[r7] = r2     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r2 = r11.getMethod(r4, r6)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x007c }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x007c }
            android.content.Context r5 = r5.mo56913g()     // Catch:{ Exception -> 0x007c }
            r4[r1] = r5     // Catch:{ Exception -> 0x007c }
            r4[r8] = r13     // Catch:{ Exception -> 0x007c }
            r4[r9] = r12     // Catch:{ Exception -> 0x007c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x007c }
            r4[r10] = r12     // Catch:{ Exception -> 0x007c }
            r4[r7] = r3     // Catch:{ Exception -> 0x007c }
            r2.invoke(r0, r4)     // Catch:{ Exception -> 0x007c }
            java.lang.String r12 = "load"
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x007c }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r1] = r3     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r2)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x007c }
            r12[r1] = r13     // Catch:{ Exception -> 0x007c }
            r11.invoke(r0, r12)     // Catch:{ Exception -> 0x007c }
            goto L_0x008e
        L_0x007c:
            java.lang.String r11 = f21741d     // Catch:{ Exception -> 0x0084 }
            java.lang.String r12 = "please import the videocommon aar"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r11, r12)     // Catch:{ Exception -> 0x0084 }
            goto L_0x008e
        L_0x0084:
            r11 = move-exception
            java.lang.String r12 = f21741d
            java.lang.String r11 = com.mbridge.msdk.mbnative.p333b.C8800a.m25352a(r11)
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r12, r11)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.C8825b.m25458a(com.mbridge.msdk.mbnative.controller.b, java.util.List, java.lang.String):void");
    }
}
