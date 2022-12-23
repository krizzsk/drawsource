package com.bykv.p054vk.openvk.component.video.p055a.p059b;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.c */
/* compiled from: IncrementalTimeout */
public class C2310c {

    /* renamed from: a */
    private final long f4651a;

    /* renamed from: b */
    private final long f4652b;

    /* renamed from: c */
    private final long f4653c;

    /* renamed from: a */
    public long mo15736a(int i) {
        if (i <= 0) {
            return this.f4651a;
        }
        return Math.min(this.f4651a + (this.f4652b * ((long) i)), this.f4653c);
    }
}
