package com.unity3d.services.store;

import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.store.core.C12171a;
import com.unity3d.services.store.core.C12173b;
import com.unity3d.services.store.gpbl.C12175a;
import com.unity3d.services.store.gpbl.C12176b;
import com.unity3d.services.store.gpbl.C12206c;
import com.unity3d.services.store.gpbl.bridges.C12177a;
import com.unity3d.services.store.gpbl.bridges.C12195c;
import com.unity3d.services.store.gpbl.bridges.C12197d;
import com.unity3d.services.store.gpbl.bridges.C12200f;
import com.unity3d.services.store.listeners.C12212a;
import com.unity3d.services.store.listeners.C12213b;
import com.unity3d.services.store.listeners.C12215d;
import com.unity3d.services.store.listeners.C12216e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.unity3d.services.store.c */
/* compiled from: StoreMonitor */
public class C12166c {

    /* renamed from: a */
    private static C12206c f29722a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static AtomicBoolean f29723b = new AtomicBoolean(false);

    /* renamed from: c */
    private static C12171a f29724c;

    /* renamed from: d */
    private static C12173b f29725d;

    /* renamed from: com.unity3d.services.store.c$a */
    /* compiled from: StoreMonitor */
    static class C12167a implements C12213b {
        C12167a() {
        }

        /* renamed from: a */
        public void mo71355a(C12177a aVar, List<C12195c> list) {
            if (aVar.mo71370i() == C12175a.OK) {
                JSONArray jSONArray = new JSONArray();
                if (list != null) {
                    for (C12195c k : list) {
                        jSONArray.put(k.mo71383k());
                    }
                }
                C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.PURCHASES_UPDATED_RESULT, jSONArray);
                return;
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.PURCHASES_UPDATED_ERROR, aVar.mo71370i());
        }
    }

    /* renamed from: com.unity3d.services.store.c$c */
    /* compiled from: StoreMonitor */
    static class C12169c implements C12212a {

        /* renamed from: a */
        final /* synthetic */ int f29726a;

        C12169c(int i) {
            this.f29726a = i;
        }

        /* renamed from: a */
        public void mo71358a(C12177a aVar, List<C12197d> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C12197d i : list) {
                    jSONArray.put(i.mo71371i());
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.PURCHASE_HISTORY_LIST_REQUEST_RESULT, Integer.valueOf(this.f29726a), jSONArray);
        }
    }

    /* renamed from: com.unity3d.services.store.c$d */
    /* compiled from: StoreMonitor */
    static class C12170d implements C12215d {

        /* renamed from: a */
        final /* synthetic */ int f29727a;

        C12170d(int i) {
            this.f29727a = i;
        }

        /* renamed from: a */
        public void mo71359a(C12177a aVar, List<C12200f> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C12200f i : list) {
                    jSONArray.put(i.mo71371i());
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.SKU_DETAILS_LIST_REQUEST_RESULT, Integer.valueOf(this.f29727a), jSONArray);
        }
    }

    /* renamed from: b */
    public static boolean m33169b() {
        return f29723b.get();
    }

    /* renamed from: c */
    public static void m33170c() {
        if (f29725d != null) {
            C12084a.m32907d().unregisterActivityLifecycleCallbacks(f29725d);
            f29725d = null;
        }
    }

    /* renamed from: a */
    public static void m33166a(C12171a aVar) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InterruptedException, InvocationTargetException {
        if (f29723b.get()) {
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(C12175a.OK.mo71369a()));
            return;
        }
        f29724c = aVar;
        C12206c cVar = new C12206c(C12084a.m32908e(), new C12167a());
        f29722a = cVar;
        cVar.mo71391a((C12176b) new C12168b());
    }

    /* renamed from: b */
    public static int m33168b(int i, String str) {
        int i2 = -1;
        try {
            i2 = f29722a.mo71390a(str);
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        } catch (Exception e) {
            f29724c.mo71360a(C12165b.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
            return i2;
        }
    }

    /* renamed from: com.unity3d.services.store.c$b */
    /* compiled from: StoreMonitor */
    static class C12168b implements C12176b {
        C12168b() {
        }

        /* renamed from: a */
        public void mo71357a(C12177a aVar) {
            if (aVar.mo71370i() == C12175a.OK) {
                C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.INITIALIZATION_REQUEST_RESULT, aVar.mo71370i());
                C12166c.f29723b.set(true);
                return;
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.INITIALIZATION_REQUEST_FAILED, aVar.mo71370i());
        }

        /* renamed from: a */
        public void mo71356a() {
            C12136a.m33103c().mo71310a((Enum) C12143b.STORE, (Enum) C12165b.DISCONNECTED_RESULT, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m33163a(int i, String str) {
        try {
            f29722a.mo71393a(str, new C12216e(Integer.valueOf(i), C12165b.PURCHASES_REQUEST_RESULT, C12165b.PURCHASES_REQUEST_ERROR));
        } catch (Exception e) {
            f29724c.mo71360a(C12165b.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m33164a(int i, String str, int i2) {
        try {
            f29722a.mo71392a(str, i2, (C12212a) new C12169c(i));
        } catch (Exception e) {
            f29724c.mo71360a(C12165b.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m33165a(int i, String str, ArrayList<String> arrayList) {
        try {
            f29722a.mo71394a(str, arrayList, (C12215d) new C12170d(i));
        } catch (Exception e) {
            f29724c.mo71360a(C12165b.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m33167a(ArrayList<String> arrayList) {
        if (f29725d != null) {
            m33170c();
        }
        f29725d = new C12173b(arrayList, f29722a);
        C12084a.m32907d().registerActivityLifecycleCallbacks(f29725d);
    }
}
