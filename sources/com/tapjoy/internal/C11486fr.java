package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.internal.C11491fu;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fr */
public final class C11486fr extends C11548hd implements Observer {

    /* renamed from: b */
    private final Map<String, Integer> f27575b = new HashMap();

    /* renamed from: c */
    private final C11474fk f27576c = new C11474fk();

    /* renamed from: d */
    private boolean f27577d;

    /* renamed from: e */
    private final C11504gc<Void> f27578e = new C11504gc<Void>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo70010a(Object obj) {
            return "AppLaunch";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo70011a() {
            return super.mo70011a() && !C11582hu.m31755c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo70009a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "AppLaunch", true, tJPlacementListener);
        }
    };

    /* renamed from: a */
    public static void m31451a() {
    }

    static {
        C11548hd.f27704a = new C11486fr();
    }

    private C11486fr() {
    }

    public final void update(Observable observable, Object obj) {
        C11491fu.C11492a aVar = C11491fu.f27587d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r5.f27576c.mo69991a() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r5.f27578e.mo70035c(null);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70007a(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == 0) goto L_0x0055
            int r1 = r6.getTaskId()
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            goto L_0x0053
        L_0x000c:
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L_0x0053
            java.util.Set r2 = r6.getCategories()
            if (r2 == 0) goto L_0x002e
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r6.getAction()
            java.lang.String r4 = "android.intent.action.MAIN"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x002e
            r2 = r0
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x0053
        L_0x0032:
            android.content.ComponentName r6 = r6.getComponent()
            if (r6 != 0) goto L_0x0039
            goto L_0x0053
        L_0x0039:
            java.lang.String r6 = r6.getClassName()
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r5.f27575b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r2.put(r6, r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0052
            int r6 = r6.intValue()
            if (r6 != r1) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = r0
        L_0x0053:
            if (r3 != 0) goto L_0x0061
        L_0x0055:
            boolean r6 = r5.f27577d
            if (r6 != 0) goto L_0x0067
            com.tapjoy.internal.fk r6 = r5.f27576c
            boolean r6 = r6.mo69991a()
            if (r6 == 0) goto L_0x0067
        L_0x0061:
            com.tapjoy.internal.gc<java.lang.Void> r6 = r5.f27578e
            r1 = 0
            r6.mo70035c(r1)
        L_0x0067:
            r5.f27577d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11486fr.mo70007a(android.app.Activity):void");
    }
}
