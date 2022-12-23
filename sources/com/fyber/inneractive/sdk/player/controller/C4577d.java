package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.player.cache.C4549d;
import com.fyber.inneractive.sdk.player.cache.C4556h;
import com.fyber.inneractive.sdk.player.cache.C4571n;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4638c;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4805g;
import com.fyber.inneractive.sdk.player.exoplayer2.C4853n;
import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4650c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4651d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4820c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4899b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4943k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.d */
public class C4577d extends C4582g implements C4549d.C4551b, C4549d.C4552c {

    /* renamed from: A */
    public boolean f11352A;

    /* renamed from: B */
    public final boolean f11353B;

    /* renamed from: C */
    public Bitmap f11354C;

    /* renamed from: D */
    public int f11355D;

    /* renamed from: E */
    public String f11356E;

    /* renamed from: F */
    public final List<C4556h> f11357F;

    /* renamed from: G */
    public C4884n f11358G;

    /* renamed from: H */
    public boolean f11359H;

    /* renamed from: I */
    public int f11360I;

    /* renamed from: p */
    public final int f11361p;

    /* renamed from: q */
    public final C4251s f11362q;

    /* renamed from: r */
    public final int f11363r;

    /* renamed from: s */
    public C4652e f11364s;

    /* renamed from: t */
    public int f11365t = 0;

    /* renamed from: u */
    public int f11366u = 0;

    /* renamed from: v */
    public boolean f11367v = false;

    /* renamed from: w */
    public Surface f11368w;

    /* renamed from: x */
    public C4853n[] f11369x;

    /* renamed from: y */
    public Handler f11370y;

    /* renamed from: z */
    public C4604r f11371z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.d$a */
    public class C4578a implements Runnable {
        public C4578a() {
        }

