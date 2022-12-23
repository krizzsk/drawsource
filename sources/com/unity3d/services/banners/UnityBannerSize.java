package com.unity3d.services.banners;

import android.content.Context;
import android.content.res.Resources;
import com.unity3d.services.core.misc.C12081k;

public class UnityBannerSize {

    /* renamed from: a */
    private int f29023a;

    /* renamed from: b */
    private int f29024b;

    /* renamed from: com.unity3d.services.banners.UnityBannerSize$a */
    static /* synthetic */ class C11948a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29025a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.banners.UnityBannerSize$b[] r0 = com.unity3d.services.banners.UnityBannerSize.C11949b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29025a = r0
                com.unity3d.services.banners.UnityBannerSize$b r1 = com.unity3d.services.banners.UnityBannerSize.C11949b.BANNER_SIZE_STANDARD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29025a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.banners.UnityBannerSize$b r1 = com.unity3d.services.banners.UnityBannerSize.C11949b.BANNER_SIZE_LEADERBOARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29025a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.banners.UnityBannerSize$b r1 = com.unity3d.services.banners.UnityBannerSize.C11949b.BANNER_SIZE_IAB_STANDARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.banners.UnityBannerSize.C11948a.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBannerSize$b */
    private enum C11949b {
        BANNER_SIZE_STANDARD,
        BANNER_SIZE_LEADERBOARD,
        BANNER_SIZE_IAB_STANDARD,
        BANNER_SIZE_DYNAMIC;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public int m32529c(Context context) {
            int i = C11948a.f29025a[m32528b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 320 : 468;
            }
            return 728;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int m32525a(Context context) {
            int i = C11948a.f29025a[m32528b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 50 : 60;
            }
            return 90;
        }

        /* renamed from: b */
        private C11949b m32528b(Context context) {
            if (this != BANNER_SIZE_DYNAMIC) {
                return this;
            }
            int round = Math.round(C12081k.m32884a(context, (float) Resources.getSystem().getDisplayMetrics().widthPixels));
            if (round >= 728) {
                return BANNER_SIZE_LEADERBOARD;
            }
            if (round >= 468) {
                return BANNER_SIZE_IAB_STANDARD;
            }
            return BANNER_SIZE_STANDARD;
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.f29023a = i;
        this.f29024b = i2;
    }

    public static UnityBannerSize getDynamicSize(Context context) {
        C11949b bVar = C11949b.BANNER_SIZE_DYNAMIC;
        return new UnityBannerSize(bVar.m32529c(context), bVar.m32525a(context));
    }

    public int getHeight() {
        return this.f29024b;
    }

    public int getWidth() {
        return this.f29023a;
    }
}
