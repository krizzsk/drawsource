package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2402a;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bykv.p054vk.openvk.component.video.api.renderview.C2418a;
import com.bykv.p054vk.openvk.component.video.api.renderview.C2419b;
import com.bykv.p054vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.p054vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2390b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.C3696d;
import com.bytedance.sdk.openadsdk.core.widget.C3699e;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.d */
/* compiled from: NativeVideoLayout */
public class C3658d implements C2398a, C2403b<C3431n>, C2418a, C2923x.C2924a, C3696d.C3698a, C3699e.C3702b {

    /* renamed from: A */
    C3631a f9334A;

    /* renamed from: B */
    boolean f9335B;

    /* renamed from: C */
    C3968c f9336C;

    /* renamed from: D */
    C2405c f9337D;

    /* renamed from: E */
    C3359a f9338E;

    /* renamed from: F */
    C3359a f9339F;

    /* renamed from: G */
    boolean f9340G;

    /* renamed from: H */
    private View f9341H;

    /* renamed from: I */
    private TextView f9342I;

    /* renamed from: J */
    private TextView f9343J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public NativeVideoTsView.C3629a f9344K;

    /* renamed from: L */
    private final String f9345L;

    /* renamed from: a */
    View f9346a;

    /* renamed from: b */
    C2419b f9347b;

    /* renamed from: c */
    ImageView f9348c;

    /* renamed from: d */
    View f9349d;

    /* renamed from: e */
    View f9350e;

    /* renamed from: f */
    ImageView f9351f;

    /* renamed from: g */
    ViewStub f9352g;

    /* renamed from: h */
    View f9353h;

    /* renamed from: i */
    ImageView f9354i;

    /* renamed from: j */
    View f9355j;

    /* renamed from: k */
    RoundImageView f9356k;

    /* renamed from: l */
    TextView f9357l;

    /* renamed from: m */
    TextView f9358m;

    /* renamed from: n */
    TextView f9359n;

    /* renamed from: o */
    ViewStub f9360o;

    /* renamed from: p */
    int f9361p;

    /* renamed from: q */
    int f9362q;

    /* renamed from: r */
    int f9363r;

    /* renamed from: s */
    int f9364s;

    /* renamed from: t */
    boolean f9365t;

    /* renamed from: u */
    boolean f9366u;

    /* renamed from: v */
    int f9367v;

    /* renamed from: w */
    EnumSet<C2403b.C2404a> f9368w;

    /* renamed from: x */
    C3431n f9369x;

    /* renamed from: y */
    Context f9370y;

    /* renamed from: z */
    C3699e f9371z;

    /* renamed from: a */
    public void mo20269a(long j) {
    }

