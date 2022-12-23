package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.player.cache.C4539b;
import com.fyber.inneractive.sdk.player.cache.C4541c;
import com.fyber.inneractive.sdk.player.cache.C4549d;
import com.fyber.inneractive.sdk.util.C5269f;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5304o0;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.player.cache.h */
public class C4556h implements C5304o0 {

    /* renamed from: a */
    public String f11291a = ("MediaDownloader-" + hashCode());

    /* renamed from: b */
    public C4541c f11292b;

    /* renamed from: c */
    public C4541c.C4548f f11293c;

    /* renamed from: d */
    public C4539b f11294d;

    /* renamed from: e */
    public final String f11295e;

    /* renamed from: f */
    public C4538a f11296f;

    /* renamed from: g */
    public C4564h f11297g;

    /* renamed from: h */
    public C4561e f11298h;

    /* renamed from: i */
    public HandlerThread f11299i;

    /* renamed from: j */
    public Handler f11300j;

    /* renamed from: k */
    public final Object f11301k = new Object();

    /* renamed from: l */
    public String f11302l;

    /* renamed from: m */
    public volatile boolean f11303m = false;

    /* renamed from: n */
    public boolean f11304n = false;

    /* renamed from: o */
    public boolean f11305o = false;

    /* renamed from: p */
    public String f11306p = null;

    /* renamed from: q */
    public C4563g f11307q;

    /* renamed from: r */
    public final C4251s f11308r;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$a */
    public class C4557a implements Runnable {
        public C4557a() {
        }

