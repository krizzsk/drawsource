package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;

        /* renamed from: OK */
        public static final int f946OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public static final class Builder {
        private boolean zza;
        private final Context zzb;
        private PurchasesUpdatedListener zzc;

        /* synthetic */ Builder(Context context, zzf zzf) {
            this.zzb = context;
        }

        public BillingClient build() {
            Context context = this.zzb;
            if (context != null) {
                PurchasesUpdatedListener purchasesUpdatedListener = this.zzc;
                if (purchasesUpdatedListener == null) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                } else if (this.zza) {
                    return new BillingClientImpl((String) null, true, context, purchasesUpdatedListener);
                } else {
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
            } else {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
        }

        public Builder enablePendingPurchases() {
            this.zza = true;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzc = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public @interface FeatureType {
        public static final String IN_APP_ITEMS_ON_VR = "inAppItemsOnVr";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_ON_VR = "subscriptionsOnVr";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context, (zzf) null);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    public abstract void endConnection();

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener);

    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract Purchase.PurchasesResult queryPurchases(String str);

    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
