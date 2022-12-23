package com.mbridge.msdk.video.dynview.p365j;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.ordercamp.p366a.C9397a;
import com.mbridge.msdk.video.dynview.p353c.C9321a;
import com.mbridge.msdk.video.dynview.p354d.C9324c;
import com.mbridge.msdk.video.dynview.p354d.C9325d;
import com.mbridge.msdk.video.dynview.p354d.C9326e;
import com.mbridge.msdk.video.dynview.p359g.C9350a;
import com.mbridge.msdk.video.dynview.p360h.C9356b;
import com.mbridge.msdk.video.dynview.p361i.C9363a;
import com.mbridge.msdk.video.dynview.p361i.p362a.C9364a;
import com.mbridge.msdk.video.dynview.p361i.p364c.C9368b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.p369b.C9497a;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.j.a */
/* compiled from: DataEnergizeWrapper */
public final class C9370a {

    /* renamed from: i */
    private static boolean f23004i = false;

    /* renamed from: a */
    private C9368b f23005a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, Bitmap> f23006b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f23007c;

    /* renamed from: d */
    private String f23008d = "#FFFFFFFF";

    /* renamed from: e */
    private String f23009e = "#60000000";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f23010f = "#FF5F5F5F";

    /* renamed from: g */
    private String f23011g = "#90ECECEC";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile long f23012h = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x03e5: MOVE  (r14v2 android.widget.ImageView) = (r27v0 android.widget.ImageView)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0325  */
    /* renamed from: a */
    public final void mo62892a(com.mbridge.msdk.video.dynview.C9317c r32, android.view.View r33, java.util.Map r34, com.mbridge.msdk.video.dynview.p354d.C9326e r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            java.util.Map<java.lang.String, android.graphics.Bitmap> r5 = r0.f23006b
            if (r5 != 0) goto L_0x0015
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f23006b = r5
        L_0x0015:
            java.util.List r5 = r32.mo62751g()
            if (r2 != 0) goto L_0x0021
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p353c.C9321a.NOT_FOUND_ROOTVIEW
            r4.mo62778a(r1)
            return
        L_0x0021:
            android.content.Context r6 = r33.getContext()
            if (r6 != 0) goto L_0x002d
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p353c.C9321a.NOT_FOUND_CONTEXT
            r4.mo62778a(r1)
            return
        L_0x002d:
            r7 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0044
            int r10 = r5.size()
            if (r10 <= r7) goto L_0x0044
            java.lang.Object r10 = r5.get(r9)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            java.lang.Object r11 = r5.get(r7)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            goto L_0x0046
        L_0x0044:
            r10 = 0
            r11 = 0
        L_0x0046:
            if (r10 != 0) goto L_0x0050
            if (r4 == 0) goto L_0x0050
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p353c.C9321a.CAMPAIGNEX_IS_NULL
            r4.mo62778a(r1)
            return
        L_0x0050:
            if (r11 != 0) goto L_0x005a
            if (r4 == 0) goto L_0x005a
            com.mbridge.msdk.video.dynview.c.a r1 = com.mbridge.msdk.video.dynview.p353c.C9321a.CAMPAIGNEX_IS_NULL
            r4.mo62778a(r1)
            return
        L_0x005a:
            java.lang.String r12 = "is_dy_success"
            if (r3 == 0) goto L_0x0070
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L_0x0070
            java.lang.Object r13 = r3.get(r12)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            f23004i = r13
        L_0x0070:
            boolean r13 = f23004i
            java.lang.String r14 = "mbridge_reward_choice_one_like_iv"
            java.lang.String r15 = "mbridge_bottom_title_tv"
            java.lang.String r8 = "mbridge_bottom_icon_iv"
            java.lang.String r9 = "mbridge_bottom_iv"
            java.lang.String r7 = "mbridge_bottom_ration"
            java.lang.String r4 = "mbridge_bottom_item_rl"
            r16 = r6
            java.lang.String r6 = "mbridge_top_title_tv"
            r17 = r12
            java.lang.String r12 = "mbridge_top_icon_iv"
            r18 = r11
            java.lang.String r11 = "mbridge_top_ration"
            java.lang.String r1 = "mbridge_top_iv"
            r19 = r10
            java.lang.String r10 = "mbridge_top_item_rl"
            if (r13 == 0) goto L_0x010c
            int r10 = r0.m26725b((java.lang.String) r10)
            android.view.View r10 = r2.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            int r1 = r0.m26725b((java.lang.String) r1)
            android.view.View r1 = r2.findViewById(r1)
            com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView r1 = (com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView) r1
            int r11 = r0.m26725b((java.lang.String) r11)
            android.view.View r11 = r2.findViewById(r11)
            com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView r11 = (com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView) r11
            int r12 = r0.m26725b((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView r12 = (com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView) r12
            int r6 = r0.m26725b((java.lang.String) r6)
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r4 = r0.m26725b((java.lang.String) r4)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            int r7 = r0.m26725b((java.lang.String) r7)
            android.view.View r7 = r2.findViewById(r7)
            com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView r7 = (com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView) r7
            int r9 = r0.m26725b((java.lang.String) r9)
            android.view.View r9 = r2.findViewById(r9)
            com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView r9 = (com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView) r9
            int r8 = r0.m26725b((java.lang.String) r8)
            android.view.View r8 = r2.findViewById(r8)
            com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView r8 = (com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView) r8
            int r13 = r0.m26725b((java.lang.String) r15)
            android.view.View r13 = r2.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            int r14 = r0.m26725b((java.lang.String) r14)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r15 = r13
            r27 = r14
            r13 = 0
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = 0
            goto L_0x0183
        L_0x010c:
            int r10 = r0.m26713a((java.lang.String) r10)
            android.view.View r10 = r2.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            int r1 = r0.m26713a((java.lang.String) r1)
            android.view.View r1 = r2.findViewById(r1)
            com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView r1 = (com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView) r1
            int r11 = r0.m26713a((java.lang.String) r11)
            android.view.View r11 = r2.findViewById(r11)
            com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView r11 = (com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView) r11
            int r12 = r0.m26713a((java.lang.String) r12)
            android.view.View r12 = r2.findViewById(r12)
            com.mbridge.msdk.videocommon.view.RoundImageView r12 = (com.mbridge.msdk.videocommon.view.RoundImageView) r12
            int r6 = r0.m26713a((java.lang.String) r6)
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r4 = r0.m26713a((java.lang.String) r4)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            int r7 = r0.m26713a((java.lang.String) r7)
            android.view.View r7 = r2.findViewById(r7)
            com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView r7 = (com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView) r7
            int r9 = r0.m26713a((java.lang.String) r9)
            android.view.View r9 = r2.findViewById(r9)
            com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView r9 = (com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView) r9
            int r8 = r0.m26713a((java.lang.String) r8)
            android.view.View r8 = r2.findViewById(r8)
            com.mbridge.msdk.videocommon.view.RoundImageView r8 = (com.mbridge.msdk.videocommon.view.RoundImageView) r8
            int r13 = r0.m26713a((java.lang.String) r15)
            android.view.View r13 = r2.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            int r14 = r0.m26713a((java.lang.String) r14)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r15 = r13
            r27 = r14
            r14 = 0
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = 0
        L_0x0183:
            r28 = r15
            if (r11 == 0) goto L_0x018f
            com.mbridge.msdk.video.dynview.j.a$1 r15 = new com.mbridge.msdk.video.dynview.j.a$1
            r15.<init>(r3, r5)
            r11.setOnClickListener(r15)
        L_0x018f:
            if (r1 == 0) goto L_0x021f
            r21 = 20
            r22 = 20
            r23 = 0
            r24 = 0
            r25 = 10
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r20 = r1
            r20.setCustomBorder(r21, r22, r23, r24, r25, r26)
            java.lang.String r15 = r19.getImageUrl()
            r11 = r32
            r0.m26722a((java.lang.String) r15, (android.widget.ImageView) r1, (com.mbridge.msdk.video.dynview.C9317c) r11, (android.view.View) r2)
            if (r12 == 0) goto L_0x0221
            boolean r1 = r19.getCanStart2C1Anim()
            if (r1 == 0) goto L_0x020e
            java.lang.String r1 = r19.getIconUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01fd
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r15 = r32.mo62745a()
            r1.<init>(r15)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r29 = r9
            android.content.Context r9 = r32.mo62745a()
            r30 = r8
            r8 = 1128792064(0x43480000, float:200.0)
            int r9 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r9, (float) r8)
            r8 = -1
            r15.<init>(r8, r9)
            r1.setLayoutParams(r15)
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r8)
            r12.addView(r1)
            java.lang.String r8 = r19.getIconUrl()
            r0.m26721a((java.lang.String) r8, (android.widget.ImageView) r1)
            r1 = 1055286886(0x3ee66666, float:0.45)
            r12.setWidthRatio(r1)
            r1 = 1063675494(0x3f666666, float:0.9)
            r12.setHeightRatio(r1)
            r1 = 1
            r12.setAutoscroll(r1)
            goto L_0x0225
        L_0x01fd:
            r30 = r8
            r29 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.setWidthRatio(r1)
            r12.setHeightRatio(r1)
            r8 = 0
            r12.setAutoscroll(r8)
            goto L_0x0226
        L_0x020e:
            r30 = r8
            r29 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r12.setWidthRatio(r1)
            r12.setHeightRatio(r1)
            r12.setAutoscroll(r8)
            goto L_0x0226
        L_0x021f:
            r11 = r32
        L_0x0221:
            r30 = r8
            r29 = r9
        L_0x0225:
            r8 = 0
        L_0x0226:
            if (r13 == 0) goto L_0x0232
            r13.setType(r8)
            java.lang.String r1 = r19.getIconUrl()
            r0.m26721a((java.lang.String) r1, (android.widget.ImageView) r13)
        L_0x0232:
            if (r14 == 0) goto L_0x023b
            java.lang.String r1 = r19.getIconUrl()
            r0.m26721a((java.lang.String) r1, (android.widget.ImageView) r14)
        L_0x023b:
            if (r6 == 0) goto L_0x0254
            java.lang.String r1 = r19.getAppName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x024f
            java.lang.String r1 = r19.getAppName()
            r6.setText(r1)
            goto L_0x0254
        L_0x024f:
            r1 = 8
            r6.setVisibility(r1)
        L_0x0254:
            if (r4 == 0) goto L_0x025e
            com.mbridge.msdk.video.dynview.j.a$2 r1 = new com.mbridge.msdk.video.dynview.j.a$2
            r1.<init>(r3, r5)
            r4.setOnClickListener(r1)
        L_0x025e:
            if (r10 == 0) goto L_0x02e0
            r21 = 20
            r22 = 20
            r23 = 0
            r24 = 0
            r25 = 10
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r20 = r10
            r20.setCustomBorder(r21, r22, r23, r24, r25, r26)
            java.lang.String r1 = r18.getImageUrl()
            r0.m26722a((java.lang.String) r1, (android.widget.ImageView) r10, (com.mbridge.msdk.video.dynview.C9317c) r11, (android.view.View) r2)
            if (r7 == 0) goto L_0x02e0
            boolean r1 = r18.getCanStart2C1Anim()
            if (r1 == 0) goto L_0x02d3
            java.lang.String r1 = r18.getIconUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02c6
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r4 = r32.mo62745a()
            r1.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            android.content.Context r5 = r32.mo62745a()
            r6 = 1128792064(0x43480000, float:200.0)
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r5, (float) r6)
            r6 = -1
            r4.<init>(r6, r5)
            r1.setLayoutParams(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r4)
            r7.addView(r1)
            java.lang.String r4 = r18.getIconUrl()
            r0.m26721a((java.lang.String) r4, (android.widget.ImageView) r1)
            r1 = 1055286886(0x3ee66666, float:0.45)
            r7.setWidthRatio(r1)
            r1 = 1063675494(0x3f666666, float:0.9)
            r7.setHeightRatio(r1)
            r1 = 1
            r7.setAutoscroll(r1)
            goto L_0x02e0
        L_0x02c6:
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.setWidthRatio(r1)
            r7.setHeightRatio(r1)
            r4 = 0
            r7.setAutoscroll(r4)
            goto L_0x02e1
        L_0x02d3:
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r7.setWidthRatio(r1)
            r7.setHeightRatio(r1)
            r7.setAutoscroll(r4)
            goto L_0x02e1
        L_0x02e0:
            r4 = 0
        L_0x02e1:
            if (r30 == 0) goto L_0x02ef
            r8 = r30
            r8.setType(r4)
            java.lang.String r1 = r18.getIconUrl()
            r0.m26721a((java.lang.String) r1, (android.widget.ImageView) r8)
        L_0x02ef:
            if (r29 == 0) goto L_0x02fa
            java.lang.String r1 = r18.getIconUrl()
            r8 = r29
            r0.m26721a((java.lang.String) r1, (android.widget.ImageView) r8)
        L_0x02fa:
            if (r28 == 0) goto L_0x0305
            java.lang.String r1 = r18.getAppName()
            r13 = r28
            r13.setText(r1)
        L_0x0305:
            java.lang.String r1 = r19.getCMPTEntryUrl()
            int r4 = r32.mo62749e()
            java.lang.String r5 = "cltp"
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r1, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r5 != 0) goto L_0x0320
            long r8 = java.lang.Long.parseLong(r1)
            goto L_0x0321
        L_0x0320:
            r8 = r6
        L_0x0321:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x03e1
            if (r3 == 0) goto L_0x033b
            r1 = r17
            boolean r5 = r3.containsKey(r1)
            if (r5 == 0) goto L_0x033b
            java.lang.Object r1 = r3.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            f23004i = r1
        L_0x033b:
            boolean r1 = f23004i
            java.lang.String r5 = "mbridge_choice_one_countdown_tv"
            if (r1 == 0) goto L_0x034c
            int r1 = r0.m26725b((java.lang.String) r5)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0356
        L_0x034c:
            int r1 = r0.m26713a((java.lang.String) r5)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0356:
            r5 = 1093664768(0x41300000, float:11.0)
            r1.setTextSize(r5)
            java.lang.String r5 = r0.f23008d
            int r5 = android.graphics.Color.parseColor(r5)
            r1.setTextColor(r5)
            r5 = 12
            java.lang.String r6 = r0.f23009e
            if (r1 == 0) goto L_0x0397
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            int r10 = android.graphics.Color.parseColor(r6)
            r7.setColor(r10)
            android.content.Context r10 = r1.getContext()
            float r5 = (float) r5
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r10, (float) r5)
            float r5 = (float) r5
            r7.setCornerRadius(r5)
            android.content.Context r5 = r1.getContext()
            r10 = 1
            float r12 = (float) r10
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r5, (float) r12)
            int r6 = android.graphics.Color.parseColor(r6)
            r7.setStroke(r5, r6)
            r1.setBackground(r7)
        L_0x0397:
            r5 = 2
            if (r4 != r5) goto L_0x03b2
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            if (r4 == 0) goto L_0x03b2
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24940e((android.content.Context) r16)
            r6 = 1092616192(0x41200000, float:10.0)
            r7 = r16
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r7, (float) r6)
            r4.setMargins(r6, r6, r5, r6)
            goto L_0x03b4
        L_0x03b2:
            r7 = r16
        L_0x03b4:
            if (r1 == 0) goto L_0x03e3
            r4 = 0
            r1.setVisibility(r4)
            com.mbridge.msdk.video.dynview.j.a$3 r4 = new com.mbridge.msdk.video.dynview.j.a$3
            r4.<init>(r3)
            r1.setOnClickListener(r4)
            com.mbridge.msdk.video.dynview.i.c.b r4 = new com.mbridge.msdk.video.dynview.i.c.b
            r4.<init>()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r5
            com.mbridge.msdk.video.dynview.i.c.b r4 = r4.mo62886b(r8)
            com.mbridge.msdk.video.dynview.i.c.b r4 = r4.mo62883a((long) r5)
            com.mbridge.msdk.video.dynview.j.a$4 r5 = new com.mbridge.msdk.video.dynview.j.a$4
            r5.<init>(r1, r3)
            com.mbridge.msdk.video.dynview.i.c.b r1 = r4.mo62884a((com.mbridge.msdk.video.dynview.p361i.p364c.C9367a) r5)
            r0.f23005a = r1
            r1.mo62885a()
            goto L_0x03e3
        L_0x03e1:
            r7 = r16
        L_0x03e3:
            if (r11 == 0) goto L_0x0414
            r14 = r27
            if (r14 == 0) goto L_0x0414
            int r1 = r32.mo62749e()
            r3 = 1
            if (r1 != r3) goto L_0x0402
            java.lang.String r1 = com.mbridge.msdk.video.dynview.p361i.C9365b.m26702a(r7, r3)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.String r4 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r3, r1, r4)
            r14.setImageResource(r1)
            goto L_0x0414
        L_0x0402:
            r1 = 2
            java.lang.String r1 = com.mbridge.msdk.video.dynview.p361i.C9365b.m26702a(r7, r1)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.String r4 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r3, r1, r4)
            r14.setImageResource(r1)
        L_0x0414:
            r1 = r35
            if (r1 == 0) goto L_0x041c
            r3 = 0
            r1.mo62777a(r2, r3)
        L_0x041c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p365j.C9370a.mo62892a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.d.e):void");
    }

    /* renamed from: b */
    public final void mo62893b(C9317c cVar, View view, Map map, C9326e eVar) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView;
        ImageView imageView;
        TextView textView2;
        TextView textView3;
        ImageView imageView2;
        View view2 = view;
        Map map2 = map;
        C9326e eVar2 = eVar;
        if (eVar2 != null) {
            if (cVar == null) {
                eVar2.mo62778a(C9321a.NOT_FOUND_VIEWOPTION);
                return;
            }
            if (map2 != null && map2.containsKey("is_dy_success")) {
                f23004i = ((Boolean) map2.get("is_dy_success")).booleanValue();
            }
            if (f23004i) {
                imageView2 = (ImageView) view2.findViewById(m26725b("mbridge_reward_icon_riv"));
                textView3 = (TextView) view2.findViewById(m26725b("mbridge_reward_title_tv"));
                linearLayout2 = (LinearLayout) view2.findViewById(m26725b("mbridge_reward_stars_mllv"));
                linearLayout = (LinearLayout) view2.findViewById(m26725b("mbridge_reward_heat_mllv"));
                textView = (TextView) view2.findViewById(m26725b("mbridge_reward_click_tv"));
                imageView = (ImageView) view2.findViewById(m26725b("mbridge_videoview_bg"));
                textView2 = (TextView) view2.findViewById(m26725b("mbridge_reward_desc_tv"));
            } else {
                linearLayout2 = (LinearLayout) view2.findViewById(m26713a("mbridge_reward_stars_mllv"));
                textView = (TextView) view2.findViewById(m26713a("mbridge_reward_click_tv"));
                imageView = (ImageView) view2.findViewById(m26713a("mbridge_videoview_bg"));
                textView2 = (TextView) view2.findViewById(m26713a("mbridge_reward_desc_tv"));
                TextView textView4 = (TextView) view2.findViewById(m26713a("mbridge_reward_title_tv"));
                linearLayout = null;
                imageView2 = (ImageView) view2.findViewById(m26713a("mbridge_reward_icon_riv"));
                textView3 = textView4;
            }
            ArrayList arrayList = new ArrayList();
            List<CampaignEx> g = cVar.mo62751g();
            if (g == null || g.size() <= 0) {
                eVar2.mo62778a(C9321a.CAMPAIGNEX_IS_NULL);
                return;
            }
            CampaignEx campaignEx = g.get(0);
            if (campaignEx != null) {
                if (imageView2 != null) {
                    if (!f23004i) {
                        ((RoundImageView) imageView2).setBorderRadius(10);
                    } else if (imageView2 instanceof MBCusRoundImageView) {
                        ((MBCusRoundImageView) imageView2).setCustomBorder(30, 30, 30, 30, 10, -1);
                    }
                    m26721a(campaignEx.getIconUrl(), imageView2);
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppName());
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f23004i) {
                        if (linearLayout2 != null && (linearLayout2 instanceof MBStarLevelLayoutView)) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout != null && (linearLayout instanceof MBHeatLevelLayoutView)) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAdCall());
                }
                int h = cVar.mo62752h();
                if (h == 102 || h == 202 || h == 302) {
                    if (textView != null) {
                        arrayList.add(textView);
                    }
                } else if (h == 802) {
                    if (imageView2 != null) {
                        arrayList.add(imageView2);
                    }
                    if (textView != null) {
                        arrayList.add(textView);
                    }
                    m26716a(imageView, campaignEx.getImageUrl(), h);
                } else if (h == 904 && cVar.mo62755k()) {
                    arrayList.add(view2);
                }
                eVar2.mo62777a(view2, arrayList);
                return;
            }
            eVar2.mo62778a(C9321a.CAMPAIGNEX_IS_NULL);
        }
    }

    /* renamed from: a */
    public final void mo62891a(C9317c cVar, View view, C9326e eVar) {
        if (eVar != null) {
            if (cVar == null) {
                eVar.mo62778a(C9321a.NOT_FOUND_VIEWOPTION);
                return;
            }
            try {
                ImageView imageView = (ImageView) view.findViewById(m26713a("mbridge_iv_adbanner_bg"));
                if (imageView != null) {
                    imageView.setBackgroundColor(Color.parseColor(this.f23011g));
                }
                ImageView imageView2 = (ImageView) view.findViewById(m26713a("mbridge_iv_adbanner"));
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(Color.parseColor(this.f23011g));
                }
                eVar.mo62777a(view, new ArrayList());
            } catch (Exception e) {
                C8672v.m24874a("DataEnergizeWrapper", e.getMessage());
                eVar.mo62778a(C9321a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* renamed from: c */
    public final void mo62894c(C9317c cVar, View view, final Map map, C9326e eVar) {
        GridView gridView;
        ImageView imageView;
        ListView listView;
        try {
            if (this.f23006b == null) {
                this.f23006b = new HashMap();
            }
            final List<CampaignEx> g = cVar.mo62751g();
            if (view.getContext() == null) {
                eVar.mo62778a(C9321a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f23004i = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (f23004i) {
                listView = (ListView) view.findViewById(m26725b("mbridge_order_view_lv"));
                gridView = (GridView) view.findViewById(m26725b("mbridge_order_view_h_lv"));
                imageView = (ImageView) view.findViewById(m26725b("mbridge_order_view_iv_close"));
            } else {
                listView = (ListView) view.findViewById(m26713a("mbridge_order_view_lv"));
                gridView = (GridView) view.findViewById(m26713a("mbridge_order_view_h_lv"));
                imageView = (ImageView) view.findViewById(m26713a("mbridge_order_view_iv_close"));
            }
            C9397a aVar = new C9397a(g);
            if (cVar.mo62749e() == 1) {
                if (listView != null) {
                    listView.setAdapter(aVar);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                            C9370a.m26720a(C9370a.this, map, g, i);
                        }
                    });
                }
            } else if (gridView != null) {
                int d = (int) cVar.mo62748d();
                int size = d / g.size();
                int i = size / 9;
                int i2 = i / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = d - (i * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i) - (i2 / 2));
                gridView.setHorizontalSpacing(i2);
                gridView.setStretchMode(0);
                gridView.setNumColumns(g.size());
                gridView.setAdapter(aVar);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C9370a.m26720a(C9370a.this, map, g, i);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C9370a.m26728b(C9370a.this, map);
                    }
                });
            }
            if (eVar != null) {
                eVar.mo62777a(view, (List<View>) null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.mo62778a(C9321a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* renamed from: a */
    private void m26721a(String str, ImageView imageView) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            m26716a(imageView, str, -1);
        }
    }

    /* renamed from: a */
    private void m26716a(final ImageView imageView, String str, final int i) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            C8481b.m24310a(imageView.getContext()).mo57883a(str, (C8484c) new C8484c() {
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        int a = C8658p.m24799a(imageView.getContext(), "mbridge_icon_play_bg", "drawable");
                        imageView.setBackgroundColor(Color.parseColor(C9370a.this.f23010f));
                        imageView.setImageResource(a);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        return;
                    }
                    int i = i;
                    if (i == 501 || i == 802) {
                        imageView.setImageBitmap(C9363a.m26695a().mo62878a(bitmap, 0));
                    } else {
                        imageView.setImageBitmap(bitmap);
                    }
                }

                public final void onFailedLoad(String str, String str2) {
                    try {
                        int a = C8658p.m24799a(imageView.getContext(), "mbridge_icon_play_bg", "drawable");
                        imageView.setBackgroundColor(Color.parseColor(C9370a.this.f23010f));
                        imageView.setImageResource(a);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                    } catch (Exception e) {
                        C8672v.m24874a("DataEnergizeWrapper", e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m26722a(String str, ImageView imageView, C9317c cVar, View view) {
        final ImageView imageView2 = imageView;
        final String str2 = str;
        final C9317c cVar2 = cVar;
        final View view2 = view;
        C8481b.m24310a(imageView.getContext()).mo57883a(str, (C8484c) new C8484c() {
            public final void onFailedLoad(String str, String str2) {
            }

            public final void onSuccessLoad(Bitmap bitmap, String str) {
                ImageView imageView;
                if (bitmap != null && !bitmap.isRecycled() && (imageView = imageView2) != null) {
                    imageView.setImageBitmap(bitmap);
                    if (C9370a.this.f23006b != null) {
                        C9370a.this.f23006b.put(SameMD5.getMD5(str2), bitmap);
                        C9370a.m26718a(C9370a.this, cVar2, view2);
                    }
                }
            }
        });
        if (m26715a() != null) {
            m26717a(cVar, view);
        }
    }

    /* renamed from: a */
    private int m26713a(String str) {
        return C8658p.m24799a(C8388a.m23845e().mo56913g(), str, "id");
    }

    /* renamed from: b */
    private int m26725b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    /* renamed from: a */
    private Bitmap m26715a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.f23011g));
            return bitmap;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return bitmap;
            }
            e.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: a */
    private void m26717a(C9317c cVar, View view) {
        C9350a.C9352a a = C9350a.m26656a();
        a.mo62855a(cVar.mo62749e()).mo62857a(true);
        if (cVar.mo62749e() != 2) {
            a.mo62854a(cVar.mo62748d()).mo62859b(cVar.mo62747c());
        } else if (cVar.mo62748d() > cVar.mo62747c()) {
            a.mo62854a(cVar.mo62748d()).mo62859b(cVar.mo62747c());
        } else {
            a.mo62854a(cVar.mo62747c()).mo62859b(cVar.mo62748d());
        }
        if (view.getBackground() == null) {
            view.setBackground(a.mo62858a());
        }
    }

    /* renamed from: b */
    private void m26727b() {
        C9364a.m26697a().mo62880b();
        C9368b bVar = this.f23005a;
        if (bVar != null) {
            bVar.mo62887b();
            this.f23005a = null;
        }
        Map<String, Bitmap> map = this.f23006b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f23006b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        if (!(next == null || next.getValue() == null || ((Bitmap) next.getValue()).isRecycled())) {
                            ((Bitmap) next.getValue()).recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f23006b.clear();
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.j.a$a */
    /* compiled from: DataEnergizeWrapper */
    private static final class C9380a implements Runnable {

        /* renamed from: a */
        private List<CampaignEx> f23040a;

        /* renamed from: b */
        private int f23041b;

        /* renamed from: c */
        private long f23042c;

        /* renamed from: d */
        private int f23043d;

        public C9380a(List<CampaignEx> list, int i, long j, int i2) {
            this.f23040a = list;
            this.f23041b = i;
            this.f23042c = j;
            this.f23043d = i2;
        }

        public final void run() {
            List<CampaignEx> list = this.f23040a;
            if (list != null) {
                try {
                    CampaignEx campaignEx = list.get(this.f23041b);
                    if (campaignEx != null) {
                        C9497a.m27014a(campaignEx.getCampaignUnitId(), campaignEx, this.f23043d, String.valueOf(this.f23042c));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26720a(C9370a aVar, Map map, List list, int i) {
        if (map != null && list != null && list.size() > 1) {
            if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C9325d)) {
                C9325d dVar = (C9325d) map.get("choice_one_callback");
                if (dVar != null) {
                    try {
                        C8498b.m24360b().execute(new C9380a(list, i, aVar.f23012h, 0));
                    } catch (Exception unused) {
                    }
                    dVar.mo61389a((CampaignEx) list.get(i));
                }
                aVar.m26727b();
            } else if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof C9324c)) {
                C9324c cVar = (C9324c) map.get("order_view_callback");
                if (cVar != null) {
                    try {
                        C8498b.m24360b().execute(new C9380a(list, i, aVar.f23012h, 0));
                    } catch (Exception unused2) {
                    }
                    cVar.mo62776a((CampaignEx) list.get(i), i);
                }
                aVar.m26727b();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26719a(C9370a aVar, Map map) {
        if (map != null && map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C9325d)) {
            ((C9325d) map.get("choice_one_callback")).mo61388a();
            aVar.m26727b();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m26728b(C9370a aVar, Map map) {
        if (map != null && map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof C9324c)) {
            ((C9324c) map.get("order_view_callback")).mo62775a();
            aVar.m26727b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26718a(C9370a aVar, C9317c cVar, View view) {
        Map<String, Bitmap> map = aVar.f23006b;
        if (map != null && map.size() > 1) {
            new C9356b();
            Map<String, Bitmap> map2 = aVar.f23006b;
            if (view != null) {
                C9364a.m26697a().mo62879a(map2, cVar, view);
            }
        }
    }
}
