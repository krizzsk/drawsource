package com.fyber.inneractive.sdk.player.p190ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.p191ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.controller.C4594k;
import com.fyber.inneractive.sdk.util.C5255b;
import com.fyber.inneractive.sdk.util.C5259c;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5309q0;
import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.ui.i */
public abstract class C5042i extends C5036c {

    /* renamed from: K */
    public static final C5306p0 f13446K;

    /* renamed from: A */
    public C5309q0 f13447A;

    /* renamed from: B */
    public C5309q0 f13448B;

    /* renamed from: C */
    public int f13449C;

    /* renamed from: D */
    public int f13450D;

    /* renamed from: E */
    public Runnable f13451E;

    /* renamed from: F */
    public C5326w0 f13452F;

    /* renamed from: G */
    public boolean f13453G;

    /* renamed from: H */
    public ObjectAnimator f13454H;

    /* renamed from: I */
    public boolean f13455I;

    /* renamed from: J */
    public C5309q0 f13456J;

    /* renamed from: i */
    public ImageView f13457i;

    /* renamed from: j */
    public ViewGroup f13458j;

    /* renamed from: k */
    public TextView f13459k;

    /* renamed from: l */
    public Button f13460l;

    /* renamed from: m */
    public ImageView f13461m;

    /* renamed from: n */
    public TextView f13462n;

    /* renamed from: o */
    public TextView f13463o;

    /* renamed from: p */
    public View f13464p;

    /* renamed from: q */
    public int f13465q;

    /* renamed from: r */
    public int f13466r;

    /* renamed from: s */
    public boolean f13467s;

    /* renamed from: t */
    public ImageView f13468t;

    /* renamed from: u */
    public ImageView f13469u;

    /* renamed from: v */
    public IAsmoothProgressBar f13470v;

    /* renamed from: w */
    public View f13471w;

    /* renamed from: x */
    public View f13472x;

    /* renamed from: y */
    public ViewGroup f13473y;

    /* renamed from: z */
    public View f13474z;

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$a */
    public class C5043a implements C5326w0.C5328b {

        /* renamed from: a */
        public final /* synthetic */ int f13475a;

        public C5043a(int i) {
            this.f13475a = i;
        }

