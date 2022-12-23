package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.entity.C8459d;
import com.mbridge.msdk.foundation.entity.C8466k;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8420m;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.File;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.foundation.same.report.d */
/* compiled from: ReportController */
public class C8582d {

    /* renamed from: a */
    public static final String f21086a = C8582d.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f21087b;

    /* renamed from: c */
    private int f21088c = 0;

    public C8582d(Context context, int i) {
        this.f21087b = context;
        this.f21088c = i;
    }

    public C8582d(Context context) {
        this.f21087b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo58063a(int i, String str) {
        new C8596a(this.f21087b).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24662a("event", C8598e.m24663a((Campaign) null, i, "request"), this.f21087b, str), new C8597b() {
            /* renamed from: a */
            public final void mo37053a(String str) {
            }

            /* renamed from: b */
            public final void mo37054b(String str) {
            }
        });
    }

    /* renamed from: a */
    public final void mo58064a(final C8466k kVar, final Boolean bool) {
        if (kVar == null) {
            return;
        }
        if (kVar.mo57799c().equals(ShareTarget.METHOD_GET)) {
            new C8596a(this.f21087b).mo57975a(0, kVar.mo57797b(), (C8550d) null, (C8532e) new C8597b() {
                /* renamed from: b */
                public final void mo37054b(String str) {
                }

                /* renamed from: a */
                public final void mo37053a(String str) {
                    C8420m.m24001a((C8412f) C8414g.m23969a(C8582d.this.f21087b)).mo57040a(kVar.mo57797b());
                    if (bool.booleanValue() && C8420m.m24001a((C8412f) C8414g.m23969a(C8582d.this.f21087b)).mo57044b() > 20) {
                        C8396b.m23890a().mo56950c();
                    }
                }
            });
        } else if (kVar.mo57799c().equals(ShareTarget.METHOD_POST)) {
            C8596a aVar = new C8596a(this.f21087b);
            if (!TextUtils.isEmpty(kVar.mo57801d())) {
                C8550d a = C8598e.m24661a(kVar.mo57801d(), this.f21087b, kVar.mo57793a());
                if (kVar.mo57802e() > 0) {
                    a.mo57981a(TapjoyConstants.TJC_RETRY, kVar.mo57802e() + "");
                }
                aVar.mo57978c(0, kVar.mo57797b(), a, new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        C8420m.m24001a((C8412f) C8414g.m23969a(C8582d.this.f21087b)).mo57041a(kVar.mo57801d(), kVar.mo57797b(), kVar.mo57803f());
                        if (bool.booleanValue() && C8420m.m24001a((C8412f) C8414g.m23969a(C8582d.this.f21087b)).mo57039a() > 0) {
                            C8396b.m23890a().mo56950c();
                        }
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        C8420m.m24001a((C8412f) C8414g.m23969a(C8582d.this.f21087b)).mo57042a(kVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo58067a(String str, String str2, String str3) {
        try {
            C8596a aVar = new C8596a(this.f21087b);
            String str4 = "click_type=" + URLEncoder.encode("1", "utf-8") + "&" + BidResponsedEx.KEY_CID + "=" + URLEncoder.encode(str, "utf-8") + "&" + MBridgeConstans.PROPERTIES_UNIT_ID + "=" + URLEncoder.encode(str2, "utf-8") + "&" + SDKConstants.PARAM_KEY + "=" + URLEncoder.encode("2000027", "utf-8") + "&" + "http_url" + "=" + URLEncoder.encode(str3, "utf-8");
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(str4);
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(str4, this.f21087b, str2), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        } catch (Exception e) {
            C8672v.m24878d(f21086a, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo58066a(String str, final File file) {
        new C8596a(this.f21087b).mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24659a(this.f21087b, str), new C8597b() {
            /* renamed from: b */
            public final void mo37054b(String str) {
            }

            /* renamed from: a */
            public final void mo37053a(String str) {
                File file = file;
                if (file != null) {
                    file.delete();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58068a(final String str, String str2, String str3, Frame frame) {
        C8596a aVar = new C8596a(this.f21087b);
        C8550d a = C8598e.m24661a(str2, this.f21087b, str3);
        if (frame != null) {
            a.mo57981a("session_id", frame.getSessionId());
            a.mo57981a(CampaignUnit.JSON_KEY_PARENT_SESSION_ID, frame.getParentSessionId());
        }
        aVar.mo57978c(0, C8543d.m24463a().f20952a, a, new C8597b() {
            /* renamed from: b */
            public final void mo37054b(String str) {
            }

            /* renamed from: a */
            public final void mo37053a(String str) {
                if ("click_duration".equals(str) || "load_duration".equals(str)) {
                    C8396b.m23890a().mo56950c();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58065a(String str, C8459d dVar, String str2) {
        C8596a aVar = new C8596a(this.f21087b);
        String a = C8459d.m24073a(dVar);
        if (!TextUtils.isEmpty(a)) {
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(a);
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(a, this.f21087b, str2), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo58060a() {
        try {
            if (C8598e.m24679a()) {
                C8596a aVar = new C8596a(this.f21087b);
                String h = C8388a.m23845e().mo56914h();
                C2440a b = C2445b.m6020a().mo16286b(h);
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                int F = b.mo16151F();
                String str = "key=2000053&Appid=" + h + "&" + "uptips2" + "=" + b.mo16150E() + "&" + "info_status" + "=" + C8395a.m23879a().mo56944c() + "&" + "iseu" + "=" + F;
                String k = C8660r.m24832k();
                if (!TextUtils.isEmpty(k)) {
                    str = str + "&" + VungleApiClient.GAID + "=" + k;
                }
                String str2 = str + "&" + "GDPR_area" + "=" + b.mo16205aw() + "&" + "GDPR_consent" + "=" + C8395a.m23879a().mo56946e();
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(str2);
                    return;
                }
                aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(str2, this.f21087b, ""), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                    }
                });
                C8598e.m24680b();
            }
        } catch (Throwable th) {
            C8672v.m24878d(f21086a, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo58062a(int i, int i2, String str, String str2, String str3) {
        try {
            C8596a aVar = new C8596a(this.f21087b);
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000058", "utf-8"));
            sb.append("&");
            sb.append("appid");
            sb.append("=");
            sb.append(URLEncoder.encode(C8388a.m23845e().mo56914h(), "utf-8"));
            sb.append("&");
            sb.append("dl_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i + "", "utf-8"));
            sb.append("&");
            sb.append("dl_link_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i2 + "", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append("tgt_v");
            sb.append("=");
            sb.append(URLEncoder.encode(C8660r.m24826h(this.f21087b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_n");
            sb.append("=");
            sb.append(URLEncoder.encode(C8660r.m24825g(this.f21087b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_c");
            sb.append("=");
            sb.append(URLEncoder.encode(C8660r.m24822f(this.f21087b) + "", "utf-8"));
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), this.f21087b, ""), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58070a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                C8596a aVar = new C8596a(this.f21087b);
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append("hb=");
                    sb.append(1);
                    sb.append("&");
                }
                sb.append(SDKConstants.PARAM_KEY);
                sb.append("=");
                sb.append(URLEncoder.encode("2000066", "utf-8"));
                sb.append("&");
                sb.append("rid");
                sb.append("=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&");
                sb.append("rid_n");
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&");
                sb.append(BidResponsedEx.KEY_CID);
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&");
                sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
                sb.append("=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&");
                sb.append("err_method");
                sb.append("=");
                sb.append(str5);
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(sb.toString());
                    return;
                }
                aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), this.f21087b, str4), new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo58071b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            C8596a aVar = new C8596a(this.f21087b);
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000065", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), this.f21087b, str4), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58069a(String str, String str2, String str3, String str4, String str5) {
        try {
            C8596a aVar = new C8596a(this.f21087b);
            StringBuilder sb = new StringBuilder();
            int o = C8660r.m24840o(this.f21087b);
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000071", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_ERROR_REASON);
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(o + "", "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_RESULT);
            sb.append("=");
            sb.append(URLEncoder.encode("0", "utf-8"));
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), this.f21087b, str4), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58061a(int i, int i2, String str, String str2) {
        try {
            C8596a aVar = new C8596a(this.f21087b);
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append("2000112");
            sb.append("&");
            sb.append("st_net");
            sb.append("=");
            sb.append(i2);
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_RESULT);
            sb.append("=");
            sb.append(i);
            sb.append("&");
            sb.append("url");
            sb.append("=");
            sb.append(str2);
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_ERROR_REASON);
            sb.append("=");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb.append(str);
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(sb.toString());
                return;
            }
            aVar.mo57978c(0, C8543d.m24463a().f20952a, C8598e.m24661a(sb.toString(), this.f21087b, ""), new C8597b() {
                /* renamed from: a */
                public final void mo37053a(String str) {
                    C8672v.m24874a("", "reportSettingLoadFailed onSuccess");
                }

                /* renamed from: b */
                public final void mo37054b(String str) {
                    C8672v.m24874a("", "reportSettingLoadFailed onFailed:" + str);
                }
            });
        } catch (Throwable unused) {
            C8672v.m24878d(f21086a, "reportSettingLoadFailed onFailed");
        }
    }
}
