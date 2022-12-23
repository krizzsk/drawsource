package com.bykv.p054vk.openvk.component.video.p055a.p067d;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2399a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2416d;
import com.bykv.p054vk.openvk.component.video.p055a.p067d.C2366c;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.d */
/* compiled from: SSMediaPlayerWrapper */
public class C2374d implements C2366c.C2367a, C2366c.C2368b, C2366c.C2369c, C2366c.C2370d, C2366c.C2371e, C2366c.C2372f, C2366c.C2373g, C2394a, C2416d.C2417a {

    /* renamed from: v */
    private static boolean f4802v = false;

    /* renamed from: x */
    private static final SparseIntArray f4803x = new SparseIntArray();

    /* renamed from: A */
    private C2401c f4804A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f4805B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public volatile int f4806C;

    /* renamed from: D */
    private Surface f4807D;

    /* renamed from: E */
    private Runnable f4808E;

    /* renamed from: F */
    private C2388a f4809F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f4810G;

    /* renamed from: H */
    private final Object f4811H;

    /* renamed from: I */
    private StringBuilder f4812I;

    /* renamed from: J */
    private long f4813J;

    /* renamed from: K */
    private long f4814K;

    /* renamed from: L */
    private boolean f4815L;

    /* renamed from: a */
    private SurfaceTexture f4816a;

    /* renamed from: b */
    private SurfaceHolder f4817b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f4818c;

    /* renamed from: d */
    private boolean f4819d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2366c f4820e;

    /* renamed from: f */
    private boolean f4821f;

    /* renamed from: g */
    private boolean f4822g;

    /* renamed from: h */
    private boolean f4823h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f4824i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f4825j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f4826k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Handler f4827l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4828m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f4829n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f4830o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f4831p;

    /* renamed from: q */
    private long f4832q;

    /* renamed from: r */
    private long f4833r;

    /* renamed from: s */
    private boolean f4834s;

    /* renamed from: t */
    private ArrayList<Runnable> f4835t;

    /* renamed from: u */
    private int f4836u;

    /* renamed from: w */
    private String f4837w;

    /* renamed from: y */
    private boolean f4838y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final List<WeakReference<C2394a.C2395a>> f4839z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5541a(long j, long j2) {
        for (WeakReference next : this.f4839z) {
            if (!(next == null || next.get() == null)) {
                ((C2394a.C2395a) next.get()).mo15918a((C2394a) this, j, j2);
            }
        }
    }

