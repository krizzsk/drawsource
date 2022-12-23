package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.metrics.C12109b;
import com.unity3d.services.core.webview.bridge.C12145b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.ads.operation.load.e */
/* compiled from: LoadModuleDecoratorInitializationBuffer */
public class C11873e extends C11872d implements IInitializationListener {

    /* renamed from: b */
    private ConcurrentHashMap<C11882h, C12145b> f28804b = new ConcurrentHashMap<>();

    /* renamed from: com.unity3d.services.ads.operation.load.e$a */
    /* compiled from: LoadModuleDecoratorInitializationBuffer */
    class C11874a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11882h f28805a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsLoadError f28806b;

        /* renamed from: c */
        final /* synthetic */ String f28807c;

        C11874a(C11882h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f28805a = hVar;
            this.f28806b = unityAdsLoadError;
            this.f28807c = str;
        }

        public void run() {
            C11882h hVar = this.f28805a;
            hVar.f28821h.onUnityAdsFailedToLoad(hVar.f28791c, this.f28806b, this.f28807c);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.e$b */
    /* compiled from: LoadModuleDecoratorInitializationBuffer */
    static /* synthetic */ class C11875b {

        /* renamed from: a */
        static final /* synthetic */ int[] f28809a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.properties.d$a[] r0 = com.unity3d.services.core.properties.C12088d.C12089a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28809a = r0
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.INITIALIZED_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28809a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.properties.d$a r1 = com.unity3d.services.core.properties.C12088d.C12089a.INITIALIZED_FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.operation.load.C11873e.C11875b.<clinit>():void");
        }
    }

    public C11873e(C11867a aVar, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(aVar);
        iInitializationNotificationCenter.addListener(this);
    }

    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        for (C11882h a : this.f28804b.keySet()) {
            m32386a(a, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
        }
        this.f28804b.clear();
    }

    public synchronized void onSdkInitialized() {
        for (Map.Entry next : this.f28804b.entrySet()) {
            super.mo70822a((C12145b) next.getValue(), (C11882h) next.getKey());
        }
        this.f28804b.clear();
    }

    /* renamed from: a */
    public void mo70810a(C12145b bVar, C11882h hVar) {
        if (hVar != null) {
            int i = C11875b.f28809a[C12088d.m32932e().ordinal()];
            if (i == 1) {
                super.mo70822a(bVar, hVar);
            } else if (i != 2) {
                this.f28804b.put(hVar, bVar);
            } else {
                m32386a(hVar, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
            }
        }
    }

    /* renamed from: a */
    private void m32386a(C11882h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        if (hVar != null && hVar.f28821h != null) {
            mo70808a().mo71266a(C12109b.m33003a(unityAdsLoadError, Long.valueOf(hVar.mo70812d())));
            C12080j.m32879a((Runnable) new C11874a(hVar, unityAdsLoadError, str));
        }
    }
}
