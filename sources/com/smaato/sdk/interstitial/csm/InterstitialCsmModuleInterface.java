package com.smaato.sdk.interstitial.csm;

import android.app.Application;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdInteractorProviderFunction;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p380ad.AdFormat;
import com.smaato.sdk.core.p380ad.AdLoaderPlugin;
import com.smaato.sdk.core.p380ad.AdPresenter;
import com.smaato.sdk.core.p380ad.AdPresenterBuilder;
import com.smaato.sdk.core.p380ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p380ad.AdStateMachine;
import com.smaato.sdk.core.p380ad.DiAdLayer;
import com.smaato.sdk.core.p380ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p381di.ClassFactory;
import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p384fi.Consumer;
import com.smaato.sdk.core.util.p384fi.Function;
import com.smaato.sdk.core.util.p384fi.NullableFunction;
import java.util.ServiceLoader;

public final class InterstitialCsmModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return "INTERSTITIAL_CSM_DI_NAME";
    }

    public String version() {
        return "21.8.4";
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new InterstitialCsmAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return InterstitialCsmModuleInterface.lambda$getAdLoaderPluginFactory$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return C10962x18eaf794.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$getAdLoaderPluginFactory$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, InterstitialCsmAdPresenterBuilderImpl.class);
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.CSM && InterstitialAdPresenter.class.isAssignableFrom(cls);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m30601of(new Consumer() {
            public final void accept(Object obj) {
                InterstitialCsmModuleInterface.this.lambda$moduleDiRegistry$6$InterstitialCsmModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$6$InterstitialCsmModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), CsmAdInteractorProviderFunction.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return InterstitialCsmModuleInterface.this.lambda$moduleDiRegistry$3$InterstitialCsmModuleInterface(diConstructor);
            }
        });
        diRegistry.registerFactory(moduleDiName(), ImpressionDetector.class, C10961x572ebcb6.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, C10960x656a0268.INSTANCE);
    }

    public /* synthetic */ CsmAdInteractorProviderFunction lambda$moduleDiRegistry$3$InterstitialCsmModuleInterface(DiConstructor diConstructor) {
        return new CsmAdInteractorProviderFunction(diConstructor) {
            public final /* synthetic */ DiConstructor f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return InterstitialCsmModuleInterface.this.lambda$moduleDiRegistry$2$InterstitialCsmModuleInterface(this.f$1, (CsmAdObject) obj);
            }
        };
    }

    public /* synthetic */ CsmAdInteractor lambda$moduleDiRegistry$2$InterstitialCsmModuleInterface(DiConstructor diConstructor, CsmAdObject csmAdObject) {
        return new CsmAdInteractor(DiLogLayer.getLoggerFrom(diConstructor), csmAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(moduleDiName(), StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get(moduleDiName(), ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m30601of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InterstitialCsmModuleInterface.this.mo67501x54da418e(this.f$1, (DiRegistry) obj);
            }
        });
    }

    /* renamed from: lambda$moduleAdPresenterDiRegistry$8$InterstitialCsmModuleInterface */
    public /* synthetic */ void mo67501x54da418e(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.CSM, InterstitialAdPresenter.class), InterstitialCsmAdPresenterBuilderImpl.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return InterstitialCsmModuleInterface.this.mo67500xccaa01af(diConstructor);
            }
        });
    }

    /* renamed from: lambda$moduleAdPresenterDiRegistry$7$InterstitialCsmModuleInterface */
    public /* synthetic */ InterstitialCsmAdPresenterBuilderImpl mo67500xccaa01af(DiConstructor diConstructor) {
        return new InterstitialCsmAdPresenterBuilderImpl((Function) diConstructor.get(moduleDiName(), CsmAdInteractorProviderFunction.class), ServiceLoader.load(SMAInterstitialNetworkEvent.class, ((Application) diConstructor.get(Application.class)).getClassLoader()), (CsmAdResponseParser) diConstructor.get(CsmAdResponseParser.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "InterstitialCsmModuleInterface{supportedFormat: " + AdFormat.CSM + "}";
    }
}
