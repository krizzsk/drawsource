package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p288j.C8318e;
import com.ironsource.sdk.p288j.p289a.C8312b;
import com.ironsource.sdk.p288j.p289a.C8313c;
import com.ironsource.sdk.p288j.p289a.C8314d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.p */
public final class C8178p implements C8175m {

    /* renamed from: a */
    String f19873a = "";

    /* renamed from: b */
    private final C6385a f19874b;

    C8178p(String str, C6385a aVar) {
        this.f19874b = aVar;
        this.f19873a = str;
    }

    /* renamed from: a */
    private void m23353a(Runnable runnable) {
        C6385a aVar = this.f19874b;
        if (aVar != null) {
            aVar.mo35893c(runnable);
        }
    }

    /* renamed from: a */
    public final void mo56411a(Context context) {
    }

    /* renamed from: a */
    public final void mo56412a(C8292c cVar, final Map<String, String> map, final C8312b bVar) {
        if (bVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    bVar.mo56694d((String) map.get("demandSourceName"), C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56413a(final C8292c cVar, Map<String, String> map, final C8313c cVar2) {
        if (cVar2 != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56685b(cVar.f20218b, C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56415a(final String str, final C8313c cVar) {
        if (cVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo56685b(str, C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56416a(String str, String str2, C8292c cVar, C8312b bVar) {
        if (bVar != null) {
            bVar.mo56666a(C8293d.C8298e.Banner, cVar.f20218b, this.f19873a);
        }
    }

    /* renamed from: a */
    public final void mo56417a(String str, String str2, final C8292c cVar, final C8313c cVar2) {
        if (cVar2 != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56666a(C8293d.C8298e.Interstitial, cVar.f20218b, C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56418a(String str, String str2, final C8292c cVar, final C8314d dVar) {
        if (dVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo56666a(C8293d.C8298e.RewardedVideo, cVar.f20218b, C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56419a(String str, String str2, final C8318e eVar) {
        if (eVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onGetOWCreditsFailed(C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56420a(String str, String str2, Map<String, String> map, final C8318e eVar) {
        if (eVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOfferwallInitFail(C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56421a(Map<String, String> map, final C8318e eVar) {
        if (eVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOWShowFail(C8178p.this.f19873a);
                    eVar.onOfferwallInitFail(C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56422a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public final void mo56423a(final JSONObject jSONObject, final C8313c cVar) {
        if (cVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo56690c(jSONObject.optString("demandSourceName"), C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56424a(final JSONObject jSONObject, final C8314d dVar) {
        if (dVar != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo56671a(jSONObject.optString("demandSourceName"), C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo56425b(Context context) {
    }

    /* renamed from: b */
    public final void mo56426b(final C8292c cVar, Map<String, String> map, final C8313c cVar2) {
        if (cVar2 != null) {
            m23353a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo56690c(cVar.f20218b, C8178p.this.f19873a);
                }
            });
        }
    }

    /* renamed from: c */
    public final C8293d.C8296c mo56427c() {
        return C8293d.C8296c.Native;
    }

    /* renamed from: c */
    public final boolean mo56428c(String str) {
        return false;
    }

    /* renamed from: d */
    public final void mo56429d() {
    }

    public final void destroy() {
    }

    /* renamed from: e */
    public final void mo56431e() {
    }

    /* renamed from: f */
    public final void mo56432f() {
    }

    /* renamed from: g */
    public final void mo56433g() {
    }

    /* renamed from: h */
    public final void mo56434h() {
    }
}
