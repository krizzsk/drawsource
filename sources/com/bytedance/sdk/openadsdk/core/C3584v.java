package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2911q;
import com.bytedance.sdk.component.utils.C2922w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.common.C3159b;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3541d;
import com.bytedance.sdk.openadsdk.core.p143a.C3336b;
import com.bytedance.sdk.openadsdk.core.p143a.C3339c;
import com.bytedance.sdk.openadsdk.core.p143a.C3342d;
import com.bytedance.sdk.openadsdk.core.p143a.C3346e;
import com.bytedance.sdk.openadsdk.core.p143a.C3349f;
import com.bytedance.sdk.openadsdk.core.p143a.C3352g;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p150f.C3443a;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3897w;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.v */
/* compiled from: TTAdNativeImpl */
public class C3584v implements TTAdNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3516n f9057a = C3513m.m10971f();

    /* renamed from: b */
    private volatile Context f9058b;

    public C3584v(Context context) {
        this.f9058b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Context m11344a() {
        if (this.f9058b == null) {
            this.f9058b = C3513m.m10963a();
        }
        return this.f9058b;
    }

    public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        C3339c cVar = new C3339c(feedAdListener);
        final C3339c cVar2 = cVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        m11346a(new C2885g("loadFeedAd") {
            public void run() {
                if (!C3584v.this.m11349a((C3159b) cVar2)) {
                    try {
                        C3584v.this.m11354c(adSlot2);
                        try {
                            Method a = C2922w.m8186a("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, TTAdNative.FeedAdListener.class);
                            if (a != null) {
                                a.invoke((Object) null, new Object[]{C3584v.this.m11344a(), adSlot2, cVar2});
                            }
                        } catch (Throwable th) {
                            C2905l.m8112b("TTAdNativeImpl", "feed component maybe not exist, pls check1", th);
                        }
                    } catch (Exception unused) {
                        C2905l.m8110b("Ad Slot not Valid, please check");
                        feedAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, cVar, adSlot);
    }

    public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        adSlot.setDurationSlotType(adSlot.getNativeAdType());
        C3346e eVar = new C3346e(nativeAdListener);
        final C3346e eVar2 = eVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.NativeAdListener nativeAdListener2 = nativeAdListener;
        m11346a(new C2885g("loadNativeAd") {
            public void run() {
                if (!C3584v.this.m11349a((C3159b) eVar2)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    try {
                        C3584v.this.m11352b(adSlot2);
                        C3516n b = C3584v.this.f9057a;
                        AdSlot adSlot = adSlot2;
                        b.mo19983a(adSlot, (C3433o) null, adSlot.getNativeAdType(), new C3516n.C3517a() {
                            /* renamed from: a */
                            public void mo18456a(int i, String str) {
                                eVar2.onError(i, str);
                            }

                            /* renamed from: a */
                            public void mo18457a(C3402a aVar, C3403b bVar) {
                                if (aVar.mo19386b() == null || aVar.mo19386b().isEmpty()) {
                                    eVar2.onError(-3, C3446g.m10553a(-3));
                                    bVar.mo19391a(-3);
                                    C3403b.m10134a(bVar);
                                    return;
                                }
                                List<C3431n> b = aVar.mo19386b();
                                ArrayList arrayList = new ArrayList(b.size());
                                for (C3431n next : b) {
                                    if (next.mo19581ao()) {
                                        arrayList.add(new C3443a(C3584v.this.m11344a(), next, adSlot2.getNativeAdType()) {
                                        });
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                                        C3090e.m8905a(b.get(0), C3898x.m12769b(adSlot2.getNativeAdType()), System.currentTimeMillis() - currentTimeMillis);
                                    } else {
                                        C3090e.m8915b(C3584v.this.m11344a(), b.get(0), C3898x.m12769b(adSlot2.getDurationSlotType()), currentTimeMillis);
                                    }
                                    eVar2.onNativeAdLoad(arrayList);
                                    return;
                                }
                                eVar2.onError(-4, C3446g.m10553a(-4));
                                bVar.mo19391a(-4);
                                C3403b.m10134a(bVar);
                            }
                        });
                    } catch (Exception unused) {
                        C2905l.m8110b("Ad Slot not Valid, please check");
                        nativeAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, eVar, adSlot);
    }

    public void loadRewardVideoAd(final AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final C3352g gVar = new C3352g(rewardVideoAdListener);
        m11346a(new C2885g("loadRewardVideoAd") {
            public void run() {
                if (!C3584v.this.m11349a((C3159b) gVar)) {
                    try {
                        Method a = C2922w.m8186a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, TTAdNative.RewardVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C3584v.this.m11344a(), adSlot, gVar});
                        }
                    } catch (Throwable th) {
                        C2905l.m8112b("TTAdNativeImpl", "reward component maybe not exist, pls check1", th);
                    }
                }
            }
        }, gVar, adSlot);
    }

    public void loadFullScreenVideoAd(final AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final C3342d dVar = new C3342d(fullScreenVideoAdListener);
        m11346a(new C2885g("loadFullScreenVideoAd") {
            public void run() {
                if (!C3584v.this.m11349a((C3159b) dVar)) {
                    try {
                        Method a = C2922w.m8186a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, TTAdNative.FullScreenVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C3584v.this.m11344a(), adSlot, dVar});
                        }
                    } catch (Throwable th) {
                        C2905l.m8112b("TTAdNativeImpl", "reward component maybe not exist, pls check2", th);
                    }
                }
            }
        }, dVar, adSlot);
    }

    public void loadBannerExpressAd(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        final C3349f fVar = new C3349f(nativeExpressAdListener);
        m11346a(new C2885g("loadBannerExpressAd") {
            public void run() {
                if (!C3584v.this.m11349a((C3159b) fVar)) {
                    adSlot.setNativeAdType(1);
                    adSlot.setDurationSlotType(1);
                    C3541d.m11124a(C3584v.this.m11344a()).mo20089a(adSlot, 1, fVar, 5000);
                }
            }
        }, fVar, adSlot);
    }

    public void loadAppOpenAd(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        C3336b bVar = new C3336b(appOpenAdListener);
        final C3336b bVar2 = bVar;
        final AdSlot adSlot2 = adSlot;
        final int i2 = i;
        m11346a(new C2885g("loadSplashAd b") {
            public void run() {
                Method a;
                try {
                    if (!C3584v.this.m11349a((C3159b) bVar2) && (a = C2922w.m8186a("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, TTAdNative.AppOpenAdListener.class, Integer.TYPE)) != null) {
                        a.invoke((Object) null, new Object[]{C3584v.this.m11344a(), adSlot2, bVar2, Integer.valueOf(i2)});
                    }
                } catch (Throwable th) {
                    C2905l.m8115c("TTAdNativeImpl", "open component maybe not exist, please check", th);
                }
            }
        }, bVar, adSlot);
    }

    /* renamed from: a */
    private void m11347a(AdSlot adSlot) {
        boolean z = true;
        C2911q.m8143a(adSlot.getImgAcceptedWidth() > 0, "Image material size must be set");
        if (adSlot.getImgAcceptedHeight() <= 0) {
            z = false;
        }
        C2911q.m8143a(z, "Image material size must be set");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11352b(AdSlot adSlot) {
        m11347a(adSlot);
        C2911q.m8143a(adSlot.getNativeAdType() > 0, "Must set the type of requesting native ads, currently supports TYPE_BANNER and TYPE_INTERACTION_AD");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11354c(AdSlot adSlot) {
        m11347a(adSlot);
        C2911q.m8143a(adSlot.getNativeAdType() == 0, "Request the type of non-native ad, please do not call the setNativeAdType() method");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11349a(C3159b bVar) {
        if (C3470e.m10697a()) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    /* renamed from: a */
    private void m11346a(final C2885g gVar, final C3159b bVar, final AdSlot adSlot) {
        C35937 r0 = new Runnable() {
            public void run() {
                int e = C3502k.m10923e();
                if (e == 0 || e == 2) {
                    C2905l.m8118e("TTAdNativeImpl", "please exec TTAdSdk.init before load ad");
                    C3159b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                C3090e.m8902a(adSlot);
                C3502k.m10921c().post(gVar);
            }
        };
        if (C3897w.m12746a()) {
            C2882e.m8032a().execute(r0);
        } else {
            r0.run();
        }
    }
}
