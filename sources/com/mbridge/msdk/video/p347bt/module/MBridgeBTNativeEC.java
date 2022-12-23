package com.mbridge.msdk.video.p347bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.C9676a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC */
public class MBridgeBTNativeEC extends BTBaseView {

    /* renamed from: A */
    private TextView f22747A;

    /* renamed from: B */
    private StarLevelView f22748B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f22749C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f22750D = false;

    /* renamed from: E */
    private int f22751E = 0;

    /* renamed from: F */
    private Runnable f22752F;

    /* renamed from: G */
    private boolean f22753G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public View f22754H;

    /* renamed from: I */
    private View f22755I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f22756J;

    /* renamed from: K */
    private C9514j f22757K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public WebView f22758L;

    /* renamed from: p */
    private ViewGroup f22759p;

    /* renamed from: q */
    private ViewGroup f22760q;

    /* renamed from: r */
    private RelativeLayout f22761r;

    /* renamed from: s */
    private ImageView f22762s;

    /* renamed from: t */
    private RoundImageView f22763t;

    /* renamed from: u */
    private ImageView f22764u;

    /* renamed from: v */
    private ImageView f22765v;

    /* renamed from: w */
    private ImageView f22766w;

    /* renamed from: x */
    private ImageView f22767x;

    /* renamed from: y */
    private TextView f22768y;

    /* renamed from: z */
    private TextView f22769z;

