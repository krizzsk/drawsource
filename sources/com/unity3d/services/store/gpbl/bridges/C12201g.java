package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.C12090a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.store.gpbl.bridges.g */
/* compiled from: SkuDetailsParamsBridge */
public class C12201g extends C12090a {

    /* renamed from: e */
    private static final Map<String, Class<?>[]> f29757e = new C12202a();

    /* renamed from: f */
    private final Object f29758f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$a */
    /* compiled from: SkuDetailsParamsBridge */
    static class C12202a extends HashMap<String, Class<?>[]> {
        C12202a() {
            put("newBuilder", new Class[0]);
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$b */
    /* compiled from: SkuDetailsParamsBridge */
    class C12203b extends HashMap<String, Class<?>[]> {
        C12203b() {
            put("newBuilder", new Class[0]);
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$c */
    /* compiled from: SkuDetailsParamsBridge */
    public static class C12204c extends C12090a {

        /* renamed from: e */
        private Object f29759e;

        /* renamed from: com.unity3d.services.store.gpbl.bridges.g$c$a */
        /* compiled from: SkuDetailsParamsBridge */
        class C12205a extends HashMap<String, Class<?>[]> {
            C12205a() {
                put("build", new Class[0]);
                put("setSkusList", new Class[]{List.class});
                put("setType", new Class[]{String.class});
            }
        }

        public C12204c(Object obj) {
            super(new C12205a());
            this.f29759e = obj;
        }

        /* renamed from: a */
        public C12204c mo71387a(List<String> list) {
            this.f29759e = mo71233a("setSkusList", this.f29759e, list);
            return this;
        }

        /* renamed from: c */
        public C12204c mo71388c(String str) {
            this.f29759e = mo71233a("setType", this.f29759e, str);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public String mo70785g() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        /* renamed from: i */
        public C12201g mo71389i() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
            return new C12201g(mo71233a("build", this.f29759e, new Object[0]));
        }
    }

    public C12201g(Object obj) {
        super(new C12203b());
        this.f29758f = obj;
    }

    /* renamed from: a */
    public static Object m33225a(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return m33226i().getMethod(str, (Class[]) f29757e.get(str)).invoke((Object) null, objArr);
    }

    /* renamed from: i */
    public static Class<?> m33226i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsParams");
    }

    /* renamed from: k */
    public static C12204c m33227k() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C12204c(m33225a("newBuilder", new Object[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo70785g() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    /* renamed from: j */
    public Object mo71386j() {
        return this.f29758f;
    }
}
