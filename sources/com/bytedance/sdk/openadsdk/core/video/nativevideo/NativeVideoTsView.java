package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3703x;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3559o;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3632b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeVideoTsView extends FrameLayout implements C2405c.C2406a, C2923x.C2924a, C3632b.C3649a {

    /* renamed from: v */
    private static Integer f9185v = 0;

    /* renamed from: w */
    private static Integer f9186w = 1;

    /* renamed from: A */
    private long f9187A;

    /* renamed from: B */
    private boolean f9188B;

    /* renamed from: C */
    private final C2923x f9189C;

    /* renamed from: D */
    private boolean f9190D;

    /* renamed from: E */
    private final String f9191E;

    /* renamed from: F */
    private ViewStub f9192F;

    /* renamed from: G */
    private C2405c.C2408c f9193G;

    /* renamed from: H */
    private boolean f9194H;

    /* renamed from: I */
    private final AtomicBoolean f9195I;

    /* renamed from: J */
    private boolean f9196J;

    /* renamed from: K */
    private AtomicBoolean f9197K;

    /* renamed from: a */
    protected final C3431n f9198a;

    /* renamed from: b */
    protected C2405c f9199b;

    /* renamed from: c */
    protected FrameLayout f9200c;

    /* renamed from: d */
    protected boolean f9201d;

    /* renamed from: e */
    public boolean f9202e;

    /* renamed from: f */
    public C3100j f9203f;

    /* renamed from: g */
    protected RelativeLayout f9204g;

    /* renamed from: h */
    protected ImageView f9205h;

    /* renamed from: i */
    protected ImageView f9206i;

    /* renamed from: j */
    protected ImageView f9207j;

    /* renamed from: k */
    protected boolean f9208k;

    /* renamed from: l */
    protected String f9209l;

    /* renamed from: m */
    protected int f9210m;

    /* renamed from: n */
    AtomicBoolean f9211n;

    /* renamed from: o */
    boolean f9212o;

    /* renamed from: p */
    public C3630b f9213p;

    /* renamed from: q */
    private final Context f9214q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ViewGroup f9215r;

    /* renamed from: s */
    private boolean f9216s;

    /* renamed from: t */
    private boolean f9217t;

    /* renamed from: u */
    private String f9218u;

    /* renamed from: x */
    private boolean f9219x;

    /* renamed from: y */
    private boolean f9220y;

    /* renamed from: z */
    private boolean f9221z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$a */
    public interface C3629a {
        /* renamed from: a */
        void mo18857a(View view, int i);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$b */
    public interface C3630b {
        /* renamed from: a */
        void mo18858a(boolean z, long j, long j2, long j3, boolean z2);
    }

    /* renamed from: a */
    public void mo16055a() {
    }

    /* renamed from: b */
    public void mo16058b(long j, int i) {
    }

    public void setIsNeedShowDetail(boolean z) {
        this.f9194H = z;
    }

    public void setAdCreativeClickListener(C3629a aVar) {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            ((C3632b) cVar).mo20245a(aVar);
        }
    }

    public void setControllerStatusCallBack(C3630b bVar) {
        this.f9213p = bVar;
    }

    /* renamed from: a */
    public void mo16056a(long j, int i) {
        C2405c.C2408c cVar = this.f9193G;
        if (cVar != null) {
            cVar.mo16064d_();
        }
    }

    /* renamed from: d */
    private void mo20006d() {
        mo16056a(0, 0);
        this.f9193G = null;
    }

    /* renamed from: a */
    public void mo16057a(long j, long j2) {
        C2405c.C2408c cVar = this.f9193G;
        if (cVar != null) {
            cVar.mo16060a(j, j2);
        }
    }

    public NativeVideoTsView(Context context, C3431n nVar, boolean z, C3100j jVar) {
        this(context, nVar, z, "embeded_ad", false, false, jVar);
    }

    public NativeVideoTsView(Context context, C3431n nVar, String str, boolean z, boolean z2, C3100j jVar) {
        this(context, nVar, false, str, z, z2, jVar);
    }

    public NativeVideoTsView(Context context, C3431n nVar, C3100j jVar) {
        this(context, nVar, false, jVar);
    }

    public NativeVideoTsView(Context context, C3431n nVar, boolean z, String str, boolean z2, boolean z3, C3100j jVar) {
        super(context);
        this.f9216s = true;
        this.f9201d = true;
        this.f9217t = false;
        this.f9202e = false;
        this.f9219x = false;
        this.f9220y = true;
        this.f9208k = true;
        this.f9209l = "embeded_ad";
        this.f9210m = 50;
        this.f9221z = true;
        this.f9211n = new AtomicBoolean(false);
        this.f9188B = false;
        this.f9189C = new C2923x(this);
        this.f9190D = false;
        this.f9191E = Build.MODEL;
        this.f9212o = false;
        this.f9194H = true;
        this.f9195I = new AtomicBoolean(false);
        this.f9196J = true;
        this.f9197K = new AtomicBoolean(false);
        if (jVar != null) {
            this.f9203f = jVar;
        }
        this.f9209l = str;
        this.f9214q = context;
        this.f9198a = nVar;
        this.f9217t = z;
        setContentDescription("NativeVideoAdView");
        this.f9219x = z2;
        this.f9220y = z3;
        mo20004b();
        mo20007e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20004b() {
        C3431n nVar = this.f9198a;
        if (nVar != null) {
            int f = C3898x.m12794f(nVar);
            int c = C3513m.m10973h().mo19841c(f);
            int c2 = C2909o.m8136c(C3513m.m10963a());
            if (c == 1) {
                this.f9216s = C3898x.m12793e(c2);
            } else if (c == 2) {
                this.f9216s = C3898x.m12798f(c2) || C3898x.m12793e(c2) || C3898x.m12803g(c2);
            } else if (c == 3) {
                this.f9216s = false;
            } else if (c == 4) {
                this.f9212o = true;
            } else if (c == 5) {
                this.f9216s = C3898x.m12793e(c2) || C3898x.m12803g(c2);
            }
            if (this.f9217t) {
                this.f9201d = false;
            } else if (!this.f9202e || !C3559o.m11210b(this.f9209l)) {
                this.f9201d = C3513m.m10973h().mo19837a(f);
            }
            if ("open_ad".equals(this.f9209l)) {
                this.f9216s = true;
                this.f9201d = true;
            }
            C2405c cVar = this.f9199b;
            if (cVar != null) {
                cVar.mo16038d(this.f9216s);
            }
            this.f9202e = true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3630b bVar;
        C2405c cVar;
        if (!(this.f9217t || (bVar = this.f9213p) == null || (cVar = this.f9199b) == null)) {
            bVar.mo18858a(cVar.mo16052q(), this.f9199b.mo16045j(), this.f9199b.mo16046k(), this.f9199b.mo16042g(), this.f9216s);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private View m11603a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setId(C2914t.m8158e(this.f9214q, "tt_native_video_layout"));
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        this.f9215r = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(C2914t.m8158e(this.f9214q, "tt_native_video_frame"));
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.addView(frameLayout2);
        this.f9200c = frameLayout2;
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(C2914t.m8158e(this.f9214q, "tt_native_video_img_cover_viewStub"));
        viewStub.setLayoutResource(C2914t.m8159f(this.f9214q, "tt_native_video_img_cover_layout"));
        viewStub.setLayoutParams(layoutParams3);
        frameLayout.addView(viewStub);
        this.f9192F = viewStub;
        return frameLayout;
    }

    /* renamed from: e */
    private void mo20007e() {
        addView(m11603a(this.f9214q));
        m11609o();
    }

    public void setVideoAdClickListenerTTNativeAd(TTNativeAd tTNativeAd) {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            ((C3632b) cVar).mo20244a(tTNativeAd);
        }
    }

    /* renamed from: g */
    public void mo20210g() {
        ViewStub viewStub;
        if (this.f9214q != null && (viewStub = this.f9192F) != null && viewStub.getParent() != null && this.f9198a != null && this.f9204g == null) {
            this.f9204g = (RelativeLayout) this.f9192F.inflate();
            this.f9205h = (ImageView) findViewById(C2914t.m8158e(this.f9214q, "tt_native_video_img_id"));
            ImageView imageView = (ImageView) findViewById(C2914t.m8158e(this.f9214q, "tt_native_video_play"));
            this.f9207j = imageView;
            if (this.f9208k) {
                C3904y.m12853a((View) imageView, 0);
            }
            if (!(this.f9198a.mo19517J() == null || this.f9198a.mo19517J().mo15951h() == null)) {
                C3792d.m12395a().mo20614a(this.f9198a.mo19517J().mo15951h(), this.f9205h);
            }
            ImageView imageView2 = this.f9207j;
            if (imageView2 != null) {
                imageView2.setClickable(true);
                this.f9207j.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        NativeVideoTsView.this.mo20005c();
                    }
                });
            }
            m11608n();
        }
    }

    /* renamed from: n */
    private void m11608n() {
        if ((this instanceof NativeDrawVideoTsView) && !this.f9211n.get() && C3457h.m10580d().mo19778r() != null) {
            this.f9207j.setImageBitmap(C3457h.m10580d().mo19778r());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207j.getLayoutParams();
            int b = (int) C3904y.m12868b(getContext(), (float) this.f9210m);
            layoutParams.width = b;
            layoutParams.height = b;
            this.f9207j.setLayoutParams(layoutParams);
            this.f9211n.set(true);
        }
    }

    /* renamed from: o */
    private void m11609o() {
        this.f9199b = new C3632b(this.f9214q, this.f9200c, this.f9198a, this.f9209l, !m11601A(), this.f9219x, this.f9220y, this.f9203f);
        m11610p();
        this.f9215r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (NativeVideoTsView.this.f9215r != null && NativeVideoTsView.this.f9215r.getViewTreeObserver() != null && NativeVideoTsView.this.f9199b != null) {
                    ((C3632b) NativeVideoTsView.this.f9199b).mo20241a(NativeVideoTsView.this.f9215r.getWidth(), NativeVideoTsView.this.f9215r.getHeight());
                    NativeVideoTsView.this.f9215r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    public void setVideoAdLoadListener(C2405c.C2409d dVar) {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            cVar.mo16025a(dVar);
        }
    }

    public void setNativeVideoAdListener(C2405c.C2406a aVar) {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            cVar.mo16023a(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo20207a(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.f9215r.setVisibility(0);
        if (this.f9199b == null) {
            this.f9199b = new C3632b(this.f9214q, this.f9200c, this.f9198a, this.f9209l, this.f9219x, this.f9220y, this.f9203f);
            m11610p();
        }
        this.f9187A = j;
        if (!m11601A()) {
            return true;
        }
        this.f9199b.mo16027a(false);
        C3431n nVar = this.f9198a;
        if (!(nVar == null || nVar.mo19517J() == null)) {
            C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f9198a.mo19560aD()).mo15661a(), this.f9198a);
            a.mo15975b(this.f9198a.mo19532Y());
            a.mo15967a(this.f9215r.getWidth());
            a.mo15974b(this.f9215r.getHeight());
            a.mo15978c(this.f9198a.mo19569ac());
            a.mo15968a(j);
            a.mo15972a(m11620z());
            if (z2) {
                this.f9199b.mo16032b(a);
                return true;
            }
            z3 = this.f9199b.mo16029a(a);
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (((i > 0 && !z && !z2) || (i > 0 && z && !this.f9188B)) && this.f9199b != null) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18632a(this.f9199b.mo16042g());
            aVar.mo18639c(this.f9199b.mo16045j());
            aVar.mo18636b(this.f9199b.mo16043h());
            C3067a.m8776b(this.f9199b.mo16050o(), aVar);
        }
        return z3;
    }

    /* renamed from: p */
    private void m11610p() {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            cVar.mo16038d(this.f9216s);
            ((C3632b) this.f9199b).mo20246a((C3632b.C3649a) this);
            this.f9199b.mo16023a((C2405c.C2406a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11611q();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m11611q();
    }

    /* renamed from: q */
    private void m11611q() {
        C2405c cVar = this.f9199b;
        if (cVar == null) {
            m11609o();
        } else if ((cVar instanceof C3632b) && !m11601A()) {
            ((C3632b) this.f9199b).mo20254v();
        }
        if (this.f9199b != null && this.f9195I.get()) {
            this.f9195I.set(false);
            mo20004b();
            if (mo20213h()) {
                C3904y.m12853a((View) this.f9204g, 8);
                ImageView imageView = this.f9206i;
                if (imageView != null) {
                    C3904y.m12853a((View) imageView, 8);
                }
                C3431n nVar = this.f9198a;
                if (nVar == null || nVar.mo19517J() == null) {
                    C2905l.m8118e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                    return;
                }
                C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f9198a.mo19560aD()).mo15661a(), this.f9198a);
                a.mo15975b(this.f9198a.mo19532Y());
                a.mo15967a(this.f9215r.getWidth());
                a.mo15974b(this.f9215r.getHeight());
                a.mo15978c(this.f9198a.mo19569ac());
                a.mo15968a(0);
                a.mo15972a(m11620z());
                this.f9199b.mo16029a(a);
                this.f9199b.mo16036c(false);
            } else if (this.f9199b.mo16052q()) {
                C2905l.m8111b("NativeVideoAdView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.f9199b.mo16052q());
                mo20208b(true);
            } else {
                C2905l.m8114c("NativeVideoAdView", "attachTask.......mRlImgCover.....VISIBLE");
                mo20210g();
                C3904y.m12853a((View) this.f9204g, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11612r();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m11612r();
    }

    /* renamed from: r */
    private void m11612r() {
        this.f9213p = null;
        mo20214i();
        mo20003a(false);
        m11613s();
    }

    /* renamed from: s */
    private void m11613s() {
        if (!this.f9195I.get()) {
            this.f9195I.set(true);
            C2405c cVar = this.f9199b;
            if (cVar != null) {
                cVar.mo16028a(true, 3);
            }
        }
        this.f9197K.set(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m11613s();
        }
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 1) {
            m11614t();
        }
    }

    /* renamed from: t */
    private void m11614t() {
        m11605a(mo20215j(), f9185v.intValue());
        this.f9189C.sendEmptyMessageDelayed(1, 500);
    }

    /* renamed from: u */
    private boolean m11615u() {
        if (m11601A()) {
            return false;
        }
        boolean a = C3961a.m13032a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (C3961a.m13032a("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || a) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m11616v() {
        if (!m11601A()) {
            C3961a.m13025a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) false);
            C3961a.m13025a("sp_multi_native_video_data", "key_video_is_from_detail_page", (Boolean) false);
        }
    }

    /* renamed from: a */
    private void m11605a(boolean z, int i) {
        if (this.f9198a != null && this.f9199b != null) {
            boolean u = m11615u();
            m11616v();
            if (u && this.f9199b.mo16052q()) {
                C2905l.m8111b("NativeVideoAdView", "changeVideoStatus---isFromDetailPage()=" + u + "，mNativeVideoController.isPlayComplete()=" + this.f9199b.mo16052q());
                mo20208b(true);
                mo20006d();
            } else if (!z || this.f9199b.mo16052q() || this.f9199b.mo16048m()) {
                if (this.f9199b.mo16049n() != null && this.f9199b.mo16049n().mo15885l()) {
                    this.f9199b.mo16030b();
                    mo20003a(true);
                    C2405c.C2408c cVar = this.f9193G;
                    if (cVar != null) {
                        cVar.mo16062b_();
                    }
                }
            } else if (this.f9199b.mo16049n() == null || !this.f9199b.mo16049n().mo15886m()) {
                if (this.f9216s && this.f9199b.mo16049n() == null) {
                    if (!this.f9195I.get()) {
                        this.f9195I.set(true);
                    }
                    this.f9197K.set(false);
                    m11611q();
                }
            } else if (this.f9216s || i == 1) {
                C2405c cVar2 = this.f9199b;
                if (cVar2 != null) {
                    setIsQuiet(cVar2.mo16051p());
                }
                if ("ALP-AL00".equals(this.f9191E)) {
                    this.f9199b.mo16037d();
                } else {
                    if (!C3457h.m10580d().mo19777q()) {
                        u = true;
                    }
                    ((C3632b) this.f9199b).mo20251h(u);
                }
                mo20003a(false);
                C2405c.C2408c cVar3 = this.f9193G;
                if (cVar3 != null) {
                    cVar3.mo16063c_();
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2405c cVar;
        C2405c cVar2;
        C2405c cVar3;
        C2405c cVar4;
        super.onWindowFocusChanged(z);
        m11617w();
        if (!m11615u() || (cVar4 = this.f9199b) == null || !cVar4.mo16052q()) {
            mo20004b();
            if (m11601A() || !mo20213h() || (cVar2 = this.f9199b) == null || cVar2.mo16048m()) {
                if (mo20213h()) {
                    return;
                }
                if (!z && (cVar = this.f9199b) != null && cVar.mo16049n() != null && this.f9199b.mo16049n().mo15885l()) {
                    this.f9189C.removeMessages(1);
                    m11605a(false, f9185v.intValue());
                } else if (z) {
                    this.f9189C.obtainMessage(1).sendToTarget();
                }
            } else if (this.f9189C == null) {
            } else {
                if (!z || (cVar3 = this.f9199b) == null || cVar3.mo16052q()) {
                    this.f9189C.removeMessages(1);
                    m11605a(false, f9185v.intValue());
                    return;
                }
                this.f9189C.obtainMessage(1).sendToTarget();
            }
        } else {
            m11616v();
            C3904y.m12853a((View) this.f9204g, 8);
            mo20208b(true);
            mo20006d();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        C2405c cVar;
        C3431n nVar;
        C2405c cVar2;
        C2405c cVar3;
        super.onWindowVisibilityChanged(i);
        m11617w();
        if (this.f9196J) {
            this.f9196J = i == 0;
        }
        if (!m11615u() || (cVar3 = this.f9199b) == null || !cVar3.mo16052q()) {
            mo20004b();
            if (!m11601A() && mo20213h() && (cVar = this.f9199b) != null && !cVar.mo16048m() && (nVar = this.f9198a) != null) {
                if (!this.f9221z || nVar.mo19517J() == null) {
                    C2905l.m8118e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                } else {
                    this.f9198a.mo19517J();
                    C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f9198a.mo19560aD()).mo15661a(), this.f9198a);
                    a.mo15975b(this.f9198a.mo19532Y());
                    a.mo15967a(this.f9215r.getWidth());
                    a.mo15974b(this.f9215r.getHeight());
                    a.mo15978c(this.f9198a.mo19569ac());
                    a.mo15968a(this.f9187A);
                    a.mo15972a(m11620z());
                    this.f9199b.mo16029a(a);
                    this.f9221z = false;
                    C3904y.m12853a((View) this.f9204g, 8);
                }
                if (i == 0 && this.f9189C != null && (cVar2 = this.f9199b) != null && !cVar2.mo16052q()) {
                    this.f9189C.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        m11616v();
        C3904y.m12853a((View) this.f9204g, 8);
        mo20208b(true);
        mo20006d();
    }

    /* renamed from: w */
    private void m11617w() {
        if (!(this.f9199b == null || m11601A() || !C3961a.m13032a("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            boolean a = C3961a.m13032a("sp_multi_native_video_data", "key_native_video_complete", false);
            long a2 = C3961a.m13021a("sp_multi_native_video_data", "key_video_current_play_position", 0);
            long a3 = C3961a.m13021a("sp_multi_native_video_data", "key_video_total_play_duration", this.f9199b.mo16045j() + this.f9199b.mo16043h());
            long a4 = C3961a.m13021a("sp_multi_native_video_data", "key_video_duration", this.f9199b.mo16045j());
            this.f9199b.mo16036c(a);
            this.f9199b.mo16022a(a2);
            this.f9199b.mo16031b(a3);
            this.f9199b.mo16035c(a4);
            C3961a.m13025a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) false);
            C2905l.m8118e("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + a + ",position=" + a2 + ",totalPlayDuration=" + a3 + ",duration=" + a4);
        }
    }

    public void setNativeVideoController(C2405c cVar) {
        this.f9199b = cVar;
    }

    public C2405c getNativeVideoController() {
        return this.f9199b;
    }

    /* renamed from: h */
    public boolean mo20213h() {
        return this.f9216s;
    }

    public void setIsAutoPlay(boolean z) {
        if (!this.f9190D) {
            int c = C3513m.m10973h().mo19841c(C3898x.m12794f(this.f9198a));
            if (z && c != 4 && (!C2909o.m8138e(this.f9214q) ? !(!C2909o.m8139f(this.f9214q) ? C2909o.m8137d(this.f9214q) : m11618x() || m11619y()) : !m11618x())) {
                z = false;
            }
            this.f9216s = z;
            C2405c cVar = this.f9199b;
            if (cVar != null) {
                cVar.mo16038d(z);
            }
            if (!this.f9216s) {
                mo20210g();
                RelativeLayout relativeLayout = this.f9204g;
                if (relativeLayout != null) {
                    C3904y.m12853a((View) relativeLayout, 0);
                    C3431n nVar = this.f9198a;
                    if (!(nVar == null || nVar.mo19517J() == null)) {
                        C3792d.m12395a().mo20614a(this.f9198a.mo19517J().mo15951h(), this.f9205h);
                    }
                }
            } else {
                C3904y.m12853a((View) this.f9204g, 8);
            }
            this.f9190D = true;
        }
    }

    /* renamed from: x */
    private boolean m11618x() {
        return 2 == C3513m.m10973h().mo19841c(C3898x.m12794f(this.f9198a));
    }

    /* renamed from: y */
    private boolean m11619y() {
        return 5 == C3513m.m10973h().mo19841c(C3898x.m12794f(this.f9198a));
    }

    /* renamed from: z */
    private boolean m11620z() {
        return this.f9201d;
    }

    public void setIsQuiet(boolean z) {
        this.f9201d = z;
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            cVar.mo16033b(z);
        }
    }

    /* renamed from: A */
    private boolean m11601A() {
        return this.f9217t;
    }

    public void setVideoAdInteractionListener(C2405c.C2408c cVar) {
        this.f9193G = cVar;
    }

    /* renamed from: f */
    public void mo20209f() {
        C2405c.C2408c cVar = this.f9193G;
        if (cVar != null) {
            cVar.mo16061a_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.f9208k = z;
    }

    /* renamed from: a */
    public void mo20206a(int i) {
        mo20004b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20005c() {
        if (!mo20216k()) {
            mo20218m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20003a(boolean z) {
        if (this.f9206i == null) {
            this.f9206i = new ImageView(getContext());
            if (C3457h.m10580d().mo19778r() != null) {
                this.f9206i.setImageBitmap(C3457h.m10580d().mo19778r());
            } else {
                this.f9206i.setImageResource(C2914t.m8157d(C3513m.m10963a(), "tt_new_play_video"));
            }
            this.f9206i.setScaleType(ImageView.ScaleType.FIT_XY);
            int b = (int) C3904y.m12868b(getContext(), (float) this.f9210m);
            int b2 = (int) C3904y.m12868b(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = b2;
            layoutParams.bottomMargin = b2;
            this.f9215r.addView(this.f9206i, layoutParams);
            this.f9206i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    NativeVideoTsView.this.mo20218m();
                }
            });
        }
        if (z) {
            this.f9206i.setVisibility(0);
        } else {
            this.f9206i.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo20208b(boolean z) {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            cVar.mo16036c(z);
            C2403b o = this.f9199b.mo16050o();
            if (o != null) {
                o.mo16020b();
                View c = o.mo16021c();
                if (c != null) {
                    if (c.getParent() != null) {
                        ((ViewGroup) c.getParent()).removeView(c);
                    }
                    c.setVisibility(0);
                    addView(c);
                    o.mo16018a(this.f9198a, new WeakReference(this.f9214q), false);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo20214i() {
        C2403b o;
        C2405c cVar = this.f9199b;
        if (cVar != null && (o = cVar.mo16050o()) != null) {
            o.mo16016a();
            View c = o.mo16021c();
            if (c != null) {
                c.setVisibility(8);
                if (c.getParent() != null) {
                    ((ViewGroup) c.getParent()).removeView(c);
                }
            }
        }
    }

    /* renamed from: B */
    private void m11602B() {
        C3904y.m12887e((View) this.f9206i);
        C3904y.m12887e((View) this.f9204g);
    }

    public void setVideoCacheUrl(String str) {
        this.f9218u = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo20215j() {
        return C3703x.m12105a(this, 50, C3559o.m11210b(this.f9209l) ? 1 : 5);
    }

    /* renamed from: k */
    public boolean mo20216k() {
        boolean z = false;
        if (C2909o.m8136c(C3513m.m10963a()) == 0) {
            return false;
        }
        if (this.f9199b.mo16049n() != null && this.f9199b.mo16049n().mo15885l()) {
            m11605a(false, f9185v.intValue());
            C2923x xVar = this.f9189C;
            z = true;
            if (xVar != null) {
                xVar.removeMessages(1);
            }
        }
        return z;
    }

    /* renamed from: l */
    public void mo20217l() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof C3632b)) {
            C3632b bVar = (C3632b) getNativeVideoController();
            bVar.mo16006a((C2403b) bVar.mo16050o(), (View) this);
        }
    }

    /* renamed from: m */
    public void mo20218m() {
        if (C2909o.m8136c(C3513m.m10963a()) == 0 || !mo20215j()) {
            return;
        }
        if (this.f9199b.mo16049n() != null && this.f9199b.mo16049n().mo15886m()) {
            m11605a(true, f9186w.intValue());
            mo20004b();
            C2923x xVar = this.f9189C;
            if (xVar != null) {
                xVar.sendEmptyMessageDelayed(1, 500);
            }
        } else if (!mo20213h() && !this.f9197K.get()) {
            this.f9197K.set(true);
            m11602B();
            C3431n nVar = this.f9198a;
            if (!(nVar == null || nVar.mo19517J() == null)) {
                m11602B();
                this.f9198a.mo19517J();
                C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f9198a.mo19560aD()).mo15661a(), this.f9198a);
                a.mo15975b(this.f9198a.mo19532Y());
                a.mo15967a(this.f9215r.getWidth());
                a.mo15974b(this.f9215r.getHeight());
                a.mo15978c(this.f9198a.mo19569ac());
                a.mo15968a(this.f9187A);
                a.mo15972a(m11620z());
                a.mo15969a(CacheDirFactory.getICacheDir(this.f9198a.mo19560aD()).mo15661a());
                this.f9199b.mo16029a(a);
            }
            C2923x xVar2 = this.f9189C;
            if (xVar2 != null) {
                xVar2.sendEmptyMessageDelayed(1, 500);
            }
            mo20003a(false);
        }
    }

    public double getCurrentPlayTime() {
        C2405c cVar = this.f9199b;
        if (cVar != null) {
            return (((double) cVar.mo16042g()) * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }
}
