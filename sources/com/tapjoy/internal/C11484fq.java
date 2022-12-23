package com.tapjoy.internal;

import android.util.Base64;
import com.tapjoy.TapjoyUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.fq */
public final class C11484fq {

    /* renamed from: a */
    public final C11485a f27565a;

    /* renamed from: b */
    public final String f27566b;

    /* renamed from: c */
    public final String f27567c;

    /* renamed from: d */
    public final String f27568d;

    /* renamed from: e */
    private final String f27569e;

    /* renamed from: f */
    private final int f27570f;

    /* renamed from: com.tapjoy.internal.fq$a */
    public enum C11485a {
        SDK_ANDROID((byte) 2),
        RPC_ANALYTICS((byte) 49);
        

        /* renamed from: c */
        public byte f27574c;

        private C11485a(byte b) {
            this.f27574c = b;
        }

        @Nullable
        /* renamed from: a */
        public static C11485a m31450a(byte b) {
            for (C11485a aVar : values()) {
                if (aVar.f27574c == b) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C11484fq(String str) {
        int length = str.length();
        if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        try {
            byte[] decode = Base64.decode(str, 8);
            int length2 = decode.length;
            ByteBuffer wrap = ByteBuffer.wrap(decode);
            wrap.order(ByteOrder.BIG_ENDIAN);
            int length3 = decode.length - 4;
            int i = wrap.getInt(length3);
            CRC32 crc32 = new CRC32();
            crc32.update(decode, 0, length3);
            if (i == ((int) crc32.getValue())) {
                this.f27569e = str;
                this.f27566b = new UUID(wrap.getLong(0), wrap.getLong(8)).toString();
                this.f27570f = wrap.get(16);
                this.f27565a = C11485a.m31450a(wrap.get(17));
                this.f27567c = str.substring(24, 44);
                int i2 = this.f27570f;
                if (i2 == 1) {
                    this.f27568d = null;
                } else if (i2 != 2 || this.f27565a != C11485a.SDK_ANDROID) {
                    throw new IllegalArgumentException("The given API key was not supported.");
                } else if (length2 >= 57) {
                    byte[] bArr = new byte[12];
                    System.arraycopy(decode, 33, bArr, 0, 12);
                    this.f27568d = TapjoyUtil.convertToHex(bArr);
                } else {
                    throw new IllegalArgumentException("The given API key was invalid.");
                }
            } else {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The given API key was malformed.", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11484fq) {
            return this.f27569e.equals(((C11484fq) obj).f27569e);
        }
        return false;
    }

    public final String toString() {
        return this.f27569e;
    }

    /* renamed from: a */
    public static String m31449a(String str) {
        if (str.regionMatches(13, "-8000-8000-", 0, 11)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 8));
            stringBuffer.append(str.substring(24, 30));
            stringBuffer.append(str.substring(9, 13));
            stringBuffer.append(str.substring(30));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("The given UUID did not come from 5Rocks.");
    }
}
