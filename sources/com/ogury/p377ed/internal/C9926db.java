package com.ogury.p377ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p377ed.internal.C10025fk;
import p401io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.db */
public final class C9926db {

    /* renamed from: a */
    public static final C9927a f24976a = new C9927a((byte) 0);

    /* renamed from: b */
    private final C10025fk.C10026a f24977b;

    /* renamed from: c */
    private final C10029fn f24978c;

    private C9926db(C10025fk.C10026a aVar, C10029fn fnVar) {
        C10263mq.m29882b(aVar, "profigDaoFactory");
        C10263mq.m29882b(fnVar, "profigGateway");
        this.f24977b = aVar;
        this.f24978c = fnVar;
    }

    public /* synthetic */ C9926db() {
        this(C10025fk.f25214a, C10029fn.f25239a);
    }

    /* renamed from: com.ogury.ed.internal.db$a */
    public static final class C9927a {
        public /* synthetic */ C9927a(byte b) {
            this();
        }

        private C9927a() {
        }
    }

    /* renamed from: a */
    public static void m28654a(Context context, String str) {
        C10263mq.m29882b(context, "appContext");
        C10263mq.m29882b(str, "apiKey");
        C10028fm a = C10029fn.m29114a(context);
        if (a != null) {
            try {
                OguryCrashReport.start(CampaignUnit.JSON_KEY_ADS, context, new SdkInfo(PresageSdk.getAdsSdkVersion(), str, C10025fk.C10026a.m29075a(context).mo64677c()), new CrashConfig(a.mo64719m(), context.getPackageName(), 5, 100));
            } catch (Throwable unused) {
            }
        }
    }
}
