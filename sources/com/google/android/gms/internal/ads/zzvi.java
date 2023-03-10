package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzvi {
    private final String[] zza;
    private final int[] zzb;
    private final zzty[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzty zzf;

    zzvi(String[] strArr, int[] iArr, zzty[] zztyArr, int[] iArr2, int[][][] iArr3, zzty zzty) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zztyArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzty;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzc[i].zzb(i2).zzb;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.zze[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        int i7 = 16;
        String str = null;
        boolean z2 = false;
        int i8 = 0;
        while (i4 < copyOf.length) {
            String str2 = this.zzc[i].zzb(i2).zzb(copyOf[i4]).zzm;
            int i9 = i8 + 1;
            if (i8 != 0) {
                z2 |= !zzeg.zzS(str, str2);
            } else {
                str = str2;
            }
            i7 = Math.min(i7, this.zze[i][i2][i4] & 24);
            i4++;
            i8 = i9;
        }
        return z2 ? Math.min(i7, this.zzd[i]) : i7;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zze[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final zzty zzd(int i) {
        return this.zzc[i];
    }

    public final zzty zze() {
        return this.zzf;
    }
}
