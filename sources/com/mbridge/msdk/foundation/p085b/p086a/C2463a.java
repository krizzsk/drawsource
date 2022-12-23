package com.mbridge.msdk.foundation.p085b.p086a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.C9682a;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.b.a.a */
/* compiled from: FeedBackBtnBean */
public final class C2463a {

    /* renamed from: t */
    private static int f5171t = -1;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static String f5172y;

    /* renamed from: a */
    private String f5173a;

    /* renamed from: b */
    private CampaignEx f5174b;

    /* renamed from: c */
    private FeedBackButton f5175c;

    /* renamed from: d */
    private int f5176d;

    /* renamed from: e */
    private int f5177e;

    /* renamed from: f */
    private int f5178f = -1;

    /* renamed from: g */
    private int f5179g = -1;

    /* renamed from: h */
    private int f5180h = -1;

    /* renamed from: i */
    private int f5181i = -1;

    /* renamed from: j */
    private float f5182j = -1.0f;

    /* renamed from: k */
    private JSONArray f5183k;

    /* renamed from: l */
    private int f5184l = -1;

    /* renamed from: m */
    private int f5185m = -1;

    /* renamed from: n */
    private int f5186n = -1;

    /* renamed from: o */
    private int f5187o = -1;

    /* renamed from: p */
    private String f5188p;

    /* renamed from: q */
    private String f5189q;

    /* renamed from: r */
    private float f5190r = 1.0f;

    /* renamed from: s */
    private int f5191s = C8677z.m24924b(C8388a.m23845e().mo56913g(), 20.0f);

    /* renamed from: u */
    private int f5192u = f5171t;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public MBFeedBackDialog f5193v;

    /* renamed from: w */
    private List<C2469a> f5194w = new ArrayList();

    /* renamed from: x */
    private C9682a f5195x = new C9682a() {
        /* renamed from: a */
        public final void mo16409a() {
            C2463a.m6138a(C2463a.this);
        }

        /* renamed from: b */
        public final void mo16410b() {
            C2463a.m6140b(C2463a.this);
        }
    };

    public C2463a(String str) {
        this.f5173a = str;
        if (this.f5194w == null) {
            this.f5194w = new ArrayList();
        }
        m6143i();
        m6146l();
        m6144j();
    }

