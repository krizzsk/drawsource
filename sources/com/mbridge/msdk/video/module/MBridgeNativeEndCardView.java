package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.shake.C9192a;
import com.mbridge.msdk.shake.C9195b;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.widget.MBridgeBaitClickView;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.widget.C9676a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeNativeEndCardView extends MBridgeBaseView {

    /* renamed from: A */
    private Runnable f23315A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public RelativeLayout f23316B;

    /* renamed from: C */
    private C9618b f23317C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f23318D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f23319E = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f23320F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f23321G = false;

    /* renamed from: H */
    private int f23322H = 0;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public AlphaAnimation f23323I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f23324J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f23325K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f23326L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f23327M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public View f23328N;

    /* renamed from: O */
    private View f23329O;

    /* renamed from: P */
    private FeedBackButton f23330P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public String f23331Q;

    /* renamed from: R */
    private CampaignUnit f23332R;

    /* renamed from: S */
    private MBShakeView f23333S;

    /* renamed from: T */
    private C9195b f23334T;

    /* renamed from: U */
    private MBridgeBaitClickView f23335U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f23336V = false;

    /* renamed from: n */
    private ViewGroup f23337n;

    /* renamed from: o */
    private ViewGroup f23338o;

    /* renamed from: p */
    private RelativeLayout f23339p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageView f23340q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ImageView f23341r;

    /* renamed from: s */
    private ImageView f23342s;

    /* renamed from: t */
    private ImageView f23343t;

    /* renamed from: u */
    private ImageView f23344u;

    /* renamed from: v */
    private TextView f23345v;

    /* renamed from: w */
    private TextView f23346w;

    /* renamed from: x */
    private TextView f23347x;

    /* renamed from: y */
    private LinearLayout f23348y;

    /* renamed from: z */
    private LinearLayout f23349z;

    public void init(Context context) {
    }

    public void setCloseBtnDelay(int i) {
        this.f23322H = i;
    }

    public void setUnitId(String str) {
        this.f23331Q = str;
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet, z, i, z2, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f23315A == null) {
            this.f23315A = new Runnable() {
                public final void run() {
                    boolean unused = MBridgeNativeEndCardView.this.f23319E = true;
                    if (MBridgeNativeEndCardView.this.f23328N != null) {
                        MBridgeNativeEndCardView.this.f23328N.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f23315A;
        if (runnable != null) {
            postDelayed(runnable, (long) (this.f23322H * 1000));
            if (!this.f23320F) {
                this.f23320F = true;
            }
            try {
                if (this.f23196b != null) {
                    if (this.f23196b.isDynamicView()) {
                        String str = this.f23196b.getendcard_url();
                        if (TextUtils.isEmpty(str)) {
                            str = this.f23196b.getEndScreenUrl();
                        }
                        String a = C8617ae.m24720a(str, "alac");
                        if (!TextUtils.isEmpty(a) && a.equals("1")) {
                            postDelayed(new Runnable() {
                                public final void run() {
                                    MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 2);
                                }
                            }, 1000);
                        }
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        try {
            if (this.f23196b != null) {
                if (this.f23196b.isDynamicView()) {
                    String str2 = this.f23196b.getendcard_url();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = this.f23196b.getEndScreenUrl();
                    }
                    String a2 = C8617ae.m24720a(str2, "bait_click");
                    i = Integer.parseInt(a2);
                    if (!TextUtils.isEmpty(a2) && i != 0) {
                        if (this.f23335U == null) {
                            MBridgeBaitClickView mBridgeBaitClickView = new MBridgeBaitClickView(getContext());
                            this.f23335U = mBridgeBaitClickView;
                            mBridgeBaitClickView.init(1342177280, i);
                            this.f23335U.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            if (this.f23339p != null) {
                                this.f23339p.addView(this.f23335U);
                                this.f23335U.startAnimation();
                                this.f23335U.setOnClickListener(new View.OnClickListener() {
                                    public final void onClick(View view) {
                                        MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 0);
                                    }
                                });
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C8672v.m24878d(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            if (this.f23196b == null) {
                return;
            }
            if (this.f23196b.isDynamicView()) {
                String str3 = this.f23196b.getendcard_url();
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.f23196b.getEndScreenUrl();
                }
                String a3 = C8617ae.m24720a(str3, "shake_show");
                String a4 = C8617ae.m24720a(str3, "shake_strength");
                String a5 = C8617ae.m24720a(str3, "shake_time");
                if (!TextUtils.isEmpty(a3) && a3.equals("1")) {
                    if (this.f23333S == null) {
                        if (this.f23335U != null) {
                            this.f23335U.setVisibility(8);
                        }
                        MBShakeView mBShakeView = new MBShakeView(getContext());
                        this.f23333S = mBShakeView;
                        mBShakeView.initView(this.f23196b.getAdCall(), true);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        if (!isLandscape()) {
                            layoutParams.addRule(2, findID("mbridge_iv_logo"));
                            layoutParams.addRule(14);
                            this.f23333S.setPadding(0, 0, 0, C8677z.m24924b(getContext(), 20.0f));
                        } else {
                            layoutParams.addRule(13);
                        }
                        this.f23333S.setLayoutParams(layoutParams);
                        if (this.f23339p != null) {
                            if (this.f23339p.isShown()) {
                                this.f23339p.addView(this.f23333S);
                                if (this.f23329O != null) {
                                    this.f23329O.setVisibility(4);
                                }
                                this.f23329O.setVisibility(4);
                                this.f23333S.setOnClickListener(new View.OnClickListener() {
                                    public final void onClick(View view) {
                                        MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 0);
                                    }
                                });
                                int i2 = 10;
                                if (!TextUtils.isEmpty(a4)) {
                                    int parseInt = Integer.parseInt(a4);
                                    if (parseInt > 0) {
                                        i2 = parseInt;
                                    }
                                }
                                int i3 = 5000;
                                if (!TextUtils.isEmpty(a5)) {
                                    int parseInt2 = Integer.parseInt(a5);
                                    if (parseInt2 > 0) {
                                        i3 = parseInt2 * 1000;
                                    }
                                }
                                this.f23334T = new C9195b(i2, i3) {
                                    /* renamed from: a */
                                    public final void mo56810a() {
                                        if (!MBridgeNativeEndCardView.this.f23321G && MBridgeNativeEndCardView.this.f23320F) {
                                            MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 4);
                                        }
                                    }
                                };
                                C9192a.m26189a().mo61404a(this.f23334T);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            C8672v.m24878d(MBridgeBaseView.TAG, th3.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f23315A;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.f23334T != null) {
            C9192a.m26189a().mo61405b(this.f23334T);
            this.f23334T = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r6.f23205k != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r6.f23205k != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLayout() {
        /*
            r6 = this;
            boolean r0 = r6.f23203i
            if (r0 == 0) goto L_0x0023
            com.mbridge.msdk.video.dynview.j.c r0 = new com.mbridge.msdk.video.dynview.j.c
            r0.<init>()
            android.content.Context r1 = r6.getContext()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r6.f23196b
            int r3 = r6.f23204j
            com.mbridge.msdk.video.dynview.c r0 = r0.mo62903a(r1, r2, r3)
            com.mbridge.msdk.video.dynview.b r1 = com.mbridge.msdk.video.dynview.C9314b.m26503a()
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$8 r2 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$8
            r2.<init>()
            r1.mo62742a(r0, r2)
            goto L_0x0094
        L_0x0023:
            int r0 = r6.f23206l
            java.lang.String r1 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r2 = "mbridge_reward_endcard_native_land"
            java.lang.String r3 = "mbridge_reward_endcard_native_half_portrait"
            java.lang.String r4 = "mbridge_reward_endcard_native_hor"
            if (r0 != 0) goto L_0x0040
            boolean r0 = r6.f23205k
            if (r0 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r6.f23205k
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0040:
            int r0 = r6.f23206l
            r5 = 1
            if (r0 != r5) goto L_0x004c
            boolean r0 = r6.f23205k
            if (r0 == 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            r3 = r4
            goto L_0x004f
        L_0x004c:
            java.lang.String r0 = ""
            r3 = r0
        L_0x004f:
            int r0 = r6.f23206l
            r4 = 2
            if (r0 != r4) goto L_0x005b
            boolean r0 = r6.f23205k
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            r3 = r1
        L_0x005b:
            int r0 = r6.findLayout(r3)
            if (r0 <= 0) goto L_0x0094
            boolean r1 = r6.isLandscape()
            r2 = 0
            if (r1 == 0) goto L_0x007c
            android.view.LayoutInflater r1 = r6.f23197c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f23338o = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f23338o
            boolean r0 = r6.m26878b((android.view.View) r0)
            goto L_0x008f
        L_0x007c:
            android.view.LayoutInflater r1 = r6.f23197c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f23337n = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f23337n
            boolean r0 = r6.m26878b((android.view.View) r0)
        L_0x008f:
            r6.f23200f = r0
            r6.m26871a()
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.setLayout():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x017b A[Catch:{ all -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0195 A[Catch:{ all -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e A[Catch:{ all -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ad A[Catch:{ all -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C9618b r6) {
        /*
            r5 = this;
            r5.f23317C = r6
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x01bd
            boolean r6 = r5.f23200f     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x01bd
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$9 r6 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$9     // Catch:{ all -> 0x01b3 }
            r6.<init>()     // Catch:{ all -> 0x01b3 }
            android.content.Context r0 = r5.f23195a     // Catch:{ all -> 0x01b3 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r0)     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = r1.getImageUrl()     // Catch:{ all -> 0x01b3 }
            r0.mo57883a((java.lang.String) r1, (com.mbridge.msdk.foundation.same.p302c.C8484c) r6)     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.video.module.a.a.j r6 = new com.mbridge.msdk.video.module.a.a.j     // Catch:{ all -> 0x01b3 }
            android.widget.ImageView r0 = r5.f23342s     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01b3 }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ all -> 0x01b3 }
            r2 = 1090519040(0x41000000, float:8.0)
            int r1 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r1, (float) r2)     // Catch:{ all -> 0x01b3 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x01b3 }
            android.content.Context r0 = r5.f23195a     // Catch:{ all -> 0x01b3 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r0)     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = r1.getIconUrl()     // Catch:{ all -> 0x01b3 }
            r0.mo57883a((java.lang.String) r1, (com.mbridge.msdk.foundation.same.p302c.C8484c) r6)     // Catch:{ all -> 0x01b3 }
            android.widget.TextView r6 = r5.f23345v     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r0.getAppName()     // Catch:{ all -> 0x01b3 }
            r6.setText(r0)     // Catch:{ all -> 0x01b3 }
            android.view.View r6 = r5.f23329O     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x006c
            android.view.View r6 = r5.f23329O     // Catch:{ all -> 0x01b3 }
            boolean r6 = r6 instanceof android.widget.TextView     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x006c
            android.view.View r6 = r5.f23329O     // Catch:{ all -> 0x01b3 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r0.getAdCall()     // Catch:{ all -> 0x01b3 }
            r6.setText(r0)     // Catch:{ all -> 0x01b3 }
        L_0x006c:
            android.widget.TextView r6 = r5.f23346w     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x007b
            android.widget.TextView r6 = r5.f23346w     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r0.getAppDesc()     // Catch:{ all -> 0x01b3 }
            r6.setText(r0)     // Catch:{ all -> 0x01b3 }
        L_0x007b:
            android.widget.TextView r6 = r5.f23347x     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x009b
            android.widget.TextView r6 = r5.f23347x     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
            r0.<init>()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            int r1 = r1.getNumberRating()     // Catch:{ all -> 0x01b3 }
            r0.append(r1)     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b3 }
            r6.setText(r0)     // Catch:{ all -> 0x01b3 }
        L_0x009b:
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            r6.removeAllViews()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            double r0 = r6.getRating()     // Catch:{ all -> 0x01b3 }
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x00ae
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
        L_0x00ae:
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            boolean r6 = r6 instanceof com.mbridge.msdk.videocommon.view.StarLevelView     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x00bb
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.videocommon.view.StarLevelView r6 = (com.mbridge.msdk.videocommon.view.StarLevelView) r6     // Catch:{ all -> 0x01b3 }
            r6.initScore(r0)     // Catch:{ all -> 0x01b3 }
        L_0x00bb:
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            boolean r6 = r6 instanceof com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x00ce
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView r6 = (com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView) r6     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            int r2 = r2.getNumberRating()     // Catch:{ all -> 0x01b3 }
            r6.setRatingAndUser(r0, r2)     // Catch:{ all -> 0x01b3 }
        L_0x00ce:
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            boolean r6 = r6 instanceof com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x00dc
            android.widget.LinearLayout r6 = r5.f23348y     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView r6 = (com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView) r6     // Catch:{ all -> 0x01b3 }
            int r0 = (int) r0     // Catch:{ all -> 0x01b3 }
            r6.setRating(r0)     // Catch:{ all -> 0x01b3 }
        L_0x00dc:
            android.widget.LinearLayout r6 = r5.f23349z     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x00f3
            android.widget.LinearLayout r6 = r5.f23349z     // Catch:{ all -> 0x01b3 }
            boolean r6 = r6 instanceof com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x00f3
            android.widget.LinearLayout r6 = r5.f23349z     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView r6 = (com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView) r6     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            int r0 = r0.getNumberRating()     // Catch:{ all -> 0x01b3 }
            r6.setHeatCount(r0)     // Catch:{ all -> 0x01b3 }
        L_0x00f3:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r6 = r6.getendcard_url()     // Catch:{ all -> 0x01b3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01b3 }
            if (r6 != 0) goto L_0x0110
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23196b     // Catch:{ all -> 0x01b3 }
            java.lang.String r6 = r6.getendcard_url()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "alecfc=1"
            boolean r6 = r6.contains(r0)     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x0110
            r6 = 1
            r5.f23318D = r6     // Catch:{ all -> 0x01b3 }
        L_0x0110:
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01b3 }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ all -> 0x01b3 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = "drawable"
            if (r0 != 0) goto L_0x0148
            java.lang.String r0 = "zh"
            boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x0148
            android.widget.ImageView r6 = r5.f23343t     // Catch:{ all -> 0x01b3 }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x01b3 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = "mbridge_reward_flag_cn"
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01b3 }
            java.lang.String r4 = r4.mo56903b()     // Catch:{ all -> 0x01b3 }
            int r1 = r2.getIdentifier(r3, r1, r4)     // Catch:{ all -> 0x01b3 }
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x01b3 }
            r6.setImageDrawable(r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x0167
        L_0x0148:
            android.widget.ImageView r6 = r5.f23343t     // Catch:{ all -> 0x01b3 }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x01b3 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = "mbridge_reward_flag_en"
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01b3 }
            java.lang.String r4 = r4.mo56903b()     // Catch:{ all -> 0x01b3 }
            int r1 = r2.getIdentifier(r3, r1, r4)     // Catch:{ all -> 0x01b3 }
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x01b3 }
            r6.setImageDrawable(r0)     // Catch:{ all -> 0x01b3 }
        L_0x0167:
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01b3 }
            java.lang.String r6 = r6.mo56914h()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.c.a r6 = r0.mo16286b(r6)     // Catch:{ all -> 0x01b3 }
            r0 = 8
            if (r6 == 0) goto L_0x0195
            java.lang.String r6 = r6.mo16188af()     // Catch:{ all -> 0x01b3 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01b3 }
            if (r1 == 0) goto L_0x018a
            android.widget.ImageView r1 = r5.f23344u     // Catch:{ all -> 0x01b3 }
            r1.setVisibility(r0)     // Catch:{ all -> 0x01b3 }
        L_0x018a:
            android.widget.ImageView r1 = r5.f23344u     // Catch:{ all -> 0x01b3 }
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$10 r2 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$10     // Catch:{ all -> 0x01b3 }
            r2.<init>(r6)     // Catch:{ all -> 0x01b3 }
            r1.setOnClickListener(r2)     // Catch:{ all -> 0x01b3 }
            goto L_0x019a
        L_0x0195:
            android.widget.ImageView r6 = r5.f23344u     // Catch:{ all -> 0x01b3 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01b3 }
        L_0x019a:
            boolean r6 = r5.f23319E     // Catch:{ all -> 0x01b3 }
            if (r6 != 0) goto L_0x01a3
            android.view.View r6 = r5.f23328N     // Catch:{ all -> 0x01b3 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01b3 }
        L_0x01a3:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01b3 }
            r1 = 17
            if (r6 >= r1) goto L_0x01bd
            android.widget.ImageView r6 = r5.f23340q     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x01bd
            android.widget.ImageView r6 = r5.f23340q     // Catch:{ all -> 0x01b3 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x01bd
        L_0x01b3:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r0, r6)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26871a() {
        mo62973c();
        if (!this.f23200f) {
            this.f23199e.mo62631a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f23323I = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        if (this.f23196b == null || !this.f23196b.isDynamicView()) {
            RelativeLayout relativeLayout = this.f23316B;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            this.f23198d = configuration.orientation;
            if (this.f23198d == 2) {
                removeView(this.f23337n);
                m26872a((View) this.f23338o);
                return;
            }
            removeView(this.f23338o);
            m26872a((View) this.f23337n);
        }
    }

    public boolean canBackPress() {
        View view = this.f23328N;
        return view != null && view.getVisibility() == 0;
    }

    public void notifyShowListener() {
        this.f23199e.mo62631a(110, "");
    }

    /* renamed from: a */
    private void m26872a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f23317C);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            m26878b(view);
            mo62973c();
        }
        m26876b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        if (this.f23200f) {
            this.f23339p.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f23318D) {
                        MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f23328N.setOnClickListener(new View.OnClickListener() {
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r4) {
                    /*
                        r3 = this;
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r4 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this
                        boolean r4 = r4.f23203i
                        if (r4 == 0) goto L_0x002e
                        java.util.concurrent.ThreadPoolExecutor r4 = com.mbridge.msdk.foundation.same.p305f.C8498b.m24360b()     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a r0 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r1 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this     // Catch:{ Exception -> 0x001c }
                        java.lang.String r1 = r1.f23331Q     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r2 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this     // Catch:{ Exception -> 0x001c }
                        com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f23196b     // Catch:{ Exception -> 0x001c }
                        r0.<init>(r1, r2)     // Catch:{ Exception -> 0x001c }
                        r4.execute(r0)     // Catch:{ Exception -> 0x001c }
                    L_0x001c:
                        com.mbridge.msdk.video.dynview.moffer.a r4 = com.mbridge.msdk.video.dynview.moffer.C9391a.m26760a()     // Catch:{ Exception -> 0x0024 }
                        r4.mo62921b()     // Catch:{ Exception -> 0x0024 }
                        goto L_0x002e
                    L_0x0024:
                        r4 = move-exception
                        java.lang.String r4 = r4.getMessage()
                        java.lang.String r0 = "MBridgeBaseView"
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r4)
                    L_0x002e:
                        com.mbridge.msdk.video.module.MBridgeNativeEndCardView r4 = com.mbridge.msdk.video.module.MBridgeNativeEndCardView.this
                        com.mbridge.msdk.video.module.a.a r4 = r4.f23199e
                        r0 = 104(0x68, float:1.46E-43)
                        java.lang.String r1 = ""
                        r4.mo62631a(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.C944112.onClick(android.view.View):void");
                }
            });
            this.f23329O.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f23342s.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f23341r.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeNativeEndCardView.m26873a(MBridgeNativeEndCardView.this, 0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m26878b(View view) {
        try {
            this.f23339p = (RelativeLayout) view.findViewById(filterFindViewId(this.f23336V, "mbridge_native_ec_layout"));
            this.f23341r = (ImageView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_adbanner"));
            this.f23342s = (ImageView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_icon"));
            this.f23343t = (ImageView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_flag"));
            this.f23344u = (ImageView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_link"));
            this.f23345v = (TextView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_tv_apptitle"));
            this.f23348y = (LinearLayout) view.findViewById(filterFindViewId(this.f23336V, "mbridge_sv_starlevel"));
            this.f23349z = (LinearLayout) view.findViewById(filterFindViewId(this.f23336V, "mbridge_sv_heat_count_level"));
            this.f23328N = view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_close"));
            this.f23329O = view.findViewById(filterFindViewId(this.f23336V, "mbridge_tv_cta"));
            this.f23330P = (FeedBackButton) view.findViewById(filterFindViewId(this.f23336V, "mbridge_native_endcard_feed_btn"));
            this.f23316B = (RelativeLayout) view.findViewById(filterFindViewId(this.f23336V, "mbridge_native_ec_controller"));
            this.f23340q = (ImageView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_iv_adbanner_bg"));
            if (this.f23203i) {
                if (this.f23341r != null && (this.f23341r instanceof RoundImageView)) {
                    ((RoundImageView) this.f23341r).setBorderRadius(10);
                }
                if (this.f23342s != null && (this.f23342s instanceof RoundImageView)) {
                    ((RoundImageView) this.f23342s).setBorderRadius(10);
                }
                return isNotNULL(this.f23340q, this.f23341r, this.f23342s, this.f23345v, this.f23348y, this.f23328N, this.f23329O);
            }
            this.f23346w = (TextView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.f23336V, "mbridge_tv_number"));
            this.f23347x = textView;
            return isNotNULL(this.f23340q, this.f23341r, this.f23342s, this.f23345v, this.f23346w, textView, this.f23348y, this.f23328N, this.f23329O);
        } catch (Throwable th) {
            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f23195a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        C8672v.m24878d(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f23324J = i;
        this.f23325K = i2;
        this.f23326L = i3;
        this.f23327M = i4;
        m26876b();
    }

    /* renamed from: b */
    private void m26876b() {
        RelativeLayout relativeLayout;
        if (this.f23200f && (relativeLayout = this.f23316B) != null) {
            relativeLayout.postDelayed(new Runnable() {
                public final void run() {
                    if (MBridgeNativeEndCardView.this.f23316B != null) {
                        if (!(MBridgeNativeEndCardView.this.f23196b == null || MBridgeNativeEndCardView.this.f23196b.isDynamicView() || MBridgeNativeEndCardView.this.f23196b.getAdSpaceT() == 2)) {
                            MBridgeNativeEndCardView.this.f23316B.setPadding(MBridgeNativeEndCardView.this.f23324J, MBridgeNativeEndCardView.this.f23326L, MBridgeNativeEndCardView.this.f23325K, MBridgeNativeEndCardView.this.f23327M);
                            MBridgeNativeEndCardView.this.f23316B.startAnimation(MBridgeNativeEndCardView.this.f23323I);
                        }
                        MBridgeNativeEndCardView.this.f23316B.setVisibility(0);
                    }
                    if (!(MBridgeNativeEndCardView.this.f23328N == null || MBridgeNativeEndCardView.this.f23328N.getVisibility() == 0 || !MBridgeNativeEndCardView.this.f23319E)) {
                        MBridgeNativeEndCardView.this.f23328N.setVisibility(0);
                    }
                    MBridgeNativeEndCardView.m26892n(MBridgeNativeEndCardView.this);
                }
            }, 200);
        }
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        if (this.f23196b != null && this.f23196b.isDynamicView()) {
            this.f23332R = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f23332R.getAds().size() > 5 && (mBShakeView = this.f23333S) != null) {
                mBShakeView.setPadding(0, 0, 0, C8677z.m24924b(getContext(), 5.0f));
            }
        }
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        if (this.f23196b != null && this.f23196b.isDynamicView() && (campaignUnit = this.f23332R) != null && campaignUnit.getAds() != null && this.f23332R.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.f23332R.getAds().iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57886c(next.getIconUrl());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a */
    private static class C9453a implements Runnable {

        /* renamed from: a */
        private final String f23366a;

        /* renamed from: b */
        private final CampaignEx f23367b;

        public C9453a(String str, CampaignEx campaignEx) {
            this.f23366a = str;
            this.f23367b = campaignEx;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            r9 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            r9 = r0;
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
            r6 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0077, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
            r6 = null;
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x007b, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
            r6 = null;
            r7 = null;
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
            r9 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
            r3 = r4;
            r4 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0084, code lost:
            r4 = null;
            r6 = null;
            r7 = null;
            r8 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x008d, code lost:
            r3 = "";
            r7 = "";
            r8 = "";
            r9 = "";
            r4 = "";
            r6 = "";
            r5 = "";
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:9:0x001c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r11.f23366a
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x009c
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23367b
                if (r1 == 0) goto L_0x009c
                java.lang.String r2 = r11.f23366a     // Catch:{ Exception -> 0x009c }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x009c }
                if (r3 != 0) goto L_0x009c
                if (r1 != 0) goto L_0x001a
                goto L_0x009c
            L_0x001a:
                r5 = 0
                r3 = 0
                java.lang.String r4 = r1.getRequestId()     // Catch:{ Exception -> 0x008d, all -> 0x0083 }
                java.lang.String r7 = r1.getId()     // Catch:{ Exception -> 0x008d, all -> 0x007b }
                java.lang.String r8 = r1.getRequestIdNotice()     // Catch:{ Exception -> 0x008d, all -> 0x0077 }
                com.mbridge.msdk.foundation.entity.CampaignEx$c r6 = r1.getRewardTemplateMode()     // Catch:{ Exception -> 0x008d, all -> 0x0073 }
                if (r6 == 0) goto L_0x004f
                java.lang.String r9 = r6.mo57576e()     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                int r6 = r6.mo57573b()     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x008d, all -> 0x004b }
                boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x008d, all -> 0x0048 }
                if (r10 != 0) goto L_0x0046
                java.lang.String r10 = "alecfc"
                java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r9, r10)     // Catch:{ Exception -> 0x008d, all -> 0x0048 }
            L_0x0046:
                r9 = r6
                goto L_0x0050
            L_0x0048:
                r1 = move-exception
                r9 = r6
                goto L_0x006f
            L_0x004b:
                r1 = move-exception
                r9 = r0
                r6 = r3
                goto L_0x0080
            L_0x004f:
                r9 = r0
            L_0x0050:
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                if (r6 != 0) goto L_0x0067
                java.lang.String r6 = "ec_id"
                java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r1, r6)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                java.lang.String r6 = "mof"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r1, r6)     // Catch:{ Exception -> 0x008d, all -> 0x006e }
                r5 = r1
            L_0x0067:
                r6 = r3
                r3 = r4
                r4 = r0
            L_0x006a:
                com.mbridge.msdk.video.module.p369b.C9497a.m27016a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x009c }
                goto L_0x009c
            L_0x006e:
                r1 = move-exception
            L_0x006f:
                r6 = r3
                r3 = r4
                r4 = r0
                goto L_0x0089
            L_0x0073:
                r1 = move-exception
                r6 = r3
                r9 = r6
                goto L_0x0080
            L_0x0077:
                r1 = move-exception
                r6 = r3
                r8 = r6
                goto L_0x007f
            L_0x007b:
                r1 = move-exception
                r6 = r3
                r7 = r6
                r8 = r7
            L_0x007f:
                r9 = r8
            L_0x0080:
                r3 = r4
                r4 = r9
                goto L_0x0089
            L_0x0083:
                r1 = move-exception
                r4 = r3
                r6 = r4
                r7 = r6
                r8 = r7
                r9 = r8
            L_0x0089:
                com.mbridge.msdk.video.module.p369b.C9497a.m27016a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x009c }
                throw r1     // Catch:{ Exception -> 0x009c }
            L_0x008d:
                java.lang.String r3 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                java.lang.String r9 = ""
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                java.lang.String r5 = ""
                goto L_0x006a
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.C9453a.run():void");
        }
    }

    public void setOnResume() {
        this.f23320F = true;
    }

    public void setOnPause() {
        this.f23320F = false;
    }

    public boolean isDyXmlSuccess() {
        return this.f23336V;
    }

    /* renamed from: a */
    static /* synthetic */ void m26873a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i) {
        JSONObject jSONObject;
        if (mBridgeNativeEndCardView.f23196b != null && mBridgeNativeEndCardView.f23196b.isDynamicView()) {
            try {
                CampaignEx.C8454c rewardTemplateMode = mBridgeNativeEndCardView.f23196b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.mo57573b() + str;
                }
                C8598e.m24675a(mBridgeNativeEndCardView.f23195a, "end_card_click", mBridgeNativeEndCardView.f23196b.getCampaignUnitId(), mBridgeNativeEndCardView.f23196b.isBidCampaign(), mBridgeNativeEndCardView.f23196b.getRequestId(), mBridgeNativeEndCardView.f23196b.getRequestIdNotice(), mBridgeNativeEndCardView.f23196b.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8469a.f20746g, mBridgeNativeEndCardView.mo62972a(i));
                if (mBridgeNativeEndCardView.f23196b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                mBridgeNativeEndCardView.f23199e.mo62631a(105, jSONObject);
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.f23199e.mo62631a(105, jSONObject);
        }
        mBridgeNativeEndCardView.f23199e.mo62631a(105, jSONObject);
    }

    /* renamed from: n */
    static /* synthetic */ void m26892n(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        if (C2470b.m6168a().mo16428b()) {
            mBridgeNativeEndCardView.f23196b.setCampaignUnitId(mBridgeNativeEndCardView.f23331Q);
            C2470b a = C2470b.m6168a();
            a.mo16422a(mBridgeNativeEndCardView.f23331Q + "_" + 2, (C2462a) new C2462a() {
                /* renamed from: a */
                public final void mo16392a() {
                    boolean unused = MBridgeNativeEndCardView.this.f23321G = true;
                }

                /* renamed from: b */
                public final void mo16394b() {
                    boolean unused = MBridgeNativeEndCardView.this.f23321G = false;
                }

                /* renamed from: a */
                public final void mo16393a(String str) {
                    boolean unused = MBridgeNativeEndCardView.this.f23321G = false;
                }
            });
            C2470b a2 = C2470b.m6168a();
            a2.mo16423a(mBridgeNativeEndCardView.f23331Q + "_" + 2, mBridgeNativeEndCardView.f23196b);
            C2470b a3 = C2470b.m6168a();
            a3.mo16429c(mBridgeNativeEndCardView.f23331Q + "_" + 1);
            if (mBridgeNativeEndCardView.f23330P != null) {
                C2470b a4 = C2470b.m6168a();
                a4.mo16424a(mBridgeNativeEndCardView.f23331Q + "_" + 2, mBridgeNativeEndCardView.f23330P);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.f23330P;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }
}
