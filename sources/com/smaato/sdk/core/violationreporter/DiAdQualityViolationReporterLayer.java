package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.p381di.CoreDiNames;
import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;
import com.smaato.sdk.core.util.HeaderUtils;
import java.util.concurrent.ExecutorService;

public final class DiAdQualityViolationReporterLayer {
    private DiAdQualityViolationReporterLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m30601of(C10888x47be8b.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class, C10890x60aa0ded.INSTANCE);
        diRegistry.registerSingletonFactory("ad_quality_violation_reporter", ExecutorService.class, C10891x9fce309d.INSTANCE);
        diRegistry.registerFactory(AdQualityViolationReportMapper.class, C10892x32e14d2d.INSTANCE);
        diRegistry.registerSingletonFactory(AdQualityViolationReporter.class, C10889xc5e38870.INSTANCE);
    }

    static /* synthetic */ AdQualityViolationReportMapper lambda$createRegistry$2(DiConstructor diConstructor) {
        return new AdQualityViolationReportMapper(DiLogLayer.getLoggerFrom(diConstructor), (HeaderUtils) diConstructor.get(HeaderUtils.class));
    }

    static /* synthetic */ AdQualityViolationReporter lambda$createRegistry$3(DiConstructor diConstructor) {
        return new AdQualityViolationReporter(DiLogLayer.getLoggerFrom(diConstructor), (SimpleHttpClient) diConstructor.get(SimpleHttpClient.class), (AdQualityViolationReportMapper) diConstructor.get(AdQualityViolationReportMapper.class), (String) diConstructor.get(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class));
    }
}
