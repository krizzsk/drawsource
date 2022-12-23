package com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b;

import android.content.Context;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2393c;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.b */
/* compiled from: ReallyVideoPreload */
public class C2284b {

    /* renamed from: a */
    private Context f4573a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2401c f4574b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f4575c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public File f4576d = null;

    /* renamed from: e */
    private File f4577e = null;

    /* renamed from: f */
    private final List<C2410a.C2411a> f4578f = new ArrayList();

    /* renamed from: g */
    private volatile boolean f4579g = false;

    public C2284b(Context context, C2401c cVar) {
        this.f4573a = context;
        this.f4574b = cVar;
        this.f4576d = C2393c.m5619b(cVar.mo15966a(), cVar.mo15992k());
        this.f4577e = C2393c.m5620c(cVar.mo15966a(), cVar.mo15992k());
    }

    /* renamed from: a */
    public void mo15677a(C2410a.C2411a aVar) {
        if (this.f4579g) {
            synchronized (C2410a.C2411a.class) {
                this.f4578f.add(aVar);
            }
            return;
        }
        this.f4578f.add(aVar);
        if (this.f4577e.exists() || (!this.f4574b.mo15989h() && this.f4576d.length() >= ((long) this.f4574b.mo15973b()))) {
            C2415c.m5831b("VideoPreload", "Cache file is exist");
            this.f4574b.mo15988g(1);
            m5219a(this.f4574b, 200);
            C2286c.m5237a(this.f4574b);
            return;
        }
        this.f4579g = true;
        this.f4574b.mo15988g(0);
        m5223b();
    }

