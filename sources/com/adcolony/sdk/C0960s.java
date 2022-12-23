package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0826e0;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.model.Advertisement;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import p405ms.p406bd.p407o.Pgl.C12600c;

/* renamed from: com.adcolony.sdk.s */
class C0960s implements Runnable {

    /* renamed from: a */
    private HttpURLConnection f752a;

    /* renamed from: b */
    private InputStream f753b;

    /* renamed from: c */
    private C0850h0 f754c;

    /* renamed from: d */
    private C0961a f755d;

    /* renamed from: e */
    private C0833g f756e = null;

    /* renamed from: f */
    private String f757f;

    /* renamed from: g */
    private int f758g = 0;

    /* renamed from: h */
    private boolean f759h = false;

    /* renamed from: i */
    private Map<String, List<String>> f760i;

    /* renamed from: j */
    private String f761j = "";

    /* renamed from: k */
    private String f762k = "";

    /* renamed from: l */
    String f763l = "";

    /* renamed from: m */
    String f764m = "";

    /* renamed from: n */
    boolean f765n;

    /* renamed from: o */
    int f766o;

    /* renamed from: p */
    int f767p;

    /* renamed from: com.adcolony.sdk.s$a */
    interface C0961a {
        /* renamed from: a */
        void mo10925a(C0960s sVar, C0850h0 h0Var, Map<String, List<String>> map);
    }

