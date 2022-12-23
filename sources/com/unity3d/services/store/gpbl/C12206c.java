package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.unity3d.services.store.gpbl.bridges.C12201g;
import com.unity3d.services.store.gpbl.bridges.billingclient.C12181a;
import com.unity3d.services.store.gpbl.bridges.billingclient.C12182b;
import com.unity3d.services.store.gpbl.proxies.C12207a;
import com.unity3d.services.store.gpbl.proxies.C12208b;
import com.unity3d.services.store.gpbl.proxies.C12209c;
import com.unity3d.services.store.gpbl.proxies.C12210d;
import com.unity3d.services.store.gpbl.proxies.C12211e;
import com.unity3d.services.store.listeners.C12212a;
import com.unity3d.services.store.listeners.C12213b;
import com.unity3d.services.store.listeners.C12214c;
import com.unity3d.services.store.listeners.C12215d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: com.unity3d.services.store.gpbl.c */
/* compiled from: StoreBilling */
public class C12206c {

    /* renamed from: a */
    private final C12182b f29760a;

    public C12206c(Context context, C12213b bVar) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this.f29760a = C12181a.m33187a(context).mo71379a(new C12209c(bVar)).mo71378a().mo71380c();
    }

    /* renamed from: a */
    public void mo71391a(C12176b bVar) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.f29760a.mo71374a(new C12207a(bVar));
    }

    /* renamed from: a */
    public int mo71390a(String str) {
        boolean z;
        if (str.equals(BillingClient.SkuType.INAPP)) {
            z = this.f29760a.mo71377b();
        } else {
            if (str.equals(BillingClient.SkuType.SUBS)) {
                str = BillingClient.FeatureType.SUBSCRIPTIONS;
            }
            z = this.f29760a.mo71372a(str) == C12175a.OK;
        }
        if (z) {
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo71393a(String str, C12214c cVar) throws ClassNotFoundException {
        this.f29760a.mo71376a(str, new C12210d(cVar));
    }

    /* renamed from: a */
    public void mo71394a(String str, ArrayList<String> arrayList, C12215d dVar) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.f29760a.mo71373a(C12201g.m33227k().mo71387a(arrayList).mo71388c(str).mo71389i(), new C12211e(dVar));
    }

    /* renamed from: a */
    public void mo71392a(String str, int i, C12212a aVar) throws ClassNotFoundException {
        this.f29760a.mo71375a(str, new C12208b(aVar, i));
    }
}
