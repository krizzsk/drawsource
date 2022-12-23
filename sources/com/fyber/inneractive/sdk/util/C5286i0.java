package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.i0 */
public class C5286i0 extends BufferedInputStream {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f14003a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5286i0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f14003a = atomicInteger;
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f14003a.getAndAdd(read);
        }
        return read;
    }

    public synchronized void reset() throws IOException {
        this.f14003a.set(0);
        super.reset();
    }

    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(j);
        this.f14003a.addAndGet((int) skip);
        return skip;
    }
}
