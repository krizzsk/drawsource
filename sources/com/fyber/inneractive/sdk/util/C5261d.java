package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.d */
public class C5261d {

    /* renamed from: b */
    public static C5261d f13955b = new C5261d();

    /* renamed from: a */
    public Queue<ByteBuffer> f13956a = new ConcurrentLinkedQueue();

    public C5261d() {
        for (int i = 0; i < 2; i++) {
            this.f13956a.offer(mo26366a());
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo26366a() {
        return ByteBuffer.allocateDirect(16384);
    }

    /* renamed from: b */
    public ByteBuffer mo26367b() {
        ByteBuffer poll = this.f13956a.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }
}
