package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.cache.c */
public final class C4541c implements Closeable {

    /* renamed from: p */
    public static final Pattern f11240p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: q */
    public static final OutputStream f11241q = new C4543b();

    /* renamed from: a */
    public final File f11242a;

    /* renamed from: b */
    public final File f11243b;

    /* renamed from: c */
    public final File f11244c;

    /* renamed from: d */
    public final File f11245d;

    /* renamed from: e */
    public final int f11246e;

    /* renamed from: f */
    public long f11247f;

    /* renamed from: g */
    public final int f11248g;

    /* renamed from: h */
    public long f11249h = 0;

    /* renamed from: i */
    public Writer f11250i;

    /* renamed from: j */
    public final LinkedHashMap<String, C4546d> f11251j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: k */
    public int f11252k;

    /* renamed from: l */
    public C4547e f11253l;

    /* renamed from: m */
    public long f11254m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f11255n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final Callable<Void> f11256o = new C4542a();

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$a */
    public class C4542a implements Callable<Void> {
        public C4542a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.player.cache.c r0 = com.fyber.inneractive.sdk.player.cache.C4541c.this
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0023 }
                java.io.Writer r2 = r1.f11250i     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.mo24742f()     // Catch:{ all -> 0x0023 }
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo24734b()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0023 }
                r1.mo24740e()     // Catch:{ all -> 0x0023 }
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f11252k = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.C4542a.call():java.lang.Object");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$b */
    public class C4543b extends OutputStream {
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c */
    public final class C4544c {

        /* renamed from: a */
        public final C4546d f11258a;

        /* renamed from: b */
        public final boolean[] f11259b;

        /* renamed from: c */
        public boolean f11260c;

        public C4544c(C4546d dVar) {
            this.f11258a = dVar;
            this.f11259b = dVar.f11265c ? null : new boolean[C4541c.this.f11248g];
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo24745a(int r5) throws java.io.IOException {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x0042
                com.fyber.inneractive.sdk.player.cache.c r0 = com.fyber.inneractive.sdk.player.cache.C4541c.this
                int r1 = r0.f11248g
                if (r5 >= r1) goto L_0x0042
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.cache.c$d r1 = r4.f11258a     // Catch:{ all -> 0x003f }
                com.fyber.inneractive.sdk.player.cache.c$c r2 = r1.f11266d     // Catch:{ all -> 0x003f }
                if (r2 != r4) goto L_0x0039
                boolean r2 = r1.f11265c     // Catch:{ all -> 0x003f }
                if (r2 != 0) goto L_0x0018
                boolean[] r2 = r4.f11259b     // Catch:{ all -> 0x003f }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x003f }
            L_0x0018:
                java.io.File r5 = r1.mo24753b(r5)     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0022 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0022 }
                goto L_0x002e
            L_0x0022:
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C4541c.this     // Catch:{ all -> 0x003f }
                java.io.File r1 = r1.f11242a     // Catch:{ all -> 0x003f }
                r1.mkdirs()     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0035 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0035 }
            L_0x002e:
                com.fyber.inneractive.sdk.player.cache.c$c$a r5 = new com.fyber.inneractive.sdk.player.cache.c$c$a     // Catch:{ all -> 0x003f }
                r5.<init>(r1)     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0035:
                java.io.OutputStream r5 = com.fyber.inneractive.sdk.player.cache.C4541c.f11241q     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0039:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003f }
                r5.<init>()     // Catch:{ all -> 0x003f }
                throw r5     // Catch:{ all -> 0x003f }
            L_0x003f:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r5
            L_0x0042:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r5)
                com.fyber.inneractive.sdk.player.cache.c r5 = com.fyber.inneractive.sdk.player.cache.C4541c.this
                int r5 = r5.f11248g
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.C4544c.mo24745a(int):java.io.OutputStream");
        }

        /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c$a */
        public class C4545a extends FilterOutputStream {
            public C4545a(OutputStream outputStream) {
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C4544c.this.f11260c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C4544c.this.f11260c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C4544c.this.f11260c = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C4544c.this.f11260c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo24746a() throws IOException {
            C4541c.m13837a(C4541c.this, this, false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$e */
    public interface C4547e {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$f */
    public final class C4548f implements Closeable {

        /* renamed from: a */
        public final InputStream[] f11269a;

        public C4548f(C4541c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f11269a = inputStreamArr;
        }

        public void close() {
            for (InputStream a : this.f11269a) {
                C4570m.m13882a((Closeable) a);
            }
        }
    }

    public C4541c(File file, int i, int i2, long j) {
        File file2 = file;
        this.f11242a = file2;
        this.f11246e = i;
        this.f11243b = new File(file2, "journal");
        this.f11244c = new File(file2, "journal.tmp");
        this.f11245d = new File(file2, "journal.bkp");
        this.f11248g = i2;
        this.f11247f = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.f11252k++;
        r10.f11250i.append("READ " + r11 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (mo24734b() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r10.f11255n.submit(r10.f11256o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        return new com.fyber.inneractive.sdk.player.cache.C4541c.C4548f(r10, r11, r0.f11267e, r8, r0.f11264b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.fyber.inneractive.sdk.player.cache.C4541c.C4548f mo24733b(java.lang.String r11) throws java.io.IOException {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.mo24732a()     // Catch:{ all -> 0x0080 }
            r10.mo24741e(r11)     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r0 = r10.f11251j     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0080 }
            com.fyber.inneractive.sdk.player.cache.c$d r0 = (com.fyber.inneractive.sdk.player.cache.C4541c.C4546d) r0     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r10)
            return r1
        L_0x0014:
            boolean r2 = r0.f11265c     // Catch:{ all -> 0x0080 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r10)
            return r1
        L_0x001a:
            int r2 = r10.f11248g     // Catch:{ all -> 0x0080 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0080 }
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r10.f11248g     // Catch:{ FileNotFoundException -> 0x006e }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r5 = r0.mo24751a((int) r3)     // Catch:{ FileNotFoundException -> 0x006e }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006e }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006e }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r10.f11252k     // Catch:{ all -> 0x0080 }
            int r1 = r1 + 1
            r10.f11252k = r1     // Catch:{ all -> 0x0080 }
            java.io.Writer r1 = r10.f11250i     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            r2.append(r11)     // Catch:{ all -> 0x0080 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            r1.append(r2)     // Catch:{ all -> 0x0080 }
            boolean r1 = r10.mo24734b()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r10.f11255n     // Catch:{ all -> 0x0080 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r10.f11256o     // Catch:{ all -> 0x0080 }
            r1.submit(r2)     // Catch:{ all -> 0x0080 }
        L_0x0060:
            com.fyber.inneractive.sdk.player.cache.c$f r1 = new com.fyber.inneractive.sdk.player.cache.c$f     // Catch:{ all -> 0x0080 }
            long r6 = r0.f11267e     // Catch:{ all -> 0x0080 }
            long[] r9 = r0.f11264b     // Catch:{ all -> 0x0080 }
            r3 = r1
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x0080 }
            monitor-exit(r10)
            return r1
        L_0x006e:
            int r11 = r10.f11248g     // Catch:{ all -> 0x0080 }
            if (r2 >= r11) goto L_0x007e
            r11 = r8[r2]     // Catch:{ all -> 0x0080 }
            if (r11 == 0) goto L_0x007e
            r11 = r8[r2]     // Catch:{ all -> 0x0080 }
            com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r11)     // Catch:{ all -> 0x0080 }
            int r2 = r2 + 1
            goto L_0x006e
        L_0x007e:
            monitor-exit(r10)
            return r1
        L_0x0080:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.mo24733b(java.lang.String):com.fyber.inneractive.sdk.player.cache.c$f");
    }

    /* renamed from: c */
    public final void mo24736c(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f11251j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C4546d dVar = this.f11251j.get(str2);
            if (dVar == null) {
                dVar = new C4546d(str2);
                this.f11251j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f11265c = true;
                dVar.f11266d = null;
                if (split.length == C4541c.this.f11248g) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f11264b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused2) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f11266d = new C4544c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    public synchronized void close() throws IOException {
        if (this.f11250i != null) {
            Iterator it = new ArrayList(this.f11251j.values()).iterator();
            while (it.hasNext()) {
                C4544c cVar = ((C4546d) it.next()).f11266d;
                if (cVar != null) {
                    cVar.mo24746a();
                }
            }
            mo24742f();
            this.f11250i.close();
            this.f11250i = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)|(1:21)(1:22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f11252k = r2 - r9.f11251j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r1.f11330e == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        mo24740e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r9.f11250i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f11243b, true), com.fyber.inneractive.sdk.player.cache.C4570m.f11332a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0091=Splitter:B:25:0x0091, B:16:0x0062=Splitter:B:16:0x0062} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24738d() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.fyber.inneractive.sdk.player.cache.l r1 = new com.fyber.inneractive.sdk.player.cache.l
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f11243b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.fyber.inneractive.sdk.player.cache.C4570m.f11332a
            r4 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r4, r3)
            java.lang.String r2 = r1.mo24775b()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = r1.mo24775b()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r1.mo24775b()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = r1.mo24775b()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r1.mo24775b()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f11246e     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bf }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f11248g     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = r0
        L_0x0058:
            java.lang.String r3 = r1.mo24775b()     // Catch:{ EOFException -> 0x0062 }
            r9.mo24736c(r3)     // Catch:{ EOFException -> 0x0062 }
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r3 = r9.f11251j     // Catch:{ all -> 0x00bf }
            int r3 = r3.size()     // Catch:{ all -> 0x00bf }
            int r2 = r2 - r3
            r9.f11252k = r2     // Catch:{ all -> 0x00bf }
            int r2 = r1.f11330e     // Catch:{ all -> 0x00bf }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0072
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r9.mo24740e()     // Catch:{ all -> 0x00bf }
            goto L_0x008d
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bf }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bf }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r9.f11243b     // Catch:{ all -> 0x00bf }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00bf }
            java.nio.charset.Charset r4 = com.fyber.inneractive.sdk.player.cache.C4570m.f11332a     // Catch:{ all -> 0x00bf }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bf }
            r0.<init>(r2)     // Catch:{ all -> 0x00bf }
            r9.f11250i = r0     // Catch:{ all -> 0x00bf }
        L_0x008d:
            com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r1)
            return
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r7.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bf }
            r7.append(r2)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r3)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r4     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.cache.C4570m.m13882a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.mo24738d():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final synchronized void mo24740e() throws IOException {
        Writer writer = this.f11250i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11244c), C4570m.f11332a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f11246e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f11248g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C4546d next : this.f11251j.values()) {
                if (next.f11266d != null) {
                    bufferedWriter.write("DIRTY " + next.f11263a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f11263a + next.mo24752a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f11243b.exists()) {
                m13839a(this.f11243b, this.f11245d, true);
            }
            m13839a(this.f11244c, this.f11243b, false);
            this.f11245d.delete();
            this.f11250i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11243b, true), C4570m.f11332a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo24742f() throws IOException {
        while (this.f11249h > this.f11247f) {
            String str = (String) this.f11251j.entrySet().iterator().next().getKey();
            C4547e eVar = this.f11253l;
            if (eVar == null) {
                mo24739d(str);
            } else if (((C4571n) eVar).mo24779a(this, str)) {
                mo24739d(str);
            } else {
                boolean z = false;
                for (String next : this.f11251j.keySet()) {
                    if (((C4571n) this.f11253l).mo24779a(this, next)) {
                        z |= mo24739d(next);
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$d */
    public final class C4546d {

        /* renamed from: a */
        public final String f11263a;

        /* renamed from: b */
        public final long[] f11264b;

        /* renamed from: c */
        public boolean f11265c;

        /* renamed from: d */
        public C4544c f11266d;

        /* renamed from: e */
        public long f11267e;

        public C4546d(String str) {
            this.f11263a = str;
            this.f11264b = new long[C4541c.this.f11248g];
        }

        /* renamed from: b */
        public File mo24753b(int i) {
            File file = C4541c.this.f11242a;
            return new File(file, this.f11263a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public String mo24752a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f11264b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public File mo24751a(int i) {
            File file = C4541c.this.f11242a;
            return new File(file, this.f11263a + "." + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13837a(com.fyber.inneractive.sdk.player.cache.C4541c r9, com.fyber.inneractive.sdk.player.cache.C4541c.C4544c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            com.fyber.inneractive.sdk.player.cache.c$d r0 = r10.f11258a     // Catch:{ all -> 0x00fb }
            com.fyber.inneractive.sdk.player.cache.c$c r1 = r0.f11266d     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f11265c     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.f11248g     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f11259b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002c
            java.io.File r3 = r0.mo24753b(r2)     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x0029
            r10.mo24746a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            goto L_0x00f4
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.mo24746a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0046:
            int r10 = r9.f11248g     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x0076
            java.io.File r10 = r0.mo24753b(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0073
            java.io.File r2 = r0.mo24751a((int) r1)     // Catch:{ all -> 0x00fb }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f11264b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            long r5 = r2.length()     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f11264b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f11249h     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f11249h = r7     // Catch:{ all -> 0x00fb }
            goto L_0x0073
        L_0x0070:
            m13838a((java.io.File) r10)     // Catch:{ all -> 0x00fb }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f11252k     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f11252k = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f11266d = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f11265c     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b7
            boolean unused = r0.f11265c = r1     // Catch:{ all -> 0x00fb }
            java.io.Writer r10 = r9.f11250i     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.f11263a     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.mo24752a()     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            r1.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f11254m     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f11254m = r1     // Catch:{ all -> 0x00fb }
            r0.f11267e = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00b7:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r10 = r9.f11251j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f11263a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            java.io.Writer r10 = r9.f11250i     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r0.f11263a     // Catch:{ all -> 0x00fb }
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r11)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            java.io.Writer r10 = r9.f11250i     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f11249h     // Catch:{ all -> 0x00fb }
            long r0 = r9.f11247f     // Catch:{ all -> 0x00fb }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ec
            boolean r10 = r9.mo24734b()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f11255n     // Catch:{ all -> 0x00fb }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f11256o     // Catch:{ all -> 0x00fb }
            r10.submit(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
        L_0x00f4:
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.m13837a(com.fyber.inneractive.sdk.player.cache.c, com.fyber.inneractive.sdk.player.cache.c$c, boolean):void");
    }

    /* renamed from: b */
    public final boolean mo24734b() {
        int i = this.f11252k;
        return i >= 2000 && i >= this.f11251j.size();
    }

    /* renamed from: e */
    public final void mo24741e(String str) {
        if (!f11240p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: c */
    public final void mo24735c() throws IOException {
        m13838a(this.f11244c);
        Iterator<C4546d> it = this.f11251j.values().iterator();
        while (it.hasNext()) {
            C4546d next = it.next();
            int i = 0;
            if (next.f11266d == null) {
                while (i < this.f11248g) {
                    this.f11249h += next.f11264b[i];
                    i++;
                }
            } else {
                next.f11266d = null;
                while (i < this.f11248g) {
                    m13838a(next.mo24751a(i));
                    m13838a(next.mo24753b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo24739d(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0093 }
            r2 = 0
            r1[r2] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "DiskLruCache remove %s"
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r3, r1)     // Catch:{ all -> 0x0093 }
            r8.mo24732a()     // Catch:{ all -> 0x0093 }
            r8.mo24741e(r9)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r1 = r8.f11251j     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0093 }
            com.fyber.inneractive.sdk.player.cache.c$d r1 = (com.fyber.inneractive.sdk.player.cache.C4541c.C4546d) r1     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0091
            com.fyber.inneractive.sdk.player.cache.c$c r3 = r1.f11266d     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0091
        L_0x0021:
            int r3 = r8.f11248g     // Catch:{ all -> 0x0093 }
            if (r2 >= r3) goto L_0x005d
            java.io.File r3 = r1.mo24751a((int) r2)     // Catch:{ all -> 0x0093 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x004d
            boolean r4 = r3.delete()     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x0036
            goto L_0x004d
        L_0x0036:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r9.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x004d:
            long r3 = r8.f11249h     // Catch:{ all -> 0x0093 }
            long[] r5 = r1.f11264b     // Catch:{ all -> 0x0093 }
            r6 = r5[r2]     // Catch:{ all -> 0x0093 }
            long r3 = r3 - r6
            r8.f11249h = r3     // Catch:{ all -> 0x0093 }
            r3 = 0
            r5[r2] = r3     // Catch:{ all -> 0x0093 }
            int r2 = r2 + 1
            goto L_0x0021
        L_0x005d:
            int r1 = r8.f11252k     // Catch:{ all -> 0x0093 }
            int r1 = r1 + r0
            r8.f11252k = r1     // Catch:{ all -> 0x0093 }
            java.io.Writer r1 = r8.f11250i     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r9)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r1.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r1 = r8.f11251j     // Catch:{ all -> 0x0093 }
            r1.remove(r9)     // Catch:{ all -> 0x0093 }
            boolean r9 = r8.mo24734b()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x008f
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f11255n     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r1 = r8.f11256o     // Catch:{ all -> 0x0093 }
            r9.submit(r1)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r8)
            return r0
        L_0x0091:
            monitor-exit(r8)
            return r2
        L_0x0093:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4541c.mo24739d(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C4541c m13836a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m13839a(file2, file3, false);
                }
            }
            C4541c cVar = new C4541c(file, i, i2, j);
            if (cVar.f11243b.exists()) {
                try {
                    cVar.mo24738d();
                    cVar.mo24735c();
                    return cVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    IAlog.m16449d("DiskLruCache delete cache", new Object[0]);
                    cVar.close();
                    C4570m.m13883a(cVar.f11242a);
                }
            }
            file.mkdirs();
            C4541c cVar2 = new C4541c(file, i, i2, j);
            cVar2.mo24740e();
            return cVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: a */
    public static void m13838a(File file) throws IOException {
        IAlog.m16449d("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static void m13839a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m13838a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public File mo24731a(String str, int i) {
        mo24732a();
        mo24741e(str);
        C4546d dVar = this.f11251j.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.mo24751a(i);
    }

    /* renamed from: a */
    public C4544c mo24730a(String str) throws IOException {
        synchronized (this) {
            mo24732a();
            mo24741e(str);
            C4546d dVar = this.f11251j.get(str);
            if (dVar == null) {
                dVar = new C4546d(str);
                this.f11251j.put(str, dVar);
            } else if (dVar.f11266d != null) {
                return null;
            }
            C4544c cVar = new C4544c(dVar);
            dVar.f11266d = cVar;
            Writer writer = this.f11250i;
            writer.write("DIRTY " + str + 10);
            this.f11250i.flush();
            return cVar;
        }
    }

    /* renamed from: a */
    public final void mo24732a() {
        if (this.f11250i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
}