        public void run() {
            C4652e eVar = C4577d.this.f11364s;
            if (eVar != null) {
                C4805g gVar = (C4805g) eVar;
                gVar.mo25252a(gVar.mo25251a(), -9223372036854775807L);
                ((C4805g) C4577d.this.f11364s).f12669e.f12698f.sendEmptyMessage(5);
                ((C4805g) C4577d.this.f11364s).mo25255b();
                C4577d.this.f11364s = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4577d(android.content.Context r5, boolean r6, com.fyber.inneractive.sdk.config.global.C4251s r7) {
        /*
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.f11365t = r5
            r4.f11366u = r5
            r4.f11367v = r5
            r0 = 0
            r4.f11368w = r0
            r4.f11352A = r5
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.f11357F = r1
            r4.f11358G = r0
            r4.f11360I = r5
            r4.f11353B = r6
            r4.f11362q = r7
            com.fyber.inneractive.sdk.config.i r6 = com.fyber.inneractive.sdk.config.IAConfigManager.m13176b()
            com.fyber.inneractive.sdk.config.h r6 = r6.mo24276a()
            java.lang.String r1 = "extractor_source_retry_count"
            r2 = 6
            r3 = 3
            int r6 = r6.mo24271a(r1, r2, r3)
            r4.f11363r = r6
            if (r7 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C4234j.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r7.mo24264a(r6)
            r0 = r6
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C4234j) r0
        L_0x003c:
            if (r0 != 0) goto L_0x0040
            r6 = r5
            goto L_0x0044
        L_0x0040:
            int r6 = r0.mo24251h()
        L_0x0044:
            r4.f11361p = r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Creating IAExoPlayer2Controller"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4577d.<init>(android.content.Context, boolean, com.fyber.inneractive.sdk.config.global.s):void");
    }

    /* renamed from: b */
    public void mo24788b(boolean z) {
        mo24834c(true);
        this.f11391n = z;
        C4652e eVar = this.f11364s;
        if (eVar != null && !this.f11352A) {
            C4853n[] nVarArr = this.f11369x;
            if (nVarArr.length >= 2) {
                ((C4805g) eVar).mo25254a(new C4652e.C4655c(nVarArr[1], 2, new Float(0.0f)));
                this.f11367v = true;
            }
        }
    }

    /* renamed from: c */
    public int mo24789c() {
        long j;
        C4652e eVar = this.f11364s;
        if (eVar == null || this.f11352A) {
            return 0;
        }
        C4805g gVar = (C4805g) eVar;
        if (gVar.f12679o.mo25388c() || gVar.f12676l > 0) {
            j = gVar.f12686v;
        } else {
            gVar.f12679o.mo25384a(gVar.f12684t.f12738a, gVar.f12672h, false);
            j = C4637b.m14202b(gVar.f12672h.f12880e) + C4637b.m14202b(gVar.f12684t.f12740c);
        }
        return (int) j;
    }

    /* renamed from: d */
    public void mo24791d(boolean z) {
        mo24834c(false);
        this.f11391n = z;
        if (this.f11364s != null && !this.f11352A) {
            AudioManager audioManager = (AudioManager) this.f11378a.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            float f = ((float) streamVolume) / ((float) streamMaxVolume);
            IAlog.m16446a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
            if (f == 0.0f) {
                f = 0.1f;
            }
            C4853n[] nVarArr = this.f11369x;
            if (nVarArr.length >= 2) {
                C4652e eVar = this.f11364s;
                ((C4805g) eVar).mo25254a(new C4652e.C4655c(nVarArr[1], 2, new Float(f)));
            }
            this.f11367v = false;
        }
    }

    /* renamed from: e */
    public Bitmap mo24792e() {
        return this.f11354C;
    }

    /* renamed from: f */
    public String mo24793f() {
        return this.f11353B ? "exo_c" : "exo";
    }

    /* renamed from: g */
    public int mo24794g() {
        return this.f11366u;
    }

    /* renamed from: h */
    public int mo24795h() {
        return this.f11365t;
    }

    /* renamed from: i */
    public boolean mo24796i() {
        return this.f11367v;
    }

    /* renamed from: j */
    public boolean mo24813j() {
        if (this.f11364s == null || this.f11352A || this.f11382e != C4610b.Playing) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo24797k() {
        C4610b bVar;
        C4610b bVar2 = this.f11382e;
        if (bVar2 == C4610b.Idle || bVar2 == C4610b.f11462i || bVar2 == (bVar = C4610b.Paused) || bVar2 == C4610b.Prepared) {
            IAlog.m16446a("%s paused called when player is in mState: %s ignoring", IAlog.m16443a((Object) this), bVar2);
            return;
        }
        C4652e eVar = this.f11364s;
        if (eVar != null && !this.f11352A) {
            ((C4805g) eVar).mo25253a(false);
        }
        mo24835m();
        mo24832a(bVar);
    }

    /* renamed from: a */
    public void mo24782a(int i, boolean z) {
        IAlog.m16446a("%sseekTo called with %d playAfterSeek = %s", IAlog.m16443a((Object) this), Integer.valueOf(i), Boolean.valueOf(z));
        C4652e eVar = this.f11364s;
        if (eVar != null && !this.f11352A) {
            ((C4805g) eVar).mo25253a(z);
            C4805g gVar = (C4805g) this.f11364s;
            gVar.mo25252a(gVar.mo25251a(), (long) i);
        }
    }

    /* renamed from: l */
    public void mo24798l() {
        IAlog.m16446a("%sstart called", IAlog.m16443a((Object) this));
        if (this.f11364s != null && !this.f11352A) {
            mo24832a(C4610b.Start_in_progress);
            ((C4805g) this.f11364s).mo25253a(true);
        }
    }

    /* renamed from: b */
    public void mo24787b() {
        if (this.f11364s != null) {
            if (!this.f11352A) {
                this.f11352A = true;
                C5299n.m16520a(new C4578a());
            }
            C4604r rVar = this.f11371z;
            if (rVar != null) {
                rVar.f11438a.clear();
            }
            this.f11371z = null;
        }
        for (C4556h next : this.f11357F) {
            next.mo24767a(next.f11305o);
            C4571n nVar = C4571n.f11333f;
            nVar.f11337d.remove(next.mo24764a());
        }
        this.f11357F.clear();
        super.mo24787b();
    }

    /* renamed from: a */
    public void mo24783a(Surface surface) {
        IAlog.m16446a("%ssetSurface called with %s", IAlog.m16443a((Object) this), surface);
        this.f11368w = surface;
        C4652e eVar = this.f11364s;
        if (eVar != null && !this.f11352A) {
            ((C4805g) eVar).mo25254a(new C4652e.C4655c(this.f11369x[0], 1, surface));
        }
    }

    /* renamed from: a */
    public void mo24785a(boolean z) {
        boolean z2 = z;
        if (this.f11364s == null && !this.f11352A) {
            this.f11359H = z2;
            IAlog.m16446a("%sMediaPlayerController: creating media player", IAlog.m16443a((Object) this));
            C4604r rVar = this.f11371z;
            if (rVar != null) {
                rVar.f11438a.clear();
            }
            this.f11371z = new C4604r(this);
            this.f11370y = new Handler(Looper.getMainLooper());
            C4853n[] nVarArr = new C4853n[(z2 ? 2 : 1)];
            this.f11369x = nVarArr;
            Context context = this.f11378a;
            C4820c cVar = C4820c.f12825a;
            nVarArr[0] = new MediaCodecVideoRenderer(context, cVar, 5000, (C4650c<C4651d>) null, false, this.f11370y, this.f11371z, -1);
            if (z2) {
                this.f11369x[1] = new MediaCodecAudioRenderer(cVar, (C4650c<C4651d>) null, true, (Handler) null, (AudioRendererEventListener) null);
            }
            C4805g gVar = new C4805g(this.f11369x, new C4899b((C4906e.C4907a) null), new C4638c(new C4943k(true, 65536, 0), 15000, 30000, 2500, 5000));
            this.f11364s = gVar;
            gVar.f12670f.add(this.f11371z);
        }
    }

    /* renamed from: d */
    public int mo24790d() {
        long j;
        C4652e eVar = this.f11364s;
        if (eVar == null || this.f11352A) {
            return 0;
        }
        C4805g gVar = (C4805g) eVar;
        if (gVar.f12679o.mo25388c()) {
            j = -9223372036854775807L;
        } else {
            j = C4637b.m14202b(gVar.f12679o.mo25385a(gVar.mo25251a(), gVar.f12671g).f12886f);
        }
        return (int) j;
    }

    /* renamed from: a */
    public void mo24784a(String str, int i) {
        mo24812a(str, i, this.f11353B);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.n] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.fyber.inneractive.sdk.player.cache.e] */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24812a(java.lang.String r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.fyber.inneractive.sdk.player.exoplayer2.e r3 = r0.f11364s
            if (r3 == 0) goto L_0x00e0
            boolean r3 = r0.f11352A
            if (r3 != 0) goto L_0x00e0
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r21)
            r4[r5] = r6
            r5 = 1
            r4[r5] = r1
            java.lang.String r5 = "%sloadMediaPlayerUri called with %s"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r5, r4)
            r0.f11356E = r1
            r0.f11355D = r2
            android.net.Uri r7 = android.net.Uri.parse(r22)
            r1 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x003e
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            java.lang.String r4 = r7.getPath()
            if (r4 != 0) goto L_0x0039
            r4 = 3
            goto L_0x0053
        L_0x0039:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15142b((java.lang.String) r4)
            goto L_0x0053
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "."
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15142b((java.lang.String) r4)
        L_0x0053:
            boolean r5 = r0.f11353B
            if (r5 == 0) goto L_0x0069
            com.fyber.inneractive.sdk.player.cache.n r5 = com.fyber.inneractive.sdk.player.cache.C4571n.f11333f
            boolean r5 = r5.mo24778a()
            if (r5 == 0) goto L_0x0069
            if (r4 == r3) goto L_0x0069
            com.fyber.inneractive.sdk.player.cache.e r1 = new com.fyber.inneractive.sdk.player.cache.e
            com.fyber.inneractive.sdk.config.global.s r5 = r0.f11362q
            r1.<init>(r0, r0, r2, r5)
            goto L_0x00b8
        L_0x0069:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l
            r2.<init>(r1, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.p r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.p
            com.fyber.inneractive.sdk.config.IAConfigManager r6 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.util.u0 r6 = r6.f10359y
            java.lang.String r9 = r6.mo26394a()
            r11 = 2000(0x7d0, float:2.803E-42)
            r12 = 2000(0x7d0, float:2.803E-42)
            r13 = 1
            r8 = r5
            r10 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.n r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.n
            android.content.Context r8 = r0.f11378a
            r6.<init>(r8, r2, r5)
            android.content.Context r2 = r0.f11378a
            java.lang.String r5 = "ia-vid-cache-ex2"
            java.io.File r2 = com.fyber.inneractive.sdk.player.cache.C4571n.m13884a((android.content.Context) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x00ba
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j
            r8 = 10485760(0xa00000, double:5.180654E-317)
            r5.<init>(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k r15 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k
            r15.<init>(r2, r5, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.r r17 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r
            r17.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c
            r2.<init>(r15, r8)
            r19 = 2
            r20 = 0
            r14 = r1
            r16 = r6
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x00b8:
            r8 = r1
            goto L_0x00bb
        L_0x00ba:
            r8 = r6
        L_0x00bb:
            if (r4 == r3) goto L_0x00d0
            com.fyber.inneractive.sdk.player.exoplayer2.source.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.l
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.c r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c
            r9.<init>()
            int r10 = r0.f11363r
            android.os.Handler r11 = r0.f11370y
            com.fyber.inneractive.sdk.player.controller.r r12 = r0.f11371z
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00db
        L_0x00d0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h
            android.os.Handler r10 = r0.f11370y
            com.fyber.inneractive.sdk.player.controller.r r11 = r0.f11371z
            r9 = 3
            r6 = r1
            r6.<init>((android.net.Uri) r7, (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g.C4939a) r8, (int) r9, (android.os.Handler) r10, (com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f) r11)
        L_0x00db:
            r0.f11358G = r1
            r0.mo24811a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n) r1)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4577d.mo24812a(java.lang.String, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo24811a(C4884n nVar) {
        C4652e eVar = this.f11364s;
        if (eVar != null && nVar != null) {
            C4805g gVar = (C4805g) eVar;
            if (!gVar.f12679o.mo25388c() || gVar.f12680p != null) {
                gVar.f12679o = C4855p.f12875a;
                gVar.f12680p = null;
                Iterator<C4652e.C4653a> it = gVar.f12670f.iterator();
                while (it.hasNext()) {
                    it.next().mo24902a(gVar.f12679o, gVar.f12680p);
                }
            }
            if (gVar.f12673i) {
                gVar.f12673i = false;
                gVar.f12681q = C4890s.f12996d;
                gVar.f12682r = gVar.f12667c;
                gVar.f12666b.mo25431a((Object) null);
                Iterator<C4652e.C4653a> it2 = gVar.f12670f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo24903a(gVar.f12681q, gVar.f12682r);
                }
            }
            gVar.f12677m++;
            gVar.f12669e.f12698f.obtainMessage(0, 1, 0, nVar).sendToTarget();
            mo24832a(C4610b.Preparing);
        }
    }

    /* renamed from: a */
    public boolean mo24786a() {
        return this.f11353B;
    }
}
