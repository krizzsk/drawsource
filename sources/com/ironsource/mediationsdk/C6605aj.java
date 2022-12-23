package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C6404a;
import com.ironsource.lifecycle.C6418g;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6521g;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager;", "", "()V", "calculator", "Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "init", "", "SessionCalcEventTask", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.aj */
public final class C6605aj {

    /* renamed from: a */
    C6404a f17111a;

    @Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo72583d2 = {"Lcom/ironsource/mediationsdk/SessionCalculationManager$SessionCalcEventTask;", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/mediationsdk/SessionCalculationManager;)V", "run", "", "mediationsdk_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
    /* renamed from: com.ironsource.mediationsdk.aj$a */
    final class C6606a extends C6418g {
        public C6606a() {
        }

        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", this.f16236a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C6521g.f16808w.mo36349b(new C6517c(44, mediationAdditionalData));
        }
    }
}
