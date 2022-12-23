package com.bytedance.sdk.openadsdk.component.p135b;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.video.p163d.C3624a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.a */
/* compiled from: FeedAdManager */
public class C3195a {

    /* renamed from: a */
    private static volatile C3195a f7508a;

    /* renamed from: b */
    private final C3516n f7509b = C3513m.m10971f();

    /* renamed from: a */
    public static C3195a m9235a() {
        if (f7508a == null) {
            synchronized (C3195a.class) {
                if (f7508a == null) {
                    f7508a = new C3195a();
                }
            }
        }
        return f7508a;
    }

    private C3195a() {
    }

    /* renamed from: a */
    public void mo18854a(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        final Context context2 = context;
        final AdSlot adSlot2 = adSlot;
        this.f7509b.mo19983a(adSlot, new C3433o(), 5, new C3516n.C3517a() {
            /* renamed from: a */
            public void mo18456a(int i, String str) {
                feedAdListener2.onError(i, str);
            }

            /* renamed from: a */
            public void mo18457a(C3402a aVar, C3403b bVar) {
                if (aVar.mo19386b() == null || aVar.mo19386b().isEmpty()) {
                    feedAdListener2.onError(-3, C3446g.m10553a(-3));
                    bVar.mo19391a(-3);
                    C3403b.m10134a(bVar);
                    return;
                }
                List<C3431n> b = aVar.mo19386b();
                ArrayList arrayList = new ArrayList(b.size());
                for (C3431n next : b) {
                    if (C3431n.m10311c(next)) {
                        arrayList.add(new C3197b(context2, next, 5, adSlot2));
                    } else if (next.mo19581ao()) {
                        arrayList.add(new C3197b(context2, next, 5, adSlot2));
                    }
                    if (!(!C3431n.m10311c(next) || next.mo19517J() == null || next.mo19517J().mo15953i() == null)) {
                        if (C3513m.m10973h().mo19840b(String.valueOf(C3898x.m12794f(next))) && C3513m.m10973h().mo19830G()) {
                            if (next.mo19517J() != null) {
                                next.mo19517J().mo15947f(1);
                            }
                            if (next.mo19562aF() != null) {
                                next.mo19562aF().mo15947f(1);
                            }
                            C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(next.mo19560aD()).mo15661a(), next);
                            a.mo15970a("material_meta", next);
                            a.mo15970a("ad_slot", adSlot2);
                            C3624a.m11584a(a, (C2410a.C2411a) null);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AdSlot adSlot = adSlot2;
                    if (adSlot == null) {
                        C3090e.m8915b(context2, b.get(0), C3898x.m12769b(5), currentTimeMillis);
                    } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        C3090e.m8905a(b.get(0), "embeded_ad", System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        C3090e.m8915b(context2, b.get(0), C3898x.m12769b(adSlot2.getDurationSlotType()), currentTimeMillis);
                    }
                    feedAdListener2.onFeedAdLoad(arrayList);
                    if (bVar.mo19399e() != null && !bVar.mo19399e().isEmpty()) {
                        C3403b.m10134a(bVar);
                        return;
                    }
                    return;
                }
                feedAdListener2.onError(-4, C3446g.m10553a(-4));
                bVar.mo19391a(-4);
                C3403b.m10134a(bVar);
            }
        });
    }
}
