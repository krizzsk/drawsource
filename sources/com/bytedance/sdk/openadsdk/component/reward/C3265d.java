package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2412b;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2917v;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C3250b;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.video.p161b.C3597a;
import com.bytedance.sdk.openadsdk.core.video.p163d.C3624a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3790b;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.d */
/* compiled from: FullScreenVideoLoadManager */
public class C3265d {

    /* renamed from: a */
    private static volatile C3265d f7738a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f7739b;

    /* renamed from: c */
    private final C3516n f7740c = C3513m.m10971f();

    /* renamed from: d */
    private AtomicBoolean f7741d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C3273a> f7742e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2885g f7743f;

    /* renamed from: g */
    private final C2917v.C2920b f7744g = new C2917v.C2920b() {
        /* renamed from: a */
        public void mo17829a(Context context, Intent intent, boolean z) {
            if (z) {
                if (C3265d.this.f7743f == null) {
                    C2885g unused = C3265d.this.f7743f = new C3217a("fsv net connect task", C3265d.this.f7742e);
                }
                C2898h.m8093a().post(C3265d.this.f7743f);
            }
        }
    };

    /* renamed from: a */
    public static C3265d m9641a(Context context) {
        if (f7738a == null) {
            synchronized (C3265d.class) {
                if (f7738a == null) {
                    f7738a = new C3265d(context);
                }
            }
        }
        return f7738a;
    }

    private C3265d(Context context) {
        this.f7739b = context == null ? C3513m.m10963a() : context.getApplicationContext();
        m9648c();
    }

