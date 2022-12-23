package com.ironsource.p199d;

import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.d.b */
public class C6357b {

    /* renamed from: a */
    private boolean f16080a = true;

    /* renamed from: b */
    private IronSourceError f16081b = null;

    /* renamed from: com.ironsource.d.b$a */
    public static class C6358a {

        /* renamed from: a */
        final String f16082a;

        /* renamed from: b */
        final String f16083b;

        /* renamed from: c */
        final String f16084c;

        /* renamed from: d */
        final int f16085d;

        /* renamed from: e */
        final int f16086e;

        /* renamed from: f */
        final String f16087f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f16088g;

        /* renamed from: com.ironsource.d.b$a$a */
        public static class C6359a {

            /* renamed from: a */
            List<Pair<String, String>> f16089a = new ArrayList();

            /* renamed from: b */
            public String f16090b;

            /* renamed from: c */
            public String f16091c = ShareTarget.METHOD_POST;

            /* renamed from: d */
            public String f16092d;

            /* renamed from: e */
            int f16093e = 15000;

            /* renamed from: f */
            int f16094f = 15000;

            /* renamed from: g */
            String f16095g = "UTF-8";

            /* renamed from: a */
            public final C6359a mo35855a(List<Pair<String, String>> list) {
                this.f16089a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public final C6358a mo35856a() {
                return new C6358a(this);
            }
        }

        public C6358a(C6359a aVar) {
            this.f16082a = aVar.f16090b;
            this.f16083b = aVar.f16091c;
            this.f16084c = aVar.f16092d;
            this.f16088g = new ArrayList<>(aVar.f16089a);
            this.f16085d = aVar.f16093e;
            this.f16086e = aVar.f16094f;
            this.f16087f = aVar.f16095g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.p199d.C6360c m18987a(com.ironsource.p199d.C6357b.C6358a r7) {
        /*
            java.lang.String r0 = r7.f16082a
            java.lang.String r1 = r7.f16084c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ce
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f16082a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f16085d     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f16086e     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f16083b     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f16088g     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m18989a((java.net.HttpURLConnection) r2, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f16083b     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f16084c     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r4 = r7.f16087f     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r4 = r3.length     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m18990a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f16096a = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.C6363a.C63641.m19009a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f16097b = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
            goto L_0x00bd
        L_0x007c:
            r7 = move-exception
            goto L_0x00c3
        L_0x007e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0088
        L_0x0083:
            r7 = move-exception
            r2 = r1
            goto L_0x00c3
        L_0x0086:
            r3 = move-exception
            r2 = r1
        L_0x0088:
            if (r1 == 0) goto L_0x00be
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bf }
            r0.f16096a = r4     // Catch:{ all -> 0x00bf }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00be
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.f16082a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            int r7 = r0.f16096a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.disconnect()
        L_0x00bd:
            return r0
        L_0x00be:
            throw r3     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r2.disconnect()
        L_0x00cd:
            throw r7
        L_0x00ce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p199d.C6357b.m18987a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    /* renamed from: a */
    public static C6360c m18988a(String str, String str2, List<Pair<String, String>> list) {
        C6358a.C6359a aVar = new C6358a.C6359a();
        aVar.f16090b = str;
        aVar.f16092d = str2;
        aVar.f16091c = ShareTarget.METHOD_POST;
        aVar.mo35855a(list);
        return m18987a(aVar.mo35856a());
    }

    /* renamed from: a */
    private static void m18989a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    /* renamed from: a */
    private static void m18990a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public void mo35851a(IronSourceError ironSourceError) {
        this.f16080a = false;
        this.f16081b = ironSourceError;
    }

    /* renamed from: a */
    public boolean mo35852a() {
        return this.f16080a;
    }

    /* renamed from: b */
    public IronSourceError mo35853b() {
        return this.f16081b;
    }

    public String toString() {
        StringBuilder sb;
        if (mo35852a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f16080a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f16080a);
            sb.append(", IronSourceError:");
            sb.append(this.f16081b);
        }
        return sb.toString();
    }
}
