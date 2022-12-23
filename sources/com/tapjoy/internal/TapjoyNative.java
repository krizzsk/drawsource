package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

public class TapjoyNative {
    public static Object createPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        return C11517gf.m31508a().mo70051a(context, str, tJPlacementListener);
    }

    public static Object getPrivacyPolicy() {
        return C11517gf.m31508a().mo70052b();
    }
}
