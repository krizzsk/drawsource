package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.p135b.C3195a;

public class TTC5Proxy {
    public static void loadFeed(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        adSlot.setDurationSlotType(5);
        C3195a.m9235a().mo18854a(context, adSlot, feedAdListener);
    }
}
