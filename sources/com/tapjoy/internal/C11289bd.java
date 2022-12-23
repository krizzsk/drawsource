package com.tapjoy.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.tapjoy.internal.bd */
public final class C11289bd {

    /* renamed from: a */
    public static final C11288bc<Point> f26951a = new C11288bc<Point>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            Point point = new Point();
            bhVar.mo69722h();
            while (bhVar.mo69724j()) {
                String l = bhVar.mo69726l();
                if ("x".equals(l)) {
                    point.x = bhVar.mo69732r();
                } else if ("y".equals(l)) {
                    point.y = bhVar.mo69732r();
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return point;
        }
    };

    /* renamed from: b */
    public static final C11288bc<Rect> f26952b = new C11288bc<Rect>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            Rect rect = new Rect();
            int i = C112923.f26953a[bhVar.mo69725k().ordinal()];
            if (i == 1) {
                bhVar.mo69720f();
                rect.left = bhVar.mo69732r();
                rect.top = bhVar.mo69732r();
                rect.right = bhVar.mo69732r();
                rect.bottom = bhVar.mo69732r();
                while (bhVar.mo69724j()) {
                    bhVar.mo69733s();
                }
                bhVar.mo69721g();
            } else if (i == 2) {
                bhVar.mo69722h();
                while (bhVar.mo69724j()) {
                    String l = bhVar.mo69726l();
                    if ("left".equals(l)) {
                        rect.left = bhVar.mo69732r();
                    } else if ("top".equals(l)) {
                        rect.top = bhVar.mo69732r();
                    } else if ("right".equals(l)) {
                        rect.right = bhVar.mo69732r();
                    } else if (TJAdUnitConstants.String.BOTTOM.equals(l)) {
                        rect.bottom = bhVar.mo69732r();
                    } else {
                        bhVar.mo69733s();
                    }
                }
                bhVar.mo69723i();
            } else {
                throw new IllegalStateException("Unexpected token: " + bhVar.mo69725k());
            }
            return rect;
        }
    };

    /* renamed from: com.tapjoy.internal.bd$3 */
    static /* synthetic */ class C112923 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26953a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tapjoy.internal.bm[] r0 = com.tapjoy.internal.C11305bm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26953a = r0
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26953a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11305bm.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11289bd.C112923.<clinit>():void");
        }
    }
}
