package com.ogury.p376cm.internal;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* renamed from: com.ogury.cm.internal.baaba */
public final class baaba implements baaab {

    /* renamed from: a */
    public static final baaba f24478a = new baaba();

    /* renamed from: b */
    private static baaab f24479b;

    private baaba() {
    }

    /* renamed from: a */
    public static void m27994a(Context context) {
        bbabc.m28052b(context, "context");
        acccc acccc = acccc.f24473a;
        acccc.m27986a();
        f24479b = acccc.f24473a.mo63928a(context);
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m28052b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.activateProduct(baacb);
    }

    public final void endDataSourceConnections() {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.endDataSourceConnections();
    }

    public final boolean isBillingDisabled() {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        return baaab.isBillingDisabled();
    }

    public final boolean isProductActivated() {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        return baaab.isProductActivated();
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m28052b(activity, "activity");
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.launchBillingFlow(activity);
    }

    public final void queryProductDetails() {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.queryProductDetails();
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m28052b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.queryPurchase(babaa);
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.setBillingFinishedListener(baaaa);
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        baaab.setQueryProductDetailsListener(baacc);
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m28052b(context, "context");
        baaab a = acccc.f24473a.mo63928a(context);
        f24479b = a;
        if (a == null) {
            bbabc.m28050a("implementation");
        }
        a.startDataSourceConnections(context);
    }

    public final boolean tokenExistsForActiveProduct() {
        baaab baaab = f24479b;
        if (baaab == null) {
            bbabc.m28050a("implementation");
        }
        return baaab.tokenExistsForActiveProduct();
    }
}
