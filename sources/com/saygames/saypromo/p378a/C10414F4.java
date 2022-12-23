package com.saygames.saypromo.p378a;

import okio.Buffer;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* renamed from: com.saygames.saypromo.a.F4 */
public final class C10414F4 implements Source {

    /* renamed from: a */
    private final Source f25807a;

    /* renamed from: b */
    final /* synthetic */ C10463M4 f25808b;

    C10414F4(C10463M4 m4) {
        this.f25808b = m4;
        this.f25807a = Okio.source(m4.mo65356c());
    }

    public final void close() {
        this.f25807a.close();
        this.f25808b.mo65354a();
    }

    public final long read(Buffer buffer, long j) {
        return this.f25807a.read(buffer, j);
    }

    public final Timeout timeout() {
        return this.f25807a.timeout();
    }
}
