package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.same.report.p314b.C8578a;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.p076b.C2435a;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2452c;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.mbridge.msdk.foundation.controller.b */
/* compiled from: SDKController */
public final class C8396b {

    /* renamed from: h */
    private static C8396b f20493h;

    /* renamed from: a */
    public final int f20494a = 1;

    /* renamed from: b */
    public final int f20495b = 2;

    /* renamed from: c */
    public final int f20496c = 3;

    /* renamed from: d */
    public final int f20497d = 4;

    /* renamed from: e */
    public final int f20498e = 5;

    /* renamed from: f */
    public final int f20499f = 6;

    /* renamed from: g */
    Handler f20500g = new Handler() {
        public final void handleMessage(Message message) {
            List list;
            try {
                int i = message.what;
                if (i != 2) {
                    if (i == 3) {
                        File file = (File) message.obj;
                        if (file != null) {
                            String a = C8666t.m24856a(file);
                            if (!TextUtils.isEmpty(a)) {
                                String[] split = a.split("====");
                                if (split.length > 0) {
                                    new C8582d(C8396b.this.f20501i).mo58066a(split[0], file);
                                }
                            }
                        }
                    } else if (i == 4) {
                        String str = (String) message.obj;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (C8574b.m24577a().mo58054c()) {
                            C8574b.m24577a().mo58052a(str);
                        } else {
                            new C8582d(C8396b.this.f20501i, 0).mo58068a("click_duration", str, (String) null, (Frame) null);
                        }
                    } else if (i == 5) {
                        String str2 = (String) message.obj;
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        if (C8574b.m24577a().mo58054c()) {
                            C8574b.m24577a().mo58052a(str2);
                        } else {
                            new C8582d(C8396b.this.f20501i, 0).mo58068a("load_duration", str2, (String) null, (Frame) null);
                        }
                    } else if (i != 6) {
                        if (i == 9) {
                            if (((C2440a) message.obj).mo16152G() == 1) {
                                C8578a.m24592a(C8396b.this.f20501i).mo58057a();
                            }
                        }
                    } else if (message.obj != null && (message.obj instanceof String)) {
                        String str3 = (String) message.obj;
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        if (C8574b.m24577a().mo58054c()) {
                            C8574b.m24577a().mo58052a(str3);
                        } else {
                            new C8582d(C8396b.this.f20501i, 0).mo58068a("device_data", str3, (String) null, (Frame) null);
                        }
                    }
                } else if ((message.obj instanceof List) && (list = (List) message.obj) != null && list.size() > 0) {
                    C8582d dVar = new C8582d(C8396b.this.f20501i, 0);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C8466k kVar = (C8466k) list.get(i2);
                        boolean z = false;
                        if (i2 == list.size() - 1) {
                            z = true;
                        }
                        dVar.mo58064a(kVar, z);
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d("SDKController", e.getMessage());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f20501i;

    /* renamed from: j */
    private String f20502j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f20503k;

    /* renamed from: l */
    private String f20504l;

    /* renamed from: m */
    private String f20505m;

    /* renamed from: n */
    private boolean f20506n = false;

    /* renamed from: o */
    private C2435a f20507o;

    /* renamed from: p */
    private String f20508p;

    /* renamed from: q */
    private boolean f20509q = false;

    /* renamed from: r */
    private AtomicBoolean f20510r = null;

    /* renamed from: s */
    private FastKV f20511s = null;

    /* renamed from: t */
    private Map<String, Object> f20512t;

    /* renamed from: u */
    private int f20513u;

    private C8396b() {
    }

    /* renamed from: a */
    public static synchronized C8396b m23890a() {
        C8396b bVar;
        synchronized (C8396b.class) {
            if (f20493h == null) {
                f20493h = new C8396b();
            }
            bVar = f20493h;
        }
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:92|93|94|95|98|99|(1:103)|104|(2:114|115)(2:108|(2:112|113))) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0310 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0203 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0233 A[Catch:{ Exception -> 0x01de, all -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0314 A[Catch:{ Exception -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0321 A[Catch:{ Exception -> 0x033c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56948a(java.util.Map r13, final android.content.Context r14) {
        /*
            r12 = this;
            java.lang.String r0 = "SDKController"
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x0370
            java.lang.String r2 = "mbridge_appid"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0016
            java.lang.Object r3 = r13.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r12.f20503k = r3
        L_0x0016:
            android.content.Context r3 = r14.getApplicationContext()
            r12.f20501i = r3
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r4 = r12.f20501i
            r3.mo56905b((android.content.Context) r4)
            java.lang.Object r3 = r13.get(r2)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            if (r4 != 0) goto L_0x0046
            com.mbridge.msdk.foundation.a.a.a r4 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            java.lang.String r5 = "sdk_app_id"
            r4.mo16388a((java.lang.String) r5, (java.lang.String) r3)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r3 = move-exception
            goto L_0x003f
        L_0x003d:
            r3 = move-exception
            goto L_0x0043
        L_0x003f:
            r3.printStackTrace()
            goto L_0x0046
        L_0x0043:
            r3.printStackTrace()
        L_0x0046:
            boolean r3 = r12.f20506n
            r4 = 1
            if (r3 != r4) goto L_0x0054
            com.mbridge.msdk.foundation.same.report.d r13 = new com.mbridge.msdk.foundation.same.report.d
            r13.<init>(r14)
            r13.mo58060a()
            return
        L_0x0054:
            com.mbridge.msdk.foundation.tools.C8660r.m24839n(r14)
            if (r13 == 0) goto L_0x034e
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0067
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f20503k = r2
        L_0x0067:
            java.lang.String r2 = "mbridge_appkey"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f20504l = r2
        L_0x0077:
            java.lang.String r2 = "mbridge_wx_appid"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0087
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f20505m = r2
        L_0x0087:
            java.lang.String r2 = "applicationID"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x0097
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.f20508p = r2
        L_0x0097:
            java.lang.String r2 = "mbridge_appstartupcarsh"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r13 = r13.get(r2)
            java.lang.String r13 = (java.lang.String) r13
            r12.f20502j = r13
        L_0x00a7:
            r13 = 0
            com.mbridge.msdk.c.b r2 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x0152 }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = r3.mo56914h()     // Catch:{ all -> 0x0152 }
            com.mbridge.msdk.c.a r2 = r2.mo16286b(r3)     // Catch:{ all -> 0x0152 }
            if (r2 == 0) goto L_0x015a
            java.util.List r2 = r2.mo16209b()     // Catch:{ all -> 0x0152 }
            if (r2 == 0) goto L_0x015a
            int r3 = r2.size()     // Catch:{ all -> 0x0152 }
            if (r3 <= 0) goto L_0x015a
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0152 }
        L_0x00ca:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x015a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0152 }
            com.mbridge.msdk.foundation.entity.a r3 = (com.mbridge.msdk.foundation.entity.C8456a) r3     // Catch:{ all -> 0x0152 }
            int r5 = r3.mo57668a()     // Catch:{ all -> 0x0152 }
            r6 = 287(0x11f, float:4.02E-43)
            java.lang.String r7 = "loadFormSelfFilling"
            r8 = 2
            if (r5 != r6) goto L_0x0117
            java.lang.String r5 = "com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0152 }
            android.content.Context r6 = r12.f20501i     // Catch:{ all -> 0x0152 }
            if (r6 == 0) goto L_0x00ca
            if (r5 == 0) goto L_0x00ca
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0152 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r13] = r9     // Catch:{ all -> 0x0152 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r4] = r9     // Catch:{ all -> 0x0152 }
            java.lang.reflect.Constructor r6 = r5.getConstructor(r6)     // Catch:{ all -> 0x0152 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0152 }
            r8[r13] = r1     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = r3.mo57669b()     // Catch:{ all -> 0x0152 }
            r8[r4] = r3     // Catch:{ all -> 0x0152 }
            java.lang.Object r3 = r6.newInstance(r8)     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x00ca
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x0152 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r6)     // Catch:{ all -> 0x0152 }
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0152 }
            r5.invoke(r3, r6)     // Catch:{ all -> 0x0152 }
            goto L_0x00ca
        L_0x0117:
            int r5 = r3.mo57668a()     // Catch:{ all -> 0x0152 }
            r6 = 94
            if (r5 != r6) goto L_0x00ca
            java.lang.String r5 = "com.mbridge.msdk.out.MBRewardVideoHandler"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0152 }
            if (r5 == 0) goto L_0x00ca
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0152 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r13] = r9     // Catch:{ all -> 0x0152 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r4] = r9     // Catch:{ all -> 0x0152 }
            java.lang.reflect.Constructor r6 = r5.getConstructor(r6)     // Catch:{ all -> 0x0152 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0152 }
            r8[r13] = r1     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = r3.mo57669b()     // Catch:{ all -> 0x0152 }
            r8[r4] = r3     // Catch:{ all -> 0x0152 }
            java.lang.Object r3 = r6.newInstance(r8)     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x00ca
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x0152 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r6)     // Catch:{ all -> 0x0152 }
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0152 }
            r5.invoke(r3, r6)     // Catch:{ all -> 0x0152 }
            goto L_0x00ca
        L_0x0152:
            r2 = move-exception
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L_0x015a
            r2.printStackTrace()
        L_0x015a:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r12.f20503k
            r2.mo56906b((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r12.f20504l
            r2.mo56911d(r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r12.f20505m
            r2.mo56909c((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r12.f20508p
            r2.mo56900a((java.lang.String) r3)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            com.mbridge.msdk.foundation.controller.b$6 r3 = new com.mbridge.msdk.foundation.controller.b$6
            r3.<init>()
            android.os.Handler r5 = r12.f20500g
            r2.mo56899a((com.mbridge.msdk.foundation.controller.C8388a.C8394b) r3, (android.os.Handler) r5)
            android.content.Context r2 = r12.f20501i
            android.content.Context r2 = r2.getApplicationContext()
            com.iab.omid.library.mmadbridge.Omid.activate(r2)     // Catch:{ IllegalArgumentException -> 0x01ae }
            boolean r3 = com.iab.omid.library.mmadbridge.Omid.isActive()     // Catch:{ IllegalArgumentException -> 0x01ae }
            if (r3 != 0) goto L_0x01b6
            com.mbridge.msdk.foundation.same.report.d r5 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ IllegalArgumentException -> 0x01ae }
            r5.<init>(r2, r13)     // Catch:{ IllegalArgumentException -> 0x01ae }
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = "activate om failed"
            r5.mo58069a((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x01ae }
            goto L_0x01b6
        L_0x01ae:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r0, r3, r2)
        L_0x01b6:
            android.content.Context r2 = r12.f20501i
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r12.mo56951d()     // Catch:{ all -> 0x0308 }
            java.lang.String r5 = "H+tU+FeXHM=="
            if (r3 == 0) goto L_0x01e1
            com.mbridge.msdk.foundation.tools.FastKV r3 = r12.f20511s     // Catch:{ all -> 0x0308 }
            if (r3 != 0) goto L_0x01e1
            com.mbridge.msdk.foundation.tools.FastKV$Builder r3 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x01de }
            com.mbridge.msdk.foundation.same.b.c r6 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x01de }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r6)     // Catch:{ Exception -> 0x01de }
            java.lang.String r7 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r5)     // Catch:{ Exception -> 0x01de }
            r3.<init>(r6, r7)     // Catch:{ Exception -> 0x01de }
            com.mbridge.msdk.foundation.tools.FastKV r3 = r3.build()     // Catch:{ Exception -> 0x01de }
            r12.f20511s = r3     // Catch:{ Exception -> 0x01de }
            goto L_0x01e1
        L_0x01de:
            r3 = 0
            r12.f20511s = r3     // Catch:{ all -> 0x0308 }
        L_0x01e1:
            com.mbridge.msdk.foundation.tools.FastKV r3 = r12.f20511s     // Catch:{ all -> 0x0308 }
            java.lang.String r6 = "c"
            java.lang.String r7 = "b"
            java.lang.String r8 = "H+tU+Fz8"
            java.lang.String r9 = "H+tU+bfPhM=="
            if (r3 == 0) goto L_0x0275
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f20511s     // Catch:{ Exception -> 0x0202 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r9)     // Catch:{ Exception -> 0x0202 }
            java.lang.String r13 = r13.getString(r2, r1)     // Catch:{ Exception -> 0x0202 }
            com.mbridge.msdk.foundation.tools.FastKV r2 = r12.f20511s     // Catch:{ Exception -> 0x0203 }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r8)     // Catch:{ Exception -> 0x0203 }
            java.lang.String r1 = r2.getString(r3, r1)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0203
        L_0x0202:
            r13 = r1
        L_0x0203:
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x0227
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x0227
            com.mbridge.msdk.foundation.a.a.a r2 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = r2.mo16390b(r7)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20750k = r2     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r2 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = r2.mo16390b(r6)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20751l = r2     // Catch:{ all -> 0x0308 }
        L_0x0227:
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x025d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x025d
            java.lang.String r13 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0308 }
            if (r13 == 0) goto L_0x0245
            java.lang.String r13 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0308 }
            if (r13 == 0) goto L_0x0245
            goto L_0x0310
        L_0x0245:
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f20511s     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r9)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ Exception -> 0x0310 }
            r13.putString(r1, r2)     // Catch:{ Exception -> 0x0310 }
            com.mbridge.msdk.foundation.tools.FastKV r13 = r12.f20511s     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r8)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ Exception -> 0x0310 }
            r13.putString(r1, r2)     // Catch:{ Exception -> 0x0310 }
            goto L_0x0310
        L_0x025d:
            com.mbridge.msdk.foundation.same.C8469a.f20750k = r13     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20751l = r1     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            r13.mo16388a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            r13.mo16388a((java.lang.String) r6, (java.lang.String) r1)     // Catch:{ all -> 0x0308 }
            goto L_0x0310
        L_0x0275:
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r5)     // Catch:{ all -> 0x0308 }
            android.content.SharedPreferences r13 = r2.getSharedPreferences(r3, r13)     // Catch:{ all -> 0x0308 }
            if (r13 == 0) goto L_0x0293
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r9)     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = r13.getString(r2, r1)     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r8)     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = r13.getString(r3, r1)     // Catch:{ all -> 0x0308 }
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x0294
        L_0x0293:
            r2 = r1
        L_0x0294:
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x02b8
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x02b8
            com.mbridge.msdk.foundation.a.a.a r3 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = r3.mo16390b(r7)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20750k = r3     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r3 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = r3.mo16390b(r6)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20751l = r3     // Catch:{ all -> 0x0308 }
        L_0x02b8:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x02f1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x02f1
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0308 }
            if (r1 == 0) goto L_0x02d5
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0308 }
            if (r1 == 0) goto L_0x02d5
            goto L_0x0310
        L_0x02d5:
            if (r13 == 0) goto L_0x0310
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r9)     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            r13.putString(r1, r2)     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8659q.m24802b(r8)     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            r13.putString(r1, r2)     // Catch:{ all -> 0x0308 }
            r13.apply()     // Catch:{ all -> 0x0308 }
            goto L_0x0310
        L_0x02f1:
            com.mbridge.msdk.foundation.same.C8469a.f20750k = r1     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.same.C8469a.f20751l = r2     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20750k     // Catch:{ all -> 0x0308 }
            r13.mo16388a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ all -> 0x0308 }
            com.mbridge.msdk.foundation.a.a.a r13 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()     // Catch:{ all -> 0x0308 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C8469a.f20751l     // Catch:{ all -> 0x0308 }
            r13.mo16388a((java.lang.String) r6, (java.lang.String) r1)     // Catch:{ all -> 0x0308 }
            goto L_0x0310
        L_0x0308:
            r13 = move-exception
            java.lang.String r1 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r0, r1, r13)
        L_0x0310:
            boolean r13 = com.mbridge.msdk.MBridgeConstans.INIT_UA_IN     // Catch:{ Exception -> 0x033c }
            if (r13 == 0) goto L_0x0321
            java.util.concurrent.ThreadPoolExecutor r13 = com.mbridge.msdk.foundation.same.p305f.C8498b.m24359a()     // Catch:{ Exception -> 0x033c }
            com.mbridge.msdk.foundation.controller.b$2 r1 = new com.mbridge.msdk.foundation.controller.b$2     // Catch:{ Exception -> 0x033c }
            r1.<init>()     // Catch:{ Exception -> 0x033c }
            r13.execute(r1)     // Catch:{ Exception -> 0x033c }
            goto L_0x0344
        L_0x0321:
            android.os.Looper r13 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x033c }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x033c }
            if (r13 != r1) goto L_0x0338
            java.util.concurrent.ThreadPoolExecutor r13 = com.mbridge.msdk.foundation.same.p305f.C8498b.m24359a()     // Catch:{ Exception -> 0x033c }
            com.mbridge.msdk.foundation.controller.b$3 r1 = new com.mbridge.msdk.foundation.controller.b$3     // Catch:{ Exception -> 0x033c }
            r1.<init>()     // Catch:{ Exception -> 0x033c }
            r13.execute(r1)     // Catch:{ Exception -> 0x033c }
            goto L_0x0344
        L_0x0338:
            r12.m23895e()     // Catch:{ Exception -> 0x033c }
            goto L_0x0344
        L_0x033c:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r13)
        L_0x0344:
            r12.mo56950c()
            android.content.Context r13 = r12.f20501i
            com.mbridge.msdk.foundation.tools.C8674x.m24886a((android.content.Context) r13)
            r12.f20506n = r4
        L_0x034e:
            com.mbridge.msdk.c.b r13 = com.mbridge.msdk.p078c.C2445b.m6020a()
            java.lang.String r0 = r12.f20503k
            com.mbridge.msdk.c.a r13 = r13.mo16294f(r0)
            int r13 = r13.mo16231g()
            long r0 = (long) r13
            r2 = 1300(0x514, double:6.423E-321)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0370
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
            com.mbridge.msdk.foundation.controller.b$1 r2 = new com.mbridge.msdk.foundation.controller.b$1
            r2.<init>(r14)
            r13.postDelayed(r2, r0)
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C8396b.mo56948a(java.util.Map, android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m23895e() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.d.b");
            cls.getDeclaredMethod("start", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            C8672v.m24875a("SDKController", th.getMessage(), th);
        }
    }

    /* renamed from: b */
    public final void mo56949b() {
        Handler handler = this.f20500g;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: c */
    public final void mo56950c() {
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007e A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0228 A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r11 = this;
                    com.mbridge.msdk.foundation.same.report.p315c.C8581a.m24613a()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f20501i     // Catch:{ Exception -> 0x025c }
                    r1 = 0
                    r2 = 5
                    if (r0 != 0) goto L_0x000e
                    goto L_0x0029
                L_0x000e:
                    com.mbridge.msdk.foundation.db.g r3 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r3 = com.mbridge.msdk.foundation.p298db.C8420m.m24001a((com.mbridge.msdk.foundation.p298db.C8412f) r3)     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.mo57039a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0029
                    com.mbridge.msdk.foundation.db.g r0 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r0 = com.mbridge.msdk.foundation.p298db.C8420m.m24001a((com.mbridge.msdk.foundation.p298db.C8412f) r0)     // Catch:{ Exception -> 0x025c }
                    java.util.List r0 = r0.mo57043a((int) r2)     // Catch:{ Exception -> 0x025c }
                    goto L_0x002a
                L_0x0029:
                    r0 = r1
                L_0x002a:
                    if (r0 == 0) goto L_0x0046
                    int r3 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0046
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f20500g     // Catch:{ Exception -> 0x025c }
                    android.os.Message r3 = r3.obtainMessage()     // Catch:{ Exception -> 0x025c }
                    r4 = 2
                    r3.what = r4     // Catch:{ Exception -> 0x025c }
                    r3.obj = r0     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r0 = r0.f20500g     // Catch:{ Exception -> 0x025c }
                    r0.sendMessage(r3)     // Catch:{ Exception -> 0x025c }
                L_0x0046:
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f20501i     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.g r0 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.d r3 = com.mbridge.msdk.foundation.p298db.C8409d.m23921a((com.mbridge.msdk.foundation.p298db.C8412f) r0)     // Catch:{ Exception -> 0x025c }
                    int r4 = r3.mo56977a()     // Catch:{ Exception -> 0x025c }
                    r5 = 20
                    if (r4 < r5) goto L_0x0074
                    java.util.List r3 = r3.mo56978a((int) r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = com.mbridge.msdk.foundation.entity.C8459d.m24074a((java.util.List<com.mbridge.msdk.foundation.entity.C8459d>) r3)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r4 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r4.obj = r3     // Catch:{ Exception -> 0x025c }
                    r3 = 4
                    r4.what = r3     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f20500g     // Catch:{ Exception -> 0x025c }
                    r3.sendMessage(r4)     // Catch:{ Exception -> 0x025c }
                L_0x0074:
                    com.mbridge.msdk.foundation.db.k r0 = com.mbridge.msdk.foundation.p298db.C8418k.m23993a((com.mbridge.msdk.foundation.p298db.C8412f) r0)     // Catch:{ Exception -> 0x025c }
                    int r3 = r0.mo57033a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= r5) goto L_0x0208
                    java.util.List r0 = r0.mo57034a((int) r5)     // Catch:{ Exception -> 0x025c }
                    if (r0 == 0) goto L_0x01f9
                    int r3 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x01f9
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x025c }
                    r1.<init>()     // Catch:{ Exception -> 0x025c }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025c }
                L_0x0093:
                    boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x01f5
                    java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.entity.g r3 = (com.mbridge.msdk.foundation.entity.C8462g) r3     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.authoritycontroller.a r4 = com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a.m23879a()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "authority_general_data"
                    boolean r4 = r4.mo56941a((java.lang.String) r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&fb="
                    java.lang.String r6 = "&key=2000006"
                    java.lang.String r7 = "&unit_id="
                    java.lang.String r8 = "&num="
                    java.lang.String r9 = "&time="
                    java.lang.String r10 = "ad_source_id="
                    if (r4 == 0) goto L_0x0159
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    int r10 = r3.mo57736b()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r9 = r3.mo57739c()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    int r8 = r3.mo57742d()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r7 = r3.mo57744e()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    r1.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57745f()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&network_str="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = r3.mo57748i()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&network_type="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57747h()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    goto L_0x01ca
                L_0x0159:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    int r10 = r3.mo57736b()     // Catch:{ Exception -> 0x025c }
                    r4.append(r10)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r9 = r3.mo57739c()     // Catch:{ Exception -> 0x025c }
                    r4.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    int r8 = r3.mo57742d()     // Catch:{ Exception -> 0x025c }
                    r4.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r7 = r3.mo57744e()     // Catch:{ Exception -> 0x025c }
                    r4.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                    r1.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r5 = r3.mo57745f()     // Catch:{ Exception -> 0x025c }
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                L_0x01ca:
                    int r4 = r3.mo57733a()     // Catch:{ Exception -> 0x025c }
                    r5 = 1
                    if (r4 != r5) goto L_0x01d6
                    java.lang.String r4 = "&hb=1"
                    r1.append(r4)     // Catch:{ Exception -> 0x025c }
                L_0x01d6:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r4.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = "&timeout="
                    r4.append(r5)     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.mo57746g()     // Catch:{ Exception -> 0x025c }
                    r4.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = "\n"
                    r4.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    goto L_0x0093
                L_0x01f5:
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x025c }
                L_0x01f9:
                    android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r0.obj = r1     // Catch:{ Exception -> 0x025c }
                    r0.what = r2     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r1 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r1 = r1.f20500g     // Catch:{ Exception -> 0x025c }
                    r1.sendMessage(r0)     // Catch:{ Exception -> 0x025c }
                L_0x0208:
                    com.mbridge.msdk.foundation.same.b.c r0 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_CRASH_INFO     // Catch:{ Exception -> 0x025c }
                    java.lang.String r0 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r0)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r1 = "/"
                    java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    r2.<init>(r0)     // Catch:{ Exception -> 0x025c }
                    boolean r3 = r2.exists()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    java.lang.String[] r3 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.length     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0266
                    java.lang.String[] r2 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r2.length     // Catch:{ Exception -> 0x025c }
                    r4 = 0
                L_0x022e:
                    if (r4 >= r3) goto L_0x0266
                    r5 = r2[r4]     // Catch:{ Exception -> 0x025c }
                    java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r7.<init>()     // Catch:{ Exception -> 0x025c }
                    r7.append(r0)     // Catch:{ Exception -> 0x025c }
                    r7.append(r1)     // Catch:{ Exception -> 0x025c }
                    r7.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x025c }
                    r6.<init>(r5)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r5 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r5.obj = r6     // Catch:{ Exception -> 0x025c }
                    r6 = 3
                    r5.what = r6     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r6 = com.mbridge.msdk.foundation.controller.C8396b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r6 = r6.f20500g     // Catch:{ Exception -> 0x025c }
                    r6.sendMessage(r5)     // Catch:{ Exception -> 0x025c }
                    int r4 = r4 + 1
                    goto L_0x022e
                L_0x025c:
                    r0 = move-exception
                    java.lang.String r0 = r0.getMessage()
                    java.lang.String r1 = "SDKController"
                    com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
                L_0x0266:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C8396b.C84015.run():void");
            }
        }).start();
    }

    /* renamed from: a */
    public final void mo56947a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            this.f20512t = map;
            this.f20513u = i;
            C8388a.m23845e().mo56914h();
            if (map != null) {
                if (this.f20507o == null) {
                    this.f20507o = new C2435a();
                }
                try {
                    if (this.f20512t != null && this.f20512t.size() > 0 && this.f20512t.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE) && ((Integer) this.f20512t.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue() == 0) {
                        Map<String, Object> map2 = this.f20512t;
                        int i2 = this.f20513u;
                        try {
                            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.e.a");
                            Object newInstance = cls.newInstance();
                            cls.getMethod("preload", new Class[]{Map.class, Integer.TYPE}).invoke(newInstance, new Object[]{map2, Integer.valueOf(i2)});
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo56951d() {
        Context context = this.f20501i;
        if (context != null && this.f20510r == null) {
            boolean z = false;
            int i = context.getSharedPreferences("mb_optimization_setting", 0).getInt("use_thread_pool", 0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            this.f20510r = atomicBoolean;
            if (i == 0) {
                z = true;
            }
            atomicBoolean.set(z);
        }
        AtomicBoolean atomicBoolean2 = this.f20510r;
        if (atomicBoolean2 != null) {
            return atomicBoolean2.get();
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m23892a(C8396b bVar, String str) {
        if (C2445b.m6020a() != null) {
            C2445b a = C2445b.m6020a();
            if (a != null) {
                C2440a b = a.mo16286b(str);
                if (b != null) {
                    MBridgeConstans.OMID_JS_SERVICE_URL = b.mo16201as();
                    MBridgeConstans.OMID_JS_H5_URL = b.mo16200ar();
                    if (!TextUtils.isEmpty(b.mo16268y())) {
                        C8543d.m24463a().f20954c = b.mo16268y();
                        C8543d.m24463a().mo57971e();
                    }
                    if (!TextUtils.isEmpty(b.mo16270z())) {
                        C8543d.m24463a().f20955d = b.mo16270z();
                        C8543d.m24463a().mo57972f();
                    }
                } else {
                    MBridgeConstans.OMID_JS_SERVICE_URL = "https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js";
                    MBridgeConstans.OMID_JS_H5_URL = "https://mtg-native.rayjump.com/omsdk/omsdkjs_common_js.txt";
                }
            }
            if (!C2445b.m6020a().mo16282a(str) || !C2445b.m6020a().mo16283a(str, 1, (String) null)) {
                new C8582d(bVar.f20501i).mo58060a();
            } else {
                new C2452c().mo16302a(bVar.f20501i, str, bVar.f20504l);
            }
        }
    }
}
