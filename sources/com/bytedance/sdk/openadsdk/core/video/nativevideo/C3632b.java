package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
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
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3559o;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.video.p160a.C3594a;
import com.bytedance.sdk.openadsdk.core.widget.C3699e;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p131a.C3067a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import com.bytedance.sdk.openadsdk.p177k.C3847e;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b */
/* compiled from: NativeVideoController */
public class C3632b extends C3594a {

    /* renamed from: A */
    private String f9225A;

    /* renamed from: B */
    private boolean f9226B;

    /* renamed from: C */
    private boolean f9227C;

    /* renamed from: D */
    private WeakReference<C2405c.C2407b> f9228D;

    /* renamed from: E */
    private boolean f9229E;

    /* renamed from: F */
    private boolean f9230F;

    /* renamed from: G */
    private boolean f9231G;

    /* renamed from: H */
    private boolean f9232H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public WeakReference<C2405c.C2409d> f9233I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public WeakReference<C3649a> f9234J;

    /* renamed from: K */
    private int f9235K;

    /* renamed from: L */
    private int f9236L;

    /* renamed from: M */
    private int f9237M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f9238N;

    /* renamed from: O */
    private boolean f9239O;

    /* renamed from: P */
    private C2401c f9240P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f9241Q;

    /* renamed from: R */
    private C3100j f9242R;

    /* renamed from: S */
    private C2394a.C2395a f9243S;

    /* renamed from: T */
    private int f9244T;

    /* renamed from: U */
    private long f9245U;

    /* renamed from: V */
    private long f9246V;

    /* renamed from: W */
    private long f9247W;

    /* renamed from: X */
    private long f9248X;

    /* renamed from: Y */
    private final BroadcastReceiver f9249Y;

    /* renamed from: Z */
    private final C2917v.C2920b f9250Z;

    /* renamed from: aa */
    private int f9251aa;

    /* renamed from: ab */
    private boolean f9252ab;

    /* renamed from: s */
    Runnable f9253s;

    /* renamed from: t */
    private final WeakReference<ViewGroup> f9254t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f9255u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f9256v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2405c.C2406a f9257w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final boolean f9258x;

    /* renamed from: y */
    private boolean f9259y;

    /* renamed from: z */
    private boolean f9260z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$a */
    /* compiled from: NativeVideoController */
    public interface C3649a {
        /* renamed from: a */
        void mo20206a(int i);

        /* renamed from: f */
        void mo20209f();
    }

    /* renamed from: a */
    public void mo20240a(int i) {
    }

    /* renamed from: a */
    public void mo16026a(Map<String, Object> map) {
    }

    /* renamed from: g */
    public void mo20250g(boolean z) {
        this.f9232H = z;
    }

