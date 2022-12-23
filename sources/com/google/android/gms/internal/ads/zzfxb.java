package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfxb implements Comparable {
    private final byte[] zza;

    /* synthetic */ zzfxb(byte[] bArr, zzfxa zzfxa) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfxb zzfxb = (zzfxb) obj;
        int length = this.zza.length;
        int length2 = zzfxb.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = zzfxb.zza[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfxb)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfxb) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgic.zza(this.zza);
    }
}
