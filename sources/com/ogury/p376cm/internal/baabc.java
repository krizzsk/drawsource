package com.ogury.p376cm.internal;

import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabc */
public final class baabc {

    /* renamed from: a */
    public static final baabc f24503a = new baabc();

    /* renamed from: b */
    private static SharedPreferences f24504b;

    private baabc() {
    }

    /* renamed from: a */
    public static String m28007a() {
        SharedPreferences sharedPreferences = f24504b;
        if (sharedPreferences == null) {
            bbabc.m28050a("sharedPref");
        }
        return sharedPreferences.getString("activePurchases", (String) null);
    }

    /* renamed from: a */
    public static void m28008a(SharedPreferences sharedPreferences) {
        bbabc.m28052b(sharedPreferences, "sharedPreferences");
        f24504b = sharedPreferences;
    }

    /* renamed from: a */
    public static void m28009a(baacb baacb) {
        bbabc.m28052b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        SharedPreferences sharedPreferences = f24504b;
        if (sharedPreferences == null) {
            bbabc.m28050a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m28049a((Object) edit, "sharedPref.edit()");
        edit.putString("activeProduct", baacb.mo63945b());
        edit.apply();
    }

    /* renamed from: a */
    public static void m28010a(HashSet<Purchase> hashSet) {
        JSONArray jSONArray = new JSONArray();
        for (Purchase purchase : hashSet) {
            if (!(purchase.getSku() == null || purchase.getPurchaseToken() == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, purchase.getSku());
                jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, purchase.getPurchaseToken());
                jSONArray.put(jSONObject);
            }
        }
        SharedPreferences sharedPreferences = f24504b;
        if (sharedPreferences == null) {
            bbabc.m28050a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m28049a((Object) edit, "sharedPref.edit()");
        if (jSONArray.length() > 0) {
            edit.putString("activePurchases", jSONArray.toString());
        } else {
            edit = edit.remove("activePurchases");
        }
        edit.apply();
    }

    /* renamed from: b */
    public static String m28011b() {
        SharedPreferences sharedPreferences = f24504b;
        if (sharedPreferences == null) {
            bbabc.m28050a("sharedPref");
        }
        String string = sharedPreferences.getString("activeProduct", "");
        bbabc.m28049a((Object) string, "sharedPref.getString(ACTIVE_PRODUCT, \"\")");
        return string;
    }
}
