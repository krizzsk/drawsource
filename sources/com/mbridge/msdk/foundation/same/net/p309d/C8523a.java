package com.mbridge.msdk.foundation.same.net.p309d;

import com.mbridge.msdk.foundation.same.net.C8554i;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import java.io.File;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.a */
/* compiled from: FileDownloadRequest */
public class C8523a extends C8554i<Void> {

    /* renamed from: c */
    private static final String f20886c = C8523a.class.getSimpleName();

    /* renamed from: d */
    private File f20887d;

    /* renamed from: e */
    private File f20888e;

    /* renamed from: g */
    public final int mo57948g() {
        return 1;
    }

    public C8523a(File file, String str) {
        super(0, str);
        this.f20887d = file;
        this.f20888e = new File(file + ".tmp");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8557k<Void> mo57946a(C8535c cVar) {
        if (mo57997c()) {
            return C8557k.m24540a(new C8508a(-2, cVar));
        }
        if (!this.f20888e.canRead() || this.f20888e.length() <= 0) {
            return C8557k.m24540a(new C8508a(4, cVar));
        }
        if (this.f20888e.renameTo(this.f20887d)) {
            return C8557k.m24541a(null, cVar);
        }
        return C8557k.m24540a(new C8508a(4, cVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[SYNTHETIC, Splitter:B:44:0x00ab] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo57947a(com.mbridge.msdk.foundation.same.net.p310e.C8534b r14, com.mbridge.msdk.foundation.same.net.C8511c r15) throws java.io.IOException {
        /*
            r13 = this;
            java.util.List r0 = r14.mo57958b()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24454a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x001b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0027
            java.lang.String r5 = f20886c
            java.lang.String r6 = "Response doesn't present Content-Length!"
            com.mbridge.msdk.foundation.tools.C8672v.m24876b(r5, r6)
        L_0x0027:
            r10 = 0
            if (r4 <= 0) goto L_0x0043
            java.io.File r4 = r13.f20887d
            long r4 = r4.length()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            java.io.File r14 = r13.f20887d
            java.io.File r2 = r13.f20888e
            r14.renameTo(r2)
            r4 = r15
            r5 = r13
            r6 = r0
            r8 = r0
            r4.mo57925a(r5, r6, r8)
            return r10
        L_0x0043:
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile
            java.io.File r4 = r13.f20888e
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r5 = "rw"
            r11.<init>(r4, r5)
            r11.setLength(r2)
            java.io.InputStream r4 = r14.mo57959c()     // Catch:{ all -> 0x00a8 }
            java.util.List r14 = r14.mo57958b()     // Catch:{ all -> 0x00a5 }
            boolean r14 = com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24457b(r14)     // Catch:{ all -> 0x00a5 }
            if (r14 == 0) goto L_0x006b
            boolean r14 = r4 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00a5 }
            if (r14 != 0) goto L_0x006b
            java.util.zip.GZIPInputStream r14 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00a5 }
            r14.<init>(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x006c
        L_0x006b:
            r14 = r4
        L_0x006c:
            r4 = 6144(0x1800, float:8.61E-42)
            byte[] r12 = new byte[r4]     // Catch:{ all -> 0x00a1 }
        L_0x0070:
            int r4 = r14.read(r12)     // Catch:{ all -> 0x00a1 }
            r5 = -1
            if (r4 == r5) goto L_0x008d
            r5 = 0
            r11.write(r12, r5, r4)     // Catch:{ all -> 0x00a1 }
            long r4 = (long) r4     // Catch:{ all -> 0x00a1 }
            long r2 = r2 + r4
            r4 = r15
            r5 = r13
            r6 = r0
            r8 = r2
            r4.mo57925a(r5, r6, r8)     // Catch:{ all -> 0x00a1 }
            boolean r4 = r13.mo57997c()     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0070
            r15.mo57928b(r13)     // Catch:{ all -> 0x00a1 }
        L_0x008d:
            if (r14 == 0) goto L_0x009d
            r14.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x009d
        L_0x0093:
            r14 = move-exception
            java.lang.String r15 = f20886c
            java.lang.String r14 = r14.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r15, r14)
        L_0x009d:
            r11.close()
            return r10
        L_0x00a1:
            r15 = move-exception
            r10 = r14
            r14 = r15
            goto L_0x00a9
        L_0x00a5:
            r14 = move-exception
            r10 = r4
            goto L_0x00a9
        L_0x00a8:
            r14 = move-exception
        L_0x00a9:
            if (r10 == 0) goto L_0x00b9
            r10.close()     // Catch:{ Exception -> 0x00af }
            goto L_0x00b9
        L_0x00af:
            r15 = move-exception
            java.lang.String r0 = f20886c
            java.lang.String r15 = r15.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r15)
        L_0x00b9:
            r11.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p309d.C8523a.mo57947a(com.mbridge.msdk.foundation.same.net.e.b, com.mbridge.msdk.foundation.same.net.c):byte[]");
    }
}
