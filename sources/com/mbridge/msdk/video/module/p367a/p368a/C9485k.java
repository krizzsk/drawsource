package com.mbridge.msdk.video.module.p367a.p368a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.C8458c;
import com.mbridge.msdk.foundation.entity.C8460e;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8407b;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8416i;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p372a.C9627a;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.module.a.a.k */
/* compiled from: StatisticsOnNotifyListener */
public class C9485k extends C9480f {

    /* renamed from: a */
    protected boolean f23498a;

    /* renamed from: b */
    protected CampaignEx f23499b;

    /* renamed from: c */
    protected List<CampaignEx> f23500c;

    /* renamed from: d */
    protected boolean f23501d = false;

    /* renamed from: e */
    protected C9641a f23502e;

    /* renamed from: f */
    protected C9630c f23503f;

    /* renamed from: g */
    protected String f23504g;

    /* renamed from: h */
    protected String f23505h;

    /* renamed from: i */
    protected C9473a f23506i = new C9480f();

    /* renamed from: j */
    protected int f23507j = 1;

    /* renamed from: k */
    private boolean f23508k = false;

    /* renamed from: l */
    private boolean f23509l = false;

    /* renamed from: m */
    private boolean f23510m = false;

    /* renamed from: a */
    public final void mo63209a(CampaignEx campaignEx) {
        this.f23499b = campaignEx;
    }

    /* renamed from: a */
    public final void mo63211a(List<CampaignEx> list) {
        this.f23500c = list;
    }

    public C9485k(CampaignEx campaignEx, C9641a aVar, C9630c cVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        if (!z && campaignEx != null && C8616ad.m24718b(str2) && aVar != null && aVar2 != null) {
            this.f23499b = campaignEx;
            this.f23505h = str;
            this.f23504g = str2;
            this.f23502e = aVar;
            this.f23503f = cVar;
            this.f23506i = aVar2;
            this.f23498a = true;
            this.f23507j = i;
            this.f23501d = false;
        } else if (z && campaignEx != null && C8616ad.m24718b(str2) && aVar2 != null) {
            this.f23499b = campaignEx;
            this.f23505h = str;
            this.f23504g = str2;
            this.f23502e = aVar;
            this.f23503f = cVar;
            this.f23506i = aVar2;
            this.f23498a = true;
            this.f23507j = i;
            this.f23501d = true;
        }
    }

    /* renamed from: a */
    public void mo62631a(int i, Object obj) {
        super.mo62631a(i, obj);
        this.f23506i.mo62631a(i, obj);
    }

    /* renamed from: a */
    public final void mo63207a(int i) {
        if (this.f23499b == null) {
            return;
        }
        if (i == 1 || i == 2) {
            C9499b.m27021a(C8388a.m23845e().mo56913g(), this.f23499b, i, this.f23507j);
        }
    }

