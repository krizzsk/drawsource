package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.cache.C4571n;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4639d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4805g;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4816m;
import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4880l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4908f;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.player.mediaplayer.C5018a;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.controller.r */
public class C4604r implements C4880l.C4881a, VideoRendererEventListener, C4652e.C4653a, C4868f {

    /* renamed from: a */
    public final WeakReference<C4577d> f11438a;

    /* renamed from: b */
    public boolean f11439b = false;

    public C4604r(C4577d dVar) {
        this.f11438a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public void mo24899a() {
    }

    /* renamed from: a */
    public void mo24901a(C4816m mVar) {
    }

    /* renamed from: a */
    public void mo24902a(C4855p pVar, Object obj) {
    }

    /* renamed from: a */
    public void mo24903a(C4890s sVar, C4908f fVar) {
    }

    /* renamed from: a */
    public void mo24904a(boolean z) {
    }

    /* renamed from: a */
    public void mo24905a(boolean z, int i) {
        C4652e eVar;
        IAlog.m16446a("%sonPlayerStateChanged called with pwr = %s state = %d", mo24906b(), Boolean.valueOf(z), Integer.valueOf(i));
        WeakReference<C4577d> weakReference = this.f11438a;
        C4811i iVar = null;
        C4577d dVar = weakReference == null ? null : (C4577d) weakReference.get();
        if (dVar != null && (eVar = dVar.f11364s) != null && !dVar.f11352A) {
            if (i == 3) {
                if (z) {
                    dVar.mo24832a(C4610b.Playing);
                } else if (dVar.f11382e == C4610b.Preparing) {
                    if (eVar != null) {
                        C4805g gVar = (C4805g) eVar;
                        if (gVar.f12682r != null && gVar.f12682r.f13031a > 0) {
                            C4906e eVar2 = gVar.f12682r.f13032b[0];
                            if (eVar2 != null) {
                                iVar = eVar2.mo25421c();
                            }
                            if (iVar != null) {
                                int i2 = iVar.f12759j;
                                int i3 = iVar.f12760k;
                                dVar.f11365t = i2;
                                dVar.f11366u = i3;
                            }
                        }
                    }
                    this.f11439b = true;
                    dVar.mo24832a(C4610b.Prepared);
                }
            } else if (i == 2) {
                if (dVar.f11382e == C4610b.Playing) {
                    dVar.mo24832a(C4610b.Buffering);
                }
            } else if (i == 4) {
                dVar.mo24832a(C4610b.f11462i);
            }
        }
    }

    /* renamed from: b */
    public final String mo24906b() {
        WeakReference<C4577d> weakReference = this.f11438a;
        C4577d dVar = weakReference == null ? null : (C4577d) weakReference.get();
        if (dVar == null) {
            return C4604r.class.getName();
        }
        return IAlog.m16443a((Object) dVar);
    }

    public void onDroppedFrames(int i, long j) {
    }

    public void onRenderedFirstFrame(Surface surface) {
    }

    public void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    public void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    public void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    public void onVideoInputFormatChanged(C4811i iVar) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        WeakReference<C4577d> weakReference = this.f11438a;
        C4577d dVar = weakReference == null ? null : (C4577d) weakReference.get();
        if (dVar != null) {
            dVar.f11365t = i;
            dVar.f11366u = i2;
        }
    }

    /* renamed from: a */
    public void mo24900a(C4639d dVar) {
        String str;
        C4577d dVar2 = (C4577d) this.f11438a.get();
        if (dVar2 != null && dVar2.f11359H && dVar2.f11353B && !this.f11439b && (dVar.getCause() instanceof C4623c.C4628e)) {
            dVar2.f11367v = true;
            C4652e eVar = dVar2.f11364s;
            if (eVar != null) {
                ((C4805g) eVar).mo25255b();
                dVar2.f11364s = null;
            }
            dVar2.mo24785a(false);
            dVar2.mo24811a(dVar2.f11358G);
            dVar2.f11386i.post(new C4590h(dVar2, false));
        } else if (dVar2 == null || !dVar2.f11353B || this.f11439b || !C4571n.f11333f.mo24778a() || dVar2.f11360I >= dVar2.f11361p) {
            if (dVar.getCause() == null) {
                str = "empty";
            } else {
                str = dVar.getCause().getMessage();
            }
            C5018a.C5031m mVar = new C5018a.C5031m(dVar, str);
            IAlog.m16446a("%sonPlayerError called with %s for sendErrorState", mo24906b(), mVar);
            C4577d dVar3 = (C4577d) C5312s.m16531a(this.f11438a);
            if (dVar3 != null) {
                dVar3.mo24833a((Exception) mVar);
            }
        } else {
            C4652e eVar2 = dVar2.f11364s;
            if (eVar2 != null) {
                ((C4805g) eVar2).mo25255b();
                dVar2.f11364s = null;
            }
            dVar2.mo24785a(true);
            dVar2.mo24811a(dVar2.f11358G);
            dVar2.f11360I++;
            dVar2.f11386i.post(new C4590h(dVar2, true));
        }
    }
}
