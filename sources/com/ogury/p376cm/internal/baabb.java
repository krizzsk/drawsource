package com.ogury.p376cm.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p376cm.internal.bacab;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabb */
public final class baabb implements BillingClientStateListener, PurchasesUpdatedListener, SkuDetailsResponseListener, baaab {

    /* renamed from: a */
    private baacb f24480a;

    /* renamed from: b */
    private babab f24481b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public babaa f24482c;

    /* renamed from: d */
    private baacc f24483d;

    /* renamed from: e */
    private baaaa f24484e;

    /* renamed from: f */
    private int f24485f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f24486g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public baabc f24487h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BillingClient f24488i;

    /* renamed from: j */
    private Context f24489j;

    /* renamed from: com.ogury.cm.internal.baabb$aaaaa */
    static final class aaaaa {

        /* renamed from: a */
        public static final aaaaa f24490a = new aaaaa();

        /* renamed from: b */
        private static AtomicInteger f24491b = new AtomicInteger(1);

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12662aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f24492a;

            C12662aaaaa(bbaaa bbaaa) {
                this.f24492a = bbaaa;
            }

            public final void run() {
                this.f24492a.mo63787a();
            }
        }

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaab */
        static final class aaaab implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f24493a;

            aaaab(bbaaa bbaaa) {
                this.f24493a = bbaaa;
            }

