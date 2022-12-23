package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b */
public interface C4621b {

    /* renamed from: a */
    public static final ByteBuffer f11503a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b$a */
    public static final class C4622a extends Exception {
        public C4622a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: a */
    ByteBuffer mo24986a();

    /* renamed from: a */
    void mo24987a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo24988a(int i, int i2, int i3) throws C4622a;

    /* renamed from: b */
    boolean mo24989b();

    /* renamed from: c */
    void mo24990c();

    /* renamed from: d */
    boolean mo24991d();

    /* renamed from: e */
    int mo24992e();

    /* renamed from: f */
    int mo24993f();

    void flush();

    /* renamed from: g */
    void mo24995g();
}
