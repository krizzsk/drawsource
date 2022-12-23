package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C3265d;
import com.bytedance.sdk.openadsdk.component.reward.C3276e;
import com.bytedance.sdk.openadsdk.component.reward.C3277f;
import com.bytedance.sdk.openadsdk.component.reward.C3290i;

public class TTC3Proxy {
    public static void verityPlayable(String str, int i, String str2, String str3, String str4) {
        C3276e.m9670a(str, i, str2, str3, str4);
    }

    public static void loadReward(Context context, AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        adSlot.setDurationSlotType(7);
        C3290i.m9699a(context).mo19129a(adSlot, (TTAdNative.RewardVideoAdListener) new C3277f(rewardVideoAdListener));
    }

    public static void loadFull(Context context, AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        adSlot.setDurationSlotType(8);
        C3265d.m9641a(context).mo19099a(adSlot, (TTAdNative.FullScreenVideoAdListener) new C3277f(fullScreenVideoAdListener));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8281a(android.content.Context r1) {
        /*
            com.bytedance.sdk.openadsdk.component.reward.i r0 = com.bytedance.sdk.openadsdk.component.reward.C3290i.m9699a((android.content.Context) r1)     // Catch:{ all -> 0x0007 }
            r0.mo19132b()     // Catch:{ all -> 0x0007 }
        L_0x0007:
            com.bytedance.sdk.openadsdk.component.reward.d r1 = com.bytedance.sdk.openadsdk.component.reward.C3265d.m9641a((android.content.Context) r1)     // Catch:{ all -> 0x000e }
            r1.mo19097a()     // Catch:{ all -> 0x000e }
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTC3Proxy.m8281a(android.content.Context):void");
    }
}
