package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.unity3d.services.core.reflection.C12090a;
import com.unity3d.services.store.gpbl.C12175a;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12201g;
import com.unity3d.services.store.gpbl.bridges.billingclient.C12182b;
import com.unity3d.services.store.gpbl.proxies.C12207a;
import com.unity3d.services.store.gpbl.proxies.C12208b;
import com.unity3d.services.store.gpbl.proxies.C12211e;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a */
/* compiled from: BillingClientBridgeCommon */
public abstract class C12184a extends C12090a implements C12182b {

    /* renamed from: e */
    private static final Map<String, Class<?>[]> f29752e = new C12185a();

    /* renamed from: f */
    protected final Object f29753f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a$a */
    /* compiled from: BillingClientBridgeCommon */
    static class C12185a extends HashMap<String, Class<?>[]> {
        C12185a() {
            put("newBuilder", new Class[]{Context.class});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a$b */
    /* compiled from: BillingClientBridgeCommon */
    static class C12186b extends HashMap<String, Class<?>[]> {
        C12186b() throws ClassNotFoundException {
            put("newBuilder", new Class[]{Context.class});
            put("startConnection", new Class[]{C12207a.m33240c()});
            put("endConnection", new Class[0]);
            put("querySkuDetailsAsync", new Class[]{C12201g.m33226i(), C12211e.m33253c()});
            put("queryPurchaseHistoryAsync", new Class[]{String.class, C12208b.m33243c()});
            put("isFeatureSupported", new Class[]{String.class});
            put("isReady", new Class[0]);
        }
    }

    public C12184a(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(m33198a(map));
        this.f29753f = obj;
    }

    /* renamed from: a */
    private static Map<String, Class<?>[]> m33198a(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new C12186b());
        return map;
    }

    /* renamed from: i */
    protected static Class<?> m33199i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClient");
    }

    /* renamed from: b */
    public boolean mo71377b() {
        return ((Boolean) mo71233a("isReady", this.f29753f, new Object[0])).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.BillingClient";
    }

    /* renamed from: a */
    public void mo71374a(C12207a aVar) throws ClassNotFoundException {
        mo71234b("startConnection", this.f29753f, aVar.mo71239b());
    }

    /* renamed from: a */
    public C12175a mo71372a(String str) {
        return new C12177a(mo71233a("isFeatureSupported", this.f29753f, str)).mo71370i();
    }

    /* renamed from: a */
    public void mo71373a(C12201g gVar, C12211e eVar) throws ClassNotFoundException {
        mo71234b("querySkuDetailsAsync", this.f29753f, gVar.mo71386j(), eVar.mo71239b());
    }

    /* renamed from: a */
    public void mo71375a(String str, C12208b bVar) throws ClassNotFoundException {
        mo71234b("queryPurchaseHistoryAsync", this.f29753f, str, bVar.mo71239b());
    }

    /* renamed from: a */
    public static Object m33197a(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return m33199i().getMethod(str, (Class[]) f29752e.get(str)).invoke((Object) null, objArr);
    }
}
