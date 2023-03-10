package com.smaato.sdk.banner.framework;

import com.smaato.sdk.banner.p379ad.BannerAdLoaderPlugin;
import com.smaato.sdk.banner.p379ad.BannerAutoReloadConfig;
import com.smaato.sdk.banner.widget.BannerViewLoader;
import com.smaato.sdk.banner.widget.BlockingUtils;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.api.VideoType;
import com.smaato.sdk.core.api.VideoTypeAdRequestExtrasProvider;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p380ad.AdFormat;
import com.smaato.sdk.core.p380ad.AdLoaderPlugin;
import com.smaato.sdk.core.p380ad.AdPresenter;
import com.smaato.sdk.core.p380ad.AdStateMachine;
import com.smaato.sdk.core.p380ad.AutoReloadConfig;
import com.smaato.sdk.core.p380ad.AutoReloadPolicy;
import com.smaato.sdk.core.p380ad.BannerAdPresenter;
import com.smaato.sdk.core.p380ad.DiAdLayer;
import com.smaato.sdk.core.p380ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p381di.ClassFactory;
import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.memory.LeakProtection;
import com.smaato.sdk.core.util.p384fi.Function;
import com.smaato.sdk.core.util.p384fi.FunctionUtils;
import com.smaato.sdk.core.util.p384fi.NullableFunction;
import com.smaato.sdk.core.util.p384fi.Predicate;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

public class BannerModuleInterface implements ModuleInterface {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;
    private static final List<AdFormat> POSSIBLE_BANNER_MODULE_AD_FORMATS = Lists.m30610of((T[]) new AdFormat[]{AdFormat.STATIC_IMAGE, AdFormat.RICH_MEDIA, AdFormat.CSM, AdFormat.VIDEO});
    private boolean atLeastOneBannerModuleIsPresent;
    private volatile List<AdPresenterModuleInterface> foundInterfaces;
    private String missingBannerSubModulesMessage;

    public String moduleDiName() {
        return "BannerModuleInterface";
    }

    public String version() {
        return "21.8.4";
    }