            public final void run() {
                this.f24493a.mo63787a();
            }
        }

        private aaaaa() {
        }

        /* renamed from: a */
        public static void m27998a() {
            f24491b.set(1);
        }

        /* renamed from: a */
        public static void m27999a(BillingClient billingClient, baabb baabb, bbaaa<babcc> bbaaa) {
            bbabc.m28052b(billingClient, "billingClient");
            bbabc.m28052b(baabb, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            bbabc.m28052b(bbaaa, "task");
            if (billingClient.isReady()) {
                bbaaa.mo63787a();
                return;
            }
            Log.d("FairChoice", "taskExecutionRetryPolicy billing not ready");
            billingClient.startConnection(baabb);
            new Handler(Looper.getMainLooper()).postDelayed(new aaaab(bbaaa), 2000);
        }

        /* renamed from: a */
        public static void m28000a(bbaaa<babcc> bbaaa) {
            bbabc.m28052b(bbaaa, "block");
            int andIncrement = f24491b.getAndIncrement();
            if (andIncrement < 5) {
                new Handler(Looper.getMainLooper()).postDelayed(new C12662aaaaa(bbaaa), (long) (((float) Math.pow(2.0d, (double) andIncrement)) * 500.0f));
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f24494a;

        /* renamed from: b */
        final /* synthetic */ Activity f24495b;

        /* renamed from: c */
        final /* synthetic */ BillingFlowParams f24496c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(baabb baabb, Activity activity, BillingFlowParams billingFlowParams) {
            super(0);
            this.f24494a = baabb;
            this.f24495b = activity;
            this.f24496c = billingFlowParams;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            baabb.access$getPlayStoreBillingClient$p(this.f24494a).launchBillingFlow(this.f24495b, this.f24496c);
            return babcc.f24512a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaac */
    static final class aaaac extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f24497a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaac(baabb baabb) {
            super(0);
            this.f24497a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            boolean unused = this.f24497a.m27997b();
            return babcc.f24512a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaba */
    static final class aaaba extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f24498a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaba(baabb baabb) {
            super(0);
            this.f24498a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            mo63943b();
            return babcc.f24512a;
        }

        /* renamed from: b */
        public final void mo63943b() {
            List<Purchase> purchasesList;
            List<Purchase> purchasesList2;
            Log.d("FairChoice", "queryPurchases called");
            this.f24498a.f24486g = false;
            HashSet hashSet = new HashSet();
            Purchase.PurchasesResult queryPurchases = baabb.access$getPlayStoreBillingClient$p(this.f24498a).queryPurchases(BillingClient.SkuType.INAPP);
            bbabc.m28049a((Object) queryPurchases, "playStoreBillingClient.q…lingClient.SkuType.INAPP)");
            StringBuilder sb = new StringBuilder("queryPurchases INAPP results: ");
            List<Purchase> list = null;
            sb.append(queryPurchases != null ? queryPurchases.getPurchasesList() : null);
            Log.d("FairChoice", sb.toString());
            if (!(queryPurchases == null || (purchasesList2 = queryPurchases.getPurchasesList()) == null)) {
                hashSet.addAll(purchasesList2);
            }
            if (baabb.access$isSubscriptionSupported(this.f24498a)) {
                Purchase.PurchasesResult queryPurchases2 = baabb.access$getPlayStoreBillingClient$p(this.f24498a).queryPurchases(BillingClient.SkuType.SUBS);
                bbabc.m28049a((Object) queryPurchases2, "playStoreBillingClient.q…llingClient.SkuType.SUBS)");
                if (!(queryPurchases2 == null || (purchasesList = queryPurchases2.getPurchasesList()) == null)) {
                    hashSet.addAll(purchasesList);
                }
                StringBuilder sb2 = new StringBuilder("queryPurchases SUBS results: ");
                if (queryPurchases2 != null) {
                    list = queryPurchases2.getPurchasesList();
                }
                sb2.append(list);
                Log.d("FairChoice", sb2.toString());
            }
            baabb.access$getSharedPreferences$p(this.f24498a);
            baabc.m28010a((HashSet<Purchase>) hashSet);
            babaa access$getPurchaseQueryListener$p = this.f24498a.f24482c;
            if (access$getPurchaseQueryListener$p != null) {
                access$getPurchaseQueryListener$p.mo63782a();
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabb */
    static final class aaabb extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaaba f24499a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabb(aaaba aaaba) {
            super(0);
            this.f24499a = aaaba;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            this.f24499a.mo63943b();
            return babcc.f24512a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabc */
    static final class aaabc extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f24500a;

        /* renamed from: b */
        final /* synthetic */ String f24501b;

        /* renamed from: c */
        final /* synthetic */ SkuDetailsParams.Builder f24502c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabc(baabb baabb, String str, SkuDetailsParams.Builder builder) {
            super(0);
            this.f24500a = baabb;
            this.f24501b = str;
            this.f24502c = builder;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            Log.d("FairChoice", "querySkuDetailsAsync for " + this.f24501b);
            baabb.access$getPlayStoreBillingClient$p(this.f24500a).querySkuDetailsAsync(this.f24502c.build(), this.f24500a);
            return babcc.f24512a;
        }
    }

    /* renamed from: a */
    private static String m27995a(SkuDetails skuDetails) {
        JSONObject jSONObject = new JSONObject();
        if (skuDetails != null) {
            try {
                jSONObject = new JSONObject(skuDetails.getOriginalJson());
            } catch (Exception e) {
                Log.w("FairChoice", "Error while parsing skuDetailsJson: ".concat(String.valueOf(e)));
            }
            jSONObject.remove("skuDetailsToken");
            jSONObject.remove("rewardToken");
        }
        String jSONObject2 = jSONObject.toString();
        bbabc.m28049a((Object) jSONObject2, "billingJson.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m27996a() {
        aaaba aaaba2 = new aaaba(this);
        aaaaa aaaaa2 = aaaaa.f24490a;
        BillingClient billingClient = this.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        aaaaa.m27999a(billingClient, this, new aaabb(aaaba2));
    }

    public static final /* synthetic */ BillingClient access$getPlayStoreBillingClient$p(baabb baabb) {
        BillingClient billingClient = baabb.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        return billingClient;
    }

    public static final /* synthetic */ baabc access$getSharedPreferences$p(baabb baabb) {
        baabc baabc = baabb.f24487h;
        if (baabc == null) {
            bbabc.m28050a("sharedPreferences");
        }
        return baabc;
    }

    public static final /* synthetic */ boolean access$isSubscriptionSupported(baabb baabb) {
        BillingClient billingClient = baabb.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        BillingResult isFeatureSupported = billingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
        bbabc.m28049a((Object) isFeatureSupported, "playStoreBillingClient.i…eatureType.SUBSCRIPTIONS)");
        int responseCode = isFeatureSupported.getResponseCode();
        if (responseCode != 0) {
            Log.w("FairChoice", "isSubscriptionSupported() got an error response: ".concat(String.valueOf(responseCode)));
        }
        return responseCode == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m27997b() {
        Log.d("FairChoice", "connectToPlayBillingService");
        BillingClient billingClient = this.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            return false;
        }
        BillingClient billingClient2 = this.f24488i;
        if (billingClient2 == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        billingClient2.startConnection(this);
        return true;
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m28052b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        this.f24480a = baacb;
        if (this.f24487h == null) {
            bbabc.m28050a("sharedPreferences");
        }
        baabc.m28009a(baacb);
    }

    public final void endDataSourceConnections() {
        Log.d("FairChoice", "endDataSourceConnections");
        BillingClient billingClient = this.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        billingClient.endConnection();
    }

    public final boolean isBillingDisabled() {
        return false;
    }

    public final boolean isProductActivated() {
        return this.f24480a != null;
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m28052b(activity, "activity");
        BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
        babab babab = this.f24481b;
        SkuDetails b = babab != null ? babab.mo63947b() : null;
        if (b == null) {
            bbabc.m28048a();
        }
        BillingFlowParams build = newBuilder.setSkuDetails(b).build();
        bbabc.m28049a((Object) build, "BillingFlowParams.newBui…fo?.skuDetails!!).build()");
        aaaaa aaaaa2 = aaaaa.f24490a;
        BillingClient billingClient = this.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        aaaaa.m27999a(billingClient, this, new aaaab(this, activity, build));
    }

    public final void onBillingServiceDisconnected() {
        Log.d("FairChoice", "onBillingServiceDisconnected");
        aaaaa aaaaa2 = aaaaa.f24490a;
        aaaaa.m28000a(new aaaac(this));
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        bbabc.m28052b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            Log.d("FairChoice", "onBillingSetupFinished successfully");
            aaaaa aaaaa2 = aaaaa.f24490a;
            aaaaa.m27998a();
            if (this.f24486g) {
                m27996a();
                return;
            }
            return;
        }
        if (responseCode == 3) {
            Log.e("FairChoice", "Ogury FairChoice not available - Android Billing Library is unavailable");
            baaba baaba = baaba.f24478a;
            Context context = this.f24489j;
            if (context == null) {
                bbabc.m28050a("context");
            }
            baaba.m27994a(context);
        }
        baaac baaac = baaac.f24477a;
        Log.d("FairChoice", "onBillingSetupFinished with failure response code: ".concat(String.valueOf(baaac.m27993a(responseCode))));
        this.f24485f = responseCode;
        babaa babaa = this.f24482c;
        if (babaa != null) {
            babaa.mo63782a();
        }
    }

    public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        bbabc.m28052b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String str = null;
        if (responseCode != 0) {
            if (responseCode == 5) {
                Log.e("FairChoice", "Your app's configuration is incorrect. Review in the Google PlayConsole. Possible causes of this error include: APK is not signed with release key; SKU productId mismatch.");
            } else if (responseCode != 7) {
                StringBuilder sb = new StringBuilder("BillingClient.BillingResponse error code:");
                baaac baaac = baaac.f24477a;
                sb.append(baaac.m27993a(responseCode));
                Log.i("FairChoice", sb.toString());
            } else {
                Log.d("FairChoice", "already owned items");
            }
        } else if (list != null) {
            String str2 = null;
            for (Purchase purchase : list) {
                if (purchase.getPurchaseState() == 1) {
                    String sku = purchase.getSku();
                    baacb baacb = this.f24480a;
                    if (bbabc.m28051a((Object) sku, (Object) baacb != null ? baacb.mo63945b() : null)) {
                        str2 = purchase.getPurchaseToken();
                    }
                } else if (purchase.getPurchaseState() == 2) {
                    Log.d("FairChoice", "Received a pending purchase of SKU: " + purchase.getSku());
                }
            }
            str = str2;
        }
        baaaa baaaa = this.f24484e;
        if (baaaa != null) {
            JSONObject jSONObject = new JSONObject();
            if (responseCode == 0) {
                jSONObject.put("paid", true);
                jSONObject.put("token", str);
            } else {
                jSONObject.put("paid", false);
                baaac baaac2 = baaac.f24477a;
                jSONObject.put("errorMessage", baaac.m27993a(responseCode));
            }
            String jSONObject2 = jSONObject.toString();
            bbabc.m28049a((Object) jSONObject2, "json.toString()");
            baaaa.mo63834a(jSONObject2);
        }
    }

    public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        baacc baacc;
        bbabc.m28052b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            if (this.f24485f != 0) {
                baaac baaac = baaac.f24477a;
                responseCode = this.f24485f;
            } else {
                baaac baaac2 = baaac.f24477a;
            }
            String a = baaac.m27993a(responseCode);
            this.f24485f = 0;
            Log.w("FairChoice", "SkuDetails query failed with response: ".concat(String.valueOf(a)));
            baacc baacc2 = this.f24483d;
            if (baacc2 != null) {
                baacc2.mo63832a(a, "");
                return;
            }
            return;
        }
        Log.d("FairChoice", "SkuDetails query responded with success. List: ".concat(String.valueOf(list)));
        if (list == null || list.isEmpty()) {
            this.f24481b = new babab("store-product-not-available", (SkuDetails) null);
        }
        if (list != null) {
            for (SkuDetails skuDetails : list) {
                String sku = skuDetails.getSku();
                baacb baacb = this.f24480a;
                if (bbabc.m28051a((Object) sku, (Object) baacb != null ? baacb.mo63945b() : null)) {
                    this.f24481b = new babab("ok", skuDetails);
                }
            }
        }
        babab babab = this.f24481b;
        if (babab != null && (baacc = this.f24483d) != null) {
            baacc.mo63832a(babab.mo63946a(), m27995a(babab.mo63947b()));
        }
    }

    public final void queryProductDetails() {
        baacb baacb = this.f24480a;
        if (baacb == null) {
            Log.i("FairChoice", "Product must be activated(saved) prior to calling queryProductDetails() -> FairChoice disabled");
        } else if (baacb != null) {
            String a = baacb.mo63944a();
            List a2 = bacab.aaaaa.m28027a(baacb.mo63945b());
            SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
            bbabc.m28049a((Object) newBuilder, "SkuDetailsParams.newBuilder()");
            newBuilder.setSkusList(a2).setType(a);
            aaaaa aaaaa2 = aaaaa.f24490a;
            BillingClient billingClient = this.f24488i;
            if (billingClient == null) {
                bbabc.m28050a("playStoreBillingClient");
            }
            aaaaa.m27999a(billingClient, this, new aaabc(this, a, newBuilder));
        }
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m28052b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24482c = babaa;
        BillingClient billingClient = this.f24488i;
        if (billingClient == null) {
            bbabc.m28050a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            m27996a();
        } else {
            this.f24486g = true;
        }
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        this.f24484e = baaaa;
    }

    public final void setPurchaseQueryListener(babaa babaa) {
        bbabc.m28052b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24486g = true;
        this.f24482c = babaa;
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        this.f24483d = baacc;
        babab babab = this.f24481b;
        if (babab != null && baacc != null) {
            baacc.mo63832a(babab.mo63946a(), m27995a(babab.mo63947b()));
        }
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m28052b(context, "context");
        this.f24489j = context;
        acccc acccc = acccc.f24473a;
        this.f24487h = acccc.m27988b(context);
        this.f24488i = acccc.f24473a.mo63927a(context, (PurchasesUpdatedListener) this);
        m27997b();
    }

    public final boolean tokenExistsForActiveProduct() {
        if (this.f24487h == null) {
            bbabc.m28050a("sharedPreferences");
        }
        String b = baabc.m28011b();
        if (this.f24487h == null) {
            bbabc.m28050a("sharedPreferences");
        }
        String a = baabc.m28007a();
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (bbabc.m28051a((Object) jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID), (Object) b) && jSONObject.has(SDKConstants.PARAM_PURCHASE_TOKEN)) {
                        return true;
                    }
                }
                babcc babcc = babcc.f24512a;
            } catch (JSONException e) {
                Integer.valueOf(Log.e("FairChoice", "Error while parsing purchases json: " + e + ')'));
            }
        }
        return false;
    }
}
