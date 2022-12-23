package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.controller.C4602q;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p190ui.C5034a;
import com.fyber.inneractive.sdk.player.p190ui.C5035b;
import com.fyber.inneractive.sdk.player.p190ui.C5042i;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.j */
public class C4592j extends C4594k<C4602q.C4603a> implements C4602q {

    /* renamed from: A */
    public float f11402A = 0.0f;

    /* renamed from: B */
    public boolean f11403B = false;

    /* renamed from: C */
    public boolean f11404C = false;

    /* renamed from: D */
    public boolean f11405D = false;

    /* renamed from: y */
    public Runnable f11406y;

    /* renamed from: z */
    public float f11407z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.j$a */
    public class C4593a implements Runnable {
        public C4593a() {
        }

        public void run() {
            C4592j.this.mo24853h(false);
            C4592j.this.f11406y = null;
        }
    }

    public C4592j(C4533c cVar, C5042i iVar, C4287y yVar, C4251s sVar, boolean z) {
        super(cVar, iVar, yVar, sVar, z);
        this.f11407z = ((float) yVar.mo24288b().mo24203b().intValue()) / 100.0f;
        mo24847D();
    }

    /* renamed from: A */
    public final void mo24844A() {
        if (this.f11415g != null && !this.f11405D) {
            mo24846C();
            super.mo24854j();
            ((C4602q.C4603a) this.f11415g).mo24898c();
            IAlog.m16446a("%sopening fullscreen", IAlog.m16443a((Object) this));
            this.f11405D = true;
            C4533c cVar = this.f11409a;
            if (cVar != null) {
                C5008f fVar = (C5008f) cVar;
                fVar.mo24716a(fVar.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_FULLSCREEN, C4435q.EVENT_EXPAND);
            }
        }
    }

    /* renamed from: B */
    public final void mo24845B() {
        C4533c cVar;
        C4582g gVar;
        C5042i iVar;
        if (this.f11402A >= this.f11407z && (cVar = this.f11409a) != null && (gVar = cVar.f11205b) != null && !gVar.f11382e.equals(C4610b.f11462i) && (iVar = this.f11412d) != null && !iVar.mo25675d() && this.f11409a.f11205b.f11387j != null) {
            if (((C4287y) this.f11410b).f10549f.f10369a.booleanValue() || this.f11403B) {
                mo24802b(IAConfigManager.f10324J.f10343i.f10481b);
            }
        }
    }

    /* renamed from: C */
    public final void mo24846C() {
        if (this.f11406y != null) {
            IAlog.m16446a("%sCancelling play runnable", IAlog.m16443a((Object) this));
            this.f11412d.removeCallbacks(this.f11406y);
            this.f11406y = null;
        }
    }

