package com.ogury.p376cm.internal;

import android.os.Build;

/* renamed from: com.ogury.cm.internal.abcbc */
public final class abcbc {

    /* renamed from: a */
    private final String f24379a;

    /* renamed from: b */
    private final String f24380b;

    /* renamed from: c */
    private final String f24381c;

    /* renamed from: d */
    private final String f24382d;

    /* renamed from: e */
    private final String f24383e;

    /* renamed from: f */
    private final String f24384f;

    /* renamed from: g */
    private final Boolean f24385g;

    /* renamed from: h */
    private final String f24386h;

    /* renamed from: i */
    private final String f24387i;

    /* renamed from: j */
    private final String f24388j;

    /* renamed from: k */
    private final Integer[] f24389k;

    private abcbc(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, Integer[] numArr) {
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(str2, "assetType");
        bbabc.m28052b(str3, "bundleId");
        bbabc.m28052b(str4, "moduleVersion");
        bbabc.m28052b(str6, "consentToken");
        this.f24379a = str;
        this.f24380b = str2;
        this.f24381c = str3;
        this.f24382d = str4;
        this.f24383e = str5;
        this.f24384f = str6;
        this.f24385g = bool;
        this.f24386h = str7;
        this.f24387i = str8;
        this.f24388j = str9;
        this.f24389k = numArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ abcbc(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Integer[] r26, int r27, com.ogury.p376cm.internal.bbabb r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r22
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r23
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r24
        L_0x001b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r25
        L_0x0023:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0029
            r14 = r2
            goto L_0x002b
        L_0x0029:
            r14 = r26
        L_0x002b:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376cm.internal.abcbc.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer[], int, com.ogury.cm.internal.bbabb):void");
    }

    /* renamed from: a */
    public final abcbb mo63888a() {
        String str = this.f24379a;
        String str2 = this.f24380b;
        String str3 = this.f24381c;
        String str4 = this.f24382d;
        String str5 = Build.VERSION.RELEASE;
        String str6 = this.f24384f;
        Boolean bool = this.f24385g;
        String str7 = this.f24386h;
        String str8 = this.f24387i;
        return new abcbb(str, str2, str3, str4, "android", str5, this.f24383e, str6, this.f24388j, str7, bool, str8, this.f24389k);
    }
}
