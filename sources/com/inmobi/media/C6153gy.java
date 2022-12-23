package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gy */
/* compiled from: NetworkConnection */
class C6153gy {

    /* renamed from: a */
    protected static final String f15514a = C6153gy.class.getSimpleName();

    /* renamed from: b */
    protected C6156ha f15515b;

    /* renamed from: c */
    protected HttpURLConnection f15516c;

    public C6153gy(C6156ha haVar) {
        this.f15515b = haVar;
    }

    /* renamed from: a */
    public C6157hb mo35336a() {
        C6157hb hbVar;
        this.f15515b.mo34869a();
        if (!this.f15515b.f15536q) {
            C6157hb hbVar2 = new C6157hb();
            hbVar2.f15541a = new C6154gz(-8, "Network Request dropped as current request is not GDPR compliant.");
            return hbVar2;
        } else if (C6196id.m18389a()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f15515b.mo35345e()).openConnection();
                m18215a(httpURLConnection);
                this.f15516c = httpURLConnection;
                if (!this.f15515b.f15533n) {
                    this.f15516c.setInstanceFollowRedirects(false);
                }
                if (ShareTarget.METHOD_POST.equals(this.f15515b.f15529j)) {
                    String f = this.f15515b.mo35346f();
                    String str = this.f15515b.f15530k;
                    this.f15516c.setRequestProperty("Content-Length", Integer.toString(f.length()));
                    this.f15516c.setRequestProperty("Content-Type", str);
                    BufferedWriter bufferedWriter = null;
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(this.f15516c.getOutputStream()));
                        try {
                            bufferedWriter2.write(f);
                            C6196id.m18386a((Closeable) bufferedWriter2);
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            C6196id.m18386a((Closeable) bufferedWriter);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C6196id.m18386a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
                return mo35337b();
            } catch (IOException e) {
                hbVar = new C6157hb();
                hbVar.f15541a = new C6154gz(-2, e.getLocalizedMessage());
                return hbVar;
            } catch (Exception e2) {
                hbVar = new C6157hb();
                hbVar.f15541a = new C6154gz(-1, e2.getLocalizedMessage());
                return hbVar;
            }
        } else {
            C6157hb hbVar3 = new C6157hb();
            hbVar3.f15541a = new C6154gz(0, "Network not reachable currently. Please try again.");
            return hbVar3;
        }
    }

    /* renamed from: a */
    private void m18215a(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(this.f15515b.f15531l);
        httpURLConnection.setReadTimeout(this.f15515b.f15532m);
        httpURLConnection.setUseCaches(false);
        Map<String, String> d = this.f15515b.mo35343d();
        if (d != null) {
            for (String next : d.keySet()) {
                httpURLConnection.setRequestProperty(next, d.get(next));
            }
        }
        String str = this.f15515b.f15529j;
        httpURLConnection.setRequestMethod(str);
        if (!ShareTarget.METHOD_GET.equals(str)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-3, "OUT_OF_MEMORY_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.inmobi.media.C6196id.m18387a(r13.f15516c);
        r13.f15516c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-2, "NETWORK_IO_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        com.inmobi.media.C6196id.m18387a(r13.f15516c);
        r13.f15516c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(p405ms.p406bd.p407o.Pgl.C12600c.COLLECT_MODE_TIKTOK_GUEST, "HTTP_GATEWAY_TIMEOUT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.inmobi.media.C6196id.m18387a(r13.f15516c);
        r13.f15516c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0112, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.inmobi.media.C6196id.m18387a(r13.f15516c);
        r13.f15516c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0125, code lost:
        r1.f15541a = new com.inmobi.media.C6154gz(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012c, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:43:0x00ac, B:49:0x00c6, B:55:0x00e2, B:61:0x00fe] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.inmobi.media.C6157hb mo35337b() {
        /*
            r13 = this;
            java.lang.String r0 = "UNKNOWN_ERROR"
            com.inmobi.media.hb r1 = new com.inmobi.media.hb
            r1.<init>()
            r2 = -3
            r3 = -2
            r4 = 504(0x1f8, float:7.06E-43)
            r5 = -1
            java.net.HttpURLConnection r6 = r13.f15516c     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            int r6 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            if (r6 != r8) goto L_0x001c
            r13.m18214a(r1, r7)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            goto L_0x0095
        L_0x001c:
            r9 = 400(0x190, float:5.6E-43)
            r10 = -9
            r11 = 500(0x1f4, float:7.0E-43)
            r12 = -7
            if (r9 > r6) goto L_0x0029
            if (r11 <= r6) goto L_0x0029
        L_0x0027:
            r7 = r12
            goto L_0x0066
        L_0x0029:
            if (r8 >= r6) goto L_0x0030
            r8 = 300(0x12c, float:4.2E-43)
            if (r8 <= r6) goto L_0x0030
            goto L_0x0062
        L_0x0030:
            if (r6 == 0) goto L_0x0066
            switch(r6) {
                case -10: goto L_0x0064;
                case -9: goto L_0x0062;
                case -8: goto L_0x0060;
                case -7: goto L_0x0027;
                case -6: goto L_0x005e;
                case -5: goto L_0x005c;
                case -4: goto L_0x005a;
                case -3: goto L_0x0058;
                case -2: goto L_0x0056;
                default: goto L_0x0035;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0035:
            switch(r6) {
                case 302: goto L_0x0053;
                case 303: goto L_0x0050;
                case 304: goto L_0x004d;
                default: goto L_0x0038;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0038:
            switch(r6) {
                case 500: goto L_0x004b;
                case 501: goto L_0x0048;
                case 502: goto L_0x0045;
                case 503: goto L_0x0042;
                case 504: goto L_0x0040;
                case 505: goto L_0x003d;
                default: goto L_0x003b;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x003b:
            r7 = r5
            goto L_0x0066
        L_0x003d:
            r7 = 505(0x1f9, float:7.08E-43)
            goto L_0x0066
        L_0x0040:
            r7 = r4
            goto L_0x0066
        L_0x0042:
            r7 = 503(0x1f7, float:7.05E-43)
            goto L_0x0066
        L_0x0045:
            r7 = 502(0x1f6, float:7.03E-43)
            goto L_0x0066
        L_0x0048:
            r7 = 501(0x1f5, float:7.02E-43)
            goto L_0x0066
        L_0x004b:
            r7 = r11
            goto L_0x0066
        L_0x004d:
            r7 = 304(0x130, float:4.26E-43)
            goto L_0x0066
        L_0x0050:
            r7 = 303(0x12f, float:4.25E-43)
            goto L_0x0066
        L_0x0053:
            r7 = 302(0x12e, float:4.23E-43)
            goto L_0x0066
        L_0x0056:
            r7 = r3
            goto L_0x0066
        L_0x0058:
            r7 = r2
            goto L_0x0066
        L_0x005a:
            r7 = -4
            goto L_0x0066
        L_0x005c:
            r7 = -5
            goto L_0x0066
        L_0x005e:
            r7 = -6
            goto L_0x0066
        L_0x0060:
            r7 = -8
            goto L_0x0066
        L_0x0062:
            r7 = r10
            goto L_0x0066
        L_0x0064:
            r7 = -10
        L_0x0066:
            if (r7 != r12) goto L_0x007c
            r6 = 1
            r13.m18214a(r1, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = r1.mo35350b()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = m18213a((java.lang.String) r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            com.inmobi.media.gz r8 = new com.inmobi.media.gz     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r8.<init>(r7, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f15541a = r8     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            goto L_0x0095
        L_0x007c:
            com.inmobi.media.gz r8 = new com.inmobi.media.gz     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r9 = "HTTP:"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = r9.concat(r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r8.<init>(r7, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f15541a = r8     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.net.HttpURLConnection r6 = r13.f15516c     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.util.Map r6 = r6.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f15543c = r6     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0095:
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00a1 }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00a1 }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00a1 }
            r2.disconnect()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0119
        L_0x00a1:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz
            r2.<init>(r5, r0)
            r1.f15541a = r2
            goto L_0x0119
        L_0x00aa:
            r2 = move-exception
            goto L_0x011a
        L_0x00ac:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz     // Catch:{ all -> 0x00aa }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x00aa }
            r1.f15541a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00be }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00be }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00be }
            r2.disconnect()     // Catch:{ Exception -> 0x00be }
            goto L_0x0119
        L_0x00be:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz
            r2.<init>(r5, r0)
            r1.f15541a = r2
            goto L_0x0119
        L_0x00c6:
            com.inmobi.media.gz r3 = new com.inmobi.media.gz     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "OUT_OF_MEMORY_ERROR"
            r3.<init>(r2, r4)     // Catch:{ all -> 0x00aa }
            r1.f15541a = r3     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00da }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00da }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00da }
            r2.disconnect()     // Catch:{ Exception -> 0x00da }
            goto L_0x0119
        L_0x00da:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz
            r2.<init>(r5, r0)
            r1.f15541a = r2
            goto L_0x0119
        L_0x00e2:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "NETWORK_IO_ERROR"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00aa }
            r1.f15541a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00f6 }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00f6 }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x00f6 }
            r2.disconnect()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x0119
        L_0x00f6:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz
            r2.<init>(r5, r0)
            r1.f15541a = r2
            goto L_0x0119
        L_0x00fe:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "HTTP_GATEWAY_TIMEOUT"
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00aa }
            r1.f15541a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x0112 }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x0112 }
            java.net.HttpURLConnection r2 = r13.f15516c     // Catch:{ Exception -> 0x0112 }
            r2.disconnect()     // Catch:{ Exception -> 0x0112 }
            goto L_0x0119
        L_0x0112:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz
            r2.<init>(r5, r0)
            r1.f15541a = r2
        L_0x0119:
            return r1
        L_0x011a:
            java.net.HttpURLConnection r3 = r13.f15516c     // Catch:{ Exception -> 0x0125 }
            com.inmobi.media.C6196id.m18387a((java.net.HttpURLConnection) r3)     // Catch:{ Exception -> 0x0125 }
            java.net.HttpURLConnection r3 = r13.f15516c     // Catch:{ Exception -> 0x0125 }
            r3.disconnect()     // Catch:{ Exception -> 0x0125 }
            goto L_0x012c
        L_0x0125:
            com.inmobi.media.gz r3 = new com.inmobi.media.gz
            r3.<init>(r5, r0)
            r1.f15541a = r3
        L_0x012c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6153gy.mo35337b():com.inmobi.media.hb");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m18214a(C6157hb hbVar, boolean z) throws IOException {
        if (!this.f15515b.mo35342c() || ((long) this.f15516c.getContentLength()) <= this.f15515b.f15535p) {
            InputStream errorStream = z ? this.f15516c.getErrorStream() : this.f15516c.getInputStream();
            try {
                byte[] a = C6196id.m18390a(errorStream);
                C6196id.m18386a((Closeable) errorStream);
                hbVar.f15543c = this.f15516c.getHeaderFields();
                if (a.length != 0) {
                    if (a != null && m18216a(hbVar) && (a = C6196id.m18391a(a)) == null) {
                        hbVar.f15541a = new C6154gz(-6, "Failed to uncompress gzip response");
                    }
                    if (a != null) {
                        hbVar.mo35348a(a);
                    }
                }
            } catch (Throwable th) {
                C6196id.m18386a((Closeable) errorStream);
                throw th;
            }
        } else {
            hbVar.f15541a = new C6154gz(-5, "Response size greater than specified max response size");
        }
    }

    /* renamed from: a */
    private static String m18213a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errorMessage")) {
                return jSONObject.getString("errorMessage");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.f15543c.get("Content-Encoding");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m18216a(com.inmobi.media.C6157hb r2) {
        /*
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r2.f15543c
            java.lang.String r1 = "Content-Encoding"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x001e
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r2.f15543c
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x001e
            java.lang.String r0 = "gzip"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x001e
            r2 = 1
            return r2
        L_0x001e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6153gy.m18216a(com.inmobi.media.hb):boolean");
    }
}
