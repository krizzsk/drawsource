package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4675b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4680d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4681e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4684h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4693b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4888q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4863b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4962y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4990t;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5003b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e */
public final class C4698e implements C4957x.C4958a<C4962y<C4695c>> {

    /* renamed from: a */
    public final Uri f11901a;

    /* renamed from: b */
    public final C4680d f11902b;

    /* renamed from: c */
    public final C4696d f11903c = new C4696d();

    /* renamed from: d */
    public final int f11904d;

    /* renamed from: e */
    public final IdentityHashMap<C4691a.C4692a, C4699a> f11905e = new IdentityHashMap<>();

    /* renamed from: f */
    public final Handler f11906f = new Handler();

    /* renamed from: g */
    public final C4703e f11907g;

    /* renamed from: h */
    public final List<C4700b> f11908h = new ArrayList();

    /* renamed from: i */
    public final C4957x f11909i = new C4957x("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: j */
    public final C4868f.C4869a f11910j;

    /* renamed from: k */
    public C4691a f11911k;

    /* renamed from: l */
    public C4691a.C4692a f11912l;

    /* renamed from: m */
    public C4693b f11913m;

    /* renamed from: n */
    public boolean f11914n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$b */
    public interface C4700b {
        /* renamed from: a */
        void mo25117a(C4691a.C4692a aVar, long j);

        /* renamed from: c */
        void mo25123c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c */
    public static final class C4701c extends IOException {
        public C4701c(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d */
    public static final class C4702d extends IOException {
        public C4702d(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$e */
    public interface C4703e {
    }

    public C4698e(Uri uri, C4680d dVar, C4868f.C4869a aVar, int i, C4703e eVar) {
        this.f11901a = uri;
        this.f11902b = dVar;
        this.f11910j = aVar;
        this.f11904d = i;
        this.f11907g = eVar;
    }

    /* renamed from: a */
    public void mo25142a(C4957x.C4960c cVar, long j, long j2, boolean z) {
        C4962y yVar = (C4962y) cVar;
        this.f11910j.mo25394a(yVar.f13200a, 4, j, j2, yVar.f13205f);
    }

    /* renamed from: b */
    public boolean mo25156b(C4691a.C4692a aVar) {
        int i;
        C4699a aVar2 = this.f11905e.get(aVar);
        if (aVar2.f11918d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C4637b.m14202b(aVar2.f11918d.f11865o));
            C4693b bVar = aVar2.f11918d;
            if (bVar.f11860j || (i = bVar.f11852b) == 2 || i == 1 || aVar2.f11919e + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo25141a(C4957x.C4960c cVar, long j, long j2) {
        C4962y yVar;
        C4691a aVar;
        C4962y yVar2 = (C4962y) cVar;
        C4695c cVar2 = (C4695c) yVar2.f13203d;
        boolean z = cVar2 instanceof C4693b;
        if (z) {
            String str = cVar2.f11875a;
            yVar = yVar2;
            C4811i iVar = r5;
            C4811i iVar2 = new C4811i("0", "application/x-mpegURL", (String) null, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C5003b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (C4644a) null, (C4828a) null);
            List singletonList = Collections.singletonList(new C4691a.C4692a(str, iVar));
            List emptyList = Collections.emptyList();
            aVar = new C4691a((String) null, singletonList, emptyList, emptyList, (C4811i) null, (List<C4811i>) null);
        } else {
            yVar = yVar2;
            aVar = (C4691a) cVar2;
        }
        this.f11911k = aVar;
        this.f11912l = aVar.f11845b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f11845b);
        arrayList.addAll(aVar.f11846c);
        arrayList.addAll(aVar.f11847d);
        int size = arrayList.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4691a.C4692a aVar2 = (C4691a.C4692a) arrayList.get(i);
            this.f11905e.put(aVar2, new C4699a(aVar2, elapsedRealtime));
        }
        C4699a aVar3 = this.f11905e.get(this.f11912l);
        if (z) {
            aVar3.mo25158a((C4693b) cVar2);
        } else {
            aVar3.mo25159b();
        }
        C4962y yVar3 = yVar;
        this.f11910j.mo25396b(yVar3.f13200a, 4, j, j2, yVar3.f13205f);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a */
    public final class C4699a implements C4957x.C4958a<C4962y<C4695c>>, Runnable {

        /* renamed from: a */
        public final C4691a.C4692a f11915a;

        /* renamed from: b */
        public final C4957x f11916b = new C4957x("HlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        public final C4962y<C4695c> f11917c;

        /* renamed from: d */
        public C4693b f11918d;

        /* renamed from: e */
        public long f11919e;

        /* renamed from: f */
        public long f11920f;

        /* renamed from: g */
        public long f11921g;

        /* renamed from: h */
        public long f11922h;

        /* renamed from: i */
        public boolean f11923i;

        /* renamed from: j */
        public IOException f11924j;

        public C4699a(C4691a.C4692a aVar, long j) {
            this.f11915a = aVar;
            this.f11921g = j;
            this.f11917c = new C4962y<>(((C4675b) C4698e.this.f11902b).mo25101a(4), C4990t.m15128a(C4698e.this.f11911k.f11875a, aVar.f11850a), 4, C4698e.this.f11903c);
        }

        /* renamed from: a */
        public void mo25142a(C4957x.C4960c cVar, long j, long j2, boolean z) {
            C4962y yVar = (C4962y) cVar;
            C4698e.this.f11910j.mo25394a(yVar.f13200a, 4, j, j2, yVar.f13205f);
        }

        /* renamed from: b */
        public void mo25159b() {
            this.f11922h = 0;
            if (!this.f11923i && !this.f11916b.mo25492b()) {
                this.f11916b.mo25490a(this.f11917c, this, C4698e.this.f11904d);
            }
        }

        public void run() {
            this.f11923i = false;
            mo25159b();
        }

        /* renamed from: a */
        public void mo25141a(C4957x.C4960c cVar, long j, long j2) {
            C4962y yVar = (C4962y) cVar;
            C4695c cVar2 = (C4695c) yVar.f13203d;
            if (cVar2 instanceof C4693b) {
                mo25158a((C4693b) cVar2);
                C4698e.this.f11910j.mo25396b(yVar.f13200a, 4, j, j2, yVar.f13205f);
                return;
            }
            this.f11924j = new C4815l("Loaded playlist has unexpected type.");
        }

        /* renamed from: a */
        public int mo25138a(C4957x.C4960c cVar, long j, long j2, IOException iOException) {
            C4962y yVar = (C4962y) cVar;
            boolean z = iOException instanceof C4815l;
            C4698e.this.f11910j.mo25395a(yVar.f13200a, 4, j, j2, yVar.f13205f, iOException, z);
            if (z) {
                return 3;
            }
            boolean z2 = true;
            if (C4863b.m14828a(iOException)) {
                mo25157a();
                C4698e eVar = C4698e.this;
                if (eVar.f11912l != this.f11915a || C4698e.m14369a(eVar)) {
                    z2 = false;
                }
            }
            if (z2) {
                return 0;
            }
            return 2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
            r7 = r1.f11857g;
            r8 = r2.f11857g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r7 = r1.f11863m.size();
            r8 = r2.f11863m.size();
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25158a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4693b r28) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r2 = r0.f11918d
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f11919e = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.this
                r5.getClass()
                r28.getClass()
                r6 = 0
                if (r2 == 0) goto L_0x003c
                int r7 = r1.f11857g
                int r8 = r2.f11857g
                if (r7 <= r8) goto L_0x001e
                goto L_0x003c
            L_0x001e:
                if (r7 >= r8) goto L_0x0021
                goto L_0x003a
            L_0x0021:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r1.f11863m
                int r7 = r7.size()
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r8 = r2.f11863m
                int r8 = r8.size()
                if (r7 > r8) goto L_0x003c
                if (r7 != r8) goto L_0x003a
                boolean r7 = r1.f11860j
                if (r7 == 0) goto L_0x003a
                boolean r7 = r2.f11860j
                if (r7 != 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r7 = r6
                goto L_0x003d
            L_0x003c:
                r7 = 1
            L_0x003d:
                if (r7 != 0) goto L_0x0083
                boolean r5 = r1.f11860j
                if (r5 == 0) goto L_0x007e
                boolean r5 = r2.f11860j
                if (r5 == 0) goto L_0x0048
                goto L_0x007e
            L_0x0048:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r6 = r5
                int r7 = r2.f11852b
                java.lang.String r8 = r2.f11875a
                long r9 = r2.f11853c
                long r11 = r2.f11854d
                boolean r13 = r2.f11855e
                int r14 = r2.f11856f
                int r15 = r2.f11857g
                r24 = r5
                int r5 = r2.f11858h
                r16 = r5
                r25 = r3
                long r3 = r2.f11859i
                r17 = r3
                boolean r3 = r2.f11861k
                r20 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r2.f11862l
                r21 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r2.f11863m
                r22 = r3
                java.util.List<java.lang.String> r3 = r2.f11864n
                r23 = r3
                r19 = 1
                r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23)
                r5 = r24
                goto L_0x010e
            L_0x007e:
                r25 = r3
                r5 = r2
                goto L_0x010e
            L_0x0083:
                r25 = r3
                boolean r3 = r1.f11861k
                if (r3 == 0) goto L_0x008d
                long r3 = r1.f11854d
            L_0x008b:
                r12 = r3
                goto L_0x00b7
            L_0x008d:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f11913m
                if (r3 == 0) goto L_0x0094
                long r3 = r3.f11854d
                goto L_0x0096
            L_0x0094:
                r3 = 0
            L_0x0096:
                if (r2 != 0) goto L_0x0099
                goto L_0x008b
            L_0x0099:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r7 = r2.f11863m
                int r7 = r7.size()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.m14368a(r2, r1)
                if (r8 == 0) goto L_0x00ab
                long r3 = r2.f11854d
                long r7 = r8.f11869d
            L_0x00a9:
                long r3 = r3 + r7
                goto L_0x008b
            L_0x00ab:
                int r8 = r1.f11857g
                int r9 = r2.f11857g
                int r8 = r8 - r9
                if (r7 != r8) goto L_0x008b
                long r3 = r2.f11854d
                long r7 = r2.f11865o
                goto L_0x00a9
            L_0x00b7:
                boolean r3 = r1.f11855e
                if (r3 == 0) goto L_0x00bf
                int r3 = r1.f11856f
            L_0x00bd:
                r15 = r3
                goto L_0x00e1
            L_0x00bf:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r3 = r5.f11913m
                if (r3 == 0) goto L_0x00c6
                int r3 = r3.f11856f
                goto L_0x00c7
            L_0x00c6:
                r3 = r6
            L_0x00c7:
                if (r2 != 0) goto L_0x00ca
                goto L_0x00bd
            L_0x00ca:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.m14368a(r2, r1)
                if (r4 == 0) goto L_0x00bd
                int r3 = r2.f11856f
                int r4 = r4.f11868c
                int r3 = r3 + r4
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r4 = r1.f11863m
                java.lang.Object r4 = r4.get(r6)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4693b.C4694a) r4
                int r4 = r4.f11868c
                int r3 = r3 - r4
                goto L_0x00bd
            L_0x00e1:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
                r7 = r5
                int r8 = r1.f11852b
                java.lang.String r9 = r1.f11875a
                long r10 = r1.f11853c
                int r3 = r1.f11857g
                r16 = r3
                int r3 = r1.f11858h
                r17 = r3
                long r3 = r1.f11859i
                r18 = r3
                boolean r3 = r1.f11860j
                r20 = r3
                boolean r3 = r1.f11861k
                r21 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r3 = r1.f11862l
                r22 = r3
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r1.f11863m
                r23 = r3
                java.util.List<java.lang.String> r3 = r1.f11864n
                r24 = r3
                r14 = 1
                r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24)
            L_0x010e:
                r0.f11918d = r5
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r2) goto L_0x012d
                r1 = 0
                r0.f11924j = r1
                r6 = r25
                r0.f11920f = r6
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f11915a
                boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.m14370a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e) r1, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a.C4692a) r2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4693b) r5)
                if (r1 == 0) goto L_0x0176
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f11918d
                long r1 = r1.f11859i
                goto L_0x0177
            L_0x012d:
                r6 = r25
                boolean r2 = r5.f11860j
                if (r2 != 0) goto L_0x0176
                long r8 = r0.f11920f
                long r6 = r6 - r8
                double r6 = (double) r6
                long r8 = r5.f11859i
                long r8 = com.fyber.inneractive.sdk.player.exoplayer2.C4637b.m14202b(r8)
                double r8 = (double) r8
                r10 = 4615063718147915776(0x400c000000000000, double:3.5)
                double r8 = r8 * r10
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 <= 0) goto L_0x0154
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$d
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f11915a
                java.lang.String r2 = r2.f11850a
                r1.<init>(r2)
                r0.f11924j = r1
                r27.mo25157a()
                goto L_0x016e
            L_0x0154:
                int r2 = r1.f11857g
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r1 = r1.f11863m
                int r1 = r1.size()
                int r2 = r2 + r1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f11918d
                int r1 = r1.f11857g
                if (r2 >= r1) goto L_0x016e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$c
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r2 = r0.f11915a
                java.lang.String r2 = r2.f11850a
                r1.<init>(r2)
                r0.f11924j = r1
            L_0x016e:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r1 = r0.f11918d
                long r1 = r1.f11859i
                r5 = 2
                long r1 = r1 / r5
                goto L_0x0177
            L_0x0176:
                r1 = r3
            L_0x0177:
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x0189
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.this
                android.os.Handler r3 = r3.f11906f
                long r1 = com.fyber.inneractive.sdk.player.exoplayer2.C4637b.m14202b(r1)
                boolean r1 = r3.postDelayed(r0, r1)
                r0.f11923i = r1
            L_0x0189:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.C4699a.mo25158a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b):void");
        }

        /* renamed from: a */
        public final void mo25157a() {
            this.f11922h = SystemClock.elapsedRealtime() + 60000;
            C4698e eVar = C4698e.this;
            C4691a.C4692a aVar = this.f11915a;
            int size = eVar.f11908h.size();
            for (int i = 0; i < size; i++) {
                eVar.f11908h.get(i).mo25117a(aVar, 60000);
            }
        }
    }

    /* renamed from: a */
    public int mo25138a(C4957x.C4960c cVar, long j, long j2, IOException iOException) {
        C4962y yVar = (C4962y) cVar;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof C4815l;
        this.f11910j.mo25395a(yVar.f13200a, 4, j, j2, yVar.f13205f, iOException2, z);
        return z ? 3 : 0;
    }

    /* renamed from: a */
    public C4693b mo25155a(C4691a.C4692a aVar) {
        C4693b bVar;
        C4699a aVar2 = this.f11905e.get(aVar);
        aVar2.getClass();
        aVar2.f11921g = SystemClock.elapsedRealtime();
        C4693b bVar2 = aVar2.f11918d;
        if (bVar2 != null && this.f11911k.f11845b.contains(aVar) && (((bVar = this.f11913m) == null || !bVar.f11860j) && this.f11905e.get(this.f11912l).f11921g - SystemClock.elapsedRealtime() > 15000)) {
            this.f11912l = aVar;
            this.f11905e.get(aVar).mo25159b();
        }
        return bVar2;
    }

    /* renamed from: a */
    public static boolean m14369a(C4698e eVar) {
        List<C4691a.C4692a> list = eVar.f11911k.f11845b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4699a aVar = eVar.f11905e.get(list.get(i));
            if (elapsedRealtime > aVar.f11922h) {
                eVar.f11912l = aVar.f11915a;
                aVar.mo25159b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14370a(C4698e eVar, C4691a.C4692a aVar, C4693b bVar) {
        C4888q qVar;
        long j;
        C4698e eVar2 = eVar;
        C4691a.C4692a aVar2 = aVar;
        C4693b bVar2 = bVar;
        if (aVar2 == eVar2.f11912l) {
            if (eVar2.f11913m == null) {
                eVar2.f11914n = !bVar2.f11860j;
            }
            eVar2.f11913m = bVar2;
            C4684h hVar = (C4684h) eVar2.f11907g;
            hVar.getClass();
            long j2 = bVar2.f11853c;
            if (hVar.f11806d.f11914n) {
                long j3 = bVar2.f11860j ? bVar2.f11854d + bVar2.f11865o : -9223372036854775807L;
                List<C4693b.C4694a> list = bVar2.f11863m;
                if (j2 == -9223372036854775807L) {
                    if (list.isEmpty()) {
                        j = 0;
                        qVar = new C4888q(j3, bVar2.f11865o, bVar2.f11854d, j, true, !bVar2.f11860j);
                    } else {
                        j2 = list.get(Math.max(0, list.size() - 3)).f11869d;
                    }
                }
                j = j2;
                qVar = new C4888q(j3, bVar2.f11865o, bVar2.f11854d, j, true, !bVar2.f11860j);
            } else {
                long j4 = j2 == -9223372036854775807L ? 0 : j2;
                long j5 = bVar2.f11854d;
                long j6 = bVar2.f11865o;
                qVar = new C4888q(j5 + j6, j6, j5, j4, true, false);
            }
            hVar.f11807e.mo25267a(qVar, new C4681e(hVar.f11806d.f11911k, bVar2));
        }
        int size = eVar2.f11908h.size();
        for (int i = 0; i < size; i++) {
            eVar2.f11908h.get(i).mo25123c();
        }
        if (aVar2 != eVar2.f11912l || bVar2.f11860j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C4693b.C4694a m14368a(C4693b bVar, C4693b bVar2) {
        int i = bVar2.f11857g - bVar.f11857g;
        List<C4693b.C4694a> list = bVar.f11863m;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
