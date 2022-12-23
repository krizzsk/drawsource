package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8105e;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p285g.C8299e;
import com.ironsource.sdk.p286h.C8301a;
import com.ironsource.sdk.p286h.C8302b;
import com.ironsource.sdk.p286h.C8306d;
import com.ironsource.sdk.p288j.C8317d;
import com.ironsource.sdk.p288j.C8318e;
import com.ironsource.sdk.p288j.p289a.C8312b;
import com.ironsource.sdk.p288j.p289a.C8313c;
import com.ironsource.sdk.p288j.p289a.C8314d;
import com.ironsource.sdk.service.C8335a;
import com.ironsource.sdk.service.C8338d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
public class C8147g implements C8141e, C8175m {

    /* renamed from: a */
    public C8175m f19781a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f19782b = C8147g.class.getSimpleName();

    /* renamed from: c */
    private C8293d.C8295b f19783c = C8293d.C8295b.None;

    /* renamed from: d */
    private CountDownTimer f19784d;

    /* renamed from: e */
    private final C8137b f19785e = new C8137b("NativeCommandExecutor");

    /* renamed from: f */
    private final C8137b f19786f = new C8137b("ControllerCommandsExecutor");

    /* renamed from: g */
    private final C6385a f19787g;

    public C8147g(Context context, C8139c cVar, C8338d dVar, C8170j jVar, C6385a aVar) {
        this.f19787g = aVar;
        IronSourceStorageUtils.getNetworkStorageDir(context);
        final Context context2 = context;
        final C8139c cVar2 = cVar;
        final C8338d dVar2 = dVar;
        final C8170j jVar2 = jVar;
        m23282b((Runnable) new Runnable() {
            public final void run() {
                try {
                    C8175m unused = C8147g.this.f19781a = C8147g.m23279a(C8147g.this, context2, cVar2, dVar2, jVar2);
                    C8147g.this.f19781a.mo56434h();
                } catch (Exception e) {
                    C8147g.this.m23283d(Log.getStackTraceString(e));
                }
            }
        });
        this.f19784d = new CountDownTimer(200000, 1000) {
            public final void onFinish() {
                Logger.m23749i(C8147g.this.f19782b, "Global Controller Timer Finish");
                C8147g.this.m23283d("controller html - download timeout");
            }

            public final void onTick(long j) {
                String b = C8147g.this.f19782b;
                Logger.m23749i(b, "Global Controller Timer Tick " + j);
            }
        }.start();
    }

    /* renamed from: a */
    static /* synthetic */ C8202x m23279a(C8147g gVar, Context context, C8139c cVar, C8338d dVar, C8170j jVar) {
        C8104d.m23160a(C8106f.f19623b);
        C8202x xVar = new C8202x(context, jVar, cVar, gVar, gVar.f19787g);
        C8302b bVar = new C8302b(context, xVar.mo56497a(), new C8301a(C6385a.m19061a()), new C8306d(xVar.mo56497a().f20274b));
        xVar.f19984p = new C8199v(context, dVar);
        xVar.f19982n = new C8190q(context);
        xVar.f19983o = new C8192r(context);
        xVar.f19985q = new C8171k(context);
        xVar.f19986r = new C8135a(cVar);
        C8135a aVar = xVar.f19986r;
        if (xVar.f19988t == null) {
            xVar.f19988t = new C8262y() {
                /* renamed from: a */
                public final void mo56522a(String str, JSONObject jSONObject) {
                    C8202x.this.mo56506b(C8202x.m23429b(str, jSONObject.toString()));
                }
            };
        }
        aVar.f19744a = xVar.f19988t;
        xVar.f19987s = new C8173l(xVar.mo56497a().f20274b, bVar);
        return xVar;
    }

