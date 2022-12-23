package com.unity3d.services.core.device.reader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.device.reader.pii.C12051b;
import com.unity3d.services.core.device.reader.pii.C12052c;
import com.unity3d.services.core.device.reader.pii.C12057f;
import com.unity3d.services.core.lifecycle.C12059a;
import com.unity3d.services.core.misc.C12073c;
import com.unity3d.services.core.misc.C12076f;
import com.unity3d.services.core.misc.C12078h;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.unity3d.services.core.device.reader.a */
/* compiled from: DeviceInfoReaderBuilder */
public class C12033a {

    /* renamed from: a */
    private final ConfigurationReader f29379a;

    /* renamed from: b */
    private PrivacyConfigStorage f29380b;

    public C12033a(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        this.f29379a = configurationReader;
        this.f29380b = privacyConfigStorage;
    }

    /* renamed from: b */
    private Experiments m32777b() {
        ConfigurationReader configurationReader = this.f29379a;
        if (configurationReader == null || configurationReader.getCurrentConfiguration() == null) {
            return new Experiments();
        }
        return this.f29379a.getCurrentConfiguration().getExperiments();
    }

    /* renamed from: c */
    private C12076f m32778c() {
        return new C12076f(Arrays.asList(new String[]{"privacy", "gdpr", "framework", "adapter", "mediation", TapjoyConstants.TJC_PLUGIN_UNITY, "pipl", "configuration", "user", "unifiedconfig"}), Collections.singletonList("value"), Arrays.asList(new String[]{CampaignEx.JSON_KEY_ST_TS, "exclude", "pii", "nonBehavioral", "nonbehavioral"}));
    }

    /* renamed from: a */
    public C12049p mo71172a() {
        C12049p pVar;
        C12025f a = C12028i.m32764a(C12028i.C12029a.PRIVATE);
        C12025f a2 = C12028i.m32764a(C12028i.C12029a.PUBLIC);
        C12078h hVar = new C12078h(Arrays.asList(new C12073c[]{a2, a}));
        C12037e eVar = new C12037e(a);
        C12046m mVar = new C12046m(new C12040h(new C12036d(mo71173a(InitRequestType.TOKEN)), C12059a.m32828a()), m32778c(), a, a2);
        C12057f fVar = new C12057f(hVar);
        if (this.f29380b == null || !m32777b().isPrivacyRequestEnabled()) {
            pVar = new C12042j(mVar, new C12052c(fVar, a, m32777b()), new C12051b());
        } else {
            pVar = new C12044k(mVar, this.f29380b, new C12051b(), fVar);
        }
        return new C12041i(new C12039g(pVar, eVar.mo71179a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12049p mo71173a(InitRequestType initRequestType) {
        return new C12045l(new C12058q(), initRequestType);
    }
}
