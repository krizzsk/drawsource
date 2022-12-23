package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8672v;

public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK = 3;
    public final int TYPE_SPLASH_BTN_GO = 2;
    public final int TYPE_SPLASH_BTN_OPEN = 1;

    /* renamed from: a */
    private final String f18135a = "浏览第三方应用";

    /* renamed from: b */
    private final String f18136b = "View";

    /* renamed from: c */
    private final String f18137c = "打开第三方应用";

    /* renamed from: d */
    private final String f18138d = "Open";

    /* renamed from: e */
    private final String f18139e = "下载第三方应用";

    /* renamed from: f */
    private final String f18140f = "Install";

    /* renamed from: g */
    private final String f18141g = "mbridge_splash_btn_arrow_right";

    /* renamed from: h */
    private final String f18142h = "mbridge_splash_btn_circle";

    /* renamed from: i */
    private final String f18143i = "mbridge_splash_btn_finger";

    /* renamed from: j */
    private final String f18144j = "mbridge_splash_btn_go";

    /* renamed from: k */
    private final String f18145k = "mbridge_splash_btn_light";

    /* renamed from: l */
    private final String f18146l = "mbridge_expand_data";

    /* renamed from: m */
    private String f18147m;

    /* renamed from: n */
    private int f18148n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageView f18149o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ImageView f18150p;

    /* renamed from: q */
    private final RectF f18151q = new RectF();

    /* renamed from: r */
    private final Paint f18152r = new Paint();

    /* renamed from: s */
    private final Paint f18153s = new Paint();

    public MBSplashClickView(Context context) {
        super(context);
        m20760a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20760a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20760a();
    }

    /* renamed from: a */
    private void m20760a() {
        this.f18152r.setAntiAlias(true);
        this.f18152r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f18153s.setAntiAlias(true);
        this.f18153s.setColor(-1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r12 = m20758a(r12, "mbridge_expand_data");
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView(java.lang.String r12) {
        /*
            r11 = this;
            r11.f18147m = r12
            int r0 = r12.hashCode()
            java.lang.String r1 = "浏览第三方应用"
            java.lang.String r2 = "View"
            r3 = 5
            r4 = 4
            r5 = 0
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 1
            switch(r0) {
                case -672744069: goto L_0x0043;
                case 2464362: goto L_0x0039;
                case 2666181: goto L_0x0031;
                case 855294846: goto L_0x0027;
                case 1383132195: goto L_0x001d;
                case 1681333335: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x004d
        L_0x0015:
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x004d
            r12 = r5
            goto L_0x004e
        L_0x001d:
            java.lang.String r0 = "打开第三方应用"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x004d
            r12 = r3
            goto L_0x004e
        L_0x0027:
            java.lang.String r0 = "下载第三方应用"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x004d
            r12 = r6
            goto L_0x004e
        L_0x0031:
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x004d
            r12 = r9
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "Open"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x004d
            r12 = r4
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "Install"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x004d
            r12 = r8
            goto L_0x004e
        L_0x004d:
            r12 = r7
        L_0x004e:
            if (r12 == 0) goto L_0x0062
            if (r12 == r9) goto L_0x0062
            if (r12 == r8) goto L_0x005f
            if (r12 == r6) goto L_0x005f
            if (r12 == r4) goto L_0x005c
            if (r12 == r3) goto L_0x005c
            r12 = r5
            goto L_0x0065
        L_0x005c:
            r11.f18148n = r9
            goto L_0x0064
        L_0x005f:
            r11.f18148n = r6
            goto L_0x0064
        L_0x0062:
            r11.f18148n = r8
        L_0x0064:
            r12 = r9
        L_0x0065:
            if (r12 != 0) goto L_0x008e
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            java.util.Locale r12 = r12.locale
            java.lang.String r12 = r12.getLanguage()
            java.lang.String r0 = "en"
            boolean r12 = r12.contains(r0)
            java.lang.String r0 = r11.f18147m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008c
            if (r12 == 0) goto L_0x008a
            r1 = r2
        L_0x008a:
            r11.f18147m = r1
        L_0x008c:
            r11.f18148n = r8
        L_0x008e:
            android.view.ViewParent r12 = r11.getParent()
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            if (r12 == 0) goto L_0x00ad
            java.lang.String r0 = "mbridge_expand_data"
            android.view.View r12 = r11.m20758a(r12, r0)
            if (r12 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x00ad
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.CharSequence r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            goto L_0x00af
        L_0x00ad:
            java.lang.String r12 = ""
        L_0x00af:
            int r0 = r11.f18148n
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r2 = "#666666"
            int r2 = android.graphics.Color.parseColor(r2)
            java.lang.String r3 = "#8FC31F"
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r4 = "#000000"
            int r4 = android.graphics.Color.parseColor(r4)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            if (r0 != r8) goto L_0x00d0
            r10.setColor(r3)
            goto L_0x00d6
        L_0x00d0:
            r10.setColor(r4)
            r10.setStroke(r8, r2)
        L_0x00d6:
            float r0 = (float) r1
            r10.setCornerRadius(r0)
            r11.setBackground(r10)
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r11.getContext()
            r0.<init>(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r7, r7)
            r2 = 15
            r1.addRule(r2)
            r0.setLayoutParams(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r1)
            r0.setTextColor(r7)
            java.lang.String r1 = r11.f18147m
            r0.setText(r1)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r11.getContext()
            r1.<init>(r3)
            r11.f18149o = r1
            r1 = 0
            int r3 = r11.f18148n
            r4 = 11
            java.lang.String r10 = "drawable"
            if (r3 != r8) goto L_0x0156
            android.content.res.Resources r1 = r11.getResources()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r3.mo56903b()
            java.lang.String r5 = "mbridge_splash_btn_go"
            int r5 = r1.getIdentifier(r5, r10, r3)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r3 = r11.getContext()
            r6 = 1108082688(0x420c0000, float:35.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r6)
            android.content.Context r7 = r11.getContext()
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r7, (float) r6)
            r1.<init>(r3, r6)
            r1.addRule(r4)
            r1.addRule(r2)
            android.content.Context r2 = r11.getContext()
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r3)
            r1.rightMargin = r2
            goto L_0x0258
        L_0x0156:
            r8 = 1112014848(0x42480000, float:50.0)
            if (r3 != r9) goto L_0x01b8
            android.content.res.Resources r1 = r11.getResources()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r3.mo56903b()
            java.lang.String r5 = "mbridge_splash_btn_light"
            int r5 = r1.getIdentifier(r5, r10, r3)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r7)
            r6 = 20
            r1.leftMargin = r6
            r1.rightMargin = r6
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r9 = r11.getContext()
            r6.<init>(r9)
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r9.<init>(r3, r7)
            r9.addRule(r4)
            r9.addRule(r2)
            android.content.Context r2 = r11.getContext()
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r8)
            r9.rightMargin = r2
            android.content.res.Resources r2 = r11.getResources()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r3.mo56903b()
            java.lang.String r4 = "mbridge_splash_btn_arrow_right"
            int r2 = r2.getIdentifier(r4, r10, r3)
            r6.setImageResource(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
            r6.setScaleType(r2)
            r6.setLayoutParams(r9)
            r11.addView(r6)
            goto L_0x0258
        L_0x01b8:
            if (r3 != r6) goto L_0x0258
            android.content.res.Resources r1 = r11.getResources()
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r2 = r2.mo56903b()
            java.lang.String r3 = "mbridge_splash_btn_finger"
            int r5 = r1.getIdentifier(r3, r10, r2)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r2 = r11.getContext()
            r3 = 1103626240(0x41c80000, float:25.0)
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r3)
            android.content.Context r6 = r11.getContext()
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r6, (float) r3)
            r1.<init>(r2, r3)
            r1.addRule(r4)
            android.content.Context r2 = r11.getContext()
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r8)
            r1.rightMargin = r2
            android.content.Context r2 = r11.getContext()
            r3 = 1099956224(0x41900000, float:18.0)
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r3)
            r1.topMargin = r2
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r11.getContext()
            r2.<init>(r3)
            r11.f18150p = r2
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r3 = r11.getContext()
            r6 = 1106247680(0x41f00000, float:30.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r6)
            android.content.Context r7 = r11.getContext()
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r7, (float) r6)
            r2.<init>(r3, r6)
            r2.addRule(r4)
            android.content.Context r3 = r11.getContext()
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r8)
            r2.rightMargin = r3
            android.content.Context r3 = r11.getContext()
            r4 = 1084227584(0x40a00000, float:5.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r3, (float) r4)
            r2.topMargin = r3
            android.widget.ImageView r3 = r11.f18150p
            r3.setLayoutParams(r2)
            android.content.res.Resources r2 = r11.getResources()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r3 = r3.mo56903b()
            java.lang.String r4 = "mbridge_splash_btn_circle"
            int r2 = r2.getIdentifier(r4, r10, r3)
            android.widget.ImageView r3 = r11.f18150p
            r3.setImageResource(r2)
            android.widget.ImageView r2 = r11.f18150p
            r11.addView(r2)
        L_0x0258:
            android.widget.ImageView r2 = r11.f18149o
            r2.setLayoutParams(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x0269
            android.widget.ImageView r12 = r11.f18149o
            r12.setImageResource(r5)
            goto L_0x029b
        L_0x0269:
            android.widget.ImageView r1 = r11.f18149o
            if (r1 != 0) goto L_0x026e
            goto L_0x029b
        L_0x026e:
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x028c }
            if (r2 == 0) goto L_0x0277
            r1.setBackgroundResource(r5)     // Catch:{ Exception -> 0x028c }
        L_0x0277:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x028c }
            android.content.Context r2 = r2.mo56913g()     // Catch:{ Exception -> 0x028c }
            com.mbridge.msdk.foundation.same.c.b r2 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r2)     // Catch:{ Exception -> 0x028c }
            com.mbridge.msdk.dycreator.baseview.MBSplashClickView$4 r3 = new com.mbridge.msdk.dycreator.baseview.MBSplashClickView$4     // Catch:{ Exception -> 0x028c }
            r3.<init>(r1, r5)     // Catch:{ Exception -> 0x028c }
            r2.mo57883a((java.lang.String) r12, (com.mbridge.msdk.foundation.same.p302c.C8484c) r3)     // Catch:{ Exception -> 0x028c }
            goto L_0x029b
        L_0x028c:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r2 = "MBSplashClickView"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r2, r12)
            if (r1 == 0) goto L_0x029b
            r1.setBackgroundResource(r5)
        L_0x029b:
            r11.addView(r0)
            android.widget.ImageView r12 = r11.f18149o
            r11.addView(r12)
            r11.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.initView(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f18151q.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
    }

    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f18151q, this.f18153s, 31);
        canvas.drawRoundRect(this.f18151q, 200.0f, 200.0f, this.f18153s);
        canvas.saveLayer(this.f18151q, this.f18152r, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f18148n;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f18149o.startAnimation(scaleAnimation);
        } else if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18149o.setVisibility(0);
                }

                public void onAnimationEnd(final Animation animation) {
                    MBSplashClickView.this.f18149o.setVisibility(4);
                    MBSplashClickView.this.f18149o.postDelayed(new Runnable() {
                        public void run() {
                            MBSplashClickView.this.f18149o.startAnimation(animation);
                        }
                    }, 2000);
                }
            });
            this.f18149o.startAnimation(translateAnimation);
        } else if (i == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(1000);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            final ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(400);
            scaleAnimation3.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18150p.setVisibility(0);
                }

                public void onAnimationEnd(Animation animation) {
                    MBSplashClickView.this.f18150p.setVisibility(4);
                    MBSplashClickView.this.f18150p.postDelayed(new Runnable() {
                        public void run() {
                            MBSplashClickView.this.f18150p.startAnimation(scaleAnimation3);
                        }
                    }, 1600);
                }
            });
            this.f18150p.setVisibility(4);
            this.f18149o.startAnimation(scaleAnimation2);
            this.f18150p.postDelayed(new Runnable() {
                public void run() {
                    MBSplashClickView.this.f18150p.startAnimation(scaleAnimation3);
                }
            }, 800);
        }
    }

    /* renamed from: a */
    private View m20758a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            m20758a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e) {
                C8672v.m24878d("MBSplashClickView", e.getMessage());
            }
        }
        return null;
    }
}
