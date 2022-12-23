package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1867b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.network.e */
class C2004e {

    /* renamed from: a */
    private final PriorityBlockingQueue<C2008b> f3847a = new PriorityBlockingQueue<>();

    /* renamed from: b */
    private final C1969m f3848b;

    /* renamed from: com.applovin.impl.sdk.network.e$a */
    static class C2006a extends Thread {

        /* renamed from: a */
        private final BlockingQueue<C2008b> f3849a;

        /* renamed from: b */
        private final C1969m f3850b;

        private C2006a(BlockingQueue<C2008b> blockingQueue, int i, C1969m mVar) {
            super("AL-Network-" + i);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            } else if (mVar != null) {
                this.f3849a = blockingQueue;
                this.f3850b = mVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private void m4668a() throws InterruptedException {
            m4669a(this.f3849a.take());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.Closeable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.net.HttpURLConnection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.net.HttpURLConnection} */
        /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[SYNTHETIC, Splitter:B:27:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m4669a(final com.applovin.impl.sdk.network.C2004e.C2008b r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
                java.net.HttpURLConnection r2 = r9.m4670b(r10)     // Catch:{ all -> 0x005b }
                byte[] r3 = r10.f3858e     // Catch:{ all -> 0x0058 }
                if (r3 == 0) goto L_0x002d
                byte[] r3 = r10.f3858e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                if (r3 <= 0) goto L_0x002d
                r3 = 1
                r2.setDoOutput(r3)     // Catch:{ all -> 0x0058 }
                byte[] r3 = r10.f3858e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                r2.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x0058 }
                java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0058 }
                byte[] r4 = r10.f3858e     // Catch:{ all -> 0x0058 }
                r3.write(r4)     // Catch:{ all -> 0x0058 }
                r3.close()     // Catch:{ all -> 0x0058 }
            L_0x002d:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0058 }
                if (r1 <= 0) goto L_0x0043
                java.io.InputStream r3 = r2.getInputStream()     // Catch:{ all -> 0x0058 }
                com.applovin.impl.sdk.m r4 = r9.f3850b     // Catch:{ all -> 0x003e }
                java.lang.String r4 = com.applovin.impl.sdk.utils.C2050h.m4949a((java.io.InputStream) r3, (com.applovin.impl.sdk.C1969m) r4)     // Catch:{ all -> 0x003e }
                goto L_0x0045
            L_0x003e:
                r4 = move-exception
                r8 = r4
                r4 = r3
                r3 = r8
                goto L_0x005e
            L_0x0043:
                r3 = r0
                r4 = r3
            L_0x0045:
                com.applovin.impl.sdk.m r5 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r3, r5)
                com.applovin.impl.sdk.m r3 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r0, r3)
                com.applovin.impl.sdk.m r3 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r3)
                r3 = r0
                r6 = r3
                r0 = r4
                goto L_0x0092
            L_0x0058:
                r3 = move-exception
                r4 = r0
                goto L_0x005e
            L_0x005b:
                r3 = move-exception
                r2 = r0
                r4 = r2
            L_0x005e:
                boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x00b7 }
                if (r5 == 0) goto L_0x0071
                com.applovin.impl.sdk.m r5 = r9.f3850b     // Catch:{ all -> 0x00b7 }
                com.applovin.impl.sdk.v r5 = r5.mo14509A()     // Catch:{ all -> 0x00b7 }
                java.lang.String r6 = "NetworkCommunicationThread"
                java.lang.String r7 = "Failed to make HTTP request"
                r5.mo15011a((java.lang.String) r6, (java.lang.String) r7, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00b7 }
            L_0x0071:
                if (r2 == 0) goto L_0x0081
                java.io.InputStream r5 = r2.getErrorStream()     // Catch:{ all -> 0x007e }
                com.applovin.impl.sdk.m r6 = r9.f3850b     // Catch:{ all -> 0x007f }
                java.lang.String r6 = com.applovin.impl.sdk.utils.C2050h.m4949a((java.io.InputStream) r5, (com.applovin.impl.sdk.C1969m) r6)     // Catch:{ all -> 0x007f }
                goto L_0x0083
            L_0x007e:
                r5 = r0
            L_0x007f:
                r6 = r0
                goto L_0x0083
            L_0x0081:
                r5 = r0
                r6 = r5
            L_0x0083:
                com.applovin.impl.sdk.m r7 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r4, r7)
                com.applovin.impl.sdk.m r4 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r5, r4)
                com.applovin.impl.sdk.m r4 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r4)
            L_0x0092:
                com.applovin.impl.sdk.network.e$c$a r2 = com.applovin.impl.sdk.network.C2004e.C2010c.m4695d()
                com.applovin.impl.sdk.network.e$c$a r1 = r2.mo14758a((int) r1)
                com.applovin.impl.sdk.network.e$c$a r0 = r1.mo14759a((java.lang.String) r0)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo14762b((java.lang.String) r6)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo14760a((java.lang.Throwable) r3)
                com.applovin.impl.sdk.network.e$c r0 = r0.mo14761a()
                java.util.concurrent.Executor r1 = r10.f3861h
                com.applovin.impl.sdk.network.e$a$1 r2 = new com.applovin.impl.sdk.network.e$a$1
                r2.<init>(r10, r0)
                r1.execute(r2)
                return
            L_0x00b7:
                r10 = move-exception
                com.applovin.impl.sdk.m r1 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r4, r1)
                com.applovin.impl.sdk.m r1 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.close(r0, r1)
                com.applovin.impl.sdk.m r0 = r9.f3850b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C2004e.C2006a.m4669a(com.applovin.impl.sdk.network.e$b):void");
        }

        /* renamed from: b */
        private HttpURLConnection m4670b(C2008b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f3855b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f3856c);
            httpURLConnection.setConnectTimeout(bVar.f3859f);
            httpURLConnection.setReadTimeout(bVar.f3859f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f3857d.isEmpty()) {
                for (Map.Entry entry : bVar.f3857d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m4668a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$b */
    static class C2008b implements Comparable<C2008b> {

        /* renamed from: a */
        private static final AtomicInteger f3854a = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f3855b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f3856c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Map<String, String> f3857d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final byte[] f3858e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f3859f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Consumer<C2010c> f3860g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final Executor f3861h;

        /* renamed from: i */
        private final int f3862i;

        /* renamed from: com.applovin.impl.sdk.network.e$b$a */
        static class C2009a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f3863a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f3864b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public Map<String, String> f3865c = new HashMap();
            /* access modifiers changed from: private */

            /* renamed from: d */
            public byte[] f3866d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f3867e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public Consumer<C2010c> f3868f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public Executor f3869g;

            C2009a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14746a(int i) {
                this.f3867e = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14747a(Consumer<C2010c> consumer) {
                this.f3868f = consumer;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14748a(String str) {
                this.f3863a = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14749a(String str, String str2) {
                this.f3865c.put(str, str2);
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14750a(Map<String, String> map) {
                if (map == null) {
                    map = new HashMap<>();
                }
                this.f3865c = map;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14751a(Executor executor) {
                this.f3869g = executor;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2009a mo14752a(byte[] bArr) {
                this.f3866d = bArr;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2008b mo14753a() {
                return new C2008b(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C2009a mo14754b(String str) {
                this.f3864b = str;
                return this;
            }
        }

        private C2008b(C2009a aVar) {
            this.f3855b = aVar.f3863a;
            this.f3856c = aVar.f3864b;
            this.f3857d = aVar.f3865c != null ? aVar.f3865c : Collections.emptyMap();
            this.f3858e = aVar.f3866d;
            this.f3859f = aVar.f3867e;
            this.f3860g = aVar.f3868f;
            this.f3861h = aVar.f3869g;
            this.f3862i = f3854a.incrementAndGet();
        }

        /* renamed from: a */
        public int compareTo(C2008b bVar) {
            return this.f3862i - bVar.f3862i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$c */
    static class C2010c {

        /* renamed from: a */
        private final int f3870a;

        /* renamed from: b */
        private final String f3871b;

        /* renamed from: c */
        private final String f3872c;

        /* renamed from: d */
        private final Throwable f3873d;

        /* renamed from: com.applovin.impl.sdk.network.e$c$a */
        static class C2011a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public int f3874a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f3875b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public String f3876c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public Throwable f3877d;

            C2011a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2011a mo14758a(int i) {
                this.f3874a = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2011a mo14759a(String str) {
                this.f3875b = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2011a mo14760a(Throwable th) {
                this.f3877d = th;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2010c mo14761a() {
                return new C2010c(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C2011a mo14762b(String str) {
                this.f3876c = str;
                return this;
            }
        }

        private C2010c(C2011a aVar) {
            this.f3870a = aVar.f3874a;
            this.f3871b = aVar.f3875b;
            this.f3872c = aVar.f3876c;
            this.f3873d = aVar.f3877d;
        }

        /* renamed from: d */
        static C2011a m4695d() {
            return new C2011a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo14755a() throws Throwable {
            Throwable th = this.f3873d;
            if (th == null) {
                return this.f3870a;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo14756b() throws Throwable {
            Throwable th = this.f3873d;
            if (th == null) {
                return this.f3871b;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo14757c() {
            return this.f3872c;
        }
    }

    C2004e(C1969m mVar) {
        this.f3848b = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14740a() {
        for (int i = 0; i < ((Integer) this.f3848b.mo14534a(C1867b.f3141ap)).intValue(); i++) {
            new C2006a(this.f3847a, i, this.f3848b).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14741a(C2008b bVar) {
        if (bVar != null) {
            this.f3847a.add(bVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
