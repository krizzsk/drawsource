package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2389a;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.C3696d;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.c */
/* compiled from: NativeVideoDetailLayout */
public class C3650c extends C3658d {

    /* renamed from: H */
    private TextView f9281H;

    /* renamed from: I */
    private ImageView f9282I;

    /* renamed from: J */
    private View f9283J;

    /* renamed from: K */
    private TextView f9284K;

    /* renamed from: L */
    private TextView f9285L;

    /* renamed from: M */
    private TextView f9286M;

    /* renamed from: N */
    private ImageView f9287N;

    /* renamed from: O */
    private View f9288O;

    /* renamed from: P */
    private ImageView f9289P;

    /* renamed from: Q */
    private TextView f9290Q;

    /* renamed from: R */
    private View f9291R;

    /* renamed from: S */
    private SeekBar f9292S;

    /* renamed from: T */
    private TextView f9293T;

    /* renamed from: U */
    private TextView f9294U;

    /* renamed from: V */
    private ImageView f9295V;

    /* renamed from: W */
    private final C2923x f9296W = new C2923x(this);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f9297X = false;

    /* renamed from: Y */
    private boolean f9298Y = false;

    /* renamed from: Z */
    private int f9299Z = 0;

    /* renamed from: aa */
    private int f9300aa = 0;

    /* renamed from: ab */
    private int f9301ab = 0;

    /* renamed from: ac */
    private int f9302ac = 0;

    /* renamed from: ad */
    private int f9303ad = 0;

    /* renamed from: ae */
    private final Rect f9304ae = new Rect();

    /* renamed from: af */
    private ColorStateList f9305af;

    /* renamed from: ag */
    private float f9306ag;

    /* renamed from: ah */
    private final Rect f9307ah = new Rect();

    /* renamed from: ai */
    private int f9308ai = 0;

    /* renamed from: aj */
    private boolean f9309aj;

    /* renamed from: ak */
    private int f9310ak = 0;

    /* renamed from: al */
    private int f9311al = 0;

    /* renamed from: am */
    private C3696d f9312am = null;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f9313an = false;