    /* renamed from: i */
    private void m6143i() {
        if (this.f5195x == null) {
            this.f5195x = new C9682a() {
                /* renamed from: a */
                public final void mo16409a() {
                    C2463a.m6138a(C2463a.this);
                }

                /* renamed from: b */
                public final void mo16410b() {
                    C2463a.m6140b(C2463a.this);
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo16395a() {
        C2470b.m6168a().mo16419a(this.f5173a, 0, 1, f5172y);
        Activity a = C2470b.m6168a().mo16415a(C8388a.m23845e().mo56913g());
        MBFeedBackDialog mBFeedBackDialog = this.f5193v;
        if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != a) {
            m6144j();
        }
        Context g = C8388a.m23845e().mo56913g();
        FeedBackButton feedBackButton = this.f5175c;
        if (feedBackButton != null) {
            g = feedBackButton.getContext();
        }
        int i = C2470b.m6168a().mo16425a(this.f5173a, g, this.f5193v) ? 2 : 3;
        if (i == 2) {
            C2470b.m6168a().mo16419a(this.f5173a, 0, 2, f5172y);
        } else {
            C2470b.m6168a().mo16419a(this.f5173a, 0, 3, f5172y);
        }
        List<C2469a> list = this.f5194w;
        if (list != null) {
            for (C2469a next : list) {
                if (next != null) {
                    next.mo16414a(i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo16401b() {
        MBFeedBackDialog mBFeedBackDialog = this.f5193v;
        if (mBFeedBackDialog != null && mBFeedBackDialog.isShowing()) {
            this.f5193v.cancel();
        }
    }

    /* renamed from: j */
    private void m6144j() {
        try {
            if (C2470b.m6168a().mo16415a(C8388a.m23845e().mo56913g()) != null) {
                C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                C2440a.C2442b ap = b.mo16198ap();
                if (ap == null) {
                    C8672v.m24876b("", "feedback fbk is null");
                    return;
                }
                m6143i();
                this.f5193v = new MBFeedBackDialog(C2470b.m6168a().mo16415a(C8388a.m23845e().mo56913g()), this.f5195x);
                FeedbackRadioGroup a = m6135a(ap);
                this.f5193v.setCancelText(ap.mo16278c());
                this.f5193v.setConfirmText(ap.mo16277b());
                this.f5193v.setTitle(ap.mo16276a());
                this.f5193v.setContent(a);
                this.f5193v.setCancelButtonClickable(!TextUtils.isEmpty(f5172y));
                m6139a(a, ap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo16396a(int i) {
        this.f5192u = i;
        FeedBackButton feedBackButton = this.f5175c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6139a(com.mbridge.msdk.widget.FeedbackRadioGroup r12, com.mbridge.msdk.p078c.C2440a.C2442b r13) {
        /*
            r11 = this;
            org.json.JSONArray r13 = r13.mo16279d()
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            if (r13 == 0) goto L_0x007e
            int r1 = r13.length()
            if (r1 <= 0) goto L_0x007e
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "mbridge_cm_feedback_choice_btn_bg"
            java.lang.String r2 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r0, r1, r2)
            android.content.res.Resources r2 = com.mbridge.msdk.foundation.tools.C8658p.m24800a(r0)
            java.lang.String r3 = "mbridge_cm_feedback_rb_text_color_color_list"
            java.lang.String r4 = "color"
            int r3 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r0, r3, r4)
            r4 = 0
            if (r2 == 0) goto L_0x0036
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0037
        L_0x0032:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0036:
            r2 = r4
        L_0x0037:
            r3 = 1096810496(0x41600000, float:14.0)
            int r3 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r0, (float) r3)
            r5 = 1088421888(0x40e00000, float:7.0)
            int r5 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r0, (float) r5)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r0, (float) r6)
            r7 = 0
        L_0x004a:
            int r8 = r13.length()
            if (r7 >= r8) goto L_0x007e
            java.lang.String r8 = r13.optString(r7)
            android.widget.RadioButton r9 = new android.widget.RadioButton
            r9.<init>(r0)
            r9.setButtonDrawable(r4)
            r9.setBackgroundResource(r1)
            r9.setText(r8)
            if (r2 == 0) goto L_0x0067
            r9.setTextColor(r2)
        L_0x0067:
            r9.setPadding(r3, r5, r3, r5)
            android.widget.RadioGroup$LayoutParams r8 = new android.widget.RadioGroup$LayoutParams
            r10 = -2
            r8.<init>(r10, r10)
            int r10 = r6 / 4
            r8.setMargins(r6, r10, r6, r10)
            r11.m6137a((android.widget.RadioButton) r9)
            r12.addView(r9, r8)
            int r7 = r7 + 1
            goto L_0x004a
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p085b.p086a.C2463a.m6139a(com.mbridge.msdk.widget.FeedbackRadioGroup, com.mbridge.msdk.c.a$b):void");
    }

    /* renamed from: a */
    private FeedbackRadioGroup m6135a(C2440a.C2442b bVar) {
        JSONArray d = bVar.mo16279d();
        Context g = C8388a.m23845e().mo56913g();
        if (d == null || d.length() <= 0 || g == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* renamed from: a */
    private void m6137a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        String unused = C2463a.f5172y = (String) compoundButton.getText();
                    }
                    if (C2463a.this.f5193v != null) {
                        C2463a.this.f5193v.setCancelButtonClickable(!TextUtils.isEmpty(C2463a.f5172y));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo16398a(C2469a aVar) {
        if (this.f5194w == null) {
            this.f5194w = new ArrayList();
        }
        this.f5194w.add(aVar);
    }

    /* renamed from: k */
    private void m6145k() {
        FeedBackButton feedBackButton = this.f5175c;
        if (feedBackButton != null) {
            int i = this.f5178f;
            if (i > -1) {
                feedBackButton.setX((float) i);
            }
            int i2 = this.f5179g;
            if (i2 > -1) {
                this.f5175c.setY((float) i2);
            }
            float f = this.f5190r;
            if (f >= 0.0f) {
                this.f5175c.setAlpha(f);
                this.f5175c.setEnabled(this.f5190r != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f5175c.getLayoutParams();
            int i3 = this.f5180h;
            if (i3 > 0) {
                this.f5175c.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.f5180h;
                }
            }
            int i4 = this.f5181i;
            if (i4 > 0) {
                this.f5175c.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.f5181i;
                }
            }
            if (layoutParams != null) {
                this.f5175c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f5188p)) {
                    this.f5175c.setTextColor(Color.parseColor(this.f5188p));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            float f2 = this.f5182j;
            if (f2 > 0.0f) {
                this.f5175c.setTextSize(f2);
            }
            JSONArray jSONArray = this.f5183k;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context g = C8388a.m23845e().mo56913g();
                this.f5175c.setPadding(C8677z.m24924b(g, (float) this.f5183k.optDouble(0)), C8677z.m24924b(g, (float) this.f5183k.optDouble(1)), C8677z.m24924b(g, (float) this.f5183k.optDouble(2)), C8677z.m24924b(g, (float) this.f5183k.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.f5191s;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius((float) i5);
            }
            if (!TextUtils.isEmpty(this.f5189q)) {
                gradientDrawable.setColor(Color.parseColor(this.f5189q));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f5175c.setBackground(gradientDrawable);
        }
    }

    /* renamed from: a */
    public final void mo16397a(int i, int i2, int i3, int i4, int i5, float f, String str, String str2, float f2, JSONArray jSONArray) {
        if (i > -1) {
            this.f5178f = i;
        }
        if (i2 > -1) {
            this.f5179g = i2;
        }
        if (i3 > -1) {
            this.f5180h = i3;
        }
        if (i4 > -1) {
            this.f5181i = i4;
        }
        if (f2 > -1.0f) {
            this.f5182j = f2;
        }
        if (jSONArray != null) {
            this.f5183k = jSONArray;
        }
        this.f5188p = str;
        this.f5189q = str2;
        this.f5190r = f;
        this.f5191s = i5;
        m6145k();
    }

    /* renamed from: l */
    private void m6146l() {
        Context g = C8388a.m23845e().mo56913g();
        if (g != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g);
                this.f5175c = feedBackButton;
                int i = 8;
                if (this.f5192u != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f5175c.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C2463a.this.mo16395a();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final FeedBackButton mo16403c() {
        if (this.f5175c == null) {
            m6146l();
        }
        return this.f5175c;
    }

    /* renamed from: d */
    public final void mo16405d() {
        FeedBackButton feedBackButton = this.f5175c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener((View.OnClickListener) null);
            this.f5175c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f5175c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f5175c);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f5193v;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f5193v.setListener((C9682a) null);
        }
        this.f5193v = null;
        this.f5194w = null;
        this.f5175c = null;
        this.f5195x = null;
    }

    /* renamed from: e */
    public final CampaignEx mo16406e() {
        return this.f5174b;
    }

    /* renamed from: a */
    public final void mo16399a(CampaignEx campaignEx) {
        this.f5174b = campaignEx;
    }

    /* renamed from: f */
    public final int mo16407f() {
        return this.f5176d;
    }

    /* renamed from: b */
    public final void mo16402b(int i) {
        this.f5176d = i;
    }

    /* renamed from: g */
    public final int mo16408g() {
        return this.f5177e;
    }

    /* renamed from: c */
    public final void mo16404c(int i) {
        this.f5177e = i;
    }

    /* renamed from: com.mbridge.msdk.foundation.b.a.a$a */
    /* compiled from: FeedBackBtnBean */
    public static class C2469a implements C9682a {

        /* renamed from: a */
        private C2462a f5201a;

        /* renamed from: b */
        private String f5202b;

        public C2469a(String str, C2462a aVar) {
            this.f5201a = aVar;
            this.f5202b = str;
        }

        /* renamed from: a */
        public final void mo16409a() {
            C2470b.f5205c = false;
            C2462a aVar = this.f5201a;
            if (aVar != null) {
                aVar.mo16393a(C2463a.f5172y);
            }
        }

        /* renamed from: b */
        public final void mo16410b() {
            C2470b.f5205c = false;
            C2462a aVar = this.f5201a;
            if (aVar != null) {
                aVar.mo16394b();
            }
        }

        /* renamed from: a */
        public final void mo16414a(int i) {
            C2470b.f5205c = true;
            C2462a aVar = this.f5201a;
            if (aVar != null && i == 2) {
                aVar.mo16392a();
            }
        }
    }

    /* renamed from: a */
    public final void mo16400a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f5175c;
        int i = 8;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f5190r);
            feedBackButton.setEnabled(this.f5190r != 0.0f);
            if (this.f5192u != 8) {
                i = 0;
            }
            feedBackButton.setVisibility(i);
            this.f5175c = feedBackButton;
            CampaignEx campaignEx = this.f5174b;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                m6145k();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C2463a.this.mo16395a();
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6138a(C2463a aVar) {
        C2470b.m6168a().mo16419a(aVar.f5173a, 1, 4, f5172y);
        List<C2469a> list = aVar.f5194w;
        if (list != null) {
            for (C2469a next : list) {
                if (next != null) {
                    next.mo16409a();
                }
            }
        }
        f5172y = "";
    }

    /* renamed from: b */
    static /* synthetic */ void m6140b(C2463a aVar) {
        C2470b.m6168a().mo16419a(aVar.f5173a, 0, 4, f5172y);
        List<C2469a> list = aVar.f5194w;
        if (list != null) {
            for (C2469a next : list) {
                if (next != null) {
                    next.mo16410b();
                }
            }
        }
        f5172y = "";
    }
}
