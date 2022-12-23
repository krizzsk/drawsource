package com.unity3d.ads.metadata;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12027h;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.log.C12065a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppPurchaseMetaData extends MetaData {
    public static final String IAP_KEY = "iap";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_PRICE = "price";
    public static final String KEY_PRODUCT_ID = "productId";
    public static final String KEY_RECEIPT_PURCHASE_DATA = "receiptPurchaseData";
    public static final String KEY_SIGNATURE = "signature";

    public InAppPurchaseMetaData(Context context) {
        super(context);
    }

    public void commit() {
        if (C12028i.m32766a(this._context)) {
            C12025f a = C12028i.m32764a(C12028i.C12029a.PUBLIC);
            if (getData() != null && a != null) {
                Object obj = a.get("iap.purchases");
                JSONArray jSONArray = null;
                if (obj != null) {
                    try {
                        jSONArray = (JSONArray) obj;
                    } catch (Exception unused) {
                        C12065a.m32848c("Invalid object type for purchases");
                    }
                }
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                }
                JSONObject data = getData();
                try {
                    data.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis());
                    jSONArray.put(data);
                    a.set("iap.purchases", jSONArray);
                    a.mo71169f();
                    a.mo71163a(C12027h.SET, a.get("iap.purchases"));
                } catch (JSONException unused2) {
                    C12065a.m32848c("Error constructing purchase object");
                }
            }
        } else {
            C12065a.m32848c("Unity Ads could not commit metadata due to storage error or the data is null");
        }
    }

    public synchronized boolean set(String str, Object obj) {
        return setRaw(str, obj);
    }

    public void setCurrency(String str) {
        set("currency", str);
    }

    public void setPrice(Double d) {
        set("price", d);
    }

    public void setProductId(String str) {
        set(KEY_PRODUCT_ID, str);
    }

    public void setReceiptPurchaseData(String str) {
        set(KEY_RECEIPT_PURCHASE_DATA, str);
    }

    public void setSignature(String str) {
        set(KEY_SIGNATURE, str);
    }
}
