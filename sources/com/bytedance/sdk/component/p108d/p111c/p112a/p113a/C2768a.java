package com.bytedance.sdk.component.p108d.p111c.p112a.p113a;

import android.util.Log;
import com.bytedance.sdk.component.p108d.p111c.p116c.C2798b;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.a */
/* compiled from: DiskLruCache */
public final class C2768a implements Closeable {

    /* renamed from: a */
    static final Pattern f6164a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c */
    public static final OutputStream f6165c = new OutputStream() {
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    final ExecutorService f6166b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final File f6167d;

    /* renamed from: e */
    private final File f6168e;

    /* renamed from: f */
    private final File f6169f;

    /* renamed from: g */
    private final File f6170g;

    /* renamed from: h */
    private final int f6171h;

    /* renamed from: i */
    private long f6172i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f6173j;

    /* renamed from: k */
    private long f6174k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Writer f6175l;

    /* renamed from: m */
    private final LinkedHashMap<String, C2773b> f6176m = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f6177n;

    /* renamed from: o */
    private long f6178o = -1;

    /* renamed from: p */
    private long f6179p = 0;

    /* renamed from: q */
    private final Callable<Void> f6180q = new Callable<Void>() {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this
                monitor-enter(r0)
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f6175l     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x0028 }
                r1.m7572h()     // Catch:{ all -> 0x0028 }
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m7570f()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x0028 }
                r1.m7567e()     // Catch:{ all -> 0x0028 }
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f6177n = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C27691.call():java.lang.Void");
        }
    };

    private C2768a(File file, int i, int i2, long j, ExecutorService executorService) {
        this.f6167d = file;
        this.f6171h = i;
        this.f6168e = new File(file, "journal");
        this.f6169f = new File(file, "journal.tmp");
        this.f6170g = new File(file, "journal.bkp");
        this.f6173j = i2;
        this.f6172i = j;
        this.f6166b = executorService;
    }

    /* renamed from: a */
    public static C2768a m7554a(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m7559a(file2, file3, false);
                }
            }
            C2768a aVar = new C2768a(file, i, i2, j, executorService);
            if (aVar.f6168e.exists()) {
                try {
                    aVar.m7561c();
                    aVar.m7563d();
                    return aVar;
                } catch (IOException e) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo17554b();
                }
            }
            file.mkdirs();
            C2768a aVar2 = new C2768a(file, i, i2, j, executorService);
            aVar2.m7567e();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f6177n = r0 - r9.f6176m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo17576b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m7567e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f6175l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f6168e, true), com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2778d.f6207a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7561c() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bytedance.sdk.component.d.c.a.a.c r1 = new com.bytedance.sdk.component.d.c.a.a.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f6168e
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2778d.f6207a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo17575a()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo17575a()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo17575a()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo17575a()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo17575a()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f6171h     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f6173j     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo17575a()     // Catch:{ EOFException -> 0x005f }
            r9.m7565d((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r2 = r9.f6176m     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f6177n = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo17576b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m7567e()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f6168e     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2778d.f6207a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f6175l = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.m7561c():void");
    }

    /* renamed from: d */
    private void m7565d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6176m.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2773b bVar = this.f6176m.get(str2);
            if (bVar == null) {
                bVar = new C2773b(str2);
                this.f6176m.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = bVar.f6191d = true;
                C2771a unused2 = bVar.f6192e = null;
                bVar.m7589a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C2771a unused3 = bVar.f6192e = new C2771a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: d */
    private void m7563d() throws IOException {
        m7558a(this.f6169f);
        Iterator<C2773b> it = this.f6176m.values().iterator();
        while (it.hasNext()) {
            C2773b next = it.next();
            int i = 0;
            if (next.f6192e == null) {
                while (i < this.f6173j) {
                    this.f6174k += next.f6190c[i];
                    i++;
                }
            } else {
                C2771a unused = next.f6192e = null;
                while (i < this.f6173j) {
                    m7558a(next.mo17567a(i));
                    m7558a(next.mo17569b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m7567e() throws IOException {
        if (this.f6175l != null) {
            this.f6175l.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6169f), C2778d.f6207a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6171h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6173j));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2773b next : this.f6176m.values()) {
                if (next.f6192e != null) {
                    bufferedWriter.write("DIRTY " + next.f6189b + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f6189b + next.mo17568a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f6168e.exists()) {
                m7559a(this.f6168e, this.f6170g, true);
            }
            m7559a(this.f6169f, this.f6168e, false);
            this.f6170g.delete();
            this.f6175l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6168e, true), C2778d.f6207a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m7558a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m7559a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m7558a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f6177n++;
        r11.f6175l.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (m7570f() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r11.f6166b.submit(r11.f6180q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return new com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2774c(r11, r12, com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2773b.m7595e(r0), r8, com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2773b.m7592b(r0), (com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C27691) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2774c mo17551a(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m7571g()     // Catch:{ all -> 0x0087 }
            r11.m7568e((java.lang.String) r12)     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r11.f6176m     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0087 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2773b) r0     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f6191d     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.f6173j     // Catch:{ all -> 0x0087 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0087 }
            r2 = 0
            r3 = r2
        L_0x0022:
            int r4 = r11.f6173j     // Catch:{ FileNotFoundException -> 0x0075 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0075 }
            java.io.File r5 = r0.mo17567a((int) r3)     // Catch:{ FileNotFoundException -> 0x0075 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0075 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0075 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.f6177n     // Catch:{ all -> 0x0087 }
            int r1 = r1 + 1
            r11.f6177n = r1     // Catch:{ all -> 0x0087 }
            java.io.Writer r1 = r11.f6175l     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            r2.append(r12)     // Catch:{ all -> 0x0087 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            boolean r1 = r11.m7570f()     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0062
            java.util.concurrent.ExecutorService r1 = r11.f6166b     // Catch:{ all -> 0x0087 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f6180q     // Catch:{ all -> 0x0087 }
            r1.submit(r2)     // Catch:{ all -> 0x0087 }
        L_0x0062:
            com.bytedance.sdk.component.d.c.a.a.a$c r1 = new com.bytedance.sdk.component.d.c.a.a.a$c     // Catch:{ all -> 0x0087 }
            long r6 = r0.f6193f     // Catch:{ all -> 0x0087 }
            long[] r9 = r0.f6190c     // Catch:{ all -> 0x0087 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r8, r9)     // Catch:{ all -> 0x0087 }
            monitor-exit(r11)
            return r1
        L_0x0075:
            int r12 = r11.f6173j     // Catch:{ all -> 0x0087 }
            if (r2 >= r12) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            if (r12 == 0) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            com.bytedance.sdk.component.p108d.p111c.p116c.C2798b.m7727a(r12)     // Catch:{ all -> 0x0087 }
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0085:
            monitor-exit(r11)
            return r1
        L_0x0087:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.mo17551a(java.lang.String):com.bytedance.sdk.component.d.c.a.a.a$c");
    }

    /* renamed from: b */
    public C2771a mo17553b(String str) throws IOException {
        return m7553a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2771a m7553a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m7571g()     // Catch:{ all -> 0x0061 }
            r5.m7568e((java.lang.String) r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r5.f6176m     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2773b) r0     // Catch:{ all -> 0x0061 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f6193f     // Catch:{ all -> 0x0061 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = new com.bytedance.sdk.component.d.c.a.a.a$b     // Catch:{ all -> 0x0061 }
            r0.<init>(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r7 = r5.f6176m     // Catch:{ all -> 0x0061 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x002f:
            com.bytedance.sdk.component.d.c.a.a.a$a r7 = r0.f6192e     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            com.bytedance.sdk.component.d.c.a.a.a$a r7 = new com.bytedance.sdk.component.d.c.a.a.a$a     // Catch:{ all -> 0x0061 }
            r7.<init>(r0)     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2771a unused = r0.f6192e = r7     // Catch:{ all -> 0x0061 }
            java.io.Writer r8 = r5.f6175l     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0061 }
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0061 }
            r8.write(r6)     // Catch:{ all -> 0x0061 }
            java.io.Writer r6 = r5.f6175l     // Catch:{ all -> 0x0061 }
            r6.flush()     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return r7
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.m7553a(java.lang.String, long):com.bytedance.sdk.component.d.c.a.a.a$a");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m7556a(com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2771a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = r10.f6183b     // Catch:{ all -> 0x0110 }
            com.bytedance.sdk.component.d.c.a.a.a$a r1 = r0.f6192e     // Catch:{ all -> 0x0110 }
            if (r1 != r10) goto L_0x010a
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f6191d     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f6173j     // Catch:{ all -> 0x0110 }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f6184c     // Catch:{ all -> 0x0110 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo17569b((int) r2)     // Catch:{ all -> 0x0110 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0030
            r10.mo17562b()     // Catch:{ all -> 0x0110 }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo17562b()     // Catch:{ all -> 0x0110 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x004d:
            int r10 = r9.f6173j     // Catch:{ all -> 0x0110 }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo17569b((int) r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo17567a((int) r1)     // Catch:{ all -> 0x0110 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f6190c     // Catch:{ all -> 0x0110 }
            r3 = r10[r1]     // Catch:{ all -> 0x0110 }
            long r5 = r2.length()     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f6190c     // Catch:{ all -> 0x0110 }
            r10[r1] = r5     // Catch:{ all -> 0x0110 }
            long r7 = r9.f6174k     // Catch:{ all -> 0x0110 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f6174k = r7     // Catch:{ all -> 0x0110 }
            goto L_0x007e
        L_0x007b:
            m7558a((java.io.File) r10)     // Catch:{ all -> 0x0110 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f6177n     // Catch:{ all -> 0x0110 }
            r1 = 1
            int r10 = r10 + r1
            r9.f6177n = r10     // Catch:{ all -> 0x0110 }
            r10 = 0
            com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2771a unused = r0.f6192e = r10     // Catch:{ all -> 0x0110 }
            boolean r10 = r0.f6191d     // Catch:{ all -> 0x0110 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00c8
            boolean unused = r0.f6191d = r1     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f6175l     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.f6189b     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.mo17568a()     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            r1.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ee
            long r10 = r9.f6179p     // Catch:{ all -> 0x0110 }
            r1 = 1
            long r1 = r1 + r10
            r9.f6179p = r1     // Catch:{ all -> 0x0110 }
            long unused = r0.f6193f = r10     // Catch:{ all -> 0x0110 }
            goto L_0x00ee
        L_0x00c8:
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r10 = r9.f6176m     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r0.f6189b     // Catch:{ all -> 0x0110 }
            r10.remove(r11)     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f6175l     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.f6189b     // Catch:{ all -> 0x0110 }
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r11)     // Catch:{ all -> 0x0110 }
        L_0x00ee:
            java.io.Writer r10 = r9.f6175l     // Catch:{ all -> 0x0110 }
            r10.flush()     // Catch:{ all -> 0x0110 }
            long r10 = r9.f6174k     // Catch:{ all -> 0x0110 }
            long r0 = r9.f6172i     // Catch:{ all -> 0x0110 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0101
            boolean r10 = r9.m7570f()     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x0108
        L_0x0101:
            java.util.concurrent.ExecutorService r10 = r9.f6166b     // Catch:{ all -> 0x0110 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f6180q     // Catch:{ all -> 0x0110 }
            r10.submit(r11)     // Catch:{ all -> 0x0110 }
        L_0x0108:
            monitor-exit(r9)
            return
        L_0x010a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            r10.<init>()     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.m7556a(com.bytedance.sdk.component.d.c.a.a.a$a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m7570f() {
        int i = this.f6177n;
        return i >= 2000 && i >= this.f6176m.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo17555c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m7571g()     // Catch:{ all -> 0x0093 }
            r7.m7568e((java.lang.String) r8)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r7.f6176m     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0093 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2773b) r0     // Catch:{ all -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0091
            com.bytedance.sdk.component.d.c.a.a.a$a r2 = r0.f6192e     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            int r2 = r7.f6173j     // Catch:{ all -> 0x0093 }
            if (r1 >= r2) goto L_0x005c
            java.io.File r2 = r0.mo17567a((int) r1)     // Catch:{ all -> 0x0093 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0046
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r8.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x0046:
            long r2 = r7.f6174k     // Catch:{ all -> 0x0093 }
            long[] r4 = r0.f6190c     // Catch:{ all -> 0x0093 }
            r5 = r4[r1]     // Catch:{ all -> 0x0093 }
            long r2 = r2 - r5
            r7.f6174k = r2     // Catch:{ all -> 0x0093 }
            long[] r2 = r0.f6190c     // Catch:{ all -> 0x0093 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0093 }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005c:
            int r0 = r7.f6177n     // Catch:{ all -> 0x0093 }
            r1 = 1
            int r0 = r0 + r1
            r7.f6177n = r0     // Catch:{ all -> 0x0093 }
            java.io.Writer r0 = r7.f6175l     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r8)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r7.f6176m     // Catch:{ all -> 0x0093 }
            r0.remove(r8)     // Catch:{ all -> 0x0093 }
            boolean r8 = r7.m7570f()     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x008f
            java.util.concurrent.ExecutorService r8 = r7.f6166b     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f6180q     // Catch:{ all -> 0x0093 }
            r8.submit(r0)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)
            return r1
        L_0x0093:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.mo17555c(java.lang.String):boolean");
    }

    /* renamed from: g */
    private void m7571g() {
        if (this.f6175l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo17552a() throws IOException {
        m7571g();
        m7572h();
        this.f6175l.flush();
    }

    public synchronized void close() throws IOException {
        if (this.f6175l != null) {
            Iterator it = new ArrayList(this.f6176m.values()).iterator();
            while (it.hasNext()) {
                C2773b bVar = (C2773b) it.next();
                if (bVar.f6192e != null) {
                    bVar.f6192e.mo17562b();
                }
            }
            m7572h();
            this.f6175l.close();
            this.f6175l = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7572h() throws IOException {
        long j = this.f6172i;
        long j2 = this.f6178o;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.f6174k > j) {
            mo17555c((String) this.f6176m.entrySet().iterator().next().getKey());
        }
        this.f6178o = -1;
    }

    /* renamed from: b */
    public void mo17554b() throws IOException {
        close();
        C2778d.m7611a(this.f6167d);
    }

    /* renamed from: e */
    private void m7568e(String str) {
        if (!f6164a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$c */
    /* compiled from: DiskLruCache */
    public final class C2774c implements Closeable {

        /* renamed from: b */
        private final String f6195b;

        /* renamed from: c */
        private final long f6196c;

        /* renamed from: d */
        private final InputStream[] f6197d;

        /* renamed from: e */
        private final long[] f6198e;

        private C2774c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f6195b = str;
            this.f6196c = j;
            this.f6197d = inputStreamArr;
            this.f6198e = jArr;
        }

        /* renamed from: a */
        public InputStream mo17570a(int i) {
            return this.f6197d[i];
        }

        public void close() {
            for (InputStream a : this.f6197d) {
                C2798b.m7727a(a);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a */
    /* compiled from: DiskLruCache */
    public final class C2771a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2773b f6183b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean[] f6184c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f6185d;

        /* renamed from: e */
        private boolean f6186e;

        private C2771a(C2773b bVar) {
            this.f6183b = bVar;
            this.f6184c = bVar.f6191d ? null : new boolean[C2768a.this.f6173j];
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo17560a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                if (r4 < 0) goto L_0x0051
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this
                int r0 = r0.f6173j
                if (r4 >= r0) goto L_0x0051
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this
                monitor-enter(r0)
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f6183b     // Catch:{ all -> 0x004e }
                com.bytedance.sdk.component.d.c.a.a.a$a r1 = r1.f6192e     // Catch:{ all -> 0x004e }
                if (r1 != r3) goto L_0x0048
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f6183b     // Catch:{ all -> 0x004e }
                boolean r1 = r1.f6191d     // Catch:{ all -> 0x004e }
                if (r1 != 0) goto L_0x0022
                boolean[] r1 = r3.f6184c     // Catch:{ all -> 0x004e }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x004e }
            L_0x0022:
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f6183b     // Catch:{ all -> 0x004e }
                java.io.File r4 = r1.mo17569b((int) r4)     // Catch:{ all -> 0x004e }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002e }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002e }
                goto L_0x003c
            L_0x002e:
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this     // Catch:{ all -> 0x004e }
                java.io.File r1 = r1.f6167d     // Catch:{ all -> 0x004e }
                r1.mkdirs()     // Catch:{ all -> 0x004e }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0044 }
            L_0x003c:
                com.bytedance.sdk.component.d.c.a.a.a$a$a r4 = new com.bytedance.sdk.component.d.c.a.a.a$a$a     // Catch:{ all -> 0x004e }
                r2 = 0
                r4.<init>(r1)     // Catch:{ all -> 0x004e }
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                return r4
            L_0x0044:
                java.io.OutputStream r4 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.f6165c     // Catch:{ all -> 0x004e }
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                return r4
            L_0x0048:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
                r4.<init>()     // Catch:{ all -> 0x004e }
                throw r4     // Catch:{ all -> 0x004e }
            L_0x004e:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                throw r4
            L_0x0051:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r4)
                com.bytedance.sdk.component.d.c.a.a.a r4 = com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.this
                int r4 = r4.f6173j
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2768a.C2771a.mo17560a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo17561a() throws IOException {
            if (this.f6185d) {
                C2768a.this.m7556a(this, false);
                C2768a.this.mo17555c(this.f6183b.f6189b);
            } else {
                C2768a.this.m7556a(this, true);
            }
            this.f6186e = true;
        }

        /* renamed from: b */
        public void mo17562b() throws IOException {
            C2768a.this.m7556a(this, false);
        }

        /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a$a */
        /* compiled from: DiskLruCache */
        private class C2772a extends FilterOutputStream {
            private C2772a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C2771a.this.f6185d = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C2771a.this.f6185d = true;
                }
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C2771a.this.f6185d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C2771a.this.f6185d = true;
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$b */
    /* compiled from: DiskLruCache */
    private final class C2773b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f6189b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long[] f6190c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f6191d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2771a f6192e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f6193f;

        private C2773b(String str) {
            this.f6189b = str;
            this.f6190c = new long[C2768a.this.f6173j];
        }

        /* renamed from: a */
        public String mo17568a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f6190c) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7589a(String[] strArr) throws IOException {
            if (strArr.length == C2768a.this.f6173j) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f6190c[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m7591b(strArr);
                    }
                }
                return;
            }
            throw m7591b(strArr);
        }

        /* renamed from: b */
        private IOException m7591b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo17567a(int i) {
            File f = C2768a.this.f6167d;
            return new File(f, this.f6189b + "." + i);
        }

        /* renamed from: b */
        public File mo17569b(int i) {
            File f = C2768a.this.f6167d;
            return new File(f, this.f6189b + "." + i + ".tmp");
        }
    }
}
