package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.C12051b;
import com.unity3d.services.core.device.reader.pii.C12057f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.k */
/* compiled from: DeviceInfoReaderWithPrivacy */
public class C12044k implements C12049p {

    /* renamed from: a */
    private final C12049p f29397a;

    /* renamed from: b */
    private final PrivacyConfigStorage f29398b;

    /* renamed from: c */
    private final C12051b f29399c;

    /* renamed from: d */
    private final C12057f f29400d;

    public C12044k(C12049p pVar, PrivacyConfigStorage privacyConfigStorage, C12051b bVar, C12057f fVar) {
        this.f29397a = pVar;
        this.f29398b = privacyConfigStorage;
        this.f29399c = bVar;
        this.f29400d = fVar;
    }

    /* renamed from: b */
    private Map<String, Object> m32802b() {
        HashMap hashMap = new HashMap();
        String a = this.f29399c.mo71180a();
        if (a != null) {
            hashMap.put("unifiedconfig.pii.advertisingTrackingId", a);
        }
        hashMap.put("user.nonBehavioral", Boolean.valueOf(this.f29400d.mo71187c()));
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29397a.mo71178a();
        PrivacyConfigStorage privacyConfigStorage = this.f29398b;
        if (!(privacyConfigStorage == null || privacyConfigStorage.getPrivacyConfig() == null || !this.f29398b.getPrivacyConfig().allowedToSendPii())) {
            a.putAll(m32802b());
        }
        return a;
    }
}
