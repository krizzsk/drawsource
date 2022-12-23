package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.aaid.OguryAaid;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p377ed.internal.C10025fk;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fc */
public final class C10015fc {

    /* renamed from: a */
    public static final C10016a f25180a = new C10016a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static C10015fc f25181k;

    /* renamed from: b */
    private final Context f25182b;

    /* renamed from: c */
    private final C10025fk f25183c;

    /* renamed from: d */
    private final C10017fd f25184d;

    /* renamed from: e */
    private final C10040fx f25185e;

    /* renamed from: f */
    private final C9967dv f25186f;

    /* renamed from: g */
    private final C10047gb f25187g;

    /* renamed from: h */
    private final C9959do f25188h;

    /* renamed from: i */
    private boolean f25189i;

    /* renamed from: j */
    private OguryAaid f25190j;

    public /* synthetic */ C10015fc(Context context, C10025fk fkVar, C10017fd fdVar, C10040fx fxVar, C9967dv dvVar, C10047gb gbVar, C9959do doVar, byte b) {
        this(context, fkVar, fdVar, fxVar, dvVar, gbVar, doVar);
    }

    private C10015fc(Context context, C10025fk fkVar, C10017fd fdVar, C10040fx fxVar, C9967dv dvVar, C10047gb gbVar, C9959do doVar) {
        this.f25182b = context;
        this.f25183c = fkVar;
        this.f25184d = fdVar;
        this.f25185e = fxVar;
        this.f25186f = dvVar;
        this.f25187g = gbVar;
        this.f25188h = doVar;
        this.f25190j = fxVar.mo64731a();
    }

    /* renamed from: com.ogury.ed.internal.fc$a */
    public static final class C10016a {
        public /* synthetic */ C10016a(byte b) {
            this();
        }

        private C10016a() {
        }

        /* renamed from: a */
        public final C10015fc mo64648a(Context context) {
            C10015fc c;
            C10263mq.m29882b(context, "context");
            C10057gl.m29201a("Profig.getInstance");
            synchronized (this) {
                if (C10015fc.f25181k == null) {
                    C10016a aVar = C10015fc.f25180a;
                    C10016a aVar2 = C10015fc.f25180a;
                    Context applicationContext = context.getApplicationContext();
                    C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
                    C10015fc.f25181k = m29023b(applicationContext);
                }
                c = C10015fc.f25181k;
                C10263mq.m29878a((Object) c);
            }
            return c;
        }

        /* renamed from: b */
        private static C10015fc m29023b(Context context) {
            C10025fk.C10026a aVar = C10025fk.f25214a;
            C10025fk a = C10025fk.C10026a.m29075a(context);
            C10017fd fdVar = new C10017fd(new C10008ez(context), new C10012fa(context), new C10040fx(context));
            C9968dw dwVar = C9968dw.f25057a;
            return new C10015fc(context, a, fdVar, new C10040fx(context), C9968dw.m28771a(context), new C10048gc(), new C9959do(), (byte) 0);
        }
    }

    /* renamed from: d */
    private final void m29017d() {
        if (m29018e()) {
            this.f25183c.mo64672a(0);
            this.f25183c.mo64681e();
        }
    }

