package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;

/* renamed from: com.tapjoy.internal.ft */
public final class C11489ft {

    /* renamed from: a */
    private static final C11504gc<Void> f27583a = new C11504gc<Void>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo70010a(Object obj) {
            return "InsufficientCurrency";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo70009a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "InsufficientCurrency", true, tJPlacementListener);
        }
    };

    /* renamed from: a */
    public static void m31463a() {
        f27583a.mo70035c(null);
    }
}