    public void onDestory() {
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setUnitId(String str) {
        this.f22756J = str;
    }

    public void setJSCommon(C9514j jVar) {
        this.f22757K = jVar;
    }

    public void setCreateWebView(WebView webView) {
        this.f22758L = webView;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22752F == null) {
            this.f22752F = new Runnable() {
                public final void run() {
                    boolean unused = MBridgeBTNativeEC.this.f22750D = true;
                    if (MBridgeBTNativeEC.this.f22754H != null) {
                        MBridgeBTNativeEC.this.f22754H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f22752F;
        if (runnable != null) {
            postDelayed(runnable, (long) (this.f22751E * 1000));
        }
        if (!this.f22646h && this.f22758L != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f22642d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.f22756J);
                jSONObject.put("data", jSONObject2);
                C8672v.m24874a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e) {
                C8672v.m24874a(BTBaseView.TAG, e.getMessage());
            }
            C8887g.m25669a().mo58687a(this.f22758L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f22758L != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f22642d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.f22756J);
                jSONObject3.put("data", jSONObject4);
                C8672v.m24874a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e2) {
                C8672v.m24874a(BTBaseView.TAG, e2.getMessage());
            }
            C8887g.m25669a().mo58687a(this.f22758L, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f22752F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.f22762s.setVisibility(8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0175 A[Catch:{ all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0192 A[Catch:{ all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ac A[Catch:{ all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b5 A[Catch:{ all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData() {
        /*
            r7 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r7.f22646h     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01c5
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            int r0 = r0.getCbd()     // Catch:{ all -> 0x01bb }
            r1 = -2
            if (r0 <= r1) goto L_0x001a
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            int r0 = r0.getCbd()     // Catch:{ all -> 0x01bb }
            r7.f22751E = r0     // Catch:{ all -> 0x01bb }
            goto L_0x0026
        L_0x001a:
            com.mbridge.msdk.videocommon.d.c r0 = r7.f22643e     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0026
            com.mbridge.msdk.videocommon.d.c r0 = r7.f22643e     // Catch:{ all -> 0x01bb }
            int r0 = r0.mo63594n()     // Catch:{ all -> 0x01bb }
            r7.f22751E = r0     // Catch:{ all -> 0x01bb }
        L_0x0026:
            com.mbridge.msdk.video.module.a.a.e r0 = new com.mbridge.msdk.video.module.a.a.e     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.videocommon.view.RoundImageView r1 = r7.f22763t     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = r7.f22756J     // Catch:{ all -> 0x01bb }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x01bb }
            android.content.Context r1 = r7.f22639a     // Catch:{ all -> 0x01bb }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r1)     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = r2.getImageUrl()     // Catch:{ all -> 0x01bb }
            r1.mo57883a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p302c.C8484c) r0)     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.video.module.a.a.j r0 = new com.mbridge.msdk.video.module.a.a.j     // Catch:{ all -> 0x01bb }
            android.widget.ImageView r1 = r7.f22764u     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01bb }
            android.content.Context r2 = r2.mo56913g()     // Catch:{ all -> 0x01bb }
            r3 = 1090519040(0x41000000, float:8.0)
            int r2 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r2, (float) r3)     // Catch:{ all -> 0x01bb }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x01bb }
            android.content.Context r1 = r7.f22639a     // Catch:{ all -> 0x01bb }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r1)     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = r2.getIconUrl()     // Catch:{ all -> 0x01bb }
            r1.mo57883a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p302c.C8484c) r0)     // Catch:{ all -> 0x01bb }
            android.widget.TextView r0 = r7.f22768y     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r1 = r1.getAppName()     // Catch:{ all -> 0x01bb }
            r0.setText(r1)     // Catch:{ all -> 0x01bb }
            android.widget.TextView r0 = r7.f22769z     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r1 = r1.getAppDesc()     // Catch:{ all -> 0x01bb }
            r0.setText(r1)     // Catch:{ all -> 0x01bb }
            android.widget.TextView r0 = r7.f22747A     // Catch:{ all -> 0x01bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            r1.<init>()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f22640b     // Catch:{ all -> 0x01bb }
            int r2 = r2.getNumberRating()     // Catch:{ all -> 0x01bb }
            r1.append(r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01bb }
            r0.setText(r1)     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.videocommon.view.StarLevelView r0 = r7.f22748B     // Catch:{ all -> 0x01bb }
            r0.removeAllViews()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            double r0 = r0.getRating()     // Catch:{ all -> 0x01bb }
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00b1
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
        L_0x00b1:
            com.mbridge.msdk.videocommon.view.StarLevelView r2 = r7.f22748B     // Catch:{ all -> 0x01bb }
            r2.initScore(r0)     // Catch:{ all -> 0x01bb }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01bb }
            r1 = 17
            r2 = 8
            if (r0 >= r1) goto L_0x00c4
            android.widget.ImageView r0 = r7.f22762s     // Catch:{ all -> 0x01bb }
            r0.setVisibility(r2)     // Catch:{ all -> 0x01bb }
            return
        L_0x00c4:
            com.mbridge.msdk.videocommon.view.RoundImageView r0 = r7.f22763t     // Catch:{ all -> 0x00dc }
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ all -> 0x00dc }
            android.graphics.Bitmap r0 = r7.m26401a((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00e1
            android.graphics.Bitmap r0 = r7.blurBitmap(r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00e1
            android.widget.ImageView r1 = r7.f22762s     // Catch:{ all -> 0x00dc }
            r1.setImageBitmap(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00e1
        L_0x00dc:
            android.widget.ImageView r0 = r7.f22762s     // Catch:{ all -> 0x01bb }
            r0.setVisibility(r2)     // Catch:{ all -> 0x01bb }
        L_0x00e1:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bb }
            r1 = 1
            if (r0 != 0) goto L_0x00fe
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "alecfc=1"
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x00fe
            r7.f22749C = r1     // Catch:{ all -> 0x01bb }
        L_0x00fe:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x011a
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f22640b     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "wlgo=1"
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x011a
            r7.f22753G = r1     // Catch:{ all -> 0x01bb }
        L_0x011a:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ all -> 0x01bb }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "drawable"
            if (r1 != 0) goto L_0x0152
            java.lang.String r1 = "zh"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0152
            android.widget.ImageView r0 = r7.f22765v     // Catch:{ all -> 0x01bb }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x01bb }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = "mbridge_reward_flag_cn"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r6.mo56903b()     // Catch:{ all -> 0x01bb }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)     // Catch:{ all -> 0x01bb }
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x01bb }
            goto L_0x0171
        L_0x0152:
            android.widget.ImageView r0 = r7.f22765v     // Catch:{ all -> 0x01bb }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x01bb }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = "mbridge_reward_flag_en"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r6.mo56903b()     // Catch:{ all -> 0x01bb }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)     // Catch:{ all -> 0x01bb }
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x01bb }
        L_0x0171:
            boolean r0 = r7.f22753G     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x0180
            android.widget.ImageView r0 = r7.f22765v     // Catch:{ all -> 0x01bb }
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ all -> 0x01bb }
            android.widget.ImageView r0 = r7.f22767x     // Catch:{ all -> 0x01bb }
            r0.setVisibility(r1)     // Catch:{ all -> 0x01bb }
        L_0x0180:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.mo56914h()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.c.a r0 = r1.mo16286b(r0)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = r0.mo16188af()     // Catch:{ all -> 0x01bb }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x01a1
            android.widget.ImageView r1 = r7.f22766w     // Catch:{ all -> 0x01bb }
            r1.setVisibility(r2)     // Catch:{ all -> 0x01bb }
        L_0x01a1:
            android.widget.ImageView r1 = r7.f22766w     // Catch:{ all -> 0x01bb }
            com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$2 r3 = new com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$2     // Catch:{ all -> 0x01bb }
            r3.<init>(r0)     // Catch:{ all -> 0x01bb }
            r1.setOnClickListener(r3)     // Catch:{ all -> 0x01bb }
            goto L_0x01b1
        L_0x01ac:
            android.widget.ImageView r0 = r7.f22766w     // Catch:{ all -> 0x01bb }
            r0.setVisibility(r2)     // Catch:{ all -> 0x01bb }
        L_0x01b1:
            boolean r0 = r7.f22750D     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x01c5
            android.view.View r0 = r7.f22754H     // Catch:{ all -> 0x01bb }
            r0.setVisibility(r2)     // Catch:{ all -> 0x01bb }
            goto L_0x01c5
        L_0x01bb:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r1, r0)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.MBridgeBTNativeEC.preLoadData():void");
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22645g = configuration.orientation;
        if (this.f22645g == 2) {
            removeView(this.f22759p);
            m26403a((View) this.f22760q);
            return;
        }
        removeView(this.f22760q);
        m26403a((View) this.f22759p);
    }

    /* renamed from: a */
    private void m26403a(View view) {
        if (view == null) {
            init(this.f22639a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        m26407b(view);
        mo62549a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62549a() {
        if (this.f22646h) {
            this.f22761r.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f22749C) {
                        MBridgeBTNativeEC.m26405a(MBridgeBTNativeEC.this, 1);
                        MBridgeBTNativeEC.m26404a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.f22754H.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f22758L != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", MBridgeBTNativeEC.this.f22642d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", MBridgeBTNativeEC.this.f22756J);
                            jSONObject.put("data", jSONObject2);
                            C8672v.m24874a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8672v.m24874a(BTBaseView.TAG, e.getMessage());
                        }
                        C8887g.m25669a().mo58687a(MBridgeBTNativeEC.this.f22758L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.f22755I.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeBTNativeEC.m26405a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m26404a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f22764u.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeBTNativeEC.m26405a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m26404a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f22763t.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeBTNativeEC.m26405a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m26404a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m26407b(View view) {
        try {
            this.f22761r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f22762s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f22763t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f22764u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f22765v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f22766w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f22768y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f22769z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.f22747A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f22748B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f22754H = view.findViewById(findID("mbridge_iv_close"));
            this.f22755I = view.findViewById(findID("mbridge_tv_cta"));
            this.f22767x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f22762s, this.f22763t, this.f22764u, this.f22768y, this.f22769z, this.f22747A, this.f22748B, this.f22754H, this.f22755I);
        } catch (Throwable th) {
            C8672v.m24875a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f22639a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private Bitmap m26401a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            C8672v.m24874a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    public void init(Context context) {
        boolean z;
        int findLayout = findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f22644f.inflate(findLayout, (ViewGroup) null);
                this.f22760q = viewGroup;
                addView(viewGroup);
                z = m26407b((View) this.f22760q);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f22644f.inflate(findLayout, (ViewGroup) null);
                this.f22759p = viewGroup2;
                addView(viewGroup2);
                z = m26407b((View) this.f22759p);
            }
            this.f22646h = z;
            mo62549a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m26405a(com.mbridge.msdk.video.p347bt.module.MBridgeBTNativeEC r2, int r3) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0015 }
            r1.<init>()     // Catch:{ JSONException -> 0x0015 }
            java.lang.String r0 = com.mbridge.msdk.foundation.same.C8469a.f20746g     // Catch:{ JSONException -> 0x0010 }
            org.json.JSONObject r3 = r2.mo62548a(r3)     // Catch:{ JSONException -> 0x0010 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x001a
        L_0x0010:
            r3 = move-exception
            r0 = r1
            goto L_0x0016
        L_0x0013:
            r2 = move-exception
            goto L_0x002e
        L_0x0015:
            r3 = move-exception
        L_0x0016:
            r3.printStackTrace()     // Catch:{ all -> 0x0013 }
            r1 = r0
        L_0x001a:
            com.mbridge.msdk.video.signal.a.j r3 = r2.f22757K     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0037
            com.mbridge.msdk.video.signal.a.j r2 = r2.f22757K     // Catch:{ all -> 0x0013 }
            r3 = 1
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0013 }
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            r2.click(r3, r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0037
        L_0x002e:
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r3, r2)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.MBridgeBTNativeEC.m26405a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC, int):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m26404a(MBridgeBTNativeEC mBridgeBTNativeEC, float f, float f2) {
        if (mBridgeBTNativeEC.f22758L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", f22637n);
                jSONObject.put("id", mBridgeBTNativeEC.f22642d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                C8887g.m25669a().mo58687a(mBridgeBTNativeEC.f22758L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9261c.m26212a().mo62503a(mBridgeBTNativeEC.f22758L, "onClicked", mBridgeBTNativeEC.f22642d);
            }
        }
    }
}
