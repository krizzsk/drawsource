package com.bytedance.sdk.openadsdk.core.video.p163d;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2283a;
import com.bytedance.sdk.component.p102b.p103a.C2737f;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3070a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3078i;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3079j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3080k;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3081l;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.d.a */
/* compiled from: VideoPreloadFactory */
public class C3624a {

    /* renamed from: a */
    public static final C2410a f9178a = new C2283a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bytedance.sdk.openadsdk.core.e.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11584a(com.bykv.p054vk.openvk.component.video.api.p071c.C2401c r13, com.bykv.p054vk.openvk.component.video.api.p073e.C2410a.C2411a r14) {
        /*
            int r0 = r13.mo15973b()
            if (r0 > 0) goto L_0x000c
            boolean r0 = r13.mo15989h()
            if (r0 == 0) goto L_0x0013
        L_0x000c:
            int r0 = r13.mo15993l()
            r1 = -2
            if (r0 != r1) goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            r0 = 6000(0x1770, float:8.408E-42)
            r13.mo15980d((int) r0)
            r13.mo15984e((int) r0)
            r13.mo15985f(r0)
            java.lang.String r0 = "material_meta"
            java.lang.Object r1 = r13.mo15983e((java.lang.String) r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r13.mo15983e((java.lang.String) r0)
            boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.core.p149e.C3431n
            if (r1 == 0) goto L_0x0033
            r1 = r3
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            java.lang.String r4 = "ad_slot"
            java.lang.Object r5 = r13.mo15983e((java.lang.String) r4)
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r13.mo15983e((java.lang.String) r4)
            boolean r5 = r5 instanceof com.bytedance.sdk.openadsdk.AdSlot
            if (r5 == 0) goto L_0x0045
            r2 = r3
        L_0x0045:
            r5 = 0
            if (r1 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            java.lang.Object r0 = r13.mo15983e((java.lang.String) r0)
            r5 = r0
            com.bytedance.sdk.openadsdk.core.e.n r5 = (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r5
            java.lang.Object r0 = r13.mo15983e((java.lang.String) r4)
            com.bytedance.sdk.openadsdk.AdSlot r0 = (com.bytedance.sdk.openadsdk.AdSlot) r0
            m11590b(r13, r5, r0)
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.sdk.openadsdk.core.video.d.a$1 r4 = new com.bytedance.sdk.openadsdk.core.video.d.a$1
            r6 = r4
            r7 = r14
            r8 = r5
            r9 = r0
            r10 = r1
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r12)
            java.lang.String r6 = r13.mo15991j()
            boolean r6 = m11589a((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a1
            if (r14 == 0) goto L_0x0091
            r3 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "unexpected url: "
            r4.append(r6)
            java.lang.String r6 = r13.mo15991j()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r14.mo16068a(r13, r3, r4)
        L_0x0091:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r9 = r3 - r1
            r11 = -1
            java.lang.String r12 = "video url is invalid"
            r6 = r13
            r7 = r5
            r8 = r0
            m11592b(r6, r7, r8, r9, r11, r12)
            return
        L_0x00a1:
            int r14 = r13.mo15993l()
            if (r14 != r3) goto L_0x00a8
            goto L_0x00bf
        L_0x00a8:
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r14 < r0) goto L_0x00b8
            com.bykv.vk.openvk.component.video.api.e.a r14 = f9178a     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x00bf }
            r14.mo15675a(r0, r13, r4)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00bf
        L_0x00b8:
            com.bykv.vk.openvk.component.video.a.b.f.a r14 = com.bykv.p054vk.openvk.component.video.p055a.p059b.p065f.C2339a.m5385a()
            r14.mo15784a(r13)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p163d.C3624a.m11584a(com.bykv.vk.openvk.component.video.api.c.c, com.bykv.vk.openvk.component.video.api.e.a$a):void");
    }

    /* renamed from: a */
    private static boolean m11588a(C2401c cVar) {
        return Build.VERSION.SDK_INT >= 23 || cVar.mo15993l() != 0;
    }

    /* renamed from: b */
    private static void m11590b(C2401c cVar, C3431n nVar, AdSlot adSlot) {
        if (m11588a(cVar)) {
            C3067a.m8768a((C3070a<C3080k>) new C3070a(nVar, C3898x.m12769b(adSlot.getDurationSlotType()), C3067a.m8764a(nVar, (String) null, -1, cVar.mo15993l()), new C3080k(cVar.mo15991j(), cVar.mo15989h() ? cVar.mo15987g() : (long) cVar.mo15973b())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11592b(C2401c cVar, C3431n nVar, AdSlot adSlot, long j, int i, String str) {
        if (m11588a(cVar)) {
            String b = C3898x.m12769b(adSlot.getDurationSlotType());
            JSONObject a = C3067a.m8764a(nVar, (String) null, -1, cVar.mo15993l());
            C3079j jVar = new C3079j();
            jVar.mo18610a(cVar.mo15991j());
            jVar.mo18609a((long) cVar.mo15973b());
            jVar.mo18611b(j);
            jVar.mo18608a(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jVar.mo18612b(str);
            jVar.mo18613c("");
            C3067a.m8781c((C3070a<C3079j>) new C3070a(nVar, b, a, jVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11591b(C2401c cVar, C3431n nVar, AdSlot adSlot, long j) {
        if (m11588a(cVar)) {
            String b = C3898x.m12769b(adSlot.getDurationSlotType());
            JSONObject a = C3067a.m8764a(nVar, (String) null, -1, cVar.mo15993l());
            C3081l lVar = new C3081l();
            lVar.mo18615a(cVar.mo15991j());
            lVar.mo18614a((long) cVar.mo15973b());
            lVar.mo18616b(j);
            if (cVar.mo15997p() == 1) {
                lVar.mo18617c(1);
            } else {
                lVar.mo18617c(0);
            }
            C3067a.m8778b((C3070a<C3081l>) new C3070a(nVar, b, a, lVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m11593c(C2401c cVar, C3431n nVar, AdSlot adSlot) {
        if (m11588a(cVar)) {
            C3067a.m8784d((C3070a<C3078i>) new C3070a(nVar, C3898x.m12769b(adSlot.getDurationSlotType()), C3067a.m8764a(nVar, (String) null, -1, cVar.mo15993l()), new C3078i(cVar.mo15991j(), (long) cVar.mo15973b())));
        }
    }

    /* renamed from: a */
    public static boolean m11589a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        if (C2737f.m7428c(str) == null) {
            return false;
        }
        return true;
    }
}
