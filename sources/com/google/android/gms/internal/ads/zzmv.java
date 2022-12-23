package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzmv {
    public static final zzmv zza = new zzmv(new int[]{2}, 8);
    private static final zzmv zzb = new zzmv(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd = 8;

    public zzmv(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmv = (zzmv) obj;
        if (!Arrays.equals(this.zzc, zzmv.zzc)) {
            return false;
        }
        int i = zzmv.zzd;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzc);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }

    public final boolean zza(int i) {
        return Arrays.binarySearch(this.zzc, i) >= 0;
    }
}
