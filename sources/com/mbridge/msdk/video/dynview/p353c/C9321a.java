package com.mbridge.msdk.video.dynview.p353c;

/* renamed from: com.mbridge.msdk.video.dynview.c.a */
/* compiled from: EnumError */
public enum C9321a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");
    

    /* renamed from: g */
    private int f22897g;

    /* renamed from: h */
    private String f22898h;

    private C9321a(int i, String str) {
        this.f22897g = i;
        this.f22898h = str;
    }

    /* renamed from: a */
    public final int mo62771a() {
        return this.f22897g;
    }

    /* renamed from: b */
    public final String mo62772b() {
        return this.f22898h;
    }
}
