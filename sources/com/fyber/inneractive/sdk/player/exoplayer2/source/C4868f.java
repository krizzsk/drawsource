package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f */
public interface C4868f {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f$a */
    public static final class C4869a {

        /* renamed from: a */
        public final Handler f12920a;

        /* renamed from: b */
        public final C4868f f12921b;

        /* renamed from: c */
        public final long f12922c;

        public C4869a(Handler handler, C4868f fVar) {
            this(handler, fVar, 0);
        }

        /* renamed from: a */
        public static long m14832a(C4869a aVar, long j) {
            aVar.getClass();
            long b = C4637b.m14202b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return aVar.f12922c + b;
        }

        /* renamed from: b */
        public void mo25396b(C4942j jVar, int i, long j, long j2, long j3) {
            if (this.f12921b != null) {
                C4860b bVar = r0;
                C4860b bVar2 = new C4860b(this, jVar, i, -1, (C4811i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f12920a.post(bVar);
            }
        }

        public C4869a(Handler handler, C4868f fVar, long j) {
            this.f12920a = fVar != null ? (Handler) C4965a.m15047a(handler) : null;
            this.f12921b = fVar;
            this.f12922c = j;
        }

        /* renamed from: a */
        public void mo25394a(C4942j jVar, int i, long j, long j2, long j3) {
            if (this.f12921b != null) {
                C4861c cVar = r0;
                C4861c cVar2 = new C4861c(this, jVar, i, -1, (C4811i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f12920a.post(cVar);
            }
        }

        /* renamed from: a */
        public void mo25395a(C4942j jVar, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            if (this.f12921b != null) {
                C4866d dVar = r0;
                C4866d dVar2 = new C4866d(this, jVar, i, -1, (C4811i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
                this.f12920a.post(dVar);
            }
        }
    }
}