    public C2374d() {
        boolean z = false;
        this.f4818c = 0;
        this.f4819d = false;
        this.f4820e = null;
        this.f4821f = false;
        this.f4822g = false;
        this.f4825j = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
        this.f4826k = -1;
        this.f4828m = false;
        this.f4829n = 0;
        this.f4830o = Long.MIN_VALUE;
        this.f4831p = 0;
        this.f4832q = 0;
        this.f4833r = 0;
        this.f4836u = 0;
        this.f4837w = "0";
        this.f4839z = Collections.synchronizedList(new ArrayList());
        this.f4804A = null;
        this.f4805B = false;
        this.f4806C = 200;
        this.f4807D = null;
        this.f4808E = new Runnable() {
            public void run() {
                long s = C2374d.this.mo15892s();
                if (s > 0 && Build.VERSION.SDK_INT >= 23 && C2374d.this.mo15885l() && C2374d.this.f4830o != Long.MIN_VALUE) {
                    if (C2374d.this.f4830o == s) {
                        if (!C2374d.this.f4828m && C2374d.this.f4831p >= 400) {
                            C2374d.this.m5549b(701, 800);
                            boolean unused = C2374d.this.f4828m = true;
                        }
                        C2374d dVar = C2374d.this;
                        long unused2 = dVar.f4831p = dVar.f4831p + ((long) C2374d.this.f4806C);
                    } else {
                        if (C2374d.this.f4828m) {
                            C2374d dVar2 = C2374d.this;
                            long unused3 = dVar2.f4829n = dVar2.f4829n + C2374d.this.f4831p;
                            C2374d.this.m5549b(702, 800);
                            C2415c.m5833b("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(C2374d.this.f4829n), "  bufferCount =", Integer.valueOf(C2374d.this.f4818c));
                        }
                        long unused4 = C2374d.this.f4831p = 0;
                        boolean unused5 = C2374d.this.f4828m = false;
                    }
                }
                if (C2374d.this.mo15890q() > 0) {
                    if (C2374d.this.f4830o != s) {
                        if (C2397b.m5673f()) {
                            C2415c.m5833b("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(C2374d.this.f4830o), "  curPosition = ", Long.valueOf(s));
                        }
                        C2374d dVar3 = C2374d.this;
                        dVar3.m5541a(s, dVar3.mo15890q());
                    }
                    long unused6 = C2374d.this.f4830o = s;
                }
                if (!C2374d.this.mo15881h()) {
                    C2374d.this.f4827l.postDelayed(this, (long) C2374d.this.f4806C);
                    return;
                }
                C2374d dVar4 = C2374d.this;
                dVar4.m5541a(dVar4.mo15890q(), C2374d.this.mo15890q());
            }
        };
        this.f4809F = new C2388a();
        this.f4811H = new Object();
        this.f4812I = null;
        this.f4813J = 0;
        this.f4814K = 0;
        this.f4815L = false;
        this.f4836u = 0;
        HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_SSMediaPlayerWrapper", -1);
        handlerThread.start();
        this.f4827l = new C2416d(handlerThread.getLooper(), this);
        this.f4815L = Build.VERSION.SDK_INT >= 17 ? true : z;
        this.f4827l.post(new Runnable() {
            public void run() {
                C2374d.this.m5568u();
            }
        });
    }

    /* renamed from: t */
    private void m5567t() {
        this.f4829n = 0;
        this.f4818c = 0;
        this.f4831p = 0;
        this.f4828m = false;
        this.f4830o = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo15875b(final boolean z) {
        this.f4838y = z;
        C2366c cVar = this.f4820e;
        if (cVar != null) {
            cVar.mo15825a(z);
        } else {
            this.f4827l.post(new Runnable() {
                public void run() {
                    if (C2374d.this.f4820e != null) {
                        C2374d.this.f4820e.mo15825a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m5568u() {
        if (this.f4820e == null) {
            C2364b bVar = new C2364b();
            this.f4820e = bVar;
            this.f4837w = "0";
            bVar.mo15822a((C2366c.C2371e) this);
            this.f4820e.mo15819a((C2366c.C2368b) this);
            this.f4820e.mo15820a((C2366c.C2369c) this);
            this.f4820e.mo15818a((C2366c.C2367a) this);
            this.f4820e.mo15823a((C2366c.C2372f) this);
            this.f4820e.mo15821a((C2366c.C2370d) this);
            this.f4820e.mo15824a((C2366c.C2373g) this);
            try {
                this.f4820e.mo15838c(this.f4821f);
            } catch (Throwable th) {
                C2415c.m5829a("CSJ_VIDEO_MEDIA", "setLooping error: ", th);
            }
            this.f4822g = false;
        }
    }

    /* renamed from: a */
    public void mo15873a(boolean z, long j, boolean z2) {
        C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start firstSeekToPosition=" + j + ",firstPlay :" + z + ",isPauseOtherMusicVolume=" + z2);
        if (this.f4820e != null) {
            this.f4805B = z2;
            this.f4810G = false;
            mo15872a(z2);
            if (z) {
                C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
                this.f4826k = j;
                m5569v();
            } else {
                this.f4809F.mo15906a(j);
                if (this.f4838y) {
                    m5550b((Runnable) this.f4809F);
                } else {
                    m5544a((Runnable) this.f4809F);
                }
            }
            this.f4827l.postDelayed(this.f4808E, (long) this.f4806C);
        }
    }

    /* renamed from: a */
    public void mo15865a() {
        Handler handler = this.f4827l;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    if (C2374d.this.mo15886m() && C2374d.this.f4820e != null) {
                        try {
                            C2374d.this.f4820e.mo15840e();
                            C2415c.m5831b("CSJ_VIDEO_MEDIA", "resume play exec start ");
                            for (WeakReference weakReference : C2374d.this.f4839z) {
                                if (!(weakReference == null || weakReference.get() == null)) {
                                    ((C2394a.C2395a) weakReference.get()).mo15925e(C2374d.this);
                                }
                            }
                            int unused = C2374d.this.f4825j = 206;
                        } catch (Throwable th) {
                            C2415c.m5833b("CSJ_VIDEO_MEDIA", "play: catch exception ", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.d$a */
    /* compiled from: SSMediaPlayerWrapper */
    class C2388a implements Runnable {

        /* renamed from: b */
        private long f4860b;

        C2388a() {
        }

        /* renamed from: a */
        public void mo15906a(long j) {
            this.f4860b = j;
        }

        public void run() {
            if (C2374d.this.f4820e != null) {
                try {
                    long unused = C2374d.this.f4826k = Math.max(this.f4860b, C2374d.this.f4820e.mo15845i());
                } catch (Throwable th) {
                    C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :" + th.toString());
                }
            }
            C2374d.this.f4827l.sendEmptyMessageDelayed(100, 0);
            C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    /* renamed from: b */
    public void mo15874b() {
        C2415c.m5831b("CSJ_VIDEO_MEDIA", "pause: ");
        this.f4827l.removeMessages(100);
        this.f4810G = true;
        this.f4827l.sendEmptyMessage(101);
    }

    /* renamed from: d */
    public void mo15877d() {
        this.f4825j = ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR;
        m5537B();
        if (this.f4827l != null) {
            try {
                m5551b("release");
                this.f4827l.removeCallbacksAndMessages((Object) null);
                if (this.f4820e != null) {
                    this.f4824i = true;
                    this.f4827l.sendEmptyMessage(103);
                }
            } catch (Throwable th) {
                m5571x();
                throw th;
            }
            m5571x();
        }
    }

    /* renamed from: v */
    private void m5569v() {
        C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
        m5550b((Runnable) new Runnable() {
            public void run() {
                if (C2374d.this.f4827l != null) {
                    C2374d.this.f4827l.sendEmptyMessage(104);
                    C2415c.m5828a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                }
            }
        });
    }

    /* renamed from: c */
    public void mo15876c() {
        m5550b((Runnable) new Runnable() {
            public void run() {
                if (C2374d.this.f4827l != null) {
                    C2374d.this.f4827l.sendEmptyMessage(105);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo15866a(final long j) {
        if (this.f4825j == 207 || this.f4825j == 206 || this.f4825j == 209) {
            m5550b((Runnable) new Runnable() {
                public void run() {
                    if (C2374d.this.f4827l != null) {
                        C2374d.this.f4827l.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public boolean mo15878e() {
        return this.f4819d;
    }

    /* renamed from: a */
    public void mo15867a(final SurfaceTexture surfaceTexture) {
        this.f4816a = surfaceTexture;
        mo15875b(true);
        m5550b((Runnable) new Runnable() {
            public void run() {
                C2374d.this.m5568u();
                if (C2374d.this.f4827l != null) {
                    C2374d.this.f4827l.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo15869a(final SurfaceHolder surfaceHolder) {
        this.f4817b = surfaceHolder;
        mo15875b(true);
        m5550b((Runnable) new Runnable() {
            public void run() {
                C2374d.this.m5568u();
                if (C2374d.this.f4827l != null) {
                    C2374d.this.f4827l.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo15871a(final C2401c cVar) {
        this.f4804A = cVar;
        m5550b((Runnable) new Runnable() {
            public void run() {
                C2374d.this.m5568u();
                if (C2374d.this.f4827l != null) {
                    C2374d.this.f4827l.obtainMessage(107, cVar).sendToTarget();
                }
            }
        });
    }

    /* renamed from: l */
    public boolean mo15885l() {
        return (this.f4825j == 206 || this.f4827l.hasMessages(100)) && !this.f4810G;
    }

    /* renamed from: i */
    public boolean mo15882i() {
        return mo15891r() || mo15885l() || mo15886m();
    }

    /* renamed from: m */
    public boolean mo15886m() {
        return (this.f4825j == 207 || this.f4810G) && !this.f4827l.hasMessages(100);
    }

    /* renamed from: n */
    public boolean mo15887n() {
        return this.f4825j == 203;
    }

    /* renamed from: r */
    public boolean mo15891r() {
        return this.f4825j == 205;
    }

    /* renamed from: h */
    public boolean mo15881h() {
        return this.f4825j == 209;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15868a(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.what
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[video]  execute , mCurrentState = "
            r3.append(r4)
            int r4 = r1.f4825j
            r3.append(r4)
            java.lang.String r4 = " handlerMsg="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CSJ_VIDEO_MEDIA"
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r3)
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x02e7
            int r3 = r0.what
            java.lang.String r7 = "[video] OP_RELEASE execute , releaseMediaplayer !"
            r8 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 205(0xcd, float:2.87E-43)
            r14 = 208(0xd0, float:2.91E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r9 = 206(0xce, float:2.89E-43)
            r10 = 207(0xcf, float:2.9E-43)
            switch(r3) {
                case 100: goto L_0x02a6;
                case 101: goto L_0x024c;
                case 102: goto L_0x0238;
                case 103: goto L_0x0201;
                case 104: goto L_0x01e1;
                case 105: goto L_0x01bc;
                case 106: goto L_0x0199;
                case 107: goto L_0x008d;
                case 108: goto L_0x0043;
                case 109: goto L_0x0043;
                case 110: goto L_0x006d;
                case 111: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x02e7
        L_0x0045:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0065 }
            r7 = 14
            if (r3 < r7) goto L_0x005b
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0065 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ all -> 0x0065 }
            android.view.Surface r3 = new android.view.Surface     // Catch:{ all -> 0x0065 }
            r3.<init>(r0)     // Catch:{ all -> 0x0065 }
            r1.f4807D = r3     // Catch:{ all -> 0x0065 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x0065 }
            r0.mo15832a((android.view.Surface) r3)     // Catch:{ all -> 0x0065 }
        L_0x005b:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x0065 }
            r0.mo15837b(r6)     // Catch:{ all -> 0x0065 }
            r16.m5536A()     // Catch:{ all -> 0x0065 }
            goto L_0x02e7
        L_0x0065:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_SURFACE error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x006d:
            java.lang.String r3 = "resumeVideo:  OP_SET_DISPLAY "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5831b((java.lang.String) r4, (java.lang.String) r3)
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0085 }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e     // Catch:{ all -> 0x0085 }
            r3.mo15833a((android.view.SurfaceHolder) r0)     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x0085 }
            r0.mo15837b(r6)     // Catch:{ all -> 0x0085 }
            r16.m5536A()     // Catch:{ all -> 0x0085 }
            goto L_0x02e7
        L_0x0085:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DISPLAY error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x008d:
            r16.m5567t()
            int r3 = r1.f4825j
            if (r3 == r11) goto L_0x0098
            int r3 = r1.f4825j
            if (r3 != r8) goto L_0x01ea
        L_0x0098:
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.c.c r0 = (com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r0     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.mo15966a()     // Catch:{ all -> 0x0191 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = com.bykv.p054vk.openvk.component.video.api.C2397b.m5669b()     // Catch:{ all -> 0x0191 }
            r0.mo15969a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
        L_0x00ad:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo15966a()     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r0.mo15992k()     // Catch:{ all -> 0x0191 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0191 }
            boolean r7 = r3.exists()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x00f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： try paly local:"
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = com.bykv.p054vk.openvk.component.video.api.C2397b.m5671d()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r1.m5545a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00e7:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.mo15836a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： paly net:"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo15991j()     // Catch:{ all -> 0x0191 }
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            int r3 = r0.f4892b     // Catch:{ all -> 0x0191 }
            r7 = 23
            if (r3 != r6) goto L_0x0136
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 >= r7) goto L_0x0136
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.mo15991j()     // Catch:{ all -> 0x0191 }
            r3.mo15836a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 直接设置 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo15991j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0136:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 < r7) goto L_0x0158
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e     // Catch:{ all -> 0x0191 }
            r3.mo15834a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r0)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 使用MediaDataSource接口 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.mo15991j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0158:
            com.bykv.vk.openvk.component.video.a.b.f.a r3 = com.bykv.p054vk.openvk.component.video.p055a.p059b.p065f.C2339a.m5385a()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.mo15785b(r0)     // Catch:{ all -> 0x0191 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 本地代理模式 local url = "
            r3[r5] = r7     // Catch:{ all -> 0x0191 }
            r3[r6] = r0     // Catch:{ all -> 0x0191 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5830a((java.lang.String) r4, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0188
            boolean r3 = com.bykv.p054vk.openvk.component.video.api.C2397b.m5671d()     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = "file"
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0191 }
            r1.m5545a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0188:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e     // Catch:{ all -> 0x0191 }
            r3.mo15836a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
        L_0x018d:
            r1.f4825j = r12     // Catch:{ all -> 0x0191 }
            goto L_0x02e7
        L_0x0191:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DATASOURCE error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x0199:
            int r3 = r1.f4825j
            if (r3 == r9) goto L_0x01a5
            int r3 = r1.f4825j
            if (r3 == r10) goto L_0x01a5
            int r3 = r1.f4825j
            if (r3 != r15) goto L_0x01ea
        L_0x01a5:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f4820e     // Catch:{ all -> 0x01b4 }
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x01b4 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01b4 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x01b4 }
            r3.mo15831a((long) r7)     // Catch:{ all -> 0x01b4 }
            goto L_0x02e7
        L_0x01b4:
            r0 = move-exception
            java.lang.String r3 = "OP_SEEKTO error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x01bc:
            int r0 = r1.f4825j
            if (r0 == r13) goto L_0x01d0
            int r0 = r1.f4825j
            if (r0 == r9) goto L_0x01d0
            int r0 = r1.f4825j
            if (r0 == r14) goto L_0x01d0
            int r0 = r1.f4825j
            if (r0 == r10) goto L_0x01d0
            int r0 = r1.f4825j
            if (r0 != r15) goto L_0x01ea
        L_0x01d0:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x01d9 }
            r0.mo15841f()     // Catch:{ all -> 0x01d9 }
            r1.f4825j = r14     // Catch:{ all -> 0x01d9 }
            goto L_0x02e7
        L_0x01d9:
            r0 = move-exception
            java.lang.String r3 = "OP_STOP error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x01e1:
            int r0 = r1.f4825j
            if (r0 == r12) goto L_0x01ed
            int r0 = r1.f4825j
            if (r0 != r14) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            r5 = r6
            goto L_0x02e7
        L_0x01ed:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x01f9 }
            r0.mo15844h()     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "[video] OP_PREPARE_ASYNC execute , mMediaPlayer real prepareAsync !"
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x02e7
        L_0x01f9:
            r0 = move-exception
            java.lang.String r3 = "OP_PREPARE_ASYNC error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5836c(r4, r3, r0)
            goto L_0x02e7
        L_0x0201:
            r16.m5570w()     // Catch:{ all -> 0x0208 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0208 }
            goto L_0x020e
        L_0x0208:
            r0 = move-exception
            java.lang.String r3 = "OP_RELEASE error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5836c(r4, r3, r0)
        L_0x020e:
            r1.f4824i = r5
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f4839z
            java.util.Iterator r0 = r0.iterator()
        L_0x0216:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0234
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x0216
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p054vk.openvk.component.video.api.C2394a.C2395a) r3
            r3.mo15923c(r1)
            goto L_0x0216
        L_0x0234:
            r1.f4825j = r8
            goto L_0x02e7
        L_0x0238:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x0244 }
            r0.mo15848l()     // Catch:{ all -> 0x0244 }
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0244 }
            r1.f4825j = r11     // Catch:{ all -> 0x0244 }
            goto L_0x02e7
        L_0x0244:
            r0 = move-exception
            java.lang.String r3 = "OP_RESET error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x024c:
            boolean r0 = r1.f4828m
            if (r0 == 0) goto L_0x0257
            long r7 = r1.f4829n
            long r11 = r1.f4831p
            long r7 = r7 + r11
            r1.f4829n = r7
        L_0x0257:
            r1.f4828m = r5
            r7 = 0
            r1.f4831p = r7
            r7 = -9223372036854775808
            r1.f4830o = r7
            int r0 = r1.f4825j
            if (r0 == r9) goto L_0x026d
            int r0 = r1.f4825j
            if (r0 == r10) goto L_0x026d
            int r0 = r1.f4825j
            if (r0 != r15) goto L_0x01ea
        L_0x026d:
            java.lang.String r0 = "[video] OP_PAUSE execute , mMediaPlayer  OP_PAUSE !"
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x029f }
            r0.mo15843g()     // Catch:{ all -> 0x029f }
            r1.f4825j = r10     // Catch:{ all -> 0x029f }
            r1.f4810G = r5     // Catch:{ all -> 0x029f }
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.f4839z     // Catch:{ all -> 0x029f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x029f }
        L_0x0281:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x02e7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x029f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x0281
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x0281
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p054vk.openvk.component.video.api.C2394a.C2395a) r3     // Catch:{ all -> 0x029f }
            r3.mo15924d(r1)     // Catch:{ all -> 0x029f }
            goto L_0x0281
        L_0x029f:
            r0 = move-exception
            java.lang.String r3 = "OP_PAUSE error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
            goto L_0x02e7
        L_0x02a6:
            int r0 = r1.f4825j
            if (r0 == r13) goto L_0x02b2
            int r0 = r1.f4825j
            if (r0 == r10) goto L_0x02b2
            int r0 = r1.f4825j
            if (r0 != r15) goto L_0x01ea
        L_0x02b2:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x02e1 }
            r0.mo15840e()     // Catch:{ all -> 0x02e1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02e1 }
            r1.f4833r = r7     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "[video] OP_START execute , mMediaPlayer real start !"
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5828a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x02e1 }
            r1.f4825j = r9     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f4826k     // Catch:{ all -> 0x02e1 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d7
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f4820e     // Catch:{ all -> 0x02e1 }
            long r7 = r1.f4826k     // Catch:{ all -> 0x02e1 }
            r0.mo15831a((long) r7)     // Catch:{ all -> 0x02e1 }
            r7 = -1
            r1.f4826k = r7     // Catch:{ all -> 0x02e1 }
        L_0x02d7:
            com.bykv.vk.openvk.component.video.api.c.c r0 = r1.f4804A     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x02e7
            boolean r0 = r1.f4805B     // Catch:{ all -> 0x02e1 }
            r1.mo15872a((boolean) r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02e7
        L_0x02e1:
            r0 = move-exception
            java.lang.String r3 = "OP_START error: "
            com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5829a(r4, r3, r0)
        L_0x02e7:
            if (r5 == 0) goto L_0x031e
            r0 = 200(0xc8, float:2.8E-43)
            r1.f4825j = r0
            boolean r0 = r1.f4822g
            if (r0 != 0) goto L_0x031e
            com.bykv.vk.openvk.component.video.api.c.a r0 = new com.bykv.vk.openvk.component.video.api.c.a
            r3 = 308(0x134, float:4.32E-43)
            r0.<init>(r3, r2)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r2 = r1.f4839z
            java.util.Iterator r2 = r2.iterator()
        L_0x02fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031c
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x02fe
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.p054vk.openvk.component.video.api.C2394a.C2395a) r3
            r3.mo15919a((com.bykv.p054vk.openvk.component.video.api.C2394a) r1, (com.bykv.p054vk.openvk.component.video.api.p071c.C2399a) r0)
            goto L_0x02fe
        L_0x031c:
            r1.f4822g = r6
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p067d.C2374d.mo15868a(android.os.Message):void");
    }

    /* renamed from: a */
    private void m5545a(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f4820e.mo15835a(fileInputStream.getFD());
        fileInputStream.close();
    }

    /* renamed from: w */
    private void m5570w() {
        C2415c.m5831b("CSJ_VIDEO_MEDIA", "releaseMediaPlayer: ");
        C2366c cVar = this.f4820e;
        if (cVar != null) {
            try {
                cVar.mo15848l();
            } catch (Throwable th) {
                C2415c.m5829a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error1: ", th);
            }
            this.f4820e.mo15819a((C2366c.C2368b) null);
            this.f4820e.mo15824a((C2366c.C2373g) null);
            this.f4820e.mo15818a((C2366c.C2367a) null);
            this.f4820e.mo15821a((C2366c.C2370d) null);
            this.f4820e.mo15820a((C2366c.C2369c) null);
            this.f4820e.mo15822a((C2366c.C2371e) null);
            this.f4820e.mo15823a((C2366c.C2372f) null);
            try {
                this.f4820e.mo15847k();
            } catch (Throwable th2) {
                C2415c.m5829a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error2: ", th2);
            }
        }
    }

    /* renamed from: x */
    private void m5571x() {
        Handler handler = this.f4827l;
        if (handler != null && handler.getLooper() != null) {
            this.f4827l.post(new Runnable() {
                public void run() {
                    if (C2374d.this.f4827l.getLooper() != null) {
                        try {
                            C2415c.m5828a("CSJ_VIDEO_MEDIA", "onDestory............");
                            C2374d.this.f4827l.getLooper().quit();
                        } catch (Throwable th) {
                            C2415c.m5829a("CSJ_VIDEO_MEDIA", "onDestroy error: ", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo15858a(C2366c cVar, int i) {
        if (this.f4820e == cVar) {
            for (WeakReference next : this.f4839z) {
                if (!(next == null || next.get() == null)) {
                    ((C2394a.C2395a) next.get()).mo15922b(this, i);
                }
            }
        }
    }

    /* renamed from: y */
    private void m5572y() {
        Integer valueOf = Integer.valueOf(f4803x.get(this.f4836u));
        if (valueOf == null) {
            f4803x.put(this.f4836u, 1);
        } else {
            f4803x.put(this.f4836u, Integer.valueOf(valueOf.intValue() + 1).intValue());
        }
    }

    /* renamed from: a */
    public void mo15859a(C2366c cVar) {
        this.f4825j = !this.f4821f ? 209 : 206;
        f4803x.delete(this.f4836u);
        for (WeakReference next : this.f4839z) {
            if (!(next == null || next.get() == null)) {
                ((C2394a.C2395a) next.get()).mo15913a(this);
            }
        }
        m5551b("completion");
    }

    /* renamed from: a */
    public boolean mo15860a(C2366c cVar, int i, int i2) {
        C2415c.m5835c("CSJ_VIDEO_MEDIA", "what=" + i + "extra=" + i2);
        m5572y();
        this.f4825j = 200;
        Handler handler = this.f4827l;
        if (handler != null) {
            handler.removeCallbacks(this.f4808E);
        }
        if (m5546a(i, i2)) {
            m5571x();
        }
        if (!this.f4822g) {
            C2399a aVar = new C2399a(308, i2);
            for (WeakReference next : this.f4839z) {
                if (!(next == null || next.get() == null)) {
                    ((C2394a.C2395a) next.get()).mo15919a((C2394a) this, aVar);
                }
            }
            this.f4822g = true;
            return true;
        }
        C2399a aVar2 = new C2399a(i, i2);
        for (WeakReference next2 : this.f4839z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C2394a.C2395a) next2.get()).mo15919a((C2394a) this, aVar2);
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m5546a(int i, int i2) {
        C2415c.m5828a("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo15861b(C2366c cVar, int i, int i2) {
        C2415c.m5835c("CSJ_VIDEO_MEDIA", "what,extra:" + i + "," + i2);
        if (this.f4820e != cVar) {
            return false;
        }
        if (i2 == -1004) {
            C2399a aVar = new C2399a(i, i2);
            for (WeakReference next : this.f4839z) {
                if (!(next == null || next.get() == null)) {
                    ((C2394a.C2395a) next.get()).mo15919a((C2394a) this, aVar);
                }
            }
        }
        m5549b(i, i2);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5549b(int i, int i2) {
        String str;
        int i3 = i;
        if (i3 == 701) {
            this.f4813J = SystemClock.elapsedRealtime();
            this.f4818c++;
            for (WeakReference next : this.f4839z) {
                if (!(next == null || next.get() == null)) {
                    ((C2394a.C2395a) next.get()).mo15916a(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            C2415c.m5833b("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f4818c));
        } else if (i3 == 702) {
            if (this.f4813J > 0) {
                str = "CSJ_VIDEO_MEDIA";
                this.f4814K += SystemClock.elapsedRealtime() - this.f4813J;
                this.f4813J = 0;
            } else {
                str = "CSJ_VIDEO_MEDIA";
            }
            for (WeakReference next2 : this.f4839z) {
                if (!(next2 == null || next2.get() == null)) {
                    ((C2394a.C2395a) next2.get()).mo15914a((C2394a) this, Integer.MAX_VALUE);
                }
            }
            C2415c.m5833b(str, "bufferCount = ", Integer.valueOf(this.f4818c), " mBufferTotalTime = ", Long.valueOf(this.f4814K));
        } else {
            String str2 = "CSJ_VIDEO_MEDIA";
            if (this.f4815L && i3 == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4833r;
                this.f4819d = true;
                for (WeakReference next3 : this.f4839z) {
                    if (!(next3 == null || next3.get() == null)) {
                        ((C2394a.C2395a) next3.get()).mo15917a((C2394a) this, elapsedRealtime);
                    }
                }
                mo15872a(this.f4805B);
                C2415c.m5831b(str2, "onRenderStart");
            }
        }
    }

    /* renamed from: b */
    public void mo15862b(C2366c cVar) {
        this.f4825j = ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR;
        if (this.f4810G) {
            this.f4827l.post(new Runnable() {
                public void run() {
                    try {
                        C2374d.this.f4820e.mo15843g();
                        int unused = C2374d.this.f4825j = 207;
                        boolean unused2 = C2374d.this.f4810G = false;
                    } catch (Throwable th) {
                        C2415c.m5829a("CSJ_VIDEO_MEDIA", "onPrepared error: ", th);
                    }
                }
            });
        } else {
            Handler handler = this.f4827l;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        f4803x.delete(this.f4836u);
        if (!this.f4815L && !this.f4834s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4833r;
            for (WeakReference next : this.f4839z) {
                if (!(next == null || next.get() == null)) {
                    ((C2394a.C2395a) next.get()).mo15917a((C2394a) this, elapsedRealtime);
                }
            }
            this.f4819d = true;
            this.f4834s = true;
        }
        for (WeakReference next2 : this.f4839z) {
            if (!(next2 == null || next2.get() == null)) {
                ((C2394a.C2395a) next2.get()).mo15921b(this);
            }
        }
    }

    /* renamed from: c */
    public void mo15863c(C2366c cVar) {
        for (WeakReference next : this.f4839z) {
            if (!(next == null || next.get() == null)) {
                ((C2394a.C2395a) next.get()).mo15920a((C2394a) this, true);
            }
        }
    }

    /* renamed from: a */
    private void m5544a(Runnable runnable) {
        if (this.f4835t == null) {
            this.f4835t = new ArrayList<>();
        }
        this.f4835t.add(runnable);
    }

    /* renamed from: z */
    private void m5573z() {
        if (!this.f4823h) {
            this.f4823h = true;
            Iterator it = new ArrayList(this.f4835t).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f4835t.clear();
            this.f4823h = false;
        }
    }

    /* renamed from: A */
    private void m5536A() {
        ArrayList<Runnable> arrayList = this.f4835t;
        if (arrayList != null && !arrayList.isEmpty()) {
            m5573z();
        }
    }

    /* renamed from: B */
    private void m5537B() {
        ArrayList<Runnable> arrayList = this.f4835t;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f4835t.clear();
        }
    }

    /* renamed from: b */
    private void m5550b(Runnable runnable) {
        if (runnable != null) {
            if (!this.f4824i) {
                runnable.run();
            } else {
                m5544a(runnable);
            }
        }
    }

    /* renamed from: a */
    public void mo15872a(final boolean z) {
        C2397b.m5670c().post(new Runnable() {
            public void run() {
                C2415c.m5833b("CSJ_VIDEO_MEDIA", "run:before setQuietPlay ", Boolean.valueOf(z));
                if (!C2374d.this.f4824i && C2374d.this.f4825j != 203 && C2374d.this.f4820e != null) {
                    try {
                        C2415c.m5833b("CSJ_VIDEO_MEDIA", "run:exec  setQuietPlay ", Boolean.valueOf(z));
                        boolean unused = C2374d.this.f4805B = z;
                        C2374d.this.f4820e.mo15839d(z);
                    } catch (Throwable th) {
                        C2415c.m5829a("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m5551b(String str) {
        Handler handler = this.f4827l;
        if (handler != null) {
            handler.removeMessages(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
        }
        synchronized (this.f4811H) {
            if (this.f4812I != null) {
                this.f4812I = null;
            }
        }
    }

    /* renamed from: o */
    public long mo15888o() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.f4814K;
        }
        if (this.f4828m) {
            long j = this.f4831p;
            if (j > 0) {
                return this.f4829n + j;
            }
        }
        return this.f4829n;
    }

    /* renamed from: j */
    public int mo15883j() {
        C2366c cVar = this.f4820e;
        if (cVar != null) {
            return cVar.mo15849m();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo15884k() {
        C2366c cVar = this.f4820e;
        if (cVar != null) {
            return cVar.mo15850n();
        }
        return 0;
    }

    /* renamed from: p */
    public int mo15889p() {
        return this.f4818c;
    }

    /* renamed from: a */
    public void mo15864a(C2366c cVar, int i, int i2, int i3, int i4) {
        for (WeakReference next : this.f4839z) {
            if (!(next == null || next.get() == null)) {
                ((C2394a.C2395a) next.get()).mo15915a((C2394a) this, i, i2);
            }
        }
    }

    /* renamed from: q */
    public long mo15890q() {
        long j = this.f4832q;
        if (j != 0) {
            return j;
        }
        if (this.f4825j == 206 || this.f4825j == 207) {
            try {
                this.f4832q = this.f4820e.mo15846j();
            } catch (Throwable unused) {
            }
        }
        return this.f4832q;
    }

    /* renamed from: s */
    public long mo15892s() {
        if (this.f4825j != 206 && this.f4825j != 207) {
            return 0;
        }
        try {
            return this.f4820e.mo15845i();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo15870a(C2394a.C2395a aVar) {
        if (aVar != null) {
            for (WeakReference next : this.f4839z) {
                if (next != null && next.get() == aVar) {
                    return;
                }
            }
            this.f4839z.add(new WeakReference(aVar));
        }
    }

    /* renamed from: f */
    public SurfaceHolder mo15879f() {
        return this.f4817b;
    }

    /* renamed from: g */
    public SurfaceTexture mo15880g() {
        return this.f4816a;
    }
}
