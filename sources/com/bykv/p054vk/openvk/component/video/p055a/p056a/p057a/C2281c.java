package com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a;

import android.content.Context;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2393c;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a.c */
/* compiled from: VideoCacheImpl */
public class C2281c implements C2280b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile long f4562a = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f4563b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public File f4564c;

    /* renamed from: d */
    private File f4565d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f4566e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile long f4567f = -1;

    /* renamed from: g */
    private volatile boolean f4568g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f4569h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RandomAccessFile f4570i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2401c f4571j;

    public C2281c(Context context, C2401c cVar) {
        this.f4571j = cVar;
        try {
            this.f4564c = C2393c.m5619b(cVar.mo15966a(), cVar.mo15992k());
            this.f4565d = C2393c.m5620c(cVar.mo15966a(), cVar.mo15992k());
            if (m5200d()) {
                this.f4570i = new RandomAccessFile(this.f4565d, CampaignEx.JSON_KEY_AD_R);
            } else {
                this.f4570i = new RandomAccessFile(this.f4564c, "rw");
            }
            if (!m5200d()) {
                this.f4566e = this.f4564c.length();
                mo15672c();
            }
        } catch (Throwable unused) {
            C2415c.m5833b("VideoCacheImpl", "Error using file ", cVar.mo15991j(), " as disc cache");
        }
    }

    /* renamed from: d */
    private boolean m5200d() {
        return this.f4565d.exists();
    }

    /* renamed from: c */
    public void mo15672c() {
        C2743i.C2744a aVar;
        if (C2397b.m5672e() != null) {
            aVar = C2397b.m5672e().mo17496b();
        } else {
            aVar = new C2743i.C2744a();
        }
        aVar.mo17497a((long) this.f4571j.mo15994m(), TimeUnit.MILLISECONDS).mo17500b((long) this.f4571j.mo15995n(), TimeUnit.MILLISECONDS).mo17501c((long) this.f4571j.mo15996o(), TimeUnit.MILLISECONDS);
        C2743i a = aVar.mo17499a();
        C2415c.m5833b("VideoCacheImpl", "RANGE, bytes=", Long.valueOf(this.f4566e), " file hash=", this.f4571j.mo15992k());
        C2746k.C2747a aVar2 = new C2746k.C2747a();
        a.mo17398a(aVar2.mo17517a("RANGE", "bytes=" + this.f4566e + "-").mo17516a(this.f4571j.mo15991j()).mo17511a().mo17519b()).mo17391a(new C2734c() {
            /* renamed from: a */
            public void mo15674a(C2724b bVar, IOException iOException) {
                boolean unused = C2281c.this.f4569h = false;
                long unused2 = C2281c.this.f4562a = -1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:113:0x0158 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x012e A[Catch:{ all -> 0x01be }] */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x021a A[SYNTHETIC, Splitter:B:79:0x021a] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0222 A[Catch:{ all -> 0x021e }] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x0227 A[Catch:{ all -> 0x021e }] */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x0246 A[Catch:{ all -> 0x021e }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo15673a(com.bytedance.sdk.component.p102b.p103a.C2724b r24, com.bytedance.sdk.component.p102b.p103a.C2750m r25) throws java.io.IOException {
                /*
                    r23 = this;
                    r1 = r23
                    r2 = 0
                    if (r25 == 0) goto L_0x028a
                    r3 = 0
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0203 }
                    boolean r4 = r25.mo17421d()     // Catch:{ all -> 0x0203 }
                    boolean unused = r0.f4569h = r4     // Catch:{ all -> 0x0203 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0203 }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x0203 }
                    if (r0 == 0) goto L_0x01c0
                    com.bytedance.sdk.component.b.a.n r4 = r25.mo17423f()     // Catch:{ all -> 0x0203 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x01be }
                    if (r0 == 0) goto L_0x0039
                    if (r4 == 0) goto L_0x0039
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r5 = r4.mo17427a()     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r7 = r7.f4566e     // Catch:{ all -> 0x01be }
                    long r5 = r5 + r7
                    long unused = r0.f4562a = r5     // Catch:{ all -> 0x01be }
                    java.io.InputStream r3 = r4.mo17429c()     // Catch:{ all -> 0x01be }
                L_0x0039:
                    if (r3 != 0) goto L_0x0073
                    if (r3 == 0) goto L_0x0043
                    r3.close()     // Catch:{ all -> 0x0041 }
                    goto L_0x0043
                L_0x0041:
                    r0 = move-exception
                    goto L_0x006f
                L_0x0043:
                    if (r4 == 0) goto L_0x0048
                    r4.close()     // Catch:{ all -> 0x0041 }
                L_0x0048:
                    if (r25 == 0) goto L_0x004d
                    r25.close()     // Catch:{ all -> 0x0041 }
                L_0x004d:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0041 }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x0041 }
                    if (r0 == 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0041 }
                    java.io.File r0 = r0.f4564c     // Catch:{ all -> 0x0041 }
                    long r2 = r0.length()     // Catch:{ all -> 0x0041 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0041 }
                    long r4 = r0.f4562a     // Catch:{ all -> 0x0041 }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0041 }
                    r0.m5204f()     // Catch:{ all -> 0x0041 }
                    goto L_0x0072
                L_0x006f:
                    r0.printStackTrace()
                L_0x0072:
                    return
                L_0x0073:
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r5 = r5.f4566e     // Catch:{ all -> 0x01be }
                    r7 = 0
                    r9 = r2
                    r10 = r7
                L_0x0081:
                    int r12 = 8192 - r9
                    int r12 = r3.read(r0, r9, r12)     // Catch:{ all -> 0x01be }
                    r13 = -1
                    r15 = 8
                    r16 = 7
                    r17 = 6
                    r18 = 5
                    r19 = 4
                    r20 = 3
                    r21 = 2
                    r14 = 10
                    r22 = 1
                    if (r12 == r13) goto L_0x015c
                    int r9 = r9 + r12
                    long r12 = (long) r12     // Catch:{ all -> 0x01be }
                    long r10 = r10 + r12
                    r12 = 8192(0x2000, double:4.0474E-320)
                    long r12 = r10 % r12
                    int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                    if (r12 == 0) goto L_0x00bb
                    com.bykv.vk.openvk.component.video.a.a.a.c r12 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r12 = r12.f4562a     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r7 = r7.f4566e     // Catch:{ all -> 0x01be }
                    long r12 = r12 - r7
                    int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r7 != 0) goto L_0x00b9
                    goto L_0x00bb
                L_0x00b9:
                    r7 = r2
                    goto L_0x00bd
                L_0x00bb:
                    r7 = r22
                L_0x00bd:
                    java.lang.String r8 = "VideoCacheImpl"
                    r12 = 14
                    java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = "Write segment,execAppend ="
                    r12[r2] = r13     // Catch:{ all -> 0x01be }
                    java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01be }
                    r12[r22] = r13     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = " offset="
                    r12[r21] = r13     // Catch:{ all -> 0x01be }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01be }
                    r12[r20] = r13     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = " totalLength = "
                    r12[r19] = r13     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r19 = r13.f4562a     // Catch:{ all -> 0x01be }
                    java.lang.Long r13 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x01be }
                    r12[r18] = r13     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = " saveSize ="
                    r12[r17] = r13     // Catch:{ all -> 0x01be }
                    java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01be }
                    r12[r16] = r13     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = " startSaved="
                    r12[r15] = r13     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r15 = r13.f4566e     // Catch:{ all -> 0x01be }
                    java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01be }
                    r15 = 9
                    r12[r15] = r13     // Catch:{ all -> 0x01be }
                    java.lang.String r13 = " fileHash="
                    r12[r14] = r13     // Catch:{ all -> 0x01be }
                    r13 = 11
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.f4571j     // Catch:{ all -> 0x01be }
                    java.lang.String r14 = r14.mo15992k()     // Catch:{ all -> 0x01be }
                    r12[r13] = r14     // Catch:{ all -> 0x01be }
                    r13 = 12
                    java.lang.String r14 = " url="
                    r12[r13] = r14     // Catch:{ all -> 0x01be }
                    r13 = 13
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.f4571j     // Catch:{ all -> 0x01be }
                    java.lang.String r14 = r14.mo15991j()     // Catch:{ all -> 0x01be }
                    r12[r13] = r14     // Catch:{ all -> 0x01be }
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r8, (java.lang.Object[]) r12)     // Catch:{ all -> 0x01be }
                    if (r7 == 0) goto L_0x0158
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    java.lang.Object r7 = r7.f4563b     // Catch:{ all -> 0x01be }
                    monitor-enter(r7)     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0155 }
                    java.io.RandomAccessFile r8 = r8.f4570i     // Catch:{ all -> 0x0155 }
                    java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0155 }
                    int r12 = r12.intValue()     // Catch:{ all -> 0x0155 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0155 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f4571j     // Catch:{ all -> 0x0155 }
                    java.lang.String r13 = r13.mo15992k()     // Catch:{ all -> 0x0155 }
                    com.bykv.p054vk.openvk.component.video.p055a.p068e.C2393c.m5618a(r8, r0, r12, r9, r13)     // Catch:{ all -> 0x0155 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0155 }
                    long r7 = (long) r9     // Catch:{ all -> 0x0155 }
                    long r5 = r5 + r7
                    r9 = r2
                    goto L_0x0158
                L_0x0155:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch:{ all -> 0x0155 }
                    throw r0     // Catch:{ all -> 0x01be }
                L_0x0158:
                    r7 = 0
                    goto L_0x0081
                L_0x015c:
                    java.lang.String r0 = "VideoCacheImpl"
                    java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = "Write segment,Write over, startIndex ="
                    r5[r2] = r6     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r6 = r6.f4566e     // Catch:{ all -> 0x01be }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
                    r5[r22] = r6     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = " totalLength = "
                    r5[r21] = r6     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r6 = r6.f4562a     // Catch:{ all -> 0x01be }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
                    r5[r20] = r6     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = " saveSize = "
                    r5[r19] = r6     // Catch:{ all -> 0x01be }
                    java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01be }
                    r5[r18] = r6     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = " writeEndSegment ="
                    r5[r17] = r6     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r6 = r6.f4562a     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    long r8 = r8.f4566e     // Catch:{ all -> 0x01be }
                    long r6 = r6 - r8
                    int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                    if (r6 != 0) goto L_0x01a0
                    goto L_0x01a2
                L_0x01a0:
                    r22 = r2
                L_0x01a2:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x01be }
                    r5[r16] = r6     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = " url="
                    r5[r15] = r6     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x01be }
                    com.bykv.vk.openvk.component.video.api.c.c r6 = r6.f4571j     // Catch:{ all -> 0x01be }
                    java.lang.String r6 = r6.mo15991j()     // Catch:{ all -> 0x01be }
                    r7 = 9
                    r5[r7] = r6     // Catch:{ all -> 0x01be }
                    com.bykv.p054vk.openvk.component.video.api.p074f.C2415c.m5833b((java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ all -> 0x01be }
                    goto L_0x01d1
                L_0x01be:
                    r0 = move-exception
                    goto L_0x0205
                L_0x01c0:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0203 }
                    boolean unused = r0.f4569h = r2     // Catch:{ all -> 0x0203 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0203 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r4 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0203 }
                    long r4 = r4.f4567f     // Catch:{ all -> 0x0203 }
                    long unused = r0.f4562a = r4     // Catch:{ all -> 0x0203 }
                    r4 = r3
                L_0x01d1:
                    if (r3 == 0) goto L_0x01d6
                    r3.close()     // Catch:{ all -> 0x021e }
                L_0x01d6:
                    if (r4 == 0) goto L_0x01db
                    r4.close()     // Catch:{ all -> 0x021e }
                L_0x01db:
                    if (r25 == 0) goto L_0x01e0
                    r25.close()     // Catch:{ all -> 0x021e }
                L_0x01e0:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x021e }
                    if (r0 == 0) goto L_0x0298
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    java.io.File r0 = r0.f4564c     // Catch:{ all -> 0x021e }
                    long r2 = r0.length()     // Catch:{ all -> 0x021e }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    long r4 = r0.f4562a     // Catch:{ all -> 0x021e }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0298
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    r0.m5204f()     // Catch:{ all -> 0x021e }
                    goto L_0x0298
                L_0x0203:
                    r0 = move-exception
                    r4 = r3
                L_0x0205:
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0250 }
                    boolean unused = r5.f4569h = r2     // Catch:{ all -> 0x0250 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r2 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0250 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0250 }
                    long r5 = r5.f4567f     // Catch:{ all -> 0x0250 }
                    long unused = r2.f4562a = r5     // Catch:{ all -> 0x0250 }
                    r0.printStackTrace()     // Catch:{ all -> 0x0250 }
                    if (r3 == 0) goto L_0x0220
                    r3.close()     // Catch:{ all -> 0x021e }
                    goto L_0x0220
                L_0x021e:
                    r0 = move-exception
                    goto L_0x024c
                L_0x0220:
                    if (r4 == 0) goto L_0x0225
                    r4.close()     // Catch:{ all -> 0x021e }
                L_0x0225:
                    if (r25 == 0) goto L_0x022a
                    r25.close()     // Catch:{ all -> 0x021e }
                L_0x022a:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x021e }
                    if (r0 == 0) goto L_0x0298
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    java.io.File r0 = r0.f4564c     // Catch:{ all -> 0x021e }
                    long r2 = r0.length()     // Catch:{ all -> 0x021e }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    long r4 = r0.f4562a     // Catch:{ all -> 0x021e }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0298
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x021e }
                    r0.m5204f()     // Catch:{ all -> 0x021e }
                    goto L_0x0298
                L_0x024c:
                    r0.printStackTrace()
                    goto L_0x0298
                L_0x0250:
                    r0 = move-exception
                    r2 = r0
                    if (r3 == 0) goto L_0x025a
                    r3.close()     // Catch:{ all -> 0x0258 }
                    goto L_0x025a
                L_0x0258:
                    r0 = move-exception
                    goto L_0x0286
                L_0x025a:
                    if (r4 == 0) goto L_0x025f
                    r4.close()     // Catch:{ all -> 0x0258 }
                L_0x025f:
                    if (r25 == 0) goto L_0x0264
                    r25.close()     // Catch:{ all -> 0x0258 }
                L_0x0264:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0258 }
                    boolean r0 = r0.f4569h     // Catch:{ all -> 0x0258 }
                    if (r0 == 0) goto L_0x0289
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0258 }
                    java.io.File r0 = r0.f4564c     // Catch:{ all -> 0x0258 }
                    long r3 = r0.length()     // Catch:{ all -> 0x0258 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0258 }
                    long r5 = r0.f4562a     // Catch:{ all -> 0x0258 }
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 != 0) goto L_0x0289
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this     // Catch:{ all -> 0x0258 }
                    r0.m5204f()     // Catch:{ all -> 0x0258 }
                    goto L_0x0289
                L_0x0286:
                    r0.printStackTrace()
                L_0x0289:
                    throw r2
                L_0x028a:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this
                    boolean unused = r0.f4569h = r2
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.this
                    long r2 = r0.f4567f
                    long unused = r0.f4562a = r2
                L_0x0298:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c.C22821.mo15673a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* renamed from: a */
    public int mo15669a(long j, byte[] bArr, int i, int i2) throws IOException {
        long j2 = j;
        try {
            if (j2 == this.f4562a) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.f4568g) {
                synchronized (this.f4563b) {
                    long e = m5201e();
                    if (j2 < e) {
                        C2415c.m5831b("VideoCacheImpl", "read:  read " + j2 + " success");
                        this.f4570i.seek(j2);
                        i4 = this.f4570i.read(bArr, i, i2);
                    } else {
                        byte[] bArr2 = bArr;
                        int i5 = i;
                        int i6 = i2;
                        C2415c.m5833b("VideoCacheImpl", "read: wait at ", Long.valueOf(j), "  file size = ", Long.valueOf(e));
                        i3 += 33;
                        this.f4563b.wait(33);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    /* renamed from: a */
    public void mo15670a() {
        try {
            if (!this.f4568g) {
                this.f4570i.close();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f4568g = true;
        return;
    }

    /* renamed from: e */
    private long m5201e() {
        if (m5200d()) {
            return this.f4565d.length();
        }
        return this.f4564c.length();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5204f() throws IOException {
        synchronized (this.f4563b) {
            if (m5200d()) {
                C2415c.m5833b("VideoCacheImpl", "complete: isCompleted ", this.f4571j.mo15991j(), this.f4571j.mo15992k());
                return;
            }
            try {
                if (this.f4564c.renameTo(this.f4565d)) {
                    if (this.f4570i != null) {
                        this.f4570i.close();
                    }
                    this.f4570i = new RandomAccessFile(this.f4565d, "rw");
                    C2415c.m5833b("VideoCacheImpl", "complete: rename ", this.f4571j.mo15992k(), this.f4571j.mo15991j());
                    return;
                }
                throw new IOException("Error renaming file " + this.f4564c + " to " + this.f4565d + " for completion!");
            } catch (Throwable th) {
                th.printStackTrace();
                C2415c.m5831b("VideoCacheImpl", th.getMessage());
            }
        }
    }

    /* renamed from: b */
    public long mo15671b() throws IOException {
        if (m5200d()) {
            this.f4562a = this.f4565d.length();
        } else {
            synchronized (this.f4563b) {
                int i = 0;
                do {
                    if (this.f4562a == -2147483648L) {
                        try {
                            C2415c.m5831b("VideoCacheImpl", "totalLength: wait");
                            i += 15;
                            this.f4563b.wait(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i <= 20000);
                return -1;
            }
        }
        C2415c.m5833b("VideoCacheImpl", "totalLength= ", Long.valueOf(this.f4562a));
        return this.f4562a;
    }
}
