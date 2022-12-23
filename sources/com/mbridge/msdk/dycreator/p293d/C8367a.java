package com.mbridge.msdk.dycreator.p293d;

import com.mbridge.msdk.dycreator.p297g.C8378a;
import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8385h;

/* renamed from: com.mbridge.msdk.dycreator.d.a */
/* compiled from: SubjectFactory */
public final class C8367a {

    /* renamed from: a */
    private static volatile C8367a f20428a;

    /* renamed from: com.mbridge.msdk.dycreator.d.a$a */
    /* compiled from: SubjectFactory */
    public enum C8369a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private C8367a() {
    }

    /* renamed from: a */
    public static C8367a m23815a() {
        if (f20428a == null) {
            synchronized (C8367a.class) {
                if (f20428a == null) {
                    f20428a = new C8367a();
                }
            }
        }
        return f20428a;
    }

    /* renamed from: com.mbridge.msdk.dycreator.d.a$1 */
    /* compiled from: SubjectFactory */
    static /* synthetic */ class C83681 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20429a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.mbridge.msdk.dycreator.d.a$a[] r0 = com.mbridge.msdk.dycreator.p293d.C8367a.C8369a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20429a = r0
                com.mbridge.msdk.dycreator.d.a$a r1 = com.mbridge.msdk.dycreator.p293d.C8367a.C8369a.VIEW_OBSERVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20429a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.d.a$a r1 = com.mbridge.msdk.dycreator.p293d.C8367a.C8369a.CLICK_OBSERVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20429a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mbridge.msdk.dycreator.d.a$a r1 = com.mbridge.msdk.dycreator.p293d.C8367a.C8369a.EFFECT_OBSERVER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20429a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mbridge.msdk.dycreator.d.a$a r1 = com.mbridge.msdk.dycreator.p293d.C8367a.C8369a.REPORT_OBSERVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.p293d.C8367a.C83681.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final <T extends C8378a> T mo56877a(C8369a aVar) {
        int i = C83681.f20429a[aVar.ordinal()];
        if (i == 1) {
            return new C8381d();
        }
        if (i == 2) {
            return new C8380c();
        }
        if (i == 3) {
            return new C8383f();
        }
        if (i != 4) {
            return null;
        }
        return new C8385h();
    }
}
