package com.mbridge.msdk.mbbid.common;

/* renamed from: com.mbridge.msdk.mbbid.common.b */
/* compiled from: BidRequestParams */
public abstract class C8787b {

    /* renamed from: a */
    private String f21594a;

    /* renamed from: b */
    private String f21595b;

    /* renamed from: c */
    private String f21596c;

    public C8787b(String str, String str2) {
        this.f21594a = str;
        this.f21595b = str2;
    }

    public C8787b(String str, String str2, String str3) {
        this.f21594a = str;
        this.f21595b = str2;
        this.f21596c = str3;
    }

    public String getmUnitId() {
        return this.f21595b;
    }

    public void setmUnitId(String str) {
        this.f21595b = str;
    }

    public String getmFloorPrice() {
        return this.f21596c;
    }

    public void setmFloorPrice(String str) {
        this.f21596c = str;
    }

    public String getmPlacementId() {
        return this.f21594a;
    }

    public void setmPlacementId(String str) {
        this.f21594a = str;
    }
}
