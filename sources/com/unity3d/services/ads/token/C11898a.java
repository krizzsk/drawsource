package com.unity3d.services.ads.token;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12030j;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12085b;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.token.a */
/* compiled from: AsyncTokenStorage */
public class C11898a {

    /* renamed from: a */
    private static C11898a f28850a;

    /* renamed from: b */
    private final List<C11903d> f28851b = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f28852c;

    /* renamed from: d */
    private boolean f28853d = false;

    /* renamed from: e */
    private boolean f28854e = false;

    /* renamed from: f */
    private Configuration f28855f = new Configuration();

    /* renamed from: g */
    private C11904b f28856g;

    /* renamed from: h */
    private final C12085b f28857h = new C12085b();

    /* renamed from: com.unity3d.services.ads.token.a$a */
    /* compiled from: AsyncTokenStorage */
    class C11899a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11903d f28858a;

        C11899a(C11903d dVar) {
            this.f28858a = dVar;
        }

        public void run() {
            C11898a.this.m32436a(this.f28858a, (String) null, C12030j.TOKEN_NATIVE);
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$b */
    /* compiled from: AsyncTokenStorage */
    class C11900b implements C11905c {

        /* renamed from: a */
        final /* synthetic */ C11903d f28860a;

        /* renamed from: com.unity3d.services.ads.token.a$b$a */
        /* compiled from: AsyncTokenStorage */
        class C11901a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f28862a;

            C11901a(String str) {
                this.f28862a = str;
            }

            public void run() {
                C11900b bVar = C11900b.this;
                C11898a.this.m32436a(bVar.f28860a, this.f28862a, C12030j.TOKEN_NATIVE);
            }
        }

        C11900b(C11903d dVar) {
            this.f28860a = dVar;
        }

        /* renamed from: a */
        public void mo70858a(String str) {
            C11898a.this.f28852c.post(new C11901a(str));
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$c */
    /* compiled from: AsyncTokenStorage */
    static /* synthetic */ class C11902c {

        /* renamed from: a */
        static final /* synthetic */ int[] f28864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.device.j[] r0 = com.unity3d.services.core.device.C12030j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28864a = r0
                com.unity3d.services.core.device.j r1 = com.unity3d.services.core.device.C12030j.TOKEN_NATIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.j r1 = com.unity3d.services.core.device.C12030j.TOKEN_REMOTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.token.C11898a.C11902c.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$d */
    /* compiled from: AsyncTokenStorage */
    class C11903d {

        /* renamed from: a */
        public IUnityAdsTokenListener f28865a;

        /* renamed from: b */
        public Runnable f28866b;

        /* renamed from: c */
        public boolean f28867c;

        C11903d() {
        }
    }

    public C11898a(C11904b bVar, Handler handler) {
        this.f28852c = handler;
        this.f28856g = bVar;
    }

    /* renamed from: b */
    public synchronized void mo70855b(Configuration configuration) {
        this.f28855f = configuration;
        boolean a = m32441a(configuration);
        this.f28854e = a;
        if (a) {
            if (this.f28856g == null) {
                C12033a aVar = new C12033a(new ConfigurationReader(), PrivacyConfigStorage.getInstance());
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.f28856g = new C11906d(newSingleThreadExecutor, aVar);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this.f28856g = new C11908e(newSingleThreadExecutor, this.f28856g, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            Iterator it = new ArrayList(this.f28851b).iterator();
            while (it.hasNext()) {
                m32435a((C11903d) it.next());
            }
        }
    }

    /* renamed from: a */
    public static C11898a m32434a() {
        if (f28850a == null) {
            f28850a = new C11898a((C11904b) null, new Handler(Looper.getMainLooper()));
        }
        return f28850a;
    }

    /* renamed from: a */
    private synchronized C11903d m32433a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        C11903d dVar;
        dVar = new C11903d();
        dVar.f28865a = iUnityAdsTokenListener;
        dVar.f28866b = new C11899a(dVar);
        this.f28851b.add(dVar);
        this.f28852c.postDelayed(dVar.f28866b, (long) this.f28855f.getTokenTimeout());
        return dVar;
    }

    /* renamed from: a */
    private synchronized void m32438a(C12030j jVar) {
        while (true) {
            if (this.f28851b.isEmpty()) {
                break;
            }
            String c = C11913h.m32466c();
            if (c == null) {
                break;
            }
            m32436a(this.f28851b.get(0), c, jVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo70856b(C12030j jVar) {
        this.f28853d = true;
        if (this.f28854e) {
            m32438a(jVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo70854b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (C12088d.m32932e() == C12088d.C12089a.INITIALIZED_FAILED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady((String) null);
            m32440a((String) null, C12030j.TOKEN_REMOTE);
        } else if (C12088d.m32932e() == C12088d.C12089a.NOT_INITIALIZED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady((String) null);
            m32440a((String) null, C12030j.TOKEN_REMOTE);
        } else {
            C11903d a = m32433a(iUnityAdsTokenListener);
            if (this.f28854e) {
                m32435a(a);
            }
        }
    }

    /* renamed from: a */
    private void m32435a(C11903d dVar) {
        if (!dVar.f28867c) {
            dVar.f28867c = true;
            if (this.f28853d || !this.f28855f.getExperiments().isNativeTokenEnabled()) {
                String c = C11913h.m32466c();
                if (c != null && !c.isEmpty()) {
                    m32436a(dVar, c, C12030j.TOKEN_REMOTE);
                    return;
                }
                return;
            }
            this.f28856g.mo70860a(new C11900b(dVar));
        }
    }

    /* renamed from: b */
    private void m32443b(String str) {
        if (str == null || str.isEmpty()) {
            C12120i.m33045a().sendMetric(C12122j.m33061b(m32442b()));
        } else {
            C12120i.m33045a().sendMetric(C12122j.m33057a(m32442b()));
        }
    }

    /* renamed from: b */
    private Map<String, String> m32442b() {
        HashMap hashMap = new HashMap();
        hashMap.put("state", this.f28857h.mo71232a(C12088d.m32932e()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m32436a(C11903d dVar, String str, C12030j jVar) {
        if (this.f28851b.remove(dVar)) {
            dVar.f28865a.onUnityAdsTokenReady(str);
            try {
                this.f28852c.removeCallbacks(dVar.f28866b);
            } catch (Exception e) {
                C12065a.m32842a("Failed to remove callback from a handler", e);
            }
        }
        m32440a(str, jVar);
    }

    /* renamed from: a */
    private void m32440a(String str, C12030j jVar) {
        int i = C11902c.f28864a[jVar.ordinal()];
        if (i == 1) {
            m32439a(str);
        } else if (i != 2) {
            C12065a.m32848c("Unknown token type passed to sendTokenMetrics");
        } else {
            m32443b(str);
        }
    }

    /* renamed from: a */
    private void m32439a(String str) {
        if (str == null) {
            C12120i.m33045a().sendMetric(C12122j.m33069d(m32442b()));
        } else {
            C12120i.m33045a().sendMetric(C12122j.m33065c(m32442b()));
        }
    }

    /* renamed from: a */
    private boolean m32441a(Configuration configuration) {
        return (configuration == null || configuration.getExperiments() == null) ? false : true;
    }
}
