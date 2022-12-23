package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2350h;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2289a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2312b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2313c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b */
/* compiled from: DownloadTask */
class C2301b extends C2287a {

    /* renamed from: m */
    final Object f4621m = this;

    /* renamed from: n */
    final Object f4622n;

    /* renamed from: o */
    private final int f4623o;

    /* renamed from: p */
    private final C2303b f4624p;

    /* renamed from: q */
    private volatile C2350h.C2351a f4625q;

    /* renamed from: r */
    private volatile C2312b f4626r;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$b */
    /* compiled from: DownloadTask */
    public interface C2303b {
        /* renamed from: a */
        void mo15727a(C2301b bVar);
    }

    C2301b(C2302a aVar) {
        super(aVar.f4630d, aVar.f4631e);
        this.f4623o = aVar.f4633g;
        this.f4624p = aVar.f4635i;
        this.f4590g = aVar.f4627a;
        this.f4591h = aVar.f4628b;
        this.f4589f = aVar.f4632f;
        this.f4593j = aVar.f4629c;
        this.f4592i = aVar.f4634h;
        this.f4622n = aVar.f4636j;
    }

    public void run() {
        this.f4584a.mo15690a(this.f4591h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m5279j();
        } catch (C2311a unused) {
        }
        this.f4587d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f4584a.mo15691b(this.f4591h);
        C2303b bVar = this.f4624p;
        if (bVar != null) {
            bVar.mo15727a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2350h.C2351a mo15713h() {
        return this.f4625q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2312b mo15714i() {
        return this.f4626r;
    }

    /* renamed from: j */
    private boolean m5279j() throws C2311a {
        while (this.f4593j.mo15809a()) {
            mo15686e();
            C2359l.C2360a b = this.f4593j.mo15810b();
            try {
                m5278a(b);
                return true;
            } catch (C2313c e) {
                b.mo15811a();
                mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo15812b();
                }
                if (!mo15683b()) {
                    mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e2);
                }
            } catch (C2350h.C2351a e3) {
                this.f4625q = e3;
                mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e3);
                return false;
            } catch (C2312b e4) {
                this.f4626r = e4;
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        mo15684c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d1, code lost:
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r6.mo15765d());
        r4.mo15800a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5278a(com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l.C2360a r13) throws java.io.IOException, com.bykv.p054vk.openvk.component.video.p055a.p059b.C2350h.C2351a, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2312b {
        /*
            r12 = this;
            com.bykv.vk.openvk.component.video.a.b.a.a r0 = r12.f4584a
            java.lang.String r1 = r12.f4591h
            java.io.File r0 = r0.mo15692c(r1)
            long r1 = r0.length()
            int r3 = r12.f4623o
            if (r3 <= 0) goto L_0x0044
            long r3 = (long) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0044
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r13 == 0) goto L_0x0043
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no necessary to download for "
            r0.append(r3)
            java.lang.String r3 = r12.f4591h
            r0.append(r3)
            java.lang.String r3 = ", cache file size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", max: "
            r0.append(r1)
            int r1 = r12.f4623o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0043:
            return
        L_0x0044:
            int r3 = r12.mo15687f()
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f4585b
            java.lang.String r5 = r12.f4591h
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo15728a((java.lang.String) r5, (int) r3)
            if (r4 == 0) goto L_0x0076
            int r5 = r4.f4639c
            long r5 = (long) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0076
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r13 == 0) goto L_0x0075
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file download complete, key: "
            r0.append(r1)
            java.lang.String r1 = r12.f4591h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0075:
            return
        L_0x0076:
            r12.mo15686e()
            int r5 = (int) r1
            int r6 = r12.f4623o
            java.lang.String r7 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r6 = r12.mo15679a(r13, r5, r6, r7)
            if (r6 != 0) goto L_0x0085
            return
        L_0x0085:
            r7 = 0
            r8 = 1
            r9 = 0
            r12.mo15686e()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.i r10 = r12.f4592i     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x0095
            boolean r10 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4687e     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0095
            r10 = r8
            goto L_0x0096
        L_0x0095:
            r10 = r9
        L_0x0096:
            java.lang.String r10 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5446a(r6, r10, r8)     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x01ea
            int r10 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5440a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a) r6)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0111
            int r11 = r4.f4639c     // Catch:{ all -> 0x020e }
            if (r11 == r10) goto L_0x0111
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f4639c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f4591h     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020e }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x020e }
        L_0x00d4:
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f4639c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f4590g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = ", previousInfo: "
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r4.f4641e     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x0111:
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f4585b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f4591h     // Catch:{ all -> 0x020e }
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5442a(r6, r13, r4, r3)     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f4585b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f4591h     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.a r13 = r13.mo15728a((java.lang.String) r4, (int) r3)     // Catch:{ all -> 0x020e }
            if (r13 != 0) goto L_0x0124
            r13 = r9
            goto L_0x0126
        L_0x0124:
            int r13 = r13.f4639c     // Catch:{ all -> 0x020e }
        L_0x0126:
            java.io.InputStream r3 = r6.mo15765d()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x020e }
            boolean r10 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4686d     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = "rwd"
            goto L_0x0135
        L_0x0133:
            java.lang.String r10 = "rw"
        L_0x0135:
            r4.<init>(r0, r10)     // Catch:{ all -> 0x020e }
            r4.mo15801a((long) r1)     // Catch:{ all -> 0x01e7 }
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r7.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r10 = "preload start from: "
            r7.append(r10)     // Catch:{ all -> 0x01e7 }
            r7.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x01e7 }
        L_0x0155:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01e7 }
        L_0x0159:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x01e7 }
            if (r1 < 0) goto L_0x01ca
            r12.mo15686e()     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x0181
            r4.mo15802a(r0, r9, r1)     // Catch:{ all -> 0x01e7 }
            int r5 = r5 + r1
            com.bykv.vk.openvk.component.video.a.b.i r2 = r12.f4592i     // Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r12.f4621m     // Catch:{ all -> 0x01e7 }
            monitor-enter(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r7 = r12.f4621m     // Catch:{ all -> 0x0176 }
            r7.notifyAll()     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            goto L_0x0179
        L_0x0176:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            throw r13     // Catch:{ all -> 0x01e7 }
        L_0x0179:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f4586c     // Catch:{ all -> 0x01e7 }
            r2.addAndGet(r1)     // Catch:{ all -> 0x01e7 }
            r12.mo15681a(r13, r5)     // Catch:{ all -> 0x01e7 }
        L_0x0181:
            int r1 = r12.f4623o     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x01c6
            int r1 = r12.f4623o     // Catch:{ all -> 0x01e7 }
            if (r5 < r1) goto L_0x01c6
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01e7 }
            if (r13 == 0) goto L_0x01ad
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r0.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = "download, more data received, currentCacheFileSize: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            r0.append(r5)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = ", max: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            int r1 = r12.f4623o     // Catch:{ all -> 0x01e7 }
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01e7 }
        L_0x01ad:
            java.io.InputStream r13 = r6.mo15765d()
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r13)
            r4.mo15800a()
            r12.mo15680a()
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r13 == 0) goto L_0x01c5
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "cancel call"
            android.util.Log.w(r13, r0)
        L_0x01c5:
            return
        L_0x01c6:
            r12.mo15686e()     // Catch:{ all -> 0x01e7 }
            goto L_0x0159
        L_0x01ca:
            r12.mo15684c()     // Catch:{ all -> 0x01e3 }
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01e3 }
            if (r13 == 0) goto L_0x01d8
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "download succeed, no need to cancel call"
            android.util.Log.i(r13, r0)     // Catch:{ all -> 0x01e3 }
        L_0x01d8:
            java.io.InputStream r13 = r6.mo15765d()
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r13)
            r4.mo15800a()
            return
        L_0x01e3:
            r13 = move-exception
            r7 = r4
            r8 = r9
            goto L_0x020f
        L_0x01e7:
            r13 = move-exception
            r7 = r4
            goto L_0x020f
        L_0x01ea:
            com.bykv.vk.openvk.component.video.a.b.c.c r0 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f4590g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x020e:
            r13 = move-exception
        L_0x020f:
            java.io.InputStream r0 = r6.mo15765d()
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r0)
            if (r7 == 0) goto L_0x021b
            r7.mo15800a()
        L_0x021b:
            if (r8 == 0) goto L_0x022b
            r12.mo15680a()
            boolean r0 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r1 = "cancel call"
            android.util.Log.w(r0, r1)
        L_0x022b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b.m5278a(com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$a */
    /* compiled from: DownloadTask */
    static final class C2302a {

        /* renamed from: a */
        String f4627a;

        /* renamed from: b */
        String f4628b;

        /* renamed from: c */
        C2359l f4629c;

        /* renamed from: d */
        C2289a f4630d;

        /* renamed from: e */
        C2306c f4631e;

        /* renamed from: f */
        List<C2352i.C2354b> f4632f;

        /* renamed from: g */
        int f4633g;

        /* renamed from: h */
        C2352i f4634h;

        /* renamed from: i */
        C2303b f4635i;

        /* renamed from: j */
        Object f4636j;

        C2302a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15723a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f4627a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2302a mo15726b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f4628b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15721a(C2359l lVar) {
            if (lVar != null) {
                this.f4629c = lVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15717a(C2289a aVar) {
            if (aVar != null) {
                this.f4630d = aVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15719a(C2306c cVar) {
            if (cVar != null) {
                this.f4631e = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15724a(List<C2352i.C2354b> list) {
            this.f4632f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15716a(int i) {
            this.f4633g = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15718a(C2303b bVar) {
            this.f4635i = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15720a(C2352i iVar) {
            this.f4634h = iVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2302a mo15722a(Object obj) {
            this.f4636j = obj;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2301b mo15725a() {
            if (this.f4630d != null && this.f4631e != null && !TextUtils.isEmpty(this.f4627a) && !TextUtils.isEmpty(this.f4628b) && this.f4629c != null) {
                return new C2301b(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
