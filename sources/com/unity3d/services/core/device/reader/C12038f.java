package com.unity3d.services.core.device.reader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.misc.C12076f;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.unity3d.services.core.device.reader.f */
/* compiled from: DeviceInfoReaderPrivacyBuilder */
public class C12038f extends C12033a {
    public C12038f(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        super(configurationReader, privacyConfigStorage);
    }

    /* renamed from: d */
    private C12076f m32793d() {
        return new C12076f(Arrays.asList(new String[]{"privacy", "gdpr", TapjoyConstants.TJC_PLUGIN_UNITY, "pipl"}), Collections.singletonList("value"), Arrays.asList(new String[]{CampaignEx.JSON_KEY_ST_TS, "exclude", "mode"}));
    }

    /* renamed from: a */
    public C12049p mo71172a() {
        C12025f a = C12028i.m32764a(C12028i.C12029a.PRIVATE);
        C12025f a2 = C12028i.m32764a(C12028i.C12029a.PUBLIC);
        C12037e eVar = new C12037e(a);
        return new C12039g(new C12046m(mo71173a(InitRequestType.PRIVACY), m32793d(), a, a2), eVar.mo71179a());
    }
}