    C0960s(C0850h0 h0Var, C0961a aVar) {
        this.f754c = h0Var;
        this.f755d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r1 = "UTF-8";
        r2 = r7.f757f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1 = r7.f757f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if ((r9 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r2 = r7.f752a.getHeaderField("Content-Type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7.f756e == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r2.contains("application/octet-stream") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (((java.io.ByteArrayOutputStream) r9).size() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r7.f764m = r7.f756e.mo10816b(((java.io.ByteArrayOutputStream) r9).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r7.f764m = ((java.io.ByteArrayOutputStream) r9).toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r9 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1005a(java.io.InputStream r8, java.io.OutputStream r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ba }
            r0.<init>(r8)     // Catch:{ all -> 0x00ba }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00b0 }
        L_0x0009:
            r3 = 0
            int r4 = r0.read(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            r5 = -1
            if (r4 == r5) goto L_0x0058
            int r5 = r7.f766o     // Catch:{ all -> 0x00b0 }
            int r5 = r5 + r4
            r7.f766o = r5     // Catch:{ all -> 0x00b0 }
            boolean r6 = r7.f759h     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x0054
            int r6 = r7.f758g     // Catch:{ all -> 0x00b0 }
            if (r5 > r6) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f766o     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f758g     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.net.HttpURLConnection r3 = r7.f752a     // Catch:{ all -> 0x00b0 }
            java.net.URL r3 = r3.getURL()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0054:
            r9.write(r2, r3, r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x0009
        L_0x0058:
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = r7.f757f     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r1 = r7.f757f     // Catch:{ all -> 0x00b0 }
        L_0x0066:
            boolean r2 = r9 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a2
            java.net.HttpURLConnection r2 = r7.f752a     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r2 = r2.getHeaderField(r3)     // Catch:{ all -> 0x00b0 }
            com.adcolony.sdk.g r3 = r7.f756e     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = "application/octet-stream"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            com.adcolony.sdk.g r1 = r7.f756e     // Catch:{ all -> 0x00b0 }
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r1.mo10816b(r2)     // Catch:{ all -> 0x00b0 }
            r7.f764m = r1     // Catch:{ all -> 0x00b0 }
            goto L_0x00a2
        L_0x0099:
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ all -> 0x00b0 }
            r7.f764m = r1     // Catch:{ all -> 0x00b0 }
        L_0x00a2:
            r0.close()     // Catch:{ all -> 0x00ba }
            if (r9 == 0) goto L_0x00aa
            r9.close()
        L_0x00aa:
            if (r8 == 0) goto L_0x00af
            r8.close()
        L_0x00af:
            return
        L_0x00b0:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            if (r8 == 0) goto L_0x00c5
            r8.close()
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0960s.m1005a(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: c */
    private boolean m1007c() throws IOException {
        C0832f1 a = this.f754c.mo10834a();
        String h = C0773c0.m393h(a, FirebaseAnalytics.Param.CONTENT_TYPE);
        String h2 = C0773c0.m393h(a, "content");
        C0832f1 n = a.mo10807n("dictionaries");
        C0832f1 n2 = a.mo10807n("dictionaries_mapping");
        this.f763l = C0773c0.m393h(a, "url");
        if (n != null) {
            C0833g.m579a(n.mo10798f());
        }
        if (C0723a.m193b().mo10870H() && n2 != null) {
            this.f756e = C0833g.m577a(C0773c0.m394i(n2, "request"), C0773c0.m394i(n2, "response"));
        }
        String h3 = C0773c0.m393h(a, "user_agent");
        int a2 = C0773c0.m363a(a, "read_timeout", 60000);
        int a3 = C0773c0.m363a(a, "connect_timeout", 60000);
        boolean b = C0773c0.m382b(a, "no_redirect");
        this.f763l = C0773c0.m393h(a, "url");
        this.f761j = C0773c0.m393h(a, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C0723a.m193b().mo10917z().mo11157d());
        String str = this.f761j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f762k = sb.toString();
        this.f757f = C0773c0.m393h(a, "encoding");
        int a4 = C0773c0.m363a(a, "max_size", 0);
        this.f758g = a4;
        this.f759h = a4 != 0;
        this.f766o = 0;
        this.f753b = null;
        this.f752a = null;
        this.f760i = null;
        if (!this.f763l.startsWith(Advertisement.FILE_SCHEME)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f763l).openConnection();
            this.f752a = httpURLConnection;
            httpURLConnection.setReadTimeout(a2);
            this.f752a.setConnectTimeout(a3);
            this.f752a.setInstanceFollowRedirects(!b);
            if (h3 != null && !h3.equals("")) {
                this.f752a.setRequestProperty("User-Agent", h3);
            }
            if (this.f756e != null) {
                this.f752a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f752a.setRequestProperty("Req-Dict-Id", this.f756e.mo10815b());
                this.f752a.setRequestProperty("Resp-Dict-Id", this.f756e.mo10817c());
            } else {
                this.f752a.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, C0849h.f506a.name());
                if (!h.equals("")) {
                    this.f752a.setRequestProperty("Content-Type", h);
                }
            }
            if (this.f754c.mo10836b().equals("WebServices.post")) {
                this.f752a.setDoOutput(true);
                C0833g gVar = this.f756e;
                if (gVar != null) {
                    byte[] a5 = gVar.mo10813a(h2);
                    this.f752a.setFixedLengthStreamingMode(a5.length);
                    this.f752a.getOutputStream().write(a5);
                    this.f752a.getOutputStream().flush();
                } else {
                    this.f752a.setFixedLengthStreamingMode(h2.getBytes(C0849h.f506a).length);
                    new PrintStream(this.f752a.getOutputStream()).print(h2);
                }
            }
        } else if (this.f763l.startsWith("file:///android_asset/")) {
            Context a6 = C0723a.m186a();
            if (a6 != null) {
                this.f753b = a6.getAssets().open(this.f763l.substring(22));
            }
        } else {
            this.f753b = new FileInputStream(this.f763l.substring(7));
        }
        if (this.f752a == null && this.f753b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m1008d() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String b = this.f754c.mo10836b();
        if (this.f753b != null) {
            outputStream = this.f761j.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f761j).getAbsolutePath());
        } else if (b.equals("WebServices.download")) {
            this.f753b = this.f752a.getInputStream();
            outputStream = new FileOutputStream(this.f762k);
        } else if (b.equals("WebServices.get")) {
            this.f753b = this.f752a.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (b.equals("WebServices.post")) {
            this.f752a.connect();
            if (this.f752a.getResponseCode() < 200 || this.f752a.getResponseCode() > 299) {
                inputStream = this.f752a.getErrorStream();
            } else {
                inputStream = this.f752a.getInputStream();
            }
            this.f753b = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f752a;
        if (httpURLConnection != null) {
            this.f767p = httpURLConnection.getResponseCode();
            this.f760i = this.f752a.getHeaderFields();
        }
        m1005a(this.f753b, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0850h0 mo11086b() {
        return this.f754c;
    }

    public void run() {
        boolean z;
        boolean z2 = false;
        this.f765n = false;
        try {
            if (m1007c()) {
                m1008d();
                if (this.f754c.mo10836b().equals("WebServices.post")) {
                    if (this.f767p != 200) {
                        z = false;
                        this.f765n = z;
                    }
                }
                z = true;
                this.f765n = z;
            }
        } catch (MalformedURLException e) {
            new C0826e0.C0827a().mo10746a("MalformedURLException: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            this.f765n = true;
        } catch (OutOfMemoryError unused) {
            new C0826e0.C0827a().mo10746a("Out of memory error - disabling AdColony. (").mo10744a(this.f766o).mo10746a("/").mo10744a(this.f758g).mo10746a("): " + this.f763l).mo10747a(C0826e0.f461h);
            C0723a.m193b().mo10888b(true);
        } catch (IOException e2) {
            new C0826e0.C0827a().mo10746a("Download of ").mo10746a(this.f763l).mo10746a(" failed: ").mo10746a(e2.toString()).mo10747a(C0826e0.f460g);
            int i = this.f767p;
            if (i == 0) {
                i = C12600c.COLLECT_MODE_TIKTOK_GUEST;
            }
            this.f767p = i;
        } catch (IllegalStateException e3) {
            new C0826e0.C0827a().mo10746a("okhttp error: ").mo10746a(e3.toString()).mo10747a(C0826e0.f461h);
            e3.printStackTrace();
        } catch (DataFormatException e4) {
            new C0826e0.C0827a().mo10746a("Exception, possibly trying to decompress plain response: ").mo10746a(e4.toString()).mo10747a(C0826e0.f462i);
            e4.printStackTrace();
        } catch (IllegalArgumentException e5) {
            new C0826e0.C0827a().mo10746a("Exception, possibly response encoded with different dictionary: ").mo10746a(e5.toString()).mo10747a(C0826e0.f462i);
            e5.printStackTrace();
        } catch (AssertionError e6) {
            new C0826e0.C0827a().mo10746a("okhttp error: ").mo10746a(e6.toString()).mo10747a(C0826e0.f461h);
            e6.printStackTrace();
        } catch (Exception e7) {
            new C0826e0.C0827a().mo10746a("Exception: ").mo10746a(e7.toString()).mo10747a(C0826e0.f461h);
            e7.printStackTrace();
        }
        z2 = true;
        if (z2) {
            if (this.f754c.mo10836b().equals("WebServices.download")) {
                m1006a(this.f762k, this.f761j);
            }
            this.f755d.mo10925a(this, this.f754c, this.f760i);
        }
    }

    /* renamed from: a */
    private void m1006a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C0723a.m193b().mo10917z().mo11157d()) && !new File(str).renameTo(new File(str2))) {
                new C0826e0.C0827a().mo10746a("Moving of ").mo10746a(str).mo10746a(" failed.").mo10747a(C0826e0.f460g);
            }
        } catch (Exception e) {
            new C0826e0.C0827a().mo10746a("Exception: ").mo10746a(e.toString()).mo10747a(C0826e0.f461h);
            e.printStackTrace();
        }
    }
}
