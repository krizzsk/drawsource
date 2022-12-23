package com.unity3d.services.core.configuration;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.api.Broadcast;
import com.unity3d.services.core.api.C11970Connectivity;
import com.unity3d.services.core.api.Cache;
import com.unity3d.services.core.api.ClassDetection;
import com.unity3d.services.core.api.DeviceInfo;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.api.Permissions;
import com.unity3d.services.core.api.Preferences;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.api.Resolve;
import com.unity3d.services.core.api.Sdk;
import com.unity3d.services.core.api.SensorInfo;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.broadcast.C11982d;
import com.unity3d.services.core.cache.C11987e;
import com.unity3d.services.core.connectivity.C12004c;
import com.unity3d.services.core.device.C12008a;
import com.unity3d.services.core.device.C12019e;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.device.C12031k;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12104l;
import com.unity3d.services.core.request.metrics.C12120i;

public class CoreModuleConfiguration implements IModuleConfiguration {

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$a */
    class C11990a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsInitializationError f29212a;

        /* renamed from: b */
        final /* synthetic */ String f29213b;

        C11990a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            this.f29212a = unityAdsInitializationError;
            this.f29213b = str;
        }

        public void run() {
            C12088d.m32918a(this.f29212a, this.f29213b);
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$b */
    class C11991b implements Runnable {
        C11991b() {
        }

        public void run() {
            C12088d.m32947t();
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$c */
    static /* synthetic */ class C11992c {

        /* renamed from: a */
        static final /* synthetic */ int[] f29216a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.configuration.ErrorState[] r0 = com.unity3d.services.core.configuration.ErrorState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29216a = r0
                com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.CreateWebApp     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29216a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.InitModules     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.CoreModuleConfiguration.C11992c.<clinit>():void");
        }
    }

    public Class[] getWebAppApiClassList() {
        return new Class[]{Broadcast.class, Cache.class, C11970Connectivity.class, DeviceInfo.class, ClassDetection.class, Storage.class, Sdk.class, Request.class, Resolve.class, Intent.class, Lifecycle.class, Preferences.class, SensorInfo.class, Permissions.class};
    }

    public boolean initCompleteState(Configuration configuration) {
        C12120i.m33047b(configuration);
        InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        C12080j.m32879a((Runnable) new C11991b());
        return true;
    }

    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        UnityAds.UnityAdsInitializationError unityAdsInitializationError;
        C12120i.m33047b(configuration);
        int i = C11992c.f29216a[errorState.ordinal()];
        if (i == 1) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
        } else if (i != 2) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
            str = "Unity Ads failed to initialize due to internal error";
        } else {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED;
        }
        InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(str, errorState, 0);
        C12080j.m32879a((Runnable) new C11990a(unityAdsInitializationError, str));
        return true;
    }

    public boolean initModuleState(Configuration configuration) {
        C12120i.m33047b(configuration);
        return true;
    }

    public boolean resetState(Configuration configuration) {
        C12120i.m33047b(configuration);
        C11982d.m32594a();
        C11987e.m32602a();
        C12104l.m32997b();
        C12004c.m32663f();
        C12028i.m32766a(C12084a.m32908e());
        C12008a.m32671b(C12084a.m32908e());
        C12019e.m32748b(C12084a.m32908e());
        C12031k.m32772b();
        return true;
    }
}