    public synchronized void init(ClassLoader classLoader) {
        init((Iterable<AdPresenterModuleInterface>) ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
    }

    public boolean isInitialised() {
        return this.atLeastOneBannerModuleIsPresent;
    }

    public Class<? extends AdPresenter> getSupportedAdPresenterInterface() {
        return BannerAdPresenter.class;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    synchronized void init(java.lang.Iterable<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r1.foundInterfaces     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x001a
            monitor-enter(r1)     // Catch:{ all -> 0x001c }
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r1.foundInterfaces     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "21.8.4"
            java.util.List r2 = com.smaato.sdk.core.init.AdPresenterModuleInterfaceUtils.getValidModuleInterfaces(r0, r2)     // Catch:{ all -> 0x0017 }
            r1.foundInterfaces = r2     // Catch:{ all -> 0x0017 }
            r1.verifyBannerSubModulesPresence()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.banner.framework.BannerModuleInterface.init(java.lang.Iterable):void");
    }

    private void verifyBannerSubModulesPresence() {
        Map<K, V> mapWithOrder = Maps.toMapWithOrder(POSSIBLE_BANNER_MODULE_AD_FORMATS, FunctionUtils.identity(), new Function() {
            public final Object apply(Object obj) {
                return Boolean.valueOf(BannerModuleInterface.this.isFormatSupportedByAdPresenterModules((AdFormat) obj));
            }
        });
        boolean atLeastOneBannerSubModuleIsPresent = atLeastOneBannerSubModuleIsPresent(mapWithOrder);
        this.atLeastOneBannerModuleIsPresent = atLeastOneBannerSubModuleIsPresent;
        if (!atLeastOneBannerSubModuleIsPresent) {
            buildMissingBannerSubModulesMessage(mapWithOrder);
        }
    }

    private boolean atLeastOneBannerSubModuleIsPresent(Map<AdFormat, Boolean> map) {
        return Lists.any(map.values(), $$Lambda$BannerModuleInterface$orGLThciAnXWGWqy4r8Z91E5vck.INSTANCE);
    }

    private void buildMissingBannerSubModulesMessage(Map<AdFormat, Boolean> map) {
        this.missingBannerSubModulesMessage = String.format("In order to show ads of %s format at least one of %s modules should be added to your project configuration. Missing module(s): %s", new Object[]{AdFormat.DISPLAY, POSSIBLE_BANNER_MODULE_AD_FORMATS, Maps.filteredKeys(map, $$Lambda$BannerModuleInterface$57AUj9qxHZnbKOhBWKbw2nznev4.INSTANCE)});
    }

    static /* synthetic */ boolean lambda$buildMissingBannerSubModulesMessage$0(Boolean bool) {
        return !bool.booleanValue();
    }

    private List<AdPresenterModuleInterface> foundInterfaces() {
        List<AdPresenterModuleInterface> list = this.foundInterfaces;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("init() method should have been called first for this module: smaato-sdk-banner");
    }

    public boolean isFormatSupported(AdFormat adFormat, Logger logger) {
        if (adFormat != AdFormat.DISPLAY) {
            return isFormatSupportedByAdPresenterModules(adFormat);
        }
        if (!this.atLeastOneBannerModuleIsPresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingBannerSubModulesMessage, new Object[0]);
        }
        return this.atLeastOneBannerModuleIsPresent;
    }

    /* access modifiers changed from: private */
    public boolean isFormatSupportedByAdPresenterModules(AdFormat adFormat) {
        return Lists.any(foundInterfaces(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdPresenterModuleInterface) obj).isFormatSupported(AdFormat.this, BannerAdPresenter.class);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerModuleInterface.this.lambda$getAdLoaderPluginFactory$3$BannerModuleInterface(diConstructor);
            }
        };
    }

    public /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$3$BannerModuleInterface(DiConstructor diConstructor) {
        return new BannerAdLoaderPlugin(foundInterfaces(), new NullableFunction() {
            public final Object apply(Object obj) {
                return BannerModuleInterface.lambda$getAdLoaderPluginFactory$2(DiConstructor.this, (AdPresenterModuleInterface) obj);
            }
        }, POSSIBLE_BANNER_MODULE_AD_FORMATS, this.missingBannerSubModulesMessage, (AdRequestExtrasProvider) diConstructor.get(moduleDiName(), AdRequestExtrasProvider.class));
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$2(DiConstructor diConstructor, AdPresenterModuleInterface adPresenterModuleInterface) {
        return (AdLoaderPlugin) DiAdLayer.tryGetOrNull(diConstructor, adPresenterModuleInterface.moduleDiName(), AdLoaderPlugin.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m30601of($$Lambda$BannerModuleInterface$6DHGIJ8UVqW_49o_4I0VsR3I48E.INSTANCE);
    }

    static /* synthetic */ void lambda$moduleDiRegistry$12(DiRegistry diRegistry) {
        diRegistry.registerFactory("AUTO_RELOAD_CONFIG_NAME", AutoReloadConfig.class, $$Lambda$BannerModuleInterface$S6ZN43A5wdLjqlVWLlK207XCZo.INSTANCE);
        diRegistry.registerFactory(BannerViewLoader.class, $$Lambda$BannerModuleInterface$NEB0Grk4aMynKAIL9omrvXdOA.INSTANCE);
        diRegistry.registerFactory("BannerModuleInterface", AdRequestExtrasProvider.class, $$Lambda$BannerModuleInterface$cW4JteRmvNoz72NZtSsPLjHjp4Q.INSTANCE);
        diRegistry.registerFactory(BlockingUtils.class, $$Lambda$BannerModuleInterface$N7soSfDFSlz1JqlQnAgCKJ0U7do.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", SharedKeyValuePairsHolder.class, $$Lambda$BannerModuleInterface$eToKN7bZNtimIUtF3rVC6phono.INSTANCE);
        diRegistry.registerFactory("BANNER_AUTO_RELOAD_CONFIG", AutoReloadPolicy.class, $$Lambda$BannerModuleInterface$28Oa23EhiI4lchhS6Y8ESBFoP4o.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", AdLoadersRegistry.class, $$Lambda$BannerModuleInterface$o9lfc3pOQQgchSTJini4n5aXQHU.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", ConfigurationRepository.class, $$Lambda$BannerModuleInterface$ZR94wfwKyvjmrltr258tkB13jY.INSTANCE);
    }

    static /* synthetic */ AutoReloadConfig lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new BannerAutoReloadConfig();
    }

    static /* synthetic */ BannerViewLoader lambda$moduleDiRegistry$5(DiConstructor diConstructor) {
        return new BannerViewLoader(DiLogLayer.getLoggerFrom(diConstructor), (AutoReloadPolicy) diConstructor.get("BANNER_AUTO_RELOAD_CONFIG", AutoReloadPolicy.class), (AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), DiNetworkLayer.getNetworkStateMonitorFrom(diConstructor), (LeakProtection) diConstructor.get(LeakProtection.class), (AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply("BannerModuleInterface"), (SharedKeyValuePairsHolder) diConstructor.get("BannerModuleInterface", SharedKeyValuePairsHolder.class), (Schedulers) diConstructor.get(Schedulers.class), (BlockingUtils) diConstructor.get(BlockingUtils.class));
    }

    static /* synthetic */ AdRequestExtrasProvider lambda$moduleDiRegistry$6(DiConstructor diConstructor) {
        return new VideoTypeAdRequestExtrasProvider(VideoType.OUTSTREAM);
    }

    static /* synthetic */ BlockingUtils lambda$moduleDiRegistry$7(DiConstructor diConstructor) {
        return new BlockingUtils(((Schedulers) diConstructor.get(Schedulers.class)).main());
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$moduleDiRegistry$8(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ AutoReloadPolicy lambda$moduleDiRegistry$9(DiConstructor diConstructor) {
        return new AutoReloadPolicy(DiLogLayer.getLoggerFrom(diConstructor), (AutoReloadConfig) diConstructor.get("AUTO_RELOAD_CONFIG_NAME", AutoReloadConfig.class), (AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class));
    }

    static /* synthetic */ AdLoadersRegistry lambda$moduleDiRegistry$10(DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get("BannerModuleInterface", ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$moduleDiRegistry$11(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "BannerModuleInterface{supportedFormat: " + AdFormat.DISPLAY + "}";
    }
}
