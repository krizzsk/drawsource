package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.C12095d;
import com.unity3d.services.core.request.C12099h;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.cache.f */
/* compiled from: CacheThreadHandler */
class C11988f extends Handler {

    /* renamed from: a */
    private C12099h f29168a = null;

    /* renamed from: b */
    private boolean f29169b = false;

    /* renamed from: c */
    private boolean f29170c = false;

    /* renamed from: com.unity3d.services.core.cache.f$a */
    /* compiled from: CacheThreadHandler */
    class C11989a implements C12095d {

        /* renamed from: a */
        private long f29171a = System.currentTimeMillis();

        /* renamed from: b */
        final /* synthetic */ File f29172b;

        /* renamed from: c */
        final /* synthetic */ int f29173c;

        C11989a(File file, int i) {
            this.f29172b = file;
            this.f29173c = i;
        }

        /* renamed from: a */
        public void mo71031a(String str, long j, int i, Map<String, List<String>> map) {
            C12136a.m33103c().mo71310a((Enum) C12143b.CACHE, (Enum) C11986d.DOWNLOAD_STARTED, str, Long.valueOf(this.f29172b.length()), Long.valueOf(j + this.f29172b.length()), Integer.valueOf(i), Request.getResponseHeadersMap(map));
        }

        /* renamed from: a */
        public void mo71032a(String str, long j, long j2) {
            if (this.f29173c > 0 && System.currentTimeMillis() - this.f29171a > ((long) this.f29173c)) {
                this.f29171a = System.currentTimeMillis();
                C12136a.m33103c().mo71310a((Enum) C12143b.CACHE, (Enum) C11986d.DOWNLOAD_PROGRESS, str, Long.valueOf(j), Long.valueOf(j2));
            }
        }
    }

    C11988f() {
    }

    /* renamed from: a */
    public void mo71028a(boolean z) {
        C12099h hVar;
        this.f29169b = z;
        if (z && (hVar = this.f29168a) != null) {
            this.f29170c = false;
            hVar.mo71245a();
        }
    }

    public void handleMessage(Message message) {
        HashMap hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            C12065a.m32845b("There are headers left in data, reading them");
            HashMap hashMap2 = new HashMap();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this.f29170c = false;
            C12136a.m33103c().mo71310a((Enum) C12143b.CACHE, (Enum) C11986d.DOWNLOAD_ERROR, C11985c.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            m32614a(string, string2, i, i2, i3, hashMap, z);
        }
    }

