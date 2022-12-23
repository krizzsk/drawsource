package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.g */
public class C5013g implements C4582g.C4588f {

    /* renamed from: a */
    public final C4408g f13365a;

    /* renamed from: b */
    public boolean f13366b = false;

    /* renamed from: c */
    public boolean f13367c = false;

    /* renamed from: d */
    public boolean f13368d = false;

    public C5013g(C4408g gVar) {
        this.f13365a = gVar;
    }

    /* renamed from: a */
    public void mo24840a(C4610b bVar) {
        IAlog.m16446a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f13366b), String.valueOf(this.f13368d));
        if (this.f13365a != null) {
            int ordinal = bVar.ordinal();
            if (ordinal == 2) {
                this.f13368d = true;
            } else if (ordinal != 3) {
                if (ordinal != 6) {
                    if (ordinal == 7) {
                        C4408g gVar = this.f13365a;
                        if (gVar.f10814c != null) {
                            IAlog.m16446a("%s pause", "OMVideo");
                            try {
                                gVar.f10814c.pause();
                            } catch (Throwable th) {
                                gVar.mo24588a(th);
                            }
                        }
                        this.f13367c = true;
                    } else if (ordinal == 8) {
                        C4408g gVar2 = this.f13365a;
                        if (gVar2.f10814c != null) {
                            IAlog.m16446a("%s complete", "OMVideo");
                            try {
                                gVar2.f10814c.complete();
                            } catch (Throwable th2) {
                                gVar2.mo24588a(th2);
                            }
                        }
                    }
                } else if (this.f13366b) {
                    this.f13366b = false;
                    C4408g gVar3 = this.f13365a;
                    if (gVar3.f10814c != null) {
                        IAlog.m16446a("%s bufferEnd", "OMVideo");
                        try {
                            gVar3.f10814c.bufferFinish();
                        } catch (Throwable th3) {
                            gVar3.mo24588a(th3);
                        }
                    }
                } else if (this.f13367c) {
                    C4408g gVar4 = this.f13365a;
                    if (gVar4.f10814c != null) {
                        IAlog.m16446a("%s resume", "OMVideo");
                        try {
                            gVar4.f10814c.resume();
                        } catch (Throwable th4) {
                            gVar4.mo24588a(th4);
                        }
                    }
                    this.f13367c = false;
                }
            } else if (this.f13368d) {
                C4408g gVar5 = this.f13365a;
                if (gVar5.f10814c != null) {
                    IAlog.m16446a("%s bufferStart", "OMVideo");
                    try {
                        gVar5.f10814c.bufferStart();
                    } catch (Throwable th5) {
                        gVar5.mo24588a(th5);
                    }
                }
                this.f13366b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo24717a(Exception exc) {
    }

    /* renamed from: e */
    public void mo24841e() {
    }

    /* renamed from: e */
    public void mo24723e(boolean z) {
    }
}
