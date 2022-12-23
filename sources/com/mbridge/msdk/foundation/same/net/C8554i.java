package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p310e.C8534b;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.i */
/* compiled from: Request */
public abstract class C8554i<T> implements Comparable<C8554i<T>> {

    /* renamed from: c */
    private static final String f20997c = C8554i.class.getSimpleName();

    /* renamed from: a */
    protected ConcurrentHashMap<String, String> f20998a = new ConcurrentHashMap<>();

    /* renamed from: b */
    protected C8532e<T> f20999b = null;

    /* renamed from: d */
    private final int f21000d;

    /* renamed from: e */
    private final String f21001e;

    /* renamed from: f */
    private Integer f21002f;

    /* renamed from: g */
    private C8555j f21003g;

    /* renamed from: h */
    private boolean f21004h = false;

    /* renamed from: i */
    private C8558l f21005i;

    /* renamed from: j */
    private int f21006j = 2;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C8557k<T> mo57946a(C8535c cVar);

    /* renamed from: e */
    public byte[] mo57953e() {
        return null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C8554i iVar = (C8554i) obj;
        int g = mo57948g();
        int g2 = iVar.mo57948g();
        return g == g2 ? this.f21002f.intValue() - iVar.f21002f.intValue() : g2 - g;
    }

    public C8554i(int i, String str, C8532e<T> eVar) {
        this.f21001e = str;
        this.f21000d = i;
        this.f20999b = eVar;
        this.f21005i = new C8509b();
    }

    public C8554i(int i, String str) {
        this.f21001e = str;
        this.f21000d = i;
        this.f21005i = new C8509b();
    }

    /* renamed from: a */
    public final int mo57985a() {
        return this.f21000d;
    }

    /* renamed from: a */
    public final void mo57991a(C8532e<T> eVar) {
        this.f20999b = eVar;
    }

    /* renamed from: a */
    public final C8554i<?> mo57988a(C8558l lVar) {
        this.f21005i = lVar;
        return this;
    }

    /* renamed from: a */
    public final void mo57993a(String str) {
        C8555j jVar = this.f21003g;
        if (jVar != null) {
            jVar.mo58014b(this);
        }
    }

    /* renamed from: a */
    public final C8554i<?> mo57987a(C8555j jVar) {
        this.f21003g = jVar;
        return this;
    }

    /* renamed from: a */
    public final C8554i<?> mo57986a(int i) {
        this.f21002f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final String mo57995b() {
        return this.f21001e;
    }

    /* renamed from: c */
    public final boolean mo57997c() {
        return this.f21004h;
    }

    /* renamed from: d */
    public final Map<String, String> mo57999d() {
        return this.f20998a;
    }

    /* renamed from: f */
    public final void mo58000f() {
        mo57994a("Charset", "UTF-8");
        mo57994a("Connection", "close");
    }

    /* renamed from: a */
    public byte[] mo57947a(C8534b bVar, C8511c cVar) throws IOException, C8508a {
        return bVar.mo57959c() != null ? m24505a(bVar) : new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[SYNTHETIC, Splitter:B:37:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[Catch:{ IOException -> 0x0063 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m24505a(com.mbridge.msdk.foundation.same.net.p310e.C8534b r6) throws java.io.IOException, com.mbridge.msdk.foundation.same.net.p306a.C8508a {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r6.mo57959c()     // Catch:{ all -> 0x005b }
            java.util.List r6 = r6.mo57958b()     // Catch:{ all -> 0x0056 }
            boolean r6 = com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24457b(r6)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0019
            boolean r6 = r1 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x0019
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            r1 = r6
        L_0x0019:
            if (r1 == 0) goto L_0x004f
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0056 }
            r6.<init>()     // Catch:{ all -> 0x0056 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x004a }
        L_0x0024:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x004a }
            r3 = -1
            if (r2 == r3) goto L_0x0030
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ all -> 0x004a }
            goto L_0x0024
        L_0x0030:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0049
        L_0x0040:
            java.lang.String r1 = f20997c
            java.lang.String r6 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r6)
        L_0x0049:
            return r0
        L_0x004a:
            r0 = move-exception
            r4 = r1
            r1 = r6
            r6 = r0
            goto L_0x0059
        L_0x004f:
            com.mbridge.msdk.foundation.same.net.a.a r6 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x0056 }
            r2 = 7
            r6.<init>(r2, r0)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            r4 = r1
            r1 = r0
        L_0x0059:
            r0 = r4
            goto L_0x005d
        L_0x005b:
            r6 = move-exception
            r1 = r0
        L_0x005d:
            if (r0 == 0) goto L_0x0065
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r0 = move-exception
            goto L_0x006b
        L_0x0065:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0074
        L_0x006b:
            java.lang.String r1 = f20997c
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x0074:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.C8554i.m24505a(com.mbridge.msdk.foundation.same.net.e.b):byte[]");
    }

    /* renamed from: g */
    public int mo57948g() {
        return this.f21006j;
    }

    /* renamed from: b */
    public final void mo57996b(int i) {
        if (i >= 1 && i <= 4) {
            this.f21006j = i;
        }
    }

    /* renamed from: h */
    public final int mo58001h() {
        try {
            return this.f21005i.mo57918b();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: i */
    public final int mo58002i() {
        try {
            return this.f21005i.mo57920d();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: j */
    public final int mo58003j() {
        try {
            return this.f21005i.mo57921e();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: k */
    public final int mo58004k() {
        try {
            return this.f21005i.mo57922f();
        } catch (Exception unused) {
            return 10;
        }
    }

    /* renamed from: l */
    public final int mo58005l() {
        try {
            return this.f21005i.mo57923g();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: m */
    public final C8558l mo58006m() {
        return this.f21005i;
    }

    /* renamed from: a */
    public final void mo57992a(C8557k<T> kVar) {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57895a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo57990a(C8508a aVar) {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57894a(aVar);
        }
    }

    /* renamed from: n */
    public final void mo58007n() {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57952c();
        }
    }

    /* renamed from: o */
    public final void mo58008o() {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57951a();
        }
    }

    /* renamed from: p */
    public final void mo58009p() {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57896b();
        }
    }

    /* renamed from: q */
    public final void mo58010q() {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57955e();
        }
    }

    /* renamed from: r */
    public final void mo58011r() {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57954d();
        }
    }

    /* renamed from: a */
    public final void mo57989a(long j, long j2) {
        C8532e<T> eVar = this.f20999b;
        if (eVar != null) {
            eVar.mo57893a(j, j2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21004h ? "[X] " : "[ ] ");
        sb.append(this.f21001e);
        sb.append(" ");
        sb.append(mo57948g());
        sb.append(" ");
        sb.append(this.f21002f);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo57994a(String str, String str2) {
        this.f20998a.remove(str);
        this.f20998a.put(str, str2);
    }
}