    /* renamed from: a */
    public void mo20270a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
    }

    /* renamed from: a */
    public void mo20272a(View view, boolean z) {
    }

    /* renamed from: a */
    public void mo20273a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo20275a(String str) {
    }

    /* renamed from: b */
    public void mo16093b(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: b */
    public void mo16094b(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    /* renamed from: b */
    public void mo20278b(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo20279b(boolean z) {
    }

    /* renamed from: b */
    public boolean mo20280b(int i) {
        return false;
    }

    /* renamed from: c */
    public void mo20282c(boolean z) {
    }

    /* renamed from: e */
    public void mo20284e() {
    }

    /* renamed from: f */
    public void mo20285f() {
    }

    /* renamed from: j */
    public boolean mo20289j() {
        return false;
    }

    /* renamed from: n */
    public void mo20293n() {
    }

    public C3658d(Context context, View view, boolean z, EnumSet<C2403b.C2404a> enumSet, C3431n nVar, C2405c cVar, boolean z2) {
        this.f9365t = true;
        this.f9335B = true;
        this.f9340G = true;
        this.f9345L = Build.MODEL;
        if (!(this instanceof C3650c)) {
            this.f9370y = C3513m.m10963a().getApplicationContext();
            mo20315d(z2);
            this.f9346a = view;
            this.f9365t = z;
            this.f9368w = enumSet == null ? EnumSet.noneOf(C2403b.C2404a.class) : enumSet;
            this.f9337D = cVar;
            this.f9369x = nVar;
            mo20281c(8);
            mo20271a(context, this.f9346a);
            mo20283d();
            mo20316p();
        }
    }

    public C3658d(Context context, View view, boolean z, EnumSet<C2403b.C2404a> enumSet, C3431n nVar, C2405c cVar) {
        this(context, view, z, enumSet, nVar, cVar, true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20316p() {
        /*
            r9 = this;
            boolean r0 = r9.f9335B
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "embeded_ad"
            goto L_0x0009
        L_0x0007:
            java.lang.String r0 = "embeded_ad_landingpage"
        L_0x0009:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9369x
            boolean r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12774b((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1)
            r2 = 1
            if (r1 == 0) goto L_0x001d
            boolean r0 = r9.f9335B
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "draw_ad"
            goto L_0x001b
        L_0x0019:
            java.lang.String r0 = "draw_ad_landingpage"
        L_0x001b:
            r1 = 6
            goto L_0x0028
        L_0x001d:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9369x
            boolean r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12781c((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1)
            if (r1 == 0) goto L_0x002b
            r1 = 7
            java.lang.String r0 = "rewarded_video"
        L_0x0028:
            r7 = r0
            r8 = r1
            goto L_0x0039
        L_0x002b:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9369x
            boolean r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12787d((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1)
            if (r1 == 0) goto L_0x0037
            r1 = 5
            java.lang.String r0 = "fullscreen_interstitial_ad"
            goto L_0x0028
        L_0x0037:
            r7 = r0
            r8 = r2
        L_0x0039:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r9.f9369x
            int r0 = r0.mo19519L()
            r1 = 4
            if (r0 != r1) goto L_0x004c
            android.content.Context r0 = r9.f9370y
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9369x
            com.com.bytedance.overseas.sdk.a.c r0 = com.com.bytedance.overseas.sdk.p185a.C3969d.m13089a(r0, r1, r7)
            r9.f9336C = r0
        L_0x004c:
            r9.m11831z()
            com.bytedance.sdk.openadsdk.core.b.a r0 = new com.bytedance.sdk.openadsdk.core.b.a
            android.content.Context r1 = r9.f9370y
            com.bytedance.sdk.openadsdk.core.e.n r3 = r9.f9369x
            r0.<init>(r1, r3, r7, r8)
            r9.f9338E = r0
            r0.mo19298b((boolean) r2)
            boolean r0 = r9.f9335B
            r1 = 0
            if (r0 == 0) goto L_0x0068
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            r0.mo19296a(r2)
            goto L_0x0072
        L_0x0068:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            r0.mo19296a(r1)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            r0.mo19300c(r2)
        L_0x0072:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            com.bykv.vk.openvk.component.video.api.d.c r3 = r9.f9337D
            r0.mo19306a((com.bykv.p054vk.openvk.component.video.api.p072d.C2405c) r3)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            r0.mo19321d((boolean) r2)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9338E
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$1 r3 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$1
            r3.<init>()
            r0.mo19309a((com.bytedance.sdk.openadsdk.core.p144b.C3360b.C3361a) r3)
            com.com.bytedance.overseas.sdk.a.c r0 = r9.f9336C
            if (r0 == 0) goto L_0x0093
            com.bytedance.sdk.openadsdk.core.b.a r3 = r9.f9338E
            if (r3 == 0) goto L_0x0093
            r3.mo19311a((com.com.bytedance.overseas.sdk.p185a.C3968c) r0)
        L_0x0093:
            boolean r0 = r9.m11830y()
            if (r0 == 0) goto L_0x00e7
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$2 r0 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$2
            android.content.Context r5 = r9.f9370y
            com.bytedance.sdk.openadsdk.core.e.n r6 = r9.f9369x
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.f9339F = r0
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$3 r3 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$3
            r3.<init>()
            r0.mo19309a((com.bytedance.sdk.openadsdk.core.p144b.C3360b.C3361a) r3)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9339F
            r0.mo19298b((boolean) r2)
            boolean r0 = r9.f9335B
            if (r0 == 0) goto L_0x00bd
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9339F
            r0.mo19296a(r2)
            goto L_0x00c2
        L_0x00bd:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9339F
            r0.mo19296a(r1)
        L_0x00c2:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9339F
            com.bykv.vk.openvk.component.video.api.d.c r1 = r9.f9337D
            r0.mo19306a((com.bykv.p054vk.openvk.component.video.api.p072d.C2405c) r1)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9339F
            r0.mo19321d((boolean) r2)
            com.com.bytedance.overseas.sdk.a.c r0 = r9.f9336C
            if (r0 == 0) goto L_0x00d7
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9339F
            r1.mo19311a((com.com.bytedance.overseas.sdk.p185a.C3968c) r0)
        L_0x00d7:
            android.view.View r0 = r9.f9346a
            if (r0 == 0) goto L_0x00e7
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9339F
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f9346a
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9339F
            r0.setOnTouchListener(r1)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.C3658d.mo20316p():void");
    }

    /* renamed from: y */
    private boolean m11830y() {
        return C3431n.m10311c(this.f9369x) && this.f9369x.mo19514G() == null && this.f9369x.mo19646p() == 1;
    }

    /* renamed from: a */
    public void mo20308a(NativeVideoTsView.C3629a aVar) {
        this.f9344K = aVar;
    }

    /* renamed from: a */
    public void mo20307a(TTNativeAd tTNativeAd) {
        C3359a aVar = this.f9338E;
        if (aVar != null) {
            aVar.mo19307a(tTNativeAd);
        }
        C3359a aVar2 = this.f9339F;
        if (aVar2 != null) {
            aVar2.mo19307a(tTNativeAd);
        }
    }

    /* renamed from: z */
    private void m11831z() {
        if (this.f9370y != null && this.f9346a != null) {
            C36624 r0 = new View(this.f9370y) {
                /* renamed from: a */
                private void m11898a() {
                }

                /* renamed from: b */
                private void m11899b() {
                }

                public void onFinishTemporaryDetach() {
                    super.onFinishTemporaryDetach();
                    m11898a();
                }

                /* access modifiers changed from: protected */
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    m11899b();
                }

                public void onStartTemporaryDetach() {
                    super.onStartTemporaryDetach();
                    m11899b();
                }
            };
            View view = this.f9346a;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(r0, 0, new RelativeLayout.LayoutParams(0, 0));
            }
        }
    }

    /* renamed from: q */
    public C2419b mo20317q() {
        return this.f9347b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20271a(Context context, View view) {
        View view2;
        long currentTimeMillis = System.currentTimeMillis();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        C2405c cVar = this.f9337D;
        if (cVar == null || !cVar.mo16054s()) {
            view2 = new SSRenderSurfaceView(this.f9370y);
            C2905l.m8111b("NewLiveViewLayout", "use SurfaceView......");
        } else {
            view2 = new SSRenderTextureView(this.f9370y);
            C2905l.m8111b("NewLiveViewLayout", "use TextureView......");
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(view2, 0, layoutParams);
        }
        C3904y.m12853a(view2, 8);
        this.f9347b = (C2419b) view2;
        this.f9348c = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_play"));
        this.f9349d = view.findViewById(C2914t.m8158e(context, "tt_video_loading_retry_layout"));
        this.f9350e = view.findViewById(C2914t.m8158e(context, "tt_video_loading_progress"));
        this.f9351f = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_loading_cover_image"));
        this.f9352g = (ViewStub) view.findViewById(C2914t.m8158e(context, "tt_video_ad_cover"));
        this.f9360o = (ViewStub) view.findViewById(C2914t.m8158e(context, "tt_video_draw_layout_viewStub"));
        C2905l.m8111b("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20305a(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f9352g) != null && viewStub.getParent() != null && this.f9353h == null) {
            this.f9353h = this.f9352g.inflate();
            this.f9354i = (ImageView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_finish_cover_image"));
            this.f9355j = view.findViewById(C2914t.m8158e(context, "tt_video_ad_cover_center_layout"));
            this.f9356k = (RoundImageView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_logo_image"));
            this.f9357l = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_btn_ad_image_tv"));
            this.f9358m = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_name"));
            this.f9359n = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_button"));
        }
    }

    /* renamed from: b */
    private void m11827b(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f9360o) != null && viewStub.getParent() != null && this.f9341H == null) {
            this.f9360o.inflate();
            this.f9341H = view.findViewById(C2914t.m8158e(context, "tt_video_ad_cover_center_layout_draw"));
            this.f9342I = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_button_draw"));
            this.f9343J = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_ad_replay"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo20318r() {
        if (this.f9334A != null && this.f9371z == null) {
            long currentTimeMillis = System.currentTimeMillis();
            C3699e eVar = new C3699e();
            this.f9371z = eVar;
            eVar.mo20477a(this.f9370y, this.f9346a);
            this.f9371z.mo20478a(this.f9334A, (C3699e.C3702b) this);
            C2905l.m8111b("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public boolean mo20309a(int i, C2400b bVar, boolean z) {
        C3699e eVar = this.f9371z;
        return eVar == null || eVar.mo20481a(i, bVar, z);
    }

    /* renamed from: s */
    public void mo20319s() {
        C3699e eVar = this.f9371z;
        if (eVar != null) {
            eVar.mo20479a(false);
        }
    }

    /* renamed from: a */
    public void mo20306a(C2402a aVar) {
        if (aVar instanceof C3631a) {
            this.f9334A = (C3631a) aVar;
            mo20318r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo20320t() {
        if (this.f9334A != null) {
            return true;
        }
        C2905l.m8118e("NewLiveViewLayout", "callback is null");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo20283d() {
        this.f9347b.mo16072a(this);
        this.f9348c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!C3658d.this.mo20320t()) {
                    return;
                }
                if (C3658d.this.f9359n == null || C3658d.this.f9359n.getVisibility() != 0) {
                    C3658d.this.f9334A.mo16006a((C2403b) C3658d.this, view);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo20314d(int i) {
        C3904y.m12853a(this.f9346a, 0);
        C2419b bVar = this.f9347b;
        if (bVar != null) {
            bVar.setVisibility(i);
        }
    }

    /* renamed from: d */
    public void mo20315d(boolean z) {
        this.f9335B = z;
        if (z) {
            C3359a aVar = this.f9338E;
            if (aVar != null) {
                aVar.mo19296a(true);
            }
            C3359a aVar2 = this.f9339F;
            if (aVar2 != null) {
                aVar2.mo19296a(true);
                return;
            }
            return;
        }
        C3359a aVar3 = this.f9338E;
        if (aVar3 != null) {
            aVar3.mo19296a(false);
        }
        C3359a aVar4 = this.f9339F;
        if (aVar4 != null) {
            aVar4.mo19296a(false);
        }
    }

    /* renamed from: a */
    public void mo20304a(int i, int i2) {
        if (i == -1) {
            i = C3904y.m12877c(this.f9370y);
        }
        if (i > 0) {
            this.f9361p = i;
            if (mo20290k() || mo20289j() || this.f9368w.contains(C2403b.C2404a.fixedSize)) {
                this.f9362q = i2;
            } else {
                this.f9362q = m11828e(i);
            }
            mo20310b(this.f9361p, this.f9362q);
        }
    }

    /* renamed from: b */
    public void mo20311b(boolean z, boolean z2) {
        ImageView imageView = this.f9348c;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageResource(C2914t.m8157d(this.f9370y, "tt_play_movebar_textpage"));
        } else {
            imageView.setImageResource(C2914t.m8157d(this.f9370y, "tt_stop_movebar_textpage"));
        }
    }

    /* renamed from: b */
    public void mo20310b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f9346a.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f9346a.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private int m11828e(int i) {
        if (this.f9363r <= 0 || this.f9364s <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f9370y.getResources().getDimensionPixelSize(C2914t.m8162i(this.f9370y, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.f9370y.getResources().getDimensionPixelSize(C2914t.m8162i(this.f9370y, "tt_video_container_minheight"));
        int i2 = (int) (((float) this.f9364s) * ((((float) i) * 1.0f) / ((float) this.f9363r)));
        if (i2 > dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    /* renamed from: c */
    public void mo20312c(int i, int i2) {
        this.f9363r = i;
        this.f9364s = i2;
    }

    /* renamed from: a */
    public void mo20268a(int i) {
        C2905l.m8114c("Progress", "setSeekProgress-percent=" + i);
    }

    /* renamed from: c */
    public void mo20313c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            if (this.f9346a.getParent() == null) {
                viewGroup.addView(this.f9346a);
            }
            mo20281c(0);
        }
    }

    /* renamed from: c */
    public View mo16021c() {
        return this.f9346a;
    }

    /* renamed from: g */
    public void mo20286g() {
        C3431n nVar;
        C3904y.m12889f(this.f9349d);
        C3904y.m12889f(this.f9350e);
        if (!(this.f9351f == null || (nVar = this.f9369x) == null || nVar.mo19517J() == null || this.f9369x.mo19517J().mo15951h() == null)) {
            C3904y.m12889f((View) this.f9351f);
            C3792d.m12395a().mo20614a(this.f9369x.mo19517J().mo15951h(), this.f9351f);
        }
        if (this.f9348c.getVisibility() == 0) {
            C3904y.m12853a((View) this.f9348c, 8);
        }
    }

    /* renamed from: u */
    public void mo20321u() {
        C3904y.m12889f(this.f9349d);
        C3904y.m12889f(this.f9350e);
        if (this.f9348c.getVisibility() == 0) {
            C3904y.m12853a((View) this.f9348c, 8);
        }
    }

    /* renamed from: a */
    public void mo16016a() {
        mo20276a(false, this.f9365t);
        mo20323w();
    }

    /* renamed from: v */
    public void mo20322v() {
        C3904y.m12853a(this.f9346a, 0);
        C2419b bVar = this.f9347b;
        if (bVar != null) {
            C3904y.m12853a(bVar.getView(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo20323w() {
        try {
            C3904y.m12853a(this.f9353h, 8);
            C3904y.m12853a((View) this.f9354i, 8);
            C3904y.m12853a(this.f9355j, 8);
            C3904y.m12853a((View) this.f9356k, 8);
            C3904y.m12853a((View) this.f9357l, 8);
            C3904y.m12853a((View) this.f9358m, 8);
            C3904y.m12853a((View) this.f9359n, 8);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m11829f(int i) {
        C3904y.m12853a(this.f9355j, i);
        C3904y.m12853a(this.f9341H, i);
    }

    /* renamed from: a */
    public void mo16019a(boolean z) {
        this.f9340G = z;
    }

    /* renamed from: a */
    public void mo16018a(C3431n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        C3431n nVar2;
        C3431n nVar3;
        C3431n nVar4;
        if (nVar != null) {
            mo20276a(false, this.f9365t);
            mo20305a(this.f9346a, C3513m.m10963a());
            View view = this.f9353h;
            if (view != null) {
                C3904y.m12853a(view, 0);
            }
            ImageView imageView = this.f9354i;
            if (imageView != null) {
                C3904y.m12853a((View) imageView, 0);
            }
            if (C3898x.m12774b(this.f9369x)) {
                m11827b(this.f9346a, C3513m.m10963a());
                C3904y.m12853a(this.f9355j, 8);
                C3904y.m12853a((View) this.f9354i, 0);
                C3904y.m12853a(this.f9341H, 0);
                C3904y.m12853a((View) this.f9342I, 0);
                C3904y.m12853a((View) this.f9343J, 0);
                if (this.f9343J != null && C2909o.m8136c(C3513m.m10963a()) == 0) {
                    C3904y.m12853a((View) this.f9343J, 8);
                }
                View view2 = this.f9353h;
                if (view2 != null) {
                    view2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (C3658d.this.f9337D != null) {
                                ((C2402a) C3658d.this.f9337D).mo16000a();
                            }
                        }
                    });
                }
                if (!(this.f9354i == null || (nVar4 = this.f9369x) == null || nVar4.mo19517J() == null || this.f9369x.mo19517J().mo15951h() == null)) {
                    C2390b.m5613a((long) this.f9369x.mo19517J().mo15946f(), this.f9369x.mo19517J().mo15953i(), new C2390b.C2392b() {
                        /* renamed from: a */
                        public void mo15912a(Bitmap bitmap) {
                            if (bitmap != null) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C3658d.this.f9354i.getLayoutParams();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    layoutParams.width = C3904y.m12877c(C3513m.m10963a());
                                    layoutParams.height = (int) ((float) ((bitmap.getHeight() * C3904y.m12877c(C3513m.m10963a())) / bitmap.getWidth()));
                                    layoutParams.addRule(13);
                                    C3658d.this.f9354i.setLayoutParams(layoutParams);
                                }
                                C3658d.this.f9354i.setImageBitmap(bitmap);
                                return;
                            }
                            C3792d.m12395a().mo20614a(C3658d.this.f9369x.mo19517J().mo15951h(), C3658d.this.f9354i);
                        }
                    });
                }
            } else {
                C3904y.m12853a(this.f9355j, 0);
                if (!(this.f9354i == null || (nVar3 = this.f9369x) == null || nVar3.mo19517J() == null || this.f9369x.mo19517J().mo15951h() == null)) {
                    C3792d.m12395a().mo20614a(this.f9369x.mo19517J().mo15951h(), this.f9354i);
                }
            }
            if (!TextUtils.isEmpty(nVar.mo19518K())) {
                str = nVar.mo19518K();
            } else if (!TextUtils.isEmpty(nVar.mo19528U())) {
                str = nVar.mo19528U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo19529V()) ? nVar.mo19529V() : "";
            }
            if (this.f9356k != null && (nVar2 = this.f9369x) != null && nVar2.mo19520M() != null && this.f9369x.mo19520M().mo19468a() != null) {
                C3904y.m12853a((View) this.f9356k, 0);
                C3904y.m12853a((View) this.f9357l, 4);
                C3792d.m12395a().mo20613a(this.f9369x.mo19520M(), (ImageView) this.f9356k);
                if (m11830y()) {
                    this.f9356k.setOnClickListener(this.f9339F);
                    this.f9356k.setOnTouchListener(this.f9339F);
                } else {
                    this.f9356k.setOnClickListener(this.f9338E);
                    this.f9356k.setOnTouchListener(this.f9338E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C3904y.m12853a((View) this.f9356k, 4);
                C3904y.m12853a((View) this.f9357l, 0);
                TextView textView = this.f9357l;
                if (textView != null) {
                    textView.setText(str.substring(0, 1));
                    if (m11830y()) {
                        this.f9357l.setOnClickListener(this.f9339F);
                        this.f9357l.setOnTouchListener(this.f9339F);
                    } else {
                        this.f9357l.setOnClickListener(this.f9338E);
                        this.f9357l.setOnTouchListener(this.f9338E);
                    }
                }
            }
            if (this.f9358m != null && !TextUtils.isEmpty(str)) {
                this.f9358m.setText(str);
            }
            C3904y.m12853a((View) this.f9358m, 0);
            C3904y.m12853a((View) this.f9359n, 0);
            String W = nVar.mo19530W();
            if (TextUtils.isEmpty(W)) {
                int L = nVar.mo19519L();
                if (L == 2 || L == 3) {
                    W = C2914t.m8151a(this.f9370y, "tt_video_mobile_go_detail");
                } else if (L != 4) {
                    W = L != 5 ? C2914t.m8151a(this.f9370y, "tt_video_mobile_go_detail") : C2914t.m8151a(this.f9370y, "tt_video_dial_phone");
                } else {
                    W = C2914t.m8151a(this.f9370y, "tt_video_download_apk");
                }
            }
            TextView textView2 = this.f9359n;
            if (textView2 != null) {
                textView2.setText(W);
                this.f9359n.setOnClickListener(this.f9338E);
                this.f9359n.setOnTouchListener(this.f9338E);
            }
            TextView textView3 = this.f9342I;
            if (textView3 != null) {
                textView3.setText(W);
                this.f9342I.setOnClickListener(this.f9338E);
                this.f9342I.setOnTouchListener(this.f9338E);
            }
            if (!this.f9340G) {
                m11829f(4);
            }
        }
    }

    /* renamed from: b */
    public void mo16020b() {
        C3904y.m12887e(this.f9349d);
        C3904y.m12887e(this.f9350e);
        ImageView imageView = this.f9351f;
        if (imageView != null) {
            C3904y.m12887e((View) imageView);
        }
    }

    /* renamed from: h */
    public void mo20287h() {
        C3904y.m12887e(this.f9349d);
    }

    /* renamed from: a */
    public void mo16090a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f9347b.getHolder()) {
            this.f9366u = true;
            if (mo20320t()) {
                this.f9334A.mo16004a((C2403b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo16091a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f9347b.getHolder() && mo20320t()) {
            this.f9334A.mo16005a(this, surfaceHolder, i, i2, i3);
        }
    }

    /* renamed from: b */
    public void mo16095b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f9347b.getHolder()) {
            this.f9366u = false;
            if (mo20320t()) {
                this.f9334A.mo16010b((C2403b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo16089a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f9366u = true;
        if (mo20320t()) {
            this.f9334A.mo16003a((C2403b) this, surfaceTexture);
        }
    }

    /* renamed from: a */
    public boolean mo16092a(SurfaceTexture surfaceTexture) {
        this.f9366u = false;
        if (!mo20320t()) {
            return true;
        }
        this.f9334A.mo16009b((C2403b) this, surfaceTexture);
        return true;
    }

    /* renamed from: i */
    public void mo20288i() {
        mo20281c(8);
        if (mo20324x()) {
            this.f9347b.setVisibility(8);
        }
        ImageView imageView = this.f9351f;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        mo20281c(8);
        C3904y.m12853a(this.f9353h, 8);
        C3904y.m12853a((View) this.f9354i, 8);
        C3904y.m12853a(this.f9355j, 8);
        C3904y.m12853a((View) this.f9356k, 8);
        C3904y.m12853a((View) this.f9357l, 8);
        C3904y.m12853a((View) this.f9358m, 8);
        C3699e eVar = this.f9371z;
        if (eVar != null) {
            eVar.mo20479a(true);
        }
    }

    /* renamed from: k */
    public boolean mo20290k() {
        return this.f9365t;
    }

    /* renamed from: a */
    public void mo20277a(boolean z, boolean z2, boolean z3) {
        C3904y.m12853a((View) this.f9348c, (!z || this.f9349d.getVisibility() == 0) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo20276a(boolean z, boolean z2) {
        C3904y.m12853a((View) this.f9348c, 8);
    }

    /* renamed from: l */
    public void mo20291l() {
        mo20276a(true, false);
    }

    /* renamed from: m */
    public boolean mo20292m() {
        return this.f9366u;
    }

    /* renamed from: c */
    public void mo20281c(int i) {
        this.f9367v = i;
        C3904y.m12853a(this.f9346a, i);
    }

    /* renamed from: o */
    public boolean mo20294o() {
        C3699e eVar = this.f9371z;
        return eVar != null && eVar.mo20480a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo20324x() {
        return !this.f9368w.contains(C2403b.C2404a.alwayShowMediaView) || this.f9365t;
    }

    /* renamed from: a */
    public void mo16017a(Drawable drawable) {
        View view = this.f9346a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }
}