    /* renamed from: a */
    public boolean mo71029a() {
        return this.f29170c;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v53 */
    /* JADX WARNING: type inference failed for: r6v54 */
    /* JADX WARNING: type inference failed for: r6v55 */
    /* JADX WARNING: type inference failed for: r6v56 */
    /* JADX WARNING: type inference failed for: r6v57 */
    /* JADX WARNING: type inference failed for: r6v58 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c0 A[SYNTHETIC, Splitter:B:103:0x02c0] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0312 A[SYNTHETIC, Splitter:B:114:0x0312] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0363 A[SYNTHETIC, Splitter:B:125:0x0363] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x038c A[SYNTHETIC, Splitter:B:133:0x038c] */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ca A[SYNTHETIC, Splitter:B:70:0x01ca] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021c A[SYNTHETIC, Splitter:B:81:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026e A[SYNTHETIC, Splitter:B:92:0x026e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32614a(java.lang.String r24, java.lang.String r25, int r26, int r27, int r28, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r29, boolean r30) {
        /*
            r23 = this;
            r13 = r23
            r14 = r24
            r0 = r25
            r1 = r30
            java.lang.String r15 = "Error closing stream"
            boolean r2 = r13.f29169b
            if (r2 != 0) goto L_0x03af
            if (r14 == 0) goto L_0x03af
            if (r0 != 0) goto L_0x0014
            goto L_0x03af
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r2 = " to "
            if (r1 == 0) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: resuming download "
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " at "
            r3.append(r0)
            long r6 = r5.length()
            r3.append(r6)
            java.lang.String r0 = " bytes"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.C12065a.m32845b(r0)
            goto L_0x0063
        L_0x0049:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: start downloading "
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.C12065a.m32845b(r0)
        L_0x0063:
            boolean r0 = com.unity3d.services.core.device.C12014b.m32699U()
            r12 = 2
            r11 = 1
            r10 = 0
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "Unity Ads cache: download cancelled, no internet connection available"
            com.unity3d.services.core.log.C12065a.m32845b(r0)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r1 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r2 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r3 = new java.lang.Object[r12]
            com.unity3d.services.core.cache.c r4 = com.unity3d.services.core.cache.C11985c.NO_INTERNET
            r3[r10] = r4
            r3[r11] = r14
            r0.mo71310a((java.lang.Enum) r1, (java.lang.Enum) r2, (java.lang.Object[]) r3)
            return
        L_0x0085:
            r13.f29170c = r11
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8 = 0
            r9 = 3
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0336, MalformedURLException -> 0x02e5, IOException -> 0x0293, IllegalStateException -> 0x0241, e -> 0x01ef, Exception -> 0x019d, all -> 0x0191 }
            r6.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x0336, MalformedURLException -> 0x02e5, IOException -> 0x0293, IllegalStateException -> 0x0241, e -> 0x01ef, Exception -> 0x019d, all -> 0x0191 }
            r0 = r26
            r1 = r27
            r4 = r29
            com.unity3d.services.core.request.h r0 = r13.m32612a(r14, r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r13.f29168a = r0     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.cache.f$a r1 = new com.unity3d.services.core.cache.f$a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r4 = r28
            r1.<init>(r5, r4)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r0.mo71246a((com.unity3d.services.core.request.C12095d) r1)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.h r0 = r13.f29168a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            long r16 = r0.mo71244a((java.io.OutputStream) r6)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r13.f29170c = r10     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.h r0 = r13.f29168a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            long r18 = r0.mo71251d()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.h r0 = r13.f29168a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            boolean r0 = r0.mo71259m()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.h r1 = r13.f29168a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            int r20 = r1.mo71256j()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.h r1 = r13.f29168a     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            java.util.Map r21 = r1.mo71257k()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, e -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r1 = r23
            r4 = r24
            r22 = r6
            r6 = r16
            r14 = r8
            r8 = r18
            r10 = r0
            r16 = r11
            r11 = r20
            r17 = r12
            r12 = r21
            r1.m32613a(r2, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ FileNotFoundException -> 0x0128, MalformedURLException -> 0x0122, IOException -> 0x011c, IllegalStateException -> 0x0117, e -> 0x0112, Exception -> 0x010d, all -> 0x0108 }
            r13.f29168a = r14
            r22.close()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0385
        L_0x00e6:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r6 = 0
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x0108:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0138
        L_0x010d:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0147
        L_0x0112:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0155
        L_0x0117:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0163
        L_0x011c:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0171
        L_0x0122:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x017f
        L_0x0128:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x018d
        L_0x012e:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0138:
            r2 = r0
            r8 = r22
            goto L_0x0388
        L_0x013d:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0147:
            r8 = r22
            goto L_0x01a6
        L_0x014b:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0155:
            r8 = r22
            goto L_0x01f8
        L_0x0159:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0163:
            r8 = r22
            goto L_0x024a
        L_0x0167:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0171:
            r8 = r22
            goto L_0x029c
        L_0x0175:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x017f:
            r8 = r22
            goto L_0x02ee
        L_0x0183:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x018d:
            r8 = r22
            goto L_0x033f
        L_0x0191:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r2 = r0
            r8 = r1
            goto L_0x0388
        L_0x019d:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x01a6:
            java.lang.String r2 = "Unknown error"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.UNKNOWN_ERROR     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x01cf }
            goto L_0x0385
        L_0x01cf:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x01ef:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x01f8:
            java.lang.String r2 = "Network error"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.NETWORK_ERROR     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x0221 }
            goto L_0x0385
        L_0x0221:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x0241:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x024a:
            java.lang.String r2 = "Illegal state"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.ILLEGAL_STATE     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x0273 }
            goto L_0x0385
        L_0x0273:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x0293:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x029c:
            java.lang.String r2 = "Couldn't request stream"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x02c5 }
            goto L_0x0385
        L_0x02c5:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x02e5:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x02ee:
            java.lang.String r2 = "Malformed URL"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.MALFORMED_URL     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x0317 }
            goto L_0x0385
        L_0x0317:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
            goto L_0x0385
        L_0x0336:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
            r8 = r1
        L_0x033f:
            java.lang.String r2 = "Couldn't create target file"
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r2, (java.lang.Exception) r0)     // Catch:{ all -> 0x0386 }
            r13.f29170c = r6     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.a r2 = com.unity3d.services.core.webview.C12136a.m33103c()     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0386 }
            com.unity3d.services.core.cache.c r9 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR     // Catch:{ all -> 0x0386 }
            r7[r6] = r9     // Catch:{ all -> 0x0386 }
            r7[r16] = r24     // Catch:{ all -> 0x0386 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0386 }
            r7[r17] = r0     // Catch:{ all -> 0x0386 }
            r2.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0386 }
            r13.f29168a = r1
            if (r8 == 0) goto L_0x0385
            r8.close()     // Catch:{ Exception -> 0x0367 }
            goto L_0x0385
        L_0x0367:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r2 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r3 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r5 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r2, (java.lang.Enum) r3, (java.lang.Object[]) r4)
        L_0x0385:
            return
        L_0x0386:
            r0 = move-exception
            r2 = r0
        L_0x0388:
            r13.f29168a = r1
            if (r8 == 0) goto L_0x03ae
            r8.close()     // Catch:{ Exception -> 0x0390 }
            goto L_0x03ae
        L_0x0390:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r15, (java.lang.Exception) r1)
            com.unity3d.services.core.webview.a r0 = com.unity3d.services.core.webview.C12136a.m33103c()
            com.unity3d.services.core.webview.b r3 = com.unity3d.services.core.webview.C12143b.CACHE
            com.unity3d.services.core.cache.d r5 = com.unity3d.services.core.cache.C11986d.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.c r7 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR
            r4[r6] = r7
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.mo71310a((java.lang.Enum) r3, (java.lang.Enum) r5, (java.lang.Object[]) r4)
        L_0x03ae:
            throw r2
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.C11988f.m32614a(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean):void");
    }

    /* renamed from: a */
    private void m32613a(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        String str2 = str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            C12065a.m32845b("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            C12065a.m32845b("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
            C12136a.m33103c().mo71310a((Enum) C12143b.CACHE, (Enum) C11986d.DOWNLOAD_END, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        long j4 = j2;
        C12065a.m32845b("Unity Ads cache: downloading of " + str2 + " stopped");
        C12136a.m33103c().mo71310a((Enum) C12143b.CACHE, (Enum) C11986d.DOWNLOAD_STOPPED, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    /* renamed from: a */
    private C12099h m32612a(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new C12099h(str, ShareTarget.METHOD_GET, hashMap2, i, i2);
    }
}