    /* renamed from: b */
    private void m5223b() {
        C2743i.C2744a aVar;
        if (C2397b.m5672e() != null) {
            aVar = C2397b.m5672e().mo17496b();
        } else {
            aVar = new C2743i.C2744a();
        }
        aVar.mo17497a((long) this.f4574b.mo15994m(), TimeUnit.MILLISECONDS).mo17500b((long) this.f4574b.mo15995n(), TimeUnit.MILLISECONDS).mo17501c((long) this.f4574b.mo15996o(), TimeUnit.MILLISECONDS);
        C2743i a = aVar.mo17499a();
        C2746k.C2747a aVar2 = new C2746k.C2747a();
        final long length = this.f4576d.length();
        if (this.f4574b.mo15989h()) {
            aVar2.mo17517a("RANGE", "bytes=" + length + "-").mo17516a(this.f4574b.mo15991j()).mo17511a().mo17519b();
        } else {
            aVar2.mo17517a("RANGE", "bytes=" + length + "-" + this.f4574b.mo15973b()).mo17516a(this.f4574b.mo15991j()).mo17511a().mo17519b();
        }
        a.mo17398a(aVar2.mo17519b()).mo17391a(new C2734c() {
            /* renamed from: a */
            public void mo15674a(C2724b bVar, IOException iOException) {
                C2284b bVar2 = C2284b.this;
                bVar2.m5220a(bVar2.f4574b, 601, iOException.getMessage());
                C2286c.m5237a(C2284b.this.f4574b);
            }

            /* JADX WARNING: Removed duplicated region for block: B:54:0x0185 A[Catch:{ all -> 0x01d2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x025a A[Catch:{ all -> 0x02a4 }] */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x019d A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo15673a(com.bytedance.sdk.component.p102b.p103a.C2724b r23, com.bytedance.sdk.component.p102b.p103a.C2750m r24) throws java.io.IOException {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r24
                    long r3 = r2
                    r6 = 0
                    r7 = 3
                    java.lang.String r8 = " Preload size="
                    r9 = 2
                    java.lang.String r10 = "Pre finally "
                    r11 = 4
                    java.lang.String r12 = "VideoPreload"
                    r13 = 1
                    r14 = 0
                    if (r2 == 0) goto L_0x01e5
                    boolean r0 = r24.mo17421d()     // Catch:{ all -> 0x01e1 }
                    if (r0 != 0) goto L_0x0079
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b     // Catch:{ all -> 0x0070 }
                    int r4 = r24.mo17419c()     // Catch:{ all -> 0x0070 }
                    java.lang.String r15 = r24.mo17422e()     // Catch:{ all -> 0x0070 }
                    r0.m5220a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r3, (int) r4, (java.lang.String) r15)     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    java.lang.String r2 = r2.mo15991j()
                    r0[r13] = r2
                    r0[r9] = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    int r2 = r2.mo15973b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0[r7] = r2
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0066:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f4574b
                    com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2286c.m5237a(r0)
                    return
                L_0x0070:
                    r0 = move-exception
                    r7 = r6
                    r23 = r8
                    r5 = 601(0x259, float:8.42E-43)
                    r8 = r7
                    goto L_0x0248
                L_0x0079:
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo17423f()     // Catch:{ all -> 0x01e1 }
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo17423f()     // Catch:{ all -> 0x01da }
                    r16 = 0
                    if (r0 == 0) goto L_0x009d
                    if (r15 == 0) goto L_0x009d
                    r23 = r8
                    long r7 = r2     // Catch:{ all -> 0x0099 }
                    long r18 = r15.mo17427a()     // Catch:{ all -> 0x0099 }
                    long r7 = r7 + r18
                    java.io.InputStream r0 = r15.mo17429c()     // Catch:{ all -> 0x0099 }
                    r18 = r7
                    r7 = r0
                    goto L_0x00a2
                L_0x0099:
                    r0 = move-exception
                    r7 = r6
                    r8 = r7
                    goto L_0x00f5
                L_0x009d:
                    r23 = r8
                    r7 = r6
                    r18 = r16
                L_0x00a2:
                    if (r7 != 0) goto L_0x00fa
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b     // Catch:{ all -> 0x00f3 }
                    int r4 = r24.mo17419c()     // Catch:{ all -> 0x00f3 }
                    java.lang.String r8 = r24.mo17422e()     // Catch:{ all -> 0x00f3 }
                    r0.m5220a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r3, (int) r4, (java.lang.String) r8)     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    java.lang.String r2 = r2.mo15991j()
                    r0[r13] = r2
                    r0[r9] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    int r2 = r2.mo15973b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x00f3:
                    r0 = move-exception
                    r8 = r6
                L_0x00f5:
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0248
                L_0x00fa:
                    java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01d5 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d5 }
                    java.io.File r0 = r0.f4576d     // Catch:{ all -> 0x01d5 }
                    java.lang.String r6 = "rw"
                    r8.<init>(r0, r6)     // Catch:{ all -> 0x01d5 }
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01d2 }
                    r6 = r14
                    r20 = r16
                L_0x010e:
                    int r5 = 8192 - r6
                    int r5 = r7.read(r0, r6, r5)     // Catch:{ all -> 0x01d2 }
                    r9 = -1
                    if (r5 == r9) goto L_0x01a2
                    com.bykv.vk.openvk.component.video.a.a.b.b r9 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    boolean r9 = r9.f4575c     // Catch:{ all -> 0x01d2 }
                    if (r9 == 0) goto L_0x016b
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo17419c()     // Catch:{ all -> 0x01d2 }
                    r0.m5225b(r3, r4)     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    java.lang.String r2 = r2.mo15991j()
                    r0[r13] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    int r2 = r2.mo15973b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x016b:
                    int r6 = r6 + r5
                    long r13 = (long) r5
                    long r20 = r20 + r13
                    r13 = 8192(0x2000, double:4.0474E-320)
                    long r13 = r20 % r13
                    int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                    if (r5 == 0) goto L_0x0182
                    long r13 = r2     // Catch:{ all -> 0x01d2 }
                    long r13 = r18 - r13
                    int r5 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                    if (r5 != 0) goto L_0x0180
                    goto L_0x0182
                L_0x0180:
                    r5 = 0
                    goto L_0x0183
                L_0x0182:
                    r5 = 1
                L_0x0183:
                    if (r5 == 0) goto L_0x019d
                    java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d2 }
                    int r5 = r5.intValue()     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r13 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f4574b     // Catch:{ all -> 0x01d2 }
                    java.lang.String r13 = r13.mo15992k()     // Catch:{ all -> 0x01d2 }
                    com.bykv.p054vk.openvk.component.video.p055a.p068e.C2393c.m5618a(r8, r0, r5, r6, r13)     // Catch:{ all -> 0x01d2 }
                    long r5 = (long) r6     // Catch:{ all -> 0x01d2 }
                    long r3 = r3 + r5
                    r6 = 0
                L_0x019d:
                    r9 = 2
                    r13 = 1
                    r14 = 0
                    goto L_0x010e
                L_0x01a2:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f4574b     // Catch:{ all -> 0x01d2 }
                    boolean r0 = r0.mo15989h()     // Catch:{ all -> 0x01d2 }
                    if (r0 == 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    java.io.File r0 = r0.f4576d     // Catch:{ all -> 0x01d2 }
                    long r3 = r0.length()     // Catch:{ all -> 0x01d2 }
                    int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    r0.m5228d()     // Catch:{ all -> 0x01d2 }
                L_0x01c1:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo17419c()     // Catch:{ all -> 0x01d2 }
                    r0.m5219a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r3, (int) r4)     // Catch:{ all -> 0x01d2 }
                    r6 = r8
                    goto L_0x01f9
                L_0x01d2:
                    r0 = move-exception
                    goto L_0x00f5
                L_0x01d5:
                    r0 = move-exception
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0247
                L_0x01da:
                    r0 = move-exception
                    r23 = r8
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0246
                L_0x01e1:
                    r0 = move-exception
                    r23 = r8
                    goto L_0x0243
                L_0x01e5:
                    r23 = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b     // Catch:{ all -> 0x0242 }
                    java.lang.String r4 = "Network link failed."
                    r5 = 601(0x259, float:8.42E-43)
                    r0.m5220a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0240 }
                    r6 = 0
                    r7 = 0
                    r15 = 0
                L_0x01f9:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    java.lang.String r2 = r2.mo15991j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    int r2 = r2.mo15973b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0236:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f4574b
                    com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2286c.m5237a(r0)
                    goto L_0x02a3
                L_0x0240:
                    r0 = move-exception
                    goto L_0x0245
                L_0x0242:
                    r0 = move-exception
                L_0x0243:
                    r5 = 601(0x259, float:8.42E-43)
                L_0x0245:
                    r6 = 0
                L_0x0246:
                    r7 = 0
                L_0x0247:
                    r8 = 0
                L_0x0248:
                    r0.printStackTrace()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x02a4 }
                    r3.m5226c()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r4 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.api.c.c r4 = r4.f4574b     // Catch:{ all -> 0x02a4 }
                    if (r2 == 0) goto L_0x025e
                    int r5 = r24.mo17419c()     // Catch:{ all -> 0x02a4 }
                L_0x025e:
                    java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02a4 }
                    r3.m5220a((com.bykv.p054vk.openvk.component.video.api.p071c.C2401c) r4, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r0.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    java.lang.String r2 = r2.mo15991j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    int r2 = r2.mo15973b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0236
                L_0x02a3:
                    return
                L_0x02a4:
                    r0 = move-exception
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r3.m5221a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r3.m5221a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r3.m5221a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    r3.m5221a((java.io.Closeable) r2)
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r3 = 0
                    r2[r3] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b
                    java.lang.String r3 = r3.mo15991j()
                    r4 = 1
                    r2[r4] = r3
                    r3 = 2
                    r2[r3] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f4574b
                    int r3 = r3.mo15973b()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 3
                    r2[r4] = r3
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r12, (java.lang.Object[]) r2)
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f4574b
                    com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2286c.m5237a(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b.C22851.mo15673a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5221a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public C2401c mo15676a() {
        return this.f4574b;
    }

    /* renamed from: a */
    public void mo15678a(boolean z) {
        this.f4575c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5219a(C2401c cVar, int i) {
        synchronized (C2410a.C2411a.class) {
            for (C2410a.C2411a next : this.f4578f) {
                if (next != null) {
                    next.mo16067a(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5220a(C2401c cVar, int i, String str) {
        synchronized (C2410a.C2411a.class) {
            for (C2410a.C2411a next : this.f4578f) {
                if (next != null) {
                    next.mo16068a(cVar, i, str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5225b(C2401c cVar, int i) {
        synchronized (C2410a.C2411a.class) {
            for (C2410a.C2411a next : this.f4578f) {
                if (next != null) {
                    next.mo16069b(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5226c() {
        try {
            this.f4577e.delete();
            this.f4576d.delete();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5228d() {
        try {
            if (!this.f4576d.renameTo(this.f4577e)) {
                throw new IOException("Error renaming file " + this.f4576d + " to " + this.f4577e + " for completion!");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C2415c.m5831b("VideoPreload", th.getMessage());
        }
    }
}
