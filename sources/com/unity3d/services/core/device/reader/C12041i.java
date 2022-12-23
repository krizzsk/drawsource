package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.i */
/* compiled from: DeviceInfoReaderWithMetrics */
public class C12041i implements C12049p {

    /* renamed from: a */
    private final C12049p f29392a;

    public C12041i(C12049p pVar) {
        this.f29392a = pVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        C12049p pVar = this.f29392a;
        if (pVar == null) {
            return null;
        }
        Map<String, Object> a = pVar.mo71178a();
        m32797a(a);
        return a;
    }

    /* renamed from: a */
    private void m32797a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("unifiedconfig.data.gameSessionId");
            if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
                C12120i.m33045a().sendMetric(C12122j.m33062c());
            }
        }
    }
}
