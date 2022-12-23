package com.unity3d.services.banners.view;

/* renamed from: com.unity3d.services.banners.view.a */
/* compiled from: BannerPosition */
public enum C11964a {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);
    

    /* renamed from: j */
    private final int[] f29088j;

    /* renamed from: k */
    private int f29089k;

    private C11964a(int[] iArr, int i) {
        this.f29088j = iArr;
        this.f29089k = i;
    }

    /* renamed from: a */
    public int mo70998a() {
        return this.f29089k;
    }
}