    /* renamed from: a */
    public final void mo63206a() {
        if (this.f23498a && this.f23499b != null) {
            C8468m mVar = new C8468m("2000061", this.f23499b.getId(), this.f23499b.getRequestId(), this.f23499b.getRequestIdNotice(), this.f23504g, C8660r.m24840o(C8388a.m23845e().mo56913g()));
            mVar.mo57816a(this.f23499b.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            C8580c.m24609b(mVar, C8388a.m23845e().mo56913g(), this.f23504g);
        }
    }

    /* renamed from: a */
    public final void mo63208a(int i, String str) {
        if (this.f23499b != null) {
            C8580c.m24611c(new C8468m("2000062", this.f23499b.getId(), this.f23499b.getRequestId(), this.f23499b.getRequestIdNotice(), this.f23504g, C8660r.m24840o(C8388a.m23845e().mo56913g()), i, str), C8388a.m23845e().mo56913g(), this.f23504g);
        }
    }

    /* renamed from: b */
    public final void mo63213b(int i) {
        CampaignEx campaignEx = this.f23499b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    noticeUrl = sb.toString();
                } else if (i == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f23499b.setNoticeUrl(noticeUrl);
            }
        }
    }

    /* renamed from: b */
    public final void mo63212b() {
        C94861 r0 = new Runnable() {
            public final void run() {
                try {
                    if (C9485k.this.f23498a && C9485k.this.f23499b != null && C8616ad.m24718b(C9485k.this.f23504g) && C8388a.m23845e().mo56913g() != null) {
                        C8416i a = C8416i.m23982a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                        C8460e eVar = new C8460e();
                        eVar.mo57715a(System.currentTimeMillis());
                        eVar.mo57718b(C9485k.this.f23504g);
                        eVar.mo57716a(C9485k.this.f23499b.getId());
                        a.mo57026a(eVar);
                    }
                } catch (Throwable th) {
                    C8672v.m24875a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        if (C8396b.m23890a().mo56951d()) {
            C8498b.m24359a().execute(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: c */
    public final void mo63215c() {
        try {
            C94872 r0 = new Runnable() {
                public final void run() {
                    try {
                        if (C9485k.this.f23498a && C9485k.this.f23499b != null && C8616ad.m24718b(C9485k.this.f23504g)) {
                            C9627a.m27316a().mo63510a(C9485k.this.f23499b, C9485k.this.f23504g);
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        C9627a.m27316a().mo63521c(C9485k.this.f23505h, C9485k.this.f23499b.getAdType());
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        C8672v.m24874a("NotifyListener", th.getMessage());
                    }
                }
            };
            if (C8396b.m23890a().mo56951d()) {
                C8498b.m24359a().execute(r0);
            } else {
                r0.run();
            }
        } catch (Throwable th) {
            C8672v.m24875a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo63216d() {
        C9641a aVar = this.f23502e;
        if (aVar != null) {
            aVar.mo63631b(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo63217e() {
        String str;
        try {
            if (this.f23499b != null && this.f23499b.isDynamicView() && this.f23501d && !this.f23499b.isCampaignIsFiltered()) {
                this.f23509l = true;
            } else if (this.f23498a && !TextUtils.isEmpty(this.f23499b.getOnlyImpressionURL()) && C8473d.f20772a != null && !C8473d.f20772a.containsKey(this.f23499b.getOnlyImpressionURL()) && !this.f23509l) {
                C8473d.f20772a.put(this.f23499b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f23499b.getOnlyImpressionURL();
                if (this.f23499b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f23499b.getCbt() + "&tmorl=" + this.f23507j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f23499b.getCbt() + "&tmorl=" + this.f23507j;
                }
                String str2 = str;
                if (!this.f23501d || this.f23499b.isCampaignIsFiltered()) {
                    C6765a.m20558a(C8388a.m23845e().mo56913g(), this.f23499b, this.f23504g, str2, false, true, C6772a.f17857h);
                    mo63215c();
                }
                this.f23509l = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo63218f() {
        String str;
        try {
            if (this.f23498a && !this.f23508k && !TextUtils.isEmpty(this.f23499b.getImpressionURL())) {
                this.f23508k = true;
                if (this.f23499b.isBidCampaign() && this.f23499b != null) {
                    HashMap hashMap = new HashMap();
                    List<C8458c> b = C8407b.m23908a(C8388a.m23845e().mo56913g()).mo56972b(this.f23499b.getCampaignUnitId(), this.f23499b.getRequestId());
                    if (!(b == null || b.size() <= 0 || b.get(0) == null)) {
                        if (b.get(0).mo57692d() == 1) {
                            hashMap.put("encrypt_p=", "encrypt_p=" + b.get(0).mo57687b());
                            hashMap.put("irlfa=", "irlfa=" + 1);
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                String str3 = (String) entry.getValue();
                                this.f23499b.setImpressionURL(this.f23499b.getImpressionURL().replaceAll(str2, str3));
                                this.f23499b.setOnlyImpressionURL(this.f23499b.getOnlyImpressionURL().replaceAll(str2, str3));
                            }
                        }
                        C8672v.m24874a("BidReplaceCampignDao", "removeReplace count " + C8407b.m23908a(C8388a.m23845e().mo56913g()).mo56968a(this.f23499b.getRequestId()));
                    }
                }
                String impressionURL = this.f23499b.getImpressionURL();
                if (this.f23499b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f23499b.getCbt() + "&tmorl=" + this.f23507j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f23499b.getCbt() + "&tmorl=" + this.f23507j;
                }
                C6765a.m20558a(C8388a.m23845e().mo56913g(), this.f23499b, this.f23504g, str, false, true, C6772a.f17856g);
                C9499b.m27020a(C8388a.m23845e().mo56913g(), this.f23499b);
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C8417j.m23986a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo57032b(C9485k.this.f23499b.getId());
                        } catch (Throwable th) {
                            C8672v.m24875a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f23498a && C8473d.f20775d != null && !TextUtils.isEmpty(this.f23499b.getId())) {
                    C8473d.m24279a(this.f23504g, this.f23499b, "reward");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            C8672v.m24875a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo63219g() {
        List<String> pv_urls;
        try {
            if (this.f23498a && !this.f23510m && this.f23499b != null) {
                this.f23510m = true;
                if ((!this.f23499b.isDynamicView() || !this.f23501d || this.f23499b.isCampaignIsFiltered()) && (pv_urls = this.f23499b.getPv_urls()) != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C6765a.m20557a(C8388a.m23845e().mo56913g(), this.f23499b, this.f23504g, a, false, true);
                    }
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d("NotifyListener", th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo63220h() {
        CampaignEx campaignEx = this.f23499b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f23499b.getNativeVideoTracking() != null && this.f23499b.getNativeVideoTracking().mo57767h() != null) {
            Context g = C8388a.m23845e().mo56913g();
            CampaignEx campaignEx2 = this.f23499b;
            C6765a.m20559a(g, campaignEx2, campaignEx2.getCampaignUnitId(), this.f23499b.getNativeVideoTracking().mo57767h(), false, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63210a(String str) {
        try {
            if (this.f23498a) {
                C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                C8468m mVar = null;
                if (!TextUtils.isEmpty(this.f23499b.getNoticeUrl())) {
                    int o = C8660r.m24840o(C8388a.m23845e().mo56913g());
                    mVar = new C8468m("2000021", o, this.f23499b.getNoticeUrl(), str, C8660r.m24806a(C8388a.m23845e().mo56913g(), o));
                } else if (!TextUtils.isEmpty(this.f23499b.getClickURL())) {
                    int o2 = C8660r.m24840o(C8388a.m23845e().mo56913g());
                    mVar = new C8468m("2000021", o2, this.f23499b.getClickURL(), str, C8660r.m24806a(C8388a.m23845e().mo56913g(), o2));
                }
                if (mVar != null) {
                    mVar.mo57846n(this.f23499b.getId());
                    mVar.mo57828e(this.f23499b.getVideoUrlEncode());
                    mVar.mo57850p(str);
                    mVar.mo57840k(this.f23499b.getRequestId());
                    mVar.mo57842l(this.f23499b.getRequestIdNotice());
                    mVar.mo57844m(this.f23504g);
                    a.mo57056a(mVar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63214b(String str) {
        List<CampaignEx> list;
        if (this.f23499b != null && (list = this.f23500c) != null && list.size() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("camp_position")) {
                    this.f23499b = this.f23500c.get(jSONObject.getInt("camp_position"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
