package com.fyber.inneractive.sdk.flow;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.C4163a;
import com.fyber.inneractive.sdk.bidder.adm.C4168e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4350e;
import com.fyber.inneractive.sdk.metrics.C4415c;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.m */
public class C4365m implements C4371p, C4380v {

    /* renamed from: a */
    public final String f10731a;

    /* renamed from: b */
    public InneractiveAdSpot.RequestListener f10732b;

    /* renamed from: c */
    public InneractiveAdRequest f10733c;

    /* renamed from: d */
    public C4350e.C4352b f10734d;

    /* renamed from: e */
    public C4361j f10735e;

    /* renamed from: f */
    public C4391x f10736f;

    /* renamed from: g */
    public Set<C4391x> f10737g;

    /* renamed from: h */
    public C4349d f10738h;

    /* renamed from: i */
    public C4368c f10739i;

    /* renamed from: j */
    public boolean f10740j = true;

    /* renamed from: k */
    public boolean f10741k = false;

    /* renamed from: l */
    public C4353f f10742l;

    /* renamed from: com.fyber.inneractive.sdk.flow.m$a */
    public class C4366a implements C4168e.C4169a {

        /* renamed from: a */
        public final /* synthetic */ C4168e f10743a;

        /* renamed from: b */
        public final /* synthetic */ String f10744b;

        public C4366a(C4168e eVar, String str) {
            this.f10743a = eVar;
            this.f10744b = str;
        }

