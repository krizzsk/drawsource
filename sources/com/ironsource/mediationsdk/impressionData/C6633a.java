package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6458K;
import com.ironsource.mediationsdk.C6459L;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6657h;
import com.ironsource.mediationsdk.server.C6728a;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.C6743i;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.C8196u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\f\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/impressionData/ExternalImpressionDataHandler;", "Lcom/ironsource/mediationsdk/utils/OnMediationInitializationListener;", "()V", "externalArmEventsUrl", "", "isExternalArmEventsEnabled", "", "buildClientParamsForRequest", "Lorg/json/JSONObject;", "onInitFailed", "", "reason", "onInitSuccess", "adUnits", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "revived", "configurations", "Lcom/ironsource/mediationsdk/model/Configurations;", "onStillInProgressAfter15Secs", "setAdRevenueData", "dataSource", "impressionData", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.impressionData.a */
public final class C6633a implements C6743i {

    /* renamed from: a */
    private boolean f17239a = true;

    /* renamed from: b */
    private String f17240b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    @Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo72583d2 = {"com/ironsource/mediationsdk/impressionData/ExternalImpressionDataHandler$setAdRevenueData$1", "Lcom/ironsource/mediationsdk/server/HttpFunctionsListener;", "onResponse", "", "requestSucceeded", "", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a */
    public static final class C6634a implements C6728a {
        C6634a() {
        }

        /* renamed from: a */
        public final void mo36684a(boolean z) {
            if (!z) {
                IronLog.API.error("failed to send impression data");
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m20194a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        ContextProvider instance = ContextProvider.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "ContextProvider.getInstance()");
        Context applicationContext = instance.getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            C6458K ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.f16366a);
                jSONObject.put("advIdType", ironSourceAdvId.f16367b);
            }
        }
        C6459L a = C6459L.m19304a();
        Intrinsics.checkNotNullExpressionValue(a, "IronSourceObject.getInstance()");
        String m = a.mo36155m();
        if (m != null) {
            jSONObject.put("applicationKey", m);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo36028a(String str) {
    }

    /* renamed from: a */
    public final void mo36683a(String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "dataSource");
        Intrinsics.checkNotNullParameter(jSONObject, "impressionData");
        if (!this.f17239a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject a = m20194a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("externalMediationSource", str);
            jSONObject2.putOpt("externalMediationData", jSONObject);
            jSONObject2.putOpt("clientParams", a);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject2);
            HttpFunctions.sendPostRequest(this.f17240b, jSONObject2.toString(), new C6634a());
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e.getMessage() + " sending impression data");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo36030a(List<IronSource.AD_UNIT> list, boolean z, C6657h hVar) {
        if (hVar != null) {
            C8196u a = hVar.mo36778a();
            Intrinsics.checkNotNullExpressionValue(a, "applicationConfigurations");
            this.f17239a = a.mo56490f().f17564a;
            C8196u a2 = hVar.mo36778a();
            Intrinsics.checkNotNullExpressionValue(a2, "applicationConfigurations");
            this.f17240b = a2.mo56490f().f17565b;
        }
    }

    /* renamed from: f */
    public final void mo36039f() {
    }
}
