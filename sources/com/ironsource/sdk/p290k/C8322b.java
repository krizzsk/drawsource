package com.ironsource.sdk.p290k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.sdk.p286h.C8305c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.sdk.k.b */
public final class C8322b {

    /* renamed from: c */
    private static C8322b f20272c;

    /* renamed from: a */
    public C8321a f20273a = new C8321a(C6385a.m19061a());

    /* renamed from: b */
    public final String f20274b;

    /* renamed from: d */
    private Thread f20275d;

    /* renamed from: com.ironsource.sdk.k.b$a */
    static class C8323a implements Callable<C8324b> {

        /* renamed from: a */
        private String f20276a;

        /* renamed from: b */
        private String f20277b;

        /* renamed from: c */
        private String f20278c;

        /* renamed from: d */
        private long f20279d;

        /* renamed from: e */
        private String f20280e;

        C8323a(String str, String str2, String str3, long j, String str4) {
            this.f20276a = str;
            this.f20277b = str2;
            this.f20278c = str3;
            this.f20279d = j;
            this.f20280e = str4;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0136 A[SYNTHETIC, Splitter:B:104:0x0136] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x013e A[Catch:{ all -> 0x013a }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x014d A[SYNTHETIC, Splitter:B:116:0x014d] */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0155 A[Catch:{ all -> 0x0151 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0073 A[SYNTHETIC, Splitter:B:18:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ all -> 0x0077 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[Catch:{ all -> 0x00ec }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac A[SYNTHETIC, Splitter:B:41:0x00ac] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce A[Catch:{ all -> 0x00ec }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00d7 A[SYNTHETIC, Splitter:B:56:0x00d7] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00df A[Catch:{ all -> 0x00db }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00f1 A[SYNTHETIC, Splitter:B:67:0x00f1] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00f9 A[Catch:{ all -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0108 A[SYNTHETIC, Splitter:B:80:0x0108] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0110 A[Catch:{ all -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x011f A[SYNTHETIC, Splitter:B:92:0x011f] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0127 A[Catch:{ all -> 0x0123 }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x00c4=Splitter:B:51:0x00c4, B:36:0x0099=Splitter:B:36:0x0099} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ironsource.sdk.p290k.C8322b.C8324b m23689a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "DownloadManager"
                com.ironsource.sdk.k.b$b r1 = new com.ironsource.sdk.k.b$b
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 == 0) goto L_0x0014
                r1.f20281a = r9
                r9 = 1007(0x3ef, float:1.411E-42)
                r1.f20282b = r9
                return r1
            L_0x0014:
                r2 = 1019(0x3fb, float:1.428E-42)
                r3 = 0
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x014a, URISyntaxException -> 0x0133, SocketTimeoutException -> 0x011c, FileNotFoundException -> 0x0105, Exception -> 0x00c1, Error -> 0x0097, all -> 0x0093 }
                r5.<init>(r9)     // Catch:{ MalformedURLException -> 0x014a, URISyntaxException -> 0x0133, SocketTimeoutException -> 0x011c, FileNotFoundException -> 0x0105, Exception -> 0x00c1, Error -> 0x0097, all -> 0x0093 }
                r5.toURI()     // Catch:{ MalformedURLException -> 0x014a, URISyntaxException -> 0x0133, SocketTimeoutException -> 0x011c, FileNotFoundException -> 0x0105, Exception -> 0x00c1, Error -> 0x0097, all -> 0x0093 }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x014a, URISyntaxException -> 0x0133, SocketTimeoutException -> 0x011c, FileNotFoundException -> 0x0105, Exception -> 0x00c1, Error -> 0x0097, all -> 0x0093 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x014a, URISyntaxException -> 0x0133, SocketTimeoutException -> 0x011c, FileNotFoundException -> 0x0105, Exception -> 0x00c1, Error -> 0x0097, all -> 0x0093 }
                java.lang.String r6 = "GET"
                r5.setRequestMethod(r6)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r6 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r6)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r5.setReadTimeout(r6)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r5.connect()     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                int r4 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r4 < r6) goto L_0x004e
                r6 = 400(0x190, float:5.6E-43)
                if (r4 < r6) goto L_0x0043
                goto L_0x004e
            L_0x0043:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                byte[] r10 = m23690a(r3)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r1.f20283c = r10     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                goto L_0x0071
            L_0x004e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                java.lang.String r7 = " RESPONSE CODE: "
                r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r6.append(r4)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                java.lang.String r7 = " URL: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r6.append(r9)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                java.lang.String r7 = " ATTEMPT: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r6.append(r10)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                java.lang.String r10 = r6.toString()     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                com.ironsource.sdk.utils.Logger.m23749i(r0, r10)     // Catch:{ MalformedURLException -> 0x014b, URISyntaxException -> 0x0134, SocketTimeoutException -> 0x011d, FileNotFoundException -> 0x0106, Exception -> 0x008e, Error -> 0x008a, all -> 0x0088 }
                r4 = 1011(0x3f3, float:1.417E-42)
            L_0x0071:
                if (r3 == 0) goto L_0x0079
                r3.close()     // Catch:{ all -> 0x0077 }
                goto L_0x0079
            L_0x0077:
                r10 = move-exception
                goto L_0x007f
            L_0x0079:
                if (r5 == 0) goto L_0x0082
                r5.disconnect()     // Catch:{ all -> 0x0077 }
                goto L_0x0082
            L_0x007f:
                r10.printStackTrace()
            L_0x0082:
                r1.f20281a = r9
                r1.f20282b = r4
                goto L_0x0162
            L_0x0088:
                r10 = move-exception
                goto L_0x0095
            L_0x008a:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x0099
            L_0x008e:
                r10 = move-exception
                r2 = r4
                r4 = r3
                r3 = r5
                goto L_0x00c4
            L_0x0093:
                r10 = move-exception
                r5 = r3
            L_0x0095:
                r2 = r4
                goto L_0x00ef
            L_0x0097:
                r10 = move-exception
                r4 = r3
            L_0x0099:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00ec }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00ec }
                if (r5 != 0) goto L_0x00aa
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00ec }
                com.ironsource.sdk.utils.Logger.m23749i(r0, r10)     // Catch:{ all -> 0x00ec }
            L_0x00aa:
                if (r4 == 0) goto L_0x00b2
                r4.close()     // Catch:{ all -> 0x00b0 }
                goto L_0x00b2
            L_0x00b0:
                r10 = move-exception
                goto L_0x00b8
            L_0x00b2:
                if (r3 == 0) goto L_0x00bb
                r3.disconnect()     // Catch:{ all -> 0x00b0 }
                goto L_0x00bb
            L_0x00b8:
                r10.printStackTrace()
            L_0x00bb:
                r1.f20281a = r9
                r1.f20282b = r2
                goto L_0x0162
            L_0x00c1:
                r10 = move-exception
                r2 = r4
                r4 = r3
            L_0x00c4:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00ec }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00ec }
                if (r5 != 0) goto L_0x00d5
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00ec }
                com.ironsource.sdk.utils.Logger.m23749i(r0, r10)     // Catch:{ all -> 0x00ec }
            L_0x00d5:
                if (r4 == 0) goto L_0x00dd
                r4.close()     // Catch:{ all -> 0x00db }
                goto L_0x00dd
            L_0x00db:
                r10 = move-exception
                goto L_0x00e3
            L_0x00dd:
                if (r3 == 0) goto L_0x00e6
                r3.disconnect()     // Catch:{ all -> 0x00db }
                goto L_0x00e6
            L_0x00e3:
                r10.printStackTrace()
            L_0x00e6:
                r1.f20281a = r9
                r9 = 1009(0x3f1, float:1.414E-42)
                goto L_0x0160
            L_0x00ec:
                r10 = move-exception
                r5 = r3
                r3 = r4
            L_0x00ef:
                if (r3 == 0) goto L_0x00f7
                r3.close()     // Catch:{ all -> 0x00f5 }
                goto L_0x00f7
            L_0x00f5:
                r0 = move-exception
                goto L_0x00fd
            L_0x00f7:
                if (r5 == 0) goto L_0x0100
                r5.disconnect()     // Catch:{ all -> 0x00f5 }
                goto L_0x0100
            L_0x00fd:
                r0.printStackTrace()
            L_0x0100:
                r1.f20281a = r9
                r1.f20282b = r2
                throw r10
            L_0x0105:
                r5 = r3
            L_0x0106:
                if (r3 == 0) goto L_0x010e
                r3.close()     // Catch:{ all -> 0x010c }
                goto L_0x010e
            L_0x010c:
                r10 = move-exception
                goto L_0x0114
            L_0x010e:
                if (r5 == 0) goto L_0x0117
                r5.disconnect()     // Catch:{ all -> 0x010c }
                goto L_0x0117
            L_0x0114:
                r10.printStackTrace()
            L_0x0117:
                r1.f20281a = r9
                r9 = 1018(0x3fa, float:1.427E-42)
                goto L_0x0160
            L_0x011c:
                r5 = r3
            L_0x011d:
                if (r3 == 0) goto L_0x0125
                r3.close()     // Catch:{ all -> 0x0123 }
                goto L_0x0125
            L_0x0123:
                r10 = move-exception
                goto L_0x012b
            L_0x0125:
                if (r5 == 0) goto L_0x012e
                r5.disconnect()     // Catch:{ all -> 0x0123 }
                goto L_0x012e
            L_0x012b:
                r10.printStackTrace()
            L_0x012e:
                r1.f20281a = r9
                r9 = 1008(0x3f0, float:1.413E-42)
                goto L_0x0160
            L_0x0133:
                r5 = r3
            L_0x0134:
                if (r3 == 0) goto L_0x013c
                r3.close()     // Catch:{ all -> 0x013a }
                goto L_0x013c
            L_0x013a:
                r10 = move-exception
                goto L_0x0142
            L_0x013c:
                if (r5 == 0) goto L_0x0145
                r5.disconnect()     // Catch:{ all -> 0x013a }
                goto L_0x0145
            L_0x0142:
                r10.printStackTrace()
            L_0x0145:
                r1.f20281a = r9
                r9 = 1010(0x3f2, float:1.415E-42)
                goto L_0x0160
            L_0x014a:
                r5 = r3
            L_0x014b:
                if (r3 == 0) goto L_0x0153
                r3.close()     // Catch:{ all -> 0x0151 }
                goto L_0x0153
            L_0x0151:
                r10 = move-exception
                goto L_0x0159
            L_0x0153:
                if (r5 == 0) goto L_0x015c
                r5.disconnect()     // Catch:{ all -> 0x0151 }
                goto L_0x015c
            L_0x0159:
                r10.printStackTrace()
            L_0x015c:
                r1.f20281a = r9
                r9 = 1004(0x3ec, float:1.407E-42)
            L_0x0160:
                r1.f20282b = r9
            L_0x0162:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p290k.C8322b.C8323a.m23689a(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        /* renamed from: a */
        private static byte[] m23690a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            r2 = m23689a(r7.f20276a, r1);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ironsource.sdk.p290k.C8322b.C8324b call() {
            /*
                r7 = this;
                java.lang.String r0 = "DownloadManager"
                long r1 = r7.f20279d
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L_0x000e
                r1 = 1
                r7.f20279d = r1
            L_0x000e:
                r1 = 0
                r2 = 0
            L_0x0010:
                long r3 = (long) r1
                long r5 = r7.f20279d
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1009(0x3f1, float:1.414E-42)
                if (r3 >= 0) goto L_0x002a
                java.lang.String r2 = r7.f20276a
                com.ironsource.sdk.k.b$b r2 = r7.m23689a(r2, r1)
                int r3 = r2.f20282b
                r5 = 1008(0x3f0, float:1.413E-42)
                if (r3 == r5) goto L_0x0027
                if (r3 != r4) goto L_0x002a
            L_0x0027:
                int r1 = r1 + 1
                goto L_0x0010
            L_0x002a:
                if (r2 == 0) goto L_0x00ab
                byte[] r1 = r2.f20283c
                if (r1 == 0) goto L_0x00ab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r7.f20277b
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r3 = r7.f20278c
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = r7.f20280e
                r3.append(r5)
                java.lang.String r5 = java.io.File.separator
                r3.append(r5)
                java.lang.String r5 = "tmp_"
                r3.append(r5)
                java.lang.String r5 = r7.f20278c
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                byte[] r5 = r2.f20283c     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                int r5 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r5, r3)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r5 != 0) goto L_0x0072
                r1 = 1006(0x3ee, float:1.41E-42)
                r2.f20282b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x0072:
                boolean r1 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r3, r1)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r1 != 0) goto L_0x00ab
                r1 = 1020(0x3fc, float:1.43E-42)
                r2.f20282b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x007d:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x008f
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
            L_0x008f:
                r0 = 1019(0x3fb, float:1.428E-42)
                goto L_0x00a9
            L_0x0092:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00a4
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
            L_0x00a4:
                r2.f20282b = r4
                goto L_0x00ab
            L_0x00a7:
                r0 = 1018(0x3fa, float:1.427E-42)
            L_0x00a9:
                r2.f20282b = r0
            L_0x00ab:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p290k.C8322b.C8323a.call():com.ironsource.sdk.k.b$b");
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b */
    static class C8324b {

        /* renamed from: a */
        public String f20281a;

        /* renamed from: b */
        int f20282b;

        /* renamed from: c */
        byte[] f20283c;

        C8324b() {
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$c */
    static class C8325c implements Runnable {

        /* renamed from: a */
        private final long f20284a = 3;

        /* renamed from: b */
        private final String f20285b;

        /* renamed from: c */
        private Handler f20286c;

        /* renamed from: d */
        private String f20287d;

        /* renamed from: e */
        private String f20288e;

        /* renamed from: f */
        private String f20289f;

        /* renamed from: g */
        private long f20290g;

        C8325c(C8305c cVar, String str, Handler handler, String str2) {
            this.f20287d = str;
            this.f20288e = cVar.getParent();
            this.f20289f = cVar.getName();
            this.f20290g = 3;
            this.f20286c = handler;
            this.f20285b = str2;
        }

        public final void run() {
            int i;
            C8305c cVar = new C8305c(this.f20288e, this.f20289f);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = 1020;
            } else {
                C8324b a = new C8323a(this.f20287d, makeDir, cVar.getName(), this.f20290g, this.f20285b).call();
                i = a.f20282b == 200 ? 1016 : a.f20282b;
            }
            message.what = i;
            this.f20286c.sendMessage(message);
        }
    }

    private C8322b(String str, C6385a aVar) {
        this.f20274b = str;
        IronSourceStorageUtils.deleteFolder(m23684c());
        IronSourceStorageUtils.makeDir(m23684c());
    }

    /* renamed from: a */
    public static synchronized C8322b m23683a(String str, C6385a aVar) {
        C8322b bVar;
        synchronized (C8322b.class) {
            if (f20272c == null) {
                f20272c = new C8322b(str, aVar);
            }
            bVar = f20272c;
        }
        return bVar;
    }

    /* renamed from: c */
    private String m23684c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f20274b, "temp");
    }

    /* renamed from: a */
    public final synchronized void mo56759a() {
        f20272c = null;
        if (this.f20273a != null) {
            this.f20273a.f20271a = null;
            this.f20273a = null;
        }
    }

    /* renamed from: a */
    public final void mo56760a(C8305c cVar, String str) {
        Thread thread = new Thread(new C8325c(cVar, str, this.f20273a, m23684c()));
        this.f20275d = thread;
        thread.start();
    }

    /* renamed from: a */
    public final void mo56761a(C8305c cVar, String str, Handler handler) {
        new Thread(new C8325c(cVar, str, handler, m23684c())).start();
    }

    /* renamed from: b */
    public final boolean mo56762b() {
        Thread thread = this.f20275d;
        return thread != null && thread.isAlive();
    }
}
