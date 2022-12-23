package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0826e0;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.a1 */
class C0728a1 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private boolean f224A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f225B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f226C;

    /* renamed from: D */
    private boolean f227D;

    /* renamed from: E */
    private String f228E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f229F;

    /* renamed from: G */
    private FileInputStream f230G;

    /* renamed from: H */
    private C0850h0 f231H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C0761c f232I;

    /* renamed from: J */
    private Surface f233J;

    /* renamed from: K */
    private SurfaceTexture f234K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public RectF f235L = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C0738j f236M;

    /* renamed from: N */
    private ProgressBar f237N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public MediaPlayer f238O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C0832f1 f239P = C0773c0.m379b();

    /* renamed from: Q */
    private ExecutorService f240Q = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C0850h0 f241R;

    /* renamed from: a */
    private float f242a;

    /* renamed from: b */
    private float f243b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f244c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f245d;

    /* renamed from: e */
    private float f246e;

    /* renamed from: f */
    private float f247f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f248g;

    /* renamed from: h */
    private boolean f249h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f250i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f251j = new Paint(1);

    /* renamed from: k */
    private int f252k;

    /* renamed from: l */
    private int f253l;

    /* renamed from: m */
    private int f254m;

    /* renamed from: n */
    private int f255n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f256o;

    /* renamed from: p */
    private int f257p;

    /* renamed from: q */
    private int f258q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public double f259r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f260s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f261t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f262u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f263v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f264w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f265x;

    /* renamed from: y */
    private boolean f266y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f267z;

    /* renamed from: com.adcolony.sdk.a1$a */
    class C0729a implements C0865j0 {
        C0729a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                C0728a1.this.mo10539i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$b */
    class C0730b implements C0865j0 {
        C0730b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                C0728a1.this.m225c(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$c */
    class C0731c implements C0865j0 {
        C0731c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                C0728a1.this.m227d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$d */
    class C0732d implements C0865j0 {
        C0732d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                C0728a1.this.mo10538h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$e */
    class C0733e implements C0865j0 {
        C0733e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                boolean unused = C0728a1.this.m222b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$f */
    class C0734f implements C0865j0 {
        C0734f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0728a1.this.m217a(h0Var)) {
                boolean unused = C0728a1.this.m232e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$g */
    class C0735g implements Runnable {
        C0735g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C0728a1.this.f241R != null) {
                C0832f1 b = C0773c0.m379b();
                C0773c0.m383b(b, "id", C0728a1.this.f256o);
                C0773c0.m376a(b, "ad_session_id", C0728a1.this.f229F);
                C0773c0.m385b(b, "success", true);
                C0728a1.this.f241R.mo10835a(b).mo10838c();
                C0850h0 unused = C0728a1.this.f241R = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$h */
    class C0736h implements Runnable {
        C0736h() {
        }

        public void run() {
            long unused = C0728a1.this.f261t = 0;
            while (!C0728a1.this.f262u && !C0728a1.this.f265x && C0723a.m195c()) {
                Context a = C0723a.m186a();
                if (!C0728a1.this.f262u && !C0728a1.this.f267z && a != null && (a instanceof Activity)) {
                    if (C0728a1.this.f238O.isPlaying()) {
                        if (C0728a1.this.f261t == 0 && C0723a.f207d) {
                            long unused2 = C0728a1.this.f261t = System.currentTimeMillis();
                        }
                        boolean unused3 = C0728a1.this.f264w = true;
                        C0728a1 a1Var = C0728a1.this;
                        double unused4 = a1Var.f259r = ((double) a1Var.f238O.getCurrentPosition()) / 1000.0d;
                        C0728a1 a1Var2 = C0728a1.this;
                        double unused5 = a1Var2.f260s = ((double) a1Var2.f238O.getDuration()) / 1000.0d;
                        if (System.currentTimeMillis() - C0728a1.this.f261t > 1000 && !C0728a1.this.f226C && C0723a.f207d) {
                            if (C0728a1.this.f259r == 0.0d) {
                                new C0826e0.C0827a().mo10746a("getCurrentPosition() not working, firing ").mo10746a("AdSession.on_error").mo10747a(C0826e0.f462i);
                                C0728a1.this.m235g();
                            } else {
                                boolean unused6 = C0728a1.this.f226C = true;
                            }
                        }
                        if (C0728a1.this.f225B) {
                            C0728a1.this.mo10536e();
                        }
                    }
                    if (C0728a1.this.f264w && !C0728a1.this.f262u && !C0728a1.this.f265x) {
                        C0773c0.m383b(C0728a1.this.f239P, "id", C0728a1.this.f256o);
                        C0773c0.m383b(C0728a1.this.f239P, "container_id", C0728a1.this.f232I.mo10634c());
                        C0773c0.m376a(C0728a1.this.f239P, "ad_session_id", C0728a1.this.f229F);
                        C0773c0.m373a(C0728a1.this.f239P, "elapsed", C0728a1.this.f259r);
                        C0773c0.m373a(C0728a1.this.f239P, "duration", C0728a1.this.f260s);
                        new C0850h0("VideoView.on_progress", C0728a1.this.f232I.mo10653k(), C0728a1.this.f239P).mo10838c();
                    }
                    if (C0728a1.this.f263v || ((Activity) a).isFinishing()) {
                        boolean unused7 = C0728a1.this.f263v = false;
                        C0728a1.this.mo10540j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C0728a1.this.m235g();
                        new C0826e0.C0827a().mo10746a("InterruptedException in ADCVideoView's update thread.").mo10747a(C0826e0.f461h);
                    }
                } else {
                    return;
                }
            }
            if (C0728a1.this.f263v) {
                C0728a1.this.mo10540j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$i */
    class C0737i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f276a;

        C0737i(Context context) {
            this.f276a = context;
        }

        public void run() {
            C0738j unused = C0728a1.this.f236M = new C0738j(this.f276a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C0728a1.this.f244c * 4.0f), (int) (C0728a1.this.f244c * 4.0f));
            layoutParams.setMargins(0, C0728a1.this.f232I.mo10631b() - ((int) (C0728a1.this.f244c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C0728a1.this.f232I.addView(C0728a1.this.f236M, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.a1$j */
    private class C0738j extends View {
        C0738j(Context context) {
            super(context);
            setWillNotDraw(false);
            Class<C0738j> cls = C0738j.class;
            try {
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C0728a1.this.f235L, 270.0f, C0728a1.this.f245d, false, C0728a1.this.f250i);
            canvas.drawText("" + C0728a1.this.f248g, C0728a1.this.f235L.centerX(), (float) (((double) C0728a1.this.f235L.centerY()) + (((double) C0728a1.this.f251j.getFontMetrics().bottom) * 1.35d)), C0728a1.this.f251j);
            invalidate();
        }
    }

    C0728a1(Context context, C0850h0 h0Var, int i, C0761c cVar) {
        super(context);
        this.f232I = cVar;
        this.f231H = h0Var;
        this.f256o = i;
        setSurfaceTextureListener(this);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f262u = true;
        this.f259r = this.f260s;
        C0773c0.m383b(this.f239P, "id", this.f256o);
        C0773c0.m383b(this.f239P, "container_id", this.f232I.mo10634c());
        C0773c0.m376a(this.f239P, "ad_session_id", this.f229F);
        C0773c0.m373a(this.f239P, "elapsed", this.f259r);
        C0773c0.m373a(this.f239P, "duration", this.f260s);
        new C0850h0("VideoView.on_progress", this.f232I.mo10653k(), this.f239P).mo10838c();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m235g();
        C0826e0.C0827a aVar = new C0826e0.C0827a();
        aVar.mo10746a("MediaPlayer error: " + i + "," + i2).mo10747a(C0826e0.f461h);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m241l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f266y = true;
        if (this.f227D) {
            this.f232I.removeView(this.f237N);
        }
        if (this.f224A) {
            this.f257p = mediaPlayer.getVideoWidth();
            this.f258q = mediaPlayer.getVideoHeight();
            m241l();
            new C0826e0.C0827a().mo10746a("MediaPlayer getVideoWidth = ").mo10744a(mediaPlayer.getVideoWidth()).mo10747a(C0826e0.f458e);
            new C0826e0.C0827a().mo10746a("MediaPlayer getVideoHeight = ").mo10744a(mediaPlayer.getVideoHeight()).mo10747a(C0826e0.f458e);
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m383b(b, "id", this.f256o);
        C0773c0.m383b(b, "container_id", this.f232I.mo10634c());
        C0773c0.m376a(b, "ad_session_id", this.f229F);
        new C0850h0("VideoView.on_ready", this.f232I.mo10653k(), b).mo10838c();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f240Q;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f240Q.submit(new C0735g());
            } catch (RejectedExecutionException unused) {
                m235g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f267z) {
            new C0826e0.C0827a().mo10746a("Null texture provided by system's onSurfaceTextureAvailable or ").mo10746a("MediaPlayer has been destroyed.").mo10747a(C0826e0.f462i);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f233J = surface;
        try {
            this.f238O.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C0826e0.C0827a().mo10746a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo10747a(C0826e0.f461h);
            m235g();
        }
        this.f234K = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f234K = surfaceTexture;
        if (!this.f267z) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f234K = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f234K = surfaceTexture;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0866k b = C0723a.m193b();
        C0790d c = b.mo10889c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m383b(b2, "view_id", this.f256o);
        C0773c0.m376a(b2, "ad_session_id", this.f229F);
        C0773c0.m383b(b2, "container_x", this.f252k + x);
        C0773c0.m383b(b2, "container_y", this.f253l + y);
        C0773c0.m383b(b2, "view_x", x);
        C0773c0.m383b(b2, "view_y", y);
        C0773c0.m383b(b2, "id", this.f232I.mo10634c());
        if (action == 0) {
            new C0850h0("AdContainer.on_touch_began", this.f232I.mo10653k(), b2).mo10838c();
        } else if (action == 1) {
            if (!this.f232I.mo10660p()) {
                b.mo10879a(c.mo10720d().get(this.f229F));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f232I.mo10653k(), b2).mo10838c();
        } else if (action == 2) {
            new C0850h0("AdContainer.on_touch_moved", this.f232I.mo10653k(), b2).mo10838c();
        } else if (action == 3) {
            new C0850h0("AdContainer.on_touch_cancelled", this.f232I.mo10653k(), b2).mo10838c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f252k);
            C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f253l);
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0850h0("AdContainer.on_touch_began", this.f232I.mo10653k(), b2).mo10838c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0773c0.m383b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f252k);
            C0773c0.m383b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f253l);
            C0773c0.m383b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0773c0.m383b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f232I.mo10660p()) {
                b.mo10879a(c.mo10720d().get(this.f229F));
            }
            new C0850h0("AdContainer.on_touch_ended", this.f232I.mo10653k(), b2).mo10838c();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m235g() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "id", this.f229F);
        new C0850h0("AdSession.on_error", this.f232I.mo10653k(), b).mo10838c();
        this.f262u = true;
    }

    /* renamed from: l */
    private void m241l() {
        double min = Math.min(((double) this.f254m) / ((double) this.f257p), ((double) this.f255n) / ((double) this.f258q));
        int i = (int) (((double) this.f257p) * min);
        int i2 = (int) (((double) this.f258q) * min);
        new C0826e0.C0827a().mo10746a("setMeasuredDimension to ").mo10744a(i).mo10746a(" by ").mo10744a(i2).mo10747a(C0826e0.f458e);
        setMeasuredDimension(i, i2);
        if (this.f224A) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m244m() {
        try {
            this.f240Q.submit(new C0736h());
        } catch (RejectedExecutionException unused) {
            m235g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10538h() {
        if (!this.f266y) {
            new C0826e0.C0827a().mo10746a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo10747a(C0826e0.f460g);
            return false;
        } else if (!this.f264w) {
            return false;
        } else {
            this.f238O.getCurrentPosition();
            this.f260s = (double) this.f238O.getDuration();
            this.f238O.pause();
            this.f265x = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10539i() {
        if (!this.f266y) {
            return false;
        }
        if (!this.f265x && C0723a.f207d) {
            this.f238O.start();
            m244m();
        } else if (!this.f262u && C0723a.f207d) {
            this.f238O.start();
            this.f265x = false;
            if (!this.f240Q.isShutdown()) {
                m244m();
            }
            C0738j jVar = this.f236M;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10540j() {
        new C0826e0.C0827a().mo10746a("MediaPlayer stopped and released.").mo10747a(C0826e0.f458e);
        try {
            if (!this.f262u && this.f266y && this.f238O.isPlaying()) {
                this.f238O.stop();
            }
        } catch (IllegalStateException unused) {
            new C0826e0.C0827a().mo10746a("Caught IllegalStateException when calling stop on MediaPlayer").mo10747a(C0826e0.f460g);
        }
        ProgressBar progressBar = this.f237N;
        if (progressBar != null) {
            this.f232I.removeView(progressBar);
        }
        this.f262u = true;
        this.f266y = false;
        this.f238O.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10541k() {
        this.f263v = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10535d() {
        Context a;
        C0832f1 a2 = this.f231H.mo10834a();
        this.f229F = C0773c0.m393h(a2, "ad_session_id");
        this.f252k = C0773c0.m389d(a2, "x");
        this.f253l = C0773c0.m389d(a2, "y");
        this.f254m = C0773c0.m389d(a2, "width");
        this.f255n = C0773c0.m389d(a2, "height");
        this.f225B = C0773c0.m382b(a2, "enable_timer");
        this.f227D = C0773c0.m382b(a2, "enable_progress");
        this.f228E = C0773c0.m393h(a2, "filepath");
        this.f257p = C0773c0.m389d(a2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH);
        this.f258q = C0773c0.m389d(a2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT);
        this.f247f = C0723a.m193b().mo10905n().mo11058s();
        new C0826e0.C0827a().mo10746a("Original video dimensions = ").mo10744a(this.f257p).mo10746a("x").mo10744a(this.f258q).mo10747a(C0826e0.f456c);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f254m, this.f255n);
        layoutParams.setMargins(this.f252k, this.f253l, 0, 0);
        layoutParams.gravity = 0;
        this.f232I.addView(this, layoutParams);
        if (this.f227D && (a = C0723a.m186a()) != null) {
            ProgressBar progressBar = new ProgressBar(a);
            this.f237N = progressBar;
            C0761c cVar = this.f232I;
            int i = (int) (this.f247f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f238O = new MediaPlayer();
        this.f266y = false;
        try {
            if (!this.f228E.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f228E);
                this.f230G = fileInputStream;
                this.f238O.setDataSource(fileInputStream.getFD());
            } else {
                this.f224A = true;
                this.f238O.setDataSource(this.f228E);
            }
            this.f238O.setOnErrorListener(this);
            this.f238O.setOnPreparedListener(this);
            this.f238O.setOnCompletionListener(this);
            this.f238O.prepareAsync();
        } catch (IOException e) {
            new C0826e0.C0827a().mo10746a("Failed to create/prepare MediaPlayer: ").mo10746a(e.toString()).mo10747a(C0826e0.f461h);
            m235g();
        }
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.play", (C0865j0) new C0729a(), true));
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.set_bounds", (C0865j0) new C0730b(), true));
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.set_visible", (C0865j0) new C0731c(), true));
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.pause", (C0865j0) new C0732d(), true));
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.seek_to_time", (C0865j0) new C0733e(), true));
        this.f232I.mo10649i().add(C0723a.m187a("VideoView.set_volume", (C0865j0) new C0734f(), true));
        this.f232I.mo10651j().add("VideoView.play");
        this.f232I.mo10651j().add("VideoView.set_bounds");
        this.f232I.mo10651j().add("VideoView.set_visible");
        this.f232I.mo10651j().add("VideoView.pause");
        this.f232I.mo10651j().add("VideoView.seek_to_time");
        this.f232I.mo10651j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10536e() {
        if (this.f249h) {
            this.f246e = (float) (360.0d / this.f260s);
            this.f251j.setColor(-3355444);
            this.f251j.setShadowLayer((float) ((int) (this.f247f * 2.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f251j.setTextAlign(Paint.Align.CENTER);
            this.f251j.setLinearText(true);
            this.f251j.setTextSize(this.f247f * 12.0f);
            this.f250i.setStyle(Paint.Style.STROKE);
            float f = this.f247f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f250i.setStrokeWidth(f);
            this.f250i.setShadowLayer((float) ((int) (this.f247f * 3.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f250i.setColor(-3355444);
            Rect rect = new Rect();
            this.f251j.getTextBounds("0123456789", 0, 9, rect);
            this.f244c = (float) rect.height();
            Context a = C0723a.m186a();
            if (a != null) {
                C1047z0.m1259b((Runnable) new C0737i(a));
            }
            this.f249h = false;
        }
        this.f248g = (int) (this.f260s - this.f259r);
        float f2 = this.f244c;
        float f3 = (float) ((int) f2);
        this.f242a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f243b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f235L.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        this.f245d = (float) (((double) this.f246e) * (this.f260s - this.f259r));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10537f() {
        return this.f262u;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m225c(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        this.f252k = C0773c0.m389d(a, "x");
        this.f253l = C0773c0.m389d(a, "y");
        this.f254m = C0773c0.m389d(a, "width");
        this.f255n = C0773c0.m389d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f252k, this.f253l, 0, 0);
        layoutParams.width = this.f254m;
        layoutParams.height = this.f255n;
        setLayoutParams(layoutParams);
        if (this.f225B && this.f236M != null) {
            int i = (int) (this.f244c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f232I.mo10631b() - ((int) (this.f244c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f236M.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m222b(C0850h0 h0Var) {
        if (!this.f266y) {
            return false;
        }
        if (this.f262u) {
            this.f262u = false;
        }
        this.f241R = h0Var;
        int d = C0773c0.m389d(h0Var.mo10834a(), "time");
        int duration = this.f238O.getDuration() / 1000;
        this.f238O.setOnSeekCompleteListener(this);
        this.f238O.seekTo(d * 1000);
        if (duration == d) {
            this.f262u = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10532a() {
        if (this.f234K != null) {
            this.f267z = true;
        }
        this.f240Q.shutdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m217a(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        return C0773c0.m389d(a, "id") == this.f256o && C0773c0.m389d(a, "container_id") == this.f232I.mo10634c() && C0773c0.m393h(a, "ad_session_id").equals(this.f232I.mo10625a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10534c() {
        return this.f238O != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo10533b() {
        return this.f238O;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m232e(C0850h0 h0Var) {
        boolean z = false;
        if (!this.f266y) {
            return false;
        }
        float c = (float) C0773c0.m387c(h0Var.mo10834a(), TapjoyConstants.TJC_VOLUME);
        AdColonyInterstitial j = C0723a.m193b().mo10901j();
        if (j != null) {
            if (((double) c) <= 0.0d) {
                z = true;
            }
            j.mo10435a(z);
        }
        this.f238O.setVolume(c, c);
        C0832f1 b = C0773c0.m379b();
        C0773c0.m385b(b, "success", true);
        h0Var.mo10835a(b).mo10838c();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m227d(C0850h0 h0Var) {
        C0738j jVar;
        C0738j jVar2;
        if (C0773c0.m382b(h0Var.mo10834a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
            if (this.f225B && (jVar2 = this.f236M) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f225B && (jVar = this.f236M) != null) {
            jVar.setVisibility(4);
        }
    }
}
