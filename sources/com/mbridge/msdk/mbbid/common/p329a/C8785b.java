package com.mbridge.msdk.mbbid.common.p329a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.common.p330b.C8788a;
import com.mbridge.msdk.mbbid.common.p331c.C8790a;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbbid.common.a.b */
/* compiled from: RequesManager */
public final class C8785b {

    /* renamed from: a */
    private String f21581a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21582b;

    /* renamed from: c */
    private String f21583c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f21584d;

    /* renamed from: e */
    private BidListennning f21585e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BidResponsedEx f21586f;

    /* renamed from: g */
    private int f21587g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21588h = false;

    /* renamed from: i */
    private long f21589i;

    /* renamed from: j */
    private long f21590j;

    /* renamed from: k */
    private boolean f21591k;

    /* renamed from: l */
    private int f21592l;

    /* renamed from: a */
    public final void mo58440a(boolean z) {
        this.f21591k = z;
    }

    /* renamed from: a */
    public final void mo58437a(int i) {
        this.f21592l = i;
    }

    /* renamed from: b */
    public final void mo58441b(int i) {
        this.f21587g = i;
    }

    /* renamed from: a */
    public final void mo58438a(long j) {
        this.f21589i = j;
    }

    /* renamed from: b */
    public final void mo58442b(long j) {
        this.f21590j = j;
    }

    public C8785b(String str, String str2, String str3) {
        this.f21581a = str;
        this.f21582b = str2;
        this.f21583c = str3;
        this.f21584d = C8388a.m23845e().mo56913g();
    }

    /* renamed from: b */
    public final void mo58443b(boolean z) {
        try {
            if (!this.f21588h) {
                this.f21588h = true;
                if (this.f21584d == null) {
                    m25314a("context is null");
                }
                C8788a aVar = new C8788a(this.f21584d);
                C8550d dVar = new C8550d();
                String h = C8388a.m23845e().mo56914h();
                dVar.mo57981a("app_id", h);
                dVar.mo57981a("sign", SameMD5.getMD5(h + C8388a.m23845e().mo56916j()));
                dVar.mo57981a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21582b);
                if (!TextUtils.isEmpty(this.f21581a)) {
                    dVar.mo57981a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, this.f21581a);
                }
                dVar.mo57981a("bid_floor", this.f21583c);
                dVar.mo57981a(C8550d.f20983c, C8677z.m24926b(this.f21584d, this.f21582b));
                dVar.mo57981a(C8550d.f20982b, C8473d.m24277a(this.f21582b, ""));
                String str = "1";
                dVar.mo57981a("req_type", this.f21591k ? str : "2");
                dVar.mo57981a(TJAdUnitConstants.String.ORIENTATION, C8660r.m24819e(this.f21584d) + "");
                if (this.f21587g == 296) {
                    if (this.f21589i <= 0 || this.f21590j <= 0) {
                        m25314a("bid required param is missing or error");
                        return;
                    }
                    dVar.mo57981a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21590j + "x" + this.f21589i);
                    Method method = Class.forName("com.mbridge.msdk.mbbanner.common.util.BannerUtils").getMethod("getCloseIds", new Class[]{String.class});
                    if (method.invoke((Object) null, new Object[]{this.f21582b}) instanceof String) {
                        dVar.mo57981a("close_id", method.invoke((Object) null, new Object[]{this.f21582b}).toString());
                    }
                } else if (this.f21587g == 297) {
                    if (this.f21589i <= 0 || this.f21590j <= 0) {
                        m25314a("ad display area is too small");
                        return;
                    }
                    dVar.mo57981a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21590j + "x" + this.f21589i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f21592l);
                    sb.append("");
                    dVar.mo57981a(TJAdUnitConstants.String.ORIENTATION, sb.toString());
                } else if (this.f21587g != 298) {
                    if (!z) {
                        str = "0";
                    }
                    dVar.mo57981a("rw_plus", str);
                } else if (this.f21589i <= 0 || this.f21590j <= 0) {
                    m25314a("bid required param is missing or error");
                    return;
                } else {
                    dVar.mo57981a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21590j + "x" + this.f21589i);
                }
                C87861 r15 = new C8784a(this.f21581a, this.f21582b) {
                    /* renamed from: a */
                    public final void mo58445a(BidResponsedEx bidResponsedEx) {
                        boolean unused = C8785b.this.f21588h = false;
                        BidResponsedEx unused2 = C8785b.this.f21586f = bidResponsedEx;
                        C8790a.m25332a(C8785b.this.f21584d, C8785b.this.f21582b, bidResponsedEx.getBidId());
                        C8785b.m25312a(C8785b.this, (BidResponsed) bidResponsedEx);
                    }

                    /* renamed from: a */
                    public final void mo58444a(int i, String str) {
                        boolean unused = C8785b.this.f21588h = false;
                        C8790a.m25333b(C8785b.this.f21584d, C8785b.this.f21582b, str);
                        C8785b.this.m25314a(str);
                    }
                };
                r15.f20918d = this.f21582b;
                r15.f20919e = this.f21581a;
                aVar.mo57975a(1, C8543d.m24463a().mo57966a(false, ""), dVar, (C8532e) r15);
                return;
            }
            m25314a("current unit is biding");
        } catch (Exception unused) {
            m25314a("banner module is miss");
        } catch (Throwable th) {
            m25314a(th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo58439a(BidListennning bidListennning) {
        this.f21585e = bidListennning;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25314a(String str) {
        BidListennning bidListennning = this.f21585e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25312a(C8785b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.f21585e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
