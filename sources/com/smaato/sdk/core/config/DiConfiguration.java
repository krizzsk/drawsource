package com.smaato.sdk.core.config;

import com.smaato.sdk.core.p381di.DiRegistry;
import com.smaato.sdk.core.util.p384fi.Function;
import java.util.HashMap;

public final class DiConfiguration {

    public interface Provider extends Function<Configuration, ConfigurationRepository> {
    }

    private DiConfiguration() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m30601of($$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ.INSTANCE);
    }

    static /* synthetic */ ConfigurationRepository lambda$createRegistry$0(Configuration configuration) {
        return new ConfigurationRepository(new HashMap(), configuration);
    }
}
