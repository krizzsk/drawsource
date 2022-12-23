package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.hc */
/* compiled from: RetryNetworkRequest */
public class C6158hc extends C6156ha {

    /* renamed from: d */
    private static final String f15546d = C6107ga.class.getSimpleName();

    /* renamed from: a */
    public AtomicBoolean f15547a = new AtomicBoolean(false);

    /* renamed from: b */
    int f15548b = 1;

    /* renamed from: c */
    int f15549c = 30;

    /* renamed from: e */
    private Map<String, String> f15550e;

    protected C6158hc(String str, String str2, C6236ja jaVar, String str3, int i, int i2, String str4) {
        super(str, str2, jaVar, C6219in.m18465f(), str4);
        this.f15548b = i;
        this.f15549c = i2;
        this.f15538s = str3;
        this.f15550e = null;
    }

    /* renamed from: a */
    public void mo34869a() {
        super.mo34869a();
        Map<String, String> map = this.f15550e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!this.f15525f.containsKey(next.getKey())) {
                    this.f15525f.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35295b() {
        this.f15547a.compareAndSet(false, true);
    }
}
