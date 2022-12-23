package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12030j;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.ads.token.h */
/* compiled from: TokenStorage */
public class C11913h {

    /* renamed from: a */
    private static final Object f28888a = new Object();

    /* renamed from: b */
    private static ConcurrentLinkedQueue<String> f28889b = null;

    /* renamed from: c */
    private static int f28890c = 0;

    /* renamed from: d */
    private static boolean f28891d = false;

    /* renamed from: e */
    private static String f28892e;

    /* renamed from: f */
    private static ExecutorService f28893f = Executors.newSingleThreadExecutor();

    /* renamed from: com.unity3d.services.ads.token.h$a */
    /* compiled from: TokenStorage */
    static class C11914a implements C11905c {
        C11914a() {
        }

        /* renamed from: a */
        public void mo70858a(String str) {
            C12136a.m33103c().mo71310a((Enum) C12143b.TOKEN, (Enum) C11912g.TOKEN_NATIVE_DATA, str);
        }
    }

    /* renamed from: a */
    public static void m32462a(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (f28888a) {
            if (f28889b == null) {
                f28889b = new ConcurrentLinkedQueue<>();
                f28890c = 0;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                f28889b.add(jSONArray.getString(i));
            }
            z = !f28889b.isEmpty();
        }
        if (z) {
            m32460a(Boolean.FALSE);
            C11898a.m32434a().mo70856b(C12030j.TOKEN_REMOTE);
        }
    }

    /* renamed from: b */
    public static void m32465b(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (f28888a) {
            f28889b = new ConcurrentLinkedQueue<>();
            f28890c = 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                f28889b.add(jSONArray.getString(i));
            }
            z = !f28889b.isEmpty();
        }
        if (z) {
            m32460a(Boolean.FALSE);
            C11898a.m32434a().mo70856b(C12030j.TOKEN_REMOTE);
        }
    }

    /* renamed from: c */
    public static String m32466c() {
        synchronized (f28888a) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = f28889b;
            if (concurrentLinkedQueue == null) {
                String str = f28892e;
                return str;
            } else if (concurrentLinkedQueue.isEmpty()) {
                C12136a.m33103c().mo71310a((Enum) C12143b.TOKEN, (Enum) C11912g.QUEUE_EMPTY, new Object[0]);
                return null;
            } else if (f28891d) {
                C12136a c = C12136a.m33103c();
                C12143b bVar = C12143b.TOKEN;
                C11912g gVar = C11912g.TOKEN_ACCESS;
                int i = f28890c;
                f28890c = i + 1;
                c.mo71310a((Enum) bVar, (Enum) gVar, Integer.valueOf(i));
                String peek = f28889b.peek();
                return peek;
            } else {
                C12136a c2 = C12136a.m33103c();
                C12143b bVar2 = C12143b.TOKEN;
                C11912g gVar2 = C11912g.TOKEN_ACCESS;
                int i2 = f28890c;
                f28890c = i2 + 1;
                c2.mo71310a((Enum) bVar2, (Enum) gVar2, Integer.valueOf(i2));
                String poll = f28889b.poll();
                return poll;
            }
        }
    }

    /* renamed from: b */
    public static void m32464b() {
        new C11906d(f28893f, new C12033a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()), (String) null).mo70860a((C11905c) new C11914a());
    }

    /* renamed from: a */
    public static void m32459a() {
        synchronized (f28888a) {
            f28889b = null;
            f28890c = 0;
        }
    }

    /* renamed from: a */
    public static void m32463a(boolean z) {
        synchronized (f28888a) {
            f28891d = z;
        }
    }

    /* renamed from: a */
    public static void m32461a(String str) {
        boolean z;
        synchronized (f28888a) {
            f28892e = str;
            z = str != null;
        }
        if (z) {
            C11898a.m32434a().mo70856b(C12030j.TOKEN_REMOTE);
            m32460a(Boolean.TRUE);
        }
    }

    /* renamed from: a */
    private static void m32460a(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }
}
