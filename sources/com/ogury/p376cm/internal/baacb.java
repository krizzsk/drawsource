package com.ogury.p376cm.internal;

import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.applovin.sdk.AppLovinEventParameters;

/* renamed from: com.ogury.cm.internal.baacb */
public final class baacb {

    /* renamed from: a */
    private String f24506a = "";

    /* renamed from: b */
    private final String f24507b;

    public baacb(String str, String str2) {
        bbabc.m28052b(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        bbabc.m28052b(str2, "skuType");
        this.f24507b = str;
        int hashCode = str2.hashCode();
        if (hashCode != 505523517) {
            if (hashCode == 1741942868 && str2.equals("OneTimePurchase")) {
                this.f24506a = BillingClient.SkuType.INAPP;
                return;
            }
        } else if (str2.equals("Subscription")) {
            this.f24506a = BillingClient.SkuType.SUBS;
            return;
        }
        Log.e("FairChoice", "Illegal SKU type");
    }

    /* renamed from: a */
    public final String mo63944a() {
        return this.f24506a;
    }

    /* renamed from: b */
    public final String mo63945b() {
        return this.f24507b;
    }
}
