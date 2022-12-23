package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MBSplashShakeView extends MBLinearLayout {

    /* renamed from: a */
    private final String f18165a = "浏览第三方应用";

    /* renamed from: b */
    private final String f18166b = "View";

    /* renamed from: c */
    private final String f18167c = "打开第三方应用";

    /* renamed from: d */
    private final String f18168d = "Open";

    /* renamed from: e */
    private final String f18169e = "下载第三方应用";

    /* renamed from: f */
    private final String f18170f = "Install";

    /* renamed from: g */
    private ImageView f18171g;

    /* renamed from: h */
    private Animation f18172h;

    public MBSplashShakeView(Context context) {
        super(context);
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012a, code lost:
        if (r0 != false) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 1
            r14.setOrientation(r0)
            r14.setGravity(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r2 = r14.getContext()
            r1.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r3 = r14.getContext()
            r4 = 1117782016(0x42a00000, float:80.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r4)
            android.content.Context r5 = r14.getContext()
            int r4 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r5, (float) r4)
            r2.<init>(r3, r4)
            r1.setLayoutParams(r2)
            java.lang.String r2 = "#60000000"
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r3.setColor(r2)
            r2 = 200(0xc8, float:2.8E-43)
            float r2 = (float) r2
            r3.setCornerRadius(r2)
            r1.setBackground(r3)
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r14.getContext()
            r2.<init>(r3)
            r14.f18171g = r2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            android.content.Context r3 = r14.getContext()
            r4 = 1109393408(0x42200000, float:40.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r4)
            android.content.Context r5 = r14.getContext()
            int r4 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r5, (float) r4)
            r2.<init>(r3, r4)
            r3 = 17
            r2.gravity = r3
            android.widget.ImageView r4 = r14.f18171g
            r4.setLayoutParams(r2)
            android.content.res.Resources r2 = r14.getResources()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r4 = r4.mo56903b()
            java.lang.String r5 = "mbridge_splash_btn_shake"
            java.lang.String r6 = "drawable"
            int r2 = r2.getIdentifier(r5, r6, r4)
            android.widget.ImageView r4 = r14.f18171g
            r4.setImageResource(r2)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r4 = r14.getContext()
            r2.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r2.setLayoutParams(r4)
            r2.addView(r1)
            android.widget.ImageView r1 = r14.f18171g
            r2.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r4 = r14.getContext()
            r1.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r5, r5)
            android.content.Context r6 = r14.getContext()
            r7 = 1092616192(0x41200000, float:10.0)
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r6, (float) r7)
            r4.topMargin = r6
            r1.setLayoutParams(r4)
            r1.setGravity(r3)
            java.lang.String r4 = "摇动手机 或 点击图标"
            r1.setText(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r4)
            r4 = -1
            r1.setTextColor(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r7 = "View"
            java.lang.String r8 = "浏览第三方应用"
            if (r6 != 0) goto L_0x012d
            int r6 = r15.hashCode()
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 0
            switch(r6) {
                case -672744069: goto L_0x0112;
                case 2464362: goto L_0x0108;
                case 2666181: goto L_0x0100;
                case 855294846: goto L_0x00f6;
                case 1383132195: goto L_0x00ec;
                case 1681333335: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x011c
        L_0x00e4:
            boolean r6 = r15.equals(r8)
            if (r6 == 0) goto L_0x011c
            r6 = r13
            goto L_0x011d
        L_0x00ec:
            java.lang.String r6 = "打开第三方应用"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x011c
            r6 = r9
            goto L_0x011d
        L_0x00f6:
            java.lang.String r6 = "下载第三方应用"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x011c
            r6 = r11
            goto L_0x011d
        L_0x0100:
            boolean r6 = r15.equals(r7)
            if (r6 == 0) goto L_0x011c
            r6 = r0
            goto L_0x011d
        L_0x0108:
            java.lang.String r6 = "Open"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x011c
            r6 = r10
            goto L_0x011d
        L_0x0112:
            java.lang.String r6 = "Install"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x011c
            r6 = r12
            goto L_0x011d
        L_0x011c:
            r6 = r4
        L_0x011d:
            if (r6 == 0) goto L_0x012a
            if (r6 == r0) goto L_0x012a
            if (r6 == r12) goto L_0x012a
            if (r6 == r11) goto L_0x012a
            if (r6 == r10) goto L_0x012a
            if (r6 == r9) goto L_0x012a
            r0 = r13
        L_0x012a:
            if (r0 == 0) goto L_0x012d
            goto L_0x014a
        L_0x012d:
            android.content.Context r15 = r14.getContext()
            android.content.res.Resources r15 = r15.getResources()
            android.content.res.Configuration r15 = r15.getConfiguration()
            java.util.Locale r15 = r15.locale
            java.lang.String r15 = r15.getLanguage()
            java.lang.String r0 = "en"
            boolean r15 = r15.contains(r0)
            if (r15 == 0) goto L_0x0149
            r15 = r7
            goto L_0x014a
        L_0x0149:
            r15 = r8
        L_0x014a:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r6 = r14.getContext()
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r5, r5)
            android.content.Context r5 = r14.getContext()
            r7 = 1084227584(0x40a00000, float:5.0)
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r5, (float) r7)
            r6.topMargin = r5
            r0.setLayoutParams(r6)
            r0.setGravity(r3)
            r0.setText(r15)
            r15 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r15)
            r0.setTextColor(r4)
            r14.addView(r2)
            r14.addView(r1)
            r14.addView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashShakeView.initView(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18171g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f18172h = rotateAnimation;
            rotateAnimation.setDuration(100);
            this.f18172h.setRepeatMode(2);
            this.f18172h.setRepeatCount(-1);
            this.f18171g.startAnimation(this.f18172h);
        }
    }
}
