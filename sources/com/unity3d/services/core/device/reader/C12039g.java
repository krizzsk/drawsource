package com.unity3d.services.core.device.reader;

import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.g */
/* compiled from: DeviceInfoReaderWithFilter */
public class C12039g implements C12049p {

    /* renamed from: a */
    C12049p f29388a;

    /* renamed from: b */
    List<String> f29389b;

    public C12039g(C12049p pVar, List<String> list) {
        this.f29388a = pVar;
        this.f29389b = list;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29388a.mo71178a();
        List<String> list = this.f29389b;
        if (list != null) {
            for (String remove : list) {
                a.remove(remove);
            }
        }
        return a;
    }
}
