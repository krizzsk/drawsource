package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.f */
public class C4580f implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ C4582g f11376a;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.f$a */
    public class C4581a implements Runnable {
        public C4581a() {
        }

        public void run() {
            C4582g gVar = C4580f.this.f11376a;
            C4582g.C4589g gVar2 = gVar.f11381d;
            if (gVar2 != null) {
                TextureView textureView = gVar.f11387j;
                C4601p pVar = (C4601p) gVar2;
                pVar.f11437a.f11412d.post(new C4600o(pVar));
            }
        }
    }

    public C4580f(C4582g gVar) {
        this.f11376a = gVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4582g gVar = this.f11376a;
        gVar.getClass();
        IAlog.m16446a("%sonSurfaceTextureAvailable", IAlog.m16443a((Object) gVar));
        C4582g gVar2 = this.f11376a;
        boolean z = !surfaceTexture.equals(gVar2.f11388k);
        gVar2.f11388k = surfaceTexture;
        if (gVar2.f11389l == null || z) {
            gVar2.f11389l = new Surface(gVar2.f11388k);
        }
        gVar2.mo24783a(gVar2.f11389l);
        C4582g gVar3 = this.f11376a;
        C4582g.C4589g gVar4 = gVar3.f11381d;
        if (gVar4 != null) {
            TextureView textureView = gVar3.f11387j;
            C4594k kVar = ((C4601p) gVar4).f11437a;
            kVar.getClass();
            IAlog.m16446a("%sonSurfaceTextureAvailable", IAlog.m16443a((Object) kVar));
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4582g gVar = this.f11376a;
        gVar.getClass();
        IAlog.m16446a("%s onSurfaceTextureDestroyed", IAlog.m16443a((Object) gVar));
        this.f11376a.mo24797k();
        this.f11376a.mo24783a((Surface) null);
        boolean unused = this.f11376a.f11392o = true;
        C4582g gVar2 = this.f11376a;
        C4610b bVar = gVar2.f11382e;
        if (bVar == C4610b.f11462i || bVar == C4610b.Error || bVar == C4610b.Idle) {
            gVar2.getClass();
            IAlog.m16446a("%sReleasing surface texture", IAlog.m16443a((Object) gVar2));
            this.f11376a.f11388k = null;
            return true;
        }
        gVar2.getClass();
        IAlog.m16446a("%s caching surface texture", IAlog.m16443a((Object) gVar2));
        C4582g gVar3 = this.f11376a;
        gVar3.f11388k = surfaceTexture;
        gVar3.f11386i.post(new C4581a());
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        C4533c cVar;
        C4582g gVar;
        C4582g.C4589g gVar2 = this.f11376a.f11381d;
        if (!(gVar2 == null || (cVar = ((C4601p) gVar2).f11437a.f11409a) == null || (gVar = cVar.f11205b) == null)) {
            gVar.f11386i.post(new C4591i(gVar));
        }
        C4582g gVar3 = this.f11376a;
        if (gVar3.f11392o && (surface = gVar3.f11389l) != null) {
            gVar3.mo24783a(surface);
            boolean unused = this.f11376a.f11392o = false;
        }
    }
}
