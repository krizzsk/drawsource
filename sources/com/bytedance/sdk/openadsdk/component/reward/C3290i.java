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
import com.bytedance.sdk.openadsdk.component.reward.C3284g;
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

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.i */
/* compiled from: RewardVideoLoadManager */
public class C3290i {

    /* renamed from: a */
    private static volatile C3290i f7800a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f7801b;

    /* renamed from: c */
    private final C3516n f7802c = C3513m.m10971f();

    /* renamed from: d */
    private AtomicBoolean f7803d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C3298a> f7804e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2885g f7805f;

    /* renamed from: g */
    private final C2917v.C2920b f7806g = new C2917v.C2920b() {
        /* renamed from: a */
        public void mo17829a(Context context, Intent intent, boolean z) {
            if (z) {
                if (C3290i.this.f7805f == null) {
                    C2885g unused = C3290i.this.f7805f = new C3217a("net connect task", C3290i.this.f7804e);
                }
                C2898h.m8093a().post(C3290i.this.f7805f);
            }
        }
    };

    /* renamed from: a */
    public static C3290i m9699a(Context context) {
        if (f7800a == null) {
            synchronized (C3290i.class) {
                if (f7800a == null) {
                    f7800a = new C3290i(context);
                }
            }
        }
        return f7800a;
    }

    private C3290i(Context context) {
        this.f7801b = context == null ? C3513m.m10963a() : context.getApplicationContext();
        m9706c();
    }

