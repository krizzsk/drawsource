package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a */
public final class C4711a implements C4713b {

    /* renamed from: a */
    public final byte[] f11946a = new byte[8];

    /* renamed from: b */
    public final Stack<C4712a> f11947b = new Stack<>();

    /* renamed from: c */
    public final C4720f f11948c = new C4720f();

    /* renamed from: d */
    public C4714c f11949d;

    /* renamed from: e */
    public int f11950e;

    /* renamed from: f */
    public int f11951f;

    /* renamed from: g */
    public long f11952g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a */
    public static final class C4712a {

        /* renamed from: a */
        public final int f11953a;

        /* renamed from: b */
        public final long f11954b;

        public C4712a(int i, long j) {
            this.f11953a = i;
            this.f11954b = j;
        }
    }

    /* renamed from: a */
    public void mo25164a(C4714c cVar) {
        this.f11949d = cVar;
    }

    /* renamed from: b */
    public final long mo25166b(C4672g gVar, int i) throws IOException, InterruptedException {
        ((C4657b) gVar).mo25063b(this.f11946a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f11946a[i2] & 255));
        }
        return j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v62, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v77, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v80, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v83, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v86, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v89, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v92, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v95, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v98, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v101, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v104, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v107, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v109, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v112, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v115, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v118, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v121, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v124, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v127, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v130, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v133, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v136, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v139, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v142, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r3v30, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v74 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04db, code lost:
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04f7, code lost:
        r9 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04f9, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0587, code lost:
        r23 = r2;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x058a, code lost:
        r26 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x060c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x060d, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x063f, code lost:
        if (r2.mo25530i() == r6.getLeastSignificantBits()) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0687, code lost:
        r6 = r2;
        r2 = r4;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06a3, code lost:
        r26 = r2;
        r14 = r6;
        r23 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06a8, code lost:
        r2 = r3.f12022M | 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06ae, code lost:
        if (r3.f12021L == false) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06b0, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06b2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06b3, code lost:
        r2 = r2 | r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06b8, code lost:
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15065d(r9) == false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ba, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a(java.lang.Integer.toString(r8), r9, (java.lang.String) null, -1, r23, r3.f12016G, r3.f12018I, r26, (java.util.List<byte[]>) r14, r3.f12034i, (int) r2, r3.f12023N);
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06e3, code lost:
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15066e(r9) == false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06e7, code lost:
        if (r3.f12039n != 0) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06e9, code lost:
        r2 = r3.f12037l;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06ec, code lost:
        if (r2 != -1) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06ee, code lost:
        r2 = r3.f12035j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06f0, code lost:
        r3.f12037l = r2;
        r2 = r3.f12038m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06f4, code lost:
        if (r2 != -1) goto L_0x06f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06f6, code lost:
        r2 = r3.f12036k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06f8, code lost:
        r3.f12038m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06fb, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06fc, code lost:
        r2 = r3.f12037l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0700, code lost:
        if (r2 == r4) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0702, code lost:
        r6 = r3.f12038m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0704, code lost:
        if (r6 == r4) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0706, code lost:
        r29 = ((float) (r3.f12036k * r2)) / ((float) (r3.f12035j * r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0712, code lost:
        r29 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0716, code lost:
        if (r3.f12042q == false) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x071c, code lost:
        if (r3.f12048w == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0722, code lost:
        if (r3.f12049x == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0728, code lost:
        if (r3.f12050y == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x072e, code lost:
        if (r3.f12051z == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0734, code lost:
        if (r3.f12010A == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x073a, code lost:
        if (r3.f12011B == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0740, code lost:
        if (r3.f12012C == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0746, code lost:
        if (r3.f12013D == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x074c, code lost:
        if (r3.f12014E == -1.0f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0752, code lost:
        if (r3.f12015F != -1.0f) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0755, code lost:
        r2 = new byte[25];
        r4 = java.nio.ByteBuffer.wrap(r2);
        r4.put((byte) 0);
        r4.putShort((short) ((int) ((r3.f12048w * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12049x * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12050y * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12051z * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12010A * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12011B * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12012C * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) ((r3.f12013D * 50000.0f) + 0.5f)));
        r4.putShort((short) ((int) (r3.f12014E + 0.5f)));
        r4.putShort((short) ((int) (r3.f12015F + 0.5f)));
        r4.putShort((short) r3.f12046u);
        r4.putShort((short) r3.f12047v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07cb, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07cc, code lost:
        r32 = new com.fyber.inneractive.sdk.player.exoplayer2.video.C5003b(r3.f12043r, r3.f12045t, r3.f12044s, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07da, code lost:
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07dc, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14720a(java.lang.Integer.toString(r8), r9, (java.lang.String) null, -1, r23, r3.f12035j, r3.f12036k, -1.0f, (java.util.List<byte[]>) r14, -1, r29, r3.f12040o, r3.f12041p, r32, r3.f12034i);
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x080c, code lost:
        if ("application/x-subrip".equals(r9) == false) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x080e, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14724a(java.lang.Integer.toString(r8), r9, (java.lang.String) null, -1, (int) r2, r3.f12023N, r3.f12034i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0826, code lost:
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x082e, code lost:
        if ("application/vobsub".equals(r9) != false) goto L_0x0849;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0836, code lost:
        if ("application/pgs".equals(r9) != false) goto L_0x0849;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x083e, code lost:
        if ("application/dvbsubs".equals(r9) == false) goto L_0x0841;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0848, code lost:
        throw new com.fyber.inneractive.sdk.player.exoplayer2.C4815l("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0849, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14726a(java.lang.Integer.toString(r8), r9, (java.lang.String) null, -1, (java.util.List<byte[]>) r14, r3.f12023N, r3.f12034i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x085b, code lost:
        r4 = r7.mo25098a(r3.f12027b, r11);
        r3.f12024O = r4;
        r4.mo25074a(r2);
        r2 = r1.f11985c;
        r3 = r1.f12002t;
        r2.put(r3.f12027b, r3);
        r2 = null;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0672  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25165a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r36) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.String r2 = "Error parsing vorbis codec private"
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r3 = r0.f11949d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x000e
            r3 = r5
            goto L_0x000f
        L_0x000e:
            r3 = r4
        L_0x000f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r3)
        L_0x0012:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f11947b
            boolean r3 = r3.isEmpty()
            r6 = -1
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = -1
            if (r3 != 0) goto L_0x089a
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r3
            long r14 = r3.f11670c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f11947b
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4711a.C4712a) r3
            long r8 = r3.f11954b
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x089a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r1 = r0.f11949d
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f11947b
            java.lang.Object r3 = r3.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4711a.C4712a) r3
            int r3 = r3.f11953a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.this
            r1.getClass()
            r8 = 160(0xa0, float:2.24E-43)
            if (r3 == r8) goto L_0x0875
            r8 = 174(0xae, float:2.44E-43)
            r9 = 0
            if (r3 == r8) goto L_0x017b
            r2 = 19899(0x4dbb, float:2.7884E-41)
            r8 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r3 == r2) goto L_0x0164
            r2 = 25152(0x6240, float:3.5245E-41)
            if (r3 == r2) goto L_0x013a
            r2 = 28032(0x6d80, float:3.9281E-41)
            if (r3 == r2) goto L_0x0127
            r2 = 357149030(0x1549a966, float:4.072526E-26)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == r2) goto L_0x010f
            r2 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r3 == r2) goto L_0x00f9
            if (r3 == r8) goto L_0x0071
            goto L_0x0161
        L_0x0071:
            boolean r2 = r1.f12003u
            if (r2 != 0) goto L_0x0161
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r1.f11982Y
            long r12 = r1.f11998p
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00e8
            long r6 = r1.f12001s
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x00e8
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r3 = r1.f11959B
            if (r3 == 0) goto L_0x00e8
            int r3 = r3.f13220a
            if (r3 == 0) goto L_0x00e8
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r6 = r1.f11960C
            if (r6 == 0) goto L_0x00e8
            int r6 = r6.f13220a
            if (r6 == r3) goto L_0x0094
            goto L_0x00e8
        L_0x0094:
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            long[] r8 = new long[r3]
            long[] r10 = new long[r3]
            r11 = r4
        L_0x009d:
            if (r11 >= r3) goto L_0x00b5
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r12 = r1.f11959B
            long r12 = r12.mo25506a((int) r11)
            r10[r11] = r12
            long r12 = r1.f11998p
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r14 = r1.f11960C
            long r14 = r14.mo25506a((int) r11)
            long r12 = r12 + r14
            r7[r11] = r12
            int r11 = r11 + 1
            goto L_0x009d
        L_0x00b5:
            int r11 = r3 + -1
            if (r4 >= r11) goto L_0x00cc
            int r11 = r4 + 1
            r12 = r7[r11]
            r14 = r7[r4]
            long r12 = r12 - r14
            int r12 = (int) r12
            r6[r4] = r12
            r12 = r10[r11]
            r14 = r10[r4]
            long r12 = r12 - r14
            r8[r4] = r12
            r4 = r11
            goto L_0x00b5
        L_0x00cc:
            long r3 = r1.f11998p
            long r12 = r1.f11997o
            long r3 = r3 + r12
            r12 = r7[r11]
            long r3 = r3 - r12
            int r3 = (int) r3
            r6[r11] = r3
            long r3 = r1.f12001s
            r12 = r10[r11]
            long r3 = r3 - r12
            r8[r11] = r3
            r1.f11959B = r9
            r1.f11960C = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a
            r3.<init>(r6, r7, r8, r10)
            goto L_0x00f3
        L_0x00e8:
            r1.f11959B = r9
            r1.f11960C = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a
            long r6 = r1.f12001s
            r3.<init>(r6)
        L_0x00f3:
            r2.mo25099a(r3)
            r1.f12003u = r5
            goto L_0x0161
        L_0x00f9:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f11985c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0107
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r1.f11982Y
            r1.mo25100c()
            goto L_0x0161
        L_0x0107:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "No valid tracks were found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x010f:
            long r2 = r1.f11999q
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r1.f11999q = r2
        L_0x011a:
            long r2 = r1.f12000r
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0161
            long r2 = r1.mo25169a((long) r2)
            r1.f12001s = r2
            goto L_0x0161
        L_0x0127:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r1 = r1.f12002t
            boolean r2 = r1.f12030e
            if (r2 == 0) goto L_0x0161
            byte[] r1 = r1.f12031f
            if (r1 != 0) goto L_0x0132
            goto L_0x0161
        L_0x0132:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Combining encryption and compression is not supported"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x013a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r1 = r1.f12002t
            boolean r2 = r1.f12030e
            if (r2 == 0) goto L_0x0161
            byte[] r2 = r1.f12032g
            if (r2 == 0) goto L_0x0159
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r6 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.C4646b[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.util.UUID r8 = com.fyber.inneractive.sdk.player.exoplayer2.C4637b.f11630b
            java.lang.String r9 = "video/webm"
            r7.<init>(r8, r9, r2, r4)
            r6[r4] = r7
            r3.<init>(r5, r6)
            r1.f12034i = r3
            goto L_0x0161
        L_0x0159:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0161:
            r4 = r5
            goto L_0x0899
        L_0x0164:
            int r2 = r1.f12004v
            if (r2 == r13) goto L_0x0173
            long r3 = r1.f12005w
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0173
            if (r2 != r8) goto L_0x0161
            r1.f12007y = r3
            goto L_0x0161
        L_0x0173:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x017b:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f12002t
            java.lang.String r3 = r3.f12026a
            java.lang.String r6 = "V_VP8"
            boolean r7 = r6.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_VP9"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEG2"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEG4/ISO/SP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEG4/ISO/ASP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEG4/ISO/AP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEG4/ISO/AVC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MPEGH/ISO/HEVC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_MS/VFW/FOURCC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "V_THEORA"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_OPUS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_VORBIS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_AAC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_MPEG/L2"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_MPEG/L3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_AC3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_EAC3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_TRUEHD"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_DTS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_DTS/EXPRESS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_DTS/LOSSLESS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_FLAC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_MS/ACM"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "A_PCM/INT/LIT"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "S_TEXT/UTF8"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "S_VOBSUB"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "S_HDMV/PGS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0262
            java.lang.String r7 = "S_DVBSUB"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            r3 = r4
            goto L_0x0263
        L_0x0262:
            r3 = r5
        L_0x0263:
            if (r3 == 0) goto L_0x0871
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f12002t
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r1.f11982Y
            int r8 = r3.f12027b
            java.lang.String r14 = r3.f12026a
            r14.getClass()
            int r15 = r14.hashCode()
            r9 = 24
            r13 = 16
            switch(r15) {
                case -2095576542: goto L_0x03df;
                case -2095575984: goto L_0x03d4;
                case -1985379776: goto L_0x03c9;
                case -1784763192: goto L_0x03be;
                case -1730367663: goto L_0x03b3;
                case -1482641358: goto L_0x03a8;
                case -1482641357: goto L_0x039d;
                case -1373388978: goto L_0x0391;
                case -933872740: goto L_0x0383;
                case -538363189: goto L_0x0375;
                case -538363109: goto L_0x0367;
                case -425012669: goto L_0x0359;
                case -356037306: goto L_0x034b;
                case 62923557: goto L_0x033d;
                case 62923603: goto L_0x032f;
                case 62927045: goto L_0x0321;
                case 82338133: goto L_0x0316;
                case 82338134: goto L_0x0308;
                case 99146302: goto L_0x02fa;
                case 444813526: goto L_0x02ec;
                case 542569478: goto L_0x02de;
                case 725957860: goto L_0x02d0;
                case 855502857: goto L_0x02c2;
                case 1422270023: goto L_0x02b4;
                case 1809237540: goto L_0x02a7;
                case 1950749482: goto L_0x0299;
                case 1950789798: goto L_0x028b;
                case 1951062397: goto L_0x027d;
                default: goto L_0x027b;
            }
        L_0x027b:
            goto L_0x03ea
        L_0x027d:
            java.lang.String r6 = "A_OPUS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0287
            goto L_0x03ea
        L_0x0287:
            r6 = 27
            goto L_0x03eb
        L_0x028b:
            java.lang.String r6 = "A_FLAC"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0295
            goto L_0x03ea
        L_0x0295:
            r6 = 26
            goto L_0x03eb
        L_0x0299:
            java.lang.String r6 = "A_EAC3"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02a3
            goto L_0x03ea
        L_0x02a3:
            r6 = 25
            goto L_0x03eb
        L_0x02a7:
            java.lang.String r6 = "V_MPEG2"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02b1
            goto L_0x03ea
        L_0x02b1:
            r6 = r9
            goto L_0x03eb
        L_0x02b4:
            java.lang.String r6 = "S_TEXT/UTF8"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02be
            goto L_0x03ea
        L_0x02be:
            r6 = 23
            goto L_0x03eb
        L_0x02c2:
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02cc
            goto L_0x03ea
        L_0x02cc:
            r6 = 22
            goto L_0x03eb
        L_0x02d0:
            java.lang.String r6 = "A_PCM/INT/LIT"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02da
            goto L_0x03ea
        L_0x02da:
            r6 = 21
            goto L_0x03eb
        L_0x02de:
            java.lang.String r6 = "A_DTS/EXPRESS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02e8
            goto L_0x03ea
        L_0x02e8:
            r6 = 20
            goto L_0x03eb
        L_0x02ec:
            java.lang.String r6 = "V_THEORA"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x02f6
            goto L_0x03ea
        L_0x02f6:
            r6 = 19
            goto L_0x03eb
        L_0x02fa:
            java.lang.String r6 = "S_HDMV/PGS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0304
            goto L_0x03ea
        L_0x0304:
            r6 = 18
            goto L_0x03eb
        L_0x0308:
            java.lang.String r6 = "V_VP9"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0312
            goto L_0x03ea
        L_0x0312:
            r6 = 17
            goto L_0x03eb
        L_0x0316:
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x031e
            goto L_0x03ea
        L_0x031e:
            r6 = r13
            goto L_0x03eb
        L_0x0321:
            java.lang.String r6 = "A_DTS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x032b
            goto L_0x03ea
        L_0x032b:
            r6 = 15
            goto L_0x03eb
        L_0x032f:
            java.lang.String r6 = "A_AC3"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0339
            goto L_0x03ea
        L_0x0339:
            r6 = 14
            goto L_0x03eb
        L_0x033d:
            java.lang.String r6 = "A_AAC"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0347
            goto L_0x03ea
        L_0x0347:
            r6 = 13
            goto L_0x03eb
        L_0x034b:
            java.lang.String r6 = "A_DTS/LOSSLESS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0355
            goto L_0x03ea
        L_0x0355:
            r6 = 12
            goto L_0x03eb
        L_0x0359:
            java.lang.String r6 = "S_VOBSUB"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0363
            goto L_0x03ea
        L_0x0363:
            r6 = 11
            goto L_0x03eb
        L_0x0367:
            java.lang.String r6 = "V_MPEG4/ISO/AVC"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x0371
            goto L_0x03ea
        L_0x0371:
            r6 = 10
            goto L_0x03eb
        L_0x0375:
            java.lang.String r6 = "V_MPEG4/ISO/ASP"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x037f
            goto L_0x03ea
        L_0x037f:
            r6 = 9
            goto L_0x03eb
        L_0x0383:
            java.lang.String r6 = "S_DVBSUB"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x038d
            goto L_0x03ea
        L_0x038d:
            r6 = 8
            goto L_0x03eb
        L_0x0391:
            java.lang.String r6 = "V_MS/VFW/FOURCC"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x039b
            goto L_0x03ea
        L_0x039b:
            r6 = 7
            goto L_0x03eb
        L_0x039d:
            java.lang.String r6 = "A_MPEG/L3"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03a6
            goto L_0x03ea
        L_0x03a6:
            r6 = 6
            goto L_0x03eb
        L_0x03a8:
            java.lang.String r6 = "A_MPEG/L2"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03b1
            goto L_0x03ea
        L_0x03b1:
            r6 = 5
            goto L_0x03eb
        L_0x03b3:
            java.lang.String r6 = "A_VORBIS"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03bc
            goto L_0x03ea
        L_0x03bc:
            r6 = r10
            goto L_0x03eb
        L_0x03be:
            java.lang.String r6 = "A_TRUEHD"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03c7
            goto L_0x03ea
        L_0x03c7:
            r6 = r11
            goto L_0x03eb
        L_0x03c9:
            java.lang.String r6 = "A_MS/ACM"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03d2
            goto L_0x03ea
        L_0x03d2:
            r6 = r12
            goto L_0x03eb
        L_0x03d4:
            java.lang.String r6 = "V_MPEG4/ISO/SP"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03dd
            goto L_0x03ea
        L_0x03dd:
            r6 = r5
            goto L_0x03eb
        L_0x03df:
            java.lang.String r6 = "V_MPEG4/ISO/AP"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x03e8
            goto L_0x03ea
        L_0x03e8:
            r6 = r4
            goto L_0x03eb
        L_0x03ea:
            r6 = -1
        L_0x03eb:
            java.lang.String r14 = "audio/x-unknown"
            java.lang.String r15 = "MatroskaExtractor"
            switch(r6) {
                case 0: goto L_0x0693;
                case 1: goto L_0x0693;
                case 2: goto L_0x0610;
                case 3: goto L_0x060a;
                case 4: goto L_0x058e;
                case 5: goto L_0x0583;
                case 6: goto L_0x057e;
                case 7: goto L_0x04fc;
                case 8: goto L_0x04dd;
                case 9: goto L_0x0693;
                case 10: goto L_0x04c8;
                case 11: goto L_0x04bf;
                case 12: goto L_0x04bb;
                case 13: goto L_0x04b2;
                case 14: goto L_0x04ae;
                case 15: goto L_0x04aa;
                case 16: goto L_0x04a6;
                case 17: goto L_0x04a2;
                case 18: goto L_0x049e;
                case 19: goto L_0x049a;
                case 20: goto L_0x04aa;
                case 21: goto L_0x046c;
                case 22: goto L_0x0457;
                case 23: goto L_0x0453;
                case 24: goto L_0x044f;
                case 25: goto L_0x044b;
                case 26: goto L_0x0441;
                case 27: goto L_0x03fa;
                default: goto L_0x03f2;
            }
        L_0x03f2:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03fa:
            r2 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r11)
            byte[] r9 = r3.f12033h
            r6.add(r9)
            r9 = 8
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r13 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r10 = r10.order(r13)
            long r13 = r3.f12019J
            java.nio.ByteBuffer r10 = r10.putLong(r13)
            byte[] r10 = r10.array()
            r6.add(r10)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r9 = r9.order(r10)
            long r13 = r3.f12020K
            java.nio.ByteBuffer r9 = r9.putLong(r13)
            byte[] r9 = r9.array()
            r6.add(r9)
            java.lang.String r9 = "audio/opus"
            r23 = r2
            r14 = r6
            goto L_0x058a
        L_0x0441:
            byte[] r2 = r3.f12033h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r6 = "audio/flac"
            goto L_0x04f7
        L_0x044b:
            java.lang.String r14 = "audio/eac3"
            goto L_0x060c
        L_0x044f:
            java.lang.String r14 = "video/mpeg2"
            goto L_0x060c
        L_0x0453:
            java.lang.String r14 = "application/x-subrip"
            goto L_0x060c
        L_0x0457:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r6 = r3.f12033h
            r2.<init>((byte[]) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.video.c r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5005c.m15176a(r2)
            java.util.List<byte[]> r6 = r2.f13341a
            int r2 = r2.f13342b
            r3.f12025P = r2
            java.lang.String r2 = "video/hevc"
            goto L_0x04db
        L_0x046c:
            int r2 = r3.f12017H
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15131a((int) r2)
            if (r2 != 0) goto L_0x0494
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Unsupported PCM bit depth: "
            r2.append(r6)
            int r6 = r3.f12017H
            r2.append(r6)
            java.lang.String r6 = ". Setting mimeType to "
            r2.append(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r15, r2)
            goto L_0x060c
        L_0x0494:
            java.lang.String r6 = "audio/raw"
            r9 = r6
            r6 = 0
            goto L_0x06a3
        L_0x049a:
            java.lang.String r14 = "video/x-unknown"
            goto L_0x060c
        L_0x049e:
            java.lang.String r14 = "application/pgs"
            goto L_0x060c
        L_0x04a2:
            java.lang.String r14 = "video/x-vnd.on2.vp9"
            goto L_0x060c
        L_0x04a6:
            java.lang.String r14 = "video/x-vnd.on2.vp8"
            goto L_0x060c
        L_0x04aa:
            java.lang.String r14 = "audio/vnd.dts"
            goto L_0x060c
        L_0x04ae:
            java.lang.String r14 = "audio/ac3"
            goto L_0x060c
        L_0x04b2:
            byte[] r2 = r3.f12033h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r6 = "audio/mp4a-latm"
            goto L_0x04f7
        L_0x04bb:
            java.lang.String r14 = "audio/vnd.dts.hd"
            goto L_0x060c
        L_0x04bf:
            byte[] r2 = r3.f12033h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r6 = "application/vobsub"
            goto L_0x04f7
        L_0x04c8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r6 = r3.f12033h
            r2.<init>((byte[]) r6)
            com.fyber.inneractive.sdk.player.exoplayer2.video.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5002a.m15175b(r2)
            java.util.List<byte[]> r6 = r2.f13331a
            int r2 = r2.f13332b
            r3.f12025P = r2
            java.lang.String r2 = "video/avc"
        L_0x04db:
            r9 = r2
            goto L_0x04f9
        L_0x04dd:
            byte[] r2 = new byte[r10]
            byte[] r6 = r3.f12033h
            byte r9 = r6[r4]
            r2[r4] = r9
            byte r9 = r6[r5]
            r2[r5] = r9
            byte r9 = r6[r12]
            r2[r12] = r9
            byte r6 = r6[r11]
            r2[r11] = r6
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r6 = "application/dvbsubs"
        L_0x04f7:
            r9 = r6
            r6 = r2
        L_0x04f9:
            r2 = -1
            goto L_0x06a3
        L_0x04fc:
            byte[] r2 = r3.f12033h
            int r6 = r2.length
            if (r13 > r6) goto L_0x0503
            r6 = r5
            goto L_0x0504
        L_0x0503:
            r6 = r4
        L_0x0504:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15049a((boolean) r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            r6 = 17
            byte r14 = r2[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r11 = (long) r14     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            r17 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r17
            r14 = 18
            byte r6 = r2[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r4 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r4 = r4 & r17
            r6 = 8
            long r4 = r4 << r6
            long r4 = r4 | r11
            r6 = 19
            byte r11 = r2[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r11 = (long) r11     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r11 = r11 & r17
            long r11 = r11 << r13
            long r4 = r4 | r11
            byte r6 = r2[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r11 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            long r11 = r11 & r17
            long r11 = r11 << r9
            long r4 = r4 | r11
            r11 = 826496599(0x31435657, double:4.08343576E-315)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0534
            r2 = 0
            goto L_0x055c
        L_0x0534:
            r4 = 40
        L_0x0536:
            int r5 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            int r5 = r5 - r10
            if (r4 >= r5) goto L_0x056e
            byte r5 = r2[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            if (r5 != 0) goto L_0x056b
            int r5 = r4 + 1
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            if (r5 != 0) goto L_0x056b
            int r5 = r4 + 2
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            r6 = 1
            if (r5 != r6) goto L_0x056b
            int r5 = r4 + 3
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            r6 = 15
            if (r5 != r6) goto L_0x056b
            int r5 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r4, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
        L_0x055c:
            if (r2 == 0) goto L_0x0562
            java.lang.String r14 = "video/wvc1"
            goto L_0x060d
        L_0x0562:
            java.lang.String r4 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r15, r4)
            java.lang.String r14 = "video/x-unknown"
            goto L_0x060d
        L_0x056b:
            int r4 = r4 + 1
            goto L_0x0536
        L_0x056e:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            java.lang.String r2 = "Failed to find FourCC VC1 initialization data"
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0576 }
        L_0x0576:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Error parsing FourCC VC1 codec private"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x057e:
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.String r9 = "audio/mpeg"
            goto L_0x0587
        L_0x0583:
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.String r9 = "audio/mpeg-L2"
        L_0x0587:
            r23 = r2
            r14 = 0
        L_0x058a:
            r26 = -1
            goto L_0x06a8
        L_0x058e:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = r3.f12033h
            r6 = 0
            byte r9 = r5[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r6 = 2
            if (r9 != r6) goto L_0x05fe
            r6 = 0
            r9 = 1
        L_0x059a:
            byte r10 = r5[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r11 = -1
            if (r10 != r11) goto L_0x05a4
            int r6 = r6 + 255
            int r9 = r9 + 1
            goto L_0x059a
        L_0x05a4:
            int r10 = r9 + 1
            byte r9 = r5[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r6 = r6 + r9
            r9 = 0
        L_0x05aa:
            byte r11 = r5[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r12 = -1
            if (r11 != r12) goto L_0x05b4
            int r9 = r9 + 255
            int r10 = r10 + 1
            goto L_0x05aa
        L_0x05b4:
            int r11 = r10 + 1
            byte r10 = r5[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r9 = r9 + r10
            byte r10 = r5[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r12 = 1
            if (r10 != r12) goto L_0x05f8
            byte[] r10 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r12 = 0
            java.lang.System.arraycopy(r5, r11, r10, r12, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r11 = r11 + r6
            byte r6 = r5[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r12 = 3
            if (r6 != r12) goto L_0x05f2
            int r11 = r11 + r9
            byte r6 = r5[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r9 = 5
            if (r6 != r9) goto L_0x05ec
            int r6 = r5.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r6 = r6 - r11
            byte[] r6 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r9 = r5.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            int r9 = r9 - r11
            r12 = 0
            java.lang.System.arraycopy(r5, r11, r6, r12, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r9 = 2
            r5.<init>(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r5.add(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r5.add(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            java.lang.String r9 = "audio/vorbis"
            r23 = r4
            r14 = r5
            goto L_0x058a
        L_0x05ec:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
        L_0x05f2:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
        L_0x05f8:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
        L_0x05fe:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0604 }
        L_0x0604:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x060a:
            java.lang.String r14 = "audio/true-hd"
        L_0x060c:
            r2 = 0
        L_0x060d:
            r4 = -1
            goto L_0x0687
        L_0x0610:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r4 = r3.f12033h
            r2.<init>((byte[]) r4)
            int r4 = r2.mo25529h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            r5 = 1
            if (r4 != r5) goto L_0x061f
            goto L_0x0641
        L_0x061f:
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r4 != r5) goto L_0x0643
            r2.mo25525e(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            long r4 = r2.mo25530i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            java.util.UUID r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.f11957b0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            long r9 = r6.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0643
            long r4 = r2.mo25530i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            long r9 = r6.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x068b }
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0643
        L_0x0641:
            r2 = 1
            goto L_0x0644
        L_0x0643:
            r2 = 0
        L_0x0644:
            if (r2 == 0) goto L_0x0672
            int r2 = r3.f12017H
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15131a((int) r2)
            if (r2 != 0) goto L_0x066d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            int r4 = r3.f12017H
            r2.append(r4)
            java.lang.String r4 = ". Setting mimeType to "
            r2.append(r4)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r15, r2)
            goto L_0x060c
        L_0x066d:
            java.lang.String r14 = "audio/raw"
            r4 = r2
            r2 = 0
            goto L_0x0687
        L_0x0672:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            r2.append(r4)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r15, r2)
            goto L_0x060c
        L_0x0687:
            r6 = r2
            r2 = r4
            r9 = r14
            goto L_0x06a3
        L_0x068b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Error parsing MS/ACM codec private"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0693:
            byte[] r2 = r3.f12033h
            if (r2 != 0) goto L_0x0699
            r2 = 0
            goto L_0x069d
        L_0x0699:
            java.util.List r2 = java.util.Collections.singletonList(r2)
        L_0x069d:
            java.lang.String r4 = "video/mp4v-es"
            r6 = r2
            r9 = r4
            goto L_0x04f9
        L_0x06a3:
            r26 = r2
            r14 = r6
            r23 = -1
        L_0x06a8:
            boolean r2 = r3.f12022M
            r4 = 0
            r2 = r2 | r4
            boolean r4 = r3.f12021L
            if (r4 == 0) goto L_0x06b2
            r4 = 2
            goto L_0x06b3
        L_0x06b2:
            r4 = 0
        L_0x06b3:
            r2 = r2 | r4
            boolean r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15065d(r9)
            if (r4 == 0) goto L_0x06df
            java.lang.String r19 = java.lang.Integer.toString(r8)
            int r4 = r3.f12016G
            int r5 = r3.f12018I
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r6 = r3.f12034i
            java.lang.String r8 = r3.f12023N
            r21 = 0
            r22 = -1
            r20 = r9
            r24 = r4
            r25 = r5
            r27 = r14
            r28 = r6
            r29 = r2
            r30 = r8
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14722a((java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (int) r22, (int) r23, (int) r24, (int) r25, (int) r26, (java.util.List<byte[]>) r27, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r28, (int) r29, (java.lang.String) r30)
            r11 = 1
            goto L_0x085b
        L_0x06df:
            boolean r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15066e(r9)
            if (r4 == 0) goto L_0x0806
            int r2 = r3.f12039n
            if (r2 != 0) goto L_0x06fb
            int r2 = r3.f12037l
            r4 = -1
            if (r2 != r4) goto L_0x06f0
            int r2 = r3.f12035j
        L_0x06f0:
            r3.f12037l = r2
            int r2 = r3.f12038m
            if (r2 != r4) goto L_0x06f8
            int r2 = r3.f12036k
        L_0x06f8:
            r3.f12038m = r2
            goto L_0x06fc
        L_0x06fb:
            r4 = -1
        L_0x06fc:
            int r2 = r3.f12037l
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r4) goto L_0x0712
            int r6 = r3.f12038m
            if (r6 == r4) goto L_0x0712
            int r4 = r3.f12036k
            int r4 = r4 * r2
            float r2 = (float) r4
            int r4 = r3.f12035j
            int r4 = r4 * r6
            float r4 = (float) r4
            float r2 = r2 / r4
            r29 = r2
            goto L_0x0714
        L_0x0712:
            r29 = r5
        L_0x0714:
            boolean r2 = r3.f12042q
            if (r2 == 0) goto L_0x07da
            float r2 = r3.f12048w
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12049x
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12050y
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12051z
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12010A
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12011B
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12012C
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12013D
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12014E
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x07cb
            float r2 = r3.f12015F
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0755
            goto L_0x07cb
        L_0x0755:
            r2 = 25
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r2)
            r5 = 0
            r4.put(r5)
            float r5 = r3.f12048w
            r6 = 1195593728(0x47435000, float:50000.0)
            float r5 = r5 * r6
            r10 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12049x
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12050y
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12051z
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12010A
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12011B
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12012C
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12013D
            float r5 = r5 * r6
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12014E
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r3.f12015F
            float r5 = r5 + r10
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r3.f12046u
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r3.f12047v
            short r5 = (short) r5
            r4.putShort(r5)
            goto L_0x07cc
        L_0x07cb:
            r2 = 0
        L_0x07cc:
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.video.b
            int r5 = r3.f12043r
            int r6 = r3.f12045t
            int r10 = r3.f12044s
            r4.<init>(r5, r6, r10, r2)
            r32 = r4
            goto L_0x07dc
        L_0x07da:
            r32 = 0
        L_0x07dc:
            java.lang.String r19 = java.lang.Integer.toString(r8)
            int r2 = r3.f12035j
            int r4 = r3.f12036k
            byte[] r5 = r3.f12040o
            int r6 = r3.f12041p
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r8 = r3.f12034i
            r21 = 0
            r22 = -1
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            r28 = -1
            r20 = r9
            r24 = r2
            r25 = r4
            r27 = r14
            r30 = r5
            r31 = r6
            r33 = r8
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14720a((java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (int) r22, (int) r23, (int) r24, (int) r25, (float) r26, (java.util.List<byte[]>) r27, (int) r28, (float) r29, (byte[]) r30, (int) r31, (com.fyber.inneractive.sdk.player.exoplayer2.video.C5003b) r32, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r33)
            r11 = 2
            goto L_0x085b
        L_0x0806:
            java.lang.String r4 = "application/x-subrip"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x0828
            java.lang.String r19 = java.lang.Integer.toString(r8)
            java.lang.String r4 = r3.f12023N
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r3.f12034i
            r21 = 0
            r22 = -1
            r20 = r9
            r23 = r2
            r24 = r4
            r25 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14724a((java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (int) r22, (int) r23, (java.lang.String) r24, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r25)
        L_0x0826:
            r11 = 3
            goto L_0x085b
        L_0x0828:
            java.lang.String r2 = "application/vobsub"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0849
            java.lang.String r2 = "application/pgs"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0849
            java.lang.String r2 = "application/dvbsubs"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0841
            goto L_0x0849
        L_0x0841:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0849:
            java.lang.String r10 = java.lang.Integer.toString(r8)
            java.lang.String r15 = r3.f12023N
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r3.f12034i
            r12 = 0
            r13 = -1
            r11 = r9
            r16 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14726a((java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13, (java.util.List<byte[]>) r14, (java.lang.String) r15, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r16)
            goto L_0x0826
        L_0x085b:
            int r4 = r3.f12027b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r7.mo25098a(r4, r11)
            r3.f12024O = r4
            r4.mo25074a(r2)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f11985c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f12002t
            int r4 = r3.f12027b
            r2.put(r4, r3)
            r2 = 0
            goto L_0x0872
        L_0x0871:
            r2 = r9
        L_0x0872:
            r1.f12002t = r2
            goto L_0x087a
        L_0x0875:
            int r2 = r1.f11962E
            r3 = 2
            if (r2 == r3) goto L_0x087c
        L_0x087a:
            r4 = 1
            goto L_0x0899
        L_0x087c:
            boolean r2 = r1.f11981X
            if (r2 != 0) goto L_0x0886
            int r2 = r1.f11970M
            r3 = 1
            r2 = r2 | r3
            r1.f11970M = r2
        L_0x0886:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f11985c
            int r3 = r1.f11968K
            java.lang.Object r2 = r2.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r2
            long r3 = r1.f11963F
            r1.mo25173a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4718c) r2, (long) r3)
            r3 = 0
            r1.f11962E = r3
            goto L_0x087a
        L_0x0899:
            return r4
        L_0x089a:
            r3 = r4
            r4 = r5
            int r5 = r0.f11950e
            if (r5 != 0) goto L_0x08ed
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r0.f11948c
            long r8 = r5.mo25181a(r1, r4, r3, r10)
            r4 = -2
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x08df
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r4
            r4.f11672e = r3
        L_0x08b1:
            byte[] r5 = r0.f11946a
            r4.mo25061a(r5, r3, r10, r3)
            byte[] r5 = r0.f11946a
            byte r5 = r5[r3]
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4720f.m14422a(r5)
            r11 = -1
            if (r5 == r11) goto L_0x08d9
            if (r5 > r10) goto L_0x08d9
            byte[] r8 = r0.f11946a
            long r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4720f.m14423a(r8, r5, r3)
            int r3 = (int) r8
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r8 = r0.f11949d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r8
            boolean r8 = r8.mo25179a(r3)
            if (r8 == 0) goto L_0x08d9
            r4.mo25064c(r5)
            long r8 = (long) r3
            goto L_0x08df
        L_0x08d9:
            r3 = 1
            r4.mo25064c(r3)
            r3 = 0
            goto L_0x08b1
        L_0x08df:
            r3 = 1
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x08e6
            r4 = 0
            return r4
        L_0x08e6:
            r4 = 0
            int r5 = (int) r8
            r0.f11951f = r5
            r0.f11950e = r3
            goto L_0x08f2
        L_0x08ed:
            r34 = r4
            r4 = r3
            r3 = r34
        L_0x08f2:
            int r5 = r0.f11950e
            if (r5 != r3) goto L_0x0903
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r0.f11948c
            r6 = 8
            long r5 = r5.mo25181a(r1, r4, r3, r6)
            r0.f11952g = r5
            r3 = 2
            r0.f11950e = r3
        L_0x0903:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r3 = r0.f11949d
            int r4 = r0.f11951f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.this
            r3.getClass()
            switch(r4) {
                case 131: goto L_0x091b;
                case 134: goto L_0x0919;
                case 136: goto L_0x091b;
                case 155: goto L_0x091b;
                case 159: goto L_0x091b;
                case 160: goto L_0x0917;
                case 161: goto L_0x0915;
                case 163: goto L_0x0915;
                case 174: goto L_0x0917;
                case 176: goto L_0x091b;
                case 179: goto L_0x091b;
                case 181: goto L_0x0913;
                case 183: goto L_0x0917;
                case 186: goto L_0x091b;
                case 187: goto L_0x0917;
                case 215: goto L_0x091b;
                case 224: goto L_0x0917;
                case 225: goto L_0x0917;
                case 231: goto L_0x091b;
                case 241: goto L_0x091b;
                case 251: goto L_0x091b;
                case 16980: goto L_0x091b;
                case 16981: goto L_0x0915;
                case 17026: goto L_0x0919;
                case 17029: goto L_0x091b;
                case 17143: goto L_0x091b;
                case 17545: goto L_0x0913;
                case 18401: goto L_0x091b;
                case 18402: goto L_0x0915;
                case 18407: goto L_0x0917;
                case 18408: goto L_0x091b;
                case 19899: goto L_0x0917;
                case 20529: goto L_0x091b;
                case 20530: goto L_0x091b;
                case 20532: goto L_0x0917;
                case 20533: goto L_0x0917;
                case 21419: goto L_0x0915;
                case 21420: goto L_0x091b;
                case 21432: goto L_0x091b;
                case 21680: goto L_0x091b;
                case 21682: goto L_0x091b;
                case 21690: goto L_0x091b;
                case 21930: goto L_0x091b;
                case 21936: goto L_0x0917;
                case 21945: goto L_0x091b;
                case 21946: goto L_0x091b;
                case 21947: goto L_0x091b;
                case 21948: goto L_0x091b;
                case 21949: goto L_0x091b;
                case 21968: goto L_0x0917;
                case 21969: goto L_0x0913;
                case 21970: goto L_0x0913;
                case 21971: goto L_0x0913;
                case 21972: goto L_0x0913;
                case 21973: goto L_0x0913;
                case 21974: goto L_0x0913;
                case 21975: goto L_0x0913;
                case 21976: goto L_0x0913;
                case 21977: goto L_0x0913;
                case 21978: goto L_0x0913;
                case 22186: goto L_0x091b;
                case 22203: goto L_0x091b;
                case 25152: goto L_0x0917;
                case 25188: goto L_0x091b;
                case 25506: goto L_0x0915;
                case 28032: goto L_0x0917;
                case 30320: goto L_0x0917;
                case 30322: goto L_0x0915;
                case 2274716: goto L_0x0919;
                case 2352003: goto L_0x091b;
                case 2807729: goto L_0x091b;
                case 290298740: goto L_0x0917;
                case 357149030: goto L_0x0917;
                case 374648427: goto L_0x0917;
                case 408125543: goto L_0x0917;
                case 440786851: goto L_0x0917;
                case 475249515: goto L_0x0917;
                case 524531317: goto L_0x0917;
                default: goto L_0x0911;
            }
        L_0x0911:
            r3 = 0
            goto L_0x091c
        L_0x0913:
            r3 = 5
            goto L_0x091c
        L_0x0915:
            r3 = r10
            goto L_0x091c
        L_0x0917:
            r3 = 1
            goto L_0x091c
        L_0x0919:
            r3 = 3
            goto L_0x091c
        L_0x091b:
            r3 = 2
        L_0x091c:
            if (r3 == 0) goto L_0x0a19
            r4 = 1
            if (r3 == r4) goto L_0x09f5
            r2 = 2
            if (r3 == r2) goto L_0x09c2
            r2 = 3
            if (r3 == r2) goto L_0x098e
            if (r3 == r10) goto L_0x097e
            r2 = 5
            if (r3 != r2) goto L_0x0967
            long r2 = r0.f11952g
            r4 = 4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0954
            r4 = 8
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x093b
            goto L_0x0954
        L_0x093b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid float size: "
            r2.append(r3)
            long r3 = r0.f11952g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0954:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f11949d
            int r5 = r0.f11951f
            int r2 = (int) r2
            double r1 = r0.mo25163a(r1, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r4
            r4.mo25174a((int) r5, (double) r1)
            r1 = 0
            r0.f11950e = r1
        L_0x0965:
            r1 = 1
            return r1
        L_0x0967:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Invalid element type "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x097e:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r2 = r0.f11949d
            int r3 = r0.f11951f
            long r4 = r0.f11952g
            int r4 = (int) r4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r2
            r2.mo25175a((int) r3, (int) r4, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r1)
            r1 = 0
            r0.f11950e = r1
            goto L_0x0965
        L_0x098e:
            long r2 = r0.f11952g
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x09a9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f11949d
            int r5 = r0.f11951f
            int r2 = (int) r2
            java.lang.String r1 = r0.mo25167c(r1, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r4
            r4.mo25178a((int) r5, (java.lang.String) r1)
            r1 = 0
            r0.f11950e = r1
            goto L_0x0965
        L_0x09a9:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "String element size: "
            r2.append(r3)
            long r3 = r0.f11952g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x09c2:
            long r2 = r0.f11952g
            r4 = 8
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x09dc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f11949d
            int r5 = r0.f11951f
            int r2 = (int) r2
            long r1 = r0.mo25166b(r1, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r4
            r4.mo25176a((int) r5, (long) r1)
            r1 = 0
            r0.f11950e = r1
            goto L_0x0965
        L_0x09dc:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid integer size: "
            r2.append(r3)
            long r3 = r0.f11952g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x09f5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r1
            long r4 = r1.f11670c
            long r1 = r0.f11952g
            long r1 = r1 + r4
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f11947b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a
            int r7 = r0.f11951f
            r6.<init>(r7, r1)
            r3.add(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r1 = r0.f11949d
            int r3 = r0.f11951f
            long r6 = r0.f11952g
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d.C4717b) r2
            r2.mo25177a((int) r3, (long) r4, (long) r6)
            r3 = 0
            r0.f11950e = r3
            r4 = 1
            return r4
        L_0x0a19:
            r3 = 0
            r4 = 1
            long r5 = r0.f11952g
            int r5 = (int) r5
            r6 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r6
            r6.mo25064c(r5)
            r0.f11950e = r3
            r5 = r4
            r4 = r3
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4711a.mo25165a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: c */
    public final String mo25167c(C4672g gVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        ((C4657b) gVar).mo25063b(bArr, 0, i, false);
        return new String(bArr);
    }

    /* renamed from: a */
    public final double mo25163a(C4672g gVar, int i) throws IOException, InterruptedException {
        long b = mo25166b(gVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) b);
        }
        return Double.longBitsToDouble(b);
    }
}
