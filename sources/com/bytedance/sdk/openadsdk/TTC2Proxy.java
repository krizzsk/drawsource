package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C3200c;
import com.bytedance.sdk.openadsdk.component.p139f.C3214a;

public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        adSlot.setDurationSlotType(3);
        C3200c.m9255a(context).mo18860a(adSlot, appOpenAdListener, i);
    }

    /* renamed from: a */
    public static void m8280a(Context context) {
        C3214a.m9312a(context);
    }
}