    /* renamed from: a */
    public void mo19097a() {
        try {
            C3250b.m9568a(this.f7739b).mo19067a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo19102b() {
        AdSlot b = C3250b.m9568a(this.f7739b).mo19072b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C3250b.m9568a(this.f7739b).mo19075c(b.getCodeId()) == null) {
            mo19103b(b);
        }
    }

    /* renamed from: a */
    public void mo19098a(AdSlot adSlot) {
        C3250b.m9568a(this.f7739b).mo19074b(adSlot);
    }

    /* renamed from: a */
    public void mo19099a(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        C2905l.m8111b("FullScreenVideoLoadManager", "load full screen video: " + String.valueOf(adSlot));
        C2905l.m8111b("bidding", "load full video: BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
        C3250b.m9568a(this.f7739b).mo19068a(adSlot);
        m9642a(adSlot, false, fullScreenVideoAdListener);
    }

    /* renamed from: b */
    public void mo19103b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C2905l.m8111b("FullScreenVideoLoadManager", "preload full screen video: " + String.valueOf(adSlot));
            m9642a(adSlot, true, (TTAdNative.FullScreenVideoAdListener) null);
            return;
        }
        C2905l.m8111b("bidding", "preload not request bidding ：BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m9642a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m9643a(adSlot, true, fullScreenVideoAdListener, currentTimeMillis);
            return;
        }
        C3431n c = C3250b.m9568a(this.f7739b).mo19075c(adSlot.getCodeId());
        if (c != null) {
            C3302k kVar = new C3302k(this.f7739b, c, adSlot);
            if (!C3434p.m10497i(c)) {
                kVar.mo19145a(C3250b.m9568a(this.f7739b).mo19065a(c));
            }
            C3090e.m8903a(c);
            if (fullScreenVideoAdListener != null) {
                fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                if (!C3434p.m10497i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C2400b J = c.mo19517J();
                        C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(c.mo19560aD()).mo15665b(), c);
                        a.mo15970a("material_meta", c);
                        a.mo15970a("ad_slot", adSlot);
                        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
                        final C3431n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C3624a.m11584a(a, new C2412b() {
                            /* renamed from: a */
                            public void mo16067a(C2401c cVar, int i) {
                                if (fullScreenVideoAdListener2 != null) {
                                    C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onFullScreenVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo16068a(C2401c cVar, int i, String str) {
                                C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail");
                                if (fullScreenVideoAdListener2 != null && J.mo15964s()) {
                                    C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail and exec onFullScreenVideoCached");
                                }
                            }
                        });
                    } else {
                        C3090e.m8915b(this.f7739b, c, C3898x.m12769b(adSlot.getDurationSlotType()), currentTimeMillis);
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            }
            final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener3 = fullScreenVideoAdListener;
            final C3431n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C3597a.m11391a().mo20168a(c, (C3597a.C3602a) new C3597a.C3602a() {
                /* renamed from: a */
                public void mo19105a(boolean z) {
                    if (fullScreenVideoAdListener3 != null && C3434p.m10497i(nVar2)) {
                        C3090e.m8915b(C3265d.this.f7739b, nVar2, C3898x.m12769b(adSlot3.getDurationSlotType()), j2);
                        fullScreenVideoAdListener3.onFullScreenVideoCached();
                    }
                }
            });
            C2905l.m8111b("FullScreenVideoLoadManager", "get cache data success");
            C2905l.m8111b("bidding", "full video get cache data success");
            return;
        }
        m9643a(adSlot, false, fullScreenVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m9643a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener, long j) {
        C2905l.m8111b("bidding", "full video doNetwork , get new materials:BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C3433o oVar = new C3433o();
        oVar.f8442c = z ? 2 : 1;
        if (C3513m.m10973h().mo19858h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f8445f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f7740c.mo19983a(adSlot, oVar, 8, new C3516n.C3517a() {
            /* renamed from: a */
            public void mo18456a(int i, String str) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo18457a(C3402a aVar, C3403b bVar) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (aVar.mo19386b() != null && !aVar.mo19386b().isEmpty()) {
                    C2905l.m8111b("FullScreenVideoLoadManager", "get material data success isPreload=" + z2);
                    final C3431n nVar = aVar.mo19386b().get(0);
                    try {
                        if (nVar.mo19520M() != null && !TextUtils.isEmpty(nVar.mo19520M().mo19468a())) {
                            C3790b bVar2 = new C3790b(true);
                            bVar2.mo20609a(adSlot2.getCodeId());
                            bVar2.mo20608a(8);
                            bVar2.mo20611c(nVar.mo19532Y());
                            bVar2.mo20612d(nVar.mo19569ac());
                            bVar2.mo20610b(C3898x.m12806h(nVar));
                            C3707a.m12122a(nVar.mo19520M()).mo17633a((C2832n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C3302k kVar = new C3302k(C3265d.this.f7739b, nVar, adSlot2);
                    if (!z2 && fullScreenVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C3090e.m8905a(nVar, "fullscreen_interstitial_ad", System.currentTimeMillis() - currentTimeMillis);
                        }
                        fullScreenVideoAdListener2.onFullScreenVideoAdLoad(kVar);
                    }
                    C3597a.m11391a().mo20168a(nVar, (C3597a.C3602a) new C3597a.C3602a() {
                        /* renamed from: a */
                        public void mo19105a(boolean z) {
                            C3431n nVar;
                            if (!z2 && fullScreenVideoAdListener2 != null && (nVar = nVar) != null && C3434p.m10497i(nVar)) {
                                C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                fullScreenVideoAdListener2.onFullScreenVideoCached();
                            }
                        }
                    });
                    if (z2 && !C3434p.m10497i(nVar) && C3513m.m10973h().mo19872n(adSlot2.getCodeId()).f8556d == 1 && !C2909o.m8137d(C3265d.this.f7739b)) {
                        C3265d.this.m9644a(new C3273a(nVar, adSlot2));
                    } else if (C3434p.m10497i(nVar)) {
                        C3250b.m9568a(C3265d.this.f7739b).mo19069a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C2400b J = nVar.mo19517J();
                        if (J != null) {
                            C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(nVar.mo19560aD()).mo15665b(), nVar);
                            a.mo15970a("material_meta", nVar);
                            a.mo15970a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                            C3624a.m11584a(a, new C2412b() {
                                /* renamed from: a */
                                public void mo16067a(C2401c cVar, int i) {
                                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadSuccess");
                                    if (!z2) {
                                        if (fullScreenVideoAdListener2 != null) {
                                            C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                            fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        }
                                        C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: onFullScreenVideoCached");
                                        return;
                                    }
                                    C3250b.m9568a(C3265d.this.f7739b).mo19069a(adSlot2, nVar);
                                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog:  ad json save");
                                }

                                /* renamed from: a */
                                public void mo16068a(C2401c cVar, int i, String str) {
                                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail");
                                    if (fullScreenVideoAdListener2 != null && J.mo15964s()) {
                                        C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail and exec onFullScreenVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C3250b.m9568a(C3265d.this.f7739b).mo19070a(nVar, (C3250b.C3254a<Object>) new C3250b.C3254a<Object>() {
                            /* renamed from: a */
                            public void mo19078a(boolean z, Object obj) {
                                C2905l.m8111b("FullScreenVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    kVar.mo19145a(C3250b.m9568a(C3265d.this.f7739b).mo19065a(nVar));
                                }
                                if (!z2) {
                                    C3090e.m8903a(nVar);
                                    if (z && fullScreenVideoAdListener2 != null) {
                                        C3090e.m8915b(C3265d.this.f7739b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    }
                                } else if (z) {
                                    C3250b.m9568a(C3265d.this.f7739b).mo19069a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(-3, C3446g.m10553a(-3));
                    bVar.mo19391a(-3);
                    C3403b.m10134a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo19100a(String str) {
        C3250b.m9568a(this.f7739b).mo19071a(str);
    }

    /* renamed from: b */
    public AdSlot mo19101b(String str) {
        return C3250b.m9568a(this.f7739b).mo19073b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9644a(C3273a aVar) {
        if (aVar != null) {
            if (this.f7742e.size() >= 1) {
                this.f7742e.remove(0);
            }
            this.f7742e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m9648c() {
        if (!this.f7741d.get()) {
            this.f7741d.set(true);
            C2917v.m8179a(this.f7744g, this.f7739b);
        }
    }

    /* renamed from: d */
    private void m9649d() {
        if (this.f7741d.get()) {
            this.f7741d.set(false);
            try {
                C2917v.m8178a(this.f7744g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f7743f != null) {
            try {
                C2898h.m8093a().removeCallbacks(this.f7743f);
            } catch (Exception unused) {
            }
            this.f7743f = null;
        }
        m9649d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.d$a */
    /* compiled from: FullScreenVideoLoadManager */
    private static class C3273a extends C2885g {

        /* renamed from: a */
        C3431n f7771a;

        /* renamed from: b */
        AdSlot f7772b;

        C3273a(C3431n nVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.f7771a = nVar;
            this.f7772b = adSlot;
        }

        public void run() {
            if (this.f7771a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C3250b.m9568a(C3513m.m10963a()).mo19070a(this.f7771a, (C3250b.C3254a<Object>) new C3250b.C3254a<Object>() {
                        /* renamed from: a */
                        public void mo19078a(boolean z, Object obj) {
                            if (z) {
                                C3250b.m9568a(C3513m.m10963a()).mo19069a(C3273a.this.f7772b, C3273a.this.f7771a);
                                C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                                return;
                            }
                            C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail ");
                        }
                    });
                } else if (this.f7771a.mo19517J() != null) {
                    C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f7771a.mo19560aD()).mo15665b(), this.f7771a);
                    a.mo15970a("material_meta", this.f7771a);
                    a.mo15970a("ad_slot", this.f7772b);
                    C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                    C3624a.m11584a(a, new C2412b() {
                        /* renamed from: a */
                        public void mo16067a(C2401c cVar, int i) {
                            C3250b.m9568a(C3513m.m10963a()).mo19069a(C3273a.this.f7772b, C3273a.this.f7771a);
                            C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        }

                        /* renamed from: a */
                        public void mo16068a(C2401c cVar, int i, String str) {
                            C2905l.m8114c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail with net change ");
                        }
                    });
                }
            }
        }
    }
}
