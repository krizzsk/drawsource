package com.mbridge.msdk.mbbid.out;

public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f21601a;

    /* renamed from: b */
    private int f21602b;

    public BannerBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f21601a = i2;
        this.f21602b = i;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f21601a = i2;
        this.f21602b = i;
    }

    public int getHeight() {
        return this.f21601a;
    }

    public void setHeight(int i) {
        this.f21601a = i;
    }

    public int getWidth() {
        return this.f21602b;
    }

    public void setWidth(int i) {
        this.f21602b = i;
    }
}
