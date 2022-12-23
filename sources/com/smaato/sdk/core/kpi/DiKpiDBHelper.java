package com.smaato.sdk.core.kpi;

import android.content.Context;
import com.smaato.sdk.core.p381di.ClassFactory;
import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;
import com.smaato.sdk.core.util.p384fi.Consumer;

public class DiKpiDBHelper {
    private DiKpiDBHelper() {
    }

    public static DiRegistry createRegistry(Context context, boolean z) {
        return DiRegistry.m30601of(new Consumer(context, z) {
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((DiRegistry) obj).registerSingletonFactory(KpiDBHelper.class, new ClassFactory(this.f$0, this.f$1) {
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final Object get(DiConstructor diConstructor) {
                        return DiKpiDBHelper.lambda$createRegistry$0(this.f$0, this.f$1, diConstructor);
                    }
                });
            }
        });
    }

    static /* synthetic */ KpiDBHelper lambda$createRegistry$0(Context context, boolean z, DiConstructor diConstructor) {
        return new KpiDBHelper(context, z);
    }
}
