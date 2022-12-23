package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;

/* renamed from: com.tapjoy.internal.gg */
final class C11518gg extends C11517gf {
    C11518gg() {
    }

    /* renamed from: a */
    public final Object mo70051a(Context context, String str, TJPlacementListener tJPlacementListener) {
        return new TJPlacement(context, str, tJPlacementListener);
    }

    /* renamed from: b */
    public final Object mo70052b() {
        return TJPrivacyPolicy.getInstance();
    }
}
