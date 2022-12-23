package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8660r;

public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: b */
    private static int f21609b = 1;

    /* renamed from: c */
    private static int f21610c;

    /* renamed from: d */
    private static int f21611d;

    /* renamed from: a */
    private boolean f21612a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f21609b, f21611d, f21610c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f21612a = false;
        f21609b = i;
        int i4 = C8660r.m24829i(C8388a.m23845e().mo56913g());
        int j = C8660r.m24831j(C8388a.m23845e().mo56913g());
        int i5 = f21609b;
        if (i5 == 1) {
            if (j > i3 * 4) {
                setHeight(j - i3);
                setWidth(i4);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i5 == 2) {
            if (i4 > i2 * 4) {
                setWidth(i4 - i2);
                setHeight(j);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f21612a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58478a() {
        return this.f21612a;
    }

    public int getOrientation() {
        return f21609b;
    }
}
