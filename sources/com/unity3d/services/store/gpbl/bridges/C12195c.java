package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.log.C12065a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.store.gpbl.bridges.c */
/* compiled from: PurchaseBridge */
public class C12195c extends C12179b {

    /* renamed from: f */
    private final Object f29755f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.c$a */
    /* compiled from: PurchaseBridge */
    class C12196a extends HashMap<String, Class<?>[]> {
        C12196a() {
            put("getSignature", new Class[0]);
        }
    }

    public C12195c(Object obj) {
        super(obj, new C12196a());
        this.f29755f = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.Purchase";
    }

    /* renamed from: j */
    public String mo71382j() {
        return (String) mo71233a("getSignature", this.f29755f, new Object[0]);
    }

    /* renamed from: k */
    public JSONObject mo71383k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", mo71371i());
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, mo71382j());
        } catch (JSONException e) {
            C12065a.m32849c("Could not build Purchase result Json: ", e.getMessage());
        }
        return jSONObject;
    }
}
