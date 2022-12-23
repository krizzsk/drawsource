package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4223e;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.flow.C4345a;
import com.fyber.inneractive.sdk.flow.C4347b;
import com.fyber.inneractive.sdk.flow.C4348c;
import com.fyber.inneractive.sdk.flow.C4350e;
import com.fyber.inneractive.sdk.flow.C4369n;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.network.C4474b0;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.network.n */
public class C4502n {

    /* renamed from: a */
    public InneractiveAdRequest f11091a;

    /* renamed from: b */
    public C4251s f11092b;

    /* renamed from: c */
    public C4505c f11093c;

    /* renamed from: d */
    public final String f11094d;

    /* renamed from: e */
    public volatile boolean f11095e = false;

    /* renamed from: f */
    public final C4478c0 f11096f;

    /* renamed from: com.fyber.inneractive.sdk.network.n$a */
    public class C4503a implements C4521u<C5233e> {
        public C4503a() {
        }

        /* renamed from: a */
        public void mo24154a(Object obj, Exception exc, boolean z) {
            InneractiveErrorCode inneractiveErrorCode;
            C5233e eVar = (C5233e) obj;
            if (exc == null) {
                C4502n.this.mo24689a(eVar);
                return;
            }
            C4502n.this.getClass();
            if (exc instanceof C4506n0) {
                if (((C4506n0) exc).f11099a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
            } else if (exc instanceof FileNotFoundException) {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            } else if (exc instanceof C4529z) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            } else {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            }
            C4502n nVar = C4502n.this;
            if (nVar.f11093c != null) {
                if (nVar.f11095e) {
                    IAlog.m16449d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                } else {
                    nVar.mo24688a(inneractiveErrorCode, eVar);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$b */
    public class C4504b implements C4474b0.C4475a {
        public C4504b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24155a(java.lang.String r5) {
            /*
                r4 = this;
                int r0 = r5.hashCode()
                r1 = -1392135285(0xffffffffad05b38b, float:-7.600041E-12)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x002c
                r1 = 740780854(0x2c276b36, float:2.3791641E-12)
                if (r0 == r1) goto L_0x0021
                r1 = 1745989196(0x6811ae4c, float:2.7518334E24)
                if (r0 == r1) goto L_0x0016
                goto L_0x0034
            L_0x0016:
                java.lang.String r0 = "sdkParsedResponse"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x001f
                goto L_0x0034
            L_0x001f:
                r5 = r2
                goto L_0x0037
            L_0x0021:
                java.lang.String r0 = "sdkGotServerResponse"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x002a
                goto L_0x0034
            L_0x002a:
                r5 = r3
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "sdkInitNetworkRequest"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L_0x0036
            L_0x0034:
                r5 = -1
                goto L_0x0037
            L_0x0036:
                r5 = 0
            L_0x0037:
                if (r5 == 0) goto L_0x005a
                if (r5 == r3) goto L_0x004c
                if (r5 == r2) goto L_0x003e
                goto L_0x0067
            L_0x003e:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4415c.f10844c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4502n.this
                java.lang.String r0 = r0.f11094d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24596a(r0)
                r5.mo24600d()
                goto L_0x0067
            L_0x004c:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4415c.f10844c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4502n.this
                java.lang.String r0 = r0.f11094d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24596a(r0)
                r5.mo24603g()
                goto L_0x0067
            L_0x005a:
                com.fyber.inneractive.sdk.metrics.c r5 = com.fyber.inneractive.sdk.metrics.C4415c.f10844c
                com.fyber.inneractive.sdk.network.n r0 = com.fyber.inneractive.sdk.network.C4502n.this
                java.lang.String r0 = r0.f11094d
                com.fyber.inneractive.sdk.metrics.f r5 = r5.mo24596a(r0)
                r5.mo24602f()
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4502n.C4504b.mo24155a(java.lang.String):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$c */
    public interface C4505c {
    }

    public C4502n(InneractiveAdRequest inneractiveAdRequest, String str, C4251s sVar, C4505c cVar) {
        this.f11091a = inneractiveAdRequest;
        this.f11094d = str;
        this.f11093c = cVar;
        this.f11092b = sVar;
        this.f11096f = new C4478c0(new C4503a(), inneractiveAdRequest, sVar);
        mo24687a();
    }

    /* renamed from: a */
    public void mo24687a() {
        this.f11096f.f11025d = new C4504b();
    }

    /* renamed from: a */
    public void mo24688a(InneractiveErrorCode inneractiveErrorCode, C5233e eVar) {
        C4505c cVar;
        if (!this.f11095e && (cVar = this.f11093c) != null) {
            ((C4350e) cVar).mo24504a(this.f11091a, eVar, inneractiveErrorCode);
        }
    }

    /* renamed from: a */
    public void mo24689a(C5233e eVar) {
        InneractiveErrorCode inneractiveErrorCode;
        if (this.f11093c != null) {
            if (this.f11095e) {
                IAlog.m16449d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                return;
            }
            C4287y b = C4203a.m13186b(eVar.f13877m);
            InneractiveAdRequest inneractiveAdRequest = this.f11091a;
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest.setSelectedUnitConfig(b);
            }
            C4223e eVar2 = new C4223e();
            ImpressionData impressionData = eVar.f13882r;
            C4394a aVar = null;
            eVar2.f10418a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.f10419b = Long.valueOf(IAConfigManager.f10324J.f10338d);
            } catch (NumberFormatException unused) {
                IAlog.m16446a("invalid publisherId", new Object[0]);
            }
            C4251s sVar = this.f11092b;
            if (sVar != null) {
                sVar.mo24266a(eVar2);
            }
            if (b == null) {
                inneractiveErrorCode = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
            } else {
                inneractiveErrorCode = eVar.mo24323a(this.f11091a, this.f11092b);
            }
            if (inneractiveErrorCode == null) {
                C4505c cVar = this.f11093c;
                InneractiveAdRequest inneractiveAdRequest2 = this.f11091a;
                C4350e eVar3 = (C4350e) cVar;
                C4251s sVar2 = eVar3.f10681f;
                IAlog.m16449d("%sonAdDataAvailable: got response data: %s", eVar3.mo24499d(), eVar);
                C5229a a = C5229a.m16362a(eVar.f13871g);
                C4339b.C4341b bVar = C4339b.C4340a.f10657a.f10656a.get(a);
                if (bVar != null) {
                    aVar = bVar.mo24313a();
                }
                eVar3.f10678c = aVar;
                if (aVar == null) {
                    IAlog.m16450e("%sonAdDataAvailable: Cannot find content handler for ad type: %s", eVar3.mo24499d(), a);
                    C4350e.C4352b bVar2 = eVar3.f10679d;
                    if (bVar2 != null) {
                        ((C4369n) bVar2).mo24543a(inneractiveAdRequest2, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
                IAlog.m16449d("%sonAdDataAvailable: found response loader: %s", eVar3.mo24499d(), eVar3.f10678c);
                ((C4348c) eVar3.f10678c).mo24492a(inneractiveAdRequest2, eVar, sVar2, eVar3);
                return;
            }
            if (b == null || inneractiveErrorCode == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                IAlog.m16447b("%sGot configuration mismatch!", IAlog.m16443a((Object) this));
                IAConfigManager.m13175a();
            }
            C5229a a2 = C5229a.m16362a(eVar.f13871g);
            if (a2 != null) {
                C5299n.m16520a(new C4345a(new C4347b(eVar, this.f11091a, a2 == C5229a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f11092b.mo24268c()), new InneractiveInfrastructureError(inneractiveErrorCode, eVar.f13888x)));
            }
            mo24688a(inneractiveErrorCode, eVar);
        }
    }
}
