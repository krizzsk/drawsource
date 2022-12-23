package com.inmobi.media;

/* renamed from: com.inmobi.media.jk */
/* compiled from: WifiInfoUtil */
public final class C6252jk {
    /* renamed from: a */
    public static boolean m18594a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static boolean m18593a(int i) {
        return !m18594a(i, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.inmobi.media.jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6251jj m18592a(boolean r7, boolean r8) {
        /*
            java.lang.String r0 = "\""
            android.content.Context r1 = com.inmobi.media.C6183hw.m18324c()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r3 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch:{ Exception -> 0x0062 }
            android.net.wifi.WifiInfo r1 = r1.getConnectionInfo()     // Catch:{ Exception -> 0x0062 }
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = r1.getBSSID()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = r1.getSSID()     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x006f
            boolean r7 = m18595a((boolean) r7, (java.lang.String) r4)     // Catch:{ Exception -> 0x0062 }
            if (r7 != 0) goto L_0x006f
            com.inmobi.media.jj r7 = new com.inmobi.media.jj     // Catch:{ Exception -> 0x0062 }
            r7.<init>()     // Catch:{ Exception -> 0x0062 }
            long r5 = m18591a((java.lang.String) r3)     // Catch:{ Exception -> 0x005f }
            r7.f15750a = r5     // Catch:{ Exception -> 0x005f }
            if (r4 == 0) goto L_0x004b
            boolean r3 = r4.startsWith(r0)     // Catch:{ Exception -> 0x005f }
            if (r3 == 0) goto L_0x004b
            boolean r0 = r4.endsWith(r0)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x004b
            int r0 = r4.length()     // Catch:{ Exception -> 0x005f }
            r3 = 1
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)     // Catch:{ Exception -> 0x005f }
        L_0x004b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            r7.f15751b = r2     // Catch:{ Exception -> 0x005f }
            int r8 = r1.getRssi()     // Catch:{ Exception -> 0x005f }
            r7.f15752c = r8     // Catch:{ Exception -> 0x005f }
            int r8 = r1.getIpAddress()     // Catch:{ Exception -> 0x005f }
            r7.f15753d = r8     // Catch:{ Exception -> 0x005f }
            r2 = r7
            goto L_0x006f
        L_0x005f:
            r8 = move-exception
            r2 = r7
            goto L_0x0063
        L_0x0062:
            r8 = move-exception
        L_0x0063:
            com.inmobi.media.gj r7 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r0 = new com.inmobi.media.hk
            r0.<init>(r8)
            r7.mo35310a((com.inmobi.media.C6167hk) r0)
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6252jk.m18592a(boolean, boolean):com.inmobi.media.jj");
    }

    /* renamed from: a */
    static boolean m18595a(boolean z, String str) {
        return z && str != null && str.endsWith("_nomap");
    }

    /* renamed from: a */
    static long m18591a(String str) {
        String[] split = str.split("\\:");
        byte[] bArr = new byte[6];
        int i = 0;
        while (i < 6) {
            try {
                bArr[i] = (byte) Integer.parseInt(split[i], 16);
                i++;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ((((long) bArr[0]) & 255) << 40) | ((((long) bArr[3]) & 255) << 16) | (((long) bArr[5]) & 255) | ((((long) bArr[4]) & 255) << 8) | ((((long) bArr[2]) & 255) << 24) | ((((long) bArr[1]) & 255) << 32);
    }
}
