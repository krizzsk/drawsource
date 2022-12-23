package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.network.C4473b;
import com.fyber.inneractive.sdk.network.C4502n;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.d */
public class C4349d extends C4350e implements IAConfigManager.OnConfigurationReadyAndValidListener {
    /* renamed from: a */
    public void mo24497a(boolean z) {
        mo24501g();
        C4394a aVar = this.f10678c;
        if (aVar != null && z) {
            aVar.mo24491a();
            this.f10678c = null;
        }
        mo24506b();
        this.f10679d = null;
    }

    /* renamed from: d */
    public String mo24499d() {
        return IAlog.m16443a((Object) this);
    }

    /* renamed from: e */
    public void mo24500e() {
        super.mo24500e();
        mo24504a(this.f10680e, mo24507c(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        mo24501g();
    }

    /* renamed from: g */
    public void mo24501g() {
        IAConfigManager.removeListener(this);
        C4502n nVar = this.f10682g;
        if (nVar != null) {
            nVar.f11095e = true;
            nVar.f11093c = null;
            nVar.f11096f.f11022a = true;
            this.f10682g = null;
        }
        this.f10680e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r0 = (r0 = r0.f10549f).f10378j;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24502h() {
        /*
            r6 = this;
            boolean r0 = com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()
            if (r0 != 0) goto L_0x001c
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10679d
            if (r0 == 0) goto L_0x001c
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10680e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24507c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4369n) r0
            r0.mo24543a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r6.f10680e
            java.lang.String r0 = r0.getSpotId()
            com.fyber.inneractive.sdk.config.x r0 = com.fyber.inneractive.sdk.config.C4203a.m13183a(r0)
            com.fyber.inneractive.sdk.response.e r1 = r6.mo24507c()
            r2 = 0
            if (r0 == 0) goto L_0x004a
            boolean r3 = r0.f10543b
            if (r3 != 0) goto L_0x004a
            r6.mo24498a(r2, r1)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10679d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10680e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24507c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4369n) r0
            r0.mo24543a(r1, r2, r3)
            goto L_0x0155
        L_0x004a:
            r3 = 1
            if (r0 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r4 = r0.f10542a
            java.util.Iterator r4 = r4.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r0 = r0.f10542a
            java.lang.Object r0 = r0.get(r2)
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C4287y) r0
            com.fyber.inneractive.sdk.config.r r1 = r0.f10546c
            if (r1 == 0) goto L_0x0066
            goto L_0x0074
        L_0x0066:
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f10549f
            if (r0 == 0) goto L_0x0076
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f10378j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r0 == r1) goto L_0x0074
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r1) goto L_0x0076
        L_0x0074:
            r0 = r3
            goto L_0x0077
        L_0x0076:
            r0 = r2
        L_0x0077:
            if (r0 != 0) goto L_0x008f
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10679d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10680e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo24507c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4369n) r0
            r0.mo24543a(r1, r2, r3)
            goto L_0x0155
        L_0x008f:
            com.fyber.inneractive.sdk.config.global.s r0 = new com.fyber.inneractive.sdk.config.global.s
            r0.<init>()
            r6.f10681f = r0
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10680e
            java.lang.String r1 = r1.getSpotId()
            r0.mo24267a((java.lang.String) r1)
            com.fyber.inneractive.sdk.network.n r0 = new com.fyber.inneractive.sdk.network.n
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f10680e
            java.lang.String r4 = r1.f10663b
            com.fyber.inneractive.sdk.config.global.s r5 = r6.f10681f
            r0.<init>(r1, r4, r5, r6)
            r6.f10682g = r0
            r0.f11095e = r2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "IARemoteAdFetcher: requestAd called"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r4, r1)
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r0.f11091a
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r1.getSpotId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00cb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "appID is null or empty. Please provide a valid appID and re-try."
            com.fyber.inneractive.sdk.util.IAlog.m16447b(r4, r1)
            goto L_0x00da
        L_0x00cb:
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00dc
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! "
            com.fyber.inneractive.sdk.util.IAlog.m16447b(r4, r1)
        L_0x00da:
            r1 = r2
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00eb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m16447b(r4, r1)
        L_0x00eb:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C5292l.m16510b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00fa
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r1)
        L_0x00fa:
            r1 = r3
        L_0x00fb:
            if (r1 != 0) goto L_0x0104
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT
            r3 = 0
            r0.mo24688a(r1, r3)
            goto L_0x010e
        L_0x0104:
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.network.w r1 = r1.f10354t
            com.fyber.inneractive.sdk.network.c0 r0 = r0.f11096f
            r1.mo24706c(r0)
            r2 = r3
        L_0x010e:
            if (r2 == 0) goto L_0x0155
            r6.mo24508f()
            goto L_0x0155
        L_0x0114:
            if (r0 != 0) goto L_0x011c
            r6.mo24498a(r3, r1)
            com.fyber.inneractive.sdk.config.IAConfigManager.m13175a()
        L_0x011c:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = "************************************************************************************************************************"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r5 = r6.f10680e
            java.lang.String r5 = r5.getSpotId()
            r0[r2] = r5
            com.fyber.inneractive.sdk.config.IAConfigManager r5 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            java.lang.String r5 = r5.f10337c
            r0[r3] = r5
            java.lang.String r3 = "*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r0)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f10679d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r6.f10680e
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C4369n) r0
            r0.mo24543a(r2, r1, r3)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4349d.mo24502h():void");
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z) {
            mo24502h();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f10680e;
        C5233e c = mo24507c();
        if (exc instanceof C4473b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        mo24504a(inneractiveAdRequest, c, inneractiveErrorCode);
    }

    /* renamed from: a */
    public final void mo24498a(boolean z, C5233e eVar) {
        String str;
        String spotId = this.f10680e.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        String str2 = iAConfigManager.f10358x.f10402c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (!str2.contains(String.format("-%s-", new Object[]{spotId}))) {
            C4511q.C4512a aVar = new C4511q.C4512a(C4507o.MISSMATCH_SPOTID, this.f10680e, eVar, (JSONArray) null);
            if (z) {
                str = String.format("There is no %s spot ID in current app config", new Object[]{spotId});
            } else {
                str = String.format("spot ID %s is not active in current app config", new Object[]{spotId});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
            C4213d0 d0Var = iAConfigManager.f10358x;
            d0Var.f10402c.put("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", new Object[]{str2, spotId}));
        }
    }
}
