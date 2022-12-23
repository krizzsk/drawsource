package com.smaato.sdk.core.rawresourceloader;

import android.app.Application;
import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;

public final class DiRawResourceLoader {
    private DiRawResourceLoader() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m30601of($$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I.INSTANCE);
    }

    static /* synthetic */ RawResourceLoader lambda$createRegistry$0(DiConstructor diConstructor) {
        return new RawResourceLoader((Application) diConstructor.get(Application.class));
    }
}
