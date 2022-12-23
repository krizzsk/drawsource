package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.device.reader.c */
/* compiled from: DeviceInfoReaderCompressorWithMetrics */
public class C12035c implements C12047n {

    /* renamed from: a */
    private final C12047n f29382a;

    /* renamed from: b */
    private long f29383b;

    /* renamed from: c */
    private long f29384c;

    /* renamed from: d */
    private long f29385d;

    public C12035c(C12047n nVar) {
        this.f29382a = nVar;
    }

    /* renamed from: b */
    private long m32784b() {
        return TimeUnit.NANOSECONDS.toMillis(this.f29385d - this.f29384c);
    }

    /* renamed from: d */
    private long m32785d() {
        return TimeUnit.NANOSECONDS.toMillis(this.f29384c - this.f29383b);
    }

    /* renamed from: e */
    private void m32786e() {
        C12120i.m33045a().sendMetric(C12122j.m33055a(Long.valueOf(m32785d())));
        C12120i.m33045a().sendMetric(C12122j.m33059b(Long.valueOf(m32784b())));
    }

    /* renamed from: a */
    public Map<String, Object> mo71174a() {
        return this.f29382a.mo71174a();
    }

    /* renamed from: c */
    public byte[] mo71177c() {
        if (this.f29382a == null) {
            return new byte[0];
        }
        this.f29383b = System.nanoTime();
        byte[] a = mo71175a(mo71174a());
        m32786e();
        return a;
    }

    /* renamed from: a */
    public byte[] mo71175a(Map<String, Object> map) {
        this.f29384c = System.nanoTime();
        byte[] a = this.f29382a.mo71175a(map);
        this.f29385d = System.nanoTime();
        return a;
    }
}
