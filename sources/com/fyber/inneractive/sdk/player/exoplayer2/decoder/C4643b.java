package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.b */
public class C4643b {

    /* renamed from: a */
    public int f11648a;

    /* renamed from: b */
    public final C4640a f11649b = new C4640a();

    /* renamed from: c */
    public ByteBuffer f11650c;

    /* renamed from: d */
    public long f11651d;

    /* renamed from: e */
    public final int f11652e;

    public C4643b(int i) {
        this.f11652e = i;
    }

    /* renamed from: b */
    public static C4643b m14208b() {
        return new C4643b(0);
    }

    /* renamed from: a */
    public void mo25033a() {
        this.f11648a = 0;
        ByteBuffer byteBuffer = this.f11650c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo25034b(int i) {
        return (this.f11648a & i) == i;
    }

    /* renamed from: a */
    public final ByteBuffer mo25032a(int i) {
        int i2 = this.f11652e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11650c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
