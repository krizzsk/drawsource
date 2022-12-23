package com.mbridge.msdk.video.p347bt.module.p350b;

import android.content.Context;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p375d.C9640c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.d */
/* compiled from: ProxyShowRewardListener */
public final class C9306d extends C9304b {

    /* renamed from: a */
    private C9311h f22839a;

    /* renamed from: b */
    private C9640c f22840b;

    /* renamed from: c */
    private String f22841c;

    /* renamed from: d */
    private String f22842d;

    /* renamed from: e */
    private boolean f22843e;

    /* renamed from: f */
    private Context f22844f;

    /* renamed from: g */
    private boolean f22845g = false;

    /* renamed from: h */
    private boolean f22846h = false;

    /* renamed from: i */
    private boolean f22847i = false;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9306d(android.content.Context r4, boolean r5, com.mbridge.msdk.videocommon.p375d.C9640c r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.video.p347bt.module.p350b.C9311h r8, java.lang.String r9, java.lang.String r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f22845g = r0
            r3.f22846h = r0
            r3.f22847i = r0
            r3.f22839a = r8
            r3.f22840b = r6
            r3.f22841c = r10
            r3.f22842d = r9
            r3.f22843e = r5
            r3.f22844f = r4
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x0071 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0071 }
            r8 = 0
            if (r5 != 0) goto L_0x0042
            com.mbridge.msdk.c.b r5 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.c.a r4 = r5.mo16286b(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0038
            com.mbridge.msdk.c.b r4 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.c.a r4 = r4.mo16285b()     // Catch:{ Exception -> 0x0071 }
        L_0x0038:
            if (r4 == 0) goto L_0x0042
            long r4 = r4.mo16156K()     // Catch:{ Exception -> 0x0071 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            goto L_0x0043
        L_0x0042:
            r4 = r8
        L_0x0043:
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.videocommon.d.a r10 = r10.mo63556b()     // Catch:{ Exception -> 0x0071 }
            if (r10 == 0) goto L_0x0051
            long r8 = r10.mo63541d()     // Catch:{ Exception -> 0x0071 }
        L_0x0051:
            if (r7 == 0) goto L_0x0071
            boolean r4 = r7.isSpareOffer(r8, r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 == 0) goto L_0x006b
            r4 = 1
            r7.setSpareOfferFlag(r4)     // Catch:{ Exception -> 0x0071 }
            int r5 = r6.mo63614x()     // Catch:{ Exception -> 0x0071 }
            if (r5 != r4) goto L_0x0067
            r7.setCbt(r4)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x0067:
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x006b:
            r7.setSpareOfferFlag(r0)     // Catch:{ Exception -> 0x0071 }
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.p350b.C9306d.<init>(android.content.Context, boolean, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.video.bt.module.b.h, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo61307a() {
        super.mo61307a();
        C9311h hVar = this.f22839a;
        if (hVar != null && !this.f22845g) {
            this.f22845g = true;
            hVar.mo61307a();
            this.f22839a.mo61308a(2, this.f22842d, this.f22841c);
        }
    }

    /* renamed from: a */
    public final void mo61312a(boolean z, C9630c cVar) {
        super.mo61312a(z, cVar);
        C9311h hVar = this.f22839a;
        if (hVar != null && !this.f22847i) {
            this.f22847i = true;
            hVar.mo61308a(7, this.f22842d, this.f22841c);
            this.f22839a.mo61312a(z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo61311a(boolean z, int i) {
        super.mo61311a(z, i);
        C9311h hVar = this.f22839a;
        if (hVar != null && !this.f22847i) {
            hVar.mo61311a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo61309a(String str) {
        super.mo61309a(str);
        C9311h hVar = this.f22839a;
        if (hVar != null && !this.f22846h) {
            this.f22846h = true;
            hVar.mo61309a(str);
            this.f22839a.mo61308a(4, this.f22842d, this.f22841c);
        }
    }

    /* renamed from: a */
    public final void mo61313a(boolean z, String str, String str2) {
        super.mo61313a(z, str, str2);
        C9311h hVar = this.f22839a;
        if (hVar != null) {
            hVar.mo61313a(z, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo61314b(String str, String str2) {
        super.mo61314b(str, str2);
        C9311h hVar = this.f22839a;
        if (hVar != null) {
            hVar.mo61314b(str, str2);
            this.f22839a.mo61308a(6, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo61310a(String str, String str2) {
        super.mo61310a(str, str2);
        C9311h hVar = this.f22839a;
        if (hVar != null) {
            hVar.mo61310a(str, str2);
            this.f22839a.mo61308a(5, str, str2);
        }
    }
}