    /* renamed from: a */
    public void mo19127a() {
        AdSlot b = C3284g.m9671a(this.f7801b).mo19120b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C3284g.m9671a(this.f7801b).mo19123c(b.getCodeId()) == null) {
            mo19133b(b);
        }
    }

    /* renamed from: a */
    public void mo19128a(AdSlot adSlot) {
        C3284g.m9671a(this.f7801b).mo19122b(adSlot);
    }

    /* renamed from: b */
    public void mo19132b() {
        try {
            C3284g.m9671a(this.f7801b).mo19115a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo19129a(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        C2905l.m8111b("RewardVideoLoadManager", "load reward vide: " + String.valueOf(adSlot));
        C2905l.m8111b("bidding", "load reward vide: BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
        C3284g.m9671a(this.f7801b).mo19116a(adSlot);
        m9700a(adSlot, false, rewardVideoAdListener);
    }

    /* renamed from: b */
    public void mo19133b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C2905l.m8111b("RewardVideoLoadManager", "preload reward video: " + String.valueOf(adSlot));
            m9700a(adSlot, true, (TTAdNative.RewardVideoAdListener) null);
            return;
        }
        C2905l.m8111b("bidding", "preload not request bidding：BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m9700a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m9701a(adSlot, true, rewardVideoAdListener, currentTimeMillis);
            return;
        }
        C3431n c = C3284g.m9671a(this.f7801b).mo19123c(adSlot.getCodeId());
        if (c != null) {
            C3305l lVar = new C3305l(this.f7801b, c, adSlot);
            if (!C3434p.m10497i(c)) {
                lVar.mo19148a(C3284g.m9671a(this.f7801b).mo19113a(c));
            }
            C3090e.m8903a(c);
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                if (!C3434p.m10497i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C2400b J = c.mo19517J();
                        C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(c.mo19560aD()).mo15665b(), c);
                        a.mo15970a("material_meta", c);
                        a.mo15970a("ad_slot", adSlot);
                        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
                        final C3431n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C3624a.m11584a(a, new C2412b() {
                            /* renamed from: a */
                            public void mo16067a(C2401c cVar, int i) {
                                if (rewardVideoAdListener2 != null) {
                                    C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onRewardVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo16068a(C2401c cVar, int i, String str) {
                                C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                                if (rewardVideoAdListener2 != null && J.mo15964s()) {
                                    C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail and exec onRewardVideoCached");
                                }
                            }
                        });
                    } else {
                        C3090e.m8915b(this.f7801b, c, C3898x.m12769b(adSlot.getDurationSlotType()), currentTimeMillis);
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            }
            final TTAdNative.RewardVideoAdListener rewardVideoAdListener3 = rewardVideoAdListener;
            final C3431n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C3597a.m11391a().mo20168a(c, (C3597a.C3602a) new C3597a.C3602a() {
                /* renamed from: a */
                public void mo19105a(boolean z) {
                    if (rewardVideoAdListener3 != null && C3434p.m10497i(nVar2)) {
                        C3090e.m8915b(C3290i.this.f7801b, nVar2, C3898x.m12769b(adSlot3.getDurationSlotType()), j2);
                        rewardVideoAdListener3.onRewardVideoCached();
                    }
                }
            });
            C2905l.m8111b("RewardVideoLoadManager", "get cache data success");
            C2905l.m8111b("bidding", "reward video get cache data success");
            return;
        }
        m9701a(adSlot, false, rewardVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m9701a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener, long j) {
        C2905l.m8111b("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + C2414b.m5821a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C3433o oVar = new C3433o();
        oVar.f8441b = z ? 2 : 1;
        if (C3513m.m10973h().mo19858h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f8445f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f7802c.mo19983a(adSlot, oVar, 7, new C3516n.C3517a() {
            /* renamed from: a */
            public void mo18456a(int i, String str) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo18457a(C3402a aVar, C3403b bVar) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (aVar.mo19386b() != null && !aVar.mo19386b().isEmpty()) {
                    C2905l.m8111b("RewardVideoLoadManager", "get material data success isPreload=" + z2);
                    final C3431n nVar = aVar.mo19386b().get(0);
                    try {
                        if (nVar.mo19520M() != null && !TextUtils.isEmpty(nVar.mo19520M().mo19468a())) {
                            C3790b bVar2 = new C3790b(true);
                            bVar2.mo20609a(adSlot2.getCodeId());
                            bVar2.mo20608a(7);
                            bVar2.mo20611c(nVar.mo19532Y());
                            bVar2.mo20612d(nVar.mo19569ac());
                            bVar2.mo20610b(C3898x.m12806h(nVar));
                            C3707a.m12122a(nVar.mo19520M()).mo17633a((C2832n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C3305l lVar = new C3305l(C3290i.this.f7801b, nVar, adSlot2);
                    if (!z2 && rewardVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C3090e.m8905a(nVar, "rewarded_video", System.currentTimeMillis() - currentTimeMillis);
                        }
                        rewardVideoAdListener2.onRewardVideoAdLoad(lVar);
                    }
                    C3597a.m11391a().mo20168a(nVar, (C3597a.C3602a) new C3597a.C3602a() {
                        /* renamed from: a */
                        public void mo19105a(boolean z) {
                            C3431n nVar;
                            if (!z2 && rewardVideoAdListener2 != null && (nVar = nVar) != null && C3434p.m10497i(nVar)) {
                                C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                rewardVideoAdListener2.onRewardVideoCached();
                            }
                        }
                    });
                    if (z2 && !C3434p.m10497i(nVar) && C3513m.m10973h().mo19872n(adSlot2.getCodeId()).f8556d == 1 && !C2909o.m8137d(C3290i.this.f7801b)) {
                        C3290i.this.m9702a(new C3298a(nVar, adSlot2));
                    } else if (C3434p.m10497i(nVar)) {
                        C3284g.m9671a(C3290i.this.f7801b).mo19117a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C2400b J = nVar.mo19517J();
                        if (J != null) {
                            C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(nVar.mo19560aD()).mo15665b(), nVar);
                            a.mo15970a("material_meta", nVar);
                            a.mo15970a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C3624a.m11584a(a, new C2412b() {
                                /* renamed from: a */
                                public void mo16067a(C2401c cVar, int i) {
                                    C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                    if (z2) {
                                        C3284g.m9671a(C3290i.this.f7801b).mo19117a(adSlot2, nVar);
                                        C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                    } else if (rewardVideoAdListener2 != null) {
                                        C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onRewardVideoCached");
                                    }
                                }

                                /* renamed from: a */
                                public void mo16068a(C2401c cVar, int i, String str) {
                                    C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                    if (rewardVideoAdListener2 != null && J.mo15964s()) {
                                        C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog:  onVideoPreloadFail and exec onRewardVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C3284g.m9671a(C3290i.this.f7801b).mo19118a(nVar, (C3284g.C3288a<Object>) new C3284g.C3288a<Object>() {
                            /* renamed from: a */
                            public void mo19126a(boolean z, Object obj) {
                                C2905l.m8111b("RewardVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    lVar.mo19148a(C3284g.m9671a(C3290i.this.f7801b).mo19113a(nVar));
                                }
                                if (!z2) {
                                    C3090e.m8903a(nVar);
                                    if (z && rewardVideoAdListener2 != null) {
                                        C3090e.m8915b(C3290i.this.f7801b, nVar, C3898x.m12769b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                    }
                                } else if (z) {
                                    C3284g.m9671a(C3290i.this.f7801b).mo19117a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(-3, C3446g.m10553a(-3));
                    bVar.mo19391a(-3);
                    C3403b.m10134a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo19130a(String str) {
        C3284g.m9671a(this.f7801b).mo19119a(str);
    }

    /* renamed from: b */
    public AdSlot mo19131b(String str) {
        return C3284g.m9671a(this.f7801b).mo19121b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9702a(C3298a aVar) {
        if (aVar != null) {
            if (this.f7804e.size() >= 1) {
                this.f7804e.remove(0);
            }
            this.f7804e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m9706c() {
        if (!this.f7803d.get()) {
            this.f7803d.set(true);
            C2917v.m8179a(this.f7806g, this.f7801b);
        }
    }

    /* renamed from: d */
    private void m9707d() {
        if (this.f7803d.get()) {
            this.f7803d.set(false);
            try {
                C2917v.m8178a(this.f7806g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f7805f != null) {
            try {
                C2898h.m8093a().removeCallbacks(this.f7805f);
            } catch (Exception unused) {
            }
            this.f7805f = null;
        }
        m9707d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.i$a */
    /* compiled from: RewardVideoLoadManager */
    public static class C3298a extends C2885g {

        /* renamed from: a */
        C3431n f7833a;

        /* renamed from: b */
        AdSlot f7834b;

        C3298a(C3431n nVar, AdSlot adSlot) {
            super("Reward Task");
            this.f7833a = nVar;
            this.f7834b = adSlot;
        }

        public void run() {
            if (this.f7833a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C3284g.m9671a(C3513m.m10963a()).mo19118a(this.f7833a, (C3284g.C3288a<Object>) new C3284g.C3288a<Object>() {
                        /* renamed from: a */
                        public void mo19126a(boolean z, Object obj) {
                            if (z) {
                                C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                                C3284g.m9671a(C3513m.m10963a()).mo19117a(C3298a.this.f7834b, C3298a.this.f7833a);
                                return;
                            }
                            C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                } else if (this.f7833a.mo19517J() != null) {
                    C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(this.f7833a.mo19560aD()).mo15665b(), this.f7833a);
                    a.mo15970a("material_meta", this.f7833a);
                    a.mo15970a("ad_slot", this.f7834b);
                    C3624a.m11584a(a, new C2412b() {
                        /* renamed from: a */
                        public void mo16067a(C2401c cVar, int i) {
                            C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                            C3284g.m9671a(C3513m.m10963a()).mo19117a(C3298a.this.f7834b, C3298a.this.f7833a);
                        }

                        /* renamed from: a */
                        public void mo16068a(C2401c cVar, int i, String str) {
                            C2905l.m8114c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                }
            }
        }
    }
}
