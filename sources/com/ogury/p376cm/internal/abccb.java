package com.ogury.p376cm.internal;

import com.google.common.net.HttpHeaders;
import com.ogury.p376cm.ConsentActivity;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.ogury.cm.internal.abccb */
public final class abccb {

    /* renamed from: a */
    public static final aaaaa f24391a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.abccb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        com.ogury.p376cm.internal.baccc.m28039a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m27912a(java.io.InputStream r4, java.lang.String r5) {
        /*
            r0 = 0
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x003b
            r2 = 0
            if (r5 != 0) goto L_0x000a
            r5 = r2
            goto L_0x0010
        L_0x000a:
            java.lang.String r3 = "gzip"
            boolean r5 = r5.equalsIgnoreCase(r3)
        L_0x0010:
            if (r5 == 0) goto L_0x003b
            com.ogury.cm.internal.abcca r5 = com.ogury.p376cm.internal.abcca.f24390a
            java.lang.String r5 = "receiver$0"
            com.ogury.p376cm.internal.bbabc.m28052b(r4, r5)
            int r5 = r4.available()
            int r5 = java.lang.Math.max(r1, r5)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r5)
            r5 = r1
            java.io.OutputStream r5 = (java.io.OutputStream) r5
            r3 = 2
            com.ogury.p376cm.ConsentActivity.aaaaa.m27624a(r4, r5, r2, r3, r0)
            byte[] r4 = r1.toByteArray()
            java.lang.String r5 = "buffer.toByteArray()"
            com.ogury.p376cm.internal.bbabc.m28049a((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.String r4 = com.ogury.p376cm.internal.abcca.m27910a((byte[]) r4)
            return r4
        L_0x003b:
            java.nio.charset.Charset r5 = com.ogury.p376cm.internal.bbbcb.f24546a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r4, r5)
            java.io.Reader r2 = (java.io.Reader) r2
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r4.<init>(r2, r1)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r5 = r4
            java.io.BufferedReader r5 = (java.io.BufferedReader) r5     // Catch:{ all -> 0x0058 }
            java.io.Reader r5 = (java.io.Reader) r5     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = com.ogury.p376cm.ConsentActivity.aaaaa.m27628a((java.io.Reader) r5)     // Catch:{ all -> 0x0058 }
            com.ogury.p376cm.internal.baccc.m28039a(r4, r0)
            return r5
        L_0x0058:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            com.ogury.p376cm.internal.baccc.m28039a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376cm.internal.abccb.m27912a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m27913a(abccc abccc) {
        OutputStream outputStream;
        bbabc.m28052b(abccc, "request");
        try {
            URLConnection openConnection = new URL(abccc.mo63891c()).openConnection();
            if (openConnection != null) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setRequestMethod(abccc.mo63889a());
                httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                httpsURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpsURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                List<babbc<String, String>> e = abccc.mo63893e();
                if (e != null) {
                    for (babbc next : e) {
                        httpsURLConnection.setRequestProperty((String) next.mo63948a(), (String) next.mo63949b());
                    }
                }
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                outputStream = httpsURLConnection.getOutputStream();
                bbabc.m28049a((Object) outputStream, "conn.outputStream");
                abcca abcca = abcca.f24390a;
                outputStream.write(abcca.m27911a(abccc.mo63890b()));
                outputStream.flush();
                ConsentActivity.aaaaa.m27629a((Closeable) outputStream);
                int responseCode = httpsURLConnection.getResponseCode();
                acabb d = abccc.mo63892d();
                if (200 <= responseCode) {
                    if (299 >= responseCode) {
                        if (d != null) {
                            InputStream inputStream = httpsURLConnection.getInputStream();
                            bbabc.m28049a((Object) inputStream, "conn.inputStream");
                            d.mo63784a(m27912a(inputStream, httpsURLConnection.getContentEncoding()));
                        }
                        httpsURLConnection.disconnect();
                    }
                }
                if (d != null) {
                    InputStream errorStream = httpsURLConnection.getErrorStream();
                    bbabc.m28049a((Object) errorStream, "conn.errorStream");
                    d.mo63783a(responseCode, m27912a(errorStream, httpsURLConnection.getContentEncoding()));
                }
                try {
                    httpsURLConnection.disconnect();
                } catch (Exception e2) {
                    abbbc abbbc = abbbc.f24336a;
                    abbbc.m27856a((Throwable) e2);
                }
            } else {
                throw new babca("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            }
        } catch (Exception e3) {
            acabb d2 = abccc.mo63892d();
            if (d2 != null) {
                String message = e3.getMessage();
                if (message == null) {
                    message = "";
                }
                d2.mo63783a(0, message);
            }
        } catch (Throwable th) {
            ConsentActivity.aaaaa.m27629a((Closeable) outputStream);
            throw th;
        }
    }
}
