package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.lifecycle.C12061c;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.h */
/* compiled from: DeviceInfoReaderWithLifecycle */
public class C12040h implements C12049p {

    /* renamed from: a */
    private final C12049p f29390a;

    /* renamed from: b */
    private final C12061c f29391b;

    public C12040h(C12049p pVar, C12061c cVar) {
        this.f29390a = pVar;
        this.f29391b = cVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29390a.mo71178a();
        a.put("appActive", Boolean.valueOf(this.f29391b.mo71190a()));
        return a;
    }
}