        public void run() {
            C4556h hVar = C4556h.this;
            C4564h hVar2 = hVar.f11297g;
            if (hVar2 != null) {
                ((C4549d.C4550a) hVar2).mo24760a(hVar, hVar.f11296f, (Exception) null);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$b */
    public class C4558b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f11310a;

        public C4558b(Exception exc) {
            this.f11310a = exc;
        }

        public void run() {
            C4556h hVar = C4556h.this;
            C4564h hVar2 = hVar.f11297g;
            if (hVar2 != null) {
                ((C4549d.C4550a) hVar2).mo24760a(hVar, hVar.f11296f, this.f11310a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$c */
    public class C4559c implements Runnable {
        public C4559c() {
        }

        public void run() {
            C4556h.this.mo24767a(false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$d */
    public static class C4560d extends Exception {
        public C4560d(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$e */
    public class C4561e extends Thread {

        /* renamed from: a */
        public AtomicBoolean f11313a = new AtomicBoolean(false);

        /* renamed from: b */
        public InputStream f11314b;

        /* renamed from: c */
        public boolean f11315c = false;

        /* renamed from: d */
        public boolean f11316d = false;

        /* renamed from: e */
        public long f11317e = -1;

        /* renamed from: f */
        public long f11318f = 0;

        /* renamed from: g */
        public C4541c.C4544c f11319g;

        /* renamed from: h */
        public int f11320h;

        /* renamed from: i */
        public int f11321i;

        /* renamed from: j */
        public int f11322j;

        /* renamed from: k */
        public int f11323k;

        public C4561e(String str, int i) {
            super(str);
            this.f11320h = i;
            this.f11321i = C4556h.this.f11308r != null ? ((C4234j) C4556h.this.f11308r.mo24264a(C4234j.class)).mo24247d() : 10;
            this.f11322j = C4556h.this.f11308r != null ? ((C4234j) C4556h.this.f11308r.mo24264a(C4234j.class)).mo24248e() : 500;
            this.f11323k = C4556h.this.f11308r != null ? ((C4234j) C4556h.this.f11308r.mo24264a(C4234j.class)).mo24252i() : 25;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01f6 A[EDGE_INSN: B:82:0x01f6->B:78:0x01f6 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.net.HttpURLConnection mo24772a(java.io.OutputStream r24, java.net.URL r25, java.nio.ByteBuffer r26, long r27, int r29) throws java.io.IOException, com.fyber.inneractive.sdk.player.cache.C4556h.C4560d {
            /*
                r23 = this;
                r0 = r23
                java.net.URLConnection r1 = r25.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                r2 = 0
                int r4 = (r27 > r2 ? 1 : (r27 == r2 ? 0 : -1))
                r5 = 0
                r6 = 1
                if (r4 <= 0) goto L_0x0023
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.Long r8 = java.lang.Long.valueOf(r27)
                r7[r5] = r8
                java.lang.String r8 = "bytes=%d-"
                java.lang.String r7 = java.lang.String.format(r8, r7)
                java.lang.String r8 = "Range"
                r1.addRequestProperty(r8, r7)
            L_0x0023:
                com.fyber.inneractive.sdk.player.cache.h r7 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.config.global.s r7 = r7.f11308r
                if (r7 == 0) goto L_0x005b
                java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r8 = com.fyber.inneractive.sdk.config.global.features.C4234j.class
                com.fyber.inneractive.sdk.config.global.features.e r7 = r7.mo24264a(r8)
                com.fyber.inneractive.sdk.config.global.features.j r7 = (com.fyber.inneractive.sdk.config.global.features.C4234j) r7
                java.lang.String r8 = "url_conn_connection_timeout"
                java.lang.Integer r7 = r7.mo24240b(r8)
                com.fyber.inneractive.sdk.player.cache.h r8 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.config.global.s r8 = r8.f11308r
                java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r9 = com.fyber.inneractive.sdk.config.global.features.C4234j.class
                com.fyber.inneractive.sdk.config.global.features.e r8 = r8.mo24264a(r9)
                com.fyber.inneractive.sdk.config.global.features.j r8 = (com.fyber.inneractive.sdk.config.global.features.C4234j) r8
                java.lang.String r9 = "url_conn_read_timeout"
                java.lang.Integer r8 = r8.mo24240b(r9)
                if (r7 == 0) goto L_0x0052
                int r7 = r7.intValue()
                r1.setConnectTimeout(r7)
            L_0x0052:
                if (r8 == 0) goto L_0x005b
                int r7 = r8.intValue()
                r1.setReadTimeout(r7)
            L_0x005b:
                r1.connect()
                int r7 = r1.getResponseCode()
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.player.cache.h r9 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r10 = r9.f11291a
                r8[r5] = r10
                java.lang.String r9 = r9.mo24764a()
                r8[r6] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r10 = 2
                r8[r10] = r9
                java.lang.String r9 = "%s http response code for %s is %d"
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r9, r8)
                r8 = 200(0xc8, float:2.8E-43)
                if (r7 == r8) goto L_0x0093
                r9 = 206(0xce, float:2.89E-43)
                if (r7 == r9) goto L_0x0093
                if (r4 > 0) goto L_0x0088
                goto L_0x0093
            L_0x0088:
                r1.disconnect()
                com.fyber.inneractive.sdk.player.cache.h$d r1 = new com.fyber.inneractive.sdk.player.cache.h$d
                java.lang.String r2 = "HTTP status code != 200"
                r1.<init>(r2)
                throw r1
            L_0x0093:
                int r9 = r1.getContentLength()
                long r11 = (long) r9
                r13 = 36700160(0x2300000, double:1.81322883E-316)
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r9 > 0) goto L_0x01f7
                if (r4 > 0) goto L_0x00a3
                r0.f11318f = r11
            L_0x00a3:
                java.io.InputStream r9 = r1.getInputStream()
                r0.f11314b = r9
                int r9 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                r15 = 100
                if (r9 > 0) goto L_0x00b3
                r13 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00b8
            L_0x00b3:
                int r13 = r15 / r29
                long r13 = (long) r13
                long r13 = r11 / r13
            L_0x00b8:
                if (r9 > 0) goto L_0x00be
                r5 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00ca
            L_0x00be:
                int r9 = r0.f11323k
                int r9 = r29 + r9
                if (r9 <= r15) goto L_0x00c6
                r9 = r29
            L_0x00c6:
                int r15 = r15 / r9
                long r5 = (long) r15
                long r5 = r11 / r5
            L_0x00ca:
                com.fyber.inneractive.sdk.util.d r11 = com.fyber.inneractive.sdk.util.C5261d.f13955b
                r11.getClass()
                if (r26 == 0) goto L_0x00dc
                boolean r11 = r26.hasArray()
                if (r11 == 0) goto L_0x00dc
                byte[] r11 = r26.array()
                goto L_0x00e0
            L_0x00dc:
                r11 = 8192(0x2000, float:1.14794E-41)
                byte[] r11 = new byte[r11]
            L_0x00e0:
                long r9 = r0.f11318f
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L_0x00f1
                long r9 = r0.f11317e
                r15 = -1
                int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
                if (r9 != 0) goto L_0x00f1
                r0.f11317e = r2
                goto L_0x0134
            L_0x00f1:
                if (r4 <= 0) goto L_0x0134
                if (r7 != r8) goto L_0x0134
                r0.f11317e = r2
                r4 = 2
                java.lang.Object[] r7 = new java.lang.Object[r4]
                com.fyber.inneractive.sdk.player.cache.h r4 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r8 = r4.f11291a
                r9 = 0
                r7[r9] = r8
                java.lang.String r4 = r4.mo24764a()
                r8 = 1
                r7[r8] = r4
                java.lang.String r4 = "%s | Server rejected Range header for %s | restarting"
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r4, r7)
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r24)
                com.fyber.inneractive.sdk.player.cache.c$c r4 = r0.f11319g
                r4.mo24746a()
                com.fyber.inneractive.sdk.player.cache.h r4 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.player.cache.c r7 = r4.f11292b
                java.lang.String r4 = r4.mo24764a()
                r7.mo24739d(r4)
                com.fyber.inneractive.sdk.player.cache.h r4 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.player.cache.c r7 = r4.f11292b
                java.lang.String r4 = r4.mo24764a()
                com.fyber.inneractive.sdk.player.cache.c$c r4 = r7.mo24730a((java.lang.String) r4)
                r7 = 0
                java.io.OutputStream r8 = r4.mo24745a(r7)
                r0.f11319g = r4
                goto L_0x0136
            L_0x0134:
                r8 = r24
            L_0x0136:
                java.io.InputStream r4 = r0.f11314b
                int r4 = r4.read(r11)
                r7 = -1
                if (r4 == r7) goto L_0x01f6
                java.util.concurrent.atomic.AtomicBoolean r7 = r0.f11313a
                r9 = 1
                boolean r7 = r7.compareAndSet(r9, r9)
                if (r7 == 0) goto L_0x015f
                r7 = 2
                java.lang.Object[] r2 = new java.lang.Object[r7]
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r4 = r3.f11291a
                r7 = 0
                r2[r7] = r4
                java.lang.String r3 = r3.mo24764a()
                r2[r9] = r3
                java.lang.String r3 = "%s | aborting download for cache %s"
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r3, r2)
                goto L_0x01f6
            L_0x015f:
                r7 = 0
                r8.write(r11, r7, r4)
                long r9 = r0.f11317e
                long r2 = (long) r4
                long r9 = r9 + r2
                r0.f11317e = r9
                boolean r2 = r0.f11315c
                if (r2 != 0) goto L_0x0174
                int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r2 >= 0) goto L_0x0172
                goto L_0x0174
            L_0x0172:
                r2 = 1
                goto L_0x017d
            L_0x0174:
                boolean r2 = r0.f11316d
                if (r2 != 0) goto L_0x01f1
                int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r2 < 0) goto L_0x01f1
                goto L_0x0172
            L_0x017d:
                r0.f11315c = r2
                int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r3 < 0) goto L_0x0185
                r0.f11316d = r2
            L_0x0185:
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.player.cache.a r3 = r2.f11296f
                if (r3 != 0) goto L_0x01dd
                java.lang.String r18 = r2.mo24764a()
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r4 = r3.f11295e
                com.fyber.inneractive.sdk.player.cache.c r7 = r3.f11292b
                java.lang.String r3 = r3.mo24764a()
                r7.mo24732a()
                r7.mo24741e(r3)
                java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r7 = r7.f11251j
                java.lang.Object r3 = r7.get(r3)
                com.fyber.inneractive.sdk.player.cache.c$d r3 = (com.fyber.inneractive.sdk.player.cache.C4541c.C4546d) r3
                if (r3 != 0) goto L_0x01ab
                r3 = 0
                goto L_0x01b0
            L_0x01ab:
                r7 = 0
                java.io.File r3 = r3.mo24753b(r7)
            L_0x01b0:
                r20 = r3
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r3 = r3.f11302l
                com.fyber.inneractive.sdk.player.cache.a r7 = new com.fyber.inneractive.sdk.player.cache.a
                r21 = 1
                r17 = r7
                r19 = r4
                r22 = r3
                r17.<init>(r18, r19, r20, r21, r22)
                r2.f11296f = r7
                long r2 = r0.f11318f
                r15 = 0
                int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
                if (r4 <= 0) goto L_0x01df
                com.fyber.inneractive.sdk.player.cache.h r4 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                com.fyber.inneractive.sdk.player.cache.a r4 = r4.f11296f
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.util.Map<java.lang.String, java.lang.String> r3 = r4.f11233e
                java.lang.String r4 = "http.file.length"
                r3.put(r4, r2)
                goto L_0x01df
            L_0x01dd:
                r15 = 0
            L_0x01df:
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                android.os.Handler r2 = r2.f11300j
                if (r2 == 0) goto L_0x01f3
                r8.flush()
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                android.os.Handler r2 = r2.f11300j
                r3 = 4
                r2.sendEmptyMessage(r3)
                goto L_0x01f3
            L_0x01f1:
                r15 = 0
            L_0x01f3:
                r2 = r15
                goto L_0x0136
            L_0x01f6:
                return r1
            L_0x01f7:
                com.fyber.inneractive.sdk.player.cache.h$f r1 = new com.fyber.inneractive.sdk.player.cache.h$f
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r13)
                r4 = 0
                r2[r4] = r3
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r11)
                r4 = 1
                r2[r4] = r3
                java.lang.String r3 = "File size to big for cache (max=%s current=%s)"
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4556h.C4561e.mo24772a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:88|89|92|93|94|95|96|97|98|(0)|101|(0)|105|107) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01e0 */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e6 A[Catch:{ all -> 0x01fd, all -> 0x0206 }] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x01f2 A[SYNTHETIC, Splitter:B:103:0x01f2] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7 A[Catch:{ f -> 0x00c3, all -> 0x0073, all -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9 A[Catch:{ f -> 0x00c3, all -> 0x0073, all -> 0x01bd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r8 = r22
                java.lang.String r0 = "%s | Starting a fresh download for %s"
                r9 = 2
                java.lang.Object[] r1 = new java.lang.Object[r9]
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this
                java.lang.String r3 = r2.f11291a
                r10 = 0
                r1[r10] = r3
                java.lang.String r2 = r2.mo24764a()
                r11 = 1
                r1[r11] = r2
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r0, r1)
                com.fyber.inneractive.sdk.util.d r0 = com.fyber.inneractive.sdk.util.C5261d.f13955b
                java.nio.ByteBuffer r12 = r0.mo26367b()
                r13 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r1 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = r1.f11295e     // Catch:{ all -> 0x01c2 }
                r0.<init>(r1)     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = "%s | opening an editor for %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01c2 }
                java.lang.String r4 = r3.f11291a     // Catch:{ all -> 0x01c2 }
                r2[r10] = r4     // Catch:{ all -> 0x01c2 }
                java.lang.String r3 = r3.mo24764a()     // Catch:{ all -> 0x01c2 }
                r2[r11] = r3     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r1, r2)     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r1 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.c r2 = r1.f11292b     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = r1.mo24764a()     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r2.mo24730a((java.lang.String) r1)     // Catch:{ all -> 0x01c2 }
                r8.f11319g = r1     // Catch:{ all -> 0x01c2 }
                java.io.OutputStream r14 = r1.mo24745a(r10)     // Catch:{ all -> 0x01c2 }
                int r1 = r8.f11321i     // Catch:{ all -> 0x01bf }
                int r1 = r1 - r11
                r15 = r13
            L_0x0051:
                if (r1 <= 0) goto L_0x00c5
                java.util.concurrent.atomic.AtomicBoolean r2 = r8.f11313a     // Catch:{ all -> 0x01bd }
                boolean r2 = r2.compareAndSet(r10, r10)     // Catch:{ all -> 0x01bd }
                if (r2 == 0) goto L_0x00c5
                if (r15 == 0) goto L_0x0060
                r15.disconnect()     // Catch:{ all -> 0x0060 }
            L_0x0060:
                int r16 = r1 + -1
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r5 = r8.f11317e     // Catch:{ f -> 0x00c3, all -> 0x0073 }
                int r7 = r8.f11320h     // Catch:{ f -> 0x00c3, all -> 0x0073 }
                r1 = r22
                r2 = r14
                r3 = r0
                r4 = r12
                java.net.HttpURLConnection r15 = r1.mo24772a(r2, r3, r4, r5, r7)     // Catch:{ f -> 0x00c3, all -> 0x0073 }
            L_0x0073:
                java.io.InputStream r1 = r8.f11314b     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r1)     // Catch:{ all -> 0x01bd }
                java.lang.String r1 = "%s Downloaded %d out of %d for key %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01bd }
                java.lang.String r3 = r3.f11291a     // Catch:{ all -> 0x01bd }
                r2[r10] = r3     // Catch:{ all -> 0x01bd }
                long r3 = r8.f11317e     // Catch:{ all -> 0x01bd }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01bd }
                r2[r11] = r3     // Catch:{ all -> 0x01bd }
                long r3 = r8.f11318f     // Catch:{ all -> 0x01bd }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01bd }
                r2[r9] = r3     // Catch:{ all -> 0x01bd }
                r3 = 3
                com.fyber.inneractive.sdk.player.cache.h r4 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01bd }
                java.lang.String r4 = r4.mo24764a()     // Catch:{ all -> 0x01bd }
                r2[r3] = r4     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r1, r2)     // Catch:{ all -> 0x01bd }
                long r1 = r8.f11317e     // Catch:{ all -> 0x01bd }
                long r3 = r8.f11318f     // Catch:{ all -> 0x01bd }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x00a9
                r1 = r10
                goto L_0x0051
            L_0x00a9:
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r1 = r1 - r17
                int r3 = r8.f11322j     // Catch:{ all -> 0x01bd }
                long r3 = (long) r3     // Catch:{ all -> 0x01bd }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 >= 0) goto L_0x00c0
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r1 = r1 - r17
                long r3 = r3 - r1
                java.lang.Thread.sleep(r3)     // Catch:{ all -> 0x01bd }
            L_0x00c0:
                r1 = r16
                goto L_0x0051
            L_0x00c3:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x01bd }
            L_0x00c5:
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01bd }
                java.lang.Object r1 = r0.f11301k     // Catch:{ all -> 0x01bd }
                monitor-enter(r1)     // Catch:{ all -> 0x01bd }
                long r2 = r8.f11318f     // Catch:{ all -> 0x01ba }
                long r4 = r8.f11317e     // Catch:{ all -> 0x01ba }
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x016a
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f11313a     // Catch:{ all -> 0x01ba }
                boolean r0 = r0.compareAndSet(r11, r11)     // Catch:{ all -> 0x01ba }
                if (r0 == 0) goto L_0x00dc
                goto L_0x016a
            L_0x00dc:
                java.lang.String r0 = "%s | committing to cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                java.lang.String r4 = r3.f11291a     // Catch:{ all -> 0x01ba }
                r2[r10] = r4     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r3.mo24764a()     // Catch:{ all -> 0x01ba }
                r2[r11] = r3     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r0, r2)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r14)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r2 = r0.f11296f     // Catch:{ all -> 0x01ba }
                if (r2 == 0) goto L_0x0144
                java.lang.Object r2 = r2.f11232d     // Catch:{ all -> 0x01ba }
                monitor-enter(r2)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c$c r0 = r8.f11319g     // Catch:{ all -> 0x0141 }
                boolean r3 = r0.f11260c     // Catch:{ all -> 0x0141 }
                if (r3 == 0) goto L_0x0110
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.C4541c.m13837a((com.fyber.inneractive.sdk.player.cache.C4541c) r3, (com.fyber.inneractive.sdk.player.cache.C4541c.C4544c) r0, (boolean) r10)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c$d r0 = r0.f11258a     // Catch:{ all -> 0x0141 }
                java.lang.String r0 = r0.f11263a     // Catch:{ all -> 0x0141 }
                r3.mo24739d(r0)     // Catch:{ all -> 0x0141 }
                goto L_0x0115
            L_0x0110:
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.C4541c.m13837a((com.fyber.inneractive.sdk.player.cache.C4541c) r3, (com.fyber.inneractive.sdk.player.cache.C4541c.C4544c) r0, (boolean) r11)     // Catch:{ all -> 0x0141 }
            L_0x0115:
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r3 = r0.f11292b     // Catch:{ all -> 0x0141 }
                monitor-enter(r3)     // Catch:{ all -> 0x0141 }
                r3.mo24732a()     // Catch:{ all -> 0x013e }
                r3.mo24742f()     // Catch:{ all -> 0x013e }
                java.io.Writer r0 = r3.f11250i     // Catch:{ all -> 0x013e }
                r0.flush()     // Catch:{ all -> 0x013e }
                monitor-exit(r3)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.a r3 = r0.f11296f     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r4 = r0.f11292b     // Catch:{ all -> 0x0141 }
                java.lang.String r0 = r0.mo24764a()     // Catch:{ all -> 0x0141 }
                java.io.File r0 = r4.mo24731a(r0, r10)     // Catch:{ all -> 0x0141 }
                r3.f11229a = r0     // Catch:{ all -> 0x0141 }
                monitor-exit(r2)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r0 = r0.f11296f     // Catch:{ all -> 0x01ba }
                r0.f11231c = r10     // Catch:{ all -> 0x01ba }
                goto L_0x018d
            L_0x013e:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0141 }
                throw r0     // Catch:{ all -> 0x0141 }
            L_0x0141:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0141 }
                throw r0     // Catch:{ all -> 0x01ba }
            L_0x0144:
                java.lang.String r17 = r0.mo24764a()     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r2.f11295e     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c r4 = r2.f11292b     // Catch:{ all -> 0x01ba }
                java.lang.String r2 = r2.mo24764a()     // Catch:{ all -> 0x01ba }
                java.io.File r19 = r4.mo24731a(r2, r10)     // Catch:{ all -> 0x01ba }
                r20 = 1
                com.fyber.inneractive.sdk.player.cache.h r2 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                java.lang.String r2 = r2.f11302l     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r4 = new com.fyber.inneractive.sdk.player.cache.a     // Catch:{ all -> 0x01ba }
                r16 = r4
                r18 = r3
                r21 = r2
                r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ba }
                r0.f11296f = r4     // Catch:{ all -> 0x01ba }
                goto L_0x018d
            L_0x016a:
                com.fyber.inneractive.sdk.player.cache.c$c r0 = r8.f11319g     // Catch:{ all -> 0x01ba }
                r0.mo24746a()     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c r2 = r0.f11292b     // Catch:{ all -> 0x01ba }
                java.lang.String r0 = r0.mo24764a()     // Catch:{ all -> 0x01ba }
                r2.mo24739d(r0)     // Catch:{ all -> 0x01ba }
                java.lang.String r0 = "%s | aborting cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01ba }
                java.lang.String r4 = r3.f11291a     // Catch:{ all -> 0x01ba }
                r2[r10] = r4     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r3.mo24764a()     // Catch:{ all -> 0x01ba }
                r2[r11] = r3     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.util.IAlog.m16449d(r0, r2)     // Catch:{ all -> 0x01ba }
            L_0x018d:
                monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01bd }
                boolean unused = r0.f11305o = r10     // Catch:{ all -> 0x01bd }
                if (r15 == 0) goto L_0x0198
                r15.disconnect()     // Catch:{ all -> 0x01bd }
            L_0x0198:
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f11313a     // Catch:{ all -> 0x01bd }
                boolean r0 = r0.compareAndSet(r10, r10)     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x01b1
                com.fyber.inneractive.sdk.player.cache.h r0 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01bd }
                android.os.Handler r0 = r0.f11300j     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x01b1
                long r1 = r8.f11317e     // Catch:{ all -> 0x01bd }
                long r3 = r8.f11318f     // Catch:{ all -> 0x01bd }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x01b1
                r0.sendEmptyMessage(r9)     // Catch:{ all -> 0x01bd }
            L_0x01b1:
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01f5
                r15.disconnect()     // Catch:{ all -> 0x01f5 }
                goto L_0x01f5
            L_0x01ba:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                throw r0     // Catch:{ all -> 0x01bd }
            L_0x01bd:
                r0 = move-exception
                goto L_0x01c5
            L_0x01bf:
                r0 = move-exception
                r15 = r13
                goto L_0x01c5
            L_0x01c2:
                r0 = move-exception
                r14 = r13
                r15 = r14
            L_0x01c5:
                java.lang.String r1 = "%s | mDownloadRunnable exception raised during download"
                java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.player.cache.h r3 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01fd }
                java.lang.String r3 = r3.f11291a     // Catch:{ all -> 0x01fd }
                r2[r10] = r3     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.util.IAlog.m16445a(r1, r0, r2)     // Catch:{ all -> 0x01fd }
                java.lang.String r1 = "mDownloadRunnable exception raised during download"
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.network.C4516r.m13797a(r1, r2, r13, r13)     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r8.f11319g     // Catch:{ Exception -> 0x01e0 }
                r1.mo24746a()     // Catch:{ Exception -> 0x01e0 }
            L_0x01e0:
                com.fyber.inneractive.sdk.player.cache.h r1 = com.fyber.inneractive.sdk.player.cache.C4556h.this     // Catch:{ all -> 0x01fd }
                android.os.Handler r1 = r1.f11300j     // Catch:{ all -> 0x01fd }
                if (r1 == 0) goto L_0x01ed
                android.os.Message r0 = r1.obtainMessage(r11, r0)     // Catch:{ all -> 0x01fd }
                r1.sendMessage(r0)     // Catch:{ all -> 0x01fd }
            L_0x01ed:
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01f5
                r15.disconnect()     // Catch:{ all -> 0x01f5 }
            L_0x01f5:
                com.fyber.inneractive.sdk.util.d r0 = com.fyber.inneractive.sdk.util.C5261d.f13955b
                java.util.Queue<java.nio.ByteBuffer> r0 = r0.f13956a
                r0.offer(r12)
                return
            L_0x01fd:
                r0 = move-exception
                com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x0206
                r15.disconnect()     // Catch:{ all -> 0x0206 }
            L_0x0206:
                com.fyber.inneractive.sdk.util.d r1 = com.fyber.inneractive.sdk.util.C5261d.f13955b
                java.util.Queue<java.nio.ByteBuffer> r1 = r1.f13956a
                r1.offer(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4556h.C4561e.run():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$f */
    public static class C4562f extends C4560d {
        public C4562f(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$g */
    public interface C4563g {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$h */
    public interface C4564h {
    }

    public C4556h(C4541c cVar, String str, C4539b bVar, int i, C4251s sVar) {
        this.f11292b = cVar;
        this.f11295e = str;
        this.f11302l = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.US));
        this.f11294d = bVar;
        this.f11308r = sVar;
        this.f11298h = new C4561e(String.format("MediaDownloader-%s-A", new Object[]{mo24764a()}), i);
        this.f11299i = new HandlerThread(String.format("MediaDownloader-%s-A", new Object[]{mo24764a()}));
    }

    /* renamed from: b */
    public final void mo24768b() {
        C5299n.f14024b.post(new C4557a());
    }

    public void handleMessage(Message message) {
        if (message.what != 4 || this.f11296f.f11234f) {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof Exception) {
                    mo24766a((Exception) obj);
                } else {
                    mo24766a((Exception) new C4560d("download failed"));
                }
                mo24767a(false);
            } else if (i == 2) {
                if (this.f11303m) {
                    synchronized (this.f11301k) {
                        IAlog.m16449d("%s | reading from cache 2 - %s", this.f11291a, mo24764a());
                        if (this.f11294d.mo24729a(this.f11296f, this.f11302l) == C4539b.C4540a.INVALID) {
                            mo24766a((Exception) new C4560d("Failed cache validation after downloading complete file"));
                            mo24767a(true);
                        } else {
                            mo24765a(this.f11296f);
                            C4538a aVar = this.f11296f;
                            aVar.f11233e.putAll(this.f11294d.f11235a);
                            mo24768b();
                        }
                    }
                } else {
                    C5299n.f14024b.post(new C4559c());
                }
                IAlog.m16449d("%s | Download success for cache key %s", this.f11291a, mo24764a());
            }
        } else {
            synchronized (this.f11301k) {
                IAlog.m16449d("%s | reading from cache 1 - %s", this.f11291a, mo24764a());
                C4539b.C4540a a = this.f11294d.mo24729a(this.f11296f, this.f11302l);
                if (a == C4539b.C4540a.INVALID) {
                    mo24766a((Exception) new C4560d("Failed cache validation"));
                    mo24767a(true);
                } else if (a == C4539b.C4540a.PARTIAL_CANNOT_VALIDATE) {
                    this.f11303m = true;
                } else {
                    this.f11296f.f11234f = true;
                    mo24765a(this.f11296f);
                    C4538a aVar2 = this.f11296f;
                    aVar2.f11233e.putAll(this.f11294d.f11235a);
                    mo24768b();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m13868b(C4556h hVar, boolean z) {
        C4555g gVar = new C4555g(hVar);
        Handler handler = hVar.f11300j;
        if (handler == null) {
            return;
        }
        if (z) {
            handler.postAtFrontOfQueue(gVar);
        } else {
            handler.postDelayed(gVar, 4);
        }
    }

    /* renamed from: a */
    public final void mo24766a(Exception exc) {
        C5299n.f14024b.post(new C4558b(exc));
    }

    /* renamed from: a */
    public final void mo24767a(boolean z) {
        C4561e eVar = this.f11298h;
        if (eVar != null) {
            eVar.f11313a.compareAndSet(false, true);
            this.f11298h = null;
        }
        HandlerThread handlerThread = this.f11299i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f11300j = null;
        if (z) {
            try {
                this.f11292b.mo24739d(mo24764a());
            } catch (IOException e) {
                IAlog.m16445a("failed to remove cache key", e, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public String mo24764a() {
        String str = "";
        if (this.f11306p == null) {
            String str2 = this.f11295e;
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(str2.getBytes());
                byte[] digest = instance.digest();
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1));
                }
                str = stringBuffer.toString();
            } catch (NoSuchAlgorithmException unused) {
                try {
                    MessageDigest instance2 = MessageDigest.getInstance(SameMD5.TAG);
                    instance2.update(str2.getBytes());
                    byte[] digest2 = instance2.digest();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    for (byte b2 : digest2) {
                        stringBuffer2.append(Integer.toHexString((b2 & 255) | 256).substring(1));
                    }
                    str = stringBuffer2.toString();
                } catch (NoSuchAlgorithmException unused2) {
                    str = str2.replaceAll("\\W+", str);
                }
            } catch (NullPointerException unused3) {
            }
            this.f11306p = str;
        }
        return this.f11306p;
    }

    /* renamed from: a */
    public final void mo24765a(C4538a aVar) {
        C4563g gVar;
        if (aVar != null && (gVar = this.f11307q) != null) {
            File a = aVar.mo24728a();
            File file = ((C5269f) gVar).f13976a;
            if (!((file == null || a == null || !file.getAbsolutePath().equals(a.getAbsolutePath())) ? false : true)) {
                C4563g gVar2 = this.f11307q;
                File a2 = aVar.mo24728a();
                C5269f fVar = (C5269f) gVar2;
                fVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(a2.getPath());
                    mediaMetadataRetriever.extractMetadata(8192);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1);
                    fVar.f13977b = frameAtTime;
                    if (frameAtTime != null && frameAtTime.getWidth() > 0 && fVar.f13977b.getHeight() > 0) {
                        fVar.f13976a = a2;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    try {
                        IAlog.m16446a("Failed getting frame from video file%s", C5312s.m16534a((Throwable) e));
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
                IAlog.m16449d("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
