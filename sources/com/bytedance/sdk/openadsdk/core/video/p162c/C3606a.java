package com.bytedance.sdk.openadsdk.core.video.p162c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2399a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2402a;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bykv.p054vk.openvk.component.video.api.renderview.C2419b;
import com.bykv.p054vk.openvk.component.video.p055a.p067d.C2374d;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2389a;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2917v;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3658d;
import com.bytedance.sdk.openadsdk.core.video.p160a.C3594a;
import com.bytedance.sdk.openadsdk.core.widget.C3699e;
import com.bytedance.sdk.openadsdk.p177k.C3847e;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a */
/* compiled from: BaseVideoController */
public abstract class C3606a extends C3594a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f9132A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f9133B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2405c.C2406a f9134C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f9135D = false;

    /* renamed from: E */
    private boolean f9136E = false;

    /* renamed from: F */
    private boolean f9137F = false;

    /* renamed from: G */
    private WeakReference<C2405c.C2407b> f9138G;

    /* renamed from: H */
    private int f9139H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f9140I = false;

    /* renamed from: J */
    private boolean f9141J = true;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f9142K;

    /* renamed from: L */
    private boolean f9143L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f9144M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Runnable f9145N = new Runnable() {
        public void run() {
            if (C3606a.this.f9134C != null) {
                C3606a.this.mo18891z();
                C3606a.this.f9134C.mo16055a();
            }
        }
    };

    /* renamed from: O */
    private long f9146O;

    /* renamed from: P */
    private final BroadcastReceiver f9147P = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C3606a.this.mo16030b();
                }
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: Q */
    private final C2917v.C2920b f9148Q = new C2917v.C2920b() {
        /* renamed from: a */
        public void mo17829a(Context context, Intent intent, boolean z) {
            int i = 0;
            if (z) {
                try {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i = 4;
                        } else if (type == 0) {
                            i = 1;
                        }
                    } else {
                        i = C2909o.m8136c(context);
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            C3606a.this.m11468a(context, i);
        }
    };

    /* renamed from: R */
    private int f9149R = 1;

    /* renamed from: S */
    private boolean f9150S = false;

    /* renamed from: s */
    protected Map<String, Object> f9151s = null;

    /* renamed from: t */
    protected long f9152t = 0;

    /* renamed from: u */
    protected long f9153u = 0;

    /* renamed from: v */
    protected boolean f9154v = false;

    /* renamed from: w */
    protected boolean f9155w = false;

    /* renamed from: x */
    protected C2401c f9156x;

    /* renamed from: y */
    C2394a.C2395a f9157y = new C2394a.C2395a() {
        /* renamed from: d */
        public void mo15924d(C2394a aVar) {
        }

        /* renamed from: e */
        public void mo15925e(C2394a aVar) {
        }

        /* renamed from: a */
        public void mo15913a(C2394a aVar) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onCompletion: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    C3606a.this.m11443O();
                }
            });
            if (C3606a.this.f9092e.mo19590ax() != null && C3606a.this.f9092e.mo19590ax().mo19887a() != null) {
                C3606a.this.f9092e.mo19590ax().mo19887a().mo19960d(C3606a.this.mo16042g());
                C3606a.this.f9092e.mo19590ax().mo19887a().mo19962e(C3606a.this.mo16042g());
            }
        }

        /* renamed from: a */
        public void mo15917a(C2394a aVar, final long j) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRenderStart: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    if (C3606a.this.f9091d != null) {
                        C3606a.this.f9091d.mo16020b();
                        C3606a.this.f9098k.removeCallbacks(C3606a.this.f9145N);
                        boolean unused = C3606a.this.f9140I = false;
                    }
                    if (!C3606a.this.f9135D) {
                        C3606a.this.f9153u = j;
                        C3606a.this.mo18889x();
                        C3606a.this.m11458V();
                        boolean unused2 = C3606a.this.f9135D = true;
                        C3606a.this.f9155w = true;
                    }
                }
            });
            long unused = C3606a.this.f9142K = System.currentTimeMillis();
        }

        /* renamed from: b */
        public void mo15921b(C2394a aVar) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onPrepared: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    if (C3606a.this.f9098k != null) {
                        C3606a.this.f9098k.removeCallbacks(C3606a.this.f9145N);
                    }
                    if (C3606a.this.f9091d != null) {
                        C3606a.this.f9091d.mo16020b();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo15919a(C2394a aVar, final C2399a aVar2) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onError: ");
            if (aVar2 != null) {
                C3606a.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3606a.this.mo18883a(aVar2.mo15926a(), aVar2.mo15927b());
                        C3606a.this.f9098k.removeCallbacks(C3606a.this.f9145N);
                        if (C3606a.this.f9091d != null) {
                            C3606a.this.f9091d.mo16020b();
                        }
                        if (C3606a.this.f9134C != null) {
                            C3606a.this.f9134C.mo16058b(C3606a.this.f9133B, C2389a.m5610a(C3606a.this.f9093f, C3606a.this.f9104q));
                        }
                    }
                });
                aVar2.mo15926a();
                aVar2.mo15928c();
            }
        }

        /* renamed from: a */
        public void mo15920a(C2394a aVar, boolean z) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onSeekCompletion: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    C3606a.this.f9098k.removeCallbacks(C3606a.this.f9145N);
                    if (C3606a.this.f9091d != null) {
                        C3606a.this.f9091d.mo16020b();
                    }
                }
            });
        }

        /* renamed from: c */
        public void mo15923c(C2394a aVar) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRelease: ");
        }

        /* renamed from: a */
        public void mo15915a(C2394a aVar, int i, int i2) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onVideoSizeChanged: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    if (!C3606a.this.m11446P()) {
                        C3606a.this.m11448Q();
                    } else if (C3606a.this.f9092e != null && (C3418l.m10266b(C3606a.this.f9092e) || C3606a.this.f9144M)) {
                        C3606a.this.mo20191g(true);
                    } else if (C3606a.this.f9092e != null && C3606a.this.f9092e.mo19656t() == 3) {
                        C3606a.this.mo20191g(true);
                    } else if (C3606a.this.f9092e == null || C3606a.this.f9092e.mo19656t() != 0) {
                        C3606a.this.m11451S();
                    } else {
                        C3606a.this.m11454T();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo15916a(C2394a aVar, int i, int i2, int i3) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferStart: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    if (C3606a.this.f9091d != null) {
                        C3606a.this.f9091d.mo20321u();
                        C3606a.this.m11441N();
                        boolean unused = C3606a.this.f9140I = true;
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo15914a(C2394a aVar, int i) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferEnd: ");
            C3606a.this.f9098k.post(new Runnable() {
                public void run() {
                    if (C3606a.this.f9091d != null) {
                        C3606a.this.f9091d.mo16020b();
                        C3606a.this.f9098k.removeCallbacks(C3606a.this.f9145N);
                        boolean unused = C3606a.this.f9140I = false;
                    }
                }
            });
        }

        /* renamed from: b */
        public void mo15922b(C2394a aVar, int i) {
            C2905l.m8114c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferingUpdate: ");
        }

        /* renamed from: a */
        public void mo15918a(C2394a aVar, long j, long j2) {
            if (Math.abs(j - C3606a.this.f9093f) >= 50) {
                final long j3 = j;
                final long j4 = j2;
                C3606a.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3606a.this.m11465a(j3, j4);
                    }
                });
                if (C3606a.this.f9092e.mo19590ax() != null && C3606a.this.f9092e.mo19590ax().mo19887a() != null) {
                    C3606a.this.f9092e.mo19590ax().mo19887a().mo19947a(j, j2);
                }
            }
        }
    };

    /* renamed from: z */
    private final ViewGroup f9158z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18883a(int i, int i2);

    /* renamed from: a */
    public void mo20187a(C2403b bVar, View view, boolean z) {
    }

    /* renamed from: a */
    public void mo16025a(C2405c.C2409d dVar) {
    }

    /* renamed from: d */
    public void mo16038d(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo18885t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo18886u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo18887v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo18888w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo18889x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo18890y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo18891z();

    /* renamed from: H */
    public void mo20180H() {
        C2394a.C2395a aVar = this.f9157y;
        if (aVar != null) {
            aVar.mo15915a((C2394a) null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo20191g(boolean z) {
        try {
            C2905l.m8114c("changeVideoSize", "landingPageChangeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f9092e.mo19664x());
            if (!m11450R() || z) {
                C2905l.m8114c("changeVideoSize", "landingPageChangeVideoSize start check condition complete ... go ..");
                float j = (float) this.f9090c.mo15883j();
                float k = (float) this.f9090c.mo15884k();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) j, (int) k);
                layoutParams.addRule(13);
                if (mo20182J() != null) {
                    if (mo20182J() instanceof TextureView) {
                        ((TextureView) mo20182J()).setLayoutParams(layoutParams);
                    } else if (mo20182J() instanceof SurfaceView) {
                        ((SurfaceView) mo20182J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f9158z.getLayoutParams();
                    if (this.f9158z.getHeight() > 0) {
                        float min = Math.min(((float) this.f9158z.getWidth()) / j, ((float) this.f9158z.getHeight()) / k);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (j * min);
                            layoutParams.height = (int) (k * min);
                            if (mo20182J() instanceof TextureView) {
                                ((TextureView) mo20182J()).setLayoutParams(layoutParams);
                            } else if (mo20182J() instanceof SurfaceView) {
                                ((SurfaceView) mo20182J()).setLayoutParams(layoutParams);
                            }
                            if (this.f9144M) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.f9158z.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                C2905l.m8111b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            C2905l.m8115c("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m11467a(Context context) {
        EnumSet<E> noneOf = EnumSet.noneOf(C2403b.C2404a.class);
        noneOf.add(C2403b.C2404a.hideCloseBtn);
        noneOf.add(C2403b.C2404a.hideBackBtn);
        this.f9091d = new C3658d(context.getApplicationContext(), LayoutInflater.from(context.getApplicationContext()).inflate(C2914t.m8159f(context, "tt_video_play_layout_for_live"), (ViewGroup) null, false), true, noneOf, this.f9092e, this);
        this.f9091d.mo20306a((C2402a) this);
    }

    protected C3606a(Context context, ViewGroup viewGroup, C3431n nVar) {
        this.f9149R = C2909o.m8136c(context);
        this.f9158z = viewGroup;
        this.f9095h = new WeakReference(context);
        this.f9092e = nVar;
        m11467a(context);
        this.f9139H = C3898x.m12794f(this.f9092e);
    }

    /* renamed from: a */
    public boolean mo16029a(C2401c cVar) {
        mo16036c(false);
        if (cVar == null) {
            return false;
        }
        if (this.f9090c == null || !this.f9090c.mo15886m()) {
            this.f9156x = cVar;
            C2905l.m8111b("CSJ_VIDEO_BaseController", "video local url " + cVar.mo15991j());
            if (TextUtils.isEmpty(cVar.mo15991j())) {
                C2905l.m8118e("CSJ_VIDEO_BaseController", "No video info");
                return false;
            }
            mo18890y();
            this.f9154v = !cVar.mo15991j().startsWith("http");
            this.f9101n = cVar.mo15986f();
            if (cVar.mo15982e() > 0) {
                this.f9093f = cVar.mo15982e();
                this.f9094g = this.f9094g > this.f9093f ? this.f9094g : this.f9093f;
            }
            if (this.f9091d != null) {
                this.f9091d.mo16016a();
                this.f9091d.mo20286g();
                this.f9091d.mo20312c(cVar.mo15976c(), cVar.mo15979d());
                this.f9091d.mo20313c(this.f9158z);
            }
            if (!(this.f9090c != null || cVar.mo15993l() == -2 || cVar.mo15993l() == 1)) {
                this.f9090c = new C2374d();
            }
            if (this.f9090c != null) {
                this.f9090c.mo15870a(this.f9157y);
            }
            mo20155A();
            this.f9133B = 0;
            try {
                m11491c(cVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            this.f9090c.mo15865a();
            return true;
        }
    }

    /* renamed from: r */
    public boolean mo16053r() {
        return this.f9140I;
    }

    /* renamed from: e */
    public void mo16040e(boolean z) {
        this.f9141J = z;
    }

    /* renamed from: b */
    public void mo16032b(C2401c cVar) {
        this.f9156x = cVar;
    }

    /* renamed from: l */
    public int mo16047l() {
        return C2389a.m5610a(this.f9094g, this.f9104q);
    }

    /* renamed from: a */
    public void mo16026a(Map<String, Object> map) {
        this.f9151s = map;
    }

    /* renamed from: c */
    private void m11491c(C2401c cVar) throws Exception {
        if (cVar != null) {
            this.f9156x = cVar;
            if (this.f9090c != null) {
                if (this.f9092e != null) {
                    this.f9092e.mo19517J();
                    cVar.mo15981d(String.valueOf(C3898x.m12794f(this.f9092e)));
                }
                cVar.mo15977c(1);
                this.f9090c.mo15871a(cVar);
            }
            this.f9132A = System.currentTimeMillis();
            if (!TextUtils.isEmpty(cVar.mo15991j())) {
                this.f9091d.mo20314d(8);
                this.f9091d.mo20314d(0);
                mo20162a((Runnable) new Runnable() {
                    public void run() {
                        long unused = C3606a.this.f9132A = System.currentTimeMillis();
                        C3606a.this.f9091d.mo20281c(0);
                        if (C3606a.this.f9090c != null && C3606a.this.f9093f == 0) {
                            C3606a.this.f9090c.mo15873a(true, 0, C3606a.this.f9101n);
                        } else if (C3606a.this.f9090c != null) {
                            C3606a.this.f9090c.mo15873a(true, C3606a.this.f9093f, C3606a.this.f9101n);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m11441N() {
        int i;
        int t = mo18885t();
        if (t == 2 || t == 1) {
            i = C3513m.m10973h().mo19885y() * 1000;
        } else {
            i = t == 3 ? C3513m.m10973h().mo19848e(String.valueOf(this.f9139H)) : 5;
        }
        this.f9098k.removeCallbacks(this.f9145N);
        this.f9098k.postDelayed(this.f9145N, (long) i);
    }

    /* renamed from: a */
    public void mo16024a(C2405c.C2407b bVar) {
        this.f9138G = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m11443O() {
        if (mo20157C() && this.f9091d != null) {
            this.f9098k.removeCallbacks(this.f9145N);
            this.f9091d.mo16020b();
            long currentTimeMillis = System.currentTimeMillis() - this.f9132A;
            this.f9133B = currentTimeMillis;
            C2405c.C2406a aVar = this.f9134C;
            if (aVar != null) {
                aVar.mo16056a(currentTimeMillis, C2389a.m5610a(this.f9093f, this.f9104q));
            }
            if (!this.f9136E) {
                this.f9136E = true;
                m11465a(this.f9104q, this.f9104q);
                long j = this.f9104q;
                this.f9093f = j;
                this.f9094g = j;
                mo18886u();
            }
            this.f9099l = true;
        }
    }

    /* renamed from: a */
    public void mo16023a(C2405c.C2406a aVar) {
        this.f9134C = aVar;
    }

    /* renamed from: b */
    public void mo16030b() {
        if (this.f9090c != null) {
            this.f9090c.mo15874b();
        }
        if (!this.f9136E && this.f9135D) {
            mo18887v();
            if (this.f9092e.mo19590ax() != null && this.f9092e.mo19590ax().mo19887a() != null) {
                this.f9092e.mo19590ax().mo19887a().mo19956b(this.f9093f);
            }
        }
    }

    /* renamed from: d */
    public void mo16037d() {
        if (this.f9091d != null) {
            this.f9091d.mo16016a();
            this.f9091d.mo20319s();
            this.f9091d.mo20322v();
        }
        C2905l.m8107a("CSJ_VIDEO_BaseController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f9097j));
        if (this.f9090c != null) {
            if (this.f9090c.mo15886m()) {
                if (this.f9097j) {
                    mo20159E();
                } else {
                    mo20163b(this.f9105r);
                }
                C2905l.m8107a("CSJ_VIDEO_BaseController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f9097j));
            } else {
                this.f9090c.mo15873a(false, this.f9093f, this.f9101n);
            }
        }
        if (!this.f9136E && this.f9135D) {
            mo18888w();
            if (this.f9092e.mo19590ax() != null && this.f9092e.mo19590ax().mo19887a() != null) {
                this.f9092e.mo19590ax().mo19887a().mo19958c(mo16042g());
            }
        }
    }

    /* renamed from: I */
    public void mo20181I() {
        if (!this.f9136E && this.f9135D) {
            mo18888w();
            if (this.f9092e.mo19590ax() != null && this.f9092e.mo19590ax().mo19887a() != null) {
                this.f9092e.mo19590ax().mo19887a().mo19958c(mo16042g());
            }
        }
    }

    /* renamed from: d */
    public void mo20190d(long j) {
        this.f9093f = j;
        this.f9094g = this.f9094g > this.f9093f ? this.f9094g : this.f9093f;
        if (this.f9091d != null) {
            this.f9091d.mo16016a();
        }
        if (this.f9090c != null) {
            this.f9090c.mo15873a(true, this.f9093f, this.f9101n);
        }
    }

    /* renamed from: e */
    public void mo16039e() {
        if (this.f9090c != null) {
            this.f9090c.mo15877d();
            this.f9090c = null;
        }
        if (this.f9091d != null) {
            this.f9091d.mo20288i();
        }
        if (this.f9098k != null) {
            this.f9098k.removeCallbacks(this.f9145N);
            this.f9098k.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: a */
    public void mo16028a(boolean z, int i) {
        mo16039e();
    }

    /* renamed from: f */
    public void mo16041f() {
        mo16039e();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public boolean m11446P() {
        if (this.f9092e == null || this.f9092e.mo19580an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m11448Q() {
        try {
            if (mo20182J() != null && this.f9090c != null) {
                if (this.f9158z != null) {
                    int width = this.f9158z.getWidth();
                    int height = this.f9158z.getHeight();
                    float j = (float) this.f9090c.mo15883j();
                    float k = (float) this.f9090c.mo15884k();
                    float f = (float) width;
                    float f2 = (float) height;
                    if (j / (f * 1.0f) <= k / (f2 * 1.0f)) {
                        f = (f2 / (k * 1.0f)) * j;
                    } else {
                        f2 = (f / (j * 1.0f)) * k;
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                    layoutParams.addRule(13);
                    if (mo20182J() instanceof TextureView) {
                        ((TextureView) mo20182J()).setLayoutParams(layoutParams);
                    } else if (mo20182J() instanceof SurfaceView) {
                        ((SurfaceView) mo20182J()).setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            C2905l.m8115c("changeVideoSize", "changeVideoSizeSupportInteraction error", th);
        }
    }

    /* renamed from: R */
    private boolean m11450R() throws Throwable {
        if (this.f9095h == null || this.f9095h.get() == null || mo20182J() == null || this.f9090c == null || this.f9092e == null || this.f9092e.mo19514G() != null || this.f9092e.mo19660v() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m11451S() {
        try {
            C2905l.m8114c("changeVideoSize", "changeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f9092e.mo19664x());
            if (!m11450R()) {
                C2905l.m8114c("changeVideoSize", "changeVideoSize start check condition complete ... go ..");
                int[] b = C3904y.m12874b(C3513m.m10963a());
                boolean z = false;
                boolean z2 = this.f9092e.mo19579am() == 1;
                float f = (float) b[0];
                float f2 = (float) b[1];
                float j = (float) this.f9090c.mo15883j();
                float k = (float) this.f9090c.mo15884k();
                if (z2) {
                    if (j > k) {
                        C2905l.m8111b("changeVideoSize", "Separate adaptation for landscape to portrait .....");
                        m11464a(f, f2, j, k, true);
                        return;
                    }
                } else if (j < k) {
                    C2905l.m8111b("changeVideoSize", "Separate adaptation for portrait to landscape.....");
                    m11464a(f, f2, j, k, false);
                    return;
                }
                float f3 = j / k;
                float f4 = f / f2;
                C2905l.m8111b("changeVideoSize", "screenHeight=" + f2 + ",screenWidth=" + f);
                C2905l.m8111b("changeVideoSize", "videoHeight=" + k + ",videoWidth=" + j);
                C2905l.m8111b("changeVideoSize", "video w/h,videoScale=" + f3 + ",screen  w/h .screenScale=" + f4 + ",VERTICAL_SCALE(9:16)=" + 0.5625f + ",HORIZONTAL_SCALE(16:9) =" + 1.7777778f);
                if (z2) {
                    if (f4 < 0.5625f && f3 == 0.5625f) {
                        j = (9.0f * f2) / 16.0f;
                        z = true;
                        k = f2;
                    }
                } else if (f4 > 1.7777778f && f3 == 1.7777778f) {
                    k = (9.0f * f) / 16.0f;
                    z = true;
                    j = f;
                }
                C2905l.m8114c("changeVideoSize", "适配后宽高：videoHeight=" + k + ",videoWidth=" + j);
                if (!z) {
                    C2905l.m8114c("changeVideoSize", " Screen w/h == Video w/h and in other cases，use screen width and height，videoHeight=" + f2 + "，videoWidth=" + f);
                } else {
                    f = j;
                    f2 = k;
                }
                int i = (int) f;
                int i2 = (int) f2;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                layoutParams.addRule(13);
                if (mo20182J() != null) {
                    if (mo20182J() instanceof TextureView) {
                        ((TextureView) mo20182J()).setLayoutParams(layoutParams);
                    } else if (mo20182J() instanceof SurfaceView) {
                        ((SurfaceView) mo20182J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f9158z.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i2;
                        layoutParams2.width = i;
                        this.f9158z.setLayoutParams(layoutParams2);
                    }
                }
                C2905l.m8111b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            C2905l.m8115c("changeVideoSize", "changeSize error", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m11454T() {
        try {
            if (this.f9095h != null && this.f9095h.get() != null && mo20182J() != null && this.f9090c != null) {
                if (this.f9092e != null) {
                    boolean z = this.f9092e.mo19579am() == 1;
                    int[] b = C3904y.m12874b(C3513m.m10963a());
                    m11464a((float) b[0], (float) b[1], (float) this.f9090c.mo15883j(), (float) this.f9090c.mo15884k(), z);
                    C2905l.m8111b("changeVideoSize", "changeSize=end");
                }
            }
        } catch (Throwable th) {
            C2905l.m8106a("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    private void m11464a(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            C2905l.m8111b("changeVideoSize", "screenWidth=" + f + ",screenHeight=" + f2);
            C2905l.m8111b("changeVideoSize", "videoHeight=" + f4 + ",videoWidth=" + f3);
            if (f3 <= 0.0f || f4 <= 0.0f) {
                f3 = (float) this.f9092e.mo19517J().mo15937c();
                f4 = (float) this.f9092e.mo19517J().mo15934b();
            }
            if (f4 <= 0.0f) {
                return;
            }
            if (f3 > 0.0f) {
                if (z) {
                    if (f3 >= f4) {
                        C2905l.m8111b("changeVideoSize", "Vertical screen mode use video width compute scale value");
                        layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
                        layoutParams.addRule(13);
                    } else {
                        return;
                    }
                } else if (f3 <= f4) {
                    C2905l.m8111b("changeVideoSize", "Landscape screen mode use video height compute scale value");
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
                    layoutParams2.addRule(13);
                    layoutParams = layoutParams2;
                } else {
                    return;
                }
                if (mo20182J() == null) {
                    return;
                }
                if (mo20182J() instanceof TextureView) {
                    ((TextureView) mo20182J()).setLayoutParams(layoutParams);
                } else if (mo20182J() instanceof SurfaceView) {
                    ((SurfaceView) mo20182J()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            C2905l.m8106a("changeVideoSize", "changeSize error", th);
        }
    }

    /* renamed from: a */
    public void mo16006a(C2403b bVar, View view) {
        if (this.f9090c != null && mo20157C()) {
            if (this.f9090c.mo15885l()) {
                mo16030b();
                this.f9091d.mo20311b(true, false);
                this.f9091d.mo20285f();
            } else if (!this.f9090c.mo15886m()) {
                if (this.f9091d != null) {
                    this.f9091d.mo20313c(this.f9158z);
                }
                mo20190d(this.f9093f);
                if (this.f9091d != null) {
                    this.f9091d.mo20311b(false, false);
                }
            } else {
                mo16037d();
                if (this.f9091d != null) {
                    this.f9091d.mo20311b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16001a(C2403b bVar, int i) {
        if (this.f9090c != null) {
            m11466a(this.f9146O, m11487b(i));
        }
    }

    /* renamed from: b */
    public void mo16008b(C2403b bVar, int i) {
        if (this.f9091d != null) {
            this.f9091d.mo20285f();
        }
    }

    /* renamed from: a */
    public void mo16002a(C2403b bVar, int i, boolean z) {
        if (mo20157C()) {
            long n = (long) ((((float) (((long) i) * this.f9104q)) * 1.0f) / ((float) C2914t.m8167n((Context) this.f9095h.get(), "tt_video_progress_max")));
            if (this.f9104q > 0) {
                this.f9146O = (long) ((int) n);
            } else {
                this.f9146O = 0;
            }
            if (this.f9091d != null) {
                this.f9091d.mo20269a(this.f9146O);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11465a(long j, long j2) {
        this.f9093f = j;
        this.f9104q = j2;
        this.f9091d.mo20270a(j, j2);
        this.f9091d.mo20268a(C2389a.m5610a(j, j2));
        try {
            if (this.f9134C != null) {
                this.f9134C.mo16057a(j, j2);
            }
        } catch (Throwable th) {
            C2905l.m8115c("CSJ_VIDEO_BaseController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo16011b(C2403b bVar, View view) {
        mo20189b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo20189b(C2403b bVar, View view, boolean z, boolean z2) {
        if (mo20157C()) {
            mo20164f(!this.f9103p);
            if (!(this.f9095h.get() instanceof Activity)) {
                C2905l.m8111b("CSJ_VIDEO_BaseController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9103p) {
                mo20186a(z ? 8 : 0);
                if (this.f9091d != null) {
                    this.f9091d.mo20273a(this.f9158z);
                    this.f9091d.mo20282c(false);
                }
            } else {
                mo20186a(1);
                if (this.f9091d != null) {
                    this.f9091d.mo20278b(this.f9158z);
                    this.f9091d.mo20282c(false);
                }
            }
            WeakReference<C2405c.C2407b> weakReference = this.f9138G;
            C2405c.C2407b bVar2 = weakReference != null ? (C2405c.C2407b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo16059a(this.f9103p);
            }
        }
    }

    /* renamed from: a */
    public void mo20186a(int i) {
        if (mo20157C()) {
            boolean z = i == 0 || i == 8;
            Context context = (Context) this.f9095h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i);
                } catch (Throwable unused) {
                }
                if (!z) {
                    activity.getWindow().setFlags(1024, 1024);
                } else {
                    activity.getWindow().clearFlags(1024);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16012c(C2403b bVar, View view) {
        if (this.f9091d != null) {
            this.f9091d.mo20288i();
        }
        mo16028a(true, 3);
    }

    /* renamed from: a */
    public void mo16007a(C2403b bVar, View view, boolean z, boolean z2) {
        if (this.f9100m) {
            mo16030b();
        }
        if (z && !this.f9100m && !mo20183K()) {
            this.f9091d.mo20311b(!mo20184L(), false);
            this.f9091d.mo20277a(z2, true, false);
        }
        if (this.f9090c == null || !this.f9090c.mo15885l()) {
            this.f9091d.mo20285f();
            return;
        }
        this.f9091d.mo20285f();
        this.f9091d.mo20284e();
    }

    /* renamed from: d */
    public void mo16013d(C2403b bVar, View view) {
        if (this.f9103p) {
            mo20164f(false);
            if (this.f9091d != null) {
                this.f9091d.mo20278b(this.f9158z);
            }
            mo20186a(1);
            return;
        }
        mo16028a(true, 3);
    }

    /* renamed from: e */
    public void mo16014e(C2403b bVar, View view) {
        mo20187a(bVar, view, false);
    }

    /* renamed from: J */
    public C2419b mo20182J() {
        if (this.f9095h == null || this.f9095h.get() == null || this.f9091d == null) {
            return null;
        }
        return this.f9091d.mo20317q();
    }

    /* renamed from: K */
    public boolean mo20183K() {
        return this.f9090c.mo15881h();
    }

    /* renamed from: a */
    public void mo16000a() {
        if (this.f9091d != null) {
            this.f9091d.mo20284e();
            this.f9091d.mo16016a();
        }
        if (this.f9091d != null) {
            this.f9091d.mo20322v();
        }
        mo20190d(-1);
    }

    /* renamed from: L */
    public boolean mo20184L() {
        return this.f9090c != null && this.f9090c.mo15885l();
    }

    /* renamed from: a */
    private void m11466a(long j, boolean z) {
        if (this.f9090c != null) {
            if (z) {
                m11456U();
            }
            this.f9090c.mo15866a(j);
        }
    }

    /* renamed from: b */
    private boolean m11487b(int i) {
        return this.f9091d.mo20280b(i);
    }

    /* renamed from: U */
    private void m11456U() {
        if (this.f9091d != null) {
            this.f9091d.mo20281c(0);
            this.f9091d.mo20276a(false, false);
            this.f9091d.mo20282c(false);
            this.f9091d.mo20284e();
            this.f9091d.mo20286g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a$6 */
    /* compiled from: BaseVideoController */
    static /* synthetic */ class C36216 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9177a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9177a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9177a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9177a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p162c.C3606a.C36216.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo20188a(C3699e.C3701a aVar, String str) {
        int i = C36216.f9177a[aVar.ordinal()];
        if (i == 1) {
            mo16030b();
        } else if (i == 2) {
            mo16028a(true, 3);
        } else if (i == 3) {
            mo16037d();
            this.f9102o = false;
            this.f9137F = true;
        }
    }

    /* renamed from: b */
    private boolean m11488b(int i, int i2) {
        if (i2 != 4 && i2 != 0) {
            mo16030b();
            this.f9102o = true;
            this.f9137F = false;
            if (!(this.f9091d == null || this.f9092e == null)) {
                return this.f9091d.mo20309a(i, this.f9092e.mo19517J(), true);
            }
        } else if (i2 == 4) {
            this.f9102o = false;
            if (this.f9091d != null) {
                this.f9091d.mo20319s();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11468a(Context context, int i) {
        if (mo20157C() && this.f9149R != i) {
            if (!this.f9137F) {
                m11488b(2, i);
            }
            this.f9149R = i;
        }
    }

    /* renamed from: M */
    public void mo20185M() {
        this.f9144M = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m11458V() {
        if (this.f9092e != null) {
            C3513m.m10972g().mo20695a(C3847e.m12562a(this.f9092e.mo19527T(), true, this.f9092e));
        }
    }

    /* renamed from: k */
    public long mo16046k() {
        return mo16042g() + mo16043h();
    }
}
