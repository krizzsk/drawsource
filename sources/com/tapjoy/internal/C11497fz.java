package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.internal.C11504gc;
import com.tapjoy.internal.C11582hu;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fz */
public final class C11497fz extends C11582hu {

    /* renamed from: b */
    private final C11504gc<C11582hu.C11583a> f27596b = new C11504gc<C11582hu.C11583a>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo70011a() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo70009a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            C11582hu.C11583a aVar = (C11582hu.C11583a) obj;
            TJPlacement createPlacement = TJPlacementManager.createPlacement(TapjoyConnectCore.getContext(), aVar.f27855b, false, tJPlacementListener);
            createPlacement.pushId = aVar.f27854a;
            return createPlacement;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo70010a(Object obj) {
            C11582hu.C11583a aVar = (C11582hu.C11583a) obj;
            if (aVar != null) {
                return aVar.f27855b;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final /* synthetic */ C11504gc.C11505a mo70026b(Object obj) {
            C11582hu.C11583a aVar = (C11582hu.C11583a) obj;
            return new C11504gc.C11505a(aVar, aVar.f27856c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo70025a(Observer observer) {
            if (TapjoyConnectCore.isViewOpen()) {
                TJPlacementManager.dismissContentShowing(true);
            }
            return super.mo70025a(observer);
        }
    };

    /* renamed from: a */
    public static void m31469a() {
    }

    static {
        C11582hu.m31754a((C11582hu) new C11497fz());
    }

    private C11497fz() {
    }

    /* renamed from: b */
    public final boolean mo70024b() {
        return this.f27596b.f27615b != null;
    }

    /* renamed from: a */
    public final void mo70023a(C11582hu.C11583a aVar) {
        this.f27596b.mo70035c(aVar);
    }
}