    /* renamed from: e */
    private final boolean m29018e() {
        return this.f25183c.mo64683f() != System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1);
    }

    /* renamed from: f */
    private final void m29019f() {
        this.f25183c.mo64672a(this.f25183c.mo64671a() + 1);
    }

    /* renamed from: a */
    private final C10019ff m29009a(boolean z) {
        C10263mq.m29874a("Profig - force profig ", (Object) Boolean.valueOf(z));
        this.f25190j = this.f25185e.mo64731a();
        return new C10019ff(this.f25184d, this.f25183c, z);
    }

    /* renamed from: a */
    public final void mo64646a() {
        OguryIntegrationLogger.m28105d("[Ads][setup] Synchronisation of the configuration has just been required");
        this.f25183c.mo64687j();
        mo64647b();
    }

    /* renamed from: b */
    public final void mo64647b() throws C9997eq {
        OguryIntegrationLogger.m28105d("[Ads][setup] Synchronizing configuration...");
        boolean k = this.f25183c.mo64688k();
        if (!this.f25189i || k) {
            C10263mq.m29874a("Profig - syncProfigIfNecessary ", (Object) Boolean.valueOf(k));
            this.f25189i = true;
            m29017d();
            C10018fe a = m29009a(k).mo64656a();
            StringBuilder sb = new StringBuilder("Profig - profigRequest ");
            sb.append(k);
            sb.append(' ');
            sb.append(a);
            if (!this.f25187g.mo64776a(this.f25182b)) {
                OguryIntegrationLogger.m28105d("[Ads][setup] Impossible to join Ogury servers. No Internet connection");
                this.f25189i = false;
                return;
            }
            if (a.mo64650a()) {
                OguryIntegrationLogger.m28105d("[Ads][setup] Synchronizing configuration from servers...");
                m29011a(a);
            } else {
                OguryIntegrationLogger.m28105d("[Ads][setup] Configuration synchronized");
            }
            this.f25189i = false;
            return;
        }
        OguryIntegrationLogger.m28105d("[Ads][setup] Configuration is already synchronizing");
    }

    /* renamed from: a */
    private final void m29011a(C10018fe feVar) {
        C10263mq.m29874a("making profig api call ", (Object) feVar);
        try {
            OguryNetworkResponse a = this.f25186f.mo64486a(feVar.mo64651b());
            if (a instanceof OguryNetworkResponse.Success) {
                JSONObject jSONObject = new JSONObject(((OguryNetworkResponse.Success) a).getResponseBody());
                C9959do.m28749a(jSONObject);
                OguryIntegrationLogger.m28105d("[Ads][setup] Configuration synchronized");
                m29012a(feVar, jSONObject);
            } else if (a instanceof OguryNetworkResponse.Failure) {
                OguryIntegrationLogger.m28105d("[Ads][setup] Failed to synchronize configuration (" + ((OguryNetworkResponse.Failure) a).getException().getMessage() + ')');
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C10263mq.m29879a((Object) exception, "response.exception");
                m29015a(exception);
            }
        } catch (Exception e) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Failed to synchronize configuration (" + e.getMessage() + ')');
            m29015a((Throwable) e);
        }
    }

    /* renamed from: a */
    private final void m29015a(Throwable th) {
        if (C10057gl.m29203b(th)) {
            m29019f();
            m29020g();
        }
        if (th instanceof C9997eq) {
            throw th;
        }
    }

    /* renamed from: a */
    private final void m29012a(C10018fe feVar, JSONObject jSONObject) {
        m29019f();
        m29020g();
        m29014a(feVar.mo64652c());
        C10025fk fkVar = this.f25183c;
        String id = this.f25190j.getId();
        C10263mq.m29879a((Object) id, "aaid.id");
        fkVar.mo64676b(id);
        this.f25183c.mo64673a(System.currentTimeMillis());
        C10030fo foVar = C10030fo.f25241a;
        m29013a(C10030fo.m29118a(jSONObject), jSONObject);
    }

    /* renamed from: a */
    private final void m29014a(String str) {
        if (str != null) {
            this.f25183c.mo64674a(str);
        }
    }

    /* renamed from: g */
    private final void m29020g() {
        this.f25183c.mo64680d(C10061go.m29208a());
    }

    /* renamed from: a */
    private final void m29013a(C10032fq fqVar, JSONObject jSONObject) {
        if (fqVar instanceof C10028fm) {
            OguryIntegrationLogger.m28105d("[Ads][setup] Saving configuration...");
            C10029fn fnVar = C10029fn.f25239a;
            C10029fn.m29115a((C10028fm) fqVar);
            C10025fk fkVar = this.f25183c;
            String jSONObject2 = jSONObject.toString();
            C10263mq.m29879a((Object) jSONObject2, "profigJsonResponse.toString()");
            fkVar.mo64678c(jSONObject2);
            OguryIntegrationLogger.m28105d("[Ads][setup] Configuration saved");
        } else if (fqVar instanceof C10021fg) {
            OguryIntegrationLogger.m28105d("[Ads][setup] New configuration synchronization requested");
            mo64646a();
        } else if (fqVar instanceof C10027fl) {
            OguryIntegrationLogger.m28106e("[Ads][setup] Invalid configuration (empty)");
        }
    }
}
