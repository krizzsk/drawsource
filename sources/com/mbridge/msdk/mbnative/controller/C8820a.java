package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.a */
/* compiled from: ImpressionTracker */
public final class C8820a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakReference<ViewTreeObserver> f21731a;

    /* renamed from: b */
    private List<View> f21732b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewTreeObserver.OnPreDrawListener f21733c = null;

    /* renamed from: d */
    private C8824a f21734d;

    /* renamed from: e */
    private Handler f21735e;

    /* renamed from: f */
    private boolean f21736f;

    /* renamed from: com.mbridge.msdk.mbnative.controller.a$a */
    /* compiled from: ImpressionTracker */
    public interface C8824a {
        /* renamed from: a */
        void mo58503a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public C8820a(List<View> list, C8824a aVar, Handler handler) {
        ArrayList arrayList = new ArrayList();
        this.f21732b = arrayList;
        this.f21734d = aVar;
        this.f21735e = handler;
        if (list != null) {
            this.f21732b = list;
        } else {
            arrayList.clear();
        }
        try {
            m25445b();
        } catch (Throwable th) {
            C8672v.m24875a("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f21733c = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C8820a.this.m25445b();
                    return true;
                }
            };
        } catch (Throwable th2) {
            C8672v.m24875a("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25445b() {
        if (!this.f21736f) {
            Handler handler = this.f21735e;
            if (handler != null) {
                handler.postDelayed(new Runnable() {
                    public final void run() {
                        C8820a.m25446b(C8820a.this);
                    }
                }, 100);
            }
            this.f21736f = true;
        }
    }

    /* renamed from: a */
    public final void mo58514a(View view) {
        final View view2 = null;
        if (view != null) {
            view2 = C8834d.m25502a(view.getContext(), view);
            this.f21732b.add(view);
        } else {
            List<View> list = this.f21732b;
            if (list != null && list.size() > 0) {
                int i = 0;
                while (i < this.f21732b.size() && ((r1 = this.f21732b.get(i)) == null || (view2 = C8834d.m25502a(r1.getContext(), r1)) == null)) {
                    i++;
                }
            }
        }
        if (view2 != null) {
            view2.post(new Runnable() {
                public final void run() {
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                        WeakReference unused = C8820a.this.f21731a = new WeakReference(viewTreeObserver);
                        if (C8820a.this.f21733c != null) {
                            viewTreeObserver.addOnPreDrawListener(C8820a.this.f21733c);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo58513a() {
        try {
            this.f21736f = false;
            if (!(this.f21731a == null || this.f21731a.get() == null)) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f21731a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f21733c);
                }
                this.f21731a.clear();
            }
            this.f21734d = null;
            this.f21733c = null;
            if (this.f21732b != null) {
                this.f21732b.clear();
            }
            this.f21732b = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f A[Catch:{ Exception -> 0x008d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m25446b(com.mbridge.msdk.mbnative.controller.C8820a r11) {
        /*
            r0 = 0
            r11.f21736f = r0     // Catch:{ Exception -> 0x008d }
            java.util.List<android.view.View> r1 = r11.f21732b     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x008d
            java.util.List<android.view.View> r1 = r11.f21732b     // Catch:{ Exception -> 0x008d }
            int r1 = r1.size()     // Catch:{ Exception -> 0x008d }
            if (r1 <= 0) goto L_0x008d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x008d }
            r1.<init>()     // Catch:{ Exception -> 0x008d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x008d }
            r2.<init>()     // Catch:{ Exception -> 0x008d }
            r3 = r0
        L_0x001a:
            java.util.List<android.view.View> r4 = r11.f21732b     // Catch:{ Exception -> 0x008d }
            int r4 = r4.size()     // Catch:{ Exception -> 0x008d }
            if (r3 >= r4) goto L_0x0075
            java.util.List<android.view.View> r4 = r11.f21732b     // Catch:{ Exception -> 0x008d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x008d }
            android.view.View r4 = (android.view.View) r4     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x0068
            int r5 = r4.getVisibility()     // Catch:{ Exception -> 0x008d }
            if (r5 == 0) goto L_0x0033
            goto L_0x0068
        L_0x0033:
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x008d }
            r5.<init>()     // Catch:{ Exception -> 0x008d }
            boolean r6 = r4.getGlobalVisibleRect(r5)     // Catch:{ Exception -> 0x008d }
            if (r6 != 0) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            int r6 = r5.height()     // Catch:{ Exception -> 0x008d }
            int r5 = r5.width()     // Catch:{ Exception -> 0x008d }
            int r6 = r6 * r5
            long r5 = (long) r6     // Catch:{ Exception -> 0x008d }
            int r7 = r4.getHeight()     // Catch:{ Exception -> 0x008d }
            int r8 = r4.getWidth()     // Catch:{ Exception -> 0x008d }
            int r7 = r7 * r8
            long r7 = (long) r7     // Catch:{ Exception -> 0x008d }
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            double r5 = (double) r5     // Catch:{ Exception -> 0x008d }
            double r7 = (double) r7     // Catch:{ Exception -> 0x008d }
            r9 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r7 = r7 * r9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = r0
        L_0x0069:
            if (r5 == 0) goto L_0x006f
            r1.add(r4)     // Catch:{ Exception -> 0x008d }
            goto L_0x0072
        L_0x006f:
            r2.add(r4)     // Catch:{ Exception -> 0x008d }
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0075:
            com.mbridge.msdk.mbnative.controller.a$a r0 = r11.f21734d     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x007e
            com.mbridge.msdk.mbnative.controller.a$a r0 = r11.f21734d     // Catch:{ Exception -> 0x008d }
            r0.mo58503a(r1, r2)     // Catch:{ Exception -> 0x008d }
        L_0x007e:
            int r0 = r1.size()     // Catch:{ Exception -> 0x008d }
            if (r0 <= 0) goto L_0x0087
            r11.mo58513a()     // Catch:{ Exception -> 0x008d }
        L_0x0087:
            r1.clear()     // Catch:{ Exception -> 0x008d }
            r2.clear()     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.C8820a.m25446b(com.mbridge.msdk.mbnative.controller.a):void");
    }
}