    /* renamed from: a */
    public void mo20245a(final NativeVideoTsView.C3629a aVar) {
        if (this.f9100m && this.f9091d != null) {
            this.f9091d.mo20308a((NativeVideoTsView.C3629a) new NativeVideoTsView.C3629a() {
                /* renamed from: a */
                public void mo18857a(View view, int i) {
                    NativeVideoTsView.C3629a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo18857a(view, i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20244a(TTNativeAd tTNativeAd) {
        if (this.f9100m && this.f9091d != null) {
            this.f9091d.mo20307a(tTNativeAd);
        }
    }

    /* renamed from: a */
    public void mo20241a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.f9235K = i;
            this.f9236L = i2;
            C2905l.m8111b("CSJ_VIDEO_NativeController", "width=" + i + "height=" + i2);
        }
    }

    /* renamed from: a */
    private void m11678a(Context context) {
        View view;
        EnumSet<E> noneOf = EnumSet.noneOf(C2403b.C2404a.class);
        noneOf.add(C2403b.C2404a.hideCloseBtn);
        noneOf.add(C2403b.C2404a.hideBackBtn);
        if (this.f9100m) {
            view = m11688b(context);
        } else {
            view = LayoutInflater.from(context.getApplicationContext()).inflate(C2914t.m8159f(context, "tt_video_detail_layout"), (ViewGroup) null, false);
        }
        View view2 = view;
        if (view2 != null) {
            if (this.f9100m) {
                this.f9091d = new C3658d(context, view2, true, noneOf, this.f9092e, this, mo20161G());
            } else {
                this.f9091d = new C3650c(context, view2, true, noneOf, this.f9092e, this, false);
            }
            this.f9091d.mo20306a((C2402a) this);
        }
    }

    /* renamed from: b */
    private View m11688b(Context context) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(C2914t.m8158e(context, "tt_root_view"));
        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout2.setId(C2914t.m8158e(context, "tt_video_loading_retry_layout"));
        relativeLayout2.setBackgroundColor(0);
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout.addView(relativeLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView.setId(C2914t.m8158e(context, "tt_video_loading_cover_image"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams2);
        relativeLayout2.addView(imageView);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        progressBar.setId(C2914t.m8158e(context, "tt_video_loading_progress"));
        layoutParams3.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams3);
        progressBar.setIndeterminateDrawable(C2914t.m8156c(context, "tt_video_loading_progress_bar"));
        relativeLayout2.addView(progressBar);
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(C2914t.m8158e(context, "tt_video_play"));
        layoutParams4.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(C2914t.m8157d(context, "tt_play_movebar_textpage"));
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView2);
        ViewStub viewStub = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setId(C2914t.m8158e(context, "tt_video_ad_cover"));
        viewStub.setLayoutParams(layoutParams5);
        viewStub.setLayoutResource(C2914t.m8159f(context, "tt_video_ad_cover_layout"));
        relativeLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        viewStub2.setId(C2914t.m8158e(context, "tt_video_draw_layout_viewStub"));
        viewStub2.setLayoutParams(layoutParams6);
        viewStub2.setLayoutResource(C2914t.m8159f(context, "tt_video_draw_btn_layout"));
        relativeLayout.addView(viewStub2);
        return relativeLayout;
    }

    public C3632b(Context context, ViewGroup viewGroup, C3431n nVar, String str, boolean z, boolean z2, boolean z3, C3100j jVar) {
        boolean z4 = false;
        this.f9259y = false;
        this.f9260z = false;
        this.f9225A = "embeded_ad";
        this.f9226B = false;
        this.f9227C = true;
        this.f9229E = false;
        this.f9230F = false;
        this.f9231G = true;
        this.f9232H = true;
        this.f9235K = 0;
        this.f9236L = 0;
        this.f9237M = 0;
        this.f9238N = false;
        this.f9239O = true;
        this.f9243S = new C2394a.C2395a() {
            /* renamed from: b */
            public void mo15922b(C2394a aVar, int i) {
            }

            /* renamed from: c */
            public void mo15923c(C2394a aVar) {
            }

            /* renamed from: d */
            public void mo15924d(C2394a aVar) {
            }

            /* renamed from: e */
            public void mo15925e(C2394a aVar) {
            }

            /* renamed from: a */
            public void mo15913a(C2394a aVar) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.m11720x();
                    }
                });
                C3632b.this.mo20240a(4);
            }

            /* renamed from: a */
            public void mo15917a(C2394a aVar, long j) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                            C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                            boolean unused = C3632b.this.f9238N = false;
                        }
                        if (!(!C3632b.this.f9100m || C3632b.this.f9234J == null || C3632b.this.f9234J.get() == null)) {
                            ((C3649a) C3632b.this.f9234J.get()).mo20209f();
                        }
                        C3632b.this.m11659L();
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                    }
                });
                C3632b.this.m11724z();
                long unused = C3632b.this.f9241Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo15921b(C2394a aVar) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (!(C3632b.this.f9233I == null || C3632b.this.f9233I.get() == null)) {
                            ((C2405c.C2409d) C3632b.this.f9233I.get()).mo16066e_();
                        }
                        if (!C3632b.this.f9258x) {
                            C3632b.this.m11724z();
                        }
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                        }
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                    }
                });
            }

            /* renamed from: a */
            public void mo15919a(C2394a aVar, final C2399a aVar2) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo15926a();
                        int b = aVar2.mo15927b();
                        C3632b.this.m11690b(a, b);
                        C2905l.m8118e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C3632b.this.mo20253u() || b == -1004) {
                            C2905l.m8118e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C3632b.this.m11699d(a, b)) {
                                C2905l.m8118e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C3632b.this.f9091d.mo16018a(C3632b.this.f9092e, (WeakReference<Context>) C3632b.this.f9095h, false);
                                C3632b.this.mo16036c(true);
                                C3632b.this.mo16041f();
                            }
                            if (C3632b.this.f9091d != null) {
                                C3632b.this.f9091d.mo16020b();
                            }
                            if (C3632b.this.f9257w != null) {
                                C3632b.this.f9257w.mo16058b(C3632b.this.f9256v, C2389a.m5610a(C3632b.this.f9093f, C3632b.this.f9104q));
                            }
                            if (C3632b.this.f9233I != null && C3632b.this.f9233I.get() != null && !C3632b.this.mo20253u()) {
                                ((C2405c.C2409d) C3632b.this.f9233I.get()).mo16065a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15920a(C2394a aVar, boolean z) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15915a(C2394a aVar, int i, int i2) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.m11651H();
                    }
                });
            }

            /* renamed from: a */
            public void mo15916a(C2394a aVar, int i, int i2, int i3) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo20321u();
                            C3632b.this.f9098k.postDelayed(C3632b.this.f9253s, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                            boolean unused = C3632b.this.f9238N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15914a(C2394a aVar, int i) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.f9091d.mo16020b();
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                        boolean unused = C3632b.this.f9238N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo15918a(C2394a aVar, long j, long j2) {
                if (Math.abs(j - C3632b.this.f9093f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C3632b.this.f9098k.post(new Runnable() {
                        public void run() {
                            C3632b.this.m11676a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f9244T = 0;
        this.f9245U = 0;
        this.f9253s = new Runnable() {
            public void run() {
                if (C3632b.this.f9091d != null) {
                    C3632b.this.f9091d.mo16018a(C3632b.this.f9092e, (WeakReference<Context>) C3632b.this.f9095h, false);
                    C3632b.this.f9091d.mo16020b();
                    C3632b.this.mo16036c(true);
                    C2905l.m8118e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f9246V = 0;
        this.f9247W = 0;
        this.f9249Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C3632b.this.mo16030b();
                }
            }
        };
        this.f9250Z = new C2917v.C2920b() {
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
                C3632b.this.m11694c(context, i);
            }
        };
        this.f9251aa = 1;
        this.f9252ab = false;
        this.f9251aa = C2909o.m8136c(context);
        mo16027a(z);
        this.f9225A = str;
        try {
            this.f9235K = viewGroup.getWidth();
            this.f9236L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f9254t = new WeakReference<>(viewGroup);
        this.f9095h = new WeakReference(context);
        this.f9092e = nVar;
        m11678a(context);
        this.f9258x = Build.VERSION.SDK_INT >= 17 ? true : z4;
        this.f9226B = z2;
        this.f9227C = z3;
        if (jVar != null) {
            this.f9242R = jVar;
        }
    }

    public C3632b(Context context, ViewGroup viewGroup, C3431n nVar, String str, boolean z, boolean z2, C3100j jVar) {
        boolean z3 = false;
        this.f9259y = false;
        this.f9260z = false;
        this.f9225A = "embeded_ad";
        this.f9226B = false;
        this.f9227C = true;
        this.f9229E = false;
        this.f9230F = false;
        this.f9231G = true;
        this.f9232H = true;
        this.f9235K = 0;
        this.f9236L = 0;
        this.f9237M = 0;
        this.f9238N = false;
        this.f9239O = true;
        this.f9243S = new C2394a.C2395a() {
            /* renamed from: b */
            public void mo15922b(C2394a aVar, int i) {
            }

            /* renamed from: c */
            public void mo15923c(C2394a aVar) {
            }

            /* renamed from: d */
            public void mo15924d(C2394a aVar) {
            }

            /* renamed from: e */
            public void mo15925e(C2394a aVar) {
            }

            /* renamed from: a */
            public void mo15913a(C2394a aVar) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.m11720x();
                    }
                });
                C3632b.this.mo20240a(4);
            }

            /* renamed from: a */
            public void mo15917a(C2394a aVar, long j) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                            C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                            boolean unused = C3632b.this.f9238N = false;
                        }
                        if (!(!C3632b.this.f9100m || C3632b.this.f9234J == null || C3632b.this.f9234J.get() == null)) {
                            ((C3649a) C3632b.this.f9234J.get()).mo20209f();
                        }
                        C3632b.this.m11659L();
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                    }
                });
                C3632b.this.m11724z();
                long unused = C3632b.this.f9241Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo15921b(C2394a aVar) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (!(C3632b.this.f9233I == null || C3632b.this.f9233I.get() == null)) {
                            ((C2405c.C2409d) C3632b.this.f9233I.get()).mo16066e_();
                        }
                        if (!C3632b.this.f9258x) {
                            C3632b.this.m11724z();
                        }
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                        }
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                    }
                });
            }

            /* renamed from: a */
            public void mo15919a(C2394a aVar, final C2399a aVar2) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo15926a();
                        int b = aVar2.mo15927b();
                        C3632b.this.m11690b(a, b);
                        C2905l.m8118e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C3632b.this.mo20253u() || b == -1004) {
                            C2905l.m8118e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C3632b.this.m11699d(a, b)) {
                                C2905l.m8118e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C3632b.this.f9091d.mo16018a(C3632b.this.f9092e, (WeakReference<Context>) C3632b.this.f9095h, false);
                                C3632b.this.mo16036c(true);
                                C3632b.this.mo16041f();
                            }
                            if (C3632b.this.f9091d != null) {
                                C3632b.this.f9091d.mo16020b();
                            }
                            if (C3632b.this.f9257w != null) {
                                C3632b.this.f9257w.mo16058b(C3632b.this.f9256v, C2389a.m5610a(C3632b.this.f9093f, C3632b.this.f9104q));
                            }
                            if (C3632b.this.f9233I != null && C3632b.this.f9233I.get() != null && !C3632b.this.mo20253u()) {
                                ((C2405c.C2409d) C3632b.this.f9233I.get()).mo16065a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15920a(C2394a aVar, boolean z) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo16020b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15915a(C2394a aVar, int i, int i2) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.m11651H();
                    }
                });
            }

            /* renamed from: a */
            public void mo15916a(C2394a aVar, int i, int i2, int i3) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        if (C3632b.this.f9091d != null) {
                            C3632b.this.f9091d.mo20321u();
                            C3632b.this.f9098k.postDelayed(C3632b.this.f9253s, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                            boolean unused = C3632b.this.f9238N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo15914a(C2394a aVar, int i) {
                C3632b.this.f9098k.post(new Runnable() {
                    public void run() {
                        C3632b.this.f9091d.mo16020b();
                        C3632b.this.f9098k.removeCallbacks(C3632b.this.f9253s);
                        boolean unused = C3632b.this.f9238N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo15918a(C2394a aVar, long j, long j2) {
                if (Math.abs(j - C3632b.this.f9093f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C3632b.this.f9098k.post(new Runnable() {
                        public void run() {
                            C3632b.this.m11676a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f9244T = 0;
        this.f9245U = 0;
        this.f9253s = new Runnable() {
            public void run() {
                if (C3632b.this.f9091d != null) {
                    C3632b.this.f9091d.mo16018a(C3632b.this.f9092e, (WeakReference<Context>) C3632b.this.f9095h, false);
                    C3632b.this.f9091d.mo16020b();
                    C3632b.this.mo16036c(true);
                    C2905l.m8118e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f9246V = 0;
        this.f9247W = 0;
        this.f9249Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C3632b.this.mo16030b();
                }
            }
        };
        this.f9250Z = new C2917v.C2920b() {
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
                C3632b.this.m11694c(context, i);
            }
        };
        this.f9251aa = 1;
        this.f9252ab = false;
        this.f9251aa = C2909o.m8136c(context);
        try {
            this.f9235K = viewGroup.getWidth();
            this.f9236L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f9254t = new WeakReference<>(viewGroup);
        this.f9225A = str;
        this.f9095h = new WeakReference(context);
        this.f9092e = nVar;
        m11678a(context);
        this.f9258x = Build.VERSION.SDK_INT >= 17 ? true : z3;
        this.f9226B = z;
        this.f9227C = z2;
        if (jVar != null) {
            this.f9242R = jVar;
        }
    }

    /* renamed from: F */
    public C3658d mo16050o() {
        return this.f9091d;
    }

    /* renamed from: a */
    public void mo16025a(C2405c.C2409d dVar) {
        this.f9233I = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public boolean mo16029a(C2401c cVar) {
        mo16036c(false);
        C2905l.m8111b("tag_video_play", "[video] start NativeVideoController#playVideoUrl and video url is :\r\n" + cVar.mo15991j());
        if (TextUtils.isEmpty(cVar.mo15991j())) {
            C2905l.m8118e("tag_video_play", "[video] play video stop , because no video info");
            return false;
        }
        this.f9240P = cVar;
        m11661M();
        this.f9101n = cVar.mo15986f();
        if (!C3559o.m11210b(this.f9225A) || this.f9093f <= 0) {
            this.f9093f = cVar.mo15982e();
        }
        if (cVar.mo15982e() <= 0) {
            this.f9260z = false;
            this.f9259y = false;
        }
        if (cVar.mo15982e() > 0) {
            this.f9093f = cVar.mo15982e();
            this.f9094g = this.f9094g > this.f9093f ? this.f9094g : this.f9093f;
        }
        if (this.f9091d != null) {
            this.f9091d.mo16016a();
            if (this.f9244T == 0) {
                this.f9091d.mo20286g();
            }
            this.f9091d.mo20312c(cVar.mo15976c(), cVar.mo15979d());
            this.f9091d.mo20313c((ViewGroup) this.f9254t.get());
            this.f9091d.mo20304a(cVar.mo15976c(), cVar.mo15979d());
        }
        if (!(this.f9090c != null || cVar.mo15993l() == -2 || cVar.mo15993l() == 1)) {
            this.f9090c = new C2374d();
        }
        if (this.f9090c != null) {
            this.f9090c.mo15870a(this.f9243S);
        }
        mo20155A();
        C2905l.m8111b("tag_video_play", "[video] new MediaPlayer");
        this.f9256v = 0;
        try {
            m11695c(cVar);
            return true;
        } catch (Exception e) {
            C2905l.m8118e("tag_video_play", "[video] invoke NativeVideoController#playVideo cause exception :" + e.toString());
            return false;
        }
    }

    /* renamed from: l */
    public int mo16047l() {
        return C2389a.m5610a(this.f9094g, this.f9104q);
    }

    /* renamed from: c */
    private void m11695c(C2401c cVar) {
        C2905l.m8111b("tag_video_play", "[video] NativeVideoController#playVideo has invoke !");
        if (cVar == null) {
            C2905l.m8111b("tag_video_play", "VideoUrlModel is null  !!!");
            return;
        }
        if (this.f9090c != null) {
            if (this.f9092e != null) {
                cVar.mo15981d(String.valueOf(C3898x.m12794f(this.f9092e)));
            }
            cVar.mo15977c(0);
            this.f9090c.mo15871a(cVar);
            C2905l.m8111b("tag_video_play", "[video] MediaPlayerProxy has setDataSource !");
        }
        this.f9255u = System.currentTimeMillis();
        if (!TextUtils.isEmpty(cVar.mo15991j())) {
            this.f9091d.mo20314d(8);
            this.f9091d.mo20314d(0);
            mo20162a((Runnable) new Runnable() {
                public void run() {
                    long unused = C3632b.this.f9255u = System.currentTimeMillis();
                    C3632b.this.f9091d.mo20281c(0);
                    if (C3632b.this.f9090c != null && C3632b.this.f9093f == 0) {
                        C3632b.this.f9090c.mo15873a(true, 0, C3632b.this.f9101n);
                    } else if (C3632b.this.f9090c != null) {
                        C3632b.this.f9090c.mo15873a(true, C3632b.this.f9093f, C3632b.this.f9101n);
                    }
                }
            });
        }
        if (this.f9100m) {
            mo20254v();
        }
    }

    /* renamed from: a */
    public void mo16024a(C2405c.C2407b bVar) {
        this.f9228D = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public long mo16043h() {
        if (mo16049n() == null) {
            return 0;
        }
        return mo16049n().mo15888o();
    }

    /* renamed from: i */
    public int mo16044i() {
        if (mo16049n() == null) {
            return 0;
        }
        return mo16049n().mo15889p();
    }

    /* renamed from: j */
    public long mo16045j() {
        if (mo16049n() == null) {
            return 0;
        }
        return mo16049n().mo15890q();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m11720x() {
        this.f9244T++;
        if (mo20157C() && this.f9091d != null) {
            this.f9091d.mo16020b();
            C2405c.C2406a aVar = this.f9257w;
            if (aVar != null) {
                aVar.mo16056a(this.f9256v, C2389a.m5610a(this.f9093f, this.f9104q));
            }
            this.f9256v = System.currentTimeMillis() - this.f9255u;
            if ((!C3898x.m12774b(this.f9092e) || this.f9244T >= 2) && this.f9232H) {
                this.f9091d.mo16018a(this.f9092e, (WeakReference<Context>) this.f9095h, true);
            }
            if (!this.f9260z) {
                this.f9260z = true;
                m11676a(this.f9104q, this.f9104q);
                long j = this.f9104q;
                this.f9093f = j;
                this.f9094g = j;
                C3084o.C3085a aVar2 = new C3084o.C3085a();
                aVar2.mo18632a(mo16042g());
                aVar2.mo18639c(mo16045j());
                aVar2.mo18636b(mo16043h());
                aVar2.mo18645f(mo16044i());
                C3067a.m8777b(this.f9091d, aVar2, this.f9242R);
            }
            if (!this.f9100m && this.f9103p) {
                mo16014e(this.f9091d, (View) null);
            }
            this.f9099l = true;
            if (C3898x.m12774b(this.f9092e) && this.f9244T < 2) {
                mo16000a();
            }
        }
    }

    /* renamed from: a */
    public void mo16023a(C2405c.C2406a aVar) {
        this.f9257w = aVar;
    }

    /* renamed from: b */
    public void mo16030b() {
        if (this.f9090c != null) {
            this.f9090c.mo15874b();
        }
        if (!this.f9260z && this.f9259y) {
            if (C3948b.m12959c()) {
                if (C3961a.m13032a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", true)) {
                    C3084o.C3085a aVar = new C3084o.C3085a();
                    aVar.mo18632a(mo16042g());
                    aVar.mo18639c(mo16045j());
                    aVar.mo18636b(mo16043h());
                    C3067a.m8766a((C2398a) this.f9091d, aVar);
                }
                C3961a.m13025a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", (Boolean) true);
                return;
            }
            if (C3580t.m11322a().mo20134b()) {
                C3084o.C3085a aVar2 = new C3084o.C3085a();
                aVar2.mo18632a(mo16042g());
                aVar2.mo18639c(mo16045j());
                aVar2.mo18636b(mo16043h());
                C3067a.m8766a((C2398a) this.f9091d, aVar2);
            }
            C3580t.m11322a().mo20132a(true);
        }
    }

    /* renamed from: d */
    public void mo16037d() {
        if (this.f9091d != null) {
            this.f9091d.mo16016a();
        }
        if (this.f9091d != null) {
            this.f9091d.mo20322v();
        }
        m11722y();
    }

    /* renamed from: h */
    public void mo20251h(boolean z) {
        if (this.f9091d != null) {
            this.f9091d.mo16016a();
        }
        if (this.f9091d != null && z) {
            this.f9091d.mo20322v();
        }
        m11722y();
    }

    /* renamed from: y */
    private void m11722y() {
        C2905l.m8107a("CSJ_VIDEO_NativeController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f9097j));
        if (this.f9090c != null) {
            if (this.f9090c.mo15886m()) {
                if (this.f9097j) {
                    mo20159E();
                } else {
                    mo20163b(this.f9105r);
                }
                C2905l.m8107a("CSJ_VIDEO_NativeController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f9097j));
            } else {
                this.f9090c.mo15873a(false, this.f9093f, this.f9101n);
            }
        }
        if (this.f9259y) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18632a(mo16042g());
            aVar.mo18639c(mo16045j());
            aVar.mo18636b(mo16043h());
            C3067a.m8776b(mo16050o(), aVar);
        }
    }

    /* renamed from: d */
    public void mo20249d(long j) {
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
        mo16028a(true, 3);
    }

    /* renamed from: a */
    public void mo16028a(boolean z, int i) {
        if (this.f9100m) {
            this.f9245U = mo16045j();
            mo20240a(1);
        }
        if (!this.f9260z && this.f9259y) {
            if (z) {
                C3084o.C3085a aVar = new C3084o.C3085a();
                aVar.mo18632a(mo16042g());
                aVar.mo18639c(mo16045j());
                aVar.mo18636b(mo16043h());
                aVar.mo18643e(i);
                aVar.mo18645f(mo16044i());
                C3067a.m8767a((C2398a) this.f9091d, aVar, this.f9242R);
                this.f9260z = false;
            } else {
                C3084o.C3085a aVar2 = new C3084o.C3085a();
                aVar2.mo18632a(mo16042g());
                aVar2.mo18639c(mo16045j());
                aVar2.mo18636b(mo16043h());
                C3067a.m8766a((C2398a) this.f9091d, aVar2);
            }
        }
        mo16041f();
    }

    /* renamed from: f */
    public void mo16041f() {
        if (this.f9090c != null) {
            this.f9090c.mo15877d();
            this.f9090c = null;
        }
        if (!C3898x.m12774b(this.f9092e) || this.f9244T == 2) {
            if (this.f9232H) {
                this.f9091d.mo16018a(this.f9092e, (WeakReference<Context>) this.f9095h, true);
            } else {
                return;
            }
        }
        if (this.f9098k != null) {
            this.f9098k.removeCallbacksAndMessages((Object) null);
        }
        if (this.f9096i != null) {
            this.f9096i.clear();
        }
        if (this.f9100m) {
            mo20255w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m11724z() {
        if (!this.f9259y) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18633a(this.f9231G);
            aVar.mo18639c(mo16045j());
            C3067a.m8765a(C3513m.m10963a(), (C2398a) this.f9091d, aVar, this.f9242R);
            this.f9259y = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11690b(int i, int i2) {
        if (this.f9092e != null) {
            C3084o.C3085a aVar = new C3084o.C3085a();
            aVar.mo18636b(mo16043h());
            aVar.mo18639c(mo16045j());
            aVar.mo18632a(mo16042g());
            aVar.mo18631a(i);
            aVar.mo18635b(i2);
            C3067a.m8780c(mo16050o(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m11651H() {
        int i;
        int i2;
        C2905l.m8111b("ChangeVideoSize", "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (!(this.f9095h == null || this.f9095h.get() == null || m11652I() == null || this.f9090c == null || this.f9254t == null)) {
                if (this.f9254t.get() != null) {
                    int j = this.f9090c.mo15883j();
                    int k = this.f9090c.mo15884k();
                    int width = ((ViewGroup) this.f9254t.get()).getWidth();
                    int height = ((ViewGroup) this.f9254t.get()).getHeight();
                    if (width > 0 && height > 0 && k > 0) {
                        if (j > 0) {
                            if (j == k) {
                                i2 = width > height ? height : width;
                                i = i2;
                            } else if (j > k) {
                                i2 = (int) ((((double) width) * 1.0d) / ((double) ((((float) j) * 1.0f) / ((float) k))));
                                i = width;
                            } else {
                                i = (int) ((((double) height) * 1.0d) / ((double) ((((float) k) * 1.0f) / ((float) j))));
                                i2 = height;
                            }
                            if (i2 <= height) {
                                if (i2 > 0) {
                                    height = i2;
                                }
                            }
                            if (i <= width) {
                                if (i > 0) {
                                    width = i;
                                }
                            }
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(13);
                            if (m11652I() instanceof TextureView) {
                                ((TextureView) m11652I()).setLayoutParams(layoutParams);
                                C2905l.m8111b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                return;
                            } else if (m11652I() instanceof SurfaceView) {
                                ((SurfaceView) m11652I()).setLayoutParams(layoutParams);
                                C2905l.m8111b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    C2905l.m8111b("ChangeVideoSize", " container or video exist size <= 0");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[step-1] >>>>> mContextRef=");
            sb.append(this.f9095h);
            sb.append(",mContextRef.get()=");
            sb.append(this.f9095h != null ? (Context) this.f9095h.get() : null);
            sb.append(",getIRenderView() =");
            sb.append(m11652I());
            C2905l.m8111b("ChangeVideoSize", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z = true;
            sb2.append(this.f9090c == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f9090c == null) {
                z = false;
            }
            sb2.append(z);
            C2905l.m8111b("ChangeVideoSize", sb2.toString());
        } catch (Throwable th) {
            C2905l.m8111b("ChangeVideoSize", "[step-11] >>>>> changeVideoSize error !!!!! ：" + th.toString());
        }
    }

    /* renamed from: I */
    private C2419b m11652I() {
        if (this.f9095h == null || this.f9095h.get() == null || ((Context) this.f9095h.get()).getResources().getConfiguration().orientation != 1 || this.f9091d == null) {
            return null;
        }
        return this.f9091d.mo20317q();
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
                    this.f9091d.mo20313c((ViewGroup) this.f9254t.get());
                }
                mo20249d(this.f9093f);
                if (this.f9091d != null) {
                    this.f9091d.mo20311b(false, false);
                }
            } else {
                mo20251h(false);
                if (this.f9091d != null) {
                    this.f9091d.mo20311b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16001a(C2403b bVar, int i) {
        if (this.f9090c != null) {
            m11677a(this.f9248X, m11696c(i));
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
                this.f9248X = (long) ((int) n);
            } else {
                this.f9248X = 0;
            }
            if (this.f9091d != null) {
                this.f9091d.mo20269a(this.f9248X);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11676a(long j, long j2) {
        this.f9093f = j;
        this.f9104q = j2;
        this.f9091d.mo20270a(j, j2);
        this.f9091d.mo20268a(C2389a.m5610a(j, j2));
        try {
            if (this.f9257w != null) {
                this.f9257w.mo16057a(j, j2);
            }
        } catch (Throwable th) {
            C2905l.m8115c("CSJ_VIDEO_NativeController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo16011b(C2403b bVar, View view) {
        mo20248b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo20248b(C2403b bVar, View view, boolean z, boolean z2) {
        if (mo20157C()) {
            mo20164f(!this.f9103p);
            if (!(this.f9095h.get() instanceof Activity)) {
                C2905l.m8111b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9103p) {
                mo20247b(z ? 8 : 0);
                if (this.f9091d != null) {
                    this.f9091d.mo20273a((ViewGroup) this.f9254t.get());
                    this.f9091d.mo20282c(false);
                }
            } else {
                mo20247b(1);
                if (this.f9091d != null) {
                    this.f9091d.mo20278b((ViewGroup) this.f9254t.get());
                    this.f9091d.mo20282c(false);
                }
            }
            WeakReference<C2405c.C2407b> weakReference = this.f9228D;
            C2405c.C2407b bVar2 = weakReference != null ? (C2405c.C2407b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo16059a(this.f9103p);
            }
        }
    }

    /* renamed from: b */
    public void mo20247b(int i) {
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
        mo16039e();
    }

    /* renamed from: a */
    public void mo16007a(C2403b bVar, View view, boolean z, boolean z2) {
        if (this.f9100m) {
            mo16030b();
        }
        if (z && !this.f9100m && !mo20252t()) {
            this.f9091d.mo20311b(!mo20253u(), false);
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
                this.f9091d.mo20278b((ViewGroup) this.f9254t.get());
            }
            mo20247b(1);
            return;
        }
        mo16039e();
    }

    /* renamed from: e */
    public void mo16014e(C2403b bVar, View view) {
        mo20243a(bVar, view, false);
    }

    /* renamed from: a */
    public void mo20243a(C2403b bVar, View view, boolean z) {
        m11655J();
    }

    /* renamed from: J */
    private void m11655J() {
        if (mo20157C()) {
            mo20164f(!this.f9103p);
            if (!(this.f9095h.get() instanceof Activity)) {
                C2905l.m8111b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9091d != null) {
                this.f9091d.mo20278b((ViewGroup) this.f9254t.get());
                this.f9091d.mo20282c(false);
            }
            mo20247b(1);
            WeakReference<C2405c.C2407b> weakReference = this.f9228D;
            C2405c.C2407b bVar = weakReference != null ? (C2405c.C2407b) weakReference.get() : null;
            if (bVar != null) {
                bVar.mo16059a(this.f9103p);
            }
        }
    }

    /* renamed from: t */
    public boolean mo20252t() {
        return this.f9090c == null || this.f9090c.mo15881h();
    }

    /* renamed from: a */
    public void mo16000a() {
        if (C2909o.m8136c(C3513m.m10963a()) != 0) {
            mo16041f();
            C2401c cVar = this.f9240P;
            if (cVar != null) {
                cVar.mo15975b(this.f9092e.mo19532Y());
                this.f9240P.mo15967a(this.f9235K);
                this.f9240P.mo15974b(this.f9236L);
                this.f9240P.mo15971a((List<String>) null);
                this.f9240P.mo15978c(this.f9092e.mo19569ac());
                this.f9240P.mo15968a(0);
                this.f9240P.mo15972a(mo16051p());
                C2401c cVar2 = this.f9240P;
                cVar2.mo15969a(cVar2.mo15966a());
                mo16029a(this.f9240P);
                mo16036c(false);
            }
        }
    }

    /* renamed from: u */
    public boolean mo20253u() {
        return this.f9090c != null && this.f9090c.mo15885l();
    }

    /* renamed from: a */
    private void m11677a(long j, boolean z) {
        if (this.f9090c != null) {
            if (z) {
                m11657K();
            }
            this.f9090c.mo15866a(j);
        }
    }

    /* renamed from: c */
    private boolean m11696c(int i) {
        return this.f9091d.mo20280b(i);
    }

    /* renamed from: K */
    private void m11657K() {
        if (this.f9091d != null) {
            this.f9091d.mo20281c(0);
            this.f9091d.mo20276a(false, false);
            this.f9091d.mo20282c(false);
            this.f9091d.mo20284e();
            this.f9091d.mo20286g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$7 */
    /* compiled from: NativeVideoController */
    static /* synthetic */ class C36487 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9280a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9280a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9280a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3699e.C3701a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.C3632b.C36487.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo20188a(C3699e.C3701a aVar, String str) {
        int i = C36487.f9280a[aVar.ordinal()];
        if (i == 1) {
            mo16030b();
        } else if (i == 2) {
            mo16039e();
        } else if (i == 3) {
            mo16037d();
            this.f9102o = false;
            this.f9229E = true;
        }
    }

    /* renamed from: c */
    private boolean m11697c(int i, int i2) {
        if (i2 == 0) {
            mo16030b();
            this.f9102o = true;
            if (this.f9091d != null) {
                this.f9091d.mo16018a(this.f9092e, (WeakReference<Context>) this.f9095h, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.f9091d != null) {
                this.f9091d.mo16016a();
            }
            mo16030b();
            this.f9102o = true;
            this.f9229E = false;
            if (!(this.f9091d == null || this.f9092e == null)) {
                return this.f9091d.mo20309a(i, this.f9092e.mo19517J(), this.f9227C);
            }
        } else if (i2 == 4) {
            this.f9102o = false;
            if (this.f9091d != null) {
                this.f9091d.mo20319s();
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m11691b(Context context, int i) {
        if (mo20157C() && context != null && this.f9251aa != i) {
            this.f9251aa = i;
            if (!(i == 4 || i == 0)) {
                this.f9229E = false;
            }
            if (!this.f9229E && !mo16052q() && this.f9226B) {
                m11697c(2, i);
            }
            WeakReference<C3649a> weakReference = this.f9234J;
            if (weakReference != null && weakReference.get() != null) {
                ((C3649a) this.f9234J.get()).mo20206a(this.f9251aa);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11694c(Context context, int i) {
        m11691b(context, i);
        if (i == 4) {
            this.f9102o = false;
        }
    }

    /* renamed from: a */
    public void mo20242a(Context context, int i) {
        m11691b(context, i);
        if (i == 4) {
            this.f9102o = false;
            mo16037d();
        }
    }

    /* renamed from: v */
    public void mo20254v() {
        if (!this.f9252ab && this.f9239O) {
            Context applicationContext = C3513m.m10963a().getApplicationContext();
            this.f9252ab = true;
            C2917v.m8179a(this.f9250Z, applicationContext);
        }
    }

    /* renamed from: w */
    public void mo20255w() {
        if (this.f9252ab && this.f9239O) {
            C3513m.m10963a().getApplicationContext();
            this.f9252ab = false;
            C2917v.m8178a(this.f9250Z);
        }
    }

    /* renamed from: a */
    public void mo20246a(C3649a aVar) {
        this.f9234J = new WeakReference<>(aVar);
    }

    /* renamed from: c */
    public void mo16036c(boolean z) {
        this.f9099l = z;
    }

    /* renamed from: d */
    public void mo16038d(boolean z) {
        this.f9231G = z;
    }

    /* renamed from: r */
    public boolean mo16053r() {
        return this.f9238N;
    }

    /* renamed from: e */
    public void mo16040e(boolean z) {
        this.f9239O = z;
    }

    /* renamed from: b */
    public void mo16032b(C2401c cVar) {
        this.f9240P = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m11699d(int i, int i2) {
        C2905l.m8111b("TTVideoLandingPage", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: k */
    public long mo16046k() {
        return mo16042g() + mo16043h();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m11659L() {
        if (this.f9092e != null) {
            C3513m.m10972g().mo20695a(C3847e.m12562a(this.f9092e.mo19527T(), true, this.f9092e));
        }
    }

    /* renamed from: M */
    private void m11661M() {
        if (this.f9095h != null) {
            C3067a.m8773a(this.f9092e, (C2398a) this.f9091d, this.f9240P);
        }
    }
}
