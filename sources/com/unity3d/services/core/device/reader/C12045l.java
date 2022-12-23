package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.InitRequestType;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.l */
/* compiled from: DeviceInfoReaderWithRequestType */
public class C12045l implements C12049p {

    /* renamed from: a */
    private final C12049p f29401a;

    /* renamed from: b */
    private final InitRequestType f29402b;

    public C12045l(C12049p pVar, InitRequestType initRequestType) {
        this.f29401a = pVar;
        this.f29402b = initRequestType;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29401a.mo71178a();
        InitRequestType initRequestType = this.f29402b;
        if (initRequestType != null) {
            a.put("callType", initRequestType.toString().toLowerCase());
        }
        return a;
    }
}
