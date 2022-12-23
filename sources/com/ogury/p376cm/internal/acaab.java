package com.ogury.p376cm.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: com.ogury.cm.internal.acaab */
public final class acaab {

    /* renamed from: a */
    private final DisplayMetrics f24420a;

    /* renamed from: b */
    private final Resources f24421b;

    /* renamed from: c */
    private final String f24422c;

    /* renamed from: d */
    private final String f24423d;

    /* renamed from: e */
    private final String f24424e;

    /* renamed from: f */
    private final String f24425f;

    /* renamed from: g */
    private final String f24426g;

    /* renamed from: h */
    private final String f24427h;

    /* renamed from: i */
    private final String f24428i;

    /* renamed from: j */
    private final boolean f24429j;

    /* renamed from: k */
    private final String f24430k;

    /* renamed from: l */
    private final Boolean f24431l;

    /* renamed from: m */
    private final Boolean f24432m;

    public acaab(DisplayMetrics displayMetrics, Resources resources, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Boolean bool, Boolean bool2) {
        bbabc.m28052b(displayMetrics, "displayMetrics");
        bbabc.m28052b(resources, "resources");
        bbabc.m28052b(str2, "assetKey");
        bbabc.m28052b(str3, "assetType");
        bbabc.m28052b(str4, "bundleId");
        bbabc.m28052b(str5, "moduleVersion");
        bbabc.m28052b(str7, "consentToken");
        this.f24420a = displayMetrics;
        this.f24421b = resources;
        this.f24422c = str;
        this.f24423d = str2;
        this.f24424e = str3;
        this.f24425f = str4;
        this.f24426g = str5;
        this.f24427h = str6;
        this.f24428i = str7;
        this.f24429j = z;
        this.f24430k = str8;
        this.f24431l = bool;
        this.f24432m = bool2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ogury.p376cm.internal.acaaa mo63898a() {
        /*
            r26 = this;
            r0 = r26
            com.ogury.cm.internal.acaaa r24 = new com.ogury.cm.internal.acaaa
            java.lang.String r2 = r0.f24423d
            java.lang.String r3 = r0.f24424e
            java.lang.String r4 = r0.f24425f
            java.lang.String r5 = r0.f24426g
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            java.lang.String r9 = android.os.Build.MANUFACTURER
            java.lang.String r8 = r0.f24427h
            java.lang.String r10 = android.os.Build.MODEL
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r6 = "Locale.getDefault()"
            com.ogury.p376cm.internal.bbabc.m28049a((java.lang.Object) r1, (java.lang.String) r6)
            java.lang.String r17 = r1.getCountry()
            java.util.Locale r1 = java.util.Locale.getDefault()
            com.ogury.p376cm.internal.bbabc.m28049a((java.lang.Object) r1, (java.lang.String) r6)
            java.lang.String r16 = r1.getLanguage()
            android.util.DisplayMetrics r1 = r0.f24420a
            int r1 = r1.heightPixels
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            android.util.DisplayMetrics r1 = r0.f24420a
            int r1 = r1.widthPixels
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            android.content.res.Resources r1 = r0.f24421b
            java.lang.String r6 = "receiver$0"
            com.ogury.p376cm.internal.bbabc.m28052b(r1, r6)
            android.content.res.Configuration r13 = r1.getConfiguration()
            int r13 = r13.screenLayout
            r13 = r13 & 15
            java.lang.String r14 = "normal"
            r15 = 4
            if (r13 != r15) goto L_0x0056
            java.lang.String r1 = "xlarge"
        L_0x0052:
            r25 = r1
        L_0x0054:
            r13 = 1
            goto L_0x0084
        L_0x0056:
            android.content.res.Configuration r13 = r1.getConfiguration()
            int r13 = r13.screenLayout
            r13 = r13 & 15
            r15 = 3
            if (r13 != r15) goto L_0x0064
            java.lang.String r1 = "large"
            goto L_0x0052
        L_0x0064:
            android.content.res.Configuration r13 = r1.getConfiguration()
            int r13 = r13.screenLayout
            r13 = r13 & 15
            r15 = 2
            if (r13 != r15) goto L_0x0072
            r25 = r14
            goto L_0x0054
        L_0x0072:
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r13 = 1
            if (r1 != r13) goto L_0x0080
            java.lang.String r1 = "small"
            goto L_0x0082
        L_0x0080:
            java.lang.String r1 = "unknown"
        L_0x0082:
            r25 = r1
        L_0x0084:
            android.content.res.Resources r1 = r0.f24421b
            com.ogury.p376cm.internal.bbabc.m28052b(r1, r6)
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            if (r6 != r13) goto L_0x0095
            r13 = r14
            goto L_0x00ed
        L_0x0095:
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            r13 = 3
            if (r6 != r13) goto L_0x00a4
            java.lang.String r1 = "car"
        L_0x00a2:
            r13 = r1
            goto L_0x00ed
        L_0x00a4:
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            r13 = 2
            if (r6 != r13) goto L_0x00b2
            java.lang.String r1 = "desk"
            goto L_0x00a2
        L_0x00b2:
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            r13 = 4
            if (r6 != r13) goto L_0x00c0
            java.lang.String r1 = "television"
            goto L_0x00a2
        L_0x00c0:
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            r13 = 5
            if (r6 != r13) goto L_0x00ce
            java.lang.String r1 = "appliance"
            goto L_0x00a2
        L_0x00ce:
            android.content.res.Configuration r6 = r1.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 15
            r13 = 6
            if (r6 != r13) goto L_0x00dc
            java.lang.String r1 = "watch"
            goto L_0x00a2
        L_0x00dc:
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 15
            r6 = 7
            if (r1 != r6) goto L_0x00ea
            java.lang.String r1 = "vrheadset"
            goto L_0x00a2
        L_0x00ea:
            java.lang.String r1 = "undefined"
            goto L_0x00a2
        L_0x00ed:
            android.util.DisplayMetrics r1 = r0.f24420a
            float r1 = r1.density
            double r14 = (double) r1
            java.lang.Double r15 = java.lang.Double.valueOf(r14)
            java.lang.String r1 = r0.f24422c
            r18 = r1
            java.lang.String r1 = r0.f24428i
            r19 = r1
            boolean r1 = r0.f24429j
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = r0.f24430k
            r20 = r1
            java.lang.Boolean r1 = r0.f24431l
            r22 = r1
            java.lang.Boolean r1 = r0.f24432m
            r23 = r1
            java.lang.String r6 = "android"
            r1 = r24
            r14 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376cm.internal.acaab.mo63898a():com.ogury.cm.internal.acaaa");
    }
}
