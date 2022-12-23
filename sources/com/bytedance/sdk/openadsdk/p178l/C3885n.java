package com.bytedance.sdk.openadsdk.p178l;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.SecureRandom;
import java.util.UUID;
import okio.Utf8;

/* renamed from: com.bytedance.sdk.openadsdk.l.n */
/* compiled from: PangleUUID */
public class C3885n {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f9943a = new ThreadLocal<>();

    /* renamed from: a */
    public static String m12675a() {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = f9943a.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            f9943a.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & Ascii.f18305SI);
        bArr[6] = (byte) (bArr[6] | SignedBytes.MAX_POWER_OF_TWO);
        bArr[8] = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = (byte) (bArr[8] | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new UUID(j2, j).toString();
    }
}
