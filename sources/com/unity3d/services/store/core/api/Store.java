package com.unity3d.services.store.core.api;

import com.unity3d.services.ads.gmascar.handlers.C11859e;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.store.C12164a;
import com.unity3d.services.store.C12165b;
import com.unity3d.services.store.C12166c;
import com.unity3d.services.store.core.C12171a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class Store {

    /* renamed from: a */
    private static final C12171a f29729a = new C12171a(new C11859e());

    /* renamed from: com.unity3d.services.store.core.api.Store$a */
    static class C12172a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f29730a;

        /* renamed from: b */
        final /* synthetic */ String f29731b;

        C12172a(Integer num, String str) {
            this.f29730a = num;
            this.f29731b = str;
        }

        public void run() {
            C12166c.m33168b(this.f29730a.intValue(), this.f29731b);
        }
    }

    @WebViewExposed
    public static void getPurchaseHistory(Integer num, String str, Integer num2, C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C12166c.m33164a(num.intValue(), str, num2.intValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void getPurchases(Integer num, String str, C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C12166c.m33163a(num.intValue(), str);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void getSkuDetails(Integer num, String str, JSONArray jSONArray, C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            C12166c.m33165a(num.intValue(), str, (ArrayList<String>) arrayList);
        } catch (JSONException e) {
            f29729a.mo71360a(C12165b.SKU_DETAILS_LIST_REQUEST_ERROR, num.intValue(), e);
        }
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void initialize(C12160l lVar) {
        try {
            C12166c.m33166a(f29729a);
            lVar.mo71347a(new Object[0]);
        } catch (Exception e) {
            lVar.mo71346a(C12164a.UNKNOWN_ERROR, e.getMessage(), e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void isFeatureSupported(Integer num, String str, C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        new Thread(new C12172a(num, str)).start();
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void startPurchaseTracking(JSONArray jSONArray, C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(jSONArray.getString(i));
                i++;
            } catch (JSONException e) {
                lVar.mo71346a(C12164a.JSON_ERROR, e.getMessage());
                return;
            }
        }
        C12166c.m33167a((ArrayList<String>) arrayList);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void stopPurchaseTracking(C12160l lVar) {
        if (!C12166c.m33169b()) {
            lVar.mo71346a(C12164a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C12166c.m33170c();
        lVar.mo71347a(new Object[0]);
    }
}
