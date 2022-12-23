package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.o */
public final class C4982o extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f13250a;

    public C4982o(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo25552a(OutputStream outputStream) {
        C4965a.m15051b(this.f13250a);
        this.out = outputStream;
        this.count = 0;
        this.f13250a = false;
    }

    public void close() throws IOException {
        this.f13250a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int i = C4991u.f13270a;
            throw th;
        }
    }

    public C4982o(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
