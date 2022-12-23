package com.inmobi.media;

/* renamed from: com.inmobi.media.di */
/* compiled from: Orientation */
public enum C5923di {
    PORTRAIT(0),
    LANDSCAPE(90),
    REVERSE_PORTRAIT(180),
    REVERSE_LANDSCAPE(270);
    

    /* renamed from: e */
    public final int f15004e;

    private C5923di(int i) {
        this.f15004e = i;
    }

    /* renamed from: a */
    public final boolean mo35029a() {
        int i = this.f15004e;
        return i == LANDSCAPE.f15004e || i == REVERSE_LANDSCAPE.f15004e;
    }

    /* renamed from: a */
    public static C5923di m17609a(int i) {
        if (i == 2) {
            return REVERSE_PORTRAIT;
        }
        if (i == 3) {
            return LANDSCAPE;
        }
        if (i != 4) {
            return PORTRAIT;
        }
        return REVERSE_LANDSCAPE;
    }
}