    /* renamed from: D */
    public final void mo24847D() {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null && !gVar.f11391n) {
            if (((C4287y) this.f11410b).f10549f.f10372d.booleanValue()) {
                this.f11409a.f11205b.mo24788b(false);
            } else if (!mo24871o()) {
                this.f11409a.f11205b.mo24791d(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.f11412d;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24848E() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.z r0 = r3.f11410b
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C4287y) r0
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f10549f
            com.fyber.inneractive.sdk.config.enums.TapAction r0 = r0.f10377i
            com.fyber.inneractive.sdk.config.enums.TapAction r1 = com.fyber.inneractive.sdk.config.enums.TapAction.FULLSCREEN
            if (r0 == r1) goto L_0x001b
            com.fyber.inneractive.sdk.player.ui.i r0 = r3.f11412d
            android.widget.ImageView r1 = r0.f13469u
            if (r1 == 0) goto L_0x001b
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r0 = r0.f13469u
            r0.setSelected(r2)
        L_0x001b:
            r3.mo24873x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4592j.mo24848E():void");
    }

    /* renamed from: a */
    public void mo24816a(boolean z) {
        if (z) {
            mo24850a(this.f11402A);
        }
        super.mo24816a(z);
    }

    /* renamed from: b */
    public void mo24802b(int i) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null && gVar.f11382e != C4610b.Playing && this.f11406y == null) {
            IAlog.m16446a("%splayVideo %s", IAlog.m16443a((Object) this), this.f11412d);
            if (i == 0) {
                mo24853h(false);
                return;
            }
            C4593a aVar = new C4593a();
            this.f11406y = aVar;
            this.f11412d.postDelayed(aVar, (long) i);
        }
    }

    /* renamed from: c */
    public boolean mo24804c() {
        return true;
    }

    /* renamed from: d */
    public void mo24805d(boolean z) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (!(cVar == null || (gVar = cVar.f11205b) == null || gVar.f11382e.equals(C4610b.f11462i))) {
            mo24848E();
        }
        C4533c cVar2 = this.f11409a;
        Bitmap bitmap = cVar2 != null ? cVar2.f11215l : null;
        if (bitmap != null) {
            this.f11412d.mo25671b(true);
            this.f11412d.setLastFrameBitmap(bitmap);
        }
        super.mo24805d(z);
    }

    public void destroy() {
        mo24846C();
        this.f11415g = null;
        super.destroy();
    }

    /* renamed from: h */
    public void mo24853h(boolean z) {
        C4533c cVar = this.f11409a;
        if (cVar != null && cVar.f11205b != null) {
            mo24847D();
            super.mo24853h(z);
        }
    }

    /* renamed from: i */
    public boolean mo24818i() {
        super.mo24818i();
        C4533c cVar = this.f11409a;
        if (!(cVar == null || cVar.f11205b == null)) {
            IAlog.m16446a("%sconnectToTextureView playing state = %s", IAlog.m16443a((Object) this), this.f11409a.f11205b.f11382e);
            if (this.f11409a.f11205b.mo24813j()) {
                this.f11412d.mo25673c(!this.f11409a.f11214k);
                C5042i iVar = this.f11412d;
                C5035b bVar = new C5035b();
                bVar.f13428b = false;
                iVar.mo25667a(new C5034a(bVar));
                this.f11412d.mo25671b(false);
                mo24847D();
            }
        }
        mo24850a(this.f11402A);
        return true;
    }

    /* renamed from: j */
    public void mo24854j() {
        mo24846C();
        super.mo24854j();
    }

    /* renamed from: l */
    public int mo24819l() {
        return IAConfigManager.f10324J.f10356v.f10459b.mo24271a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* renamed from: n */
    public int mo24820n() {
        return 0;
    }

    public void pauseVideo() {
        mo24846C();
        super.pauseVideo();
    }

    /* renamed from: r */
    public void mo24822r() {
        mo24844A();
    }

    /* renamed from: s */
    public void mo24855s() {
        mo24867h();
        this.f11412d.mo25669a(false);
        mo24826y();
        mo24846C();
    }

    /* renamed from: t */
    public void mo24823t() {
        C4533c cVar = this.f11409a;
        if (cVar != null && cVar.f11205b != null) {
            mo24818i();
            mo24853h(false);
        }
    }

    /* renamed from: u */
    public void mo24856u() {
        mo24845B();
    }

    /* renamed from: v */
    public void mo24824v() {
        super.mo24824v();
        mo24848E();
        this.f11412d.mo25671b(false);
        this.f11403B = true;
    }

    /* renamed from: w */
    public boolean mo24825w() {
        return false;
    }

    /* renamed from: p */
    public void mo24821p() {
        IAlog.m16446a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m16443a((Object) this));
        if (this.f11412d.f13441e) {
            this.f11429u = true;
            mo24803c(false);
        }
    }

    /* renamed from: a */
    public void mo24815a(C5306p0 p0Var) {
        TapAction tapAction = ((C4287y) this.f11410b).f10549f.f10377i;
        C4533c cVar = this.f11409a;
        if (cVar != null && cVar.f11205b != null && this.f11402A < this.f11407z) {
            return;
        }
        if (tapAction == TapAction.CTR) {
            Bitmap g = mo24865g(false);
            if (mo24862a(false, VideoClickOrigin.CTA, p0Var) && g != null) {
                this.f11412d.setLastFrameBitmap(g);
                this.f11412d.mo25671b(true);
            }
        } else if (tapAction == TapAction.FULLSCREEN) {
            mo24844A();
        } else if (tapAction != TapAction.DO_NOTHING) {
            IAlog.m16446a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m16443a((Object) this), tapAction);
        } else if (cVar != null) {
            cVar.mo24725g();
        }
    }

    /* renamed from: b */
    public void mo24851b(boolean z) {
        C4533c cVar;
        C4582g gVar;
        this.f11404C = z;
        if (z && (cVar = this.f11409a) != null && (gVar = cVar.f11205b) != null && gVar.f11387j == null && this.f11412d.f13441e && !gVar.f11382e.equals(C4610b.f11462i)) {
            mo24818i();
            mo24850a(this.f11402A);
        }
    }

    /* renamed from: d */
    public void mo24852d() {
        IAlog.m16446a("%sonVideoViewDetachedFromWindow", IAlog.m16443a((Object) this));
        mo24854j();
    }

    /* renamed from: a */
    public void mo24850a(float f) {
        C4582g gVar;
        this.f11402A = f;
        if (IAlog.f13936a >= 3) {
            IAlog.m16448c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m16443a((Object) this), Float.valueOf(f), Float.valueOf(this.f11407z), Float.valueOf(1.0f - this.f11407z));
        }
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null) {
            if (gVar.f11382e != C4610b.Playing) {
                mo24845B();
            } else if (f <= this.f11407z) {
                IAlog.m16449d("%sonVisibilityChanged pausing player", IAlog.m16443a((Object) this));
                if (this.f11409a.f11205b.f11387j != null) {
                    this.f11403B = false;
                    mo24865g(false);
                    mo24846C();
                    super.pauseVideo();
                    mo24864f(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24849a() {
        C4582g gVar;
        IAlog.m16446a("%sfullscreenExited called", IAlog.m16443a((Object) this));
        this.f11405D = false;
        mo24851b(this.f11404C);
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null) {
            mo24840a(gVar.f11382e);
            mo24839a(this.f11409a.f11205b.mo24789c());
        }
    }
}
