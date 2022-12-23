package com.mbridge.msdk.mbbid.out;

public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f21599a;

    /* renamed from: b */
    private int f21600b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f21599a = i2;
        this.f21600b = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f21599a = i2;
        this.f21600b = i;
    }

    public int getHeight() {
        return this.f21599a;
    }

    public void setHeight(int i) {
        this.f21599a = i;
    }

    public int getWidth() {
        return this.f21600b;
    }

    public void setWidth(int i) {
        this.f21600b = i;
    }
}
