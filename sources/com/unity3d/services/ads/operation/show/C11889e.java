package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.request.metrics.C12108a;
import com.unity3d.services.core.request.metrics.C12109b;
import com.unity3d.services.core.timer.C12125a;
import com.unity3d.services.core.timer.C12133g;
import com.unity3d.services.core.webview.bridge.C12145b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.operation.show.e */
/* compiled from: ShowModuleDecoratorTimeout */
public class C11889e extends C11888d {

    /* renamed from: b */
    private final ExecutorService f28832b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private final boolean f28833c;

    /* renamed from: com.unity3d.services.ads.operation.show.e$a */
    /* compiled from: ShowModuleDecoratorTimeout */
    class C11890a implements C12133g {

        /* renamed from: a */
        final /* synthetic */ C11897g f28834a;

        C11890a(C11897g gVar) {
            this.f28834a = gVar;
        }

        /* renamed from: a */
        public void mo70829a() {
            C11889e eVar = C11889e.this;
            C11897g gVar = this.f28834a;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            eVar.m32419a(gVar, unityAdsShowError, "[UnityAds] Timeout while trying to show " + this.f28834a.f28791c);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.e$b */
    /* compiled from: ShowModuleDecoratorTimeout */
    class C11891b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11897g f28836a;

        C11891b(C11897g gVar) {
            this.f28836a = gVar;
        }

        public void run() {
            C11897g gVar = this.f28836a;
            if (!gVar.f28793e.block((long) gVar.f28792d.getShowTimeout())) {
                C11889e eVar = C11889e.this;
                C11897g gVar2 = this.f28836a;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                eVar.m32419a(gVar2, unityAdsShowError, "[UnityAds] Timeout while trying to show " + this.f28836a.f28791c);
            }
        }
    }

    public C11889e(C11883a aVar, ConfigurationReader configurationReader) {
        super(aVar);
        this.f28833c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    /* renamed from: d */
    private void m32420d(String str) {
        C11897g c;
        C11884b c2 = get(str);
        if (c2 != null && (c = c2.mo70840c()) != null) {
            if (this.f28833c) {
                C12125a aVar = c.f28795g;
                if (aVar != null) {
                    aVar.mo71291a();
                }
            } else if (c2.mo70840c().f28793e != null) {
                c2.mo70840c().f28793e.open();
            }
        }
    }

    /* renamed from: b */
    public void mo70835b(String str) {
        m32420d(str);
        super.mo70835b(str);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        m32420d(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        m32420d(str);
        super.onUnityAdsShowStart(str);
    }

    /* renamed from: a */
    public void mo70810a(C12145b bVar, C11897g gVar) {
        mo70808a().mo71266a(C12109b.m33008b());
        gVar.mo70813e();
        m32418a(gVar);
        super.mo70843a(bVar, gVar);
    }

    /* renamed from: a */
    private void m32418a(C11897g gVar) {
        if (!this.f28833c) {
            this.f28832b.submit(new C11891b(gVar));
        } else if (gVar != null) {
            C12125a aVar = new C12125a(Integer.valueOf(gVar.f28792d.getShowTimeout()), new C11890a(gVar));
            gVar.f28795g = aVar;
            aVar.mo71292a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32419a(C11897g gVar, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (gVar != null) {
            mo70808a().mo71266a(C12109b.m33009b(C12108a.timeout, Long.valueOf(gVar.mo70812d())));
            mo70823a(gVar.f28790b);
            gVar.mo70851a(unityAdsShowError, str);
        }
    }
}
