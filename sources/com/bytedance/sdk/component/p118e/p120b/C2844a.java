package com.bytedance.sdk.component.p118e.p120b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.google.common.net.HttpHeaders;
import com.inmobi.unification.sdk.InitializationStatus;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.b.a */
/* compiled from: DownloadExecutor */
public class C2844a extends C2848c {

    /* renamed from: a */
    public File f6364a;

    /* renamed from: b */
    public File f6365b;

    public C2844a(C2743i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public void mo17706a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f6364a = new File(str, str2);
        this.f6365b = new File(str, str2 + ".temp");
    }

    /* renamed from: a */
    public void mo17705a(final C2842a aVar) {
        File file = this.f6364a;
        if (file != null && this.f6365b != null) {
            final long j = 0;
            if (!file.exists() || this.f6364a.length() == 0 || aVar == null) {
                long length = this.f6365b.length();
                if (length >= 0) {
                    j = length;
                }
                C2746k.C2747a aVar2 = new C2746k.C2747a();
                aVar2.mo17515a((Object) mo17712b());
                mo17714b("Range", "bytes=" + j + "-");
                if (TextUtils.isEmpty(this.f6379f)) {
                    aVar.mo17694a((C2848c) this, new IOException("Url is Empty"));
                    return;
                }
                try {
                    aVar2.mo17516a(this.f6379f);
                    mo17710a(aVar2);
                    this.f6376c.mo17398a(aVar2.mo17511a().mo17519b()).mo17391a(new C2734c() {
                        /* renamed from: a */
                        public void mo15674a(C2724b bVar, IOException iOException) {
                            C2842a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo17694a((C2848c) C2844a.this, iOException);
                            }
                            C2844a.this.m7887d();
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:106:0x0288 A[Catch:{ all -> 0x029e, all -> 0x02a5, all -> 0x02ac }] */
                        /* JADX WARNING: Removed duplicated region for block: B:108:0x028f A[SYNTHETIC, Splitter:B:108:0x028f] */
                        /* JADX WARNING: Removed duplicated region for block: B:129:0x01bd A[EDGE_INSN: B:129:0x01bd->B:68:0x01bd ?: BREAK  , SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:55:0x0172 A[Catch:{ all -> 0x0266 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:70:0x01c4 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d2 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f0 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:84:0x0228 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:90:0x0257 A[SYNTHETIC, Splitter:B:90:0x0257] */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void mo15673a(com.bytedance.sdk.component.p102b.p103a.C2724b r29, com.bytedance.sdk.component.p102b.p103a.C2750m r30) throws java.io.IOException {
                            /*
                                r28 = this;
                                r1 = r28
                                java.lang.String r2 = "Error occured when calling tmpFile.close"
                                java.lang.String r3 = "Error occured when calling InputStream.close"
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                if (r0 == 0) goto L_0x02b8
                                java.util.HashMap r0 = new java.util.HashMap
                                r0.<init>()
                                if (r30 == 0) goto L_0x02b8
                                com.bytedance.sdk.component.b.a.e r4 = r30.mo17424g()
                                if (r4 == 0) goto L_0x002c
                                r5 = 0
                            L_0x0018:
                                int r6 = r4.mo17475a()
                                if (r5 >= r6) goto L_0x002c
                                java.lang.String r6 = r4.mo17476a(r5)
                                java.lang.String r7 = r4.mo17477b(r5)
                                r0.put(r6, r7)
                                int r5 = r5 + 1
                                goto L_0x0018
                            L_0x002c:
                                com.bytedance.sdk.component.e.b r15 = new com.bytedance.sdk.component.e.b
                                boolean r5 = r30.mo17421d()
                                int r6 = r30.mo17419c()
                                java.lang.String r7 = r30.mo17422e()
                                r9 = 0
                                long r10 = r30.mo17418b()
                                long r12 = r30.mo17415a()
                                r4 = r15
                                r8 = r0
                                r4.<init>(r5, r6, r7, r8, r9, r10, r12)
                                boolean r4 = r30.mo17421d()
                                if (r4 == 0) goto L_0x02b0
                                com.bytedance.sdk.component.b.a.n r4 = r30.mo17423f()
                                long r4 = r4.mo17427a()
                                r6 = 0
                                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                if (r8 > 0) goto L_0x0060
                                long r4 = com.bytedance.sdk.component.p118e.p120b.C2844a.m7889g(r0)
                            L_0x0060:
                                boolean r8 = com.bytedance.sdk.component.p118e.p120b.C2844a.m7888f(r0)
                                r9 = -1
                                if (r8 == 0) goto L_0x00d9
                                long r10 = r1
                                long r4 = r4 + r10
                                java.lang.String r10 = "Content-Range"
                                java.lang.Object r10 = r0.get(r10)
                                java.lang.String r10 = (java.lang.String) r10
                                boolean r11 = android.text.TextUtils.isEmpty(r10)
                                if (r11 != 0) goto L_0x00d9
                                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                                r11.<init>()
                                java.lang.String r12 = "bytes "
                                r11.append(r12)
                                long r12 = r1
                                r11.append(r12)
                                java.lang.String r12 = "-"
                                r11.append(r12)
                                r12 = 1
                                long r12 = r4 - r12
                                r11.append(r12)
                                java.lang.String r11 = r11.toString()
                                int r12 = android.text.TextUtils.indexOf(r10, r11)
                                if (r12 != r9) goto L_0x00d9
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                r0.m7887d()
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.IOException r3 = new java.io.IOException
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                r4.<init>()
                                java.lang.String r5 = "The Content-Range Header is invalid Assume["
                                r4.append(r5)
                                r4.append(r11)
                                java.lang.String r5 = "] vs Real["
                                r4.append(r5)
                                r4.append(r10)
                                java.lang.String r5 = "], please remove the temporary file ["
                                r4.append(r5)
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r5 = r5.f6365b
                                r4.append(r5)
                                java.lang.String r5 = "]."
                                r4.append(r5)
                                java.lang.String r4 = r4.toString()
                                r3.<init>(r4)
                                r0.mo17694a((com.bytedance.sdk.component.p118e.p120b.C2848c) r2, (java.io.IOException) r3)
                                return
                            L_0x00d9:
                                r10 = r4
                                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                                java.lang.String r5 = "Rename fail"
                                if (r4 <= 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r4 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r4 = r4.f6365b
                                boolean r4 = r4.exists()
                                if (r4 == 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r4 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r4 = r4.f6365b
                                long r12 = r4.length()
                                int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                                if (r4 != 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r0 = r0.f6365b
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r2 = r2.f6364a
                                boolean r0 = r0.renameTo(r2)
                                if (r0 == 0) goto L_0x011d
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                r6 = r10
                                r8 = r10
                                r10 = r0
                                r5.mo17704a(r6, r8, r10)
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.File r0 = r0.f6364a
                                r15.mo17696a(r0)
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                r0.mo17693a((com.bytedance.sdk.component.p118e.p120b.C2848c) r2, (com.bytedance.sdk.component.p118e.C2843b) r15)
                                goto L_0x0129
                            L_0x011d:
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                java.io.IOException r3 = new java.io.IOException
                                r3.<init>(r5)
                                r0.mo17694a((com.bytedance.sdk.component.p118e.p120b.C2848c) r2, (java.io.IOException) r3)
                            L_0x0129:
                                return
                            L_0x012a:
                                java.io.RandomAccessFile r12 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0146 }
                                com.bytedance.sdk.component.e.b.a r13 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x0146 }
                                java.io.File r13 = r13.f6365b     // Catch:{ all -> 0x0146 }
                                java.lang.String r4 = "rw"
                                r12.<init>(r13, r4)     // Catch:{ all -> 0x0146 }
                                if (r8 == 0) goto L_0x0140
                                r13 = r15
                                long r14 = r1     // Catch:{ all -> 0x0144 }
                                r12.seek(r14)     // Catch:{ all -> 0x0144 }
                                long r14 = r1     // Catch:{ all -> 0x0144 }
                                goto L_0x0149
                            L_0x0140:
                                r13 = r15
                                r12.setLength(r6)     // Catch:{ all -> 0x0144 }
                            L_0x0144:
                                r14 = r6
                                goto L_0x0149
                            L_0x0146:
                                r13 = r15
                                r12 = 0
                                goto L_0x0144
                            L_0x0149:
                                com.bytedance.sdk.component.b.a.n r16 = r30.mo17423f()     // Catch:{ all -> 0x026a }
                                java.io.InputStream r4 = r16.mo17429c()     // Catch:{ all -> 0x026a }
                                boolean r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.m7890h(r0)     // Catch:{ all -> 0x0266 }
                                if (r0 == 0) goto L_0x0161
                                boolean r0 = r4 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0266 }
                                if (r0 != 0) goto L_0x0161
                                java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0266 }
                                r0.<init>(r4)     // Catch:{ all -> 0x0266 }
                                r4 = r0
                            L_0x0161:
                                r0 = 16384(0x4000, float:2.2959E-41)
                                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0266 }
                                r18 = r6
                                r6 = 0
                            L_0x0168:
                                int r7 = 16384 - r6
                                int r7 = r4.read(r0, r6, r7)     // Catch:{ all -> 0x0266 }
                                r16 = 1
                                if (r7 == r9) goto L_0x01bd
                                int r6 = r6 + r7
                                r23 = r10
                                long r9 = (long) r7     // Catch:{ all -> 0x0266 }
                                long r9 = r18 + r9
                                r18 = 16384(0x4000, double:8.0948E-320)
                                long r18 = r9 % r18
                                r20 = 0
                                int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                                if (r7 == 0) goto L_0x0190
                                r7 = r2
                                r11 = r3
                                long r2 = r1     // Catch:{ all -> 0x01cf }
                                long r2 = r23 - r2
                                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                                if (r2 != 0) goto L_0x018d
                                goto L_0x0192
                            L_0x018d:
                                r16 = 0
                                goto L_0x0192
                            L_0x0190:
                                r7 = r2
                                r11 = r3
                            L_0x0192:
                                if (r16 == 0) goto L_0x019e
                                r12.seek(r14)     // Catch:{ all -> 0x01cf }
                                r2 = 0
                                r12.write(r0, r2, r6)     // Catch:{ all -> 0x01cf }
                                long r2 = (long) r6     // Catch:{ all -> 0x01cf }
                                long r14 = r14 + r2
                                r6 = 0
                            L_0x019e:
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                r3 = r13
                                r25 = r14
                                long r13 = r1     // Catch:{ all -> 0x01cf }
                                long r17 = r13 + r9
                                com.bytedance.sdk.component.e.a.a r13 = r14     // Catch:{ all -> 0x01cf }
                                r16 = r2
                                r19 = r23
                                r21 = r13
                                r16.mo17704a(r17, r19, r21)     // Catch:{ all -> 0x01cf }
                                r13 = r3
                                r2 = r7
                                r18 = r9
                                r3 = r11
                                r10 = r23
                                r14 = r25
                                r9 = -1
                                goto L_0x0168
                            L_0x01bd:
                                r7 = r2
                                r23 = r10
                                r11 = r3
                                r3 = r13
                                if (r8 != 0) goto L_0x01d2
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f6365b     // Catch:{ all -> 0x01cf }
                                long r9 = r0.length()     // Catch:{ all -> 0x01cf }
                                r25 = r9
                                goto L_0x01d4
                            L_0x01cf:
                                r0 = move-exception
                                goto L_0x026e
                            L_0x01d2:
                                r25 = r23
                            L_0x01d4:
                                r9 = 0
                                int r0 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
                                if (r0 <= 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f6365b     // Catch:{ all -> 0x01cf }
                                boolean r0 = r0.exists()     // Catch:{ all -> 0x01cf }
                                if (r0 == 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f6365b     // Catch:{ all -> 0x01cf }
                                long r9 = r0.length()     // Catch:{ all -> 0x01cf }
                                int r0 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
                                if (r0 != 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f6365b     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r2 = r2.f6364a     // Catch:{ all -> 0x01cf }
                                boolean r0 = r0.renameTo(r2)     // Catch:{ all -> 0x01cf }
                                if (r0 == 0) goto L_0x021b
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.a.a r2 = r14     // Catch:{ all -> 0x01cf }
                                r22 = r0
                                r23 = r25
                                r27 = r2
                                r22.mo17704a(r23, r25, r27)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f6364a     // Catch:{ all -> 0x01cf }
                                r2 = r3
                                r2.mo17696a(r0)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                r0.mo17693a((com.bytedance.sdk.component.p118e.p120b.C2848c) r3, (com.bytedance.sdk.component.p118e.C2843b) r2)     // Catch:{ all -> 0x01cf }
                                goto L_0x0255
                            L_0x021b:
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01cf }
                                r3.<init>(r5)     // Catch:{ all -> 0x01cf }
                                r0.mo17694a((com.bytedance.sdk.component.p118e.p120b.C2848c) r2, (java.io.IOException) r3)     // Catch:{ all -> 0x01cf }
                                goto L_0x0255
                            L_0x0228:
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01cf }
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
                                r5.<init>()     // Catch:{ all -> 0x01cf }
                                java.lang.String r6 = " tempFile.length() == fileSize is"
                                r5.append(r6)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r6 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r6 = r6.f6365b     // Catch:{ all -> 0x01cf }
                                long r9 = r6.length()     // Catch:{ all -> 0x01cf }
                                int r6 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
                                if (r6 != 0) goto L_0x0247
                                r14 = r16
                                goto L_0x0248
                            L_0x0247:
                                r14 = 0
                            L_0x0248:
                                r5.append(r14)     // Catch:{ all -> 0x01cf }
                                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01cf }
                                r3.<init>(r5)     // Catch:{ all -> 0x01cf }
                                r0.mo17694a((com.bytedance.sdk.component.p118e.p120b.C2848c) r2, (java.io.IOException) r3)     // Catch:{ all -> 0x01cf }
                            L_0x0255:
                                if (r4 == 0) goto L_0x025e
                                r4.close()     // Catch:{ all -> 0x025b }
                                goto L_0x025e
                            L_0x025b:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r11)
                            L_0x025e:
                                r12.close()     // Catch:{ all -> 0x0262 }
                                goto L_0x02b8
                            L_0x0262:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r7)
                                goto L_0x02b8
                            L_0x0266:
                                r0 = move-exception
                                r7 = r2
                                r11 = r3
                                goto L_0x026e
                            L_0x026a:
                                r0 = move-exception
                                r7 = r2
                                r11 = r3
                                r4 = 0
                            L_0x026e:
                                java.lang.String r2 = "Error occured when FileRequest.parseHttpResponse"
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ all -> 0x029e }
                                r0.printStackTrace()     // Catch:{ all -> 0x029e }
                                com.bytedance.sdk.component.e.a.a r2 = r14     // Catch:{ all -> 0x029e }
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x029e }
                                java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029e }
                                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x029e }
                                r5.<init>(r0)     // Catch:{ all -> 0x029e }
                                r2.mo17694a((com.bytedance.sdk.component.p118e.p120b.C2848c) r3, (java.io.IOException) r5)     // Catch:{ all -> 0x029e }
                                if (r8 != 0) goto L_0x028d
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.p118e.p120b.C2844a.this     // Catch:{ all -> 0x029e }
                                r0.m7887d()     // Catch:{ all -> 0x029e }
                            L_0x028d:
                                if (r4 == 0) goto L_0x0296
                                r4.close()     // Catch:{ all -> 0x0293 }
                                goto L_0x0296
                            L_0x0293:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r11)
                            L_0x0296:
                                r12.close()     // Catch:{ all -> 0x029a }
                                goto L_0x029d
                            L_0x029a:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r7)
                            L_0x029d:
                                return
                            L_0x029e:
                                r0 = move-exception
                                if (r4 == 0) goto L_0x02a8
                                r4.close()     // Catch:{ all -> 0x02a5 }
                                goto L_0x02a8
                            L_0x02a5:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r11)
                            L_0x02a8:
                                r12.close()     // Catch:{ all -> 0x02ac }
                                goto L_0x02af
                            L_0x02ac:
                                com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r7)
                            L_0x02af:
                                throw r0
                            L_0x02b0:
                                r2 = r15
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.p118e.p120b.C2844a.this
                                r0.mo17693a((com.bytedance.sdk.component.p118e.p120b.C2848c) r3, (com.bytedance.sdk.component.p118e.C2843b) r2)
                            L_0x02b8:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p120b.C2844a.C28451.mo15673a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
                        }
                    });
                } catch (IllegalArgumentException unused) {
                    aVar.mo17694a((C2848c) this, new IOException("Url is not a valid HTTP or HTTPS URL"));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                C2843b bVar = new C2843b(true, 200, InitializationStatus.SUCCESS, (Map<String, String>) null, (String) null, currentTimeMillis, currentTimeMillis);
                bVar.mo17696a(this.f6364a);
                aVar.mo17693a((C2848c) this, bVar);
            }
        } else if (aVar != null) {
            aVar.mo17694a((C2848c) this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:120|121|(1:123)(1:124)|125|(4:127|128|129|130)|131|132|133|134|177) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:135|138|139|140|(1:142)|(4:144|145|146|147)|148|149|150|151|179) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:102|103|104|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:112|113|114|115) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:127|128|129|130) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:144|145|146|147) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(4:112|113|114|115)|116|117|118|119|175) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:100|(4:102|103|104|105)|106|107|108|109|110) */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x024c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0253 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x025d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0265 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0294 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x029c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x02b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x02c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x02cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x02d3 */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026a A[SYNTHETIC, Splitter:B:120:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02af A[Catch:{ all -> 0x02c5, all -> 0x02cc, all -> 0x02d3, IOException -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b4 A[SYNTHETIC, Splitter:B:144:0x02b4] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0209 A[EDGE_INSN: B:171:0x0209->B:86:0x0209 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020e A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0216 A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021d A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0237 A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:150:0x02c0=Splitter:B:150:0x02c0, B:108:0x0253=Splitter:B:108:0x0253, B:160:0x02d3=Splitter:B:160:0x02d3, B:129:0x0294=Splitter:B:129:0x0294, B:118:0x0265=Splitter:B:118:0x0265, B:146:0x02b8=Splitter:B:146:0x02b8, B:104:0x024c=Splitter:B:104:0x024c, B:133:0x029c=Splitter:B:133:0x029c, B:156:0x02cc=Splitter:B:156:0x02cc, B:114:0x025d=Splitter:B:114:0x025d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.p118e.C2843b mo17703a() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "Error occured when calling tmpFile.close"
            java.lang.String r3 = "Error occured when calling InputStream.close"
            java.io.File r0 = r1.f6364a
            r4 = 0
            if (r0 == 0) goto L_0x02e8
            java.io.File r5 = r1.f6365b
            if (r5 != 0) goto L_0x0011
            goto L_0x02e8
        L_0x0011:
            boolean r0 = r0.exists()
            r5 = 0
            if (r0 == 0) goto L_0x003b
            java.io.File r0 = r1.f6364a
            long r7 = r0.length()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            long r15 = java.lang.System.currentTimeMillis()
            com.bytedance.sdk.component.e.b r0 = new com.bytedance.sdk.component.e.b
            r8 = 1
            r9 = 200(0xc8, float:2.8E-43)
            r11 = 0
            r12 = 0
            java.lang.String r10 = "Success"
            r7 = r0
            r13 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            java.io.File r2 = r1.f6364a
            r0.mo17696a(r2)
            return r0
        L_0x003b:
            java.io.File r0 = r1.f6365b
            long r7 = r0.length()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r7 = r5
        L_0x0046:
            com.bytedance.sdk.component.b.a.k$a r0 = new com.bytedance.sdk.component.b.a.k$a
            r0.<init>()
            java.lang.String r9 = r27.mo17712b()
            r0.mo17515a((java.lang.Object) r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "bytes="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = "-"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "Range"
            r1.mo17714b(r11, r9)
            java.lang.String r9 = r1.f6379f
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r11 = "DownloadExecutor"
            if (r9 == 0) goto L_0x007d
            java.lang.String r0 = "execute: Url is Empty"
            android.util.Log.e(r11, r0)
            return r4
        L_0x007d:
            java.lang.String r9 = r1.f6379f     // Catch:{ IllegalArgumentException -> 0x02e0 }
            r0.mo17516a((java.lang.String) r9)     // Catch:{ IllegalArgumentException -> 0x02e0 }
            r1.mo17710a((com.bytedance.sdk.component.p102b.p103a.C2746k.C2747a) r0)
            com.bytedance.sdk.component.b.a.k$a r0 = r0.mo17511a()
            com.bytedance.sdk.component.b.a.k r0 = r0.mo17519b()
            com.bytedance.sdk.component.b.a.i r9 = r1.f6376c     // Catch:{ IOException -> 0x02d7 }
            com.bytedance.sdk.component.b.a.b r0 = r9.mo17398a(r0)     // Catch:{ IOException -> 0x02d7 }
            com.bytedance.sdk.component.b.a.m r0 = r0.mo17389a()     // Catch:{ IOException -> 0x02d7 }
            if (r0 == 0) goto L_0x02de
            boolean r9 = r0.mo17421d()     // Catch:{ IOException -> 0x02d7 }
            if (r9 == 0) goto L_0x02de
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IOException -> 0x02d7 }
            r9.<init>()     // Catch:{ IOException -> 0x02d7 }
            com.bytedance.sdk.component.b.a.e r12 = r0.mo17424g()     // Catch:{ IOException -> 0x02d7 }
            if (r12 == 0) goto L_0x00bf
            r13 = 0
        L_0x00ab:
            int r14 = r12.mo17475a()     // Catch:{ IOException -> 0x02d7 }
            if (r13 >= r14) goto L_0x00bf
            java.lang.String r14 = r12.mo17476a(r13)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r15 = r12.mo17477b(r13)     // Catch:{ IOException -> 0x02d7 }
            r9.put(r14, r15)     // Catch:{ IOException -> 0x02d7 }
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x00bf:
            com.bytedance.sdk.component.e.b r15 = new com.bytedance.sdk.component.e.b     // Catch:{ IOException -> 0x02d7 }
            boolean r13 = r0.mo17421d()     // Catch:{ IOException -> 0x02d7 }
            int r14 = r0.mo17419c()     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r17 = r0.mo17422e()     // Catch:{ IOException -> 0x02d7 }
            r18 = 0
            long r19 = r0.mo17418b()     // Catch:{ IOException -> 0x02d7 }
            long r21 = r0.mo17415a()     // Catch:{ IOException -> 0x02d7 }
            r12 = r15
            r23 = r15
            r15 = r17
            r16 = r9
            r17 = r18
            r18 = r19
            r20 = r21
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x02d7 }
            com.bytedance.sdk.component.b.a.n r12 = r0.mo17423f()     // Catch:{ IOException -> 0x02d7 }
            long r12 = r12.mo17427a()     // Catch:{ IOException -> 0x02d7 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x00f7
            long r12 = m7889g(r9)     // Catch:{ IOException -> 0x02d7 }
        L_0x00f7:
            java.io.File r14 = r1.f6365b     // Catch:{ IOException -> 0x02d7 }
            long r14 = r14.length()     // Catch:{ IOException -> 0x02d7 }
            boolean r16 = m7888f(r9)     // Catch:{ IOException -> 0x02d7 }
            if (r16 == 0) goto L_0x0164
            long r12 = r12 + r14
            java.lang.String r6 = "Content-Range"
            java.lang.Object r6 = r9.get(r6)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x02d7 }
            boolean r19 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x02d7 }
            if (r19 != 0) goto L_0x0164
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d7 }
            r4.<init>()     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r5 = "bytes "
            r4.append(r5)     // Catch:{ IOException -> 0x02d7 }
            r4.append(r14)     // Catch:{ IOException -> 0x02d7 }
            r4.append(r10)     // Catch:{ IOException -> 0x02d7 }
            r14 = 1
            long r14 = r12 - r14
            r4.append(r14)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02d7 }
            int r5 = android.text.TextUtils.indexOf(r6, r4)     // Catch:{ IOException -> 0x02d7 }
            r10 = -1
            if (r5 != r10) goto L_0x0164
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d7 }
            r0.<init>()     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r2 = "execute: The Content-Range Header is invalid Assume["
            r0.append(r2)     // Catch:{ IOException -> 0x02d7 }
            r0.append(r4)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r2 = "] vs Real["
            r0.append(r2)     // Catch:{ IOException -> 0x02d7 }
            r0.append(r6)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r2 = "], please remove the temporary file ["
            r0.append(r2)     // Catch:{ IOException -> 0x02d7 }
            java.io.File r2 = r1.f6365b     // Catch:{ IOException -> 0x02d7 }
            r0.append(r2)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r2 = "]."
            r0.append(r2)     // Catch:{ IOException -> 0x02d7 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x02d7 }
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8004b(r11, r0)     // Catch:{ IOException -> 0x02d7 }
            r27.m7887d()     // Catch:{ IOException -> 0x02d7 }
            r2 = 0
            return r2
        L_0x0164:
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0195
            java.io.File r4 = r1.f6365b     // Catch:{ IOException -> 0x02d7 }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x02d7 }
            if (r4 == 0) goto L_0x0195
            java.io.File r4 = r1.f6365b     // Catch:{ IOException -> 0x02d7 }
            long r4 = r4.length()     // Catch:{ IOException -> 0x02d7 }
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0195
            java.io.File r0 = r1.f6365b     // Catch:{ IOException -> 0x02d7 }
            java.io.File r2 = r1.f6364a     // Catch:{ IOException -> 0x02d7 }
            boolean r0 = r0.renameTo(r2)     // Catch:{ IOException -> 0x02d7 }
            if (r0 == 0) goto L_0x018e
            java.io.File r0 = r1.f6364a     // Catch:{ IOException -> 0x02d7 }
            r4 = r23
            r4.mo17696a(r0)     // Catch:{ IOException -> 0x02d7 }
            return r4
        L_0x018e:
            java.lang.String r0 = "Rename fail"
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8004b(r11, r0)     // Catch:{ IOException -> 0x02d7 }
            r2 = 0
            return r2
        L_0x0195:
            r4 = r23
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01af }
            java.io.File r6 = r1.f6365b     // Catch:{ all -> 0x01af }
            java.lang.String r10 = "rw"
            r5.<init>(r6, r10)     // Catch:{ all -> 0x01af }
            if (r16 == 0) goto L_0x01a7
            r5.seek(r7)     // Catch:{ all -> 0x01ac }
            r14 = r7
            goto L_0x01b1
        L_0x01a7:
            r14 = 0
            r5.setLength(r14)     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r14 = 0
            goto L_0x01b1
        L_0x01af:
            r5 = 0
            goto L_0x01ac
        L_0x01b1:
            com.bytedance.sdk.component.b.a.n r0 = r0.mo17423f()     // Catch:{ all -> 0x02a3 }
            java.io.InputStream r6 = r0.mo17429c()     // Catch:{ all -> 0x02a3 }
            boolean r0 = m7890h(r9)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r6 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x01c9
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x02a1 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a1 }
            r6 = r0
        L_0x01c9:
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x02a1 }
            r9 = 0
            r21 = 0
        L_0x01d0:
            int r10 = 16384 - r9
            int r10 = r6.read(r0, r9, r10)     // Catch:{ all -> 0x02a1 }
            r23 = 1
            r24 = r11
            r11 = -1
            if (r10 == r11) goto L_0x0209
            int r9 = r9 + r10
            r25 = r12
            long r11 = (long) r10     // Catch:{ all -> 0x02a1 }
            long r21 = r21 + r11
            r10 = 16384(0x4000, double:8.0948E-320)
            long r10 = r21 % r10
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x01f6
            long r12 = r25 - r7
            int r10 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r23 = 0
        L_0x01f6:
            if (r23 == 0) goto L_0x0203
            r5.seek(r14)     // Catch:{ all -> 0x02a1 }
            r11 = 0
            r5.write(r0, r11, r9)     // Catch:{ all -> 0x02a1 }
            long r9 = (long) r9     // Catch:{ all -> 0x02a1 }
            long r14 = r14 + r9
            r9 = r11
            goto L_0x0204
        L_0x0203:
            r11 = 0
        L_0x0204:
            r11 = r24
            r12 = r25
            goto L_0x01d0
        L_0x0209:
            r25 = r12
            r11 = 0
            if (r10 == 0) goto L_0x0214
            r5.seek(r14)     // Catch:{ all -> 0x02a1 }
            r5.write(r0, r11, r9)     // Catch:{ all -> 0x02a1 }
        L_0x0214:
            if (r16 != 0) goto L_0x021d
            java.io.File r0 = r1.f6365b     // Catch:{ all -> 0x02a1 }
            long r12 = r0.length()     // Catch:{ all -> 0x02a1 }
            goto L_0x021f
        L_0x021d:
            r12 = r25
        L_0x021f:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
            java.io.File r0 = r1.f6365b     // Catch:{ all -> 0x02a1 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x026a
            java.io.File r0 = r1.f6365b     // Catch:{ all -> 0x02a1 }
            long r7 = r0.length()     // Catch:{ all -> 0x02a1 }
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x026a
            java.io.File r0 = r1.f6365b     // Catch:{ all -> 0x02a1 }
            java.io.File r7 = r1.f6364a     // Catch:{ all -> 0x02a1 }
            boolean r0 = r0.renameTo(r7)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x0257
            java.io.File r0 = r1.f6364a     // Catch:{ all -> 0x02a1 }
            r4.mo17696a(r0)     // Catch:{ all -> 0x02a1 }
            if (r6 == 0) goto L_0x024f
            r6.close()     // Catch:{ all -> 0x024c }
            goto L_0x024f
        L_0x024c:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r3)     // Catch:{ IOException -> 0x02d7 }
        L_0x024f:
            r5.close()     // Catch:{ all -> 0x0253 }
            goto L_0x0256
        L_0x0253:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ IOException -> 0x02d7 }
        L_0x0256:
            return r4
        L_0x0257:
            if (r6 == 0) goto L_0x0260
            r6.close()     // Catch:{ all -> 0x025d }
            goto L_0x0260
        L_0x025d:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r3)     // Catch:{ IOException -> 0x02d7 }
        L_0x0260:
            r5.close()     // Catch:{ all -> 0x0265 }
        L_0x0263:
            r2 = 0
            goto L_0x0269
        L_0x0265:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ IOException -> 0x02d7 }
            goto L_0x0263
        L_0x0269:
            return r2
        L_0x026a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a1 }
            r0.<init>()     // Catch:{ all -> 0x02a1 }
            java.lang.String r4 = " tempFile.length() == fileSize is"
            r0.append(r4)     // Catch:{ all -> 0x02a1 }
            java.io.File r4 = r1.f6365b     // Catch:{ all -> 0x02a1 }
            long r7 = r4.length()     // Catch:{ all -> 0x02a1 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0281
            r15 = r23
            goto L_0x0282
        L_0x0281:
            r15 = r11
        L_0x0282:
            r0.append(r15)     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02a1 }
            r4 = r24
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8004b(r4, r0)     // Catch:{ all -> 0x02a1 }
            if (r6 == 0) goto L_0x0297
            r6.close()     // Catch:{ all -> 0x0294 }
            goto L_0x0297
        L_0x0294:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r3)     // Catch:{ IOException -> 0x02d7 }
        L_0x0297:
            r5.close()     // Catch:{ all -> 0x029c }
        L_0x029a:
            r2 = 0
            goto L_0x02a0
        L_0x029c:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ IOException -> 0x02d7 }
            goto L_0x029a
        L_0x02a0:
            return r2
        L_0x02a1:
            r0 = move-exception
            goto L_0x02a5
        L_0x02a3:
            r0 = move-exception
            r6 = 0
        L_0x02a5:
            java.lang.String r4 = "Error occured when FileRequest.parseHttpResponse"
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r4)     // Catch:{ all -> 0x02c5 }
            r0.printStackTrace()     // Catch:{ all -> 0x02c5 }
            if (r16 != 0) goto L_0x02b2
            r27.m7887d()     // Catch:{ all -> 0x02c5 }
        L_0x02b2:
            if (r6 == 0) goto L_0x02bb
            r6.close()     // Catch:{ all -> 0x02b8 }
            goto L_0x02bb
        L_0x02b8:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r3)     // Catch:{ IOException -> 0x02d7 }
        L_0x02bb:
            r5.close()     // Catch:{ all -> 0x02c0 }
        L_0x02be:
            r2 = 0
            goto L_0x02c4
        L_0x02c0:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ IOException -> 0x02d7 }
            goto L_0x02be
        L_0x02c4:
            return r2
        L_0x02c5:
            r0 = move-exception
            if (r6 == 0) goto L_0x02cf
            r6.close()     // Catch:{ all -> 0x02cc }
            goto L_0x02cf
        L_0x02cc:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r3)     // Catch:{ IOException -> 0x02d7 }
        L_0x02cf:
            r5.close()     // Catch:{ all -> 0x02d3 }
            goto L_0x02d6
        L_0x02d3:
            com.bytedance.sdk.component.p118e.p122d.C2869d.m8001a(r2)     // Catch:{ IOException -> 0x02d7 }
        L_0x02d6:
            throw r0     // Catch:{ IOException -> 0x02d7 }
        L_0x02d7:
            r0 = move-exception
            r0.printStackTrace()
            r27.m7887d()
        L_0x02de:
            r2 = 0
            return r2
        L_0x02e0:
            r2 = r4
            r4 = r11
            java.lang.String r0 = "execute: Url is not a valid HTTP or HTTPS URL"
            android.util.Log.e(r4, r0)
            return r2
        L_0x02e8:
            r2 = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p120b.C2844a.mo17703a():com.bytedance.sdk.component.e.b");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m7888f(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        if (str == null || !str.startsWith("bytes")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static long m7889g(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m7890h(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17704a(long j, long j2, C2842a aVar) {
        if (aVar != null) {
            aVar.mo17692a(this, j, j2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7887d() {
        /*
            r1 = this;
            java.io.File r0 = r1.f6364a     // Catch:{ all -> 0x0005 }
            r0.delete()     // Catch:{ all -> 0x0005 }
        L_0x0005:
            java.io.File r0 = r1.f6365b     // Catch:{ all -> 0x000a }
            r0.delete()     // Catch:{ all -> 0x000a }
        L_0x000a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p120b.C2844a.m7887d():void");
    }
}