    /* renamed from: ao */
    private final View.OnTouchListener f9314ao = new View.OnTouchListener() {

        /* renamed from: b */
        private float f9333b;

        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x = motionEvent.getX();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                boolean z = true;
                if (actionMasked == 1) {
                    C3650c cVar = C3650c.this;
                    if (Math.abs(this.f9333b - motionEvent.getX()) >= 10.0f) {
                        z = false;
                    }
                    boolean unused = cVar.f9313an = z;
                } else if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else {
                this.f9333b = x;
            }
            return false;
        }
    };

    /* renamed from: ap */
    private float f9315ap;

    /* renamed from: aq */
    private ColorStateList f9316aq;

    /* renamed from: ar */
    private float f9317ar;

    /* renamed from: as */
    private final Rect f9318as = new Rect();

    /* renamed from: at */
    private float f9319at;

    /* renamed from: au */
    private ColorStateList f9320au;

    /* renamed from: av */
    private float f9321av;

    /* renamed from: aw */
    private final Rect f9322aw = new Rect();

    /* renamed from: ax */
    private final Rect f9323ax = new Rect();

    /* renamed from: ay */
    private boolean f9324ay;

    /* renamed from: az */
    private boolean f9325az;

    public C3650c(Context context, View view, boolean z, EnumSet<C2403b.C2404a> enumSet, C3431n nVar, C2405c cVar, boolean z2) {
        super(context, view, z, enumSet, nVar, cVar, z2);
        this.f9370y = C3513m.m10963a().getApplicationContext();
        mo20315d(z2);
        this.f9346a = view;
        this.f9365t = z;
        C3696d dVar = new C3696d(this);
        this.f9312am = dVar;
        dVar.mo20475a(this.f9365t);
        DisplayMetrics displayMetrics = this.f9370y.getResources().getDisplayMetrics();
        this.f9310ak = displayMetrics.widthPixels;
        this.f9311al = displayMetrics.heightPixels;
        this.f9368w = enumSet == null ? EnumSet.noneOf(C2403b.C2404a.class) : enumSet;
        this.f9337D = cVar;
        this.f9369x = nVar;
        mo20281c(8);
        mo20271a(context, this.f9346a);
        mo20283d();
        mo20316p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20271a(Context context, View view) {
        super.mo20271a(context, view);
        this.f9281H = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_back"));
        this.f9282I = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_close"));
        this.f9283J = view.findViewById(C2914t.m8158e(context, "tt_video_top_layout"));
        this.f9287N = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_fullscreen_back"));
        this.f9284K = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_title"));
        this.f9285L = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_top_title"));
        this.f9286M = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_current_time"));
        this.f9288O = view.findViewById(C2914t.m8158e(context, "tt_video_loading_retry"));
        this.f9289P = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_retry"));
        TextView textView = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_retry_des"));
        this.f9290Q = textView;
        textView.setText(C2914t.m8151a(context, "tt_video_retry_des_txt"));
        this.f9292S = (SeekBar) view.findViewById(C2914t.m8158e(context, "tt_video_seekbar"));
        this.f9293T = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_time_left_time"));
        this.f9294U = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_time_play"));
        this.f9291R = view.findViewById(C2914t.m8158e(context, "tt_video_ad_bottom_layout"));
        this.f9295V = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_full_screen"));
        this.f9352g = (ViewStub) view.findViewById(C2914t.m8158e(context, "tt_video_ad_cover"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20283d() {
        super.mo20283d();
        this.f9312am.mo20474a(this.f9346a);
        int i = 8;
        C3904y.m12853a((View) this.f9282I, (this.f9365t || this.f9368w.contains(C2403b.C2404a.hideCloseBtn)) ? 8 : 0);
        this.f9282I.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16012c(C3650c.this, view);
                }
            }
        });
        TextView textView = this.f9281H;
        if (!this.f9365t || this.f9368w.contains(C2403b.C2404a.alwayShowBackBtn)) {
            i = 0;
        }
        C3904y.m12853a((View) textView, i);
        this.f9281H.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16013d(C3650c.this, view);
                }
            }
        });
        this.f9287N.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16014e(C3650c.this, view);
                }
            }
        });
        this.f9289P.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3650c.this.mo20311b(false, true);
                C3650c.this.mo20287h();
                C3650c.this.mo20286g();
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16015f(C3650c.this, view);
                }
            }
        });
        this.f9295V.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16011b((C2403b) C3650c.this, view);
                }
            }
        });
        this.f9292S.setThumbOffset(0);
        this.f9292S.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!C3650c.this.f9297X && C3650c.this.f9370y != null) {
                    seekBar.setThumb(C2914t.m8156c(C3513m.m10963a(), "tt_seek_thumb_normal"));
                }
                if (C3650c.this.mo20320t()) {
                    seekBar.setThumbOffset(0);
                    C3650c.this.f9334A.mo16001a((C2403b) C3650c.this, seekBar.getProgress());
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!C3650c.this.f9297X && C3650c.this.f9370y != null) {
                    seekBar.setThumb(C2914t.m8156c(C3513m.m10963a(), "tt_seek_thumb_press"));
                }
                if (C3650c.this.mo20320t()) {
                    seekBar.setThumbOffset(0);
                    C3650c.this.f9334A.mo16008b((C2403b) C3650c.this, seekBar.getProgress());
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C3650c.this.mo20320t()) {
                    C3650c.this.f9334A.mo16002a(C3650c.this, i, z);
                }
            }
        });
        this.f9292S.setOnTouchListener(this.f9314ao);
    }

    /* renamed from: e */
    public void mo20284e() {
        this.f9296W.removeMessages(1);
        this.f9296W.sendMessageDelayed(this.f9296W.obtainMessage(1), 2000);
    }

    /* renamed from: f */
    public void mo20285f() {
        this.f9296W.removeMessages(1);
    }

    /* renamed from: b */
    public void mo20279b(boolean z) {
        int i = mo20289j() ? this.f9311al : this.f9361p;
        int i2 = mo20289j() ? this.f9310ak : this.f9362q;
        if (this.f9364s > 0 && this.f9363r > 0 && i > 0) {
            if (!mo20290k() && !mo20289j() && !this.f9368w.contains(C2403b.C2404a.fixedSize)) {
                i2 = this.f9370y.getResources().getDimensionPixelSize(C2914t.m8162i(this.f9370y, "tt_video_container_maxheight"));
            }
            int i3 = (int) (((float) this.f9364s) * ((((float) i) * 1.0f) / ((float) this.f9363r)));
            if (i3 > i2) {
                i = (int) (((float) this.f9363r) * ((((float) i2) * 1.0f) / ((float) this.f9364s)));
            } else {
                i2 = i3;
            }
            if (!z && !mo20289j()) {
                i = this.f9361p;
                i2 = this.f9362q;
            }
            this.f9347b.mo16071a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo20275a(String str) {
        TextView textView = this.f9284K;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f9285L;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    /* renamed from: a */
    public void mo20268a(int i) {
        View view = this.f9291R;
        if (view == null || view.getVisibility() != 0) {
            this.f9292S.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo20270a(long j, long j2) {
        this.f9293T.setText(C2389a.m5611a(j2));
        this.f9294U.setText(C2389a.m5611a(j));
        this.f9292S.setProgress(C2389a.m5610a(j, j2));
    }

    /* renamed from: g */
    public void mo20286g() {
        C3904y.m12889f(this.f9349d);
        C3904y.m12889f(this.f9350e);
        C3904y.m12887e(this.f9288O);
        if (!(this.f9351f == null || this.f9369x == null || this.f9369x.mo19517J() == null || this.f9369x.mo19517J().mo15951h() == null)) {
            C3904y.m12889f((View) this.f9351f);
            C3792d.m12395a().mo20614a(this.f9369x.mo19517J().mo15951h(), this.f9351f);
        }
        if (this.f9348c.getVisibility() == 0) {
            C3904y.m12853a((View) this.f9348c, 8);
        }
    }

    /* renamed from: a */
    public void mo16016a() {
        mo20276a(false, this.f9365t);
        mo20323w();
    }

    /* renamed from: a */
    public void mo20269a(long j) {
        this.f9294U.setText(C2389a.m5611a(j));
    }

    /* renamed from: a */
    public void mo16018a(C3431n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        String str2;
        if (nVar != null) {
            mo20305a(this.f9346a, C3513m.m10963a());
            mo20276a(false, this.f9365t);
            C3904y.m12853a(this.f9353h, 0);
            C3904y.m12853a((View) this.f9354i, 0);
            C3904y.m12853a(this.f9355j, 0);
            if (!(this.f9354i == null || this.f9369x == null || this.f9369x.mo19517J() == null || this.f9369x.mo19517J().mo15951h() == null)) {
                C3792d.m12395a().mo20614a(this.f9369x.mo19517J().mo15951h(), this.f9354i);
            }
            if (!TextUtils.isEmpty(nVar.mo19518K())) {
                str = nVar.mo19518K();
            } else if (!TextUtils.isEmpty(nVar.mo19528U())) {
                str = nVar.mo19528U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo19529V()) ? nVar.mo19529V() : "";
            }
            if (this.f9369x != null && this.f9369x.mo19520M() != null && this.f9369x.mo19520M().mo19468a() != null) {
                C3904y.m12853a((View) this.f9356k, 0);
                C3904y.m12853a((View) this.f9357l, 4);
                if (this.f9356k != null) {
                    C3792d.m12395a().mo20613a(this.f9369x.mo19520M(), (ImageView) this.f9356k);
                    this.f9356k.setOnClickListener(this.f9338E);
                    this.f9356k.setOnTouchListener(this.f9338E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C3904y.m12853a((View) this.f9356k, 4);
                C3904y.m12853a((View) this.f9357l, 0);
                if (this.f9357l != null) {
                    this.f9357l.setText(str.substring(0, 1));
                    this.f9357l.setOnClickListener(this.f9338E);
                    this.f9357l.setOnTouchListener(this.f9338E);
                }
            }
            if (this.f9358m != null && !TextUtils.isEmpty(str)) {
                this.f9358m.setText(str);
            }
            C3904y.m12853a((View) this.f9358m, 0);
            C3904y.m12853a((View) this.f9359n, 0);
            int L = nVar.mo19519L();
            if (L == 2 || L == 3) {
                str2 = C2914t.m8151a(this.f9370y, "tt_video_mobile_go_detail");
            } else if (L != 4) {
                str2 = L != 5 ? C2914t.m8151a(this.f9370y, "tt_video_mobile_go_detail") : C2914t.m8151a(this.f9370y, "tt_video_dial_phone");
            } else {
                str2 = C2914t.m8151a(this.f9370y, "tt_video_download_apk");
            }
            if (this.f9359n != null) {
                this.f9359n.setText(str2);
                this.f9359n.setOnClickListener(this.f9338E);
                this.f9359n.setOnTouchListener(this.f9338E);
            }
        }
    }

    /* renamed from: h */
    public void mo20287h() {
        C3904y.m12887e(this.f9349d);
        C3904y.m12887e(this.f9288O);
    }

    /* renamed from: i */
    public void mo20288i() {
        this.f9292S.setProgress(0);
        this.f9292S.setSecondaryProgress(0);
        this.f9293T.setText(C2914t.m8154b(this.f9370y, "tt_00_00"));
        this.f9294U.setText(C2914t.m8154b(this.f9370y, "tt_00_00"));
        mo20281c(8);
        if (mo20324x()) {
            this.f9347b.setVisibility(8);
        }
        if (this.f9351f != null) {
            this.f9351f.setImageDrawable((Drawable) null);
        }
        mo20281c(8);
        C3904y.m12853a(this.f9291R, 8);
        C3904y.m12853a(this.f9353h, 8);
        C3904y.m12853a((View) this.f9354i, 8);
        C3904y.m12853a(this.f9355j, 8);
        C3904y.m12853a((View) this.f9356k, 8);
        C3904y.m12853a((View) this.f9357l, 8);
        C3904y.m12853a((View) this.f9358m, 8);
        if (this.f9371z != null) {
            this.f9371z.mo20479a(true);
        }
    }

    /* renamed from: j */
    public boolean mo20289j() {
        return this.f9297X;
    }

    /* renamed from: k */
    public boolean mo20290k() {
        return this.f9365t;
    }

    /* renamed from: a */
    public void mo20273a(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f9346a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f9297X = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9346a.getLayoutParams();
            this.f9300aa = marginLayoutParams.leftMargin;
            this.f9299Z = marginLayoutParams.topMargin;
            this.f9301ab = marginLayoutParams.width;
            this.f9302ac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f9346a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.f9303ad = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f9304ae.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C3904y.m12872b(viewGroup, 0, 0, 0, 0);
            }
            mo20279b(true);
            this.f9295V.setImageDrawable(C2914t.m8156c(this.f9370y, "tt_shrink_video"));
            this.f9292S.setThumb(C2914t.m8156c(this.f9370y, "tt_seek_thumb_fullscreen_selector"));
            this.f9292S.setThumbOffset(0);
            C2389a.m5612a(this.f9346a, false);
            m11793e(this.f9297X);
            C3904y.m12853a(this.f9283J, 8);
            if (!this.f9365t) {
                C3904y.m12853a((View) this.f9282I, 8);
                C3904y.m12853a((View) this.f9281H, 8);
            } else if (this.f9368w.contains(C2403b.C2404a.hideCloseBtn)) {
                C3904y.m12853a((View) this.f9282I, 8);
            }
        }
    }

    /* renamed from: b */
    public void mo20278b(ViewGroup viewGroup) {
        C2905l.m8118e("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup != null && this.f9346a != null && (this.f9346a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f9297X = false;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9346a.getLayoutParams();
            marginLayoutParams.width = this.f9301ab;
            marginLayoutParams.height = this.f9302ac;
            marginLayoutParams.leftMargin = this.f9300aa;
            marginLayoutParams.topMargin = this.f9299Z;
            this.f9346a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(3, this.f9303ad);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                C3904y.m12872b(viewGroup, this.f9304ae.left, this.f9304ae.top, this.f9304ae.right, this.f9304ae.bottom);
            }
            mo20279b(true);
            this.f9295V.setImageDrawable(C2914t.m8156c(this.f9370y, "tt_enlarge_video"));
            this.f9292S.setThumb(C2914t.m8156c(this.f9370y, "tt_seek_thumb_normal"));
            this.f9292S.setThumbOffset(0);
            C2389a.m5612a(this.f9346a, true);
            m11793e(this.f9297X);
            C3904y.m12853a(this.f9283J, 8);
            if (this.f9368w.contains(C2403b.C2404a.alwayShowBackBtn)) {
                C3904y.m12853a((View) this.f9281H, 0);
            }
        }
    }

    /* renamed from: e */
    private void m11793e(boolean z) {
        if (z) {
            m11794y();
        } else {
            m11795z();
        }
    }

    /* renamed from: y */
    private void m11794y() {
        DisplayMetrics displayMetrics = this.f9370y.getResources().getDisplayMetrics();
        TextView textView = this.f9294U;
        if (textView != null) {
            this.f9315ap = textView.getTextSize();
            this.f9294U.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f9294U.getTextColors();
            this.f9316aq = textColors;
            if (textColors != null) {
                this.f9294U.setTextColor(C2914t.m8163j(this.f9370y, "tt_ssxinzi15"));
            }
            this.f9317ar = this.f9294U.getAlpha();
            this.f9294U.setAlpha(0.85f);
            this.f9294U.setShadowLayer(0.0f, C3904y.m12868b(this.f9370y, 0.5f), C3904y.m12868b(this.f9370y, 0.5f), C2914t.m8163j(this.f9370y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.f9294U.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f9318as.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                C3904y.m12872b(this.f9294U, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f9318as.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f9318as.bottom);
            }
        }
        TextView textView2 = this.f9293T;
        if (textView2 != null) {
            this.f9319at = textView2.getTextSize();
            this.f9293T.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.f9293T.getTextColors();
            this.f9320au = textColors2;
            if (textColors2 != null) {
                this.f9293T.setTextColor(C2914t.m8163j(this.f9370y, "tt_ssxinzi15"));
            }
            this.f9321av = this.f9293T.getAlpha();
            this.f9293T.setAlpha(0.85f);
            this.f9293T.setShadowLayer(0.0f, C3904y.m12868b(this.f9370y, 0.5f), C3904y.m12868b(this.f9370y, 0.5f), C2914t.m8163j(this.f9370y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.f9293T.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.f9322aw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C3904y.m12872b(this.f9293T, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f9322aw.top, this.f9322aw.right, this.f9322aw.bottom);
            }
        }
        ImageView imageView = this.f9295V;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.f9323ax.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                C3904y.m12872b(this.f9295V, this.f9323ax.left, this.f9323ax.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f9323ax.bottom);
            }
        }
        ImageView imageView2 = this.f9295V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2914t.m8156c(this.f9370y, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.f9285L;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.f9305af = textColors3;
            if (textColors3 != null) {
                this.f9285L.setTextColor(C2914t.m8163j(this.f9370y, "tt_ssxinzi15"));
            }
            this.f9306ag = this.f9285L.getAlpha();
            this.f9285L.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.f9285L.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.f9307ah.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                C3904y.m12872b(this.f9285L, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.f9322aw.top, this.f9322aw.right, this.f9322aw.bottom);
            }
        }
        View view = this.f9283J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f9308ai = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.f9283J.setLayoutParams(layoutParams5);
            this.f9283J.setBackgroundResource(C2914t.m8157d(this.f9370y, "tt_shadow_fullscreen_top"));
        }
        mo20311b(this.f9309aj, true);
    }

    /* renamed from: z */
    private void m11795z() {
        TextView textView = this.f9294U;
        if (textView != null) {
            textView.setTextSize(0, this.f9315ap);
            ColorStateList colorStateList = this.f9316aq;
            if (colorStateList != null) {
                this.f9294U.setTextColor(colorStateList);
            }
            this.f9294U.setAlpha(this.f9317ar);
            this.f9294U.setShadowLayer(C3904y.m12868b(this.f9370y, 1.0f), 0.0f, 0.0f, C2914t.m8163j(this.f9370y, "tt_video_shadow_color"));
            C3904y.m12872b(this.f9294U, this.f9318as.left, this.f9318as.top, this.f9318as.right, this.f9318as.bottom);
        }
        TextView textView2 = this.f9293T;
        if (textView2 != null) {
            textView2.setTextSize(0, this.f9319at);
            ColorStateList colorStateList2 = this.f9320au;
            if (colorStateList2 != null) {
                this.f9293T.setTextColor(colorStateList2);
            }
            this.f9293T.setAlpha(this.f9321av);
            this.f9293T.setShadowLayer(C3904y.m12868b(this.f9370y, 1.0f), 0.0f, 0.0f, C2914t.m8163j(this.f9370y, "tt_video_shadow_color"));
            C3904y.m12872b(this.f9293T, this.f9322aw.left, this.f9322aw.top, this.f9322aw.right, this.f9322aw.bottom);
        }
        ImageView imageView = this.f9295V;
        if (imageView != null) {
            C3904y.m12872b(imageView, this.f9323ax.left, this.f9323ax.top, this.f9323ax.right, this.f9323ax.bottom);
        }
        ImageView imageView2 = this.f9295V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2914t.m8156c(this.f9370y, "tt_enlarge_video"));
        }
        TextView textView3 = this.f9285L;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.f9305af;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.f9285L.setAlpha(this.f9306ag);
            C3904y.m12872b(this.f9285L, this.f9322aw.left, this.f9322aw.top, this.f9322aw.right, this.f9322aw.bottom);
        }
        View view = this.f9283J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f9308ai;
            this.f9283J.setLayoutParams(layoutParams);
            this.f9283J.setBackgroundResource(C2914t.m8157d(this.f9370y, "tt_video_black_desc_gradient"));
        }
        mo20311b(this.f9309aj, true);
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 1) {
            mo20291l();
        }
    }

    /* renamed from: a */
    public void mo20277a(boolean z, boolean z2, boolean z3) {
        C3904y.m12853a(this.f9291R, 0);
        int i = 8;
        if (this.f9297X) {
            C3904y.m12853a(this.f9283J, 0);
            C3904y.m12853a((View) this.f9285L, 0);
        } else if (z3) {
            C3904y.m12853a(this.f9283J, 8);
        }
        C3904y.m12853a((View) this.f9348c, (!z || this.f9349d.getVisibility() == 0) ? 8 : 0);
        if (!this.f9365t && !this.f9297X) {
            if (!this.f9368w.contains(C2403b.C2404a.hideCloseBtn) && !z3) {
                C3904y.m12853a((View) this.f9282I, 0);
            }
            TextView textView = this.f9281H;
            if (!z3) {
                i = 0;
            }
            C3904y.m12853a((View) textView, i);
        }
        C3904y.m12853a((View) this.f9293T, 0);
        C3904y.m12853a((View) this.f9294U, 0);
        C3904y.m12853a((View) this.f9292S, 0);
    }

    /* renamed from: a */
    public void mo20276a(boolean z, boolean z2) {
        C3904y.m12853a(this.f9291R, 8);
        C3904y.m12853a(this.f9283J, 8);
        C3904y.m12853a((View) this.f9348c, 8);
        if (!this.f9365t && !this.f9297X) {
            C3904y.m12853a((View) this.f9282I, 8);
            if (!this.f9368w.contains(C2403b.C2404a.alwayShowBackBtn)) {
                C3904y.m12853a((View) this.f9281H, 8);
            }
        } else if (this.f9368w.contains(C2403b.C2404a.hideCloseBtn)) {
            C3904y.m12853a((View) this.f9282I, 8);
        }
        if (z2) {
            C3904y.m12853a((View) this.f9282I, 8);
            C3904y.m12853a((View) this.f9281H, 8);
        }
        mo20282c(false);
    }

    /* renamed from: l */
    public void mo20291l() {
        mo20276a(true, false);
    }

    /* renamed from: b */
    public boolean mo20280b(int i) {
        SeekBar seekBar = this.f9292S;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    /* renamed from: c */
    public void mo20282c(boolean z) {
        if (this.f9284K != null) {
            int i = 8;
            if (this.f9365t) {
                C3904y.m12853a((View) this.f9284K, 8);
                return;
            }
            TextView textView = this.f9284K;
            if (z) {
                i = 0;
            }
            C3904y.m12853a((View) textView, i);
        }
    }

    /* renamed from: m */
    public boolean mo20292m() {
        return this.f9366u;
    }

    /* renamed from: c */
    public void mo20281c(int i) {
        this.f9367v = i;
        C3904y.m12853a(this.f9346a, i);
        if (i != 0) {
            this.f9325az = false;
        } else if (this.f9324ay) {
            this.f9325az = true;
        }
    }

    /* renamed from: a */
    public void mo20272a(View view, boolean z) {
        if (mo20289j()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.f9369x != null && !TextUtils.isEmpty(this.f9369x.mo19528U())) {
                mo20275a(this.f9369x.mo19528U());
            }
            this.f9286M.setText(format);
        } else {
            mo20275a("");
            this.f9286M.setText("");
        }
        if (!this.f9335B) {
            boolean z2 = false;
            mo20282c(this.f9365t && !this.f9297X);
            if (mo20320t()) {
                C3631a aVar = this.f9334A;
                if (this.f9349d.getVisibility() != 0) {
                    z2 = true;
                }
                aVar.mo16007a(this, view, true, z2);
            }
        }
    }

    /* renamed from: n */
    public void mo20293n() {
        mo20291l();
        mo20282c(false);
    }

    /* renamed from: o */
    public boolean mo20294o() {
        return this.f9371z != null && this.f9371z.mo20480a();
    }
}