        /* renamed from: a */
        public void mo24200a(C5326w0 w0Var) {
            if (!C5042i.this.f13444h) {
                IAlog.m16446a("Autoclick is triggered", new Object[0]);
                ((C4594k) C5042i.this.f13443g).mo24859a(this.f13475a, C5042i.f13446K);
            } else {
                IAlog.m16446a("Autoclick is aborted - app in background", new Object[0]);
            }
            C5042i.this.mo25676e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$b */
    public class C5044b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f13477a;

        public C5044b(Bitmap bitmap) {
            this.f13477a = bitmap;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C5042i.this.getWidth() > 0 && C5042i.this.getHeight() > 0) {
                C5042i.this.mo25671b(true);
                C5042i.this.removeOnLayoutChangeListener(this);
                C5042i.this.mo25664a(this.f13477a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$c */
    public class C5045c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public final /* synthetic */ View f13479a;

        /* renamed from: b */
        public final /* synthetic */ int[] f13480b;

        /* renamed from: c */
        public final /* synthetic */ int f13481c;

        public C5045c(View view, int[] iArr, int i) {
            this.f13479a = view;
            this.f13480b = iArr;
            this.f13481c = i;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f13479a.getRootView().getLocationOnScreen(this.f13480b);
                float rawX = motionEvent.getRawX() - ((float) this.f13480b[0]);
                float rawY = motionEvent.getRawY() - ((float) this.f13480b[1]);
                C5306p0 p0Var = C5042i.this.f13437a;
                p0Var.f14029a = rawX;
                p0Var.f14030b = rawY;
            }
            C5042i iVar = C5042i.this;
            C5041h hVar = iVar.f13443g;
            if (hVar != null) {
                ((C4594k) hVar).mo24859a(this.f13481c, iVar.f13437a);
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.ui.i$d */
    public class C5046d implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f13483a;

        public C5046d(C5042i iVar, GestureDetector gestureDetector) {
            this.f13483a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f13483a.onTouchEvent(motionEvent);
        }
    }

    static {
        C5306p0 a = C5306p0.m16523a();
        a.f14031c = true;
        f13446K = a;
    }

    public C5042i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo25670a(boolean z, boolean z2, String str) {
        TextView textView = this.f13459k;
        if (textView != null) {
            textView.setAllCaps(z2);
            if (!TextUtils.isEmpty(str)) {
                this.f13459k.setText(str);
            } else {
                this.f13459k.setText(C4109R.string.ia_video_install_now_text);
            }
            this.f13459k.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: b */
    public void mo25671b(boolean z) {
        if (this.f13457i != null) {
            ViewGroup viewGroup = this.f13473y;
            int i = 0;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                ImageView imageView = this.f13457i;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            IAlog.m16446a("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
            this.f13457i.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo25673c(boolean z) {
        View view = this.f13471w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: d */
    public void mo25674d(boolean z) {
        TextView textView = this.f13463o;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void destroy() {
        super.destroy();
        IAlog.m16446a("%sdestroyed called", IAlog.m16443a((Object) this));
        Runnable runnable = this.f13451E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f13451E = null;
        }
        mo25676e();
        ViewGroup viewGroup = this.f13458j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    /* renamed from: e */
    public final void mo25676e() {
        if (this.f13452F != null) {
            IAlog.m16446a("Autoclick is removed ", new Object[0]);
            this.f13452F.f14065e = null;
            this.f13452F = null;
        }
    }

    /* renamed from: f */
    public void mo25677f() {
        ImageView imageView = this.f13469u;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f13469u.setSelected(true);
        }
    }

    /* renamed from: g */
    public abstract void mo25660g();

    public View getEndCardView() {
        return this.f13464p;
    }

    public ViewGroup getTextureHost() {
        return this.f13458j;
    }

    public View[] getTrackingFriendlyView() {
        return new View[]{this.f13459k, this.f13462n, this.f13463o, this.f13468t, this.f13470v};
    }

    public int getVideoHeight() {
        return this.f13466r;
    }

    public int getVideoWidth() {
        return this.f13465q;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo25651a(this.f13456J, size, size2);
        C5309q0 q0Var = this.f13456J;
        int i3 = q0Var.f14037a;
        if (i3 <= 0 || q0Var.f14038b <= 0) {
            q0Var.f14037a = size;
            q0Var.f14038b = size2;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f13456J.f14038b, 1073741824);
            i = makeMeasureSpec;
        }
        if (!this.f13447A.equals(this.f13456J)) {
            C5309q0 q0Var2 = this.f13447A;
            C5309q0 q0Var3 = this.f13456J;
            q0Var2.getClass();
            q0Var2.f14037a = q0Var3.f14037a;
            q0Var2.f14038b = q0Var3.f14038b;
            mo25660g();
        }
        super.onMeasure(i, i2);
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.f13457i != null && bitmap != null) {
            C5259c cVar = new C5259c();
            cVar.f13953c = 20;
            cVar.f13954d = 1;
            cVar.f13951a = bitmap.getWidth();
            cVar.f13952b = bitmap.getHeight();
            this.f13457i.setImageBitmap(C5255b.m16456a(getContext(), bitmap, cVar));
        }
    }

    public void setMuteButtonState(boolean z) {
        this.f13468t.setSelected(z);
    }

    public void setRemainingTime(String str) {
        TextView textView = this.f13462n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.f13463o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public C5042i(Context context, AttributeSet attributeSet) {
        this(context, (AttributeSet) null, 0);
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.m16446a("%ssetLastFrameBitmap - %s", IAlog.m16443a((Object) this), bitmap);
        ImageView imageView = this.f13457i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        C5309q0 q0Var = this.f13447A;
        if (q0Var.f14037a == 0 || q0Var.f14038b == 0) {
            mo25671b(false);
            addOnLayoutChangeListener(new C5044b(bitmap));
            return;
        }
        mo25664a(bitmap);
    }

    public C5042i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13465q = -1;
        this.f13466r = -1;
        this.f13467s = false;
        this.f13447A = new C5309q0(0, 0);
        this.f13453G = false;
        this.f13455I = false;
        this.f13456J = new C5309q0(0, 0);
        IAlog.m16446a("%sctor called", mo25650a());
        LayoutInflater.from(context).inflate(C4109R.layout.ia_video_view, this, true);
        setBackgroundColor(getResources().getColor(C4109R.color.ia_video_background_color));
        mo25672c();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public void mo25672c() {
        this.f13457i = (ImageView) findViewById(C4109R.C4111id.ia_iv_last_frame);
        this.f13458j = (ViewGroup) findViewById(C4109R.C4111id.ia_texture_view_host);
        this.f13468t = (ImageView) findViewById(C4109R.C4111id.ia_iv_mute_button);
        this.f13459k = (TextView) findViewById(C4109R.C4111id.ia_tv_call_to_action);
        this.f13469u = (ImageView) findViewById(C4109R.C4111id.ia_iv_expand_collapse_button);
        this.f13462n = (TextView) findViewById(C4109R.C4111id.ia_tv_remaining_time);
        this.f13470v = (IAsmoothProgressBar) findViewById(C4109R.C4111id.ia_video_progressbar);
        this.f13472x = findViewById(C4109R.C4111id.ia_default_endcard_video_overlay);
        this.f13473y = (ViewGroup) findViewById(C4109R.C4111id.ia_endcard_video_overlay);
        this.f13471w = findViewById(C4109R.C4111id.ia_paused_video_overlay);
        this.f13474z = findViewById(C4109R.C4111id.ia_buffering_overlay);
        this.f13463o = (TextView) findViewById(C4109R.C4111id.ia_tv_skip);
        this.f13460l = (Button) findViewById(C4109R.C4111id.ia_b_end_card_call_to_action);
        this.f13461m = (ImageView) findViewById(C4109R.C4111id.hand_animation);
        mo25665a((View) this, 7);
        mo25665a((View) this.f13468t, 1);
        mo25665a((View) this.f13459k, 3);
        mo25665a((View) this.f13460l, 8);
        mo25665a((View) this.f13469u, 5);
        mo25665a((View) this.f13458j, 7);
        mo25665a((View) this.f13463o, 6);
        mo25665a(this.f13471w, 9);
        mo25665a(findViewById(C4109R.C4111id.ia_default_endcard_video_overlay), -1);
    }

    /* renamed from: d */
    public boolean mo25675d() {
        return this.f13472x.getVisibility() == 0 || this.f13473y.getChildCount() > 0;
    }

    /* renamed from: a */
    public void mo25667a(C5034a aVar) {
        View view = this.f13472x;
        if (view != null) {
            boolean z = true;
            if (!aVar.f13417a) {
                view.setVisibility(8);
            } else if (!C4234j.C4237c.NONE.equals(aVar.f13425i)) {
                mo25666a(this.f13472x, aVar.f13425i, aVar.f13426j);
            } else {
                this.f13472x.setVisibility(0);
            }
            this.f13460l.setAllCaps(aVar.f13418b);
            if (!TextUtils.isEmpty(aVar.f13419c)) {
                this.f13460l.setText(aVar.f13419c);
            } else {
                this.f13460l.setText(C4109R.string.ia_video_install_now_text);
            }
            UnitDisplayType unitDisplayType = ((C4287y) this.f13439c).f10549f.f10378j;
            if (aVar.f13423g) {
                this.f13460l.setBackgroundResource(C4109R.C4110drawable.bg_green);
                this.f13461m.setVisibility(0);
                ImageView imageView = this.f13461m;
                float f = aVar.f13424h;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f})});
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700);
                ofPropertyValuesHolder.start();
            } else if (unitDisplayType.equals(UnitDisplayType.LANDSCAPE) || unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.f13460l.setBackgroundResource(C4109R.C4110drawable.bg_green_medium);
                this.f13460l.setTextSize(0, getResources().getDimension(C4109R.dimen.ia_video_overlay_text_large));
            } else {
                this.f13460l.setBackgroundResource(C4109R.C4110drawable.bg_green);
                this.f13460l.setTextSize(0, getResources().getDimension(C4109R.dimen.ia_video_overlay_text_large_plus));
            }
            this.f13460l.setVisibility(0);
            if (aVar.f13417a) {
                Integer num = aVar.f13420d;
                if (num == null) {
                    z = false;
                }
                if (z) {
                    mo25663a(8, num.intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25663a(int i, int i2) {
        if (!this.f13453G && this.f13452F == null) {
            IAlog.m16446a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
            C5326w0 w0Var = new C5326w0(TimeUnit.SECONDS, (long) i2);
            this.f13452F = w0Var;
            w0Var.f14065e = new C5043a(i);
            w0Var.mo26411c();
        }
    }

    /* renamed from: a */
    public final void mo25666a(View view, C4234j.C4237c cVar, int i) {
        if (!this.f13455I && C4234j.C4237c.ZOOM_IN.equals(cVar)) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f, 1.0f})});
            this.f13454H = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration((long) i);
        }
    }

    /* renamed from: a */
    public final void mo25664a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C5309q0 q0Var = this.f13447A;
            int i = q0Var.f14037a;
            int i2 = q0Var.f14038b;
            if (width > 0 && height > 0) {
                float f = (float) width;
                float f2 = (float) height;
                float f3 = f / f2;
                if (this.f13440d == UnitDisplayType.SQUARE) {
                    i = (int) (((float) i2) * f3);
                } else {
                    if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                        Math.abs(f3 - 1.3333334f);
                    }
                    float min = Math.min(((float) i) / f, 10.0f);
                    float f4 = (float) i2;
                    float f5 = min * f2;
                    if (f4 > f5) {
                        i = (int) (min * f);
                        i2 = (int) f5;
                    } else {
                        float min2 = Math.min(f4 / f2, 10.0f);
                        i = (int) (f * min2);
                        i2 = (int) (min2 * f2);
                    }
                }
            }
            ImageView imageView = this.f13457i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i;
                this.f13457i.getLayoutParams().height = i2;
            }
        }
    }

    /* renamed from: a */
    public void mo25669a(boolean z) {
        View view = this.f13474z;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo25665a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new C5046d(this, new GestureDetector(view.getContext(), new C5045c(view, new int[2], i))));
        }
    }

    /* renamed from: a */
    public void mo25668a(C5309q0 q0Var, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (this.f13440d == UnitDisplayType.SQUARE) {
                i3 = (int) (((float) i4) * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float min = Math.min(((float) i3) / f, 10.0f);
                float f4 = (float) i4;
                float f5 = min * f2;
                if (f4 > f5) {
                    i3 = (int) (min * f);
                    i4 = (int) f5;
                } else {
                    float min2 = Math.min(f4 / f2, 10.0f);
                    i4 = (int) (min2 * f2);
                    i3 = (int) (f * min2);
                }
            }
        }
        q0Var.f14037a = i3;
        q0Var.f14038b = i4;
    }
}
