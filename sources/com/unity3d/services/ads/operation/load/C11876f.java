package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.request.metrics.C12108a;
import com.unity3d.services.core.request.metrics.C12109b;
import com.unity3d.services.core.timer.C12125a;
import com.unity3d.services.core.timer.C12133g;
import com.unity3d.services.core.webview.bridge.C12145b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.operation.load.f */
/* compiled from: LoadModuleDecoratorTimeout */
public class C11876f extends C11872d {

    /* renamed from: b */
    private final ExecutorService f28810b = Executors.newCachedThreadPool();

    /* renamed from: c */
    private final boolean f28811c;

    /* renamed from: com.unity3d.services.ads.operation.load.f$a */
    /* compiled from: LoadModuleDecoratorTimeout */
    class C11877a implements C12133g {

        /* renamed from: a */
        final /* synthetic */ C11882h f28812a;

        C11877a(C11882h hVar) {
            this.f28812a = hVar;
        }

        /* renamed from: a */
        public void mo70829a() {
            C11876f.this.m32390a(this.f28812a);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.f$b */
    /* compiled from: LoadModuleDecoratorTimeout */
    class C11878b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11882h f28814a;

        C11878b(C11882h hVar) {
            this.f28814a = hVar;
        }

        public void run() {
            C11882h hVar = this.f28814a;
            if (!hVar.f28793e.block((long) hVar.f28792d.getLoadTimeout())) {
                C11876f.this.m32390a(this.f28814a);
            }
        }
    }

    public C11876f(C11867a aVar, ConfigurationReader configurationReader) {
        super(aVar);
        this.f28811c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    /* renamed from: b */
    private void m32391b(C11882h hVar) {
        if (!this.f28811c) {
            this.f28810b.submit(new C11878b(hVar));
        } else if (hVar != null) {
            C12125a aVar = new C12125a(Integer.valueOf(hVar.f28792d.getLoadTimeout()), new C11877a(hVar));
            hVar.f28795g = aVar;
            aVar.mo71292a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* renamed from: d */
    private void m32392d(String str) {
        C11882h b;
        C11868b c = get(str);
        if (c != null && (b = c.mo70816b()) != null) {
            if (this.f28811c) {
                C12125a aVar = b.f28795g;
                if (aVar != null) {
                    aVar.mo71291a();
                }
            } else if (c.mo70816b().f28793e != null) {
                c.mo70816b().f28793e.open();
            }
        }
    }

    public void onUnityAdsAdLoaded(String str) {
        m32392d(str);
        super.onUnityAdsAdLoaded(str);
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        m32392d(str);
        super.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    /* renamed from: a */
    public void mo70810a(C12145b bVar, C11882h hVar) {
        mo70808a().mo71266a(C12109b.m33002a());
        hVar.mo70813e();
        m32391b(hVar);
        super.mo70822a(bVar, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32390a(C11882h hVar) {
        if (hVar != null) {
            mo70808a().mo71266a(C12109b.m33005a(C12108a.timeout, Long.valueOf(hVar.mo70812d())));
            mo70823a(hVar.f28790b);
            UnityAds.UnityAdsLoadError unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
            hVar.mo70833a(unityAdsLoadError, "[UnityAds] Timeout while loading " + hVar.f28791c);
        }
    }
}