        /* renamed from: a */
        public void mo24541a(Exception exc, InneractiveErrorCode inneractiveErrorCode, C5233e... eVarArr) {
            C4507o oVar;
            C5233e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
            C4350e.C4352b bVar = C4365m.this.f10734d;
            if (bVar != null) {
                ((C4369n) bVar).mo24543a((InneractiveAdRequest) null, eVar, new InneractiveInfrastructureError(inneractiveErrorCode));
            }
            C4365m mVar = C4365m.this;
            String str = this.f10744b;
            mVar.getClass();
            if (inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR)) {
                oVar = C4507o.FATAL_ADM_MARKUP_FETCHING_ERROR;
            } else {
                oVar = C4507o.FATAL_ADM_PARSING_ERROR;
            }
            if (eVar != null) {
                eVar.f13864A = false;
            }
            C4511q.C4512a aVar = new C4511q.C4512a(eVar);
            aVar.f11163b = oVar;
            aVar.f11162a = null;
            aVar.f11165d = null;
            JSONObject jSONObject = new JSONObject();
            String name = exc.getClass().getName();
            try {
                jSONObject.put("exception", name);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "exception", name);
            }
            String localizedMessage = exc.getLocalizedMessage();
            try {
                jSONObject.put("message", localizedMessage);
            } catch (Exception unused2) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", localizedMessage);
            }
            try {
                jSONObject.put("admPayload", str);
            } catch (Exception unused3) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "admPayload", str);
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$b */
    public class C4367b implements Runnable {
        public C4367b() {
        }

        public void run() {
            C4365m.this.mo24538b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$c */
    public interface C4368c {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    public C4365m() {
        String uuid = UUID.randomUUID().toString();
        this.f10731a = uuid;
        this.f10737g = new HashSet();
        IAlog.m16446a("%sInneractiveAdSpotImpl created with UID: %s", mo24539c(), uuid);
    }

    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C4391x xVar = (C4391x) inneractiveUnitController;
            xVar.setAdSpot(this);
            if (this.f10737g.size() > 0) {
                Iterator it = new HashSet(this.f10737g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        C4391x xVar2 = this.f10736f;
                        if (xVar2 != null && xVar2.equals(inneractiveUnitController2)) {
                            this.f10736f.destroy();
                            this.f10736f = null;
                        }
                        this.f10737g.remove(inneractiveUnitController2);
                    }
                }
            }
            this.f10737g.add(xVar);
            if (this.f10735e != null) {
                mo24540d();
            }
        }
    }

    /* renamed from: b */
    public final void mo24538b() {
        for (C4391x destroy : this.f10737g) {
            destroy.destroy();
        }
        this.f10737g.clear();
        C4349d dVar = this.f10738h;
        if (dVar != null) {
            dVar.mo24497a(true);
            this.f10738h = null;
        }
        this.f10732b = null;
        mo24535a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    /* renamed from: c */
    public final String mo24539c() {
        return IAlog.m16443a((Object) this);
    }

    /* renamed from: d */
    public final boolean mo24540d() {
        for (C4391x next : this.f10737g) {
            if (next.supports(this)) {
                this.f10736f = next;
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C5299n.f14024b.post(new C4367b());
        } else {
            mo24538b();
        }
    }

    public C4361j getAdContent() {
        return this.f10735e;
    }

    public InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f10733c;
    }

    public String getLocalUniqueId() {
        return this.f10731a;
    }

    public InneractiveMediationName getMediationName() {
        return IAConfigManager.f10324J.f10348n;
    }

    public String getMediationNameString() {
        return IAConfigManager.f10324J.f10347m;
    }

    public String getMediationVersion() {
        return IAConfigManager.f10324J.f10349o;
    }

    public String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f10733c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    public InneractiveUnitController getSelectedUnitController() {
        return this.f10736f;
    }

    public boolean isReady() {
        C4361j jVar;
        C4361j jVar2 = this.f10735e;
        if (jVar2 == null) {
            return false;
        }
        boolean z = jVar2.mo24293c() != null && this.f10735e.mo24293c().mo26316d();
        if (z && (jVar = this.f10735e) != null) {
            C5233e c = jVar.mo24293c();
            if (!this.f10741k && c != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - c.f13867c);
                long j = c.f13866b;
                long j2 = minutes - j;
                IAlog.m16446a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(j2), Long.valueOf(j)}), new Object[0]);
                C4507o oVar = C4507o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar.f10712a;
                JSONArray c2 = jVar.f10714c.mo24268c();
                C4511q.C4512a aVar = new C4511q.C4512a(c);
                aVar.f11163b = oVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c2;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(j2);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f11167f.put(jSONObject);
                aVar.mo24693a((String) null);
                this.f10741k = true;
            }
        }
        if (z || !this.f10735e.mo24294e()) {
            return false;
        }
        return true;
    }

    public void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener = this.f10732b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10732b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            C4415c.f10844c.mo24596a(this.f10731a).mo24599c();
            C4353f fVar = new C4353f(this.f10732b, this);
            this.f10742l = fVar;
            if (this.f10734d == null) {
                this.f10734d = new C4369n(this);
            }
            C4168e eVar = new C4168e(str);
            C4366a aVar = new C4366a(eVar, str);
            fVar.mo24508f();
            eVar.f10235d = this.f10731a;
            C5299n.m16520a(new C4163a(eVar, aVar));
        }
    }

    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C4391x xVar = this.f10736f;
            if (xVar != null && xVar.equals(inneractiveUnitController)) {
                this.f10736f.destroy();
                this.f10736f = null;
            }
            this.f10737g.remove(inneractiveUnitController);
        }
    }

    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    public void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    /* renamed from: a */
    public void mo24537a(C4368c cVar) {
        this.f10739i = cVar;
        IAlog.m16446a("%srequestAd called with request: %s", IAlog.m16443a((Object) this), null);
        if (this.f10733c == null) {
            IAlog.m16447b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m16443a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f10732b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10732b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest = this.f10733c;
            String str = this.f10731a;
            inneractiveAdRequest.f10663b = str;
            C4415c.f10844c.mo24596a(str).mo24599c();
            if (this.f10737g.isEmpty()) {
                IAlog.m16447b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m16443a((Object) this));
                if (this.f10732b != null) {
                    mo24536a(this.f10733c, (C5233e) null);
                    this.f10732b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C4349d dVar = this.f10738h;
            if (dVar != null) {
                dVar.mo24497a(this.f10733c == null);
            }
            this.f10738h = new C4349d();
            if (this.f10734d == null) {
                this.f10734d = new C4369n(this);
            }
            IAlog.m16446a("%sFound ad source for request! %s", IAlog.m16443a((Object) this), this.f10738h);
            C4349d dVar2 = this.f10738h;
            InneractiveAdRequest inneractiveAdRequest2 = this.f10733c;
            C4350e.C4352b bVar = this.f10734d;
            dVar2.f10680e = inneractiveAdRequest2;
            dVar2.f10679d = bVar;
            if (IAConfigManager.m13181g()) {
                dVar2.mo24502h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m13175a();
        }
    }

    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z;
        IAlog.m16446a("%srequestAd called with request: %s", IAlog.m16443a((Object) this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f10733c == null) {
            IAlog.m16447b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m16443a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f10732b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f10732b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest2 = inneractiveAdRequest;
            } else {
                inneractiveAdRequest2 = this.f10733c;
            }
            String str = this.f10731a;
            inneractiveAdRequest2.f10663b = str;
            C4415c.f10844c.mo24596a(str).mo24599c();
            if (this.f10737g.isEmpty()) {
                IAlog.m16447b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m16443a((Object) this));
                if (this.f10732b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f10733c;
                    }
                    mo24536a(inneractiveAdRequest, (C5233e) null);
                    this.f10732b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C4349d dVar = this.f10738h;
            if (dVar != null) {
                dVar.mo24497a(inneractiveAdRequest != null || this.f10733c == null);
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.f10733c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.f10733c = inneractiveAdRequest;
                C4361j jVar = this.f10735e;
                if (jVar != null) {
                    jVar.mo24291a();
                    this.f10740j = true;
                }
                Iterator<C4391x> it = this.f10737g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof InneractiveFullscreenUnitController) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.f10733c.f10662a = false;
                }
            }
            this.f10738h = new C4349d();
            if (this.f10734d == null) {
                this.f10734d = new C4369n(this);
            }
            IAlog.m16446a("%sFound ad source for request! %s", IAlog.m16443a((Object) this), this.f10738h);
            C4349d dVar2 = this.f10738h;
            InneractiveAdRequest inneractiveAdRequest4 = this.f10733c;
            C4350e.C4352b bVar = this.f10734d;
            dVar2.f10680e = inneractiveAdRequest4;
            dVar2.f10679d = bVar;
            if (IAConfigManager.m13181g()) {
                dVar2.mo24502h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m13175a();
        }
    }

    public void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.m16446a("%ssetRequestListener called with: %s", IAlog.m16443a((Object) this), requestListener);
        this.f10732b = requestListener;
    }

    /* renamed from: a */
    public void mo24535a() {
        C4361j jVar;
        C4361j jVar2 = this.f10735e;
        if (jVar2 != null) {
            if (jVar2.mo24299d() && (jVar = this.f10735e) != null && !jVar.f10716e) {
                C5233e c = jVar.mo24293c();
                InneractiveAdRequest inneractiveAdRequest = this.f10735e.f10712a;
                C5299n.f14024b.post(new C4370o(this, Arrays.toString(Thread.currentThread().getStackTrace()), inneractiveAdRequest, c));
            }
            this.f10735e.mo24291a();
            this.f10735e = null;
        }
        this.f10736f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r2 = r2.f10713b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24536a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.C5233e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10546c
            if (r1 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10546c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10490b
            goto L_0x0034
        L_0x001e:
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f10549f
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f10549f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10378j
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            com.fyber.inneractive.sdk.flow.j r2 = r9.f10735e
            if (r2 == 0) goto L_0x003e
            T r2 = r2.f10713b
            if (r2 == 0) goto L_0x003e
            r4 = r2
            goto L_0x003f
        L_0x003e:
            r4 = r11
        L_0x003f:
            java.lang.String r6 = r9.f10731a
            if (r1 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f13878n
        L_0x0047:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.b r11 = new com.fyber.inneractive.sdk.metrics.b
            com.fyber.inneractive.sdk.flow.j r1 = r9.f10735e
            if (r1 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            com.fyber.inneractive.sdk.config.global.s r0 = r1.f10714c
            org.json.JSONArray r0 = r0.mo24268c()
        L_0x0055:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.mo24594a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4365m.mo24536a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}