    /* renamed from: b */
    private void m23282b(Runnable runnable) {
        C6385a aVar = this.f19787g;
        if (aVar != null) {
            aVar.mo35891a(runnable);
        } else {
            Logger.m23747e(this.f19782b, "mThreadManager = null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m23283d(String str) {
        C8104d.m23161a(C8106f.f19624c, (Map<String, Object>) new C8100a().mo56293a("callfailreason", str).f19613a);
        this.f19781a = new C8178p(str, this.f19787g);
        this.f19785e.mo56393a();
        this.f19785e.mo56395b();
        C6385a aVar = this.f19787g;
        if (aVar != null) {
            aVar.mo35893c(new Runnable() {
                public final void run() {
                    C8147g.this.mo56402b();
                }
            });
        }
    }

    /* renamed from: i */
    private boolean m23284i() {
        return C8293d.C8295b.Ready.equals(this.f19783c);
    }

    /* renamed from: a */
    public final void mo56400a() {
        this.f19783c = C8293d.C8295b.Loaded;
        this.f19785e.mo56393a();
        this.f19785e.mo56395b();
    }

    /* renamed from: a */
    public final void mo56411a(Context context) {
        C8175m mVar;
        if (m23284i() && (mVar = this.f19781a) != null) {
            mVar.mo56411a(context);
        }
    }

    /* renamed from: a */
    public final void mo56412a(final C8292c cVar, final Map<String, String> map, final C8312b bVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56412a(cVar, (Map<String, String>) map, bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56413a(final C8292c cVar, final Map<String, String> map, final C8313c cVar2) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                C8100a a = new C8100a().mo56293a("demandsourcename", cVar.f20217a).mo56293a("producttype", C8105e.m23162a(cVar, C8293d.C8298e.Interstitial)).mo56293a("isbiddinginstance", Boolean.valueOf(C8105e.m23163a(cVar)));
                C8335a aVar = C8335a.f20301a;
                C8104d.m23161a(C8106f.f19630i, (Map<String, Object>) a.mo56293a("custom_c", Long.valueOf(C8335a.m23716c(cVar.f20218b))).f19613a);
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56413a(cVar, (Map<String, String>) map, cVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56414a(Runnable runnable) {
        this.f19785e.mo56394a(runnable);
    }

    /* renamed from: a */
    public final void mo56401a(String str) {
        C8104d.m23161a(C8106f.f19633l, (Map<String, Object>) new C8100a().mo56293a("callfailreason", str).f19613a);
        C8317d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new C8299e(1001, str));
            IronSourceNetwork.setInitListener((C8317d) null);
        }
        CountDownTimer countDownTimer = this.f19784d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m23283d(str);
    }

    /* renamed from: a */
    public final void mo56415a(final String str, final C8313c cVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56415a(str, cVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56416a(String str, String str2, C8292c cVar, C8312b bVar) {
        final String str3 = str;
        final String str4 = str2;
        final C8292c cVar2 = cVar;
        final C8312b bVar2 = bVar;
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56416a(str3, str4, cVar2, bVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56417a(String str, String str2, C8292c cVar, C8313c cVar2) {
        final String str3 = str;
        final String str4 = str2;
        final C8292c cVar3 = cVar;
        final C8313c cVar4 = cVar2;
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56417a(str3, str4, cVar3, cVar4);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56418a(String str, String str2, C8292c cVar, C8314d dVar) {
        final String str3 = str;
        final String str4 = str2;
        final C8292c cVar2 = cVar;
        final C8314d dVar2 = dVar;
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56418a(str3, str4, cVar2, dVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56419a(final String str, final String str2, final C8318e eVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56419a(str, str2, eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56420a(String str, String str2, Map<String, String> map, C8318e eVar) {
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C8318e eVar2 = eVar;
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56420a(str3, str4, (Map<String, String>) map2, eVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56421a(final Map<String, String> map, final C8318e eVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56421a((Map<String, String>) map, eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56422a(final JSONObject jSONObject) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56422a(jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56423a(final JSONObject jSONObject, final C8313c cVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56423a(jSONObject, cVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56424a(final JSONObject jSONObject, final C8314d dVar) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56424a(jSONObject, dVar);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo56402b() {
        if (C8293d.C8296c.Web.equals(mo56427c())) {
            C8104d.m23160a(C8106f.f19625d);
            C8317d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((C8317d) null);
            }
        }
        this.f19783c = C8293d.C8295b.Ready;
        CountDownTimer countDownTimer = this.f19784d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f19786f.mo56393a();
        this.f19786f.mo56395b();
        C8175m mVar = this.f19781a;
        if (mVar != null) {
            mVar.mo56433g();
        }
    }

    /* renamed from: b */
    public final void mo56425b(Context context) {
        C8175m mVar;
        if (m23284i() && (mVar = this.f19781a) != null) {
            mVar.mo56425b(context);
        }
    }

    /* renamed from: b */
    public final void mo56426b(final C8292c cVar, final Map<String, String> map, final C8313c cVar2) {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56426b(cVar, map, cVar2);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo56403b(String str) {
        C8104d.m23161a(C8106f.f19642u, (Map<String, Object>) new C8100a().mo56293a("generalmessage", str).f19613a);
        CountDownTimer countDownTimer = this.f19784d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m23283d(str);
    }

    /* renamed from: c */
    public final C8293d.C8296c mo56427c() {
        C8175m mVar = this.f19781a;
        return mVar != null ? mVar.mo56427c() : C8293d.C8296c.None;
    }

    /* renamed from: c */
    public final boolean mo56428c(String str) {
        if (this.f19781a == null || !m23284i()) {
            return false;
        }
        return this.f19781a.mo56428c(str);
    }

    /* renamed from: d */
    public final void mo56429d() {
        this.f19786f.mo56394a(new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.mo56429d();
                }
            }
        });
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f19784d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f19784d = null;
        m23282b((Runnable) new Runnable() {
            public final void run() {
                if (C8147g.this.f19781a != null) {
                    C8147g.this.f19781a.destroy();
                    C8175m unused = C8147g.this.f19781a = null;
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo56431e() {
        C8175m mVar;
        if (m23284i() && (mVar = this.f19781a) != null) {
            mVar.mo56431e();
        }
    }

    /* renamed from: f */
    public final void mo56432f() {
        C8175m mVar;
        if (m23284i() && (mVar = this.f19781a) != null) {
            mVar.mo56432f();
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo56433g() {
    }

    /* renamed from: h */
    public final void mo56434h() {
    }
}
