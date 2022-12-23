package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a */
public interface C4916a {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$a */
    public static class C4917a extends IOException {
        public C4917a(String str) {
            super(str);
        }

        public C4917a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$b */
    public interface C4918b {
        /* renamed from: a */
        void mo25445a(C4916a aVar, C4926g gVar);

        /* renamed from: a */
        void mo25446a(C4916a aVar, C4926g gVar, C4926g gVar2);

        /* renamed from: b */
        void mo25447b(C4916a aVar, C4926g gVar);
    }

    /* renamed from: a */
    long mo25436a();

    /* renamed from: a */
    long mo25437a(String str);

    /* renamed from: a */
    File mo25438a(String str, long j, long j2) throws C4917a;

    /* renamed from: a */
    void mo25439a(C4926g gVar) throws C4917a;

    /* renamed from: a */
    void mo25440a(File file) throws C4917a;

    /* renamed from: a */
    void mo25441a(String str, long j) throws C4917a;

    /* renamed from: b */
    C4926g mo25442b(String str, long j) throws InterruptedException, C4917a;

    /* renamed from: b */
    void mo25443b(C4926g gVar);

    /* renamed from: c */
    C4926g mo25444c(String str, long j) throws C4917a;
}
